/** 
 * CIM_FibrePort.java
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
 * Description: The use of the FibrePort class is deprecated, since FibreChannel Adapter has been deprecated in lieu of FCPort. And, this class overlaps with FCPort. The new FCPort class should be used in lieu of both FibreChannelAdapter and FibrePort. FibrePort describes the capabilities and management aspects of a Fibre Channel Port Device.
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

public class CIM_FibrePort extends CIM_LogicalPort {

    public final static String CIM_CLASS_NAME = "CIM_FibrePort";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * The use of FibrePortOnFCAdapter is deprecated since both FibrePort and FibreChannelAdapter have been deprecated. No replacement is needed, since the 2 classes are combined into a single class. FibrePortOnFCAdapter associates a FibrePort with a FibreChannelAdapter.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_FIBREPORTONFCADAPTER = "CIM_FibrePortOnFCAdapter";

    /**
     * The use of FibrePortActiveLogin is deprecated since FibrePort is deprecated. Its information is found by examining the individual FCPorts, and an ActiveConnection between the FCProtocolEndpoints associated with the ports. FibrePortActiveLogin indicates that two FibrePorts are connected via a login and have negotiated their Class Of Service, frame size and other link characteristics, as specified by an instance of this class.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_FIBREPORTACTIVELOGIN = "CIM_FibrePortActiveLogin";

    /**
     * Constants of property AddressIdentifier
     * An address value used to identify the source (S_ID) or destination (D_ID) of a frame. The FC-SW standard includes a table of special address identifier values and their meanings. Consult the FC-SW documentation for additional information.
     */
    public static class PROPERTY_ADDRESSIDENTIFIER {
        /**
         * name of the property AddressIdentifier
         */
        public final static String NAME = "AddressIdentifier";

    }

    /**
     * Constants of property AliasAddresses
     * One or more address identifiers that may be recognized by the Port, in addition to its port-specific identifier. Multicast or hunt group addresses that are recognized by the Port would be identified in this array.
     */
    public static class PROPERTY_ALIASADDRESSES {
        /**
         * name of the property AliasAddresses
         */
        public final static String NAME = "AliasAddresses";

    }

    /**
     * Constants of property BypassedState
     * Indication of whether the Port is currently bypassed (value=2) or not (value=1). A value of 3 ("Forced Insert") describes that the Port is forced active, when it would otherwise be "Bypassed".
     */
    public static class PROPERTY_BYPASSEDSTATE {
        /**
         * name of the property BypassedState
         */
        public final static String NAME = "BypassedState";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Bypassed = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry Not Bypassed (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_Not_Bypassed = "Not Bypassed";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Bypassed = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Bypassed (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Bypassed = "Bypassed";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Forced_Insert = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Forced Insert (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Forced_Insert = "Forced Insert";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@5d3a5d3a
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Not_Bypassed.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Bypassed;
            }

            if (VALUE_ENTRY_Bypassed.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Bypassed;
            }

            if (VALUE_ENTRY_Forced_Insert.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Forced_Insert;
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

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Bypassed.intValue()) {
                return VALUE_ENTRY_Not_Bypassed;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Bypassed.intValue()) {
                return VALUE_ENTRY_Bypassed;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Forced_Insert.intValue()) {
                return VALUE_ENTRY_Forced_Insert;
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
         * Value Map for the property BypassedState   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Bypassed,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Bypassed,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Forced_Insert };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property BypassedState   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Not_Bypassed, VALUE_ENTRY_Bypassed, VALUE_ENTRY_Forced_Insert };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property BypassedState   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Not_Bypassed, VALUE_ENTRY_Bypassed, VALUE_ENTRY_Forced_Insert };

    }

    /**
     * Constants of property CRCErrors
     * Number of times that the CRC in a frame does not match the CRC computed by the receiver.
     */
    public static class PROPERTY_CRCERRORS {
        /**
         * name of the property CRCErrors
         */
        public final static String NAME = "CRCErrors";

    }

    /**
     * Constants of property ConnectedMedia
     * The type of cabling as sensed by the Port. Not all Fibre Ports are capable of providing this information. In this case, a value of 0, "Unknown", will be returned. Also, when single or multi-mode fiber cabling can not be distinguished, the more general value - 4, "Fiber-optic" - can be specified.
     */
    public static class PROPERTY_CONNECTEDMEDIA {
        /**
         * name of the property ConnectedMedia
         */
        public final static String NAME = "ConnectedMedia";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_No_Media = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry No Media (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_No_Media = "No Media";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Copper_Twinaxial = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Copper/Twinaxial (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Copper_Twinaxial = "Copper/Twinaxial";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Fiber_optic = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Fiber-optic (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Fiber_optic = "Fiber-optic";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Fiber_Single_Mode = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry Fiber Single Mode (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Fiber_Single_Mode = "Fiber Single Mode";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Fiber_Multimode = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry Fiber Multimode (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Fiber_Multimode = "Fiber Multimode";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@d7c0d7c
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_No_Media.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_No_Media;
            }

            if (VALUE_ENTRY_Copper_Twinaxial.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Copper_Twinaxial;
            }

            if (VALUE_ENTRY_Fiber_optic.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Fiber_optic;
            }

            if (VALUE_ENTRY_Fiber_Single_Mode.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Fiber_Single_Mode;
            }

            if (VALUE_ENTRY_Fiber_Multimode.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Fiber_Multimode;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_No_Media.intValue()) {
                return VALUE_ENTRY_No_Media;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Copper_Twinaxial.intValue()) {
                return VALUE_ENTRY_Copper_Twinaxial;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Fiber_optic.intValue()) {
                return VALUE_ENTRY_Fiber_optic;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Fiber_Single_Mode.intValue()) {
                return VALUE_ENTRY_Fiber_Single_Mode;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Fiber_Multimode.intValue()) {
                return VALUE_ENTRY_Fiber_Multimode;
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
         * Value Map for the property ConnectedMedia   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_No_Media,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Copper_Twinaxial,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Fiber_optic,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Fiber_Single_Mode,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Fiber_Multimode };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property ConnectedMedia   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_No_Media, VALUE_ENTRY_Copper_Twinaxial, VALUE_ENTRY_Fiber_optic,
                VALUE_ENTRY_Fiber_Single_Mode, VALUE_ENTRY_Fiber_Multimode };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property ConnectedMedia   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_No_Media, VALUE_ENTRY_Copper_Twinaxial,
                VALUE_ENTRY_Fiber_optic, VALUE_ENTRY_Fiber_Single_Mode, VALUE_ENTRY_Fiber_Multimode };

    }

    /**
     * Constants of property CurrentPortType
     * The specific mode in which the Port is currently running. The value is one of the entries in the EnabledPortTypes array. The current port type/mode is dependent on the fibre technology. For example, in a public loop network, you might indicate a port type of "FL" (value=6) or "NL" (value=2).
     */
    public static class PROPERTY_CURRENTPORTTYPE {
        /**
         * name of the property CurrentPortType
         */
        public final static String NAME = "CurrentPortType";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_N = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry N (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_N = "N";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_NL_Private = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry NL-Private (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_NL_Private = "NL-Private";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_NL_Public = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry NL-Public (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_NL_Public = "NL-Public";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_E = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry E (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_E = "E";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_F = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry F (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_F = "F";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_FL = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry FL (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_FL = "FL";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_B = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry B (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_B = "B";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@7a167a16
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_N.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_N;
            }

            if (VALUE_ENTRY_NL_Private.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_NL_Private;
            }

            if (VALUE_ENTRY_NL_Public.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_NL_Public;
            }

            if (VALUE_ENTRY_E.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_E;
            }

            if (VALUE_ENTRY_F.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_F;
            }

            if (VALUE_ENTRY_FL.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_FL;
            }

            if (VALUE_ENTRY_B.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_B;
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

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_N.intValue()) {
                return VALUE_ENTRY_N;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_NL_Private.intValue()) {
                return VALUE_ENTRY_NL_Private;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_NL_Public.intValue()) {
                return VALUE_ENTRY_NL_Public;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_E.intValue()) {
                return VALUE_ENTRY_E;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_F.intValue()) {
                return VALUE_ENTRY_F;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_FL.intValue()) {
                return VALUE_ENTRY_FL;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_B.intValue()) {
                return VALUE_ENTRY_B;
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
         * Value Map for the property CurrentPortType   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_N,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_NL_Private,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_NL_Public, VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_E,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_F, VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_FL,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_B };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property CurrentPortType   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_N,
                VALUE_ENTRY_NL_Private, VALUE_ENTRY_NL_Public, VALUE_ENTRY_E, VALUE_ENTRY_F,
                VALUE_ENTRY_FL, VALUE_ENTRY_B };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property CurrentPortType   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_N, VALUE_ENTRY_NL_Private, VALUE_ENTRY_NL_Public, VALUE_ENTRY_E,
                VALUE_ENTRY_F, VALUE_ENTRY_FL, VALUE_ENTRY_B };

    }

    /**
     * Constants of property CurrentVersion
     * Version information for the CurrentPortType that is active.
     */
    public static class PROPERTY_CURRENTVERSION {
        /**
         * name of the property CurrentVersion
         */
        public final static String NAME = "CurrentVersion";

    }

    /**
     * Constants of property ElasticityBufferOverruns
     * The number of times that a fill word could not be deleted, when required. The Elasticity Buffer is defined in FC-AL. This event might cause data corruption and may indicate a configuration error or a device out of spec.
     */
    public static class PROPERTY_ELASTICITYBUFFEROVERRUNS {
        /**
         * name of the property ElasticityBufferOverruns
         */
        public final static String NAME = "ElasticityBufferOverruns";

    }

    /**
     * Constants of property ElasticityBufferUnderruns
     * The number of times that a fill word could not be inserted, when required. The Elasticity Buffer is defined in FC-AL. This event might cause data corruption and may indicate a configuration error or a device out of spec.
     */
    public static class PROPERTY_ELASTICITYBUFFERUNDERRUNS {
        /**
         * name of the property ElasticityBufferUnderruns
         */
        public final static String NAME = "ElasticityBufferUnderruns";

    }

    /**
     * Constants of property EnabledPortTypes
     * The specific modes currently enabled for the Port. The values are equal to, or a subset of the values in the Supported PortTypes array.
     */
    public static class PROPERTY_ENABLEDPORTTYPES {
        /**
         * name of the property EnabledPortTypes
         */
        public final static String NAME = "EnabledPortTypes";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_N = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry N (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_N = "N";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_NL_Private = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry NL-Private (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_NL_Private = "NL-Private";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_NL_Public = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry NL-Public (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_NL_Public = "NL-Public";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_E = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry E (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_E = "E";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_F = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry F (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_F = "F";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_FL = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry FL (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_FL = "FL";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_B = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry B (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_B = "B";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@66146614
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_N.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_N;
            }

            if (VALUE_ENTRY_NL_Private.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_NL_Private;
            }

            if (VALUE_ENTRY_NL_Public.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_NL_Public;
            }

            if (VALUE_ENTRY_E.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_E;
            }

            if (VALUE_ENTRY_F.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_F;
            }

            if (VALUE_ENTRY_FL.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_FL;
            }

            if (VALUE_ENTRY_B.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_B;
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

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_N.intValue()) {
                return VALUE_ENTRY_N;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_NL_Private.intValue()) {
                return VALUE_ENTRY_NL_Private;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_NL_Public.intValue()) {
                return VALUE_ENTRY_NL_Public;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_E.intValue()) {
                return VALUE_ENTRY_E;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_F.intValue()) {
                return VALUE_ENTRY_F;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_FL.intValue()) {
                return VALUE_ENTRY_FL;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_B.intValue()) {
                return VALUE_ENTRY_B;
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
         * Value Map for the property EnabledPortTypes   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_N,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_NL_Private,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_NL_Public, VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_E,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_F, VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_FL,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_B };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property EnabledPortTypes   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_N,
                VALUE_ENTRY_NL_Private, VALUE_ENTRY_NL_Public, VALUE_ENTRY_E, VALUE_ENTRY_F,
                VALUE_ENTRY_FL, VALUE_ENTRY_B };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property EnabledPortTypes   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_N, VALUE_ENTRY_NL_Private, VALUE_ENTRY_NL_Public, VALUE_ENTRY_E,
                VALUE_ENTRY_F, VALUE_ENTRY_FL, VALUE_ENTRY_B };

    }

    /**
     * Constants of property EnabledVersions
     * Version information for each of the EnabledPortTypes. A particular PortType (mode) may be listed multiple times in the EnabledPortTypes array in order to define multiple, unique version levels. Note that each entry of this array is related to the entry in EnabledPortTypes that is located at the same index.
     */
    public static class PROPERTY_ENABLEDVERSIONS {
        /**
         * name of the property EnabledVersions
         */
        public final static String NAME = "EnabledVersions";

    }

    /**
     * Constants of property FramesTooLong
     * The number of frames received that were longer than 2140 octets. The value of 2140 is calculated based on an assumption of 24 header bytes plus 4 CRC bytes and 2112 bytes of payload.
     */
    public static class PROPERTY_FRAMESTOOLONG {
        /**
         * name of the property FramesTooLong
         */
        public final static String NAME = "FramesTooLong";

    }

    /**
     * Constants of property FramesTooShort
     * The number of frames received that were shorter than 28 octets. The value of 28 is calculated based on an assumption of 24 header bytes plus 4 CRC bytes. The count does not include SOF/EOF bytes which are not data.
     */
    public static class PROPERTY_FRAMESTOOSHORT {
        /**
         * name of the property FramesTooShort
         */
        public final static String NAME = "FramesTooShort";

    }

    /**
     * Constants of property InvalidTransmissionWords
     * The number of transmission words that had an 8b10b code violation in one or more of its characters, had a K28.5 in its second, third or fourth character positions, and/or was an ordered set that had an incorrect Beginning Running Disparity.
     */
    public static class PROPERTY_INVALIDTRANSMISSIONWORDS {
        /**
         * name of the property InvalidTransmissionWords
         */
        public final static String NAME = "InvalidTransmissionWords";

    }

    /**
     * Constants of property LossOfSignalCounter
     * Number of times that signal is lost on the Port since last reset of the Device.
     */
    public static class PROPERTY_LOSSOFSIGNALCOUNTER {
        /**
         * name of the property LossOfSignalCounter
         */
        public final static String NAME = "LossOfSignalCounter";

    }

    /**
     * Constants of property LossOfSyncCounter
     * Number of times that synchronization is lost on the Port since last reset of the Device. Synchronization is assumed lost after a timeout period identified by the Receiver TransmitterTimeout property.
     */
    public static class PROPERTY_LOSSOFSYNCCOUNTER {
        /**
         * name of the property LossOfSyncCounter
         */
        public final static String NAME = "LossOfSyncCounter";

    }

    /**
     * Constants of property PortTypeVersions
     * Version information for each of the SupportedPortTypes. A particular PortType (mode) may be listed multiple times in the SupportedPortTypes array in order to define multiple, unique version levels. Note that each entry of this array is related to the entry in SupportedPortTypes that is located at the same index.
     */
    public static class PROPERTY_PORTTYPEVERSIONS {
        /**
         * name of the property PortTypeVersions
         */
        public final static String NAME = "PortTypeVersions";

    }

    /**
     * Constants of property ReceiverTransmitterTimeout
     * Timeout value in milliseconds used to determine when loss of synchronization has occurred. The typical default is 100 msec.
     */
    public static class PROPERTY_RECEIVERTRANSMITTERTIMEOUT {
        /**
         * name of the property ReceiverTransmitterTimeout
         */
        public final static String NAME = "ReceiverTransmitterTimeout";

    }

    /**
     * Constants of property SupportedPortTypes
     * An array indicating the modes in which the Port can operate. PortType values describe the role and behavior of the Fibre Channel entity: "N" = Node Port, "NL" = Node Port supporting FC arbitrated loop, "E" = Expansion Port connecting fabric elements (for example, FC switches), "F" = Fabric (element) Port, "FL" = Fabric (element) Port supporting FC arbitrated loop, and "B" = Bridge Port. PortTypes are defined in the ANSI X3 standards. 
     * 
     * A particular mode may be listed multiple times in the SupportedPortTypes array in order to define that multiple, unique version levels are supported. Version information is defined in the PortTypeVersions property. Note that each entry of the SupportedPortTypes array is related to the entry in PortTypeVersions that is located at the same index.
     */
    public static class PROPERTY_SUPPORTEDPORTTYPES {
        /**
         * name of the property SupportedPortTypes
         */
        public final static String NAME = "SupportedPortTypes";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_N = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry N (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_N = "N";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_NL_Private = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry NL-Private (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_NL_Private = "NL-Private";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_NL_Public = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry NL-Public (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_NL_Public = "NL-Public";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_E = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry E (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_E = "E";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_F = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry F (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_F = "F";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_FL = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry FL (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_FL = "FL";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_B = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry B (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_B = "B";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@576e576e
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_N.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_N;
            }

            if (VALUE_ENTRY_NL_Private.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_NL_Private;
            }

            if (VALUE_ENTRY_NL_Public.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_NL_Public;
            }

            if (VALUE_ENTRY_E.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_E;
            }

            if (VALUE_ENTRY_F.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_F;
            }

            if (VALUE_ENTRY_FL.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_FL;
            }

            if (VALUE_ENTRY_B.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_B;
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

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_N.intValue()) {
                return VALUE_ENTRY_N;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_NL_Private.intValue()) {
                return VALUE_ENTRY_NL_Private;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_NL_Public.intValue()) {
                return VALUE_ENTRY_NL_Public;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_E.intValue()) {
                return VALUE_ENTRY_E;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_F.intValue()) {
                return VALUE_ENTRY_F;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_FL.intValue()) {
                return VALUE_ENTRY_FL;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_B.intValue()) {
                return VALUE_ENTRY_B;
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
         * Value Map for the property SupportedPortTypes   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_N,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_NL_Private,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_NL_Public, VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_E,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_F, VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_FL,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_B };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property SupportedPortTypes   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_N,
                VALUE_ENTRY_NL_Private, VALUE_ENTRY_NL_Public, VALUE_ENTRY_E, VALUE_ENTRY_F,
                VALUE_ENTRY_FL, VALUE_ENTRY_B };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property SupportedPortTypes   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_N, VALUE_ENTRY_NL_Private, VALUE_ENTRY_NL_Public, VALUE_ENTRY_E,
                VALUE_ENTRY_F, VALUE_ENTRY_FL, VALUE_ENTRY_B };

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_LogicalPort.getPackages();

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
     *   The use of the FibrePort class is deprecated, since FibreChannel Adapter has been deprecated in lieu of FCPort. And, this class overlaps with FCPort. The new FCPort class should be used in lieu of both FibreChannelAdapter and FibrePort. FibrePort describes the capabilities and management aspects of a Fibre Channel Port Device.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_FibrePort(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   The use of the FibrePort class is deprecated, since FibreChannel Adapter has been deprecated in lieu of FCPort. And, this class overlaps with FCPort. The new FCPort class should be used in lieu of both FibreChannelAdapter and FibrePort. FibrePort describes the capabilities and management aspects of a Fibre Channel Port Device.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_FibrePort(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_FibrePort() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("AddressIdentifier", new CIMProperty("AddressIdentifier",
                CIMDataType.UINT32_T, null));
        propertiesToCheck.put("AliasAddresses", new CIMProperty("AliasAddresses",
                CIMDataType.UINT32_ARRAY_T, null));
        propertiesToCheck.put("BypassedState", new CIMProperty("BypassedState",
                CIMDataType.UINT16_T, null));
        propertiesToCheck
                .put("CRCErrors", new CIMProperty("CRCErrors", CIMDataType.UINT64_T, null));
        propertiesToCheck.put("ConnectedMedia", new CIMProperty("ConnectedMedia",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("CurrentPortType", new CIMProperty("CurrentPortType",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("CurrentVersion", new CIMProperty("CurrentVersion",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("ElasticityBufferOverruns", new CIMProperty(
                "ElasticityBufferOverruns", CIMDataType.UINT64_T, null));
        propertiesToCheck.put("ElasticityBufferUnderruns", new CIMProperty(
                "ElasticityBufferUnderruns", CIMDataType.UINT64_T, null));
        propertiesToCheck.put("EnabledPortTypes", new CIMProperty("EnabledPortTypes",
                CIMDataType.UINT16_ARRAY_T, null));
        propertiesToCheck.put("EnabledVersions", new CIMProperty("EnabledVersions",
                CIMDataType.STRING_ARRAY_T, null));
        propertiesToCheck.put("FramesTooLong", new CIMProperty("FramesTooLong",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("FramesTooShort", new CIMProperty("FramesTooShort",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("InvalidTransmissionWords", new CIMProperty(
                "InvalidTransmissionWords", CIMDataType.UINT64_T, null));
        propertiesToCheck.put("LossOfSignalCounter", new CIMProperty("LossOfSignalCounter",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("LossOfSyncCounter", new CIMProperty("LossOfSyncCounter",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("PortTypeVersions", new CIMProperty("PortTypeVersions",
                CIMDataType.STRING_ARRAY_T, null));
        propertiesToCheck.put("ReceiverTransmitterTimeout", new CIMProperty(
                "ReceiverTransmitterTimeout", CIMDataType.UINT64_T, null));
        propertiesToCheck.put("SupportedPortTypes", new CIMProperty("SupportedPortTypes",
                CIMDataType.UINT16_ARRAY_T, null));

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
     * Get the property AddressIdentifier
     *     * <br>
     * An address value used to identify the source (S_ID) or destination (D_ID) of a frame. The FC-SW standard includes a table of special address identifier values and their meanings. Consult the FC-SW documentation for additional information.
     *     */

    public javax.cim.UnsignedInteger32 get_AddressIdentifier() {
        CIMProperty currentProperty = getProperty(PROPERTY_ADDRESSIDENTIFIER.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ADDRESSIDENTIFIER.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property AddressIdentifier
     * <br>
     * An address value used to identify the source (S_ID) or destination (D_ID) of a frame. The FC-SW standard includes a table of special address identifier values and their meanings. Consult the FC-SW documentation for additional information.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_AddressIdentifier(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ADDRESSIDENTIFIER.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_AddressIdentifier(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ADDRESSIDENTIFIER.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property AddressIdentifier by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_AddressIdentifier(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_FibrePort fco = new CIM_FibrePort(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ADDRESSIDENTIFIER.NAME);
        if (property != null) {
            property = setPropertyValue_AddressIdentifier(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ADDRESSIDENTIFIER.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property AddressIdentifier
     * <br>
     * An address value used to identify the source (S_ID) or destination (D_ID) of a frame. The FC-SW standard includes a table of special address identifier values and their meanings. Consult the FC-SW documentation for additional information.
     */

    private static CIMProperty setPropertyValue_AddressIdentifier(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property AliasAddresses
     *     * <br>
     * One or more address identifiers that may be recognized by the Port, in addition to its port-specific identifier. Multicast or hunt group addresses that are recognized by the Port would be identified in this array.
     *     */

    public javax.cim.UnsignedInteger32[] get_AliasAddresses() {
        CIMProperty currentProperty = getProperty(PROPERTY_ALIASADDRESSES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ALIASADDRESSES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32[]) currentProperty.getValue();

    }

    /**
     * Set the property AliasAddresses
     * <br>
     * One or more address identifiers that may be recognized by the Port, in addition to its port-specific identifier. Multicast or hunt group addresses that are recognized by the Port would be identified in this array.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_AliasAddresses(javax.cim.UnsignedInteger32[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ALIASADDRESSES.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_AliasAddresses(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ALIASADDRESSES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property AliasAddresses by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_AliasAddresses(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32[] newValue) throws WbemsmtException {
        CIM_FibrePort fco = new CIM_FibrePort(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ALIASADDRESSES.NAME);
        if (property != null) {
            property = setPropertyValue_AliasAddresses(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ALIASADDRESSES.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property AliasAddresses
     * <br>
     * One or more address identifiers that may be recognized by the Port, in addition to its port-specific identifier. Multicast or hunt group addresses that are recognized by the Port would be identified in this array.
     */

    private static CIMProperty setPropertyValue_AliasAddresses(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property BypassedState
     *     * <br>
     * Indication of whether the Port is currently bypassed (value=2) or not (value=1). A value of 3 ("Forced Insert") describes that the Port is forced active, when it would otherwise be "Bypassed".
     *     */

    public javax.cim.UnsignedInteger16 get_BypassedState() {
        CIMProperty currentProperty = getProperty(PROPERTY_BYPASSEDSTATE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_BYPASSEDSTATE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property BypassedState
     * <br>
     * Indication of whether the Port is currently bypassed (value=2) or not (value=1). A value of 3 ("Forced Insert") describes that the Port is forced active, when it would otherwise be "Bypassed".
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_BypassedState(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_BYPASSEDSTATE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_BypassedState(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_BYPASSEDSTATE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property BypassedState by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_BypassedState(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_FibrePort fco = new CIM_FibrePort(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_BYPASSEDSTATE.NAME);
        if (property != null) {
            property = setPropertyValue_BypassedState(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_BYPASSEDSTATE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property BypassedState
     * <br>
     * Indication of whether the Port is currently bypassed (value=2) or not (value=1). A value of 3 ("Forced Insert") describes that the Port is forced active, when it would otherwise be "Bypassed".
     */

    private static CIMProperty setPropertyValue_BypassedState(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property CRCErrors
     *     * <br>
     * Number of times that the CRC in a frame does not match the CRC computed by the receiver.
     *     */

    public javax.cim.UnsignedInteger64 get_CRCErrors() {
        CIMProperty currentProperty = getProperty(PROPERTY_CRCERRORS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CRCERRORS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property CRCErrors
     * <br>
     * Number of times that the CRC in a frame does not match the CRC computed by the receiver.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_CRCErrors(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CRCERRORS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_CRCErrors(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CRCERRORS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property CRCErrors by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_CRCErrors(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FibrePort fco = new CIM_FibrePort(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CRCERRORS.NAME);
        if (property != null) {
            property = setPropertyValue_CRCErrors(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CRCERRORS.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property CRCErrors
     * <br>
     * Number of times that the CRC in a frame does not match the CRC computed by the receiver.
     */

    private static CIMProperty setPropertyValue_CRCErrors(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ConnectedMedia
     *     * <br>
     * The type of cabling as sensed by the Port. Not all Fibre Ports are capable of providing this information. In this case, a value of 0, "Unknown", will be returned. Also, when single or multi-mode fiber cabling can not be distinguished, the more general value - 4, "Fiber-optic" - can be specified.
     *     */

    public javax.cim.UnsignedInteger16 get_ConnectedMedia() {
        CIMProperty currentProperty = getProperty(PROPERTY_CONNECTEDMEDIA.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CONNECTEDMEDIA.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property ConnectedMedia
     * <br>
     * The type of cabling as sensed by the Port. Not all Fibre Ports are capable of providing this information. In this case, a value of 0, "Unknown", will be returned. Also, when single or multi-mode fiber cabling can not be distinguished, the more general value - 4, "Fiber-optic" - can be specified.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ConnectedMedia(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CONNECTEDMEDIA.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ConnectedMedia(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CONNECTEDMEDIA.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ConnectedMedia by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ConnectedMedia(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_FibrePort fco = new CIM_FibrePort(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CONNECTEDMEDIA.NAME);
        if (property != null) {
            property = setPropertyValue_ConnectedMedia(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CONNECTEDMEDIA.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ConnectedMedia
     * <br>
     * The type of cabling as sensed by the Port. Not all Fibre Ports are capable of providing this information. In this case, a value of 0, "Unknown", will be returned. Also, when single or multi-mode fiber cabling can not be distinguished, the more general value - 4, "Fiber-optic" - can be specified.
     */

    private static CIMProperty setPropertyValue_ConnectedMedia(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property CurrentPortType
     *     * <br>
     * The specific mode in which the Port is currently running. The value is one of the entries in the EnabledPortTypes array. The current port type/mode is dependent on the fibre technology. For example, in a public loop network, you might indicate a port type of "FL" (value=6) or "NL" (value=2).
     *     */

    public javax.cim.UnsignedInteger16 get_CurrentPortType() {
        CIMProperty currentProperty = getProperty(PROPERTY_CURRENTPORTTYPE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CURRENTPORTTYPE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property CurrentPortType
     * <br>
     * The specific mode in which the Port is currently running. The value is one of the entries in the EnabledPortTypes array. The current port type/mode is dependent on the fibre technology. For example, in a public loop network, you might indicate a port type of "FL" (value=6) or "NL" (value=2).
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_CurrentPortType(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CURRENTPORTTYPE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_CurrentPortType(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CURRENTPORTTYPE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property CurrentPortType by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_CurrentPortType(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_FibrePort fco = new CIM_FibrePort(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CURRENTPORTTYPE.NAME);
        if (property != null) {
            property = setPropertyValue_CurrentPortType(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CURRENTPORTTYPE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property CurrentPortType
     * <br>
     * The specific mode in which the Port is currently running. The value is one of the entries in the EnabledPortTypes array. The current port type/mode is dependent on the fibre technology. For example, in a public loop network, you might indicate a port type of "FL" (value=6) or "NL" (value=2).
     */

    private static CIMProperty setPropertyValue_CurrentPortType(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property CurrentVersion
     *     * <br>
     * Version information for the CurrentPortType that is active.
     *     */

    public String get_CurrentVersion() {
        CIMProperty currentProperty = getProperty(PROPERTY_CURRENTVERSION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CURRENTVERSION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property CurrentVersion
     * <br>
     * Version information for the CurrentPortType that is active.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_CurrentVersion(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CURRENTVERSION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_CurrentVersion(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CURRENTVERSION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property CurrentVersion by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_CurrentVersion(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_FibrePort fco = new CIM_FibrePort(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CURRENTVERSION.NAME);
        if (property != null) {
            property = setPropertyValue_CurrentVersion(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CURRENTVERSION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property CurrentVersion
     * <br>
     * Version information for the CurrentPortType that is active.
     */

    private static CIMProperty setPropertyValue_CurrentVersion(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ElasticityBufferOverruns
     *     * <br>
     * The number of times that a fill word could not be deleted, when required. The Elasticity Buffer is defined in FC-AL. This event might cause data corruption and may indicate a configuration error or a device out of spec.
     *     */

    public javax.cim.UnsignedInteger64 get_ElasticityBufferOverruns() {
        CIMProperty currentProperty = getProperty(PROPERTY_ELASTICITYBUFFEROVERRUNS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ELASTICITYBUFFEROVERRUNS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property ElasticityBufferOverruns
     * <br>
     * The number of times that a fill word could not be deleted, when required. The Elasticity Buffer is defined in FC-AL. This event might cause data corruption and may indicate a configuration error or a device out of spec.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ElasticityBufferOverruns(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ELASTICITYBUFFEROVERRUNS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ElasticityBufferOverruns(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ELASTICITYBUFFEROVERRUNS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ElasticityBufferOverruns by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ElasticityBufferOverruns(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FibrePort fco = new CIM_FibrePort(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ELASTICITYBUFFEROVERRUNS.NAME);
        if (property != null) {
            property = setPropertyValue_ElasticityBufferOverruns(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ELASTICITYBUFFEROVERRUNS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ElasticityBufferOverruns
     * <br>
     * The number of times that a fill word could not be deleted, when required. The Elasticity Buffer is defined in FC-AL. This event might cause data corruption and may indicate a configuration error or a device out of spec.
     */

    private static CIMProperty setPropertyValue_ElasticityBufferOverruns(
            CIMProperty currentProperty, javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ElasticityBufferUnderruns
     *     * <br>
     * The number of times that a fill word could not be inserted, when required. The Elasticity Buffer is defined in FC-AL. This event might cause data corruption and may indicate a configuration error or a device out of spec.
     *     */

    public javax.cim.UnsignedInteger64 get_ElasticityBufferUnderruns() {
        CIMProperty currentProperty = getProperty(PROPERTY_ELASTICITYBUFFERUNDERRUNS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ELASTICITYBUFFERUNDERRUNS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property ElasticityBufferUnderruns
     * <br>
     * The number of times that a fill word could not be inserted, when required. The Elasticity Buffer is defined in FC-AL. This event might cause data corruption and may indicate a configuration error or a device out of spec.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ElasticityBufferUnderruns(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ELASTICITYBUFFERUNDERRUNS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ElasticityBufferUnderruns(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ELASTICITYBUFFERUNDERRUNS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ElasticityBufferUnderruns by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ElasticityBufferUnderruns(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FibrePort fco = new CIM_FibrePort(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ELASTICITYBUFFERUNDERRUNS.NAME);
        if (property != null) {
            property = setPropertyValue_ElasticityBufferUnderruns(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ELASTICITYBUFFERUNDERRUNS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ElasticityBufferUnderruns
     * <br>
     * The number of times that a fill word could not be inserted, when required. The Elasticity Buffer is defined in FC-AL. This event might cause data corruption and may indicate a configuration error or a device out of spec.
     */

    private static CIMProperty setPropertyValue_ElasticityBufferUnderruns(
            CIMProperty currentProperty, javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property EnabledPortTypes
     *     * <br>
     * The specific modes currently enabled for the Port. The values are equal to, or a subset of the values in the Supported PortTypes array.
     *     */

    public javax.cim.UnsignedInteger16[] get_EnabledPortTypes() {
        CIMProperty currentProperty = getProperty(PROPERTY_ENABLEDPORTTYPES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ENABLEDPORTTYPES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16[]) currentProperty.getValue();

    }

    /**
     * Set the property EnabledPortTypes
     * <br>
     * The specific modes currently enabled for the Port. The values are equal to, or a subset of the values in the Supported PortTypes array.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_EnabledPortTypes(javax.cim.UnsignedInteger16[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ENABLEDPORTTYPES.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_EnabledPortTypes(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ENABLEDPORTTYPES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property EnabledPortTypes by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_EnabledPortTypes(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16[] newValue) throws WbemsmtException {
        CIM_FibrePort fco = new CIM_FibrePort(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ENABLEDPORTTYPES.NAME);
        if (property != null) {
            property = setPropertyValue_EnabledPortTypes(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ENABLEDPORTTYPES.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property EnabledPortTypes
     * <br>
     * The specific modes currently enabled for the Port. The values are equal to, or a subset of the values in the Supported PortTypes array.
     */

    private static CIMProperty setPropertyValue_EnabledPortTypes(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property EnabledVersions
     *     * <br>
     * Version information for each of the EnabledPortTypes. A particular PortType (mode) may be listed multiple times in the EnabledPortTypes array in order to define multiple, unique version levels. Note that each entry of this array is related to the entry in EnabledPortTypes that is located at the same index.
     *     */

    public String[] get_EnabledVersions() {
        CIMProperty currentProperty = getProperty(PROPERTY_ENABLEDVERSIONS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ENABLEDVERSIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String[]) currentProperty.getValue();

    }

    /**
     * Set the property EnabledVersions
     * <br>
     * Version information for each of the EnabledPortTypes. A particular PortType (mode) may be listed multiple times in the EnabledPortTypes array in order to define multiple, unique version levels. Note that each entry of this array is related to the entry in EnabledPortTypes that is located at the same index.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_EnabledVersions(String[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ENABLEDVERSIONS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_EnabledVersions(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ENABLEDVERSIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property EnabledVersions by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_EnabledVersions(WBEMClient client, String namespace,
            String[] newValue) throws WbemsmtException {
        CIM_FibrePort fco = new CIM_FibrePort(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ENABLEDVERSIONS.NAME);
        if (property != null) {
            property = setPropertyValue_EnabledVersions(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ENABLEDVERSIONS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property EnabledVersions
     * <br>
     * Version information for each of the EnabledPortTypes. A particular PortType (mode) may be listed multiple times in the EnabledPortTypes array in order to define multiple, unique version levels. Note that each entry of this array is related to the entry in EnabledPortTypes that is located at the same index.
     */

    private static CIMProperty setPropertyValue_EnabledVersions(CIMProperty currentProperty,
            String[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property FramesTooLong
     *     * <br>
     * The number of frames received that were longer than 2140 octets. The value of 2140 is calculated based on an assumption of 24 header bytes plus 4 CRC bytes and 2112 bytes of payload.
     *     */

    public javax.cim.UnsignedInteger64 get_FramesTooLong() {
        CIMProperty currentProperty = getProperty(PROPERTY_FRAMESTOOLONG.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_FRAMESTOOLONG.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property FramesTooLong
     * <br>
     * The number of frames received that were longer than 2140 octets. The value of 2140 is calculated based on an assumption of 24 header bytes plus 4 CRC bytes and 2112 bytes of payload.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_FramesTooLong(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_FRAMESTOOLONG.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_FramesTooLong(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_FRAMESTOOLONG.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property FramesTooLong by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_FramesTooLong(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FibrePort fco = new CIM_FibrePort(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_FRAMESTOOLONG.NAME);
        if (property != null) {
            property = setPropertyValue_FramesTooLong(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_FRAMESTOOLONG.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property FramesTooLong
     * <br>
     * The number of frames received that were longer than 2140 octets. The value of 2140 is calculated based on an assumption of 24 header bytes plus 4 CRC bytes and 2112 bytes of payload.
     */

    private static CIMProperty setPropertyValue_FramesTooLong(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property FramesTooShort
     *     * <br>
     * The number of frames received that were shorter than 28 octets. The value of 28 is calculated based on an assumption of 24 header bytes plus 4 CRC bytes. The count does not include SOF/EOF bytes which are not data.
     *     */

    public javax.cim.UnsignedInteger64 get_FramesTooShort() {
        CIMProperty currentProperty = getProperty(PROPERTY_FRAMESTOOSHORT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_FRAMESTOOSHORT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property FramesTooShort
     * <br>
     * The number of frames received that were shorter than 28 octets. The value of 28 is calculated based on an assumption of 24 header bytes plus 4 CRC bytes. The count does not include SOF/EOF bytes which are not data.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_FramesTooShort(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_FRAMESTOOSHORT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_FramesTooShort(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_FRAMESTOOSHORT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property FramesTooShort by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_FramesTooShort(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FibrePort fco = new CIM_FibrePort(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_FRAMESTOOSHORT.NAME);
        if (property != null) {
            property = setPropertyValue_FramesTooShort(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_FRAMESTOOSHORT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property FramesTooShort
     * <br>
     * The number of frames received that were shorter than 28 octets. The value of 28 is calculated based on an assumption of 24 header bytes plus 4 CRC bytes. The count does not include SOF/EOF bytes which are not data.
     */

    private static CIMProperty setPropertyValue_FramesTooShort(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property InvalidTransmissionWords
     *     * <br>
     * The number of transmission words that had an 8b10b code violation in one or more of its characters, had a K28.5 in its second, third or fourth character positions, and/or was an ordered set that had an incorrect Beginning Running Disparity.
     *     */

    public javax.cim.UnsignedInteger64 get_InvalidTransmissionWords() {
        CIMProperty currentProperty = getProperty(PROPERTY_INVALIDTRANSMISSIONWORDS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_INVALIDTRANSMISSIONWORDS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property InvalidTransmissionWords
     * <br>
     * The number of transmission words that had an 8b10b code violation in one or more of its characters, had a K28.5 in its second, third or fourth character positions, and/or was an ordered set that had an incorrect Beginning Running Disparity.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_InvalidTransmissionWords(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_INVALIDTRANSMISSIONWORDS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_InvalidTransmissionWords(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_INVALIDTRANSMISSIONWORDS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property InvalidTransmissionWords by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_InvalidTransmissionWords(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FibrePort fco = new CIM_FibrePort(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_INVALIDTRANSMISSIONWORDS.NAME);
        if (property != null) {
            property = setPropertyValue_InvalidTransmissionWords(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_INVALIDTRANSMISSIONWORDS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property InvalidTransmissionWords
     * <br>
     * The number of transmission words that had an 8b10b code violation in one or more of its characters, had a K28.5 in its second, third or fourth character positions, and/or was an ordered set that had an incorrect Beginning Running Disparity.
     */

    private static CIMProperty setPropertyValue_InvalidTransmissionWords(
            CIMProperty currentProperty, javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property LossOfSignalCounter
     *     * <br>
     * Number of times that signal is lost on the Port since last reset of the Device.
     *     */

    public javax.cim.UnsignedInteger64 get_LossOfSignalCounter() {
        CIMProperty currentProperty = getProperty(PROPERTY_LOSSOFSIGNALCOUNTER.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_LOSSOFSIGNALCOUNTER.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property LossOfSignalCounter
     * <br>
     * Number of times that signal is lost on the Port since last reset of the Device.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_LossOfSignalCounter(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_LOSSOFSIGNALCOUNTER.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_LossOfSignalCounter(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_LOSSOFSIGNALCOUNTER.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property LossOfSignalCounter by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_LossOfSignalCounter(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FibrePort fco = new CIM_FibrePort(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_LOSSOFSIGNALCOUNTER.NAME);
        if (property != null) {
            property = setPropertyValue_LossOfSignalCounter(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_LOSSOFSIGNALCOUNTER.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property LossOfSignalCounter
     * <br>
     * Number of times that signal is lost on the Port since last reset of the Device.
     */

    private static CIMProperty setPropertyValue_LossOfSignalCounter(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property LossOfSyncCounter
     *     * <br>
     * Number of times that synchronization is lost on the Port since last reset of the Device. Synchronization is assumed lost after a timeout period identified by the Receiver TransmitterTimeout property.
     *     */

    public javax.cim.UnsignedInteger64 get_LossOfSyncCounter() {
        CIMProperty currentProperty = getProperty(PROPERTY_LOSSOFSYNCCOUNTER.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_LOSSOFSYNCCOUNTER.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property LossOfSyncCounter
     * <br>
     * Number of times that synchronization is lost on the Port since last reset of the Device. Synchronization is assumed lost after a timeout period identified by the Receiver TransmitterTimeout property.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_LossOfSyncCounter(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_LOSSOFSYNCCOUNTER.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_LossOfSyncCounter(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_LOSSOFSYNCCOUNTER.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property LossOfSyncCounter by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_LossOfSyncCounter(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FibrePort fco = new CIM_FibrePort(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_LOSSOFSYNCCOUNTER.NAME);
        if (property != null) {
            property = setPropertyValue_LossOfSyncCounter(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_LOSSOFSYNCCOUNTER.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property LossOfSyncCounter
     * <br>
     * Number of times that synchronization is lost on the Port since last reset of the Device. Synchronization is assumed lost after a timeout period identified by the Receiver TransmitterTimeout property.
     */

    private static CIMProperty setPropertyValue_LossOfSyncCounter(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PortTypeVersions
     *     * <br>
     * Version information for each of the SupportedPortTypes. A particular PortType (mode) may be listed multiple times in the SupportedPortTypes array in order to define multiple, unique version levels. Note that each entry of this array is related to the entry in SupportedPortTypes that is located at the same index.
     *     */

    public String[] get_PortTypeVersions() {
        CIMProperty currentProperty = getProperty(PROPERTY_PORTTYPEVERSIONS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PORTTYPEVERSIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String[]) currentProperty.getValue();

    }

    /**
     * Set the property PortTypeVersions
     * <br>
     * Version information for each of the SupportedPortTypes. A particular PortType (mode) may be listed multiple times in the SupportedPortTypes array in order to define multiple, unique version levels. Note that each entry of this array is related to the entry in SupportedPortTypes that is located at the same index.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PortTypeVersions(String[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PORTTYPEVERSIONS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_PortTypeVersions(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PORTTYPEVERSIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PortTypeVersions by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PortTypeVersions(WBEMClient client, String namespace,
            String[] newValue) throws WbemsmtException {
        CIM_FibrePort fco = new CIM_FibrePort(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PORTTYPEVERSIONS.NAME);
        if (property != null) {
            property = setPropertyValue_PortTypeVersions(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PORTTYPEVERSIONS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PortTypeVersions
     * <br>
     * Version information for each of the SupportedPortTypes. A particular PortType (mode) may be listed multiple times in the SupportedPortTypes array in order to define multiple, unique version levels. Note that each entry of this array is related to the entry in SupportedPortTypes that is located at the same index.
     */

    private static CIMProperty setPropertyValue_PortTypeVersions(CIMProperty currentProperty,
            String[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ReceiverTransmitterTimeout
     *     * <br>
     * Timeout value in milliseconds used to determine when loss of synchronization has occurred. The typical default is 100 msec.
     *     */

    public javax.cim.UnsignedInteger64 get_ReceiverTransmitterTimeout() {
        CIMProperty currentProperty = getProperty(PROPERTY_RECEIVERTRANSMITTERTIMEOUT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_RECEIVERTRANSMITTERTIMEOUT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property ReceiverTransmitterTimeout
     * <br>
     * Timeout value in milliseconds used to determine when loss of synchronization has occurred. The typical default is 100 msec.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ReceiverTransmitterTimeout(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_RECEIVERTRANSMITTERTIMEOUT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ReceiverTransmitterTimeout(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_RECEIVERTRANSMITTERTIMEOUT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ReceiverTransmitterTimeout by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ReceiverTransmitterTimeout(WBEMClient client,
            String namespace, javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FibrePort fco = new CIM_FibrePort(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_RECEIVERTRANSMITTERTIMEOUT.NAME);
        if (property != null) {
            property = setPropertyValue_ReceiverTransmitterTimeout(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_RECEIVERTRANSMITTERTIMEOUT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ReceiverTransmitterTimeout
     * <br>
     * Timeout value in milliseconds used to determine when loss of synchronization has occurred. The typical default is 100 msec.
     */

    private static CIMProperty setPropertyValue_ReceiverTransmitterTimeout(
            CIMProperty currentProperty, javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property SupportedPortTypes
     *     * <br>
     * An array indicating the modes in which the Port can operate. PortType values describe the role and behavior of the Fibre Channel entity: "N" = Node Port, "NL" = Node Port supporting FC arbitrated loop, "E" = Expansion Port connecting fabric elements (for example, FC switches), "F" = Fabric (element) Port, "FL" = Fabric (element) Port supporting FC arbitrated loop, and "B" = Bridge Port. PortTypes are defined in the ANSI X3 standards. 
     * 
     * A particular mode may be listed multiple times in the SupportedPortTypes array in order to define that multiple, unique version levels are supported. Version information is defined in the PortTypeVersions property. Note that each entry of the SupportedPortTypes array is related to the entry in PortTypeVersions that is located at the same index.
     *     */

    public javax.cim.UnsignedInteger16[] get_SupportedPortTypes() {
        CIMProperty currentProperty = getProperty(PROPERTY_SUPPORTEDPORTTYPES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SUPPORTEDPORTTYPES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16[]) currentProperty.getValue();

    }

    /**
     * Set the property SupportedPortTypes
     * <br>
     * An array indicating the modes in which the Port can operate. PortType values describe the role and behavior of the Fibre Channel entity: "N" = Node Port, "NL" = Node Port supporting FC arbitrated loop, "E" = Expansion Port connecting fabric elements (for example, FC switches), "F" = Fabric (element) Port, "FL" = Fabric (element) Port supporting FC arbitrated loop, and "B" = Bridge Port. PortTypes are defined in the ANSI X3 standards. 
     * 
     * A particular mode may be listed multiple times in the SupportedPortTypes array in order to define that multiple, unique version levels are supported. Version information is defined in the PortTypeVersions property. Note that each entry of the SupportedPortTypes array is related to the entry in PortTypeVersions that is located at the same index.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_SupportedPortTypes(javax.cim.UnsignedInteger16[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SUPPORTEDPORTTYPES.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_SupportedPortTypes(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SUPPORTEDPORTTYPES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SupportedPortTypes by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SupportedPortTypes(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16[] newValue) throws WbemsmtException {
        CIM_FibrePort fco = new CIM_FibrePort(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SUPPORTEDPORTTYPES.NAME);
        if (property != null) {
            property = setPropertyValue_SupportedPortTypes(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SUPPORTEDPORTTYPES.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SupportedPortTypes
     * <br>
     * An array indicating the modes in which the Port can operate. PortType values describe the role and behavior of the Fibre Channel entity: "N" = Node Port, "NL" = Node Port supporting FC arbitrated loop, "E" = Expansion Port connecting fabric elements (for example, FC switches), "F" = Fabric (element) Port, "FL" = Fabric (element) Port supporting FC arbitrated loop, and "B" = Bridge Port. PortTypes are defined in the ANSI X3 standards. 
     * 
     * A particular mode may be listed multiple times in the SupportedPortTypes array in order to define that multiple, unique version levels are supported. Version information is defined in the PortTypeVersions property. Note that each entry of the SupportedPortTypes array is related to the entry in PortTypeVersions that is located at the same index.
     */

    private static CIMProperty setPropertyValue_SupportedPortTypes(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16[] newValue) {
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
     * Get the list with CIM_FibreChannelAdapter objects associated by the association CIM_FibrePortOnFCAdapter
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_FIBREPORTONFCADAPTER as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_FibreChannelAdapter_CIM_FibrePortOnFCAdapters(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_FibreChannelAdapter_CIM_FibrePortOnFCAdapters(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_FIBREPORTONFCADAPTER,
                CIM_FibreChannelAdapter.CIM_CLASS_NAME, null, null, false, false, null);

    }

    /**
     * Get the list with CIM_FibreChannelAdapter objects associated by the association CIM_FibrePortOnFCAdapter
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_FIBREPORTONFCADAPTER or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_FIBREPORTONFCADAPTER as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_FibreChannelAdapter_CIM_FibrePortOnFCAdapters(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_FibreChannelAdapter_CIM_FibrePortOnFCAdapters(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_FIBREPORTONFCADAPTER, resultClass, role, resultRole,
                false, false, null);

    }

    /**
     * Get the list with CIM_FibreChannelAdapter objects associated by the association CIM_FibrePortOnFCAdapter
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_FIBREPORTONFCADAPTER or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_FibreChannelAdapter_CIM_FibrePortOnFCAdapters(
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
                CIM_FibrePortHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_FibrePortHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_FibrePortHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_FibreChannelAdapter(cimInstance));
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
                        result.add(new CIM_FibreChannelAdapter(cimInstance));
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
                        result.add(new CIM_FibreChannelAdapter(cimInstance));
                        continue;
                    }
                }
            }
            CIM_FibrePortHelper.checkException(enumeration);
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
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_FibrePortOnFCAdapter
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_FIBREPORTONFCADAPTER as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_FibreChannelAdapter_CIM_FibrePortOnFCAdapterNames(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_FibreChannelAdapter_CIM_FibrePortOnFCAdapterNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_FIBREPORTONFCADAPTER,
                CIM_FibreChannelAdapter.CIM_CLASS_NAME, null, null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_FibrePortOnFCAdapter
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_FIBREPORTONFCADAPTER or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_FIBREPORTONFCADAPTER as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_FibreChannelAdapter_CIM_FibrePortOnFCAdapterNames(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_FibreChannelAdapter_CIM_FibrePortOnFCAdapterNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_FIBREPORTONFCADAPTER, resultClass, role, resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_FibrePortOnFCAdapter
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_FibreChannelAdapter_CIM_FibrePortOnFCAdapterNames(
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
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_FIBREPORTONFCADAPTER,
                    CIM_FibreChannelAdapter.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_FibrePortHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_FibrePortHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_FibreChannelAdapter.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_FibrePortHelper.checkException(enumeration);
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
     * Get the list with CIM_FibrePortOnFCAdapter associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_FibrePortOnFCAdapter(WBEMClient cimClient,
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_FIBREPORTONFCADAPTER, role, includeQualifiers,
                    includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_FIBREPORTONFCADAPTER, role, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_FibrePortHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_FibrePortHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_FibrePortOnFCAdapterHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_FibrePortOnFCAdapter(cimInstance));
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
                        result.add(new CIM_FibrePortOnFCAdapter(cimInstance));
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
                        result.add(new CIM_FibrePortOnFCAdapter(cimInstance));
                        continue;
                    }
                }
            }
            CIM_FibrePortHelper.checkException(enumeration);
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
     * Get a list of CIMObjectPath items of the associations CIM_FibrePortOnFCAdapter
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_FibrePortOnFCAdapter(WBEMClient cimClient,
            String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_FIBREPORTONFCADAPTER, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_FIBREPORTONFCADAPTER, role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_FibrePortHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_FibrePortHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_FibrePortOnFCAdapter.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_FibrePortHelper.checkException(enumeration);
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
     * Get the list with CIM_FibrePort objects associated by the association CIM_FibrePortActiveLogin
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_FIBREPORTACTIVELOGIN as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_FibrePort_CIM_FibrePortActiveLogins(WBEMClient cimClient)
            throws WbemsmtException {

        return getAssociated_CIM_FibrePort_CIM_FibrePortActiveLogins(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_FIBREPORTACTIVELOGIN, CIM_FibrePort.CIM_CLASS_NAME,
                null, null, false, false, null);

    }

    /**
     * Get the list with CIM_FibrePort objects associated by the association CIM_FibrePortActiveLogin
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_FIBREPORTACTIVELOGIN or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_FIBREPORTACTIVELOGIN as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_FibrePort_CIM_FibrePortActiveLogins(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_FibrePort_CIM_FibrePortActiveLogins(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_FIBREPORTACTIVELOGIN, resultClass, role, resultRole,
                false, false, null);

    }

    /**
     * Get the list with CIM_FibrePort objects associated by the association CIM_FibrePortActiveLogin
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_FIBREPORTACTIVELOGIN or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_FibrePort_CIM_FibrePortActiveLogins(
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
                CIM_FibrePortHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_FibrePortHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_FibrePortHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_FibrePort(cimInstance));
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
                        result.add(new CIM_FibrePort(cimInstance));
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
                        result.add(new CIM_FibrePort(cimInstance));
                        continue;
                    }
                }
            }
            CIM_FibrePortHelper.checkException(enumeration);
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
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_FibrePortActiveLogin
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_FIBREPORTACTIVELOGIN as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_FibrePort_CIM_FibrePortActiveLoginNames(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_FibrePort_CIM_FibrePortActiveLoginNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_FIBREPORTACTIVELOGIN, CIM_FibrePort.CIM_CLASS_NAME,
                null, null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_FibrePortActiveLogin
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_FIBREPORTACTIVELOGIN or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_FIBREPORTACTIVELOGIN as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_FibrePort_CIM_FibrePortActiveLoginNames(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_FibrePort_CIM_FibrePortActiveLoginNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_FIBREPORTACTIVELOGIN, resultClass, role, resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_FibrePortActiveLogin
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_FibrePort_CIM_FibrePortActiveLoginNames(
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
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_FIBREPORTACTIVELOGIN,
                    CIM_FibrePort.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_FibrePortHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_FibrePortHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_FibrePort.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_FibrePortHelper.checkException(enumeration);
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
     * Get the list with CIM_FibrePortActiveLogin associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_FibrePortActiveLogin(WBEMClient cimClient,
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_FIBREPORTACTIVELOGIN, role, includeQualifiers,
                    includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_FIBREPORTACTIVELOGIN, role, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_FibrePortHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_FibrePortHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_FibrePortActiveLoginHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_FibrePortActiveLogin(cimInstance));
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
                        result.add(new CIM_FibrePortActiveLogin(cimInstance));
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
                        result.add(new CIM_FibrePortActiveLogin(cimInstance));
                        continue;
                    }
                }
            }
            CIM_FibrePortHelper.checkException(enumeration);
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
     * Get a list of CIMObjectPath items of the associations CIM_FibrePortActiveLogin
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_FibrePortActiveLogin(WBEMClient cimClient,
            String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_FIBREPORTACTIVELOGIN, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_FIBREPORTACTIVELOGIN, role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_FibrePortHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_FibrePortHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_FibrePortActiveLogin.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_FibrePortHelper.checkException(enumeration);
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
        return CIM_FibrePort.CIM_CLASS_NAME;
    }

}