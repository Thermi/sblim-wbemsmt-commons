/** 
 * CIM_AffectedJobElement.java
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
 * Description: AffectedJobElement represents an association between a Job and the ManagedElement(s) that may be affected by its execution. It may not be feasible for the Job to describe all of the affected elements. The main purpose of this association is to provide information when a Job requires exclusive use of the 'affected' ManagedElment(s) or when describing that side effects may result.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_AffectedJobElement extends org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco {

    public final static String CIM_CLASS_NAME = "CIM_AffectedJobElement";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property ElementEffects
     * An enumeration describing the 'effect' on the ManagedElement. This array corresponds to the OtherElementEffectsDescriptions array, where the latter provides details related to the high-level 'effects' enumerated by this property. Additional detail is required if the ElementEffects array contains the value 1, "Other".
     */
    public static class PROPERTY_ELEMENTEFFECTS {
        /**
         * name of the property ElementEffects
         */
        public final static String NAME = "ElementEffects";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Exclusive_Use = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Exclusive Use (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Exclusive_Use = "Exclusive Use";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Performance_Impact = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Performance Impact (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Performance_Impact = "Performance Impact";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Element_Integrity = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Element Integrity (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Element_Integrity = "Element Integrity";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@7c107c10
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Exclusive_Use.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Exclusive_Use;
            }

            if (VALUE_ENTRY_Performance_Impact.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Performance_Impact;
            }

            if (VALUE_ENTRY_Element_Integrity.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Element_Integrity;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Exclusive_Use.intValue()) {
                return VALUE_ENTRY_Exclusive_Use;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Performance_Impact.intValue()) {
                return VALUE_ENTRY_Performance_Impact;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Element_Integrity.intValue()) {
                return VALUE_ENTRY_Element_Integrity;
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
         * Value Map for the property ElementEffects   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Exclusive_Use,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Performance_Impact,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Element_Integrity };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property ElementEffects   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_Exclusive_Use, VALUE_ENTRY_Performance_Impact,
                VALUE_ENTRY_Element_Integrity };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property ElementEffects   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_Exclusive_Use, VALUE_ENTRY_Performance_Impact,
                VALUE_ENTRY_Element_Integrity };

    }

    /**
     * Constants of property OtherElementEffectsDescriptions
     * Provides details for the 'effect' at the corresponding array position in ElementEffects. This information is required whenever ElementEffects contains the value 1 ("Other").
     */
    public static class PROPERTY_OTHERELEMENTEFFECTSDESCRIPTIONS {
        /**
         * name of the property OtherElementEffectsDescriptions
         */
        public final static String NAME = "OtherElementEffectsDescriptions";

    }

    /**
     * Constants of property AffectedElement
     * 
     */
    public static class PROPERTY_AFFECTEDELEMENT_CIM_MANAGEDELEMENT {
        /**
         * name of the property AffectedElement
         */
        public final static String NAME = "AffectedElement";

    }

    /**
     * Constants of property AffectingElement
     * 
     */
    public static class PROPERTY_AFFECTINGELEMENT_CIM_JOB {
        /**
         * name of the property AffectingElement
         */
        public final static String NAME = "AffectingElement";

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
     *   AffectedJobElement represents an association between a Job and the ManagedElement(s) that may be affected by its execution. It may not be feasible for the Job to describe all of the affected elements. The main purpose of this association is to provide information when a Job requires exclusive use of the 'affected' ManagedElment(s) or when describing that side effects may result.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_AffectedJobElement(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   AffectedJobElement represents an association between a Job and the ManagedElement(s) that may be affected by its execution. It may not be feasible for the Job to describe all of the affected elements. The main purpose of this association is to provide information when a Job requires exclusive use of the 'affected' ManagedElment(s) or when describing that side effects may result.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_AffectedJobElement(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_AffectedJobElement() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("ElementEffects", new CIMProperty("ElementEffects",
                CIMDataType.UINT16_ARRAY_T, null));
        propertiesToCheck.put("OtherElementEffectsDescriptions", new CIMProperty(
                "OtherElementEffectsDescriptions", CIMDataType.STRING_ARRAY_T, null));
        propertiesToCheck.put("AffectedElement", new CIMProperty("AffectedElement",
                new CIMDataType(CIM_ManagedElement.CIM_CLASS_NAME), null));
        propertiesToCheck.put("AffectingElement", new CIMProperty("AffectingElement",
                new CIMDataType(CIM_Job.CIM_CLASS_NAME), null));

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
     * Get the property ElementEffects
     *     * <br>
     * An enumeration describing the 'effect' on the ManagedElement. This array corresponds to the OtherElementEffectsDescriptions array, where the latter provides details related to the high-level 'effects' enumerated by this property. Additional detail is required if the ElementEffects array contains the value 1, "Other".
     *     */

    public javax.cim.UnsignedInteger16[] get_ElementEffects() {
        CIMProperty currentProperty = getProperty(PROPERTY_ELEMENTEFFECTS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ELEMENTEFFECTS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16[]) currentProperty.getValue();

    }

    /**
     * Set the property ElementEffects
     * <br>
     * An enumeration describing the 'effect' on the ManagedElement. This array corresponds to the OtherElementEffectsDescriptions array, where the latter provides details related to the high-level 'effects' enumerated by this property. Additional detail is required if the ElementEffects array contains the value 1, "Other".
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ElementEffects(javax.cim.UnsignedInteger16[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ELEMENTEFFECTS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ElementEffects(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ELEMENTEFFECTS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ElementEffects by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ElementEffects(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16[] newValue) throws WbemsmtException {
        CIM_AffectedJobElement fco = new CIM_AffectedJobElement(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ELEMENTEFFECTS.NAME);
        if (property != null) {
            property = setPropertyValue_ElementEffects(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ELEMENTEFFECTS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ElementEffects
     * <br>
     * An enumeration describing the 'effect' on the ManagedElement. This array corresponds to the OtherElementEffectsDescriptions array, where the latter provides details related to the high-level 'effects' enumerated by this property. Additional detail is required if the ElementEffects array contains the value 1, "Other".
     */

    private static CIMProperty setPropertyValue_ElementEffects(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OtherElementEffectsDescriptions
     *     * <br>
     * Provides details for the 'effect' at the corresponding array position in ElementEffects. This information is required whenever ElementEffects contains the value 1 ("Other").
     *     */

    public String[] get_OtherElementEffectsDescriptions() {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERELEMENTEFFECTSDESCRIPTIONS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OTHERELEMENTEFFECTSDESCRIPTIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String[]) currentProperty.getValue();

    }

    /**
     * Set the property OtherElementEffectsDescriptions
     * <br>
     * Provides details for the 'effect' at the corresponding array position in ElementEffects. This information is required whenever ElementEffects contains the value 1 ("Other").
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OtherElementEffectsDescriptions(String[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERELEMENTEFFECTSDESCRIPTIONS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_OtherElementEffectsDescriptions(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERELEMENTEFFECTSDESCRIPTIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OtherElementEffectsDescriptions by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherElementEffectsDescriptions(WBEMClient client,
            String namespace, String[] newValue) throws WbemsmtException {
        CIM_AffectedJobElement fco = new CIM_AffectedJobElement(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OTHERELEMENTEFFECTSDESCRIPTIONS.NAME);
        if (property != null) {
            property = setPropertyValue_OtherElementEffectsDescriptions(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERELEMENTEFFECTSDESCRIPTIONS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OtherElementEffectsDescriptions
     * <br>
     * Provides details for the 'effect' at the corresponding array position in ElementEffects. This information is required whenever ElementEffects contains the value 1 ("Other").
     */

    private static CIMProperty setPropertyValue_OtherElementEffectsDescriptions(
            CIMProperty currentProperty, String[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property AffectedElement
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_ManagedElement get_AffectedElement_CIM_ManagedElement(
            javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_AFFECTEDELEMENT_CIM_MANAGEDELEMENT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_AFFECTEDELEMENT_CIM_MANAGEDELEMENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_ManagedElementHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property AffectedElement
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_AffectedElement_CIM_ManagedElement(CIM_ManagedElement newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_AFFECTEDELEMENT_CIM_MANAGEDELEMENT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_AffectedElement_CIM_ManagedElement(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_AFFECTEDELEMENT_CIM_MANAGEDELEMENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property AffectedElement by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_AffectedElement_CIM_ManagedElement(WBEMClient client,
            String namespace, CIM_ManagedElement newValue) throws WbemsmtException {
        CIM_AffectedJobElement fco = new CIM_AffectedJobElement(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_AFFECTEDELEMENT_CIM_MANAGEDELEMENT.NAME);
        if (property != null) {
            property = setPropertyValue_AffectedElement_CIM_ManagedElement(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_AFFECTEDELEMENT_CIM_MANAGEDELEMENT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property AffectedElement
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_AffectedElement_CIM_ManagedElement(
            CIMProperty currentProperty, CIM_ManagedElement newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getCimObjectPath() : null;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property AffectingElement
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_Job get_AffectingElement_CIM_Job(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_AFFECTINGELEMENT_CIM_JOB.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_AFFECTINGELEMENT_CIM_JOB.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_JobHelper.getInstance(client, (CIMObjectPath) currentProperty.getValue());

    }

    /**
     * Set the property AffectingElement
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_AffectingElement_CIM_Job(CIM_Job newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_AFFECTINGELEMENT_CIM_JOB.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_AffectingElement_CIM_Job(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_AFFECTINGELEMENT_CIM_JOB.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property AffectingElement by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_AffectingElement_CIM_Job(WBEMClient client, String namespace,
            CIM_Job newValue) throws WbemsmtException {
        CIM_AffectedJobElement fco = new CIM_AffectedJobElement(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_AFFECTINGELEMENT_CIM_JOB.NAME);
        if (property != null) {
            property = setPropertyValue_AffectingElement_CIM_Job(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_AFFECTINGELEMENT_CIM_JOB.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property AffectingElement
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_AffectingElement_CIM_Job(
            CIMProperty currentProperty, CIM_Job newValue) {
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
        if (!(object instanceof CIM_AffectedJobElement)) {
            return false;
        }

        return super.equals(object);
    }

    /**
     * return the name of the CIMClass
     * @return
     */
    public String getObjectName() {
        return CIM_AffectedJobElement.CIM_CLASS_NAME;
    }

}