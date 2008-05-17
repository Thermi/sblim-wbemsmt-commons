/** 
 * CIM_LogicalDevice.java
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
 * Description: An abstraction or emulation of a hardware entity, that may or may not be Realized in physical hardware. Any characteristics of a LogicalDevice that are used to manage its operation or configuration are contained in, or associated with, the LogicalDevice object. Examples of the operational properties of a Printer would be paper sizes supported, or detected errors. Examples of the configuration properties of a Sensor Device would be threshold settings. Various configurations could exist for a LogicalDevice. These configurations could be contained in Setting objects and associated with the LogicalDevice.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim_2_14;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;
import org.sblim.wbemsmt.exception.impl.*;
import org.sblim.wbemsmt.exception.impl.userobject.*;

import javax.wbem.*;

public class CIM_LogicalDevice extends CIM_EnabledLogicalElement {

    public final static String CIM_CLASS_NAME = "CIM_LogicalDevice";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constant for method\'s name and parameters
     * The EnableDevice method has been deprecated in lieu of the more general RequestStateChange method that directly overlaps with the functionality provided by this method. 
     * Requests that the LogicalDevice be enabled ("Enabled" input parameter = TRUE) or disabled (= FALSE). If successful, the Device's StatusInfo/EnabledState properties should reflect the desired state (enabled/disabled). Note that this method's function overlaps with the RequestedState property. RequestedState was added to the model to maintain a record (i.e., a persisted value) of the last state request. Invoking the EnableDevice method should set the RequestedState property appropriately. 
     * The return code should be 0 if the request was successfully executed, 1 if the request is not supported and some other value if an error occurred. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
     */

    public static class METHOD_ENABLEDEVICE {
        /**
         * Constant for method EnableDevice
         */
        public final static String NAME = "EnableDevice";

        /**
         * constants for parameter Enabled
         */
        public static class PARAMETER_ENABLED {
            /*
             * Name of the parameter Enabled
             */
            public final static String NAME = "Enabled";

        }
    }

    /**
     * Constant for method\'s name and parameters
     * The OnlineDevice method has been deprecated in lieu of the more general RequestStateChange method that directly overlaps with the functionality provided by this method. 
     * Requests that the LogicalDevice be brought online ("Online" input parameter = TRUE) or taken offline (= FALSE). "Online" indicates that the Device is ready to accept requests, and is operational and fully functioning. In this case, the Device's Availability property would be set to a value of 3 ("Running/Full Power"). "Offline" indicates that a Device is powered up and operational, but not processing functional requests. In an offline state, a Device may be capable of running diagnostics or generating operational alerts. For example, when the "Offline" button is pushed on a Printer, the Device is no longer available to process print jobs, but could be available for diagnostics or maintenance. 
     * If this method is successful, the Device's Availability and AdditionalAvailability properties should reflect the updated status. If a failure occurs trying to bring the Device online or offline, it should remain in its current state. IE, the request, if unsuccessful, should not leave the Device in an indeterminate state. When bringing a Device back "Online", from an "Offline" mode, the Device should be restored to its last "Online" state, if at all possible. Only a Device that has an EnabledState/StatusInfo of "Enabled" and has been configured can be brought online or taken offline. 
     * OnlineDevice should return 0 if successful, 1 if the request is not supported at all, 2 if the request is not supported due to the current state of the Device, and some other value if any other error occurred. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier. 
     * Note that this method's function overlaps with the RequestedState property. RequestedState was added to the model to maintain a record (i.e., a persisted value) of the last state request. Invoking the OnlineDevice method should set the RequestedState property appropriately.
     */

    public static class METHOD_ONLINEDEVICE {
        /**
         * Constant for method OnlineDevice
         */
        public final static String NAME = "OnlineDevice";

        /**
         * constants for parameter Online
         */
        public static class PARAMETER_ONLINE {
            /*
             * Name of the parameter Online
             */
            public final static String NAME = "Online";

        }
    }

    /**
     * Constant for method\'s name and parameters
     * The QuiesceDevice method has been deprecated in lieu of the more general RequestStateChange method that directly overlaps with the functionality provided by this method. 
     * Requests that the LogicalDevice cleanly cease all current activity ("Quiesce" input parameter = TRUE) or resume activity (= FALSE). For this method to quiesce a Device, that Device should have an Availability (or Additional Availability) of "Running/Full Power" (value=3) and an EnabledStatus/StatusInfo of "Enabled". For example, if quiesced, a Device may then be offlined for diagnostics, or disabled for power off and hot swap. For the method to "unquiesce" a Device, that Device should have an Availability (or AdditionalAvailability) of "Quiesced" (value=21) and an EnabledStatus/StatusInfo of "Enabled". In this case, the Device would be returned to an "Enabled" and "Running/Full Power" status. 
     * The method's return code should indicate the success or failure of the quiesce. It should return 0 if successful, 1 if the request is not supported at all, 2 if the request is not supported due to the current state of the Device, and some other value if any other error occurred. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
     */

    public static class METHOD_QUIESCEDEVICE {
        /**
         * Constant for method QuiesceDevice
         */
        public final static String NAME = "QuiesceDevice";

        /**
         * constants for parameter Quiesce
         */
        public static class PARAMETER_QUIESCE {
            /*
             * Name of the parameter Quiesce
             */
            public final static String NAME = "Quiesce";

        }
    }

    /**
     * Constant for method\'s name and parameters
     * Requests a reset of the LogicalDevice. The return value should be 0 if the request was successfully executed, 1 if the request is not supported and some other value if an error occurred. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
     */

    public static class METHOD_RESET {
        /**
         * Constant for method Reset
         */
        public final static String NAME = "Reset";

    }

    /**
     * Constant for method\'s name and parameters
     * Requests that the Device re-establish its configuration, setup and/or state information from a backing store. The intent is to capture this information at an earlier time (via the SaveProperties method), and use it to return a Device to this earlier "condition". This method may not be supported by all Devices. The method should return 0 if successful, 1 if the request is not supported, and some other value if any other error occurred. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
     */

    public static class METHOD_RESTOREPROPERTIES {
        /**
         * Constant for method RestoreProperties
         */
        public final static String NAME = "RestoreProperties";

    }

    /**
     * Constant for method\'s name and parameters
     * Requests that the Device capture its current configuration, setup and/or state information in a backing store. The goal would be to use this information at a later time (via the RestoreProperties method), to return a Device to its present "condition". This method may not be supported by all Devices. The method should return 0 if successful, 1 if the request is not supported, and some other value if any other error occurred. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
     */

    public static class METHOD_SAVEPROPERTIES {
        /**
         * Constant for method SaveProperties
         */
        public final static String NAME = "SaveProperties";

    }

    /**
     * Constant for method\'s name and parameters
     * Sets the power state of the Device. The use of this method has been deprecated. Instead, use the SetPowerState method in the associated PowerManagementService class.
     */

    public static class METHOD_SETPOWERSTATE {
        /**
         * Constant for method SetPowerState
         */
        public final static String NAME = "SetPowerState";

        /**
         * constants for parameter PowerState
         */
        public static class PARAMETER_POWERSTATE {
            /*
             * Name of the parameter PowerState
             */
            public final static String NAME = "PowerState";

            /**
             * constant for value map entry 1
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Full_Power = new javax.cim.UnsignedInteger16(
                    "1");

            /**
             * constant for value entry Full Power (corresponds to mapEntry 1 )
             */
            public final static String VALUE_ENTRY_Full_Power = "Full Power";

            /**
             * constant for value map entry 2
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Power_Save___Low_Power_Mode = new javax.cim.UnsignedInteger16(
                    "2");

            /**
             * constant for value entry Power Save - Low Power Mode (corresponds to mapEntry 2 )
             */
            public final static String VALUE_ENTRY_Power_Save___Low_Power_Mode = "Power Save - Low Power Mode";

            /**
             * constant for value map entry 3
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Power_Save___Standby = new javax.cim.UnsignedInteger16(
                    "3");

            /**
             * constant for value entry Power Save - Standby (corresponds to mapEntry 3 )
             */
            public final static String VALUE_ENTRY_Power_Save___Standby = "Power Save - Standby";

            /**
             * constant for value map entry 4
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Power_Save___Other = new javax.cim.UnsignedInteger16(
                    "4");

            /**
             * constant for value entry Power Save - Other (corresponds to mapEntry 4 )
             */
            public final static String VALUE_ENTRY_Power_Save___Other = "Power Save - Other";

            /**
             * constant for value map entry 5
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Power_Cycle = new javax.cim.UnsignedInteger16(
                    "5");

            /**
             * constant for value entry Power Cycle (corresponds to mapEntry 5 )
             */
            public final static String VALUE_ENTRY_Power_Cycle = "Power Cycle";

            /**
             * constant for value map entry 6
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Power_Off = new javax.cim.UnsignedInteger16(
                    "6");

            /**
             * constant for value entry Power Off (corresponds to mapEntry 6 )
             */
            public final static String VALUE_ENTRY_Power_Off = "Power Off";

            /**
             * get the ValueMapEntry of the given value
             * @param value the value to find the ValueMapEntry for
             * @return the ValueMap entry or null if not found
             */
            //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@577c577c
            public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

                if (VALUE_ENTRY_Full_Power.equals(value)) {
                    return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Full_Power;
                }

                if (VALUE_ENTRY_Power_Save___Low_Power_Mode.equals(value)) {
                    return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Power_Save___Low_Power_Mode;
                }

                if (VALUE_ENTRY_Power_Save___Standby.equals(value)) {
                    return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Power_Save___Standby;
                }

                if (VALUE_ENTRY_Power_Save___Other.equals(value)) {
                    return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Power_Save___Other;
                }

                if (VALUE_ENTRY_Power_Cycle.equals(value)) {
                    return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Power_Cycle;
                }

                if (VALUE_ENTRY_Power_Off.equals(value)) {
                    return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Power_Off;
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

                if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Full_Power.intValue()) {
                    return VALUE_ENTRY_Full_Power;
                }

                if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Power_Save___Low_Power_Mode
                        .intValue()) {
                    return VALUE_ENTRY_Power_Save___Low_Power_Mode;
                }

                if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Power_Save___Standby.intValue()) {
                    return VALUE_ENTRY_Power_Save___Standby;
                }

                if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Power_Save___Other.intValue()) {
                    return VALUE_ENTRY_Power_Save___Other;
                }

                if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Power_Cycle.intValue()) {
                    return VALUE_ENTRY_Power_Cycle;
                }

                if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Power_Off.intValue()) {
                    return VALUE_ENTRY_Power_Off;
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
             * Value Map for the parameter PowerState of the method SetPowerState   
             */
            public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                    VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Full_Power,
                    VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Power_Save___Low_Power_Mode,
                    VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Power_Save___Standby,
                    VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Power_Save___Other,
                    VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Power_Cycle,
                    VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Power_Off };

            /**
             * Values
             * Contains all values even those having an integer value range representation within the valueMap
             * Value Map for the parameter PowerState of the method SetPowerState   
             */
            public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Full_Power,
                    VALUE_ENTRY_Power_Save___Low_Power_Mode, VALUE_ENTRY_Power_Save___Standby,
                    VALUE_ENTRY_Power_Save___Other, VALUE_ENTRY_Power_Cycle, VALUE_ENTRY_Power_Off };

            /**
             * Values for displaying within pulldown elements, lists, radio buttons etc
             * Contains no values that having an integer value range representation within the valueMap
             * 
             * Value Map for the parameter PowerState of the method SetPowerState   
             */
            public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Full_Power,
                    VALUE_ENTRY_Power_Save___Low_Power_Mode, VALUE_ENTRY_Power_Save___Standby,
                    VALUE_ENTRY_Power_Save___Other, VALUE_ENTRY_Power_Cycle, VALUE_ENTRY_Power_Off };

        }

        /**
         * constants for parameter Time
         */
        public static class PARAMETER_TIME {
            /*
             * Name of the parameter Time
             */
            public final static String NAME = "Time";

        }
    }

    /**
     * Constants of property AdditionalAvailability
     * Additional availability and status of the Device, beyond that specified in the Availability property. The Availability property denotes the primary status and availability of the Device. In some cases, this will not be sufficient to denote the complete status of the Device. In those cases, the AdditionalAvailability property can be used to provide further information. For example, a Device's primary Availability may be "Off line" (value=8), but it may also be in a low power state (AdditonalAvailability value=14), or the Device could be running Diagnostics (AdditionalAvailability value=5, "In Test").
     */
    public static class PROPERTY_ADDITIONALAVAILABILITY {
        /**
         * name of the property AdditionalAvailability
         */
        public final static String NAME = "AdditionalAvailability";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Unknown (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Unknown = "Unknown";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Running_Full_Power = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Running/Full Power (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Running_Full_Power = "Running/Full Power";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Warning = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Warning (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Warning = "Warning";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_In_Test = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry In Test (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_In_Test = "In Test";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Not_Applicable = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry Not Applicable (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Not_Applicable = "Not Applicable";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Power_Off = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry Power Off (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_Power_Off = "Power Off";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Off_Line = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry Off Line (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_Off_Line = "Off Line";

        /**
         * constant for value map entry 9
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Off_Duty = new javax.cim.UnsignedInteger16(
                "9");

        /**
         * constant for value entry Off Duty (corresponds to mapEntry 9 )
         */
        public final static String VALUE_ENTRY_Off_Duty = "Off Duty";

        /**
         * constant for value map entry 10
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Degraded = new javax.cim.UnsignedInteger16(
                "10");

        /**
         * constant for value entry Degraded (corresponds to mapEntry 10 )
         */
        public final static String VALUE_ENTRY_Degraded = "Degraded";

        /**
         * constant for value map entry 11
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Not_Installed = new javax.cim.UnsignedInteger16(
                "11");

        /**
         * constant for value entry Not Installed (corresponds to mapEntry 11 )
         */
        public final static String VALUE_ENTRY_Not_Installed = "Not Installed";

        /**
         * constant for value map entry 12
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Install_Error = new javax.cim.UnsignedInteger16(
                "12");

        /**
         * constant for value entry Install Error (corresponds to mapEntry 12 )
         */
        public final static String VALUE_ENTRY_Install_Error = "Install Error";

        /**
         * constant for value map entry 13
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Power_Save___Unknown = new javax.cim.UnsignedInteger16(
                "13");

        /**
         * constant for value entry Power Save - Unknown (corresponds to mapEntry 13 )
         */
        public final static String VALUE_ENTRY_Power_Save___Unknown = "Power Save - Unknown";

        /**
         * constant for value map entry 14
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_Power_Save___Low_Power_Mode = new javax.cim.UnsignedInteger16(
                "14");

        /**
         * constant for value entry Power Save - Low Power Mode (corresponds to mapEntry 14 )
         */
        public final static String VALUE_ENTRY_Power_Save___Low_Power_Mode = "Power Save - Low Power Mode";

        /**
         * constant for value map entry 15
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Power_Save___Standby = new javax.cim.UnsignedInteger16(
                "15");

        /**
         * constant for value entry Power Save - Standby (corresponds to mapEntry 15 )
         */
        public final static String VALUE_ENTRY_Power_Save___Standby = "Power Save - Standby";

        /**
         * constant for value map entry 16
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_Power_Cycle = new javax.cim.UnsignedInteger16(
                "16");

        /**
         * constant for value entry Power Cycle (corresponds to mapEntry 16 )
         */
        public final static String VALUE_ENTRY_Power_Cycle = "Power Cycle";

        /**
         * constant for value map entry 17
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_Power_Save___Warning = new javax.cim.UnsignedInteger16(
                "17");

        /**
         * constant for value entry Power Save - Warning (corresponds to mapEntry 17 )
         */
        public final static String VALUE_ENTRY_Power_Save___Warning = "Power Save - Warning";

        /**
         * constant for value map entry 18
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_Paused = new javax.cim.UnsignedInteger16(
                "18");

        /**
         * constant for value entry Paused (corresponds to mapEntry 18 )
         */
        public final static String VALUE_ENTRY_Paused = "Paused";

        /**
         * constant for value map entry 19
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_Not_Ready = new javax.cim.UnsignedInteger16(
                "19");

        /**
         * constant for value entry Not Ready (corresponds to mapEntry 19 )
         */
        public final static String VALUE_ENTRY_Not_Ready = "Not Ready";

        /**
         * constant for value map entry 20
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_Not_Configured = new javax.cim.UnsignedInteger16(
                "20");

        /**
         * constant for value entry Not Configured (corresponds to mapEntry 20 )
         */
        public final static String VALUE_ENTRY_Not_Configured = "Not Configured";

        /**
         * constant for value map entry 21
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_Quiesced = new javax.cim.UnsignedInteger16(
                "21");

        /**
         * constant for value entry Quiesced (corresponds to mapEntry 21 )
         */
        public final static String VALUE_ENTRY_Quiesced = "Quiesced";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@cb40cb4
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Running_Full_Power.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Running_Full_Power;
            }

            if (VALUE_ENTRY_Warning.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Warning;
            }

            if (VALUE_ENTRY_In_Test.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_In_Test;
            }

            if (VALUE_ENTRY_Not_Applicable.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Not_Applicable;
            }

            if (VALUE_ENTRY_Power_Off.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Power_Off;
            }

            if (VALUE_ENTRY_Off_Line.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Off_Line;
            }

            if (VALUE_ENTRY_Off_Duty.equals(value)) {
                return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Off_Duty;
            }

            if (VALUE_ENTRY_Degraded.equals(value)) {
                return VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Degraded;
            }

            if (VALUE_ENTRY_Not_Installed.equals(value)) {
                return VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Not_Installed;
            }

            if (VALUE_ENTRY_Install_Error.equals(value)) {
                return VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Install_Error;
            }

            if (VALUE_ENTRY_Power_Save___Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Power_Save___Unknown;
            }

            if (VALUE_ENTRY_Power_Save___Low_Power_Mode.equals(value)) {
                return VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_Power_Save___Low_Power_Mode;
            }

            if (VALUE_ENTRY_Power_Save___Standby.equals(value)) {
                return VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Power_Save___Standby;
            }

            if (VALUE_ENTRY_Power_Cycle.equals(value)) {
                return VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_Power_Cycle;
            }

            if (VALUE_ENTRY_Power_Save___Warning.equals(value)) {
                return VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_Power_Save___Warning;
            }

            if (VALUE_ENTRY_Paused.equals(value)) {
                return VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_Paused;
            }

            if (VALUE_ENTRY_Not_Ready.equals(value)) {
                return VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_Not_Ready;
            }

            if (VALUE_ENTRY_Not_Configured.equals(value)) {
                return VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_Not_Configured;
            }

            if (VALUE_ENTRY_Quiesced.equals(value)) {
                return VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_Quiesced;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown.intValue()) {
                return VALUE_ENTRY_Unknown;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Running_Full_Power.intValue()) {
                return VALUE_ENTRY_Running_Full_Power;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Warning.intValue()) {
                return VALUE_ENTRY_Warning;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_In_Test.intValue()) {
                return VALUE_ENTRY_In_Test;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Not_Applicable.intValue()) {
                return VALUE_ENTRY_Not_Applicable;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Power_Off.intValue()) {
                return VALUE_ENTRY_Power_Off;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Off_Line.intValue()) {
                return VALUE_ENTRY_Off_Line;
            }

            if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Off_Duty.intValue()) {
                return VALUE_ENTRY_Off_Duty;
            }

            if (iValue == VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Degraded.intValue()) {
                return VALUE_ENTRY_Degraded;
            }

            if (iValue == VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Not_Installed.intValue()) {
                return VALUE_ENTRY_Not_Installed;
            }

            if (iValue == VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Install_Error.intValue()) {
                return VALUE_ENTRY_Install_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Power_Save___Unknown.intValue()) {
                return VALUE_ENTRY_Power_Save___Unknown;
            }

            if (iValue == VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_Power_Save___Low_Power_Mode.intValue()) {
                return VALUE_ENTRY_Power_Save___Low_Power_Mode;
            }

            if (iValue == VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Power_Save___Standby.intValue()) {
                return VALUE_ENTRY_Power_Save___Standby;
            }

            if (iValue == VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_Power_Cycle.intValue()) {
                return VALUE_ENTRY_Power_Cycle;
            }

            if (iValue == VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_Power_Save___Warning.intValue()) {
                return VALUE_ENTRY_Power_Save___Warning;
            }

            if (iValue == VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_Paused.intValue()) {
                return VALUE_ENTRY_Paused;
            }

            if (iValue == VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_Not_Ready.intValue()) {
                return VALUE_ENTRY_Not_Ready;
            }

            if (iValue == VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_Not_Configured.intValue()) {
                return VALUE_ENTRY_Not_Configured;
            }

            if (iValue == VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_Quiesced.intValue()) {
                return VALUE_ENTRY_Quiesced;
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
         * Value Map for the property AdditionalAvailability   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other, VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Running_Full_Power,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Warning,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_In_Test,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Not_Applicable,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Power_Off,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Off_Line,
                VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Off_Duty,
                VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Degraded,
                VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Not_Installed,
                VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Install_Error,
                VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Power_Save___Unknown,
                VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_Power_Save___Low_Power_Mode,
                VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Power_Save___Standby,
                VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_Power_Cycle,
                VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_Power_Save___Warning,
                VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_Paused,
                VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_Not_Ready,
                VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_Not_Configured,
                VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_Quiesced };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property AdditionalAvailability   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Other, VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Running_Full_Power, VALUE_ENTRY_Warning, VALUE_ENTRY_In_Test,
                VALUE_ENTRY_Not_Applicable, VALUE_ENTRY_Power_Off, VALUE_ENTRY_Off_Line,
                VALUE_ENTRY_Off_Duty, VALUE_ENTRY_Degraded, VALUE_ENTRY_Not_Installed,
                VALUE_ENTRY_Install_Error, VALUE_ENTRY_Power_Save___Unknown,
                VALUE_ENTRY_Power_Save___Low_Power_Mode, VALUE_ENTRY_Power_Save___Standby,
                VALUE_ENTRY_Power_Cycle, VALUE_ENTRY_Power_Save___Warning, VALUE_ENTRY_Paused,
                VALUE_ENTRY_Not_Ready, VALUE_ENTRY_Not_Configured, VALUE_ENTRY_Quiesced };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property AdditionalAvailability   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Other,
                VALUE_ENTRY_Unknown, VALUE_ENTRY_Running_Full_Power, VALUE_ENTRY_Warning,
                VALUE_ENTRY_In_Test, VALUE_ENTRY_Not_Applicable, VALUE_ENTRY_Power_Off,
                VALUE_ENTRY_Off_Line, VALUE_ENTRY_Off_Duty, VALUE_ENTRY_Degraded,
                VALUE_ENTRY_Not_Installed, VALUE_ENTRY_Install_Error,
                VALUE_ENTRY_Power_Save___Unknown, VALUE_ENTRY_Power_Save___Low_Power_Mode,
                VALUE_ENTRY_Power_Save___Standby, VALUE_ENTRY_Power_Cycle,
                VALUE_ENTRY_Power_Save___Warning, VALUE_ENTRY_Paused, VALUE_ENTRY_Not_Ready,
                VALUE_ENTRY_Not_Configured, VALUE_ENTRY_Quiesced };

    }

    /**
     * Constants of property Availability
     * The primary availability and status of the Device. (Additional status information can be specified using the Additional Availability array property.) For example, the Availability property indicates that the Device is running and has full power (value=3), or is in a warning (4), test (5), degraded (10) or power save state (values 13-15 and 17). Regarding the Power Save states, these are defined as follows: Value 13 ("Power Save - Unknown") indicates that the Device is known to be in a power save mode, but its exact status in this mode is unknown; 14 ("Power Save - Low Power Mode") indicates that the Device is in a power save state but still functioning, and may exhibit degraded performance; 15 ("Power Save - Standby") describes that the Device is not functioning but could be brought to full power 'quickly'; and value 17 ("Power Save - Warning") indicates that the Device is in a warning state, though also in a power save mode.
     */
    public static class PROPERTY_AVAILABILITY {
        /**
         * name of the property Availability
         */
        public final static String NAME = "Availability";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Unknown (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Unknown = "Unknown";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Running_Full_Power = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Running/Full Power (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Running_Full_Power = "Running/Full Power";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Warning = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Warning (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Warning = "Warning";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_In_Test = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry In Test (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_In_Test = "In Test";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Not_Applicable = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry Not Applicable (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Not_Applicable = "Not Applicable";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Power_Off = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry Power Off (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_Power_Off = "Power Off";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Off_Line = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry Off Line (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_Off_Line = "Off Line";

        /**
         * constant for value map entry 9
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Off_Duty = new javax.cim.UnsignedInteger16(
                "9");

        /**
         * constant for value entry Off Duty (corresponds to mapEntry 9 )
         */
        public final static String VALUE_ENTRY_Off_Duty = "Off Duty";

        /**
         * constant for value map entry 10
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Degraded = new javax.cim.UnsignedInteger16(
                "10");

        /**
         * constant for value entry Degraded (corresponds to mapEntry 10 )
         */
        public final static String VALUE_ENTRY_Degraded = "Degraded";

        /**
         * constant for value map entry 11
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Not_Installed = new javax.cim.UnsignedInteger16(
                "11");

        /**
         * constant for value entry Not Installed (corresponds to mapEntry 11 )
         */
        public final static String VALUE_ENTRY_Not_Installed = "Not Installed";

        /**
         * constant for value map entry 12
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Install_Error = new javax.cim.UnsignedInteger16(
                "12");

        /**
         * constant for value entry Install Error (corresponds to mapEntry 12 )
         */
        public final static String VALUE_ENTRY_Install_Error = "Install Error";

        /**
         * constant for value map entry 13
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Power_Save___Unknown = new javax.cim.UnsignedInteger16(
                "13");

        /**
         * constant for value entry Power Save - Unknown (corresponds to mapEntry 13 )
         */
        public final static String VALUE_ENTRY_Power_Save___Unknown = "Power Save - Unknown";

        /**
         * constant for value map entry 14
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_Power_Save___Low_Power_Mode = new javax.cim.UnsignedInteger16(
                "14");

        /**
         * constant for value entry Power Save - Low Power Mode (corresponds to mapEntry 14 )
         */
        public final static String VALUE_ENTRY_Power_Save___Low_Power_Mode = "Power Save - Low Power Mode";

        /**
         * constant for value map entry 15
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Power_Save___Standby = new javax.cim.UnsignedInteger16(
                "15");

        /**
         * constant for value entry Power Save - Standby (corresponds to mapEntry 15 )
         */
        public final static String VALUE_ENTRY_Power_Save___Standby = "Power Save - Standby";

        /**
         * constant for value map entry 16
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_Power_Cycle = new javax.cim.UnsignedInteger16(
                "16");

        /**
         * constant for value entry Power Cycle (corresponds to mapEntry 16 )
         */
        public final static String VALUE_ENTRY_Power_Cycle = "Power Cycle";

        /**
         * constant for value map entry 17
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_Power_Save___Warning = new javax.cim.UnsignedInteger16(
                "17");

        /**
         * constant for value entry Power Save - Warning (corresponds to mapEntry 17 )
         */
        public final static String VALUE_ENTRY_Power_Save___Warning = "Power Save - Warning";

        /**
         * constant for value map entry 18
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_Paused = new javax.cim.UnsignedInteger16(
                "18");

        /**
         * constant for value entry Paused (corresponds to mapEntry 18 )
         */
        public final static String VALUE_ENTRY_Paused = "Paused";

        /**
         * constant for value map entry 19
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_Not_Ready = new javax.cim.UnsignedInteger16(
                "19");

        /**
         * constant for value entry Not Ready (corresponds to mapEntry 19 )
         */
        public final static String VALUE_ENTRY_Not_Ready = "Not Ready";

        /**
         * constant for value map entry 20
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_Not_Configured = new javax.cim.UnsignedInteger16(
                "20");

        /**
         * constant for value entry Not Configured (corresponds to mapEntry 20 )
         */
        public final static String VALUE_ENTRY_Not_Configured = "Not Configured";

        /**
         * constant for value map entry 21
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_Quiesced = new javax.cim.UnsignedInteger16(
                "21");

        /**
         * constant for value entry Quiesced (corresponds to mapEntry 21 )
         */
        public final static String VALUE_ENTRY_Quiesced = "Quiesced";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@3bdc3bdc
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Running_Full_Power.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Running_Full_Power;
            }

            if (VALUE_ENTRY_Warning.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Warning;
            }

            if (VALUE_ENTRY_In_Test.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_In_Test;
            }

            if (VALUE_ENTRY_Not_Applicable.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Not_Applicable;
            }

            if (VALUE_ENTRY_Power_Off.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Power_Off;
            }

            if (VALUE_ENTRY_Off_Line.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Off_Line;
            }

            if (VALUE_ENTRY_Off_Duty.equals(value)) {
                return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Off_Duty;
            }

            if (VALUE_ENTRY_Degraded.equals(value)) {
                return VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Degraded;
            }

            if (VALUE_ENTRY_Not_Installed.equals(value)) {
                return VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Not_Installed;
            }

            if (VALUE_ENTRY_Install_Error.equals(value)) {
                return VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Install_Error;
            }

            if (VALUE_ENTRY_Power_Save___Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Power_Save___Unknown;
            }

            if (VALUE_ENTRY_Power_Save___Low_Power_Mode.equals(value)) {
                return VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_Power_Save___Low_Power_Mode;
            }

            if (VALUE_ENTRY_Power_Save___Standby.equals(value)) {
                return VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Power_Save___Standby;
            }

            if (VALUE_ENTRY_Power_Cycle.equals(value)) {
                return VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_Power_Cycle;
            }

            if (VALUE_ENTRY_Power_Save___Warning.equals(value)) {
                return VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_Power_Save___Warning;
            }

            if (VALUE_ENTRY_Paused.equals(value)) {
                return VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_Paused;
            }

            if (VALUE_ENTRY_Not_Ready.equals(value)) {
                return VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_Not_Ready;
            }

            if (VALUE_ENTRY_Not_Configured.equals(value)) {
                return VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_Not_Configured;
            }

            if (VALUE_ENTRY_Quiesced.equals(value)) {
                return VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_Quiesced;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown.intValue()) {
                return VALUE_ENTRY_Unknown;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Running_Full_Power.intValue()) {
                return VALUE_ENTRY_Running_Full_Power;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Warning.intValue()) {
                return VALUE_ENTRY_Warning;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_In_Test.intValue()) {
                return VALUE_ENTRY_In_Test;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Not_Applicable.intValue()) {
                return VALUE_ENTRY_Not_Applicable;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Power_Off.intValue()) {
                return VALUE_ENTRY_Power_Off;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Off_Line.intValue()) {
                return VALUE_ENTRY_Off_Line;
            }

            if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Off_Duty.intValue()) {
                return VALUE_ENTRY_Off_Duty;
            }

            if (iValue == VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Degraded.intValue()) {
                return VALUE_ENTRY_Degraded;
            }

            if (iValue == VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Not_Installed.intValue()) {
                return VALUE_ENTRY_Not_Installed;
            }

            if (iValue == VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Install_Error.intValue()) {
                return VALUE_ENTRY_Install_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Power_Save___Unknown.intValue()) {
                return VALUE_ENTRY_Power_Save___Unknown;
            }

            if (iValue == VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_Power_Save___Low_Power_Mode.intValue()) {
                return VALUE_ENTRY_Power_Save___Low_Power_Mode;
            }

            if (iValue == VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Power_Save___Standby.intValue()) {
                return VALUE_ENTRY_Power_Save___Standby;
            }

            if (iValue == VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_Power_Cycle.intValue()) {
                return VALUE_ENTRY_Power_Cycle;
            }

            if (iValue == VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_Power_Save___Warning.intValue()) {
                return VALUE_ENTRY_Power_Save___Warning;
            }

            if (iValue == VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_Paused.intValue()) {
                return VALUE_ENTRY_Paused;
            }

            if (iValue == VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_Not_Ready.intValue()) {
                return VALUE_ENTRY_Not_Ready;
            }

            if (iValue == VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_Not_Configured.intValue()) {
                return VALUE_ENTRY_Not_Configured;
            }

            if (iValue == VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_Quiesced.intValue()) {
                return VALUE_ENTRY_Quiesced;
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
         * Value Map for the property Availability   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other, VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Running_Full_Power,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Warning,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_In_Test,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Not_Applicable,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Power_Off,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Off_Line,
                VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Off_Duty,
                VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Degraded,
                VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Not_Installed,
                VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Install_Error,
                VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Power_Save___Unknown,
                VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_Power_Save___Low_Power_Mode,
                VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Power_Save___Standby,
                VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_Power_Cycle,
                VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_Power_Save___Warning,
                VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_Paused,
                VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_Not_Ready,
                VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_Not_Configured,
                VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_Quiesced };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property Availability   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Other, VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Running_Full_Power, VALUE_ENTRY_Warning, VALUE_ENTRY_In_Test,
                VALUE_ENTRY_Not_Applicable, VALUE_ENTRY_Power_Off, VALUE_ENTRY_Off_Line,
                VALUE_ENTRY_Off_Duty, VALUE_ENTRY_Degraded, VALUE_ENTRY_Not_Installed,
                VALUE_ENTRY_Install_Error, VALUE_ENTRY_Power_Save___Unknown,
                VALUE_ENTRY_Power_Save___Low_Power_Mode, VALUE_ENTRY_Power_Save___Standby,
                VALUE_ENTRY_Power_Cycle, VALUE_ENTRY_Power_Save___Warning, VALUE_ENTRY_Paused,
                VALUE_ENTRY_Not_Ready, VALUE_ENTRY_Not_Configured, VALUE_ENTRY_Quiesced };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property Availability   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Other,
                VALUE_ENTRY_Unknown, VALUE_ENTRY_Running_Full_Power, VALUE_ENTRY_Warning,
                VALUE_ENTRY_In_Test, VALUE_ENTRY_Not_Applicable, VALUE_ENTRY_Power_Off,
                VALUE_ENTRY_Off_Line, VALUE_ENTRY_Off_Duty, VALUE_ENTRY_Degraded,
                VALUE_ENTRY_Not_Installed, VALUE_ENTRY_Install_Error,
                VALUE_ENTRY_Power_Save___Unknown, VALUE_ENTRY_Power_Save___Low_Power_Mode,
                VALUE_ENTRY_Power_Save___Standby, VALUE_ENTRY_Power_Cycle,
                VALUE_ENTRY_Power_Save___Warning, VALUE_ENTRY_Paused, VALUE_ENTRY_Not_Ready,
                VALUE_ENTRY_Not_Configured, VALUE_ENTRY_Quiesced };

    }

    /**
     * Constants of property CreationClassName
     * CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
     */
    public static class PROPERTY_CREATIONCLASSNAME {
        /**
         * name of the property CreationClassName
         */
        public final static String NAME = "CreationClassName";

    }

    /**
     * Constants of property DeviceID
     * An address or other identifying information to uniquely name the LogicalDevice.
     */
    public static class PROPERTY_DEVICEID {
        /**
         * name of the property DeviceID
         */
        public final static String NAME = "DeviceID";

    }

    /**
     * Constants of property ErrorCleared
     * ErrorCleared is a boolean property indicating that the error reported in LastErrorCode is now cleared.
     */
    public static class PROPERTY_ERRORCLEARED {
        /**
         * name of the property ErrorCleared
         */
        public final static String NAME = "ErrorCleared";

    }

    /**
     * Constants of property ErrorDescription
     * ErrorDescription is a free-form string supplying more information about the error recorded in LastErrorCode, and information on any corrective actions that may be taken.
     */
    public static class PROPERTY_ERRORDESCRIPTION {
        /**
         * name of the property ErrorDescription
         */
        public final static String NAME = "ErrorDescription";

    }

    /**
     * Constants of property IdentifyingDescriptions
     * An array of free-form strings providing explanations and details behind the entries in the OtherIdentifyingInfo array. Note, each entry of this array is related to the entry in OtherIdentifyingInfo that is located at the same index.
     */
    public static class PROPERTY_IDENTIFYINGDESCRIPTIONS {
        /**
         * name of the property IdentifyingDescriptions
         */
        public final static String NAME = "IdentifyingDescriptions";

    }

    /**
     * Constants of property LastErrorCode
     * LastErrorCode captures the last error code reported by the LogicalDevice.
     */
    public static class PROPERTY_LASTERRORCODE {
        /**
         * name of the property LastErrorCode
         */
        public final static String NAME = "LastErrorCode";

    }

    /**
     * Constants of property MaxQuiesceTime
     * The MaxQuiesceTime property has been deprecated. When evaluating the use of Quiesce, it was determine that this single property is not adequate for describing when a device will automatically exit a quiescent state. In fact, the most likely scenario for a device to exit a quiescent state was determined to be based on the number of outstanding requests queued rather than on a maximum time. This will be re-evaluated and repositioned later. 
     * Maximum time in milliseconds, that a Device can run in a "Quiesced" state. A Device's state is defined in its Availability and AdditionalAvailability properties, where "Quiesced" is conveyed by the value 21. What occurs at the end of the time limit is device-specific. The Device may unquiesce, may offline or take other action. A value of 0 indicates that a Device can remain quiesced indefinitely.
     */
    public static class PROPERTY_MAXQUIESCETIME {
        /**
         * name of the property MaxQuiesceTime
         */
        public final static String NAME = "MaxQuiesceTime";

    }

    /**
     * Constants of property OtherIdentifyingInfo
     * OtherIdentifyingInfo captures additional data, beyond DeviceID information, that could be used to identify a LogicalDevice. One example would be to hold the Operating System's user friendly name for the Device in this property.
     */
    public static class PROPERTY_OTHERIDENTIFYINGINFO {
        /**
         * name of the property OtherIdentifyingInfo
         */
        public final static String NAME = "OtherIdentifyingInfo";

    }

    /**
     * Constants of property PowerManagementCapabilities
     * An enumerated array describing the power management capabilities of the Device. The use of this property has been deprecated. Instead, the PowerCapabilites property in an associated PowerManagementCapabilities class should be used.
     */
    public static class PROPERTY_POWERMANAGEMENTCAPABILITIES {
        /**
         * name of the property PowerManagementCapabilities
         */
        public final static String NAME = "PowerManagementCapabilities";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Supported = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry Not Supported (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_Not_Supported = "Not Supported";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Disabled = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Disabled (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Disabled = "Disabled";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Enabled = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Enabled (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Enabled = "Enabled";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Power_Saving_Modes_Entered_Automatically = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Power Saving Modes Entered Automatically (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Power_Saving_Modes_Entered_Automatically = "Power Saving Modes Entered Automatically";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Power_State_Settable = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry Power State Settable (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Power_State_Settable = "Power State Settable";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Power_Cycling_Supported = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry Power Cycling Supported (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Power_Cycling_Supported = "Power Cycling Supported";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Timed_Power_On_Supported = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry Timed Power On Supported (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_Timed_Power_On_Supported = "Timed Power On Supported";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@77347734
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Not_Supported.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Supported;
            }

            if (VALUE_ENTRY_Disabled.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Disabled;
            }

            if (VALUE_ENTRY_Enabled.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Enabled;
            }

            if (VALUE_ENTRY_Power_Saving_Modes_Entered_Automatically.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Power_Saving_Modes_Entered_Automatically;
            }

            if (VALUE_ENTRY_Power_State_Settable.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Power_State_Settable;
            }

            if (VALUE_ENTRY_Power_Cycling_Supported.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Power_Cycling_Supported;
            }

            if (VALUE_ENTRY_Timed_Power_On_Supported.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Timed_Power_On_Supported;
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

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Supported.intValue()) {
                return VALUE_ENTRY_Not_Supported;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Disabled.intValue()) {
                return VALUE_ENTRY_Disabled;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Enabled.intValue()) {
                return VALUE_ENTRY_Enabled;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Power_Saving_Modes_Entered_Automatically
                    .intValue()) {
                return VALUE_ENTRY_Power_Saving_Modes_Entered_Automatically;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Power_State_Settable.intValue()) {
                return VALUE_ENTRY_Power_State_Settable;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Power_Cycling_Supported.intValue()) {
                return VALUE_ENTRY_Power_Cycling_Supported;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Timed_Power_On_Supported.intValue()) {
                return VALUE_ENTRY_Timed_Power_On_Supported;
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
         * Value Map for the property PowerManagementCapabilities   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Supported,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Disabled,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Enabled,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Power_Saving_Modes_Entered_Automatically,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Power_State_Settable,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Power_Cycling_Supported,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Timed_Power_On_Supported };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property PowerManagementCapabilities   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Not_Supported, VALUE_ENTRY_Disabled, VALUE_ENTRY_Enabled,
                VALUE_ENTRY_Power_Saving_Modes_Entered_Automatically,
                VALUE_ENTRY_Power_State_Settable, VALUE_ENTRY_Power_Cycling_Supported,
                VALUE_ENTRY_Timed_Power_On_Supported };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property PowerManagementCapabilities   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Not_Supported, VALUE_ENTRY_Disabled, VALUE_ENTRY_Enabled,
                VALUE_ENTRY_Power_Saving_Modes_Entered_Automatically,
                VALUE_ENTRY_Power_State_Settable, VALUE_ENTRY_Power_Cycling_Supported,
                VALUE_ENTRY_Timed_Power_On_Supported };

    }

    /**
     * Constants of property PowerManagementSupported
     * Boolean indicating that the Device can be power managed. The use of this property has been deprecated. Instead, the existence of an associated PowerManagementCapabilities class (associated using the ElementCapabilities relationhip) indicates that power management is supported.
     */
    public static class PROPERTY_POWERMANAGEMENTSUPPORTED {
        /**
         * name of the property PowerManagementSupported
         */
        public final static String NAME = "PowerManagementSupported";

    }

    /**
     * Constants of property PowerOnHours
     * The number of consecutive hours that this Device has been powered, since its last power cycle.
     */
    public static class PROPERTY_POWERONHOURS {
        /**
         * name of the property PowerOnHours
         */
        public final static String NAME = "PowerOnHours";

    }

    /**
     * Constants of property StatusInfo
     * The StatusInfo property indicates whether the Logical Device is in an enabled (value = 3), disabled (value = 4) or some other (1) or unknown (2) state. If this property does not apply to the LogicalDevice, the value, 5 ("Not Applicable"), should be used. StatusInfo has been deprecated in lieu of a more clearly named property with additional enumerated values (EnabledState), that is inherited from ManagedSystemElement. 
     * If a Device is ("Enabled")(value=3), it has been powered up, and is configured and operational. The Device may or may not be functionally active, depending on whether its Availability (or AdditionalAvailability) indicate that it is ("Running/Full Power")(value=3) or ("Off line") (value=8). In an enabled but offline mode, a Device may be performing out-of-band requests, such as running Diagnostics. If ("Disabled") StatusInfo value=4), a Device can only be "enabled" or powered off. In a personal computer environment, ("Disabled") means that the Device's driver is not available in the stack. In other environments, a Device can be disabled by removing its configuration file. A disabled device is physically present in a System and consuming resources, but can not be communicated with until a load of a driver, a load of a configuration file or some other "enabling" activity has occurred.
     */
    public static class PROPERTY_STATUSINFO {
        /**
         * name of the property StatusInfo
         */
        public final static String NAME = "StatusInfo";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Unknown (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Unknown = "Unknown";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Enabled = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Enabled (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Enabled = "Enabled";

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
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Not_Applicable = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry Not Applicable (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Not_Applicable = "Not Applicable";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@6e406e4
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Enabled.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Enabled;
            }

            if (VALUE_ENTRY_Disabled.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Disabled;
            }

            if (VALUE_ENTRY_Not_Applicable.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Not_Applicable;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown.intValue()) {
                return VALUE_ENTRY_Unknown;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Enabled.intValue()) {
                return VALUE_ENTRY_Enabled;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Disabled.intValue()) {
                return VALUE_ENTRY_Disabled;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Not_Applicable.intValue()) {
                return VALUE_ENTRY_Not_Applicable;
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
         * Value Map for the property StatusInfo   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other, VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Enabled,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Disabled,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Not_Applicable };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property StatusInfo   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Other, VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Enabled, VALUE_ENTRY_Disabled, VALUE_ENTRY_Not_Applicable };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property StatusInfo   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Other,
                VALUE_ENTRY_Unknown, VALUE_ENTRY_Enabled, VALUE_ENTRY_Disabled,
                VALUE_ENTRY_Not_Applicable };

    }

    /**
     * Constants of property SystemCreationClassName
     * The scoping System's CreationClassName.
     */
    public static class PROPERTY_SYSTEMCREATIONCLASSNAME {
        /**
         * name of the property SystemCreationClassName
         */
        public final static String NAME = "SystemCreationClassName";

    }

    /**
     * Constants of property SystemName
     * The scoping System's Name.
     */
    public static class PROPERTY_SYSTEMNAME {
        /**
         * name of the property SystemName
         */
        public final static String NAME = "SystemName";

    }

    /**
     * Constants of property TotalPowerOnHours
     * The total number of hours that this Device has been powered.
     */
    public static class PROPERTY_TOTALPOWERONHOURS {
        /**
         * name of the property TotalPowerOnHours
         */
        public final static String NAME = "TotalPowerOnHours";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim_2_14");
        String[] parentClassPackageList = CIM_EnabledLogicalElement.getPackages();

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
     *   protected because this class should not be created directly because it represents an abstract CIM Class     *   <br>
     *   An abstraction or emulation of a hardware entity, that may or may not be Realized in physical hardware. Any characteristics of a LogicalDevice that are used to manage its operation or configuration are contained in, or associated with, the LogicalDevice object. Examples of the operational properties of a Printer would be paper sizes supported, or detected errors. Examples of the configuration properties of a Sensor Device would be threshold settings. Various configurations could exist for a LogicalDevice. These configurations could be contained in Setting objects and associated with the LogicalDevice.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    protected CIM_LogicalDevice(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *   protected because this class should not be created directly because it represents an abstract CIM Class     *   <br>
     *   An abstraction or emulation of a hardware entity, that may or may not be Realized in physical hardware. Any characteristics of a LogicalDevice that are used to manage its operation or configuration are contained in, or associated with, the LogicalDevice object. Examples of the operational properties of a Printer would be paper sizes supported, or detected errors. Examples of the configuration properties of a Sensor Device would be threshold settings. Various configurations could exist for a LogicalDevice. These configurations could be contained in Setting objects and associated with the LogicalDevice.
     *   @param cimInstance the instance that is used to create the Object
     */

    protected CIM_LogicalDevice(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_LogicalDevice() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("AdditionalAvailability", new CIMProperty("AdditionalAvailability",
                CIMDataType.UINT16_ARRAY_T, null));
        propertiesToCheck.put("Availability", new CIMProperty("Availability", CIMDataType.UINT16_T,
                null));
        propertiesToCheck.put("CreationClassName", new CIMProperty("CreationClassName",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("DeviceID", new CIMProperty("DeviceID", CIMDataType.STRING_T, null));
        propertiesToCheck.put("ErrorCleared", new CIMProperty("ErrorCleared",
                CIMDataType.BOOLEAN_T, null));
        propertiesToCheck.put("ErrorDescription", new CIMProperty("ErrorDescription",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("IdentifyingDescriptions", new CIMProperty("IdentifyingDescriptions",
                CIMDataType.STRING_ARRAY_T, null));
        propertiesToCheck.put("LastErrorCode", new CIMProperty("LastErrorCode",
                CIMDataType.UINT32_T, null));
        propertiesToCheck.put("MaxQuiesceTime", new CIMProperty("MaxQuiesceTime",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("OtherIdentifyingInfo", new CIMProperty("OtherIdentifyingInfo",
                CIMDataType.STRING_ARRAY_T, null));
        propertiesToCheck.put("PowerManagementCapabilities", new CIMProperty(
                "PowerManagementCapabilities", CIMDataType.UINT16_ARRAY_T, null));
        propertiesToCheck.put("PowerManagementSupported", new CIMProperty(
                "PowerManagementSupported", CIMDataType.BOOLEAN_T, null));
        propertiesToCheck.put("PowerOnHours", new CIMProperty("PowerOnHours", CIMDataType.UINT64_T,
                null));
        propertiesToCheck.put("StatusInfo", new CIMProperty("StatusInfo", CIMDataType.UINT16_T,
                null));
        propertiesToCheck.put("SystemCreationClassName", new CIMProperty("SystemCreationClassName",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("SystemName", new CIMProperty("SystemName", CIMDataType.STRING_T,
                null));
        propertiesToCheck.put("TotalPowerOnHours", new CIMProperty("TotalPowerOnHours",
                CIMDataType.UINT64_T, null));

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
     * Get the property AdditionalAvailability
     *     * <br>
     * Additional availability and status of the Device, beyond that specified in the Availability property. The Availability property denotes the primary status and availability of the Device. In some cases, this will not be sufficient to denote the complete status of the Device. In those cases, the AdditionalAvailability property can be used to provide further information. For example, a Device's primary Availability may be "Off line" (value=8), but it may also be in a low power state (AdditonalAvailability value=14), or the Device could be running Diagnostics (AdditionalAvailability value=5, "In Test").
     *     */

    public javax.cim.UnsignedInteger16[] get_AdditionalAvailability() {
        CIMProperty currentProperty = getProperty(PROPERTY_ADDITIONALAVAILABILITY.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ADDITIONALAVAILABILITY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16[]) currentProperty.getValue();

    }

    /**
     * Set the property AdditionalAvailability
     * <br>
     * Additional availability and status of the Device, beyond that specified in the Availability property. The Availability property denotes the primary status and availability of the Device. In some cases, this will not be sufficient to denote the complete status of the Device. In those cases, the AdditionalAvailability property can be used to provide further information. For example, a Device's primary Availability may be "Off line" (value=8), but it may also be in a low power state (AdditonalAvailability value=14), or the Device could be running Diagnostics (AdditionalAvailability value=5, "In Test").
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_AdditionalAvailability(javax.cim.UnsignedInteger16[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ADDITIONALAVAILABILITY.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_AdditionalAvailability(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ADDITIONALAVAILABILITY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property AdditionalAvailability by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_AdditionalAvailability(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16[] newValue) throws WbemsmtException {
        CIM_LogicalDevice fco = new CIM_LogicalDevice(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ADDITIONALAVAILABILITY.NAME);
        if (property != null) {
            property = setPropertyValue_AdditionalAvailability(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ADDITIONALAVAILABILITY.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property AdditionalAvailability
     * <br>
     * Additional availability and status of the Device, beyond that specified in the Availability property. The Availability property denotes the primary status and availability of the Device. In some cases, this will not be sufficient to denote the complete status of the Device. In those cases, the AdditionalAvailability property can be used to provide further information. For example, a Device's primary Availability may be "Off line" (value=8), but it may also be in a low power state (AdditonalAvailability value=14), or the Device could be running Diagnostics (AdditionalAvailability value=5, "In Test").
     */

    private static CIMProperty setPropertyValue_AdditionalAvailability(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Availability
     *     * <br>
     * The primary availability and status of the Device. (Additional status information can be specified using the Additional Availability array property.) For example, the Availability property indicates that the Device is running and has full power (value=3), or is in a warning (4), test (5), degraded (10) or power save state (values 13-15 and 17). Regarding the Power Save states, these are defined as follows: Value 13 ("Power Save - Unknown") indicates that the Device is known to be in a power save mode, but its exact status in this mode is unknown; 14 ("Power Save - Low Power Mode") indicates that the Device is in a power save state but still functioning, and may exhibit degraded performance; 15 ("Power Save - Standby") describes that the Device is not functioning but could be brought to full power 'quickly'; and value 17 ("Power Save - Warning") indicates that the Device is in a warning state, though also in a power save mode.
     *     */

    public javax.cim.UnsignedInteger16 get_Availability() {
        CIMProperty currentProperty = getProperty(PROPERTY_AVAILABILITY.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_AVAILABILITY.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property Availability
     * <br>
     * The primary availability and status of the Device. (Additional status information can be specified using the Additional Availability array property.) For example, the Availability property indicates that the Device is running and has full power (value=3), or is in a warning (4), test (5), degraded (10) or power save state (values 13-15 and 17). Regarding the Power Save states, these are defined as follows: Value 13 ("Power Save - Unknown") indicates that the Device is known to be in a power save mode, but its exact status in this mode is unknown; 14 ("Power Save - Low Power Mode") indicates that the Device is in a power save state but still functioning, and may exhibit degraded performance; 15 ("Power Save - Standby") describes that the Device is not functioning but could be brought to full power 'quickly'; and value 17 ("Power Save - Warning") indicates that the Device is in a warning state, though also in a power save mode.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Availability(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_AVAILABILITY.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_Availability(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_AVAILABILITY.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Availability by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Availability(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_LogicalDevice fco = new CIM_LogicalDevice(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_AVAILABILITY.NAME);
        if (property != null) {
            property = setPropertyValue_Availability(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_AVAILABILITY.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Availability
     * <br>
     * The primary availability and status of the Device. (Additional status information can be specified using the Additional Availability array property.) For example, the Availability property indicates that the Device is running and has full power (value=3), or is in a warning (4), test (5), degraded (10) or power save state (values 13-15 and 17). Regarding the Power Save states, these are defined as follows: Value 13 ("Power Save - Unknown") indicates that the Device is known to be in a power save mode, but its exact status in this mode is unknown; 14 ("Power Save - Low Power Mode") indicates that the Device is in a power save state but still functioning, and may exhibit degraded performance; 15 ("Power Save - Standby") describes that the Device is not functioning but could be brought to full power 'quickly'; and value 17 ("Power Save - Warning") indicates that the Device is in a warning state, though also in a power save mode.
     */

    private static CIMProperty setPropertyValue_Availability(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property CreationClassName
     *     * <br>
     * CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
     *     */

    public String get_key_CreationClassName() {
        CIMProperty currentProperty = getProperty(PROPERTY_CREATIONCLASSNAME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CREATIONCLASSNAME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property CreationClassName
     * <br>
     * CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_key_CreationClassName(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CREATIONCLASSNAME.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_key_CreationClassName(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CREATIONCLASSNAME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property CreationClassName by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_key_CreationClassName(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_LogicalDevice fco = new CIM_LogicalDevice(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CREATIONCLASSNAME.NAME);
        if (property != null) {
            property = setPropertyValue_key_CreationClassName(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CREATIONCLASSNAME.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property CreationClassName
     * <br>
     * CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
     */

    private static CIMProperty setPropertyValue_key_CreationClassName(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property DeviceID
     *     * <br>
     * An address or other identifying information to uniquely name the LogicalDevice.
     *     */

    public String get_key_DeviceID() {
        CIMProperty currentProperty = getProperty(PROPERTY_DEVICEID.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_DEVICEID.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property DeviceID
     * <br>
     * An address or other identifying information to uniquely name the LogicalDevice.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_key_DeviceID(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_DEVICEID.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_key_DeviceID(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_DEVICEID.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property DeviceID by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_key_DeviceID(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_LogicalDevice fco = new CIM_LogicalDevice(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_DEVICEID.NAME);
        if (property != null) {
            property = setPropertyValue_key_DeviceID(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_DEVICEID.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property DeviceID
     * <br>
     * An address or other identifying information to uniquely name the LogicalDevice.
     */

    private static CIMProperty setPropertyValue_key_DeviceID(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ErrorCleared
     *     * <br>
     * ErrorCleared is a boolean property indicating that the error reported in LastErrorCode is now cleared.
     *     */

    public Boolean get_ErrorCleared() {
        CIMProperty currentProperty = getProperty(PROPERTY_ERRORCLEARED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ERRORCLEARED.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property ErrorCleared
     * <br>
     * ErrorCleared is a boolean property indicating that the error reported in LastErrorCode is now cleared.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ErrorCleared(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ERRORCLEARED.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_ErrorCleared(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ERRORCLEARED.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ErrorCleared by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ErrorCleared(WBEMClient client, String namespace,
            Boolean newValue) throws WbemsmtException {
        CIM_LogicalDevice fco = new CIM_LogicalDevice(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ERRORCLEARED.NAME);
        if (property != null) {
            property = setPropertyValue_ErrorCleared(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ERRORCLEARED.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ErrorCleared
     * <br>
     * ErrorCleared is a boolean property indicating that the error reported in LastErrorCode is now cleared.
     */

    private static CIMProperty setPropertyValue_ErrorCleared(CIMProperty currentProperty,
            Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ErrorDescription
     *     * <br>
     * ErrorDescription is a free-form string supplying more information about the error recorded in LastErrorCode, and information on any corrective actions that may be taken.
     *     */

    public String get_ErrorDescription() {
        CIMProperty currentProperty = getProperty(PROPERTY_ERRORDESCRIPTION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ERRORDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property ErrorDescription
     * <br>
     * ErrorDescription is a free-form string supplying more information about the error recorded in LastErrorCode, and information on any corrective actions that may be taken.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ErrorDescription(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ERRORDESCRIPTION.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_ErrorDescription(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ERRORDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ErrorDescription by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ErrorDescription(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_LogicalDevice fco = new CIM_LogicalDevice(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ERRORDESCRIPTION.NAME);
        if (property != null) {
            property = setPropertyValue_ErrorDescription(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ERRORDESCRIPTION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ErrorDescription
     * <br>
     * ErrorDescription is a free-form string supplying more information about the error recorded in LastErrorCode, and information on any corrective actions that may be taken.
     */

    private static CIMProperty setPropertyValue_ErrorDescription(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property IdentifyingDescriptions
     *     * <br>
     * An array of free-form strings providing explanations and details behind the entries in the OtherIdentifyingInfo array. Note, each entry of this array is related to the entry in OtherIdentifyingInfo that is located at the same index.
     *     */

    public String[] get_IdentifyingDescriptions() {
        CIMProperty currentProperty = getProperty(PROPERTY_IDENTIFYINGDESCRIPTIONS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_IDENTIFYINGDESCRIPTIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String[]) currentProperty.getValue();

    }

    /**
     * Set the property IdentifyingDescriptions
     * <br>
     * An array of free-form strings providing explanations and details behind the entries in the OtherIdentifyingInfo array. Note, each entry of this array is related to the entry in OtherIdentifyingInfo that is located at the same index.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_IdentifyingDescriptions(String[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_IDENTIFYINGDESCRIPTIONS.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_IdentifyingDescriptions(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_IDENTIFYINGDESCRIPTIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property IdentifyingDescriptions by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_IdentifyingDescriptions(WBEMClient client, String namespace,
            String[] newValue) throws WbemsmtException {
        CIM_LogicalDevice fco = new CIM_LogicalDevice(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_IDENTIFYINGDESCRIPTIONS.NAME);
        if (property != null) {
            property = setPropertyValue_IdentifyingDescriptions(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_IDENTIFYINGDESCRIPTIONS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property IdentifyingDescriptions
     * <br>
     * An array of free-form strings providing explanations and details behind the entries in the OtherIdentifyingInfo array. Note, each entry of this array is related to the entry in OtherIdentifyingInfo that is located at the same index.
     */

    private static CIMProperty setPropertyValue_IdentifyingDescriptions(
            CIMProperty currentProperty, String[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property LastErrorCode
     *     * <br>
     * LastErrorCode captures the last error code reported by the LogicalDevice.
     *     */

    public javax.cim.UnsignedInteger32 get_LastErrorCode() {
        CIMProperty currentProperty = getProperty(PROPERTY_LASTERRORCODE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_LASTERRORCODE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property LastErrorCode
     * <br>
     * LastErrorCode captures the last error code reported by the LogicalDevice.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_LastErrorCode(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_LASTERRORCODE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_LastErrorCode(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_LASTERRORCODE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property LastErrorCode by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_LastErrorCode(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_LogicalDevice fco = new CIM_LogicalDevice(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_LASTERRORCODE.NAME);
        if (property != null) {
            property = setPropertyValue_LastErrorCode(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_LASTERRORCODE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property LastErrorCode
     * <br>
     * LastErrorCode captures the last error code reported by the LogicalDevice.
     */

    private static CIMProperty setPropertyValue_LastErrorCode(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property MaxQuiesceTime
     *     * <br>
     * The MaxQuiesceTime property has been deprecated. When evaluating the use of Quiesce, it was determine that this single property is not adequate for describing when a device will automatically exit a quiescent state. In fact, the most likely scenario for a device to exit a quiescent state was determined to be based on the number of outstanding requests queued rather than on a maximum time. This will be re-evaluated and repositioned later. 
     * Maximum time in milliseconds, that a Device can run in a "Quiesced" state. A Device's state is defined in its Availability and AdditionalAvailability properties, where "Quiesced" is conveyed by the value 21. What occurs at the end of the time limit is device-specific. The Device may unquiesce, may offline or take other action. A value of 0 indicates that a Device can remain quiesced indefinitely.
     *     */

    public javax.cim.UnsignedInteger64 get_MaxQuiesceTime() {
        CIMProperty currentProperty = getProperty(PROPERTY_MAXQUIESCETIME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_MAXQUIESCETIME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property MaxQuiesceTime
     * <br>
     * The MaxQuiesceTime property has been deprecated. When evaluating the use of Quiesce, it was determine that this single property is not adequate for describing when a device will automatically exit a quiescent state. In fact, the most likely scenario for a device to exit a quiescent state was determined to be based on the number of outstanding requests queued rather than on a maximum time. This will be re-evaluated and repositioned later. 
     * Maximum time in milliseconds, that a Device can run in a "Quiesced" state. A Device's state is defined in its Availability and AdditionalAvailability properties, where "Quiesced" is conveyed by the value 21. What occurs at the end of the time limit is device-specific. The Device may unquiesce, may offline or take other action. A value of 0 indicates that a Device can remain quiesced indefinitely.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_MaxQuiesceTime(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_MAXQUIESCETIME.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_MaxQuiesceTime(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_MAXQUIESCETIME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property MaxQuiesceTime by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_MaxQuiesceTime(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_LogicalDevice fco = new CIM_LogicalDevice(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MAXQUIESCETIME.NAME);
        if (property != null) {
            property = setPropertyValue_MaxQuiesceTime(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_MAXQUIESCETIME.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property MaxQuiesceTime
     * <br>
     * The MaxQuiesceTime property has been deprecated. When evaluating the use of Quiesce, it was determine that this single property is not adequate for describing when a device will automatically exit a quiescent state. In fact, the most likely scenario for a device to exit a quiescent state was determined to be based on the number of outstanding requests queued rather than on a maximum time. This will be re-evaluated and repositioned later. 
     * Maximum time in milliseconds, that a Device can run in a "Quiesced" state. A Device's state is defined in its Availability and AdditionalAvailability properties, where "Quiesced" is conveyed by the value 21. What occurs at the end of the time limit is device-specific. The Device may unquiesce, may offline or take other action. A value of 0 indicates that a Device can remain quiesced indefinitely.
     */

    private static CIMProperty setPropertyValue_MaxQuiesceTime(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OtherIdentifyingInfo
     *     * <br>
     * OtherIdentifyingInfo captures additional data, beyond DeviceID information, that could be used to identify a LogicalDevice. One example would be to hold the Operating System's user friendly name for the Device in this property.
     *     */

    public String[] get_OtherIdentifyingInfo() {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERIDENTIFYINGINFO.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OTHERIDENTIFYINGINFO.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String[]) currentProperty.getValue();

    }

    /**
     * Set the property OtherIdentifyingInfo
     * <br>
     * OtherIdentifyingInfo captures additional data, beyond DeviceID information, that could be used to identify a LogicalDevice. One example would be to hold the Operating System's user friendly name for the Device in this property.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OtherIdentifyingInfo(String[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERIDENTIFYINGINFO.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_OtherIdentifyingInfo(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERIDENTIFYINGINFO.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OtherIdentifyingInfo by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherIdentifyingInfo(WBEMClient client, String namespace,
            String[] newValue) throws WbemsmtException {
        CIM_LogicalDevice fco = new CIM_LogicalDevice(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OTHERIDENTIFYINGINFO.NAME);
        if (property != null) {
            property = setPropertyValue_OtherIdentifyingInfo(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERIDENTIFYINGINFO.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OtherIdentifyingInfo
     * <br>
     * OtherIdentifyingInfo captures additional data, beyond DeviceID information, that could be used to identify a LogicalDevice. One example would be to hold the Operating System's user friendly name for the Device in this property.
     */

    private static CIMProperty setPropertyValue_OtherIdentifyingInfo(CIMProperty currentProperty,
            String[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PowerManagementCapabilities
     *     * <br>
     * An enumerated array describing the power management capabilities of the Device. The use of this property has been deprecated. Instead, the PowerCapabilites property in an associated PowerManagementCapabilities class should be used.
     *     */

    public javax.cim.UnsignedInteger16[] get_PowerManagementCapabilities() {
        CIMProperty currentProperty = getProperty(PROPERTY_POWERMANAGEMENTCAPABILITIES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_POWERMANAGEMENTCAPABILITIES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16[]) currentProperty.getValue();

    }

    /**
     * Set the property PowerManagementCapabilities
     * <br>
     * An enumerated array describing the power management capabilities of the Device. The use of this property has been deprecated. Instead, the PowerCapabilites property in an associated PowerManagementCapabilities class should be used.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PowerManagementCapabilities(javax.cim.UnsignedInteger16[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_POWERMANAGEMENTCAPABILITIES.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_PowerManagementCapabilities(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_POWERMANAGEMENTCAPABILITIES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PowerManagementCapabilities by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PowerManagementCapabilities(WBEMClient client,
            String namespace, javax.cim.UnsignedInteger16[] newValue) throws WbemsmtException {
        CIM_LogicalDevice fco = new CIM_LogicalDevice(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_POWERMANAGEMENTCAPABILITIES.NAME);
        if (property != null) {
            property = setPropertyValue_PowerManagementCapabilities(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_POWERMANAGEMENTCAPABILITIES.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PowerManagementCapabilities
     * <br>
     * An enumerated array describing the power management capabilities of the Device. The use of this property has been deprecated. Instead, the PowerCapabilites property in an associated PowerManagementCapabilities class should be used.
     */

    private static CIMProperty setPropertyValue_PowerManagementCapabilities(
            CIMProperty currentProperty, javax.cim.UnsignedInteger16[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PowerManagementSupported
     *     * <br>
     * Boolean indicating that the Device can be power managed. The use of this property has been deprecated. Instead, the existence of an associated PowerManagementCapabilities class (associated using the ElementCapabilities relationhip) indicates that power management is supported.
     *     */

    public Boolean get_PowerManagementSupported() {
        CIMProperty currentProperty = getProperty(PROPERTY_POWERMANAGEMENTSUPPORTED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_POWERMANAGEMENTSUPPORTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property PowerManagementSupported
     * <br>
     * Boolean indicating that the Device can be power managed. The use of this property has been deprecated. Instead, the existence of an associated PowerManagementCapabilities class (associated using the ElementCapabilities relationhip) indicates that power management is supported.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PowerManagementSupported(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_POWERMANAGEMENTSUPPORTED.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_PowerManagementSupported(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_POWERMANAGEMENTSUPPORTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PowerManagementSupported by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PowerManagementSupported(WBEMClient client, String namespace,
            Boolean newValue) throws WbemsmtException {
        CIM_LogicalDevice fco = new CIM_LogicalDevice(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_POWERMANAGEMENTSUPPORTED.NAME);
        if (property != null) {
            property = setPropertyValue_PowerManagementSupported(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_POWERMANAGEMENTSUPPORTED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PowerManagementSupported
     * <br>
     * Boolean indicating that the Device can be power managed. The use of this property has been deprecated. Instead, the existence of an associated PowerManagementCapabilities class (associated using the ElementCapabilities relationhip) indicates that power management is supported.
     */

    private static CIMProperty setPropertyValue_PowerManagementSupported(
            CIMProperty currentProperty, Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PowerOnHours
     *     * <br>
     * The number of consecutive hours that this Device has been powered, since its last power cycle.
     *     */

    public javax.cim.UnsignedInteger64 get_PowerOnHours() {
        CIMProperty currentProperty = getProperty(PROPERTY_POWERONHOURS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_POWERONHOURS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property PowerOnHours
     * <br>
     * The number of consecutive hours that this Device has been powered, since its last power cycle.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PowerOnHours(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_POWERONHOURS.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_PowerOnHours(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_POWERONHOURS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PowerOnHours by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PowerOnHours(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_LogicalDevice fco = new CIM_LogicalDevice(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_POWERONHOURS.NAME);
        if (property != null) {
            property = setPropertyValue_PowerOnHours(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_POWERONHOURS.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PowerOnHours
     * <br>
     * The number of consecutive hours that this Device has been powered, since its last power cycle.
     */

    private static CIMProperty setPropertyValue_PowerOnHours(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property StatusInfo
     *     * <br>
     * The StatusInfo property indicates whether the Logical Device is in an enabled (value = 3), disabled (value = 4) or some other (1) or unknown (2) state. If this property does not apply to the LogicalDevice, the value, 5 ("Not Applicable"), should be used. StatusInfo has been deprecated in lieu of a more clearly named property with additional enumerated values (EnabledState), that is inherited from ManagedSystemElement. 
     * If a Device is ("Enabled")(value=3), it has been powered up, and is configured and operational. The Device may or may not be functionally active, depending on whether its Availability (or AdditionalAvailability) indicate that it is ("Running/Full Power")(value=3) or ("Off line") (value=8). In an enabled but offline mode, a Device may be performing out-of-band requests, such as running Diagnostics. If ("Disabled") StatusInfo value=4), a Device can only be "enabled" or powered off. In a personal computer environment, ("Disabled") means that the Device's driver is not available in the stack. In other environments, a Device can be disabled by removing its configuration file. A disabled device is physically present in a System and consuming resources, but can not be communicated with until a load of a driver, a load of a configuration file or some other "enabling" activity has occurred.
     *     */

    public javax.cim.UnsignedInteger16 get_StatusInfo() {
        CIMProperty currentProperty = getProperty(PROPERTY_STATUSINFO.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_STATUSINFO.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property StatusInfo
     * <br>
     * The StatusInfo property indicates whether the Logical Device is in an enabled (value = 3), disabled (value = 4) or some other (1) or unknown (2) state. If this property does not apply to the LogicalDevice, the value, 5 ("Not Applicable"), should be used. StatusInfo has been deprecated in lieu of a more clearly named property with additional enumerated values (EnabledState), that is inherited from ManagedSystemElement. 
     * If a Device is ("Enabled")(value=3), it has been powered up, and is configured and operational. The Device may or may not be functionally active, depending on whether its Availability (or AdditionalAvailability) indicate that it is ("Running/Full Power")(value=3) or ("Off line") (value=8). In an enabled but offline mode, a Device may be performing out-of-band requests, such as running Diagnostics. If ("Disabled") StatusInfo value=4), a Device can only be "enabled" or powered off. In a personal computer environment, ("Disabled") means that the Device's driver is not available in the stack. In other environments, a Device can be disabled by removing its configuration file. A disabled device is physically present in a System and consuming resources, but can not be communicated with until a load of a driver, a load of a configuration file or some other "enabling" activity has occurred.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_StatusInfo(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_STATUSINFO.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_StatusInfo(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_STATUSINFO.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property StatusInfo by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_StatusInfo(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_LogicalDevice fco = new CIM_LogicalDevice(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_STATUSINFO.NAME);
        if (property != null) {
            property = setPropertyValue_StatusInfo(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_STATUSINFO.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property StatusInfo
     * <br>
     * The StatusInfo property indicates whether the Logical Device is in an enabled (value = 3), disabled (value = 4) or some other (1) or unknown (2) state. If this property does not apply to the LogicalDevice, the value, 5 ("Not Applicable"), should be used. StatusInfo has been deprecated in lieu of a more clearly named property with additional enumerated values (EnabledState), that is inherited from ManagedSystemElement. 
     * If a Device is ("Enabled")(value=3), it has been powered up, and is configured and operational. The Device may or may not be functionally active, depending on whether its Availability (or AdditionalAvailability) indicate that it is ("Running/Full Power")(value=3) or ("Off line") (value=8). In an enabled but offline mode, a Device may be performing out-of-band requests, such as running Diagnostics. If ("Disabled") StatusInfo value=4), a Device can only be "enabled" or powered off. In a personal computer environment, ("Disabled") means that the Device's driver is not available in the stack. In other environments, a Device can be disabled by removing its configuration file. A disabled device is physically present in a System and consuming resources, but can not be communicated with until a load of a driver, a load of a configuration file or some other "enabling" activity has occurred.
     */

    private static CIMProperty setPropertyValue_StatusInfo(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
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
     * The scoping System's CreationClassName.
     *     */

    public String get_key_SystemCreationClassName() {
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
     * The scoping System's CreationClassName.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_key_SystemCreationClassName(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SYSTEMCREATIONCLASSNAME.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_key_SystemCreationClassName(currentProperty, newValue));
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

    public static CIMProperty create_key_SystemCreationClassName(WBEMClient client,
            String namespace, String newValue) throws WbemsmtException {
        CIM_LogicalDevice fco = new CIM_LogicalDevice(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SYSTEMCREATIONCLASSNAME.NAME);
        if (property != null) {
            property = setPropertyValue_key_SystemCreationClassName(property, newValue);
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
     * The scoping System's CreationClassName.
     */

    private static CIMProperty setPropertyValue_key_SystemCreationClassName(
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
     * The scoping System's Name.
     *     */

    public String get_key_SystemName() {
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
     * The scoping System's Name.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_key_SystemName(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SYSTEMNAME.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_key_SystemName(currentProperty, newValue));
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

    public static CIMProperty create_key_SystemName(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_LogicalDevice fco = new CIM_LogicalDevice(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SYSTEMNAME.NAME);
        if (property != null) {
            property = setPropertyValue_key_SystemName(property, newValue);
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
     * The scoping System's Name.
     */

    private static CIMProperty setPropertyValue_key_SystemName(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property TotalPowerOnHours
     *     * <br>
     * The total number of hours that this Device has been powered.
     *     */

    public javax.cim.UnsignedInteger64 get_TotalPowerOnHours() {
        CIMProperty currentProperty = getProperty(PROPERTY_TOTALPOWERONHOURS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_TOTALPOWERONHOURS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property TotalPowerOnHours
     * <br>
     * The total number of hours that this Device has been powered.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_TotalPowerOnHours(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_TOTALPOWERONHOURS.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_TotalPowerOnHours(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_TOTALPOWERONHOURS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property TotalPowerOnHours by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_TotalPowerOnHours(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_LogicalDevice fco = new CIM_LogicalDevice(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_TOTALPOWERONHOURS.NAME);
        if (property != null) {
            property = setPropertyValue_TotalPowerOnHours(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_TOTALPOWERONHOURS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property TotalPowerOnHours
     * <br>
     * The total number of hours that this Device has been powered.
     */

    private static CIMProperty setPropertyValue_TotalPowerOnHours(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
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

    /**
     * Invokes the Method EnableDevice
     * <br>
     * @param client the cimclient
     * The EnableDevice method has been deprecated in lieu of the more general RequestStateChange method that directly overlaps with the functionality provided by this method. 
     * Requests that the LogicalDevice be enabled ("Enabled" input parameter = TRUE) or disabled (= FALSE). If successful, the Device's StatusInfo/EnabledState properties should reflect the desired state (enabled/disabled). Note that this method's function overlaps with the RequestedState property. RequestedState was added to the model to maintain a record (i.e., a persisted value) of the last state request. Invoking the EnableDevice method should set the RequestedState property appropriately. 
     * The return code should be 0 if the request was successfully executed, 1 if the request is not supported and some other value if an error occurred. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
     *   @param Enabled If TRUE enable the device, if FALSE disable the device.
     *
     */

    public EnableDeviceResult invoke_EnableDevice(WBEMClient cimClient, Boolean Enabled)
            throws WbemsmtException {

        CIMArgument[] inParameter = new CIMArgument[1];
        CIMArgument[] outParameter = new CIMArgument[0];

        inParameter[0] = new CIMArgument("Enabled", CIMDataType.BOOLEAN_T, Enabled);

        javax.cim.UnsignedInteger32 resultObject = null;

        try {
            Object oResult = cimClient.invokeMethod(this.getCimObjectPath(),
                    METHOD_ENABLEDEVICE.NAME, inParameter, outParameter);
            if (oResult != null) {

                resultObject = (javax.cim.UnsignedInteger32) oResult;
            }
        }
        catch (WBEMException e) {
            throw new InvokeMethodException(e, new InvokeMethodUserObject(this.getCimObjectPath(),
                    METHOD_ENABLEDEVICE.NAME, inParameter, outParameter));
        }

        EnableDeviceResult result = new EnableDeviceResult();
        result.setResultObject(resultObject);

        java.util.HashMap mapOutParameter = new java.util.HashMap();
        for (int i = 0; i < outParameter.length; i++) {
            CIMArgument argument = outParameter[i];
            if (argument != null) {
                mapOutParameter.put(argument.getName(), argument);
            }
        }

        return result;
    }

    /**
     * Result object for the method EnableDevice
     */
    public static class EnableDeviceResult {
        /**
         * The return value of the method
         */

        javax.cim.UnsignedInteger32 resultObject = null;

        /**
         * Default constructor
         */
        EnableDeviceResult() {
        }

        /**
         * Set the return value
         * @param rc
         */
        void setResultObject(javax.cim.UnsignedInteger32 resultObject) {
            this.resultObject = resultObject;
        }

        /**
         * Get the return value of the methid
         * @return the return value
         */
        public javax.cim.UnsignedInteger32 getResultObject() {
            return this.resultObject;
        }

    }

    /**
     * Invokes the Method OnlineDevice
     * <br>
     * @param client the cimclient
     * The OnlineDevice method has been deprecated in lieu of the more general RequestStateChange method that directly overlaps with the functionality provided by this method. 
     * Requests that the LogicalDevice be brought online ("Online" input parameter = TRUE) or taken offline (= FALSE). "Online" indicates that the Device is ready to accept requests, and is operational and fully functioning. In this case, the Device's Availability property would be set to a value of 3 ("Running/Full Power"). "Offline" indicates that a Device is powered up and operational, but not processing functional requests. In an offline state, a Device may be capable of running diagnostics or generating operational alerts. For example, when the "Offline" button is pushed on a Printer, the Device is no longer available to process print jobs, but could be available for diagnostics or maintenance. 
     * If this method is successful, the Device's Availability and AdditionalAvailability properties should reflect the updated status. If a failure occurs trying to bring the Device online or offline, it should remain in its current state. IE, the request, if unsuccessful, should not leave the Device in an indeterminate state. When bringing a Device back "Online", from an "Offline" mode, the Device should be restored to its last "Online" state, if at all possible. Only a Device that has an EnabledState/StatusInfo of "Enabled" and has been configured can be brought online or taken offline. 
     * OnlineDevice should return 0 if successful, 1 if the request is not supported at all, 2 if the request is not supported due to the current state of the Device, and some other value if any other error occurred. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier. 
     * Note that this method's function overlaps with the RequestedState property. RequestedState was added to the model to maintain a record (i.e., a persisted value) of the last state request. Invoking the OnlineDevice method should set the RequestedState property appropriately.
     *   @param Online If TRUE, take the device online, if FALSE, take the device OFFLINE.
     *
     */

    public OnlineDeviceResult invoke_OnlineDevice(WBEMClient cimClient, Boolean Online)
            throws WbemsmtException {

        CIMArgument[] inParameter = new CIMArgument[1];
        CIMArgument[] outParameter = new CIMArgument[0];

        inParameter[0] = new CIMArgument("Online", CIMDataType.BOOLEAN_T, Online);

        javax.cim.UnsignedInteger32 resultObject = null;

        try {
            Object oResult = cimClient.invokeMethod(this.getCimObjectPath(),
                    METHOD_ONLINEDEVICE.NAME, inParameter, outParameter);
            if (oResult != null) {

                resultObject = (javax.cim.UnsignedInteger32) oResult;
            }
        }
        catch (WBEMException e) {
            throw new InvokeMethodException(e, new InvokeMethodUserObject(this.getCimObjectPath(),
                    METHOD_ONLINEDEVICE.NAME, inParameter, outParameter));
        }

        OnlineDeviceResult result = new OnlineDeviceResult();
        result.setResultObject(resultObject);

        java.util.HashMap mapOutParameter = new java.util.HashMap();
        for (int i = 0; i < outParameter.length; i++) {
            CIMArgument argument = outParameter[i];
            if (argument != null) {
                mapOutParameter.put(argument.getName(), argument);
            }
        }

        return result;
    }

    /**
     * Result object for the method OnlineDevice
     */
    public static class OnlineDeviceResult {
        /**
         * The return value of the method
         */

        javax.cim.UnsignedInteger32 resultObject = null;

        /**
         * Default constructor
         */
        OnlineDeviceResult() {
        }

        /**
         * Set the return value
         * @param rc
         */
        void setResultObject(javax.cim.UnsignedInteger32 resultObject) {
            this.resultObject = resultObject;
        }

        /**
         * Get the return value of the methid
         * @return the return value
         */
        public javax.cim.UnsignedInteger32 getResultObject() {
            return this.resultObject;
        }

    }

    /**
     * Invokes the Method QuiesceDevice
     * <br>
     * @param client the cimclient
     * The QuiesceDevice method has been deprecated in lieu of the more general RequestStateChange method that directly overlaps with the functionality provided by this method. 
     * Requests that the LogicalDevice cleanly cease all current activity ("Quiesce" input parameter = TRUE) or resume activity (= FALSE). For this method to quiesce a Device, that Device should have an Availability (or Additional Availability) of "Running/Full Power" (value=3) and an EnabledStatus/StatusInfo of "Enabled". For example, if quiesced, a Device may then be offlined for diagnostics, or disabled for power off and hot swap. For the method to "unquiesce" a Device, that Device should have an Availability (or AdditionalAvailability) of "Quiesced" (value=21) and an EnabledStatus/StatusInfo of "Enabled". In this case, the Device would be returned to an "Enabled" and "Running/Full Power" status. 
     * The method's return code should indicate the success or failure of the quiesce. It should return 0 if successful, 1 if the request is not supported at all, 2 if the request is not supported due to the current state of the Device, and some other value if any other error occurred. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
     *   @param Quiesce If set to TRUE then cleanly cease all activity, if FALSE resume activity.
     *
     */

    public QuiesceDeviceResult invoke_QuiesceDevice(WBEMClient cimClient, Boolean Quiesce)
            throws WbemsmtException {

        CIMArgument[] inParameter = new CIMArgument[1];
        CIMArgument[] outParameter = new CIMArgument[0];

        inParameter[0] = new CIMArgument("Quiesce", CIMDataType.BOOLEAN_T, Quiesce);

        javax.cim.UnsignedInteger32 resultObject = null;

        try {
            Object oResult = cimClient.invokeMethod(this.getCimObjectPath(),
                    METHOD_QUIESCEDEVICE.NAME, inParameter, outParameter);
            if (oResult != null) {

                resultObject = (javax.cim.UnsignedInteger32) oResult;
            }
        }
        catch (WBEMException e) {
            throw new InvokeMethodException(e, new InvokeMethodUserObject(this.getCimObjectPath(),
                    METHOD_QUIESCEDEVICE.NAME, inParameter, outParameter));
        }

        QuiesceDeviceResult result = new QuiesceDeviceResult();
        result.setResultObject(resultObject);

        java.util.HashMap mapOutParameter = new java.util.HashMap();
        for (int i = 0; i < outParameter.length; i++) {
            CIMArgument argument = outParameter[i];
            if (argument != null) {
                mapOutParameter.put(argument.getName(), argument);
            }
        }

        return result;
    }

    /**
     * Result object for the method QuiesceDevice
     */
    public static class QuiesceDeviceResult {
        /**
         * The return value of the method
         */

        javax.cim.UnsignedInteger32 resultObject = null;

        /**
         * Default constructor
         */
        QuiesceDeviceResult() {
        }

        /**
         * Set the return value
         * @param rc
         */
        void setResultObject(javax.cim.UnsignedInteger32 resultObject) {
            this.resultObject = resultObject;
        }

        /**
         * Get the return value of the methid
         * @return the return value
         */
        public javax.cim.UnsignedInteger32 getResultObject() {
            return this.resultObject;
        }

    }

    /**
     * Invokes the Method Reset
     * <br>
     * @param client the cimclient
     * Requests a reset of the LogicalDevice. The return value should be 0 if the request was successfully executed, 1 if the request is not supported and some other value if an error occurred. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
     *
     */

    public ResetResult invoke_Reset(WBEMClient cimClient) throws WbemsmtException {

        CIMArgument[] inParameter = new CIMArgument[0];
        CIMArgument[] outParameter = new CIMArgument[0];

        javax.cim.UnsignedInteger32 resultObject = null;

        try {
            Object oResult = cimClient.invokeMethod(this.getCimObjectPath(), METHOD_RESET.NAME,
                    inParameter, outParameter);
            if (oResult != null) {

                resultObject = (javax.cim.UnsignedInteger32) oResult;
            }
        }
        catch (WBEMException e) {
            throw new InvokeMethodException(e, new InvokeMethodUserObject(this.getCimObjectPath(),
                    METHOD_RESET.NAME, inParameter, outParameter));
        }

        ResetResult result = new ResetResult();
        result.setResultObject(resultObject);

        java.util.HashMap mapOutParameter = new java.util.HashMap();
        for (int i = 0; i < outParameter.length; i++) {
            CIMArgument argument = outParameter[i];
            if (argument != null) {
                mapOutParameter.put(argument.getName(), argument);
            }
        }

        return result;
    }

    /**
     * Result object for the method Reset
     */
    public static class ResetResult {
        /**
         * The return value of the method
         */

        javax.cim.UnsignedInteger32 resultObject = null;

        /**
         * Default constructor
         */
        ResetResult() {
        }

        /**
         * Set the return value
         * @param rc
         */
        void setResultObject(javax.cim.UnsignedInteger32 resultObject) {
            this.resultObject = resultObject;
        }

        /**
         * Get the return value of the methid
         * @return the return value
         */
        public javax.cim.UnsignedInteger32 getResultObject() {
            return this.resultObject;
        }

    }

    /**
     * Invokes the Method RestoreProperties
     * <br>
     * @param client the cimclient
     * Requests that the Device re-establish its configuration, setup and/or state information from a backing store. The intent is to capture this information at an earlier time (via the SaveProperties method), and use it to return a Device to this earlier "condition". This method may not be supported by all Devices. The method should return 0 if successful, 1 if the request is not supported, and some other value if any other error occurred. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
     *
     */

    public RestorePropertiesResult invoke_RestoreProperties(WBEMClient cimClient)
            throws WbemsmtException {

        CIMArgument[] inParameter = new CIMArgument[0];
        CIMArgument[] outParameter = new CIMArgument[0];

        javax.cim.UnsignedInteger32 resultObject = null;

        try {
            Object oResult = cimClient.invokeMethod(this.getCimObjectPath(),
                    METHOD_RESTOREPROPERTIES.NAME, inParameter, outParameter);
            if (oResult != null) {

                resultObject = (javax.cim.UnsignedInteger32) oResult;
            }
        }
        catch (WBEMException e) {
            throw new InvokeMethodException(e, new InvokeMethodUserObject(this.getCimObjectPath(),
                    METHOD_RESTOREPROPERTIES.NAME, inParameter, outParameter));
        }

        RestorePropertiesResult result = new RestorePropertiesResult();
        result.setResultObject(resultObject);

        java.util.HashMap mapOutParameter = new java.util.HashMap();
        for (int i = 0; i < outParameter.length; i++) {
            CIMArgument argument = outParameter[i];
            if (argument != null) {
                mapOutParameter.put(argument.getName(), argument);
            }
        }

        return result;
    }

    /**
     * Result object for the method RestoreProperties
     */
    public static class RestorePropertiesResult {
        /**
         * The return value of the method
         */

        javax.cim.UnsignedInteger32 resultObject = null;

        /**
         * Default constructor
         */
        RestorePropertiesResult() {
        }

        /**
         * Set the return value
         * @param rc
         */
        void setResultObject(javax.cim.UnsignedInteger32 resultObject) {
            this.resultObject = resultObject;
        }

        /**
         * Get the return value of the methid
         * @return the return value
         */
        public javax.cim.UnsignedInteger32 getResultObject() {
            return this.resultObject;
        }

    }

    /**
     * Invokes the Method SaveProperties
     * <br>
     * @param client the cimclient
     * Requests that the Device capture its current configuration, setup and/or state information in a backing store. The goal would be to use this information at a later time (via the RestoreProperties method), to return a Device to its present "condition". This method may not be supported by all Devices. The method should return 0 if successful, 1 if the request is not supported, and some other value if any other error occurred. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
     *
     */

    public SavePropertiesResult invoke_SaveProperties(WBEMClient cimClient) throws WbemsmtException {

        CIMArgument[] inParameter = new CIMArgument[0];
        CIMArgument[] outParameter = new CIMArgument[0];

        javax.cim.UnsignedInteger32 resultObject = null;

        try {
            Object oResult = cimClient.invokeMethod(this.getCimObjectPath(),
                    METHOD_SAVEPROPERTIES.NAME, inParameter, outParameter);
            if (oResult != null) {

                resultObject = (javax.cim.UnsignedInteger32) oResult;
            }
        }
        catch (WBEMException e) {
            throw new InvokeMethodException(e, new InvokeMethodUserObject(this.getCimObjectPath(),
                    METHOD_SAVEPROPERTIES.NAME, inParameter, outParameter));
        }

        SavePropertiesResult result = new SavePropertiesResult();
        result.setResultObject(resultObject);

        java.util.HashMap mapOutParameter = new java.util.HashMap();
        for (int i = 0; i < outParameter.length; i++) {
            CIMArgument argument = outParameter[i];
            if (argument != null) {
                mapOutParameter.put(argument.getName(), argument);
            }
        }

        return result;
    }

    /**
     * Result object for the method SaveProperties
     */
    public static class SavePropertiesResult {
        /**
         * The return value of the method
         */

        javax.cim.UnsignedInteger32 resultObject = null;

        /**
         * Default constructor
         */
        SavePropertiesResult() {
        }

        /**
         * Set the return value
         * @param rc
         */
        void setResultObject(javax.cim.UnsignedInteger32 resultObject) {
            this.resultObject = resultObject;
        }

        /**
         * Get the return value of the methid
         * @return the return value
         */
        public javax.cim.UnsignedInteger32 getResultObject() {
            return this.resultObject;
        }

    }

    /**
     * Invokes the Method SetPowerState
     * <br>
     * @param client the cimclient
     * Sets the power state of the Device. The use of this method has been deprecated. Instead, use the SetPowerState method in the associated PowerManagementService class.
     *   @param PowerState The power state to set.
     *   @param Time Time indicates when the power state should be set, either as a regular date-time value or as an interval value (where the interval begins when the method invocation is received.
     *
     */

    public SetPowerStateResult invoke_SetPowerState(WBEMClient cimClient,
            javax.cim.UnsignedInteger16 PowerState, javax.cim.CIMDateTime Time)
            throws WbemsmtException {

        CIMArgument[] inParameter = new CIMArgument[2];
        CIMArgument[] outParameter = new CIMArgument[0];

        inParameter[0] = new CIMArgument("PowerState", CIMDataType.UINT16_T, PowerState);
        inParameter[1] = new CIMArgument("Time", CIMDataType.DATETIME_T, Time);

        javax.cim.UnsignedInteger32 resultObject = null;

        try {
            Object oResult = cimClient.invokeMethod(this.getCimObjectPath(),
                    METHOD_SETPOWERSTATE.NAME, inParameter, outParameter);
            if (oResult != null) {

                resultObject = (javax.cim.UnsignedInteger32) oResult;
            }
        }
        catch (WBEMException e) {
            throw new InvokeMethodException(e, new InvokeMethodUserObject(this.getCimObjectPath(),
                    METHOD_SETPOWERSTATE.NAME, inParameter, outParameter));
        }

        SetPowerStateResult result = new SetPowerStateResult();
        result.setResultObject(resultObject);

        java.util.HashMap mapOutParameter = new java.util.HashMap();
        for (int i = 0; i < outParameter.length; i++) {
            CIMArgument argument = outParameter[i];
            if (argument != null) {
                mapOutParameter.put(argument.getName(), argument);
            }
        }

        return result;
    }

    /**
     * Result object for the method SetPowerState
     */
    public static class SetPowerStateResult {
        /**
         * The return value of the method
         */

        javax.cim.UnsignedInteger32 resultObject = null;

        /**
         * Default constructor
         */
        SetPowerStateResult() {
        }

        /**
         * Set the return value
         * @param rc
         */
        void setResultObject(javax.cim.UnsignedInteger32 resultObject) {
            this.resultObject = resultObject;
        }

        /**
         * Get the return value of the methid
         * @return the return value
         */
        public javax.cim.UnsignedInteger32 getResultObject() {
            return this.resultObject;
        }

    }

    //**********************************************************************
    // utility methods     
    //**********************************************************************                         

    /**
     * return the name of the CIMClass
     * @return
     */
    public String getObjectName() {
        return CIM_LogicalDevice.CIM_CLASS_NAME;
    }

}