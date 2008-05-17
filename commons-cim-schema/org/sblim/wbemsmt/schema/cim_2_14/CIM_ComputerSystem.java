/** 
 * CIM_ComputerSystem.java
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
 * Description: A class derived from System that is a special collection of ManagedSystemElements. This collection provides compute capabilities and serves as aggregation point to associate one or more of the following elements: FileSystem, OperatingSystem, Processor and Memory (Volatile and/or NonVolatile Storage).
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim_2_14;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;
import org.sblim.wbemsmt.exception.impl.*;
import org.sblim.wbemsmt.exception.impl.userobject.*;

import java.lang.reflect.*;
import javax.wbem.*;

public class CIM_ComputerSystem extends CIM_System {

    public final static String CIM_CLASS_NAME = "CIM_ComputerSystem";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * RunningOS indicates the currently executing OperatingSystem. At most one OperatingSystem can execute at any time on a ComputerSystem. 'At most one' is specified, since the Computer System may not be currently booted, or its OperatingSystem may be unknown.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_RUNNINGOS = "CIM_RunningOS";

    /**
     * Constant for method\'s name and parameters
     * Sets the power state of the computer. The use of this method has been deprecated. Instead, use the SetPowerState method in the associated PowerManagementService class.
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

            public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Full_Power = new javax.cim.UnsignedInteger32(
                    "1");

            /**
             * constant for value entry Full Power (corresponds to mapEntry 1 )
             */
            public final static String VALUE_ENTRY_Full_Power = "Full Power";

            /**
             * constant for value map entry 2
             */

            public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Power_Save___Low_Power_Mode = new javax.cim.UnsignedInteger32(
                    "2");

            /**
             * constant for value entry Power Save - Low Power Mode (corresponds to mapEntry 2 )
             */
            public final static String VALUE_ENTRY_Power_Save___Low_Power_Mode = "Power Save - Low Power Mode";

            /**
             * constant for value map entry 3
             */

            public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Power_Save___Standby = new javax.cim.UnsignedInteger32(
                    "3");

            /**
             * constant for value entry Power Save - Standby (corresponds to mapEntry 3 )
             */
            public final static String VALUE_ENTRY_Power_Save___Standby = "Power Save - Standby";

            /**
             * constant for value map entry 4
             */

            public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Power_Save___Other = new javax.cim.UnsignedInteger32(
                    "4");

            /**
             * constant for value entry Power Save - Other (corresponds to mapEntry 4 )
             */
            public final static String VALUE_ENTRY_Power_Save___Other = "Power Save - Other";

            /**
             * constant for value map entry 5
             */

            public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Power_Cycle = new javax.cim.UnsignedInteger32(
                    "5");

            /**
             * constant for value entry Power Cycle (corresponds to mapEntry 5 )
             */
            public final static String VALUE_ENTRY_Power_Cycle = "Power Cycle";

            /**
             * constant for value map entry 6
             */

            public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Power_Off = new javax.cim.UnsignedInteger32(
                    "6");

            /**
             * constant for value entry Power Off (corresponds to mapEntry 6 )
             */
            public final static String VALUE_ENTRY_Power_Off = "Power Off";

            /**
             * constant for value map entry 7
             */

            public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Hibernate = new javax.cim.UnsignedInteger32(
                    "7");

            /**
             * constant for value entry Hibernate (corresponds to mapEntry 7 )
             */
            public final static String VALUE_ENTRY_Hibernate = "Hibernate";

            /**
             * constant for value map entry 8
             */

            public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Soft_Off = new javax.cim.UnsignedInteger32(
                    "8");

            /**
             * constant for value entry Soft Off (corresponds to mapEntry 8 )
             */
            public final static String VALUE_ENTRY_Soft_Off = "Soft Off";

            /**
             * get the ValueMapEntry of the given value
             * @param value the value to find the ValueMapEntry for
             * @return the ValueMap entry or null if not found
             */
            //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@1f261f26
            public static javax.cim.UnsignedInteger32 getValueMapEntry(String value) {

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

                if (VALUE_ENTRY_Hibernate.equals(value)) {
                    return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Hibernate;
                }

                if (VALUE_ENTRY_Soft_Off.equals(value)) {
                    return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Soft_Off;
                }
                return null;

            }

            /**
             * uses the element within array VALUE_ENTRIES_FOR_DISPLAY at index indexInPulldown to get the ValueMapEntry
             * @param indexInPulldown the index within the pulldown element, the list etc
             * @return the ValueMap entry from the displayed values
             */
            public static javax.cim.UnsignedInteger32 getValueMapEntryFromDisplayedValue(
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
            public static int getIndexForDisplay(javax.cim.UnsignedInteger32 currentValue) {
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

            public static String getValueEntry(javax.cim.UnsignedInteger32 value) {
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

                if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Hibernate.intValue()) {
                    return VALUE_ENTRY_Hibernate;
                }

                if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Soft_Off.intValue()) {
                    return VALUE_ENTRY_Soft_Off;
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
            public final static javax.cim.UnsignedInteger32[] VALUE_MAP_ENTRIES = {
                    VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Full_Power,
                    VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Power_Save___Low_Power_Mode,
                    VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Power_Save___Standby,
                    VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Power_Save___Other,
                    VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Power_Cycle,
                    VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Power_Off,
                    VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Hibernate,
                    VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Soft_Off };

            /**
             * Values
             * Contains all values even those having an integer value range representation within the valueMap
             * Value Map for the parameter PowerState of the method SetPowerState   
             */
            public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Full_Power,
                    VALUE_ENTRY_Power_Save___Low_Power_Mode, VALUE_ENTRY_Power_Save___Standby,
                    VALUE_ENTRY_Power_Save___Other, VALUE_ENTRY_Power_Cycle, VALUE_ENTRY_Power_Off,
                    VALUE_ENTRY_Hibernate, VALUE_ENTRY_Soft_Off };

            /**
             * Values for displaying within pulldown elements, lists, radio buttons etc
             * Contains no values that having an integer value range representation within the valueMap
             * 
             * Value Map for the parameter PowerState of the method SetPowerState   
             */
            public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Full_Power,
                    VALUE_ENTRY_Power_Save___Low_Power_Mode, VALUE_ENTRY_Power_Save___Standby,
                    VALUE_ENTRY_Power_Save___Other, VALUE_ENTRY_Power_Cycle, VALUE_ENTRY_Power_Off,
                    VALUE_ENTRY_Hibernate, VALUE_ENTRY_Soft_Off };

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
     * Constants of property Dedicated
     * Enumeration indicating whether the ComputerSystem is a special-purpose System (ie, dedicated to a particular use), versus being 'general purpose'. For example, one could specify that the System is dedicated to "Print" (value=11) or acts as a "Hub" (value=8). 
     * A clarification is needed with respect to the value 17 ("Mobile User Device"). An example of a dedicated user device is a mobile phone or a barcode scanner in a store that communicates via radio frequency. These systems are quite limited in functionality and programmability, and are not considered 'general purpose' computing platforms. Alternately, an example of a mobile system that is 'general purpose' (i.e., is NOT dedicated) is a hand-held computer. Although limited in its programmability, new software can be downloaded and its functionality expanded by the user.
     */
    public static class PROPERTY_DEDICATED {
        /**
         * name of the property Dedicated
         */
        public final static String NAME = "Dedicated";

        /**
         * constant for value map entry 0
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Not_Dedicated = new javax.cim.UnsignedInteger16(
                "0");

        /**
         * constant for value entry Not Dedicated (corresponds to mapEntry 0 )
         */
        public final static String VALUE_ENTRY_Not_Dedicated = "Not Dedicated";

        /**
         * constant for value map entry 1
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Unknown = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry Unknown (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_Unknown = "Unknown";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Other = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Other (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Other = "Other";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Storage = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Storage (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Storage = "Storage";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Router = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Router (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Router = "Router";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Switch = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry Switch (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Switch = "Switch";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Layer_3_Switch = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry Layer 3 Switch (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Layer_3_Switch = "Layer 3 Switch";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Central_Office_Switch = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry Central Office Switch (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_Central_Office_Switch = "Central Office Switch";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Hub = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry Hub (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_Hub = "Hub";

        /**
         * constant for value map entry 9
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Access_Server = new javax.cim.UnsignedInteger16(
                "9");

        /**
         * constant for value entry Access Server (corresponds to mapEntry 9 )
         */
        public final static String VALUE_ENTRY_Access_Server = "Access Server";

        /**
         * constant for value map entry 10
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Firewall = new javax.cim.UnsignedInteger16(
                "10");

        /**
         * constant for value entry Firewall (corresponds to mapEntry 10 )
         */
        public final static String VALUE_ENTRY_Firewall = "Firewall";

        /**
         * constant for value map entry 11
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Print = new javax.cim.UnsignedInteger16(
                "11");

        /**
         * constant for value entry Print (corresponds to mapEntry 11 )
         */
        public final static String VALUE_ENTRY_Print = "Print";

        /**
         * constant for value map entry 12
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_I_O = new javax.cim.UnsignedInteger16(
                "12");

        /**
         * constant for value entry I/O (corresponds to mapEntry 12 )
         */
        public final static String VALUE_ENTRY_I_O = "I/O";

        /**
         * constant for value map entry 13
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Web_Caching = new javax.cim.UnsignedInteger16(
                "13");

        /**
         * constant for value entry Web Caching (corresponds to mapEntry 13 )
         */
        public final static String VALUE_ENTRY_Web_Caching = "Web Caching";

        /**
         * constant for value map entry 14
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_Management = new javax.cim.UnsignedInteger16(
                "14");

        /**
         * constant for value entry Management (corresponds to mapEntry 14 )
         */
        public final static String VALUE_ENTRY_Management = "Management";

        /**
         * constant for value map entry 15
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Block_Server = new javax.cim.UnsignedInteger16(
                "15");

        /**
         * constant for value entry Block Server (corresponds to mapEntry 15 )
         */
        public final static String VALUE_ENTRY_Block_Server = "Block Server";

        /**
         * constant for value map entry 16
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_File_Server = new javax.cim.UnsignedInteger16(
                "16");

        /**
         * constant for value entry File Server (corresponds to mapEntry 16 )
         */
        public final static String VALUE_ENTRY_File_Server = "File Server";

        /**
         * constant for value map entry 17
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_Mobile_User_Device = new javax.cim.UnsignedInteger16(
                "17");

        /**
         * constant for value entry Mobile User Device (corresponds to mapEntry 17 )
         */
        public final static String VALUE_ENTRY_Mobile_User_Device = "Mobile User Device";

        /**
         * constant for value map entry 18
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_Repeater = new javax.cim.UnsignedInteger16(
                "18");

        /**
         * constant for value entry Repeater (corresponds to mapEntry 18 )
         */
        public final static String VALUE_ENTRY_Repeater = "Repeater";

        /**
         * constant for value map entry 19
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_Bridge_Extender = new javax.cim.UnsignedInteger16(
                "19");

        /**
         * constant for value entry Bridge/Extender (corresponds to mapEntry 19 )
         */
        public final static String VALUE_ENTRY_Bridge_Extender = "Bridge/Extender";

        /**
         * constant for value map entry 20
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_Gateway = new javax.cim.UnsignedInteger16(
                "20");

        /**
         * constant for value entry Gateway (corresponds to mapEntry 20 )
         */
        public final static String VALUE_ENTRY_Gateway = "Gateway";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@43ee43ee
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Not_Dedicated.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Not_Dedicated;
            }

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Storage.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Storage;
            }

            if (VALUE_ENTRY_Router.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Router;
            }

            if (VALUE_ENTRY_Switch.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Switch;
            }

            if (VALUE_ENTRY_Layer_3_Switch.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Layer_3_Switch;
            }

            if (VALUE_ENTRY_Central_Office_Switch.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Central_Office_Switch;
            }

            if (VALUE_ENTRY_Hub.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Hub;
            }

            if (VALUE_ENTRY_Access_Server.equals(value)) {
                return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Access_Server;
            }

            if (VALUE_ENTRY_Firewall.equals(value)) {
                return VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Firewall;
            }

            if (VALUE_ENTRY_Print.equals(value)) {
                return VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Print;
            }

            if (VALUE_ENTRY_I_O.equals(value)) {
                return VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_I_O;
            }

            if (VALUE_ENTRY_Web_Caching.equals(value)) {
                return VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Web_Caching;
            }

            if (VALUE_ENTRY_Management.equals(value)) {
                return VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_Management;
            }

            if (VALUE_ENTRY_Block_Server.equals(value)) {
                return VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Block_Server;
            }

            if (VALUE_ENTRY_File_Server.equals(value)) {
                return VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_File_Server;
            }

            if (VALUE_ENTRY_Mobile_User_Device.equals(value)) {
                return VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_Mobile_User_Device;
            }

            if (VALUE_ENTRY_Repeater.equals(value)) {
                return VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_Repeater;
            }

            if (VALUE_ENTRY_Bridge_Extender.equals(value)) {
                return VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_Bridge_Extender;
            }

            if (VALUE_ENTRY_Gateway.equals(value)) {
                return VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_Gateway;
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

            if (iValue == VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Not_Dedicated.intValue()) {
                return VALUE_ENTRY_Not_Dedicated;
            }

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Unknown.intValue()) {
                return VALUE_ENTRY_Unknown;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Other.intValue()) {
                return VALUE_ENTRY_Other;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Storage.intValue()) {
                return VALUE_ENTRY_Storage;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Router.intValue()) {
                return VALUE_ENTRY_Router;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Switch.intValue()) {
                return VALUE_ENTRY_Switch;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Layer_3_Switch.intValue()) {
                return VALUE_ENTRY_Layer_3_Switch;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Central_Office_Switch.intValue()) {
                return VALUE_ENTRY_Central_Office_Switch;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Hub.intValue()) {
                return VALUE_ENTRY_Hub;
            }

            if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Access_Server.intValue()) {
                return VALUE_ENTRY_Access_Server;
            }

            if (iValue == VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Firewall.intValue()) {
                return VALUE_ENTRY_Firewall;
            }

            if (iValue == VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Print.intValue()) {
                return VALUE_ENTRY_Print;
            }

            if (iValue == VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_I_O.intValue()) {
                return VALUE_ENTRY_I_O;
            }

            if (iValue == VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Web_Caching.intValue()) {
                return VALUE_ENTRY_Web_Caching;
            }

            if (iValue == VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_Management.intValue()) {
                return VALUE_ENTRY_Management;
            }

            if (iValue == VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Block_Server.intValue()) {
                return VALUE_ENTRY_Block_Server;
            }

            if (iValue == VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_File_Server.intValue()) {
                return VALUE_ENTRY_File_Server;
            }

            if (iValue == VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_Mobile_User_Device.intValue()) {
                return VALUE_ENTRY_Mobile_User_Device;
            }

            if (iValue == VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_Repeater.intValue()) {
                return VALUE_ENTRY_Repeater;
            }

            if (iValue == VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_Bridge_Extender.intValue()) {
                return VALUE_ENTRY_Bridge_Extender;
            }

            if (iValue == VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_Gateway.intValue()) {
                return VALUE_ENTRY_Gateway;
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
         * Value Map for the property Dedicated   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Not_Dedicated,
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Storage,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Router, VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Switch,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Layer_3_Switch,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Central_Office_Switch,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Hub,
                VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Access_Server,
                VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Firewall,
                VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Print, VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_I_O,
                VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Web_Caching,
                VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_Management,
                VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Block_Server,
                VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_File_Server,
                VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_Mobile_User_Device,
                VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_Repeater,
                VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_Bridge_Extender,
                VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_Gateway };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property Dedicated   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Not_Dedicated,
                VALUE_ENTRY_Unknown, VALUE_ENTRY_Other, VALUE_ENTRY_Storage, VALUE_ENTRY_Router,
                VALUE_ENTRY_Switch, VALUE_ENTRY_Layer_3_Switch, VALUE_ENTRY_Central_Office_Switch,
                VALUE_ENTRY_Hub, VALUE_ENTRY_Access_Server, VALUE_ENTRY_Firewall,
                VALUE_ENTRY_Print, VALUE_ENTRY_I_O, VALUE_ENTRY_Web_Caching,
                VALUE_ENTRY_Management, VALUE_ENTRY_Block_Server, VALUE_ENTRY_File_Server,
                VALUE_ENTRY_Mobile_User_Device, VALUE_ENTRY_Repeater, VALUE_ENTRY_Bridge_Extender,
                VALUE_ENTRY_Gateway };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property Dedicated   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Not_Dedicated,
                VALUE_ENTRY_Unknown, VALUE_ENTRY_Other, VALUE_ENTRY_Storage, VALUE_ENTRY_Router,
                VALUE_ENTRY_Switch, VALUE_ENTRY_Layer_3_Switch, VALUE_ENTRY_Central_Office_Switch,
                VALUE_ENTRY_Hub, VALUE_ENTRY_Access_Server, VALUE_ENTRY_Firewall,
                VALUE_ENTRY_Print, VALUE_ENTRY_I_O, VALUE_ENTRY_Web_Caching,
                VALUE_ENTRY_Management, VALUE_ENTRY_Block_Server, VALUE_ENTRY_File_Server,
                VALUE_ENTRY_Mobile_User_Device, VALUE_ENTRY_Repeater, VALUE_ENTRY_Bridge_Extender,
                VALUE_ENTRY_Gateway };

    }

    /**
     * Constants of property IdentifyingDescriptions
     * An array of free-form strings providing explanations and details behind the entries in the OtherIdentifying Info array. Note, each entry of this array is related to the entry in OtherIdentifyingInfo that is located at the same index.
     */
    public static class PROPERTY_IDENTIFYINGDESCRIPTIONS {
        /**
         * name of the property IdentifyingDescriptions
         */
        public final static String NAME = "IdentifyingDescriptions";

    }

    /**
     * Constants of property NameFormat
     * The ComputerSystem object and its derivatives are Top Level Objects of CIM. They provide the scope for numerous components. Having unique System keys is required. The NameFormat property identifies how the ComputerSystem Name is generated. The NameFormat ValueMap qualifier defines the various mechanisms for assigning the name. Note that another name can be assigned and used for the ComputerSystem that better suit a business, using the inherited ElementName property.
     */
    public static class PROPERTY_NAMEFORMAT {
        /**
         * name of the property NameFormat
         */
        public final static String NAME = "NameFormat";

        /**
         * constant for value map entry Other
         */

        public final static String VALUE_MAP_ENTRY_Other = new String("Other");

        /**
         * constant for value map entry IP
         */

        public final static String VALUE_MAP_ENTRY_IP = new String("IP");

        /**
         * constant for value map entry Dial
         */

        public final static String VALUE_MAP_ENTRY_Dial = new String("Dial");

        /**
         * constant for value map entry HID
         */

        public final static String VALUE_MAP_ENTRY_HID = new String("HID");

        /**
         * constant for value map entry NWA
         */

        public final static String VALUE_MAP_ENTRY_NWA = new String("NWA");

        /**
         * constant for value map entry HWA
         */

        public final static String VALUE_MAP_ENTRY_HWA = new String("HWA");

        /**
         * constant for value map entry X25
         */

        public final static String VALUE_MAP_ENTRY_X25 = new String("X25");

        /**
         * constant for value map entry ISDN
         */

        public final static String VALUE_MAP_ENTRY_ISDN = new String("ISDN");

        /**
         * constant for value map entry IPX
         */

        public final static String VALUE_MAP_ENTRY_IPX = new String("IPX");

        /**
         * constant for value map entry DCC
         */

        public final static String VALUE_MAP_ENTRY_DCC = new String("DCC");

        /**
         * constant for value map entry ICD
         */

        public final static String VALUE_MAP_ENTRY_ICD = new String("ICD");

        /**
         * constant for value map entry E.164
         */

        public final static String VALUE_MAP_ENTRY_E_164 = new String("E.164");

        /**
         * constant for value map entry SNA
         */

        public final static String VALUE_MAP_ENTRY_SNA = new String("SNA");

        /**
         * constant for value map entry OID/OSI
         */

        public final static String VALUE_MAP_ENTRY_OID_OSI = new String("OID/OSI");

        /**
         * constant for value map entry WWN
         */

        public final static String VALUE_MAP_ENTRY_WWN = new String("WWN");

        /**
         * constant for value map entry NAA
         */

        public final static String VALUE_MAP_ENTRY_NAA = new String("NAA");

        /**
         * ValueMap entries
         * Contains no entries that having an integer value range representation
         * 
         * The couterpart for the value entries is returned by VALUE_ENTRIES_FOR_DISPLAY
         *
         * @see \#VALUE_ENTRIES_FOR_DISPLAY
         * 
         * Value Map for the property NameFormat   
         */
        public final static String[] VALUE_MAP_ENTRIES = { VALUE_MAP_ENTRY_Other,
                VALUE_MAP_ENTRY_IP, VALUE_MAP_ENTRY_Dial, VALUE_MAP_ENTRY_HID, VALUE_MAP_ENTRY_NWA,
                VALUE_MAP_ENTRY_HWA, VALUE_MAP_ENTRY_X25, VALUE_MAP_ENTRY_ISDN,
                VALUE_MAP_ENTRY_IPX, VALUE_MAP_ENTRY_DCC, VALUE_MAP_ENTRY_ICD,
                VALUE_MAP_ENTRY_E_164, VALUE_MAP_ENTRY_SNA, VALUE_MAP_ENTRY_OID_OSI,
                VALUE_MAP_ENTRY_WWN, VALUE_MAP_ENTRY_NAA };

    }

    /**
     * Constants of property OtherDedicatedDescriptions
     * A string describing how or why the system is dedicated when the Dedicated array includes the value 2, "Other".
     */
    public static class PROPERTY_OTHERDEDICATEDDESCRIPTIONS {
        /**
         * name of the property OtherDedicatedDescriptions
         */
        public final static String NAME = "OtherDedicatedDescriptions";

    }

    /**
     * Constants of property OtherIdentifyingInfo
     * OtherIdentifyingInfo captures additional data, beyond System Name information, that could be used to identify a ComputerSystem. One example would be to hold the Fibre Channel World-Wide Name (WWN) of a node. Note that if only the Fibre Channel name is available and is unique (able to be used as the System key), then this property would be NULL and the WWN would become the System key, its data placed in the Name property.
     */
    public static class PROPERTY_OTHERIDENTIFYINGINFO {
        /**
         * name of the property OtherIdentifyingInfo
         */
        public final static String NAME = "OtherIdentifyingInfo";

    }

    /**
     * Constants of property PowerManagementCapabilities
     * An enumerated array describing the power management capabilities of the ComputerSystem. The use of this property has been deprecated. Instead, the Power Capabilites property in an associated PowerManagement Capabilities class should be used.
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
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@42ba42ba
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
     * Constants of property ResetCapability
     * If enabled (value = 4), the ComputerSystem can be reset via hardware (e.g. the power and reset buttons). If disabled (value = 3), hardware reset is not allowed. In addition to Enabled and Disabled, other Values for the property are also defined - "Not Implemented" (5), "Other" (1) and "Unknown" (2).
     */
    public static class PROPERTY_RESETCAPABILITY {
        /**
         * name of the property ResetCapability
         */
        public final static String NAME = "ResetCapability";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Disabled = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Disabled (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Disabled = "Disabled";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Enabled = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Enabled (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Enabled = "Enabled";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Not_Implemented = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry Not Implemented (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Not_Implemented = "Not Implemented";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@4e684e68
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Disabled.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Disabled;
            }

            if (VALUE_ENTRY_Enabled.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Enabled;
            }

            if (VALUE_ENTRY_Not_Implemented.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Not_Implemented;
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

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Disabled.intValue()) {
                return VALUE_ENTRY_Disabled;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Enabled.intValue()) {
                return VALUE_ENTRY_Enabled;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Not_Implemented.intValue()) {
                return VALUE_ENTRY_Not_Implemented;
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
         * Value Map for the property ResetCapability   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other, VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Disabled,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Enabled,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Not_Implemented };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property ResetCapability   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Other, VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Disabled, VALUE_ENTRY_Enabled, VALUE_ENTRY_Not_Implemented };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property ResetCapability   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Other,
                VALUE_ENTRY_Unknown, VALUE_ENTRY_Disabled, VALUE_ENTRY_Enabled,
                VALUE_ENTRY_Not_Implemented };

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim_2_14");
        String[] parentClassPackageList = CIM_System.getPackages();

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
     *   A class derived from System that is a special collection of ManagedSystemElements. This collection provides compute capabilities and serves as aggregation point to associate one or more of the following elements: FileSystem, OperatingSystem, Processor and Memory (Volatile and/or NonVolatile Storage).
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_ComputerSystem(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   A class derived from System that is a special collection of ManagedSystemElements. This collection provides compute capabilities and serves as aggregation point to associate one or more of the following elements: FileSystem, OperatingSystem, Processor and Memory (Volatile and/or NonVolatile Storage).
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_ComputerSystem(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_ComputerSystem() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("Dedicated", new CIMProperty("Dedicated", CIMDataType.UINT16_ARRAY_T,
                null));
        propertiesToCheck.put("IdentifyingDescriptions", new CIMProperty("IdentifyingDescriptions",
                CIMDataType.STRING_ARRAY_T, null));
        propertiesToCheck.put("NameFormat", new CIMProperty("NameFormat", CIMDataType.STRING_T,
                null));
        propertiesToCheck.put("OtherDedicatedDescriptions", new CIMProperty(
                "OtherDedicatedDescriptions", CIMDataType.STRING_ARRAY_T, null));
        propertiesToCheck.put("OtherIdentifyingInfo", new CIMProperty("OtherIdentifyingInfo",
                CIMDataType.STRING_ARRAY_T, null));
        propertiesToCheck.put("PowerManagementCapabilities", new CIMProperty(
                "PowerManagementCapabilities", CIMDataType.UINT16_ARRAY_T, null));
        propertiesToCheck.put("ResetCapability", new CIMProperty("ResetCapability",
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
     * Get the property Dedicated
     *     * <br>
     * Enumeration indicating whether the ComputerSystem is a special-purpose System (ie, dedicated to a particular use), versus being 'general purpose'. For example, one could specify that the System is dedicated to "Print" (value=11) or acts as a "Hub" (value=8). 
     * A clarification is needed with respect to the value 17 ("Mobile User Device"). An example of a dedicated user device is a mobile phone or a barcode scanner in a store that communicates via radio frequency. These systems are quite limited in functionality and programmability, and are not considered 'general purpose' computing platforms. Alternately, an example of a mobile system that is 'general purpose' (i.e., is NOT dedicated) is a hand-held computer. Although limited in its programmability, new software can be downloaded and its functionality expanded by the user.
     *     */

    public javax.cim.UnsignedInteger16[] get_Dedicated() {
        CIMProperty currentProperty = getProperty(PROPERTY_DEDICATED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_DEDICATED.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16[]) currentProperty.getValue();

    }

    /**
     * Set the property Dedicated
     * <br>
     * Enumeration indicating whether the ComputerSystem is a special-purpose System (ie, dedicated to a particular use), versus being 'general purpose'. For example, one could specify that the System is dedicated to "Print" (value=11) or acts as a "Hub" (value=8). 
     * A clarification is needed with respect to the value 17 ("Mobile User Device"). An example of a dedicated user device is a mobile phone or a barcode scanner in a store that communicates via radio frequency. These systems are quite limited in functionality and programmability, and are not considered 'general purpose' computing platforms. Alternately, an example of a mobile system that is 'general purpose' (i.e., is NOT dedicated) is a hand-held computer. Although limited in its programmability, new software can be downloaded and its functionality expanded by the user.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Dedicated(javax.cim.UnsignedInteger16[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_DEDICATED.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_Dedicated(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_DEDICATED.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Dedicated by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Dedicated(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16[] newValue) throws WbemsmtException {
        CIM_ComputerSystem fco = new CIM_ComputerSystem(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_DEDICATED.NAME);
        if (property != null) {
            property = setPropertyValue_Dedicated(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_DEDICATED.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Dedicated
     * <br>
     * Enumeration indicating whether the ComputerSystem is a special-purpose System (ie, dedicated to a particular use), versus being 'general purpose'. For example, one could specify that the System is dedicated to "Print" (value=11) or acts as a "Hub" (value=8). 
     * A clarification is needed with respect to the value 17 ("Mobile User Device"). An example of a dedicated user device is a mobile phone or a barcode scanner in a store that communicates via radio frequency. These systems are quite limited in functionality and programmability, and are not considered 'general purpose' computing platforms. Alternately, an example of a mobile system that is 'general purpose' (i.e., is NOT dedicated) is a hand-held computer. Although limited in its programmability, new software can be downloaded and its functionality expanded by the user.
     */

    private static CIMProperty setPropertyValue_Dedicated(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16[] newValue) {
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
     * An array of free-form strings providing explanations and details behind the entries in the OtherIdentifying Info array. Note, each entry of this array is related to the entry in OtherIdentifyingInfo that is located at the same index.
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
     * An array of free-form strings providing explanations and details behind the entries in the OtherIdentifying Info array. Note, each entry of this array is related to the entry in OtherIdentifyingInfo that is located at the same index.
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
        CIM_ComputerSystem fco = new CIM_ComputerSystem(client, namespace);
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
     * An array of free-form strings providing explanations and details behind the entries in the OtherIdentifying Info array. Note, each entry of this array is related to the entry in OtherIdentifyingInfo that is located at the same index.
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
     * Get the property NameFormat
     *     * <br>
     * The ComputerSystem object and its derivatives are Top Level Objects of CIM. They provide the scope for numerous components. Having unique System keys is required. The NameFormat property identifies how the ComputerSystem Name is generated. The NameFormat ValueMap qualifier defines the various mechanisms for assigning the name. Note that another name can be assigned and used for the ComputerSystem that better suit a business, using the inherited ElementName property.
     *     */

    public String get_NameFormat() {
        CIMProperty currentProperty = getProperty(PROPERTY_NAMEFORMAT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_NAMEFORMAT.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property NameFormat
     * <br>
     * The ComputerSystem object and its derivatives are Top Level Objects of CIM. They provide the scope for numerous components. Having unique System keys is required. The NameFormat property identifies how the ComputerSystem Name is generated. The NameFormat ValueMap qualifier defines the various mechanisms for assigning the name. Note that another name can be assigned and used for the ComputerSystem that better suit a business, using the inherited ElementName property.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_NameFormat(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_NAMEFORMAT.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_NameFormat(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_NAMEFORMAT.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property NameFormat by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_NameFormat(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_ComputerSystem fco = new CIM_ComputerSystem(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_NAMEFORMAT.NAME);
        if (property != null) {
            property = setPropertyValue_NameFormat(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_NAMEFORMAT.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property NameFormat
     * <br>
     * The ComputerSystem object and its derivatives are Top Level Objects of CIM. They provide the scope for numerous components. Having unique System keys is required. The NameFormat property identifies how the ComputerSystem Name is generated. The NameFormat ValueMap qualifier defines the various mechanisms for assigning the name. Note that another name can be assigned and used for the ComputerSystem that better suit a business, using the inherited ElementName property.
     */

    private static CIMProperty setPropertyValue_NameFormat(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OtherDedicatedDescriptions
     *     * <br>
     * A string describing how or why the system is dedicated when the Dedicated array includes the value 2, "Other".
     *     */

    public String[] get_OtherDedicatedDescriptions() {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERDEDICATEDDESCRIPTIONS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OTHERDEDICATEDDESCRIPTIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String[]) currentProperty.getValue();

    }

    /**
     * Set the property OtherDedicatedDescriptions
     * <br>
     * A string describing how or why the system is dedicated when the Dedicated array includes the value 2, "Other".
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OtherDedicatedDescriptions(String[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERDEDICATEDDESCRIPTIONS.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_OtherDedicatedDescriptions(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERDEDICATEDDESCRIPTIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OtherDedicatedDescriptions by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherDedicatedDescriptions(WBEMClient client,
            String namespace, String[] newValue) throws WbemsmtException {
        CIM_ComputerSystem fco = new CIM_ComputerSystem(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OTHERDEDICATEDDESCRIPTIONS.NAME);
        if (property != null) {
            property = setPropertyValue_OtherDedicatedDescriptions(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERDEDICATEDDESCRIPTIONS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OtherDedicatedDescriptions
     * <br>
     * A string describing how or why the system is dedicated when the Dedicated array includes the value 2, "Other".
     */

    private static CIMProperty setPropertyValue_OtherDedicatedDescriptions(
            CIMProperty currentProperty, String[] newValue) {
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
     * OtherIdentifyingInfo captures additional data, beyond System Name information, that could be used to identify a ComputerSystem. One example would be to hold the Fibre Channel World-Wide Name (WWN) of a node. Note that if only the Fibre Channel name is available and is unique (able to be used as the System key), then this property would be NULL and the WWN would become the System key, its data placed in the Name property.
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
     * OtherIdentifyingInfo captures additional data, beyond System Name information, that could be used to identify a ComputerSystem. One example would be to hold the Fibre Channel World-Wide Name (WWN) of a node. Note that if only the Fibre Channel name is available and is unique (able to be used as the System key), then this property would be NULL and the WWN would become the System key, its data placed in the Name property.
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
        CIM_ComputerSystem fco = new CIM_ComputerSystem(client, namespace);
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
     * OtherIdentifyingInfo captures additional data, beyond System Name information, that could be used to identify a ComputerSystem. One example would be to hold the Fibre Channel World-Wide Name (WWN) of a node. Note that if only the Fibre Channel name is available and is unique (able to be used as the System key), then this property would be NULL and the WWN would become the System key, its data placed in the Name property.
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
     * An enumerated array describing the power management capabilities of the ComputerSystem. The use of this property has been deprecated. Instead, the Power Capabilites property in an associated PowerManagement Capabilities class should be used.
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
     * An enumerated array describing the power management capabilities of the ComputerSystem. The use of this property has been deprecated. Instead, the Power Capabilites property in an associated PowerManagement Capabilities class should be used.
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
        CIM_ComputerSystem fco = new CIM_ComputerSystem(client, namespace);
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
     * An enumerated array describing the power management capabilities of the ComputerSystem. The use of this property has been deprecated. Instead, the Power Capabilites property in an associated PowerManagement Capabilities class should be used.
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
     * Get the property ResetCapability
     *     * <br>
     * If enabled (value = 4), the ComputerSystem can be reset via hardware (e.g. the power and reset buttons). If disabled (value = 3), hardware reset is not allowed. In addition to Enabled and Disabled, other Values for the property are also defined - "Not Implemented" (5), "Other" (1) and "Unknown" (2).
     *     */

    public javax.cim.UnsignedInteger16 get_ResetCapability() {
        CIMProperty currentProperty = getProperty(PROPERTY_RESETCAPABILITY.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_RESETCAPABILITY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property ResetCapability
     * <br>
     * If enabled (value = 4), the ComputerSystem can be reset via hardware (e.g. the power and reset buttons). If disabled (value = 3), hardware reset is not allowed. In addition to Enabled and Disabled, other Values for the property are also defined - "Not Implemented" (5), "Other" (1) and "Unknown" (2).
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ResetCapability(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_RESETCAPABILITY.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_ResetCapability(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_RESETCAPABILITY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ResetCapability by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ResetCapability(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_ComputerSystem fco = new CIM_ComputerSystem(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_RESETCAPABILITY.NAME);
        if (property != null) {
            property = setPropertyValue_ResetCapability(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_RESETCAPABILITY.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ResetCapability
     * <br>
     * If enabled (value = 4), the ComputerSystem can be reset via hardware (e.g. the power and reset buttons). If disabled (value = 3), hardware reset is not allowed. In addition to Enabled and Disabled, other Values for the property are also defined - "Not Implemented" (5), "Other" (1) and "Unknown" (2).
     */

    private static CIMProperty setPropertyValue_ResetCapability(CIMProperty currentProperty,
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
     * Get the list with CIM_OperatingSystem objects associated by the association CIM_RunningOS
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_RUNNINGOS as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_OperatingSystem_CIM_RunningOSs(WBEMClient cimClient)
            throws WbemsmtException {

        return getAssociated_CIM_OperatingSystem_CIM_RunningOSs(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_RUNNINGOS, CIM_OperatingSystem.CIM_CLASS_NAME, null,
                null, false, false, null);

    }

    /**
     * Get the list with CIM_OperatingSystem objects associated by the association CIM_RunningOS
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_RUNNINGOS or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_RUNNINGOS as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_OperatingSystem_CIM_RunningOSs(WBEMClient cimClient,
            String resultClass, String role, String resultRole) throws WbemsmtException {

        return getAssociated_CIM_OperatingSystem_CIM_RunningOSs(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_RUNNINGOS, resultClass, role, resultRole, false,
                false, null);

    }

    /**
     * Get the list with CIM_OperatingSystem objects associated by the association CIM_RunningOS
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_RUNNINGOS or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_OperatingSystem_CIM_RunningOSs(WBEMClient cimClient,
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
                CIM_ComputerSystemHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_ComputerSystemHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_ComputerSystemHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_OperatingSystem(cimInstance));
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
                        result.add(new CIM_OperatingSystem(cimInstance));
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
                        result.add(new CIM_OperatingSystem(cimInstance));
                        continue;
                    }
                }
            }
            CIM_ComputerSystemHelper.checkException(enumeration);
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
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_RunningOS
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_RUNNINGOS as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_OperatingSystem_CIM_RunningOSNames(WBEMClient cimClient)
            throws WbemsmtException {

        return getAssociated_CIM_OperatingSystem_CIM_RunningOSNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_RUNNINGOS, CIM_OperatingSystem.CIM_CLASS_NAME, null,
                null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_RunningOS
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_RUNNINGOS or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_RUNNINGOS as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_OperatingSystem_CIM_RunningOSNames(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_OperatingSystem_CIM_RunningOSNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_RUNNINGOS, resultClass, role, resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_RunningOS
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_OperatingSystem_CIM_RunningOSNames(
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
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_RUNNINGOS,
                    CIM_OperatingSystem.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_ComputerSystemHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_ComputerSystemHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_OperatingSystem.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_ComputerSystemHelper.checkException(enumeration);
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
     * Get the list with CIM_RunningOS associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_RunningOS(WBEMClient cimClient,
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_RUNNINGOS, role, includeQualifiers,
                    includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_RUNNINGOS, role, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_ComputerSystemHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_ComputerSystemHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_RunningOSHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_RunningOS(cimInstance));
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
                        result.add(new CIM_RunningOS(cimInstance));
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
                        result.add(new CIM_RunningOS(cimInstance));
                        continue;
                    }
                }
            }
            CIM_ComputerSystemHelper.checkException(enumeration);
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
     * Get a list of CIMObjectPath items of the associations CIM_RunningOS
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_RunningOS(WBEMClient cimClient, String role,
            boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_RUNNINGOS, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_RUNNINGOS, role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_ComputerSystemHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_ComputerSystemHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_RunningOS.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_ComputerSystemHelper.checkException(enumeration);
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

    /**
     * Invokes the Method SetPowerState
     * <br>
     * @param client the cimclient
     * Sets the power state of the computer. The use of this method has been deprecated. Instead, use the SetPowerState method in the associated PowerManagementService class.
     *   @param PowerState The Desired state for the COmputerSystem.
     *   @param Time Time indicates when the power state should be set, either as a regular date-time value or as an interval value (where the interval begins when the method invocation is received.
     *
     */

    public SetPowerStateResult invoke_SetPowerState(WBEMClient cimClient,
            javax.cim.UnsignedInteger32 PowerState, javax.cim.CIMDateTime Time)
            throws WbemsmtException {

        CIMArgument[] inParameter = new CIMArgument[2];
        CIMArgument[] outParameter = new CIMArgument[0];

        inParameter[0] = new CIMArgument("PowerState", CIMDataType.UINT32_T, PowerState);
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
        return CIM_ComputerSystem.CIM_CLASS_NAME;
    }

}