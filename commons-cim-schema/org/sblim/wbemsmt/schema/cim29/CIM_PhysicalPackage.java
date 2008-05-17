/** 
 * CIM_PhysicalPackage.java
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
 * Description: The PhysicalPackage class represents PhysicalElements that contain or host other components. Examples are a Rack enclosure or an adapter Card.
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

public class CIM_PhysicalPackage extends CIM_PhysicalElement {

    public final static String CIM_CLASS_NAME = "CIM_PhysicalPackage";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * A Component is typically contained by a PhysicalPackage, such as a Chassis or Card. The PackagedComponent association makes this relationship explicit. In the first sentence, the word, 'typically', is used. This is because a Component may be removed from, or not yet inserted into, its containing Package (ie, the Removable boolean is TRUE). Therefore, a Component may not always be associated with a container.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_PACKAGEDCOMPONENT = "CIM_PackagedComponent";

    /**
     * The Container association represents the relationship between a contained and a containing PhysicalElement. A containing object must be a PhysicalPackage.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_CONTAINER = "CIM_Container";

    /**
     * A Chassis can contain other Packages, such as other Chassis and Cards. The PackageInChassis association makes explicit this relationship.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_PACKAGEINCHASSIS = "CIM_PackageInChassis";

    /**
     * Similar to the way that LogicalDevices are 'Realized' by PhysicalElements, UnitaryComputerSystems are realized in one or more PhysicalPackages. The ComputerSystemPackage association explicitly defines this relationship.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMPACKAGE = "CIM_ComputerSystemPackage";

    /**
     * Constant for method\'s name and parameters
     * This method is being deprecated. A PhysicalPackage cannot determine if it is compatible with another object. The IsCompatible method verifies whether the referenced PhysicalElement may be contained by or inserted into the PhysicalPackage. The return value should be 0 if the request was successfully executed, 1 if the request is not supported and some other value if an error occurred. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
     */

    public static class METHOD_ISCOMPATIBLE {
        /**
         * Constant for method IsCompatible
         */
        public final static String NAME = "IsCompatible";

        /**
         * constants for parameter ElementToCheck
         */
        public static class PARAMETER_ELEMENTTOCHECK {
            /*
             * Name of the parameter ElementToCheck
             */
            public final static String NAME = "ElementToCheck";

        }
    }

    /**
     * Constants of property Depth
     * The depth of the PhysicalPackage in inches.
     */
    public static class PROPERTY_DEPTH {
        /**
         * name of the property Depth
         */
        public final static String NAME = "Depth";

    }

    /**
     * Constants of property Height
     * The height of the PhysicalPackage in inches.
     */
    public static class PROPERTY_HEIGHT {
        /**
         * name of the property Height
         */
        public final static String NAME = "Height";

    }

    /**
     * Constants of property HotSwappable
     * The use of this property is being deprecated. Instead RemovalConditions should be used. The RemovalConditions property addresses whether a PhysicalPackage is removable with or without power being applied. 
     * 
     * A PhysicalPackage is HotSwappable if it is possible to replace the Element with a physically different but equivalent one while the containing Package has power applied to it (ie, is 'on'). For example, a disk drive Package inserted using SCA connectors is both Removable and HotSwappable. All HotSwappable packages are inherently Removable and Replaceable.
     */
    public static class PROPERTY_HOTSWAPPABLE {
        /**
         * name of the property HotSwappable
         */
        public final static String NAME = "HotSwappable";

    }

    /**
     * Constants of property Removable
     * The use of this property is being deprecated. Instead RemovalConditions should be used. The RemovalConditions property addresses whether a PhysicalPackage is removable with or without power being applied. 
     * A PhysicalPackage is Removable if it is designed to be taken in and out of the physical container in which it is normally found, without impairing the function of the overall packaging. A Package can still be Removable if power must be 'off' in order to perform the removal. If power can be 'on' and the Package removed, then the Element is both Removable and HotSwappable. For example, an extra battery in a laptop is Removable, as is a disk drive Package inserted using SCA connectors. However, the latter is also HotSwappable. A laptop's display is not Removable, nor is a non-redundant power supply. Removing these components would impact the function of the overall packaging or is impossible due to the tight integration of the Package.
     */
    public static class PROPERTY_REMOVABLE {
        /**
         * name of the property Removable
         */
        public final static String NAME = "Removable";

    }

    /**
     * Constants of property RemovalConditions
     * The RemovalCapabilites property is used to describe the conditions under which a PhysicalPackage can be removed. Since all PhysicalPackages are not removable, this property defaults to 2, 'Not Applicable'.
     */
    public static class PROPERTY_REMOVALCONDITIONS {
        /**
         * name of the property RemovalConditions
         */
        public final static String NAME = "RemovalConditions";

        /**
         * constant for value map entry 0
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown = new javax.cim.UnsignedInteger16(
                "0");

        /**
         * constant for value entry Unknown (corresponds to mapEntry 0 )
         */
        public final static String VALUE_ENTRY_Unknown = "Unknown";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Not_Applicable = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Not Applicable (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Not_Applicable = "Not Applicable";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Removable_when_off = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Removable when off (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Removable_when_off = "Removable when off";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Removable_when_on_or_off = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Removable when on or off (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Removable_when_on_or_off = "Removable when on or off";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@71da71da
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Not_Applicable.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Not_Applicable;
            }

            if (VALUE_ENTRY_Removable_when_off.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Removable_when_off;
            }

            if (VALUE_ENTRY_Removable_when_on_or_off.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Removable_when_on_or_off;
            }
            return null;

        }

        /**
         * uses the element within array VALUE_ENTRIES_FOR_DISPLAY at index indexInPulldown to get the ValueMapEntry
         * @param indexInPulldown the index within the pulldown element, the list etc
         * @return the ValueMap entry from the displayed values
         */
        public static javax.cim.UnsignedInteger16 getValueMapEntryFromDisplayedValue(
                Number indexInPulldown) {
            return getValueMapEntry(VALUE_ENTRIES_FOR_DISPLAY[indexInPulldown.intValue()]);
        }

        /**
         * gets the value for the given valueMap entry (currentValue) and gives back the index of this value within the VALUE_ENTRIES_FOR_DISPLAY array
         *
         * can be used to set the correct selection index for a pulldown field
         *
         * @return -1 if for the currentValue no value within VALUE_ENTRIES_FOR_DISPLAY was found
         * @param currentValue the currentValue to get the index for
         */
        public static int getIndexForDisplay(javax.cim.UnsignedInteger16 currentValue) {
            String valueEntry = getValueEntry(currentValue);
            if (valueEntry != null) {
                for (int i = 0; i < VALUE_ENTRIES_FOR_DISPLAY.length; i++) {
                    if (VALUE_ENTRIES_FOR_DISPLAY[i].equals(valueEntry)) {
                        return i;
                    }
                }
            }
            return -1;

        }

        /**
         * get the ValueEntry of the given valueMapEntry
         * @param valueMapEntry the entry within the valueMap to find the ValueEntry for
         * @return the Value entry or null if not found
         */

        public static String getValueEntry(javax.cim.UnsignedInteger16 value) {
            int iValue = value.intValue();

            if (iValue == VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown.intValue()) {
                return VALUE_ENTRY_Unknown;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Not_Applicable.intValue()) {
                return VALUE_ENTRY_Not_Applicable;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Removable_when_off.intValue()) {
                return VALUE_ENTRY_Removable_when_off;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Removable_when_on_or_off.intValue()) {
                return VALUE_ENTRY_Removable_when_on_or_off;
            }
            return null;

        }

        /**
         * ValueMap entries
         * Contains no entries that having an integer value range representation
         * 
         * The couterpart for the value entries is returned by VALUE_ENTRIES_FOR_DISPLAY
         *
         * @see \#VALUE_ENTRIES_FOR_DISPLAY
         * 
         * Value Map for the property RemovalConditions   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Not_Applicable,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Removable_when_off,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Removable_when_on_or_off };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property RemovalConditions   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Not_Applicable, VALUE_ENTRY_Removable_when_off,
                VALUE_ENTRY_Removable_when_on_or_off };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property RemovalConditions   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Not_Applicable, VALUE_ENTRY_Removable_when_off,
                VALUE_ENTRY_Removable_when_on_or_off };

    }

    /**
     * Constants of property Replaceable
     * The use of this property is being deprecated because it is redundant with the FRU class and its associations. A PhysicalPackage is Replaceable if it is possible to replace (FRU or upgrade) the Element with a physically different one. For example, some ComputerSystems allow the main Processor chip to be upgraded to one of a higher clock rating. In this case, the Processor is said to be Replaceable. Another example is a power supply Package mounted on sliding rails. All Removable packages are inherently Replaceable.
     */
    public static class PROPERTY_REPLACEABLE {
        /**
         * name of the property Replaceable
         */
        public final static String NAME = "Replaceable";

    }

    /**
     * Constants of property Weight
     * The weight of the PhysicalPackage in pounds.
     */
    public static class PROPERTY_WEIGHT {
        /**
         * name of the property Weight
         */
        public final static String NAME = "Weight";

    }

    /**
     * Constants of property Width
     * The width of the PhysicalPackage in inches.
     */
    public static class PROPERTY_WIDTH {
        /**
         * name of the property Width
         */
        public final static String NAME = "Width";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_PhysicalElement.getPackages();

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
     *   The PhysicalPackage class represents PhysicalElements that contain or host other components. Examples are a Rack enclosure or an adapter Card.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_PhysicalPackage(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   The PhysicalPackage class represents PhysicalElements that contain or host other components. Examples are a Rack enclosure or an adapter Card.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_PhysicalPackage(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_PhysicalPackage() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("Depth", new CIMProperty("Depth", CIMDataType.REAL32_T, null));
        propertiesToCheck.put("Height", new CIMProperty("Height", CIMDataType.REAL32_T, null));
        propertiesToCheck.put("HotSwappable", new CIMProperty("HotSwappable",
                CIMDataType.BOOLEAN_T, null));
        propertiesToCheck.put("Removable",
                new CIMProperty("Removable", CIMDataType.BOOLEAN_T, null));
        propertiesToCheck.put("RemovalConditions", new CIMProperty("RemovalConditions",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("Replaceable", new CIMProperty("Replaceable", CIMDataType.BOOLEAN_T,
                null));
        propertiesToCheck.put("Weight", new CIMProperty("Weight", CIMDataType.REAL32_T, null));
        propertiesToCheck.put("Width", new CIMProperty("Width", CIMDataType.REAL32_T, null));

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
     * Get the property Depth
     *     * <br>
     * The depth of the PhysicalPackage in inches.
     *     */

    public Float get_Depth() {
        CIMProperty currentProperty = getProperty(PROPERTY_DEPTH.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_DEPTH.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (Float) currentProperty.getValue();

    }

    /**
     * Set the property Depth
     * <br>
     * The depth of the PhysicalPackage in inches.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Depth(Float newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_DEPTH.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Depth(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_DEPTH.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Depth by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Depth(WBEMClient client, String namespace, Float newValue)
            throws WbemsmtException {
        CIM_PhysicalPackage fco = new CIM_PhysicalPackage(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_DEPTH.NAME);
        if (property != null) {
            property = setPropertyValue_Depth(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_DEPTH.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Depth
     * <br>
     * The depth of the PhysicalPackage in inches.
     */

    private static CIMProperty setPropertyValue_Depth(CIMProperty currentProperty, Float newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Height
     *     * <br>
     * The height of the PhysicalPackage in inches.
     *     */

    public Float get_Height() {
        CIMProperty currentProperty = getProperty(PROPERTY_HEIGHT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_HEIGHT.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (Float) currentProperty.getValue();

    }

    /**
     * Set the property Height
     * <br>
     * The height of the PhysicalPackage in inches.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Height(Float newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_HEIGHT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Height(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_HEIGHT.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Height by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Height(WBEMClient client, String namespace, Float newValue)
            throws WbemsmtException {
        CIM_PhysicalPackage fco = new CIM_PhysicalPackage(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_HEIGHT.NAME);
        if (property != null) {
            property = setPropertyValue_Height(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_HEIGHT.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Height
     * <br>
     * The height of the PhysicalPackage in inches.
     */

    private static CIMProperty setPropertyValue_Height(CIMProperty currentProperty, Float newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property HotSwappable
     *     * <br>
     * The use of this property is being deprecated. Instead RemovalConditions should be used. The RemovalConditions property addresses whether a PhysicalPackage is removable with or without power being applied. 
     * 
     * A PhysicalPackage is HotSwappable if it is possible to replace the Element with a physically different but equivalent one while the containing Package has power applied to it (ie, is 'on'). For example, a disk drive Package inserted using SCA connectors is both Removable and HotSwappable. All HotSwappable packages are inherently Removable and Replaceable.
     *     */

    public Boolean get_HotSwappable() {
        CIMProperty currentProperty = getProperty(PROPERTY_HOTSWAPPABLE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_HOTSWAPPABLE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property HotSwappable
     * <br>
     * The use of this property is being deprecated. Instead RemovalConditions should be used. The RemovalConditions property addresses whether a PhysicalPackage is removable with or without power being applied. 
     * 
     * A PhysicalPackage is HotSwappable if it is possible to replace the Element with a physically different but equivalent one while the containing Package has power applied to it (ie, is 'on'). For example, a disk drive Package inserted using SCA connectors is both Removable and HotSwappable. All HotSwappable packages are inherently Removable and Replaceable.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_HotSwappable(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_HOTSWAPPABLE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_HotSwappable(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_HOTSWAPPABLE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property HotSwappable by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_HotSwappable(WBEMClient client, String namespace,
            Boolean newValue) throws WbemsmtException {
        CIM_PhysicalPackage fco = new CIM_PhysicalPackage(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_HOTSWAPPABLE.NAME);
        if (property != null) {
            property = setPropertyValue_HotSwappable(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_HOTSWAPPABLE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property HotSwappable
     * <br>
     * The use of this property is being deprecated. Instead RemovalConditions should be used. The RemovalConditions property addresses whether a PhysicalPackage is removable with or without power being applied. 
     * 
     * A PhysicalPackage is HotSwappable if it is possible to replace the Element with a physically different but equivalent one while the containing Package has power applied to it (ie, is 'on'). For example, a disk drive Package inserted using SCA connectors is both Removable and HotSwappable. All HotSwappable packages are inherently Removable and Replaceable.
     */

    private static CIMProperty setPropertyValue_HotSwappable(CIMProperty currentProperty,
            Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Removable
     *     * <br>
     * The use of this property is being deprecated. Instead RemovalConditions should be used. The RemovalConditions property addresses whether a PhysicalPackage is removable with or without power being applied. 
     * A PhysicalPackage is Removable if it is designed to be taken in and out of the physical container in which it is normally found, without impairing the function of the overall packaging. A Package can still be Removable if power must be 'off' in order to perform the removal. If power can be 'on' and the Package removed, then the Element is both Removable and HotSwappable. For example, an extra battery in a laptop is Removable, as is a disk drive Package inserted using SCA connectors. However, the latter is also HotSwappable. A laptop's display is not Removable, nor is a non-redundant power supply. Removing these components would impact the function of the overall packaging or is impossible due to the tight integration of the Package.
     *     */

    public Boolean get_Removable() {
        CIMProperty currentProperty = getProperty(PROPERTY_REMOVABLE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_REMOVABLE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property Removable
     * <br>
     * The use of this property is being deprecated. Instead RemovalConditions should be used. The RemovalConditions property addresses whether a PhysicalPackage is removable with or without power being applied. 
     * A PhysicalPackage is Removable if it is designed to be taken in and out of the physical container in which it is normally found, without impairing the function of the overall packaging. A Package can still be Removable if power must be 'off' in order to perform the removal. If power can be 'on' and the Package removed, then the Element is both Removable and HotSwappable. For example, an extra battery in a laptop is Removable, as is a disk drive Package inserted using SCA connectors. However, the latter is also HotSwappable. A laptop's display is not Removable, nor is a non-redundant power supply. Removing these components would impact the function of the overall packaging or is impossible due to the tight integration of the Package.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Removable(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_REMOVABLE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Removable(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_REMOVABLE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Removable by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Removable(WBEMClient client, String namespace, Boolean newValue)
            throws WbemsmtException {
        CIM_PhysicalPackage fco = new CIM_PhysicalPackage(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_REMOVABLE.NAME);
        if (property != null) {
            property = setPropertyValue_Removable(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_REMOVABLE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Removable
     * <br>
     * The use of this property is being deprecated. Instead RemovalConditions should be used. The RemovalConditions property addresses whether a PhysicalPackage is removable with or without power being applied. 
     * A PhysicalPackage is Removable if it is designed to be taken in and out of the physical container in which it is normally found, without impairing the function of the overall packaging. A Package can still be Removable if power must be 'off' in order to perform the removal. If power can be 'on' and the Package removed, then the Element is both Removable and HotSwappable. For example, an extra battery in a laptop is Removable, as is a disk drive Package inserted using SCA connectors. However, the latter is also HotSwappable. A laptop's display is not Removable, nor is a non-redundant power supply. Removing these components would impact the function of the overall packaging or is impossible due to the tight integration of the Package.
     */

    private static CIMProperty setPropertyValue_Removable(CIMProperty currentProperty,
            Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property RemovalConditions
     *     * <br>
     * The RemovalCapabilites property is used to describe the conditions under which a PhysicalPackage can be removed. Since all PhysicalPackages are not removable, this property defaults to 2, 'Not Applicable'.
     *     */

    public javax.cim.UnsignedInteger16 get_RemovalConditions() {
        CIMProperty currentProperty = getProperty(PROPERTY_REMOVALCONDITIONS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_REMOVALCONDITIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property RemovalConditions
     * <br>
     * The RemovalCapabilites property is used to describe the conditions under which a PhysicalPackage can be removed. Since all PhysicalPackages are not removable, this property defaults to 2, 'Not Applicable'.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_RemovalConditions(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_REMOVALCONDITIONS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_RemovalConditions(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_REMOVALCONDITIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property RemovalConditions by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_RemovalConditions(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_PhysicalPackage fco = new CIM_PhysicalPackage(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_REMOVALCONDITIONS.NAME);
        if (property != null) {
            property = setPropertyValue_RemovalConditions(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_REMOVALCONDITIONS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property RemovalConditions
     * <br>
     * The RemovalCapabilites property is used to describe the conditions under which a PhysicalPackage can be removed. Since all PhysicalPackages are not removable, this property defaults to 2, 'Not Applicable'.
     */

    private static CIMProperty setPropertyValue_RemovalConditions(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Replaceable
     *     * <br>
     * The use of this property is being deprecated because it is redundant with the FRU class and its associations. A PhysicalPackage is Replaceable if it is possible to replace (FRU or upgrade) the Element with a physically different one. For example, some ComputerSystems allow the main Processor chip to be upgraded to one of a higher clock rating. In this case, the Processor is said to be Replaceable. Another example is a power supply Package mounted on sliding rails. All Removable packages are inherently Replaceable.
     *     */

    public Boolean get_Replaceable() {
        CIMProperty currentProperty = getProperty(PROPERTY_REPLACEABLE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_REPLACEABLE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property Replaceable
     * <br>
     * The use of this property is being deprecated because it is redundant with the FRU class and its associations. A PhysicalPackage is Replaceable if it is possible to replace (FRU or upgrade) the Element with a physically different one. For example, some ComputerSystems allow the main Processor chip to be upgraded to one of a higher clock rating. In this case, the Processor is said to be Replaceable. Another example is a power supply Package mounted on sliding rails. All Removable packages are inherently Replaceable.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Replaceable(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_REPLACEABLE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Replaceable(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_REPLACEABLE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Replaceable by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Replaceable(WBEMClient client, String namespace,
            Boolean newValue) throws WbemsmtException {
        CIM_PhysicalPackage fco = new CIM_PhysicalPackage(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_REPLACEABLE.NAME);
        if (property != null) {
            property = setPropertyValue_Replaceable(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_REPLACEABLE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Replaceable
     * <br>
     * The use of this property is being deprecated because it is redundant with the FRU class and its associations. A PhysicalPackage is Replaceable if it is possible to replace (FRU or upgrade) the Element with a physically different one. For example, some ComputerSystems allow the main Processor chip to be upgraded to one of a higher clock rating. In this case, the Processor is said to be Replaceable. Another example is a power supply Package mounted on sliding rails. All Removable packages are inherently Replaceable.
     */

    private static CIMProperty setPropertyValue_Replaceable(CIMProperty currentProperty,
            Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Weight
     *     * <br>
     * The weight of the PhysicalPackage in pounds.
     *     */

    public Float get_Weight() {
        CIMProperty currentProperty = getProperty(PROPERTY_WEIGHT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_WEIGHT.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (Float) currentProperty.getValue();

    }

    /**
     * Set the property Weight
     * <br>
     * The weight of the PhysicalPackage in pounds.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Weight(Float newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_WEIGHT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Weight(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_WEIGHT.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Weight by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Weight(WBEMClient client, String namespace, Float newValue)
            throws WbemsmtException {
        CIM_PhysicalPackage fco = new CIM_PhysicalPackage(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_WEIGHT.NAME);
        if (property != null) {
            property = setPropertyValue_Weight(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_WEIGHT.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Weight
     * <br>
     * The weight of the PhysicalPackage in pounds.
     */

    private static CIMProperty setPropertyValue_Weight(CIMProperty currentProperty, Float newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Width
     *     * <br>
     * The width of the PhysicalPackage in inches.
     *     */

    public Float get_Width() {
        CIMProperty currentProperty = getProperty(PROPERTY_WIDTH.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_WIDTH.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (Float) currentProperty.getValue();

    }

    /**
     * Set the property Width
     * <br>
     * The width of the PhysicalPackage in inches.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Width(Float newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_WIDTH.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Width(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_WIDTH.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Width by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Width(WBEMClient client, String namespace, Float newValue)
            throws WbemsmtException {
        CIM_PhysicalPackage fco = new CIM_PhysicalPackage(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_WIDTH.NAME);
        if (property != null) {
            property = setPropertyValue_Width(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_WIDTH.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Width
     * <br>
     * The width of the PhysicalPackage in inches.
     */

    private static CIMProperty setPropertyValue_Width(CIMProperty currentProperty, Float newValue) {
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
     * Get the list with CIM_PhysicalComponent objects associated by the association CIM_PackagedComponent
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_PACKAGEDCOMPONENT as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_PhysicalComponent_CIM_PackagedComponents(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_PhysicalComponent_CIM_PackagedComponents(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_PACKAGEDCOMPONENT,
                CIM_PhysicalComponent.CIM_CLASS_NAME, null, null, false, false, null);

    }

    /**
     * Get the list with CIM_PhysicalComponent objects associated by the association CIM_PackagedComponent
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_PACKAGEDCOMPONENT or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_PACKAGEDCOMPONENT as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_PhysicalComponent_CIM_PackagedComponents(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_PhysicalComponent_CIM_PackagedComponents(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_PACKAGEDCOMPONENT, resultClass, role, resultRole,
                false, false, null);

    }

    /**
     * Get the list with CIM_PhysicalComponent objects associated by the association CIM_PackagedComponent
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_PACKAGEDCOMPONENT or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_PhysicalComponent_CIM_PackagedComponents(
            WBEMClient cimClient, String associationClass, String resultClass, String role,
            String resultRole, boolean includeQualifiers, boolean includeClassOrigin,
            java.lang.String[] propertyList) throws WbemsmtException {

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
                CIM_PhysicalPackageHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_PhysicalPackageHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_PhysicalPackageHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_PhysicalComponent(cimInstance));
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
                        result.add(new CIM_PhysicalComponent(cimInstance));
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
                        result.add(new CIM_PhysicalComponent(cimInstance));
                        continue;
                    }
                }
            }
            CIM_PhysicalPackageHelper.checkException(enumeration);
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
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_PackagedComponent
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_PACKAGEDCOMPONENT as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_PhysicalComponent_CIM_PackagedComponentNames(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_PhysicalComponent_CIM_PackagedComponentNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_PACKAGEDCOMPONENT,
                CIM_PhysicalComponent.CIM_CLASS_NAME, null, null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_PackagedComponent
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_PACKAGEDCOMPONENT or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_PACKAGEDCOMPONENT as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_PhysicalComponent_CIM_PackagedComponentNames(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_PhysicalComponent_CIM_PackagedComponentNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_PACKAGEDCOMPONENT, resultClass, role, resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_PackagedComponent
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_PhysicalComponent_CIM_PackagedComponentNames(
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
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_PACKAGEDCOMPONENT,
                    CIM_PhysicalComponent.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_PhysicalPackageHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_PhysicalPackageHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_PhysicalComponent.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_PhysicalPackageHelper.checkException(enumeration);
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
     * Get the list with CIM_PackagedComponent associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_PackagedComponent(WBEMClient cimClient,
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_PACKAGEDCOMPONENT, role, includeQualifiers,
                    includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_PACKAGEDCOMPONENT, role, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_PhysicalPackageHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_PhysicalPackageHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_PackagedComponentHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_PackagedComponent(cimInstance));
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
                        result.add(new CIM_PackagedComponent(cimInstance));
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
                        result.add(new CIM_PackagedComponent(cimInstance));
                        continue;
                    }
                }
            }
            CIM_PhysicalPackageHelper.checkException(enumeration);
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
     * Get a list of CIMObjectPath items of the associations CIM_PackagedComponent
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_PackagedComponent(WBEMClient cimClient,
            String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_PACKAGEDCOMPONENT, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_PACKAGEDCOMPONENT, role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_PhysicalPackageHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_PhysicalPackageHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_PackagedComponent.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_PhysicalPackageHelper.checkException(enumeration);
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
     * Get the list with CIM_PhysicalElement objects associated by the association CIM_Container
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_CONTAINER as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_PhysicalElement_CIM_Containers(WBEMClient cimClient)
            throws WbemsmtException {

        return getAssociated_CIM_PhysicalElement_CIM_Containers(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_CONTAINER, CIM_PhysicalElement.CIM_CLASS_NAME, null,
                null, false, false, null);

    }

    /**
     * Get the list with CIM_PhysicalElement objects associated by the association CIM_Container
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_CONTAINER or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_CONTAINER as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_PhysicalElement_CIM_Containers(WBEMClient cimClient,
            String resultClass, String role, String resultRole) throws WbemsmtException {

        return getAssociated_CIM_PhysicalElement_CIM_Containers(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_CONTAINER, resultClass, role, resultRole, false,
                false, null);

    }

    /**
     * Get the list with CIM_PhysicalElement objects associated by the association CIM_Container
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_CONTAINER or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_PhysicalElement_CIM_Containers(WBEMClient cimClient,
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
                CIM_PhysicalPackageHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_PhysicalPackageHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_PhysicalPackageHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_PhysicalElement(cimInstance));
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
                        result.add(new CIM_PhysicalElement(cimInstance));
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
                        result.add(new CIM_PhysicalElement(cimInstance));
                        continue;
                    }
                }
            }
            CIM_PhysicalPackageHelper.checkException(enumeration);
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
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_Container
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_CONTAINER as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_PhysicalElement_CIM_ContainerNames(WBEMClient cimClient)
            throws WbemsmtException {

        return getAssociated_CIM_PhysicalElement_CIM_ContainerNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_CONTAINER, CIM_PhysicalElement.CIM_CLASS_NAME, null,
                null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_Container
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_CONTAINER or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_CONTAINER as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_PhysicalElement_CIM_ContainerNames(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_PhysicalElement_CIM_ContainerNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_CONTAINER, resultClass, role, resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_Container
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_PhysicalElement_CIM_ContainerNames(
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
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_CONTAINER,
                    CIM_PhysicalElement.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_PhysicalPackageHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_PhysicalPackageHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_PhysicalElement.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_PhysicalPackageHelper.checkException(enumeration);
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
     * Get the list with CIM_Container associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_Container(WBEMClient cimClient,
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_CONTAINER, role, includeQualifiers,
                    includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_CONTAINER, role, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_PhysicalPackageHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_PhysicalPackageHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_ContainerHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_Container(cimInstance));
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
                        result.add(new CIM_Container(cimInstance));
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
                        result.add(new CIM_Container(cimInstance));
                        continue;
                    }
                }
            }
            CIM_PhysicalPackageHelper.checkException(enumeration);
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
     * Get a list of CIMObjectPath items of the associations CIM_Container
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_Container(WBEMClient cimClient, String role,
            boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_CONTAINER, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_CONTAINER, role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_PhysicalPackageHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_PhysicalPackageHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_Container.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_PhysicalPackageHelper.checkException(enumeration);
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
     * Get the list with CIM_Chassis objects associated by the association CIM_PackageInChassis
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_PACKAGEINCHASSIS as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_Chassis_CIM_PackageInChassiss(WBEMClient cimClient)
            throws WbemsmtException {

        return getAssociated_CIM_Chassis_CIM_PackageInChassiss(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_PACKAGEINCHASSIS, CIM_Chassis.CIM_CLASS_NAME, null,
                null, false, false, null);

    }

    /**
     * Get the list with CIM_Chassis objects associated by the association CIM_PackageInChassis
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_PACKAGEINCHASSIS or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_PACKAGEINCHASSIS as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_Chassis_CIM_PackageInChassiss(WBEMClient cimClient,
            String resultClass, String role, String resultRole) throws WbemsmtException {

        return getAssociated_CIM_Chassis_CIM_PackageInChassiss(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_PACKAGEINCHASSIS, resultClass, role, resultRole,
                false, false, null);

    }

    /**
     * Get the list with CIM_Chassis objects associated by the association CIM_PackageInChassis
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_PACKAGEINCHASSIS or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_Chassis_CIM_PackageInChassiss(WBEMClient cimClient,
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
                CIM_PhysicalPackageHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_PhysicalPackageHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_PhysicalPackageHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_Chassis(cimInstance));
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
                        result.add(new CIM_Chassis(cimInstance));
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
                        result.add(new CIM_Chassis(cimInstance));
                        continue;
                    }
                }
            }
            CIM_PhysicalPackageHelper.checkException(enumeration);
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
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_PackageInChassis
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_PACKAGEINCHASSIS as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_Chassis_CIM_PackageInChassisNames(WBEMClient cimClient)
            throws WbemsmtException {

        return getAssociated_CIM_Chassis_CIM_PackageInChassisNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_PACKAGEINCHASSIS, CIM_Chassis.CIM_CLASS_NAME, null,
                null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_PackageInChassis
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_PACKAGEINCHASSIS or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_PACKAGEINCHASSIS as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_Chassis_CIM_PackageInChassisNames(WBEMClient cimClient,
            String resultClass, String role, String resultRole) throws WbemsmtException {

        return getAssociated_CIM_Chassis_CIM_PackageInChassisNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_PACKAGEINCHASSIS, resultClass, role, resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_PackageInChassis
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_Chassis_CIM_PackageInChassisNames(WBEMClient cimClient,
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
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_PACKAGEINCHASSIS,
                    CIM_Chassis.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_PhysicalPackageHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_PhysicalPackageHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_Chassis.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_PhysicalPackageHelper.checkException(enumeration);
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
     * Get the list with CIM_PackageInChassis associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_PackageInChassis(WBEMClient cimClient,
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_PACKAGEINCHASSIS, role, includeQualifiers,
                    includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_PACKAGEINCHASSIS, role, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_PhysicalPackageHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_PhysicalPackageHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_PackageInChassisHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_PackageInChassis(cimInstance));
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
                        result.add(new CIM_PackageInChassis(cimInstance));
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
                        result.add(new CIM_PackageInChassis(cimInstance));
                        continue;
                    }
                }
            }
            CIM_PhysicalPackageHelper.checkException(enumeration);
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
     * Get a list of CIMObjectPath items of the associations CIM_PackageInChassis
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_PackageInChassis(WBEMClient cimClient,
            String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_PACKAGEINCHASSIS, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_PACKAGEINCHASSIS, role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_PhysicalPackageHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_PhysicalPackageHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_PackageInChassis.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_PhysicalPackageHelper.checkException(enumeration);
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
     * Get the list with CIM_ComputerSystem objects associated by the association CIM_ComputerSystemPackage
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMPACKAGE as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_ComputerSystem_CIM_ComputerSystemPackages(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_ComputerSystem_CIM_ComputerSystemPackages(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMPACKAGE,
                CIM_ComputerSystem.CIM_CLASS_NAME, null, null, false, false, null);

    }

    /**
     * Get the list with CIM_ComputerSystem objects associated by the association CIM_ComputerSystemPackage
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMPACKAGE or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMPACKAGE as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_ComputerSystem_CIM_ComputerSystemPackages(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_ComputerSystem_CIM_ComputerSystemPackages(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMPACKAGE, resultClass, role, resultRole,
                false, false, null);

    }

    /**
     * Get the list with CIM_ComputerSystem objects associated by the association CIM_ComputerSystemPackage
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMPACKAGE or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_ComputerSystem_CIM_ComputerSystemPackages(
            WBEMClient cimClient, String associationClass, String resultClass, String role,
            String resultRole, boolean includeQualifiers, boolean includeClassOrigin,
            java.lang.String[] propertyList) throws WbemsmtException {

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
                CIM_PhysicalPackageHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_PhysicalPackageHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_PhysicalPackageHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_ComputerSystem(cimInstance));
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
                        result.add(new CIM_ComputerSystem(cimInstance));
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
                        result.add(new CIM_ComputerSystem(cimInstance));
                        continue;
                    }
                }
            }
            CIM_PhysicalPackageHelper.checkException(enumeration);
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
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_ComputerSystemPackage
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMPACKAGE as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_ComputerSystem_CIM_ComputerSystemPackageNames(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_ComputerSystem_CIM_ComputerSystemPackageNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMPACKAGE,
                CIM_ComputerSystem.CIM_CLASS_NAME, null, null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_ComputerSystemPackage
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMPACKAGE or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMPACKAGE as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_ComputerSystem_CIM_ComputerSystemPackageNames(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_ComputerSystem_CIM_ComputerSystemPackageNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMPACKAGE, resultClass, role, resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_ComputerSystemPackage
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_ComputerSystem_CIM_ComputerSystemPackageNames(
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
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMPACKAGE,
                    CIM_ComputerSystem.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_PhysicalPackageHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_PhysicalPackageHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_ComputerSystem.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_PhysicalPackageHelper.checkException(enumeration);
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
     * Get the list with CIM_ComputerSystemPackage associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_ComputerSystemPackage(WBEMClient cimClient,
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMPACKAGE, role, includeQualifiers,
                    includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMPACKAGE, role, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_PhysicalPackageHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_PhysicalPackageHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_ComputerSystemPackageHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_ComputerSystemPackage(cimInstance));
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
                        result.add(new CIM_ComputerSystemPackage(cimInstance));
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
                        result.add(new CIM_ComputerSystemPackage(cimInstance));
                        continue;
                    }
                }
            }
            CIM_PhysicalPackageHelper.checkException(enumeration);
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
     * Get a list of CIMObjectPath items of the associations CIM_ComputerSystemPackage
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_ComputerSystemPackage(WBEMClient cimClient,
            String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMPACKAGE, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMPACKAGE, role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_PhysicalPackageHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_PhysicalPackageHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_ComputerSystemPackage.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_PhysicalPackageHelper.checkException(enumeration);
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
     * Invokes the Method IsCompatible
     * <br>
     * @param client the cimclient
     * This method is being deprecated. A PhysicalPackage cannot determine if it is compatible with another object. The IsCompatible method verifies whether the referenced PhysicalElement may be contained by or inserted into the PhysicalPackage. The return value should be 0 if the request was successfully executed, 1 if the request is not supported and some other value if an error occurred. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
     *   @param ElementToCheck The element to check for compatibility with this one.
     *
     */

    public IsCompatibleResult invoke_IsCompatible(WBEMClient cimClient,
            CIM_PhysicalElement ElementToCheck) throws WbemsmtException {

        CIMArgument[] inParameter = new CIMArgument[1];
        CIMArgument[] outParameter = new CIMArgument[0];

        inParameter[0] = new CIMArgument("ElementToCheck", new CIMDataType(
                CIM_PhysicalElement.CIM_CLASS_NAME), ElementToCheck);

        javax.cim.UnsignedInteger32 resultObject = null;

        try {
            Object oResult = cimClient.invokeMethod(this.getCimObjectPath(),
                    METHOD_ISCOMPATIBLE.NAME, inParameter, outParameter);
            if (oResult != null) {

                resultObject = (javax.cim.UnsignedInteger32) oResult;
            }
        }
        catch (WBEMException e) {
            throw new InvokeMethodException(e, new InvokeMethodUserObject(this.getCimObjectPath(),
                    METHOD_ISCOMPATIBLE.NAME, inParameter, outParameter));
        }

        IsCompatibleResult result = new IsCompatibleResult();
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
     * Result object for the method IsCompatible
     */
    public static class IsCompatibleResult {
        /**
         * The return value of the method
         */

        javax.cim.UnsignedInteger32 resultObject = null;

        /**
         * Default constructor
         */
        IsCompatibleResult() {
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
        return CIM_PhysicalPackage.CIM_CLASS_NAME;
    }

}