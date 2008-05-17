/** 
 * CIM_UnitaryComputerSystem.java
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
 * Description: A class derived from ComputerSystem that represents a Desktop, Mobile, NetPC, Server or other type of a single node Computer System.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;
import org.sblim.wbemsmt.exception.impl.*;
import org.sblim.wbemsmt.exception.impl.userobject.*;

import java.lang.reflect.*;
import javax.wbem.*;

public class CIM_UnitaryComputerSystem extends CIM_ComputerSystem {

    public final static String CIM_CLASS_NAME = "CIM_UnitaryComputerSystem";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * The use of this association has be deprecated in lieu of SystemDevice. Association indicating that memory is installed and required for the UnitaryComputerSystem to operate. Note that this relationship inherits from the SystemDevice association, and therefore, the Memory StorageExtent is weak to the aggregating UnitaryComputerSystem.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMMEMORY = "CIM_ComputerSystemMemory";

    /**
     * Association indicating the processor(s) of a UnitaryComputer System. ComputerSystemProcessor is depreacted in lieu of its superclass, SystemDevice, since it adds no detail and changes none of the cardinalities in the superclass' definition.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMPROCESSOR = "CIM_ComputerSystemProcessor";

    /**
     * A Partition is an instance of a UnitaryComputerSystem (with its own OperatingSystem and Devices dedicated to the Partition) that is supported by underlying hardware and software. A Partition is not a virtualization of a Computer System, but the segmentation of the System's compute capabilities. Partitions can run independent copies of possibly different OperatingSystems and have dedicated Devices. The 'real', underlying System (perhaps a Cluster or another UnitaryComputerSystem) aggregates its Partitions. These semantics are described by the System Partition association.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMPARTITION = "CIM_SystemPartition";

    /**
     * Constants of property InitialLoadInfo
     * This object contains the data needed to find either the initial load device (its key) or the boot service to request the operating system to start up. In addition, the load parameters (ie, a pathname and parameters) may also be specified.
     */
    public static class PROPERTY_INITIALLOADINFO {
        /**
         * name of the property InitialLoadInfo
         */
        public final static String NAME = "InitialLoadInfo";

    }

    /**
     * Constants of property LastLoadInfo
     * This object contains the data identifying either the initial load device (its key) or the boot service that requested the last operating system load. In addition, the load parameters (ie, a pathname and parameters) may also be specified.
     */
    public static class PROPERTY_LASTLOADINFO {
        /**
         * name of the property LastLoadInfo
         */
        public final static String NAME = "LastLoadInfo";

    }

    /**
     * Constants of property PowerManagementSupported
     * When TRUE, indicates that the computer can be power managed. The use of this property has been deprecated. Instead, the existence of an associated PowerManagementCapabilities class (associated using the ElementCapabilites relationship) indicates that power management is supported.
     */
    public static class PROPERTY_POWERMANAGEMENTSUPPORTED {
        /**
         * name of the property PowerManagementSupported
         */
        public final static String NAME = "PowerManagementSupported";

    }

    /**
     * Constants of property PowerState
     * Indicates the current power state of the ComputerSystem and its associated OperatingSystem. Regarding the Power Save states, these are defined as follows: Value 4 ("Power Save - Unknown") indicates that the System is known to be in a power save mode, but its exact status in this mode is unknown; 
     * Value 2 ("Power Save - Low Power Mode") indicates that the System is in a power save state but still functioning, and may exhibit degraded performance; 
     * Value 3 ("Power Save - Standby") describes that the System is not functioning but could be brought to full power 'quickly'; value 7 ("Power Save - Warning") indicates that the ComputerSystem is in a warning state, though also in a power save mode. 
     * Values 8 and 9 describe the ACPI "Hibernate" and "Soft Off" states.
     */
    public static class PROPERTY_POWERSTATE {
        /**
         * name of the property PowerState
         */
        public final static String NAME = "PowerState";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Power_Save___Unknown = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Power Save - Unknown (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Power_Save___Unknown = "Power Save - Unknown";

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
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Power_Save___Warning = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry Power Save - Warning (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_Power_Save___Warning = "Power Save - Warning";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Power_Save___Hibernate = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry Power Save - Hibernate (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_Power_Save___Hibernate = "Power Save - Hibernate";

        /**
         * constant for value map entry 9
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Power_Save___Soft_Off = new javax.cim.UnsignedInteger16(
                "9");

        /**
         * constant for value entry Power Save - Soft Off (corresponds to mapEntry 9 )
         */
        public final static String VALUE_ENTRY_Power_Save___Soft_Off = "Power Save - Soft Off";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@405e405e
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Full_Power.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Full_Power;
            }

            if (VALUE_ENTRY_Power_Save___Low_Power_Mode.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Power_Save___Low_Power_Mode;
            }

            if (VALUE_ENTRY_Power_Save___Standby.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Power_Save___Standby;
            }

            if (VALUE_ENTRY_Power_Save___Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Power_Save___Unknown;
            }

            if (VALUE_ENTRY_Power_Cycle.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Power_Cycle;
            }

            if (VALUE_ENTRY_Power_Off.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Power_Off;
            }

            if (VALUE_ENTRY_Power_Save___Warning.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Power_Save___Warning;
            }

            if (VALUE_ENTRY_Power_Save___Hibernate.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Power_Save___Hibernate;
            }

            if (VALUE_ENTRY_Power_Save___Soft_Off.equals(value)) {
                return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Power_Save___Soft_Off;
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

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Full_Power.intValue()) {
                return VALUE_ENTRY_Full_Power;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Power_Save___Low_Power_Mode.intValue()) {
                return VALUE_ENTRY_Power_Save___Low_Power_Mode;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Power_Save___Standby.intValue()) {
                return VALUE_ENTRY_Power_Save___Standby;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Power_Save___Unknown.intValue()) {
                return VALUE_ENTRY_Power_Save___Unknown;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Power_Cycle.intValue()) {
                return VALUE_ENTRY_Power_Cycle;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Power_Off.intValue()) {
                return VALUE_ENTRY_Power_Off;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Power_Save___Warning.intValue()) {
                return VALUE_ENTRY_Power_Save___Warning;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Power_Save___Hibernate.intValue()) {
                return VALUE_ENTRY_Power_Save___Hibernate;
            }

            if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Power_Save___Soft_Off.intValue()) {
                return VALUE_ENTRY_Power_Save___Soft_Off;
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
         * Value Map for the property PowerState   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Full_Power,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Power_Save___Low_Power_Mode,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Power_Save___Standby,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Power_Save___Unknown,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Power_Cycle,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Power_Off,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Power_Save___Warning,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Power_Save___Hibernate,
                VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Power_Save___Soft_Off };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property PowerState   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Full_Power,
                VALUE_ENTRY_Power_Save___Low_Power_Mode, VALUE_ENTRY_Power_Save___Standby,
                VALUE_ENTRY_Power_Save___Unknown, VALUE_ENTRY_Power_Cycle, VALUE_ENTRY_Power_Off,
                VALUE_ENTRY_Power_Save___Warning, VALUE_ENTRY_Power_Save___Hibernate,
                VALUE_ENTRY_Power_Save___Soft_Off };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property PowerState   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Full_Power, VALUE_ENTRY_Power_Save___Low_Power_Mode,
                VALUE_ENTRY_Power_Save___Standby, VALUE_ENTRY_Power_Save___Unknown,
                VALUE_ENTRY_Power_Cycle, VALUE_ENTRY_Power_Off, VALUE_ENTRY_Power_Save___Warning,
                VALUE_ENTRY_Power_Save___Hibernate, VALUE_ENTRY_Power_Save___Soft_Off };

    }

    /**
     * Constants of property WakeUpType
     * The event that caused the System to power up. This information is available in SMBIOS, in the Type 1 structure, the Wake Up Type attribute.
     */
    public static class PROPERTY_WAKEUPTYPE {
        /**
         * name of the property WakeUpType
         */
        public final static String NAME = "WakeUpType";

        /**
         * constant for value map entry 0
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Reserved = new javax.cim.UnsignedInteger16(
                "0");

        /**
         * constant for value entry Reserved (corresponds to mapEntry 0 )
         */
        public final static String VALUE_ENTRY_Reserved = "Reserved";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_APM_Timer = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry APM Timer (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_APM_Timer = "APM Timer";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Modem_Ring = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Modem Ring (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Modem_Ring = "Modem Ring";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_LAN_Remote = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry LAN Remote (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_LAN_Remote = "LAN Remote";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Power_Switch = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry Power Switch (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Power_Switch = "Power Switch";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_PCI_PME_ = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry PCI PME# (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_PCI_PME_ = "PCI PME#";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_A_C_Power_Restored = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry A/C Power Restored (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_A_C_Power_Restored = "A/C Power Restored";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@30443044
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Reserved.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Reserved;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_APM_Timer.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_APM_Timer;
            }

            if (VALUE_ENTRY_Modem_Ring.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Modem_Ring;
            }

            if (VALUE_ENTRY_LAN_Remote.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_LAN_Remote;
            }

            if (VALUE_ENTRY_Power_Switch.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Power_Switch;
            }

            if (VALUE_ENTRY_PCI_PME_.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_PCI_PME_;
            }

            if (VALUE_ENTRY_A_C_Power_Restored.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_A_C_Power_Restored;
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

            if (iValue == VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Reserved.intValue()) {
                return VALUE_ENTRY_Reserved;
            }

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other.intValue()) {
                return VALUE_ENTRY_Other;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown.intValue()) {
                return VALUE_ENTRY_Unknown;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_APM_Timer.intValue()) {
                return VALUE_ENTRY_APM_Timer;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Modem_Ring.intValue()) {
                return VALUE_ENTRY_Modem_Ring;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_LAN_Remote.intValue()) {
                return VALUE_ENTRY_LAN_Remote;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Power_Switch.intValue()) {
                return VALUE_ENTRY_Power_Switch;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_PCI_PME_.intValue()) {
                return VALUE_ENTRY_PCI_PME_;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_A_C_Power_Restored.intValue()) {
                return VALUE_ENTRY_A_C_Power_Restored;
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
         * Value Map for the property WakeUpType   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Reserved,
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other, VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_APM_Timer,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Modem_Ring,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_LAN_Remote,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Power_Switch,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_PCI_PME_,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_A_C_Power_Restored };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property WakeUpType   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Reserved, VALUE_ENTRY_Other,
                VALUE_ENTRY_Unknown, VALUE_ENTRY_APM_Timer, VALUE_ENTRY_Modem_Ring,
                VALUE_ENTRY_LAN_Remote, VALUE_ENTRY_Power_Switch, VALUE_ENTRY_PCI_PME_,
                VALUE_ENTRY_A_C_Power_Restored };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property WakeUpType   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Reserved,
                VALUE_ENTRY_Other, VALUE_ENTRY_Unknown, VALUE_ENTRY_APM_Timer,
                VALUE_ENTRY_Modem_Ring, VALUE_ENTRY_LAN_Remote, VALUE_ENTRY_Power_Switch,
                VALUE_ENTRY_PCI_PME_, VALUE_ENTRY_A_C_Power_Restored };

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_ComputerSystem.getPackages();

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
     *   A class derived from ComputerSystem that represents a Desktop, Mobile, NetPC, Server or other type of a single node Computer System.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_UnitaryComputerSystem(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   A class derived from ComputerSystem that represents a Desktop, Mobile, NetPC, Server or other type of a single node Computer System.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_UnitaryComputerSystem(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_UnitaryComputerSystem() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("InitialLoadInfo", new CIMProperty("InitialLoadInfo",
                CIMDataType.STRING_ARRAY_T, null));
        propertiesToCheck.put("LastLoadInfo", new CIMProperty("LastLoadInfo", CIMDataType.STRING_T,
                null));
        propertiesToCheck.put("PowerManagementSupported", new CIMProperty(
                "PowerManagementSupported", CIMDataType.BOOLEAN_T, null));
        propertiesToCheck.put("PowerState", new CIMProperty("PowerState", CIMDataType.UINT16_T,
                null));
        propertiesToCheck.put("WakeUpType", new CIMProperty("WakeUpType", CIMDataType.UINT16_T,
                null));

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
     * Get the property InitialLoadInfo
     *     * <br>
     * This object contains the data needed to find either the initial load device (its key) or the boot service to request the operating system to start up. In addition, the load parameters (ie, a pathname and parameters) may also be specified.
     *     */

    public String[] get_InitialLoadInfo() {
        CIMProperty currentProperty = getProperty(PROPERTY_INITIALLOADINFO.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_INITIALLOADINFO.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String[]) currentProperty.getValue();

    }

    /**
     * Set the property InitialLoadInfo
     * <br>
     * This object contains the data needed to find either the initial load device (its key) or the boot service to request the operating system to start up. In addition, the load parameters (ie, a pathname and parameters) may also be specified.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_InitialLoadInfo(String[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_INITIALLOADINFO.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_InitialLoadInfo(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_INITIALLOADINFO.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property InitialLoadInfo by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_InitialLoadInfo(WBEMClient client, String namespace,
            String[] newValue) throws WbemsmtException {
        CIM_UnitaryComputerSystem fco = new CIM_UnitaryComputerSystem(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_INITIALLOADINFO.NAME);
        if (property != null) {
            property = setPropertyValue_InitialLoadInfo(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_INITIALLOADINFO.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property InitialLoadInfo
     * <br>
     * This object contains the data needed to find either the initial load device (its key) or the boot service to request the operating system to start up. In addition, the load parameters (ie, a pathname and parameters) may also be specified.
     */

    private static CIMProperty setPropertyValue_InitialLoadInfo(CIMProperty currentProperty,
            String[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property LastLoadInfo
     *     * <br>
     * This object contains the data identifying either the initial load device (its key) or the boot service that requested the last operating system load. In addition, the load parameters (ie, a pathname and parameters) may also be specified.
     *     */

    public String get_LastLoadInfo() {
        CIMProperty currentProperty = getProperty(PROPERTY_LASTLOADINFO.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_LASTLOADINFO.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property LastLoadInfo
     * <br>
     * This object contains the data identifying either the initial load device (its key) or the boot service that requested the last operating system load. In addition, the load parameters (ie, a pathname and parameters) may also be specified.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_LastLoadInfo(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_LASTLOADINFO.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_LastLoadInfo(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_LASTLOADINFO.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property LastLoadInfo by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_LastLoadInfo(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_UnitaryComputerSystem fco = new CIM_UnitaryComputerSystem(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_LASTLOADINFO.NAME);
        if (property != null) {
            property = setPropertyValue_LastLoadInfo(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_LASTLOADINFO.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property LastLoadInfo
     * <br>
     * This object contains the data identifying either the initial load device (its key) or the boot service that requested the last operating system load. In addition, the load parameters (ie, a pathname and parameters) may also be specified.
     */

    private static CIMProperty setPropertyValue_LastLoadInfo(CIMProperty currentProperty,
            String newValue) {
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
     * When TRUE, indicates that the computer can be power managed. The use of this property has been deprecated. Instead, the existence of an associated PowerManagementCapabilities class (associated using the ElementCapabilites relationship) indicates that power management is supported.
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
     * When TRUE, indicates that the computer can be power managed. The use of this property has been deprecated. Instead, the existence of an associated PowerManagementCapabilities class (associated using the ElementCapabilites relationship) indicates that power management is supported.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PowerManagementSupported(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_POWERMANAGEMENTSUPPORTED.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_PowerManagementSupported(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
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
        CIM_UnitaryComputerSystem fco = new CIM_UnitaryComputerSystem(client, namespace);
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
     * When TRUE, indicates that the computer can be power managed. The use of this property has been deprecated. Instead, the existence of an associated PowerManagementCapabilities class (associated using the ElementCapabilites relationship) indicates that power management is supported.
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
     * Get the property PowerState
     *     * <br>
     * Indicates the current power state of the ComputerSystem and its associated OperatingSystem. Regarding the Power Save states, these are defined as follows: Value 4 ("Power Save - Unknown") indicates that the System is known to be in a power save mode, but its exact status in this mode is unknown; 
     * Value 2 ("Power Save - Low Power Mode") indicates that the System is in a power save state but still functioning, and may exhibit degraded performance; 
     * Value 3 ("Power Save - Standby") describes that the System is not functioning but could be brought to full power 'quickly'; value 7 ("Power Save - Warning") indicates that the ComputerSystem is in a warning state, though also in a power save mode. 
     * Values 8 and 9 describe the ACPI "Hibernate" and "Soft Off" states.
     *     */

    public javax.cim.UnsignedInteger16 get_PowerState() {
        CIMProperty currentProperty = getProperty(PROPERTY_POWERSTATE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_POWERSTATE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property PowerState
     * <br>
     * Indicates the current power state of the ComputerSystem and its associated OperatingSystem. Regarding the Power Save states, these are defined as follows: Value 4 ("Power Save - Unknown") indicates that the System is known to be in a power save mode, but its exact status in this mode is unknown; 
     * Value 2 ("Power Save - Low Power Mode") indicates that the System is in a power save state but still functioning, and may exhibit degraded performance; 
     * Value 3 ("Power Save - Standby") describes that the System is not functioning but could be brought to full power 'quickly'; value 7 ("Power Save - Warning") indicates that the ComputerSystem is in a warning state, though also in a power save mode. 
     * Values 8 and 9 describe the ACPI "Hibernate" and "Soft Off" states.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PowerState(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_POWERSTATE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_PowerState(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_POWERSTATE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PowerState by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PowerState(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_UnitaryComputerSystem fco = new CIM_UnitaryComputerSystem(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_POWERSTATE.NAME);
        if (property != null) {
            property = setPropertyValue_PowerState(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_POWERSTATE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PowerState
     * <br>
     * Indicates the current power state of the ComputerSystem and its associated OperatingSystem. Regarding the Power Save states, these are defined as follows: Value 4 ("Power Save - Unknown") indicates that the System is known to be in a power save mode, but its exact status in this mode is unknown; 
     * Value 2 ("Power Save - Low Power Mode") indicates that the System is in a power save state but still functioning, and may exhibit degraded performance; 
     * Value 3 ("Power Save - Standby") describes that the System is not functioning but could be brought to full power 'quickly'; value 7 ("Power Save - Warning") indicates that the ComputerSystem is in a warning state, though also in a power save mode. 
     * Values 8 and 9 describe the ACPI "Hibernate" and "Soft Off" states.
     */

    private static CIMProperty setPropertyValue_PowerState(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property WakeUpType
     *     * <br>
     * The event that caused the System to power up. This information is available in SMBIOS, in the Type 1 structure, the Wake Up Type attribute.
     *     */

    public javax.cim.UnsignedInteger16 get_WakeUpType() {
        CIMProperty currentProperty = getProperty(PROPERTY_WAKEUPTYPE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_WAKEUPTYPE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property WakeUpType
     * <br>
     * The event that caused the System to power up. This information is available in SMBIOS, in the Type 1 structure, the Wake Up Type attribute.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_WakeUpType(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_WAKEUPTYPE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_WakeUpType(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_WAKEUPTYPE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property WakeUpType by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_WakeUpType(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_UnitaryComputerSystem fco = new CIM_UnitaryComputerSystem(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_WAKEUPTYPE.NAME);
        if (property != null) {
            property = setPropertyValue_WakeUpType(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_WAKEUPTYPE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property WakeUpType
     * <br>
     * The event that caused the System to power up. This information is available in SMBIOS, in the Type 1 structure, the Wake Up Type attribute.
     */

    private static CIMProperty setPropertyValue_WakeUpType(CIMProperty currentProperty,
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
     * Get the list with CIM_Memory objects associated by the association CIM_ComputerSystemMemory
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMMEMORY as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_Memory_CIM_ComputerSystemMemorys(WBEMClient cimClient)
            throws WbemsmtException {

        return getAssociated_CIM_Memory_CIM_ComputerSystemMemorys(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMMEMORY, CIM_Memory.CIM_CLASS_NAME,
                null, null, false, false, null);

    }

    /**
     * Get the list with CIM_Memory objects associated by the association CIM_ComputerSystemMemory
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMMEMORY or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMMEMORY as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_Memory_CIM_ComputerSystemMemorys(WBEMClient cimClient,
            String resultClass, String role, String resultRole) throws WbemsmtException {

        return getAssociated_CIM_Memory_CIM_ComputerSystemMemorys(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMMEMORY, resultClass, role, resultRole,
                false, false, null);

    }

    /**
     * Get the list with CIM_Memory objects associated by the association CIM_ComputerSystemMemory
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMMEMORY or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_Memory_CIM_ComputerSystemMemorys(WBEMClient cimClient,
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
                CIM_UnitaryComputerSystemHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_UnitaryComputerSystemHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_UnitaryComputerSystemHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_Memory(cimInstance));
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
                        result.add(new CIM_Memory(cimInstance));
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
                        result.add(new CIM_Memory(cimInstance));
                        continue;
                    }
                }
            }
            CIM_UnitaryComputerSystemHelper.checkException(enumeration);
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
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_ComputerSystemMemory
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMMEMORY as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_Memory_CIM_ComputerSystemMemoryNames(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_Memory_CIM_ComputerSystemMemoryNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMMEMORY, CIM_Memory.CIM_CLASS_NAME,
                null, null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_ComputerSystemMemory
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMMEMORY or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMMEMORY as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_Memory_CIM_ComputerSystemMemoryNames(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_Memory_CIM_ComputerSystemMemoryNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMMEMORY, resultClass, role, resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_ComputerSystemMemory
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_Memory_CIM_ComputerSystemMemoryNames(
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
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMMEMORY,
                    CIM_Memory.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_UnitaryComputerSystemHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_UnitaryComputerSystemHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_Memory.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_UnitaryComputerSystemHelper.checkException(enumeration);
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
     * Get the list with CIM_ComputerSystemMemory associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_ComputerSystemMemory(WBEMClient cimClient,
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMMEMORY, role, includeQualifiers,
                    includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMMEMORY, role, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_UnitaryComputerSystemHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_UnitaryComputerSystemHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_ComputerSystemMemoryHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_ComputerSystemMemory(cimInstance));
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
                        result.add(new CIM_ComputerSystemMemory(cimInstance));
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
                        result.add(new CIM_ComputerSystemMemory(cimInstance));
                        continue;
                    }
                }
            }
            CIM_UnitaryComputerSystemHelper.checkException(enumeration);
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
     * Get a list of CIMObjectPath items of the associations CIM_ComputerSystemMemory
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_ComputerSystemMemory(WBEMClient cimClient,
            String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMMEMORY, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMMEMORY, role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_UnitaryComputerSystemHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_UnitaryComputerSystemHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_ComputerSystemMemory.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_UnitaryComputerSystemHelper.checkException(enumeration);
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
     * Get the list with CIM_Processor objects associated by the association CIM_ComputerSystemProcessor
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMPROCESSOR as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_Processor_CIM_ComputerSystemProcessors(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_Processor_CIM_ComputerSystemProcessors(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMPROCESSOR,
                CIM_Processor.CIM_CLASS_NAME, null, null, false, false, null);

    }

    /**
     * Get the list with CIM_Processor objects associated by the association CIM_ComputerSystemProcessor
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMPROCESSOR or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMPROCESSOR as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_Processor_CIM_ComputerSystemProcessors(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_Processor_CIM_ComputerSystemProcessors(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMPROCESSOR, resultClass, role,
                resultRole, false, false, null);

    }

    /**
     * Get the list with CIM_Processor objects associated by the association CIM_ComputerSystemProcessor
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMPROCESSOR or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_Processor_CIM_ComputerSystemProcessors(
            WBEMClient cimClient, String associationClass, String resultClass, String role,
            String resultRole, boolean includeQualifiers, boolean includeClassOrigin,
            java.lang.String[] propertyList) throws WbemsmtException {

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
                CIM_UnitaryComputerSystemHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_UnitaryComputerSystemHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_UnitaryComputerSystemHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_Processor(cimInstance));
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
                        result.add(new CIM_Processor(cimInstance));
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
                        result.add(new CIM_Processor(cimInstance));
                        continue;
                    }
                }
            }
            CIM_UnitaryComputerSystemHelper.checkException(enumeration);
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
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_ComputerSystemProcessor
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMPROCESSOR as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_Processor_CIM_ComputerSystemProcessorNames(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_Processor_CIM_ComputerSystemProcessorNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMPROCESSOR,
                CIM_Processor.CIM_CLASS_NAME, null, null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_ComputerSystemProcessor
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMPROCESSOR or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMPROCESSOR as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_Processor_CIM_ComputerSystemProcessorNames(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_Processor_CIM_ComputerSystemProcessorNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMPROCESSOR, resultClass, role,
                resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_ComputerSystemProcessor
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_Processor_CIM_ComputerSystemProcessorNames(
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
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMPROCESSOR,
                    CIM_Processor.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_UnitaryComputerSystemHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_UnitaryComputerSystemHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_Processor.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_UnitaryComputerSystemHelper.checkException(enumeration);
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
     * Get the list with CIM_ComputerSystemProcessor associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_ComputerSystemProcessor(WBEMClient cimClient,
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMPROCESSOR, role, includeQualifiers,
                    includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMPROCESSOR, role, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_UnitaryComputerSystemHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_UnitaryComputerSystemHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_ComputerSystemProcessorHelper.findClass(cimClient,
                            cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_ComputerSystemProcessor(cimInstance));
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
                        result.add(new CIM_ComputerSystemProcessor(cimInstance));
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
                        result.add(new CIM_ComputerSystemProcessor(cimInstance));
                        continue;
                    }
                }
            }
            CIM_UnitaryComputerSystemHelper.checkException(enumeration);
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
     * Get a list of CIMObjectPath items of the associations CIM_ComputerSystemProcessor
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_ComputerSystemProcessor(WBEMClient cimClient,
            String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMPROCESSOR, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMPROCESSOR,
                    role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_UnitaryComputerSystemHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_UnitaryComputerSystemHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_ComputerSystemProcessor.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_UnitaryComputerSystemHelper.checkException(enumeration);
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
     * Get the list with CIM_ComputerSystem objects associated by the association CIM_SystemPartition
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMPARTITION as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_ComputerSystem_CIM_SystemPartitions(WBEMClient cimClient)
            throws WbemsmtException {

        return getAssociated_CIM_ComputerSystem_CIM_SystemPartitions(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMPARTITION, CIM_ComputerSystem.CIM_CLASS_NAME,
                null, null, false, false, null);

    }

    /**
     * Get the list with CIM_ComputerSystem objects associated by the association CIM_SystemPartition
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMPARTITION or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMPARTITION as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_ComputerSystem_CIM_SystemPartitions(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_ComputerSystem_CIM_SystemPartitions(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMPARTITION, resultClass, role, resultRole,
                false, false, null);

    }

    /**
     * Get the list with CIM_ComputerSystem objects associated by the association CIM_SystemPartition
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMPARTITION or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_ComputerSystem_CIM_SystemPartitions(
            WBEMClient cimClient, String associationClass, String resultClass, String role,
            String resultRole, boolean includeQualifiers, boolean includeClassOrigin,
            java.lang.String[] propertyList) throws WbemsmtException {

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
                CIM_UnitaryComputerSystemHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_UnitaryComputerSystemHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_UnitaryComputerSystemHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_ComputerSystem(cimInstance));
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
                        result.add(new CIM_ComputerSystem(cimInstance));
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
                        result.add(new CIM_ComputerSystem(cimInstance));
                        continue;
                    }
                }
            }
            CIM_UnitaryComputerSystemHelper.checkException(enumeration);
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
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_SystemPartition
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMPARTITION as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_ComputerSystem_CIM_SystemPartitionNames(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_ComputerSystem_CIM_SystemPartitionNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMPARTITION, CIM_ComputerSystem.CIM_CLASS_NAME,
                null, null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_SystemPartition
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMPARTITION or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMPARTITION as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_ComputerSystem_CIM_SystemPartitionNames(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_ComputerSystem_CIM_SystemPartitionNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMPARTITION, resultClass, role, resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_SystemPartition
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_ComputerSystem_CIM_SystemPartitionNames(
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
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMPARTITION,
                    CIM_ComputerSystem.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_UnitaryComputerSystemHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_UnitaryComputerSystemHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_ComputerSystem.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_UnitaryComputerSystemHelper.checkException(enumeration);
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
     * Get the list with CIM_SystemPartition associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_SystemPartition(WBEMClient cimClient,
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMPARTITION, role, includeQualifiers,
                    includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMPARTITION, role, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_UnitaryComputerSystemHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_UnitaryComputerSystemHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_SystemPartitionHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_SystemPartition(cimInstance));
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
                        result.add(new CIM_SystemPartition(cimInstance));
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
                        result.add(new CIM_SystemPartition(cimInstance));
                        continue;
                    }
                }
            }
            CIM_UnitaryComputerSystemHelper.checkException(enumeration);
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
     * Get a list of CIMObjectPath items of the associations CIM_SystemPartition
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_SystemPartition(WBEMClient cimClient,
            String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMPARTITION, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMPARTITION, role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_UnitaryComputerSystemHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_UnitaryComputerSystemHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_SystemPartition.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_UnitaryComputerSystemHelper.checkException(enumeration);
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

    //**********************************************************************
    // utility methods     
    //**********************************************************************                         

    /**
     * return the name of the CIMClass
     * @return
     */
    public String getObjectName() {
        return CIM_UnitaryComputerSystem.CIM_CLASS_NAME;
    }

}