/** 
 * CIM_ServiceServiceDependency.java
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
 * Description: CIM_ServiceServiceDependency is an association between a Service and another Service, indicating that the latter is required to be present, required to have completed, or must be absent for the former Service to provide its functionality. For example, Boot Services may be dependent upon underlying system initialization Services. In the case of the initialization Services, the Boot Service may be dependent on the init Services completing. 
 * Examining the ServiceServiceDependency class definition, note that its superclass ProvidesServiceToElement is deprecated. Unfortunately, ProvidesServiceToElement cannot be removed from the object hierarchy without a major Schema release. When/if this occurs, the ProvidesServiceToElement superclass will be removed, and ServiceServiceDependency will subclass from CIM_Dependency directly.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_ServiceServiceDependency extends CIM_ProvidesServiceToElement {

    public final static String CIM_CLASS_NAME = "CIM_ServiceServiceDependency";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property RestartService
     * This property describes that the Antecedent Service must be restarted after the Dependent operation is complete.
     */
    public static class PROPERTY_RESTARTSERVICE {
        /**
         * name of the property RestartService
         */
        public final static String NAME = "RestartService";

    }

    /**
     * Constants of property TypeOfDependency
     * The nature of the Service to Service dependency. This property describes that the associated Service must have completed (value=2), must be started (3) or must not be started (4) in order for the Service to function.
     */
    public static class PROPERTY_TYPEOFDEPENDENCY {
        /**
         * name of the property TypeOfDependency
         */
        public final static String NAME = "TypeOfDependency";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Service_Must_Have_Completed = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Service Must Have Completed (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Service_Must_Have_Completed = "Service Must Have Completed";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Service_Must_Be_Started = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Service Must Be Started (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Service_Must_Be_Started = "Service Must Be Started";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Service_Must_Not_Be_Started = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Service Must Not Be Started (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Service_Must_Not_Be_Started = "Service Must Not Be Started";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@cf40cf4
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Service_Must_Have_Completed.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Service_Must_Have_Completed;
            }

            if (VALUE_ENTRY_Service_Must_Be_Started.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Service_Must_Be_Started;
            }

            if (VALUE_ENTRY_Service_Must_Not_Be_Started.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Service_Must_Not_Be_Started;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Service_Must_Have_Completed.intValue()) {
                return VALUE_ENTRY_Service_Must_Have_Completed;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Service_Must_Be_Started.intValue()) {
                return VALUE_ENTRY_Service_Must_Be_Started;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Service_Must_Not_Be_Started.intValue()) {
                return VALUE_ENTRY_Service_Must_Not_Be_Started;
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
         * Value Map for the property TypeOfDependency   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Service_Must_Have_Completed,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Service_Must_Be_Started,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Service_Must_Not_Be_Started };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property TypeOfDependency   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_Service_Must_Have_Completed, VALUE_ENTRY_Service_Must_Be_Started,
                VALUE_ENTRY_Service_Must_Not_Be_Started };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property TypeOfDependency   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_Service_Must_Have_Completed,
                VALUE_ENTRY_Service_Must_Be_Started, VALUE_ENTRY_Service_Must_Not_Be_Started };

    }

    /**
     * Constants of property Antecedent
     * 
     */
    public static class PROPERTY_ANTECEDENT_CIM_SERVICE {
        /**
         * name of the property Antecedent
         */
        public final static String NAME = "Antecedent";

    }

    /**
     * Constants of property Dependent
     * 
     */
    public static class PROPERTY_DEPENDENT_CIM_SERVICE {
        /**
         * name of the property Dependent
         */
        public final static String NAME = "Dependent";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_ProvidesServiceToElement.getPackages();

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
     *   CIM_ServiceServiceDependency is an association between a Service and another Service, indicating that the latter is required to be present, required to have completed, or must be absent for the former Service to provide its functionality. For example, Boot Services may be dependent upon underlying system initialization Services. In the case of the initialization Services, the Boot Service may be dependent on the init Services completing. 
     * Examining the ServiceServiceDependency class definition, note that its superclass ProvidesServiceToElement is deprecated. Unfortunately, ProvidesServiceToElement cannot be removed from the object hierarchy without a major Schema release. When/if this occurs, the ProvidesServiceToElement superclass will be removed, and ServiceServiceDependency will subclass from CIM_Dependency directly.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_ServiceServiceDependency(WBEMClient client, String namespace)
            throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   CIM_ServiceServiceDependency is an association between a Service and another Service, indicating that the latter is required to be present, required to have completed, or must be absent for the former Service to provide its functionality. For example, Boot Services may be dependent upon underlying system initialization Services. In the case of the initialization Services, the Boot Service may be dependent on the init Services completing. 
     * Examining the ServiceServiceDependency class definition, note that its superclass ProvidesServiceToElement is deprecated. Unfortunately, ProvidesServiceToElement cannot be removed from the object hierarchy without a major Schema release. When/if this occurs, the ProvidesServiceToElement superclass will be removed, and ServiceServiceDependency will subclass from CIM_Dependency directly.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_ServiceServiceDependency(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_ServiceServiceDependency() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("RestartService", new CIMProperty("RestartService",
                CIMDataType.BOOLEAN_T, null));
        propertiesToCheck.put("TypeOfDependency", new CIMProperty("TypeOfDependency",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("Antecedent", new CIMProperty("Antecedent", new CIMDataType(
                CIM_Service.CIM_CLASS_NAME), null));
        propertiesToCheck.put("Dependent", new CIMProperty("Dependent", new CIMDataType(
                CIM_Service.CIM_CLASS_NAME), null));

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
     * Get the property RestartService
     *     * <br>
     * This property describes that the Antecedent Service must be restarted after the Dependent operation is complete.
     *     */

    public Boolean get_RestartService() {
        CIMProperty currentProperty = getProperty(PROPERTY_RESTARTSERVICE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_RESTARTSERVICE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property RestartService
     * <br>
     * This property describes that the Antecedent Service must be restarted after the Dependent operation is complete.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_RestartService(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_RESTARTSERVICE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_RestartService(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_RESTARTSERVICE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property RestartService by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_RestartService(WBEMClient client, String namespace,
            Boolean newValue) throws WbemsmtException {
        CIM_ServiceServiceDependency fco = new CIM_ServiceServiceDependency(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_RESTARTSERVICE.NAME);
        if (property != null) {
            property = setPropertyValue_RestartService(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_RESTARTSERVICE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property RestartService
     * <br>
     * This property describes that the Antecedent Service must be restarted after the Dependent operation is complete.
     */

    private static CIMProperty setPropertyValue_RestartService(CIMProperty currentProperty,
            Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property TypeOfDependency
     *     * <br>
     * The nature of the Service to Service dependency. This property describes that the associated Service must have completed (value=2), must be started (3) or must not be started (4) in order for the Service to function.
     *     */

    public javax.cim.UnsignedInteger16 get_TypeOfDependency() {
        CIMProperty currentProperty = getProperty(PROPERTY_TYPEOFDEPENDENCY.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_TYPEOFDEPENDENCY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property TypeOfDependency
     * <br>
     * The nature of the Service to Service dependency. This property describes that the associated Service must have completed (value=2), must be started (3) or must not be started (4) in order for the Service to function.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_TypeOfDependency(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_TYPEOFDEPENDENCY.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_TypeOfDependency(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_TYPEOFDEPENDENCY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property TypeOfDependency by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_TypeOfDependency(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_ServiceServiceDependency fco = new CIM_ServiceServiceDependency(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_TYPEOFDEPENDENCY.NAME);
        if (property != null) {
            property = setPropertyValue_TypeOfDependency(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_TYPEOFDEPENDENCY.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property TypeOfDependency
     * <br>
     * The nature of the Service to Service dependency. This property describes that the associated Service must have completed (value=2), must be started (3) or must not be started (4) in order for the Service to function.
     */

    private static CIMProperty setPropertyValue_TypeOfDependency(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Antecedent
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_Service get_Antecedent_CIM_Service(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_ANTECEDENT_CIM_SERVICE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ANTECEDENT_CIM_SERVICE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_ServiceHelper.getInstance(client, (CIMObjectPath) currentProperty.getValue());

    }

    /**
     * Set the property Antecedent
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Antecedent_CIM_Service(CIM_Service newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ANTECEDENT_CIM_SERVICE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Antecedent_CIM_Service(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ANTECEDENT_CIM_SERVICE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Antecedent by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Antecedent_CIM_Service(WBEMClient client, String namespace,
            CIM_Service newValue) throws WbemsmtException {
        CIM_ServiceServiceDependency fco = new CIM_ServiceServiceDependency(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ANTECEDENT_CIM_SERVICE.NAME);
        if (property != null) {
            property = setPropertyValue_Antecedent_CIM_Service(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ANTECEDENT_CIM_SERVICE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Antecedent
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_Antecedent_CIM_Service(CIMProperty currentProperty,
            CIM_Service newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getCimObjectPath() : null;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Dependent
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_Service get_Dependent_CIM_Service(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_DEPENDENT_CIM_SERVICE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_DEPENDENT_CIM_SERVICE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_ServiceHelper.getInstance(client, (CIMObjectPath) currentProperty.getValue());

    }

    /**
     * Set the property Dependent
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Dependent_CIM_Service(CIM_Service newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_DEPENDENT_CIM_SERVICE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Dependent_CIM_Service(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_DEPENDENT_CIM_SERVICE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Dependent by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Dependent_CIM_Service(WBEMClient client, String namespace,
            CIM_Service newValue) throws WbemsmtException {
        CIM_ServiceServiceDependency fco = new CIM_ServiceServiceDependency(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_DEPENDENT_CIM_SERVICE.NAME);
        if (property != null) {
            property = setPropertyValue_Dependent_CIM_Service(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_DEPENDENT_CIM_SERVICE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Dependent
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_Dependent_CIM_Service(CIMProperty currentProperty,
            CIM_Service newValue) {
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
     * return the name of the CIMClass
     * @return
     */
    public String getObjectName() {
        return CIM_ServiceServiceDependency.CIM_CLASS_NAME;
    }

}