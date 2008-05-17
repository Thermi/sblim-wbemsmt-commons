/** 
 * CIM_JobSettingData.java
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
 * Description: JobSettingData represents job characteristics and scheduling information for a CIM_Job. The settings may be applied to a job handling Service, a JobQueue or other destination to which jobs are submitted, and/or to individual CIM_Jobs. The applicability of the settings are defined using the ElementSettingData relationship. Since the Settings may be defined in several contexts and applied to many types of elements, this class is defined as a subclass of SettingData, versus ScopedSettingData.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_JobSettingData extends CIM_SettingData {

    public final static String CIM_CLASS_NAME = "CIM_JobSettingData";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property DeleteOnCompletion
     * Indicates whether or not the Job should be automatically deleted upon completion. Note that the 'completion' of a recurring job is defined by its JobRunTimes or UntilTime properties, OR when the Job is terminated by manual intervention.
     */
    public static class PROPERTY_DELETEONCOMPLETION {
        /**
         * name of the property DeleteOnCompletion
         */
        public final static String NAME = "DeleteOnCompletion";

    }

    /**
     * Constants of property OtherRecoveryAction
     * A string describing the recovery action when the instance's RecoveryAction property is 1 ("Other").
     */
    public static class PROPERTY_OTHERRECOVERYACTION {
        /**
         * name of the property OtherRecoveryAction
         */
        public final static String NAME = "OtherRecoveryAction";

    }

    /**
     * Constants of property RecoveryAction
     * Describes the recovery setting if the Job does not successfully complete. The possible values are: 
     * 0 = "Unknown", meaning it is unknown as to what recovery action to take 
     * 1 = "Other", indicating that the recovery action will be specified in the property, OtherRecoveryAction 
     * 2 = "Do Not Continue", meaning stop the execution of the job and appropriately update its status 
     * 3 = "Continue With Next Job", meaning continue with the next job in the queue 
     * 4 = "Re-run Job", indicating that the job should be re-run 
     * 5 = "Run Recovery Job", meaning run the Job associated using the RecoveryJob relationship. Note that the recovery Job MUST already be on the queue from which it will run.
     */
    public static class PROPERTY_RECOVERYACTION {
        /**
         * name of the property RecoveryAction
         */
        public final static String NAME = "RecoveryAction";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Do_Not_Continue = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Do Not Continue (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Do_Not_Continue = "Do Not Continue";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Continue_With_Next_Job = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Continue With Next Job (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Continue_With_Next_Job = "Continue With Next Job";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Re_run_Job = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Re-run Job (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Re_run_Job = "Re-run Job";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Run_Recovery_Job = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry Run Recovery Job (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Run_Recovery_Job = "Run Recovery Job";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@6bdc6bdc
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Do_Not_Continue.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Do_Not_Continue;
            }

            if (VALUE_ENTRY_Continue_With_Next_Job.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Continue_With_Next_Job;
            }

            if (VALUE_ENTRY_Re_run_Job.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Re_run_Job;
            }

            if (VALUE_ENTRY_Run_Recovery_Job.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Run_Recovery_Job;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Do_Not_Continue.intValue()) {
                return VALUE_ENTRY_Do_Not_Continue;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Continue_With_Next_Job.intValue()) {
                return VALUE_ENTRY_Continue_With_Next_Job;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Re_run_Job.intValue()) {
                return VALUE_ENTRY_Re_run_Job;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Run_Recovery_Job.intValue()) {
                return VALUE_ENTRY_Run_Recovery_Job;
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
         * Value Map for the property RecoveryAction   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Do_Not_Continue,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Continue_With_Next_Job,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Re_run_Job,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Run_Recovery_Job };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property RecoveryAction   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_Do_Not_Continue, VALUE_ENTRY_Continue_With_Next_Job,
                VALUE_ENTRY_Re_run_Job, VALUE_ENTRY_Run_Recovery_Job };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property RecoveryAction   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_Do_Not_Continue, VALUE_ENTRY_Continue_With_Next_Job,
                VALUE_ENTRY_Re_run_Job, VALUE_ENTRY_Run_Recovery_Job };

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_SettingData.getPackages();

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
     *   JobSettingData represents job characteristics and scheduling information for a CIM_Job. The settings may be applied to a job handling Service, a JobQueue or other destination to which jobs are submitted, and/or to individual CIM_Jobs. The applicability of the settings are defined using the ElementSettingData relationship. Since the Settings may be defined in several contexts and applied to many types of elements, this class is defined as a subclass of SettingData, versus ScopedSettingData.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_JobSettingData(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   JobSettingData represents job characteristics and scheduling information for a CIM_Job. The settings may be applied to a job handling Service, a JobQueue or other destination to which jobs are submitted, and/or to individual CIM_Jobs. The applicability of the settings are defined using the ElementSettingData relationship. Since the Settings may be defined in several contexts and applied to many types of elements, this class is defined as a subclass of SettingData, versus ScopedSettingData.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_JobSettingData(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_JobSettingData() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("DeleteOnCompletion", new CIMProperty("DeleteOnCompletion",
                CIMDataType.BOOLEAN_T, null));
        propertiesToCheck.put("OtherRecoveryAction", new CIMProperty("OtherRecoveryAction",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("RecoveryAction", new CIMProperty("RecoveryAction",
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
     * Get the property DeleteOnCompletion
     *     * <br>
     * Indicates whether or not the Job should be automatically deleted upon completion. Note that the 'completion' of a recurring job is defined by its JobRunTimes or UntilTime properties, OR when the Job is terminated by manual intervention.
     *     */

    public Boolean get_DeleteOnCompletion() {
        CIMProperty currentProperty = getProperty(PROPERTY_DELETEONCOMPLETION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_DELETEONCOMPLETION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property DeleteOnCompletion
     * <br>
     * Indicates whether or not the Job should be automatically deleted upon completion. Note that the 'completion' of a recurring job is defined by its JobRunTimes or UntilTime properties, OR when the Job is terminated by manual intervention.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_DeleteOnCompletion(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_DELETEONCOMPLETION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_DeleteOnCompletion(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_DELETEONCOMPLETION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property DeleteOnCompletion by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_DeleteOnCompletion(WBEMClient client, String namespace,
            Boolean newValue) throws WbemsmtException {
        CIM_JobSettingData fco = new CIM_JobSettingData(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_DELETEONCOMPLETION.NAME);
        if (property != null) {
            property = setPropertyValue_DeleteOnCompletion(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_DELETEONCOMPLETION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property DeleteOnCompletion
     * <br>
     * Indicates whether or not the Job should be automatically deleted upon completion. Note that the 'completion' of a recurring job is defined by its JobRunTimes or UntilTime properties, OR when the Job is terminated by manual intervention.
     */

    private static CIMProperty setPropertyValue_DeleteOnCompletion(CIMProperty currentProperty,
            Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OtherRecoveryAction
     *     * <br>
     * A string describing the recovery action when the instance's RecoveryAction property is 1 ("Other").
     *     */

    public String get_OtherRecoveryAction() {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERRECOVERYACTION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OTHERRECOVERYACTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property OtherRecoveryAction
     * <br>
     * A string describing the recovery action when the instance's RecoveryAction property is 1 ("Other").
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OtherRecoveryAction(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERRECOVERYACTION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_OtherRecoveryAction(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERRECOVERYACTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OtherRecoveryAction by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherRecoveryAction(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_JobSettingData fco = new CIM_JobSettingData(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OTHERRECOVERYACTION.NAME);
        if (property != null) {
            property = setPropertyValue_OtherRecoveryAction(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERRECOVERYACTION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OtherRecoveryAction
     * <br>
     * A string describing the recovery action when the instance's RecoveryAction property is 1 ("Other").
     */

    private static CIMProperty setPropertyValue_OtherRecoveryAction(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property RecoveryAction
     *     * <br>
     * Describes the recovery setting if the Job does not successfully complete. The possible values are: 
     * 0 = "Unknown", meaning it is unknown as to what recovery action to take 
     * 1 = "Other", indicating that the recovery action will be specified in the property, OtherRecoveryAction 
     * 2 = "Do Not Continue", meaning stop the execution of the job and appropriately update its status 
     * 3 = "Continue With Next Job", meaning continue with the next job in the queue 
     * 4 = "Re-run Job", indicating that the job should be re-run 
     * 5 = "Run Recovery Job", meaning run the Job associated using the RecoveryJob relationship. Note that the recovery Job MUST already be on the queue from which it will run.
     *     */

    public javax.cim.UnsignedInteger16 get_RecoveryAction() {
        CIMProperty currentProperty = getProperty(PROPERTY_RECOVERYACTION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_RECOVERYACTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property RecoveryAction
     * <br>
     * Describes the recovery setting if the Job does not successfully complete. The possible values are: 
     * 0 = "Unknown", meaning it is unknown as to what recovery action to take 
     * 1 = "Other", indicating that the recovery action will be specified in the property, OtherRecoveryAction 
     * 2 = "Do Not Continue", meaning stop the execution of the job and appropriately update its status 
     * 3 = "Continue With Next Job", meaning continue with the next job in the queue 
     * 4 = "Re-run Job", indicating that the job should be re-run 
     * 5 = "Run Recovery Job", meaning run the Job associated using the RecoveryJob relationship. Note that the recovery Job MUST already be on the queue from which it will run.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_RecoveryAction(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_RECOVERYACTION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_RecoveryAction(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_RECOVERYACTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property RecoveryAction by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_RecoveryAction(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_JobSettingData fco = new CIM_JobSettingData(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_RECOVERYACTION.NAME);
        if (property != null) {
            property = setPropertyValue_RecoveryAction(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_RECOVERYACTION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property RecoveryAction
     * <br>
     * Describes the recovery setting if the Job does not successfully complete. The possible values are: 
     * 0 = "Unknown", meaning it is unknown as to what recovery action to take 
     * 1 = "Other", indicating that the recovery action will be specified in the property, OtherRecoveryAction 
     * 2 = "Do Not Continue", meaning stop the execution of the job and appropriately update its status 
     * 3 = "Continue With Next Job", meaning continue with the next job in the queue 
     * 4 = "Re-run Job", indicating that the job should be re-run 
     * 5 = "Run Recovery Job", meaning run the Job associated using the RecoveryJob relationship. Note that the recovery Job MUST already be on the queue from which it will run.
     */

    private static CIMProperty setPropertyValue_RecoveryAction(CIMProperty currentProperty,
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
        return CIM_JobSettingData.CIM_CLASS_NAME;
    }

}