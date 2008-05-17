/** 
 * CIM_UnixThread.java
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
 * Description: Threads represent the ability to execute units of a Process or task in parallel. A UnixThread inherits from the superclass, CIM_Thread, which is weak to the Process. The values used are defined in sched.h and psched.h.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_UnixThread extends CIM_Thread {

    public final static String CIM_CLASS_NAME = "CIM_UnixThread";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property CancelState
     * Indicates the thread's cancelability state.
     */
    public static class PROPERTY_CANCELSTATE {
        /**
         * name of the property CancelState
         */
        public final static String NAME = "CancelState";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_PTHREAD_CANCEL_ENABLE = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry PTHREAD_CANCEL_ENABLE (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_PTHREAD_CANCEL_ENABLE = "PTHREAD_CANCEL_ENABLE";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_PTHREAD_CANCEL_DISABLE = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry PTHREAD_CANCEL_DISABLE (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_PTHREAD_CANCEL_DISABLE = "PTHREAD_CANCEL_DISABLE";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@50c850c8
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_PTHREAD_CANCEL_ENABLE.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_PTHREAD_CANCEL_ENABLE;
            }

            if (VALUE_ENTRY_PTHREAD_CANCEL_DISABLE.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_PTHREAD_CANCEL_DISABLE;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_PTHREAD_CANCEL_ENABLE.intValue()) {
                return VALUE_ENTRY_PTHREAD_CANCEL_ENABLE;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_PTHREAD_CANCEL_DISABLE.intValue()) {
                return VALUE_ENTRY_PTHREAD_CANCEL_DISABLE;
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
         * Value Map for the property CancelState   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_PTHREAD_CANCEL_ENABLE,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_PTHREAD_CANCEL_DISABLE };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property CancelState   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_PTHREAD_CANCEL_ENABLE, VALUE_ENTRY_PTHREAD_CANCEL_DISABLE };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property CancelState   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_PTHREAD_CANCEL_ENABLE, VALUE_ENTRY_PTHREAD_CANCEL_DISABLE };

    }

    /**
     * Constants of property CancelType
     * Indicates the thread's cancelability type.
     */
    public static class PROPERTY_CANCELTYPE {
        /**
         * name of the property CancelType
         */
        public final static String NAME = "CancelType";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_PTHREAD_CANCEL_DEFERRED = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry PTHREAD_CANCEL_DEFERRED (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_PTHREAD_CANCEL_DEFERRED = "PTHREAD_CANCEL_DEFERRED";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_PTHREAD_CANCEL_ASYNCHRONOUS = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry PTHREAD_CANCEL_ASYNCHRONOUS (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_PTHREAD_CANCEL_ASYNCHRONOUS = "PTHREAD_CANCEL_ASYNCHRONOUS";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@76b476b4
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_PTHREAD_CANCEL_DEFERRED.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_PTHREAD_CANCEL_DEFERRED;
            }

            if (VALUE_ENTRY_PTHREAD_CANCEL_ASYNCHRONOUS.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_PTHREAD_CANCEL_ASYNCHRONOUS;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_PTHREAD_CANCEL_DEFERRED.intValue()) {
                return VALUE_ENTRY_PTHREAD_CANCEL_DEFERRED;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_PTHREAD_CANCEL_ASYNCHRONOUS.intValue()) {
                return VALUE_ENTRY_PTHREAD_CANCEL_ASYNCHRONOUS;
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
         * Value Map for the property CancelType   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_PTHREAD_CANCEL_DEFERRED,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_PTHREAD_CANCEL_ASYNCHRONOUS };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property CancelType   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_PTHREAD_CANCEL_DEFERRED, VALUE_ENTRY_PTHREAD_CANCEL_ASYNCHRONOUS };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property CancelType   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_PTHREAD_CANCEL_DEFERRED, VALUE_ENTRY_PTHREAD_CANCEL_ASYNCHRONOUS };

    }

    /**
     * Constants of property ConcurrencyLevel
     * Indicates the thread's concurrency level.
     */
    public static class PROPERTY_CONCURRENCYLEVEL {
        /**
         * name of the property ConcurrencyLevel
         */
        public final static String NAME = "ConcurrencyLevel";

    }

    /**
     * Constants of property ContentionScope
     * Indicates the contention scope of the thread.
     */
    public static class PROPERTY_CONTENTIONSCOPE {
        /**
         * name of the property ContentionScope
         */
        public final static String NAME = "ContentionScope";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_PTHREAD_SCOPE_SYSTEM = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry PTHREAD_SCOPE_SYSTEM (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_PTHREAD_SCOPE_SYSTEM = "PTHREAD_SCOPE_SYSTEM";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_PTHREAD_SCOPE_PROCESS = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry PTHREAD_SCOPE_PROCESS (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_PTHREAD_SCOPE_PROCESS = "PTHREAD_SCOPE_PROCESS";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@15381538
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_PTHREAD_SCOPE_SYSTEM.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_PTHREAD_SCOPE_SYSTEM;
            }

            if (VALUE_ENTRY_PTHREAD_SCOPE_PROCESS.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_PTHREAD_SCOPE_PROCESS;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_PTHREAD_SCOPE_SYSTEM.intValue()) {
                return VALUE_ENTRY_PTHREAD_SCOPE_SYSTEM;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_PTHREAD_SCOPE_PROCESS.intValue()) {
                return VALUE_ENTRY_PTHREAD_SCOPE_PROCESS;
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
         * Value Map for the property ContentionScope   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_PTHREAD_SCOPE_SYSTEM,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_PTHREAD_SCOPE_PROCESS };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property ContentionScope   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_PTHREAD_SCOPE_SYSTEM, VALUE_ENTRY_PTHREAD_SCOPE_PROCESS };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property ContentionScope   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_PTHREAD_SCOPE_SYSTEM, VALUE_ENTRY_PTHREAD_SCOPE_PROCESS };

    }

    /**
     * Constants of property DetachState
     * Indicates the creation state of the thread.
     */
    public static class PROPERTY_DETACHSTATE {
        /**
         * name of the property DetachState
         */
        public final static String NAME = "DetachState";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_PTHREAD_CREATE_DETACHED = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry PTHREAD_CREATE_DETACHED (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_PTHREAD_CREATE_DETACHED = "PTHREAD_CREATE_DETACHED";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_PTHREAD_CREATE_JOINABLE = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry PTHREAD_CREATE_JOINABLE (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_PTHREAD_CREATE_JOINABLE = "PTHREAD_CREATE_JOINABLE";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@7d287d28
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_PTHREAD_CREATE_DETACHED.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_PTHREAD_CREATE_DETACHED;
            }

            if (VALUE_ENTRY_PTHREAD_CREATE_JOINABLE.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_PTHREAD_CREATE_JOINABLE;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_PTHREAD_CREATE_DETACHED.intValue()) {
                return VALUE_ENTRY_PTHREAD_CREATE_DETACHED;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_PTHREAD_CREATE_JOINABLE.intValue()) {
                return VALUE_ENTRY_PTHREAD_CREATE_JOINABLE;
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
         * Value Map for the property DetachState   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_PTHREAD_CREATE_DETACHED,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_PTHREAD_CREATE_JOINABLE };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property DetachState   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_PTHREAD_CREATE_DETACHED, VALUE_ENTRY_PTHREAD_CREATE_JOINABLE };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property DetachState   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_PTHREAD_CREATE_DETACHED, VALUE_ENTRY_PTHREAD_CREATE_JOINABLE };

    }

    /**
     * Constants of property GuardSize
     * Indicates the size of the guard area for a created thread's stack.
     */
    public static class PROPERTY_GUARDSIZE {
        /**
         * name of the property GuardSize
         */
        public final static String NAME = "GuardSize";

    }

    /**
     * Constants of property InheritSched
     * Indicates how the scheduling attributes are to be set.
     */
    public static class PROPERTY_INHERITSCHED {
        /**
         * name of the property InheritSched
         */
        public final static String NAME = "InheritSched";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_PTHREAD_INHERIT_SCHED = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry PTHREAD_INHERIT_SCHED (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_PTHREAD_INHERIT_SCHED = "PTHREAD_INHERIT_SCHED";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_PTHREAD_EXPLICIT_SCHED = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry PTHREAD_EXPLICIT_SCHED (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_PTHREAD_EXPLICIT_SCHED = "PTHREAD_EXPLICIT_SCHED";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@50125012
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_PTHREAD_INHERIT_SCHED.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_PTHREAD_INHERIT_SCHED;
            }

            if (VALUE_ENTRY_PTHREAD_EXPLICIT_SCHED.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_PTHREAD_EXPLICIT_SCHED;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_PTHREAD_INHERIT_SCHED.intValue()) {
                return VALUE_ENTRY_PTHREAD_INHERIT_SCHED;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_PTHREAD_EXPLICIT_SCHED.intValue()) {
                return VALUE_ENTRY_PTHREAD_EXPLICIT_SCHED;
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
         * Value Map for the property InheritSched   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_PTHREAD_INHERIT_SCHED,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_PTHREAD_EXPLICIT_SCHED };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property InheritSched   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_PTHREAD_INHERIT_SCHED, VALUE_ENTRY_PTHREAD_EXPLICIT_SCHED };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property InheritSched   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_PTHREAD_INHERIT_SCHED, VALUE_ENTRY_PTHREAD_EXPLICIT_SCHED };

    }

    /**
     * Constants of property OtherSchedPolicy
     * Indicates the thread's scheduling policy when SchedPolicy is set to "Other".
     */
    public static class PROPERTY_OTHERSCHEDPOLICY {
        /**
         * name of the property OtherSchedPolicy
         */
        public final static String NAME = "OtherSchedPolicy";

    }

    /**
     * Constants of property SchedPolicy
     * Indicates the thread's scheduling policy. Set to "Other" when using OtherSchedPolicy to specifiy additional values. "Other" represents SCHED_OTHER as defined in sched.h.
     */
    public static class PROPERTY_SCHEDPOLICY {
        /**
         * name of the property SchedPolicy
         */
        public final static String NAME = "SchedPolicy";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_SCHED_FIFO = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry SCHED_FIFO (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_SCHED_FIFO = "SCHED_FIFO";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_SCHED_RR = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry SCHED_RR (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_SCHED_RR = "SCHED_RR";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@3aae3aae
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_SCHED_FIFO.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_SCHED_FIFO;
            }

            if (VALUE_ENTRY_SCHED_RR.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_SCHED_RR;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_SCHED_FIFO.intValue()) {
                return VALUE_ENTRY_SCHED_FIFO;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_SCHED_RR.intValue()) {
                return VALUE_ENTRY_SCHED_RR;
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
         * Value Map for the property SchedPolicy   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_SCHED_FIFO,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_SCHED_RR };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property SchedPolicy   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_SCHED_FIFO, VALUE_ENTRY_SCHED_RR };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property SchedPolicy   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_SCHED_FIFO, VALUE_ENTRY_SCHED_RR };

    }

    /**
     * Constants of property StackSize
     * Indicates the size of storage to be used for the thread's stack.
     */
    public static class PROPERTY_STACKSIZE {
        /**
         * name of the property StackSize
         */
        public final static String NAME = "StackSize";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_Thread.getPackages();

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
     *   Threads represent the ability to execute units of a Process or task in parallel. A UnixThread inherits from the superclass, CIM_Thread, which is weak to the Process. The values used are defined in sched.h and psched.h.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_UnixThread(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   Threads represent the ability to execute units of a Process or task in parallel. A UnixThread inherits from the superclass, CIM_Thread, which is weak to the Process. The values used are defined in sched.h and psched.h.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_UnixThread(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_UnixThread() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("CancelState", new CIMProperty("CancelState", CIMDataType.UINT16_T,
                null));
        propertiesToCheck.put("CancelType", new CIMProperty("CancelType", CIMDataType.UINT16_T,
                null));
        propertiesToCheck.put("ConcurrencyLevel", new CIMProperty("ConcurrencyLevel",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("ContentionScope", new CIMProperty("ContentionScope",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("DetachState", new CIMProperty("DetachState", CIMDataType.UINT16_T,
                null));
        propertiesToCheck
                .put("GuardSize", new CIMProperty("GuardSize", CIMDataType.STRING_T, null));
        propertiesToCheck.put("InheritSched", new CIMProperty("InheritSched", CIMDataType.UINT16_T,
                null));
        propertiesToCheck.put("OtherSchedPolicy", new CIMProperty("OtherSchedPolicy",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("SchedPolicy", new CIMProperty("SchedPolicy", CIMDataType.UINT16_T,
                null));
        propertiesToCheck
                .put("StackSize", new CIMProperty("StackSize", CIMDataType.STRING_T, null));

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
     * Get the property CancelState
     *     * <br>
     * Indicates the thread's cancelability state.
     *     */

    public javax.cim.UnsignedInteger16 get_CancelState() {
        CIMProperty currentProperty = getProperty(PROPERTY_CANCELSTATE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CANCELSTATE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property CancelState
     * <br>
     * Indicates the thread's cancelability state.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_CancelState(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CANCELSTATE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_CancelState(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CANCELSTATE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property CancelState by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_CancelState(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_UnixThread fco = new CIM_UnixThread(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CANCELSTATE.NAME);
        if (property != null) {
            property = setPropertyValue_CancelState(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CANCELSTATE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property CancelState
     * <br>
     * Indicates the thread's cancelability state.
     */

    private static CIMProperty setPropertyValue_CancelState(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property CancelType
     *     * <br>
     * Indicates the thread's cancelability type.
     *     */

    public javax.cim.UnsignedInteger16 get_CancelType() {
        CIMProperty currentProperty = getProperty(PROPERTY_CANCELTYPE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CANCELTYPE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property CancelType
     * <br>
     * Indicates the thread's cancelability type.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_CancelType(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CANCELTYPE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_CancelType(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CANCELTYPE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property CancelType by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_CancelType(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_UnixThread fco = new CIM_UnixThread(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CANCELTYPE.NAME);
        if (property != null) {
            property = setPropertyValue_CancelType(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CANCELTYPE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property CancelType
     * <br>
     * Indicates the thread's cancelability type.
     */

    private static CIMProperty setPropertyValue_CancelType(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ConcurrencyLevel
     *     * <br>
     * Indicates the thread's concurrency level.
     *     */

    public javax.cim.UnsignedInteger64 get_ConcurrencyLevel() {
        CIMProperty currentProperty = getProperty(PROPERTY_CONCURRENCYLEVEL.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CONCURRENCYLEVEL.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property ConcurrencyLevel
     * <br>
     * Indicates the thread's concurrency level.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ConcurrencyLevel(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CONCURRENCYLEVEL.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ConcurrencyLevel(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CONCURRENCYLEVEL.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ConcurrencyLevel by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ConcurrencyLevel(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_UnixThread fco = new CIM_UnixThread(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CONCURRENCYLEVEL.NAME);
        if (property != null) {
            property = setPropertyValue_ConcurrencyLevel(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CONCURRENCYLEVEL.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ConcurrencyLevel
     * <br>
     * Indicates the thread's concurrency level.
     */

    private static CIMProperty setPropertyValue_ConcurrencyLevel(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ContentionScope
     *     * <br>
     * Indicates the contention scope of the thread.
     *     */

    public javax.cim.UnsignedInteger16 get_ContentionScope() {
        CIMProperty currentProperty = getProperty(PROPERTY_CONTENTIONSCOPE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CONTENTIONSCOPE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property ContentionScope
     * <br>
     * Indicates the contention scope of the thread.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ContentionScope(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CONTENTIONSCOPE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ContentionScope(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CONTENTIONSCOPE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ContentionScope by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ContentionScope(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_UnixThread fco = new CIM_UnixThread(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CONTENTIONSCOPE.NAME);
        if (property != null) {
            property = setPropertyValue_ContentionScope(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CONTENTIONSCOPE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ContentionScope
     * <br>
     * Indicates the contention scope of the thread.
     */

    private static CIMProperty setPropertyValue_ContentionScope(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property DetachState
     *     * <br>
     * Indicates the creation state of the thread.
     *     */

    public javax.cim.UnsignedInteger16 get_DetachState() {
        CIMProperty currentProperty = getProperty(PROPERTY_DETACHSTATE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_DETACHSTATE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property DetachState
     * <br>
     * Indicates the creation state of the thread.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_DetachState(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_DETACHSTATE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_DetachState(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_DETACHSTATE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property DetachState by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_DetachState(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_UnixThread fco = new CIM_UnixThread(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_DETACHSTATE.NAME);
        if (property != null) {
            property = setPropertyValue_DetachState(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_DETACHSTATE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property DetachState
     * <br>
     * Indicates the creation state of the thread.
     */

    private static CIMProperty setPropertyValue_DetachState(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property GuardSize
     *     * <br>
     * Indicates the size of the guard area for a created thread's stack.
     *     */

    public String get_GuardSize() {
        CIMProperty currentProperty = getProperty(PROPERTY_GUARDSIZE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_GUARDSIZE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property GuardSize
     * <br>
     * Indicates the size of the guard area for a created thread's stack.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_GuardSize(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_GUARDSIZE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_GuardSize(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_GUARDSIZE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property GuardSize by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_GuardSize(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_UnixThread fco = new CIM_UnixThread(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_GUARDSIZE.NAME);
        if (property != null) {
            property = setPropertyValue_GuardSize(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_GUARDSIZE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property GuardSize
     * <br>
     * Indicates the size of the guard area for a created thread's stack.
     */

    private static CIMProperty setPropertyValue_GuardSize(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property InheritSched
     *     * <br>
     * Indicates how the scheduling attributes are to be set.
     *     */

    public javax.cim.UnsignedInteger16 get_InheritSched() {
        CIMProperty currentProperty = getProperty(PROPERTY_INHERITSCHED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_INHERITSCHED.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property InheritSched
     * <br>
     * Indicates how the scheduling attributes are to be set.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_InheritSched(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_INHERITSCHED.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_InheritSched(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_INHERITSCHED.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property InheritSched by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_InheritSched(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_UnixThread fco = new CIM_UnixThread(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_INHERITSCHED.NAME);
        if (property != null) {
            property = setPropertyValue_InheritSched(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_INHERITSCHED.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property InheritSched
     * <br>
     * Indicates how the scheduling attributes are to be set.
     */

    private static CIMProperty setPropertyValue_InheritSched(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OtherSchedPolicy
     *     * <br>
     * Indicates the thread's scheduling policy when SchedPolicy is set to "Other".
     *     */

    public String get_OtherSchedPolicy() {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERSCHEDPOLICY.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OTHERSCHEDPOLICY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property OtherSchedPolicy
     * <br>
     * Indicates the thread's scheduling policy when SchedPolicy is set to "Other".
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OtherSchedPolicy(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERSCHEDPOLICY.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_OtherSchedPolicy(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERSCHEDPOLICY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OtherSchedPolicy by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherSchedPolicy(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_UnixThread fco = new CIM_UnixThread(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OTHERSCHEDPOLICY.NAME);
        if (property != null) {
            property = setPropertyValue_OtherSchedPolicy(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERSCHEDPOLICY.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OtherSchedPolicy
     * <br>
     * Indicates the thread's scheduling policy when SchedPolicy is set to "Other".
     */

    private static CIMProperty setPropertyValue_OtherSchedPolicy(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property SchedPolicy
     *     * <br>
     * Indicates the thread's scheduling policy. Set to "Other" when using OtherSchedPolicy to specifiy additional values. "Other" represents SCHED_OTHER as defined in sched.h.
     *     */

    public javax.cim.UnsignedInteger16 get_SchedPolicy() {
        CIMProperty currentProperty = getProperty(PROPERTY_SCHEDPOLICY.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SCHEDPOLICY.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property SchedPolicy
     * <br>
     * Indicates the thread's scheduling policy. Set to "Other" when using OtherSchedPolicy to specifiy additional values. "Other" represents SCHED_OTHER as defined in sched.h.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_SchedPolicy(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SCHEDPOLICY.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_SchedPolicy(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SCHEDPOLICY.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SchedPolicy by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SchedPolicy(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_UnixThread fco = new CIM_UnixThread(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SCHEDPOLICY.NAME);
        if (property != null) {
            property = setPropertyValue_SchedPolicy(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SCHEDPOLICY.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SchedPolicy
     * <br>
     * Indicates the thread's scheduling policy. Set to "Other" when using OtherSchedPolicy to specifiy additional values. "Other" represents SCHED_OTHER as defined in sched.h.
     */

    private static CIMProperty setPropertyValue_SchedPolicy(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property StackSize
     *     * <br>
     * Indicates the size of storage to be used for the thread's stack.
     *     */

    public String get_StackSize() {
        CIMProperty currentProperty = getProperty(PROPERTY_STACKSIZE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_STACKSIZE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property StackSize
     * <br>
     * Indicates the size of storage to be used for the thread's stack.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_StackSize(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_STACKSIZE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_StackSize(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_STACKSIZE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property StackSize by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_StackSize(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_UnixThread fco = new CIM_UnixThread(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_STACKSIZE.NAME);
        if (property != null) {
            property = setPropertyValue_StackSize(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_STACKSIZE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property StackSize
     * <br>
     * Indicates the size of storage to be used for the thread's stack.
     */

    private static CIMProperty setPropertyValue_StackSize(CIMProperty currentProperty,
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
        return CIM_UnixThread.CIM_CLASS_NAME;
    }

}