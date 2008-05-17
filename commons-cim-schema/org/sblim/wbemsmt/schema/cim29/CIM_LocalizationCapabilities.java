/** 
 * CIM_LocalizationCapabilities.java
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
 * Description: Describes the input and output localization capabilities of the entity associated via ElementCapabilities.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_LocalizationCapabilities extends CIM_Capabilities {

    public final static String CIM_CLASS_NAME = "CIM_LocalizationCapabilities";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property SupportedInputLocales
     * This property, along with locale properties in (for example) a SettingData class, specifies the locale for data consumed by a ManagedElement. 
     * A locale indicates a particular geographical, political, or cultural region. The SupportedInputLocales property is an array of strings whose entries specify one or more languages that can be used in the formulation of information input by a client. It may be defined by the ManagedElement or client as an input parameter to a method, as a Setting or SettingData property, or via other mechanisms. 
     * 
     * The SupportedInputLocales property publishes an element's support of various locales for input data. The first array entry MUST define the default locale (the natural language associated with the ManagedElement). If the SupportedInputLocales property is empty, it is assumed that the default locale is en_US (English). 
     * Each array entry consists of three sub-strings, separated by underscores: 
     * - The first sub-string is the language code, as specified in ISO639. 
     * - The second sub-string is the country code, as specified in ISO3166. 
     * - The third sub-string is a variant, which is vendor specific. 
     * For example, US English appears as: "en_US_WIN", where the "WIN" variant would specify a Windows browser-specific collation (if one exists). Since the variant is not standardized, it is not commonly used and is generally limited to easily recognizable values ("WIN", "UNIX", "EURO", etc.) used in standard environments. 
     * The language and country codes are required; the variant may be empty.
     */
    public static class PROPERTY_SUPPORTEDINPUTLOCALES {
        /**
         * name of the property SupportedInputLocales
         */
        public final static String NAME = "SupportedInputLocales";

    }

    /**
     * Constants of property SupportedOutputLocales
     * This property, along with locale properties in (for example) a SettingData class, specifies the locale for data produced by a ManagedElement. 
     * A locale indicates a particular geographical, political, or cultural region. The SupportedOutputLocales property is an array of strings whose entries specify one or more languages that can be used in the formulation of information requested by and delivered to a client. It may be defined by the ManagedElement or client as an input parameter to a method, as a Setting or SettingData property, or via other mechanisms. Note that more than one locale may be specified in this array and later selected for output. If multiple locales are selected, information MUST be returned in each language specified, and indicated as supported by this Capabilities instance. 
     * 
     * The SupportedOutputLocales property publishes an element's support of various locales for output data. The first array entry MUST define the default locale (the natural language associated with the ManagedElement). If the SupportedOutputLocales property is empty, it is assumed that the default locale is en_US (English). 
     * Each array entry consists of three sub-strings, separated by underscores: 
     * - The first sub-string is the language code, as specified in ISO639. 
     * - The second sub-string is the country code, as specified in ISO3166. 
     * - The third sub-string is a variant, which is vendor specific. 
     * For example, US English appears as: "en_US_WIN", where the "WIN" variant would specify a Windows browser-specific collation (if one exists). Since the variant is not standardized, it is not commonly used and is generally limited to easily recognizable values ("WIN", "UNIX", "EURO", etc.) used in standard environments. 
     * The language and country codes are required; the variant may be empty.
     */
    public static class PROPERTY_SUPPORTEDOUTPUTLOCALES {
        /**
         * name of the property SupportedOutputLocales
         */
        public final static String NAME = "SupportedOutputLocales";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_Capabilities.getPackages();

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
     *   Describes the input and output localization capabilities of the entity associated via ElementCapabilities.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_LocalizationCapabilities(WBEMClient client, String namespace)
            throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   Describes the input and output localization capabilities of the entity associated via ElementCapabilities.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_LocalizationCapabilities(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_LocalizationCapabilities() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("SupportedInputLocales", new CIMProperty("SupportedInputLocales",
                CIMDataType.STRING_ARRAY_T, null));
        propertiesToCheck.put("SupportedOutputLocales", new CIMProperty("SupportedOutputLocales",
                CIMDataType.STRING_ARRAY_T, null));

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
     * Get the property SupportedInputLocales
     *     * <br>
     * This property, along with locale properties in (for example) a SettingData class, specifies the locale for data consumed by a ManagedElement. 
     * A locale indicates a particular geographical, political, or cultural region. The SupportedInputLocales property is an array of strings whose entries specify one or more languages that can be used in the formulation of information input by a client. It may be defined by the ManagedElement or client as an input parameter to a method, as a Setting or SettingData property, or via other mechanisms. 
     * 
     * The SupportedInputLocales property publishes an element's support of various locales for input data. The first array entry MUST define the default locale (the natural language associated with the ManagedElement). If the SupportedInputLocales property is empty, it is assumed that the default locale is en_US (English). 
     * Each array entry consists of three sub-strings, separated by underscores: 
     * - The first sub-string is the language code, as specified in ISO639. 
     * - The second sub-string is the country code, as specified in ISO3166. 
     * - The third sub-string is a variant, which is vendor specific. 
     * For example, US English appears as: "en_US_WIN", where the "WIN" variant would specify a Windows browser-specific collation (if one exists). Since the variant is not standardized, it is not commonly used and is generally limited to easily recognizable values ("WIN", "UNIX", "EURO", etc.) used in standard environments. 
     * The language and country codes are required; the variant may be empty.
     *     */

    public String[] get_SupportedInputLocales() {
        CIMProperty currentProperty = getProperty(PROPERTY_SUPPORTEDINPUTLOCALES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SUPPORTEDINPUTLOCALES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String[]) currentProperty.getValue();

    }

    /**
     * Set the property SupportedInputLocales
     * <br>
     * This property, along with locale properties in (for example) a SettingData class, specifies the locale for data consumed by a ManagedElement. 
     * A locale indicates a particular geographical, political, or cultural region. The SupportedInputLocales property is an array of strings whose entries specify one or more languages that can be used in the formulation of information input by a client. It may be defined by the ManagedElement or client as an input parameter to a method, as a Setting or SettingData property, or via other mechanisms. 
     * 
     * The SupportedInputLocales property publishes an element's support of various locales for input data. The first array entry MUST define the default locale (the natural language associated with the ManagedElement). If the SupportedInputLocales property is empty, it is assumed that the default locale is en_US (English). 
     * Each array entry consists of three sub-strings, separated by underscores: 
     * - The first sub-string is the language code, as specified in ISO639. 
     * - The second sub-string is the country code, as specified in ISO3166. 
     * - The third sub-string is a variant, which is vendor specific. 
     * For example, US English appears as: "en_US_WIN", where the "WIN" variant would specify a Windows browser-specific collation (if one exists). Since the variant is not standardized, it is not commonly used and is generally limited to easily recognizable values ("WIN", "UNIX", "EURO", etc.) used in standard environments. 
     * The language and country codes are required; the variant may be empty.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_SupportedInputLocales(String[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SUPPORTEDINPUTLOCALES.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_SupportedInputLocales(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SUPPORTEDINPUTLOCALES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SupportedInputLocales by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SupportedInputLocales(WBEMClient client, String namespace,
            String[] newValue) throws WbemsmtException {
        CIM_LocalizationCapabilities fco = new CIM_LocalizationCapabilities(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SUPPORTEDINPUTLOCALES.NAME);
        if (property != null) {
            property = setPropertyValue_SupportedInputLocales(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SUPPORTEDINPUTLOCALES.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SupportedInputLocales
     * <br>
     * This property, along with locale properties in (for example) a SettingData class, specifies the locale for data consumed by a ManagedElement. 
     * A locale indicates a particular geographical, political, or cultural region. The SupportedInputLocales property is an array of strings whose entries specify one or more languages that can be used in the formulation of information input by a client. It may be defined by the ManagedElement or client as an input parameter to a method, as a Setting or SettingData property, or via other mechanisms. 
     * 
     * The SupportedInputLocales property publishes an element's support of various locales for input data. The first array entry MUST define the default locale (the natural language associated with the ManagedElement). If the SupportedInputLocales property is empty, it is assumed that the default locale is en_US (English). 
     * Each array entry consists of three sub-strings, separated by underscores: 
     * - The first sub-string is the language code, as specified in ISO639. 
     * - The second sub-string is the country code, as specified in ISO3166. 
     * - The third sub-string is a variant, which is vendor specific. 
     * For example, US English appears as: "en_US_WIN", where the "WIN" variant would specify a Windows browser-specific collation (if one exists). Since the variant is not standardized, it is not commonly used and is generally limited to easily recognizable values ("WIN", "UNIX", "EURO", etc.) used in standard environments. 
     * The language and country codes are required; the variant may be empty.
     */

    private static CIMProperty setPropertyValue_SupportedInputLocales(CIMProperty currentProperty,
            String[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property SupportedOutputLocales
     *     * <br>
     * This property, along with locale properties in (for example) a SettingData class, specifies the locale for data produced by a ManagedElement. 
     * A locale indicates a particular geographical, political, or cultural region. The SupportedOutputLocales property is an array of strings whose entries specify one or more languages that can be used in the formulation of information requested by and delivered to a client. It may be defined by the ManagedElement or client as an input parameter to a method, as a Setting or SettingData property, or via other mechanisms. Note that more than one locale may be specified in this array and later selected for output. If multiple locales are selected, information MUST be returned in each language specified, and indicated as supported by this Capabilities instance. 
     * 
     * The SupportedOutputLocales property publishes an element's support of various locales for output data. The first array entry MUST define the default locale (the natural language associated with the ManagedElement). If the SupportedOutputLocales property is empty, it is assumed that the default locale is en_US (English). 
     * Each array entry consists of three sub-strings, separated by underscores: 
     * - The first sub-string is the language code, as specified in ISO639. 
     * - The second sub-string is the country code, as specified in ISO3166. 
     * - The third sub-string is a variant, which is vendor specific. 
     * For example, US English appears as: "en_US_WIN", where the "WIN" variant would specify a Windows browser-specific collation (if one exists). Since the variant is not standardized, it is not commonly used and is generally limited to easily recognizable values ("WIN", "UNIX", "EURO", etc.) used in standard environments. 
     * The language and country codes are required; the variant may be empty.
     *     */

    public String[] get_SupportedOutputLocales() {
        CIMProperty currentProperty = getProperty(PROPERTY_SUPPORTEDOUTPUTLOCALES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SUPPORTEDOUTPUTLOCALES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String[]) currentProperty.getValue();

    }

    /**
     * Set the property SupportedOutputLocales
     * <br>
     * This property, along with locale properties in (for example) a SettingData class, specifies the locale for data produced by a ManagedElement. 
     * A locale indicates a particular geographical, political, or cultural region. The SupportedOutputLocales property is an array of strings whose entries specify one or more languages that can be used in the formulation of information requested by and delivered to a client. It may be defined by the ManagedElement or client as an input parameter to a method, as a Setting or SettingData property, or via other mechanisms. Note that more than one locale may be specified in this array and later selected for output. If multiple locales are selected, information MUST be returned in each language specified, and indicated as supported by this Capabilities instance. 
     * 
     * The SupportedOutputLocales property publishes an element's support of various locales for output data. The first array entry MUST define the default locale (the natural language associated with the ManagedElement). If the SupportedOutputLocales property is empty, it is assumed that the default locale is en_US (English). 
     * Each array entry consists of three sub-strings, separated by underscores: 
     * - The first sub-string is the language code, as specified in ISO639. 
     * - The second sub-string is the country code, as specified in ISO3166. 
     * - The third sub-string is a variant, which is vendor specific. 
     * For example, US English appears as: "en_US_WIN", where the "WIN" variant would specify a Windows browser-specific collation (if one exists). Since the variant is not standardized, it is not commonly used and is generally limited to easily recognizable values ("WIN", "UNIX", "EURO", etc.) used in standard environments. 
     * The language and country codes are required; the variant may be empty.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_SupportedOutputLocales(String[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SUPPORTEDOUTPUTLOCALES.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_SupportedOutputLocales(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SUPPORTEDOUTPUTLOCALES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SupportedOutputLocales by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SupportedOutputLocales(WBEMClient client, String namespace,
            String[] newValue) throws WbemsmtException {
        CIM_LocalizationCapabilities fco = new CIM_LocalizationCapabilities(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SUPPORTEDOUTPUTLOCALES.NAME);
        if (property != null) {
            property = setPropertyValue_SupportedOutputLocales(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SUPPORTEDOUTPUTLOCALES.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SupportedOutputLocales
     * <br>
     * This property, along with locale properties in (for example) a SettingData class, specifies the locale for data produced by a ManagedElement. 
     * A locale indicates a particular geographical, political, or cultural region. The SupportedOutputLocales property is an array of strings whose entries specify one or more languages that can be used in the formulation of information requested by and delivered to a client. It may be defined by the ManagedElement or client as an input parameter to a method, as a Setting or SettingData property, or via other mechanisms. Note that more than one locale may be specified in this array and later selected for output. If multiple locales are selected, information MUST be returned in each language specified, and indicated as supported by this Capabilities instance. 
     * 
     * The SupportedOutputLocales property publishes an element's support of various locales for output data. The first array entry MUST define the default locale (the natural language associated with the ManagedElement). If the SupportedOutputLocales property is empty, it is assumed that the default locale is en_US (English). 
     * Each array entry consists of three sub-strings, separated by underscores: 
     * - The first sub-string is the language code, as specified in ISO639. 
     * - The second sub-string is the country code, as specified in ISO3166. 
     * - The third sub-string is a variant, which is vendor specific. 
     * For example, US English appears as: "en_US_WIN", where the "WIN" variant would specify a Windows browser-specific collation (if one exists). Since the variant is not standardized, it is not commonly used and is generally limited to easily recognizable values ("WIN", "UNIX", "EURO", etc.) used in standard environments. 
     * The language and country codes are required; the variant may be empty.
     */

    private static CIMProperty setPropertyValue_SupportedOutputLocales(CIMProperty currentProperty,
            String[] newValue) {
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
        return CIM_LocalizationCapabilities.CIM_CLASS_NAME;
    }

}