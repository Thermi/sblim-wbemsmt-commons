/** 
 * CIM_ObjectManagerCommunicationMechanism.java
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
 * Description: The class, ObjectManagerCommunicationMechanism, describes access to an ObjectManager. It describes a protocol and data encoding that can be used for communication. When all instances of this class are enumerated for an ObjectManager (using the CommMechanismForManager association), all possible protocol and encoding schemes will be known. Also, specific capabilities (for example, basic read or query) that are supported in the protocol/encoding are described - using the ProfilesSupported property.
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

public class CIM_ObjectManagerCommunicationMechanism extends CIM_ServiceAccessPoint {

    public final static String CIM_CLASS_NAME = "CIM_ObjectManagerCommunicationMechanism";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * CommMechanismForManager is an association between an ObjectManager and an ObjectManagerCommunicationMechanism class. The latter describes a possible encoding/protocol/ set of operations for accessing the referenced ObjectManager.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFORMANAGER = "CIM_CommMechanismForManager";

    /**
     * CommMechanismForAdapter is an association between an ObjectManager's communication mechanism and a ProtocolAdapter that supports that mechanism to translate requests and responses for the Object Manager.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFORADAPTER = "CIM_CommMechanismForAdapter";

    /**
     * CommMechanismForObjectManagerAdapter is an association between an ObjectManager's communication mechanism and a ObjectManagerAdapter that supports that mechanism to translate requests and responses for the Object Manager.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFOROBJECTMANAGERADAPTER = "CIM_CommMechanismForObjectManagerAdapter";

    /**
     * Constants of property AuthenticationMechanismDescriptions
     * Free-form strings providing descriptions of the supported mechanisms. Entries in this array are correlated with those in the AuthenticationMechanismsSupported array. An entry in this Descriptions array MUST be provided when 1, "Other", is specified in AuthenticationMechanismsSupported.
     */
    public static class PROPERTY_AUTHENTICATIONMECHANISMDESCRIPTIONS {
        /**
         * name of the property AuthenticationMechanismDescriptions
         */
        public final static String NAME = "AuthenticationMechanismDescriptions";

    }

    /**
     * Constants of property AuthenticationMechanismsSupported
     * Enumerated array describing the types of authentication supported by the ObjectManager, using the encoding/protocol. specified in the property, CommunicationMechanism. The defined values represent the authentication defined in the DMTF document, Specification for CIM Operations over HTTP.
     */
    public static class PROPERTY_AUTHENTICATIONMECHANISMSSUPPORTED {
        /**
         * name of the property AuthenticationMechanismsSupported
         */
        public final static String NAME = "AuthenticationMechanismsSupported";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Basic = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Basic (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Basic = "Basic";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Digest = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Digest (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Digest = "Digest";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@7efe7efe
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

            if (VALUE_ENTRY_Basic.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Basic;
            }

            if (VALUE_ENTRY_Digest.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Digest;
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

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Basic.intValue()) {
                return VALUE_ENTRY_Basic;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Digest.intValue()) {
                return VALUE_ENTRY_Digest;
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
         * Value Map for the property AuthenticationMechanismsSupported   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_None, VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Basic,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Digest };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property AuthenticationMechanismsSupported   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_None, VALUE_ENTRY_Basic, VALUE_ENTRY_Digest };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property AuthenticationMechanismsSupported   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_None, VALUE_ENTRY_Basic, VALUE_ENTRY_Digest };

    }

    /**
     * Constants of property CommunicationMechanism
     * CommunicationMechanism describes an encoding and protocol which can be used to communicate with the ObjectManager. At this time, only one encoding and protocol are standardized by the DMTF - "CIM-XML". If this is supported by an ObjectManager, the specified string should be indicated. Other 'standard' strings may be defined. In addition, a vendor specific encoding/protocol string may be used.
     */
    public static class PROPERTY_COMMUNICATIONMECHANISM {
        /**
         * name of the property CommunicationMechanism
         */
        public final static String NAME = "CommunicationMechanism";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_CIM_XML = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry CIM-XML (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_CIM_XML = "CIM-XML";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@11fc11fc
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_CIM_XML.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_CIM_XML;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_CIM_XML.intValue()) {
                return VALUE_ENTRY_CIM_XML;
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
         * Value Map for the property CommunicationMechanism   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_CIM_XML };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property CommunicationMechanism   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_CIM_XML };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property CommunicationMechanism   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_CIM_XML };

    }

    /**
     * Constants of property FunctionalProfileDescriptions
     * Free-form strings providing descriptions of the supported operations of the object manager. Entries in the array are correlated with those in the ProfilesSupported array. An entry in this Descriptions array MUST be provided when 1, "Other", is specified in the FunctionalProfilesSupported array.
     */
    public static class PROPERTY_FUNCTIONALPROFILEDESCRIPTIONS {
        /**
         * name of the property FunctionalProfileDescriptions
         */
        public final static String NAME = "FunctionalProfileDescriptions";

    }

    /**
     * Constants of property FunctionalProfilesSupported
     * Enumerated array describing the types of operations supported by the ObjectManager, using this encoding/protocol. The enumeration is based on the Functional Profiles defined for conformance in the DMTF document, Specification for CIM Operations over HTTP.
     */
    public static class PROPERTY_FUNCTIONALPROFILESSUPPORTED {
        /**
         * name of the property FunctionalProfilesSupported
         */
        public final static String NAME = "FunctionalProfilesSupported";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Basic_Read = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Basic Read (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Basic_Read = "Basic Read";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Basic_Write = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Basic Write (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Basic_Write = "Basic Write";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Schema_Manipulation = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Schema Manipulation (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Schema_Manipulation = "Schema Manipulation";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Instance_Manipulation = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry Instance Manipulation (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Instance_Manipulation = "Instance Manipulation";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Association_Traversal = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry Association Traversal (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Association_Traversal = "Association Traversal";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Query_Execution = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry Query Execution (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_Query_Execution = "Query Execution";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Qualifier_Declaration = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry Qualifier Declaration (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_Qualifier_Declaration = "Qualifier Declaration";

        /**
         * constant for value map entry 9
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Indications = new javax.cim.UnsignedInteger16(
                "9");

        /**
         * constant for value entry Indications (corresponds to mapEntry 9 )
         */
        public final static String VALUE_ENTRY_Indications = "Indications";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@17261726
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Basic_Read.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Basic_Read;
            }

            if (VALUE_ENTRY_Basic_Write.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Basic_Write;
            }

            if (VALUE_ENTRY_Schema_Manipulation.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Schema_Manipulation;
            }

            if (VALUE_ENTRY_Instance_Manipulation.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Instance_Manipulation;
            }

            if (VALUE_ENTRY_Association_Traversal.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Association_Traversal;
            }

            if (VALUE_ENTRY_Query_Execution.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Query_Execution;
            }

            if (VALUE_ENTRY_Qualifier_Declaration.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Qualifier_Declaration;
            }

            if (VALUE_ENTRY_Indications.equals(value)) {
                return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Indications;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Basic_Read.intValue()) {
                return VALUE_ENTRY_Basic_Read;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Basic_Write.intValue()) {
                return VALUE_ENTRY_Basic_Write;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Schema_Manipulation.intValue()) {
                return VALUE_ENTRY_Schema_Manipulation;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Instance_Manipulation.intValue()) {
                return VALUE_ENTRY_Instance_Manipulation;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Association_Traversal.intValue()) {
                return VALUE_ENTRY_Association_Traversal;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Query_Execution.intValue()) {
                return VALUE_ENTRY_Query_Execution;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Qualifier_Declaration.intValue()) {
                return VALUE_ENTRY_Qualifier_Declaration;
            }

            if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Indications.intValue()) {
                return VALUE_ENTRY_Indications;
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
         * Value Map for the property FunctionalProfilesSupported   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Basic_Read,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Basic_Write,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Schema_Manipulation,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Instance_Manipulation,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Association_Traversal,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Query_Execution,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Qualifier_Declaration,
                VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Indications };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property FunctionalProfilesSupported   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_Basic_Read, VALUE_ENTRY_Basic_Write, VALUE_ENTRY_Schema_Manipulation,
                VALUE_ENTRY_Instance_Manipulation, VALUE_ENTRY_Association_Traversal,
                VALUE_ENTRY_Query_Execution, VALUE_ENTRY_Qualifier_Declaration,
                VALUE_ENTRY_Indications };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property FunctionalProfilesSupported   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_Basic_Read, VALUE_ENTRY_Basic_Write,
                VALUE_ENTRY_Schema_Manipulation, VALUE_ENTRY_Instance_Manipulation,
                VALUE_ENTRY_Association_Traversal, VALUE_ENTRY_Query_Execution,
                VALUE_ENTRY_Qualifier_Declaration, VALUE_ENTRY_Indications };

    }

    /**
     * Constants of property MultipleOperationsSupported
     * Boolean indicating whether the ObjectManager supports multiple operation requests (TRUE) or only simple requests (FALSE).
     */
    public static class PROPERTY_MULTIPLEOPERATIONSSUPPORTED {
        /**
         * name of the property MultipleOperationsSupported
         */
        public final static String NAME = "MultipleOperationsSupported";

    }

    /**
     * Constants of property OtherCommunicationMechanismDescription
     * A free-form string providing a description of the supported protocols when 1, "Other", is specified in the CommunicationMechanism.
     */
    public static class PROPERTY_OTHERCOMMUNICATIONMECHANISMDESCRIPTION {
        /**
         * name of the property OtherCommunicationMechanismDescription
         */
        public final static String NAME = "OtherCommunicationMechanismDescription";

    }

    /**
     * Constants of property Version
     * Provides the protocol version for this service access point. Version information MUST be in the form of M.N, where M is a numeric that describes the Major version and N is a numeric that describes the minor version.
     */
    public static class PROPERTY_VERSION {
        /**
         * name of the property Version
         */
        public final static String NAME = "Version";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_ServiceAccessPoint.getPackages();

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
     *   The class, ObjectManagerCommunicationMechanism, describes access to an ObjectManager. It describes a protocol and data encoding that can be used for communication. When all instances of this class are enumerated for an ObjectManager (using the CommMechanismForManager association), all possible protocol and encoding schemes will be known. Also, specific capabilities (for example, basic read or query) that are supported in the protocol/encoding are described - using the ProfilesSupported property.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_ObjectManagerCommunicationMechanism(WBEMClient client, String namespace)
            throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   The class, ObjectManagerCommunicationMechanism, describes access to an ObjectManager. It describes a protocol and data encoding that can be used for communication. When all instances of this class are enumerated for an ObjectManager (using the CommMechanismForManager association), all possible protocol and encoding schemes will be known. Also, specific capabilities (for example, basic read or query) that are supported in the protocol/encoding are described - using the ProfilesSupported property.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_ObjectManagerCommunicationMechanism(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_ObjectManagerCommunicationMechanism() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("AuthenticationMechanismDescriptions", new CIMProperty(
                "AuthenticationMechanismDescriptions", CIMDataType.STRING_ARRAY_T, null));
        propertiesToCheck.put("AuthenticationMechanismsSupported", new CIMProperty(
                "AuthenticationMechanismsSupported", CIMDataType.UINT16_ARRAY_T, null));
        propertiesToCheck.put("CommunicationMechanism", new CIMProperty("CommunicationMechanism",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("FunctionalProfileDescriptions", new CIMProperty(
                "FunctionalProfileDescriptions", CIMDataType.STRING_ARRAY_T, null));
        propertiesToCheck.put("FunctionalProfilesSupported", new CIMProperty(
                "FunctionalProfilesSupported", CIMDataType.UINT16_ARRAY_T, null));
        propertiesToCheck.put("MultipleOperationsSupported", new CIMProperty(
                "MultipleOperationsSupported", CIMDataType.BOOLEAN_T, null));
        propertiesToCheck.put("OtherCommunicationMechanismDescription", new CIMProperty(
                "OtherCommunicationMechanismDescription", CIMDataType.STRING_T, null));
        propertiesToCheck.put("Version", new CIMProperty("Version", CIMDataType.STRING_T, null));

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
     * Get the property AuthenticationMechanismDescriptions
     *     * <br>
     * Free-form strings providing descriptions of the supported mechanisms. Entries in this array are correlated with those in the AuthenticationMechanismsSupported array. An entry in this Descriptions array MUST be provided when 1, "Other", is specified in AuthenticationMechanismsSupported.
     *     */

    public String[] get_AuthenticationMechanismDescriptions() {
        CIMProperty currentProperty = getProperty(PROPERTY_AUTHENTICATIONMECHANISMDESCRIPTIONS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_AUTHENTICATIONMECHANISMDESCRIPTIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String[]) currentProperty.getValue();

    }

    /**
     * Set the property AuthenticationMechanismDescriptions
     * <br>
     * Free-form strings providing descriptions of the supported mechanisms. Entries in this array are correlated with those in the AuthenticationMechanismsSupported array. An entry in this Descriptions array MUST be provided when 1, "Other", is specified in AuthenticationMechanismsSupported.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_AuthenticationMechanismDescriptions(String[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_AUTHENTICATIONMECHANISMDESCRIPTIONS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_AuthenticationMechanismDescriptions(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_AUTHENTICATIONMECHANISMDESCRIPTIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property AuthenticationMechanismDescriptions by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_AuthenticationMechanismDescriptions(WBEMClient client,
            String namespace, String[] newValue) throws WbemsmtException {
        CIM_ObjectManagerCommunicationMechanism fco = new CIM_ObjectManagerCommunicationMechanism(
                client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_AUTHENTICATIONMECHANISMDESCRIPTIONS.NAME);
        if (property != null) {
            property = setPropertyValue_AuthenticationMechanismDescriptions(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_AUTHENTICATIONMECHANISMDESCRIPTIONS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property AuthenticationMechanismDescriptions
     * <br>
     * Free-form strings providing descriptions of the supported mechanisms. Entries in this array are correlated with those in the AuthenticationMechanismsSupported array. An entry in this Descriptions array MUST be provided when 1, "Other", is specified in AuthenticationMechanismsSupported.
     */

    private static CIMProperty setPropertyValue_AuthenticationMechanismDescriptions(
            CIMProperty currentProperty, String[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property AuthenticationMechanismsSupported
     *     * <br>
     * Enumerated array describing the types of authentication supported by the ObjectManager, using the encoding/protocol. specified in the property, CommunicationMechanism. The defined values represent the authentication defined in the DMTF document, Specification for CIM Operations over HTTP.
     *     */

    public javax.cim.UnsignedInteger16[] get_AuthenticationMechanismsSupported() {
        CIMProperty currentProperty = getProperty(PROPERTY_AUTHENTICATIONMECHANISMSSUPPORTED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_AUTHENTICATIONMECHANISMSSUPPORTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16[]) currentProperty.getValue();

    }

    /**
     * Set the property AuthenticationMechanismsSupported
     * <br>
     * Enumerated array describing the types of authentication supported by the ObjectManager, using the encoding/protocol. specified in the property, CommunicationMechanism. The defined values represent the authentication defined in the DMTF document, Specification for CIM Operations over HTTP.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_AuthenticationMechanismsSupported(javax.cim.UnsignedInteger16[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_AUTHENTICATIONMECHANISMSSUPPORTED.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_AuthenticationMechanismsSupported(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_AUTHENTICATIONMECHANISMSSUPPORTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property AuthenticationMechanismsSupported by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_AuthenticationMechanismsSupported(WBEMClient client,
            String namespace, javax.cim.UnsignedInteger16[] newValue) throws WbemsmtException {
        CIM_ObjectManagerCommunicationMechanism fco = new CIM_ObjectManagerCommunicationMechanism(
                client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_AUTHENTICATIONMECHANISMSSUPPORTED.NAME);
        if (property != null) {
            property = setPropertyValue_AuthenticationMechanismsSupported(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_AUTHENTICATIONMECHANISMSSUPPORTED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property AuthenticationMechanismsSupported
     * <br>
     * Enumerated array describing the types of authentication supported by the ObjectManager, using the encoding/protocol. specified in the property, CommunicationMechanism. The defined values represent the authentication defined in the DMTF document, Specification for CIM Operations over HTTP.
     */

    private static CIMProperty setPropertyValue_AuthenticationMechanismsSupported(
            CIMProperty currentProperty, javax.cim.UnsignedInteger16[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property CommunicationMechanism
     *     * <br>
     * CommunicationMechanism describes an encoding and protocol which can be used to communicate with the ObjectManager. At this time, only one encoding and protocol are standardized by the DMTF - "CIM-XML". If this is supported by an ObjectManager, the specified string should be indicated. Other 'standard' strings may be defined. In addition, a vendor specific encoding/protocol string may be used.
     *     */

    public javax.cim.UnsignedInteger16 get_CommunicationMechanism() {
        CIMProperty currentProperty = getProperty(PROPERTY_COMMUNICATIONMECHANISM.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_COMMUNICATIONMECHANISM.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property CommunicationMechanism
     * <br>
     * CommunicationMechanism describes an encoding and protocol which can be used to communicate with the ObjectManager. At this time, only one encoding and protocol are standardized by the DMTF - "CIM-XML". If this is supported by an ObjectManager, the specified string should be indicated. Other 'standard' strings may be defined. In addition, a vendor specific encoding/protocol string may be used.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_CommunicationMechanism(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_COMMUNICATIONMECHANISM.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_CommunicationMechanism(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_COMMUNICATIONMECHANISM.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property CommunicationMechanism by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_CommunicationMechanism(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_ObjectManagerCommunicationMechanism fco = new CIM_ObjectManagerCommunicationMechanism(
                client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_COMMUNICATIONMECHANISM.NAME);
        if (property != null) {
            property = setPropertyValue_CommunicationMechanism(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_COMMUNICATIONMECHANISM.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property CommunicationMechanism
     * <br>
     * CommunicationMechanism describes an encoding and protocol which can be used to communicate with the ObjectManager. At this time, only one encoding and protocol are standardized by the DMTF - "CIM-XML". If this is supported by an ObjectManager, the specified string should be indicated. Other 'standard' strings may be defined. In addition, a vendor specific encoding/protocol string may be used.
     */

    private static CIMProperty setPropertyValue_CommunicationMechanism(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property FunctionalProfileDescriptions
     *     * <br>
     * Free-form strings providing descriptions of the supported operations of the object manager. Entries in the array are correlated with those in the ProfilesSupported array. An entry in this Descriptions array MUST be provided when 1, "Other", is specified in the FunctionalProfilesSupported array.
     *     */

    public String[] get_FunctionalProfileDescriptions() {
        CIMProperty currentProperty = getProperty(PROPERTY_FUNCTIONALPROFILEDESCRIPTIONS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_FUNCTIONALPROFILEDESCRIPTIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String[]) currentProperty.getValue();

    }

    /**
     * Set the property FunctionalProfileDescriptions
     * <br>
     * Free-form strings providing descriptions of the supported operations of the object manager. Entries in the array are correlated with those in the ProfilesSupported array. An entry in this Descriptions array MUST be provided when 1, "Other", is specified in the FunctionalProfilesSupported array.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_FunctionalProfileDescriptions(String[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_FUNCTIONALPROFILEDESCRIPTIONS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_FunctionalProfileDescriptions(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_FUNCTIONALPROFILEDESCRIPTIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property FunctionalProfileDescriptions by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_FunctionalProfileDescriptions(WBEMClient client,
            String namespace, String[] newValue) throws WbemsmtException {
        CIM_ObjectManagerCommunicationMechanism fco = new CIM_ObjectManagerCommunicationMechanism(
                client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_FUNCTIONALPROFILEDESCRIPTIONS.NAME);
        if (property != null) {
            property = setPropertyValue_FunctionalProfileDescriptions(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_FUNCTIONALPROFILEDESCRIPTIONS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property FunctionalProfileDescriptions
     * <br>
     * Free-form strings providing descriptions of the supported operations of the object manager. Entries in the array are correlated with those in the ProfilesSupported array. An entry in this Descriptions array MUST be provided when 1, "Other", is specified in the FunctionalProfilesSupported array.
     */

    private static CIMProperty setPropertyValue_FunctionalProfileDescriptions(
            CIMProperty currentProperty, String[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property FunctionalProfilesSupported
     *     * <br>
     * Enumerated array describing the types of operations supported by the ObjectManager, using this encoding/protocol. The enumeration is based on the Functional Profiles defined for conformance in the DMTF document, Specification for CIM Operations over HTTP.
     *     */

    public javax.cim.UnsignedInteger16[] get_FunctionalProfilesSupported() {
        CIMProperty currentProperty = getProperty(PROPERTY_FUNCTIONALPROFILESSUPPORTED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_FUNCTIONALPROFILESSUPPORTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16[]) currentProperty.getValue();

    }

    /**
     * Set the property FunctionalProfilesSupported
     * <br>
     * Enumerated array describing the types of operations supported by the ObjectManager, using this encoding/protocol. The enumeration is based on the Functional Profiles defined for conformance in the DMTF document, Specification for CIM Operations over HTTP.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_FunctionalProfilesSupported(javax.cim.UnsignedInteger16[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_FUNCTIONALPROFILESSUPPORTED.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_FunctionalProfilesSupported(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_FUNCTIONALPROFILESSUPPORTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property FunctionalProfilesSupported by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_FunctionalProfilesSupported(WBEMClient client,
            String namespace, javax.cim.UnsignedInteger16[] newValue) throws WbemsmtException {
        CIM_ObjectManagerCommunicationMechanism fco = new CIM_ObjectManagerCommunicationMechanism(
                client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_FUNCTIONALPROFILESSUPPORTED.NAME);
        if (property != null) {
            property = setPropertyValue_FunctionalProfilesSupported(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_FUNCTIONALPROFILESSUPPORTED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property FunctionalProfilesSupported
     * <br>
     * Enumerated array describing the types of operations supported by the ObjectManager, using this encoding/protocol. The enumeration is based on the Functional Profiles defined for conformance in the DMTF document, Specification for CIM Operations over HTTP.
     */

    private static CIMProperty setPropertyValue_FunctionalProfilesSupported(
            CIMProperty currentProperty, javax.cim.UnsignedInteger16[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property MultipleOperationsSupported
     *     * <br>
     * Boolean indicating whether the ObjectManager supports multiple operation requests (TRUE) or only simple requests (FALSE).
     *     */

    public Boolean get_MultipleOperationsSupported() {
        CIMProperty currentProperty = getProperty(PROPERTY_MULTIPLEOPERATIONSSUPPORTED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_MULTIPLEOPERATIONSSUPPORTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property MultipleOperationsSupported
     * <br>
     * Boolean indicating whether the ObjectManager supports multiple operation requests (TRUE) or only simple requests (FALSE).
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_MultipleOperationsSupported(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_MULTIPLEOPERATIONSSUPPORTED.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_MultipleOperationsSupported(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_MULTIPLEOPERATIONSSUPPORTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property MultipleOperationsSupported by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_MultipleOperationsSupported(WBEMClient client,
            String namespace, Boolean newValue) throws WbemsmtException {
        CIM_ObjectManagerCommunicationMechanism fco = new CIM_ObjectManagerCommunicationMechanism(
                client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MULTIPLEOPERATIONSSUPPORTED.NAME);
        if (property != null) {
            property = setPropertyValue_MultipleOperationsSupported(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_MULTIPLEOPERATIONSSUPPORTED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property MultipleOperationsSupported
     * <br>
     * Boolean indicating whether the ObjectManager supports multiple operation requests (TRUE) or only simple requests (FALSE).
     */

    private static CIMProperty setPropertyValue_MultipleOperationsSupported(
            CIMProperty currentProperty, Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OtherCommunicationMechanismDescription
     *     * <br>
     * A free-form string providing a description of the supported protocols when 1, "Other", is specified in the CommunicationMechanism.
     *     */

    public String get_OtherCommunicationMechanismDescription() {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERCOMMUNICATIONMECHANISMDESCRIPTION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OTHERCOMMUNICATIONMECHANISMDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property OtherCommunicationMechanismDescription
     * <br>
     * A free-form string providing a description of the supported protocols when 1, "Other", is specified in the CommunicationMechanism.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OtherCommunicationMechanismDescription(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERCOMMUNICATIONMECHANISMDESCRIPTION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_OtherCommunicationMechanismDescription(
                    currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERCOMMUNICATIONMECHANISMDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OtherCommunicationMechanismDescription by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherCommunicationMechanismDescription(WBEMClient client,
            String namespace, String newValue) throws WbemsmtException {
        CIM_ObjectManagerCommunicationMechanism fco = new CIM_ObjectManagerCommunicationMechanism(
                client, namespace);
        CIMProperty property = fco
                .getProperty(PROPERTY_OTHERCOMMUNICATIONMECHANISMDESCRIPTION.NAME);
        if (property != null) {
            property = setPropertyValue_OtherCommunicationMechanismDescription(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERCOMMUNICATIONMECHANISMDESCRIPTION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OtherCommunicationMechanismDescription
     * <br>
     * A free-form string providing a description of the supported protocols when 1, "Other", is specified in the CommunicationMechanism.
     */

    private static CIMProperty setPropertyValue_OtherCommunicationMechanismDescription(
            CIMProperty currentProperty, String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Version
     *     * <br>
     * Provides the protocol version for this service access point. Version information MUST be in the form of M.N, where M is a numeric that describes the Major version and N is a numeric that describes the minor version.
     *     */

    public String get_Version() {
        CIMProperty currentProperty = getProperty(PROPERTY_VERSION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_VERSION.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property Version
     * <br>
     * Provides the protocol version for this service access point. Version information MUST be in the form of M.N, where M is a numeric that describes the Major version and N is a numeric that describes the minor version.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Version(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_VERSION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Version(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_VERSION.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Version by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Version(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_ObjectManagerCommunicationMechanism fco = new CIM_ObjectManagerCommunicationMechanism(
                client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_VERSION.NAME);
        if (property != null) {
            property = setPropertyValue_Version(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_VERSION.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Version
     * <br>
     * Provides the protocol version for this service access point. Version information MUST be in the form of M.N, where M is a numeric that describes the Major version and N is a numeric that describes the minor version.
     */

    private static CIMProperty setPropertyValue_Version(CIMProperty currentProperty, String newValue) {
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
     * Get the list with CIM_ObjectManager objects associated by the association CIM_CommMechanismForManager
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFORMANAGER as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_ObjectManager_CIM_CommMechanismForManagers(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_ObjectManager_CIM_CommMechanismForManagers(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFORMANAGER,
                CIM_ObjectManager.CIM_CLASS_NAME, null, null, false, false, null);

    }

    /**
     * Get the list with CIM_ObjectManager objects associated by the association CIM_CommMechanismForManager
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFORMANAGER or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFORMANAGER as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_ObjectManager_CIM_CommMechanismForManagers(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_ObjectManager_CIM_CommMechanismForManagers(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFORMANAGER, resultClass, role,
                resultRole, false, false, null);

    }

    /**
     * Get the list with CIM_ObjectManager objects associated by the association CIM_CommMechanismForManager
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFORMANAGER or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_ObjectManager_CIM_CommMechanismForManagers(
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
                CIM_ObjectManagerCommunicationMechanismHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_ObjectManagerCommunicationMechanismHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_ObjectManagerCommunicationMechanismHelper.findClass(
                            cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_ObjectManager(cimInstance));
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
                        result.add(new CIM_ObjectManager(cimInstance));
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
                        result.add(new CIM_ObjectManager(cimInstance));
                        continue;
                    }
                }
            }
            CIM_ObjectManagerCommunicationMechanismHelper.checkException(enumeration);
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
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_CommMechanismForManager
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFORMANAGER as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_ObjectManager_CIM_CommMechanismForManagerNames(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_ObjectManager_CIM_CommMechanismForManagerNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFORMANAGER,
                CIM_ObjectManager.CIM_CLASS_NAME, null, null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_CommMechanismForManager
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFORMANAGER or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFORMANAGER as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_ObjectManager_CIM_CommMechanismForManagerNames(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_ObjectManager_CIM_CommMechanismForManagerNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFORMANAGER, resultClass, role,
                resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_CommMechanismForManager
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_ObjectManager_CIM_CommMechanismForManagerNames(
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
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFORMANAGER,
                    CIM_ObjectManager.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_ObjectManagerCommunicationMechanismHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_ObjectManagerCommunicationMechanismHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_ObjectManager.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_ObjectManagerCommunicationMechanismHelper.checkException(enumeration);
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
     * Get the list with CIM_CommMechanismForManager associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_CommMechanismForManager(WBEMClient cimClient,
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFORMANAGER, role, includeQualifiers,
                    includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFORMANAGER, role, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_ObjectManagerCommunicationMechanismHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_ObjectManagerCommunicationMechanismHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_CommMechanismForManagerHelper.findClass(cimClient,
                            cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_CommMechanismForManager(cimInstance));
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
                        result.add(new CIM_CommMechanismForManager(cimInstance));
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
                        result.add(new CIM_CommMechanismForManager(cimInstance));
                        continue;
                    }
                }
            }
            CIM_ObjectManagerCommunicationMechanismHelper.checkException(enumeration);
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
     * Get a list of CIMObjectPath items of the associations CIM_CommMechanismForManager
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_CommMechanismForManager(WBEMClient cimClient,
            String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFORMANAGER, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFORMANAGER,
                    role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_ObjectManagerCommunicationMechanismHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_ObjectManagerCommunicationMechanismHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_CommMechanismForManager.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_ObjectManagerCommunicationMechanismHelper.checkException(enumeration);
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
     * Get the list with CIM_ProtocolAdapter objects associated by the association CIM_CommMechanismForAdapter
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFORADAPTER as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_ProtocolAdapter_CIM_CommMechanismForAdapters(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_ProtocolAdapter_CIM_CommMechanismForAdapters(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFORADAPTER,
                CIM_ProtocolAdapter.CIM_CLASS_NAME, null, null, false, false, null);

    }

    /**
     * Get the list with CIM_ProtocolAdapter objects associated by the association CIM_CommMechanismForAdapter
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFORADAPTER or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFORADAPTER as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_ProtocolAdapter_CIM_CommMechanismForAdapters(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_ProtocolAdapter_CIM_CommMechanismForAdapters(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFORADAPTER, resultClass, role,
                resultRole, false, false, null);

    }

    /**
     * Get the list with CIM_ProtocolAdapter objects associated by the association CIM_CommMechanismForAdapter
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFORADAPTER or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_ProtocolAdapter_CIM_CommMechanismForAdapters(
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
                CIM_ObjectManagerCommunicationMechanismHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_ObjectManagerCommunicationMechanismHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_ObjectManagerCommunicationMechanismHelper.findClass(
                            cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_ProtocolAdapter(cimInstance));
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
                        result.add(new CIM_ProtocolAdapter(cimInstance));
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
                        result.add(new CIM_ProtocolAdapter(cimInstance));
                        continue;
                    }
                }
            }
            CIM_ObjectManagerCommunicationMechanismHelper.checkException(enumeration);
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
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_CommMechanismForAdapter
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFORADAPTER as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_ProtocolAdapter_CIM_CommMechanismForAdapterNames(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_ProtocolAdapter_CIM_CommMechanismForAdapterNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFORADAPTER,
                CIM_ProtocolAdapter.CIM_CLASS_NAME, null, null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_CommMechanismForAdapter
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFORADAPTER or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFORADAPTER as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_ProtocolAdapter_CIM_CommMechanismForAdapterNames(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_ProtocolAdapter_CIM_CommMechanismForAdapterNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFORADAPTER, resultClass, role,
                resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_CommMechanismForAdapter
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_ProtocolAdapter_CIM_CommMechanismForAdapterNames(
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
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFORADAPTER,
                    CIM_ProtocolAdapter.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_ObjectManagerCommunicationMechanismHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_ObjectManagerCommunicationMechanismHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_ProtocolAdapter.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_ObjectManagerCommunicationMechanismHelper.checkException(enumeration);
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
     * Get the list with CIM_CommMechanismForAdapter associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_CommMechanismForAdapter(WBEMClient cimClient,
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFORADAPTER, role, includeQualifiers,
                    includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFORADAPTER, role, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_ObjectManagerCommunicationMechanismHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_ObjectManagerCommunicationMechanismHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_CommMechanismForAdapterHelper.findClass(cimClient,
                            cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_CommMechanismForAdapter(cimInstance));
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
                        result.add(new CIM_CommMechanismForAdapter(cimInstance));
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
                        result.add(new CIM_CommMechanismForAdapter(cimInstance));
                        continue;
                    }
                }
            }
            CIM_ObjectManagerCommunicationMechanismHelper.checkException(enumeration);
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
     * Get a list of CIMObjectPath items of the associations CIM_CommMechanismForAdapter
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_CommMechanismForAdapter(WBEMClient cimClient,
            String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFORADAPTER, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFORADAPTER,
                    role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_ObjectManagerCommunicationMechanismHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_ObjectManagerCommunicationMechanismHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_CommMechanismForAdapter.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_ObjectManagerCommunicationMechanismHelper.checkException(enumeration);
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
     * Get the list with CIM_ObjectManagerAdapter objects associated by the association CIM_CommMechanismForObjectManagerAdapter
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFOROBJECTMANAGERADAPTER as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_ObjectManagerAdapter_CIM_CommMechanismForObjectManagerAdapters(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_ObjectManagerAdapter_CIM_CommMechanismForObjectManagerAdapters(
                cimClient, CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFOROBJECTMANAGERADAPTER,
                CIM_ObjectManagerAdapter.CIM_CLASS_NAME, null, null, false, false, null);

    }

    /**
     * Get the list with CIM_ObjectManagerAdapter objects associated by the association CIM_CommMechanismForObjectManagerAdapter
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFOROBJECTMANAGERADAPTER or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFOROBJECTMANAGERADAPTER as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_ObjectManagerAdapter_CIM_CommMechanismForObjectManagerAdapters(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_ObjectManagerAdapter_CIM_CommMechanismForObjectManagerAdapters(
                cimClient, CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFOROBJECTMANAGERADAPTER,
                resultClass, role, resultRole, false, false, null);

    }

    /**
     * Get the list with CIM_ObjectManagerAdapter objects associated by the association CIM_CommMechanismForObjectManagerAdapter
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFOROBJECTMANAGERADAPTER or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_ObjectManagerAdapter_CIM_CommMechanismForObjectManagerAdapters(
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
                CIM_ObjectManagerCommunicationMechanismHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_ObjectManagerCommunicationMechanismHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_ObjectManagerCommunicationMechanismHelper.findClass(
                            cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_ObjectManagerAdapter(cimInstance));
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
                        result.add(new CIM_ObjectManagerAdapter(cimInstance));
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
                        result.add(new CIM_ObjectManagerAdapter(cimInstance));
                        continue;
                    }
                }
            }
            CIM_ObjectManagerCommunicationMechanismHelper.checkException(enumeration);
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
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_CommMechanismForObjectManagerAdapter
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFOROBJECTMANAGERADAPTER as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_ObjectManagerAdapter_CIM_CommMechanismForObjectManagerAdapterNames(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_ObjectManagerAdapter_CIM_CommMechanismForObjectManagerAdapterNames(
                cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFOROBJECTMANAGERADAPTER,
                CIM_ObjectManagerAdapter.CIM_CLASS_NAME, null, null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_CommMechanismForObjectManagerAdapter
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFOROBJECTMANAGERADAPTER or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFOROBJECTMANAGERADAPTER as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_ObjectManagerAdapter_CIM_CommMechanismForObjectManagerAdapterNames(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_ObjectManagerAdapter_CIM_CommMechanismForObjectManagerAdapterNames(
                cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFOROBJECTMANAGERADAPTER, resultClass,
                role, resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_CommMechanismForObjectManagerAdapter
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_ObjectManagerAdapter_CIM_CommMechanismForObjectManagerAdapterNames(
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
                    .getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFOROBJECTMANAGERADAPTER,
                    CIM_ObjectManagerAdapter.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_ObjectManagerCommunicationMechanismHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_ObjectManagerCommunicationMechanismHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_ObjectManagerAdapter.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_ObjectManagerCommunicationMechanismHelper.checkException(enumeration);
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
     * Get the list with CIM_CommMechanismForObjectManagerAdapter associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_CommMechanismForObjectManagerAdapter(
            WBEMClient cimClient, boolean includeQualifiers, boolean includeClassOrigin,
            String role, java.lang.String[] propertyList) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.references(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFOROBJECTMANAGERADAPTER, role,
                    includeQualifiers, includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFOROBJECTMANAGERADAPTER, role,
                    includeQualifiers, includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_ObjectManagerCommunicationMechanismHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_ObjectManagerCommunicationMechanismHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_CommMechanismForObjectManagerAdapterHelper.findClass(
                            cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_CommMechanismForObjectManagerAdapter(cimInstance));
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
                        result.add(new CIM_CommMechanismForObjectManagerAdapter(cimInstance));
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
                        result.add(new CIM_CommMechanismForObjectManagerAdapter(cimInstance));
                        continue;
                    }
                }
            }
            CIM_ObjectManagerCommunicationMechanismHelper.checkException(enumeration);
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
     * Get a list of CIMObjectPath items of the associations CIM_CommMechanismForObjectManagerAdapter
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_CommMechanismForObjectManagerAdapter(
            WBEMClient cimClient, String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFOROBJECTMANAGERADAPTER, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFOROBJECTMANAGERADAPTER, role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_ObjectManagerCommunicationMechanismHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_ObjectManagerCommunicationMechanismHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_CommMechanismForObjectManagerAdapter.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_ObjectManagerCommunicationMechanismHelper.checkException(enumeration);
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
        return CIM_ObjectManagerCommunicationMechanism.CIM_CLASS_NAME;
    }

}