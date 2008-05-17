/** 
 * CIM_AlertIndication.java
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
 * Description: A concrete superclass for CIM Alert notifications. An AlertIndication is a specialized type of CIM_Indication that contains information about the severity, cause, recommended actions and other data of a real world event. This event and its data may or may not be modeled in the CIM class hierarchy.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_AlertIndication extends CIM_ProcessIndication {

    public final static String CIM_CLASS_NAME = "CIM_AlertIndication";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property AlertType
     * Primary classification of the Indication. The following values are defined: 
     * 1 - Other. The Indication's OtherAlertType property conveys its classification. Use of "Other" in an enumeration is a standard CIM convention. It means that the current Indication does not fit into the categories described by this enumeration. 
     * 2 - Communications Alert. An Indication of this type is principally associated with the procedures and/or processes required to convey information from one point to another. 
     * 3 - Quality of Service Alert. An Indication of this type is principally associated with a degradation or errors in the performance or function of an entity. 
     * 4 - Processing Error. An Indication of this type is principally associated with a software or processing fault. 
     * 5 - Device Alert. An Indication of this type is principally associated with an equipment or hardware fault. 
     * 6 - Environmental Alert. An Indication of this type is principally associated with a condition relating to an enclosure in which the hardware resides, or other environmental considerations. 
     * 7 - Model Change. The Indication addresses changes in the Information Model. For example, it may embed a Lifecycle Indication to convey the specific model change being alerted. 
     * 8 - Security Alert. An Indication of this type is associated with security violations, detection of viruses, and similar issues.
     */
    public static class PROPERTY_ALERTTYPE {
        /**
         * name of the property AlertType
         */
        public final static String NAME = "AlertType";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Communications_Alert = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Communications Alert (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Communications_Alert = "Communications Alert";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Quality_of_Service_Alert = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Quality of Service Alert (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Quality_of_Service_Alert = "Quality of Service Alert";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Processing_Error = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Processing Error (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Processing_Error = "Processing Error";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Device_Alert = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry Device Alert (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Device_Alert = "Device Alert";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Environmental_Alert = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry Environmental Alert (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Environmental_Alert = "Environmental Alert";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Model_Change = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry Model Change (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_Model_Change = "Model Change";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Security_Alert = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry Security Alert (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_Security_Alert = "Security Alert";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@1be21be2
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Communications_Alert.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Communications_Alert;
            }

            if (VALUE_ENTRY_Quality_of_Service_Alert.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Quality_of_Service_Alert;
            }

            if (VALUE_ENTRY_Processing_Error.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Processing_Error;
            }

            if (VALUE_ENTRY_Device_Alert.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Device_Alert;
            }

            if (VALUE_ENTRY_Environmental_Alert.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Environmental_Alert;
            }

            if (VALUE_ENTRY_Model_Change.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Model_Change;
            }

            if (VALUE_ENTRY_Security_Alert.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Security_Alert;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Communications_Alert.intValue()) {
                return VALUE_ENTRY_Communications_Alert;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Quality_of_Service_Alert.intValue()) {
                return VALUE_ENTRY_Quality_of_Service_Alert;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Processing_Error.intValue()) {
                return VALUE_ENTRY_Processing_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Device_Alert.intValue()) {
                return VALUE_ENTRY_Device_Alert;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Environmental_Alert.intValue()) {
                return VALUE_ENTRY_Environmental_Alert;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Model_Change.intValue()) {
                return VALUE_ENTRY_Model_Change;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Security_Alert.intValue()) {
                return VALUE_ENTRY_Security_Alert;
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
         * Value Map for the property AlertType   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Communications_Alert,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Quality_of_Service_Alert,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Processing_Error,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Device_Alert,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Environmental_Alert,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Model_Change,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Security_Alert };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property AlertType   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Other,
                VALUE_ENTRY_Communications_Alert, VALUE_ENTRY_Quality_of_Service_Alert,
                VALUE_ENTRY_Processing_Error, VALUE_ENTRY_Device_Alert,
                VALUE_ENTRY_Environmental_Alert, VALUE_ENTRY_Model_Change,
                VALUE_ENTRY_Security_Alert };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property AlertType   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Other,
                VALUE_ENTRY_Communications_Alert, VALUE_ENTRY_Quality_of_Service_Alert,
                VALUE_ENTRY_Processing_Error, VALUE_ENTRY_Device_Alert,
                VALUE_ENTRY_Environmental_Alert, VALUE_ENTRY_Model_Change,
                VALUE_ENTRY_Security_Alert };

    }

    /**
     * Constants of property AlertingElementFormat
     * The format of the AlertingManagedElement property is interpretable based upon the value of this property. Values are defined as: 
     * 0 - Unknown. The format is unknown or not meaningfully interpretable by a CIM client application. 
     * 1 - Other. The format is defined by the value of the OtherAlertingElementFormat property. 
     * 2 - CIMObjectPath. The format is a CIMObjectPath, with format <NamespacePath>:<ClassName>.<Prop1>="<Value1>", <Prop2>="<Value2>", . . . specifying an instance in the CIM Schema.
     */
    public static class PROPERTY_ALERTINGELEMENTFORMAT {
        /**
         * name of the property AlertingElementFormat
         */
        public final static String NAME = "AlertingElementFormat";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_CIMObjectPath = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry CIMObjectPath (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_CIMObjectPath = "CIMObjectPath";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@5160516
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_CIMObjectPath.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_CIMObjectPath;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_CIMObjectPath.intValue()) {
                return VALUE_ENTRY_CIMObjectPath;
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
         * Value Map for the property AlertingElementFormat   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_CIMObjectPath };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property AlertingElementFormat   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_CIMObjectPath };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property AlertingElementFormat   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_CIMObjectPath };

    }

    /**
     * Constants of property AlertingManagedElement
     * The identifying information of the entity (ie, the instance) for which this Indication is generated. The property contains the path of an instance, encoded as a string parameter - if the instance is modeled in the CIM Schema. If not a CIM instance, the property contains some identifying string that names the entity for which the Alert is generated. The path or identifying string is formatted per the AlertingElementFormat property.
     */
    public static class PROPERTY_ALERTINGMANAGEDELEMENT {
        /**
         * name of the property AlertingManagedElement
         */
        public final static String NAME = "AlertingManagedElement";

    }

    /**
     * Constants of property Description
     * A short description of the Indication.
     */
    public static class PROPERTY_DESCRIPTION {
        /**
         * name of the property Description
         */
        public final static String NAME = "Description";

    }

    /**
     * Constants of property EventID
     * An instrumentation or provider specific value that describes the underlying "real-world" event represented by the Indication. Two Indications with the same, non NULL EventID value are considered, by the creating entity, to represent the same event. The comparison of two EventID values is only defined for Alert Indications with identical, non NULL values of SystemCreateClassName, SystemName and ProviderName.
     */
    public static class PROPERTY_EVENTID {
        /**
         * name of the property EventID
         */
        public final static String NAME = "EventID";

    }

    /**
     * Constants of property EventTime
     * The time and date the underlying event was first detected. If specified, this property MUST be set to NULL if the creating entity is not capable of providing this information. This value is based on the notion of local date and time of the Managed System Element generating the Indication.
     */
    public static class PROPERTY_EVENTTIME {
        /**
         * name of the property EventTime
         */
        public final static String NAME = "EventTime";

    }

    /**
     * Constants of property OtherAlertType
     * A string describing the Alert type - used when the AlertType property is set to 1, "Other State Change".
     */
    public static class PROPERTY_OTHERALERTTYPE {
        /**
         * name of the property OtherAlertType
         */
        public final static String NAME = "OtherAlertType";

    }

    /**
     * Constants of property OtherAlertingElementFormat
     * A string defining "Other" values for AlertingElementFormat. This value MUST be set to a non NULL value when AlertingElementFormat is set to a value of 1 ("Other"). For all other values of AlertingElementFormat, the value of this string must be set to NULL.
     */
    public static class PROPERTY_OTHERALERTINGELEMENTFORMAT {
        /**
         * name of the property OtherAlertingElementFormat
         */
        public final static String NAME = "OtherAlertingElementFormat";

    }

    /**
     * Constants of property OtherSeverity
     * Holds the value of the user defined severity value when 'Severity' is 1 ("Other").
     */
    public static class PROPERTY_OTHERSEVERITY {
        /**
         * name of the property OtherSeverity
         */
        public final static String NAME = "OtherSeverity";

    }

    /**
     * Constants of property PerceivedSeverity
     * An enumerated value that describes the severity of the Alert Indication from the notifier's point of view: 
     * 1 - Other, by CIM convention, is used to indicate that the Severity's value can be found in the OtherSeverity property. 
     * 3 - Degraded/Warning should be used when its appropriate to let the user decide if action is needed. 
     * 4 - Minor should be used to indicate action is needed, but the situation is not serious at this time. 
     * 5 - Major should be used to indicate action is needed NOW. 
     * 6 - Critical should be used to indicate action is needed NOW and the scope is broad (perhaps an imminent outage to a critical resource will result). 
     * 7 - Fatal/NonRecoverable should be used to indicate an error occurred, but it's too late to take remedial action. 
     * 2 and 0 - Information and Unknown (respectively) follow common usage. Literally, the AlertIndication is purely informational or its severity is simply unknown.
     */
    public static class PROPERTY_PERCEIVEDSEVERITY {
        /**
         * name of the property PerceivedSeverity
         */
        public final static String NAME = "PerceivedSeverity";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Information = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Information (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Information = "Information";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Degraded_Warning = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Degraded/Warning (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Degraded_Warning = "Degraded/Warning";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Minor = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Minor (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Minor = "Minor";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Major = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry Major (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Major = "Major";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Critical = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry Critical (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Critical = "Critical";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Fatal_NonRecoverable = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry Fatal/NonRecoverable (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_Fatal_NonRecoverable = "Fatal/NonRecoverable";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@2b0e2b0e
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Information.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Information;
            }

            if (VALUE_ENTRY_Degraded_Warning.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Degraded_Warning;
            }

            if (VALUE_ENTRY_Minor.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Minor;
            }

            if (VALUE_ENTRY_Major.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Major;
            }

            if (VALUE_ENTRY_Critical.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Critical;
            }

            if (VALUE_ENTRY_Fatal_NonRecoverable.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Fatal_NonRecoverable;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Information.intValue()) {
                return VALUE_ENTRY_Information;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Degraded_Warning.intValue()) {
                return VALUE_ENTRY_Degraded_Warning;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Minor.intValue()) {
                return VALUE_ENTRY_Minor;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Major.intValue()) {
                return VALUE_ENTRY_Major;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Critical.intValue()) {
                return VALUE_ENTRY_Critical;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Fatal_NonRecoverable.intValue()) {
                return VALUE_ENTRY_Fatal_NonRecoverable;
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
         * Value Map for the property PerceivedSeverity   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Information,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Degraded_Warning,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Minor, VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Major,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Critical,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Fatal_NonRecoverable };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property PerceivedSeverity   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_Information, VALUE_ENTRY_Degraded_Warning, VALUE_ENTRY_Minor,
                VALUE_ENTRY_Major, VALUE_ENTRY_Critical, VALUE_ENTRY_Fatal_NonRecoverable };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property PerceivedSeverity   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_Information, VALUE_ENTRY_Degraded_Warning,
                VALUE_ENTRY_Minor, VALUE_ENTRY_Major, VALUE_ENTRY_Critical,
                VALUE_ENTRY_Fatal_NonRecoverable };

    }

    /**
     * Constants of property ProbableCause
     * An enumerated value that describes the probable cause of the situation which resulted in the AlertIndication.
     */
    public static class PROPERTY_PROBABLECAUSE {
        /**
         * name of the property ProbableCause
         */
        public final static String NAME = "ProbableCause";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Adapter_Card_Error = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Adapter/Card Error (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Adapter_Card_Error = "Adapter/Card Error";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Application_Subsystem_Failure = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Application Subsystem Failure (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Application_Subsystem_Failure = "Application Subsystem Failure";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Bandwidth_Reduced = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Bandwidth Reduced (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Bandwidth_Reduced = "Bandwidth Reduced";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Connection_Establishment_Error = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry Connection Establishment Error (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Connection_Establishment_Error = "Connection Establishment Error";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Communications_Protocol_Error = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry Communications Protocol Error (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Communications_Protocol_Error = "Communications Protocol Error";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Communications_Subsystem_Failure = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry Communications Subsystem Failure (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_Communications_Subsystem_Failure = "Communications Subsystem Failure";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Configuration_Customization_Error = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry Configuration/Customization Error (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_Configuration_Customization_Error = "Configuration/Customization Error";

        /**
         * constant for value map entry 9
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Congestion = new javax.cim.UnsignedInteger16(
                "9");

        /**
         * constant for value entry Congestion (corresponds to mapEntry 9 )
         */
        public final static String VALUE_ENTRY_Congestion = "Congestion";

        /**
         * constant for value map entry 10
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Corrupt_Data = new javax.cim.UnsignedInteger16(
                "10");

        /**
         * constant for value entry Corrupt Data (corresponds to mapEntry 10 )
         */
        public final static String VALUE_ENTRY_Corrupt_Data = "Corrupt Data";

        /**
         * constant for value map entry 11
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_CPU_Cycles_Limit_Exceeded = new javax.cim.UnsignedInteger16(
                "11");

        /**
         * constant for value entry CPU Cycles Limit Exceeded (corresponds to mapEntry 11 )
         */
        public final static String VALUE_ENTRY_CPU_Cycles_Limit_Exceeded = "CPU Cycles Limit Exceeded";

        /**
         * constant for value map entry 12
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Dataset_Modem_Error = new javax.cim.UnsignedInteger16(
                "12");

        /**
         * constant for value entry Dataset/Modem Error (corresponds to mapEntry 12 )
         */
        public final static String VALUE_ENTRY_Dataset_Modem_Error = "Dataset/Modem Error";

        /**
         * constant for value map entry 13
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Degraded_Signal = new javax.cim.UnsignedInteger16(
                "13");

        /**
         * constant for value entry Degraded Signal (corresponds to mapEntry 13 )
         */
        public final static String VALUE_ENTRY_Degraded_Signal = "Degraded Signal";

        /**
         * constant for value map entry 14
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_DTE_DCE_Interface_Error = new javax.cim.UnsignedInteger16(
                "14");

        /**
         * constant for value entry DTE-DCE Interface Error (corresponds to mapEntry 14 )
         */
        public final static String VALUE_ENTRY_DTE_DCE_Interface_Error = "DTE-DCE Interface Error";

        /**
         * constant for value map entry 15
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Enclosure_Door_Open = new javax.cim.UnsignedInteger16(
                "15");

        /**
         * constant for value entry Enclosure Door Open (corresponds to mapEntry 15 )
         */
        public final static String VALUE_ENTRY_Enclosure_Door_Open = "Enclosure Door Open";

        /**
         * constant for value map entry 16
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_Equipment_Malfunction = new javax.cim.UnsignedInteger16(
                "16");

        /**
         * constant for value entry Equipment Malfunction (corresponds to mapEntry 16 )
         */
        public final static String VALUE_ENTRY_Equipment_Malfunction = "Equipment Malfunction";

        /**
         * constant for value map entry 17
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_Excessive_Vibration = new javax.cim.UnsignedInteger16(
                "17");

        /**
         * constant for value entry Excessive Vibration (corresponds to mapEntry 17 )
         */
        public final static String VALUE_ENTRY_Excessive_Vibration = "Excessive Vibration";

        /**
         * constant for value map entry 18
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_File_Format_Error = new javax.cim.UnsignedInteger16(
                "18");

        /**
         * constant for value entry File Format Error (corresponds to mapEntry 18 )
         */
        public final static String VALUE_ENTRY_File_Format_Error = "File Format Error";

        /**
         * constant for value map entry 19
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_Fire_Detected = new javax.cim.UnsignedInteger16(
                "19");

        /**
         * constant for value entry Fire Detected (corresponds to mapEntry 19 )
         */
        public final static String VALUE_ENTRY_Fire_Detected = "Fire Detected";

        /**
         * constant for value map entry 20
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_Flood_Detected = new javax.cim.UnsignedInteger16(
                "20");

        /**
         * constant for value entry Flood Detected (corresponds to mapEntry 20 )
         */
        public final static String VALUE_ENTRY_Flood_Detected = "Flood Detected";

        /**
         * constant for value map entry 21
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_Framing_Error = new javax.cim.UnsignedInteger16(
                "21");

        /**
         * constant for value entry Framing Error (corresponds to mapEntry 21 )
         */
        public final static String VALUE_ENTRY_Framing_Error = "Framing Error";

        /**
         * constant for value map entry 22
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_HVAC_Problem = new javax.cim.UnsignedInteger16(
                "22");

        /**
         * constant for value entry HVAC Problem (corresponds to mapEntry 22 )
         */
        public final static String VALUE_ENTRY_HVAC_Problem = "HVAC Problem";

        /**
         * constant for value map entry 23
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_Humidity_Unacceptable = new javax.cim.UnsignedInteger16(
                "23");

        /**
         * constant for value entry Humidity Unacceptable (corresponds to mapEntry 23 )
         */
        public final static String VALUE_ENTRY_Humidity_Unacceptable = "Humidity Unacceptable";

        /**
         * constant for value map entry 24
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_I_O_Device_Error = new javax.cim.UnsignedInteger16(
                "24");

        /**
         * constant for value entry I/O Device Error (corresponds to mapEntry 24 )
         */
        public final static String VALUE_ENTRY_I_O_Device_Error = "I/O Device Error";

        /**
         * constant for value map entry 25
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_Input_Device_Error = new javax.cim.UnsignedInteger16(
                "25");

        /**
         * constant for value entry Input Device Error (corresponds to mapEntry 25 )
         */
        public final static String VALUE_ENTRY_Input_Device_Error = "Input Device Error";

        /**
         * constant for value map entry 26
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_LAN_Error = new javax.cim.UnsignedInteger16(
                "26");

        /**
         * constant for value entry LAN Error (corresponds to mapEntry 26 )
         */
        public final static String VALUE_ENTRY_LAN_Error = "LAN Error";

        /**
         * constant for value map entry 27
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_Non_Toxic_Leak_Detected = new javax.cim.UnsignedInteger16(
                "27");

        /**
         * constant for value entry Non-Toxic Leak Detected (corresponds to mapEntry 27 )
         */
        public final static String VALUE_ENTRY_Non_Toxic_Leak_Detected = "Non-Toxic Leak Detected";

        /**
         * constant for value map entry 28
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_28_FOR_VALUE_ENTRY_Local_Node_Transmission_Error = new javax.cim.UnsignedInteger16(
                "28");

        /**
         * constant for value entry Local Node Transmission Error (corresponds to mapEntry 28 )
         */
        public final static String VALUE_ENTRY_Local_Node_Transmission_Error = "Local Node Transmission Error";

        /**
         * constant for value map entry 29
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_29_FOR_VALUE_ENTRY_Loss_of_Frame = new javax.cim.UnsignedInteger16(
                "29");

        /**
         * constant for value entry Loss of Frame (corresponds to mapEntry 29 )
         */
        public final static String VALUE_ENTRY_Loss_of_Frame = "Loss of Frame";

        /**
         * constant for value map entry 30
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_30_FOR_VALUE_ENTRY_Loss_of_Signal = new javax.cim.UnsignedInteger16(
                "30");

        /**
         * constant for value entry Loss of Signal (corresponds to mapEntry 30 )
         */
        public final static String VALUE_ENTRY_Loss_of_Signal = "Loss of Signal";

        /**
         * constant for value map entry 31
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_31_FOR_VALUE_ENTRY_Material_Supply_Exhausted = new javax.cim.UnsignedInteger16(
                "31");

        /**
         * constant for value entry Material Supply Exhausted (corresponds to mapEntry 31 )
         */
        public final static String VALUE_ENTRY_Material_Supply_Exhausted = "Material Supply Exhausted";

        /**
         * constant for value map entry 32
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_32_FOR_VALUE_ENTRY_Multiplexer_Problem = new javax.cim.UnsignedInteger16(
                "32");

        /**
         * constant for value entry Multiplexer Problem (corresponds to mapEntry 32 )
         */
        public final static String VALUE_ENTRY_Multiplexer_Problem = "Multiplexer Problem";

        /**
         * constant for value map entry 33
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_33_FOR_VALUE_ENTRY_Out_of_Memory = new javax.cim.UnsignedInteger16(
                "33");

        /**
         * constant for value entry Out of Memory (corresponds to mapEntry 33 )
         */
        public final static String VALUE_ENTRY_Out_of_Memory = "Out of Memory";

        /**
         * constant for value map entry 34
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_34_FOR_VALUE_ENTRY_Output_Device_Error = new javax.cim.UnsignedInteger16(
                "34");

        /**
         * constant for value entry Output Device Error (corresponds to mapEntry 34 )
         */
        public final static String VALUE_ENTRY_Output_Device_Error = "Output Device Error";

        /**
         * constant for value map entry 35
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_35_FOR_VALUE_ENTRY_Performance_Degraded = new javax.cim.UnsignedInteger16(
                "35");

        /**
         * constant for value entry Performance Degraded (corresponds to mapEntry 35 )
         */
        public final static String VALUE_ENTRY_Performance_Degraded = "Performance Degraded";

        /**
         * constant for value map entry 36
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_36_FOR_VALUE_ENTRY_Power_Problem = new javax.cim.UnsignedInteger16(
                "36");

        /**
         * constant for value entry Power Problem (corresponds to mapEntry 36 )
         */
        public final static String VALUE_ENTRY_Power_Problem = "Power Problem";

        /**
         * constant for value map entry 37
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_37_FOR_VALUE_ENTRY_Pressure_Unacceptable = new javax.cim.UnsignedInteger16(
                "37");

        /**
         * constant for value entry Pressure Unacceptable (corresponds to mapEntry 37 )
         */
        public final static String VALUE_ENTRY_Pressure_Unacceptable = "Pressure Unacceptable";

        /**
         * constant for value map entry 38
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_38_FOR_VALUE_ENTRY_Processor_Problem__Internal_Machine_Error_ = new javax.cim.UnsignedInteger16(
                "38");

        /**
         * constant for value entry Processor Problem (Internal Machine Error) (corresponds to mapEntry 38 )
         */
        public final static String VALUE_ENTRY_Processor_Problem__Internal_Machine_Error_ = "Processor Problem (Internal Machine Error)";

        /**
         * constant for value map entry 39
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_39_FOR_VALUE_ENTRY_Pump_Failure = new javax.cim.UnsignedInteger16(
                "39");

        /**
         * constant for value entry Pump Failure (corresponds to mapEntry 39 )
         */
        public final static String VALUE_ENTRY_Pump_Failure = "Pump Failure";

        /**
         * constant for value map entry 40
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_40_FOR_VALUE_ENTRY_Queue_Size_Exceeded = new javax.cim.UnsignedInteger16(
                "40");

        /**
         * constant for value entry Queue Size Exceeded (corresponds to mapEntry 40 )
         */
        public final static String VALUE_ENTRY_Queue_Size_Exceeded = "Queue Size Exceeded";

        /**
         * constant for value map entry 41
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_41_FOR_VALUE_ENTRY_Receive_Failure = new javax.cim.UnsignedInteger16(
                "41");

        /**
         * constant for value entry Receive Failure (corresponds to mapEntry 41 )
         */
        public final static String VALUE_ENTRY_Receive_Failure = "Receive Failure";

        /**
         * constant for value map entry 42
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_42_FOR_VALUE_ENTRY_Receiver_Failure = new javax.cim.UnsignedInteger16(
                "42");

        /**
         * constant for value entry Receiver Failure (corresponds to mapEntry 42 )
         */
        public final static String VALUE_ENTRY_Receiver_Failure = "Receiver Failure";

        /**
         * constant for value map entry 43
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_43_FOR_VALUE_ENTRY_Remote_Node_Transmission_Error = new javax.cim.UnsignedInteger16(
                "43");

        /**
         * constant for value entry Remote Node Transmission Error (corresponds to mapEntry 43 )
         */
        public final static String VALUE_ENTRY_Remote_Node_Transmission_Error = "Remote Node Transmission Error";

        /**
         * constant for value map entry 44
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_44_FOR_VALUE_ENTRY_Resource_at_or_Nearing_Capacity = new javax.cim.UnsignedInteger16(
                "44");

        /**
         * constant for value entry Resource at or Nearing Capacity (corresponds to mapEntry 44 )
         */
        public final static String VALUE_ENTRY_Resource_at_or_Nearing_Capacity = "Resource at or Nearing Capacity";

        /**
         * constant for value map entry 45
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_45_FOR_VALUE_ENTRY_Response_Time_Excessive = new javax.cim.UnsignedInteger16(
                "45");

        /**
         * constant for value entry Response Time Excessive (corresponds to mapEntry 45 )
         */
        public final static String VALUE_ENTRY_Response_Time_Excessive = "Response Time Excessive";

        /**
         * constant for value map entry 46
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_46_FOR_VALUE_ENTRY_Retransmission_Rate_Excessive = new javax.cim.UnsignedInteger16(
                "46");

        /**
         * constant for value entry Retransmission Rate Excessive (corresponds to mapEntry 46 )
         */
        public final static String VALUE_ENTRY_Retransmission_Rate_Excessive = "Retransmission Rate Excessive";

        /**
         * constant for value map entry 47
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_47_FOR_VALUE_ENTRY_Software_Error = new javax.cim.UnsignedInteger16(
                "47");

        /**
         * constant for value entry Software Error (corresponds to mapEntry 47 )
         */
        public final static String VALUE_ENTRY_Software_Error = "Software Error";

        /**
         * constant for value map entry 48
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_48_FOR_VALUE_ENTRY_Software_Program_Abnormally_Terminated = new javax.cim.UnsignedInteger16(
                "48");

        /**
         * constant for value entry Software Program Abnormally Terminated (corresponds to mapEntry 48 )
         */
        public final static String VALUE_ENTRY_Software_Program_Abnormally_Terminated = "Software Program Abnormally Terminated";

        /**
         * constant for value map entry 49
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_49_FOR_VALUE_ENTRY_Software_Program_Error__Incorrect_Results_ = new javax.cim.UnsignedInteger16(
                "49");

        /**
         * constant for value entry Software Program Error (Incorrect Results) (corresponds to mapEntry 49 )
         */
        public final static String VALUE_ENTRY_Software_Program_Error__Incorrect_Results_ = "Software Program Error (Incorrect Results)";

        /**
         * constant for value map entry 50
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_50_FOR_VALUE_ENTRY_Storage_Capacity_Problem = new javax.cim.UnsignedInteger16(
                "50");

        /**
         * constant for value entry Storage Capacity Problem (corresponds to mapEntry 50 )
         */
        public final static String VALUE_ENTRY_Storage_Capacity_Problem = "Storage Capacity Problem";

        /**
         * constant for value map entry 51
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_51_FOR_VALUE_ENTRY_Temperature_Unacceptable = new javax.cim.UnsignedInteger16(
                "51");

        /**
         * constant for value entry Temperature Unacceptable (corresponds to mapEntry 51 )
         */
        public final static String VALUE_ENTRY_Temperature_Unacceptable = "Temperature Unacceptable";

        /**
         * constant for value map entry 52
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_52_FOR_VALUE_ENTRY_Threshold_Crossed = new javax.cim.UnsignedInteger16(
                "52");

        /**
         * constant for value entry Threshold Crossed (corresponds to mapEntry 52 )
         */
        public final static String VALUE_ENTRY_Threshold_Crossed = "Threshold Crossed";

        /**
         * constant for value map entry 53
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_53_FOR_VALUE_ENTRY_Timing_Problem = new javax.cim.UnsignedInteger16(
                "53");

        /**
         * constant for value entry Timing Problem (corresponds to mapEntry 53 )
         */
        public final static String VALUE_ENTRY_Timing_Problem = "Timing Problem";

        /**
         * constant for value map entry 54
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_54_FOR_VALUE_ENTRY_Toxic_Leak_Detected = new javax.cim.UnsignedInteger16(
                "54");

        /**
         * constant for value entry Toxic Leak Detected (corresponds to mapEntry 54 )
         */
        public final static String VALUE_ENTRY_Toxic_Leak_Detected = "Toxic Leak Detected";

        /**
         * constant for value map entry 55
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_55_FOR_VALUE_ENTRY_Transmit_Failure = new javax.cim.UnsignedInteger16(
                "55");

        /**
         * constant for value entry Transmit Failure (corresponds to mapEntry 55 )
         */
        public final static String VALUE_ENTRY_Transmit_Failure = "Transmit Failure";

        /**
         * constant for value map entry 56
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_56_FOR_VALUE_ENTRY_Transmitter_Failure = new javax.cim.UnsignedInteger16(
                "56");

        /**
         * constant for value entry Transmitter Failure (corresponds to mapEntry 56 )
         */
        public final static String VALUE_ENTRY_Transmitter_Failure = "Transmitter Failure";

        /**
         * constant for value map entry 57
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_57_FOR_VALUE_ENTRY_Underlying_Resource_Unavailable = new javax.cim.UnsignedInteger16(
                "57");

        /**
         * constant for value entry Underlying Resource Unavailable (corresponds to mapEntry 57 )
         */
        public final static String VALUE_ENTRY_Underlying_Resource_Unavailable = "Underlying Resource Unavailable";

        /**
         * constant for value map entry 58
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_58_FOR_VALUE_ENTRY_Version_MisMatch = new javax.cim.UnsignedInteger16(
                "58");

        /**
         * constant for value entry Version MisMatch (corresponds to mapEntry 58 )
         */
        public final static String VALUE_ENTRY_Version_MisMatch = "Version MisMatch";

        /**
         * constant for value map entry 59
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_59_FOR_VALUE_ENTRY_Previous_Alert_Cleared = new javax.cim.UnsignedInteger16(
                "59");

        /**
         * constant for value entry Previous Alert Cleared (corresponds to mapEntry 59 )
         */
        public final static String VALUE_ENTRY_Previous_Alert_Cleared = "Previous Alert Cleared";

        /**
         * constant for value map entry 60
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_60_FOR_VALUE_ENTRY_Login_Attempts_Failed = new javax.cim.UnsignedInteger16(
                "60");

        /**
         * constant for value entry Login Attempts Failed (corresponds to mapEntry 60 )
         */
        public final static String VALUE_ENTRY_Login_Attempts_Failed = "Login Attempts Failed";

        /**
         * constant for value map entry 61
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_61_FOR_VALUE_ENTRY_Software_Virus_Detected = new javax.cim.UnsignedInteger16(
                "61");

        /**
         * constant for value entry Software Virus Detected (corresponds to mapEntry 61 )
         */
        public final static String VALUE_ENTRY_Software_Virus_Detected = "Software Virus Detected";

        /**
         * constant for value map entry 62
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_62_FOR_VALUE_ENTRY_Hardware_Security_Breached = new javax.cim.UnsignedInteger16(
                "62");

        /**
         * constant for value entry Hardware Security Breached (corresponds to mapEntry 62 )
         */
        public final static String VALUE_ENTRY_Hardware_Security_Breached = "Hardware Security Breached";

        /**
         * constant for value map entry 63
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_63_FOR_VALUE_ENTRY_Denial_of_Service_Detected = new javax.cim.UnsignedInteger16(
                "63");

        /**
         * constant for value entry Denial of Service Detected (corresponds to mapEntry 63 )
         */
        public final static String VALUE_ENTRY_Denial_of_Service_Detected = "Denial of Service Detected";

        /**
         * constant for value map entry 64
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_64_FOR_VALUE_ENTRY_Security_Credential_MisMatch = new javax.cim.UnsignedInteger16(
                "64");

        /**
         * constant for value entry Security Credential MisMatch (corresponds to mapEntry 64 )
         */
        public final static String VALUE_ENTRY_Security_Credential_MisMatch = "Security Credential MisMatch";

        /**
         * constant for value map entry 65
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_65_FOR_VALUE_ENTRY_Unauthorized_Access = new javax.cim.UnsignedInteger16(
                "65");

        /**
         * constant for value entry Unauthorized Access (corresponds to mapEntry 65 )
         */
        public final static String VALUE_ENTRY_Unauthorized_Access = "Unauthorized Access";

        /**
         * constant for value map entry 66
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_66_FOR_VALUE_ENTRY_Alarm_Received = new javax.cim.UnsignedInteger16(
                "66");

        /**
         * constant for value entry Alarm Received (corresponds to mapEntry 66 )
         */
        public final static String VALUE_ENTRY_Alarm_Received = "Alarm Received";

        /**
         * constant for value map entry 67
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_67_FOR_VALUE_ENTRY_Loss_of_Pointer = new javax.cim.UnsignedInteger16(
                "67");

        /**
         * constant for value entry Loss of Pointer (corresponds to mapEntry 67 )
         */
        public final static String VALUE_ENTRY_Loss_of_Pointer = "Loss of Pointer";

        /**
         * constant for value map entry 68
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_68_FOR_VALUE_ENTRY_Payload_Mismatch = new javax.cim.UnsignedInteger16(
                "68");

        /**
         * constant for value entry Payload Mismatch (corresponds to mapEntry 68 )
         */
        public final static String VALUE_ENTRY_Payload_Mismatch = "Payload Mismatch";

        /**
         * constant for value map entry 69
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_69_FOR_VALUE_ENTRY_Transmission_Error = new javax.cim.UnsignedInteger16(
                "69");

        /**
         * constant for value entry Transmission Error (corresponds to mapEntry 69 )
         */
        public final static String VALUE_ENTRY_Transmission_Error = "Transmission Error";

        /**
         * constant for value map entry 70
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_70_FOR_VALUE_ENTRY_Excessive_Error_Rate = new javax.cim.UnsignedInteger16(
                "70");

        /**
         * constant for value entry Excessive Error Rate (corresponds to mapEntry 70 )
         */
        public final static String VALUE_ENTRY_Excessive_Error_Rate = "Excessive Error Rate";

        /**
         * constant for value map entry 71
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_71_FOR_VALUE_ENTRY_Trace_Problem = new javax.cim.UnsignedInteger16(
                "71");

        /**
         * constant for value entry Trace Problem (corresponds to mapEntry 71 )
         */
        public final static String VALUE_ENTRY_Trace_Problem = "Trace Problem";

        /**
         * constant for value map entry 72
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_72_FOR_VALUE_ENTRY_Element_Unavailable = new javax.cim.UnsignedInteger16(
                "72");

        /**
         * constant for value entry Element Unavailable (corresponds to mapEntry 72 )
         */
        public final static String VALUE_ENTRY_Element_Unavailable = "Element Unavailable";

        /**
         * constant for value map entry 73
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_73_FOR_VALUE_ENTRY_Element_Missing = new javax.cim.UnsignedInteger16(
                "73");

        /**
         * constant for value entry Element Missing (corresponds to mapEntry 73 )
         */
        public final static String VALUE_ENTRY_Element_Missing = "Element Missing";

        /**
         * constant for value map entry 74
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_74_FOR_VALUE_ENTRY_Loss_of_Multi_Frame = new javax.cim.UnsignedInteger16(
                "74");

        /**
         * constant for value entry Loss of Multi Frame (corresponds to mapEntry 74 )
         */
        public final static String VALUE_ENTRY_Loss_of_Multi_Frame = "Loss of Multi Frame";

        /**
         * constant for value map entry 75
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_75_FOR_VALUE_ENTRY_Broadcast_Channel_Failure = new javax.cim.UnsignedInteger16(
                "75");

        /**
         * constant for value entry Broadcast Channel Failure (corresponds to mapEntry 75 )
         */
        public final static String VALUE_ENTRY_Broadcast_Channel_Failure = "Broadcast Channel Failure";

        /**
         * constant for value map entry 76
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_76_FOR_VALUE_ENTRY_Invalid_Message_Received = new javax.cim.UnsignedInteger16(
                "76");

        /**
         * constant for value entry Invalid Message Received (corresponds to mapEntry 76 )
         */
        public final static String VALUE_ENTRY_Invalid_Message_Received = "Invalid Message Received";

        /**
         * constant for value map entry 77
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_77_FOR_VALUE_ENTRY_Routing_Failure = new javax.cim.UnsignedInteger16(
                "77");

        /**
         * constant for value entry Routing Failure (corresponds to mapEntry 77 )
         */
        public final static String VALUE_ENTRY_Routing_Failure = "Routing Failure";

        /**
         * constant for value map entry 78
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_78_FOR_VALUE_ENTRY_Backplane_Failure = new javax.cim.UnsignedInteger16(
                "78");

        /**
         * constant for value entry Backplane Failure (corresponds to mapEntry 78 )
         */
        public final static String VALUE_ENTRY_Backplane_Failure = "Backplane Failure";

        /**
         * constant for value map entry 79
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_79_FOR_VALUE_ENTRY_Identifier_Duplication = new javax.cim.UnsignedInteger16(
                "79");

        /**
         * constant for value entry Identifier Duplication (corresponds to mapEntry 79 )
         */
        public final static String VALUE_ENTRY_Identifier_Duplication = "Identifier Duplication";

        /**
         * constant for value map entry 80
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_80_FOR_VALUE_ENTRY_Protection_Path_Failure = new javax.cim.UnsignedInteger16(
                "80");

        /**
         * constant for value entry Protection Path Failure (corresponds to mapEntry 80 )
         */
        public final static String VALUE_ENTRY_Protection_Path_Failure = "Protection Path Failure";

        /**
         * constant for value map entry 81
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_81_FOR_VALUE_ENTRY_Sync_Loss_or_Mismatch = new javax.cim.UnsignedInteger16(
                "81");

        /**
         * constant for value entry Sync Loss or Mismatch (corresponds to mapEntry 81 )
         */
        public final static String VALUE_ENTRY_Sync_Loss_or_Mismatch = "Sync Loss or Mismatch";

        /**
         * constant for value map entry 82
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_82_FOR_VALUE_ENTRY_Terminal_Problem = new javax.cim.UnsignedInteger16(
                "82");

        /**
         * constant for value entry Terminal Problem (corresponds to mapEntry 82 )
         */
        public final static String VALUE_ENTRY_Terminal_Problem = "Terminal Problem";

        /**
         * constant for value map entry 83
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_83_FOR_VALUE_ENTRY_Real_Time_Clock_Failure = new javax.cim.UnsignedInteger16(
                "83");

        /**
         * constant for value entry Real Time Clock Failure (corresponds to mapEntry 83 )
         */
        public final static String VALUE_ENTRY_Real_Time_Clock_Failure = "Real Time Clock Failure";

        /**
         * constant for value map entry 84
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_84_FOR_VALUE_ENTRY_Antenna_Failure = new javax.cim.UnsignedInteger16(
                "84");

        /**
         * constant for value entry Antenna Failure (corresponds to mapEntry 84 )
         */
        public final static String VALUE_ENTRY_Antenna_Failure = "Antenna Failure";

        /**
         * constant for value map entry 85
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_85_FOR_VALUE_ENTRY_Battery_Charging_Failure = new javax.cim.UnsignedInteger16(
                "85");

        /**
         * constant for value entry Battery Charging Failure (corresponds to mapEntry 85 )
         */
        public final static String VALUE_ENTRY_Battery_Charging_Failure = "Battery Charging Failure";

        /**
         * constant for value map entry 86
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_86_FOR_VALUE_ENTRY_Disk_Failure = new javax.cim.UnsignedInteger16(
                "86");

        /**
         * constant for value entry Disk Failure (corresponds to mapEntry 86 )
         */
        public final static String VALUE_ENTRY_Disk_Failure = "Disk Failure";

        /**
         * constant for value map entry 87
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_87_FOR_VALUE_ENTRY_Frequency_Hopping_Failure = new javax.cim.UnsignedInteger16(
                "87");

        /**
         * constant for value entry Frequency Hopping Failure (corresponds to mapEntry 87 )
         */
        public final static String VALUE_ENTRY_Frequency_Hopping_Failure = "Frequency Hopping Failure";

        /**
         * constant for value map entry 88
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_88_FOR_VALUE_ENTRY_Loss_of_Redundancy = new javax.cim.UnsignedInteger16(
                "88");

        /**
         * constant for value entry Loss of Redundancy (corresponds to mapEntry 88 )
         */
        public final static String VALUE_ENTRY_Loss_of_Redundancy = "Loss of Redundancy";

        /**
         * constant for value map entry 89
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_89_FOR_VALUE_ENTRY_Power_Supply_Failure = new javax.cim.UnsignedInteger16(
                "89");

        /**
         * constant for value entry Power Supply Failure (corresponds to mapEntry 89 )
         */
        public final static String VALUE_ENTRY_Power_Supply_Failure = "Power Supply Failure";

        /**
         * constant for value map entry 90
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_90_FOR_VALUE_ENTRY_Signal_Quality_Problem = new javax.cim.UnsignedInteger16(
                "90");

        /**
         * constant for value entry Signal Quality Problem (corresponds to mapEntry 90 )
         */
        public final static String VALUE_ENTRY_Signal_Quality_Problem = "Signal Quality Problem";

        /**
         * constant for value map entry 91
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_91_FOR_VALUE_ENTRY_Battery_Discharging = new javax.cim.UnsignedInteger16(
                "91");

        /**
         * constant for value entry Battery Discharging (corresponds to mapEntry 91 )
         */
        public final static String VALUE_ENTRY_Battery_Discharging = "Battery Discharging";

        /**
         * constant for value map entry 92
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_92_FOR_VALUE_ENTRY_Battery_Failure = new javax.cim.UnsignedInteger16(
                "92");

        /**
         * constant for value entry Battery Failure (corresponds to mapEntry 92 )
         */
        public final static String VALUE_ENTRY_Battery_Failure = "Battery Failure";

        /**
         * constant for value map entry 93
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_93_FOR_VALUE_ENTRY_Commercial_Power_Problem = new javax.cim.UnsignedInteger16(
                "93");

        /**
         * constant for value entry Commercial Power Problem (corresponds to mapEntry 93 )
         */
        public final static String VALUE_ENTRY_Commercial_Power_Problem = "Commercial Power Problem";

        /**
         * constant for value map entry 94
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_94_FOR_VALUE_ENTRY_Fan_Failure = new javax.cim.UnsignedInteger16(
                "94");

        /**
         * constant for value entry Fan Failure (corresponds to mapEntry 94 )
         */
        public final static String VALUE_ENTRY_Fan_Failure = "Fan Failure";

        /**
         * constant for value map entry 95
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_95_FOR_VALUE_ENTRY_Engine_Failure = new javax.cim.UnsignedInteger16(
                "95");

        /**
         * constant for value entry Engine Failure (corresponds to mapEntry 95 )
         */
        public final static String VALUE_ENTRY_Engine_Failure = "Engine Failure";

        /**
         * constant for value map entry 96
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_96_FOR_VALUE_ENTRY_Sensor_Failure = new javax.cim.UnsignedInteger16(
                "96");

        /**
         * constant for value entry Sensor Failure (corresponds to mapEntry 96 )
         */
        public final static String VALUE_ENTRY_Sensor_Failure = "Sensor Failure";

        /**
         * constant for value map entry 97
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_97_FOR_VALUE_ENTRY_Fuse_Failure = new javax.cim.UnsignedInteger16(
                "97");

        /**
         * constant for value entry Fuse Failure (corresponds to mapEntry 97 )
         */
        public final static String VALUE_ENTRY_Fuse_Failure = "Fuse Failure";

        /**
         * constant for value map entry 98
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_98_FOR_VALUE_ENTRY_Generator_Failure = new javax.cim.UnsignedInteger16(
                "98");

        /**
         * constant for value entry Generator Failure (corresponds to mapEntry 98 )
         */
        public final static String VALUE_ENTRY_Generator_Failure = "Generator Failure";

        /**
         * constant for value map entry 99
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_99_FOR_VALUE_ENTRY_Low_Battery = new javax.cim.UnsignedInteger16(
                "99");

        /**
         * constant for value entry Low Battery (corresponds to mapEntry 99 )
         */
        public final static String VALUE_ENTRY_Low_Battery = "Low Battery";

        /**
         * constant for value map entry 100
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_100_FOR_VALUE_ENTRY_Low_Fuel = new javax.cim.UnsignedInteger16(
                "100");

        /**
         * constant for value entry Low Fuel (corresponds to mapEntry 100 )
         */
        public final static String VALUE_ENTRY_Low_Fuel = "Low Fuel";

        /**
         * constant for value map entry 101
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_101_FOR_VALUE_ENTRY_Low_Water = new javax.cim.UnsignedInteger16(
                "101");

        /**
         * constant for value entry Low Water (corresponds to mapEntry 101 )
         */
        public final static String VALUE_ENTRY_Low_Water = "Low Water";

        /**
         * constant for value map entry 102
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_102_FOR_VALUE_ENTRY_Explosive_Gas = new javax.cim.UnsignedInteger16(
                "102");

        /**
         * constant for value entry Explosive Gas (corresponds to mapEntry 102 )
         */
        public final static String VALUE_ENTRY_Explosive_Gas = "Explosive Gas";

        /**
         * constant for value map entry 103
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_103_FOR_VALUE_ENTRY_High_Winds = new javax.cim.UnsignedInteger16(
                "103");

        /**
         * constant for value entry High Winds (corresponds to mapEntry 103 )
         */
        public final static String VALUE_ENTRY_High_Winds = "High Winds";

        /**
         * constant for value map entry 104
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_104_FOR_VALUE_ENTRY_Ice_Buildup = new javax.cim.UnsignedInteger16(
                "104");

        /**
         * constant for value entry Ice Buildup (corresponds to mapEntry 104 )
         */
        public final static String VALUE_ENTRY_Ice_Buildup = "Ice Buildup";

        /**
         * constant for value map entry 105
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_105_FOR_VALUE_ENTRY_Smoke = new javax.cim.UnsignedInteger16(
                "105");

        /**
         * constant for value entry Smoke (corresponds to mapEntry 105 )
         */
        public final static String VALUE_ENTRY_Smoke = "Smoke";

        /**
         * constant for value map entry 106
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_106_FOR_VALUE_ENTRY_Memory_Mismatch = new javax.cim.UnsignedInteger16(
                "106");

        /**
         * constant for value entry Memory Mismatch (corresponds to mapEntry 106 )
         */
        public final static String VALUE_ENTRY_Memory_Mismatch = "Memory Mismatch";

        /**
         * constant for value map entry 107
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_107_FOR_VALUE_ENTRY_Out_of_CPU_Cycles = new javax.cim.UnsignedInteger16(
                "107");

        /**
         * constant for value entry Out of CPU Cycles (corresponds to mapEntry 107 )
         */
        public final static String VALUE_ENTRY_Out_of_CPU_Cycles = "Out of CPU Cycles";

        /**
         * constant for value map entry 108
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_108_FOR_VALUE_ENTRY_Software_Environment_Problem = new javax.cim.UnsignedInteger16(
                "108");

        /**
         * constant for value entry Software Environment Problem (corresponds to mapEntry 108 )
         */
        public final static String VALUE_ENTRY_Software_Environment_Problem = "Software Environment Problem";

        /**
         * constant for value map entry 109
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_109_FOR_VALUE_ENTRY_Software_Download_Failure = new javax.cim.UnsignedInteger16(
                "109");

        /**
         * constant for value entry Software Download Failure (corresponds to mapEntry 109 )
         */
        public final static String VALUE_ENTRY_Software_Download_Failure = "Software Download Failure";

        /**
         * constant for value map entry 110
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_110_FOR_VALUE_ENTRY_Element_Reinitialized = new javax.cim.UnsignedInteger16(
                "110");

        /**
         * constant for value entry Element Reinitialized (corresponds to mapEntry 110 )
         */
        public final static String VALUE_ENTRY_Element_Reinitialized = "Element Reinitialized";

        /**
         * constant for value map entry 111
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_111_FOR_VALUE_ENTRY_Timeout = new javax.cim.UnsignedInteger16(
                "111");

        /**
         * constant for value entry Timeout (corresponds to mapEntry 111 )
         */
        public final static String VALUE_ENTRY_Timeout = "Timeout";

        /**
         * constant for value map entry 112
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_112_FOR_VALUE_ENTRY_Logging_Problems = new javax.cim.UnsignedInteger16(
                "112");

        /**
         * constant for value entry Logging Problems (corresponds to mapEntry 112 )
         */
        public final static String VALUE_ENTRY_Logging_Problems = "Logging Problems";

        /**
         * constant for value map entry 113
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_113_FOR_VALUE_ENTRY_Leak_Detected = new javax.cim.UnsignedInteger16(
                "113");

        /**
         * constant for value entry Leak Detected (corresponds to mapEntry 113 )
         */
        public final static String VALUE_ENTRY_Leak_Detected = "Leak Detected";

        /**
         * constant for value map entry 114
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_114_FOR_VALUE_ENTRY_Protection_Mechanism_Failure = new javax.cim.UnsignedInteger16(
                "114");

        /**
         * constant for value entry Protection Mechanism Failure (corresponds to mapEntry 114 )
         */
        public final static String VALUE_ENTRY_Protection_Mechanism_Failure = "Protection Mechanism Failure";

        /**
         * constant for value map entry 115
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_115_FOR_VALUE_ENTRY_Protecting_Resource_Failure = new javax.cim.UnsignedInteger16(
                "115");

        /**
         * constant for value entry Protecting Resource Failure (corresponds to mapEntry 115 )
         */
        public final static String VALUE_ENTRY_Protecting_Resource_Failure = "Protecting Resource Failure";

        /**
         * constant for value map entry 116
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_116_FOR_VALUE_ENTRY_Database_Inconsistency = new javax.cim.UnsignedInteger16(
                "116");

        /**
         * constant for value entry Database Inconsistency (corresponds to mapEntry 116 )
         */
        public final static String VALUE_ENTRY_Database_Inconsistency = "Database Inconsistency";

        /**
         * constant for value map entry 117
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_117_FOR_VALUE_ENTRY_Authentication_Failure = new javax.cim.UnsignedInteger16(
                "117");

        /**
         * constant for value entry Authentication Failure (corresponds to mapEntry 117 )
         */
        public final static String VALUE_ENTRY_Authentication_Failure = "Authentication Failure";

        /**
         * constant for value map entry 118
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_118_FOR_VALUE_ENTRY_Breach_of_Confidentiality = new javax.cim.UnsignedInteger16(
                "118");

        /**
         * constant for value entry Breach of Confidentiality (corresponds to mapEntry 118 )
         */
        public final static String VALUE_ENTRY_Breach_of_Confidentiality = "Breach of Confidentiality";

        /**
         * constant for value map entry 119
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_119_FOR_VALUE_ENTRY_Cable_Tamper = new javax.cim.UnsignedInteger16(
                "119");

        /**
         * constant for value entry Cable Tamper (corresponds to mapEntry 119 )
         */
        public final static String VALUE_ENTRY_Cable_Tamper = "Cable Tamper";

        /**
         * constant for value map entry 120
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_120_FOR_VALUE_ENTRY_Delayed_Information = new javax.cim.UnsignedInteger16(
                "120");

        /**
         * constant for value entry Delayed Information (corresponds to mapEntry 120 )
         */
        public final static String VALUE_ENTRY_Delayed_Information = "Delayed Information";

        /**
         * constant for value map entry 121
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_121_FOR_VALUE_ENTRY_Duplicate_Information = new javax.cim.UnsignedInteger16(
                "121");

        /**
         * constant for value entry Duplicate Information (corresponds to mapEntry 121 )
         */
        public final static String VALUE_ENTRY_Duplicate_Information = "Duplicate Information";

        /**
         * constant for value map entry 122
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_122_FOR_VALUE_ENTRY_Information_Missing = new javax.cim.UnsignedInteger16(
                "122");

        /**
         * constant for value entry Information Missing (corresponds to mapEntry 122 )
         */
        public final static String VALUE_ENTRY_Information_Missing = "Information Missing";

        /**
         * constant for value map entry 123
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_123_FOR_VALUE_ENTRY_Information_Modification = new javax.cim.UnsignedInteger16(
                "123");

        /**
         * constant for value entry Information Modification (corresponds to mapEntry 123 )
         */
        public final static String VALUE_ENTRY_Information_Modification = "Information Modification";

        /**
         * constant for value map entry 124
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_124_FOR_VALUE_ENTRY_Information_Out_of_Sequence = new javax.cim.UnsignedInteger16(
                "124");

        /**
         * constant for value entry Information Out of Sequence (corresponds to mapEntry 124 )
         */
        public final static String VALUE_ENTRY_Information_Out_of_Sequence = "Information Out of Sequence";

        /**
         * constant for value map entry 125
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_125_FOR_VALUE_ENTRY_Key_Expired = new javax.cim.UnsignedInteger16(
                "125");

        /**
         * constant for value entry Key Expired (corresponds to mapEntry 125 )
         */
        public final static String VALUE_ENTRY_Key_Expired = "Key Expired";

        /**
         * constant for value map entry 126
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_126_FOR_VALUE_ENTRY_Non_Repudiation_Failure = new javax.cim.UnsignedInteger16(
                "126");

        /**
         * constant for value entry Non-Repudiation Failure (corresponds to mapEntry 126 )
         */
        public final static String VALUE_ENTRY_Non_Repudiation_Failure = "Non-Repudiation Failure";

        /**
         * constant for value map entry 127
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_127_FOR_VALUE_ENTRY_Out_of_Hours_Activity = new javax.cim.UnsignedInteger16(
                "127");

        /**
         * constant for value entry Out of Hours Activity (corresponds to mapEntry 127 )
         */
        public final static String VALUE_ENTRY_Out_of_Hours_Activity = "Out of Hours Activity";

        /**
         * constant for value map entry 128
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_128_FOR_VALUE_ENTRY_Out_of_Service = new javax.cim.UnsignedInteger16(
                "128");

        /**
         * constant for value entry Out of Service (corresponds to mapEntry 128 )
         */
        public final static String VALUE_ENTRY_Out_of_Service = "Out of Service";

        /**
         * constant for value map entry 129
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_129_FOR_VALUE_ENTRY_Procedural_Error = new javax.cim.UnsignedInteger16(
                "129");

        /**
         * constant for value entry Procedural Error (corresponds to mapEntry 129 )
         */
        public final static String VALUE_ENTRY_Procedural_Error = "Procedural Error";

        /**
         * constant for value map entry 130
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_130_FOR_VALUE_ENTRY_Unexpected_Information = new javax.cim.UnsignedInteger16(
                "130");

        /**
         * constant for value entry Unexpected Information (corresponds to mapEntry 130 )
         */
        public final static String VALUE_ENTRY_Unexpected_Information = "Unexpected Information";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@2b9c2b9c
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Adapter_Card_Error.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Adapter_Card_Error;
            }

            if (VALUE_ENTRY_Application_Subsystem_Failure.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Application_Subsystem_Failure;
            }

            if (VALUE_ENTRY_Bandwidth_Reduced.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Bandwidth_Reduced;
            }

            if (VALUE_ENTRY_Connection_Establishment_Error.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Connection_Establishment_Error;
            }

            if (VALUE_ENTRY_Communications_Protocol_Error.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Communications_Protocol_Error;
            }

            if (VALUE_ENTRY_Communications_Subsystem_Failure.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Communications_Subsystem_Failure;
            }

            if (VALUE_ENTRY_Configuration_Customization_Error.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Configuration_Customization_Error;
            }

            if (VALUE_ENTRY_Congestion.equals(value)) {
                return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Congestion;
            }

            if (VALUE_ENTRY_Corrupt_Data.equals(value)) {
                return VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Corrupt_Data;
            }

            if (VALUE_ENTRY_CPU_Cycles_Limit_Exceeded.equals(value)) {
                return VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_CPU_Cycles_Limit_Exceeded;
            }

            if (VALUE_ENTRY_Dataset_Modem_Error.equals(value)) {
                return VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Dataset_Modem_Error;
            }

            if (VALUE_ENTRY_Degraded_Signal.equals(value)) {
                return VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Degraded_Signal;
            }

            if (VALUE_ENTRY_DTE_DCE_Interface_Error.equals(value)) {
                return VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_DTE_DCE_Interface_Error;
            }

            if (VALUE_ENTRY_Enclosure_Door_Open.equals(value)) {
                return VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Enclosure_Door_Open;
            }

            if (VALUE_ENTRY_Equipment_Malfunction.equals(value)) {
                return VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_Equipment_Malfunction;
            }

            if (VALUE_ENTRY_Excessive_Vibration.equals(value)) {
                return VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_Excessive_Vibration;
            }

            if (VALUE_ENTRY_File_Format_Error.equals(value)) {
                return VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_File_Format_Error;
            }

            if (VALUE_ENTRY_Fire_Detected.equals(value)) {
                return VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_Fire_Detected;
            }

            if (VALUE_ENTRY_Flood_Detected.equals(value)) {
                return VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_Flood_Detected;
            }

            if (VALUE_ENTRY_Framing_Error.equals(value)) {
                return VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_Framing_Error;
            }

            if (VALUE_ENTRY_HVAC_Problem.equals(value)) {
                return VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_HVAC_Problem;
            }

            if (VALUE_ENTRY_Humidity_Unacceptable.equals(value)) {
                return VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_Humidity_Unacceptable;
            }

            if (VALUE_ENTRY_I_O_Device_Error.equals(value)) {
                return VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_I_O_Device_Error;
            }

            if (VALUE_ENTRY_Input_Device_Error.equals(value)) {
                return VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_Input_Device_Error;
            }

            if (VALUE_ENTRY_LAN_Error.equals(value)) {
                return VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_LAN_Error;
            }

            if (VALUE_ENTRY_Non_Toxic_Leak_Detected.equals(value)) {
                return VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_Non_Toxic_Leak_Detected;
            }

            if (VALUE_ENTRY_Local_Node_Transmission_Error.equals(value)) {
                return VALUE_MAP_ENTRY_28_FOR_VALUE_ENTRY_Local_Node_Transmission_Error;
            }

            if (VALUE_ENTRY_Loss_of_Frame.equals(value)) {
                return VALUE_MAP_ENTRY_29_FOR_VALUE_ENTRY_Loss_of_Frame;
            }

            if (VALUE_ENTRY_Loss_of_Signal.equals(value)) {
                return VALUE_MAP_ENTRY_30_FOR_VALUE_ENTRY_Loss_of_Signal;
            }

            if (VALUE_ENTRY_Material_Supply_Exhausted.equals(value)) {
                return VALUE_MAP_ENTRY_31_FOR_VALUE_ENTRY_Material_Supply_Exhausted;
            }

            if (VALUE_ENTRY_Multiplexer_Problem.equals(value)) {
                return VALUE_MAP_ENTRY_32_FOR_VALUE_ENTRY_Multiplexer_Problem;
            }

            if (VALUE_ENTRY_Out_of_Memory.equals(value)) {
                return VALUE_MAP_ENTRY_33_FOR_VALUE_ENTRY_Out_of_Memory;
            }

            if (VALUE_ENTRY_Output_Device_Error.equals(value)) {
                return VALUE_MAP_ENTRY_34_FOR_VALUE_ENTRY_Output_Device_Error;
            }

            if (VALUE_ENTRY_Performance_Degraded.equals(value)) {
                return VALUE_MAP_ENTRY_35_FOR_VALUE_ENTRY_Performance_Degraded;
            }

            if (VALUE_ENTRY_Power_Problem.equals(value)) {
                return VALUE_MAP_ENTRY_36_FOR_VALUE_ENTRY_Power_Problem;
            }

            if (VALUE_ENTRY_Pressure_Unacceptable.equals(value)) {
                return VALUE_MAP_ENTRY_37_FOR_VALUE_ENTRY_Pressure_Unacceptable;
            }

            if (VALUE_ENTRY_Processor_Problem__Internal_Machine_Error_.equals(value)) {
                return VALUE_MAP_ENTRY_38_FOR_VALUE_ENTRY_Processor_Problem__Internal_Machine_Error_;
            }

            if (VALUE_ENTRY_Pump_Failure.equals(value)) {
                return VALUE_MAP_ENTRY_39_FOR_VALUE_ENTRY_Pump_Failure;
            }

            if (VALUE_ENTRY_Queue_Size_Exceeded.equals(value)) {
                return VALUE_MAP_ENTRY_40_FOR_VALUE_ENTRY_Queue_Size_Exceeded;
            }

            if (VALUE_ENTRY_Receive_Failure.equals(value)) {
                return VALUE_MAP_ENTRY_41_FOR_VALUE_ENTRY_Receive_Failure;
            }

            if (VALUE_ENTRY_Receiver_Failure.equals(value)) {
                return VALUE_MAP_ENTRY_42_FOR_VALUE_ENTRY_Receiver_Failure;
            }

            if (VALUE_ENTRY_Remote_Node_Transmission_Error.equals(value)) {
                return VALUE_MAP_ENTRY_43_FOR_VALUE_ENTRY_Remote_Node_Transmission_Error;
            }

            if (VALUE_ENTRY_Resource_at_or_Nearing_Capacity.equals(value)) {
                return VALUE_MAP_ENTRY_44_FOR_VALUE_ENTRY_Resource_at_or_Nearing_Capacity;
            }

            if (VALUE_ENTRY_Response_Time_Excessive.equals(value)) {
                return VALUE_MAP_ENTRY_45_FOR_VALUE_ENTRY_Response_Time_Excessive;
            }

            if (VALUE_ENTRY_Retransmission_Rate_Excessive.equals(value)) {
                return VALUE_MAP_ENTRY_46_FOR_VALUE_ENTRY_Retransmission_Rate_Excessive;
            }

            if (VALUE_ENTRY_Software_Error.equals(value)) {
                return VALUE_MAP_ENTRY_47_FOR_VALUE_ENTRY_Software_Error;
            }

            if (VALUE_ENTRY_Software_Program_Abnormally_Terminated.equals(value)) {
                return VALUE_MAP_ENTRY_48_FOR_VALUE_ENTRY_Software_Program_Abnormally_Terminated;
            }

            if (VALUE_ENTRY_Software_Program_Error__Incorrect_Results_.equals(value)) {
                return VALUE_MAP_ENTRY_49_FOR_VALUE_ENTRY_Software_Program_Error__Incorrect_Results_;
            }

            if (VALUE_ENTRY_Storage_Capacity_Problem.equals(value)) {
                return VALUE_MAP_ENTRY_50_FOR_VALUE_ENTRY_Storage_Capacity_Problem;
            }

            if (VALUE_ENTRY_Temperature_Unacceptable.equals(value)) {
                return VALUE_MAP_ENTRY_51_FOR_VALUE_ENTRY_Temperature_Unacceptable;
            }

            if (VALUE_ENTRY_Threshold_Crossed.equals(value)) {
                return VALUE_MAP_ENTRY_52_FOR_VALUE_ENTRY_Threshold_Crossed;
            }

            if (VALUE_ENTRY_Timing_Problem.equals(value)) {
                return VALUE_MAP_ENTRY_53_FOR_VALUE_ENTRY_Timing_Problem;
            }

            if (VALUE_ENTRY_Toxic_Leak_Detected.equals(value)) {
                return VALUE_MAP_ENTRY_54_FOR_VALUE_ENTRY_Toxic_Leak_Detected;
            }

            if (VALUE_ENTRY_Transmit_Failure.equals(value)) {
                return VALUE_MAP_ENTRY_55_FOR_VALUE_ENTRY_Transmit_Failure;
            }

            if (VALUE_ENTRY_Transmitter_Failure.equals(value)) {
                return VALUE_MAP_ENTRY_56_FOR_VALUE_ENTRY_Transmitter_Failure;
            }

            if (VALUE_ENTRY_Underlying_Resource_Unavailable.equals(value)) {
                return VALUE_MAP_ENTRY_57_FOR_VALUE_ENTRY_Underlying_Resource_Unavailable;
            }

            if (VALUE_ENTRY_Version_MisMatch.equals(value)) {
                return VALUE_MAP_ENTRY_58_FOR_VALUE_ENTRY_Version_MisMatch;
            }

            if (VALUE_ENTRY_Previous_Alert_Cleared.equals(value)) {
                return VALUE_MAP_ENTRY_59_FOR_VALUE_ENTRY_Previous_Alert_Cleared;
            }

            if (VALUE_ENTRY_Login_Attempts_Failed.equals(value)) {
                return VALUE_MAP_ENTRY_60_FOR_VALUE_ENTRY_Login_Attempts_Failed;
            }

            if (VALUE_ENTRY_Software_Virus_Detected.equals(value)) {
                return VALUE_MAP_ENTRY_61_FOR_VALUE_ENTRY_Software_Virus_Detected;
            }

            if (VALUE_ENTRY_Hardware_Security_Breached.equals(value)) {
                return VALUE_MAP_ENTRY_62_FOR_VALUE_ENTRY_Hardware_Security_Breached;
            }

            if (VALUE_ENTRY_Denial_of_Service_Detected.equals(value)) {
                return VALUE_MAP_ENTRY_63_FOR_VALUE_ENTRY_Denial_of_Service_Detected;
            }

            if (VALUE_ENTRY_Security_Credential_MisMatch.equals(value)) {
                return VALUE_MAP_ENTRY_64_FOR_VALUE_ENTRY_Security_Credential_MisMatch;
            }

            if (VALUE_ENTRY_Unauthorized_Access.equals(value)) {
                return VALUE_MAP_ENTRY_65_FOR_VALUE_ENTRY_Unauthorized_Access;
            }

            if (VALUE_ENTRY_Alarm_Received.equals(value)) {
                return VALUE_MAP_ENTRY_66_FOR_VALUE_ENTRY_Alarm_Received;
            }

            if (VALUE_ENTRY_Loss_of_Pointer.equals(value)) {
                return VALUE_MAP_ENTRY_67_FOR_VALUE_ENTRY_Loss_of_Pointer;
            }

            if (VALUE_ENTRY_Payload_Mismatch.equals(value)) {
                return VALUE_MAP_ENTRY_68_FOR_VALUE_ENTRY_Payload_Mismatch;
            }

            if (VALUE_ENTRY_Transmission_Error.equals(value)) {
                return VALUE_MAP_ENTRY_69_FOR_VALUE_ENTRY_Transmission_Error;
            }

            if (VALUE_ENTRY_Excessive_Error_Rate.equals(value)) {
                return VALUE_MAP_ENTRY_70_FOR_VALUE_ENTRY_Excessive_Error_Rate;
            }

            if (VALUE_ENTRY_Trace_Problem.equals(value)) {
                return VALUE_MAP_ENTRY_71_FOR_VALUE_ENTRY_Trace_Problem;
            }

            if (VALUE_ENTRY_Element_Unavailable.equals(value)) {
                return VALUE_MAP_ENTRY_72_FOR_VALUE_ENTRY_Element_Unavailable;
            }

            if (VALUE_ENTRY_Element_Missing.equals(value)) {
                return VALUE_MAP_ENTRY_73_FOR_VALUE_ENTRY_Element_Missing;
            }

            if (VALUE_ENTRY_Loss_of_Multi_Frame.equals(value)) {
                return VALUE_MAP_ENTRY_74_FOR_VALUE_ENTRY_Loss_of_Multi_Frame;
            }

            if (VALUE_ENTRY_Broadcast_Channel_Failure.equals(value)) {
                return VALUE_MAP_ENTRY_75_FOR_VALUE_ENTRY_Broadcast_Channel_Failure;
            }

            if (VALUE_ENTRY_Invalid_Message_Received.equals(value)) {
                return VALUE_MAP_ENTRY_76_FOR_VALUE_ENTRY_Invalid_Message_Received;
            }

            if (VALUE_ENTRY_Routing_Failure.equals(value)) {
                return VALUE_MAP_ENTRY_77_FOR_VALUE_ENTRY_Routing_Failure;
            }

            if (VALUE_ENTRY_Backplane_Failure.equals(value)) {
                return VALUE_MAP_ENTRY_78_FOR_VALUE_ENTRY_Backplane_Failure;
            }

            if (VALUE_ENTRY_Identifier_Duplication.equals(value)) {
                return VALUE_MAP_ENTRY_79_FOR_VALUE_ENTRY_Identifier_Duplication;
            }

            if (VALUE_ENTRY_Protection_Path_Failure.equals(value)) {
                return VALUE_MAP_ENTRY_80_FOR_VALUE_ENTRY_Protection_Path_Failure;
            }

            if (VALUE_ENTRY_Sync_Loss_or_Mismatch.equals(value)) {
                return VALUE_MAP_ENTRY_81_FOR_VALUE_ENTRY_Sync_Loss_or_Mismatch;
            }

            if (VALUE_ENTRY_Terminal_Problem.equals(value)) {
                return VALUE_MAP_ENTRY_82_FOR_VALUE_ENTRY_Terminal_Problem;
            }

            if (VALUE_ENTRY_Real_Time_Clock_Failure.equals(value)) {
                return VALUE_MAP_ENTRY_83_FOR_VALUE_ENTRY_Real_Time_Clock_Failure;
            }

            if (VALUE_ENTRY_Antenna_Failure.equals(value)) {
                return VALUE_MAP_ENTRY_84_FOR_VALUE_ENTRY_Antenna_Failure;
            }

            if (VALUE_ENTRY_Battery_Charging_Failure.equals(value)) {
                return VALUE_MAP_ENTRY_85_FOR_VALUE_ENTRY_Battery_Charging_Failure;
            }

            if (VALUE_ENTRY_Disk_Failure.equals(value)) {
                return VALUE_MAP_ENTRY_86_FOR_VALUE_ENTRY_Disk_Failure;
            }

            if (VALUE_ENTRY_Frequency_Hopping_Failure.equals(value)) {
                return VALUE_MAP_ENTRY_87_FOR_VALUE_ENTRY_Frequency_Hopping_Failure;
            }

            if (VALUE_ENTRY_Loss_of_Redundancy.equals(value)) {
                return VALUE_MAP_ENTRY_88_FOR_VALUE_ENTRY_Loss_of_Redundancy;
            }

            if (VALUE_ENTRY_Power_Supply_Failure.equals(value)) {
                return VALUE_MAP_ENTRY_89_FOR_VALUE_ENTRY_Power_Supply_Failure;
            }

            if (VALUE_ENTRY_Signal_Quality_Problem.equals(value)) {
                return VALUE_MAP_ENTRY_90_FOR_VALUE_ENTRY_Signal_Quality_Problem;
            }

            if (VALUE_ENTRY_Battery_Discharging.equals(value)) {
                return VALUE_MAP_ENTRY_91_FOR_VALUE_ENTRY_Battery_Discharging;
            }

            if (VALUE_ENTRY_Battery_Failure.equals(value)) {
                return VALUE_MAP_ENTRY_92_FOR_VALUE_ENTRY_Battery_Failure;
            }

            if (VALUE_ENTRY_Commercial_Power_Problem.equals(value)) {
                return VALUE_MAP_ENTRY_93_FOR_VALUE_ENTRY_Commercial_Power_Problem;
            }

            if (VALUE_ENTRY_Fan_Failure.equals(value)) {
                return VALUE_MAP_ENTRY_94_FOR_VALUE_ENTRY_Fan_Failure;
            }

            if (VALUE_ENTRY_Engine_Failure.equals(value)) {
                return VALUE_MAP_ENTRY_95_FOR_VALUE_ENTRY_Engine_Failure;
            }

            if (VALUE_ENTRY_Sensor_Failure.equals(value)) {
                return VALUE_MAP_ENTRY_96_FOR_VALUE_ENTRY_Sensor_Failure;
            }

            if (VALUE_ENTRY_Fuse_Failure.equals(value)) {
                return VALUE_MAP_ENTRY_97_FOR_VALUE_ENTRY_Fuse_Failure;
            }

            if (VALUE_ENTRY_Generator_Failure.equals(value)) {
                return VALUE_MAP_ENTRY_98_FOR_VALUE_ENTRY_Generator_Failure;
            }

            if (VALUE_ENTRY_Low_Battery.equals(value)) {
                return VALUE_MAP_ENTRY_99_FOR_VALUE_ENTRY_Low_Battery;
            }

            if (VALUE_ENTRY_Low_Fuel.equals(value)) {
                return VALUE_MAP_ENTRY_100_FOR_VALUE_ENTRY_Low_Fuel;
            }

            if (VALUE_ENTRY_Low_Water.equals(value)) {
                return VALUE_MAP_ENTRY_101_FOR_VALUE_ENTRY_Low_Water;
            }

            if (VALUE_ENTRY_Explosive_Gas.equals(value)) {
                return VALUE_MAP_ENTRY_102_FOR_VALUE_ENTRY_Explosive_Gas;
            }

            if (VALUE_ENTRY_High_Winds.equals(value)) {
                return VALUE_MAP_ENTRY_103_FOR_VALUE_ENTRY_High_Winds;
            }

            if (VALUE_ENTRY_Ice_Buildup.equals(value)) {
                return VALUE_MAP_ENTRY_104_FOR_VALUE_ENTRY_Ice_Buildup;
            }

            if (VALUE_ENTRY_Smoke.equals(value)) {
                return VALUE_MAP_ENTRY_105_FOR_VALUE_ENTRY_Smoke;
            }

            if (VALUE_ENTRY_Memory_Mismatch.equals(value)) {
                return VALUE_MAP_ENTRY_106_FOR_VALUE_ENTRY_Memory_Mismatch;
            }

            if (VALUE_ENTRY_Out_of_CPU_Cycles.equals(value)) {
                return VALUE_MAP_ENTRY_107_FOR_VALUE_ENTRY_Out_of_CPU_Cycles;
            }

            if (VALUE_ENTRY_Software_Environment_Problem.equals(value)) {
                return VALUE_MAP_ENTRY_108_FOR_VALUE_ENTRY_Software_Environment_Problem;
            }

            if (VALUE_ENTRY_Software_Download_Failure.equals(value)) {
                return VALUE_MAP_ENTRY_109_FOR_VALUE_ENTRY_Software_Download_Failure;
            }

            if (VALUE_ENTRY_Element_Reinitialized.equals(value)) {
                return VALUE_MAP_ENTRY_110_FOR_VALUE_ENTRY_Element_Reinitialized;
            }

            if (VALUE_ENTRY_Timeout.equals(value)) {
                return VALUE_MAP_ENTRY_111_FOR_VALUE_ENTRY_Timeout;
            }

            if (VALUE_ENTRY_Logging_Problems.equals(value)) {
                return VALUE_MAP_ENTRY_112_FOR_VALUE_ENTRY_Logging_Problems;
            }

            if (VALUE_ENTRY_Leak_Detected.equals(value)) {
                return VALUE_MAP_ENTRY_113_FOR_VALUE_ENTRY_Leak_Detected;
            }

            if (VALUE_ENTRY_Protection_Mechanism_Failure.equals(value)) {
                return VALUE_MAP_ENTRY_114_FOR_VALUE_ENTRY_Protection_Mechanism_Failure;
            }

            if (VALUE_ENTRY_Protecting_Resource_Failure.equals(value)) {
                return VALUE_MAP_ENTRY_115_FOR_VALUE_ENTRY_Protecting_Resource_Failure;
            }

            if (VALUE_ENTRY_Database_Inconsistency.equals(value)) {
                return VALUE_MAP_ENTRY_116_FOR_VALUE_ENTRY_Database_Inconsistency;
            }

            if (VALUE_ENTRY_Authentication_Failure.equals(value)) {
                return VALUE_MAP_ENTRY_117_FOR_VALUE_ENTRY_Authentication_Failure;
            }

            if (VALUE_ENTRY_Breach_of_Confidentiality.equals(value)) {
                return VALUE_MAP_ENTRY_118_FOR_VALUE_ENTRY_Breach_of_Confidentiality;
            }

            if (VALUE_ENTRY_Cable_Tamper.equals(value)) {
                return VALUE_MAP_ENTRY_119_FOR_VALUE_ENTRY_Cable_Tamper;
            }

            if (VALUE_ENTRY_Delayed_Information.equals(value)) {
                return VALUE_MAP_ENTRY_120_FOR_VALUE_ENTRY_Delayed_Information;
            }

            if (VALUE_ENTRY_Duplicate_Information.equals(value)) {
                return VALUE_MAP_ENTRY_121_FOR_VALUE_ENTRY_Duplicate_Information;
            }

            if (VALUE_ENTRY_Information_Missing.equals(value)) {
                return VALUE_MAP_ENTRY_122_FOR_VALUE_ENTRY_Information_Missing;
            }

            if (VALUE_ENTRY_Information_Modification.equals(value)) {
                return VALUE_MAP_ENTRY_123_FOR_VALUE_ENTRY_Information_Modification;
            }

            if (VALUE_ENTRY_Information_Out_of_Sequence.equals(value)) {
                return VALUE_MAP_ENTRY_124_FOR_VALUE_ENTRY_Information_Out_of_Sequence;
            }

            if (VALUE_ENTRY_Key_Expired.equals(value)) {
                return VALUE_MAP_ENTRY_125_FOR_VALUE_ENTRY_Key_Expired;
            }

            if (VALUE_ENTRY_Non_Repudiation_Failure.equals(value)) {
                return VALUE_MAP_ENTRY_126_FOR_VALUE_ENTRY_Non_Repudiation_Failure;
            }

            if (VALUE_ENTRY_Out_of_Hours_Activity.equals(value)) {
                return VALUE_MAP_ENTRY_127_FOR_VALUE_ENTRY_Out_of_Hours_Activity;
            }

            if (VALUE_ENTRY_Out_of_Service.equals(value)) {
                return VALUE_MAP_ENTRY_128_FOR_VALUE_ENTRY_Out_of_Service;
            }

            if (VALUE_ENTRY_Procedural_Error.equals(value)) {
                return VALUE_MAP_ENTRY_129_FOR_VALUE_ENTRY_Procedural_Error;
            }

            if (VALUE_ENTRY_Unexpected_Information.equals(value)) {
                return VALUE_MAP_ENTRY_130_FOR_VALUE_ENTRY_Unexpected_Information;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Adapter_Card_Error.intValue()) {
                return VALUE_ENTRY_Adapter_Card_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Application_Subsystem_Failure
                    .intValue()) {
                return VALUE_ENTRY_Application_Subsystem_Failure;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Bandwidth_Reduced.intValue()) {
                return VALUE_ENTRY_Bandwidth_Reduced;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Connection_Establishment_Error
                    .intValue()) {
                return VALUE_ENTRY_Connection_Establishment_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Communications_Protocol_Error
                    .intValue()) {
                return VALUE_ENTRY_Communications_Protocol_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Communications_Subsystem_Failure
                    .intValue()) {
                return VALUE_ENTRY_Communications_Subsystem_Failure;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Configuration_Customization_Error
                    .intValue()) {
                return VALUE_ENTRY_Configuration_Customization_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Congestion.intValue()) {
                return VALUE_ENTRY_Congestion;
            }

            if (iValue == VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Corrupt_Data.intValue()) {
                return VALUE_ENTRY_Corrupt_Data;
            }

            if (iValue == VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_CPU_Cycles_Limit_Exceeded.intValue()) {
                return VALUE_ENTRY_CPU_Cycles_Limit_Exceeded;
            }

            if (iValue == VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Dataset_Modem_Error.intValue()) {
                return VALUE_ENTRY_Dataset_Modem_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Degraded_Signal.intValue()) {
                return VALUE_ENTRY_Degraded_Signal;
            }

            if (iValue == VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_DTE_DCE_Interface_Error.intValue()) {
                return VALUE_ENTRY_DTE_DCE_Interface_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Enclosure_Door_Open.intValue()) {
                return VALUE_ENTRY_Enclosure_Door_Open;
            }

            if (iValue == VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_Equipment_Malfunction.intValue()) {
                return VALUE_ENTRY_Equipment_Malfunction;
            }

            if (iValue == VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_Excessive_Vibration.intValue()) {
                return VALUE_ENTRY_Excessive_Vibration;
            }

            if (iValue == VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_File_Format_Error.intValue()) {
                return VALUE_ENTRY_File_Format_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_Fire_Detected.intValue()) {
                return VALUE_ENTRY_Fire_Detected;
            }

            if (iValue == VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_Flood_Detected.intValue()) {
                return VALUE_ENTRY_Flood_Detected;
            }

            if (iValue == VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_Framing_Error.intValue()) {
                return VALUE_ENTRY_Framing_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_HVAC_Problem.intValue()) {
                return VALUE_ENTRY_HVAC_Problem;
            }

            if (iValue == VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_Humidity_Unacceptable.intValue()) {
                return VALUE_ENTRY_Humidity_Unacceptable;
            }

            if (iValue == VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_I_O_Device_Error.intValue()) {
                return VALUE_ENTRY_I_O_Device_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_Input_Device_Error.intValue()) {
                return VALUE_ENTRY_Input_Device_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_LAN_Error.intValue()) {
                return VALUE_ENTRY_LAN_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_Non_Toxic_Leak_Detected.intValue()) {
                return VALUE_ENTRY_Non_Toxic_Leak_Detected;
            }

            if (iValue == VALUE_MAP_ENTRY_28_FOR_VALUE_ENTRY_Local_Node_Transmission_Error
                    .intValue()) {
                return VALUE_ENTRY_Local_Node_Transmission_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_29_FOR_VALUE_ENTRY_Loss_of_Frame.intValue()) {
                return VALUE_ENTRY_Loss_of_Frame;
            }

            if (iValue == VALUE_MAP_ENTRY_30_FOR_VALUE_ENTRY_Loss_of_Signal.intValue()) {
                return VALUE_ENTRY_Loss_of_Signal;
            }

            if (iValue == VALUE_MAP_ENTRY_31_FOR_VALUE_ENTRY_Material_Supply_Exhausted.intValue()) {
                return VALUE_ENTRY_Material_Supply_Exhausted;
            }

            if (iValue == VALUE_MAP_ENTRY_32_FOR_VALUE_ENTRY_Multiplexer_Problem.intValue()) {
                return VALUE_ENTRY_Multiplexer_Problem;
            }

            if (iValue == VALUE_MAP_ENTRY_33_FOR_VALUE_ENTRY_Out_of_Memory.intValue()) {
                return VALUE_ENTRY_Out_of_Memory;
            }

            if (iValue == VALUE_MAP_ENTRY_34_FOR_VALUE_ENTRY_Output_Device_Error.intValue()) {
                return VALUE_ENTRY_Output_Device_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_35_FOR_VALUE_ENTRY_Performance_Degraded.intValue()) {
                return VALUE_ENTRY_Performance_Degraded;
            }

            if (iValue == VALUE_MAP_ENTRY_36_FOR_VALUE_ENTRY_Power_Problem.intValue()) {
                return VALUE_ENTRY_Power_Problem;
            }

            if (iValue == VALUE_MAP_ENTRY_37_FOR_VALUE_ENTRY_Pressure_Unacceptable.intValue()) {
                return VALUE_ENTRY_Pressure_Unacceptable;
            }

            if (iValue == VALUE_MAP_ENTRY_38_FOR_VALUE_ENTRY_Processor_Problem__Internal_Machine_Error_
                    .intValue()) {
                return VALUE_ENTRY_Processor_Problem__Internal_Machine_Error_;
            }

            if (iValue == VALUE_MAP_ENTRY_39_FOR_VALUE_ENTRY_Pump_Failure.intValue()) {
                return VALUE_ENTRY_Pump_Failure;
            }

            if (iValue == VALUE_MAP_ENTRY_40_FOR_VALUE_ENTRY_Queue_Size_Exceeded.intValue()) {
                return VALUE_ENTRY_Queue_Size_Exceeded;
            }

            if (iValue == VALUE_MAP_ENTRY_41_FOR_VALUE_ENTRY_Receive_Failure.intValue()) {
                return VALUE_ENTRY_Receive_Failure;
            }

            if (iValue == VALUE_MAP_ENTRY_42_FOR_VALUE_ENTRY_Receiver_Failure.intValue()) {
                return VALUE_ENTRY_Receiver_Failure;
            }

            if (iValue == VALUE_MAP_ENTRY_43_FOR_VALUE_ENTRY_Remote_Node_Transmission_Error
                    .intValue()) {
                return VALUE_ENTRY_Remote_Node_Transmission_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_44_FOR_VALUE_ENTRY_Resource_at_or_Nearing_Capacity
                    .intValue()) {
                return VALUE_ENTRY_Resource_at_or_Nearing_Capacity;
            }

            if (iValue == VALUE_MAP_ENTRY_45_FOR_VALUE_ENTRY_Response_Time_Excessive.intValue()) {
                return VALUE_ENTRY_Response_Time_Excessive;
            }

            if (iValue == VALUE_MAP_ENTRY_46_FOR_VALUE_ENTRY_Retransmission_Rate_Excessive
                    .intValue()) {
                return VALUE_ENTRY_Retransmission_Rate_Excessive;
            }

            if (iValue == VALUE_MAP_ENTRY_47_FOR_VALUE_ENTRY_Software_Error.intValue()) {
                return VALUE_ENTRY_Software_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_48_FOR_VALUE_ENTRY_Software_Program_Abnormally_Terminated
                    .intValue()) {
                return VALUE_ENTRY_Software_Program_Abnormally_Terminated;
            }

            if (iValue == VALUE_MAP_ENTRY_49_FOR_VALUE_ENTRY_Software_Program_Error__Incorrect_Results_
                    .intValue()) {
                return VALUE_ENTRY_Software_Program_Error__Incorrect_Results_;
            }

            if (iValue == VALUE_MAP_ENTRY_50_FOR_VALUE_ENTRY_Storage_Capacity_Problem.intValue()) {
                return VALUE_ENTRY_Storage_Capacity_Problem;
            }

            if (iValue == VALUE_MAP_ENTRY_51_FOR_VALUE_ENTRY_Temperature_Unacceptable.intValue()) {
                return VALUE_ENTRY_Temperature_Unacceptable;
            }

            if (iValue == VALUE_MAP_ENTRY_52_FOR_VALUE_ENTRY_Threshold_Crossed.intValue()) {
                return VALUE_ENTRY_Threshold_Crossed;
            }

            if (iValue == VALUE_MAP_ENTRY_53_FOR_VALUE_ENTRY_Timing_Problem.intValue()) {
                return VALUE_ENTRY_Timing_Problem;
            }

            if (iValue == VALUE_MAP_ENTRY_54_FOR_VALUE_ENTRY_Toxic_Leak_Detected.intValue()) {
                return VALUE_ENTRY_Toxic_Leak_Detected;
            }

            if (iValue == VALUE_MAP_ENTRY_55_FOR_VALUE_ENTRY_Transmit_Failure.intValue()) {
                return VALUE_ENTRY_Transmit_Failure;
            }

            if (iValue == VALUE_MAP_ENTRY_56_FOR_VALUE_ENTRY_Transmitter_Failure.intValue()) {
                return VALUE_ENTRY_Transmitter_Failure;
            }

            if (iValue == VALUE_MAP_ENTRY_57_FOR_VALUE_ENTRY_Underlying_Resource_Unavailable
                    .intValue()) {
                return VALUE_ENTRY_Underlying_Resource_Unavailable;
            }

            if (iValue == VALUE_MAP_ENTRY_58_FOR_VALUE_ENTRY_Version_MisMatch.intValue()) {
                return VALUE_ENTRY_Version_MisMatch;
            }

            if (iValue == VALUE_MAP_ENTRY_59_FOR_VALUE_ENTRY_Previous_Alert_Cleared.intValue()) {
                return VALUE_ENTRY_Previous_Alert_Cleared;
            }

            if (iValue == VALUE_MAP_ENTRY_60_FOR_VALUE_ENTRY_Login_Attempts_Failed.intValue()) {
                return VALUE_ENTRY_Login_Attempts_Failed;
            }

            if (iValue == VALUE_MAP_ENTRY_61_FOR_VALUE_ENTRY_Software_Virus_Detected.intValue()) {
                return VALUE_ENTRY_Software_Virus_Detected;
            }

            if (iValue == VALUE_MAP_ENTRY_62_FOR_VALUE_ENTRY_Hardware_Security_Breached.intValue()) {
                return VALUE_ENTRY_Hardware_Security_Breached;
            }

            if (iValue == VALUE_MAP_ENTRY_63_FOR_VALUE_ENTRY_Denial_of_Service_Detected.intValue()) {
                return VALUE_ENTRY_Denial_of_Service_Detected;
            }

            if (iValue == VALUE_MAP_ENTRY_64_FOR_VALUE_ENTRY_Security_Credential_MisMatch
                    .intValue()) {
                return VALUE_ENTRY_Security_Credential_MisMatch;
            }

            if (iValue == VALUE_MAP_ENTRY_65_FOR_VALUE_ENTRY_Unauthorized_Access.intValue()) {
                return VALUE_ENTRY_Unauthorized_Access;
            }

            if (iValue == VALUE_MAP_ENTRY_66_FOR_VALUE_ENTRY_Alarm_Received.intValue()) {
                return VALUE_ENTRY_Alarm_Received;
            }

            if (iValue == VALUE_MAP_ENTRY_67_FOR_VALUE_ENTRY_Loss_of_Pointer.intValue()) {
                return VALUE_ENTRY_Loss_of_Pointer;
            }

            if (iValue == VALUE_MAP_ENTRY_68_FOR_VALUE_ENTRY_Payload_Mismatch.intValue()) {
                return VALUE_ENTRY_Payload_Mismatch;
            }

            if (iValue == VALUE_MAP_ENTRY_69_FOR_VALUE_ENTRY_Transmission_Error.intValue()) {
                return VALUE_ENTRY_Transmission_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_70_FOR_VALUE_ENTRY_Excessive_Error_Rate.intValue()) {
                return VALUE_ENTRY_Excessive_Error_Rate;
            }

            if (iValue == VALUE_MAP_ENTRY_71_FOR_VALUE_ENTRY_Trace_Problem.intValue()) {
                return VALUE_ENTRY_Trace_Problem;
            }

            if (iValue == VALUE_MAP_ENTRY_72_FOR_VALUE_ENTRY_Element_Unavailable.intValue()) {
                return VALUE_ENTRY_Element_Unavailable;
            }

            if (iValue == VALUE_MAP_ENTRY_73_FOR_VALUE_ENTRY_Element_Missing.intValue()) {
                return VALUE_ENTRY_Element_Missing;
            }

            if (iValue == VALUE_MAP_ENTRY_74_FOR_VALUE_ENTRY_Loss_of_Multi_Frame.intValue()) {
                return VALUE_ENTRY_Loss_of_Multi_Frame;
            }

            if (iValue == VALUE_MAP_ENTRY_75_FOR_VALUE_ENTRY_Broadcast_Channel_Failure.intValue()) {
                return VALUE_ENTRY_Broadcast_Channel_Failure;
            }

            if (iValue == VALUE_MAP_ENTRY_76_FOR_VALUE_ENTRY_Invalid_Message_Received.intValue()) {
                return VALUE_ENTRY_Invalid_Message_Received;
            }

            if (iValue == VALUE_MAP_ENTRY_77_FOR_VALUE_ENTRY_Routing_Failure.intValue()) {
                return VALUE_ENTRY_Routing_Failure;
            }

            if (iValue == VALUE_MAP_ENTRY_78_FOR_VALUE_ENTRY_Backplane_Failure.intValue()) {
                return VALUE_ENTRY_Backplane_Failure;
            }

            if (iValue == VALUE_MAP_ENTRY_79_FOR_VALUE_ENTRY_Identifier_Duplication.intValue()) {
                return VALUE_ENTRY_Identifier_Duplication;
            }

            if (iValue == VALUE_MAP_ENTRY_80_FOR_VALUE_ENTRY_Protection_Path_Failure.intValue()) {
                return VALUE_ENTRY_Protection_Path_Failure;
            }

            if (iValue == VALUE_MAP_ENTRY_81_FOR_VALUE_ENTRY_Sync_Loss_or_Mismatch.intValue()) {
                return VALUE_ENTRY_Sync_Loss_or_Mismatch;
            }

            if (iValue == VALUE_MAP_ENTRY_82_FOR_VALUE_ENTRY_Terminal_Problem.intValue()) {
                return VALUE_ENTRY_Terminal_Problem;
            }

            if (iValue == VALUE_MAP_ENTRY_83_FOR_VALUE_ENTRY_Real_Time_Clock_Failure.intValue()) {
                return VALUE_ENTRY_Real_Time_Clock_Failure;
            }

            if (iValue == VALUE_MAP_ENTRY_84_FOR_VALUE_ENTRY_Antenna_Failure.intValue()) {
                return VALUE_ENTRY_Antenna_Failure;
            }

            if (iValue == VALUE_MAP_ENTRY_85_FOR_VALUE_ENTRY_Battery_Charging_Failure.intValue()) {
                return VALUE_ENTRY_Battery_Charging_Failure;
            }

            if (iValue == VALUE_MAP_ENTRY_86_FOR_VALUE_ENTRY_Disk_Failure.intValue()) {
                return VALUE_ENTRY_Disk_Failure;
            }

            if (iValue == VALUE_MAP_ENTRY_87_FOR_VALUE_ENTRY_Frequency_Hopping_Failure.intValue()) {
                return VALUE_ENTRY_Frequency_Hopping_Failure;
            }

            if (iValue == VALUE_MAP_ENTRY_88_FOR_VALUE_ENTRY_Loss_of_Redundancy.intValue()) {
                return VALUE_ENTRY_Loss_of_Redundancy;
            }

            if (iValue == VALUE_MAP_ENTRY_89_FOR_VALUE_ENTRY_Power_Supply_Failure.intValue()) {
                return VALUE_ENTRY_Power_Supply_Failure;
            }

            if (iValue == VALUE_MAP_ENTRY_90_FOR_VALUE_ENTRY_Signal_Quality_Problem.intValue()) {
                return VALUE_ENTRY_Signal_Quality_Problem;
            }

            if (iValue == VALUE_MAP_ENTRY_91_FOR_VALUE_ENTRY_Battery_Discharging.intValue()) {
                return VALUE_ENTRY_Battery_Discharging;
            }

            if (iValue == VALUE_MAP_ENTRY_92_FOR_VALUE_ENTRY_Battery_Failure.intValue()) {
                return VALUE_ENTRY_Battery_Failure;
            }

            if (iValue == VALUE_MAP_ENTRY_93_FOR_VALUE_ENTRY_Commercial_Power_Problem.intValue()) {
                return VALUE_ENTRY_Commercial_Power_Problem;
            }

            if (iValue == VALUE_MAP_ENTRY_94_FOR_VALUE_ENTRY_Fan_Failure.intValue()) {
                return VALUE_ENTRY_Fan_Failure;
            }

            if (iValue == VALUE_MAP_ENTRY_95_FOR_VALUE_ENTRY_Engine_Failure.intValue()) {
                return VALUE_ENTRY_Engine_Failure;
            }

            if (iValue == VALUE_MAP_ENTRY_96_FOR_VALUE_ENTRY_Sensor_Failure.intValue()) {
                return VALUE_ENTRY_Sensor_Failure;
            }

            if (iValue == VALUE_MAP_ENTRY_97_FOR_VALUE_ENTRY_Fuse_Failure.intValue()) {
                return VALUE_ENTRY_Fuse_Failure;
            }

            if (iValue == VALUE_MAP_ENTRY_98_FOR_VALUE_ENTRY_Generator_Failure.intValue()) {
                return VALUE_ENTRY_Generator_Failure;
            }

            if (iValue == VALUE_MAP_ENTRY_99_FOR_VALUE_ENTRY_Low_Battery.intValue()) {
                return VALUE_ENTRY_Low_Battery;
            }

            if (iValue == VALUE_MAP_ENTRY_100_FOR_VALUE_ENTRY_Low_Fuel.intValue()) {
                return VALUE_ENTRY_Low_Fuel;
            }

            if (iValue == VALUE_MAP_ENTRY_101_FOR_VALUE_ENTRY_Low_Water.intValue()) {
                return VALUE_ENTRY_Low_Water;
            }

            if (iValue == VALUE_MAP_ENTRY_102_FOR_VALUE_ENTRY_Explosive_Gas.intValue()) {
                return VALUE_ENTRY_Explosive_Gas;
            }

            if (iValue == VALUE_MAP_ENTRY_103_FOR_VALUE_ENTRY_High_Winds.intValue()) {
                return VALUE_ENTRY_High_Winds;
            }

            if (iValue == VALUE_MAP_ENTRY_104_FOR_VALUE_ENTRY_Ice_Buildup.intValue()) {
                return VALUE_ENTRY_Ice_Buildup;
            }

            if (iValue == VALUE_MAP_ENTRY_105_FOR_VALUE_ENTRY_Smoke.intValue()) {
                return VALUE_ENTRY_Smoke;
            }

            if (iValue == VALUE_MAP_ENTRY_106_FOR_VALUE_ENTRY_Memory_Mismatch.intValue()) {
                return VALUE_ENTRY_Memory_Mismatch;
            }

            if (iValue == VALUE_MAP_ENTRY_107_FOR_VALUE_ENTRY_Out_of_CPU_Cycles.intValue()) {
                return VALUE_ENTRY_Out_of_CPU_Cycles;
            }

            if (iValue == VALUE_MAP_ENTRY_108_FOR_VALUE_ENTRY_Software_Environment_Problem
                    .intValue()) {
                return VALUE_ENTRY_Software_Environment_Problem;
            }

            if (iValue == VALUE_MAP_ENTRY_109_FOR_VALUE_ENTRY_Software_Download_Failure.intValue()) {
                return VALUE_ENTRY_Software_Download_Failure;
            }

            if (iValue == VALUE_MAP_ENTRY_110_FOR_VALUE_ENTRY_Element_Reinitialized.intValue()) {
                return VALUE_ENTRY_Element_Reinitialized;
            }

            if (iValue == VALUE_MAP_ENTRY_111_FOR_VALUE_ENTRY_Timeout.intValue()) {
                return VALUE_ENTRY_Timeout;
            }

            if (iValue == VALUE_MAP_ENTRY_112_FOR_VALUE_ENTRY_Logging_Problems.intValue()) {
                return VALUE_ENTRY_Logging_Problems;
            }

            if (iValue == VALUE_MAP_ENTRY_113_FOR_VALUE_ENTRY_Leak_Detected.intValue()) {
                return VALUE_ENTRY_Leak_Detected;
            }

            if (iValue == VALUE_MAP_ENTRY_114_FOR_VALUE_ENTRY_Protection_Mechanism_Failure
                    .intValue()) {
                return VALUE_ENTRY_Protection_Mechanism_Failure;
            }

            if (iValue == VALUE_MAP_ENTRY_115_FOR_VALUE_ENTRY_Protecting_Resource_Failure
                    .intValue()) {
                return VALUE_ENTRY_Protecting_Resource_Failure;
            }

            if (iValue == VALUE_MAP_ENTRY_116_FOR_VALUE_ENTRY_Database_Inconsistency.intValue()) {
                return VALUE_ENTRY_Database_Inconsistency;
            }

            if (iValue == VALUE_MAP_ENTRY_117_FOR_VALUE_ENTRY_Authentication_Failure.intValue()) {
                return VALUE_ENTRY_Authentication_Failure;
            }

            if (iValue == VALUE_MAP_ENTRY_118_FOR_VALUE_ENTRY_Breach_of_Confidentiality.intValue()) {
                return VALUE_ENTRY_Breach_of_Confidentiality;
            }

            if (iValue == VALUE_MAP_ENTRY_119_FOR_VALUE_ENTRY_Cable_Tamper.intValue()) {
                return VALUE_ENTRY_Cable_Tamper;
            }

            if (iValue == VALUE_MAP_ENTRY_120_FOR_VALUE_ENTRY_Delayed_Information.intValue()) {
                return VALUE_ENTRY_Delayed_Information;
            }

            if (iValue == VALUE_MAP_ENTRY_121_FOR_VALUE_ENTRY_Duplicate_Information.intValue()) {
                return VALUE_ENTRY_Duplicate_Information;
            }

            if (iValue == VALUE_MAP_ENTRY_122_FOR_VALUE_ENTRY_Information_Missing.intValue()) {
                return VALUE_ENTRY_Information_Missing;
            }

            if (iValue == VALUE_MAP_ENTRY_123_FOR_VALUE_ENTRY_Information_Modification.intValue()) {
                return VALUE_ENTRY_Information_Modification;
            }

            if (iValue == VALUE_MAP_ENTRY_124_FOR_VALUE_ENTRY_Information_Out_of_Sequence
                    .intValue()) {
                return VALUE_ENTRY_Information_Out_of_Sequence;
            }

            if (iValue == VALUE_MAP_ENTRY_125_FOR_VALUE_ENTRY_Key_Expired.intValue()) {
                return VALUE_ENTRY_Key_Expired;
            }

            if (iValue == VALUE_MAP_ENTRY_126_FOR_VALUE_ENTRY_Non_Repudiation_Failure.intValue()) {
                return VALUE_ENTRY_Non_Repudiation_Failure;
            }

            if (iValue == VALUE_MAP_ENTRY_127_FOR_VALUE_ENTRY_Out_of_Hours_Activity.intValue()) {
                return VALUE_ENTRY_Out_of_Hours_Activity;
            }

            if (iValue == VALUE_MAP_ENTRY_128_FOR_VALUE_ENTRY_Out_of_Service.intValue()) {
                return VALUE_ENTRY_Out_of_Service;
            }

            if (iValue == VALUE_MAP_ENTRY_129_FOR_VALUE_ENTRY_Procedural_Error.intValue()) {
                return VALUE_ENTRY_Procedural_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_130_FOR_VALUE_ENTRY_Unexpected_Information.intValue()) {
                return VALUE_ENTRY_Unexpected_Information;
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
         * Value Map for the property ProbableCause   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Adapter_Card_Error,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Application_Subsystem_Failure,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Bandwidth_Reduced,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Connection_Establishment_Error,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Communications_Protocol_Error,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Communications_Subsystem_Failure,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Configuration_Customization_Error,
                VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Congestion,
                VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Corrupt_Data,
                VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_CPU_Cycles_Limit_Exceeded,
                VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Dataset_Modem_Error,
                VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Degraded_Signal,
                VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_DTE_DCE_Interface_Error,
                VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Enclosure_Door_Open,
                VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_Equipment_Malfunction,
                VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_Excessive_Vibration,
                VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_File_Format_Error,
                VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_Fire_Detected,
                VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_Flood_Detected,
                VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_Framing_Error,
                VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_HVAC_Problem,
                VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_Humidity_Unacceptable,
                VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_I_O_Device_Error,
                VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_Input_Device_Error,
                VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_LAN_Error,
                VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_Non_Toxic_Leak_Detected,
                VALUE_MAP_ENTRY_28_FOR_VALUE_ENTRY_Local_Node_Transmission_Error,
                VALUE_MAP_ENTRY_29_FOR_VALUE_ENTRY_Loss_of_Frame,
                VALUE_MAP_ENTRY_30_FOR_VALUE_ENTRY_Loss_of_Signal,
                VALUE_MAP_ENTRY_31_FOR_VALUE_ENTRY_Material_Supply_Exhausted,
                VALUE_MAP_ENTRY_32_FOR_VALUE_ENTRY_Multiplexer_Problem,
                VALUE_MAP_ENTRY_33_FOR_VALUE_ENTRY_Out_of_Memory,
                VALUE_MAP_ENTRY_34_FOR_VALUE_ENTRY_Output_Device_Error,
                VALUE_MAP_ENTRY_35_FOR_VALUE_ENTRY_Performance_Degraded,
                VALUE_MAP_ENTRY_36_FOR_VALUE_ENTRY_Power_Problem,
                VALUE_MAP_ENTRY_37_FOR_VALUE_ENTRY_Pressure_Unacceptable,
                VALUE_MAP_ENTRY_38_FOR_VALUE_ENTRY_Processor_Problem__Internal_Machine_Error_,
                VALUE_MAP_ENTRY_39_FOR_VALUE_ENTRY_Pump_Failure,
                VALUE_MAP_ENTRY_40_FOR_VALUE_ENTRY_Queue_Size_Exceeded,
                VALUE_MAP_ENTRY_41_FOR_VALUE_ENTRY_Receive_Failure,
                VALUE_MAP_ENTRY_42_FOR_VALUE_ENTRY_Receiver_Failure,
                VALUE_MAP_ENTRY_43_FOR_VALUE_ENTRY_Remote_Node_Transmission_Error,
                VALUE_MAP_ENTRY_44_FOR_VALUE_ENTRY_Resource_at_or_Nearing_Capacity,
                VALUE_MAP_ENTRY_45_FOR_VALUE_ENTRY_Response_Time_Excessive,
                VALUE_MAP_ENTRY_46_FOR_VALUE_ENTRY_Retransmission_Rate_Excessive,
                VALUE_MAP_ENTRY_47_FOR_VALUE_ENTRY_Software_Error,
                VALUE_MAP_ENTRY_48_FOR_VALUE_ENTRY_Software_Program_Abnormally_Terminated,
                VALUE_MAP_ENTRY_49_FOR_VALUE_ENTRY_Software_Program_Error__Incorrect_Results_,
                VALUE_MAP_ENTRY_50_FOR_VALUE_ENTRY_Storage_Capacity_Problem,
                VALUE_MAP_ENTRY_51_FOR_VALUE_ENTRY_Temperature_Unacceptable,
                VALUE_MAP_ENTRY_52_FOR_VALUE_ENTRY_Threshold_Crossed,
                VALUE_MAP_ENTRY_53_FOR_VALUE_ENTRY_Timing_Problem,
                VALUE_MAP_ENTRY_54_FOR_VALUE_ENTRY_Toxic_Leak_Detected,
                VALUE_MAP_ENTRY_55_FOR_VALUE_ENTRY_Transmit_Failure,
                VALUE_MAP_ENTRY_56_FOR_VALUE_ENTRY_Transmitter_Failure,
                VALUE_MAP_ENTRY_57_FOR_VALUE_ENTRY_Underlying_Resource_Unavailable,
                VALUE_MAP_ENTRY_58_FOR_VALUE_ENTRY_Version_MisMatch,
                VALUE_MAP_ENTRY_59_FOR_VALUE_ENTRY_Previous_Alert_Cleared,
                VALUE_MAP_ENTRY_60_FOR_VALUE_ENTRY_Login_Attempts_Failed,
                VALUE_MAP_ENTRY_61_FOR_VALUE_ENTRY_Software_Virus_Detected,
                VALUE_MAP_ENTRY_62_FOR_VALUE_ENTRY_Hardware_Security_Breached,
                VALUE_MAP_ENTRY_63_FOR_VALUE_ENTRY_Denial_of_Service_Detected,
                VALUE_MAP_ENTRY_64_FOR_VALUE_ENTRY_Security_Credential_MisMatch,
                VALUE_MAP_ENTRY_65_FOR_VALUE_ENTRY_Unauthorized_Access,
                VALUE_MAP_ENTRY_66_FOR_VALUE_ENTRY_Alarm_Received,
                VALUE_MAP_ENTRY_67_FOR_VALUE_ENTRY_Loss_of_Pointer,
                VALUE_MAP_ENTRY_68_FOR_VALUE_ENTRY_Payload_Mismatch,
                VALUE_MAP_ENTRY_69_FOR_VALUE_ENTRY_Transmission_Error,
                VALUE_MAP_ENTRY_70_FOR_VALUE_ENTRY_Excessive_Error_Rate,
                VALUE_MAP_ENTRY_71_FOR_VALUE_ENTRY_Trace_Problem,
                VALUE_MAP_ENTRY_72_FOR_VALUE_ENTRY_Element_Unavailable,
                VALUE_MAP_ENTRY_73_FOR_VALUE_ENTRY_Element_Missing,
                VALUE_MAP_ENTRY_74_FOR_VALUE_ENTRY_Loss_of_Multi_Frame,
                VALUE_MAP_ENTRY_75_FOR_VALUE_ENTRY_Broadcast_Channel_Failure,
                VALUE_MAP_ENTRY_76_FOR_VALUE_ENTRY_Invalid_Message_Received,
                VALUE_MAP_ENTRY_77_FOR_VALUE_ENTRY_Routing_Failure,
                VALUE_MAP_ENTRY_78_FOR_VALUE_ENTRY_Backplane_Failure,
                VALUE_MAP_ENTRY_79_FOR_VALUE_ENTRY_Identifier_Duplication,
                VALUE_MAP_ENTRY_80_FOR_VALUE_ENTRY_Protection_Path_Failure,
                VALUE_MAP_ENTRY_81_FOR_VALUE_ENTRY_Sync_Loss_or_Mismatch,
                VALUE_MAP_ENTRY_82_FOR_VALUE_ENTRY_Terminal_Problem,
                VALUE_MAP_ENTRY_83_FOR_VALUE_ENTRY_Real_Time_Clock_Failure,
                VALUE_MAP_ENTRY_84_FOR_VALUE_ENTRY_Antenna_Failure,
                VALUE_MAP_ENTRY_85_FOR_VALUE_ENTRY_Battery_Charging_Failure,
                VALUE_MAP_ENTRY_86_FOR_VALUE_ENTRY_Disk_Failure,
                VALUE_MAP_ENTRY_87_FOR_VALUE_ENTRY_Frequency_Hopping_Failure,
                VALUE_MAP_ENTRY_88_FOR_VALUE_ENTRY_Loss_of_Redundancy,
                VALUE_MAP_ENTRY_89_FOR_VALUE_ENTRY_Power_Supply_Failure,
                VALUE_MAP_ENTRY_90_FOR_VALUE_ENTRY_Signal_Quality_Problem,
                VALUE_MAP_ENTRY_91_FOR_VALUE_ENTRY_Battery_Discharging,
                VALUE_MAP_ENTRY_92_FOR_VALUE_ENTRY_Battery_Failure,
                VALUE_MAP_ENTRY_93_FOR_VALUE_ENTRY_Commercial_Power_Problem,
                VALUE_MAP_ENTRY_94_FOR_VALUE_ENTRY_Fan_Failure,
                VALUE_MAP_ENTRY_95_FOR_VALUE_ENTRY_Engine_Failure,
                VALUE_MAP_ENTRY_96_FOR_VALUE_ENTRY_Sensor_Failure,
                VALUE_MAP_ENTRY_97_FOR_VALUE_ENTRY_Fuse_Failure,
                VALUE_MAP_ENTRY_98_FOR_VALUE_ENTRY_Generator_Failure,
                VALUE_MAP_ENTRY_99_FOR_VALUE_ENTRY_Low_Battery,
                VALUE_MAP_ENTRY_100_FOR_VALUE_ENTRY_Low_Fuel,
                VALUE_MAP_ENTRY_101_FOR_VALUE_ENTRY_Low_Water,
                VALUE_MAP_ENTRY_102_FOR_VALUE_ENTRY_Explosive_Gas,
                VALUE_MAP_ENTRY_103_FOR_VALUE_ENTRY_High_Winds,
                VALUE_MAP_ENTRY_104_FOR_VALUE_ENTRY_Ice_Buildup,
                VALUE_MAP_ENTRY_105_FOR_VALUE_ENTRY_Smoke,
                VALUE_MAP_ENTRY_106_FOR_VALUE_ENTRY_Memory_Mismatch,
                VALUE_MAP_ENTRY_107_FOR_VALUE_ENTRY_Out_of_CPU_Cycles,
                VALUE_MAP_ENTRY_108_FOR_VALUE_ENTRY_Software_Environment_Problem,
                VALUE_MAP_ENTRY_109_FOR_VALUE_ENTRY_Software_Download_Failure,
                VALUE_MAP_ENTRY_110_FOR_VALUE_ENTRY_Element_Reinitialized,
                VALUE_MAP_ENTRY_111_FOR_VALUE_ENTRY_Timeout,
                VALUE_MAP_ENTRY_112_FOR_VALUE_ENTRY_Logging_Problems,
                VALUE_MAP_ENTRY_113_FOR_VALUE_ENTRY_Leak_Detected,
                VALUE_MAP_ENTRY_114_FOR_VALUE_ENTRY_Protection_Mechanism_Failure,
                VALUE_MAP_ENTRY_115_FOR_VALUE_ENTRY_Protecting_Resource_Failure,
                VALUE_MAP_ENTRY_116_FOR_VALUE_ENTRY_Database_Inconsistency,
                VALUE_MAP_ENTRY_117_FOR_VALUE_ENTRY_Authentication_Failure,
                VALUE_MAP_ENTRY_118_FOR_VALUE_ENTRY_Breach_of_Confidentiality,
                VALUE_MAP_ENTRY_119_FOR_VALUE_ENTRY_Cable_Tamper,
                VALUE_MAP_ENTRY_120_FOR_VALUE_ENTRY_Delayed_Information,
                VALUE_MAP_ENTRY_121_FOR_VALUE_ENTRY_Duplicate_Information,
                VALUE_MAP_ENTRY_122_FOR_VALUE_ENTRY_Information_Missing,
                VALUE_MAP_ENTRY_123_FOR_VALUE_ENTRY_Information_Modification,
                VALUE_MAP_ENTRY_124_FOR_VALUE_ENTRY_Information_Out_of_Sequence,
                VALUE_MAP_ENTRY_125_FOR_VALUE_ENTRY_Key_Expired,
                VALUE_MAP_ENTRY_126_FOR_VALUE_ENTRY_Non_Repudiation_Failure,
                VALUE_MAP_ENTRY_127_FOR_VALUE_ENTRY_Out_of_Hours_Activity,
                VALUE_MAP_ENTRY_128_FOR_VALUE_ENTRY_Out_of_Service,
                VALUE_MAP_ENTRY_129_FOR_VALUE_ENTRY_Procedural_Error,
                VALUE_MAP_ENTRY_130_FOR_VALUE_ENTRY_Unexpected_Information };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property ProbableCause   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_Adapter_Card_Error, VALUE_ENTRY_Application_Subsystem_Failure,
                VALUE_ENTRY_Bandwidth_Reduced, VALUE_ENTRY_Connection_Establishment_Error,
                VALUE_ENTRY_Communications_Protocol_Error,
                VALUE_ENTRY_Communications_Subsystem_Failure,
                VALUE_ENTRY_Configuration_Customization_Error, VALUE_ENTRY_Congestion,
                VALUE_ENTRY_Corrupt_Data, VALUE_ENTRY_CPU_Cycles_Limit_Exceeded,
                VALUE_ENTRY_Dataset_Modem_Error, VALUE_ENTRY_Degraded_Signal,
                VALUE_ENTRY_DTE_DCE_Interface_Error, VALUE_ENTRY_Enclosure_Door_Open,
                VALUE_ENTRY_Equipment_Malfunction, VALUE_ENTRY_Excessive_Vibration,
                VALUE_ENTRY_File_Format_Error, VALUE_ENTRY_Fire_Detected,
                VALUE_ENTRY_Flood_Detected, VALUE_ENTRY_Framing_Error, VALUE_ENTRY_HVAC_Problem,
                VALUE_ENTRY_Humidity_Unacceptable, VALUE_ENTRY_I_O_Device_Error,
                VALUE_ENTRY_Input_Device_Error, VALUE_ENTRY_LAN_Error,
                VALUE_ENTRY_Non_Toxic_Leak_Detected, VALUE_ENTRY_Local_Node_Transmission_Error,
                VALUE_ENTRY_Loss_of_Frame, VALUE_ENTRY_Loss_of_Signal,
                VALUE_ENTRY_Material_Supply_Exhausted, VALUE_ENTRY_Multiplexer_Problem,
                VALUE_ENTRY_Out_of_Memory, VALUE_ENTRY_Output_Device_Error,
                VALUE_ENTRY_Performance_Degraded, VALUE_ENTRY_Power_Problem,
                VALUE_ENTRY_Pressure_Unacceptable,
                VALUE_ENTRY_Processor_Problem__Internal_Machine_Error_, VALUE_ENTRY_Pump_Failure,
                VALUE_ENTRY_Queue_Size_Exceeded, VALUE_ENTRY_Receive_Failure,
                VALUE_ENTRY_Receiver_Failure, VALUE_ENTRY_Remote_Node_Transmission_Error,
                VALUE_ENTRY_Resource_at_or_Nearing_Capacity, VALUE_ENTRY_Response_Time_Excessive,
                VALUE_ENTRY_Retransmission_Rate_Excessive, VALUE_ENTRY_Software_Error,
                VALUE_ENTRY_Software_Program_Abnormally_Terminated,
                VALUE_ENTRY_Software_Program_Error__Incorrect_Results_,
                VALUE_ENTRY_Storage_Capacity_Problem, VALUE_ENTRY_Temperature_Unacceptable,
                VALUE_ENTRY_Threshold_Crossed, VALUE_ENTRY_Timing_Problem,
                VALUE_ENTRY_Toxic_Leak_Detected, VALUE_ENTRY_Transmit_Failure,
                VALUE_ENTRY_Transmitter_Failure, VALUE_ENTRY_Underlying_Resource_Unavailable,
                VALUE_ENTRY_Version_MisMatch, VALUE_ENTRY_Previous_Alert_Cleared,
                VALUE_ENTRY_Login_Attempts_Failed, VALUE_ENTRY_Software_Virus_Detected,
                VALUE_ENTRY_Hardware_Security_Breached, VALUE_ENTRY_Denial_of_Service_Detected,
                VALUE_ENTRY_Security_Credential_MisMatch, VALUE_ENTRY_Unauthorized_Access,
                VALUE_ENTRY_Alarm_Received, VALUE_ENTRY_Loss_of_Pointer,
                VALUE_ENTRY_Payload_Mismatch, VALUE_ENTRY_Transmission_Error,
                VALUE_ENTRY_Excessive_Error_Rate, VALUE_ENTRY_Trace_Problem,
                VALUE_ENTRY_Element_Unavailable, VALUE_ENTRY_Element_Missing,
                VALUE_ENTRY_Loss_of_Multi_Frame, VALUE_ENTRY_Broadcast_Channel_Failure,
                VALUE_ENTRY_Invalid_Message_Received, VALUE_ENTRY_Routing_Failure,
                VALUE_ENTRY_Backplane_Failure, VALUE_ENTRY_Identifier_Duplication,
                VALUE_ENTRY_Protection_Path_Failure, VALUE_ENTRY_Sync_Loss_or_Mismatch,
                VALUE_ENTRY_Terminal_Problem, VALUE_ENTRY_Real_Time_Clock_Failure,
                VALUE_ENTRY_Antenna_Failure, VALUE_ENTRY_Battery_Charging_Failure,
                VALUE_ENTRY_Disk_Failure, VALUE_ENTRY_Frequency_Hopping_Failure,
                VALUE_ENTRY_Loss_of_Redundancy, VALUE_ENTRY_Power_Supply_Failure,
                VALUE_ENTRY_Signal_Quality_Problem, VALUE_ENTRY_Battery_Discharging,
                VALUE_ENTRY_Battery_Failure, VALUE_ENTRY_Commercial_Power_Problem,
                VALUE_ENTRY_Fan_Failure, VALUE_ENTRY_Engine_Failure, VALUE_ENTRY_Sensor_Failure,
                VALUE_ENTRY_Fuse_Failure, VALUE_ENTRY_Generator_Failure, VALUE_ENTRY_Low_Battery,
                VALUE_ENTRY_Low_Fuel, VALUE_ENTRY_Low_Water, VALUE_ENTRY_Explosive_Gas,
                VALUE_ENTRY_High_Winds, VALUE_ENTRY_Ice_Buildup, VALUE_ENTRY_Smoke,
                VALUE_ENTRY_Memory_Mismatch, VALUE_ENTRY_Out_of_CPU_Cycles,
                VALUE_ENTRY_Software_Environment_Problem, VALUE_ENTRY_Software_Download_Failure,
                VALUE_ENTRY_Element_Reinitialized, VALUE_ENTRY_Timeout,
                VALUE_ENTRY_Logging_Problems, VALUE_ENTRY_Leak_Detected,
                VALUE_ENTRY_Protection_Mechanism_Failure, VALUE_ENTRY_Protecting_Resource_Failure,
                VALUE_ENTRY_Database_Inconsistency, VALUE_ENTRY_Authentication_Failure,
                VALUE_ENTRY_Breach_of_Confidentiality, VALUE_ENTRY_Cable_Tamper,
                VALUE_ENTRY_Delayed_Information, VALUE_ENTRY_Duplicate_Information,
                VALUE_ENTRY_Information_Missing, VALUE_ENTRY_Information_Modification,
                VALUE_ENTRY_Information_Out_of_Sequence, VALUE_ENTRY_Key_Expired,
                VALUE_ENTRY_Non_Repudiation_Failure, VALUE_ENTRY_Out_of_Hours_Activity,
                VALUE_ENTRY_Out_of_Service, VALUE_ENTRY_Procedural_Error,
                VALUE_ENTRY_Unexpected_Information };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property ProbableCause   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_Adapter_Card_Error,
                VALUE_ENTRY_Application_Subsystem_Failure, VALUE_ENTRY_Bandwidth_Reduced,
                VALUE_ENTRY_Connection_Establishment_Error,
                VALUE_ENTRY_Communications_Protocol_Error,
                VALUE_ENTRY_Communications_Subsystem_Failure,
                VALUE_ENTRY_Configuration_Customization_Error, VALUE_ENTRY_Congestion,
                VALUE_ENTRY_Corrupt_Data, VALUE_ENTRY_CPU_Cycles_Limit_Exceeded,
                VALUE_ENTRY_Dataset_Modem_Error, VALUE_ENTRY_Degraded_Signal,
                VALUE_ENTRY_DTE_DCE_Interface_Error, VALUE_ENTRY_Enclosure_Door_Open,
                VALUE_ENTRY_Equipment_Malfunction, VALUE_ENTRY_Excessive_Vibration,
                VALUE_ENTRY_File_Format_Error, VALUE_ENTRY_Fire_Detected,
                VALUE_ENTRY_Flood_Detected, VALUE_ENTRY_Framing_Error, VALUE_ENTRY_HVAC_Problem,
                VALUE_ENTRY_Humidity_Unacceptable, VALUE_ENTRY_I_O_Device_Error,
                VALUE_ENTRY_Input_Device_Error, VALUE_ENTRY_LAN_Error,
                VALUE_ENTRY_Non_Toxic_Leak_Detected, VALUE_ENTRY_Local_Node_Transmission_Error,
                VALUE_ENTRY_Loss_of_Frame, VALUE_ENTRY_Loss_of_Signal,
                VALUE_ENTRY_Material_Supply_Exhausted, VALUE_ENTRY_Multiplexer_Problem,
                VALUE_ENTRY_Out_of_Memory, VALUE_ENTRY_Output_Device_Error,
                VALUE_ENTRY_Performance_Degraded, VALUE_ENTRY_Power_Problem,
                VALUE_ENTRY_Pressure_Unacceptable,
                VALUE_ENTRY_Processor_Problem__Internal_Machine_Error_, VALUE_ENTRY_Pump_Failure,
                VALUE_ENTRY_Queue_Size_Exceeded, VALUE_ENTRY_Receive_Failure,
                VALUE_ENTRY_Receiver_Failure, VALUE_ENTRY_Remote_Node_Transmission_Error,
                VALUE_ENTRY_Resource_at_or_Nearing_Capacity, VALUE_ENTRY_Response_Time_Excessive,
                VALUE_ENTRY_Retransmission_Rate_Excessive, VALUE_ENTRY_Software_Error,
                VALUE_ENTRY_Software_Program_Abnormally_Terminated,
                VALUE_ENTRY_Software_Program_Error__Incorrect_Results_,
                VALUE_ENTRY_Storage_Capacity_Problem, VALUE_ENTRY_Temperature_Unacceptable,
                VALUE_ENTRY_Threshold_Crossed, VALUE_ENTRY_Timing_Problem,
                VALUE_ENTRY_Toxic_Leak_Detected, VALUE_ENTRY_Transmit_Failure,
                VALUE_ENTRY_Transmitter_Failure, VALUE_ENTRY_Underlying_Resource_Unavailable,
                VALUE_ENTRY_Version_MisMatch, VALUE_ENTRY_Previous_Alert_Cleared,
                VALUE_ENTRY_Login_Attempts_Failed, VALUE_ENTRY_Software_Virus_Detected,
                VALUE_ENTRY_Hardware_Security_Breached, VALUE_ENTRY_Denial_of_Service_Detected,
                VALUE_ENTRY_Security_Credential_MisMatch, VALUE_ENTRY_Unauthorized_Access,
                VALUE_ENTRY_Alarm_Received, VALUE_ENTRY_Loss_of_Pointer,
                VALUE_ENTRY_Payload_Mismatch, VALUE_ENTRY_Transmission_Error,
                VALUE_ENTRY_Excessive_Error_Rate, VALUE_ENTRY_Trace_Problem,
                VALUE_ENTRY_Element_Unavailable, VALUE_ENTRY_Element_Missing,
                VALUE_ENTRY_Loss_of_Multi_Frame, VALUE_ENTRY_Broadcast_Channel_Failure,
                VALUE_ENTRY_Invalid_Message_Received, VALUE_ENTRY_Routing_Failure,
                VALUE_ENTRY_Backplane_Failure, VALUE_ENTRY_Identifier_Duplication,
                VALUE_ENTRY_Protection_Path_Failure, VALUE_ENTRY_Sync_Loss_or_Mismatch,
                VALUE_ENTRY_Terminal_Problem, VALUE_ENTRY_Real_Time_Clock_Failure,
                VALUE_ENTRY_Antenna_Failure, VALUE_ENTRY_Battery_Charging_Failure,
                VALUE_ENTRY_Disk_Failure, VALUE_ENTRY_Frequency_Hopping_Failure,
                VALUE_ENTRY_Loss_of_Redundancy, VALUE_ENTRY_Power_Supply_Failure,
                VALUE_ENTRY_Signal_Quality_Problem, VALUE_ENTRY_Battery_Discharging,
                VALUE_ENTRY_Battery_Failure, VALUE_ENTRY_Commercial_Power_Problem,
                VALUE_ENTRY_Fan_Failure, VALUE_ENTRY_Engine_Failure, VALUE_ENTRY_Sensor_Failure,
                VALUE_ENTRY_Fuse_Failure, VALUE_ENTRY_Generator_Failure, VALUE_ENTRY_Low_Battery,
                VALUE_ENTRY_Low_Fuel, VALUE_ENTRY_Low_Water, VALUE_ENTRY_Explosive_Gas,
                VALUE_ENTRY_High_Winds, VALUE_ENTRY_Ice_Buildup, VALUE_ENTRY_Smoke,
                VALUE_ENTRY_Memory_Mismatch, VALUE_ENTRY_Out_of_CPU_Cycles,
                VALUE_ENTRY_Software_Environment_Problem, VALUE_ENTRY_Software_Download_Failure,
                VALUE_ENTRY_Element_Reinitialized, VALUE_ENTRY_Timeout,
                VALUE_ENTRY_Logging_Problems, VALUE_ENTRY_Leak_Detected,
                VALUE_ENTRY_Protection_Mechanism_Failure, VALUE_ENTRY_Protecting_Resource_Failure,
                VALUE_ENTRY_Database_Inconsistency, VALUE_ENTRY_Authentication_Failure,
                VALUE_ENTRY_Breach_of_Confidentiality, VALUE_ENTRY_Cable_Tamper,
                VALUE_ENTRY_Delayed_Information, VALUE_ENTRY_Duplicate_Information,
                VALUE_ENTRY_Information_Missing, VALUE_ENTRY_Information_Modification,
                VALUE_ENTRY_Information_Out_of_Sequence, VALUE_ENTRY_Key_Expired,
                VALUE_ENTRY_Non_Repudiation_Failure, VALUE_ENTRY_Out_of_Hours_Activity,
                VALUE_ENTRY_Out_of_Service, VALUE_ENTRY_Procedural_Error,
                VALUE_ENTRY_Unexpected_Information };

    }

    /**
     * Constants of property ProbableCauseDescription
     * Provides additional information related to the ProbableCause.
     */
    public static class PROPERTY_PROBABLECAUSEDESCRIPTION {
        /**
         * name of the property ProbableCauseDescription
         */
        public final static String NAME = "ProbableCauseDescription";

    }

    /**
     * Constants of property ProviderName
     * The name of the Provider generating this Indication.
     */
    public static class PROPERTY_PROVIDERNAME {
        /**
         * name of the property ProviderName
         */
        public final static String NAME = "ProviderName";

    }

    /**
     * Constants of property RecommendedActions
     * Free form descriptions of the recommended actions to take to resolve the cause of the notification.
     */
    public static class PROPERTY_RECOMMENDEDACTIONS {
        /**
         * name of the property RecommendedActions
         */
        public final static String NAME = "RecommendedActions";

    }

    /**
     * Constants of property SystemCreationClassName
     * The scoping System's CreationClassName for the Provider generating this Indication.
     */
    public static class PROPERTY_SYSTEMCREATIONCLASSNAME {
        /**
         * name of the property SystemCreationClassName
         */
        public final static String NAME = "SystemCreationClassName";

    }

    /**
     * Constants of property SystemName
     * The scoping System's Name for the Provider generating this Indication.
     */
    public static class PROPERTY_SYSTEMNAME {
        /**
         * name of the property SystemName
         */
        public final static String NAME = "SystemName";

    }

    /**
     * Constants of property Trending
     * Provides information on trending - trending up, down or no change.
     */
    public static class PROPERTY_TRENDING {
        /**
         * name of the property Trending
         */
        public final static String NAME = "Trending";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Applicable = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry Not Applicable (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_Not_Applicable = "Not Applicable";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Trending_Up = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Trending Up (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Trending_Up = "Trending Up";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Trending_Down = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Trending Down (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Trending_Down = "Trending Down";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_No_Change = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry No Change (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_No_Change = "No Change";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@16921692
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Not_Applicable.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Applicable;
            }

            if (VALUE_ENTRY_Trending_Up.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Trending_Up;
            }

            if (VALUE_ENTRY_Trending_Down.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Trending_Down;
            }

            if (VALUE_ENTRY_No_Change.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_No_Change;
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

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Applicable.intValue()) {
                return VALUE_ENTRY_Not_Applicable;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Trending_Up.intValue()) {
                return VALUE_ENTRY_Trending_Up;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Trending_Down.intValue()) {
                return VALUE_ENTRY_Trending_Down;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_No_Change.intValue()) {
                return VALUE_ENTRY_No_Change;
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
         * Value Map for the property Trending   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Applicable,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Trending_Up,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Trending_Down,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_No_Change };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property Trending   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Not_Applicable, VALUE_ENTRY_Trending_Up, VALUE_ENTRY_Trending_Down,
                VALUE_ENTRY_No_Change };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property Trending   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Not_Applicable, VALUE_ENTRY_Trending_Up, VALUE_ENTRY_Trending_Down,
                VALUE_ENTRY_No_Change };

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_ProcessIndication.getPackages();

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
     *   A concrete superclass for CIM Alert notifications. An AlertIndication is a specialized type of CIM_Indication that contains information about the severity, cause, recommended actions and other data of a real world event. This event and its data may or may not be modeled in the CIM class hierarchy.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_AlertIndication(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   A concrete superclass for CIM Alert notifications. An AlertIndication is a specialized type of CIM_Indication that contains information about the severity, cause, recommended actions and other data of a real world event. This event and its data may or may not be modeled in the CIM class hierarchy.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_AlertIndication(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_AlertIndication() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck
                .put("AlertType", new CIMProperty("AlertType", CIMDataType.UINT16_T, null));
        propertiesToCheck.put("AlertingElementFormat", new CIMProperty("AlertingElementFormat",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("AlertingManagedElement", new CIMProperty("AlertingManagedElement",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("Description", new CIMProperty("Description", CIMDataType.STRING_T,
                null));
        propertiesToCheck.put("EventID", new CIMProperty("EventID", CIMDataType.STRING_T, null));
        propertiesToCheck.put("EventTime", new CIMProperty("EventTime", CIMDataType.DATETIME_T,
                null));
        propertiesToCheck.put("OtherAlertType", new CIMProperty("OtherAlertType",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("OtherAlertingElementFormat", new CIMProperty(
                "OtherAlertingElementFormat", CIMDataType.STRING_T, null));
        propertiesToCheck.put("OtherSeverity", new CIMProperty("OtherSeverity",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("PerceivedSeverity", new CIMProperty("PerceivedSeverity",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("ProbableCause", new CIMProperty("ProbableCause",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("ProbableCauseDescription", new CIMProperty(
                "ProbableCauseDescription", CIMDataType.STRING_T, null));
        propertiesToCheck.put("ProviderName", new CIMProperty("ProviderName", CIMDataType.STRING_T,
                null));
        propertiesToCheck.put("RecommendedActions", new CIMProperty("RecommendedActions",
                CIMDataType.STRING_ARRAY_T, null));
        propertiesToCheck.put("SystemCreationClassName", new CIMProperty("SystemCreationClassName",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("SystemName", new CIMProperty("SystemName", CIMDataType.STRING_T,
                null));
        propertiesToCheck.put("Trending", new CIMProperty("Trending", CIMDataType.UINT16_T, null));

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
     * Get the property AlertType
     *     * <br>
     * Primary classification of the Indication. The following values are defined: 
     * 1 - Other. The Indication's OtherAlertType property conveys its classification. Use of "Other" in an enumeration is a standard CIM convention. It means that the current Indication does not fit into the categories described by this enumeration. 
     * 2 - Communications Alert. An Indication of this type is principally associated with the procedures and/or processes required to convey information from one point to another. 
     * 3 - Quality of Service Alert. An Indication of this type is principally associated with a degradation or errors in the performance or function of an entity. 
     * 4 - Processing Error. An Indication of this type is principally associated with a software or processing fault. 
     * 5 - Device Alert. An Indication of this type is principally associated with an equipment or hardware fault. 
     * 6 - Environmental Alert. An Indication of this type is principally associated with a condition relating to an enclosure in which the hardware resides, or other environmental considerations. 
     * 7 - Model Change. The Indication addresses changes in the Information Model. For example, it may embed a Lifecycle Indication to convey the specific model change being alerted. 
     * 8 - Security Alert. An Indication of this type is associated with security violations, detection of viruses, and similar issues.
     *     */

    public javax.cim.UnsignedInteger16 get_AlertType() {
        CIMProperty currentProperty = getProperty(PROPERTY_ALERTTYPE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ALERTTYPE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property AlertType
     * <br>
     * Primary classification of the Indication. The following values are defined: 
     * 1 - Other. The Indication's OtherAlertType property conveys its classification. Use of "Other" in an enumeration is a standard CIM convention. It means that the current Indication does not fit into the categories described by this enumeration. 
     * 2 - Communications Alert. An Indication of this type is principally associated with the procedures and/or processes required to convey information from one point to another. 
     * 3 - Quality of Service Alert. An Indication of this type is principally associated with a degradation or errors in the performance or function of an entity. 
     * 4 - Processing Error. An Indication of this type is principally associated with a software or processing fault. 
     * 5 - Device Alert. An Indication of this type is principally associated with an equipment or hardware fault. 
     * 6 - Environmental Alert. An Indication of this type is principally associated with a condition relating to an enclosure in which the hardware resides, or other environmental considerations. 
     * 7 - Model Change. The Indication addresses changes in the Information Model. For example, it may embed a Lifecycle Indication to convey the specific model change being alerted. 
     * 8 - Security Alert. An Indication of this type is associated with security violations, detection of viruses, and similar issues.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_AlertType(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ALERTTYPE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_AlertType(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ALERTTYPE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property AlertType by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_AlertType(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_AlertIndication fco = new CIM_AlertIndication(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ALERTTYPE.NAME);
        if (property != null) {
            property = setPropertyValue_AlertType(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ALERTTYPE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property AlertType
     * <br>
     * Primary classification of the Indication. The following values are defined: 
     * 1 - Other. The Indication's OtherAlertType property conveys its classification. Use of "Other" in an enumeration is a standard CIM convention. It means that the current Indication does not fit into the categories described by this enumeration. 
     * 2 - Communications Alert. An Indication of this type is principally associated with the procedures and/or processes required to convey information from one point to another. 
     * 3 - Quality of Service Alert. An Indication of this type is principally associated with a degradation or errors in the performance or function of an entity. 
     * 4 - Processing Error. An Indication of this type is principally associated with a software or processing fault. 
     * 5 - Device Alert. An Indication of this type is principally associated with an equipment or hardware fault. 
     * 6 - Environmental Alert. An Indication of this type is principally associated with a condition relating to an enclosure in which the hardware resides, or other environmental considerations. 
     * 7 - Model Change. The Indication addresses changes in the Information Model. For example, it may embed a Lifecycle Indication to convey the specific model change being alerted. 
     * 8 - Security Alert. An Indication of this type is associated with security violations, detection of viruses, and similar issues.
     */

    private static CIMProperty setPropertyValue_AlertType(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property AlertingElementFormat
     *     * <br>
     * The format of the AlertingManagedElement property is interpretable based upon the value of this property. Values are defined as: 
     * 0 - Unknown. The format is unknown or not meaningfully interpretable by a CIM client application. 
     * 1 - Other. The format is defined by the value of the OtherAlertingElementFormat property. 
     * 2 - CIMObjectPath. The format is a CIMObjectPath, with format <NamespacePath>:<ClassName>.<Prop1>="<Value1>", <Prop2>="<Value2>", . . . specifying an instance in the CIM Schema.
     *     */

    public javax.cim.UnsignedInteger16 get_AlertingElementFormat() {
        CIMProperty currentProperty = getProperty(PROPERTY_ALERTINGELEMENTFORMAT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ALERTINGELEMENTFORMAT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property AlertingElementFormat
     * <br>
     * The format of the AlertingManagedElement property is interpretable based upon the value of this property. Values are defined as: 
     * 0 - Unknown. The format is unknown or not meaningfully interpretable by a CIM client application. 
     * 1 - Other. The format is defined by the value of the OtherAlertingElementFormat property. 
     * 2 - CIMObjectPath. The format is a CIMObjectPath, with format <NamespacePath>:<ClassName>.<Prop1>="<Value1>", <Prop2>="<Value2>", . . . specifying an instance in the CIM Schema.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_AlertingElementFormat(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ALERTINGELEMENTFORMAT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_AlertingElementFormat(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ALERTINGELEMENTFORMAT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property AlertingElementFormat by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_AlertingElementFormat(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_AlertIndication fco = new CIM_AlertIndication(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ALERTINGELEMENTFORMAT.NAME);
        if (property != null) {
            property = setPropertyValue_AlertingElementFormat(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ALERTINGELEMENTFORMAT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property AlertingElementFormat
     * <br>
     * The format of the AlertingManagedElement property is interpretable based upon the value of this property. Values are defined as: 
     * 0 - Unknown. The format is unknown or not meaningfully interpretable by a CIM client application. 
     * 1 - Other. The format is defined by the value of the OtherAlertingElementFormat property. 
     * 2 - CIMObjectPath. The format is a CIMObjectPath, with format <NamespacePath>:<ClassName>.<Prop1>="<Value1>", <Prop2>="<Value2>", . . . specifying an instance in the CIM Schema.
     */

    private static CIMProperty setPropertyValue_AlertingElementFormat(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property AlertingManagedElement
     *     * <br>
     * The identifying information of the entity (ie, the instance) for which this Indication is generated. The property contains the path of an instance, encoded as a string parameter - if the instance is modeled in the CIM Schema. If not a CIM instance, the property contains some identifying string that names the entity for which the Alert is generated. The path or identifying string is formatted per the AlertingElementFormat property.
     *     */

    public String get_AlertingManagedElement() {
        CIMProperty currentProperty = getProperty(PROPERTY_ALERTINGMANAGEDELEMENT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ALERTINGMANAGEDELEMENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property AlertingManagedElement
     * <br>
     * The identifying information of the entity (ie, the instance) for which this Indication is generated. The property contains the path of an instance, encoded as a string parameter - if the instance is modeled in the CIM Schema. If not a CIM instance, the property contains some identifying string that names the entity for which the Alert is generated. The path or identifying string is formatted per the AlertingElementFormat property.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_AlertingManagedElement(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ALERTINGMANAGEDELEMENT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_AlertingManagedElement(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ALERTINGMANAGEDELEMENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property AlertingManagedElement by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_AlertingManagedElement(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_AlertIndication fco = new CIM_AlertIndication(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ALERTINGMANAGEDELEMENT.NAME);
        if (property != null) {
            property = setPropertyValue_AlertingManagedElement(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ALERTINGMANAGEDELEMENT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property AlertingManagedElement
     * <br>
     * The identifying information of the entity (ie, the instance) for which this Indication is generated. The property contains the path of an instance, encoded as a string parameter - if the instance is modeled in the CIM Schema. If not a CIM instance, the property contains some identifying string that names the entity for which the Alert is generated. The path or identifying string is formatted per the AlertingElementFormat property.
     */

    private static CIMProperty setPropertyValue_AlertingManagedElement(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Description
     *     * <br>
     * A short description of the Indication.
     *     */

    public String get_Description() {
        CIMProperty currentProperty = getProperty(PROPERTY_DESCRIPTION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_DESCRIPTION.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property Description
     * <br>
     * A short description of the Indication.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Description(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_DESCRIPTION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Description(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_DESCRIPTION.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Description by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Description(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_AlertIndication fco = new CIM_AlertIndication(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_DESCRIPTION.NAME);
        if (property != null) {
            property = setPropertyValue_Description(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_DESCRIPTION.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Description
     * <br>
     * A short description of the Indication.
     */

    private static CIMProperty setPropertyValue_Description(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property EventID
     *     * <br>
     * An instrumentation or provider specific value that describes the underlying "real-world" event represented by the Indication. Two Indications with the same, non NULL EventID value are considered, by the creating entity, to represent the same event. The comparison of two EventID values is only defined for Alert Indications with identical, non NULL values of SystemCreateClassName, SystemName and ProviderName.
     *     */

    public String get_EventID() {
        CIMProperty currentProperty = getProperty(PROPERTY_EVENTID.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_EVENTID.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property EventID
     * <br>
     * An instrumentation or provider specific value that describes the underlying "real-world" event represented by the Indication. Two Indications with the same, non NULL EventID value are considered, by the creating entity, to represent the same event. The comparison of two EventID values is only defined for Alert Indications with identical, non NULL values of SystemCreateClassName, SystemName and ProviderName.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_EventID(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_EVENTID.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_EventID(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_EVENTID.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property EventID by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_EventID(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_AlertIndication fco = new CIM_AlertIndication(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_EVENTID.NAME);
        if (property != null) {
            property = setPropertyValue_EventID(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_EVENTID.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property EventID
     * <br>
     * An instrumentation or provider specific value that describes the underlying "real-world" event represented by the Indication. Two Indications with the same, non NULL EventID value are considered, by the creating entity, to represent the same event. The comparison of two EventID values is only defined for Alert Indications with identical, non NULL values of SystemCreateClassName, SystemName and ProviderName.
     */

    private static CIMProperty setPropertyValue_EventID(CIMProperty currentProperty, String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property EventTime
     *     * <br>
     * The time and date the underlying event was first detected. If specified, this property MUST be set to NULL if the creating entity is not capable of providing this information. This value is based on the notion of local date and time of the Managed System Element generating the Indication.
     *     */

    public javax.cim.CIMDateTime get_EventTime() {
        CIMProperty currentProperty = getProperty(PROPERTY_EVENTTIME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_EVENTTIME.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.CIMDateTime) currentProperty.getValue();

    }

    /**
     * Set the property EventTime
     * <br>
     * The time and date the underlying event was first detected. If specified, this property MUST be set to NULL if the creating entity is not capable of providing this information. This value is based on the notion of local date and time of the Managed System Element generating the Indication.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_EventTime(javax.cim.CIMDateTime newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_EVENTTIME.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_EventTime(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_EVENTTIME.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property EventTime by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_EventTime(WBEMClient client, String namespace,
            javax.cim.CIMDateTime newValue) throws WbemsmtException {
        CIM_AlertIndication fco = new CIM_AlertIndication(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_EVENTTIME.NAME);
        if (property != null) {
            property = setPropertyValue_EventTime(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_EVENTTIME.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property EventTime
     * <br>
     * The time and date the underlying event was first detected. If specified, this property MUST be set to NULL if the creating entity is not capable of providing this information. This value is based on the notion of local date and time of the Managed System Element generating the Indication.
     */

    private static CIMProperty setPropertyValue_EventTime(CIMProperty currentProperty,
            javax.cim.CIMDateTime newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OtherAlertType
     *     * <br>
     * A string describing the Alert type - used when the AlertType property is set to 1, "Other State Change".
     *     */

    public String get_OtherAlertType() {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERALERTTYPE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OTHERALERTTYPE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property OtherAlertType
     * <br>
     * A string describing the Alert type - used when the AlertType property is set to 1, "Other State Change".
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OtherAlertType(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERALERTTYPE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_OtherAlertType(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERALERTTYPE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OtherAlertType by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherAlertType(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_AlertIndication fco = new CIM_AlertIndication(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OTHERALERTTYPE.NAME);
        if (property != null) {
            property = setPropertyValue_OtherAlertType(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERALERTTYPE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OtherAlertType
     * <br>
     * A string describing the Alert type - used when the AlertType property is set to 1, "Other State Change".
     */

    private static CIMProperty setPropertyValue_OtherAlertType(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OtherAlertingElementFormat
     *     * <br>
     * A string defining "Other" values for AlertingElementFormat. This value MUST be set to a non NULL value when AlertingElementFormat is set to a value of 1 ("Other"). For all other values of AlertingElementFormat, the value of this string must be set to NULL.
     *     */

    public String get_OtherAlertingElementFormat() {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERALERTINGELEMENTFORMAT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OTHERALERTINGELEMENTFORMAT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property OtherAlertingElementFormat
     * <br>
     * A string defining "Other" values for AlertingElementFormat. This value MUST be set to a non NULL value when AlertingElementFormat is set to a value of 1 ("Other"). For all other values of AlertingElementFormat, the value of this string must be set to NULL.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OtherAlertingElementFormat(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERALERTINGELEMENTFORMAT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_OtherAlertingElementFormat(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERALERTINGELEMENTFORMAT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OtherAlertingElementFormat by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherAlertingElementFormat(WBEMClient client,
            String namespace, String newValue) throws WbemsmtException {
        CIM_AlertIndication fco = new CIM_AlertIndication(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OTHERALERTINGELEMENTFORMAT.NAME);
        if (property != null) {
            property = setPropertyValue_OtherAlertingElementFormat(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERALERTINGELEMENTFORMAT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OtherAlertingElementFormat
     * <br>
     * A string defining "Other" values for AlertingElementFormat. This value MUST be set to a non NULL value when AlertingElementFormat is set to a value of 1 ("Other"). For all other values of AlertingElementFormat, the value of this string must be set to NULL.
     */

    private static CIMProperty setPropertyValue_OtherAlertingElementFormat(
            CIMProperty currentProperty, String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OtherSeverity
     *     * <br>
     * Holds the value of the user defined severity value when 'Severity' is 1 ("Other").
     *     */

    public String get_OtherSeverity() {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERSEVERITY.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OTHERSEVERITY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property OtherSeverity
     * <br>
     * Holds the value of the user defined severity value when 'Severity' is 1 ("Other").
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OtherSeverity(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERSEVERITY.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_OtherSeverity(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERSEVERITY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OtherSeverity by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherSeverity(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_AlertIndication fco = new CIM_AlertIndication(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OTHERSEVERITY.NAME);
        if (property != null) {
            property = setPropertyValue_OtherSeverity(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERSEVERITY.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OtherSeverity
     * <br>
     * Holds the value of the user defined severity value when 'Severity' is 1 ("Other").
     */

    private static CIMProperty setPropertyValue_OtherSeverity(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PerceivedSeverity
     *     * <br>
     * An enumerated value that describes the severity of the Alert Indication from the notifier's point of view: 
     * 1 - Other, by CIM convention, is used to indicate that the Severity's value can be found in the OtherSeverity property. 
     * 3 - Degraded/Warning should be used when its appropriate to let the user decide if action is needed. 
     * 4 - Minor should be used to indicate action is needed, but the situation is not serious at this time. 
     * 5 - Major should be used to indicate action is needed NOW. 
     * 6 - Critical should be used to indicate action is needed NOW and the scope is broad (perhaps an imminent outage to a critical resource will result). 
     * 7 - Fatal/NonRecoverable should be used to indicate an error occurred, but it's too late to take remedial action. 
     * 2 and 0 - Information and Unknown (respectively) follow common usage. Literally, the AlertIndication is purely informational or its severity is simply unknown.
     *     */

    public javax.cim.UnsignedInteger16 get_PerceivedSeverity() {
        CIMProperty currentProperty = getProperty(PROPERTY_PERCEIVEDSEVERITY.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PERCEIVEDSEVERITY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property PerceivedSeverity
     * <br>
     * An enumerated value that describes the severity of the Alert Indication from the notifier's point of view: 
     * 1 - Other, by CIM convention, is used to indicate that the Severity's value can be found in the OtherSeverity property. 
     * 3 - Degraded/Warning should be used when its appropriate to let the user decide if action is needed. 
     * 4 - Minor should be used to indicate action is needed, but the situation is not serious at this time. 
     * 5 - Major should be used to indicate action is needed NOW. 
     * 6 - Critical should be used to indicate action is needed NOW and the scope is broad (perhaps an imminent outage to a critical resource will result). 
     * 7 - Fatal/NonRecoverable should be used to indicate an error occurred, but it's too late to take remedial action. 
     * 2 and 0 - Information and Unknown (respectively) follow common usage. Literally, the AlertIndication is purely informational or its severity is simply unknown.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PerceivedSeverity(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PERCEIVEDSEVERITY.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_PerceivedSeverity(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PERCEIVEDSEVERITY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PerceivedSeverity by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PerceivedSeverity(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_AlertIndication fco = new CIM_AlertIndication(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PERCEIVEDSEVERITY.NAME);
        if (property != null) {
            property = setPropertyValue_PerceivedSeverity(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PERCEIVEDSEVERITY.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PerceivedSeverity
     * <br>
     * An enumerated value that describes the severity of the Alert Indication from the notifier's point of view: 
     * 1 - Other, by CIM convention, is used to indicate that the Severity's value can be found in the OtherSeverity property. 
     * 3 - Degraded/Warning should be used when its appropriate to let the user decide if action is needed. 
     * 4 - Minor should be used to indicate action is needed, but the situation is not serious at this time. 
     * 5 - Major should be used to indicate action is needed NOW. 
     * 6 - Critical should be used to indicate action is needed NOW and the scope is broad (perhaps an imminent outage to a critical resource will result). 
     * 7 - Fatal/NonRecoverable should be used to indicate an error occurred, but it's too late to take remedial action. 
     * 2 and 0 - Information and Unknown (respectively) follow common usage. Literally, the AlertIndication is purely informational or its severity is simply unknown.
     */

    private static CIMProperty setPropertyValue_PerceivedSeverity(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ProbableCause
     *     * <br>
     * An enumerated value that describes the probable cause of the situation which resulted in the AlertIndication.
     *     */

    public javax.cim.UnsignedInteger16 get_ProbableCause() {
        CIMProperty currentProperty = getProperty(PROPERTY_PROBABLECAUSE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PROBABLECAUSE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property ProbableCause
     * <br>
     * An enumerated value that describes the probable cause of the situation which resulted in the AlertIndication.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ProbableCause(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PROBABLECAUSE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ProbableCause(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PROBABLECAUSE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ProbableCause by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ProbableCause(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_AlertIndication fco = new CIM_AlertIndication(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PROBABLECAUSE.NAME);
        if (property != null) {
            property = setPropertyValue_ProbableCause(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PROBABLECAUSE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ProbableCause
     * <br>
     * An enumerated value that describes the probable cause of the situation which resulted in the AlertIndication.
     */

    private static CIMProperty setPropertyValue_ProbableCause(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ProbableCauseDescription
     *     * <br>
     * Provides additional information related to the ProbableCause.
     *     */

    public String get_ProbableCauseDescription() {
        CIMProperty currentProperty = getProperty(PROPERTY_PROBABLECAUSEDESCRIPTION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PROBABLECAUSEDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property ProbableCauseDescription
     * <br>
     * Provides additional information related to the ProbableCause.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ProbableCauseDescription(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PROBABLECAUSEDESCRIPTION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ProbableCauseDescription(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PROBABLECAUSEDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ProbableCauseDescription by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ProbableCauseDescription(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_AlertIndication fco = new CIM_AlertIndication(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PROBABLECAUSEDESCRIPTION.NAME);
        if (property != null) {
            property = setPropertyValue_ProbableCauseDescription(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PROBABLECAUSEDESCRIPTION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ProbableCauseDescription
     * <br>
     * Provides additional information related to the ProbableCause.
     */

    private static CIMProperty setPropertyValue_ProbableCauseDescription(
            CIMProperty currentProperty, String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ProviderName
     *     * <br>
     * The name of the Provider generating this Indication.
     *     */

    public String get_ProviderName() {
        CIMProperty currentProperty = getProperty(PROPERTY_PROVIDERNAME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PROVIDERNAME.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property ProviderName
     * <br>
     * The name of the Provider generating this Indication.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ProviderName(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PROVIDERNAME.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ProviderName(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PROVIDERNAME.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ProviderName by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ProviderName(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_AlertIndication fco = new CIM_AlertIndication(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PROVIDERNAME.NAME);
        if (property != null) {
            property = setPropertyValue_ProviderName(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PROVIDERNAME.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ProviderName
     * <br>
     * The name of the Provider generating this Indication.
     */

    private static CIMProperty setPropertyValue_ProviderName(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property RecommendedActions
     *     * <br>
     * Free form descriptions of the recommended actions to take to resolve the cause of the notification.
     *     */

    public String[] get_RecommendedActions() {
        CIMProperty currentProperty = getProperty(PROPERTY_RECOMMENDEDACTIONS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_RECOMMENDEDACTIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String[]) currentProperty.getValue();

    }

    /**
     * Set the property RecommendedActions
     * <br>
     * Free form descriptions of the recommended actions to take to resolve the cause of the notification.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_RecommendedActions(String[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_RECOMMENDEDACTIONS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_RecommendedActions(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_RECOMMENDEDACTIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property RecommendedActions by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_RecommendedActions(WBEMClient client, String namespace,
            String[] newValue) throws WbemsmtException {
        CIM_AlertIndication fco = new CIM_AlertIndication(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_RECOMMENDEDACTIONS.NAME);
        if (property != null) {
            property = setPropertyValue_RecommendedActions(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_RECOMMENDEDACTIONS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property RecommendedActions
     * <br>
     * Free form descriptions of the recommended actions to take to resolve the cause of the notification.
     */

    private static CIMProperty setPropertyValue_RecommendedActions(CIMProperty currentProperty,
            String[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property SystemCreationClassName
     *     * <br>
     * The scoping System's CreationClassName for the Provider generating this Indication.
     *     */

    public String get_SystemCreationClassName() {
        CIMProperty currentProperty = getProperty(PROPERTY_SYSTEMCREATIONCLASSNAME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SYSTEMCREATIONCLASSNAME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property SystemCreationClassName
     * <br>
     * The scoping System's CreationClassName for the Provider generating this Indication.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_SystemCreationClassName(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SYSTEMCREATIONCLASSNAME.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_SystemCreationClassName(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SYSTEMCREATIONCLASSNAME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SystemCreationClassName by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SystemCreationClassName(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_AlertIndication fco = new CIM_AlertIndication(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SYSTEMCREATIONCLASSNAME.NAME);
        if (property != null) {
            property = setPropertyValue_SystemCreationClassName(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SYSTEMCREATIONCLASSNAME.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SystemCreationClassName
     * <br>
     * The scoping System's CreationClassName for the Provider generating this Indication.
     */

    private static CIMProperty setPropertyValue_SystemCreationClassName(
            CIMProperty currentProperty, String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property SystemName
     *     * <br>
     * The scoping System's Name for the Provider generating this Indication.
     *     */

    public String get_SystemName() {
        CIMProperty currentProperty = getProperty(PROPERTY_SYSTEMNAME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SYSTEMNAME.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property SystemName
     * <br>
     * The scoping System's Name for the Provider generating this Indication.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_SystemName(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SYSTEMNAME.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_SystemName(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SYSTEMNAME.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SystemName by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SystemName(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_AlertIndication fco = new CIM_AlertIndication(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SYSTEMNAME.NAME);
        if (property != null) {
            property = setPropertyValue_SystemName(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SYSTEMNAME.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SystemName
     * <br>
     * The scoping System's Name for the Provider generating this Indication.
     */

    private static CIMProperty setPropertyValue_SystemName(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Trending
     *     * <br>
     * Provides information on trending - trending up, down or no change.
     *     */

    public javax.cim.UnsignedInteger16 get_Trending() {
        CIMProperty currentProperty = getProperty(PROPERTY_TRENDING.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_TRENDING.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property Trending
     * <br>
     * Provides information on trending - trending up, down or no change.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Trending(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_TRENDING.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Trending(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_TRENDING.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Trending by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Trending(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_AlertIndication fco = new CIM_AlertIndication(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_TRENDING.NAME);
        if (property != null) {
            property = setPropertyValue_Trending(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_TRENDING.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Trending
     * <br>
     * Provides information on trending - trending up, down or no change.
     */

    private static CIMProperty setPropertyValue_Trending(CIMProperty currentProperty,
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
        return CIM_AlertIndication.CIM_CLASS_NAME;
    }

}