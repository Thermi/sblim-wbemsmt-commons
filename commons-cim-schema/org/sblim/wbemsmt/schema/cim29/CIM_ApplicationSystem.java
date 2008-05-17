/** 
 * CIM_ApplicationSystem.java
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
 * Description: The ApplicationSystem class represents an application or a software system that supports a particular business function and that can be managed as an independent unit. Such a system can be decomposed into its functional components using the CIM_SoftwareFeature class. The Features for a particular application or software system are located using the CIM_ApplicationSystemSoftwareFeature association. The features are part of the deployment-oriented aspects of the application system. 
 * With regard to the application runtime aspects, the ApplicationSystem class also represents the core class of the Application Systems' sub-model which of the application runtime model. Its role in the systems sub-model is a) the root node of the containment hierarchy of the application elements (at runtime) as services, components, sub-systems, etc., b) the place for runtime overview information such as response time or system status, c) runtime control of the entire application (e.g., start/stop), and d) the main entry point to the navigation through and drill-down into the runtime model. 
 * The lifetime of an instance of this class is not limited to the application instance it represents. Even if the application is not running, the ApplicationSystem object can report properties that have values (e.g., the name of the application or the current status). Note that it is also possible to define the lifetime of the objects through the lifetime of the application instances. 
 * Through ApplicationSystemDependency, non-containment relationships can be expressed.
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

public class CIM_ApplicationSystem extends CIM_System {

    public final static String CIM_CLASS_NAME = "CIM_ApplicationSystem";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * CIM_ApplicationSystemDirectory is an association used to establish a relationship between an ApplicationSystem and the Directories that it uses. This is used to identify the single root installation directory for an ApplicationSystem, as well as the logical purpose of other directories utilized by the ApplicationSystem. Note: This class is intended to be a subclass of CIM_Dependency but the current specification prohibits the extension of parent keys in a subclass. This will be revisited when the specification changes to make the intended inheritance possible.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_APPLICATIONSYSTEMDIRECTORY = "CIM_ApplicationSystemDirectory";

    /**
     * The ApplicationSystemSoftwareFeature association identifies the Features that make up a particular ApplicationSystem. The SoftwareFeatures can be scoped by different Products.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_APPLICATIONSYSTEMSOFTWAREFEATURE = "CIM_ApplicationSystemSoftwareFeature";

    /**
     * Constant for method\'s name and parameters
     * StartApplication() starts an application system. The ApplicationSystem object must have been created prior to the invocation of this method. It is up to the implementation of the method to define which of the contained or dependent sub-elements are to be started and in which order their startup may occur. 
     * Since a system startup can extend over long periods of time (several minutes is not unusual for complex distributed applications), the method can be implemented synchronously or asynchronously. In both cases EnabledState and RequestedState reflect the current state of the application and the desired state (Enabled) respectively. The exact nature of the errors during the startup cannot be determined in the asynchronous case. The method must return one of the following values: 
     * Unspecified Error: If no return code can be identified 
     * Completed with No Error: successful invocation 
     * Start Already in Progress: application still being started 
     * Failed:Indicates errors upon execution.
     */

    public static class METHOD_STARTAPPLICATION {
        /**
         * Constant for method StartApplication
         */
        public final static String NAME = "StartApplication";

        /**
         * constant for value map entry 0
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unspecified_Error = new javax.cim.UnsignedInteger16(
                "0");

        /**
         * constant for value entry Unspecified Error (corresponds to mapEntry 0 )
         */
        public final static String VALUE_ENTRY_Unspecified_Error = "Unspecified Error";

        /**
         * constant for value map entry 1
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Completed_with_No_Error = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry Completed with No Error (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_Completed_with_No_Error = "Completed with No Error";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Start_Already_in_Progress = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Start Already in Progress (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Start_Already_in_Progress = "Start Already in Progress";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Failed = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Failed (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Failed = "Failed";

        /**
         * constant for value map entry 4..4096
         */

        /**
         * constant for value entry DMTF Reserved (corresponds to mapEntry 4..4096 )
         */
        public final static String VALUE_ENTRY_DMTF_Reserved = "DMTF Reserved";

        /**
         * constant for value map entry 4097..32767
         */

        /**
         * constant for value entry Method Reserved (corresponds to mapEntry 4097..32767 )
         */
        public final static String VALUE_ENTRY_Method_Reserved = "Method Reserved";

        /**
         * constant for value map entry 32768..65535
         */

        /**
         * constant for value entry Vendor Specific (corresponds to mapEntry 32768..65535 )
         */
        public final static String VALUE_ENTRY_Vendor_Specific = "Vendor Specific";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@2e202e20
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unspecified_Error.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unspecified_Error;
            }

            if (VALUE_ENTRY_Completed_with_No_Error.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Completed_with_No_Error;
            }

            if (VALUE_ENTRY_Start_Already_in_Progress.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Start_Already_in_Progress;
            }

            if (VALUE_ENTRY_Failed.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Failed;
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

            if (iValue == VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unspecified_Error.intValue()) {
                return VALUE_ENTRY_Unspecified_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Completed_with_No_Error.intValue()) {
                return VALUE_ENTRY_Completed_with_No_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Start_Already_in_Progress.intValue()) {
                return VALUE_ENTRY_Start_Already_in_Progress;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Failed.intValue()) {
                return VALUE_ENTRY_Failed;
            }

            if (iValue >= 4 || iValue <= 4096) {
                return VALUE_ENTRY_DMTF_Reserved;
            }

            if (iValue >= 4097 || iValue <= 32767) {
                return VALUE_ENTRY_Method_Reserved;
            }

            if (iValue >= 32768 || iValue <= 65535) {
                return VALUE_ENTRY_Vendor_Specific;
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
         * Value Map for the method StartApplication   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unspecified_Error,
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Completed_with_No_Error,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Start_Already_in_Progress,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Failed };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the method StartApplication   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unspecified_Error,
                VALUE_ENTRY_Completed_with_No_Error, VALUE_ENTRY_Start_Already_in_Progress,
                VALUE_ENTRY_Failed, VALUE_ENTRY_DMTF_Reserved, VALUE_ENTRY_Method_Reserved,
                VALUE_ENTRY_Vendor_Specific };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the method StartApplication   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unspecified_Error,
                VALUE_ENTRY_Completed_with_No_Error, VALUE_ENTRY_Start_Already_in_Progress,
                VALUE_ENTRY_Failed };

    }

    /**
     * Constant for method\'s name and parameters
     * StopApplication() allows for stopping/shutting down an application system. It is up to the implementation of the method to define which of the contained or dependent sub-elements are to be stopped and in which order their stop has to occur. 
     * Since a system shutdown can last considerable time (several minutes is not necessarily unusual for complex distributed applications), the method can be implemented synchronously or asynchronously. In both cases EnabledState and RequestedState reflect the current state of the application and the desired state (Disabled) respectively. The exact nature of the errors during the stop cannot be determined in the asynchronous case. The method must return one of the following: 
     * Unspecified Error: If no return code can be identified 
     * Completed with No Error: successful invocation 
     * Stop Already in Process: application is shutting down 
     * Failed: Indicates errors upon execution.
     */

    public static class METHOD_STOPAPPLICATION {
        /**
         * Constant for method StopApplication
         */
        public final static String NAME = "StopApplication";

        /**
         * constant for value map entry 0
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unspecified_Error = new javax.cim.UnsignedInteger16(
                "0");

        /**
         * constant for value entry Unspecified Error (corresponds to mapEntry 0 )
         */
        public final static String VALUE_ENTRY_Unspecified_Error = "Unspecified Error";

        /**
         * constant for value map entry 1
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Completed_with_No_Error = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry Completed with No Error (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_Completed_with_No_Error = "Completed with No Error";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Stop_Already_in_Process = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Stop Already in Process (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Stop_Already_in_Process = "Stop Already in Process";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Failed = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Failed (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Failed = "Failed";

        /**
         * constant for value map entry 4..4096
         */

        /**
         * constant for value entry DMTF Reserved (corresponds to mapEntry 4..4096 )
         */
        public final static String VALUE_ENTRY_DMTF_Reserved = "DMTF Reserved";

        /**
         * constant for value map entry 4097..32767
         */

        /**
         * constant for value entry Method Reserved (corresponds to mapEntry 4097..32767 )
         */
        public final static String VALUE_ENTRY_Method_Reserved = "Method Reserved";

        /**
         * constant for value map entry 32768..65535
         */

        /**
         * constant for value entry Vendor Specific (corresponds to mapEntry 32768..65535 )
         */
        public final static String VALUE_ENTRY_Vendor_Specific = "Vendor Specific";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@547a547a
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unspecified_Error.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unspecified_Error;
            }

            if (VALUE_ENTRY_Completed_with_No_Error.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Completed_with_No_Error;
            }

            if (VALUE_ENTRY_Stop_Already_in_Process.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Stop_Already_in_Process;
            }

            if (VALUE_ENTRY_Failed.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Failed;
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

            if (iValue == VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unspecified_Error.intValue()) {
                return VALUE_ENTRY_Unspecified_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Completed_with_No_Error.intValue()) {
                return VALUE_ENTRY_Completed_with_No_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Stop_Already_in_Process.intValue()) {
                return VALUE_ENTRY_Stop_Already_in_Process;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Failed.intValue()) {
                return VALUE_ENTRY_Failed;
            }

            if (iValue >= 4 || iValue <= 4096) {
                return VALUE_ENTRY_DMTF_Reserved;
            }

            if (iValue >= 4097 || iValue <= 32767) {
                return VALUE_ENTRY_Method_Reserved;
            }

            if (iValue >= 32768 || iValue <= 65535) {
                return VALUE_ENTRY_Vendor_Specific;
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
         * Value Map for the method StopApplication   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unspecified_Error,
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Completed_with_No_Error,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Stop_Already_in_Process,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Failed };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the method StopApplication   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unspecified_Error,
                VALUE_ENTRY_Completed_with_No_Error, VALUE_ENTRY_Stop_Already_in_Process,
                VALUE_ENTRY_Failed, VALUE_ENTRY_DMTF_Reserved, VALUE_ENTRY_Method_Reserved,
                VALUE_ENTRY_Vendor_Specific };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the method StopApplication   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unspecified_Error,
                VALUE_ENTRY_Completed_with_No_Error, VALUE_ENTRY_Stop_Already_in_Process,
                VALUE_ENTRY_Failed };

    }

    /**
     * Constants of property Distribution
     * Distribution describes how the application system is distributed with respect to its underlying servers. In general, the application system is distributed or local. This property indicates whether the application system is running on one or multiple servers. This can be determined without having to query for associated servers represented by ComputerSystems. Distributed systems also introduce a virtual notion to themselves. Note that a distributed application system is not tangible but virtual. Only its contained local systems can be found as processes or threads, and can therefore be regarded as tangible. The distributed system remains a named, virtual entity, that scopes strongly bound constituents and allows the application to be managed in its entirety. 
     * The property is needed to help root cause analysis and operations, especially when these are automated, in order to clearly know that more than one executed application - most likely the local application systems - is affected by the management task. This is particularly true if the contained application systems provide uniform functionality like webserver or application server farms. 
     * To express constraints between distributed and local system, this class must be derived and appropriate associations must be defined. 
     * This property should not be confused with the Roles[] property defined in System. The latter is reserved for administrator assigned roles.
     */
    public static class PROPERTY_DISTRIBUTION {
        /**
         * name of the property Distribution
         */
        public final static String NAME = "Distribution";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Distributed = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry Distributed (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_Distributed = "Distributed";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Local = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Local (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Local = "Local";

        /**
         * constant for value map entry 3..32767
         */

        /**
         * constant for value entry DMTF Reserved (corresponds to mapEntry 3..32767 )
         */
        public final static String VALUE_ENTRY_DMTF_Reserved = "DMTF Reserved";

        /**
         * constant for value map entry 32768..65535
         */

        /**
         * constant for value entry Vendor Specific (corresponds to mapEntry 32768..65535 )
         */
        public final static String VALUE_ENTRY_Vendor_Specific = "Vendor Specific";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@3d4a3d4a
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Distributed.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Distributed;
            }

            if (VALUE_ENTRY_Local.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Local;
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

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Distributed.intValue()) {
                return VALUE_ENTRY_Distributed;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Local.intValue()) {
                return VALUE_ENTRY_Local;
            }

            if (iValue >= 3 || iValue <= 32767) {
                return VALUE_ENTRY_DMTF_Reserved;
            }

            if (iValue >= 32768 || iValue <= 65535) {
                return VALUE_ENTRY_Vendor_Specific;
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
         * Value Map for the property Distribution   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Distributed,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Local };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property Distribution   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Distributed, VALUE_ENTRY_Local, VALUE_ENTRY_DMTF_Reserved,
                VALUE_ENTRY_Vendor_Specific };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property Distribution   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Distributed, VALUE_ENTRY_Local };

    }

    /**
     * Constants of property EnabledState
     * EnabledState is an integer enumeration that indicates the enabled/disabled states of an element. It can also indicate the transitions between these requested states. For example, shutting down and starting are transient states between enabled and disabled. 
     * In contrast to the original version defined higher in the inheritance hierarchy (EnabledLogicalElement), EnabledState is simplified. It reflects the notion of an execution status tailored to applications and represents a summary of the original property. It allows simplified and efficient determination of whether the application is started, stopped or in transition between either of these states. The property does not show any errors. Errors MUST be described in MSE.OperationalStatus, and MAY also be described in logs or other data sources. 
     * The mapping to MSE.OperationalStatus is as follows: 
     * ExecutionStatus <- MSE.OperationalStatus 
     * Unknown <- Unknown, No Contact, Lost Communication, 
     * Either of the values <- Other 
     * Enabled (started) <- OK, Degraded, Stressed, Predictive Failure, In Service, Dormant, Supporting Entity in Error, Completed 
     * Enabled or Disabled (Started or Stopped) <- Error, Non-Recoverable Error 
     * Starting <- Starting 
     * Shutting Down (Stopping) <- Stopping 
     * Disabled (Stopped) <- Stopped, Aborted. 
     * The mapping to the original EnabledState property is as follows: 
     * Unknown <- Unknown, Not Applicable 
     * Either of the values <-Other 
     * Enabled <- Enabled, Enabled but Offline, In Test, Deferred, Quiesce 
     * Disabled <- Disabled 
     * ShuttingDown <- ShuttingDown 
     * Starting <- Starting.
     */
    public static class PROPERTY_ENABLEDSTATE {
        /**
         * name of the property EnabledState
         */
        public final static String NAME = "EnabledState";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Enabled = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Enabled (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Enabled = "Enabled";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Shutting_Down = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Shutting Down (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Shutting_Down = "Shutting Down";

        /**
         * constant for value map entry 10
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Starting = new javax.cim.UnsignedInteger16(
                "10");

        /**
         * constant for value entry Starting (corresponds to mapEntry 10 )
         */
        public final static String VALUE_ENTRY_Starting = "Starting";

        /**
         * constant for value map entry 11..32767
         */

        /**
         * constant for value entry DMTF Reserved (corresponds to mapEntry 11..32767 )
         */
        public final static String VALUE_ENTRY_DMTF_Reserved = "DMTF Reserved";

        /**
         * constant for value map entry 32768..65535
         */

        /**
         * constant for value entry Vendor Reserved (corresponds to mapEntry 32768..65535 )
         */
        public final static String VALUE_ENTRY_Vendor_Reserved = "Vendor Reserved";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@5b205b20
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Enabled.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Enabled;
            }

            if (VALUE_ENTRY_Disabled.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Disabled;
            }

            if (VALUE_ENTRY_Shutting_Down.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Shutting_Down;
            }

            if (VALUE_ENTRY_Starting.equals(value)) {
                return VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Starting;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Enabled.intValue()) {
                return VALUE_ENTRY_Enabled;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Disabled.intValue()) {
                return VALUE_ENTRY_Disabled;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Shutting_Down.intValue()) {
                return VALUE_ENTRY_Shutting_Down;
            }

            if (iValue == VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Starting.intValue()) {
                return VALUE_ENTRY_Starting;
            }

            if (iValue >= 11 || iValue <= 32767) {
                return VALUE_ENTRY_DMTF_Reserved;
            }

            if (iValue >= 32768 || iValue <= 65535) {
                return VALUE_ENTRY_Vendor_Reserved;
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
         * Value Map for the property EnabledState   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Enabled,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Disabled,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Shutting_Down,
                VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Starting };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property EnabledState   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Enabled,
                VALUE_ENTRY_Disabled, VALUE_ENTRY_Shutting_Down, VALUE_ENTRY_Starting,
                VALUE_ENTRY_DMTF_Reserved, VALUE_ENTRY_Vendor_Reserved };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property EnabledState   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Enabled, VALUE_ENTRY_Disabled, VALUE_ENTRY_Shutting_Down,
                VALUE_ENTRY_Starting };

    }

    /**
     * Constants of property LastServingStatusUpdate
     * The point in time at which the ServingStatus property was last updated.
     */
    public static class PROPERTY_LASTSERVINGSTATUSUPDATE {
        /**
         * name of the property LastServingStatusUpdate
         */
        public final static String NAME = "LastServingStatusUpdate";

    }

    /**
     * Constants of property ServingStatus
     * ServingStatus is a summary of MSE.OperationalStatus. It allows simplified and efficient determination of whether the application is providing service or has stopped doing so for various reasons like errors, shutdown, abort, etc. Therefore, no transitional values are provided. The property does not show any errors. Errors MUST be described in MSE.OperationalStatus, and MAY also be described in logs or other data sources. Therefore, ServingStatus is suited to provide summary information for monitoring purposes and service level management. 
     * The mapping to MSE.OperationalStatus is as follows: 
     * ServingStatus <- MSE.OperationalStatus 
     * Unknown <- Unknown, No Contact, Lost Communication 
     * Either of the values <- Other 
     * Serving <- OK, Degraded, Stressed, Predictive Failure, Completed 
     * Not Serving <- Error, Non-Recoverable Error, Starting, Stopping, Stopped, In Service, Aborted, Dormant, Supporting Entity in Error.
     */
    public static class PROPERTY_SERVINGSTATUS {
        /**
         * name of the property ServingStatus
         */
        public final static String NAME = "ServingStatus";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Serving = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry Serving (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_Serving = "Serving";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Not_Serving = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Not Serving (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Not_Serving = "Not Serving";

        /**
         * constant for value map entry 5..4096
         */

        /**
         * constant for value entry DMTF Reserved (corresponds to mapEntry 5..4096 )
         */
        public final static String VALUE_ENTRY_DMTF_Reserved = "DMTF Reserved";

        /**
         * constant for value map entry 4097..65535
         */

        /**
         * constant for value entry Vendor Specific (corresponds to mapEntry 4097..65535 )
         */
        public final static String VALUE_ENTRY_Vendor_Specific = "Vendor Specific";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@1a701a70
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Serving.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Serving;
            }

            if (VALUE_ENTRY_Not_Serving.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Not_Serving;
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

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Serving.intValue()) {
                return VALUE_ENTRY_Serving;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Not_Serving.intValue()) {
                return VALUE_ENTRY_Not_Serving;
            }

            if (iValue >= 5 || iValue <= 4096) {
                return VALUE_ENTRY_DMTF_Reserved;
            }

            if (iValue >= 4097 || iValue <= 65535) {
                return VALUE_ENTRY_Vendor_Specific;
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
         * Value Map for the property ServingStatus   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Serving,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Not_Serving };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property ServingStatus   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Serving,
                VALUE_ENTRY_Not_Serving, VALUE_ENTRY_DMTF_Reserved, VALUE_ENTRY_Vendor_Specific };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property ServingStatus   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Serving, VALUE_ENTRY_Not_Serving };

    }

    /**
     * Constants of property StartupTime
     * The point in time (date and time) when the application system was last started. If the application system is in a state other the state Enabled (i.e., started and running) this value is not meaningful and the property value MUST be set to all zeros. 
     * StartupTime is preferably the point in time when the application is available to the user. Instead, if the provider and/or the instrumentation cannot determine the point in time the application becomes available, the point in time can be used at which the underlying operating system reports successful launch of the application. If no value can be provided the property value MUST be set to all zeros.
     */
    public static class PROPERTY_STARTUPTIME {
        /**
         * name of the property StartupTime
         */
        public final static String NAME = "StartupTime";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
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
     *   The ApplicationSystem class represents an application or a software system that supports a particular business function and that can be managed as an independent unit. Such a system can be decomposed into its functional components using the CIM_SoftwareFeature class. The Features for a particular application or software system are located using the CIM_ApplicationSystemSoftwareFeature association. The features are part of the deployment-oriented aspects of the application system. 
     * With regard to the application runtime aspects, the ApplicationSystem class also represents the core class of the Application Systems' sub-model which of the application runtime model. Its role in the systems sub-model is a) the root node of the containment hierarchy of the application elements (at runtime) as services, components, sub-systems, etc., b) the place for runtime overview information such as response time or system status, c) runtime control of the entire application (e.g., start/stop), and d) the main entry point to the navigation through and drill-down into the runtime model. 
     * The lifetime of an instance of this class is not limited to the application instance it represents. Even if the application is not running, the ApplicationSystem object can report properties that have values (e.g., the name of the application or the current status). Note that it is also possible to define the lifetime of the objects through the lifetime of the application instances. 
     * Through ApplicationSystemDependency, non-containment relationships can be expressed.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_ApplicationSystem(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   The ApplicationSystem class represents an application or a software system that supports a particular business function and that can be managed as an independent unit. Such a system can be decomposed into its functional components using the CIM_SoftwareFeature class. The Features for a particular application or software system are located using the CIM_ApplicationSystemSoftwareFeature association. The features are part of the deployment-oriented aspects of the application system. 
     * With regard to the application runtime aspects, the ApplicationSystem class also represents the core class of the Application Systems' sub-model which of the application runtime model. Its role in the systems sub-model is a) the root node of the containment hierarchy of the application elements (at runtime) as services, components, sub-systems, etc., b) the place for runtime overview information such as response time or system status, c) runtime control of the entire application (e.g., start/stop), and d) the main entry point to the navigation through and drill-down into the runtime model. 
     * The lifetime of an instance of this class is not limited to the application instance it represents. Even if the application is not running, the ApplicationSystem object can report properties that have values (e.g., the name of the application or the current status). Note that it is also possible to define the lifetime of the objects through the lifetime of the application instances. 
     * Through ApplicationSystemDependency, non-containment relationships can be expressed.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_ApplicationSystem(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_ApplicationSystem() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("Distribution", new CIMProperty("Distribution", CIMDataType.UINT16_T,
                null));
        propertiesToCheck.put("EnabledState", new CIMProperty("EnabledState", CIMDataType.UINT16_T,
                null));
        propertiesToCheck.put("LastServingStatusUpdate", new CIMProperty("LastServingStatusUpdate",
                CIMDataType.DATETIME_T, null));
        propertiesToCheck.put("ServingStatus", new CIMProperty("ServingStatus",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("StartupTime", new CIMProperty("StartupTime", CIMDataType.DATETIME_T,
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
     * Get the property Distribution
     *     * <br>
     * Distribution describes how the application system is distributed with respect to its underlying servers. In general, the application system is distributed or local. This property indicates whether the application system is running on one or multiple servers. This can be determined without having to query for associated servers represented by ComputerSystems. Distributed systems also introduce a virtual notion to themselves. Note that a distributed application system is not tangible but virtual. Only its contained local systems can be found as processes or threads, and can therefore be regarded as tangible. The distributed system remains a named, virtual entity, that scopes strongly bound constituents and allows the application to be managed in its entirety. 
     * The property is needed to help root cause analysis and operations, especially when these are automated, in order to clearly know that more than one executed application - most likely the local application systems - is affected by the management task. This is particularly true if the contained application systems provide uniform functionality like webserver or application server farms. 
     * To express constraints between distributed and local system, this class must be derived and appropriate associations must be defined. 
     * This property should not be confused with the Roles[] property defined in System. The latter is reserved for administrator assigned roles.
     *     */

    public javax.cim.UnsignedInteger16 get_Distribution() {
        CIMProperty currentProperty = getProperty(PROPERTY_DISTRIBUTION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_DISTRIBUTION.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property Distribution
     * <br>
     * Distribution describes how the application system is distributed with respect to its underlying servers. In general, the application system is distributed or local. This property indicates whether the application system is running on one or multiple servers. This can be determined without having to query for associated servers represented by ComputerSystems. Distributed systems also introduce a virtual notion to themselves. Note that a distributed application system is not tangible but virtual. Only its contained local systems can be found as processes or threads, and can therefore be regarded as tangible. The distributed system remains a named, virtual entity, that scopes strongly bound constituents and allows the application to be managed in its entirety. 
     * The property is needed to help root cause analysis and operations, especially when these are automated, in order to clearly know that more than one executed application - most likely the local application systems - is affected by the management task. This is particularly true if the contained application systems provide uniform functionality like webserver or application server farms. 
     * To express constraints between distributed and local system, this class must be derived and appropriate associations must be defined. 
     * This property should not be confused with the Roles[] property defined in System. The latter is reserved for administrator assigned roles.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Distribution(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_DISTRIBUTION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Distribution(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_DISTRIBUTION.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Distribution by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Distribution(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_ApplicationSystem fco = new CIM_ApplicationSystem(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_DISTRIBUTION.NAME);
        if (property != null) {
            property = setPropertyValue_Distribution(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_DISTRIBUTION.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Distribution
     * <br>
     * Distribution describes how the application system is distributed with respect to its underlying servers. In general, the application system is distributed or local. This property indicates whether the application system is running on one or multiple servers. This can be determined without having to query for associated servers represented by ComputerSystems. Distributed systems also introduce a virtual notion to themselves. Note that a distributed application system is not tangible but virtual. Only its contained local systems can be found as processes or threads, and can therefore be regarded as tangible. The distributed system remains a named, virtual entity, that scopes strongly bound constituents and allows the application to be managed in its entirety. 
     * The property is needed to help root cause analysis and operations, especially when these are automated, in order to clearly know that more than one executed application - most likely the local application systems - is affected by the management task. This is particularly true if the contained application systems provide uniform functionality like webserver or application server farms. 
     * To express constraints between distributed and local system, this class must be derived and appropriate associations must be defined. 
     * This property should not be confused with the Roles[] property defined in System. The latter is reserved for administrator assigned roles.
     */

    private static CIMProperty setPropertyValue_Distribution(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property EnabledState
     *     * <br>
     * EnabledState is an integer enumeration that indicates the enabled/disabled states of an element. It can also indicate the transitions between these requested states. For example, shutting down and starting are transient states between enabled and disabled. 
     * In contrast to the original version defined higher in the inheritance hierarchy (EnabledLogicalElement), EnabledState is simplified. It reflects the notion of an execution status tailored to applications and represents a summary of the original property. It allows simplified and efficient determination of whether the application is started, stopped or in transition between either of these states. The property does not show any errors. Errors MUST be described in MSE.OperationalStatus, and MAY also be described in logs or other data sources. 
     * The mapping to MSE.OperationalStatus is as follows: 
     * ExecutionStatus <- MSE.OperationalStatus 
     * Unknown <- Unknown, No Contact, Lost Communication, 
     * Either of the values <- Other 
     * Enabled (started) <- OK, Degraded, Stressed, Predictive Failure, In Service, Dormant, Supporting Entity in Error, Completed 
     * Enabled or Disabled (Started or Stopped) <- Error, Non-Recoverable Error 
     * Starting <- Starting 
     * Shutting Down (Stopping) <- Stopping 
     * Disabled (Stopped) <- Stopped, Aborted. 
     * The mapping to the original EnabledState property is as follows: 
     * Unknown <- Unknown, Not Applicable 
     * Either of the values <-Other 
     * Enabled <- Enabled, Enabled but Offline, In Test, Deferred, Quiesce 
     * Disabled <- Disabled 
     * ShuttingDown <- ShuttingDown 
     * Starting <- Starting.
     *     */

    public javax.cim.UnsignedInteger16 get_EnabledState() {
        CIMProperty currentProperty = getProperty(PROPERTY_ENABLEDSTATE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ENABLEDSTATE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property EnabledState
     * <br>
     * EnabledState is an integer enumeration that indicates the enabled/disabled states of an element. It can also indicate the transitions between these requested states. For example, shutting down and starting are transient states between enabled and disabled. 
     * In contrast to the original version defined higher in the inheritance hierarchy (EnabledLogicalElement), EnabledState is simplified. It reflects the notion of an execution status tailored to applications and represents a summary of the original property. It allows simplified and efficient determination of whether the application is started, stopped or in transition between either of these states. The property does not show any errors. Errors MUST be described in MSE.OperationalStatus, and MAY also be described in logs or other data sources. 
     * The mapping to MSE.OperationalStatus is as follows: 
     * ExecutionStatus <- MSE.OperationalStatus 
     * Unknown <- Unknown, No Contact, Lost Communication, 
     * Either of the values <- Other 
     * Enabled (started) <- OK, Degraded, Stressed, Predictive Failure, In Service, Dormant, Supporting Entity in Error, Completed 
     * Enabled or Disabled (Started or Stopped) <- Error, Non-Recoverable Error 
     * Starting <- Starting 
     * Shutting Down (Stopping) <- Stopping 
     * Disabled (Stopped) <- Stopped, Aborted. 
     * The mapping to the original EnabledState property is as follows: 
     * Unknown <- Unknown, Not Applicable 
     * Either of the values <-Other 
     * Enabled <- Enabled, Enabled but Offline, In Test, Deferred, Quiesce 
     * Disabled <- Disabled 
     * ShuttingDown <- ShuttingDown 
     * Starting <- Starting.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_EnabledState(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ENABLEDSTATE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_EnabledState(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ENABLEDSTATE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property EnabledState by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_EnabledState(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_ApplicationSystem fco = new CIM_ApplicationSystem(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ENABLEDSTATE.NAME);
        if (property != null) {
            property = setPropertyValue_EnabledState(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ENABLEDSTATE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property EnabledState
     * <br>
     * EnabledState is an integer enumeration that indicates the enabled/disabled states of an element. It can also indicate the transitions between these requested states. For example, shutting down and starting are transient states between enabled and disabled. 
     * In contrast to the original version defined higher in the inheritance hierarchy (EnabledLogicalElement), EnabledState is simplified. It reflects the notion of an execution status tailored to applications and represents a summary of the original property. It allows simplified and efficient determination of whether the application is started, stopped or in transition between either of these states. The property does not show any errors. Errors MUST be described in MSE.OperationalStatus, and MAY also be described in logs or other data sources. 
     * The mapping to MSE.OperationalStatus is as follows: 
     * ExecutionStatus <- MSE.OperationalStatus 
     * Unknown <- Unknown, No Contact, Lost Communication, 
     * Either of the values <- Other 
     * Enabled (started) <- OK, Degraded, Stressed, Predictive Failure, In Service, Dormant, Supporting Entity in Error, Completed 
     * Enabled or Disabled (Started or Stopped) <- Error, Non-Recoverable Error 
     * Starting <- Starting 
     * Shutting Down (Stopping) <- Stopping 
     * Disabled (Stopped) <- Stopped, Aborted. 
     * The mapping to the original EnabledState property is as follows: 
     * Unknown <- Unknown, Not Applicable 
     * Either of the values <-Other 
     * Enabled <- Enabled, Enabled but Offline, In Test, Deferred, Quiesce 
     * Disabled <- Disabled 
     * ShuttingDown <- ShuttingDown 
     * Starting <- Starting.
     */

    private static CIMProperty setPropertyValue_EnabledState(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property LastServingStatusUpdate
     *     * <br>
     * The point in time at which the ServingStatus property was last updated.
     *     */

    public javax.cim.CIMDateTime get_LastServingStatusUpdate() {
        CIMProperty currentProperty = getProperty(PROPERTY_LASTSERVINGSTATUSUPDATE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_LASTSERVINGSTATUSUPDATE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.CIMDateTime) currentProperty.getValue();

    }

    /**
     * Set the property LastServingStatusUpdate
     * <br>
     * The point in time at which the ServingStatus property was last updated.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_LastServingStatusUpdate(javax.cim.CIMDateTime newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_LASTSERVINGSTATUSUPDATE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_LastServingStatusUpdate(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_LASTSERVINGSTATUSUPDATE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property LastServingStatusUpdate by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_LastServingStatusUpdate(WBEMClient client, String namespace,
            javax.cim.CIMDateTime newValue) throws WbemsmtException {
        CIM_ApplicationSystem fco = new CIM_ApplicationSystem(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_LASTSERVINGSTATUSUPDATE.NAME);
        if (property != null) {
            property = setPropertyValue_LastServingStatusUpdate(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_LASTSERVINGSTATUSUPDATE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property LastServingStatusUpdate
     * <br>
     * The point in time at which the ServingStatus property was last updated.
     */

    private static CIMProperty setPropertyValue_LastServingStatusUpdate(
            CIMProperty currentProperty, javax.cim.CIMDateTime newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ServingStatus
     *     * <br>
     * ServingStatus is a summary of MSE.OperationalStatus. It allows simplified and efficient determination of whether the application is providing service or has stopped doing so for various reasons like errors, shutdown, abort, etc. Therefore, no transitional values are provided. The property does not show any errors. Errors MUST be described in MSE.OperationalStatus, and MAY also be described in logs or other data sources. Therefore, ServingStatus is suited to provide summary information for monitoring purposes and service level management. 
     * The mapping to MSE.OperationalStatus is as follows: 
     * ServingStatus <- MSE.OperationalStatus 
     * Unknown <- Unknown, No Contact, Lost Communication 
     * Either of the values <- Other 
     * Serving <- OK, Degraded, Stressed, Predictive Failure, Completed 
     * Not Serving <- Error, Non-Recoverable Error, Starting, Stopping, Stopped, In Service, Aborted, Dormant, Supporting Entity in Error.
     *     */

    public javax.cim.UnsignedInteger16 get_ServingStatus() {
        CIMProperty currentProperty = getProperty(PROPERTY_SERVINGSTATUS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SERVINGSTATUS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property ServingStatus
     * <br>
     * ServingStatus is a summary of MSE.OperationalStatus. It allows simplified and efficient determination of whether the application is providing service or has stopped doing so for various reasons like errors, shutdown, abort, etc. Therefore, no transitional values are provided. The property does not show any errors. Errors MUST be described in MSE.OperationalStatus, and MAY also be described in logs or other data sources. Therefore, ServingStatus is suited to provide summary information for monitoring purposes and service level management. 
     * The mapping to MSE.OperationalStatus is as follows: 
     * ServingStatus <- MSE.OperationalStatus 
     * Unknown <- Unknown, No Contact, Lost Communication 
     * Either of the values <- Other 
     * Serving <- OK, Degraded, Stressed, Predictive Failure, Completed 
     * Not Serving <- Error, Non-Recoverable Error, Starting, Stopping, Stopped, In Service, Aborted, Dormant, Supporting Entity in Error.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ServingStatus(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SERVINGSTATUS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ServingStatus(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SERVINGSTATUS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ServingStatus by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ServingStatus(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_ApplicationSystem fco = new CIM_ApplicationSystem(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SERVINGSTATUS.NAME);
        if (property != null) {
            property = setPropertyValue_ServingStatus(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SERVINGSTATUS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ServingStatus
     * <br>
     * ServingStatus is a summary of MSE.OperationalStatus. It allows simplified and efficient determination of whether the application is providing service or has stopped doing so for various reasons like errors, shutdown, abort, etc. Therefore, no transitional values are provided. The property does not show any errors. Errors MUST be described in MSE.OperationalStatus, and MAY also be described in logs or other data sources. Therefore, ServingStatus is suited to provide summary information for monitoring purposes and service level management. 
     * The mapping to MSE.OperationalStatus is as follows: 
     * ServingStatus <- MSE.OperationalStatus 
     * Unknown <- Unknown, No Contact, Lost Communication 
     * Either of the values <- Other 
     * Serving <- OK, Degraded, Stressed, Predictive Failure, Completed 
     * Not Serving <- Error, Non-Recoverable Error, Starting, Stopping, Stopped, In Service, Aborted, Dormant, Supporting Entity in Error.
     */

    private static CIMProperty setPropertyValue_ServingStatus(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property StartupTime
     *     * <br>
     * The point in time (date and time) when the application system was last started. If the application system is in a state other the state Enabled (i.e., started and running) this value is not meaningful and the property value MUST be set to all zeros. 
     * StartupTime is preferably the point in time when the application is available to the user. Instead, if the provider and/or the instrumentation cannot determine the point in time the application becomes available, the point in time can be used at which the underlying operating system reports successful launch of the application. If no value can be provided the property value MUST be set to all zeros.
     *     */

    public javax.cim.CIMDateTime get_StartupTime() {
        CIMProperty currentProperty = getProperty(PROPERTY_STARTUPTIME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_STARTUPTIME.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.CIMDateTime) currentProperty.getValue();

    }

    /**
     * Set the property StartupTime
     * <br>
     * The point in time (date and time) when the application system was last started. If the application system is in a state other the state Enabled (i.e., started and running) this value is not meaningful and the property value MUST be set to all zeros. 
     * StartupTime is preferably the point in time when the application is available to the user. Instead, if the provider and/or the instrumentation cannot determine the point in time the application becomes available, the point in time can be used at which the underlying operating system reports successful launch of the application. If no value can be provided the property value MUST be set to all zeros.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_StartupTime(javax.cim.CIMDateTime newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_STARTUPTIME.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_StartupTime(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_STARTUPTIME.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property StartupTime by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_StartupTime(WBEMClient client, String namespace,
            javax.cim.CIMDateTime newValue) throws WbemsmtException {
        CIM_ApplicationSystem fco = new CIM_ApplicationSystem(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_STARTUPTIME.NAME);
        if (property != null) {
            property = setPropertyValue_StartupTime(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_STARTUPTIME.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property StartupTime
     * <br>
     * The point in time (date and time) when the application system was last started. If the application system is in a state other the state Enabled (i.e., started and running) this value is not meaningful and the property value MUST be set to all zeros. 
     * StartupTime is preferably the point in time when the application is available to the user. Instead, if the provider and/or the instrumentation cannot determine the point in time the application becomes available, the point in time can be used at which the underlying operating system reports successful launch of the application. If no value can be provided the property value MUST be set to all zeros.
     */

    private static CIMProperty setPropertyValue_StartupTime(CIMProperty currentProperty,
            javax.cim.CIMDateTime newValue) {
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
     * Get the list with CIM_Directory objects associated by the association CIM_ApplicationSystemDirectory
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_APPLICATIONSYSTEMDIRECTORY as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_Directory_CIM_ApplicationSystemDirectorys(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_Directory_CIM_ApplicationSystemDirectorys(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_APPLICATIONSYSTEMDIRECTORY,
                CIM_Directory.CIM_CLASS_NAME, null, null, false, false, null);

    }

    /**
     * Get the list with CIM_Directory objects associated by the association CIM_ApplicationSystemDirectory
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_APPLICATIONSYSTEMDIRECTORY or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_APPLICATIONSYSTEMDIRECTORY as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_Directory_CIM_ApplicationSystemDirectorys(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_Directory_CIM_ApplicationSystemDirectorys(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_APPLICATIONSYSTEMDIRECTORY, resultClass, role,
                resultRole, false, false, null);

    }

    /**
     * Get the list with CIM_Directory objects associated by the association CIM_ApplicationSystemDirectory
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_APPLICATIONSYSTEMDIRECTORY or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_Directory_CIM_ApplicationSystemDirectorys(
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
                CIM_ApplicationSystemHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_ApplicationSystemHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_ApplicationSystemHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_Directory(cimInstance));
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
                        result.add(new CIM_Directory(cimInstance));
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
                        result.add(new CIM_Directory(cimInstance));
                        continue;
                    }
                }
            }
            CIM_ApplicationSystemHelper.checkException(enumeration);
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
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_ApplicationSystemDirectory
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_APPLICATIONSYSTEMDIRECTORY as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_Directory_CIM_ApplicationSystemDirectoryNames(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_Directory_CIM_ApplicationSystemDirectoryNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_APPLICATIONSYSTEMDIRECTORY,
                CIM_Directory.CIM_CLASS_NAME, null, null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_ApplicationSystemDirectory
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_APPLICATIONSYSTEMDIRECTORY or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_APPLICATIONSYSTEMDIRECTORY as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_Directory_CIM_ApplicationSystemDirectoryNames(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_Directory_CIM_ApplicationSystemDirectoryNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_APPLICATIONSYSTEMDIRECTORY, resultClass, role,
                resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_ApplicationSystemDirectory
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_Directory_CIM_ApplicationSystemDirectoryNames(
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
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_APPLICATIONSYSTEMDIRECTORY,
                    CIM_Directory.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_ApplicationSystemHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_ApplicationSystemHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_Directory.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_ApplicationSystemHelper.checkException(enumeration);
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
     * Get the list with CIM_ApplicationSystemDirectory associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_ApplicationSystemDirectory(WBEMClient cimClient,
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_APPLICATIONSYSTEMDIRECTORY, role,
                    includeQualifiers, includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_APPLICATIONSYSTEMDIRECTORY, role,
                    includeQualifiers, includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_ApplicationSystemHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_ApplicationSystemHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_ApplicationSystemDirectoryHelper.findClass(cimClient,
                            cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_ApplicationSystemDirectory(cimInstance));
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
                        result.add(new CIM_ApplicationSystemDirectory(cimInstance));
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
                        result.add(new CIM_ApplicationSystemDirectory(cimInstance));
                        continue;
                    }
                }
            }
            CIM_ApplicationSystemHelper.checkException(enumeration);
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
     * Get a list of CIMObjectPath items of the associations CIM_ApplicationSystemDirectory
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_ApplicationSystemDirectory(WBEMClient cimClient,
            String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_APPLICATIONSYSTEMDIRECTORY, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_APPLICATIONSYSTEMDIRECTORY,
                    role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_ApplicationSystemHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_ApplicationSystemHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_ApplicationSystemDirectory.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_ApplicationSystemHelper.checkException(enumeration);
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
     * Get the list with CIM_SoftwareFeature objects associated by the association CIM_ApplicationSystemSoftwareFeature
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_APPLICATIONSYSTEMSOFTWAREFEATURE as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_SoftwareFeature_CIM_ApplicationSystemSoftwareFeatures(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_SoftwareFeature_CIM_ApplicationSystemSoftwareFeatures(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_APPLICATIONSYSTEMSOFTWAREFEATURE,
                CIM_SoftwareFeature.CIM_CLASS_NAME, null, null, false, false, null);

    }

    /**
     * Get the list with CIM_SoftwareFeature objects associated by the association CIM_ApplicationSystemSoftwareFeature
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_APPLICATIONSYSTEMSOFTWAREFEATURE or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_APPLICATIONSYSTEMSOFTWAREFEATURE as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_SoftwareFeature_CIM_ApplicationSystemSoftwareFeatures(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_SoftwareFeature_CIM_ApplicationSystemSoftwareFeatures(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_APPLICATIONSYSTEMSOFTWAREFEATURE, resultClass, role,
                resultRole, false, false, null);

    }

    /**
     * Get the list with CIM_SoftwareFeature objects associated by the association CIM_ApplicationSystemSoftwareFeature
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_APPLICATIONSYSTEMSOFTWAREFEATURE or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_SoftwareFeature_CIM_ApplicationSystemSoftwareFeatures(
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
                CIM_ApplicationSystemHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_ApplicationSystemHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_ApplicationSystemHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_SoftwareFeature(cimInstance));
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
                        result.add(new CIM_SoftwareFeature(cimInstance));
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
                        result.add(new CIM_SoftwareFeature(cimInstance));
                        continue;
                    }
                }
            }
            CIM_ApplicationSystemHelper.checkException(enumeration);
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
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_ApplicationSystemSoftwareFeature
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_APPLICATIONSYSTEMSOFTWAREFEATURE as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_SoftwareFeature_CIM_ApplicationSystemSoftwareFeatureNames(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_SoftwareFeature_CIM_ApplicationSystemSoftwareFeatureNames(
                cimClient, true, CIM_ASSOCIATOR_CLASS_NAME_CIM_APPLICATIONSYSTEMSOFTWAREFEATURE,
                CIM_SoftwareFeature.CIM_CLASS_NAME, null, null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_ApplicationSystemSoftwareFeature
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_APPLICATIONSYSTEMSOFTWAREFEATURE or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_APPLICATIONSYSTEMSOFTWAREFEATURE as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_SoftwareFeature_CIM_ApplicationSystemSoftwareFeatureNames(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_SoftwareFeature_CIM_ApplicationSystemSoftwareFeatureNames(
                cimClient, true, CIM_ASSOCIATOR_CLASS_NAME_CIM_APPLICATIONSYSTEMSOFTWAREFEATURE,
                resultClass, role, resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_ApplicationSystemSoftwareFeature
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_SoftwareFeature_CIM_ApplicationSystemSoftwareFeatureNames(
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_APPLICATIONSYSTEMSOFTWAREFEATURE,
                    CIM_SoftwareFeature.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_ApplicationSystemHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_ApplicationSystemHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_SoftwareFeature.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_ApplicationSystemHelper.checkException(enumeration);
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
     * Get the list with CIM_ApplicationSystemSoftwareFeature associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_ApplicationSystemSoftwareFeature(
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_APPLICATIONSYSTEMSOFTWAREFEATURE, role,
                    includeQualifiers, includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_APPLICATIONSYSTEMSOFTWAREFEATURE, role,
                    includeQualifiers, includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_ApplicationSystemHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_ApplicationSystemHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_ApplicationSystemSoftwareFeatureHelper.findClass(cimClient,
                            cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_ApplicationSystemSoftwareFeature(cimInstance));
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
                        result.add(new CIM_ApplicationSystemSoftwareFeature(cimInstance));
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
                        result.add(new CIM_ApplicationSystemSoftwareFeature(cimInstance));
                        continue;
                    }
                }
            }
            CIM_ApplicationSystemHelper.checkException(enumeration);
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
     * Get a list of CIMObjectPath items of the associations CIM_ApplicationSystemSoftwareFeature
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_ApplicationSystemSoftwareFeature(
            WBEMClient cimClient, String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_APPLICATIONSYSTEMSOFTWAREFEATURE, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_APPLICATIONSYSTEMSOFTWAREFEATURE, role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_ApplicationSystemHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_ApplicationSystemHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_ApplicationSystemSoftwareFeature.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_ApplicationSystemHelper.checkException(enumeration);
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
     * Invokes the Method StartApplication
     * <br>
     * @param client the cimclient
     * StartApplication() starts an application system. The ApplicationSystem object must have been created prior to the invocation of this method. It is up to the implementation of the method to define which of the contained or dependent sub-elements are to be started and in which order their startup may occur. 
     * Since a system startup can extend over long periods of time (several minutes is not unusual for complex distributed applications), the method can be implemented synchronously or asynchronously. In both cases EnabledState and RequestedState reflect the current state of the application and the desired state (Enabled) respectively. The exact nature of the errors during the startup cannot be determined in the asynchronous case. The method must return one of the following values: 
     * Unspecified Error: If no return code can be identified 
     * Completed with No Error: successful invocation 
     * Start Already in Progress: application still being started 
     * Failed:Indicates errors upon execution.
     *
     */

    public StartApplicationResult invoke_StartApplication(WBEMClient cimClient)
            throws WbemsmtException {

        CIMArgument[] inParameter = new CIMArgument[0];
        CIMArgument[] outParameter = new CIMArgument[0];

        javax.cim.UnsignedInteger16 resultObject = null;

        try {
            Object oResult = cimClient.invokeMethod(this.getCimObjectPath(),
                    METHOD_STARTAPPLICATION.NAME, inParameter, outParameter);
            if (oResult != null) {

                resultObject = (javax.cim.UnsignedInteger16) oResult;
            }
        }
        catch (WBEMException e) {
            throw new InvokeMethodException(e, new InvokeMethodUserObject(this.getCimObjectPath(),
                    METHOD_STARTAPPLICATION.NAME, inParameter, outParameter));
        }

        StartApplicationResult result = new StartApplicationResult();
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
     * Result object for the method StartApplication
     */
    public static class StartApplicationResult {
        /**
         * The return value of the method
         */

        javax.cim.UnsignedInteger16 resultObject = null;

        /**
         * Default constructor
         */
        StartApplicationResult() {
        }

        /**
         * Set the return value
         * @param rc
         */
        void setResultObject(javax.cim.UnsignedInteger16 resultObject) {
            this.resultObject = resultObject;
        }

        /**
         * Get the return value of the methid
         * @return the return value
         */
        public javax.cim.UnsignedInteger16 getResultObject() {
            return this.resultObject;
        }

    }

    /**
     * Invokes the Method StopApplication
     * <br>
     * @param client the cimclient
     * StopApplication() allows for stopping/shutting down an application system. It is up to the implementation of the method to define which of the contained or dependent sub-elements are to be stopped and in which order their stop has to occur. 
     * Since a system shutdown can last considerable time (several minutes is not necessarily unusual for complex distributed applications), the method can be implemented synchronously or asynchronously. In both cases EnabledState and RequestedState reflect the current state of the application and the desired state (Disabled) respectively. The exact nature of the errors during the stop cannot be determined in the asynchronous case. The method must return one of the following: 
     * Unspecified Error: If no return code can be identified 
     * Completed with No Error: successful invocation 
     * Stop Already in Process: application is shutting down 
     * Failed: Indicates errors upon execution.
     *
     */

    public StopApplicationResult invoke_StopApplication(WBEMClient cimClient)
            throws WbemsmtException {

        CIMArgument[] inParameter = new CIMArgument[0];
        CIMArgument[] outParameter = new CIMArgument[0];

        javax.cim.UnsignedInteger16 resultObject = null;

        try {
            Object oResult = cimClient.invokeMethod(this.getCimObjectPath(),
                    METHOD_STOPAPPLICATION.NAME, inParameter, outParameter);
            if (oResult != null) {

                resultObject = (javax.cim.UnsignedInteger16) oResult;
            }
        }
        catch (WBEMException e) {
            throw new InvokeMethodException(e, new InvokeMethodUserObject(this.getCimObjectPath(),
                    METHOD_STOPAPPLICATION.NAME, inParameter, outParameter));
        }

        StopApplicationResult result = new StopApplicationResult();
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
     * Result object for the method StopApplication
     */
    public static class StopApplicationResult {
        /**
         * The return value of the method
         */

        javax.cim.UnsignedInteger16 resultObject = null;

        /**
         * Default constructor
         */
        StopApplicationResult() {
        }

        /**
         * Set the return value
         * @param rc
         */
        void setResultObject(javax.cim.UnsignedInteger16 resultObject) {
            this.resultObject = resultObject;
        }

        /**
         * Get the return value of the methid
         * @return the return value
         */
        public javax.cim.UnsignedInteger16 getResultObject() {
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
        return CIM_ApplicationSystem.CIM_CLASS_NAME;
    }

}