/** 
 * CIM_PhysicalMediaInLocation.java
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
 * Description: Within a StorageLibrary, all Media should be accounted for, and be present in some Storage Location. This relationship is made explicit by the PhysicalMediaInLocation association. In addition, one can determine if a Location is empty or full based on whether this association exists for the StorageMediaLocation.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_PhysicalMediaInLocation extends CIM_Dependency {

    public final static String CIM_CLASS_NAME = "CIM_PhysicalMediaInLocation";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property Orientation
     * An enumeration expressing which 'Side' of the Media is facing up. Since sides can be named by various schemes (0/1 or A/B), both schemes are expressed in the Values array of this property. Also, the value 5 ("Not Applicable" describes that orientation is not pertinent for this Media.
     */
    public static class PROPERTY_ORIENTATION {
        /**
         * name of the property Orientation
         */
        public final static String NAME = "Orientation";

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
         * constant for value map entry 1
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Side_0 = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry Side 0 (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_Side_0 = "Side 0";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Side_1 = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Side 1 (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Side_1 = "Side 1";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Side_A = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Side A (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Side_A = "Side A";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Side_B = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Side B (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Side_B = "Side B";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Not_Applicable = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry Not Applicable (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Not_Applicable = "Not Applicable";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@371c371c
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Side_0.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Side_0;
            }

            if (VALUE_ENTRY_Side_1.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Side_1;
            }

            if (VALUE_ENTRY_Side_A.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Side_A;
            }

            if (VALUE_ENTRY_Side_B.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Side_B;
            }

            if (VALUE_ENTRY_Not_Applicable.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Not_Applicable;
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

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Side_0.intValue()) {
                return VALUE_ENTRY_Side_0;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Side_1.intValue()) {
                return VALUE_ENTRY_Side_1;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Side_A.intValue()) {
                return VALUE_ENTRY_Side_A;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Side_B.intValue()) {
                return VALUE_ENTRY_Side_B;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Not_Applicable.intValue()) {
                return VALUE_ENTRY_Not_Applicable;
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
         * Value Map for the property Orientation   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Side_0, VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Side_1,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Side_A, VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Side_B,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Not_Applicable };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property Orientation   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Side_0,
                VALUE_ENTRY_Side_1, VALUE_ENTRY_Side_A, VALUE_ENTRY_Side_B,
                VALUE_ENTRY_Not_Applicable };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property Orientation   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Side_0, VALUE_ENTRY_Side_1, VALUE_ENTRY_Side_A, VALUE_ENTRY_Side_B,
                VALUE_ENTRY_Not_Applicable };

    }

    /**
     * Constants of property TimeOfLastPlacement
     * The date and time that the Media was last placed into the referenced Location.
     */
    public static class PROPERTY_TIMEOFLASTPLACEMENT {
        /**
         * name of the property TimeOfLastPlacement
         */
        public final static String NAME = "TimeOfLastPlacement";

    }

    /**
     * Constants of property Antecedent
     * 
     */
    public static class PROPERTY_ANTECEDENT_CIM_STORAGEMEDIALOCATION {
        /**
         * name of the property Antecedent
         */
        public final static String NAME = "Antecedent";

    }

    /**
     * Constants of property Dependent
     * 
     */
    public static class PROPERTY_DEPENDENT_CIM_PHYSICALMEDIA {
        /**
         * name of the property Dependent
         */
        public final static String NAME = "Dependent";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_Dependency.getPackages();

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
     *   Within a StorageLibrary, all Media should be accounted for, and be present in some Storage Location. This relationship is made explicit by the PhysicalMediaInLocation association. In addition, one can determine if a Location is empty or full based on whether this association exists for the StorageMediaLocation.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_PhysicalMediaInLocation(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   Within a StorageLibrary, all Media should be accounted for, and be present in some Storage Location. This relationship is made explicit by the PhysicalMediaInLocation association. In addition, one can determine if a Location is empty or full based on whether this association exists for the StorageMediaLocation.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_PhysicalMediaInLocation(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_PhysicalMediaInLocation() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("Orientation", new CIMProperty("Orientation", CIMDataType.UINT16_T,
                null));
        propertiesToCheck.put("TimeOfLastPlacement", new CIMProperty("TimeOfLastPlacement",
                CIMDataType.DATETIME_T, null));
        propertiesToCheck.put("Antecedent", new CIMProperty("Antecedent", new CIMDataType(
                CIM_StorageMediaLocation.CIM_CLASS_NAME), null));
        propertiesToCheck.put("Dependent", new CIMProperty("Dependent", new CIMDataType(
                CIM_PhysicalMedia.CIM_CLASS_NAME), null));

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
     * Get the property Orientation
     *     * <br>
     * An enumeration expressing which 'Side' of the Media is facing up. Since sides can be named by various schemes (0/1 or A/B), both schemes are expressed in the Values array of this property. Also, the value 5 ("Not Applicable" describes that orientation is not pertinent for this Media.
     *     */

    public javax.cim.UnsignedInteger16 get_Orientation() {
        CIMProperty currentProperty = getProperty(PROPERTY_ORIENTATION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ORIENTATION.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property Orientation
     * <br>
     * An enumeration expressing which 'Side' of the Media is facing up. Since sides can be named by various schemes (0/1 or A/B), both schemes are expressed in the Values array of this property. Also, the value 5 ("Not Applicable" describes that orientation is not pertinent for this Media.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Orientation(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ORIENTATION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Orientation(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ORIENTATION.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Orientation by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Orientation(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_PhysicalMediaInLocation fco = new CIM_PhysicalMediaInLocation(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ORIENTATION.NAME);
        if (property != null) {
            property = setPropertyValue_Orientation(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ORIENTATION.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Orientation
     * <br>
     * An enumeration expressing which 'Side' of the Media is facing up. Since sides can be named by various schemes (0/1 or A/B), both schemes are expressed in the Values array of this property. Also, the value 5 ("Not Applicable" describes that orientation is not pertinent for this Media.
     */

    private static CIMProperty setPropertyValue_Orientation(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property TimeOfLastPlacement
     *     * <br>
     * The date and time that the Media was last placed into the referenced Location.
     *     */

    public javax.cim.CIMDateTime get_TimeOfLastPlacement() {
        CIMProperty currentProperty = getProperty(PROPERTY_TIMEOFLASTPLACEMENT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_TIMEOFLASTPLACEMENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.CIMDateTime) currentProperty.getValue();

    }

    /**
     * Set the property TimeOfLastPlacement
     * <br>
     * The date and time that the Media was last placed into the referenced Location.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_TimeOfLastPlacement(javax.cim.CIMDateTime newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_TIMEOFLASTPLACEMENT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_TimeOfLastPlacement(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_TIMEOFLASTPLACEMENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property TimeOfLastPlacement by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_TimeOfLastPlacement(WBEMClient client, String namespace,
            javax.cim.CIMDateTime newValue) throws WbemsmtException {
        CIM_PhysicalMediaInLocation fco = new CIM_PhysicalMediaInLocation(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_TIMEOFLASTPLACEMENT.NAME);
        if (property != null) {
            property = setPropertyValue_TimeOfLastPlacement(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_TIMEOFLASTPLACEMENT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property TimeOfLastPlacement
     * <br>
     * The date and time that the Media was last placed into the referenced Location.
     */

    private static CIMProperty setPropertyValue_TimeOfLastPlacement(CIMProperty currentProperty,
            javax.cim.CIMDateTime newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Antecedent
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_StorageMediaLocation get_Antecedent_CIM_StorageMediaLocation(
            javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_ANTECEDENT_CIM_STORAGEMEDIALOCATION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ANTECEDENT_CIM_STORAGEMEDIALOCATION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_StorageMediaLocationHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property Antecedent
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Antecedent_CIM_StorageMediaLocation(CIM_StorageMediaLocation newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ANTECEDENT_CIM_STORAGEMEDIALOCATION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Antecedent_CIM_StorageMediaLocation(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ANTECEDENT_CIM_STORAGEMEDIALOCATION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Antecedent by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Antecedent_CIM_StorageMediaLocation(WBEMClient client,
            String namespace, CIM_StorageMediaLocation newValue) throws WbemsmtException {
        CIM_PhysicalMediaInLocation fco = new CIM_PhysicalMediaInLocation(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ANTECEDENT_CIM_STORAGEMEDIALOCATION.NAME);
        if (property != null) {
            property = setPropertyValue_Antecedent_CIM_StorageMediaLocation(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ANTECEDENT_CIM_STORAGEMEDIALOCATION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Antecedent
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_Antecedent_CIM_StorageMediaLocation(
            CIMProperty currentProperty, CIM_StorageMediaLocation newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getCimObjectPath() : null;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Dependent
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_PhysicalMedia get_Dependent_CIM_PhysicalMedia(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_DEPENDENT_CIM_PHYSICALMEDIA.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_DEPENDENT_CIM_PHYSICALMEDIA.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_PhysicalMediaHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property Dependent
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Dependent_CIM_PhysicalMedia(CIM_PhysicalMedia newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_DEPENDENT_CIM_PHYSICALMEDIA.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Dependent_CIM_PhysicalMedia(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_DEPENDENT_CIM_PHYSICALMEDIA.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Dependent by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Dependent_CIM_PhysicalMedia(WBEMClient client,
            String namespace, CIM_PhysicalMedia newValue) throws WbemsmtException {
        CIM_PhysicalMediaInLocation fco = new CIM_PhysicalMediaInLocation(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_DEPENDENT_CIM_PHYSICALMEDIA.NAME);
        if (property != null) {
            property = setPropertyValue_Dependent_CIM_PhysicalMedia(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_DEPENDENT_CIM_PHYSICALMEDIA.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Dependent
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_Dependent_CIM_PhysicalMedia(
            CIMProperty currentProperty, CIM_PhysicalMedia newValue) {
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
        return CIM_PhysicalMediaInLocation.CIM_CLASS_NAME;
    }

}