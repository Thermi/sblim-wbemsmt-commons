/** 
 * CIM_RealizedOnSide.java
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
 * Description: Since removable PhysicalMedia can be dual-sided, there is the possibility for StorageExtents to be realized on a single side of the Media. This association is a specialization of the RealizesExtent relationship, adding a Side property to express the Media's orientation details.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_RealizedOnSide extends CIM_RealizesExtent {

    public final static String CIM_CLASS_NAME = "CIM_RealizedOnSide";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property Side
     * An enumeration expressing on which 'Side' the Extent is realized. Since sides can be named by various schemes (0/1 or A/B), both schemes are expressed in the Values array of this property.
     */
    public static class PROPERTY_SIDE {
        /**
         * name of the property Side
         */
        public final static String NAME = "Side";

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
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@3f5c3f5c
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
         * Value Map for the property Side   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Side_0, VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Side_1,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Side_A, VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Side_B };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property Side   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Side_0,
                VALUE_ENTRY_Side_1, VALUE_ENTRY_Side_A, VALUE_ENTRY_Side_B };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property Side   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Side_0, VALUE_ENTRY_Side_1, VALUE_ENTRY_Side_A, VALUE_ENTRY_Side_B };

    }

    /**
     * Constants of property Antecedent
     * 
     */
    public static class PROPERTY_ANTECEDENT_CIM_PHYSICALMEDIA {
        /**
         * name of the property Antecedent
         */
        public final static String NAME = "Antecedent";

    }

    /**
     * Constants of property Dependent
     * 
     */
    public static class PROPERTY_DEPENDENT_CIM_STORAGEEXTENT {
        /**
         * name of the property Dependent
         */
        public final static String NAME = "Dependent";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_RealizesExtent.getPackages();

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
     *   Since removable PhysicalMedia can be dual-sided, there is the possibility for StorageExtents to be realized on a single side of the Media. This association is a specialization of the RealizesExtent relationship, adding a Side property to express the Media's orientation details.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_RealizedOnSide(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   Since removable PhysicalMedia can be dual-sided, there is the possibility for StorageExtents to be realized on a single side of the Media. This association is a specialization of the RealizesExtent relationship, adding a Side property to express the Media's orientation details.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_RealizedOnSide(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_RealizedOnSide() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("Side", new CIMProperty("Side", CIMDataType.UINT16_T, null));
        propertiesToCheck.put("Antecedent", new CIMProperty("Antecedent", new CIMDataType(
                CIM_PhysicalMedia.CIM_CLASS_NAME), null));
        propertiesToCheck.put("Dependent", new CIMProperty("Dependent", new CIMDataType(
                CIM_StorageExtent.CIM_CLASS_NAME), null));

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
     * Get the property Side
     *     * <br>
     * An enumeration expressing on which 'Side' the Extent is realized. Since sides can be named by various schemes (0/1 or A/B), both schemes are expressed in the Values array of this property.
     *     */

    public javax.cim.UnsignedInteger16 get_Side() {
        CIMProperty currentProperty = getProperty(PROPERTY_SIDE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SIDE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property Side
     * <br>
     * An enumeration expressing on which 'Side' the Extent is realized. Since sides can be named by various schemes (0/1 or A/B), both schemes are expressed in the Values array of this property.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Side(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SIDE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Side(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SIDE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Side by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Side(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_RealizedOnSide fco = new CIM_RealizedOnSide(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SIDE.NAME);
        if (property != null) {
            property = setPropertyValue_Side(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SIDE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Side
     * <br>
     * An enumeration expressing on which 'Side' the Extent is realized. Since sides can be named by various schemes (0/1 or A/B), both schemes are expressed in the Values array of this property.
     */

    private static CIMProperty setPropertyValue_Side(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
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

    public CIM_PhysicalMedia get_Antecedent_CIM_PhysicalMedia(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_ANTECEDENT_CIM_PHYSICALMEDIA.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ANTECEDENT_CIM_PHYSICALMEDIA.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_PhysicalMediaHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property Antecedent
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Antecedent_CIM_PhysicalMedia(CIM_PhysicalMedia newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ANTECEDENT_CIM_PHYSICALMEDIA.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Antecedent_CIM_PhysicalMedia(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ANTECEDENT_CIM_PHYSICALMEDIA.NAME
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

    public static CIMProperty create_Antecedent_CIM_PhysicalMedia(WBEMClient client,
            String namespace, CIM_PhysicalMedia newValue) throws WbemsmtException {
        CIM_RealizedOnSide fco = new CIM_RealizedOnSide(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ANTECEDENT_CIM_PHYSICALMEDIA.NAME);
        if (property != null) {
            property = setPropertyValue_Antecedent_CIM_PhysicalMedia(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ANTECEDENT_CIM_PHYSICALMEDIA.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Antecedent
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_Antecedent_CIM_PhysicalMedia(
            CIMProperty currentProperty, CIM_PhysicalMedia newValue) {
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

    public CIM_StorageExtent get_Dependent_CIM_StorageExtent(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_DEPENDENT_CIM_STORAGEEXTENT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_DEPENDENT_CIM_STORAGEEXTENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_StorageExtentHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property Dependent
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Dependent_CIM_StorageExtent(CIM_StorageExtent newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_DEPENDENT_CIM_STORAGEEXTENT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Dependent_CIM_StorageExtent(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_DEPENDENT_CIM_STORAGEEXTENT.NAME
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

    public static CIMProperty create_Dependent_CIM_StorageExtent(WBEMClient client,
            String namespace, CIM_StorageExtent newValue) throws WbemsmtException {
        CIM_RealizedOnSide fco = new CIM_RealizedOnSide(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_DEPENDENT_CIM_STORAGEEXTENT.NAME);
        if (property != null) {
            property = setPropertyValue_Dependent_CIM_StorageExtent(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_DEPENDENT_CIM_STORAGEEXTENT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Dependent
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_Dependent_CIM_StorageExtent(
            CIMProperty currentProperty, CIM_StorageExtent newValue) {
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
        return CIM_RealizedOnSide.CIM_CLASS_NAME;
    }

}