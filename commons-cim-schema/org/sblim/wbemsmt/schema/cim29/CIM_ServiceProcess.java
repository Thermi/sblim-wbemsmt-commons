/** 
 * CIM_ServiceProcess.java
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
 * Description: CIM_ServiceProcess is an association used to establish relationships between Services and Processes. It is used to indicate if a Service is running in a particular Process. It is also used to indicate, via the ExecutionType property, if the Service started and is wholly responsible for the Process, or if the Service is running in an existing Process, perhaps with other unrelated Services, which is owned or started by a different entity. This association relates a Service with an externally visible system signature.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_ServiceProcess extends org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco {

    public final static String CIM_CLASS_NAME = "CIM_ServiceProcess";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property ExecutionType
     * Enumeration indicating how the Service runs in the context of, or owns the Process. "Unknown" indicates that the ExecutionType is not known. "Other" indicates that the ExecutionType does not match any of the values in the ExecutionType enumeration. "Executes in Existing Process" indicates that the Service is hosted in a Process that already exists in the system. The lifecycle of the Service is separate from that of the Process. "Exeutes as Independent Process" indicates that the Service is responsible for the lifecycle of the Process. When the Service is started, the Process is created. For example, ServletEngines can run "InProcess" within the existing Apache processes or "OutOfProcess" in its own servlet engine process. In this case the Apache process would communicate with the servlet engine process based on the content of the request. The association may be many to many.
     */
    public static class PROPERTY_EXECUTIONTYPE {
        /**
         * name of the property ExecutionType
         */
        public final static String NAME = "ExecutionType";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Executes_in_Existing_Process = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Executes in Existing Process (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Executes_in_Existing_Process = "Executes in Existing Process";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Executes_as_Independent_Process = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Executes as Independent Process (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Executes_as_Independent_Process = "Executes as Independent Process";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@6bb46bb4
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Executes_in_Existing_Process.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Executes_in_Existing_Process;
            }

            if (VALUE_ENTRY_Executes_as_Independent_Process.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Executes_as_Independent_Process;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Executes_in_Existing_Process.intValue()) {
                return VALUE_ENTRY_Executes_in_Existing_Process;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Executes_as_Independent_Process
                    .intValue()) {
                return VALUE_ENTRY_Executes_as_Independent_Process;
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
         * Value Map for the property ExecutionType   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Executes_in_Existing_Process,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Executes_as_Independent_Process };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property ExecutionType   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_Executes_in_Existing_Process,
                VALUE_ENTRY_Executes_as_Independent_Process };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property ExecutionType   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_Executes_in_Existing_Process,
                VALUE_ENTRY_Executes_as_Independent_Process };

    }

    /**
     * Constants of property Service
     * 
     */
    public static class PROPERTY_SERVICE_CIM_SERVICE {
        /**
         * name of the property Service
         */
        public final static String NAME = "Service";

    }

    /**
     * Constants of property Process
     * 
     */
    public static class PROPERTY_PROCESS_CIM_PROCESS {
        /**
         * name of the property Process
         */
        public final static String NAME = "Process";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");

    };

    //**********************************************************************
    // Constructors     
    //**********************************************************************

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   CIM_ServiceProcess is an association used to establish relationships between Services and Processes. It is used to indicate if a Service is running in a particular Process. It is also used to indicate, via the ExecutionType property, if the Service started and is wholly responsible for the Process, or if the Service is running in an existing Process, perhaps with other unrelated Services, which is owned or started by a different entity. This association relates a Service with an externally visible system signature.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_ServiceProcess(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   CIM_ServiceProcess is an association used to establish relationships between Services and Processes. It is used to indicate if a Service is running in a particular Process. It is also used to indicate, via the ExecutionType property, if the Service started and is wholly responsible for the Process, or if the Service is running in an existing Process, perhaps with other unrelated Services, which is owned or started by a different entity. This association relates a Service with an externally visible system signature.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_ServiceProcess(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_ServiceProcess() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("ExecutionType", new CIMProperty("ExecutionType",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("Service", new CIMProperty("Service", new CIMDataType(
                CIM_Service.CIM_CLASS_NAME), null));
        propertiesToCheck.put("Process", new CIMProperty("Process", new CIMDataType(
                CIM_Process.CIM_CLASS_NAME), null));

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
     * Get the property ExecutionType
     *     * <br>
     * Enumeration indicating how the Service runs in the context of, or owns the Process. "Unknown" indicates that the ExecutionType is not known. "Other" indicates that the ExecutionType does not match any of the values in the ExecutionType enumeration. "Executes in Existing Process" indicates that the Service is hosted in a Process that already exists in the system. The lifecycle of the Service is separate from that of the Process. "Exeutes as Independent Process" indicates that the Service is responsible for the lifecycle of the Process. When the Service is started, the Process is created. For example, ServletEngines can run "InProcess" within the existing Apache processes or "OutOfProcess" in its own servlet engine process. In this case the Apache process would communicate with the servlet engine process based on the content of the request. The association may be many to many.
     *     */

    public javax.cim.UnsignedInteger16 get_ExecutionType() {
        CIMProperty currentProperty = getProperty(PROPERTY_EXECUTIONTYPE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_EXECUTIONTYPE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property ExecutionType
     * <br>
     * Enumeration indicating how the Service runs in the context of, or owns the Process. "Unknown" indicates that the ExecutionType is not known. "Other" indicates that the ExecutionType does not match any of the values in the ExecutionType enumeration. "Executes in Existing Process" indicates that the Service is hosted in a Process that already exists in the system. The lifecycle of the Service is separate from that of the Process. "Exeutes as Independent Process" indicates that the Service is responsible for the lifecycle of the Process. When the Service is started, the Process is created. For example, ServletEngines can run "InProcess" within the existing Apache processes or "OutOfProcess" in its own servlet engine process. In this case the Apache process would communicate with the servlet engine process based on the content of the request. The association may be many to many.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ExecutionType(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_EXECUTIONTYPE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ExecutionType(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_EXECUTIONTYPE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ExecutionType by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ExecutionType(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_ServiceProcess fco = new CIM_ServiceProcess(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_EXECUTIONTYPE.NAME);
        if (property != null) {
            property = setPropertyValue_ExecutionType(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_EXECUTIONTYPE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ExecutionType
     * <br>
     * Enumeration indicating how the Service runs in the context of, or owns the Process. "Unknown" indicates that the ExecutionType is not known. "Other" indicates that the ExecutionType does not match any of the values in the ExecutionType enumeration. "Executes in Existing Process" indicates that the Service is hosted in a Process that already exists in the system. The lifecycle of the Service is separate from that of the Process. "Exeutes as Independent Process" indicates that the Service is responsible for the lifecycle of the Process. When the Service is started, the Process is created. For example, ServletEngines can run "InProcess" within the existing Apache processes or "OutOfProcess" in its own servlet engine process. In this case the Apache process would communicate with the servlet engine process based on the content of the request. The association may be many to many.
     */

    private static CIMProperty setPropertyValue_ExecutionType(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Service
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_Service get_Service_CIM_Service(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_SERVICE_CIM_SERVICE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SERVICE_CIM_SERVICE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_ServiceHelper.getInstance(client, (CIMObjectPath) currentProperty.getValue());

    }

    /**
     * Set the property Service
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Service_CIM_Service(CIM_Service newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SERVICE_CIM_SERVICE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Service_CIM_Service(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SERVICE_CIM_SERVICE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Service by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Service_CIM_Service(WBEMClient client, String namespace,
            CIM_Service newValue) throws WbemsmtException {
        CIM_ServiceProcess fco = new CIM_ServiceProcess(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SERVICE_CIM_SERVICE.NAME);
        if (property != null) {
            property = setPropertyValue_Service_CIM_Service(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SERVICE_CIM_SERVICE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Service
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_Service_CIM_Service(CIMProperty currentProperty,
            CIM_Service newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getCimObjectPath() : null;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Process
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_Process get_Process_CIM_Process(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_PROCESS_CIM_PROCESS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PROCESS_CIM_PROCESS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_ProcessHelper.getInstance(client, (CIMObjectPath) currentProperty.getValue());

    }

    /**
     * Set the property Process
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Process_CIM_Process(CIM_Process newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PROCESS_CIM_PROCESS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Process_CIM_Process(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PROCESS_CIM_PROCESS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Process by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Process_CIM_Process(WBEMClient client, String namespace,
            CIM_Process newValue) throws WbemsmtException {
        CIM_ServiceProcess fco = new CIM_ServiceProcess(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PROCESS_CIM_PROCESS.NAME);
        if (property != null) {
            property = setPropertyValue_Process_CIM_Process(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PROCESS_CIM_PROCESS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Process
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_Process_CIM_Process(CIMProperty currentProperty,
            CIM_Process newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getCimObjectPath() : null;

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
     * returns true if the objects are the same
     * 
     * @return
     * @see org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco\#equals(Object)
     */
    public boolean equals(Object object) {
        if (!(object instanceof CIM_ServiceProcess)) {
            return false;
        }

        return super.equals(object);
    }

    /**
     * return the name of the CIMClass
     * @return
     */
    public String getObjectName() {
        return CIM_ServiceProcess.CIM_CLASS_NAME;
    }

}