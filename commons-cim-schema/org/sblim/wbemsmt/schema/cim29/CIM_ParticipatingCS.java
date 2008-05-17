/** 
 * CIM_ParticipatingCS.java
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
 * Description: A Cluster is composed of two or more ComputerSystems, operating together. A ComputerSystem may participate in multiple Clusters. 
 * 
 * When first establishing or bringing up a Cluster, only one ComputerSystem may be defined as participating in it. Therfore, the cardinality of the association for the ComputerSystem reference is Min (1).
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_ParticipatingCS extends CIM_Dependency {

    public final static String CIM_CLASS_NAME = "CIM_ParticipatingCS";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property RoleOfNode
     * RoleOfNode indicates whether the Cluster nodes are peers (value = 2), connected in a master-slave/primary- secondary relationship (values = 3 for primary, 4 for secondary), available in a standby configuration (5) or of some other (1) or unknown (0) relationship. In a System/390 environment, the nodes are identified as "Base Plex" (value=6) or "Enhanced Plex" (value=7).
     */
    public static class PROPERTY_ROLEOFNODE {
        /**
         * name of the property RoleOfNode
         */
        public final static String NAME = "RoleOfNode";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Peer = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Peer (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Peer = "Peer";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Primary = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Primary (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Primary = "Primary";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Secondary = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Secondary (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Secondary = "Secondary";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Standby = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry Standby (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Standby = "Standby";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Base_Plex = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry Base Plex (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Base_Plex = "Base Plex";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Enhanced_Plex = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry Enhanced Plex (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_Enhanced_Plex = "Enhanced Plex";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@1ae81ae8
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Peer.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Peer;
            }

            if (VALUE_ENTRY_Primary.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Primary;
            }

            if (VALUE_ENTRY_Secondary.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Secondary;
            }

            if (VALUE_ENTRY_Standby.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Standby;
            }

            if (VALUE_ENTRY_Base_Plex.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Base_Plex;
            }

            if (VALUE_ENTRY_Enhanced_Plex.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Enhanced_Plex;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Peer.intValue()) {
                return VALUE_ENTRY_Peer;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Primary.intValue()) {
                return VALUE_ENTRY_Primary;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Secondary.intValue()) {
                return VALUE_ENTRY_Secondary;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Standby.intValue()) {
                return VALUE_ENTRY_Standby;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Base_Plex.intValue()) {
                return VALUE_ENTRY_Base_Plex;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Enhanced_Plex.intValue()) {
                return VALUE_ENTRY_Enhanced_Plex;
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
         * Value Map for the property RoleOfNode   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Peer, VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Primary,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Secondary,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Standby,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Base_Plex,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Enhanced_Plex };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property RoleOfNode   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_Peer, VALUE_ENTRY_Primary, VALUE_ENTRY_Secondary, VALUE_ENTRY_Standby,
                VALUE_ENTRY_Base_Plex, VALUE_ENTRY_Enhanced_Plex };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property RoleOfNode   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_Peer, VALUE_ENTRY_Primary, VALUE_ENTRY_Secondary,
                VALUE_ENTRY_Standby, VALUE_ENTRY_Base_Plex, VALUE_ENTRY_Enhanced_Plex };

    }

    /**
     * Constants of property StateOfNode
     * StateOfNode indicates the condition of the participating ComputerSystem in the Cluster. For example, one value is "Joining" (2).
     */
    public static class PROPERTY_STATEOFNODE {
        /**
         * name of the property StateOfNode
         */
        public final static String NAME = "StateOfNode";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Joining = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Joining (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Joining = "Joining";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Paused = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Paused (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Paused = "Paused";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Available = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Available (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Available = "Available";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Unavailable = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry Unavailable (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Unavailable = "Unavailable";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Degraded = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry Degraded (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Degraded = "Degraded";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@55005500
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Joining.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Joining;
            }

            if (VALUE_ENTRY_Paused.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Paused;
            }

            if (VALUE_ENTRY_Available.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Available;
            }

            if (VALUE_ENTRY_Unavailable.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Unavailable;
            }

            if (VALUE_ENTRY_Degraded.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Degraded;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Joining.intValue()) {
                return VALUE_ENTRY_Joining;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Paused.intValue()) {
                return VALUE_ENTRY_Paused;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Available.intValue()) {
                return VALUE_ENTRY_Available;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Unavailable.intValue()) {
                return VALUE_ENTRY_Unavailable;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Degraded.intValue()) {
                return VALUE_ENTRY_Degraded;
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
         * Value Map for the property StateOfNode   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Joining,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Paused,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Available,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Unavailable,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Degraded };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property StateOfNode   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_Joining, VALUE_ENTRY_Paused, VALUE_ENTRY_Available,
                VALUE_ENTRY_Unavailable, VALUE_ENTRY_Degraded };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property StateOfNode   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_Joining, VALUE_ENTRY_Paused, VALUE_ENTRY_Available,
                VALUE_ENTRY_Unavailable, VALUE_ENTRY_Degraded };

    }

    /**
     * Constants of property Antecedent
     * 
     */
    public static class PROPERTY_ANTECEDENT_CIM_COMPUTERSYSTEM {
        /**
         * name of the property Antecedent
         */
        public final static String NAME = "Antecedent";

    }

    /**
     * Constants of property Dependent
     * 
     */
    public static class PROPERTY_DEPENDENT_CIM_CLUSTER {
        /**
         * name of the property Dependent
         */
        public final static String NAME = "Dependent";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_Dependency.getPackages();

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
     *   A Cluster is composed of two or more ComputerSystems, operating together. A ComputerSystem may participate in multiple Clusters. 
     * 
     * When first establishing or bringing up a Cluster, only one ComputerSystem may be defined as participating in it. Therfore, the cardinality of the association for the ComputerSystem reference is Min (1).
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_ParticipatingCS(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   A Cluster is composed of two or more ComputerSystems, operating together. A ComputerSystem may participate in multiple Clusters. 
     * 
     * When first establishing or bringing up a Cluster, only one ComputerSystem may be defined as participating in it. Therfore, the cardinality of the association for the ComputerSystem reference is Min (1).
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_ParticipatingCS(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_ParticipatingCS() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("RoleOfNode", new CIMProperty("RoleOfNode", CIMDataType.UINT16_T,
                null));
        propertiesToCheck.put("StateOfNode", new CIMProperty("StateOfNode", CIMDataType.UINT16_T,
                null));
        propertiesToCheck.put("Antecedent", new CIMProperty("Antecedent", new CIMDataType(
                CIM_ComputerSystem.CIM_CLASS_NAME), null));
        propertiesToCheck.put("Dependent", new CIMProperty("Dependent", new CIMDataType(
                CIM_Cluster.CIM_CLASS_NAME), null));

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
     * Get the property RoleOfNode
     *     * <br>
     * RoleOfNode indicates whether the Cluster nodes are peers (value = 2), connected in a master-slave/primary- secondary relationship (values = 3 for primary, 4 for secondary), available in a standby configuration (5) or of some other (1) or unknown (0) relationship. In a System/390 environment, the nodes are identified as "Base Plex" (value=6) or "Enhanced Plex" (value=7).
     *     */

    public javax.cim.UnsignedInteger16 get_RoleOfNode() {
        CIMProperty currentProperty = getProperty(PROPERTY_ROLEOFNODE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ROLEOFNODE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property RoleOfNode
     * <br>
     * RoleOfNode indicates whether the Cluster nodes are peers (value = 2), connected in a master-slave/primary- secondary relationship (values = 3 for primary, 4 for secondary), available in a standby configuration (5) or of some other (1) or unknown (0) relationship. In a System/390 environment, the nodes are identified as "Base Plex" (value=6) or "Enhanced Plex" (value=7).
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_RoleOfNode(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ROLEOFNODE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_RoleOfNode(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ROLEOFNODE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property RoleOfNode by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_RoleOfNode(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_ParticipatingCS fco = new CIM_ParticipatingCS(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ROLEOFNODE.NAME);
        if (property != null) {
            property = setPropertyValue_RoleOfNode(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ROLEOFNODE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property RoleOfNode
     * <br>
     * RoleOfNode indicates whether the Cluster nodes are peers (value = 2), connected in a master-slave/primary- secondary relationship (values = 3 for primary, 4 for secondary), available in a standby configuration (5) or of some other (1) or unknown (0) relationship. In a System/390 environment, the nodes are identified as "Base Plex" (value=6) or "Enhanced Plex" (value=7).
     */

    private static CIMProperty setPropertyValue_RoleOfNode(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property StateOfNode
     *     * <br>
     * StateOfNode indicates the condition of the participating ComputerSystem in the Cluster. For example, one value is "Joining" (2).
     *     */

    public javax.cim.UnsignedInteger16 get_StateOfNode() {
        CIMProperty currentProperty = getProperty(PROPERTY_STATEOFNODE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_STATEOFNODE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property StateOfNode
     * <br>
     * StateOfNode indicates the condition of the participating ComputerSystem in the Cluster. For example, one value is "Joining" (2).
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_StateOfNode(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_STATEOFNODE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_StateOfNode(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_STATEOFNODE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property StateOfNode by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_StateOfNode(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_ParticipatingCS fco = new CIM_ParticipatingCS(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_STATEOFNODE.NAME);
        if (property != null) {
            property = setPropertyValue_StateOfNode(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_STATEOFNODE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property StateOfNode
     * <br>
     * StateOfNode indicates the condition of the participating ComputerSystem in the Cluster. For example, one value is "Joining" (2).
     */

    private static CIMProperty setPropertyValue_StateOfNode(CIMProperty currentProperty,
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

    public CIM_ComputerSystem get_Antecedent_CIM_ComputerSystem(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_ANTECEDENT_CIM_COMPUTERSYSTEM.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ANTECEDENT_CIM_COMPUTERSYSTEM.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_ComputerSystemHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property Antecedent
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Antecedent_CIM_ComputerSystem(CIM_ComputerSystem newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ANTECEDENT_CIM_COMPUTERSYSTEM.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Antecedent_CIM_ComputerSystem(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ANTECEDENT_CIM_COMPUTERSYSTEM.NAME
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

    public static CIMProperty create_Antecedent_CIM_ComputerSystem(WBEMClient client,
            String namespace, CIM_ComputerSystem newValue) throws WbemsmtException {
        CIM_ParticipatingCS fco = new CIM_ParticipatingCS(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ANTECEDENT_CIM_COMPUTERSYSTEM.NAME);
        if (property != null) {
            property = setPropertyValue_Antecedent_CIM_ComputerSystem(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ANTECEDENT_CIM_COMPUTERSYSTEM.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Antecedent
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_Antecedent_CIM_ComputerSystem(
            CIMProperty currentProperty, CIM_ComputerSystem newValue) {
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

    public CIM_Cluster get_Dependent_CIM_Cluster(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_DEPENDENT_CIM_CLUSTER.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_DEPENDENT_CIM_CLUSTER.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_ClusterHelper.getInstance(client, (CIMObjectPath) currentProperty.getValue());

    }

    /**
     * Set the property Dependent
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Dependent_CIM_Cluster(CIM_Cluster newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_DEPENDENT_CIM_CLUSTER.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Dependent_CIM_Cluster(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_DEPENDENT_CIM_CLUSTER.NAME
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

    public static CIMProperty create_Dependent_CIM_Cluster(WBEMClient client, String namespace,
            CIM_Cluster newValue) throws WbemsmtException {
        CIM_ParticipatingCS fco = new CIM_ParticipatingCS(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_DEPENDENT_CIM_CLUSTER.NAME);
        if (property != null) {
            property = setPropertyValue_Dependent_CIM_Cluster(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_DEPENDENT_CIM_CLUSTER.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Dependent
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_Dependent_CIM_Cluster(CIMProperty currentProperty,
            CIM_Cluster newValue) {
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
        return CIM_ParticipatingCS.CIM_CLASS_NAME;
    }

}