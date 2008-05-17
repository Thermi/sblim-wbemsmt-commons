/** 
 * CIM_FileSystemSettingData.java
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
 * Description: This class allows a client to specify the desired persistence of a FileSystem. This information is tied to the FileSystem using the ElementSettingData association.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_FileSystemSettingData extends CIM_ScopedSettingData {

    public final static String CIM_CLASS_NAME = "CIM_FileSystemSettingData";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property OtherPersistenceType
     * A string describing the persistence characteristics when PersistenceType is "Other".
     */
    public static class PROPERTY_OTHERPERSISTENCETYPE {
        /**
         * name of the property OtherPersistenceType
         */
        public final static String NAME = "OtherPersistenceType";

    }

    /**
     * Constants of property PersistenceType
     * An enumerated value representing the intended persistence characteristics of the FileSystem. A value of "Persistent" indicates that the FileSystem should be persistent, should be preserved through an orderly shutdown and should be protected. A value of "Temporary" indicates that the FileSystem should be non-persistent, should not be protected and may not survive a shutdown. A value of "External" indicates that the FileSystem should be controlled outside of the operating environment and may need to be protected by specialized means. A value of "Other" is provided to allow for additional persistence types, to be described in the OtherPersistenceType attribute, and is expected to be rarely, if ever, used.
     */
    public static class PROPERTY_PERSISTENCETYPE {
        /**
         * name of the property PersistenceType
         */
        public final static String NAME = "PersistenceType";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Persistent = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Persistent (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Persistent = "Persistent";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Temporary = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Temporary (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Temporary = "Temporary";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_External = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry External (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_External = "External";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@eb80eb8
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Persistent.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Persistent;
            }

            if (VALUE_ENTRY_Temporary.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Temporary;
            }

            if (VALUE_ENTRY_External.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_External;
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

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other.intValue()) {
                return VALUE_ENTRY_Other;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Persistent.intValue()) {
                return VALUE_ENTRY_Persistent;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Temporary.intValue()) {
                return VALUE_ENTRY_Temporary;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_External.intValue()) {
                return VALUE_ENTRY_External;
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
         * Value Map for the property PersistenceType   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Persistent,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Temporary,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_External };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property PersistenceType   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Other, VALUE_ENTRY_Persistent,
                VALUE_ENTRY_Temporary, VALUE_ENTRY_External };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property PersistenceType   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Other,
                VALUE_ENTRY_Persistent, VALUE_ENTRY_Temporary, VALUE_ENTRY_External };

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_ScopedSettingData.getPackages();

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
     *   This class allows a client to specify the desired persistence of a FileSystem. This information is tied to the FileSystem using the ElementSettingData association.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_FileSystemSettingData(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   This class allows a client to specify the desired persistence of a FileSystem. This information is tied to the FileSystem using the ElementSettingData association.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_FileSystemSettingData(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_FileSystemSettingData() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("OtherPersistenceType", new CIMProperty("OtherPersistenceType",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("PersistenceType", new CIMProperty("PersistenceType",
                CIMDataType.UINT16_T, null));

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
     * Get the property OtherPersistenceType
     *     * <br>
     * A string describing the persistence characteristics when PersistenceType is "Other".
     *     */

    public String get_OtherPersistenceType() {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERPERSISTENCETYPE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OTHERPERSISTENCETYPE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property OtherPersistenceType
     * <br>
     * A string describing the persistence characteristics when PersistenceType is "Other".
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OtherPersistenceType(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERPERSISTENCETYPE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_OtherPersistenceType(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERPERSISTENCETYPE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OtherPersistenceType by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherPersistenceType(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_FileSystemSettingData fco = new CIM_FileSystemSettingData(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OTHERPERSISTENCETYPE.NAME);
        if (property != null) {
            property = setPropertyValue_OtherPersistenceType(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERPERSISTENCETYPE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OtherPersistenceType
     * <br>
     * A string describing the persistence characteristics when PersistenceType is "Other".
     */

    private static CIMProperty setPropertyValue_OtherPersistenceType(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PersistenceType
     *     * <br>
     * An enumerated value representing the intended persistence characteristics of the FileSystem. A value of "Persistent" indicates that the FileSystem should be persistent, should be preserved through an orderly shutdown and should be protected. A value of "Temporary" indicates that the FileSystem should be non-persistent, should not be protected and may not survive a shutdown. A value of "External" indicates that the FileSystem should be controlled outside of the operating environment and may need to be protected by specialized means. A value of "Other" is provided to allow for additional persistence types, to be described in the OtherPersistenceType attribute, and is expected to be rarely, if ever, used.
     *     */

    public javax.cim.UnsignedInteger16 get_PersistenceType() {
        CIMProperty currentProperty = getProperty(PROPERTY_PERSISTENCETYPE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PERSISTENCETYPE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property PersistenceType
     * <br>
     * An enumerated value representing the intended persistence characteristics of the FileSystem. A value of "Persistent" indicates that the FileSystem should be persistent, should be preserved through an orderly shutdown and should be protected. A value of "Temporary" indicates that the FileSystem should be non-persistent, should not be protected and may not survive a shutdown. A value of "External" indicates that the FileSystem should be controlled outside of the operating environment and may need to be protected by specialized means. A value of "Other" is provided to allow for additional persistence types, to be described in the OtherPersistenceType attribute, and is expected to be rarely, if ever, used.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PersistenceType(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PERSISTENCETYPE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_PersistenceType(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PERSISTENCETYPE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PersistenceType by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PersistenceType(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_FileSystemSettingData fco = new CIM_FileSystemSettingData(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PERSISTENCETYPE.NAME);
        if (property != null) {
            property = setPropertyValue_PersistenceType(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PERSISTENCETYPE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PersistenceType
     * <br>
     * An enumerated value representing the intended persistence characteristics of the FileSystem. A value of "Persistent" indicates that the FileSystem should be persistent, should be preserved through an orderly shutdown and should be protected. A value of "Temporary" indicates that the FileSystem should be non-persistent, should not be protected and may not survive a shutdown. A value of "External" indicates that the FileSystem should be controlled outside of the operating environment and may need to be protected by specialized means. A value of "Other" is provided to allow for additional persistence types, to be described in the OtherPersistenceType attribute, and is expected to be rarely, if ever, used.
     */

    private static CIMProperty setPropertyValue_PersistenceType(CIMProperty currentProperty,
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
        return CIM_FileSystemSettingData.CIM_CLASS_NAME;
    }

}