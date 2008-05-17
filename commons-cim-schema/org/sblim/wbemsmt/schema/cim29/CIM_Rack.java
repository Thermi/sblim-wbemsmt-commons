/** 
 * CIM_Rack.java
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
 * Description: A Rack is a PhysicalFrame that represents an enclosure in which Chassis are placed. Typically a Rack is nothing more than the enclosure, and all the functioning componentry is packaged in the Chassis, loaded in the Rack.
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

public class CIM_Rack extends CIM_PhysicalFrame {

    public final static String CIM_CLASS_NAME = "CIM_Rack";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Racks, as simple enclosures, contain Chassis that provide the physical componentry realizing processing nodes, storage devices, UPSs, etc. The ChassisInRack association makes explicit the 'containing' relationship between the Rack and the Chassis.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_CHASSISINRACK = "CIM_ChassisInRack";

    /**
     * Constants of property CountryDesignation
     * Designation of the country for which the Rack is designed. Country code strings are as defined by ISO/IEC 3166. The rack type is specified in the TypeOf Rack property.
     */
    public static class PROPERTY_COUNTRYDESIGNATION {
        /**
         * name of the property CountryDesignation
         */
        public final static String NAME = "CountryDesignation";

    }

    /**
     * Constants of property Height
     * The height of the PhysicalPackage in 'U's. A 'U' is a standard unit of measure for the height of a Rack or rack-mountable component. It is equal to 1.75 inches or 4.445 cm.
     */
    public static class PROPERTY_HEIGHT {
        /**
         * name of the property Height
         */
        public final static String NAME = "Height";

    }

    /**
     * Constants of property TypeOfRack
     * Enumeration indicating the type of Rack. Information such as "Telco" rack (value=2) or standard 19 inch rack (1) can be specified. The country for which the Rack is manufactured is defined in the the Country Designation property.
     */
    public static class PROPERTY_TYPEOFRACK {
        /**
         * name of the property TypeOfRack
         */
        public final static String NAME = "TypeOfRack";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Standard_19_Inch = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry Standard 19 Inch (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_Standard_19_Inch = "Standard 19 Inch";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Telco = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Telco (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Telco = "Telco";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Equipment_Shelf = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Equipment Shelf (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Equipment_Shelf = "Equipment Shelf";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Non_Standard = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Non-Standard (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Non_Standard = "Non-Standard";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@6db46db4
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Standard_19_Inch.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Standard_19_Inch;
            }

            if (VALUE_ENTRY_Telco.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Telco;
            }

            if (VALUE_ENTRY_Equipment_Shelf.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Equipment_Shelf;
            }

            if (VALUE_ENTRY_Non_Standard.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Non_Standard;
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

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Standard_19_Inch.intValue()) {
                return VALUE_ENTRY_Standard_19_Inch;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Telco.intValue()) {
                return VALUE_ENTRY_Telco;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Equipment_Shelf.intValue()) {
                return VALUE_ENTRY_Equipment_Shelf;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Non_Standard.intValue()) {
                return VALUE_ENTRY_Non_Standard;
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
         * Value Map for the property TypeOfRack   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Standard_19_Inch,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Telco,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Equipment_Shelf,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Non_Standard };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property TypeOfRack   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Standard_19_Inch, VALUE_ENTRY_Telco, VALUE_ENTRY_Equipment_Shelf,
                VALUE_ENTRY_Non_Standard };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property TypeOfRack   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Standard_19_Inch, VALUE_ENTRY_Telco, VALUE_ENTRY_Equipment_Shelf,
                VALUE_ENTRY_Non_Standard };

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_PhysicalFrame.getPackages();

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
     *   A Rack is a PhysicalFrame that represents an enclosure in which Chassis are placed. Typically a Rack is nothing more than the enclosure, and all the functioning componentry is packaged in the Chassis, loaded in the Rack.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_Rack(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   A Rack is a PhysicalFrame that represents an enclosure in which Chassis are placed. Typically a Rack is nothing more than the enclosure, and all the functioning componentry is packaged in the Chassis, loaded in the Rack.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_Rack(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_Rack() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("CountryDesignation", new CIMProperty("CountryDesignation",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("Height", new CIMProperty("Height", CIMDataType.REAL32_T, null));
        propertiesToCheck.put("TypeOfRack", new CIMProperty("TypeOfRack", CIMDataType.UINT16_T,
                null));

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
     * Get the property CountryDesignation
     *     * <br>
     * Designation of the country for which the Rack is designed. Country code strings are as defined by ISO/IEC 3166. The rack type is specified in the TypeOf Rack property.
     *     */

    public String get_CountryDesignation() {
        CIMProperty currentProperty = getProperty(PROPERTY_COUNTRYDESIGNATION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_COUNTRYDESIGNATION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property CountryDesignation
     * <br>
     * Designation of the country for which the Rack is designed. Country code strings are as defined by ISO/IEC 3166. The rack type is specified in the TypeOf Rack property.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_CountryDesignation(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_COUNTRYDESIGNATION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_CountryDesignation(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_COUNTRYDESIGNATION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property CountryDesignation by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_CountryDesignation(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_Rack fco = new CIM_Rack(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_COUNTRYDESIGNATION.NAME);
        if (property != null) {
            property = setPropertyValue_CountryDesignation(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_COUNTRYDESIGNATION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property CountryDesignation
     * <br>
     * Designation of the country for which the Rack is designed. Country code strings are as defined by ISO/IEC 3166. The rack type is specified in the TypeOf Rack property.
     */

    private static CIMProperty setPropertyValue_CountryDesignation(CIMProperty currentProperty,
            String newValue) {
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
     * The height of the PhysicalPackage in 'U's. A 'U' is a standard unit of measure for the height of a Rack or rack-mountable component. It is equal to 1.75 inches or 4.445 cm.
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
     * The height of the PhysicalPackage in 'U's. A 'U' is a standard unit of measure for the height of a Rack or rack-mountable component. It is equal to 1.75 inches or 4.445 cm.
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
        CIM_Rack fco = new CIM_Rack(client, namespace);
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
     * The height of the PhysicalPackage in 'U's. A 'U' is a standard unit of measure for the height of a Rack or rack-mountable component. It is equal to 1.75 inches or 4.445 cm.
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
     * Get the property TypeOfRack
     *     * <br>
     * Enumeration indicating the type of Rack. Information such as "Telco" rack (value=2) or standard 19 inch rack (1) can be specified. The country for which the Rack is manufactured is defined in the the Country Designation property.
     *     */

    public javax.cim.UnsignedInteger16 get_TypeOfRack() {
        CIMProperty currentProperty = getProperty(PROPERTY_TYPEOFRACK.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_TYPEOFRACK.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property TypeOfRack
     * <br>
     * Enumeration indicating the type of Rack. Information such as "Telco" rack (value=2) or standard 19 inch rack (1) can be specified. The country for which the Rack is manufactured is defined in the the Country Designation property.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_TypeOfRack(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_TYPEOFRACK.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_TypeOfRack(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_TYPEOFRACK.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property TypeOfRack by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_TypeOfRack(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_Rack fco = new CIM_Rack(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_TYPEOFRACK.NAME);
        if (property != null) {
            property = setPropertyValue_TypeOfRack(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_TYPEOFRACK.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property TypeOfRack
     * <br>
     * Enumeration indicating the type of Rack. Information such as "Telco" rack (value=2) or standard 19 inch rack (1) can be specified. The country for which the Rack is manufactured is defined in the the Country Designation property.
     */

    private static CIMProperty setPropertyValue_TypeOfRack(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
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
     * Get the list with CIM_Chassis objects associated by the association CIM_ChassisInRack
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_CHASSISINRACK as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_Chassis_CIM_ChassisInRacks(WBEMClient cimClient)
            throws WbemsmtException {

        return getAssociated_CIM_Chassis_CIM_ChassisInRacks(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_CHASSISINRACK, CIM_Chassis.CIM_CLASS_NAME, null,
                null, false, false, null);

    }

    /**
     * Get the list with CIM_Chassis objects associated by the association CIM_ChassisInRack
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_CHASSISINRACK or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_CHASSISINRACK as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_Chassis_CIM_ChassisInRacks(WBEMClient cimClient,
            String resultClass, String role, String resultRole) throws WbemsmtException {

        return getAssociated_CIM_Chassis_CIM_ChassisInRacks(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_CHASSISINRACK, resultClass, role, resultRole, false,
                false, null);

    }

    /**
     * Get the list with CIM_Chassis objects associated by the association CIM_ChassisInRack
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_CHASSISINRACK or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_Chassis_CIM_ChassisInRacks(WBEMClient cimClient,
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
                CIM_RackHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_RackHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_RackHelper.findClass(cimClient, cimInstance);

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
            CIM_RackHelper.checkException(enumeration);
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
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_ChassisInRack
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_CHASSISINRACK as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_Chassis_CIM_ChassisInRackNames(WBEMClient cimClient)
            throws WbemsmtException {

        return getAssociated_CIM_Chassis_CIM_ChassisInRackNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_CHASSISINRACK, CIM_Chassis.CIM_CLASS_NAME, null, null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_ChassisInRack
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_CHASSISINRACK or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_CHASSISINRACK as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_Chassis_CIM_ChassisInRackNames(WBEMClient cimClient,
            String resultClass, String role, String resultRole) throws WbemsmtException {

        return getAssociated_CIM_Chassis_CIM_ChassisInRackNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_CHASSISINRACK, resultClass, role, resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_ChassisInRack
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_Chassis_CIM_ChassisInRackNames(WBEMClient cimClient,
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
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_CHASSISINRACK,
                    CIM_Chassis.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_RackHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_RackHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_Chassis.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_RackHelper.checkException(enumeration);
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
     * Get the list with CIM_ChassisInRack associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_ChassisInRack(WBEMClient cimClient,
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_CHASSISINRACK, role, includeQualifiers,
                    includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_CHASSISINRACK, role, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_RackHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_RackHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_ChassisInRackHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_ChassisInRack(cimInstance));
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
                        result.add(new CIM_ChassisInRack(cimInstance));
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
                        result.add(new CIM_ChassisInRack(cimInstance));
                        continue;
                    }
                }
            }
            CIM_RackHelper.checkException(enumeration);
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
     * Get a list of CIMObjectPath items of the associations CIM_ChassisInRack
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_ChassisInRack(WBEMClient cimClient, String role,
            boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_CHASSISINRACK, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_CHASSISINRACK, role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_RackHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_RackHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_ChassisInRack.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_RackHelper.checkException(enumeration);
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

    //**********************************************************************
    // utility methods     
    //**********************************************************************                         

    /**
     * return the name of the CIMClass
     * @return
     */
    public String getObjectName() {
        return CIM_Rack.CIM_CLASS_NAME;
    }

}