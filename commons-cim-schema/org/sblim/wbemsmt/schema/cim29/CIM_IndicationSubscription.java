/** 
 * CIM_IndicationSubscription.java
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
 * Description: CIM_IndicationSubscription describes a flow of Indications. The flow is specified by the referenced Filter, and directed to the referenced destination or process in the Handler. Property values of the referenced CIM_IndicationFilter instance and CIM_ListenerDestination instance MAY significantly effect the definition of the subscription. E.g., a subscription associated with a "Transient" destination MAY be deleted when the destination terminates or is no longer available.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_IndicationSubscription extends org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco {

    public final static String CIM_CLASS_NAME = "CIM_IndicationSubscription";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property FailureTriggerTimeInterval
     * The FailureTriggerTimeInterval is used by the client to specify a recommended minimum delay before the OnFatalErrorPolicy is implemented.
     */
    public static class PROPERTY_FAILURETRIGGERTIMEINTERVAL {
        /**
         * name of the property FailureTriggerTimeInterval
         */
        public final static String NAME = "FailureTriggerTimeInterval";

    }

    /**
     * Constants of property OnFatalErrorPolicy
     * Defines the desired behavior for a subscription when a fatal error occurs in one of the Indication processing subcomponents (e.g., Indication processor, Indication or instance provider, or Indication handler) and the Indication cannot be successfully sent. Specifically, a failure implies that some aspect of Indication generation, processing or dispatch is no longer functioning and Indications may be lost. If the value of OnFatalErrorPolicy is 2 ("Ignore") or not set (NULL), the subscription MUST continue to be processed in a 'best effort' mode. This mode of operation can lead to unpredictable, and potentially misleading results, because Indications may be lost. If the value is 3 ("Disable"), the subscription MUST be disabled. With this policy, no new Indications will be generated or dispatched until the subscription is explicitly enabled. This is accomplished via the property, SubscriptionState. If the value is 4 ("Remove"), the subscription MUST be deleted. Selecting this policy has the same effect as issuing a DeleteInstance operation on this subscription instance.
     */
    public static class PROPERTY_ONFATALERRORPOLICY {
        /**
         * name of the property OnFatalErrorPolicy
         */
        public final static String NAME = "OnFatalErrorPolicy";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Ignore = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Ignore (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Ignore = "Ignore";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Disable = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Disable (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Disable = "Disable";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Remove = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Remove (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Remove = "Remove";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@98e098e
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Ignore.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Ignore;
            }

            if (VALUE_ENTRY_Disable.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Disable;
            }

            if (VALUE_ENTRY_Remove.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Remove;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Ignore.intValue()) {
                return VALUE_ENTRY_Ignore;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Disable.intValue()) {
                return VALUE_ENTRY_Disable;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Remove.intValue()) {
                return VALUE_ENTRY_Remove;
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
         * Value Map for the property OnFatalErrorPolicy   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other, VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Ignore,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Disable, VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Remove };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property OnFatalErrorPolicy   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Other, VALUE_ENTRY_Ignore,
                VALUE_ENTRY_Disable, VALUE_ENTRY_Remove };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property OnFatalErrorPolicy   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Other,
                VALUE_ENTRY_Ignore, VALUE_ENTRY_Disable, VALUE_ENTRY_Remove };

    }

    /**
     * Constants of property OtherOnFatalErrorPolicy
     * A string defining "Other" values for OnFatalErrorPolicy. This value MUST be set to a non NULL value when OnFatalErrorPolicy is set to a value of 1 ("Other"). For all other values, the OtherOnFatalErrorPolicy MUST be NULL.
     */
    public static class PROPERTY_OTHERONFATALERRORPOLICY {
        /**
         * name of the property OtherOnFatalErrorPolicy
         */
        public final static String NAME = "OtherOnFatalErrorPolicy";

    }

    /**
     * Constants of property OtherRepeatNotificationPolicy
     * A string defining "Other" values for RepeatNotificationPolicy. This value MUST be set to a non NULL value when RepeatNotificationPolicy is set to a value of 1 ("Other"). For all other values, the OtherRepeatNotificationPolicy MUST be NULL.
     */
    public static class PROPERTY_OTHERREPEATNOTIFICATIONPOLICY {
        /**
         * name of the property OtherRepeatNotificationPolicy
         */
        public final static String NAME = "OtherRepeatNotificationPolicy";

    }

    /**
     * Constants of property OtherSubscriptionState
     * A string defining "Other" values for SubscriptionState. This value MUST be set to a non NULL value when SubscriptionState is set to a value of 1 ("Other"). For all other values, the OtherSubscriptionState MUST be NULL.
     */
    public static class PROPERTY_OTHERSUBSCRIPTIONSTATE {
        /**
         * name of the property OtherSubscriptionState
         */
        public final static String NAME = "OtherSubscriptionState";

    }

    /**
     * Constants of property RepeatNotificationCount
     * Defines the count property for the repeat notification policy calculation.
     */
    public static class PROPERTY_REPEATNOTIFICATIONCOUNT {
        /**
         * name of the property RepeatNotificationCount
         */
        public final static String NAME = "RepeatNotificationCount";

    }

    /**
     * Constants of property RepeatNotificationGap
     * Defines the gap interval for the repeat notification policy calculation.
     */
    public static class PROPERTY_REPEATNOTIFICATIONGAP {
        /**
         * name of the property RepeatNotificationGap
         */
        public final static String NAME = "RepeatNotificationGap";

    }

    /**
     * Constants of property RepeatNotificationInterval
     * Defines the time interval for the repeat notification policy calculation.
     */
    public static class PROPERTY_REPEATNOTIFICATIONINTERVAL {
        /**
         * name of the property RepeatNotificationInterval
         */
        public final static String NAME = "RepeatNotificationInterval";

    }

    /**
     * Constants of property RepeatNotificationPolicy
     * The RepeatNotificationPolicy property defines the desired behavior for handling Indications that report the occurrence of the same underlying event (e.g., the disk is still generating I/O errors and has not yet been repaired). The defined semantics for the RepeatNotificationCount, RepeatNotificationInterval, and RepeatNotificationGap properties depend on the value of RepeatNotificationPolicy, but values for these properties MUST be set if the property is defined for the selected policy. If the value of RepeatNotificationPolicy is 0 ("Unknown") or not set, no special processing for repeat Indications is defined by the subscription. The semantics associated with the handling of repeat Indications MAY be defined by the Indication processing subcomponents. If the value of RepeatNotificationPolicy is 2 ("None"), special processing of repeat Indications MUST NOT be performed. If the value is 3 ("Suppress") the first RepeatNotificationCount Indications, describing the same event, MUST be sent and all subsequent Indications for this event suppressed for the remainder of the time interval RepeatNotificationInterval. A new interval starts when the next Indication for this event is received. If the value of RepeatNotificationPolicy is 4 ("Delay") and an Indication is received, this Indication MUST be suppressed if, including this Indication, RepeatNoticationCount or fewer Indications for this event have been received during the prior time interval defined by RepeatNotificationInterval. If this Indication is the RepeatNotificationCount + 1 Indication, this Indication MUST be sent and all subsequent Indications for this event ignored until the RepeatNotificationGap has elapsed. A RepeatNotificationInterval MAY NOT overlap a RepeatNotificationGap time interval.
     */
    public static class PROPERTY_REPEATNOTIFICATIONPOLICY {
        /**
         * name of the property RepeatNotificationPolicy
         */
        public final static String NAME = "RepeatNotificationPolicy";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_None = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry None (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_None = "None";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Suppress = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Suppress (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Suppress = "Suppress";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Delay = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Delay (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Delay = "Delay";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@61126112
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_None.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_None;
            }

            if (VALUE_ENTRY_Suppress.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Suppress;
            }

            if (VALUE_ENTRY_Delay.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Delay;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_None.intValue()) {
                return VALUE_ENTRY_None;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Suppress.intValue()) {
                return VALUE_ENTRY_Suppress;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Delay.intValue()) {
                return VALUE_ENTRY_Delay;
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
         * Value Map for the property RepeatNotificationPolicy   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_None, VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Suppress,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Delay };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property RepeatNotificationPolicy   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_None, VALUE_ENTRY_Suppress, VALUE_ENTRY_Delay };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property RepeatNotificationPolicy   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_None, VALUE_ENTRY_Suppress, VALUE_ENTRY_Delay };

    }

    /**
     * Constants of property SubscriptionDuration
     * SubscriptionDuration defines the desired length of the subscription. Indications generated after the duration of the subscription has exceeded SubscriptionDuration MUST NOT be sent. The duration of a subscription MAY be changed by modifying this property. An expired subscription MAY be deleted and MUST NOT be modified. If the value of SubscriptionDuration is not set, the subscription MUST be treated as having no expiration date.
     */
    public static class PROPERTY_SUBSCRIPTIONDURATION {
        /**
         * name of the property SubscriptionDuration
         */
        public final static String NAME = "SubscriptionDuration";

    }

    /**
     * Constants of property SubscriptionStartTime
     * SubscriptionStartTime is the time the subscription was started. The value of this property is computed based on the notion of date and time of the ManagedSystemElement running the Indication processing subcomponents.
     */
    public static class PROPERTY_SUBSCRIPTIONSTARTTIME {
        /**
         * name of the property SubscriptionStartTime
         */
        public final static String NAME = "SubscriptionStartTime";

    }

    /**
     * Constants of property SubscriptionState
     * Indicates the current processing state of the subscription.
     */
    public static class PROPERTY_SUBSCRIPTIONSTATE {
        /**
         * name of the property SubscriptionState
         */
        public final static String NAME = "SubscriptionState";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Enabled = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Enabled (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Enabled = "Enabled";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Enabled_Degraded = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Enabled Degraded (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Enabled_Degraded = "Enabled Degraded";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Disabled = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Disabled (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Disabled = "Disabled";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@66f466f4
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Enabled.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Enabled;
            }

            if (VALUE_ENTRY_Enabled_Degraded.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Enabled_Degraded;
            }

            if (VALUE_ENTRY_Disabled.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Disabled;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Enabled.intValue()) {
                return VALUE_ENTRY_Enabled;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Enabled_Degraded.intValue()) {
                return VALUE_ENTRY_Enabled_Degraded;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Disabled.intValue()) {
                return VALUE_ENTRY_Disabled;
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
         * Value Map for the property SubscriptionState   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Enabled,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Enabled_Degraded,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Disabled };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property SubscriptionState   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_Enabled, VALUE_ENTRY_Enabled_Degraded, VALUE_ENTRY_Disabled };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property SubscriptionState   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_Enabled, VALUE_ENTRY_Enabled_Degraded,
                VALUE_ENTRY_Disabled };

    }

    /**
     * Constants of property SubscriptionTimeRemaining
     * SubscriptionTimeRemaining is a computed value that provides a snapshot of the time remaining in the Subscription.
     */
    public static class PROPERTY_SUBSCRIPTIONTIMEREMAINING {
        /**
         * name of the property SubscriptionTimeRemaining
         */
        public final static String NAME = "SubscriptionTimeRemaining";

    }

    /**
     * Constants of property TimeOfLastStateChange
     * Date and time of the last state change. This value is based on the notion of local date and time of the Managed System Element running the Indication processing subcomponents.
     */
    public static class PROPERTY_TIMEOFLASTSTATECHANGE {
        /**
         * name of the property TimeOfLastStateChange
         */
        public final static String NAME = "TimeOfLastStateChange";

    }

    /**
     * Constants of property Filter
     * 
     */
    public static class PROPERTY_FILTER_CIM_INDICATIONFILTER {
        /**
         * name of the property Filter
         */
        public final static String NAME = "Filter";

    }

    /**
     * Constants of property Handler
     * 
     */
    public static class PROPERTY_HANDLER_CIM_LISTENERDESTINATION {
        /**
         * name of the property Handler
         */
        public final static String NAME = "Handler";

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
     *   CIM_IndicationSubscription describes a flow of Indications. The flow is specified by the referenced Filter, and directed to the referenced destination or process in the Handler. Property values of the referenced CIM_IndicationFilter instance and CIM_ListenerDestination instance MAY significantly effect the definition of the subscription. E.g., a subscription associated with a "Transient" destination MAY be deleted when the destination terminates or is no longer available.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_IndicationSubscription(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   CIM_IndicationSubscription describes a flow of Indications. The flow is specified by the referenced Filter, and directed to the referenced destination or process in the Handler. Property values of the referenced CIM_IndicationFilter instance and CIM_ListenerDestination instance MAY significantly effect the definition of the subscription. E.g., a subscription associated with a "Transient" destination MAY be deleted when the destination terminates or is no longer available.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_IndicationSubscription(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_IndicationSubscription() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("FailureTriggerTimeInterval", new CIMProperty(
                "FailureTriggerTimeInterval", CIMDataType.UINT64_T, null));
        propertiesToCheck.put("OnFatalErrorPolicy", new CIMProperty("OnFatalErrorPolicy",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("OtherOnFatalErrorPolicy", new CIMProperty("OtherOnFatalErrorPolicy",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("OtherRepeatNotificationPolicy", new CIMProperty(
                "OtherRepeatNotificationPolicy", CIMDataType.STRING_T, null));
        propertiesToCheck.put("OtherSubscriptionState", new CIMProperty("OtherSubscriptionState",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("RepeatNotificationCount", new CIMProperty("RepeatNotificationCount",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("RepeatNotificationGap", new CIMProperty("RepeatNotificationGap",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("RepeatNotificationInterval", new CIMProperty(
                "RepeatNotificationInterval", CIMDataType.UINT64_T, null));
        propertiesToCheck.put("RepeatNotificationPolicy", new CIMProperty(
                "RepeatNotificationPolicy", CIMDataType.UINT16_T, null));
        propertiesToCheck.put("SubscriptionDuration", new CIMProperty("SubscriptionDuration",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("SubscriptionStartTime", new CIMProperty("SubscriptionStartTime",
                CIMDataType.DATETIME_T, null));
        propertiesToCheck.put("SubscriptionState", new CIMProperty("SubscriptionState",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("SubscriptionTimeRemaining", new CIMProperty(
                "SubscriptionTimeRemaining", CIMDataType.UINT64_T, null));
        propertiesToCheck.put("TimeOfLastStateChange", new CIMProperty("TimeOfLastStateChange",
                CIMDataType.DATETIME_T, null));
        propertiesToCheck.put("Filter", new CIMProperty("Filter", new CIMDataType(
                CIM_IndicationFilter.CIM_CLASS_NAME), null));
        propertiesToCheck.put("Handler", new CIMProperty("Handler", new CIMDataType(
                CIM_ListenerDestination.CIM_CLASS_NAME), null));

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
     * Get the property FailureTriggerTimeInterval
     *     * <br>
     * The FailureTriggerTimeInterval is used by the client to specify a recommended minimum delay before the OnFatalErrorPolicy is implemented.
     *     */

    public javax.cim.UnsignedInteger64 get_FailureTriggerTimeInterval() {
        CIMProperty currentProperty = getProperty(PROPERTY_FAILURETRIGGERTIMEINTERVAL.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_FAILURETRIGGERTIMEINTERVAL.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property FailureTriggerTimeInterval
     * <br>
     * The FailureTriggerTimeInterval is used by the client to specify a recommended minimum delay before the OnFatalErrorPolicy is implemented.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_FailureTriggerTimeInterval(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_FAILURETRIGGERTIMEINTERVAL.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_FailureTriggerTimeInterval(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_FAILURETRIGGERTIMEINTERVAL.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property FailureTriggerTimeInterval by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_FailureTriggerTimeInterval(WBEMClient client,
            String namespace, javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_IndicationSubscription fco = new CIM_IndicationSubscription(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_FAILURETRIGGERTIMEINTERVAL.NAME);
        if (property != null) {
            property = setPropertyValue_FailureTriggerTimeInterval(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_FAILURETRIGGERTIMEINTERVAL.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property FailureTriggerTimeInterval
     * <br>
     * The FailureTriggerTimeInterval is used by the client to specify a recommended minimum delay before the OnFatalErrorPolicy is implemented.
     */

    private static CIMProperty setPropertyValue_FailureTriggerTimeInterval(
            CIMProperty currentProperty, javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OnFatalErrorPolicy
     *     * <br>
     * Defines the desired behavior for a subscription when a fatal error occurs in one of the Indication processing subcomponents (e.g., Indication processor, Indication or instance provider, or Indication handler) and the Indication cannot be successfully sent. Specifically, a failure implies that some aspect of Indication generation, processing or dispatch is no longer functioning and Indications may be lost. If the value of OnFatalErrorPolicy is 2 ("Ignore") or not set (NULL), the subscription MUST continue to be processed in a 'best effort' mode. This mode of operation can lead to unpredictable, and potentially misleading results, because Indications may be lost. If the value is 3 ("Disable"), the subscription MUST be disabled. With this policy, no new Indications will be generated or dispatched until the subscription is explicitly enabled. This is accomplished via the property, SubscriptionState. If the value is 4 ("Remove"), the subscription MUST be deleted. Selecting this policy has the same effect as issuing a DeleteInstance operation on this subscription instance.
     *     */

    public javax.cim.UnsignedInteger16 get_OnFatalErrorPolicy() {
        CIMProperty currentProperty = getProperty(PROPERTY_ONFATALERRORPOLICY.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ONFATALERRORPOLICY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property OnFatalErrorPolicy
     * <br>
     * Defines the desired behavior for a subscription when a fatal error occurs in one of the Indication processing subcomponents (e.g., Indication processor, Indication or instance provider, or Indication handler) and the Indication cannot be successfully sent. Specifically, a failure implies that some aspect of Indication generation, processing or dispatch is no longer functioning and Indications may be lost. If the value of OnFatalErrorPolicy is 2 ("Ignore") or not set (NULL), the subscription MUST continue to be processed in a 'best effort' mode. This mode of operation can lead to unpredictable, and potentially misleading results, because Indications may be lost. If the value is 3 ("Disable"), the subscription MUST be disabled. With this policy, no new Indications will be generated or dispatched until the subscription is explicitly enabled. This is accomplished via the property, SubscriptionState. If the value is 4 ("Remove"), the subscription MUST be deleted. Selecting this policy has the same effect as issuing a DeleteInstance operation on this subscription instance.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OnFatalErrorPolicy(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ONFATALERRORPOLICY.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_OnFatalErrorPolicy(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ONFATALERRORPOLICY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OnFatalErrorPolicy by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OnFatalErrorPolicy(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_IndicationSubscription fco = new CIM_IndicationSubscription(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ONFATALERRORPOLICY.NAME);
        if (property != null) {
            property = setPropertyValue_OnFatalErrorPolicy(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ONFATALERRORPOLICY.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OnFatalErrorPolicy
     * <br>
     * Defines the desired behavior for a subscription when a fatal error occurs in one of the Indication processing subcomponents (e.g., Indication processor, Indication or instance provider, or Indication handler) and the Indication cannot be successfully sent. Specifically, a failure implies that some aspect of Indication generation, processing or dispatch is no longer functioning and Indications may be lost. If the value of OnFatalErrorPolicy is 2 ("Ignore") or not set (NULL), the subscription MUST continue to be processed in a 'best effort' mode. This mode of operation can lead to unpredictable, and potentially misleading results, because Indications may be lost. If the value is 3 ("Disable"), the subscription MUST be disabled. With this policy, no new Indications will be generated or dispatched until the subscription is explicitly enabled. This is accomplished via the property, SubscriptionState. If the value is 4 ("Remove"), the subscription MUST be deleted. Selecting this policy has the same effect as issuing a DeleteInstance operation on this subscription instance.
     */

    private static CIMProperty setPropertyValue_OnFatalErrorPolicy(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OtherOnFatalErrorPolicy
     *     * <br>
     * A string defining "Other" values for OnFatalErrorPolicy. This value MUST be set to a non NULL value when OnFatalErrorPolicy is set to a value of 1 ("Other"). For all other values, the OtherOnFatalErrorPolicy MUST be NULL.
     *     */

    public String get_OtherOnFatalErrorPolicy() {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERONFATALERRORPOLICY.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OTHERONFATALERRORPOLICY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property OtherOnFatalErrorPolicy
     * <br>
     * A string defining "Other" values for OnFatalErrorPolicy. This value MUST be set to a non NULL value when OnFatalErrorPolicy is set to a value of 1 ("Other"). For all other values, the OtherOnFatalErrorPolicy MUST be NULL.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OtherOnFatalErrorPolicy(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERONFATALERRORPOLICY.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_OtherOnFatalErrorPolicy(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERONFATALERRORPOLICY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OtherOnFatalErrorPolicy by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherOnFatalErrorPolicy(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_IndicationSubscription fco = new CIM_IndicationSubscription(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OTHERONFATALERRORPOLICY.NAME);
        if (property != null) {
            property = setPropertyValue_OtherOnFatalErrorPolicy(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERONFATALERRORPOLICY.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OtherOnFatalErrorPolicy
     * <br>
     * A string defining "Other" values for OnFatalErrorPolicy. This value MUST be set to a non NULL value when OnFatalErrorPolicy is set to a value of 1 ("Other"). For all other values, the OtherOnFatalErrorPolicy MUST be NULL.
     */

    private static CIMProperty setPropertyValue_OtherOnFatalErrorPolicy(
            CIMProperty currentProperty, String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OtherRepeatNotificationPolicy
     *     * <br>
     * A string defining "Other" values for RepeatNotificationPolicy. This value MUST be set to a non NULL value when RepeatNotificationPolicy is set to a value of 1 ("Other"). For all other values, the OtherRepeatNotificationPolicy MUST be NULL.
     *     */

    public String get_OtherRepeatNotificationPolicy() {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERREPEATNOTIFICATIONPOLICY.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OTHERREPEATNOTIFICATIONPOLICY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property OtherRepeatNotificationPolicy
     * <br>
     * A string defining "Other" values for RepeatNotificationPolicy. This value MUST be set to a non NULL value when RepeatNotificationPolicy is set to a value of 1 ("Other"). For all other values, the OtherRepeatNotificationPolicy MUST be NULL.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OtherRepeatNotificationPolicy(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERREPEATNOTIFICATIONPOLICY.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_OtherRepeatNotificationPolicy(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERREPEATNOTIFICATIONPOLICY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OtherRepeatNotificationPolicy by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherRepeatNotificationPolicy(WBEMClient client,
            String namespace, String newValue) throws WbemsmtException {
        CIM_IndicationSubscription fco = new CIM_IndicationSubscription(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OTHERREPEATNOTIFICATIONPOLICY.NAME);
        if (property != null) {
            property = setPropertyValue_OtherRepeatNotificationPolicy(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERREPEATNOTIFICATIONPOLICY.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OtherRepeatNotificationPolicy
     * <br>
     * A string defining "Other" values for RepeatNotificationPolicy. This value MUST be set to a non NULL value when RepeatNotificationPolicy is set to a value of 1 ("Other"). For all other values, the OtherRepeatNotificationPolicy MUST be NULL.
     */

    private static CIMProperty setPropertyValue_OtherRepeatNotificationPolicy(
            CIMProperty currentProperty, String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OtherSubscriptionState
     *     * <br>
     * A string defining "Other" values for SubscriptionState. This value MUST be set to a non NULL value when SubscriptionState is set to a value of 1 ("Other"). For all other values, the OtherSubscriptionState MUST be NULL.
     *     */

    public String get_OtherSubscriptionState() {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERSUBSCRIPTIONSTATE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OTHERSUBSCRIPTIONSTATE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property OtherSubscriptionState
     * <br>
     * A string defining "Other" values for SubscriptionState. This value MUST be set to a non NULL value when SubscriptionState is set to a value of 1 ("Other"). For all other values, the OtherSubscriptionState MUST be NULL.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OtherSubscriptionState(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERSUBSCRIPTIONSTATE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_OtherSubscriptionState(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERSUBSCRIPTIONSTATE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OtherSubscriptionState by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherSubscriptionState(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_IndicationSubscription fco = new CIM_IndicationSubscription(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OTHERSUBSCRIPTIONSTATE.NAME);
        if (property != null) {
            property = setPropertyValue_OtherSubscriptionState(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERSUBSCRIPTIONSTATE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OtherSubscriptionState
     * <br>
     * A string defining "Other" values for SubscriptionState. This value MUST be set to a non NULL value when SubscriptionState is set to a value of 1 ("Other"). For all other values, the OtherSubscriptionState MUST be NULL.
     */

    private static CIMProperty setPropertyValue_OtherSubscriptionState(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property RepeatNotificationCount
     *     * <br>
     * Defines the count property for the repeat notification policy calculation.
     *     */

    public javax.cim.UnsignedInteger16 get_RepeatNotificationCount() {
        CIMProperty currentProperty = getProperty(PROPERTY_REPEATNOTIFICATIONCOUNT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_REPEATNOTIFICATIONCOUNT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property RepeatNotificationCount
     * <br>
     * Defines the count property for the repeat notification policy calculation.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_RepeatNotificationCount(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_REPEATNOTIFICATIONCOUNT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_RepeatNotificationCount(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_REPEATNOTIFICATIONCOUNT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property RepeatNotificationCount by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_RepeatNotificationCount(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_IndicationSubscription fco = new CIM_IndicationSubscription(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_REPEATNOTIFICATIONCOUNT.NAME);
        if (property != null) {
            property = setPropertyValue_RepeatNotificationCount(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_REPEATNOTIFICATIONCOUNT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property RepeatNotificationCount
     * <br>
     * Defines the count property for the repeat notification policy calculation.
     */

    private static CIMProperty setPropertyValue_RepeatNotificationCount(
            CIMProperty currentProperty, javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property RepeatNotificationGap
     *     * <br>
     * Defines the gap interval for the repeat notification policy calculation.
     *     */

    public javax.cim.UnsignedInteger64 get_RepeatNotificationGap() {
        CIMProperty currentProperty = getProperty(PROPERTY_REPEATNOTIFICATIONGAP.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_REPEATNOTIFICATIONGAP.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property RepeatNotificationGap
     * <br>
     * Defines the gap interval for the repeat notification policy calculation.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_RepeatNotificationGap(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_REPEATNOTIFICATIONGAP.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_RepeatNotificationGap(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_REPEATNOTIFICATIONGAP.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property RepeatNotificationGap by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_RepeatNotificationGap(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_IndicationSubscription fco = new CIM_IndicationSubscription(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_REPEATNOTIFICATIONGAP.NAME);
        if (property != null) {
            property = setPropertyValue_RepeatNotificationGap(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_REPEATNOTIFICATIONGAP.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property RepeatNotificationGap
     * <br>
     * Defines the gap interval for the repeat notification policy calculation.
     */

    private static CIMProperty setPropertyValue_RepeatNotificationGap(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property RepeatNotificationInterval
     *     * <br>
     * Defines the time interval for the repeat notification policy calculation.
     *     */

    public javax.cim.UnsignedInteger64 get_RepeatNotificationInterval() {
        CIMProperty currentProperty = getProperty(PROPERTY_REPEATNOTIFICATIONINTERVAL.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_REPEATNOTIFICATIONINTERVAL.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property RepeatNotificationInterval
     * <br>
     * Defines the time interval for the repeat notification policy calculation.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_RepeatNotificationInterval(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_REPEATNOTIFICATIONINTERVAL.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_RepeatNotificationInterval(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_REPEATNOTIFICATIONINTERVAL.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property RepeatNotificationInterval by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_RepeatNotificationInterval(WBEMClient client,
            String namespace, javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_IndicationSubscription fco = new CIM_IndicationSubscription(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_REPEATNOTIFICATIONINTERVAL.NAME);
        if (property != null) {
            property = setPropertyValue_RepeatNotificationInterval(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_REPEATNOTIFICATIONINTERVAL.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property RepeatNotificationInterval
     * <br>
     * Defines the time interval for the repeat notification policy calculation.
     */

    private static CIMProperty setPropertyValue_RepeatNotificationInterval(
            CIMProperty currentProperty, javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property RepeatNotificationPolicy
     *     * <br>
     * The RepeatNotificationPolicy property defines the desired behavior for handling Indications that report the occurrence of the same underlying event (e.g., the disk is still generating I/O errors and has not yet been repaired). The defined semantics for the RepeatNotificationCount, RepeatNotificationInterval, and RepeatNotificationGap properties depend on the value of RepeatNotificationPolicy, but values for these properties MUST be set if the property is defined for the selected policy. If the value of RepeatNotificationPolicy is 0 ("Unknown") or not set, no special processing for repeat Indications is defined by the subscription. The semantics associated with the handling of repeat Indications MAY be defined by the Indication processing subcomponents. If the value of RepeatNotificationPolicy is 2 ("None"), special processing of repeat Indications MUST NOT be performed. If the value is 3 ("Suppress") the first RepeatNotificationCount Indications, describing the same event, MUST be sent and all subsequent Indications for this event suppressed for the remainder of the time interval RepeatNotificationInterval. A new interval starts when the next Indication for this event is received. If the value of RepeatNotificationPolicy is 4 ("Delay") and an Indication is received, this Indication MUST be suppressed if, including this Indication, RepeatNoticationCount or fewer Indications for this event have been received during the prior time interval defined by RepeatNotificationInterval. If this Indication is the RepeatNotificationCount + 1 Indication, this Indication MUST be sent and all subsequent Indications for this event ignored until the RepeatNotificationGap has elapsed. A RepeatNotificationInterval MAY NOT overlap a RepeatNotificationGap time interval.
     *     */

    public javax.cim.UnsignedInteger16 get_RepeatNotificationPolicy() {
        CIMProperty currentProperty = getProperty(PROPERTY_REPEATNOTIFICATIONPOLICY.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_REPEATNOTIFICATIONPOLICY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property RepeatNotificationPolicy
     * <br>
     * The RepeatNotificationPolicy property defines the desired behavior for handling Indications that report the occurrence of the same underlying event (e.g., the disk is still generating I/O errors and has not yet been repaired). The defined semantics for the RepeatNotificationCount, RepeatNotificationInterval, and RepeatNotificationGap properties depend on the value of RepeatNotificationPolicy, but values for these properties MUST be set if the property is defined for the selected policy. If the value of RepeatNotificationPolicy is 0 ("Unknown") or not set, no special processing for repeat Indications is defined by the subscription. The semantics associated with the handling of repeat Indications MAY be defined by the Indication processing subcomponents. If the value of RepeatNotificationPolicy is 2 ("None"), special processing of repeat Indications MUST NOT be performed. If the value is 3 ("Suppress") the first RepeatNotificationCount Indications, describing the same event, MUST be sent and all subsequent Indications for this event suppressed for the remainder of the time interval RepeatNotificationInterval. A new interval starts when the next Indication for this event is received. If the value of RepeatNotificationPolicy is 4 ("Delay") and an Indication is received, this Indication MUST be suppressed if, including this Indication, RepeatNoticationCount or fewer Indications for this event have been received during the prior time interval defined by RepeatNotificationInterval. If this Indication is the RepeatNotificationCount + 1 Indication, this Indication MUST be sent and all subsequent Indications for this event ignored until the RepeatNotificationGap has elapsed. A RepeatNotificationInterval MAY NOT overlap a RepeatNotificationGap time interval.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_RepeatNotificationPolicy(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_REPEATNOTIFICATIONPOLICY.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_RepeatNotificationPolicy(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_REPEATNOTIFICATIONPOLICY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property RepeatNotificationPolicy by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_RepeatNotificationPolicy(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_IndicationSubscription fco = new CIM_IndicationSubscription(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_REPEATNOTIFICATIONPOLICY.NAME);
        if (property != null) {
            property = setPropertyValue_RepeatNotificationPolicy(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_REPEATNOTIFICATIONPOLICY.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property RepeatNotificationPolicy
     * <br>
     * The RepeatNotificationPolicy property defines the desired behavior for handling Indications that report the occurrence of the same underlying event (e.g., the disk is still generating I/O errors and has not yet been repaired). The defined semantics for the RepeatNotificationCount, RepeatNotificationInterval, and RepeatNotificationGap properties depend on the value of RepeatNotificationPolicy, but values for these properties MUST be set if the property is defined for the selected policy. If the value of RepeatNotificationPolicy is 0 ("Unknown") or not set, no special processing for repeat Indications is defined by the subscription. The semantics associated with the handling of repeat Indications MAY be defined by the Indication processing subcomponents. If the value of RepeatNotificationPolicy is 2 ("None"), special processing of repeat Indications MUST NOT be performed. If the value is 3 ("Suppress") the first RepeatNotificationCount Indications, describing the same event, MUST be sent and all subsequent Indications for this event suppressed for the remainder of the time interval RepeatNotificationInterval. A new interval starts when the next Indication for this event is received. If the value of RepeatNotificationPolicy is 4 ("Delay") and an Indication is received, this Indication MUST be suppressed if, including this Indication, RepeatNoticationCount or fewer Indications for this event have been received during the prior time interval defined by RepeatNotificationInterval. If this Indication is the RepeatNotificationCount + 1 Indication, this Indication MUST be sent and all subsequent Indications for this event ignored until the RepeatNotificationGap has elapsed. A RepeatNotificationInterval MAY NOT overlap a RepeatNotificationGap time interval.
     */

    private static CIMProperty setPropertyValue_RepeatNotificationPolicy(
            CIMProperty currentProperty, javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property SubscriptionDuration
     *     * <br>
     * SubscriptionDuration defines the desired length of the subscription. Indications generated after the duration of the subscription has exceeded SubscriptionDuration MUST NOT be sent. The duration of a subscription MAY be changed by modifying this property. An expired subscription MAY be deleted and MUST NOT be modified. If the value of SubscriptionDuration is not set, the subscription MUST be treated as having no expiration date.
     *     */

    public javax.cim.UnsignedInteger64 get_SubscriptionDuration() {
        CIMProperty currentProperty = getProperty(PROPERTY_SUBSCRIPTIONDURATION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SUBSCRIPTIONDURATION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property SubscriptionDuration
     * <br>
     * SubscriptionDuration defines the desired length of the subscription. Indications generated after the duration of the subscription has exceeded SubscriptionDuration MUST NOT be sent. The duration of a subscription MAY be changed by modifying this property. An expired subscription MAY be deleted and MUST NOT be modified. If the value of SubscriptionDuration is not set, the subscription MUST be treated as having no expiration date.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_SubscriptionDuration(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SUBSCRIPTIONDURATION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_SubscriptionDuration(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SUBSCRIPTIONDURATION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SubscriptionDuration by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SubscriptionDuration(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_IndicationSubscription fco = new CIM_IndicationSubscription(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SUBSCRIPTIONDURATION.NAME);
        if (property != null) {
            property = setPropertyValue_SubscriptionDuration(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SUBSCRIPTIONDURATION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SubscriptionDuration
     * <br>
     * SubscriptionDuration defines the desired length of the subscription. Indications generated after the duration of the subscription has exceeded SubscriptionDuration MUST NOT be sent. The duration of a subscription MAY be changed by modifying this property. An expired subscription MAY be deleted and MUST NOT be modified. If the value of SubscriptionDuration is not set, the subscription MUST be treated as having no expiration date.
     */

    private static CIMProperty setPropertyValue_SubscriptionDuration(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property SubscriptionStartTime
     *     * <br>
     * SubscriptionStartTime is the time the subscription was started. The value of this property is computed based on the notion of date and time of the ManagedSystemElement running the Indication processing subcomponents.
     *     */

    public javax.cim.CIMDateTime get_SubscriptionStartTime() {
        CIMProperty currentProperty = getProperty(PROPERTY_SUBSCRIPTIONSTARTTIME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SUBSCRIPTIONSTARTTIME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.CIMDateTime) currentProperty.getValue();

    }

    /**
     * Set the property SubscriptionStartTime
     * <br>
     * SubscriptionStartTime is the time the subscription was started. The value of this property is computed based on the notion of date and time of the ManagedSystemElement running the Indication processing subcomponents.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_SubscriptionStartTime(javax.cim.CIMDateTime newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SUBSCRIPTIONSTARTTIME.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_SubscriptionStartTime(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SUBSCRIPTIONSTARTTIME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SubscriptionStartTime by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SubscriptionStartTime(WBEMClient client, String namespace,
            javax.cim.CIMDateTime newValue) throws WbemsmtException {
        CIM_IndicationSubscription fco = new CIM_IndicationSubscription(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SUBSCRIPTIONSTARTTIME.NAME);
        if (property != null) {
            property = setPropertyValue_SubscriptionStartTime(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SUBSCRIPTIONSTARTTIME.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SubscriptionStartTime
     * <br>
     * SubscriptionStartTime is the time the subscription was started. The value of this property is computed based on the notion of date and time of the ManagedSystemElement running the Indication processing subcomponents.
     */

    private static CIMProperty setPropertyValue_SubscriptionStartTime(CIMProperty currentProperty,
            javax.cim.CIMDateTime newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property SubscriptionState
     *     * <br>
     * Indicates the current processing state of the subscription.
     *     */

    public javax.cim.UnsignedInteger16 get_SubscriptionState() {
        CIMProperty currentProperty = getProperty(PROPERTY_SUBSCRIPTIONSTATE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SUBSCRIPTIONSTATE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property SubscriptionState
     * <br>
     * Indicates the current processing state of the subscription.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_SubscriptionState(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SUBSCRIPTIONSTATE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_SubscriptionState(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SUBSCRIPTIONSTATE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SubscriptionState by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SubscriptionState(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_IndicationSubscription fco = new CIM_IndicationSubscription(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SUBSCRIPTIONSTATE.NAME);
        if (property != null) {
            property = setPropertyValue_SubscriptionState(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SUBSCRIPTIONSTATE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SubscriptionState
     * <br>
     * Indicates the current processing state of the subscription.
     */

    private static CIMProperty setPropertyValue_SubscriptionState(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property SubscriptionTimeRemaining
     *     * <br>
     * SubscriptionTimeRemaining is a computed value that provides a snapshot of the time remaining in the Subscription.
     *     */

    public javax.cim.UnsignedInteger64 get_SubscriptionTimeRemaining() {
        CIMProperty currentProperty = getProperty(PROPERTY_SUBSCRIPTIONTIMEREMAINING.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SUBSCRIPTIONTIMEREMAINING.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property SubscriptionTimeRemaining
     * <br>
     * SubscriptionTimeRemaining is a computed value that provides a snapshot of the time remaining in the Subscription.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_SubscriptionTimeRemaining(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SUBSCRIPTIONTIMEREMAINING.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_SubscriptionTimeRemaining(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SUBSCRIPTIONTIMEREMAINING.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SubscriptionTimeRemaining by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SubscriptionTimeRemaining(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_IndicationSubscription fco = new CIM_IndicationSubscription(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SUBSCRIPTIONTIMEREMAINING.NAME);
        if (property != null) {
            property = setPropertyValue_SubscriptionTimeRemaining(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SUBSCRIPTIONTIMEREMAINING.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SubscriptionTimeRemaining
     * <br>
     * SubscriptionTimeRemaining is a computed value that provides a snapshot of the time remaining in the Subscription.
     */

    private static CIMProperty setPropertyValue_SubscriptionTimeRemaining(
            CIMProperty currentProperty, javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property TimeOfLastStateChange
     *     * <br>
     * Date and time of the last state change. This value is based on the notion of local date and time of the Managed System Element running the Indication processing subcomponents.
     *     */

    public javax.cim.CIMDateTime get_TimeOfLastStateChange() {
        CIMProperty currentProperty = getProperty(PROPERTY_TIMEOFLASTSTATECHANGE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_TIMEOFLASTSTATECHANGE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.CIMDateTime) currentProperty.getValue();

    }

    /**
     * Set the property TimeOfLastStateChange
     * <br>
     * Date and time of the last state change. This value is based on the notion of local date and time of the Managed System Element running the Indication processing subcomponents.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_TimeOfLastStateChange(javax.cim.CIMDateTime newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_TIMEOFLASTSTATECHANGE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_TimeOfLastStateChange(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_TIMEOFLASTSTATECHANGE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property TimeOfLastStateChange by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_TimeOfLastStateChange(WBEMClient client, String namespace,
            javax.cim.CIMDateTime newValue) throws WbemsmtException {
        CIM_IndicationSubscription fco = new CIM_IndicationSubscription(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_TIMEOFLASTSTATECHANGE.NAME);
        if (property != null) {
            property = setPropertyValue_TimeOfLastStateChange(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_TIMEOFLASTSTATECHANGE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property TimeOfLastStateChange
     * <br>
     * Date and time of the last state change. This value is based on the notion of local date and time of the Managed System Element running the Indication processing subcomponents.
     */

    private static CIMProperty setPropertyValue_TimeOfLastStateChange(CIMProperty currentProperty,
            javax.cim.CIMDateTime newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Filter
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_IndicationFilter get_Filter_CIM_IndicationFilter(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_FILTER_CIM_INDICATIONFILTER.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_FILTER_CIM_INDICATIONFILTER.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_IndicationFilterHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property Filter
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Filter_CIM_IndicationFilter(CIM_IndicationFilter newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_FILTER_CIM_INDICATIONFILTER.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Filter_CIM_IndicationFilter(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_FILTER_CIM_INDICATIONFILTER.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Filter by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Filter_CIM_IndicationFilter(WBEMClient client,
            String namespace, CIM_IndicationFilter newValue) throws WbemsmtException {
        CIM_IndicationSubscription fco = new CIM_IndicationSubscription(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_FILTER_CIM_INDICATIONFILTER.NAME);
        if (property != null) {
            property = setPropertyValue_Filter_CIM_IndicationFilter(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_FILTER_CIM_INDICATIONFILTER.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Filter
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_Filter_CIM_IndicationFilter(
            CIMProperty currentProperty, CIM_IndicationFilter newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getCimObjectPath() : null;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Handler
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_ListenerDestination get_Handler_CIM_ListenerDestination(
            javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_HANDLER_CIM_LISTENERDESTINATION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_HANDLER_CIM_LISTENERDESTINATION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_ListenerDestinationHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property Handler
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Handler_CIM_ListenerDestination(CIM_ListenerDestination newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_HANDLER_CIM_LISTENERDESTINATION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Handler_CIM_ListenerDestination(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_HANDLER_CIM_LISTENERDESTINATION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Handler by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Handler_CIM_ListenerDestination(WBEMClient client,
            String namespace, CIM_ListenerDestination newValue) throws WbemsmtException {
        CIM_IndicationSubscription fco = new CIM_IndicationSubscription(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_HANDLER_CIM_LISTENERDESTINATION.NAME);
        if (property != null) {
            property = setPropertyValue_Handler_CIM_ListenerDestination(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_HANDLER_CIM_LISTENERDESTINATION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Handler
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_Handler_CIM_ListenerDestination(
            CIMProperty currentProperty, CIM_ListenerDestination newValue) {
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
        if (!(object instanceof CIM_IndicationSubscription)) {
            return false;
        }

        return super.equals(object);
    }

    /**
     * return the name of the CIMClass
     * @return
     */
    public String getObjectName() {
        return CIM_IndicationSubscription.CIM_CLASS_NAME;
    }

}