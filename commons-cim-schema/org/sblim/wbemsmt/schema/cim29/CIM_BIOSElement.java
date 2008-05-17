/** 
 * CIM_BIOSElement.java
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
 * Description: BIOSElement represents the low-level software that is loaded into non-volatile storage and used to bring up and configure a ComputerSystem.
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

public class CIM_BIOSElement extends CIM_SoftwareElement {

    public final static String CIM_CLASS_NAME = "CIM_BIOSElement";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * A link between BIOSFeature and its aggregated BIOSElements.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSFEATUREBIOSELEMENTS = "CIM_BIOSFeatureBIOSElements";

    /**
     * SystemBIOS associates a UnitaryComputerSystem's BIOS with the System itself.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMBIOS = "CIM_SystemBIOS";

    /**
     * A link between BIOSElement and Memory where the BIOS is loaded.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSLOADEDINNV = "CIM_BIOSLoadedInNV";

    /**
     * Constants of property CurrentLanguage
     * The currently selected language for the BIOS. This information can be obtained from SMBIOS, using the Current Language attribute of the Type 13 structure, to index into the string list following the structure. The property is formatted using the ISO 639 Language Name, and may be followed by the ISO 3166 Territory Name and the encoding method.
     */
    public static class PROPERTY_CURRENTLANGUAGE {
        /**
         * name of the property CurrentLanguage
         */
        public final static String NAME = "CurrentLanguage";

    }

    /**
     * Constants of property ListOfLanguages
     * A list of installable languages for the BIOS. This information can be obtained from SMBIOS, from the string list that follows the Type 13 structure. An ISO 639 Language Name should be used to specify the BIOS' installable languages. The ISO 3166 Territory Name and the encoding method may also be specified, following the Language Name.
     */
    public static class PROPERTY_LISTOFLANGUAGES {
        /**
         * name of the property ListOfLanguages
         */
        public final static String NAME = "ListOfLanguages";

    }

    /**
     * Constants of property LoadUtilityInformation
     * A free form string describing the BIOS flash/load utility that is required to update the BIOSElement. Version and other information may be indicated in this property.
     */
    public static class PROPERTY_LOADUTILITYINFORMATION {
        /**
         * name of the property LoadUtilityInformation
         */
        public final static String NAME = "LoadUtilityInformation";

    }

    /**
     * Constants of property LoadedEndingAddress
     * The ending address of the memory which this BIOS occupies.
     */
    public static class PROPERTY_LOADEDENDINGADDRESS {
        /**
         * name of the property LoadedEndingAddress
         */
        public final static String NAME = "LoadedEndingAddress";

    }

    /**
     * Constants of property LoadedStartingAddress
     * The starting address of the memory which this BIOS occupies.
     */
    public static class PROPERTY_LOADEDSTARTINGADDRESS {
        /**
         * name of the property LoadedStartingAddress
         */
        public final static String NAME = "LoadedStartingAddress";

    }

    /**
     * Constants of property Manufacturer
     * 
     */
    public static class PROPERTY_MANUFACTURER {
        /**
         * name of the property Manufacturer
         */
        public final static String NAME = "Manufacturer";

    }

    /**
     * Constants of property PrimaryBIOS
     * If true, this is the primary BIOS of the ComputerSystem.
     */
    public static class PROPERTY_PRIMARYBIOS {
        /**
         * name of the property PrimaryBIOS
         */
        public final static String NAME = "PrimaryBIOS";

    }

    /**
     * Constants of property ReleaseDate
     * Date that this BIOS was released.
     */
    public static class PROPERTY_RELEASEDATE {
        /**
         * name of the property ReleaseDate
         */
        public final static String NAME = "ReleaseDate";

    }

    /**
     * Constants of property Version
     * 
     */
    public static class PROPERTY_VERSION {
        /**
         * name of the property Version
         */
        public final static String NAME = "Version";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_SoftwareElement.getPackages();

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
     *   BIOSElement represents the low-level software that is loaded into non-volatile storage and used to bring up and configure a ComputerSystem.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_BIOSElement(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   BIOSElement represents the low-level software that is loaded into non-volatile storage and used to bring up and configure a ComputerSystem.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_BIOSElement(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_BIOSElement() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("CurrentLanguage", new CIMProperty("CurrentLanguage",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("ListOfLanguages", new CIMProperty("ListOfLanguages",
                CIMDataType.STRING_ARRAY_T, null));
        propertiesToCheck.put("LoadUtilityInformation", new CIMProperty("LoadUtilityInformation",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("LoadedEndingAddress", new CIMProperty("LoadedEndingAddress",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("LoadedStartingAddress", new CIMProperty("LoadedStartingAddress",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("Manufacturer", new CIMProperty("Manufacturer", CIMDataType.STRING_T,
                null));
        propertiesToCheck.put("PrimaryBIOS", new CIMProperty("PrimaryBIOS", CIMDataType.BOOLEAN_T,
                null));
        propertiesToCheck.put("ReleaseDate", new CIMProperty("ReleaseDate", CIMDataType.DATETIME_T,
                null));
        propertiesToCheck.put("Version", new CIMProperty("Version", CIMDataType.STRING_T, null));

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
     * Get the property CurrentLanguage
     *     * <br>
     * The currently selected language for the BIOS. This information can be obtained from SMBIOS, using the Current Language attribute of the Type 13 structure, to index into the string list following the structure. The property is formatted using the ISO 639 Language Name, and may be followed by the ISO 3166 Territory Name and the encoding method.
     *     */

    public String get_CurrentLanguage() {
        CIMProperty currentProperty = getProperty(PROPERTY_CURRENTLANGUAGE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CURRENTLANGUAGE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property CurrentLanguage
     * <br>
     * The currently selected language for the BIOS. This information can be obtained from SMBIOS, using the Current Language attribute of the Type 13 structure, to index into the string list following the structure. The property is formatted using the ISO 639 Language Name, and may be followed by the ISO 3166 Territory Name and the encoding method.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_CurrentLanguage(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CURRENTLANGUAGE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_CurrentLanguage(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CURRENTLANGUAGE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property CurrentLanguage by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_CurrentLanguage(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_BIOSElement fco = new CIM_BIOSElement(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CURRENTLANGUAGE.NAME);
        if (property != null) {
            property = setPropertyValue_CurrentLanguage(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CURRENTLANGUAGE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property CurrentLanguage
     * <br>
     * The currently selected language for the BIOS. This information can be obtained from SMBIOS, using the Current Language attribute of the Type 13 structure, to index into the string list following the structure. The property is formatted using the ISO 639 Language Name, and may be followed by the ISO 3166 Territory Name and the encoding method.
     */

    private static CIMProperty setPropertyValue_CurrentLanguage(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ListOfLanguages
     *     * <br>
     * A list of installable languages for the BIOS. This information can be obtained from SMBIOS, from the string list that follows the Type 13 structure. An ISO 639 Language Name should be used to specify the BIOS' installable languages. The ISO 3166 Territory Name and the encoding method may also be specified, following the Language Name.
     *     */

    public String[] get_ListOfLanguages() {
        CIMProperty currentProperty = getProperty(PROPERTY_LISTOFLANGUAGES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_LISTOFLANGUAGES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String[]) currentProperty.getValue();

    }

    /**
     * Set the property ListOfLanguages
     * <br>
     * A list of installable languages for the BIOS. This information can be obtained from SMBIOS, from the string list that follows the Type 13 structure. An ISO 639 Language Name should be used to specify the BIOS' installable languages. The ISO 3166 Territory Name and the encoding method may also be specified, following the Language Name.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ListOfLanguages(String[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_LISTOFLANGUAGES.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ListOfLanguages(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_LISTOFLANGUAGES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ListOfLanguages by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ListOfLanguages(WBEMClient client, String namespace,
            String[] newValue) throws WbemsmtException {
        CIM_BIOSElement fco = new CIM_BIOSElement(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_LISTOFLANGUAGES.NAME);
        if (property != null) {
            property = setPropertyValue_ListOfLanguages(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_LISTOFLANGUAGES.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ListOfLanguages
     * <br>
     * A list of installable languages for the BIOS. This information can be obtained from SMBIOS, from the string list that follows the Type 13 structure. An ISO 639 Language Name should be used to specify the BIOS' installable languages. The ISO 3166 Territory Name and the encoding method may also be specified, following the Language Name.
     */

    private static CIMProperty setPropertyValue_ListOfLanguages(CIMProperty currentProperty,
            String[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property LoadUtilityInformation
     *     * <br>
     * A free form string describing the BIOS flash/load utility that is required to update the BIOSElement. Version and other information may be indicated in this property.
     *     */

    public String get_LoadUtilityInformation() {
        CIMProperty currentProperty = getProperty(PROPERTY_LOADUTILITYINFORMATION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_LOADUTILITYINFORMATION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property LoadUtilityInformation
     * <br>
     * A free form string describing the BIOS flash/load utility that is required to update the BIOSElement. Version and other information may be indicated in this property.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_LoadUtilityInformation(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_LOADUTILITYINFORMATION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_LoadUtilityInformation(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_LOADUTILITYINFORMATION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property LoadUtilityInformation by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_LoadUtilityInformation(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_BIOSElement fco = new CIM_BIOSElement(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_LOADUTILITYINFORMATION.NAME);
        if (property != null) {
            property = setPropertyValue_LoadUtilityInformation(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_LOADUTILITYINFORMATION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property LoadUtilityInformation
     * <br>
     * A free form string describing the BIOS flash/load utility that is required to update the BIOSElement. Version and other information may be indicated in this property.
     */

    private static CIMProperty setPropertyValue_LoadUtilityInformation(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property LoadedEndingAddress
     *     * <br>
     * The ending address of the memory which this BIOS occupies.
     *     */

    public javax.cim.UnsignedInteger64 get_LoadedEndingAddress() {
        CIMProperty currentProperty = getProperty(PROPERTY_LOADEDENDINGADDRESS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_LOADEDENDINGADDRESS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property LoadedEndingAddress
     * <br>
     * The ending address of the memory which this BIOS occupies.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_LoadedEndingAddress(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_LOADEDENDINGADDRESS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_LoadedEndingAddress(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_LOADEDENDINGADDRESS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property LoadedEndingAddress by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_LoadedEndingAddress(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_BIOSElement fco = new CIM_BIOSElement(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_LOADEDENDINGADDRESS.NAME);
        if (property != null) {
            property = setPropertyValue_LoadedEndingAddress(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_LOADEDENDINGADDRESS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property LoadedEndingAddress
     * <br>
     * The ending address of the memory which this BIOS occupies.
     */

    private static CIMProperty setPropertyValue_LoadedEndingAddress(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property LoadedStartingAddress
     *     * <br>
     * The starting address of the memory which this BIOS occupies.
     *     */

    public javax.cim.UnsignedInteger64 get_LoadedStartingAddress() {
        CIMProperty currentProperty = getProperty(PROPERTY_LOADEDSTARTINGADDRESS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_LOADEDSTARTINGADDRESS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property LoadedStartingAddress
     * <br>
     * The starting address of the memory which this BIOS occupies.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_LoadedStartingAddress(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_LOADEDSTARTINGADDRESS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_LoadedStartingAddress(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_LOADEDSTARTINGADDRESS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property LoadedStartingAddress by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_LoadedStartingAddress(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_BIOSElement fco = new CIM_BIOSElement(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_LOADEDSTARTINGADDRESS.NAME);
        if (property != null) {
            property = setPropertyValue_LoadedStartingAddress(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_LOADEDSTARTINGADDRESS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property LoadedStartingAddress
     * <br>
     * The starting address of the memory which this BIOS occupies.
     */

    private static CIMProperty setPropertyValue_LoadedStartingAddress(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Manufacturer
     *     * <br>
     * 
     *     */

    public String get_Manufacturer() {
        CIMProperty currentProperty = getProperty(PROPERTY_MANUFACTURER.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_MANUFACTURER.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property Manufacturer
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Manufacturer(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_MANUFACTURER.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Manufacturer(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_MANUFACTURER.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Manufacturer by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Manufacturer(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_BIOSElement fco = new CIM_BIOSElement(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MANUFACTURER.NAME);
        if (property != null) {
            property = setPropertyValue_Manufacturer(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_MANUFACTURER.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Manufacturer
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_Manufacturer(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PrimaryBIOS
     *     * <br>
     * If true, this is the primary BIOS of the ComputerSystem.
     *     */

    public Boolean get_PrimaryBIOS() {
        CIMProperty currentProperty = getProperty(PROPERTY_PRIMARYBIOS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PRIMARYBIOS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property PrimaryBIOS
     * <br>
     * If true, this is the primary BIOS of the ComputerSystem.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PrimaryBIOS(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PRIMARYBIOS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_PrimaryBIOS(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PRIMARYBIOS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PrimaryBIOS by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PrimaryBIOS(WBEMClient client, String namespace,
            Boolean newValue) throws WbemsmtException {
        CIM_BIOSElement fco = new CIM_BIOSElement(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PRIMARYBIOS.NAME);
        if (property != null) {
            property = setPropertyValue_PrimaryBIOS(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PRIMARYBIOS.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PrimaryBIOS
     * <br>
     * If true, this is the primary BIOS of the ComputerSystem.
     */

    private static CIMProperty setPropertyValue_PrimaryBIOS(CIMProperty currentProperty,
            Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ReleaseDate
     *     * <br>
     * Date that this BIOS was released.
     *     */

    public javax.cim.CIMDateTime get_ReleaseDate() {
        CIMProperty currentProperty = getProperty(PROPERTY_RELEASEDATE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_RELEASEDATE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.CIMDateTime) currentProperty.getValue();

    }

    /**
     * Set the property ReleaseDate
     * <br>
     * Date that this BIOS was released.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ReleaseDate(javax.cim.CIMDateTime newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_RELEASEDATE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ReleaseDate(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_RELEASEDATE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ReleaseDate by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ReleaseDate(WBEMClient client, String namespace,
            javax.cim.CIMDateTime newValue) throws WbemsmtException {
        CIM_BIOSElement fco = new CIM_BIOSElement(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_RELEASEDATE.NAME);
        if (property != null) {
            property = setPropertyValue_ReleaseDate(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_RELEASEDATE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ReleaseDate
     * <br>
     * Date that this BIOS was released.
     */

    private static CIMProperty setPropertyValue_ReleaseDate(CIMProperty currentProperty,
            javax.cim.CIMDateTime newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Version
     *     * <br>
     * 
     *     */

    public String get_Version() {
        CIMProperty currentProperty = getProperty(PROPERTY_VERSION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_VERSION.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property Version
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Version(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_VERSION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Version(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_VERSION.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Version by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Version(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_BIOSElement fco = new CIM_BIOSElement(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_VERSION.NAME);
        if (property != null) {
            property = setPropertyValue_Version(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_VERSION.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Version
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_Version(CIMProperty currentProperty, String newValue) {
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
     * Get the list with CIM_BIOSFeature objects associated by the association CIM_BIOSFeatureBIOSElements
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSFEATUREBIOSELEMENTS as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_BIOSFeature_CIM_BIOSFeatureBIOSElementss(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_BIOSFeature_CIM_BIOSFeatureBIOSElementss(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSFEATUREBIOSELEMENTS,
                CIM_BIOSFeature.CIM_CLASS_NAME, null, null, false, false, null);

    }

    /**
     * Get the list with CIM_BIOSFeature objects associated by the association CIM_BIOSFeatureBIOSElements
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSFEATUREBIOSELEMENTS or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSFEATUREBIOSELEMENTS as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_BIOSFeature_CIM_BIOSFeatureBIOSElementss(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_BIOSFeature_CIM_BIOSFeatureBIOSElementss(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSFEATUREBIOSELEMENTS, resultClass, role,
                resultRole, false, false, null);

    }

    /**
     * Get the list with CIM_BIOSFeature objects associated by the association CIM_BIOSFeatureBIOSElements
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSFEATUREBIOSELEMENTS or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_BIOSFeature_CIM_BIOSFeatureBIOSElementss(
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
                CIM_BIOSElementHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_BIOSElementHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_BIOSElementHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_BIOSFeature(cimInstance));
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
                        result.add(new CIM_BIOSFeature(cimInstance));
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
                        result.add(new CIM_BIOSFeature(cimInstance));
                        continue;
                    }
                }
            }
            CIM_BIOSElementHelper.checkException(enumeration);
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
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_BIOSFeatureBIOSElements
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSFEATUREBIOSELEMENTS as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_BIOSFeature_CIM_BIOSFeatureBIOSElementsNames(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_BIOSFeature_CIM_BIOSFeatureBIOSElementsNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSFEATUREBIOSELEMENTS,
                CIM_BIOSFeature.CIM_CLASS_NAME, null, null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_BIOSFeatureBIOSElements
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSFEATUREBIOSELEMENTS or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSFEATUREBIOSELEMENTS as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_BIOSFeature_CIM_BIOSFeatureBIOSElementsNames(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_BIOSFeature_CIM_BIOSFeatureBIOSElementsNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSFEATUREBIOSELEMENTS, resultClass, role,
                resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_BIOSFeatureBIOSElements
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_BIOSFeature_CIM_BIOSFeatureBIOSElementsNames(
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
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSFEATUREBIOSELEMENTS,
                    CIM_BIOSFeature.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_BIOSElementHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_BIOSElementHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_BIOSFeature.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_BIOSElementHelper.checkException(enumeration);
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
     * Get the list with CIM_BIOSFeatureBIOSElements associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_BIOSFeatureBIOSElements(WBEMClient cimClient,
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSFEATUREBIOSELEMENTS, role, includeQualifiers,
                    includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSFEATUREBIOSELEMENTS, role, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_BIOSElementHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_BIOSElementHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_BIOSFeatureBIOSElementsHelper.findClass(cimClient,
                            cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_BIOSFeatureBIOSElements(cimInstance));
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
                        result.add(new CIM_BIOSFeatureBIOSElements(cimInstance));
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
                        result.add(new CIM_BIOSFeatureBIOSElements(cimInstance));
                        continue;
                    }
                }
            }
            CIM_BIOSElementHelper.checkException(enumeration);
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
     * Get a list of CIMObjectPath items of the associations CIM_BIOSFeatureBIOSElements
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_BIOSFeatureBIOSElements(WBEMClient cimClient,
            String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSFEATUREBIOSELEMENTS, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSFEATUREBIOSELEMENTS,
                    role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_BIOSElementHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_BIOSElementHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_BIOSFeatureBIOSElements.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_BIOSElementHelper.checkException(enumeration);
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
     * Get the list with CIM_ComputerSystem objects associated by the association CIM_SystemBIOS
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMBIOS as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_ComputerSystem_CIM_SystemBIOSs(WBEMClient cimClient)
            throws WbemsmtException {

        return getAssociated_CIM_ComputerSystem_CIM_SystemBIOSs(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMBIOS, CIM_ComputerSystem.CIM_CLASS_NAME, null,
                null, false, false, null);

    }

    /**
     * Get the list with CIM_ComputerSystem objects associated by the association CIM_SystemBIOS
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMBIOS or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMBIOS as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_ComputerSystem_CIM_SystemBIOSs(WBEMClient cimClient,
            String resultClass, String role, String resultRole) throws WbemsmtException {

        return getAssociated_CIM_ComputerSystem_CIM_SystemBIOSs(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMBIOS, resultClass, role, resultRole, false,
                false, null);

    }

    /**
     * Get the list with CIM_ComputerSystem objects associated by the association CIM_SystemBIOS
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMBIOS or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_ComputerSystem_CIM_SystemBIOSs(WBEMClient cimClient,
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
                CIM_BIOSElementHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_BIOSElementHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_BIOSElementHelper.findClass(cimClient, cimInstance);

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
            CIM_BIOSElementHelper.checkException(enumeration);
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
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_SystemBIOS
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMBIOS as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_ComputerSystem_CIM_SystemBIOSNames(WBEMClient cimClient)
            throws WbemsmtException {

        return getAssociated_CIM_ComputerSystem_CIM_SystemBIOSNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMBIOS, CIM_ComputerSystem.CIM_CLASS_NAME, null,
                null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_SystemBIOS
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMBIOS or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMBIOS as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_ComputerSystem_CIM_SystemBIOSNames(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_ComputerSystem_CIM_SystemBIOSNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMBIOS, resultClass, role, resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_SystemBIOS
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_ComputerSystem_CIM_SystemBIOSNames(
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
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMBIOS,
                    CIM_ComputerSystem.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_BIOSElementHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_BIOSElementHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_ComputerSystem.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_BIOSElementHelper.checkException(enumeration);
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
     * Get the list with CIM_SystemBIOS associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_SystemBIOS(WBEMClient cimClient,
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMBIOS, role, includeQualifiers,
                    includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMBIOS, role, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_BIOSElementHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_BIOSElementHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_SystemBIOSHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_SystemBIOS(cimInstance));
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
                        result.add(new CIM_SystemBIOS(cimInstance));
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
                        result.add(new CIM_SystemBIOS(cimInstance));
                        continue;
                    }
                }
            }
            CIM_BIOSElementHelper.checkException(enumeration);
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
     * Get a list of CIMObjectPath items of the associations CIM_SystemBIOS
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_SystemBIOS(WBEMClient cimClient, String role,
            boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMBIOS, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMBIOS, role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_BIOSElementHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_BIOSElementHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_SystemBIOS.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_BIOSElementHelper.checkException(enumeration);
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
     * Get the list with CIM_Memory objects associated by the association CIM_BIOSLoadedInNV
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSLOADEDINNV as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_Memory_CIM_BIOSLoadedInNVs(WBEMClient cimClient)
            throws WbemsmtException {

        return getAssociated_CIM_Memory_CIM_BIOSLoadedInNVs(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSLOADEDINNV, CIM_Memory.CIM_CLASS_NAME, null,
                null, false, false, null);

    }

    /**
     * Get the list with CIM_Memory objects associated by the association CIM_BIOSLoadedInNV
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSLOADEDINNV or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSLOADEDINNV as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_Memory_CIM_BIOSLoadedInNVs(WBEMClient cimClient,
            String resultClass, String role, String resultRole) throws WbemsmtException {

        return getAssociated_CIM_Memory_CIM_BIOSLoadedInNVs(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSLOADEDINNV, resultClass, role, resultRole, false,
                false, null);

    }

    /**
     * Get the list with CIM_Memory objects associated by the association CIM_BIOSLoadedInNV
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSLOADEDINNV or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_Memory_CIM_BIOSLoadedInNVs(WBEMClient cimClient,
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
                CIM_BIOSElementHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_BIOSElementHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_BIOSElementHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_Memory(cimInstance));
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
                        result.add(new CIM_Memory(cimInstance));
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
                        result.add(new CIM_Memory(cimInstance));
                        continue;
                    }
                }
            }
            CIM_BIOSElementHelper.checkException(enumeration);
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
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_BIOSLoadedInNV
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSLOADEDINNV as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_Memory_CIM_BIOSLoadedInNVNames(WBEMClient cimClient)
            throws WbemsmtException {

        return getAssociated_CIM_Memory_CIM_BIOSLoadedInNVNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSLOADEDINNV, CIM_Memory.CIM_CLASS_NAME, null, null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_BIOSLoadedInNV
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSLOADEDINNV or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSLOADEDINNV as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_Memory_CIM_BIOSLoadedInNVNames(WBEMClient cimClient,
            String resultClass, String role, String resultRole) throws WbemsmtException {

        return getAssociated_CIM_Memory_CIM_BIOSLoadedInNVNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSLOADEDINNV, resultClass, role, resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_BIOSLoadedInNV
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_Memory_CIM_BIOSLoadedInNVNames(WBEMClient cimClient,
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
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSLOADEDINNV,
                    CIM_Memory.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_BIOSElementHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_BIOSElementHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_Memory.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_BIOSElementHelper.checkException(enumeration);
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
     * Get the list with CIM_BIOSLoadedInNV associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_BIOSLoadedInNV(WBEMClient cimClient,
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSLOADEDINNV, role, includeQualifiers,
                    includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSLOADEDINNV, role, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_BIOSElementHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_BIOSElementHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_BIOSLoadedInNVHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_BIOSLoadedInNV(cimInstance));
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
                        result.add(new CIM_BIOSLoadedInNV(cimInstance));
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
                        result.add(new CIM_BIOSLoadedInNV(cimInstance));
                        continue;
                    }
                }
            }
            CIM_BIOSElementHelper.checkException(enumeration);
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
     * Get a list of CIMObjectPath items of the associations CIM_BIOSLoadedInNV
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_BIOSLoadedInNV(WBEMClient cimClient, String role,
            boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSLOADEDINNV, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSLOADEDINNV, role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_BIOSElementHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_BIOSElementHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_BIOSLoadedInNV.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_BIOSElementHelper.checkException(enumeration);
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
        return CIM_BIOSElement.CIM_CLASS_NAME;
    }

}