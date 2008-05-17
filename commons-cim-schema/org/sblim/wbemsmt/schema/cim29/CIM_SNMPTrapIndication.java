/** 
 * CIM_SNMPTrapIndication.java
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
 * Description: A concrete class for mapping an SNMP Trap to CIM based on the IETF RFC 1157. The usefulness of this class is to describe common trap semantics. But, a complete understanding of any trap data received relies on the Indicaton recipient having access to the sender's MIB. Understanding can be improved by mapping the SNMP domain to CIM, and using CIM LifeCycle and standard subclasses of CIM_ProcessIndication.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_SNMPTrapIndication extends CIM_ProcessIndication {

    public final static String CIM_CLASS_NAME = "CIM_SNMPTrapIndication";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property AgentAddress
     * Address of the object generating the trap.
     */
    public static class PROPERTY_AGENTADDRESS {
        /**
         * name of the property AgentAddress
         */
        public final static String NAME = "AgentAddress";

    }

    /**
     * Constants of property Enterprise
     * Type of object generating the trap.
     */
    public static class PROPERTY_ENTERPRISE {
        /**
         * name of the property Enterprise
         */
        public final static String NAME = "Enterprise";

    }

    /**
     * Constants of property GenericTrap
     * An enumerated value that describes the generic trap type: 
     * - The coldStart(0) trap signifies that the sending protocol entity is reinitializing itself such that the agent's configuration or the protocol entity implementation may be altered. 
     * - The warmStart(1) trap signifies that the sending protocol entity is reinitializing itself such that neither the agent configuration nor the protocol entity implementation is altered. 
     * - The linkDown(2) trap signifies that the sending protocol recognizes a failure in one of the communication links represented in the agent's configuration. The Trap-PDU of type linkDown contains as the first element of its variable-bindings the name and value of the ifIndex instance for the affected interface. 
     * - The linkUp(3) trap signifies that the sending protocol entity recognizes that one of the communication links represented in the agent's configuration has come up. The Trap-PDU of type linkUp contains as the first element of its variable-bindings, the name and value of the ifIndex instance for the affected interface. 
     * - An authenticationFailure(4) trap signifies that the sending protocol entity is the adressee of a protocol message that was not properly authenticated. While implementations of SNMP must be capable of generating this trap, they must also be capable of suppressing the emission of such traps via an implementation- specific mechanism. 
     * - An egpNeighborLoss(5) trap signifies that an EGP neighbor for whom the sending protocol entity was an EGP peer has been marked as down and the peer relationship no longer pertains. The Trap-PDU of type egpNeighborLoss contains as the first element of its variable-bindings, the name and value of the egpNeighAddr instance for the affected neighbor. 
     * - An enterpriseSpecific(6) trap signifies that the sending protocol entity recognizes that some enterprise-specific event has occurred. The specific-trap field identifies the particular trap which occurred.
     */
    public static class PROPERTY_GENERICTRAP {
        /**
         * name of the property GenericTrap
         */
        public final static String NAME = "GenericTrap";

        /**
         * constant for value map entry 0
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Cold_Start = new javax.cim.UnsignedInteger16(
                "0");

        /**
         * constant for value entry Cold Start (corresponds to mapEntry 0 )
         */
        public final static String VALUE_ENTRY_Cold_Start = "Cold Start";

        /**
         * constant for value map entry 1
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Warm_Start = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry Warm Start (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_Warm_Start = "Warm Start";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Link_Down = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Link Down (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Link_Down = "Link Down";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Link_Up = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Link Up (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Link_Up = "Link Up";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Authentication_Failure = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Authentication Failure (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Authentication_Failure = "Authentication Failure";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_EGP_Neighbor_Loss = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry EGP Neighbor Loss (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_EGP_Neighbor_Loss = "EGP Neighbor Loss";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Enterprise_Specific = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry Enterprise Specific (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Enterprise_Specific = "Enterprise Specific";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@61e461e4
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Cold_Start.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Cold_Start;
            }

            if (VALUE_ENTRY_Warm_Start.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Warm_Start;
            }

            if (VALUE_ENTRY_Link_Down.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Link_Down;
            }

            if (VALUE_ENTRY_Link_Up.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Link_Up;
            }

            if (VALUE_ENTRY_Authentication_Failure.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Authentication_Failure;
            }

            if (VALUE_ENTRY_EGP_Neighbor_Loss.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_EGP_Neighbor_Loss;
            }

            if (VALUE_ENTRY_Enterprise_Specific.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Enterprise_Specific;
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

            if (iValue == VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Cold_Start.intValue()) {
                return VALUE_ENTRY_Cold_Start;
            }

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Warm_Start.intValue()) {
                return VALUE_ENTRY_Warm_Start;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Link_Down.intValue()) {
                return VALUE_ENTRY_Link_Down;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Link_Up.intValue()) {
                return VALUE_ENTRY_Link_Up;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Authentication_Failure.intValue()) {
                return VALUE_ENTRY_Authentication_Failure;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_EGP_Neighbor_Loss.intValue()) {
                return VALUE_ENTRY_EGP_Neighbor_Loss;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Enterprise_Specific.intValue()) {
                return VALUE_ENTRY_Enterprise_Specific;
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
         * Value Map for the property GenericTrap   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Cold_Start,
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Warm_Start,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Link_Down,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Link_Up,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Authentication_Failure,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_EGP_Neighbor_Loss,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Enterprise_Specific };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property GenericTrap   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Cold_Start,
                VALUE_ENTRY_Warm_Start, VALUE_ENTRY_Link_Down, VALUE_ENTRY_Link_Up,
                VALUE_ENTRY_Authentication_Failure, VALUE_ENTRY_EGP_Neighbor_Loss,
                VALUE_ENTRY_Enterprise_Specific };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property GenericTrap   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Cold_Start,
                VALUE_ENTRY_Warm_Start, VALUE_ENTRY_Link_Down, VALUE_ENTRY_Link_Up,
                VALUE_ENTRY_Authentication_Failure, VALUE_ENTRY_EGP_Neighbor_Loss,
                VALUE_ENTRY_Enterprise_Specific };

    }

    /**
     * Constants of property SpecificTrap
     * Specific trap code.
     */
    public static class PROPERTY_SPECIFICTRAP {
        /**
         * name of the property SpecificTrap
         */
        public final static String NAME = "SpecificTrap";

    }

    /**
     * Constants of property TimeStamp
     * Time elapsed between the last (re)intialization of the managed entity and the generation of the trap.
     */
    public static class PROPERTY_TIMESTAMP {
        /**
         * name of the property TimeStamp
         */
        public final static String NAME = "TimeStamp";

    }

    /**
     * Constants of property VarBindNames
     * Object naming information (an OID) from the 'variable binding' portion of the Trap. This array is correlated with the VarBindSyntaxes and VarBindValues arrays. Each entry is related to the entries in the other arrays, that are located at the same index. In this way, the variable binding's name/syntax/value tuple can be constructed.
     */
    public static class PROPERTY_VARBINDNAMES {
        /**
         * name of the property VarBindNames
         */
        public final static String NAME = "VarBindNames";

    }

    /**
     * Constants of property VarBindSyntaxes
     * Object syntax information (defined as an enumerated value) from the 'variable binding' portion of the Trap. This array is correlated with the VarBindNames and VarBindValues arrays. Each entry is related to the entries in the other arrays, that are located at the same index. In this way, the variable binding's name/syntax/value tuple can be constructed.
     */
    public static class PROPERTY_VARBINDSYNTAXES {
        /**
         * name of the property VarBindSyntaxes
         */
        public final static String NAME = "VarBindSyntaxes";

        /**
         * constant for value map entry 1
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Integer = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry Integer (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_Integer = "Integer";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_OctetString = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry OctetString (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_OctetString = "OctetString";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_ObjectIdentifier = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry ObjectIdentifier (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_ObjectIdentifier = "ObjectIdentifier";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_NetworkAddress = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry NetworkAddress (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_NetworkAddress = "NetworkAddress";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Counter = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry Counter (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Counter = "Counter";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Gauge = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry Gauge (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Gauge = "Gauge";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_TimeTicks = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry TimeTicks (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_TimeTicks = "TimeTicks";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Opaque = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry Opaque (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_Opaque = "Opaque";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@20fc20fc
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Integer.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Integer;
            }

            if (VALUE_ENTRY_OctetString.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_OctetString;
            }

            if (VALUE_ENTRY_ObjectIdentifier.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_ObjectIdentifier;
            }

            if (VALUE_ENTRY_NetworkAddress.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_NetworkAddress;
            }

            if (VALUE_ENTRY_Counter.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Counter;
            }

            if (VALUE_ENTRY_Gauge.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Gauge;
            }

            if (VALUE_ENTRY_TimeTicks.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_TimeTicks;
            }

            if (VALUE_ENTRY_Opaque.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Opaque;
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

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Integer.intValue()) {
                return VALUE_ENTRY_Integer;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_OctetString.intValue()) {
                return VALUE_ENTRY_OctetString;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_ObjectIdentifier.intValue()) {
                return VALUE_ENTRY_ObjectIdentifier;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_NetworkAddress.intValue()) {
                return VALUE_ENTRY_NetworkAddress;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Counter.intValue()) {
                return VALUE_ENTRY_Counter;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Gauge.intValue()) {
                return VALUE_ENTRY_Gauge;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_TimeTicks.intValue()) {
                return VALUE_ENTRY_TimeTicks;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Opaque.intValue()) {
                return VALUE_ENTRY_Opaque;
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
         * Value Map for the property VarBindSyntaxes   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Integer,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_OctetString,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_ObjectIdentifier,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_NetworkAddress,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Counter, VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Gauge,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_TimeTicks,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Opaque };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property VarBindSyntaxes   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Integer,
                VALUE_ENTRY_OctetString, VALUE_ENTRY_ObjectIdentifier, VALUE_ENTRY_NetworkAddress,
                VALUE_ENTRY_Counter, VALUE_ENTRY_Gauge, VALUE_ENTRY_TimeTicks, VALUE_ENTRY_Opaque };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property VarBindSyntaxes   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Integer,
                VALUE_ENTRY_OctetString, VALUE_ENTRY_ObjectIdentifier, VALUE_ENTRY_NetworkAddress,
                VALUE_ENTRY_Counter, VALUE_ENTRY_Gauge, VALUE_ENTRY_TimeTicks, VALUE_ENTRY_Opaque };

    }

    /**
     * Constants of property VarBindValues
     * An OctetString representing object value information from the 'variable binding' portion of the Trap. This array is correlated with the VarBindNames and VarBindSyntaxes arrays. Each entry is related to the entries in the other arrays, that are located at the same index. In this way, the variable binding's name/syntax/value tuple can be constructed.
     */
    public static class PROPERTY_VARBINDVALUES {
        /**
         * name of the property VarBindValues
         */
        public final static String NAME = "VarBindValues";

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
     *   A concrete class for mapping an SNMP Trap to CIM based on the IETF RFC 1157. The usefulness of this class is to describe common trap semantics. But, a complete understanding of any trap data received relies on the Indicaton recipient having access to the sender's MIB. Understanding can be improved by mapping the SNMP domain to CIM, and using CIM LifeCycle and standard subclasses of CIM_ProcessIndication.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_SNMPTrapIndication(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   A concrete class for mapping an SNMP Trap to CIM based on the IETF RFC 1157. The usefulness of this class is to describe common trap semantics. But, a complete understanding of any trap data received relies on the Indicaton recipient having access to the sender's MIB. Understanding can be improved by mapping the SNMP domain to CIM, and using CIM LifeCycle and standard subclasses of CIM_ProcessIndication.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_SNMPTrapIndication(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_SNMPTrapIndication() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("AgentAddress", new CIMProperty("AgentAddress", CIMDataType.STRING_T,
                null));
        propertiesToCheck.put("Enterprise", new CIMProperty("Enterprise", CIMDataType.STRING_T,
                null));
        propertiesToCheck.put("GenericTrap", new CIMProperty("GenericTrap", CIMDataType.UINT16_T,
                null));
        propertiesToCheck.put("SpecificTrap", new CIMProperty("SpecificTrap", CIMDataType.UINT32_T,
                null));
        propertiesToCheck.put("TimeStamp", new CIMProperty("TimeStamp", CIMDataType.DATETIME_T,
                null));
        propertiesToCheck.put("VarBindNames", new CIMProperty("VarBindNames",
                CIMDataType.STRING_ARRAY_T, null));
        propertiesToCheck.put("VarBindSyntaxes", new CIMProperty("VarBindSyntaxes",
                CIMDataType.UINT16_ARRAY_T, null));
        propertiesToCheck.put("VarBindValues", new CIMProperty("VarBindValues",
                CIMDataType.STRING_ARRAY_T, null));

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
     * Get the property AgentAddress
     *     * <br>
     * Address of the object generating the trap.
     *     */

    public String get_AgentAddress() {
        CIMProperty currentProperty = getProperty(PROPERTY_AGENTADDRESS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_AGENTADDRESS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property AgentAddress
     * <br>
     * Address of the object generating the trap.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_AgentAddress(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_AGENTADDRESS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_AgentAddress(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_AGENTADDRESS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property AgentAddress by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_AgentAddress(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_SNMPTrapIndication fco = new CIM_SNMPTrapIndication(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_AGENTADDRESS.NAME);
        if (property != null) {
            property = setPropertyValue_AgentAddress(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_AGENTADDRESS.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property AgentAddress
     * <br>
     * Address of the object generating the trap.
     */

    private static CIMProperty setPropertyValue_AgentAddress(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Enterprise
     *     * <br>
     * Type of object generating the trap.
     *     */

    public String get_Enterprise() {
        CIMProperty currentProperty = getProperty(PROPERTY_ENTERPRISE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ENTERPRISE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property Enterprise
     * <br>
     * Type of object generating the trap.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Enterprise(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ENTERPRISE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Enterprise(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ENTERPRISE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Enterprise by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Enterprise(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_SNMPTrapIndication fco = new CIM_SNMPTrapIndication(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ENTERPRISE.NAME);
        if (property != null) {
            property = setPropertyValue_Enterprise(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ENTERPRISE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Enterprise
     * <br>
     * Type of object generating the trap.
     */

    private static CIMProperty setPropertyValue_Enterprise(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property GenericTrap
     *     * <br>
     * An enumerated value that describes the generic trap type: 
     * - The coldStart(0) trap signifies that the sending protocol entity is reinitializing itself such that the agent's configuration or the protocol entity implementation may be altered. 
     * - The warmStart(1) trap signifies that the sending protocol entity is reinitializing itself such that neither the agent configuration nor the protocol entity implementation is altered. 
     * - The linkDown(2) trap signifies that the sending protocol recognizes a failure in one of the communication links represented in the agent's configuration. The Trap-PDU of type linkDown contains as the first element of its variable-bindings the name and value of the ifIndex instance for the affected interface. 
     * - The linkUp(3) trap signifies that the sending protocol entity recognizes that one of the communication links represented in the agent's configuration has come up. The Trap-PDU of type linkUp contains as the first element of its variable-bindings, the name and value of the ifIndex instance for the affected interface. 
     * - An authenticationFailure(4) trap signifies that the sending protocol entity is the adressee of a protocol message that was not properly authenticated. While implementations of SNMP must be capable of generating this trap, they must also be capable of suppressing the emission of such traps via an implementation- specific mechanism. 
     * - An egpNeighborLoss(5) trap signifies that an EGP neighbor for whom the sending protocol entity was an EGP peer has been marked as down and the peer relationship no longer pertains. The Trap-PDU of type egpNeighborLoss contains as the first element of its variable-bindings, the name and value of the egpNeighAddr instance for the affected neighbor. 
     * - An enterpriseSpecific(6) trap signifies that the sending protocol entity recognizes that some enterprise-specific event has occurred. The specific-trap field identifies the particular trap which occurred.
     *     */

    public javax.cim.UnsignedInteger16 get_GenericTrap() {
        CIMProperty currentProperty = getProperty(PROPERTY_GENERICTRAP.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_GENERICTRAP.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property GenericTrap
     * <br>
     * An enumerated value that describes the generic trap type: 
     * - The coldStart(0) trap signifies that the sending protocol entity is reinitializing itself such that the agent's configuration or the protocol entity implementation may be altered. 
     * - The warmStart(1) trap signifies that the sending protocol entity is reinitializing itself such that neither the agent configuration nor the protocol entity implementation is altered. 
     * - The linkDown(2) trap signifies that the sending protocol recognizes a failure in one of the communication links represented in the agent's configuration. The Trap-PDU of type linkDown contains as the first element of its variable-bindings the name and value of the ifIndex instance for the affected interface. 
     * - The linkUp(3) trap signifies that the sending protocol entity recognizes that one of the communication links represented in the agent's configuration has come up. The Trap-PDU of type linkUp contains as the first element of its variable-bindings, the name and value of the ifIndex instance for the affected interface. 
     * - An authenticationFailure(4) trap signifies that the sending protocol entity is the adressee of a protocol message that was not properly authenticated. While implementations of SNMP must be capable of generating this trap, they must also be capable of suppressing the emission of such traps via an implementation- specific mechanism. 
     * - An egpNeighborLoss(5) trap signifies that an EGP neighbor for whom the sending protocol entity was an EGP peer has been marked as down and the peer relationship no longer pertains. The Trap-PDU of type egpNeighborLoss contains as the first element of its variable-bindings, the name and value of the egpNeighAddr instance for the affected neighbor. 
     * - An enterpriseSpecific(6) trap signifies that the sending protocol entity recognizes that some enterprise-specific event has occurred. The specific-trap field identifies the particular trap which occurred.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_GenericTrap(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_GENERICTRAP.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_GenericTrap(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_GENERICTRAP.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property GenericTrap by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_GenericTrap(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_SNMPTrapIndication fco = new CIM_SNMPTrapIndication(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_GENERICTRAP.NAME);
        if (property != null) {
            property = setPropertyValue_GenericTrap(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_GENERICTRAP.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property GenericTrap
     * <br>
     * An enumerated value that describes the generic trap type: 
     * - The coldStart(0) trap signifies that the sending protocol entity is reinitializing itself such that the agent's configuration or the protocol entity implementation may be altered. 
     * - The warmStart(1) trap signifies that the sending protocol entity is reinitializing itself such that neither the agent configuration nor the protocol entity implementation is altered. 
     * - The linkDown(2) trap signifies that the sending protocol recognizes a failure in one of the communication links represented in the agent's configuration. The Trap-PDU of type linkDown contains as the first element of its variable-bindings the name and value of the ifIndex instance for the affected interface. 
     * - The linkUp(3) trap signifies that the sending protocol entity recognizes that one of the communication links represented in the agent's configuration has come up. The Trap-PDU of type linkUp contains as the first element of its variable-bindings, the name and value of the ifIndex instance for the affected interface. 
     * - An authenticationFailure(4) trap signifies that the sending protocol entity is the adressee of a protocol message that was not properly authenticated. While implementations of SNMP must be capable of generating this trap, they must also be capable of suppressing the emission of such traps via an implementation- specific mechanism. 
     * - An egpNeighborLoss(5) trap signifies that an EGP neighbor for whom the sending protocol entity was an EGP peer has been marked as down and the peer relationship no longer pertains. The Trap-PDU of type egpNeighborLoss contains as the first element of its variable-bindings, the name and value of the egpNeighAddr instance for the affected neighbor. 
     * - An enterpriseSpecific(6) trap signifies that the sending protocol entity recognizes that some enterprise-specific event has occurred. The specific-trap field identifies the particular trap which occurred.
     */

    private static CIMProperty setPropertyValue_GenericTrap(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property SpecificTrap
     *     * <br>
     * Specific trap code.
     *     */

    public javax.cim.UnsignedInteger32 get_SpecificTrap() {
        CIMProperty currentProperty = getProperty(PROPERTY_SPECIFICTRAP.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SPECIFICTRAP.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property SpecificTrap
     * <br>
     * Specific trap code.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_SpecificTrap(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SPECIFICTRAP.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_SpecificTrap(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SPECIFICTRAP.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SpecificTrap by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SpecificTrap(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_SNMPTrapIndication fco = new CIM_SNMPTrapIndication(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SPECIFICTRAP.NAME);
        if (property != null) {
            property = setPropertyValue_SpecificTrap(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SPECIFICTRAP.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SpecificTrap
     * <br>
     * Specific trap code.
     */

    private static CIMProperty setPropertyValue_SpecificTrap(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property TimeStamp
     *     * <br>
     * Time elapsed between the last (re)intialization of the managed entity and the generation of the trap.
     *     */

    public javax.cim.CIMDateTime get_TimeStamp() {
        CIMProperty currentProperty = getProperty(PROPERTY_TIMESTAMP.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_TIMESTAMP.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.CIMDateTime) currentProperty.getValue();

    }

    /**
     * Set the property TimeStamp
     * <br>
     * Time elapsed between the last (re)intialization of the managed entity and the generation of the trap.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_TimeStamp(javax.cim.CIMDateTime newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_TIMESTAMP.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_TimeStamp(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_TIMESTAMP.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property TimeStamp by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_TimeStamp(WBEMClient client, String namespace,
            javax.cim.CIMDateTime newValue) throws WbemsmtException {
        CIM_SNMPTrapIndication fco = new CIM_SNMPTrapIndication(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_TIMESTAMP.NAME);
        if (property != null) {
            property = setPropertyValue_TimeStamp(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_TIMESTAMP.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property TimeStamp
     * <br>
     * Time elapsed between the last (re)intialization of the managed entity and the generation of the trap.
     */

    private static CIMProperty setPropertyValue_TimeStamp(CIMProperty currentProperty,
            javax.cim.CIMDateTime newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property VarBindNames
     *     * <br>
     * Object naming information (an OID) from the 'variable binding' portion of the Trap. This array is correlated with the VarBindSyntaxes and VarBindValues arrays. Each entry is related to the entries in the other arrays, that are located at the same index. In this way, the variable binding's name/syntax/value tuple can be constructed.
     *     */

    public String[] get_VarBindNames() {
        CIMProperty currentProperty = getProperty(PROPERTY_VARBINDNAMES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_VARBINDNAMES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String[]) currentProperty.getValue();

    }

    /**
     * Set the property VarBindNames
     * <br>
     * Object naming information (an OID) from the 'variable binding' portion of the Trap. This array is correlated with the VarBindSyntaxes and VarBindValues arrays. Each entry is related to the entries in the other arrays, that are located at the same index. In this way, the variable binding's name/syntax/value tuple can be constructed.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_VarBindNames(String[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_VARBINDNAMES.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_VarBindNames(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_VARBINDNAMES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property VarBindNames by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_VarBindNames(WBEMClient client, String namespace,
            String[] newValue) throws WbemsmtException {
        CIM_SNMPTrapIndication fco = new CIM_SNMPTrapIndication(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_VARBINDNAMES.NAME);
        if (property != null) {
            property = setPropertyValue_VarBindNames(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_VARBINDNAMES.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property VarBindNames
     * <br>
     * Object naming information (an OID) from the 'variable binding' portion of the Trap. This array is correlated with the VarBindSyntaxes and VarBindValues arrays. Each entry is related to the entries in the other arrays, that are located at the same index. In this way, the variable binding's name/syntax/value tuple can be constructed.
     */

    private static CIMProperty setPropertyValue_VarBindNames(CIMProperty currentProperty,
            String[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property VarBindSyntaxes
     *     * <br>
     * Object syntax information (defined as an enumerated value) from the 'variable binding' portion of the Trap. This array is correlated with the VarBindNames and VarBindValues arrays. Each entry is related to the entries in the other arrays, that are located at the same index. In this way, the variable binding's name/syntax/value tuple can be constructed.
     *     */

    public javax.cim.UnsignedInteger16[] get_VarBindSyntaxes() {
        CIMProperty currentProperty = getProperty(PROPERTY_VARBINDSYNTAXES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_VARBINDSYNTAXES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16[]) currentProperty.getValue();

    }

    /**
     * Set the property VarBindSyntaxes
     * <br>
     * Object syntax information (defined as an enumerated value) from the 'variable binding' portion of the Trap. This array is correlated with the VarBindNames and VarBindValues arrays. Each entry is related to the entries in the other arrays, that are located at the same index. In this way, the variable binding's name/syntax/value tuple can be constructed.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_VarBindSyntaxes(javax.cim.UnsignedInteger16[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_VARBINDSYNTAXES.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_VarBindSyntaxes(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_VARBINDSYNTAXES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property VarBindSyntaxes by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_VarBindSyntaxes(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16[] newValue) throws WbemsmtException {
        CIM_SNMPTrapIndication fco = new CIM_SNMPTrapIndication(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_VARBINDSYNTAXES.NAME);
        if (property != null) {
            property = setPropertyValue_VarBindSyntaxes(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_VARBINDSYNTAXES.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property VarBindSyntaxes
     * <br>
     * Object syntax information (defined as an enumerated value) from the 'variable binding' portion of the Trap. This array is correlated with the VarBindNames and VarBindValues arrays. Each entry is related to the entries in the other arrays, that are located at the same index. In this way, the variable binding's name/syntax/value tuple can be constructed.
     */

    private static CIMProperty setPropertyValue_VarBindSyntaxes(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property VarBindValues
     *     * <br>
     * An OctetString representing object value information from the 'variable binding' portion of the Trap. This array is correlated with the VarBindNames and VarBindSyntaxes arrays. Each entry is related to the entries in the other arrays, that are located at the same index. In this way, the variable binding's name/syntax/value tuple can be constructed.
     *     */

    public String[] get_VarBindValues() {
        CIMProperty currentProperty = getProperty(PROPERTY_VARBINDVALUES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_VARBINDVALUES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String[]) currentProperty.getValue();

    }

    /**
     * Set the property VarBindValues
     * <br>
     * An OctetString representing object value information from the 'variable binding' portion of the Trap. This array is correlated with the VarBindNames and VarBindSyntaxes arrays. Each entry is related to the entries in the other arrays, that are located at the same index. In this way, the variable binding's name/syntax/value tuple can be constructed.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_VarBindValues(String[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_VARBINDVALUES.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_VarBindValues(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_VARBINDVALUES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property VarBindValues by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_VarBindValues(WBEMClient client, String namespace,
            String[] newValue) throws WbemsmtException {
        CIM_SNMPTrapIndication fco = new CIM_SNMPTrapIndication(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_VARBINDVALUES.NAME);
        if (property != null) {
            property = setPropertyValue_VarBindValues(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_VARBINDVALUES.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property VarBindValues
     * <br>
     * An OctetString representing object value information from the 'variable binding' portion of the Trap. This array is correlated with the VarBindNames and VarBindSyntaxes arrays. Each entry is related to the entries in the other arrays, that are located at the same index. In this way, the variable binding's name/syntax/value tuple can be constructed.
     */

    private static CIMProperty setPropertyValue_VarBindValues(CIMProperty currentProperty,
            String[] newValue) {
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
        return CIM_SNMPTrapIndication.CIM_CLASS_NAME;
    }

}