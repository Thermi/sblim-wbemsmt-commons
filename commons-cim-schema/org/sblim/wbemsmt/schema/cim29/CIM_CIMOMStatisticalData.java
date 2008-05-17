/** 
 * CIM_CIMOMStatisticalData.java
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
 * Description: CIM_CIMOMStatisticalData provides statistical data about the performance of the CIM Object Manager. Each object of this class provides elapsed time and size data for a particular type of CIM operation. All operations of that type, regardless of the CIM operations protocol being used, are accumulated in one object and covers the CIM operations issued by all clients of the Object Manager scoping the instance. Batched CIM operations are accumulated into a separate operation type for "Batched". The counters in this class SHOULD be implemented such that they always increment and naturally wrap around when their numerical limit is exceeded. A client that calculates the difference of two snapshots of a counter at the beginning and end of a measurement interval should get the correct result, even if there was a wrap-around in between obtaining the two snapshots. (Two or more wrap arounds will result in wrong data being calculated.) The gathering of the data can be controlled through the property, CIM_ObjectManager.GatherStatisticalData. The time interval to which the statistical data applies, ends at the current time and therefore includes the most current CIM operations. The interval starts when the statistical data gathering was last turned on for the Object Manager.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_CIMOMStatisticalData extends CIM_StatisticalData {

    public final static String CIM_CLASS_NAME = "CIM_CIMOMStatisticalData";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property CimomElapsedTime
     * The CimomElapsedTime property contains the elapsed time spent in the CIM Object Manager for this operation type, not counting the elapsed time spent in providers and the underlying instrumentation. The measurement points for this property SHOULD be at the transport layer interface on the network side, and at the provider interface on the instrumentation side of the CIM Object Manager.
     */
    public static class PROPERTY_CIMOMELAPSEDTIME {
        /**
         * name of the property CimomElapsedTime
         */
        public final static String NAME = "CimomElapsedTime";

    }

    /**
     * Constants of property InstanceID
     * The InstanceID property opaquely identifies a unique instance of CIMOMStatisticalData and MUST be unique within a namespace. In order to ensure uniqueness, the value of InstanceID MUST be constructed in the following manner: 
     * CIM<ID> 
     * The <ID> MUST include a CIM Object Manager specified unique identifier.
     */
    public static class PROPERTY_INSTANCEID {
        /**
         * name of the property InstanceID
         */
        public final static String NAME = "InstanceID";

    }

    /**
     * Constants of property NumberOfOperations
     * The NumberOfOperations property contains the number of CIM operations of the specified type. This property can be used to calculate average values per CIM operation.
     */
    public static class PROPERTY_NUMBEROFOPERATIONS {
        /**
         * name of the property NumberOfOperations
         */
        public final static String NAME = "NumberOfOperations";

    }

    /**
     * Constants of property OperationType
     * The OperationType property identifies the type of CIM operation for which data is reported in this instance. Batched CIM operations (consisting of multiple simple CIM operations) are reported against the "Batched" type only.
     */
    public static class PROPERTY_OPERATIONTYPE {
        /**
         * name of the property OperationType
         */
        public final static String NAME = "OperationType";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Batched = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Batched (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Batched = "Batched";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_GetClass = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry GetClass (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_GetClass = "GetClass";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_GetInstance = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry GetInstance (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_GetInstance = "GetInstance";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_DeleteClass = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry DeleteClass (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_DeleteClass = "DeleteClass";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_DeleteInstance = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry DeleteInstance (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_DeleteInstance = "DeleteInstance";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_CreateClass = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry CreateClass (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_CreateClass = "CreateClass";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_CreateInstance = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry CreateInstance (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_CreateInstance = "CreateInstance";

        /**
         * constant for value map entry 9
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_ModifyClass = new javax.cim.UnsignedInteger16(
                "9");

        /**
         * constant for value entry ModifyClass (corresponds to mapEntry 9 )
         */
        public final static String VALUE_ENTRY_ModifyClass = "ModifyClass";

        /**
         * constant for value map entry 10
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_ModifyInstance = new javax.cim.UnsignedInteger16(
                "10");

        /**
         * constant for value entry ModifyInstance (corresponds to mapEntry 10 )
         */
        public final static String VALUE_ENTRY_ModifyInstance = "ModifyInstance";

        /**
         * constant for value map entry 11
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_EnumerateClasses = new javax.cim.UnsignedInteger16(
                "11");

        /**
         * constant for value entry EnumerateClasses (corresponds to mapEntry 11 )
         */
        public final static String VALUE_ENTRY_EnumerateClasses = "EnumerateClasses";

        /**
         * constant for value map entry 12
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_EnumerateClassNames = new javax.cim.UnsignedInteger16(
                "12");

        /**
         * constant for value entry EnumerateClassNames (corresponds to mapEntry 12 )
         */
        public final static String VALUE_ENTRY_EnumerateClassNames = "EnumerateClassNames";

        /**
         * constant for value map entry 13
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_EnumerateInstances = new javax.cim.UnsignedInteger16(
                "13");

        /**
         * constant for value entry EnumerateInstances (corresponds to mapEntry 13 )
         */
        public final static String VALUE_ENTRY_EnumerateInstances = "EnumerateInstances";

        /**
         * constant for value map entry 14
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_EnumerateInstanceNames = new javax.cim.UnsignedInteger16(
                "14");

        /**
         * constant for value entry EnumerateInstanceNames (corresponds to mapEntry 14 )
         */
        public final static String VALUE_ENTRY_EnumerateInstanceNames = "EnumerateInstanceNames";

        /**
         * constant for value map entry 15
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_ExecQuery = new javax.cim.UnsignedInteger16(
                "15");

        /**
         * constant for value entry ExecQuery (corresponds to mapEntry 15 )
         */
        public final static String VALUE_ENTRY_ExecQuery = "ExecQuery";

        /**
         * constant for value map entry 16
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_Associators = new javax.cim.UnsignedInteger16(
                "16");

        /**
         * constant for value entry Associators (corresponds to mapEntry 16 )
         */
        public final static String VALUE_ENTRY_Associators = "Associators";

        /**
         * constant for value map entry 17
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_AssociatorNames = new javax.cim.UnsignedInteger16(
                "17");

        /**
         * constant for value entry AssociatorNames (corresponds to mapEntry 17 )
         */
        public final static String VALUE_ENTRY_AssociatorNames = "AssociatorNames";

        /**
         * constant for value map entry 18
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_References = new javax.cim.UnsignedInteger16(
                "18");

        /**
         * constant for value entry References (corresponds to mapEntry 18 )
         */
        public final static String VALUE_ENTRY_References = "References";

        /**
         * constant for value map entry 19
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_ReferenceNames = new javax.cim.UnsignedInteger16(
                "19");

        /**
         * constant for value entry ReferenceNames (corresponds to mapEntry 19 )
         */
        public final static String VALUE_ENTRY_ReferenceNames = "ReferenceNames";

        /**
         * constant for value map entry 20
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_GetProperty = new javax.cim.UnsignedInteger16(
                "20");

        /**
         * constant for value entry GetProperty (corresponds to mapEntry 20 )
         */
        public final static String VALUE_ENTRY_GetProperty = "GetProperty";

        /**
         * constant for value map entry 21
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_SetProperty = new javax.cim.UnsignedInteger16(
                "21");

        /**
         * constant for value entry SetProperty (corresponds to mapEntry 21 )
         */
        public final static String VALUE_ENTRY_SetProperty = "SetProperty";

        /**
         * constant for value map entry 22
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_GetQualifier = new javax.cim.UnsignedInteger16(
                "22");

        /**
         * constant for value entry GetQualifier (corresponds to mapEntry 22 )
         */
        public final static String VALUE_ENTRY_GetQualifier = "GetQualifier";

        /**
         * constant for value map entry 23
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_SetQualifier = new javax.cim.UnsignedInteger16(
                "23");

        /**
         * constant for value entry SetQualifier (corresponds to mapEntry 23 )
         */
        public final static String VALUE_ENTRY_SetQualifier = "SetQualifier";

        /**
         * constant for value map entry 24
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_DeleteQualifier = new javax.cim.UnsignedInteger16(
                "24");

        /**
         * constant for value entry DeleteQualifier (corresponds to mapEntry 24 )
         */
        public final static String VALUE_ENTRY_DeleteQualifier = "DeleteQualifier";

        /**
         * constant for value map entry 25
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_EnumerateQualifiers = new javax.cim.UnsignedInteger16(
                "25");

        /**
         * constant for value entry EnumerateQualifiers (corresponds to mapEntry 25 )
         */
        public final static String VALUE_ENTRY_EnumerateQualifiers = "EnumerateQualifiers";

        /**
         * constant for value map entry 26
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_IndicationDelivery = new javax.cim.UnsignedInteger16(
                "26");

        /**
         * constant for value entry IndicationDelivery (corresponds to mapEntry 26 )
         */
        public final static String VALUE_ENTRY_IndicationDelivery = "IndicationDelivery";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@4b664b66
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Batched.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Batched;
            }

            if (VALUE_ENTRY_GetClass.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_GetClass;
            }

            if (VALUE_ENTRY_GetInstance.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_GetInstance;
            }

            if (VALUE_ENTRY_DeleteClass.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_DeleteClass;
            }

            if (VALUE_ENTRY_DeleteInstance.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_DeleteInstance;
            }

            if (VALUE_ENTRY_CreateClass.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_CreateClass;
            }

            if (VALUE_ENTRY_CreateInstance.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_CreateInstance;
            }

            if (VALUE_ENTRY_ModifyClass.equals(value)) {
                return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_ModifyClass;
            }

            if (VALUE_ENTRY_ModifyInstance.equals(value)) {
                return VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_ModifyInstance;
            }

            if (VALUE_ENTRY_EnumerateClasses.equals(value)) {
                return VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_EnumerateClasses;
            }

            if (VALUE_ENTRY_EnumerateClassNames.equals(value)) {
                return VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_EnumerateClassNames;
            }

            if (VALUE_ENTRY_EnumerateInstances.equals(value)) {
                return VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_EnumerateInstances;
            }

            if (VALUE_ENTRY_EnumerateInstanceNames.equals(value)) {
                return VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_EnumerateInstanceNames;
            }

            if (VALUE_ENTRY_ExecQuery.equals(value)) {
                return VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_ExecQuery;
            }

            if (VALUE_ENTRY_Associators.equals(value)) {
                return VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_Associators;
            }

            if (VALUE_ENTRY_AssociatorNames.equals(value)) {
                return VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_AssociatorNames;
            }

            if (VALUE_ENTRY_References.equals(value)) {
                return VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_References;
            }

            if (VALUE_ENTRY_ReferenceNames.equals(value)) {
                return VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_ReferenceNames;
            }

            if (VALUE_ENTRY_GetProperty.equals(value)) {
                return VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_GetProperty;
            }

            if (VALUE_ENTRY_SetProperty.equals(value)) {
                return VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_SetProperty;
            }

            if (VALUE_ENTRY_GetQualifier.equals(value)) {
                return VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_GetQualifier;
            }

            if (VALUE_ENTRY_SetQualifier.equals(value)) {
                return VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_SetQualifier;
            }

            if (VALUE_ENTRY_DeleteQualifier.equals(value)) {
                return VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_DeleteQualifier;
            }

            if (VALUE_ENTRY_EnumerateQualifiers.equals(value)) {
                return VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_EnumerateQualifiers;
            }

            if (VALUE_ENTRY_IndicationDelivery.equals(value)) {
                return VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_IndicationDelivery;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Batched.intValue()) {
                return VALUE_ENTRY_Batched;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_GetClass.intValue()) {
                return VALUE_ENTRY_GetClass;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_GetInstance.intValue()) {
                return VALUE_ENTRY_GetInstance;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_DeleteClass.intValue()) {
                return VALUE_ENTRY_DeleteClass;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_DeleteInstance.intValue()) {
                return VALUE_ENTRY_DeleteInstance;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_CreateClass.intValue()) {
                return VALUE_ENTRY_CreateClass;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_CreateInstance.intValue()) {
                return VALUE_ENTRY_CreateInstance;
            }

            if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_ModifyClass.intValue()) {
                return VALUE_ENTRY_ModifyClass;
            }

            if (iValue == VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_ModifyInstance.intValue()) {
                return VALUE_ENTRY_ModifyInstance;
            }

            if (iValue == VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_EnumerateClasses.intValue()) {
                return VALUE_ENTRY_EnumerateClasses;
            }

            if (iValue == VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_EnumerateClassNames.intValue()) {
                return VALUE_ENTRY_EnumerateClassNames;
            }

            if (iValue == VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_EnumerateInstances.intValue()) {
                return VALUE_ENTRY_EnumerateInstances;
            }

            if (iValue == VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_EnumerateInstanceNames.intValue()) {
                return VALUE_ENTRY_EnumerateInstanceNames;
            }

            if (iValue == VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_ExecQuery.intValue()) {
                return VALUE_ENTRY_ExecQuery;
            }

            if (iValue == VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_Associators.intValue()) {
                return VALUE_ENTRY_Associators;
            }

            if (iValue == VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_AssociatorNames.intValue()) {
                return VALUE_ENTRY_AssociatorNames;
            }

            if (iValue == VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_References.intValue()) {
                return VALUE_ENTRY_References;
            }

            if (iValue == VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_ReferenceNames.intValue()) {
                return VALUE_ENTRY_ReferenceNames;
            }

            if (iValue == VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_GetProperty.intValue()) {
                return VALUE_ENTRY_GetProperty;
            }

            if (iValue == VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_SetProperty.intValue()) {
                return VALUE_ENTRY_SetProperty;
            }

            if (iValue == VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_GetQualifier.intValue()) {
                return VALUE_ENTRY_GetQualifier;
            }

            if (iValue == VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_SetQualifier.intValue()) {
                return VALUE_ENTRY_SetQualifier;
            }

            if (iValue == VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_DeleteQualifier.intValue()) {
                return VALUE_ENTRY_DeleteQualifier;
            }

            if (iValue == VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_EnumerateQualifiers.intValue()) {
                return VALUE_ENTRY_EnumerateQualifiers;
            }

            if (iValue == VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_IndicationDelivery.intValue()) {
                return VALUE_ENTRY_IndicationDelivery;
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
         * Value Map for the property OperationType   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Batched,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_GetClass,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_GetInstance,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_DeleteClass,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_DeleteInstance,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_CreateClass,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_CreateInstance,
                VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_ModifyClass,
                VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_ModifyInstance,
                VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_EnumerateClasses,
                VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_EnumerateClassNames,
                VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_EnumerateInstances,
                VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_EnumerateInstanceNames,
                VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_ExecQuery,
                VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_Associators,
                VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_AssociatorNames,
                VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_References,
                VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_ReferenceNames,
                VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_GetProperty,
                VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_SetProperty,
                VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_GetQualifier,
                VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_SetQualifier,
                VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_DeleteQualifier,
                VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_EnumerateQualifiers,
                VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_IndicationDelivery };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property OperationType   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_Batched, VALUE_ENTRY_GetClass, VALUE_ENTRY_GetInstance,
                VALUE_ENTRY_DeleteClass, VALUE_ENTRY_DeleteInstance, VALUE_ENTRY_CreateClass,
                VALUE_ENTRY_CreateInstance, VALUE_ENTRY_ModifyClass, VALUE_ENTRY_ModifyInstance,
                VALUE_ENTRY_EnumerateClasses, VALUE_ENTRY_EnumerateClassNames,
                VALUE_ENTRY_EnumerateInstances, VALUE_ENTRY_EnumerateInstanceNames,
                VALUE_ENTRY_ExecQuery, VALUE_ENTRY_Associators, VALUE_ENTRY_AssociatorNames,
                VALUE_ENTRY_References, VALUE_ENTRY_ReferenceNames, VALUE_ENTRY_GetProperty,
                VALUE_ENTRY_SetProperty, VALUE_ENTRY_GetQualifier, VALUE_ENTRY_SetQualifier,
                VALUE_ENTRY_DeleteQualifier, VALUE_ENTRY_EnumerateQualifiers,
                VALUE_ENTRY_IndicationDelivery };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property OperationType   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_Batched, VALUE_ENTRY_GetClass,
                VALUE_ENTRY_GetInstance, VALUE_ENTRY_DeleteClass, VALUE_ENTRY_DeleteInstance,
                VALUE_ENTRY_CreateClass, VALUE_ENTRY_CreateInstance, VALUE_ENTRY_ModifyClass,
                VALUE_ENTRY_ModifyInstance, VALUE_ENTRY_EnumerateClasses,
                VALUE_ENTRY_EnumerateClassNames, VALUE_ENTRY_EnumerateInstances,
                VALUE_ENTRY_EnumerateInstanceNames, VALUE_ENTRY_ExecQuery, VALUE_ENTRY_Associators,
                VALUE_ENTRY_AssociatorNames, VALUE_ENTRY_References, VALUE_ENTRY_ReferenceNames,
                VALUE_ENTRY_GetProperty, VALUE_ENTRY_SetProperty, VALUE_ENTRY_GetQualifier,
                VALUE_ENTRY_SetQualifier, VALUE_ENTRY_DeleteQualifier,
                VALUE_ENTRY_EnumerateQualifiers, VALUE_ENTRY_IndicationDelivery };

    }

    /**
     * Constants of property OtherOperationType
     * The OtherOperationType property identifies the operation if the OperationType property has a value of 1 ("Other"). For all other values of OperationType, the property is NULL.
     */
    public static class PROPERTY_OTHEROPERATIONTYPE {
        /**
         * name of the property OtherOperationType
         */
        public final static String NAME = "OtherOperationType";

    }

    /**
     * Constants of property ProviderElapsedTime
     * The ProviderElapsedTime property contains the elapsed time spent in all providers involved with this operation type, including the underlying instrumentation. The measurement point for this property SHOULD be from the provider interface of the CIM Object Manager.
     */
    public static class PROPERTY_PROVIDERELAPSEDTIME {
        /**
         * name of the property ProviderElapsedTime
         */
        public final static String NAME = "ProviderElapsedTime";

    }

    /**
     * Constants of property RequestSize
     * The RequestSize property contains the size of the operation requests sent to the CIM Object Manager. Any overhead of protocols above the transport protocol SHOULD be included in the count. For example, for the HTTP protocol, the size would include the size of the HTTP payload and the size of the HTTP headers.
     */
    public static class PROPERTY_REQUESTSIZE {
        /**
         * name of the property RequestSize
         */
        public final static String NAME = "RequestSize";

    }

    /**
     * Constants of property ResponseSize
     * The ResponseSize property contains the size of the operation responses sent back from the CIM Object Manager. Any overhead of protocols above the transport protocol SHOULD be included in the count. For example, for the HTTP protocol, the size would include the size of the HTTP payload and the size of the HTTP headers.
     */
    public static class PROPERTY_RESPONSESIZE {
        /**
         * name of the property ResponseSize
         */
        public final static String NAME = "ResponseSize";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_StatisticalData.getPackages();

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
     *   CIM_CIMOMStatisticalData provides statistical data about the performance of the CIM Object Manager. Each object of this class provides elapsed time and size data for a particular type of CIM operation. All operations of that type, regardless of the CIM operations protocol being used, are accumulated in one object and covers the CIM operations issued by all clients of the Object Manager scoping the instance. Batched CIM operations are accumulated into a separate operation type for "Batched". The counters in this class SHOULD be implemented such that they always increment and naturally wrap around when their numerical limit is exceeded. A client that calculates the difference of two snapshots of a counter at the beginning and end of a measurement interval should get the correct result, even if there was a wrap-around in between obtaining the two snapshots. (Two or more wrap arounds will result in wrong data being calculated.) The gathering of the data can be controlled through the property, CIM_ObjectManager.GatherStatisticalData. The time interval to which the statistical data applies, ends at the current time and therefore includes the most current CIM operations. The interval starts when the statistical data gathering was last turned on for the Object Manager.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_CIMOMStatisticalData(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   CIM_CIMOMStatisticalData provides statistical data about the performance of the CIM Object Manager. Each object of this class provides elapsed time and size data for a particular type of CIM operation. All operations of that type, regardless of the CIM operations protocol being used, are accumulated in one object and covers the CIM operations issued by all clients of the Object Manager scoping the instance. Batched CIM operations are accumulated into a separate operation type for "Batched". The counters in this class SHOULD be implemented such that they always increment and naturally wrap around when their numerical limit is exceeded. A client that calculates the difference of two snapshots of a counter at the beginning and end of a measurement interval should get the correct result, even if there was a wrap-around in between obtaining the two snapshots. (Two or more wrap arounds will result in wrong data being calculated.) The gathering of the data can be controlled through the property, CIM_ObjectManager.GatherStatisticalData. The time interval to which the statistical data applies, ends at the current time and therefore includes the most current CIM operations. The interval starts when the statistical data gathering was last turned on for the Object Manager.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_CIMOMStatisticalData(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_CIMOMStatisticalData() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("CimomElapsedTime", new CIMProperty("CimomElapsedTime",
                CIMDataType.DATETIME_T, null));
        propertiesToCheck.put("InstanceID", new CIMProperty("InstanceID", CIMDataType.STRING_T,
                null));
        propertiesToCheck.put("NumberOfOperations", new CIMProperty("NumberOfOperations",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("OperationType", new CIMProperty("OperationType",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("OtherOperationType", new CIMProperty("OtherOperationType",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("ProviderElapsedTime", new CIMProperty("ProviderElapsedTime",
                CIMDataType.DATETIME_T, null));
        propertiesToCheck.put("RequestSize", new CIMProperty("RequestSize", CIMDataType.UINT64_T,
                null));
        propertiesToCheck.put("ResponseSize", new CIMProperty("ResponseSize", CIMDataType.UINT64_T,
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
     * Get the property CimomElapsedTime
     *     * <br>
     * The CimomElapsedTime property contains the elapsed time spent in the CIM Object Manager for this operation type, not counting the elapsed time spent in providers and the underlying instrumentation. The measurement points for this property SHOULD be at the transport layer interface on the network side, and at the provider interface on the instrumentation side of the CIM Object Manager.
     *     */

    public javax.cim.CIMDateTime get_CimomElapsedTime() {
        CIMProperty currentProperty = getProperty(PROPERTY_CIMOMELAPSEDTIME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CIMOMELAPSEDTIME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.CIMDateTime) currentProperty.getValue();

    }

    /**
     * Set the property CimomElapsedTime
     * <br>
     * The CimomElapsedTime property contains the elapsed time spent in the CIM Object Manager for this operation type, not counting the elapsed time spent in providers and the underlying instrumentation. The measurement points for this property SHOULD be at the transport layer interface on the network side, and at the provider interface on the instrumentation side of the CIM Object Manager.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_CimomElapsedTime(javax.cim.CIMDateTime newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CIMOMELAPSEDTIME.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_CimomElapsedTime(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CIMOMELAPSEDTIME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property CimomElapsedTime by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_CimomElapsedTime(WBEMClient client, String namespace,
            javax.cim.CIMDateTime newValue) throws WbemsmtException {
        CIM_CIMOMStatisticalData fco = new CIM_CIMOMStatisticalData(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CIMOMELAPSEDTIME.NAME);
        if (property != null) {
            property = setPropertyValue_CimomElapsedTime(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CIMOMELAPSEDTIME.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property CimomElapsedTime
     * <br>
     * The CimomElapsedTime property contains the elapsed time spent in the CIM Object Manager for this operation type, not counting the elapsed time spent in providers and the underlying instrumentation. The measurement points for this property SHOULD be at the transport layer interface on the network side, and at the provider interface on the instrumentation side of the CIM Object Manager.
     */

    private static CIMProperty setPropertyValue_CimomElapsedTime(CIMProperty currentProperty,
            javax.cim.CIMDateTime newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property InstanceID
     *     * <br>
     * The InstanceID property opaquely identifies a unique instance of CIMOMStatisticalData and MUST be unique within a namespace. In order to ensure uniqueness, the value of InstanceID MUST be constructed in the following manner: 
     * CIM<ID> 
     * The <ID> MUST include a CIM Object Manager specified unique identifier.
     *     */

    public String get_InstanceID() {
        CIMProperty currentProperty = getProperty(PROPERTY_INSTANCEID.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_INSTANCEID.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property InstanceID
     * <br>
     * The InstanceID property opaquely identifies a unique instance of CIMOMStatisticalData and MUST be unique within a namespace. In order to ensure uniqueness, the value of InstanceID MUST be constructed in the following manner: 
     * CIM<ID> 
     * The <ID> MUST include a CIM Object Manager specified unique identifier.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_InstanceID(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_INSTANCEID.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_InstanceID(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_INSTANCEID.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property InstanceID by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_InstanceID(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_CIMOMStatisticalData fco = new CIM_CIMOMStatisticalData(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_INSTANCEID.NAME);
        if (property != null) {
            property = setPropertyValue_InstanceID(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_INSTANCEID.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property InstanceID
     * <br>
     * The InstanceID property opaquely identifies a unique instance of CIMOMStatisticalData and MUST be unique within a namespace. In order to ensure uniqueness, the value of InstanceID MUST be constructed in the following manner: 
     * CIM<ID> 
     * The <ID> MUST include a CIM Object Manager specified unique identifier.
     */

    private static CIMProperty setPropertyValue_InstanceID(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property NumberOfOperations
     *     * <br>
     * The NumberOfOperations property contains the number of CIM operations of the specified type. This property can be used to calculate average values per CIM operation.
     *     */

    public javax.cim.UnsignedInteger64 get_NumberOfOperations() {
        CIMProperty currentProperty = getProperty(PROPERTY_NUMBEROFOPERATIONS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_NUMBEROFOPERATIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property NumberOfOperations
     * <br>
     * The NumberOfOperations property contains the number of CIM operations of the specified type. This property can be used to calculate average values per CIM operation.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_NumberOfOperations(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_NUMBEROFOPERATIONS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_NumberOfOperations(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_NUMBEROFOPERATIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property NumberOfOperations by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_NumberOfOperations(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_CIMOMStatisticalData fco = new CIM_CIMOMStatisticalData(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_NUMBEROFOPERATIONS.NAME);
        if (property != null) {
            property = setPropertyValue_NumberOfOperations(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_NUMBEROFOPERATIONS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property NumberOfOperations
     * <br>
     * The NumberOfOperations property contains the number of CIM operations of the specified type. This property can be used to calculate average values per CIM operation.
     */

    private static CIMProperty setPropertyValue_NumberOfOperations(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OperationType
     *     * <br>
     * The OperationType property identifies the type of CIM operation for which data is reported in this instance. Batched CIM operations (consisting of multiple simple CIM operations) are reported against the "Batched" type only.
     *     */

    public javax.cim.UnsignedInteger16 get_OperationType() {
        CIMProperty currentProperty = getProperty(PROPERTY_OPERATIONTYPE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OPERATIONTYPE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property OperationType
     * <br>
     * The OperationType property identifies the type of CIM operation for which data is reported in this instance. Batched CIM operations (consisting of multiple simple CIM operations) are reported against the "Batched" type only.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OperationType(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OPERATIONTYPE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_OperationType(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OPERATIONTYPE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OperationType by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OperationType(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_CIMOMStatisticalData fco = new CIM_CIMOMStatisticalData(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OPERATIONTYPE.NAME);
        if (property != null) {
            property = setPropertyValue_OperationType(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OPERATIONTYPE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OperationType
     * <br>
     * The OperationType property identifies the type of CIM operation for which data is reported in this instance. Batched CIM operations (consisting of multiple simple CIM operations) are reported against the "Batched" type only.
     */

    private static CIMProperty setPropertyValue_OperationType(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OtherOperationType
     *     * <br>
     * The OtherOperationType property identifies the operation if the OperationType property has a value of 1 ("Other"). For all other values of OperationType, the property is NULL.
     *     */

    public String get_OtherOperationType() {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHEROPERATIONTYPE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OTHEROPERATIONTYPE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property OtherOperationType
     * <br>
     * The OtherOperationType property identifies the operation if the OperationType property has a value of 1 ("Other"). For all other values of OperationType, the property is NULL.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OtherOperationType(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHEROPERATIONTYPE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_OtherOperationType(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OTHEROPERATIONTYPE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OtherOperationType by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherOperationType(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_CIMOMStatisticalData fco = new CIM_CIMOMStatisticalData(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OTHEROPERATIONTYPE.NAME);
        if (property != null) {
            property = setPropertyValue_OtherOperationType(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OTHEROPERATIONTYPE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OtherOperationType
     * <br>
     * The OtherOperationType property identifies the operation if the OperationType property has a value of 1 ("Other"). For all other values of OperationType, the property is NULL.
     */

    private static CIMProperty setPropertyValue_OtherOperationType(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ProviderElapsedTime
     *     * <br>
     * The ProviderElapsedTime property contains the elapsed time spent in all providers involved with this operation type, including the underlying instrumentation. The measurement point for this property SHOULD be from the provider interface of the CIM Object Manager.
     *     */

    public javax.cim.CIMDateTime get_ProviderElapsedTime() {
        CIMProperty currentProperty = getProperty(PROPERTY_PROVIDERELAPSEDTIME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PROVIDERELAPSEDTIME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.CIMDateTime) currentProperty.getValue();

    }

    /**
     * Set the property ProviderElapsedTime
     * <br>
     * The ProviderElapsedTime property contains the elapsed time spent in all providers involved with this operation type, including the underlying instrumentation. The measurement point for this property SHOULD be from the provider interface of the CIM Object Manager.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ProviderElapsedTime(javax.cim.CIMDateTime newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PROVIDERELAPSEDTIME.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ProviderElapsedTime(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PROVIDERELAPSEDTIME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ProviderElapsedTime by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ProviderElapsedTime(WBEMClient client, String namespace,
            javax.cim.CIMDateTime newValue) throws WbemsmtException {
        CIM_CIMOMStatisticalData fco = new CIM_CIMOMStatisticalData(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PROVIDERELAPSEDTIME.NAME);
        if (property != null) {
            property = setPropertyValue_ProviderElapsedTime(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PROVIDERELAPSEDTIME.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ProviderElapsedTime
     * <br>
     * The ProviderElapsedTime property contains the elapsed time spent in all providers involved with this operation type, including the underlying instrumentation. The measurement point for this property SHOULD be from the provider interface of the CIM Object Manager.
     */

    private static CIMProperty setPropertyValue_ProviderElapsedTime(CIMProperty currentProperty,
            javax.cim.CIMDateTime newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property RequestSize
     *     * <br>
     * The RequestSize property contains the size of the operation requests sent to the CIM Object Manager. Any overhead of protocols above the transport protocol SHOULD be included in the count. For example, for the HTTP protocol, the size would include the size of the HTTP payload and the size of the HTTP headers.
     *     */

    public javax.cim.UnsignedInteger64 get_RequestSize() {
        CIMProperty currentProperty = getProperty(PROPERTY_REQUESTSIZE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_REQUESTSIZE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property RequestSize
     * <br>
     * The RequestSize property contains the size of the operation requests sent to the CIM Object Manager. Any overhead of protocols above the transport protocol SHOULD be included in the count. For example, for the HTTP protocol, the size would include the size of the HTTP payload and the size of the HTTP headers.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_RequestSize(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_REQUESTSIZE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_RequestSize(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_REQUESTSIZE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property RequestSize by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_RequestSize(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_CIMOMStatisticalData fco = new CIM_CIMOMStatisticalData(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_REQUESTSIZE.NAME);
        if (property != null) {
            property = setPropertyValue_RequestSize(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_REQUESTSIZE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property RequestSize
     * <br>
     * The RequestSize property contains the size of the operation requests sent to the CIM Object Manager. Any overhead of protocols above the transport protocol SHOULD be included in the count. For example, for the HTTP protocol, the size would include the size of the HTTP payload and the size of the HTTP headers.
     */

    private static CIMProperty setPropertyValue_RequestSize(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ResponseSize
     *     * <br>
     * The ResponseSize property contains the size of the operation responses sent back from the CIM Object Manager. Any overhead of protocols above the transport protocol SHOULD be included in the count. For example, for the HTTP protocol, the size would include the size of the HTTP payload and the size of the HTTP headers.
     *     */

    public javax.cim.UnsignedInteger64 get_ResponseSize() {
        CIMProperty currentProperty = getProperty(PROPERTY_RESPONSESIZE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_RESPONSESIZE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property ResponseSize
     * <br>
     * The ResponseSize property contains the size of the operation responses sent back from the CIM Object Manager. Any overhead of protocols above the transport protocol SHOULD be included in the count. For example, for the HTTP protocol, the size would include the size of the HTTP payload and the size of the HTTP headers.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ResponseSize(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_RESPONSESIZE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ResponseSize(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_RESPONSESIZE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ResponseSize by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ResponseSize(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_CIMOMStatisticalData fco = new CIM_CIMOMStatisticalData(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_RESPONSESIZE.NAME);
        if (property != null) {
            property = setPropertyValue_ResponseSize(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_RESPONSESIZE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ResponseSize
     * <br>
     * The ResponseSize property contains the size of the operation responses sent back from the CIM Object Manager. Any overhead of protocols above the transport protocol SHOULD be included in the count. For example, for the HTTP protocol, the size would include the size of the HTTP payload and the size of the HTTP headers.
     */

    private static CIMProperty setPropertyValue_ResponseSize(CIMProperty currentProperty,
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

    //**********************************************************************
    // utility methods     
    //**********************************************************************                         

    /**
     * return the name of the CIMClass
     * @return
     */
    public String getObjectName() {
        return CIM_CIMOMStatisticalData.CIM_CLASS_NAME;
    }

}