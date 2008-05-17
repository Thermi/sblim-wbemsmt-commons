/** 
 * CIM_Watchdog.java
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
 * Description: CIM_Watchdog is a timer implemented in system hardware. It allows the hardware to monitor the state of the Operating System, BIOS or a software component installed on the System. If the monitored component fails to re-arm the timer before its expiration, the hardware assumes that the System is in a critical state, and could reset the ComputerSystem. This feature can also be used as an application watchdog timer for a mission-critical application. In this case, the application would assume responsibility for re-arming the timer before expiration.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;
import org.sblim.wbemsmt.exception.impl.*;
import org.sblim.wbemsmt.exception.impl.userobject.*;

import javax.wbem.*;

public class CIM_Watchdog extends CIM_LogicalDevice {

    public final static String CIM_CLASS_NAME = "CIM_Watchdog";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constant for method\'s name and parameters
     * A method to re-arm the timer. This method is only used if the MonitoredEntity is "Application". It returns 0 if successful, 1 if unsupported, and any other value if an error occurred. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
     */

    public static class METHOD_KEEPALIVE {
        /**
         * Constant for method KeepAlive
         */
        public final static String NAME = "KeepAlive";

    }

    /**
     * Constants of property ActionOnExpiration
     * The action that should happen upon the expiry of the watchdog.
     */
    public static class PROPERTY_ACTIONONEXPIRATION {
        /**
         * name of the property ActionOnExpiration
         */
        public final static String NAME = "ActionOnExpiration";

        /**
         * constant for value map entry 0
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_None___Status_Only = new javax.cim.UnsignedInteger16(
                "0");

        /**
         * constant for value entry None - Status Only (corresponds to mapEntry 0 )
         */
        public final static String VALUE_ENTRY_None___Status_Only = "None - Status Only";

        /**
         * constant for value map entry 1
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_System_Reset = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry System Reset (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_System_Reset = "System Reset";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_System_Power_Off = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry System Power Off (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_System_Power_Off = "System Power Off";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_System_Power_Off = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_then_On = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry then On (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_then_On = "then On";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Generate_System_NonMaskableInterrupt__NMI_ = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry Generate System NonMaskableInterrupt (NMI) (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Generate_System_NonMaskableInterrupt__NMI_ = "Generate System NonMaskableInterrupt (NMI)";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@6a486a48
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_None___Status_Only.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_None___Status_Only;
            }

            if (VALUE_ENTRY_System_Reset.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_System_Reset;
            }

            if (VALUE_ENTRY_System_Power_Off.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_System_Power_Off;
            }

            if (VALUE_ENTRY_System_Power_Off.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_System_Power_Off;
            }

            if (VALUE_ENTRY_then_On.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_then_On;
            }

            if (VALUE_ENTRY_Generate_System_NonMaskableInterrupt__NMI_.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Generate_System_NonMaskableInterrupt__NMI_;
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

            if (iValue == VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_None___Status_Only.intValue()) {
                return VALUE_ENTRY_None___Status_Only;
            }

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_System_Reset.intValue()) {
                return VALUE_ENTRY_System_Reset;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_System_Power_Off.intValue()) {
                return VALUE_ENTRY_System_Power_Off;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_System_Power_Off.intValue()) {
                return VALUE_ENTRY_System_Power_Off;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_then_On.intValue()) {
                return VALUE_ENTRY_then_On;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Generate_System_NonMaskableInterrupt__NMI_
                    .intValue()) {
                return VALUE_ENTRY_Generate_System_NonMaskableInterrupt__NMI_;
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
         * Value Map for the property ActionOnExpiration   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_None___Status_Only,
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_System_Reset,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_System_Power_Off,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_System_Power_Off,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_then_On,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Generate_System_NonMaskableInterrupt__NMI_ };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property ActionOnExpiration   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_None___Status_Only,
                VALUE_ENTRY_System_Reset, VALUE_ENTRY_System_Power_Off, VALUE_ENTRY_then_On,
                VALUE_ENTRY_Generate_System_NonMaskableInterrupt__NMI_ };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property ActionOnExpiration   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_None___Status_Only,
                VALUE_ENTRY_System_Reset, VALUE_ENTRY_System_Power_Off, VALUE_ENTRY_then_On,
                VALUE_ENTRY_Generate_System_NonMaskableInterrupt__NMI_ };

    }

    /**
     * Constants of property MonitoredEntity
     * The entity that is currently being monitored by the WatchDog. This property is used to identify the module that is responsible for or whose information is used to re-arm the watchdog at periodic intervals.
     */
    public static class PROPERTY_MONITOREDENTITY {
        /**
         * name of the property MonitoredEntity
         */
        public final static String NAME = "MonitoredEntity";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Operating_System = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Operating System (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Operating_System = "Operating System";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Operating_System_Boot_Process = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Operating System Boot Process (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Operating_System_Boot_Process = "Operating System Boot Process";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Operating_System_Shutdown_Process = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Operating System Shutdown Process (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Operating_System_Shutdown_Process = "Operating System Shutdown Process";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Firmware_Boot_Process = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry Firmware Boot Process (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Firmware_Boot_Process = "Firmware Boot Process";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_BIOS_Boot_Process = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry BIOS Boot Process (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_BIOS_Boot_Process = "BIOS Boot Process";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Application = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry Application (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_Application = "Application";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Service_Processor = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry Service Processor (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_Service_Processor = "Service Processor";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@289a289a
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Operating_System.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Operating_System;
            }

            if (VALUE_ENTRY_Operating_System_Boot_Process.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Operating_System_Boot_Process;
            }

            if (VALUE_ENTRY_Operating_System_Shutdown_Process.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Operating_System_Shutdown_Process;
            }

            if (VALUE_ENTRY_Firmware_Boot_Process.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Firmware_Boot_Process;
            }

            if (VALUE_ENTRY_BIOS_Boot_Process.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_BIOS_Boot_Process;
            }

            if (VALUE_ENTRY_Application.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Application;
            }

            if (VALUE_ENTRY_Service_Processor.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Service_Processor;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Operating_System.intValue()) {
                return VALUE_ENTRY_Operating_System;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Operating_System_Boot_Process
                    .intValue()) {
                return VALUE_ENTRY_Operating_System_Boot_Process;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Operating_System_Shutdown_Process
                    .intValue()) {
                return VALUE_ENTRY_Operating_System_Shutdown_Process;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Firmware_Boot_Process.intValue()) {
                return VALUE_ENTRY_Firmware_Boot_Process;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_BIOS_Boot_Process.intValue()) {
                return VALUE_ENTRY_BIOS_Boot_Process;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Application.intValue()) {
                return VALUE_ENTRY_Application;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Service_Processor.intValue()) {
                return VALUE_ENTRY_Service_Processor;
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
         * Value Map for the property MonitoredEntity   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Operating_System,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Operating_System_Boot_Process,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Operating_System_Shutdown_Process,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Firmware_Boot_Process,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_BIOS_Boot_Process,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Application,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Service_Processor };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property MonitoredEntity   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_Operating_System, VALUE_ENTRY_Operating_System_Boot_Process,
                VALUE_ENTRY_Operating_System_Shutdown_Process, VALUE_ENTRY_Firmware_Boot_Process,
                VALUE_ENTRY_BIOS_Boot_Process, VALUE_ENTRY_Application,
                VALUE_ENTRY_Service_Processor };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property MonitoredEntity   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_Operating_System,
                VALUE_ENTRY_Operating_System_Boot_Process,
                VALUE_ENTRY_Operating_System_Shutdown_Process, VALUE_ENTRY_Firmware_Boot_Process,
                VALUE_ENTRY_BIOS_Boot_Process, VALUE_ENTRY_Application,
                VALUE_ENTRY_Service_Processor };

    }

    /**
     * Constants of property MonitoredEntityDescription
     * A string describing more textual information about the monitored entity.
     */
    public static class PROPERTY_MONITOREDENTITYDESCRIPTION {
        /**
         * name of the property MonitoredEntityDescription
         */
        public final static String NAME = "MonitoredEntityDescription";

    }

    /**
     * Constants of property MonitoredEntityOnLastExpiration
     * Monitored entity at the time of last timer expiry.
     */
    public static class PROPERTY_MONITOREDENTITYONLASTEXPIRATION {
        /**
         * name of the property MonitoredEntityOnLastExpiration
         */
        public final static String NAME = "MonitoredEntityOnLastExpiration";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Operating_System = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Operating System (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Operating_System = "Operating System";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Operating_System_Boot_Process = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Operating System Boot Process (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Operating_System_Boot_Process = "Operating System Boot Process";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Operating_System_Shutdown_Process = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Operating System Shutdown Process (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Operating_System_Shutdown_Process = "Operating System Shutdown Process";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Firmware_Boot_Process = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry Firmware Boot Process (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Firmware_Boot_Process = "Firmware Boot Process";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_BIOS_Boot_Process = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry BIOS Boot Process (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_BIOS_Boot_Process = "BIOS Boot Process";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Application = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry Application (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_Application = "Application";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Service_Processor = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry Service Processor (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_Service_Processor = "Service Processor";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@3e2e3e2e
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Operating_System.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Operating_System;
            }

            if (VALUE_ENTRY_Operating_System_Boot_Process.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Operating_System_Boot_Process;
            }

            if (VALUE_ENTRY_Operating_System_Shutdown_Process.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Operating_System_Shutdown_Process;
            }

            if (VALUE_ENTRY_Firmware_Boot_Process.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Firmware_Boot_Process;
            }

            if (VALUE_ENTRY_BIOS_Boot_Process.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_BIOS_Boot_Process;
            }

            if (VALUE_ENTRY_Application.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Application;
            }

            if (VALUE_ENTRY_Service_Processor.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Service_Processor;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Operating_System.intValue()) {
                return VALUE_ENTRY_Operating_System;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Operating_System_Boot_Process
                    .intValue()) {
                return VALUE_ENTRY_Operating_System_Boot_Process;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Operating_System_Shutdown_Process
                    .intValue()) {
                return VALUE_ENTRY_Operating_System_Shutdown_Process;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Firmware_Boot_Process.intValue()) {
                return VALUE_ENTRY_Firmware_Boot_Process;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_BIOS_Boot_Process.intValue()) {
                return VALUE_ENTRY_BIOS_Boot_Process;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Application.intValue()) {
                return VALUE_ENTRY_Application;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Service_Processor.intValue()) {
                return VALUE_ENTRY_Service_Processor;
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
         * Value Map for the property MonitoredEntityOnLastExpiration   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Operating_System,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Operating_System_Boot_Process,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Operating_System_Shutdown_Process,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Firmware_Boot_Process,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_BIOS_Boot_Process,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Application,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Service_Processor };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property MonitoredEntityOnLastExpiration   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_Operating_System, VALUE_ENTRY_Operating_System_Boot_Process,
                VALUE_ENTRY_Operating_System_Shutdown_Process, VALUE_ENTRY_Firmware_Boot_Process,
                VALUE_ENTRY_BIOS_Boot_Process, VALUE_ENTRY_Application,
                VALUE_ENTRY_Service_Processor };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property MonitoredEntityOnLastExpiration   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_Operating_System,
                VALUE_ENTRY_Operating_System_Boot_Process,
                VALUE_ENTRY_Operating_System_Shutdown_Process, VALUE_ENTRY_Firmware_Boot_Process,
                VALUE_ENTRY_BIOS_Boot_Process, VALUE_ENTRY_Application,
                VALUE_ENTRY_Service_Processor };

    }

    /**
     * Constants of property TimeOfLastExpiration
     * The time of the last timer expiry.
     */
    public static class PROPERTY_TIMEOFLASTEXPIRATION {
        /**
         * name of the property TimeOfLastExpiration
         */
        public final static String NAME = "TimeOfLastExpiration";

    }

    /**
     * Constants of property TimeoutInterval
     * The timeout interval used by the watchdog, in MicroSeconds.
     */
    public static class PROPERTY_TIMEOUTINTERVAL {
        /**
         * name of the property TimeoutInterval
         */
        public final static String NAME = "TimeoutInterval";

    }

    /**
     * Constants of property TimerResolution
     * Resolution of the timer. For example, if this value is 100, then the timer can expire anytime between (TimeoutInterval- 100) microseconds or (TimeoutInterval+100) microseconds.
     */
    public static class PROPERTY_TIMERRESOLUTION {
        /**
         * name of the property TimerResolution
         */
        public final static String NAME = "TimerResolution";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_LogicalDevice.getPackages();

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
     *   CIM_Watchdog is a timer implemented in system hardware. It allows the hardware to monitor the state of the Operating System, BIOS or a software component installed on the System. If the monitored component fails to re-arm the timer before its expiration, the hardware assumes that the System is in a critical state, and could reset the ComputerSystem. This feature can also be used as an application watchdog timer for a mission-critical application. In this case, the application would assume responsibility for re-arming the timer before expiration.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_Watchdog(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   CIM_Watchdog is a timer implemented in system hardware. It allows the hardware to monitor the state of the Operating System, BIOS or a software component installed on the System. If the monitored component fails to re-arm the timer before its expiration, the hardware assumes that the System is in a critical state, and could reset the ComputerSystem. This feature can also be used as an application watchdog timer for a mission-critical application. In this case, the application would assume responsibility for re-arming the timer before expiration.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_Watchdog(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_Watchdog() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("ActionOnExpiration", new CIMProperty("ActionOnExpiration",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("MonitoredEntity", new CIMProperty("MonitoredEntity",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("MonitoredEntityDescription", new CIMProperty(
                "MonitoredEntityDescription", CIMDataType.STRING_T, null));
        propertiesToCheck.put("MonitoredEntityOnLastExpiration", new CIMProperty(
                "MonitoredEntityOnLastExpiration", CIMDataType.UINT16_T, null));
        propertiesToCheck.put("TimeOfLastExpiration", new CIMProperty("TimeOfLastExpiration",
                CIMDataType.DATETIME_T, null));
        propertiesToCheck.put("TimeoutInterval", new CIMProperty("TimeoutInterval",
                CIMDataType.UINT32_T, null));
        propertiesToCheck.put("TimerResolution", new CIMProperty("TimerResolution",
                CIMDataType.UINT32_T, null));

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
     * Get the property ActionOnExpiration
     *     * <br>
     * The action that should happen upon the expiry of the watchdog.
     *     */

    public javax.cim.UnsignedInteger16 get_ActionOnExpiration() {
        CIMProperty currentProperty = getProperty(PROPERTY_ACTIONONEXPIRATION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ACTIONONEXPIRATION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property ActionOnExpiration
     * <br>
     * The action that should happen upon the expiry of the watchdog.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ActionOnExpiration(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ACTIONONEXPIRATION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ActionOnExpiration(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ACTIONONEXPIRATION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ActionOnExpiration by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ActionOnExpiration(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_Watchdog fco = new CIM_Watchdog(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ACTIONONEXPIRATION.NAME);
        if (property != null) {
            property = setPropertyValue_ActionOnExpiration(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ACTIONONEXPIRATION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ActionOnExpiration
     * <br>
     * The action that should happen upon the expiry of the watchdog.
     */

    private static CIMProperty setPropertyValue_ActionOnExpiration(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property MonitoredEntity
     *     * <br>
     * The entity that is currently being monitored by the WatchDog. This property is used to identify the module that is responsible for or whose information is used to re-arm the watchdog at periodic intervals.
     *     */

    public javax.cim.UnsignedInteger16 get_MonitoredEntity() {
        CIMProperty currentProperty = getProperty(PROPERTY_MONITOREDENTITY.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_MONITOREDENTITY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property MonitoredEntity
     * <br>
     * The entity that is currently being monitored by the WatchDog. This property is used to identify the module that is responsible for or whose information is used to re-arm the watchdog at periodic intervals.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_MonitoredEntity(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_MONITOREDENTITY.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_MonitoredEntity(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_MONITOREDENTITY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property MonitoredEntity by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_MonitoredEntity(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_Watchdog fco = new CIM_Watchdog(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MONITOREDENTITY.NAME);
        if (property != null) {
            property = setPropertyValue_MonitoredEntity(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_MONITOREDENTITY.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property MonitoredEntity
     * <br>
     * The entity that is currently being monitored by the WatchDog. This property is used to identify the module that is responsible for or whose information is used to re-arm the watchdog at periodic intervals.
     */

    private static CIMProperty setPropertyValue_MonitoredEntity(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property MonitoredEntityDescription
     *     * <br>
     * A string describing more textual information about the monitored entity.
     *     */

    public String get_MonitoredEntityDescription() {
        CIMProperty currentProperty = getProperty(PROPERTY_MONITOREDENTITYDESCRIPTION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_MONITOREDENTITYDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property MonitoredEntityDescription
     * <br>
     * A string describing more textual information about the monitored entity.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_MonitoredEntityDescription(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_MONITOREDENTITYDESCRIPTION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_MonitoredEntityDescription(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_MONITOREDENTITYDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property MonitoredEntityDescription by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_MonitoredEntityDescription(WBEMClient client,
            String namespace, String newValue) throws WbemsmtException {
        CIM_Watchdog fco = new CIM_Watchdog(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MONITOREDENTITYDESCRIPTION.NAME);
        if (property != null) {
            property = setPropertyValue_MonitoredEntityDescription(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_MONITOREDENTITYDESCRIPTION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property MonitoredEntityDescription
     * <br>
     * A string describing more textual information about the monitored entity.
     */

    private static CIMProperty setPropertyValue_MonitoredEntityDescription(
            CIMProperty currentProperty, String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property MonitoredEntityOnLastExpiration
     *     * <br>
     * Monitored entity at the time of last timer expiry.
     *     */

    public javax.cim.UnsignedInteger16 get_MonitoredEntityOnLastExpiration() {
        CIMProperty currentProperty = getProperty(PROPERTY_MONITOREDENTITYONLASTEXPIRATION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_MONITOREDENTITYONLASTEXPIRATION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property MonitoredEntityOnLastExpiration
     * <br>
     * Monitored entity at the time of last timer expiry.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_MonitoredEntityOnLastExpiration(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_MONITOREDENTITYONLASTEXPIRATION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_MonitoredEntityOnLastExpiration(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_MONITOREDENTITYONLASTEXPIRATION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property MonitoredEntityOnLastExpiration by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_MonitoredEntityOnLastExpiration(WBEMClient client,
            String namespace, javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_Watchdog fco = new CIM_Watchdog(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MONITOREDENTITYONLASTEXPIRATION.NAME);
        if (property != null) {
            property = setPropertyValue_MonitoredEntityOnLastExpiration(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_MONITOREDENTITYONLASTEXPIRATION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property MonitoredEntityOnLastExpiration
     * <br>
     * Monitored entity at the time of last timer expiry.
     */

    private static CIMProperty setPropertyValue_MonitoredEntityOnLastExpiration(
            CIMProperty currentProperty, javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property TimeOfLastExpiration
     *     * <br>
     * The time of the last timer expiry.
     *     */

    public javax.cim.CIMDateTime get_TimeOfLastExpiration() {
        CIMProperty currentProperty = getProperty(PROPERTY_TIMEOFLASTEXPIRATION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_TIMEOFLASTEXPIRATION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.CIMDateTime) currentProperty.getValue();

    }

    /**
     * Set the property TimeOfLastExpiration
     * <br>
     * The time of the last timer expiry.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_TimeOfLastExpiration(javax.cim.CIMDateTime newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_TIMEOFLASTEXPIRATION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_TimeOfLastExpiration(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_TIMEOFLASTEXPIRATION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property TimeOfLastExpiration by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_TimeOfLastExpiration(WBEMClient client, String namespace,
            javax.cim.CIMDateTime newValue) throws WbemsmtException {
        CIM_Watchdog fco = new CIM_Watchdog(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_TIMEOFLASTEXPIRATION.NAME);
        if (property != null) {
            property = setPropertyValue_TimeOfLastExpiration(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_TIMEOFLASTEXPIRATION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property TimeOfLastExpiration
     * <br>
     * The time of the last timer expiry.
     */

    private static CIMProperty setPropertyValue_TimeOfLastExpiration(CIMProperty currentProperty,
            javax.cim.CIMDateTime newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property TimeoutInterval
     *     * <br>
     * The timeout interval used by the watchdog, in MicroSeconds.
     *     */

    public javax.cim.UnsignedInteger32 get_TimeoutInterval() {
        CIMProperty currentProperty = getProperty(PROPERTY_TIMEOUTINTERVAL.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_TIMEOUTINTERVAL.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property TimeoutInterval
     * <br>
     * The timeout interval used by the watchdog, in MicroSeconds.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_TimeoutInterval(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_TIMEOUTINTERVAL.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_TimeoutInterval(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_TIMEOUTINTERVAL.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property TimeoutInterval by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_TimeoutInterval(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_Watchdog fco = new CIM_Watchdog(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_TIMEOUTINTERVAL.NAME);
        if (property != null) {
            property = setPropertyValue_TimeoutInterval(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_TIMEOUTINTERVAL.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property TimeoutInterval
     * <br>
     * The timeout interval used by the watchdog, in MicroSeconds.
     */

    private static CIMProperty setPropertyValue_TimeoutInterval(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property TimerResolution
     *     * <br>
     * Resolution of the timer. For example, if this value is 100, then the timer can expire anytime between (TimeoutInterval- 100) microseconds or (TimeoutInterval+100) microseconds.
     *     */

    public javax.cim.UnsignedInteger32 get_TimerResolution() {
        CIMProperty currentProperty = getProperty(PROPERTY_TIMERRESOLUTION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_TIMERRESOLUTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property TimerResolution
     * <br>
     * Resolution of the timer. For example, if this value is 100, then the timer can expire anytime between (TimeoutInterval- 100) microseconds or (TimeoutInterval+100) microseconds.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_TimerResolution(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_TIMERRESOLUTION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_TimerResolution(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_TIMERRESOLUTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property TimerResolution by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_TimerResolution(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_Watchdog fco = new CIM_Watchdog(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_TIMERRESOLUTION.NAME);
        if (property != null) {
            property = setPropertyValue_TimerResolution(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_TIMERRESOLUTION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property TimerResolution
     * <br>
     * Resolution of the timer. For example, if this value is 100, then the timer can expire anytime between (TimeoutInterval- 100) microseconds or (TimeoutInterval+100) microseconds.
     */

    private static CIMProperty setPropertyValue_TimerResolution(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
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
     * Invokes the Method KeepAlive
     * <br>
     * @param client the cimclient
     * A method to re-arm the timer. This method is only used if the MonitoredEntity is "Application". It returns 0 if successful, 1 if unsupported, and any other value if an error occurred. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
     *
     */

    public KeepAliveResult invoke_KeepAlive(WBEMClient cimClient) throws WbemsmtException {

        CIMArgument[] inParameter = new CIMArgument[0];
        CIMArgument[] outParameter = new CIMArgument[0];

        javax.cim.UnsignedInteger32 resultObject = null;

        try {
            Object oResult = cimClient.invokeMethod(this.getCimObjectPath(), METHOD_KEEPALIVE.NAME,
                    inParameter, outParameter);
            if (oResult != null) {

                resultObject = (javax.cim.UnsignedInteger32) oResult;
            }
        }
        catch (WBEMException e) {
            throw new InvokeMethodException(e, new InvokeMethodUserObject(this.getCimObjectPath(),
                    METHOD_KEEPALIVE.NAME, inParameter, outParameter));
        }

        KeepAliveResult result = new KeepAliveResult();
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
     * Result object for the method KeepAlive
     */
    public static class KeepAliveResult {
        /**
         * The return value of the method
         */

        javax.cim.UnsignedInteger32 resultObject = null;

        /**
         * Default constructor
         */
        KeepAliveResult() {
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
        return CIM_Watchdog.CIM_CLASS_NAME;
    }

}