/** 
 * CIM_Card.java
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
 * Description: The Card class represents a type of physical container that can be plugged into another Card or HostingBoard, or is itself a HostingBoard/Motherboard in a Chassis. The CIM_Card class includes any package capable of carrying signals and providing a mounting point for PhysicalComponents, such as Chips, or other PhysicalPackages, such as other Cards.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;
import org.sblim.wbemsmt.exception.impl.*;
import org.sblim.wbemsmt.exception.impl.userobject.*;

import java.lang.reflect.*;
import javax.wbem.*;

public class CIM_Card extends CIM_PhysicalPackage {

    public final static String CIM_CLASS_NAME = "CIM_Card";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * PhysicalMemory can be located on HostingBoards, adapter Cards, etc. This association explicitly defines this relationship of Memory to Cards.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYONCARD = "CIM_MemoryOnCard";

    /**
     * Cards may be plugged into Motherboards/baseboards, are daughtercards of an adapter, or support special Card-like modules. These relationships are described by the CardOnCard association.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_CARDONCARD = "CIM_CardOnCard";

    /**
     * Constant for method\'s name and parameters
     * This method manipulates the power to a PhysicalConnector on a Card. It is intended to be used by a Card (especially by a motherboard - i.e., HostingBoard=TRUE) to turn the power on and off for a specific PhysicalConnector located on it. For example, in a personal computer, a system slot does not know how to turn itself on and off. However, the motherboard hosting this slot may have that capability. This is important in order to support hot swapping of an adapter card in a system slot. The method should return 0 if successful, 1 if the request is not supported, and some other value if any other error occurred. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
     */

    public static class METHOD_CONNECTORPOWER {
        /**
         * Constant for method ConnectorPower
         */
        public final static String NAME = "ConnectorPower";

        /**
         * constants for parameter Connector
         */
        public static class PARAMETER_CONNECTOR {
            /*
             * Name of the parameter Connector
             */
            public final static String NAME = "Connector";

        }

        /**
         * constants for parameter PoweredOn
         */
        public static class PARAMETER_POWEREDON {
            /*
             * Name of the parameter PoweredOn
             */
            public final static String NAME = "PoweredOn";

        }
    }

    /**
     * Constants of property HostingBoard
     * Boolean indicating that this Card is a Motherboard or, more generically, a baseboard in a Chassis.
     */
    public static class PROPERTY_HOSTINGBOARD {
        /**
         * name of the property HostingBoard
         */
        public final static String NAME = "HostingBoard";

    }

    /**
     * Constants of property OperatingVoltages
     * Operating voltages required by the Card.
     */
    public static class PROPERTY_OPERATINGVOLTAGES {
        /**
         * name of the property OperatingVoltages
         */
        public final static String NAME = "OperatingVoltages";

    }

    /**
     * Constants of property RequirementsDescription
     * A free-form string describing the way(s) in which this Card is physically unique from other Cards. This property only has meaning when the corresponding boolean property, SpecialRequirements, is set to TRUE.
     */
    public static class PROPERTY_REQUIREMENTSDESCRIPTION {
        /**
         * name of the property RequirementsDescription
         */
        public final static String NAME = "RequirementsDescription";

    }

    /**
     * Constants of property RequiresDaughterBoard
     * Boolean indicating that at least one daughterboard or auxiliary Card is required in order to function properly.
     */
    public static class PROPERTY_REQUIRESDAUGHTERBOARD {
        /**
         * name of the property RequiresDaughterBoard
         */
        public final static String NAME = "RequiresDaughterBoard";

    }

    /**
     * Constants of property SlotLayout
     * SlotLayout is a free-form string that describes the slot positioning, typical usage, restrictions, individual slot spacings or any other pertinent information for the slots on a Card.
     */
    public static class PROPERTY_SLOTLAYOUT {
        /**
         * name of the property SlotLayout
         */
        public final static String NAME = "SlotLayout";

    }

    /**
     * Constants of property SpecialRequirements
     * Boolean indicating that this Card is physically unique from other Cards of the same type and therefore requires a special Slot. For example, a double-wide Card requires two Slots. Another example is where a certain Card may be used for the same general function as other Cards but requires a special Slot (e.g., extra long), whereas the other Cards can be placed in any available Slot. If set to TRUE, then the corresponding property, RequirementsDescription, should specify the nature of the uniqueness or purpose of the Card.
     */
    public static class PROPERTY_SPECIALREQUIREMENTS {
        /**
         * name of the property SpecialRequirements
         */
        public final static String NAME = "SpecialRequirements";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_PhysicalPackage.getPackages();

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
     *   The Card class represents a type of physical container that can be plugged into another Card or HostingBoard, or is itself a HostingBoard/Motherboard in a Chassis. The CIM_Card class includes any package capable of carrying signals and providing a mounting point for PhysicalComponents, such as Chips, or other PhysicalPackages, such as other Cards.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_Card(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   The Card class represents a type of physical container that can be plugged into another Card or HostingBoard, or is itself a HostingBoard/Motherboard in a Chassis. The CIM_Card class includes any package capable of carrying signals and providing a mounting point for PhysicalComponents, such as Chips, or other PhysicalPackages, such as other Cards.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_Card(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_Card() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("HostingBoard", new CIMProperty("HostingBoard",
                CIMDataType.BOOLEAN_T, null));
        propertiesToCheck.put("OperatingVoltages", new CIMProperty("OperatingVoltages",
                CIMDataType.SINT16_ARRAY_T, null));
        propertiesToCheck.put("RequirementsDescription", new CIMProperty("RequirementsDescription",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("RequiresDaughterBoard", new CIMProperty("RequiresDaughterBoard",
                CIMDataType.BOOLEAN_T, null));
        propertiesToCheck.put("SlotLayout", new CIMProperty("SlotLayout", CIMDataType.STRING_T,
                null));
        propertiesToCheck.put("SpecialRequirements", new CIMProperty("SpecialRequirements",
                CIMDataType.BOOLEAN_T, null));

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
     * Get the property HostingBoard
     *     * <br>
     * Boolean indicating that this Card is a Motherboard or, more generically, a baseboard in a Chassis.
     *     */

    public Boolean get_HostingBoard() {
        CIMProperty currentProperty = getProperty(PROPERTY_HOSTINGBOARD.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_HOSTINGBOARD.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property HostingBoard
     * <br>
     * Boolean indicating that this Card is a Motherboard or, more generically, a baseboard in a Chassis.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_HostingBoard(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_HOSTINGBOARD.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_HostingBoard(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_HOSTINGBOARD.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property HostingBoard by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_HostingBoard(WBEMClient client, String namespace,
            Boolean newValue) throws WbemsmtException {
        CIM_Card fco = new CIM_Card(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_HOSTINGBOARD.NAME);
        if (property != null) {
            property = setPropertyValue_HostingBoard(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_HOSTINGBOARD.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property HostingBoard
     * <br>
     * Boolean indicating that this Card is a Motherboard or, more generically, a baseboard in a Chassis.
     */

    private static CIMProperty setPropertyValue_HostingBoard(CIMProperty currentProperty,
            Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OperatingVoltages
     *     * <br>
     * Operating voltages required by the Card.
     *     */

    public Short[] get_OperatingVoltages() {
        CIMProperty currentProperty = getProperty(PROPERTY_OPERATINGVOLTAGES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OPERATINGVOLTAGES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (Short[]) currentProperty.getValue();

    }

    /**
     * Set the property OperatingVoltages
     * <br>
     * Operating voltages required by the Card.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OperatingVoltages(Short[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OPERATINGVOLTAGES.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_OperatingVoltages(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OPERATINGVOLTAGES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OperatingVoltages by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OperatingVoltages(WBEMClient client, String namespace,
            Short[] newValue) throws WbemsmtException {
        CIM_Card fco = new CIM_Card(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OPERATINGVOLTAGES.NAME);
        if (property != null) {
            property = setPropertyValue_OperatingVoltages(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OPERATINGVOLTAGES.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OperatingVoltages
     * <br>
     * Operating voltages required by the Card.
     */

    private static CIMProperty setPropertyValue_OperatingVoltages(CIMProperty currentProperty,
            Short[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property RequirementsDescription
     *     * <br>
     * A free-form string describing the way(s) in which this Card is physically unique from other Cards. This property only has meaning when the corresponding boolean property, SpecialRequirements, is set to TRUE.
     *     */

    public String get_RequirementsDescription() {
        CIMProperty currentProperty = getProperty(PROPERTY_REQUIREMENTSDESCRIPTION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_REQUIREMENTSDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property RequirementsDescription
     * <br>
     * A free-form string describing the way(s) in which this Card is physically unique from other Cards. This property only has meaning when the corresponding boolean property, SpecialRequirements, is set to TRUE.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_RequirementsDescription(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_REQUIREMENTSDESCRIPTION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_RequirementsDescription(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_REQUIREMENTSDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property RequirementsDescription by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_RequirementsDescription(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_Card fco = new CIM_Card(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_REQUIREMENTSDESCRIPTION.NAME);
        if (property != null) {
            property = setPropertyValue_RequirementsDescription(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_REQUIREMENTSDESCRIPTION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property RequirementsDescription
     * <br>
     * A free-form string describing the way(s) in which this Card is physically unique from other Cards. This property only has meaning when the corresponding boolean property, SpecialRequirements, is set to TRUE.
     */

    private static CIMProperty setPropertyValue_RequirementsDescription(
            CIMProperty currentProperty, String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property RequiresDaughterBoard
     *     * <br>
     * Boolean indicating that at least one daughterboard or auxiliary Card is required in order to function properly.
     *     */

    public Boolean get_RequiresDaughterBoard() {
        CIMProperty currentProperty = getProperty(PROPERTY_REQUIRESDAUGHTERBOARD.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_REQUIRESDAUGHTERBOARD.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property RequiresDaughterBoard
     * <br>
     * Boolean indicating that at least one daughterboard or auxiliary Card is required in order to function properly.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_RequiresDaughterBoard(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_REQUIRESDAUGHTERBOARD.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_RequiresDaughterBoard(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_REQUIRESDAUGHTERBOARD.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property RequiresDaughterBoard by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_RequiresDaughterBoard(WBEMClient client, String namespace,
            Boolean newValue) throws WbemsmtException {
        CIM_Card fco = new CIM_Card(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_REQUIRESDAUGHTERBOARD.NAME);
        if (property != null) {
            property = setPropertyValue_RequiresDaughterBoard(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_REQUIRESDAUGHTERBOARD.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property RequiresDaughterBoard
     * <br>
     * Boolean indicating that at least one daughterboard or auxiliary Card is required in order to function properly.
     */

    private static CIMProperty setPropertyValue_RequiresDaughterBoard(CIMProperty currentProperty,
            Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property SlotLayout
     *     * <br>
     * SlotLayout is a free-form string that describes the slot positioning, typical usage, restrictions, individual slot spacings or any other pertinent information for the slots on a Card.
     *     */

    public String get_SlotLayout() {
        CIMProperty currentProperty = getProperty(PROPERTY_SLOTLAYOUT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SLOTLAYOUT.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property SlotLayout
     * <br>
     * SlotLayout is a free-form string that describes the slot positioning, typical usage, restrictions, individual slot spacings or any other pertinent information for the slots on a Card.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_SlotLayout(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SLOTLAYOUT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_SlotLayout(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SLOTLAYOUT.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SlotLayout by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SlotLayout(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_Card fco = new CIM_Card(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SLOTLAYOUT.NAME);
        if (property != null) {
            property = setPropertyValue_SlotLayout(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SLOTLAYOUT.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SlotLayout
     * <br>
     * SlotLayout is a free-form string that describes the slot positioning, typical usage, restrictions, individual slot spacings or any other pertinent information for the slots on a Card.
     */

    private static CIMProperty setPropertyValue_SlotLayout(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property SpecialRequirements
     *     * <br>
     * Boolean indicating that this Card is physically unique from other Cards of the same type and therefore requires a special Slot. For example, a double-wide Card requires two Slots. Another example is where a certain Card may be used for the same general function as other Cards but requires a special Slot (e.g., extra long), whereas the other Cards can be placed in any available Slot. If set to TRUE, then the corresponding property, RequirementsDescription, should specify the nature of the uniqueness or purpose of the Card.
     *     */

    public Boolean get_SpecialRequirements() {
        CIMProperty currentProperty = getProperty(PROPERTY_SPECIALREQUIREMENTS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SPECIALREQUIREMENTS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property SpecialRequirements
     * <br>
     * Boolean indicating that this Card is physically unique from other Cards of the same type and therefore requires a special Slot. For example, a double-wide Card requires two Slots. Another example is where a certain Card may be used for the same general function as other Cards but requires a special Slot (e.g., extra long), whereas the other Cards can be placed in any available Slot. If set to TRUE, then the corresponding property, RequirementsDescription, should specify the nature of the uniqueness or purpose of the Card.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_SpecialRequirements(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SPECIALREQUIREMENTS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_SpecialRequirements(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SPECIALREQUIREMENTS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SpecialRequirements by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SpecialRequirements(WBEMClient client, String namespace,
            Boolean newValue) throws WbemsmtException {
        CIM_Card fco = new CIM_Card(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SPECIALREQUIREMENTS.NAME);
        if (property != null) {
            property = setPropertyValue_SpecialRequirements(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SPECIALREQUIREMENTS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SpecialRequirements
     * <br>
     * Boolean indicating that this Card is physically unique from other Cards of the same type and therefore requires a special Slot. For example, a double-wide Card requires two Slots. Another example is where a certain Card may be used for the same general function as other Cards but requires a special Slot (e.g., extra long), whereas the other Cards can be placed in any available Slot. If set to TRUE, then the corresponding property, RequirementsDescription, should specify the nature of the uniqueness or purpose of the Card.
     */

    private static CIMProperty setPropertyValue_SpecialRequirements(CIMProperty currentProperty,
            Boolean newValue) {
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

    /**
     * Get the list with CIM_PhysicalMemory objects associated by the association CIM_MemoryOnCard
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYONCARD as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_PhysicalMemory_CIM_MemoryOnCards(WBEMClient cimClient)
            throws WbemsmtException {

        return getAssociated_CIM_PhysicalMemory_CIM_MemoryOnCards(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYONCARD, CIM_PhysicalMemory.CIM_CLASS_NAME,
                null, null, false, false, null);

    }

    /**
     * Get the list with CIM_PhysicalMemory objects associated by the association CIM_MemoryOnCard
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYONCARD or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYONCARD as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_PhysicalMemory_CIM_MemoryOnCards(WBEMClient cimClient,
            String resultClass, String role, String resultRole) throws WbemsmtException {

        return getAssociated_CIM_PhysicalMemory_CIM_MemoryOnCards(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYONCARD, resultClass, role, resultRole, false,
                false, null);

    }

    /**
     * Get the list with CIM_PhysicalMemory objects associated by the association CIM_MemoryOnCard
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYONCARD or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_PhysicalMemory_CIM_MemoryOnCards(WBEMClient cimClient,
            String associationClass, String resultClass, String role, String resultRole,
            boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList)
            throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.associators(this.getCimObjectPath(), associationClass,
                    resultClass, role, resultRole, includeQualifiers, includeClassOrigin,
                    propertyList);
        }
        catch (WBEMException e) {
            throw new AssociatorException(e, new AssociatorUserObject(this.getCimObjectPath(),
                    associationClass, resultClass, role, resultRole, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_CardHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_CardHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_CardHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_PhysicalMemory(cimInstance));
                        continue;
                    }

                    Class[] constParams = new Class[1];
                    constParams[0] = CIMInstance.class;
                    Constructor cons = null;
                    try {
                        cons = clazz.getConstructor(constParams);
                    }
                    catch (NoSuchMethodException e) {
                        System.err.println("The required constructor of class "
                                + cimInstance.getClassName()
                                + " could not be found. Constructing instance of the base class.");
                        result.add(new CIM_PhysicalMemory(cimInstance));
                        continue;
                    }

                    try {
                        Object[] actargs = new Object[] { cimInstance };
                        Object dataObj = cons.newInstance(actargs);
                        result.add(dataObj);
                    }
                    catch (Exception e) {
                        System.err
                                .println("The instance of class "
                                        + cimInstance.getClassName()
                                        + " could not be created successful. Constructing instance of the base class.");
                        result.add(new CIM_PhysicalMemory(cimInstance));
                        continue;
                    }
                }
            }
            CIM_CardHelper.checkException(enumeration);
        }
        finally {
            try {
                if (enumeration != null) {
                    enumeration.close();
                }
            }
            catch (Exception e) {
                throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                        "The socket of the result could not be closed properly.");
            }
        }

        return result;
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_MemoryOnCard
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYONCARD as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_PhysicalMemory_CIM_MemoryOnCardNames(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_PhysicalMemory_CIM_MemoryOnCardNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYONCARD, CIM_PhysicalMemory.CIM_CLASS_NAME,
                null, null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_MemoryOnCard
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYONCARD or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYONCARD as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_PhysicalMemory_CIM_MemoryOnCardNames(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_PhysicalMemory_CIM_MemoryOnCardNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYONCARD, resultClass, role, resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_MemoryOnCard
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_PhysicalMemory_CIM_MemoryOnCardNames(
            WBEMClient cimClient, boolean deep, String associationClass, String resultClass,
            String role, String resultRole) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.associatorNames(this.getCimObjectPath(), associationClass,
                    resultClass, role, resultRole);

        }
        catch (WBEMException e) {
            throw new AssociatorNamesException(e, new AssociatorNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYONCARD,
                    CIM_PhysicalMemory.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_CardHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_CardHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_PhysicalMemory.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_CardHelper.checkException(enumeration);
        }
        finally {
            try {
                if (enumeration != null) {
                    enumeration.close();
                }
            }
            catch (Exception e) {
                throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                        "The socket of the result could not be closed properly.");
            }
        }
        return result;
    }

    /**
     * Get the list with CIM_MemoryOnCard associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_MemoryOnCard(WBEMClient cimClient,
            boolean includeQualifiers, boolean includeClassOrigin, String role,
            java.lang.String[] propertyList) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.references(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYONCARD, role, includeQualifiers,
                    includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYONCARD, role, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_CardHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_CardHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_MemoryOnCardHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_MemoryOnCard(cimInstance));
                        continue;
                    }

                    Class[] constParams = new Class[1];
                    constParams[0] = CIMInstance.class;
                    Constructor cons = null;
                    try {
                        cons = clazz.getConstructor(constParams);
                    }
                    catch (NoSuchMethodException e) {
                        System.err.println("The required constructor of class "
                                + cimInstance.getClassName()
                                + " could not be found. Constructing instance of the base class.");
                        result.add(new CIM_MemoryOnCard(cimInstance));
                        continue;
                    }

                    try {
                        Object[] actargs = new Object[] { cimInstance };
                        Object dataObj = cons.newInstance(actargs);
                        result.add(dataObj);
                    }
                    catch (Exception e) {
                        System.err
                                .println("The instance of class "
                                        + cimInstance.getClassName()
                                        + " could not be created successful. Constructing instance of the base class.");
                        result.add(new CIM_MemoryOnCard(cimInstance));
                        continue;
                    }
                }
            }
            CIM_CardHelper.checkException(enumeration);
        }
        finally {
            try {
                if (enumeration != null) {
                    enumeration.close();
                }
            }
            catch (Exception e) {
                throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                        "The socket of the result could not be closed properly.");
            }
        }

        return result;
    }

    /**
     * Get a list of CIMObjectPath items of the associations CIM_MemoryOnCard
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_MemoryOnCard(WBEMClient cimClient, String role,
            boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYONCARD, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_MEMORYONCARD, role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_CardHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_CardHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_MemoryOnCard.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_CardHelper.checkException(enumeration);
        }
        finally {
            try {
                if (enumeration != null) {
                    enumeration.close();
                }
            }
            catch (Exception e) {
                throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                        "The socket of the result could not be closed properly.");
            }
        }
        return result;
    }

    /**
     * Get the list with CIM_Card objects associated by the association CIM_CardOnCard
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_CARDONCARD as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_Card_CIM_CardOnCards(WBEMClient cimClient)
            throws WbemsmtException {

        return getAssociated_CIM_Card_CIM_CardOnCards(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_CARDONCARD, CIM_Card.CIM_CLASS_NAME, null, null,
                false, false, null);

    }

    /**
     * Get the list with CIM_Card objects associated by the association CIM_CardOnCard
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_CARDONCARD or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_CARDONCARD as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_Card_CIM_CardOnCards(WBEMClient cimClient,
            String resultClass, String role, String resultRole) throws WbemsmtException {

        return getAssociated_CIM_Card_CIM_CardOnCards(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_CARDONCARD, resultClass, role, resultRole, false,
                false, null);

    }

    /**
     * Get the list with CIM_Card objects associated by the association CIM_CardOnCard
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_CARDONCARD or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_Card_CIM_CardOnCards(WBEMClient cimClient,
            String associationClass, String resultClass, String role, String resultRole,
            boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList)
            throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.associators(this.getCimObjectPath(), associationClass,
                    resultClass, role, resultRole, includeQualifiers, includeClassOrigin,
                    propertyList);
        }
        catch (WBEMException e) {
            throw new AssociatorException(e, new AssociatorUserObject(this.getCimObjectPath(),
                    associationClass, resultClass, role, resultRole, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_CardHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_CardHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_CardHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_Card(cimInstance));
                        continue;
                    }

                    Class[] constParams = new Class[1];
                    constParams[0] = CIMInstance.class;
                    Constructor cons = null;
                    try {
                        cons = clazz.getConstructor(constParams);
                    }
                    catch (NoSuchMethodException e) {
                        System.err.println("The required constructor of class "
                                + cimInstance.getClassName()
                                + " could not be found. Constructing instance of the base class.");
                        result.add(new CIM_Card(cimInstance));
                        continue;
                    }

                    try {
                        Object[] actargs = new Object[] { cimInstance };
                        Object dataObj = cons.newInstance(actargs);
                        result.add(dataObj);
                    }
                    catch (Exception e) {
                        System.err
                                .println("The instance of class "
                                        + cimInstance.getClassName()
                                        + " could not be created successful. Constructing instance of the base class.");
                        result.add(new CIM_Card(cimInstance));
                        continue;
                    }
                }
            }
            CIM_CardHelper.checkException(enumeration);
        }
        finally {
            try {
                if (enumeration != null) {
                    enumeration.close();
                }
            }
            catch (Exception e) {
                throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                        "The socket of the result could not be closed properly.");
            }
        }

        return result;
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_CardOnCard
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_CARDONCARD as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_Card_CIM_CardOnCardNames(WBEMClient cimClient)
            throws WbemsmtException {

        return getAssociated_CIM_Card_CIM_CardOnCardNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_CARDONCARD, CIM_Card.CIM_CLASS_NAME, null, null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_CardOnCard
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_CARDONCARD or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_CARDONCARD as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_Card_CIM_CardOnCardNames(WBEMClient cimClient,
            String resultClass, String role, String resultRole) throws WbemsmtException {

        return getAssociated_CIM_Card_CIM_CardOnCardNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_CARDONCARD, resultClass, role, resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_CardOnCard
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_Card_CIM_CardOnCardNames(WBEMClient cimClient,
            boolean deep, String associationClass, String resultClass, String role,
            String resultRole) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.associatorNames(this.getCimObjectPath(), associationClass,
                    resultClass, role, resultRole);

        }
        catch (WBEMException e) {
            throw new AssociatorNamesException(e, new AssociatorNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_CARDONCARD,
                    CIM_Card.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_CardHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_CardHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName()
                                    .equals(CIM_Card.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_CardHelper.checkException(enumeration);
        }
        finally {
            try {
                if (enumeration != null) {
                    enumeration.close();
                }
            }
            catch (Exception e) {
                throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                        "The socket of the result could not be closed properly.");
            }
        }
        return result;
    }

    /**
     * Get the list with CIM_CardOnCard associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_CardOnCard(WBEMClient cimClient,
            boolean includeQualifiers, boolean includeClassOrigin, String role,
            java.lang.String[] propertyList) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.references(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_CARDONCARD, role, includeQualifiers,
                    includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_CARDONCARD, role, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_CardHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_CardHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_CardOnCardHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_CardOnCard(cimInstance));
                        continue;
                    }

                    Class[] constParams = new Class[1];
                    constParams[0] = CIMInstance.class;
                    Constructor cons = null;
                    try {
                        cons = clazz.getConstructor(constParams);
                    }
                    catch (NoSuchMethodException e) {
                        System.err.println("The required constructor of class "
                                + cimInstance.getClassName()
                                + " could not be found. Constructing instance of the base class.");
                        result.add(new CIM_CardOnCard(cimInstance));
                        continue;
                    }

                    try {
                        Object[] actargs = new Object[] { cimInstance };
                        Object dataObj = cons.newInstance(actargs);
                        result.add(dataObj);
                    }
                    catch (Exception e) {
                        System.err
                                .println("The instance of class "
                                        + cimInstance.getClassName()
                                        + " could not be created successful. Constructing instance of the base class.");
                        result.add(new CIM_CardOnCard(cimInstance));
                        continue;
                    }
                }
            }
            CIM_CardHelper.checkException(enumeration);
        }
        finally {
            try {
                if (enumeration != null) {
                    enumeration.close();
                }
            }
            catch (Exception e) {
                throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                        "The socket of the result could not be closed properly.");
            }
        }

        return result;
    }

    /**
     * Get a list of CIMObjectPath items of the associations CIM_CardOnCard
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_CardOnCard(WBEMClient cimClient, String role,
            boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_CARDONCARD, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_CARDONCARD, role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_CardHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_CardHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_CardOnCard.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_CardHelper.checkException(enumeration);
        }
        finally {
            try {
                if (enumeration != null) {
                    enumeration.close();
                }
            }
            catch (Exception e) {
                throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                        "The socket of the result could not be closed properly.");
            }
        }
        return result;
    }

    //**********************************************************************
    // Extrinsic Method invocations     
    //**********************************************************************                         

    /**
     * Invokes the Method ConnectorPower
     * <br>
     * @param client the cimclient
     * This method manipulates the power to a PhysicalConnector on a Card. It is intended to be used by a Card (especially by a motherboard - i.e., HostingBoard=TRUE) to turn the power on and off for a specific PhysicalConnector located on it. For example, in a personal computer, a system slot does not know how to turn itself on and off. However, the motherboard hosting this slot may have that capability. This is important in order to support hot swapping of an adapter card in a system slot. The method should return 0 if successful, 1 if the request is not supported, and some other value if any other error occurred. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
     *   @param Connector The connector to change the power setting for.
     *   @param PoweredOn If TRUE, turn power on for the connector. If FALSE, turn power off.
     *
     */

    public ConnectorPowerResult invoke_ConnectorPower(WBEMClient cimClient,
            CIM_PhysicalConnector Connector, Boolean PoweredOn) throws WbemsmtException {

        CIMArgument[] inParameter = new CIMArgument[2];
        CIMArgument[] outParameter = new CIMArgument[0];

        inParameter[0] = new CIMArgument("Connector", new CIMDataType(
                CIM_PhysicalConnector.CIM_CLASS_NAME), Connector);
        inParameter[1] = new CIMArgument("PoweredOn", CIMDataType.BOOLEAN_T, PoweredOn);

        javax.cim.UnsignedInteger32 resultObject = null;

        try {
            Object oResult = cimClient.invokeMethod(this.getCimObjectPath(),
                    METHOD_CONNECTORPOWER.NAME, inParameter, outParameter);
            if (oResult != null) {

                resultObject = (javax.cim.UnsignedInteger32) oResult;
            }
        }
        catch (WBEMException e) {
            throw new InvokeMethodException(e, new InvokeMethodUserObject(this.getCimObjectPath(),
                    METHOD_CONNECTORPOWER.NAME, inParameter, outParameter));
        }

        ConnectorPowerResult result = new ConnectorPowerResult();
        result.setResultObject(resultObject);

        java.util.HashMap mapOutParameter = new java.util.HashMap();
        for (int i = 0; i < outParameter.length; i++) {
            CIMArgument argument = outParameter[i];
            if (argument != null) {
                mapOutParameter.put(argument.getName(), argument);
            }
        }

        return result;
    }

    /**
     * Result object for the method ConnectorPower
     */
    public static class ConnectorPowerResult {
        /**
         * The return value of the method
         */

        javax.cim.UnsignedInteger32 resultObject = null;

        /**
         * Default constructor
         */
        ConnectorPowerResult() {
        }

        /**
         * Set the return value
         * @param rc
         */
        void setResultObject(javax.cim.UnsignedInteger32 resultObject) {
            this.resultObject = resultObject;
        }

        /**
         * Get the return value of the methid
         * @return the return value
         */
        public javax.cim.UnsignedInteger32 getResultObject() {
            return this.resultObject;
        }

    }

    //**********************************************************************
    // utility methods     
    //**********************************************************************                         

    /**
     * return the name of the CIMClass
     * @return
     */
    public String getObjectName() {
        return CIM_Card.CIM_CLASS_NAME;
    }

}