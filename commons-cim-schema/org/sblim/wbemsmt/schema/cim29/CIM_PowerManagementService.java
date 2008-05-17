/** 
 * CIM_PowerManagementService.java
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
 * Description: A class derived from Service that describes power management functionality, hosted on a System. The fact that this service may be used to affect the power state of a particular element is defined by the CIM_ServiceAvailable ToElement association.
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

public class CIM_PowerManagementService extends CIM_Service {

    public final static String CIM_CLASS_NAME = "CIM_PowerManagementService";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constant for method\'s name and parameters
     * SetPowerState defines the desired power state of the managed element, and when the element should be put into that state. The SetPowerState method has three input parameters, no output parameters, and a result. 
     * - PowerState indicates the desired power state. 
     * - ManagedElement indicates the element whose state is set. This element SHOULD be associated to the service using the ServiceAvailableToElement relationship. 
     * - Time indicates when the power state should be set, either as a regular date-time value or as an interval value (where the interval begins when the method invocation is received). 
     * Note that when the PowerState parameter is equal to 5, "Power Cycle", the Time parameter indicates when the managed element should powered on again. Power off is immediate. 
     * SetPowerState should return 0 if successful, 1 if the specified State and Time request is not supported for the element, and some other value if any other error occurred. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
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

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Power_Save___Other = new javax.cim.UnsignedInteger16(
                    "4");

            /**
             * constant for value entry Power Save - Other (corresponds to mapEntry 4 )
             */
            public final static String VALUE_ENTRY_Power_Save___Other = "Power Save - Other";

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

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Hibernate = new javax.cim.UnsignedInteger16(
                    "7");

            /**
             * constant for value entry Hibernate (corresponds to mapEntry 7 )
             */
            public final static String VALUE_ENTRY_Hibernate = "Hibernate";

            /**
             * constant for value map entry 8
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Soft_Off = new javax.cim.UnsignedInteger16(
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
            //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@6fae6fae
            public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

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
            public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
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
         * constants for parameter ManagedElement
         */
        public static class PARAMETER_MANAGEDELEMENT {
            /*
             * Name of the parameter ManagedElement
             */
            public final static String NAME = "ManagedElement";

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

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_Service.getPackages();

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
     *   A class derived from Service that describes power management functionality, hosted on a System. The fact that this service may be used to affect the power state of a particular element is defined by the CIM_ServiceAvailable ToElement association.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_PowerManagementService(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   A class derived from Service that describes power management functionality, hosted on a System. The fact that this service may be used to affect the power state of a particular element is defined by the CIM_ServiceAvailable ToElement association.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_PowerManagementService(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_PowerManagementService() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {

        super.init(cimInstance, overwrite);

        //currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient
        //we overwrite the dataType by setting null for every embeddedObject/Instance property
        if (overwrite) {

        }
    }

    //**********************************************************************
    // Properties get/set     
    //**********************************************************************

    //**********************************************************************
    // Associators methods     
    //**********************************************************************

    //**********************************************************************
    // Extrinsic Method invocations     
    //**********************************************************************                         

    /**
     * Invokes the Method SetPowerState
     * <br>
     * @param client the cimclient
     * SetPowerState defines the desired power state of the managed element, and when the element should be put into that state. The SetPowerState method has three input parameters, no output parameters, and a result. 
     * - PowerState indicates the desired power state. 
     * - ManagedElement indicates the element whose state is set. This element SHOULD be associated to the service using the ServiceAvailableToElement relationship. 
     * - Time indicates when the power state should be set, either as a regular date-time value or as an interval value (where the interval begins when the method invocation is received). 
     * Note that when the PowerState parameter is equal to 5, "Power Cycle", the Time parameter indicates when the managed element should powered on again. Power off is immediate. 
     * SetPowerState should return 0 if successful, 1 if the specified State and Time request is not supported for the element, and some other value if any other error occurred. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
     *   @param PowerState The power state for ManagedElement.
     *   @param ManagedElement ManagedElement indicates the element whose state is set.
     *   @param Time Time indicates when the power state should be set, either as a regular date-time value or as an interval value (where the interval begins when the method invocation is received.
     *
     */

    public SetPowerStateResult invoke_SetPowerState(WBEMClient cimClient,
            javax.cim.UnsignedInteger16 PowerState, CIM_ManagedElement ManagedElement,
            javax.cim.CIMDateTime Time) throws WbemsmtException {

        CIMArgument[] inParameter = new CIMArgument[3];
        CIMArgument[] outParameter = new CIMArgument[0];

        inParameter[0] = new CIMArgument("PowerState", CIMDataType.UINT16_T, PowerState);
        inParameter[1] = new CIMArgument("ManagedElement", new CIMDataType(
                CIM_ManagedElement.CIM_CLASS_NAME), ManagedElement);
        inParameter[2] = new CIMArgument("Time", CIMDataType.DATETIME_T, Time);

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
        return CIM_PowerManagementService.CIM_CLASS_NAME;
    }

}