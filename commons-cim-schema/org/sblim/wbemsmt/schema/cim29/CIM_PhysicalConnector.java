/** 
 * CIM_PhysicalConnector.java
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
 * Description: The PhysicalConnector class represents any PhysicalElement that is used to connect to other Elements. Any object that can be used to connect and transmit signals or power between two or more PhysicalElements is a descendant (or member) of this class. For example, Slots and D-shell connectors are types of PhysicalConnectors.
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

public class CIM_PhysicalConnector extends CIM_PhysicalElement {

    public final static String CIM_CLASS_NAME = "CIM_PhysicalConnector";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * The use of the CIM_AdapterActiveConnection class has been deprecated, since NetworkAdapter is deprecated. Instead use the CIM_PortActiveConnection class. The AdapterActiveConnection relationship indicates that a NetworkAdapter is using the referenced PhysicalConnector to output to the network. This relationship is important when the Adapter can choose to output from one of several Connectors. The Connectors may be associated with the NetworkAdapter in a Realizes relationship - but this is not required. This association provides additional information (i.e., 'in use for communication') different than Realizes.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_ADAPTERACTIVECONNECTION = "CIM_AdapterActiveConnection";

    /**
     * The PortActiveConnection relationship indicates that a NetworkPort is using the referenced PhysicalConnector to output to the network. This relationship is important when the port can choose to output from one of several connectors. The connectors may be associated with the NetworkPort in a Realizes relationship - but this is not required. This association provides additional information (i.e., 'in use for communication') different than Realizes.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTACTIVECONNECTION = "CIM_PortActiveConnection";

    /**
     * Constants of property ConnectorDescription
     * A string describing the Connector - used when the ConnectorLayout property is set to 1 ("Other"). Connector Description should be set to NULL when ConnectorLayout is any value other than 1.
     */
    public static class PROPERTY_CONNECTORDESCRIPTION {
        /**
         * name of the property ConnectorDescription
         */
        public final static String NAME = "ConnectorDescription";

    }

    /**
     * Constants of property ConnectorElectricalCharacteristics
     * Describes the electrical characteristic for this connector.
     */
    public static class PROPERTY_CONNECTORELECTRICALCHARACTERISTICS {
        /**
         * name of the property ConnectorElectricalCharacteristics
         */
        public final static String NAME = "ConnectorElectricalCharacteristics";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Single_Ended = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Single Ended (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Single_Ended = "Single Ended";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Differential = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Differential (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Differential = "Differential";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Low_Voltage_Differential = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Low Voltage Differential (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Low_Voltage_Differential = "Low Voltage Differential";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Optical = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry Optical (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Optical = "Optical";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Copper = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry Copper (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Copper = "Copper";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Shielded = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry Shielded (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_Shielded = "Shielded";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Unshielded = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry Unshielded (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_Unshielded = "Unshielded";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@21222122
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Single_Ended.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Single_Ended;
            }

            if (VALUE_ENTRY_Differential.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Differential;
            }

            if (VALUE_ENTRY_Low_Voltage_Differential.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Low_Voltage_Differential;
            }

            if (VALUE_ENTRY_Optical.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Optical;
            }

            if (VALUE_ENTRY_Copper.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Copper;
            }

            if (VALUE_ENTRY_Shielded.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Shielded;
            }

            if (VALUE_ENTRY_Unshielded.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Unshielded;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Single_Ended.intValue()) {
                return VALUE_ENTRY_Single_Ended;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Differential.intValue()) {
                return VALUE_ENTRY_Differential;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Low_Voltage_Differential.intValue()) {
                return VALUE_ENTRY_Low_Voltage_Differential;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Optical.intValue()) {
                return VALUE_ENTRY_Optical;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Copper.intValue()) {
                return VALUE_ENTRY_Copper;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Shielded.intValue()) {
                return VALUE_ENTRY_Shielded;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Unshielded.intValue()) {
                return VALUE_ENTRY_Unshielded;
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
         * Value Map for the property ConnectorElectricalCharacteristics   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Single_Ended,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Differential,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Low_Voltage_Differential,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Optical,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Copper,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Shielded,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Unshielded };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property ConnectorElectricalCharacteristics   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_Single_Ended, VALUE_ENTRY_Differential,
                VALUE_ENTRY_Low_Voltage_Differential, VALUE_ENTRY_Optical, VALUE_ENTRY_Copper,
                VALUE_ENTRY_Shielded, VALUE_ENTRY_Unshielded };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property ConnectorElectricalCharacteristics   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_Single_Ended, VALUE_ENTRY_Differential,
                VALUE_ENTRY_Low_Voltage_Differential, VALUE_ENTRY_Optical, VALUE_ENTRY_Copper,
                VALUE_ENTRY_Shielded, VALUE_ENTRY_Unshielded };

    }

    /**
     * Constants of property ConnectorGender
     * Describes the gender of the connector.
     */
    public static class PROPERTY_CONNECTORGENDER {
        /**
         * name of the property ConnectorGender
         */
        public final static String NAME = "ConnectorGender";

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
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Male = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Male (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Male = "Male";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Female = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Female (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Female = "Female";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@604a604a
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Male.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Male;
            }

            if (VALUE_ENTRY_Female.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Female;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Male.intValue()) {
                return VALUE_ENTRY_Male;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Female.intValue()) {
                return VALUE_ENTRY_Female;
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
         * Value Map for the property ConnectorGender   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Male,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Female };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property ConnectorGender   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Male,
                VALUE_ENTRY_Female };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property ConnectorGender   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Male, VALUE_ENTRY_Female };

    }

    /**
     * Constants of property ConnectorLayout
     * Describes the type of packaging normally associated with this type of connector.
     */
    public static class PROPERTY_CONNECTORLAYOUT {
        /**
         * name of the property ConnectorLayout
         */
        public final static String NAME = "ConnectorLayout";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_RS232 = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry RS232 (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_RS232 = "RS232";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_BNC = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry BNC (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_BNC = "BNC";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_RJ11 = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry RJ11 (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_RJ11 = "RJ11";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_RJ45 = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry RJ45 (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_RJ45 = "RJ45";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_DB9 = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry DB9 (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_DB9 = "DB9";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Slot = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry Slot (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_Slot = "Slot";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_SCSI_High_Density = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry SCSI High Density (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_SCSI_High_Density = "SCSI High Density";

        /**
         * constant for value map entry 9
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_SCSI_Low_Density = new javax.cim.UnsignedInteger16(
                "9");

        /**
         * constant for value entry SCSI Low Density (corresponds to mapEntry 9 )
         */
        public final static String VALUE_ENTRY_SCSI_Low_Density = "SCSI Low Density";

        /**
         * constant for value map entry 10
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Ribbon = new javax.cim.UnsignedInteger16(
                "10");

        /**
         * constant for value entry Ribbon (corresponds to mapEntry 10 )
         */
        public final static String VALUE_ENTRY_Ribbon = "Ribbon";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@30703070
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_RS232.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_RS232;
            }

            if (VALUE_ENTRY_BNC.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_BNC;
            }

            if (VALUE_ENTRY_RJ11.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_RJ11;
            }

            if (VALUE_ENTRY_RJ45.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_RJ45;
            }

            if (VALUE_ENTRY_DB9.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_DB9;
            }

            if (VALUE_ENTRY_Slot.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Slot;
            }

            if (VALUE_ENTRY_SCSI_High_Density.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_SCSI_High_Density;
            }

            if (VALUE_ENTRY_SCSI_Low_Density.equals(value)) {
                return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_SCSI_Low_Density;
            }

            if (VALUE_ENTRY_Ribbon.equals(value)) {
                return VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Ribbon;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_RS232.intValue()) {
                return VALUE_ENTRY_RS232;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_BNC.intValue()) {
                return VALUE_ENTRY_BNC;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_RJ11.intValue()) {
                return VALUE_ENTRY_RJ11;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_RJ45.intValue()) {
                return VALUE_ENTRY_RJ45;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_DB9.intValue()) {
                return VALUE_ENTRY_DB9;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Slot.intValue()) {
                return VALUE_ENTRY_Slot;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_SCSI_High_Density.intValue()) {
                return VALUE_ENTRY_SCSI_High_Density;
            }

            if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_SCSI_Low_Density.intValue()) {
                return VALUE_ENTRY_SCSI_Low_Density;
            }

            if (iValue == VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Ribbon.intValue()) {
                return VALUE_ENTRY_Ribbon;
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
         * Value Map for the property ConnectorLayout   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_RS232, VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_BNC,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_RJ11, VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_RJ45,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_DB9, VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Slot,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_SCSI_High_Density,
                VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_SCSI_Low_Density,
                VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Ribbon };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property ConnectorLayout   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_RS232, VALUE_ENTRY_BNC, VALUE_ENTRY_RJ11, VALUE_ENTRY_RJ45,
                VALUE_ENTRY_DB9, VALUE_ENTRY_Slot, VALUE_ENTRY_SCSI_High_Density,
                VALUE_ENTRY_SCSI_Low_Density, VALUE_ENTRY_Ribbon };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property ConnectorLayout   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_RS232, VALUE_ENTRY_BNC, VALUE_ENTRY_RJ11,
                VALUE_ENTRY_RJ45, VALUE_ENTRY_DB9, VALUE_ENTRY_Slot, VALUE_ENTRY_SCSI_High_Density,
                VALUE_ENTRY_SCSI_Low_Density, VALUE_ENTRY_Ribbon };

    }

    /**
     * Constants of property ConnectorPinout
     * A free-form string describing the pin configuration and/or signal usage of a PhysicalConnector.
     */
    public static class PROPERTY_CONNECTORPINOUT {
        /**
         * name of the property ConnectorPinout
         */
        public final static String NAME = "ConnectorPinout";

    }

    /**
     * Constants of property ConnectorType
     * An array of integers defining the type of PhysicalConnector. An array is specified to allow the description of 'combinations' of Connector information. For example, one array entry could specify RS-232 (value=25), another DB-25 (value=23) and a third entry define the Connector as "Male" (value=2). 
     * This single property is being deprecated in lieu of using separate properties to describe the various aspects of the connector. The separation allows for a more generic means of describing the connectors. Obsolete connectors were intentionally removed from the new list.
     */
    public static class PROPERTY_CONNECTORTYPE {
        /**
         * name of the property ConnectorType
         */
        public final static String NAME = "ConnectorType";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Male = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Male (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Male = "Male";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Female = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Female (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Female = "Female";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Shielded = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Shielded (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Shielded = "Shielded";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Unshielded = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry Unshielded (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Unshielded = "Unshielded";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_SCSI__A__High_Density__50_pins_ = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry SCSI (A) High-Density (50 pins) (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_SCSI__A__High_Density__50_pins_ = "SCSI (A) High-Density (50 pins)";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_SCSI__A__Low_Density__50_pins_ = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry SCSI (A) Low-Density (50 pins) (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_SCSI__A__Low_Density__50_pins_ = "SCSI (A) Low-Density (50 pins)";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_SCSI__P__High_Density__68_pins_ = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry SCSI (P) High-Density (68 pins) (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_SCSI__P__High_Density__68_pins_ = "SCSI (P) High-Density (68 pins)";

        /**
         * constant for value map entry 9
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_SCSI_SCA_I__80_pins_ = new javax.cim.UnsignedInteger16(
                "9");

        /**
         * constant for value entry SCSI SCA-I (80 pins) (corresponds to mapEntry 9 )
         */
        public final static String VALUE_ENTRY_SCSI_SCA_I__80_pins_ = "SCSI SCA-I (80 pins)";

        /**
         * constant for value map entry 10
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_SCSI_SCA_II__80_pins_ = new javax.cim.UnsignedInteger16(
                "10");

        /**
         * constant for value entry SCSI SCA-II (80 pins) (corresponds to mapEntry 10 )
         */
        public final static String VALUE_ENTRY_SCSI_SCA_II__80_pins_ = "SCSI SCA-II (80 pins)";

        /**
         * constant for value map entry 11
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Fibre_Channel__DB_9 = new javax.cim.UnsignedInteger16(
                "11");

        /**
         * constant for value entry Fibre Channel (DB-9 (corresponds to mapEntry 11 )
         */
        public final static String VALUE_ENTRY_Fibre_Channel__DB_9 = "Fibre Channel (DB-9";

        /**
         * constant for value map entry 12
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Copper_ = new javax.cim.UnsignedInteger16(
                "12");

        /**
         * constant for value entry Copper) (corresponds to mapEntry 12 )
         */
        public final static String VALUE_ENTRY_Copper_ = "Copper)";

        /**
         * constant for value map entry 13
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Fibre_Channel__Optical_Fibre_ = new javax.cim.UnsignedInteger16(
                "13");

        /**
         * constant for value entry Fibre Channel (Optical Fibre) (corresponds to mapEntry 13 )
         */
        public final static String VALUE_ENTRY_Fibre_Channel__Optical_Fibre_ = "Fibre Channel (Optical Fibre)";

        /**
         * constant for value map entry 14
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_Fibre_Channel_SCA_II__40_pins_ = new javax.cim.UnsignedInteger16(
                "14");

        /**
         * constant for value entry Fibre Channel SCA-II (40 pins) (corresponds to mapEntry 14 )
         */
        public final static String VALUE_ENTRY_Fibre_Channel_SCA_II__40_pins_ = "Fibre Channel SCA-II (40 pins)";

        /**
         * constant for value map entry 15
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Fibre_Channel_SCA_II__20_pins_ = new javax.cim.UnsignedInteger16(
                "15");

        /**
         * constant for value entry Fibre Channel SCA-II (20 pins) (corresponds to mapEntry 15 )
         */
        public final static String VALUE_ENTRY_Fibre_Channel_SCA_II__20_pins_ = "Fibre Channel SCA-II (20 pins)";

        /**
         * constant for value map entry 16
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_Fibre_Channel_BNC = new javax.cim.UnsignedInteger16(
                "16");

        /**
         * constant for value entry Fibre Channel BNC (corresponds to mapEntry 16 )
         */
        public final static String VALUE_ENTRY_Fibre_Channel_BNC = "Fibre Channel BNC";

        /**
         * constant for value map entry 17
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_ATA_3_1_2_Inch__40_pins_ = new javax.cim.UnsignedInteger16(
                "17");

        /**
         * constant for value entry ATA 3-1/2 Inch (40 pins) (corresponds to mapEntry 17 )
         */
        public final static String VALUE_ENTRY_ATA_3_1_2_Inch__40_pins_ = "ATA 3-1/2 Inch (40 pins)";

        /**
         * constant for value map entry 18
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_ATA_2_1_2_Inch__44_pins_ = new javax.cim.UnsignedInteger16(
                "18");

        /**
         * constant for value entry ATA 2-1/2 Inch (44 pins) (corresponds to mapEntry 18 )
         */
        public final static String VALUE_ENTRY_ATA_2_1_2_Inch__44_pins_ = "ATA 2-1/2 Inch (44 pins)";

        /**
         * constant for value map entry 19
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_ATA_2 = new javax.cim.UnsignedInteger16(
                "19");

        /**
         * constant for value entry ATA-2 (corresponds to mapEntry 19 )
         */
        public final static String VALUE_ENTRY_ATA_2 = "ATA-2";

        /**
         * constant for value map entry 20
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_ATA_3 = new javax.cim.UnsignedInteger16(
                "20");

        /**
         * constant for value entry ATA-3 (corresponds to mapEntry 20 )
         */
        public final static String VALUE_ENTRY_ATA_3 = "ATA-3";

        /**
         * constant for value map entry 21
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_ATA_66 = new javax.cim.UnsignedInteger16(
                "21");

        /**
         * constant for value entry ATA/66 (corresponds to mapEntry 21 )
         */
        public final static String VALUE_ENTRY_ATA_66 = "ATA/66";

        /**
         * constant for value map entry 22
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_DB_9 = new javax.cim.UnsignedInteger16(
                "22");

        /**
         * constant for value entry DB-9 (corresponds to mapEntry 22 )
         */
        public final static String VALUE_ENTRY_DB_9 = "DB-9";

        /**
         * constant for value map entry 23
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_DB_15 = new javax.cim.UnsignedInteger16(
                "23");

        /**
         * constant for value entry DB-15 (corresponds to mapEntry 23 )
         */
        public final static String VALUE_ENTRY_DB_15 = "DB-15";

        /**
         * constant for value map entry 24
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_DB_25 = new javax.cim.UnsignedInteger16(
                "24");

        /**
         * constant for value entry DB-25 (corresponds to mapEntry 24 )
         */
        public final static String VALUE_ENTRY_DB_25 = "DB-25";

        /**
         * constant for value map entry 25
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_DB_36 = new javax.cim.UnsignedInteger16(
                "25");

        /**
         * constant for value entry DB-36 (corresponds to mapEntry 25 )
         */
        public final static String VALUE_ENTRY_DB_36 = "DB-36";

        /**
         * constant for value map entry 26
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_RS_232C = new javax.cim.UnsignedInteger16(
                "26");

        /**
         * constant for value entry RS-232C (corresponds to mapEntry 26 )
         */
        public final static String VALUE_ENTRY_RS_232C = "RS-232C";

        /**
         * constant for value map entry 27
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_RS_422 = new javax.cim.UnsignedInteger16(
                "27");

        /**
         * constant for value entry RS-422 (corresponds to mapEntry 27 )
         */
        public final static String VALUE_ENTRY_RS_422 = "RS-422";

        /**
         * constant for value map entry 28
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_28_FOR_VALUE_ENTRY_RS_423 = new javax.cim.UnsignedInteger16(
                "28");

        /**
         * constant for value entry RS-423 (corresponds to mapEntry 28 )
         */
        public final static String VALUE_ENTRY_RS_423 = "RS-423";

        /**
         * constant for value map entry 29
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_29_FOR_VALUE_ENTRY_RS_485 = new javax.cim.UnsignedInteger16(
                "29");

        /**
         * constant for value entry RS-485 (corresponds to mapEntry 29 )
         */
        public final static String VALUE_ENTRY_RS_485 = "RS-485";

        /**
         * constant for value map entry 30
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_30_FOR_VALUE_ENTRY_RS_449 = new javax.cim.UnsignedInteger16(
                "30");

        /**
         * constant for value entry RS-449 (corresponds to mapEntry 30 )
         */
        public final static String VALUE_ENTRY_RS_449 = "RS-449";

        /**
         * constant for value map entry 31
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_31_FOR_VALUE_ENTRY_V_35 = new javax.cim.UnsignedInteger16(
                "31");

        /**
         * constant for value entry V.35 (corresponds to mapEntry 31 )
         */
        public final static String VALUE_ENTRY_V_35 = "V.35";

        /**
         * constant for value map entry 32
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_32_FOR_VALUE_ENTRY_X_21 = new javax.cim.UnsignedInteger16(
                "32");

        /**
         * constant for value entry X.21 (corresponds to mapEntry 32 )
         */
        public final static String VALUE_ENTRY_X_21 = "X.21";

        /**
         * constant for value map entry 33
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_33_FOR_VALUE_ENTRY_IEEE_488 = new javax.cim.UnsignedInteger16(
                "33");

        /**
         * constant for value entry IEEE-488 (corresponds to mapEntry 33 )
         */
        public final static String VALUE_ENTRY_IEEE_488 = "IEEE-488";

        /**
         * constant for value map entry 34
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_34_FOR_VALUE_ENTRY_AUI = new javax.cim.UnsignedInteger16(
                "34");

        /**
         * constant for value entry AUI (corresponds to mapEntry 34 )
         */
        public final static String VALUE_ENTRY_AUI = "AUI";

        /**
         * constant for value map entry 35
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_35_FOR_VALUE_ENTRY_UPT_Category_3 = new javax.cim.UnsignedInteger16(
                "35");

        /**
         * constant for value entry UPT Category 3 (corresponds to mapEntry 35 )
         */
        public final static String VALUE_ENTRY_UPT_Category_3 = "UPT Category 3";

        /**
         * constant for value map entry 36
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_36_FOR_VALUE_ENTRY_UPT_Category_4 = new javax.cim.UnsignedInteger16(
                "36");

        /**
         * constant for value entry UPT Category 4 (corresponds to mapEntry 36 )
         */
        public final static String VALUE_ENTRY_UPT_Category_4 = "UPT Category 4";

        /**
         * constant for value map entry 37
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_37_FOR_VALUE_ENTRY_UPT_Category_5 = new javax.cim.UnsignedInteger16(
                "37");

        /**
         * constant for value entry UPT Category 5 (corresponds to mapEntry 37 )
         */
        public final static String VALUE_ENTRY_UPT_Category_5 = "UPT Category 5";

        /**
         * constant for value map entry 38
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_38_FOR_VALUE_ENTRY_BNC = new javax.cim.UnsignedInteger16(
                "38");

        /**
         * constant for value entry BNC (corresponds to mapEntry 38 )
         */
        public final static String VALUE_ENTRY_BNC = "BNC";

        /**
         * constant for value map entry 39
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_39_FOR_VALUE_ENTRY_RJ11 = new javax.cim.UnsignedInteger16(
                "39");

        /**
         * constant for value entry RJ11 (corresponds to mapEntry 39 )
         */
        public final static String VALUE_ENTRY_RJ11 = "RJ11";

        /**
         * constant for value map entry 40
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_40_FOR_VALUE_ENTRY_RJ45 = new javax.cim.UnsignedInteger16(
                "40");

        /**
         * constant for value entry RJ45 (corresponds to mapEntry 40 )
         */
        public final static String VALUE_ENTRY_RJ45 = "RJ45";

        /**
         * constant for value map entry 41
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_41_FOR_VALUE_ENTRY_Fiber_MIC = new javax.cim.UnsignedInteger16(
                "41");

        /**
         * constant for value entry Fiber MIC (corresponds to mapEntry 41 )
         */
        public final static String VALUE_ENTRY_Fiber_MIC = "Fiber MIC";

        /**
         * constant for value map entry 42
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_42_FOR_VALUE_ENTRY_Apple_AUI = new javax.cim.UnsignedInteger16(
                "42");

        /**
         * constant for value entry Apple AUI (corresponds to mapEntry 42 )
         */
        public final static String VALUE_ENTRY_Apple_AUI = "Apple AUI";

        /**
         * constant for value map entry 43
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_43_FOR_VALUE_ENTRY_Apple_GeoPort = new javax.cim.UnsignedInteger16(
                "43");

        /**
         * constant for value entry Apple GeoPort (corresponds to mapEntry 43 )
         */
        public final static String VALUE_ENTRY_Apple_GeoPort = "Apple GeoPort";

        /**
         * constant for value map entry 44
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_44_FOR_VALUE_ENTRY_PCI = new javax.cim.UnsignedInteger16(
                "44");

        /**
         * constant for value entry PCI (corresponds to mapEntry 44 )
         */
        public final static String VALUE_ENTRY_PCI = "PCI";

        /**
         * constant for value map entry 45
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_45_FOR_VALUE_ENTRY_ISA = new javax.cim.UnsignedInteger16(
                "45");

        /**
         * constant for value entry ISA (corresponds to mapEntry 45 )
         */
        public final static String VALUE_ENTRY_ISA = "ISA";

        /**
         * constant for value map entry 46
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_46_FOR_VALUE_ENTRY_EISA = new javax.cim.UnsignedInteger16(
                "46");

        /**
         * constant for value entry EISA (corresponds to mapEntry 46 )
         */
        public final static String VALUE_ENTRY_EISA = "EISA";

        /**
         * constant for value map entry 47
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_47_FOR_VALUE_ENTRY_VESA = new javax.cim.UnsignedInteger16(
                "47");

        /**
         * constant for value entry VESA (corresponds to mapEntry 47 )
         */
        public final static String VALUE_ENTRY_VESA = "VESA";

        /**
         * constant for value map entry 48
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_48_FOR_VALUE_ENTRY_PCMCIA = new javax.cim.UnsignedInteger16(
                "48");

        /**
         * constant for value entry PCMCIA (corresponds to mapEntry 48 )
         */
        public final static String VALUE_ENTRY_PCMCIA = "PCMCIA";

        /**
         * constant for value map entry 49
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_49_FOR_VALUE_ENTRY_PCMCIA_Type_I = new javax.cim.UnsignedInteger16(
                "49");

        /**
         * constant for value entry PCMCIA Type I (corresponds to mapEntry 49 )
         */
        public final static String VALUE_ENTRY_PCMCIA_Type_I = "PCMCIA Type I";

        /**
         * constant for value map entry 50
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_50_FOR_VALUE_ENTRY_PCMCIA_Type_II = new javax.cim.UnsignedInteger16(
                "50");

        /**
         * constant for value entry PCMCIA Type II (corresponds to mapEntry 50 )
         */
        public final static String VALUE_ENTRY_PCMCIA_Type_II = "PCMCIA Type II";

        /**
         * constant for value map entry 51
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_51_FOR_VALUE_ENTRY_PCMCIA_Type_III = new javax.cim.UnsignedInteger16(
                "51");

        /**
         * constant for value entry PCMCIA Type III (corresponds to mapEntry 51 )
         */
        public final static String VALUE_ENTRY_PCMCIA_Type_III = "PCMCIA Type III";

        /**
         * constant for value map entry 52
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_52_FOR_VALUE_ENTRY_ZV_Port = new javax.cim.UnsignedInteger16(
                "52");

        /**
         * constant for value entry ZV Port (corresponds to mapEntry 52 )
         */
        public final static String VALUE_ENTRY_ZV_Port = "ZV Port";

        /**
         * constant for value map entry 53
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_53_FOR_VALUE_ENTRY_CardBus = new javax.cim.UnsignedInteger16(
                "53");

        /**
         * constant for value entry CardBus (corresponds to mapEntry 53 )
         */
        public final static String VALUE_ENTRY_CardBus = "CardBus";

        /**
         * constant for value map entry 54
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_54_FOR_VALUE_ENTRY_USB = new javax.cim.UnsignedInteger16(
                "54");

        /**
         * constant for value entry USB (corresponds to mapEntry 54 )
         */
        public final static String VALUE_ENTRY_USB = "USB";

        /**
         * constant for value map entry 55
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_55_FOR_VALUE_ENTRY_IEEE_1394 = new javax.cim.UnsignedInteger16(
                "55");

        /**
         * constant for value entry IEEE 1394 (corresponds to mapEntry 55 )
         */
        public final static String VALUE_ENTRY_IEEE_1394 = "IEEE 1394";

        /**
         * constant for value map entry 56
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_56_FOR_VALUE_ENTRY_HIPPI = new javax.cim.UnsignedInteger16(
                "56");

        /**
         * constant for value entry HIPPI (corresponds to mapEntry 56 )
         */
        public final static String VALUE_ENTRY_HIPPI = "HIPPI";

        /**
         * constant for value map entry 57
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_57_FOR_VALUE_ENTRY_HSSDC__6_pins_ = new javax.cim.UnsignedInteger16(
                "57");

        /**
         * constant for value entry HSSDC (6 pins) (corresponds to mapEntry 57 )
         */
        public final static String VALUE_ENTRY_HSSDC__6_pins_ = "HSSDC (6 pins)";

        /**
         * constant for value map entry 58
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_58_FOR_VALUE_ENTRY_GBIC = new javax.cim.UnsignedInteger16(
                "58");

        /**
         * constant for value entry GBIC (corresponds to mapEntry 58 )
         */
        public final static String VALUE_ENTRY_GBIC = "GBIC";

        /**
         * constant for value map entry 59
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_59_FOR_VALUE_ENTRY_DIN = new javax.cim.UnsignedInteger16(
                "59");

        /**
         * constant for value entry DIN (corresponds to mapEntry 59 )
         */
        public final static String VALUE_ENTRY_DIN = "DIN";

        /**
         * constant for value map entry 60
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_60_FOR_VALUE_ENTRY_Mini_DIN = new javax.cim.UnsignedInteger16(
                "60");

        /**
         * constant for value entry Mini-DIN (corresponds to mapEntry 60 )
         */
        public final static String VALUE_ENTRY_Mini_DIN = "Mini-DIN";

        /**
         * constant for value map entry 61
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_61_FOR_VALUE_ENTRY_Micro_DIN = new javax.cim.UnsignedInteger16(
                "61");

        /**
         * constant for value entry Micro-DIN (corresponds to mapEntry 61 )
         */
        public final static String VALUE_ENTRY_Micro_DIN = "Micro-DIN";

        /**
         * constant for value map entry 62
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_62_FOR_VALUE_ENTRY_PS_2 = new javax.cim.UnsignedInteger16(
                "62");

        /**
         * constant for value entry PS/2 (corresponds to mapEntry 62 )
         */
        public final static String VALUE_ENTRY_PS_2 = "PS/2";

        /**
         * constant for value map entry 63
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_63_FOR_VALUE_ENTRY_Infrared = new javax.cim.UnsignedInteger16(
                "63");

        /**
         * constant for value entry Infrared (corresponds to mapEntry 63 )
         */
        public final static String VALUE_ENTRY_Infrared = "Infrared";

        /**
         * constant for value map entry 64
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_64_FOR_VALUE_ENTRY_HP_HIL = new javax.cim.UnsignedInteger16(
                "64");

        /**
         * constant for value entry HP-HIL (corresponds to mapEntry 64 )
         */
        public final static String VALUE_ENTRY_HP_HIL = "HP-HIL";

        /**
         * constant for value map entry 65
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_65_FOR_VALUE_ENTRY_Access_bus = new javax.cim.UnsignedInteger16(
                "65");

        /**
         * constant for value entry Access.bus (corresponds to mapEntry 65 )
         */
        public final static String VALUE_ENTRY_Access_bus = "Access.bus";

        /**
         * constant for value map entry 66
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_66_FOR_VALUE_ENTRY_NuBus = new javax.cim.UnsignedInteger16(
                "66");

        /**
         * constant for value entry NuBus (corresponds to mapEntry 66 )
         */
        public final static String VALUE_ENTRY_NuBus = "NuBus";

        /**
         * constant for value map entry 67
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_67_FOR_VALUE_ENTRY_Centronics = new javax.cim.UnsignedInteger16(
                "67");

        /**
         * constant for value entry Centronics (corresponds to mapEntry 67 )
         */
        public final static String VALUE_ENTRY_Centronics = "Centronics";

        /**
         * constant for value map entry 68
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_68_FOR_VALUE_ENTRY_Mini_Centronics = new javax.cim.UnsignedInteger16(
                "68");

        /**
         * constant for value entry Mini-Centronics (corresponds to mapEntry 68 )
         */
        public final static String VALUE_ENTRY_Mini_Centronics = "Mini-Centronics";

        /**
         * constant for value map entry 69
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_69_FOR_VALUE_ENTRY_Mini_Centronics_Type_14 = new javax.cim.UnsignedInteger16(
                "69");

        /**
         * constant for value entry Mini-Centronics Type-14 (corresponds to mapEntry 69 )
         */
        public final static String VALUE_ENTRY_Mini_Centronics_Type_14 = "Mini-Centronics Type-14";

        /**
         * constant for value map entry 70
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_70_FOR_VALUE_ENTRY_Mini_Centronics_Type_20 = new javax.cim.UnsignedInteger16(
                "70");

        /**
         * constant for value entry Mini-Centronics Type-20 (corresponds to mapEntry 70 )
         */
        public final static String VALUE_ENTRY_Mini_Centronics_Type_20 = "Mini-Centronics Type-20";

        /**
         * constant for value map entry 71
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_71_FOR_VALUE_ENTRY_Mini_Centronics_Type_26 = new javax.cim.UnsignedInteger16(
                "71");

        /**
         * constant for value entry Mini-Centronics Type-26 (corresponds to mapEntry 71 )
         */
        public final static String VALUE_ENTRY_Mini_Centronics_Type_26 = "Mini-Centronics Type-26";

        /**
         * constant for value map entry 72
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_72_FOR_VALUE_ENTRY_Bus_Mouse = new javax.cim.UnsignedInteger16(
                "72");

        /**
         * constant for value entry Bus Mouse (corresponds to mapEntry 72 )
         */
        public final static String VALUE_ENTRY_Bus_Mouse = "Bus Mouse";

        /**
         * constant for value map entry 73
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_73_FOR_VALUE_ENTRY_ADB = new javax.cim.UnsignedInteger16(
                "73");

        /**
         * constant for value entry ADB (corresponds to mapEntry 73 )
         */
        public final static String VALUE_ENTRY_ADB = "ADB";

        /**
         * constant for value map entry 74
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_74_FOR_VALUE_ENTRY_AGP = new javax.cim.UnsignedInteger16(
                "74");

        /**
         * constant for value entry AGP (corresponds to mapEntry 74 )
         */
        public final static String VALUE_ENTRY_AGP = "AGP";

        /**
         * constant for value map entry 75
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_75_FOR_VALUE_ENTRY_VME_Bus = new javax.cim.UnsignedInteger16(
                "75");

        /**
         * constant for value entry VME Bus (corresponds to mapEntry 75 )
         */
        public final static String VALUE_ENTRY_VME_Bus = "VME Bus";

        /**
         * constant for value map entry 76
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_76_FOR_VALUE_ENTRY_VME64 = new javax.cim.UnsignedInteger16(
                "76");

        /**
         * constant for value entry VME64 (corresponds to mapEntry 76 )
         */
        public final static String VALUE_ENTRY_VME64 = "VME64";

        /**
         * constant for value map entry 77
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_77_FOR_VALUE_ENTRY_Proprietary = new javax.cim.UnsignedInteger16(
                "77");

        /**
         * constant for value entry Proprietary (corresponds to mapEntry 77 )
         */
        public final static String VALUE_ENTRY_Proprietary = "Proprietary";

        /**
         * constant for value map entry 78
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_78_FOR_VALUE_ENTRY_Proprietary_Processor_Card_Slot = new javax.cim.UnsignedInteger16(
                "78");

        /**
         * constant for value entry Proprietary Processor Card Slot (corresponds to mapEntry 78 )
         */
        public final static String VALUE_ENTRY_Proprietary_Processor_Card_Slot = "Proprietary Processor Card Slot";

        /**
         * constant for value map entry 79
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_79_FOR_VALUE_ENTRY_Proprietary_Memory_Card_Slot = new javax.cim.UnsignedInteger16(
                "79");

        /**
         * constant for value entry Proprietary Memory Card Slot (corresponds to mapEntry 79 )
         */
        public final static String VALUE_ENTRY_Proprietary_Memory_Card_Slot = "Proprietary Memory Card Slot";

        /**
         * constant for value map entry 80
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_80_FOR_VALUE_ENTRY_Proprietary_I_O_Riser_Slot = new javax.cim.UnsignedInteger16(
                "80");

        /**
         * constant for value entry Proprietary I/O Riser Slot (corresponds to mapEntry 80 )
         */
        public final static String VALUE_ENTRY_Proprietary_I_O_Riser_Slot = "Proprietary I/O Riser Slot";

        /**
         * constant for value map entry 81
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_81_FOR_VALUE_ENTRY_PCI_66MHZ = new javax.cim.UnsignedInteger16(
                "81");

        /**
         * constant for value entry PCI-66MHZ (corresponds to mapEntry 81 )
         */
        public final static String VALUE_ENTRY_PCI_66MHZ = "PCI-66MHZ";

        /**
         * constant for value map entry 82
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_82_FOR_VALUE_ENTRY_AGP2X = new javax.cim.UnsignedInteger16(
                "82");

        /**
         * constant for value entry AGP2X (corresponds to mapEntry 82 )
         */
        public final static String VALUE_ENTRY_AGP2X = "AGP2X";

        /**
         * constant for value map entry 83
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_83_FOR_VALUE_ENTRY_AGP4X = new javax.cim.UnsignedInteger16(
                "83");

        /**
         * constant for value entry AGP4X (corresponds to mapEntry 83 )
         */
        public final static String VALUE_ENTRY_AGP4X = "AGP4X";

        /**
         * constant for value map entry 84
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_84_FOR_VALUE_ENTRY_PC_98 = new javax.cim.UnsignedInteger16(
                "84");

        /**
         * constant for value entry PC-98 (corresponds to mapEntry 84 )
         */
        public final static String VALUE_ENTRY_PC_98 = "PC-98";

        /**
         * constant for value map entry 85
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_85_FOR_VALUE_ENTRY_PC_98_Hireso = new javax.cim.UnsignedInteger16(
                "85");

        /**
         * constant for value entry PC-98-Hireso (corresponds to mapEntry 85 )
         */
        public final static String VALUE_ENTRY_PC_98_Hireso = "PC-98-Hireso";

        /**
         * constant for value map entry 86
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_86_FOR_VALUE_ENTRY_PC_H98 = new javax.cim.UnsignedInteger16(
                "86");

        /**
         * constant for value entry PC-H98 (corresponds to mapEntry 86 )
         */
        public final static String VALUE_ENTRY_PC_H98 = "PC-H98";

        /**
         * constant for value map entry 87
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_87_FOR_VALUE_ENTRY_PC_98Note = new javax.cim.UnsignedInteger16(
                "87");

        /**
         * constant for value entry PC-98Note (corresponds to mapEntry 87 )
         */
        public final static String VALUE_ENTRY_PC_98Note = "PC-98Note";

        /**
         * constant for value map entry 88
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_88_FOR_VALUE_ENTRY_PC_98Full = new javax.cim.UnsignedInteger16(
                "88");

        /**
         * constant for value entry PC-98Full (corresponds to mapEntry 88 )
         */
        public final static String VALUE_ENTRY_PC_98Full = "PC-98Full";

        /**
         * constant for value map entry 89
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_89_FOR_VALUE_ENTRY_SSA_SCSI = new javax.cim.UnsignedInteger16(
                "89");

        /**
         * constant for value entry SSA SCSI (corresponds to mapEntry 89 )
         */
        public final static String VALUE_ENTRY_SSA_SCSI = "SSA SCSI";

        /**
         * constant for value map entry 90
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_90_FOR_VALUE_ENTRY_Circular = new javax.cim.UnsignedInteger16(
                "90");

        /**
         * constant for value entry Circular (corresponds to mapEntry 90 )
         */
        public final static String VALUE_ENTRY_Circular = "Circular";

        /**
         * constant for value map entry 91
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_91_FOR_VALUE_ENTRY_On_Board_IDE_Connector = new javax.cim.UnsignedInteger16(
                "91");

        /**
         * constant for value entry On Board IDE Connector (corresponds to mapEntry 91 )
         */
        public final static String VALUE_ENTRY_On_Board_IDE_Connector = "On Board IDE Connector";

        /**
         * constant for value map entry 92
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_92_FOR_VALUE_ENTRY_On_Board_Floppy_Connector = new javax.cim.UnsignedInteger16(
                "92");

        /**
         * constant for value entry On Board Floppy Connector (corresponds to mapEntry 92 )
         */
        public final static String VALUE_ENTRY_On_Board_Floppy_Connector = "On Board Floppy Connector";

        /**
         * constant for value map entry 93
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_93_FOR_VALUE_ENTRY_9_Pin_Dual_Inline = new javax.cim.UnsignedInteger16(
                "93");

        /**
         * constant for value entry 9 Pin Dual Inline (corresponds to mapEntry 93 )
         */
        public final static String VALUE_ENTRY_9_Pin_Dual_Inline = "9 Pin Dual Inline";

        /**
         * constant for value map entry 94
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_94_FOR_VALUE_ENTRY_25_Pin_Dual_Inline = new javax.cim.UnsignedInteger16(
                "94");

        /**
         * constant for value entry 25 Pin Dual Inline (corresponds to mapEntry 94 )
         */
        public final static String VALUE_ENTRY_25_Pin_Dual_Inline = "25 Pin Dual Inline";

        /**
         * constant for value map entry 95
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_95_FOR_VALUE_ENTRY_50_Pin_Dual_Inline = new javax.cim.UnsignedInteger16(
                "95");

        /**
         * constant for value entry 50 Pin Dual Inline (corresponds to mapEntry 95 )
         */
        public final static String VALUE_ENTRY_50_Pin_Dual_Inline = "50 Pin Dual Inline";

        /**
         * constant for value map entry 96
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_96_FOR_VALUE_ENTRY_68_Pin_Dual_Inline = new javax.cim.UnsignedInteger16(
                "96");

        /**
         * constant for value entry 68 Pin Dual Inline (corresponds to mapEntry 96 )
         */
        public final static String VALUE_ENTRY_68_Pin_Dual_Inline = "68 Pin Dual Inline";

        /**
         * constant for value map entry 97
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_97_FOR_VALUE_ENTRY_On_Board_Sound_Connector = new javax.cim.UnsignedInteger16(
                "97");

        /**
         * constant for value entry On Board Sound Connector (corresponds to mapEntry 97 )
         */
        public final static String VALUE_ENTRY_On_Board_Sound_Connector = "On Board Sound Connector";

        /**
         * constant for value map entry 98
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_98_FOR_VALUE_ENTRY_Mini_jack = new javax.cim.UnsignedInteger16(
                "98");

        /**
         * constant for value entry Mini-jack (corresponds to mapEntry 98 )
         */
        public final static String VALUE_ENTRY_Mini_jack = "Mini-jack";

        /**
         * constant for value map entry 99
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_99_FOR_VALUE_ENTRY_PCI_X = new javax.cim.UnsignedInteger16(
                "99");

        /**
         * constant for value entry PCI-X (corresponds to mapEntry 99 )
         */
        public final static String VALUE_ENTRY_PCI_X = "PCI-X";

        /**
         * constant for value map entry 100
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_100_FOR_VALUE_ENTRY_Sbus_IEEE_1396_1993_32_bit = new javax.cim.UnsignedInteger16(
                "100");

        /**
         * constant for value entry Sbus IEEE 1396-1993 32 bit (corresponds to mapEntry 100 )
         */
        public final static String VALUE_ENTRY_Sbus_IEEE_1396_1993_32_bit = "Sbus IEEE 1396-1993 32 bit";

        /**
         * constant for value map entry 101
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_101_FOR_VALUE_ENTRY_Sbus_IEEE_1396_1993_64_bit = new javax.cim.UnsignedInteger16(
                "101");

        /**
         * constant for value entry Sbus IEEE 1396-1993 64 bit (corresponds to mapEntry 101 )
         */
        public final static String VALUE_ENTRY_Sbus_IEEE_1396_1993_64_bit = "Sbus IEEE 1396-1993 64 bit";

        /**
         * constant for value map entry 102
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_102_FOR_VALUE_ENTRY_MCA = new javax.cim.UnsignedInteger16(
                "102");

        /**
         * constant for value entry MCA (corresponds to mapEntry 102 )
         */
        public final static String VALUE_ENTRY_MCA = "MCA";

        /**
         * constant for value map entry 103
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_103_FOR_VALUE_ENTRY_GIO = new javax.cim.UnsignedInteger16(
                "103");

        /**
         * constant for value entry GIO (corresponds to mapEntry 103 )
         */
        public final static String VALUE_ENTRY_GIO = "GIO";

        /**
         * constant for value map entry 104
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_104_FOR_VALUE_ENTRY_XIO = new javax.cim.UnsignedInteger16(
                "104");

        /**
         * constant for value entry XIO (corresponds to mapEntry 104 )
         */
        public final static String VALUE_ENTRY_XIO = "XIO";

        /**
         * constant for value map entry 105
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_105_FOR_VALUE_ENTRY_HIO = new javax.cim.UnsignedInteger16(
                "105");

        /**
         * constant for value entry HIO (corresponds to mapEntry 105 )
         */
        public final static String VALUE_ENTRY_HIO = "HIO";

        /**
         * constant for value map entry 106
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_106_FOR_VALUE_ENTRY_NGIO = new javax.cim.UnsignedInteger16(
                "106");

        /**
         * constant for value entry NGIO (corresponds to mapEntry 106 )
         */
        public final static String VALUE_ENTRY_NGIO = "NGIO";

        /**
         * constant for value map entry 107
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_107_FOR_VALUE_ENTRY_PMC = new javax.cim.UnsignedInteger16(
                "107");

        /**
         * constant for value entry PMC (corresponds to mapEntry 107 )
         */
        public final static String VALUE_ENTRY_PMC = "PMC";

        /**
         * constant for value map entry 108
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_108_FOR_VALUE_ENTRY_MTRJ = new javax.cim.UnsignedInteger16(
                "108");

        /**
         * constant for value entry MTRJ (corresponds to mapEntry 108 )
         */
        public final static String VALUE_ENTRY_MTRJ = "MTRJ";

        /**
         * constant for value map entry 109
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_109_FOR_VALUE_ENTRY_VF_45 = new javax.cim.UnsignedInteger16(
                "109");

        /**
         * constant for value entry VF-45 (corresponds to mapEntry 109 )
         */
        public final static String VALUE_ENTRY_VF_45 = "VF-45";

        /**
         * constant for value map entry 110
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_110_FOR_VALUE_ENTRY_Future_I_O = new javax.cim.UnsignedInteger16(
                "110");

        /**
         * constant for value entry Future I/O (corresponds to mapEntry 110 )
         */
        public final static String VALUE_ENTRY_Future_I_O = "Future I/O";

        /**
         * constant for value map entry 111
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_111_FOR_VALUE_ENTRY_SC = new javax.cim.UnsignedInteger16(
                "111");

        /**
         * constant for value entry SC (corresponds to mapEntry 111 )
         */
        public final static String VALUE_ENTRY_SC = "SC";

        /**
         * constant for value map entry 112
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_112_FOR_VALUE_ENTRY_SG = new javax.cim.UnsignedInteger16(
                "112");

        /**
         * constant for value entry SG (corresponds to mapEntry 112 )
         */
        public final static String VALUE_ENTRY_SG = "SG";

        /**
         * constant for value map entry 113
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_113_FOR_VALUE_ENTRY_Electrical = new javax.cim.UnsignedInteger16(
                "113");

        /**
         * constant for value entry Electrical (corresponds to mapEntry 113 )
         */
        public final static String VALUE_ENTRY_Electrical = "Electrical";

        /**
         * constant for value map entry 114
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_114_FOR_VALUE_ENTRY_Optical = new javax.cim.UnsignedInteger16(
                "114");

        /**
         * constant for value entry Optical (corresponds to mapEntry 114 )
         */
        public final static String VALUE_ENTRY_Optical = "Optical";

        /**
         * constant for value map entry 115
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_115_FOR_VALUE_ENTRY_Ribbon = new javax.cim.UnsignedInteger16(
                "115");

        /**
         * constant for value entry Ribbon (corresponds to mapEntry 115 )
         */
        public final static String VALUE_ENTRY_Ribbon = "Ribbon";

        /**
         * constant for value map entry 116
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_116_FOR_VALUE_ENTRY_GLM = new javax.cim.UnsignedInteger16(
                "116");

        /**
         * constant for value entry GLM (corresponds to mapEntry 116 )
         */
        public final static String VALUE_ENTRY_GLM = "GLM";

        /**
         * constant for value map entry 117
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_117_FOR_VALUE_ENTRY_1x9 = new javax.cim.UnsignedInteger16(
                "117");

        /**
         * constant for value entry 1x9 (corresponds to mapEntry 117 )
         */
        public final static String VALUE_ENTRY_1x9 = "1x9";

        /**
         * constant for value map entry 118
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_118_FOR_VALUE_ENTRY_Mini_SG = new javax.cim.UnsignedInteger16(
                "118");

        /**
         * constant for value entry Mini SG (corresponds to mapEntry 118 )
         */
        public final static String VALUE_ENTRY_Mini_SG = "Mini SG";

        /**
         * constant for value map entry 119
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_119_FOR_VALUE_ENTRY_LC = new javax.cim.UnsignedInteger16(
                "119");

        /**
         * constant for value entry LC (corresponds to mapEntry 119 )
         */
        public final static String VALUE_ENTRY_LC = "LC";

        /**
         * constant for value map entry 120
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_120_FOR_VALUE_ENTRY_HSSC = new javax.cim.UnsignedInteger16(
                "120");

        /**
         * constant for value entry HSSC (corresponds to mapEntry 120 )
         */
        public final static String VALUE_ENTRY_HSSC = "HSSC";

        /**
         * constant for value map entry 121
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_121_FOR_VALUE_ENTRY_VHDCI_Shielded__68_pins_ = new javax.cim.UnsignedInteger16(
                "121");

        /**
         * constant for value entry VHDCI Shielded (68 pins) (corresponds to mapEntry 121 )
         */
        public final static String VALUE_ENTRY_VHDCI_Shielded__68_pins_ = "VHDCI Shielded (68 pins)";

        /**
         * constant for value map entry 122
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_122_FOR_VALUE_ENTRY_InfiniBand = new javax.cim.UnsignedInteger16(
                "122");

        /**
         * constant for value entry InfiniBand (corresponds to mapEntry 122 )
         */
        public final static String VALUE_ENTRY_InfiniBand = "InfiniBand";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@6f5e6f5e
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Male.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Male;
            }

            if (VALUE_ENTRY_Female.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Female;
            }

            if (VALUE_ENTRY_Shielded.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Shielded;
            }

            if (VALUE_ENTRY_Unshielded.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Unshielded;
            }

            if (VALUE_ENTRY_SCSI__A__High_Density__50_pins_.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_SCSI__A__High_Density__50_pins_;
            }

            if (VALUE_ENTRY_SCSI__A__Low_Density__50_pins_.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_SCSI__A__Low_Density__50_pins_;
            }

            if (VALUE_ENTRY_SCSI__P__High_Density__68_pins_.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_SCSI__P__High_Density__68_pins_;
            }

            if (VALUE_ENTRY_SCSI_SCA_I__80_pins_.equals(value)) {
                return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_SCSI_SCA_I__80_pins_;
            }

            if (VALUE_ENTRY_SCSI_SCA_II__80_pins_.equals(value)) {
                return VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_SCSI_SCA_II__80_pins_;
            }

            if (VALUE_ENTRY_Fibre_Channel__DB_9.equals(value)) {
                return VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Fibre_Channel__DB_9;
            }

            if (VALUE_ENTRY_Copper_.equals(value)) {
                return VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Copper_;
            }

            if (VALUE_ENTRY_Fibre_Channel__Optical_Fibre_.equals(value)) {
                return VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Fibre_Channel__Optical_Fibre_;
            }

            if (VALUE_ENTRY_Fibre_Channel_SCA_II__40_pins_.equals(value)) {
                return VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_Fibre_Channel_SCA_II__40_pins_;
            }

            if (VALUE_ENTRY_Fibre_Channel_SCA_II__20_pins_.equals(value)) {
                return VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Fibre_Channel_SCA_II__20_pins_;
            }

            if (VALUE_ENTRY_Fibre_Channel_BNC.equals(value)) {
                return VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_Fibre_Channel_BNC;
            }

            if (VALUE_ENTRY_ATA_3_1_2_Inch__40_pins_.equals(value)) {
                return VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_ATA_3_1_2_Inch__40_pins_;
            }

            if (VALUE_ENTRY_ATA_2_1_2_Inch__44_pins_.equals(value)) {
                return VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_ATA_2_1_2_Inch__44_pins_;
            }

            if (VALUE_ENTRY_ATA_2.equals(value)) {
                return VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_ATA_2;
            }

            if (VALUE_ENTRY_ATA_3.equals(value)) {
                return VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_ATA_3;
            }

            if (VALUE_ENTRY_ATA_66.equals(value)) {
                return VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_ATA_66;
            }

            if (VALUE_ENTRY_DB_9.equals(value)) {
                return VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_DB_9;
            }

            if (VALUE_ENTRY_DB_15.equals(value)) {
                return VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_DB_15;
            }

            if (VALUE_ENTRY_DB_25.equals(value)) {
                return VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_DB_25;
            }

            if (VALUE_ENTRY_DB_36.equals(value)) {
                return VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_DB_36;
            }

            if (VALUE_ENTRY_RS_232C.equals(value)) {
                return VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_RS_232C;
            }

            if (VALUE_ENTRY_RS_422.equals(value)) {
                return VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_RS_422;
            }

            if (VALUE_ENTRY_RS_423.equals(value)) {
                return VALUE_MAP_ENTRY_28_FOR_VALUE_ENTRY_RS_423;
            }

            if (VALUE_ENTRY_RS_485.equals(value)) {
                return VALUE_MAP_ENTRY_29_FOR_VALUE_ENTRY_RS_485;
            }

            if (VALUE_ENTRY_RS_449.equals(value)) {
                return VALUE_MAP_ENTRY_30_FOR_VALUE_ENTRY_RS_449;
            }

            if (VALUE_ENTRY_V_35.equals(value)) {
                return VALUE_MAP_ENTRY_31_FOR_VALUE_ENTRY_V_35;
            }

            if (VALUE_ENTRY_X_21.equals(value)) {
                return VALUE_MAP_ENTRY_32_FOR_VALUE_ENTRY_X_21;
            }

            if (VALUE_ENTRY_IEEE_488.equals(value)) {
                return VALUE_MAP_ENTRY_33_FOR_VALUE_ENTRY_IEEE_488;
            }

            if (VALUE_ENTRY_AUI.equals(value)) {
                return VALUE_MAP_ENTRY_34_FOR_VALUE_ENTRY_AUI;
            }

            if (VALUE_ENTRY_UPT_Category_3.equals(value)) {
                return VALUE_MAP_ENTRY_35_FOR_VALUE_ENTRY_UPT_Category_3;
            }

            if (VALUE_ENTRY_UPT_Category_4.equals(value)) {
                return VALUE_MAP_ENTRY_36_FOR_VALUE_ENTRY_UPT_Category_4;
            }

            if (VALUE_ENTRY_UPT_Category_5.equals(value)) {
                return VALUE_MAP_ENTRY_37_FOR_VALUE_ENTRY_UPT_Category_5;
            }

            if (VALUE_ENTRY_BNC.equals(value)) {
                return VALUE_MAP_ENTRY_38_FOR_VALUE_ENTRY_BNC;
            }

            if (VALUE_ENTRY_RJ11.equals(value)) {
                return VALUE_MAP_ENTRY_39_FOR_VALUE_ENTRY_RJ11;
            }

            if (VALUE_ENTRY_RJ45.equals(value)) {
                return VALUE_MAP_ENTRY_40_FOR_VALUE_ENTRY_RJ45;
            }

            if (VALUE_ENTRY_Fiber_MIC.equals(value)) {
                return VALUE_MAP_ENTRY_41_FOR_VALUE_ENTRY_Fiber_MIC;
            }

            if (VALUE_ENTRY_Apple_AUI.equals(value)) {
                return VALUE_MAP_ENTRY_42_FOR_VALUE_ENTRY_Apple_AUI;
            }

            if (VALUE_ENTRY_Apple_GeoPort.equals(value)) {
                return VALUE_MAP_ENTRY_43_FOR_VALUE_ENTRY_Apple_GeoPort;
            }

            if (VALUE_ENTRY_PCI.equals(value)) {
                return VALUE_MAP_ENTRY_44_FOR_VALUE_ENTRY_PCI;
            }

            if (VALUE_ENTRY_ISA.equals(value)) {
                return VALUE_MAP_ENTRY_45_FOR_VALUE_ENTRY_ISA;
            }

            if (VALUE_ENTRY_EISA.equals(value)) {
                return VALUE_MAP_ENTRY_46_FOR_VALUE_ENTRY_EISA;
            }

            if (VALUE_ENTRY_VESA.equals(value)) {
                return VALUE_MAP_ENTRY_47_FOR_VALUE_ENTRY_VESA;
            }

            if (VALUE_ENTRY_PCMCIA.equals(value)) {
                return VALUE_MAP_ENTRY_48_FOR_VALUE_ENTRY_PCMCIA;
            }

            if (VALUE_ENTRY_PCMCIA_Type_I.equals(value)) {
                return VALUE_MAP_ENTRY_49_FOR_VALUE_ENTRY_PCMCIA_Type_I;
            }

            if (VALUE_ENTRY_PCMCIA_Type_II.equals(value)) {
                return VALUE_MAP_ENTRY_50_FOR_VALUE_ENTRY_PCMCIA_Type_II;
            }

            if (VALUE_ENTRY_PCMCIA_Type_III.equals(value)) {
                return VALUE_MAP_ENTRY_51_FOR_VALUE_ENTRY_PCMCIA_Type_III;
            }

            if (VALUE_ENTRY_ZV_Port.equals(value)) {
                return VALUE_MAP_ENTRY_52_FOR_VALUE_ENTRY_ZV_Port;
            }

            if (VALUE_ENTRY_CardBus.equals(value)) {
                return VALUE_MAP_ENTRY_53_FOR_VALUE_ENTRY_CardBus;
            }

            if (VALUE_ENTRY_USB.equals(value)) {
                return VALUE_MAP_ENTRY_54_FOR_VALUE_ENTRY_USB;
            }

            if (VALUE_ENTRY_IEEE_1394.equals(value)) {
                return VALUE_MAP_ENTRY_55_FOR_VALUE_ENTRY_IEEE_1394;
            }

            if (VALUE_ENTRY_HIPPI.equals(value)) {
                return VALUE_MAP_ENTRY_56_FOR_VALUE_ENTRY_HIPPI;
            }

            if (VALUE_ENTRY_HSSDC__6_pins_.equals(value)) {
                return VALUE_MAP_ENTRY_57_FOR_VALUE_ENTRY_HSSDC__6_pins_;
            }

            if (VALUE_ENTRY_GBIC.equals(value)) {
                return VALUE_MAP_ENTRY_58_FOR_VALUE_ENTRY_GBIC;
            }

            if (VALUE_ENTRY_DIN.equals(value)) {
                return VALUE_MAP_ENTRY_59_FOR_VALUE_ENTRY_DIN;
            }

            if (VALUE_ENTRY_Mini_DIN.equals(value)) {
                return VALUE_MAP_ENTRY_60_FOR_VALUE_ENTRY_Mini_DIN;
            }

            if (VALUE_ENTRY_Micro_DIN.equals(value)) {
                return VALUE_MAP_ENTRY_61_FOR_VALUE_ENTRY_Micro_DIN;
            }

            if (VALUE_ENTRY_PS_2.equals(value)) {
                return VALUE_MAP_ENTRY_62_FOR_VALUE_ENTRY_PS_2;
            }

            if (VALUE_ENTRY_Infrared.equals(value)) {
                return VALUE_MAP_ENTRY_63_FOR_VALUE_ENTRY_Infrared;
            }

            if (VALUE_ENTRY_HP_HIL.equals(value)) {
                return VALUE_MAP_ENTRY_64_FOR_VALUE_ENTRY_HP_HIL;
            }

            if (VALUE_ENTRY_Access_bus.equals(value)) {
                return VALUE_MAP_ENTRY_65_FOR_VALUE_ENTRY_Access_bus;
            }

            if (VALUE_ENTRY_NuBus.equals(value)) {
                return VALUE_MAP_ENTRY_66_FOR_VALUE_ENTRY_NuBus;
            }

            if (VALUE_ENTRY_Centronics.equals(value)) {
                return VALUE_MAP_ENTRY_67_FOR_VALUE_ENTRY_Centronics;
            }

            if (VALUE_ENTRY_Mini_Centronics.equals(value)) {
                return VALUE_MAP_ENTRY_68_FOR_VALUE_ENTRY_Mini_Centronics;
            }

            if (VALUE_ENTRY_Mini_Centronics_Type_14.equals(value)) {
                return VALUE_MAP_ENTRY_69_FOR_VALUE_ENTRY_Mini_Centronics_Type_14;
            }

            if (VALUE_ENTRY_Mini_Centronics_Type_20.equals(value)) {
                return VALUE_MAP_ENTRY_70_FOR_VALUE_ENTRY_Mini_Centronics_Type_20;
            }

            if (VALUE_ENTRY_Mini_Centronics_Type_26.equals(value)) {
                return VALUE_MAP_ENTRY_71_FOR_VALUE_ENTRY_Mini_Centronics_Type_26;
            }

            if (VALUE_ENTRY_Bus_Mouse.equals(value)) {
                return VALUE_MAP_ENTRY_72_FOR_VALUE_ENTRY_Bus_Mouse;
            }

            if (VALUE_ENTRY_ADB.equals(value)) {
                return VALUE_MAP_ENTRY_73_FOR_VALUE_ENTRY_ADB;
            }

            if (VALUE_ENTRY_AGP.equals(value)) {
                return VALUE_MAP_ENTRY_74_FOR_VALUE_ENTRY_AGP;
            }

            if (VALUE_ENTRY_VME_Bus.equals(value)) {
                return VALUE_MAP_ENTRY_75_FOR_VALUE_ENTRY_VME_Bus;
            }

            if (VALUE_ENTRY_VME64.equals(value)) {
                return VALUE_MAP_ENTRY_76_FOR_VALUE_ENTRY_VME64;
            }

            if (VALUE_ENTRY_Proprietary.equals(value)) {
                return VALUE_MAP_ENTRY_77_FOR_VALUE_ENTRY_Proprietary;
            }

            if (VALUE_ENTRY_Proprietary_Processor_Card_Slot.equals(value)) {
                return VALUE_MAP_ENTRY_78_FOR_VALUE_ENTRY_Proprietary_Processor_Card_Slot;
            }

            if (VALUE_ENTRY_Proprietary_Memory_Card_Slot.equals(value)) {
                return VALUE_MAP_ENTRY_79_FOR_VALUE_ENTRY_Proprietary_Memory_Card_Slot;
            }

            if (VALUE_ENTRY_Proprietary_I_O_Riser_Slot.equals(value)) {
                return VALUE_MAP_ENTRY_80_FOR_VALUE_ENTRY_Proprietary_I_O_Riser_Slot;
            }

            if (VALUE_ENTRY_PCI_66MHZ.equals(value)) {
                return VALUE_MAP_ENTRY_81_FOR_VALUE_ENTRY_PCI_66MHZ;
            }

            if (VALUE_ENTRY_AGP2X.equals(value)) {
                return VALUE_MAP_ENTRY_82_FOR_VALUE_ENTRY_AGP2X;
            }

            if (VALUE_ENTRY_AGP4X.equals(value)) {
                return VALUE_MAP_ENTRY_83_FOR_VALUE_ENTRY_AGP4X;
            }

            if (VALUE_ENTRY_PC_98.equals(value)) {
                return VALUE_MAP_ENTRY_84_FOR_VALUE_ENTRY_PC_98;
            }

            if (VALUE_ENTRY_PC_98_Hireso.equals(value)) {
                return VALUE_MAP_ENTRY_85_FOR_VALUE_ENTRY_PC_98_Hireso;
            }

            if (VALUE_ENTRY_PC_H98.equals(value)) {
                return VALUE_MAP_ENTRY_86_FOR_VALUE_ENTRY_PC_H98;
            }

            if (VALUE_ENTRY_PC_98Note.equals(value)) {
                return VALUE_MAP_ENTRY_87_FOR_VALUE_ENTRY_PC_98Note;
            }

            if (VALUE_ENTRY_PC_98Full.equals(value)) {
                return VALUE_MAP_ENTRY_88_FOR_VALUE_ENTRY_PC_98Full;
            }

            if (VALUE_ENTRY_SSA_SCSI.equals(value)) {
                return VALUE_MAP_ENTRY_89_FOR_VALUE_ENTRY_SSA_SCSI;
            }

            if (VALUE_ENTRY_Circular.equals(value)) {
                return VALUE_MAP_ENTRY_90_FOR_VALUE_ENTRY_Circular;
            }

            if (VALUE_ENTRY_On_Board_IDE_Connector.equals(value)) {
                return VALUE_MAP_ENTRY_91_FOR_VALUE_ENTRY_On_Board_IDE_Connector;
            }

            if (VALUE_ENTRY_On_Board_Floppy_Connector.equals(value)) {
                return VALUE_MAP_ENTRY_92_FOR_VALUE_ENTRY_On_Board_Floppy_Connector;
            }

            if (VALUE_ENTRY_9_Pin_Dual_Inline.equals(value)) {
                return VALUE_MAP_ENTRY_93_FOR_VALUE_ENTRY_9_Pin_Dual_Inline;
            }

            if (VALUE_ENTRY_25_Pin_Dual_Inline.equals(value)) {
                return VALUE_MAP_ENTRY_94_FOR_VALUE_ENTRY_25_Pin_Dual_Inline;
            }

            if (VALUE_ENTRY_50_Pin_Dual_Inline.equals(value)) {
                return VALUE_MAP_ENTRY_95_FOR_VALUE_ENTRY_50_Pin_Dual_Inline;
            }

            if (VALUE_ENTRY_68_Pin_Dual_Inline.equals(value)) {
                return VALUE_MAP_ENTRY_96_FOR_VALUE_ENTRY_68_Pin_Dual_Inline;
            }

            if (VALUE_ENTRY_On_Board_Sound_Connector.equals(value)) {
                return VALUE_MAP_ENTRY_97_FOR_VALUE_ENTRY_On_Board_Sound_Connector;
            }

            if (VALUE_ENTRY_Mini_jack.equals(value)) {
                return VALUE_MAP_ENTRY_98_FOR_VALUE_ENTRY_Mini_jack;
            }

            if (VALUE_ENTRY_PCI_X.equals(value)) {
                return VALUE_MAP_ENTRY_99_FOR_VALUE_ENTRY_PCI_X;
            }

            if (VALUE_ENTRY_Sbus_IEEE_1396_1993_32_bit.equals(value)) {
                return VALUE_MAP_ENTRY_100_FOR_VALUE_ENTRY_Sbus_IEEE_1396_1993_32_bit;
            }

            if (VALUE_ENTRY_Sbus_IEEE_1396_1993_64_bit.equals(value)) {
                return VALUE_MAP_ENTRY_101_FOR_VALUE_ENTRY_Sbus_IEEE_1396_1993_64_bit;
            }

            if (VALUE_ENTRY_MCA.equals(value)) {
                return VALUE_MAP_ENTRY_102_FOR_VALUE_ENTRY_MCA;
            }

            if (VALUE_ENTRY_GIO.equals(value)) {
                return VALUE_MAP_ENTRY_103_FOR_VALUE_ENTRY_GIO;
            }

            if (VALUE_ENTRY_XIO.equals(value)) {
                return VALUE_MAP_ENTRY_104_FOR_VALUE_ENTRY_XIO;
            }

            if (VALUE_ENTRY_HIO.equals(value)) {
                return VALUE_MAP_ENTRY_105_FOR_VALUE_ENTRY_HIO;
            }

            if (VALUE_ENTRY_NGIO.equals(value)) {
                return VALUE_MAP_ENTRY_106_FOR_VALUE_ENTRY_NGIO;
            }

            if (VALUE_ENTRY_PMC.equals(value)) {
                return VALUE_MAP_ENTRY_107_FOR_VALUE_ENTRY_PMC;
            }

            if (VALUE_ENTRY_MTRJ.equals(value)) {
                return VALUE_MAP_ENTRY_108_FOR_VALUE_ENTRY_MTRJ;
            }

            if (VALUE_ENTRY_VF_45.equals(value)) {
                return VALUE_MAP_ENTRY_109_FOR_VALUE_ENTRY_VF_45;
            }

            if (VALUE_ENTRY_Future_I_O.equals(value)) {
                return VALUE_MAP_ENTRY_110_FOR_VALUE_ENTRY_Future_I_O;
            }

            if (VALUE_ENTRY_SC.equals(value)) {
                return VALUE_MAP_ENTRY_111_FOR_VALUE_ENTRY_SC;
            }

            if (VALUE_ENTRY_SG.equals(value)) {
                return VALUE_MAP_ENTRY_112_FOR_VALUE_ENTRY_SG;
            }

            if (VALUE_ENTRY_Electrical.equals(value)) {
                return VALUE_MAP_ENTRY_113_FOR_VALUE_ENTRY_Electrical;
            }

            if (VALUE_ENTRY_Optical.equals(value)) {
                return VALUE_MAP_ENTRY_114_FOR_VALUE_ENTRY_Optical;
            }

            if (VALUE_ENTRY_Ribbon.equals(value)) {
                return VALUE_MAP_ENTRY_115_FOR_VALUE_ENTRY_Ribbon;
            }

            if (VALUE_ENTRY_GLM.equals(value)) {
                return VALUE_MAP_ENTRY_116_FOR_VALUE_ENTRY_GLM;
            }

            if (VALUE_ENTRY_1x9.equals(value)) {
                return VALUE_MAP_ENTRY_117_FOR_VALUE_ENTRY_1x9;
            }

            if (VALUE_ENTRY_Mini_SG.equals(value)) {
                return VALUE_MAP_ENTRY_118_FOR_VALUE_ENTRY_Mini_SG;
            }

            if (VALUE_ENTRY_LC.equals(value)) {
                return VALUE_MAP_ENTRY_119_FOR_VALUE_ENTRY_LC;
            }

            if (VALUE_ENTRY_HSSC.equals(value)) {
                return VALUE_MAP_ENTRY_120_FOR_VALUE_ENTRY_HSSC;
            }

            if (VALUE_ENTRY_VHDCI_Shielded__68_pins_.equals(value)) {
                return VALUE_MAP_ENTRY_121_FOR_VALUE_ENTRY_VHDCI_Shielded__68_pins_;
            }

            if (VALUE_ENTRY_InfiniBand.equals(value)) {
                return VALUE_MAP_ENTRY_122_FOR_VALUE_ENTRY_InfiniBand;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Male.intValue()) {
                return VALUE_ENTRY_Male;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Female.intValue()) {
                return VALUE_ENTRY_Female;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Shielded.intValue()) {
                return VALUE_ENTRY_Shielded;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Unshielded.intValue()) {
                return VALUE_ENTRY_Unshielded;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_SCSI__A__High_Density__50_pins_
                    .intValue()) {
                return VALUE_ENTRY_SCSI__A__High_Density__50_pins_;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_SCSI__A__Low_Density__50_pins_
                    .intValue()) {
                return VALUE_ENTRY_SCSI__A__Low_Density__50_pins_;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_SCSI__P__High_Density__68_pins_
                    .intValue()) {
                return VALUE_ENTRY_SCSI__P__High_Density__68_pins_;
            }

            if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_SCSI_SCA_I__80_pins_.intValue()) {
                return VALUE_ENTRY_SCSI_SCA_I__80_pins_;
            }

            if (iValue == VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_SCSI_SCA_II__80_pins_.intValue()) {
                return VALUE_ENTRY_SCSI_SCA_II__80_pins_;
            }

            if (iValue == VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Fibre_Channel__DB_9.intValue()) {
                return VALUE_ENTRY_Fibre_Channel__DB_9;
            }

            if (iValue == VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Copper_.intValue()) {
                return VALUE_ENTRY_Copper_;
            }

            if (iValue == VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Fibre_Channel__Optical_Fibre_
                    .intValue()) {
                return VALUE_ENTRY_Fibre_Channel__Optical_Fibre_;
            }

            if (iValue == VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_Fibre_Channel_SCA_II__40_pins_
                    .intValue()) {
                return VALUE_ENTRY_Fibre_Channel_SCA_II__40_pins_;
            }

            if (iValue == VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Fibre_Channel_SCA_II__20_pins_
                    .intValue()) {
                return VALUE_ENTRY_Fibre_Channel_SCA_II__20_pins_;
            }

            if (iValue == VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_Fibre_Channel_BNC.intValue()) {
                return VALUE_ENTRY_Fibre_Channel_BNC;
            }

            if (iValue == VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_ATA_3_1_2_Inch__40_pins_.intValue()) {
                return VALUE_ENTRY_ATA_3_1_2_Inch__40_pins_;
            }

            if (iValue == VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_ATA_2_1_2_Inch__44_pins_.intValue()) {
                return VALUE_ENTRY_ATA_2_1_2_Inch__44_pins_;
            }

            if (iValue == VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_ATA_2.intValue()) {
                return VALUE_ENTRY_ATA_2;
            }

            if (iValue == VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_ATA_3.intValue()) {
                return VALUE_ENTRY_ATA_3;
            }

            if (iValue == VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_ATA_66.intValue()) {
                return VALUE_ENTRY_ATA_66;
            }

            if (iValue == VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_DB_9.intValue()) {
                return VALUE_ENTRY_DB_9;
            }

            if (iValue == VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_DB_15.intValue()) {
                return VALUE_ENTRY_DB_15;
            }

            if (iValue == VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_DB_25.intValue()) {
                return VALUE_ENTRY_DB_25;
            }

            if (iValue == VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_DB_36.intValue()) {
                return VALUE_ENTRY_DB_36;
            }

            if (iValue == VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_RS_232C.intValue()) {
                return VALUE_ENTRY_RS_232C;
            }

            if (iValue == VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_RS_422.intValue()) {
                return VALUE_ENTRY_RS_422;
            }

            if (iValue == VALUE_MAP_ENTRY_28_FOR_VALUE_ENTRY_RS_423.intValue()) {
                return VALUE_ENTRY_RS_423;
            }

            if (iValue == VALUE_MAP_ENTRY_29_FOR_VALUE_ENTRY_RS_485.intValue()) {
                return VALUE_ENTRY_RS_485;
            }

            if (iValue == VALUE_MAP_ENTRY_30_FOR_VALUE_ENTRY_RS_449.intValue()) {
                return VALUE_ENTRY_RS_449;
            }

            if (iValue == VALUE_MAP_ENTRY_31_FOR_VALUE_ENTRY_V_35.intValue()) {
                return VALUE_ENTRY_V_35;
            }

            if (iValue == VALUE_MAP_ENTRY_32_FOR_VALUE_ENTRY_X_21.intValue()) {
                return VALUE_ENTRY_X_21;
            }

            if (iValue == VALUE_MAP_ENTRY_33_FOR_VALUE_ENTRY_IEEE_488.intValue()) {
                return VALUE_ENTRY_IEEE_488;
            }

            if (iValue == VALUE_MAP_ENTRY_34_FOR_VALUE_ENTRY_AUI.intValue()) {
                return VALUE_ENTRY_AUI;
            }

            if (iValue == VALUE_MAP_ENTRY_35_FOR_VALUE_ENTRY_UPT_Category_3.intValue()) {
                return VALUE_ENTRY_UPT_Category_3;
            }

            if (iValue == VALUE_MAP_ENTRY_36_FOR_VALUE_ENTRY_UPT_Category_4.intValue()) {
                return VALUE_ENTRY_UPT_Category_4;
            }

            if (iValue == VALUE_MAP_ENTRY_37_FOR_VALUE_ENTRY_UPT_Category_5.intValue()) {
                return VALUE_ENTRY_UPT_Category_5;
            }

            if (iValue == VALUE_MAP_ENTRY_38_FOR_VALUE_ENTRY_BNC.intValue()) {
                return VALUE_ENTRY_BNC;
            }

            if (iValue == VALUE_MAP_ENTRY_39_FOR_VALUE_ENTRY_RJ11.intValue()) {
                return VALUE_ENTRY_RJ11;
            }

            if (iValue == VALUE_MAP_ENTRY_40_FOR_VALUE_ENTRY_RJ45.intValue()) {
                return VALUE_ENTRY_RJ45;
            }

            if (iValue == VALUE_MAP_ENTRY_41_FOR_VALUE_ENTRY_Fiber_MIC.intValue()) {
                return VALUE_ENTRY_Fiber_MIC;
            }

            if (iValue == VALUE_MAP_ENTRY_42_FOR_VALUE_ENTRY_Apple_AUI.intValue()) {
                return VALUE_ENTRY_Apple_AUI;
            }

            if (iValue == VALUE_MAP_ENTRY_43_FOR_VALUE_ENTRY_Apple_GeoPort.intValue()) {
                return VALUE_ENTRY_Apple_GeoPort;
            }

            if (iValue == VALUE_MAP_ENTRY_44_FOR_VALUE_ENTRY_PCI.intValue()) {
                return VALUE_ENTRY_PCI;
            }

            if (iValue == VALUE_MAP_ENTRY_45_FOR_VALUE_ENTRY_ISA.intValue()) {
                return VALUE_ENTRY_ISA;
            }

            if (iValue == VALUE_MAP_ENTRY_46_FOR_VALUE_ENTRY_EISA.intValue()) {
                return VALUE_ENTRY_EISA;
            }

            if (iValue == VALUE_MAP_ENTRY_47_FOR_VALUE_ENTRY_VESA.intValue()) {
                return VALUE_ENTRY_VESA;
            }

            if (iValue == VALUE_MAP_ENTRY_48_FOR_VALUE_ENTRY_PCMCIA.intValue()) {
                return VALUE_ENTRY_PCMCIA;
            }

            if (iValue == VALUE_MAP_ENTRY_49_FOR_VALUE_ENTRY_PCMCIA_Type_I.intValue()) {
                return VALUE_ENTRY_PCMCIA_Type_I;
            }

            if (iValue == VALUE_MAP_ENTRY_50_FOR_VALUE_ENTRY_PCMCIA_Type_II.intValue()) {
                return VALUE_ENTRY_PCMCIA_Type_II;
            }

            if (iValue == VALUE_MAP_ENTRY_51_FOR_VALUE_ENTRY_PCMCIA_Type_III.intValue()) {
                return VALUE_ENTRY_PCMCIA_Type_III;
            }

            if (iValue == VALUE_MAP_ENTRY_52_FOR_VALUE_ENTRY_ZV_Port.intValue()) {
                return VALUE_ENTRY_ZV_Port;
            }

            if (iValue == VALUE_MAP_ENTRY_53_FOR_VALUE_ENTRY_CardBus.intValue()) {
                return VALUE_ENTRY_CardBus;
            }

            if (iValue == VALUE_MAP_ENTRY_54_FOR_VALUE_ENTRY_USB.intValue()) {
                return VALUE_ENTRY_USB;
            }

            if (iValue == VALUE_MAP_ENTRY_55_FOR_VALUE_ENTRY_IEEE_1394.intValue()) {
                return VALUE_ENTRY_IEEE_1394;
            }

            if (iValue == VALUE_MAP_ENTRY_56_FOR_VALUE_ENTRY_HIPPI.intValue()) {
                return VALUE_ENTRY_HIPPI;
            }

            if (iValue == VALUE_MAP_ENTRY_57_FOR_VALUE_ENTRY_HSSDC__6_pins_.intValue()) {
                return VALUE_ENTRY_HSSDC__6_pins_;
            }

            if (iValue == VALUE_MAP_ENTRY_58_FOR_VALUE_ENTRY_GBIC.intValue()) {
                return VALUE_ENTRY_GBIC;
            }

            if (iValue == VALUE_MAP_ENTRY_59_FOR_VALUE_ENTRY_DIN.intValue()) {
                return VALUE_ENTRY_DIN;
            }

            if (iValue == VALUE_MAP_ENTRY_60_FOR_VALUE_ENTRY_Mini_DIN.intValue()) {
                return VALUE_ENTRY_Mini_DIN;
            }

            if (iValue == VALUE_MAP_ENTRY_61_FOR_VALUE_ENTRY_Micro_DIN.intValue()) {
                return VALUE_ENTRY_Micro_DIN;
            }

            if (iValue == VALUE_MAP_ENTRY_62_FOR_VALUE_ENTRY_PS_2.intValue()) {
                return VALUE_ENTRY_PS_2;
            }

            if (iValue == VALUE_MAP_ENTRY_63_FOR_VALUE_ENTRY_Infrared.intValue()) {
                return VALUE_ENTRY_Infrared;
            }

            if (iValue == VALUE_MAP_ENTRY_64_FOR_VALUE_ENTRY_HP_HIL.intValue()) {
                return VALUE_ENTRY_HP_HIL;
            }

            if (iValue == VALUE_MAP_ENTRY_65_FOR_VALUE_ENTRY_Access_bus.intValue()) {
                return VALUE_ENTRY_Access_bus;
            }

            if (iValue == VALUE_MAP_ENTRY_66_FOR_VALUE_ENTRY_NuBus.intValue()) {
                return VALUE_ENTRY_NuBus;
            }

            if (iValue == VALUE_MAP_ENTRY_67_FOR_VALUE_ENTRY_Centronics.intValue()) {
                return VALUE_ENTRY_Centronics;
            }

            if (iValue == VALUE_MAP_ENTRY_68_FOR_VALUE_ENTRY_Mini_Centronics.intValue()) {
                return VALUE_ENTRY_Mini_Centronics;
            }

            if (iValue == VALUE_MAP_ENTRY_69_FOR_VALUE_ENTRY_Mini_Centronics_Type_14.intValue()) {
                return VALUE_ENTRY_Mini_Centronics_Type_14;
            }

            if (iValue == VALUE_MAP_ENTRY_70_FOR_VALUE_ENTRY_Mini_Centronics_Type_20.intValue()) {
                return VALUE_ENTRY_Mini_Centronics_Type_20;
            }

            if (iValue == VALUE_MAP_ENTRY_71_FOR_VALUE_ENTRY_Mini_Centronics_Type_26.intValue()) {
                return VALUE_ENTRY_Mini_Centronics_Type_26;
            }

            if (iValue == VALUE_MAP_ENTRY_72_FOR_VALUE_ENTRY_Bus_Mouse.intValue()) {
                return VALUE_ENTRY_Bus_Mouse;
            }

            if (iValue == VALUE_MAP_ENTRY_73_FOR_VALUE_ENTRY_ADB.intValue()) {
                return VALUE_ENTRY_ADB;
            }

            if (iValue == VALUE_MAP_ENTRY_74_FOR_VALUE_ENTRY_AGP.intValue()) {
                return VALUE_ENTRY_AGP;
            }

            if (iValue == VALUE_MAP_ENTRY_75_FOR_VALUE_ENTRY_VME_Bus.intValue()) {
                return VALUE_ENTRY_VME_Bus;
            }

            if (iValue == VALUE_MAP_ENTRY_76_FOR_VALUE_ENTRY_VME64.intValue()) {
                return VALUE_ENTRY_VME64;
            }

            if (iValue == VALUE_MAP_ENTRY_77_FOR_VALUE_ENTRY_Proprietary.intValue()) {
                return VALUE_ENTRY_Proprietary;
            }

            if (iValue == VALUE_MAP_ENTRY_78_FOR_VALUE_ENTRY_Proprietary_Processor_Card_Slot
                    .intValue()) {
                return VALUE_ENTRY_Proprietary_Processor_Card_Slot;
            }

            if (iValue == VALUE_MAP_ENTRY_79_FOR_VALUE_ENTRY_Proprietary_Memory_Card_Slot
                    .intValue()) {
                return VALUE_ENTRY_Proprietary_Memory_Card_Slot;
            }

            if (iValue == VALUE_MAP_ENTRY_80_FOR_VALUE_ENTRY_Proprietary_I_O_Riser_Slot.intValue()) {
                return VALUE_ENTRY_Proprietary_I_O_Riser_Slot;
            }

            if (iValue == VALUE_MAP_ENTRY_81_FOR_VALUE_ENTRY_PCI_66MHZ.intValue()) {
                return VALUE_ENTRY_PCI_66MHZ;
            }

            if (iValue == VALUE_MAP_ENTRY_82_FOR_VALUE_ENTRY_AGP2X.intValue()) {
                return VALUE_ENTRY_AGP2X;
            }

            if (iValue == VALUE_MAP_ENTRY_83_FOR_VALUE_ENTRY_AGP4X.intValue()) {
                return VALUE_ENTRY_AGP4X;
            }

            if (iValue == VALUE_MAP_ENTRY_84_FOR_VALUE_ENTRY_PC_98.intValue()) {
                return VALUE_ENTRY_PC_98;
            }

            if (iValue == VALUE_MAP_ENTRY_85_FOR_VALUE_ENTRY_PC_98_Hireso.intValue()) {
                return VALUE_ENTRY_PC_98_Hireso;
            }

            if (iValue == VALUE_MAP_ENTRY_86_FOR_VALUE_ENTRY_PC_H98.intValue()) {
                return VALUE_ENTRY_PC_H98;
            }

            if (iValue == VALUE_MAP_ENTRY_87_FOR_VALUE_ENTRY_PC_98Note.intValue()) {
                return VALUE_ENTRY_PC_98Note;
            }

            if (iValue == VALUE_MAP_ENTRY_88_FOR_VALUE_ENTRY_PC_98Full.intValue()) {
                return VALUE_ENTRY_PC_98Full;
            }

            if (iValue == VALUE_MAP_ENTRY_89_FOR_VALUE_ENTRY_SSA_SCSI.intValue()) {
                return VALUE_ENTRY_SSA_SCSI;
            }

            if (iValue == VALUE_MAP_ENTRY_90_FOR_VALUE_ENTRY_Circular.intValue()) {
                return VALUE_ENTRY_Circular;
            }

            if (iValue == VALUE_MAP_ENTRY_91_FOR_VALUE_ENTRY_On_Board_IDE_Connector.intValue()) {
                return VALUE_ENTRY_On_Board_IDE_Connector;
            }

            if (iValue == VALUE_MAP_ENTRY_92_FOR_VALUE_ENTRY_On_Board_Floppy_Connector.intValue()) {
                return VALUE_ENTRY_On_Board_Floppy_Connector;
            }

            if (iValue == VALUE_MAP_ENTRY_93_FOR_VALUE_ENTRY_9_Pin_Dual_Inline.intValue()) {
                return VALUE_ENTRY_9_Pin_Dual_Inline;
            }

            if (iValue == VALUE_MAP_ENTRY_94_FOR_VALUE_ENTRY_25_Pin_Dual_Inline.intValue()) {
                return VALUE_ENTRY_25_Pin_Dual_Inline;
            }

            if (iValue == VALUE_MAP_ENTRY_95_FOR_VALUE_ENTRY_50_Pin_Dual_Inline.intValue()) {
                return VALUE_ENTRY_50_Pin_Dual_Inline;
            }

            if (iValue == VALUE_MAP_ENTRY_96_FOR_VALUE_ENTRY_68_Pin_Dual_Inline.intValue()) {
                return VALUE_ENTRY_68_Pin_Dual_Inline;
            }

            if (iValue == VALUE_MAP_ENTRY_97_FOR_VALUE_ENTRY_On_Board_Sound_Connector.intValue()) {
                return VALUE_ENTRY_On_Board_Sound_Connector;
            }

            if (iValue == VALUE_MAP_ENTRY_98_FOR_VALUE_ENTRY_Mini_jack.intValue()) {
                return VALUE_ENTRY_Mini_jack;
            }

            if (iValue == VALUE_MAP_ENTRY_99_FOR_VALUE_ENTRY_PCI_X.intValue()) {
                return VALUE_ENTRY_PCI_X;
            }

            if (iValue == VALUE_MAP_ENTRY_100_FOR_VALUE_ENTRY_Sbus_IEEE_1396_1993_32_bit.intValue()) {
                return VALUE_ENTRY_Sbus_IEEE_1396_1993_32_bit;
            }

            if (iValue == VALUE_MAP_ENTRY_101_FOR_VALUE_ENTRY_Sbus_IEEE_1396_1993_64_bit.intValue()) {
                return VALUE_ENTRY_Sbus_IEEE_1396_1993_64_bit;
            }

            if (iValue == VALUE_MAP_ENTRY_102_FOR_VALUE_ENTRY_MCA.intValue()) {
                return VALUE_ENTRY_MCA;
            }

            if (iValue == VALUE_MAP_ENTRY_103_FOR_VALUE_ENTRY_GIO.intValue()) {
                return VALUE_ENTRY_GIO;
            }

            if (iValue == VALUE_MAP_ENTRY_104_FOR_VALUE_ENTRY_XIO.intValue()) {
                return VALUE_ENTRY_XIO;
            }

            if (iValue == VALUE_MAP_ENTRY_105_FOR_VALUE_ENTRY_HIO.intValue()) {
                return VALUE_ENTRY_HIO;
            }

            if (iValue == VALUE_MAP_ENTRY_106_FOR_VALUE_ENTRY_NGIO.intValue()) {
                return VALUE_ENTRY_NGIO;
            }

            if (iValue == VALUE_MAP_ENTRY_107_FOR_VALUE_ENTRY_PMC.intValue()) {
                return VALUE_ENTRY_PMC;
            }

            if (iValue == VALUE_MAP_ENTRY_108_FOR_VALUE_ENTRY_MTRJ.intValue()) {
                return VALUE_ENTRY_MTRJ;
            }

            if (iValue == VALUE_MAP_ENTRY_109_FOR_VALUE_ENTRY_VF_45.intValue()) {
                return VALUE_ENTRY_VF_45;
            }

            if (iValue == VALUE_MAP_ENTRY_110_FOR_VALUE_ENTRY_Future_I_O.intValue()) {
                return VALUE_ENTRY_Future_I_O;
            }

            if (iValue == VALUE_MAP_ENTRY_111_FOR_VALUE_ENTRY_SC.intValue()) {
                return VALUE_ENTRY_SC;
            }

            if (iValue == VALUE_MAP_ENTRY_112_FOR_VALUE_ENTRY_SG.intValue()) {
                return VALUE_ENTRY_SG;
            }

            if (iValue == VALUE_MAP_ENTRY_113_FOR_VALUE_ENTRY_Electrical.intValue()) {
                return VALUE_ENTRY_Electrical;
            }

            if (iValue == VALUE_MAP_ENTRY_114_FOR_VALUE_ENTRY_Optical.intValue()) {
                return VALUE_ENTRY_Optical;
            }

            if (iValue == VALUE_MAP_ENTRY_115_FOR_VALUE_ENTRY_Ribbon.intValue()) {
                return VALUE_ENTRY_Ribbon;
            }

            if (iValue == VALUE_MAP_ENTRY_116_FOR_VALUE_ENTRY_GLM.intValue()) {
                return VALUE_ENTRY_GLM;
            }

            if (iValue == VALUE_MAP_ENTRY_117_FOR_VALUE_ENTRY_1x9.intValue()) {
                return VALUE_ENTRY_1x9;
            }

            if (iValue == VALUE_MAP_ENTRY_118_FOR_VALUE_ENTRY_Mini_SG.intValue()) {
                return VALUE_ENTRY_Mini_SG;
            }

            if (iValue == VALUE_MAP_ENTRY_119_FOR_VALUE_ENTRY_LC.intValue()) {
                return VALUE_ENTRY_LC;
            }

            if (iValue == VALUE_MAP_ENTRY_120_FOR_VALUE_ENTRY_HSSC.intValue()) {
                return VALUE_ENTRY_HSSC;
            }

            if (iValue == VALUE_MAP_ENTRY_121_FOR_VALUE_ENTRY_VHDCI_Shielded__68_pins_.intValue()) {
                return VALUE_ENTRY_VHDCI_Shielded__68_pins_;
            }

            if (iValue == VALUE_MAP_ENTRY_122_FOR_VALUE_ENTRY_InfiniBand.intValue()) {
                return VALUE_ENTRY_InfiniBand;
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
         * Value Map for the property ConnectorType   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Male, VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Female,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Shielded,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Unshielded,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_SCSI__A__High_Density__50_pins_,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_SCSI__A__Low_Density__50_pins_,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_SCSI__P__High_Density__68_pins_,
                VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_SCSI_SCA_I__80_pins_,
                VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_SCSI_SCA_II__80_pins_,
                VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Fibre_Channel__DB_9,
                VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Copper_,
                VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Fibre_Channel__Optical_Fibre_,
                VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_Fibre_Channel_SCA_II__40_pins_,
                VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Fibre_Channel_SCA_II__20_pins_,
                VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_Fibre_Channel_BNC,
                VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_ATA_3_1_2_Inch__40_pins_,
                VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_ATA_2_1_2_Inch__44_pins_,
                VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_ATA_2, VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_ATA_3,
                VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_ATA_66, VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_DB_9,
                VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_DB_15, VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_DB_25,
                VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_DB_36,
                VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_RS_232C,
                VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_RS_422,
                VALUE_MAP_ENTRY_28_FOR_VALUE_ENTRY_RS_423,
                VALUE_MAP_ENTRY_29_FOR_VALUE_ENTRY_RS_485,
                VALUE_MAP_ENTRY_30_FOR_VALUE_ENTRY_RS_449, VALUE_MAP_ENTRY_31_FOR_VALUE_ENTRY_V_35,
                VALUE_MAP_ENTRY_32_FOR_VALUE_ENTRY_X_21,
                VALUE_MAP_ENTRY_33_FOR_VALUE_ENTRY_IEEE_488,
                VALUE_MAP_ENTRY_34_FOR_VALUE_ENTRY_AUI,
                VALUE_MAP_ENTRY_35_FOR_VALUE_ENTRY_UPT_Category_3,
                VALUE_MAP_ENTRY_36_FOR_VALUE_ENTRY_UPT_Category_4,
                VALUE_MAP_ENTRY_37_FOR_VALUE_ENTRY_UPT_Category_5,
                VALUE_MAP_ENTRY_38_FOR_VALUE_ENTRY_BNC, VALUE_MAP_ENTRY_39_FOR_VALUE_ENTRY_RJ11,
                VALUE_MAP_ENTRY_40_FOR_VALUE_ENTRY_RJ45,
                VALUE_MAP_ENTRY_41_FOR_VALUE_ENTRY_Fiber_MIC,
                VALUE_MAP_ENTRY_42_FOR_VALUE_ENTRY_Apple_AUI,
                VALUE_MAP_ENTRY_43_FOR_VALUE_ENTRY_Apple_GeoPort,
                VALUE_MAP_ENTRY_44_FOR_VALUE_ENTRY_PCI, VALUE_MAP_ENTRY_45_FOR_VALUE_ENTRY_ISA,
                VALUE_MAP_ENTRY_46_FOR_VALUE_ENTRY_EISA, VALUE_MAP_ENTRY_47_FOR_VALUE_ENTRY_VESA,
                VALUE_MAP_ENTRY_48_FOR_VALUE_ENTRY_PCMCIA,
                VALUE_MAP_ENTRY_49_FOR_VALUE_ENTRY_PCMCIA_Type_I,
                VALUE_MAP_ENTRY_50_FOR_VALUE_ENTRY_PCMCIA_Type_II,
                VALUE_MAP_ENTRY_51_FOR_VALUE_ENTRY_PCMCIA_Type_III,
                VALUE_MAP_ENTRY_52_FOR_VALUE_ENTRY_ZV_Port,
                VALUE_MAP_ENTRY_53_FOR_VALUE_ENTRY_CardBus, VALUE_MAP_ENTRY_54_FOR_VALUE_ENTRY_USB,
                VALUE_MAP_ENTRY_55_FOR_VALUE_ENTRY_IEEE_1394,
                VALUE_MAP_ENTRY_56_FOR_VALUE_ENTRY_HIPPI,
                VALUE_MAP_ENTRY_57_FOR_VALUE_ENTRY_HSSDC__6_pins_,
                VALUE_MAP_ENTRY_58_FOR_VALUE_ENTRY_GBIC, VALUE_MAP_ENTRY_59_FOR_VALUE_ENTRY_DIN,
                VALUE_MAP_ENTRY_60_FOR_VALUE_ENTRY_Mini_DIN,
                VALUE_MAP_ENTRY_61_FOR_VALUE_ENTRY_Micro_DIN,
                VALUE_MAP_ENTRY_62_FOR_VALUE_ENTRY_PS_2,
                VALUE_MAP_ENTRY_63_FOR_VALUE_ENTRY_Infrared,
                VALUE_MAP_ENTRY_64_FOR_VALUE_ENTRY_HP_HIL,
                VALUE_MAP_ENTRY_65_FOR_VALUE_ENTRY_Access_bus,
                VALUE_MAP_ENTRY_66_FOR_VALUE_ENTRY_NuBus,
                VALUE_MAP_ENTRY_67_FOR_VALUE_ENTRY_Centronics,
                VALUE_MAP_ENTRY_68_FOR_VALUE_ENTRY_Mini_Centronics,
                VALUE_MAP_ENTRY_69_FOR_VALUE_ENTRY_Mini_Centronics_Type_14,
                VALUE_MAP_ENTRY_70_FOR_VALUE_ENTRY_Mini_Centronics_Type_20,
                VALUE_MAP_ENTRY_71_FOR_VALUE_ENTRY_Mini_Centronics_Type_26,
                VALUE_MAP_ENTRY_72_FOR_VALUE_ENTRY_Bus_Mouse,
                VALUE_MAP_ENTRY_73_FOR_VALUE_ENTRY_ADB, VALUE_MAP_ENTRY_74_FOR_VALUE_ENTRY_AGP,
                VALUE_MAP_ENTRY_75_FOR_VALUE_ENTRY_VME_Bus,
                VALUE_MAP_ENTRY_76_FOR_VALUE_ENTRY_VME64,
                VALUE_MAP_ENTRY_77_FOR_VALUE_ENTRY_Proprietary,
                VALUE_MAP_ENTRY_78_FOR_VALUE_ENTRY_Proprietary_Processor_Card_Slot,
                VALUE_MAP_ENTRY_79_FOR_VALUE_ENTRY_Proprietary_Memory_Card_Slot,
                VALUE_MAP_ENTRY_80_FOR_VALUE_ENTRY_Proprietary_I_O_Riser_Slot,
                VALUE_MAP_ENTRY_81_FOR_VALUE_ENTRY_PCI_66MHZ,
                VALUE_MAP_ENTRY_82_FOR_VALUE_ENTRY_AGP2X, VALUE_MAP_ENTRY_83_FOR_VALUE_ENTRY_AGP4X,
                VALUE_MAP_ENTRY_84_FOR_VALUE_ENTRY_PC_98,
                VALUE_MAP_ENTRY_85_FOR_VALUE_ENTRY_PC_98_Hireso,
                VALUE_MAP_ENTRY_86_FOR_VALUE_ENTRY_PC_H98,
                VALUE_MAP_ENTRY_87_FOR_VALUE_ENTRY_PC_98Note,
                VALUE_MAP_ENTRY_88_FOR_VALUE_ENTRY_PC_98Full,
                VALUE_MAP_ENTRY_89_FOR_VALUE_ENTRY_SSA_SCSI,
                VALUE_MAP_ENTRY_90_FOR_VALUE_ENTRY_Circular,
                VALUE_MAP_ENTRY_91_FOR_VALUE_ENTRY_On_Board_IDE_Connector,
                VALUE_MAP_ENTRY_92_FOR_VALUE_ENTRY_On_Board_Floppy_Connector,
                VALUE_MAP_ENTRY_93_FOR_VALUE_ENTRY_9_Pin_Dual_Inline,
                VALUE_MAP_ENTRY_94_FOR_VALUE_ENTRY_25_Pin_Dual_Inline,
                VALUE_MAP_ENTRY_95_FOR_VALUE_ENTRY_50_Pin_Dual_Inline,
                VALUE_MAP_ENTRY_96_FOR_VALUE_ENTRY_68_Pin_Dual_Inline,
                VALUE_MAP_ENTRY_97_FOR_VALUE_ENTRY_On_Board_Sound_Connector,
                VALUE_MAP_ENTRY_98_FOR_VALUE_ENTRY_Mini_jack,
                VALUE_MAP_ENTRY_99_FOR_VALUE_ENTRY_PCI_X,
                VALUE_MAP_ENTRY_100_FOR_VALUE_ENTRY_Sbus_IEEE_1396_1993_32_bit,
                VALUE_MAP_ENTRY_101_FOR_VALUE_ENTRY_Sbus_IEEE_1396_1993_64_bit,
                VALUE_MAP_ENTRY_102_FOR_VALUE_ENTRY_MCA, VALUE_MAP_ENTRY_103_FOR_VALUE_ENTRY_GIO,
                VALUE_MAP_ENTRY_104_FOR_VALUE_ENTRY_XIO, VALUE_MAP_ENTRY_105_FOR_VALUE_ENTRY_HIO,
                VALUE_MAP_ENTRY_106_FOR_VALUE_ENTRY_NGIO, VALUE_MAP_ENTRY_107_FOR_VALUE_ENTRY_PMC,
                VALUE_MAP_ENTRY_108_FOR_VALUE_ENTRY_MTRJ,
                VALUE_MAP_ENTRY_109_FOR_VALUE_ENTRY_VF_45,
                VALUE_MAP_ENTRY_110_FOR_VALUE_ENTRY_Future_I_O,
                VALUE_MAP_ENTRY_111_FOR_VALUE_ENTRY_SC, VALUE_MAP_ENTRY_112_FOR_VALUE_ENTRY_SG,
                VALUE_MAP_ENTRY_113_FOR_VALUE_ENTRY_Electrical,
                VALUE_MAP_ENTRY_114_FOR_VALUE_ENTRY_Optical,
                VALUE_MAP_ENTRY_115_FOR_VALUE_ENTRY_Ribbon,
                VALUE_MAP_ENTRY_116_FOR_VALUE_ENTRY_GLM, VALUE_MAP_ENTRY_117_FOR_VALUE_ENTRY_1x9,
                VALUE_MAP_ENTRY_118_FOR_VALUE_ENTRY_Mini_SG,
                VALUE_MAP_ENTRY_119_FOR_VALUE_ENTRY_LC, VALUE_MAP_ENTRY_120_FOR_VALUE_ENTRY_HSSC,
                VALUE_MAP_ENTRY_121_FOR_VALUE_ENTRY_VHDCI_Shielded__68_pins_,
                VALUE_MAP_ENTRY_122_FOR_VALUE_ENTRY_InfiniBand };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property ConnectorType   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_Male, VALUE_ENTRY_Female, VALUE_ENTRY_Shielded, VALUE_ENTRY_Unshielded,
                VALUE_ENTRY_SCSI__A__High_Density__50_pins_,
                VALUE_ENTRY_SCSI__A__Low_Density__50_pins_,
                VALUE_ENTRY_SCSI__P__High_Density__68_pins_, VALUE_ENTRY_SCSI_SCA_I__80_pins_,
                VALUE_ENTRY_SCSI_SCA_II__80_pins_, VALUE_ENTRY_Fibre_Channel__DB_9,
                VALUE_ENTRY_Copper_, VALUE_ENTRY_Fibre_Channel__Optical_Fibre_,
                VALUE_ENTRY_Fibre_Channel_SCA_II__40_pins_,
                VALUE_ENTRY_Fibre_Channel_SCA_II__20_pins_, VALUE_ENTRY_Fibre_Channel_BNC,
                VALUE_ENTRY_ATA_3_1_2_Inch__40_pins_, VALUE_ENTRY_ATA_2_1_2_Inch__44_pins_,
                VALUE_ENTRY_ATA_2, VALUE_ENTRY_ATA_3, VALUE_ENTRY_ATA_66, VALUE_ENTRY_DB_9,
                VALUE_ENTRY_DB_15, VALUE_ENTRY_DB_25, VALUE_ENTRY_DB_36, VALUE_ENTRY_RS_232C,
                VALUE_ENTRY_RS_422, VALUE_ENTRY_RS_423, VALUE_ENTRY_RS_485, VALUE_ENTRY_RS_449,
                VALUE_ENTRY_V_35, VALUE_ENTRY_X_21, VALUE_ENTRY_IEEE_488, VALUE_ENTRY_AUI,
                VALUE_ENTRY_UPT_Category_3, VALUE_ENTRY_UPT_Category_4, VALUE_ENTRY_UPT_Category_5,
                VALUE_ENTRY_BNC, VALUE_ENTRY_RJ11, VALUE_ENTRY_RJ45, VALUE_ENTRY_Fiber_MIC,
                VALUE_ENTRY_Apple_AUI, VALUE_ENTRY_Apple_GeoPort, VALUE_ENTRY_PCI, VALUE_ENTRY_ISA,
                VALUE_ENTRY_EISA, VALUE_ENTRY_VESA, VALUE_ENTRY_PCMCIA, VALUE_ENTRY_PCMCIA_Type_I,
                VALUE_ENTRY_PCMCIA_Type_II, VALUE_ENTRY_PCMCIA_Type_III, VALUE_ENTRY_ZV_Port,
                VALUE_ENTRY_CardBus, VALUE_ENTRY_USB, VALUE_ENTRY_IEEE_1394, VALUE_ENTRY_HIPPI,
                VALUE_ENTRY_HSSDC__6_pins_, VALUE_ENTRY_GBIC, VALUE_ENTRY_DIN,
                VALUE_ENTRY_Mini_DIN, VALUE_ENTRY_Micro_DIN, VALUE_ENTRY_PS_2,
                VALUE_ENTRY_Infrared, VALUE_ENTRY_HP_HIL, VALUE_ENTRY_Access_bus,
                VALUE_ENTRY_NuBus, VALUE_ENTRY_Centronics, VALUE_ENTRY_Mini_Centronics,
                VALUE_ENTRY_Mini_Centronics_Type_14, VALUE_ENTRY_Mini_Centronics_Type_20,
                VALUE_ENTRY_Mini_Centronics_Type_26, VALUE_ENTRY_Bus_Mouse, VALUE_ENTRY_ADB,
                VALUE_ENTRY_AGP, VALUE_ENTRY_VME_Bus, VALUE_ENTRY_VME64, VALUE_ENTRY_Proprietary,
                VALUE_ENTRY_Proprietary_Processor_Card_Slot,
                VALUE_ENTRY_Proprietary_Memory_Card_Slot, VALUE_ENTRY_Proprietary_I_O_Riser_Slot,
                VALUE_ENTRY_PCI_66MHZ, VALUE_ENTRY_AGP2X, VALUE_ENTRY_AGP4X, VALUE_ENTRY_PC_98,
                VALUE_ENTRY_PC_98_Hireso, VALUE_ENTRY_PC_H98, VALUE_ENTRY_PC_98Note,
                VALUE_ENTRY_PC_98Full, VALUE_ENTRY_SSA_SCSI, VALUE_ENTRY_Circular,
                VALUE_ENTRY_On_Board_IDE_Connector, VALUE_ENTRY_On_Board_Floppy_Connector,
                VALUE_ENTRY_9_Pin_Dual_Inline, VALUE_ENTRY_25_Pin_Dual_Inline,
                VALUE_ENTRY_50_Pin_Dual_Inline, VALUE_ENTRY_68_Pin_Dual_Inline,
                VALUE_ENTRY_On_Board_Sound_Connector, VALUE_ENTRY_Mini_jack, VALUE_ENTRY_PCI_X,
                VALUE_ENTRY_Sbus_IEEE_1396_1993_32_bit, VALUE_ENTRY_Sbus_IEEE_1396_1993_64_bit,
                VALUE_ENTRY_MCA, VALUE_ENTRY_GIO, VALUE_ENTRY_XIO, VALUE_ENTRY_HIO,
                VALUE_ENTRY_NGIO, VALUE_ENTRY_PMC, VALUE_ENTRY_MTRJ, VALUE_ENTRY_VF_45,
                VALUE_ENTRY_Future_I_O, VALUE_ENTRY_SC, VALUE_ENTRY_SG, VALUE_ENTRY_Electrical,
                VALUE_ENTRY_Optical, VALUE_ENTRY_Ribbon, VALUE_ENTRY_GLM, VALUE_ENTRY_1x9,
                VALUE_ENTRY_Mini_SG, VALUE_ENTRY_LC, VALUE_ENTRY_HSSC,
                VALUE_ENTRY_VHDCI_Shielded__68_pins_, VALUE_ENTRY_InfiniBand };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property ConnectorType   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_Male, VALUE_ENTRY_Female, VALUE_ENTRY_Shielded,
                VALUE_ENTRY_Unshielded, VALUE_ENTRY_SCSI__A__High_Density__50_pins_,
                VALUE_ENTRY_SCSI__A__Low_Density__50_pins_,
                VALUE_ENTRY_SCSI__P__High_Density__68_pins_, VALUE_ENTRY_SCSI_SCA_I__80_pins_,
                VALUE_ENTRY_SCSI_SCA_II__80_pins_, VALUE_ENTRY_Fibre_Channel__DB_9,
                VALUE_ENTRY_Copper_, VALUE_ENTRY_Fibre_Channel__Optical_Fibre_,
                VALUE_ENTRY_Fibre_Channel_SCA_II__40_pins_,
                VALUE_ENTRY_Fibre_Channel_SCA_II__20_pins_, VALUE_ENTRY_Fibre_Channel_BNC,
                VALUE_ENTRY_ATA_3_1_2_Inch__40_pins_, VALUE_ENTRY_ATA_2_1_2_Inch__44_pins_,
                VALUE_ENTRY_ATA_2, VALUE_ENTRY_ATA_3, VALUE_ENTRY_ATA_66, VALUE_ENTRY_DB_9,
                VALUE_ENTRY_DB_15, VALUE_ENTRY_DB_25, VALUE_ENTRY_DB_36, VALUE_ENTRY_RS_232C,
                VALUE_ENTRY_RS_422, VALUE_ENTRY_RS_423, VALUE_ENTRY_RS_485, VALUE_ENTRY_RS_449,
                VALUE_ENTRY_V_35, VALUE_ENTRY_X_21, VALUE_ENTRY_IEEE_488, VALUE_ENTRY_AUI,
                VALUE_ENTRY_UPT_Category_3, VALUE_ENTRY_UPT_Category_4, VALUE_ENTRY_UPT_Category_5,
                VALUE_ENTRY_BNC, VALUE_ENTRY_RJ11, VALUE_ENTRY_RJ45, VALUE_ENTRY_Fiber_MIC,
                VALUE_ENTRY_Apple_AUI, VALUE_ENTRY_Apple_GeoPort, VALUE_ENTRY_PCI, VALUE_ENTRY_ISA,
                VALUE_ENTRY_EISA, VALUE_ENTRY_VESA, VALUE_ENTRY_PCMCIA, VALUE_ENTRY_PCMCIA_Type_I,
                VALUE_ENTRY_PCMCIA_Type_II, VALUE_ENTRY_PCMCIA_Type_III, VALUE_ENTRY_ZV_Port,
                VALUE_ENTRY_CardBus, VALUE_ENTRY_USB, VALUE_ENTRY_IEEE_1394, VALUE_ENTRY_HIPPI,
                VALUE_ENTRY_HSSDC__6_pins_, VALUE_ENTRY_GBIC, VALUE_ENTRY_DIN,
                VALUE_ENTRY_Mini_DIN, VALUE_ENTRY_Micro_DIN, VALUE_ENTRY_PS_2,
                VALUE_ENTRY_Infrared, VALUE_ENTRY_HP_HIL, VALUE_ENTRY_Access_bus,
                VALUE_ENTRY_NuBus, VALUE_ENTRY_Centronics, VALUE_ENTRY_Mini_Centronics,
                VALUE_ENTRY_Mini_Centronics_Type_14, VALUE_ENTRY_Mini_Centronics_Type_20,
                VALUE_ENTRY_Mini_Centronics_Type_26, VALUE_ENTRY_Bus_Mouse, VALUE_ENTRY_ADB,
                VALUE_ENTRY_AGP, VALUE_ENTRY_VME_Bus, VALUE_ENTRY_VME64, VALUE_ENTRY_Proprietary,
                VALUE_ENTRY_Proprietary_Processor_Card_Slot,
                VALUE_ENTRY_Proprietary_Memory_Card_Slot, VALUE_ENTRY_Proprietary_I_O_Riser_Slot,
                VALUE_ENTRY_PCI_66MHZ, VALUE_ENTRY_AGP2X, VALUE_ENTRY_AGP4X, VALUE_ENTRY_PC_98,
                VALUE_ENTRY_PC_98_Hireso, VALUE_ENTRY_PC_H98, VALUE_ENTRY_PC_98Note,
                VALUE_ENTRY_PC_98Full, VALUE_ENTRY_SSA_SCSI, VALUE_ENTRY_Circular,
                VALUE_ENTRY_On_Board_IDE_Connector, VALUE_ENTRY_On_Board_Floppy_Connector,
                VALUE_ENTRY_9_Pin_Dual_Inline, VALUE_ENTRY_25_Pin_Dual_Inline,
                VALUE_ENTRY_50_Pin_Dual_Inline, VALUE_ENTRY_68_Pin_Dual_Inline,
                VALUE_ENTRY_On_Board_Sound_Connector, VALUE_ENTRY_Mini_jack, VALUE_ENTRY_PCI_X,
                VALUE_ENTRY_Sbus_IEEE_1396_1993_32_bit, VALUE_ENTRY_Sbus_IEEE_1396_1993_64_bit,
                VALUE_ENTRY_MCA, VALUE_ENTRY_GIO, VALUE_ENTRY_XIO, VALUE_ENTRY_HIO,
                VALUE_ENTRY_NGIO, VALUE_ENTRY_PMC, VALUE_ENTRY_MTRJ, VALUE_ENTRY_VF_45,
                VALUE_ENTRY_Future_I_O, VALUE_ENTRY_SC, VALUE_ENTRY_SG, VALUE_ENTRY_Electrical,
                VALUE_ENTRY_Optical, VALUE_ENTRY_Ribbon, VALUE_ENTRY_GLM, VALUE_ENTRY_1x9,
                VALUE_ENTRY_Mini_SG, VALUE_ENTRY_LC, VALUE_ENTRY_HSSC,
                VALUE_ENTRY_VHDCI_Shielded__68_pins_, VALUE_ENTRY_InfiniBand };

    }

    /**
     * Constants of property NumPhysicalPins
     * Describes the number of physical pins (male/female) that are present on this connector.
     */
    public static class PROPERTY_NUMPHYSICALPINS {
        /**
         * name of the property NumPhysicalPins
         */
        public final static String NAME = "NumPhysicalPins";

    }

    /**
     * Constants of property OtherElectricalCharacteristics
     * A string describing the connector's electrical characteristics - used when the ConnectorElectricalCharacteristics property contains an entry of 1 (Other). OtherElectricalCharacteristics should be set to NULL when ConnectorElectricalCharacteristics does not contain an value of 1.
     */
    public static class PROPERTY_OTHERELECTRICALCHARACTERISTICS {
        /**
         * name of the property OtherElectricalCharacteristics
         */
        public final static String NAME = "OtherElectricalCharacteristics";

    }

    /**
     * Constants of property OtherTypeDescription
     * A string describing the Connector - used when the ConnectorType property is set to 1 ("Other"). OtherType Description should be set to NULL when ConnectorType is any value other than 1. 
     * The use of this property is deprecated in lieu of Connector Description.
     */
    public static class PROPERTY_OTHERTYPEDESCRIPTION {
        /**
         * name of the property OtherTypeDescription
         */
        public final static String NAME = "OtherTypeDescription";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_PhysicalElement.getPackages();

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
     *   The PhysicalConnector class represents any PhysicalElement that is used to connect to other Elements. Any object that can be used to connect and transmit signals or power between two or more PhysicalElements is a descendant (or member) of this class. For example, Slots and D-shell connectors are types of PhysicalConnectors.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_PhysicalConnector(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   The PhysicalConnector class represents any PhysicalElement that is used to connect to other Elements. Any object that can be used to connect and transmit signals or power between two or more PhysicalElements is a descendant (or member) of this class. For example, Slots and D-shell connectors are types of PhysicalConnectors.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_PhysicalConnector(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_PhysicalConnector() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("ConnectorDescription", new CIMProperty("ConnectorDescription",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("ConnectorElectricalCharacteristics", new CIMProperty(
                "ConnectorElectricalCharacteristics", CIMDataType.UINT16_ARRAY_T, null));
        propertiesToCheck.put("ConnectorGender", new CIMProperty("ConnectorGender",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("ConnectorLayout", new CIMProperty("ConnectorLayout",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("ConnectorPinout", new CIMProperty("ConnectorPinout",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("ConnectorType", new CIMProperty("ConnectorType",
                CIMDataType.UINT16_ARRAY_T, null));
        propertiesToCheck.put("NumPhysicalPins", new CIMProperty("NumPhysicalPins",
                CIMDataType.UINT32_T, null));
        propertiesToCheck.put("OtherElectricalCharacteristics", new CIMProperty(
                "OtherElectricalCharacteristics", CIMDataType.STRING_ARRAY_T, null));
        propertiesToCheck.put("OtherTypeDescription", new CIMProperty("OtherTypeDescription",
                CIMDataType.STRING_T, null));

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
     * Get the property ConnectorDescription
     *     * <br>
     * A string describing the Connector - used when the ConnectorLayout property is set to 1 ("Other"). Connector Description should be set to NULL when ConnectorLayout is any value other than 1.
     *     */

    public String get_ConnectorDescription() {
        CIMProperty currentProperty = getProperty(PROPERTY_CONNECTORDESCRIPTION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CONNECTORDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property ConnectorDescription
     * <br>
     * A string describing the Connector - used when the ConnectorLayout property is set to 1 ("Other"). Connector Description should be set to NULL when ConnectorLayout is any value other than 1.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ConnectorDescription(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CONNECTORDESCRIPTION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ConnectorDescription(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CONNECTORDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ConnectorDescription by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ConnectorDescription(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_PhysicalConnector fco = new CIM_PhysicalConnector(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CONNECTORDESCRIPTION.NAME);
        if (property != null) {
            property = setPropertyValue_ConnectorDescription(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CONNECTORDESCRIPTION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ConnectorDescription
     * <br>
     * A string describing the Connector - used when the ConnectorLayout property is set to 1 ("Other"). Connector Description should be set to NULL when ConnectorLayout is any value other than 1.
     */

    private static CIMProperty setPropertyValue_ConnectorDescription(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ConnectorElectricalCharacteristics
     *     * <br>
     * Describes the electrical characteristic for this connector.
     *     */

    public javax.cim.UnsignedInteger16[] get_ConnectorElectricalCharacteristics() {
        CIMProperty currentProperty = getProperty(PROPERTY_CONNECTORELECTRICALCHARACTERISTICS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CONNECTORELECTRICALCHARACTERISTICS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16[]) currentProperty.getValue();

    }

    /**
     * Set the property ConnectorElectricalCharacteristics
     * <br>
     * Describes the electrical characteristic for this connector.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ConnectorElectricalCharacteristics(javax.cim.UnsignedInteger16[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CONNECTORELECTRICALCHARACTERISTICS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ConnectorElectricalCharacteristics(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CONNECTORELECTRICALCHARACTERISTICS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ConnectorElectricalCharacteristics by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ConnectorElectricalCharacteristics(WBEMClient client,
            String namespace, javax.cim.UnsignedInteger16[] newValue) throws WbemsmtException {
        CIM_PhysicalConnector fco = new CIM_PhysicalConnector(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CONNECTORELECTRICALCHARACTERISTICS.NAME);
        if (property != null) {
            property = setPropertyValue_ConnectorElectricalCharacteristics(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CONNECTORELECTRICALCHARACTERISTICS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ConnectorElectricalCharacteristics
     * <br>
     * Describes the electrical characteristic for this connector.
     */

    private static CIMProperty setPropertyValue_ConnectorElectricalCharacteristics(
            CIMProperty currentProperty, javax.cim.UnsignedInteger16[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ConnectorGender
     *     * <br>
     * Describes the gender of the connector.
     *     */

    public javax.cim.UnsignedInteger16 get_ConnectorGender() {
        CIMProperty currentProperty = getProperty(PROPERTY_CONNECTORGENDER.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CONNECTORGENDER.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property ConnectorGender
     * <br>
     * Describes the gender of the connector.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ConnectorGender(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CONNECTORGENDER.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ConnectorGender(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CONNECTORGENDER.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ConnectorGender by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ConnectorGender(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_PhysicalConnector fco = new CIM_PhysicalConnector(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CONNECTORGENDER.NAME);
        if (property != null) {
            property = setPropertyValue_ConnectorGender(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CONNECTORGENDER.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ConnectorGender
     * <br>
     * Describes the gender of the connector.
     */

    private static CIMProperty setPropertyValue_ConnectorGender(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ConnectorLayout
     *     * <br>
     * Describes the type of packaging normally associated with this type of connector.
     *     */

    public javax.cim.UnsignedInteger16 get_ConnectorLayout() {
        CIMProperty currentProperty = getProperty(PROPERTY_CONNECTORLAYOUT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CONNECTORLAYOUT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property ConnectorLayout
     * <br>
     * Describes the type of packaging normally associated with this type of connector.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ConnectorLayout(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CONNECTORLAYOUT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ConnectorLayout(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CONNECTORLAYOUT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ConnectorLayout by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ConnectorLayout(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_PhysicalConnector fco = new CIM_PhysicalConnector(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CONNECTORLAYOUT.NAME);
        if (property != null) {
            property = setPropertyValue_ConnectorLayout(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CONNECTORLAYOUT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ConnectorLayout
     * <br>
     * Describes the type of packaging normally associated with this type of connector.
     */

    private static CIMProperty setPropertyValue_ConnectorLayout(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ConnectorPinout
     *     * <br>
     * A free-form string describing the pin configuration and/or signal usage of a PhysicalConnector.
     *     */

    public String get_ConnectorPinout() {
        CIMProperty currentProperty = getProperty(PROPERTY_CONNECTORPINOUT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CONNECTORPINOUT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property ConnectorPinout
     * <br>
     * A free-form string describing the pin configuration and/or signal usage of a PhysicalConnector.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ConnectorPinout(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CONNECTORPINOUT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ConnectorPinout(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CONNECTORPINOUT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ConnectorPinout by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ConnectorPinout(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_PhysicalConnector fco = new CIM_PhysicalConnector(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CONNECTORPINOUT.NAME);
        if (property != null) {
            property = setPropertyValue_ConnectorPinout(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CONNECTORPINOUT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ConnectorPinout
     * <br>
     * A free-form string describing the pin configuration and/or signal usage of a PhysicalConnector.
     */

    private static CIMProperty setPropertyValue_ConnectorPinout(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ConnectorType
     *     * <br>
     * An array of integers defining the type of PhysicalConnector. An array is specified to allow the description of 'combinations' of Connector information. For example, one array entry could specify RS-232 (value=25), another DB-25 (value=23) and a third entry define the Connector as "Male" (value=2). 
     * This single property is being deprecated in lieu of using separate properties to describe the various aspects of the connector. The separation allows for a more generic means of describing the connectors. Obsolete connectors were intentionally removed from the new list.
     *     */

    public javax.cim.UnsignedInteger16[] get_ConnectorType() {
        CIMProperty currentProperty = getProperty(PROPERTY_CONNECTORTYPE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CONNECTORTYPE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16[]) currentProperty.getValue();

    }

    /**
     * Set the property ConnectorType
     * <br>
     * An array of integers defining the type of PhysicalConnector. An array is specified to allow the description of 'combinations' of Connector information. For example, one array entry could specify RS-232 (value=25), another DB-25 (value=23) and a third entry define the Connector as "Male" (value=2). 
     * This single property is being deprecated in lieu of using separate properties to describe the various aspects of the connector. The separation allows for a more generic means of describing the connectors. Obsolete connectors were intentionally removed from the new list.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ConnectorType(javax.cim.UnsignedInteger16[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CONNECTORTYPE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ConnectorType(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CONNECTORTYPE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ConnectorType by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ConnectorType(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16[] newValue) throws WbemsmtException {
        CIM_PhysicalConnector fco = new CIM_PhysicalConnector(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CONNECTORTYPE.NAME);
        if (property != null) {
            property = setPropertyValue_ConnectorType(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CONNECTORTYPE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ConnectorType
     * <br>
     * An array of integers defining the type of PhysicalConnector. An array is specified to allow the description of 'combinations' of Connector information. For example, one array entry could specify RS-232 (value=25), another DB-25 (value=23) and a third entry define the Connector as "Male" (value=2). 
     * This single property is being deprecated in lieu of using separate properties to describe the various aspects of the connector. The separation allows for a more generic means of describing the connectors. Obsolete connectors were intentionally removed from the new list.
     */

    private static CIMProperty setPropertyValue_ConnectorType(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property NumPhysicalPins
     *     * <br>
     * Describes the number of physical pins (male/female) that are present on this connector.
     *     */

    public javax.cim.UnsignedInteger32 get_NumPhysicalPins() {
        CIMProperty currentProperty = getProperty(PROPERTY_NUMPHYSICALPINS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_NUMPHYSICALPINS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property NumPhysicalPins
     * <br>
     * Describes the number of physical pins (male/female) that are present on this connector.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_NumPhysicalPins(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_NUMPHYSICALPINS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_NumPhysicalPins(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_NUMPHYSICALPINS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property NumPhysicalPins by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_NumPhysicalPins(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_PhysicalConnector fco = new CIM_PhysicalConnector(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_NUMPHYSICALPINS.NAME);
        if (property != null) {
            property = setPropertyValue_NumPhysicalPins(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_NUMPHYSICALPINS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property NumPhysicalPins
     * <br>
     * Describes the number of physical pins (male/female) that are present on this connector.
     */

    private static CIMProperty setPropertyValue_NumPhysicalPins(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OtherElectricalCharacteristics
     *     * <br>
     * A string describing the connector's electrical characteristics - used when the ConnectorElectricalCharacteristics property contains an entry of 1 (Other). OtherElectricalCharacteristics should be set to NULL when ConnectorElectricalCharacteristics does not contain an value of 1.
     *     */

    public String[] get_OtherElectricalCharacteristics() {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERELECTRICALCHARACTERISTICS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OTHERELECTRICALCHARACTERISTICS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String[]) currentProperty.getValue();

    }

    /**
     * Set the property OtherElectricalCharacteristics
     * <br>
     * A string describing the connector's electrical characteristics - used when the ConnectorElectricalCharacteristics property contains an entry of 1 (Other). OtherElectricalCharacteristics should be set to NULL when ConnectorElectricalCharacteristics does not contain an value of 1.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OtherElectricalCharacteristics(String[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERELECTRICALCHARACTERISTICS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_OtherElectricalCharacteristics(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERELECTRICALCHARACTERISTICS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OtherElectricalCharacteristics by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherElectricalCharacteristics(WBEMClient client,
            String namespace, String[] newValue) throws WbemsmtException {
        CIM_PhysicalConnector fco = new CIM_PhysicalConnector(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OTHERELECTRICALCHARACTERISTICS.NAME);
        if (property != null) {
            property = setPropertyValue_OtherElectricalCharacteristics(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERELECTRICALCHARACTERISTICS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OtherElectricalCharacteristics
     * <br>
     * A string describing the connector's electrical characteristics - used when the ConnectorElectricalCharacteristics property contains an entry of 1 (Other). OtherElectricalCharacteristics should be set to NULL when ConnectorElectricalCharacteristics does not contain an value of 1.
     */

    private static CIMProperty setPropertyValue_OtherElectricalCharacteristics(
            CIMProperty currentProperty, String[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OtherTypeDescription
     *     * <br>
     * A string describing the Connector - used when the ConnectorType property is set to 1 ("Other"). OtherType Description should be set to NULL when ConnectorType is any value other than 1. 
     * The use of this property is deprecated in lieu of Connector Description.
     *     */

    public String get_OtherTypeDescription() {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERTYPEDESCRIPTION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OTHERTYPEDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property OtherTypeDescription
     * <br>
     * A string describing the Connector - used when the ConnectorType property is set to 1 ("Other"). OtherType Description should be set to NULL when ConnectorType is any value other than 1. 
     * The use of this property is deprecated in lieu of Connector Description.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OtherTypeDescription(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERTYPEDESCRIPTION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_OtherTypeDescription(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERTYPEDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OtherTypeDescription by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherTypeDescription(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_PhysicalConnector fco = new CIM_PhysicalConnector(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OTHERTYPEDESCRIPTION.NAME);
        if (property != null) {
            property = setPropertyValue_OtherTypeDescription(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERTYPEDESCRIPTION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OtherTypeDescription
     * <br>
     * A string describing the Connector - used when the ConnectorType property is set to 1 ("Other"). OtherType Description should be set to NULL when ConnectorType is any value other than 1. 
     * The use of this property is deprecated in lieu of Connector Description.
     */

    private static CIMProperty setPropertyValue_OtherTypeDescription(CIMProperty currentProperty,
            String newValue) {
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
     * Get the list with CIM_NetworkAdapter objects associated by the association CIM_AdapterActiveConnection
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_ADAPTERACTIVECONNECTION as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_NetworkAdapter_CIM_AdapterActiveConnections(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_NetworkAdapter_CIM_AdapterActiveConnections(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_ADAPTERACTIVECONNECTION,
                CIM_NetworkAdapter.CIM_CLASS_NAME, null, null, false, false, null);

    }

    /**
     * Get the list with CIM_NetworkAdapter objects associated by the association CIM_AdapterActiveConnection
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_ADAPTERACTIVECONNECTION or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_ADAPTERACTIVECONNECTION as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_NetworkAdapter_CIM_AdapterActiveConnections(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_NetworkAdapter_CIM_AdapterActiveConnections(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_ADAPTERACTIVECONNECTION, resultClass, role,
                resultRole, false, false, null);

    }

    /**
     * Get the list with CIM_NetworkAdapter objects associated by the association CIM_AdapterActiveConnection
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_ADAPTERACTIVECONNECTION or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_NetworkAdapter_CIM_AdapterActiveConnections(
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
                CIM_PhysicalConnectorHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_PhysicalConnectorHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_PhysicalConnectorHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_NetworkAdapter(cimInstance));
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
                        result.add(new CIM_NetworkAdapter(cimInstance));
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
                        result.add(new CIM_NetworkAdapter(cimInstance));
                        continue;
                    }
                }
            }
            CIM_PhysicalConnectorHelper.checkException(enumeration);
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
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_AdapterActiveConnection
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_ADAPTERACTIVECONNECTION as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_NetworkAdapter_CIM_AdapterActiveConnectionNames(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_NetworkAdapter_CIM_AdapterActiveConnectionNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_ADAPTERACTIVECONNECTION,
                CIM_NetworkAdapter.CIM_CLASS_NAME, null, null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_AdapterActiveConnection
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_ADAPTERACTIVECONNECTION or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_ADAPTERACTIVECONNECTION as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_NetworkAdapter_CIM_AdapterActiveConnectionNames(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_NetworkAdapter_CIM_AdapterActiveConnectionNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_ADAPTERACTIVECONNECTION, resultClass, role,
                resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_AdapterActiveConnection
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_NetworkAdapter_CIM_AdapterActiveConnectionNames(
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
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_ADAPTERACTIVECONNECTION,
                    CIM_NetworkAdapter.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_PhysicalConnectorHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_PhysicalConnectorHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_NetworkAdapter.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_PhysicalConnectorHelper.checkException(enumeration);
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
     * Get the list with CIM_AdapterActiveConnection associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_AdapterActiveConnection(WBEMClient cimClient,
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_ADAPTERACTIVECONNECTION, role, includeQualifiers,
                    includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_ADAPTERACTIVECONNECTION, role, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_PhysicalConnectorHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_PhysicalConnectorHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_AdapterActiveConnectionHelper.findClass(cimClient,
                            cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_AdapterActiveConnection(cimInstance));
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
                        result.add(new CIM_AdapterActiveConnection(cimInstance));
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
                        result.add(new CIM_AdapterActiveConnection(cimInstance));
                        continue;
                    }
                }
            }
            CIM_PhysicalConnectorHelper.checkException(enumeration);
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
     * Get a list of CIMObjectPath items of the associations CIM_AdapterActiveConnection
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_AdapterActiveConnection(WBEMClient cimClient,
            String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_ADAPTERACTIVECONNECTION, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_ADAPTERACTIVECONNECTION,
                    role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_PhysicalConnectorHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_PhysicalConnectorHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_AdapterActiveConnection.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_PhysicalConnectorHelper.checkException(enumeration);
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
     * Get the list with CIM_NetworkPort objects associated by the association CIM_PortActiveConnection
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTACTIVECONNECTION as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_NetworkPort_CIM_PortActiveConnections(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_NetworkPort_CIM_PortActiveConnections(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTACTIVECONNECTION, CIM_NetworkPort.CIM_CLASS_NAME,
                null, null, false, false, null);

    }

    /**
     * Get the list with CIM_NetworkPort objects associated by the association CIM_PortActiveConnection
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTACTIVECONNECTION or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTACTIVECONNECTION as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_NetworkPort_CIM_PortActiveConnections(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_NetworkPort_CIM_PortActiveConnections(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTACTIVECONNECTION, resultClass, role, resultRole,
                false, false, null);

    }

    /**
     * Get the list with CIM_NetworkPort objects associated by the association CIM_PortActiveConnection
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTACTIVECONNECTION or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_NetworkPort_CIM_PortActiveConnections(
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
                CIM_PhysicalConnectorHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_PhysicalConnectorHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_PhysicalConnectorHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_NetworkPort(cimInstance));
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
                        result.add(new CIM_NetworkPort(cimInstance));
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
                        result.add(new CIM_NetworkPort(cimInstance));
                        continue;
                    }
                }
            }
            CIM_PhysicalConnectorHelper.checkException(enumeration);
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
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_PortActiveConnection
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTACTIVECONNECTION as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_NetworkPort_CIM_PortActiveConnectionNames(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_NetworkPort_CIM_PortActiveConnectionNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTACTIVECONNECTION, CIM_NetworkPort.CIM_CLASS_NAME,
                null, null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_PortActiveConnection
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTACTIVECONNECTION or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTACTIVECONNECTION as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_NetworkPort_CIM_PortActiveConnectionNames(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_NetworkPort_CIM_PortActiveConnectionNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTACTIVECONNECTION, resultClass, role, resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_PortActiveConnection
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_NetworkPort_CIM_PortActiveConnectionNames(
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
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTACTIVECONNECTION,
                    CIM_NetworkPort.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_PhysicalConnectorHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_PhysicalConnectorHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_NetworkPort.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_PhysicalConnectorHelper.checkException(enumeration);
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
     * Get the list with CIM_PortActiveConnection associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_PortActiveConnection(WBEMClient cimClient,
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTACTIVECONNECTION, role, includeQualifiers,
                    includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTACTIVECONNECTION, role, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_PhysicalConnectorHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_PhysicalConnectorHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_PortActiveConnectionHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_PortActiveConnection(cimInstance));
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
                        result.add(new CIM_PortActiveConnection(cimInstance));
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
                        result.add(new CIM_PortActiveConnection(cimInstance));
                        continue;
                    }
                }
            }
            CIM_PhysicalConnectorHelper.checkException(enumeration);
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
     * Get a list of CIMObjectPath items of the associations CIM_PortActiveConnection
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_PortActiveConnection(WBEMClient cimClient,
            String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTACTIVECONNECTION, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTACTIVECONNECTION, role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_PhysicalConnectorHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_PhysicalConnectorHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_PortActiveConnection.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_PhysicalConnectorHelper.checkException(enumeration);
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
        return CIM_PhysicalConnector.CIM_CLASS_NAME;
    }

}