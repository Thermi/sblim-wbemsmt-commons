/** 
 * CIM_ApplicationSystemDirectory.java
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
 * Description: CIM_ApplicationSystemDirectory is an association used to establish a relationship between an ApplicationSystem and the Directories that it uses. This is used to identify the single root installation directory for an ApplicationSystem, as well as the logical purpose of other directories utilized by the ApplicationSystem. Note: This class is intended to be a subclass of CIM_Dependency but the current specification prohibits the extension of parent keys in a subclass. This will be revisited when the specification changes to make the intended inheritance possible.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_ApplicationSystemDirectory extends org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco {

    public final static String CIM_CLASS_NAME = "CIM_ApplicationSystemDirectory";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property ApplicationDirectoryUses
     * ApplicationDirectoryUse is an enumerated array which indicates the purpose(s) of the associated directory within the context of the ApplicationSystem. A value of "Root" indicates that the associated directory is the one and only root directory for the ApplicationSystem. This would typically be the directory path in which the application is installed. For applications which are installed in multiple directories, this would represent the directory from which initial program and configuration files are loaded. A value of "Program" indicates that the directory contains supplemental program files used by the ApplicationSystem. A value of "Data" indicates that the directory is used for data storage. A value of "Log" indicates that the directory is used to contain log files for the ApplicationSystem. It is considered invalid for multiple associations from the same ApplicationSystem to have a value of "Root". The "Unknown" state is expected to be short-lived and would typically be seen only in the installation phase of an ApplicationSystem, if at all. A value of "Temp" indicates that the associated directory is used to contain temporary files created by the ApplicationSystem. The "Other" state should only be used in cases where none of the designated values are appropriate. This is intended to enable use of the model for unanticipated purposes and would usually signal a need to extend this enumeration through the standards process.
     */
    public static class PROPERTY_APPLICATIONDIRECTORYUSES {
        /**
         * name of the property ApplicationDirectoryUses
         */
        public final static String NAME = "ApplicationDirectoryUses";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry Other (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_Other = "Other";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Root = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Root (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Root = "Root";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Program = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Program (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Program = "Program";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Data = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Data (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Data = "Data";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Log = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry Log (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Log = "Log";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Temp = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry Temp (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Temp = "Temp";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@1b261b26
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Root.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Root;
            }

            if (VALUE_ENTRY_Program.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Program;
            }

            if (VALUE_ENTRY_Data.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Data;
            }

            if (VALUE_ENTRY_Log.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Log;
            }

            if (VALUE_ENTRY_Temp.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Temp;
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

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other.intValue()) {
                return VALUE_ENTRY_Other;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Root.intValue()) {
                return VALUE_ENTRY_Root;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Program.intValue()) {
                return VALUE_ENTRY_Program;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Data.intValue()) {
                return VALUE_ENTRY_Data;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Log.intValue()) {
                return VALUE_ENTRY_Log;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Temp.intValue()) {
                return VALUE_ENTRY_Temp;
            }
            return null;

        }

        /**
         * get the ValueEntries of the given valueMapEntries
         * @param values the values to find the ValueMapEntries for
         * @return the array with ValueMap entries. Some of them may be null to if no valueMap entry was found
         */

        public static javax.cim.UnsignedInteger16[] getValueMapEntries(String[] values) {
            javax.cim.UnsignedInteger16[] result = new javax.cim.UnsignedInteger16[values.length];

            for (int i = 0; i < result.length; i++) {
                result[i] = getValueMapEntry(values[i]);
            }

            return result;
        }

        /**
         * get the ValueMapEntries of the given valueEntries
         * @param valueMapEntries the valueMap entries to find the Values for
         * @return the array with Value entries. Some of them may be null to if no value entry was found
         */

        public static String[] getValueEntries(javax.cim.UnsignedInteger16[] values) {
            String[] result = new String[values.length];

            for (int i = 0; i < result.length; i++) {
                result[i] = getValueEntry(values[i]);
            }

            return result;
        }

        /**
         * ValueMap entries
         * Contains no entries that having an integer value range representation
         * 
         * The couterpart for the value entries is returned by VALUE_ENTRIES_FOR_DISPLAY
         *
         * @see \#VALUE_ENTRIES_FOR_DISPLAY
         * 
         * Value Map for the property ApplicationDirectoryUses   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Root, VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Program,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Data, VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Log,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Temp };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property ApplicationDirectoryUses   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_Root, VALUE_ENTRY_Program, VALUE_ENTRY_Data, VALUE_ENTRY_Log,
                VALUE_ENTRY_Temp };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property ApplicationDirectoryUses   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_Root, VALUE_ENTRY_Program, VALUE_ENTRY_Data,
                VALUE_ENTRY_Log, VALUE_ENTRY_Temp };

    }

    /**
     * Constants of property Name
     * Name is a string representing a meaningful identifier for referring to the associated Directory in the context of the ApplicationSystem. As an example, this might be the name of the environment variable used to hold the same directory information.
     */
    public static class PROPERTY_NAME {
        /**
         * name of the property Name
         */
        public final static String NAME = "Name";

    }

    /**
     * Constants of property OtherUseDescriptions
     * A string describing how the ApplicationSystem utilizes the associated directory when the corresponding entry in ApplicationDirectoryUses is set to 1, "Other". This attribute is meaningless and should be null when the corresponding entry in ApplicationDirectoryUses is set to any value other than 1.
     */
    public static class PROPERTY_OTHERUSEDESCRIPTIONS {
        /**
         * name of the property OtherUseDescriptions
         */
        public final static String NAME = "OtherUseDescriptions";

    }

    /**
     * Constants of property Antecedent
     * 
     */
    public static class PROPERTY_ANTECEDENT_CIM_DIRECTORY {
        /**
         * name of the property Antecedent
         */
        public final static String NAME = "Antecedent";

    }

    /**
     * Constants of property Dependent
     * 
     */
    public static class PROPERTY_DEPENDENT_CIM_APPLICATIONSYSTEM {
        /**
         * name of the property Dependent
         */
        public final static String NAME = "Dependent";

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
     *   CIM_ApplicationSystemDirectory is an association used to establish a relationship between an ApplicationSystem and the Directories that it uses. This is used to identify the single root installation directory for an ApplicationSystem, as well as the logical purpose of other directories utilized by the ApplicationSystem. Note: This class is intended to be a subclass of CIM_Dependency but the current specification prohibits the extension of parent keys in a subclass. This will be revisited when the specification changes to make the intended inheritance possible.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_ApplicationSystemDirectory(WBEMClient client, String namespace)
            throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   CIM_ApplicationSystemDirectory is an association used to establish a relationship between an ApplicationSystem and the Directories that it uses. This is used to identify the single root installation directory for an ApplicationSystem, as well as the logical purpose of other directories utilized by the ApplicationSystem. Note: This class is intended to be a subclass of CIM_Dependency but the current specification prohibits the extension of parent keys in a subclass. This will be revisited when the specification changes to make the intended inheritance possible.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_ApplicationSystemDirectory(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_ApplicationSystemDirectory() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("ApplicationDirectoryUses", new CIMProperty(
                "ApplicationDirectoryUses", CIMDataType.UINT16_ARRAY_T, null));
        propertiesToCheck.put("Name", new CIMProperty("Name", CIMDataType.STRING_T, null));
        propertiesToCheck.put("OtherUseDescriptions", new CIMProperty("OtherUseDescriptions",
                CIMDataType.STRING_ARRAY_T, null));
        propertiesToCheck.put("Antecedent", new CIMProperty("Antecedent", new CIMDataType(
                CIM_Directory.CIM_CLASS_NAME), null));
        propertiesToCheck.put("Dependent", new CIMProperty("Dependent", new CIMDataType(
                CIM_ApplicationSystem.CIM_CLASS_NAME), null));

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
     * Get the property ApplicationDirectoryUses
     *     * <br>
     * ApplicationDirectoryUse is an enumerated array which indicates the purpose(s) of the associated directory within the context of the ApplicationSystem. A value of "Root" indicates that the associated directory is the one and only root directory for the ApplicationSystem. This would typically be the directory path in which the application is installed. For applications which are installed in multiple directories, this would represent the directory from which initial program and configuration files are loaded. A value of "Program" indicates that the directory contains supplemental program files used by the ApplicationSystem. A value of "Data" indicates that the directory is used for data storage. A value of "Log" indicates that the directory is used to contain log files for the ApplicationSystem. It is considered invalid for multiple associations from the same ApplicationSystem to have a value of "Root". The "Unknown" state is expected to be short-lived and would typically be seen only in the installation phase of an ApplicationSystem, if at all. A value of "Temp" indicates that the associated directory is used to contain temporary files created by the ApplicationSystem. The "Other" state should only be used in cases where none of the designated values are appropriate. This is intended to enable use of the model for unanticipated purposes and would usually signal a need to extend this enumeration through the standards process.
     *     */

    public javax.cim.UnsignedInteger16[] get_ApplicationDirectoryUses() {
        CIMProperty currentProperty = getProperty(PROPERTY_APPLICATIONDIRECTORYUSES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_APPLICATIONDIRECTORYUSES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16[]) currentProperty.getValue();

    }

    /**
     * Set the property ApplicationDirectoryUses
     * <br>
     * ApplicationDirectoryUse is an enumerated array which indicates the purpose(s) of the associated directory within the context of the ApplicationSystem. A value of "Root" indicates that the associated directory is the one and only root directory for the ApplicationSystem. This would typically be the directory path in which the application is installed. For applications which are installed in multiple directories, this would represent the directory from which initial program and configuration files are loaded. A value of "Program" indicates that the directory contains supplemental program files used by the ApplicationSystem. A value of "Data" indicates that the directory is used for data storage. A value of "Log" indicates that the directory is used to contain log files for the ApplicationSystem. It is considered invalid for multiple associations from the same ApplicationSystem to have a value of "Root". The "Unknown" state is expected to be short-lived and would typically be seen only in the installation phase of an ApplicationSystem, if at all. A value of "Temp" indicates that the associated directory is used to contain temporary files created by the ApplicationSystem. The "Other" state should only be used in cases where none of the designated values are appropriate. This is intended to enable use of the model for unanticipated purposes and would usually signal a need to extend this enumeration through the standards process.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ApplicationDirectoryUses(javax.cim.UnsignedInteger16[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_APPLICATIONDIRECTORYUSES.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ApplicationDirectoryUses(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_APPLICATIONDIRECTORYUSES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ApplicationDirectoryUses by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ApplicationDirectoryUses(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16[] newValue) throws WbemsmtException {
        CIM_ApplicationSystemDirectory fco = new CIM_ApplicationSystemDirectory(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_APPLICATIONDIRECTORYUSES.NAME);
        if (property != null) {
            property = setPropertyValue_ApplicationDirectoryUses(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_APPLICATIONDIRECTORYUSES.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ApplicationDirectoryUses
     * <br>
     * ApplicationDirectoryUse is an enumerated array which indicates the purpose(s) of the associated directory within the context of the ApplicationSystem. A value of "Root" indicates that the associated directory is the one and only root directory for the ApplicationSystem. This would typically be the directory path in which the application is installed. For applications which are installed in multiple directories, this would represent the directory from which initial program and configuration files are loaded. A value of "Program" indicates that the directory contains supplemental program files used by the ApplicationSystem. A value of "Data" indicates that the directory is used for data storage. A value of "Log" indicates that the directory is used to contain log files for the ApplicationSystem. It is considered invalid for multiple associations from the same ApplicationSystem to have a value of "Root". The "Unknown" state is expected to be short-lived and would typically be seen only in the installation phase of an ApplicationSystem, if at all. A value of "Temp" indicates that the associated directory is used to contain temporary files created by the ApplicationSystem. The "Other" state should only be used in cases where none of the designated values are appropriate. This is intended to enable use of the model for unanticipated purposes and would usually signal a need to extend this enumeration through the standards process.
     */

    private static CIMProperty setPropertyValue_ApplicationDirectoryUses(
            CIMProperty currentProperty, javax.cim.UnsignedInteger16[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Name
     *     * <br>
     * Name is a string representing a meaningful identifier for referring to the associated Directory in the context of the ApplicationSystem. As an example, this might be the name of the environment variable used to hold the same directory information.
     *     */

    public String get_key_Name() {
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
     * Name is a string representing a meaningful identifier for referring to the associated Directory in the context of the ApplicationSystem. As an example, this might be the name of the environment variable used to hold the same directory information.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_key_Name(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_NAME.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_key_Name(currentProperty, newValue);
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

    public static CIMProperty create_key_Name(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_ApplicationSystemDirectory fco = new CIM_ApplicationSystemDirectory(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_NAME.NAME);
        if (property != null) {
            property = setPropertyValue_key_Name(property, newValue);
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
     * Name is a string representing a meaningful identifier for referring to the associated Directory in the context of the ApplicationSystem. As an example, this might be the name of the environment variable used to hold the same directory information.
     */

    private static CIMProperty setPropertyValue_key_Name(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OtherUseDescriptions
     *     * <br>
     * A string describing how the ApplicationSystem utilizes the associated directory when the corresponding entry in ApplicationDirectoryUses is set to 1, "Other". This attribute is meaningless and should be null when the corresponding entry in ApplicationDirectoryUses is set to any value other than 1.
     *     */

    public String[] get_OtherUseDescriptions() {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERUSEDESCRIPTIONS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OTHERUSEDESCRIPTIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String[]) currentProperty.getValue();

    }

    /**
     * Set the property OtherUseDescriptions
     * <br>
     * A string describing how the ApplicationSystem utilizes the associated directory when the corresponding entry in ApplicationDirectoryUses is set to 1, "Other". This attribute is meaningless and should be null when the corresponding entry in ApplicationDirectoryUses is set to any value other than 1.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OtherUseDescriptions(String[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERUSEDESCRIPTIONS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_OtherUseDescriptions(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERUSEDESCRIPTIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OtherUseDescriptions by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherUseDescriptions(WBEMClient client, String namespace,
            String[] newValue) throws WbemsmtException {
        CIM_ApplicationSystemDirectory fco = new CIM_ApplicationSystemDirectory(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OTHERUSEDESCRIPTIONS.NAME);
        if (property != null) {
            property = setPropertyValue_OtherUseDescriptions(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERUSEDESCRIPTIONS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OtherUseDescriptions
     * <br>
     * A string describing how the ApplicationSystem utilizes the associated directory when the corresponding entry in ApplicationDirectoryUses is set to 1, "Other". This attribute is meaningless and should be null when the corresponding entry in ApplicationDirectoryUses is set to any value other than 1.
     */

    private static CIMProperty setPropertyValue_OtherUseDescriptions(CIMProperty currentProperty,
            String[] newValue) {
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

    public CIM_Directory get_Antecedent_CIM_Directory(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_ANTECEDENT_CIM_DIRECTORY.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ANTECEDENT_CIM_DIRECTORY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_DirectoryHelper.getInstance(client, (CIMObjectPath) currentProperty.getValue());

    }

    /**
     * Set the property Antecedent
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Antecedent_CIM_Directory(CIM_Directory newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ANTECEDENT_CIM_DIRECTORY.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Antecedent_CIM_Directory(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ANTECEDENT_CIM_DIRECTORY.NAME
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

    public static CIMProperty create_Antecedent_CIM_Directory(WBEMClient client, String namespace,
            CIM_Directory newValue) throws WbemsmtException {
        CIM_ApplicationSystemDirectory fco = new CIM_ApplicationSystemDirectory(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ANTECEDENT_CIM_DIRECTORY.NAME);
        if (property != null) {
            property = setPropertyValue_Antecedent_CIM_Directory(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ANTECEDENT_CIM_DIRECTORY.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Antecedent
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_Antecedent_CIM_Directory(
            CIMProperty currentProperty, CIM_Directory newValue) {
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

    public CIM_ApplicationSystem get_Dependent_CIM_ApplicationSystem(
            javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_DEPENDENT_CIM_APPLICATIONSYSTEM.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_DEPENDENT_CIM_APPLICATIONSYSTEM.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_ApplicationSystemHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property Dependent
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Dependent_CIM_ApplicationSystem(CIM_ApplicationSystem newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_DEPENDENT_CIM_APPLICATIONSYSTEM.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Dependent_CIM_ApplicationSystem(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_DEPENDENT_CIM_APPLICATIONSYSTEM.NAME
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

    public static CIMProperty create_Dependent_CIM_ApplicationSystem(WBEMClient client,
            String namespace, CIM_ApplicationSystem newValue) throws WbemsmtException {
        CIM_ApplicationSystemDirectory fco = new CIM_ApplicationSystemDirectory(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_DEPENDENT_CIM_APPLICATIONSYSTEM.NAME);
        if (property != null) {
            property = setPropertyValue_Dependent_CIM_ApplicationSystem(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_DEPENDENT_CIM_APPLICATIONSYSTEM.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Dependent
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_Dependent_CIM_ApplicationSystem(
            CIMProperty currentProperty, CIM_ApplicationSystem newValue) {
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
        if (!(object instanceof CIM_ApplicationSystemDirectory)) {
            return false;
        }

        return super.equals(object);
    }

    /**
     * return the name of the CIMClass
     * @return
     */
    public String getObjectName() {
        return CIM_ApplicationSystemDirectory.CIM_CLASS_NAME;
    }

}