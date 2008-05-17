/** 
 * CIM_AdminDomain.java
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
 * Description: This is a special grouping of ManagedSystemElements. The grouping is viewed as a single entity, reflecting that all of its components are administered similarly - either by the same user, group of users or policy. It serves as an aggregation point to associate one or more of the following elements: network devices, such as routers and switches, servers, and other resources that can be accessed by end systems. This grouping of devices plays an essential role in ensuring that the same administrative policy and actions are applied to all of the devices in the grouping. The specific behavior and/or semantics of the AdminDomain can be identified through its aggregated and associated entities.
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

public class CIM_AdminDomain extends CIM_System {

    public final static String CIM_CLASS_NAME = "CIM_AdminDomain";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * A relationship that aggregates one or more lower-level AdminDomain instances into a higher-level AdminDomain.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_CONTAINEDDOMAIN = "CIM_ContainedDomain";

    /**
     * Constants of property NameFormat
     * The NameFormat property identifies how the Name of the AdminDomain is generated, using the heuristic specified in the CIM V2 System Model spec. It assumes that the documented rules are traversed in order, to determine and assign a Name. The NameFormat Values list defines the precedence order for assigning the Name of the AdminDomain. 
     * 
     * "FC" has been deprecated and replaced by "WWN" to be consistent with the other ValueMaps.
     */
    public static class PROPERTY_NAMEFORMAT {
        /**
         * name of the property NameFormat
         */
        public final static String NAME = "NameFormat";

        /**
         * constant for value map entry Other
         */

        public final static String VALUE_MAP_ENTRY_Other_FOR_VALUE_ENTRY_Other = new String("Other");

        /**
         * constant for value entry Other (corresponds to mapEntry Other )
         */
        public final static String VALUE_ENTRY_Other = "Other";

        /**
         * constant for value map entry AS
         */

        public final static String VALUE_MAP_ENTRY_AS_FOR_VALUE_ENTRY_Autonomous_System = new String(
                "AS");

        /**
         * constant for value entry Autonomous System (corresponds to mapEntry AS )
         */
        public final static String VALUE_ENTRY_Autonomous_System = "Autonomous System";

        /**
         * constant for value map entry NAP
         */

        public final static String VALUE_MAP_ENTRY_NAP_FOR_VALUE_ENTRY_Network_Access_Provider = new String(
                "NAP");

        /**
         * constant for value entry Network Access Provider (corresponds to mapEntry NAP )
         */
        public final static String VALUE_ENTRY_Network_Access_Provider = "Network Access Provider";

        /**
         * constant for value map entry NOC
         */

        public final static String VALUE_MAP_ENTRY_NOC_FOR_VALUE_ENTRY_Network_Operations_Center = new String(
                "NOC");

        /**
         * constant for value entry Network Operations Center (corresponds to mapEntry NOC )
         */
        public final static String VALUE_ENTRY_Network_Operations_Center = "Network Operations Center";

        /**
         * constant for value map entry POP
         */

        public final static String VALUE_MAP_ENTRY_POP_FOR_VALUE_ENTRY_Point_of_Presence = new String(
                "POP");

        /**
         * constant for value entry Point of Presence (corresponds to mapEntry POP )
         */
        public final static String VALUE_ENTRY_Point_of_Presence = "Point of Presence";

        /**
         * constant for value map entry RNP
         */

        public final static String VALUE_MAP_ENTRY_RNP_FOR_VALUE_ENTRY_Regional_Network_Provider = new String(
                "RNP");

        /**
         * constant for value entry Regional Network Provider (corresponds to mapEntry RNP )
         */
        public final static String VALUE_ENTRY_Regional_Network_Provider = "Regional Network Provider";

        /**
         * constant for value map entry IP
         */

        public final static String VALUE_MAP_ENTRY_IP_FOR_VALUE_ENTRY_IP = new String("IP");

        /**
         * constant for value entry IP (corresponds to mapEntry IP )
         */
        public final static String VALUE_ENTRY_IP = "IP";

        /**
         * constant for value map entry IPX
         */

        public final static String VALUE_MAP_ENTRY_IPX_FOR_VALUE_ENTRY_IPX = new String("IPX");

        /**
         * constant for value entry IPX (corresponds to mapEntry IPX )
         */
        public final static String VALUE_ENTRY_IPX = "IPX";

        /**
         * constant for value map entry SNA
         */

        public final static String VALUE_MAP_ENTRY_SNA_FOR_VALUE_ENTRY_SNA = new String("SNA");

        /**
         * constant for value entry SNA (corresponds to mapEntry SNA )
         */
        public final static String VALUE_ENTRY_SNA = "SNA";

        /**
         * constant for value map entry Dial
         */

        public final static String VALUE_MAP_ENTRY_Dial_FOR_VALUE_ENTRY_Dial = new String("Dial");

        /**
         * constant for value entry Dial (corresponds to mapEntry Dial )
         */
        public final static String VALUE_ENTRY_Dial = "Dial";

        /**
         * constant for value map entry WAN
         */

        public final static String VALUE_MAP_ENTRY_WAN_FOR_VALUE_ENTRY_WAN = new String("WAN");

        /**
         * constant for value entry WAN (corresponds to mapEntry WAN )
         */
        public final static String VALUE_ENTRY_WAN = "WAN";

        /**
         * constant for value map entry LAN
         */

        public final static String VALUE_MAP_ENTRY_LAN_FOR_VALUE_ENTRY_LAN = new String("LAN");

        /**
         * constant for value entry LAN (corresponds to mapEntry LAN )
         */
        public final static String VALUE_ENTRY_LAN = "LAN";

        /**
         * constant for value map entry ISDN
         */

        public final static String VALUE_MAP_ENTRY_ISDN_FOR_VALUE_ENTRY_ISDN = new String("ISDN");

        /**
         * constant for value entry ISDN (corresponds to mapEntry ISDN )
         */
        public final static String VALUE_ENTRY_ISDN = "ISDN";

        /**
         * constant for value map entry Frame Relay
         */

        public final static String VALUE_MAP_ENTRY_Frame_Relay_FOR_VALUE_ENTRY_Frame_Relay = new String(
                "Frame Relay");

        /**
         * constant for value entry Frame Relay (corresponds to mapEntry Frame Relay )
         */
        public final static String VALUE_ENTRY_Frame_Relay = "Frame Relay";

        /**
         * constant for value map entry ATM
         */

        public final static String VALUE_MAP_ENTRY_ATM_FOR_VALUE_ENTRY_ATM = new String("ATM");

        /**
         * constant for value entry ATM (corresponds to mapEntry ATM )
         */
        public final static String VALUE_ENTRY_ATM = "ATM";

        /**
         * constant for value map entry E.164
         */

        public final static String VALUE_MAP_ENTRY_E_164_FOR_VALUE_ENTRY_E_164 = new String("E.164");

        /**
         * constant for value entry E.164 (corresponds to mapEntry E.164 )
         */
        public final static String VALUE_ENTRY_E_164 = "E.164";

        /**
         * constant for value map entry IB
         */

        public final static String VALUE_MAP_ENTRY_IB_FOR_VALUE_ENTRY_Infiniband = new String("IB");

        /**
         * constant for value entry Infiniband (corresponds to mapEntry IB )
         */
        public final static String VALUE_ENTRY_Infiniband = "Infiniband";

        /**
         * constant for value map entry FC
         */

        public final static String VALUE_MAP_ENTRY_FC_FOR_VALUE_ENTRY_Fibre_Channel = new String(
                "FC");

        /**
         * constant for value entry Fibre Channel (corresponds to mapEntry FC )
         */
        public final static String VALUE_ENTRY_Fibre_Channel = "Fibre Channel";

        /**
         * constant for value map entry Policy Repository
         */

        public final static String VALUE_MAP_ENTRY_Policy_Repository_FOR_VALUE_ENTRY_Policy_Repository = new String(
                "Policy Repository");

        /**
         * constant for value entry Policy Repository (corresponds to mapEntry Policy Repository )
         */
        public final static String VALUE_ENTRY_Policy_Repository = "Policy Repository";

        /**
         * constant for value map entry WWN
         */

        public final static String VALUE_MAP_ENTRY_WWN_FOR_VALUE_ENTRY_Fibre_Channel_Worldwide_Name = new String(
                "WWN");

        /**
         * constant for value entry Fibre Channel Worldwide Name (corresponds to mapEntry WWN )
         */
        public final static String VALUE_ENTRY_Fibre_Channel_Worldwide_Name = "Fibre Channel Worldwide Name";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        public static String getValueMapEntry(String value) {
            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_Other_FOR_VALUE_ENTRY_Other;
            }
            if (VALUE_ENTRY_Autonomous_System.equals(value)) {
                return VALUE_MAP_ENTRY_AS_FOR_VALUE_ENTRY_Autonomous_System;
            }
            if (VALUE_ENTRY_Network_Access_Provider.equals(value)) {
                return VALUE_MAP_ENTRY_NAP_FOR_VALUE_ENTRY_Network_Access_Provider;
            }
            if (VALUE_ENTRY_Network_Operations_Center.equals(value)) {
                return VALUE_MAP_ENTRY_NOC_FOR_VALUE_ENTRY_Network_Operations_Center;
            }
            if (VALUE_ENTRY_Point_of_Presence.equals(value)) {
                return VALUE_MAP_ENTRY_POP_FOR_VALUE_ENTRY_Point_of_Presence;
            }
            if (VALUE_ENTRY_Regional_Network_Provider.equals(value)) {
                return VALUE_MAP_ENTRY_RNP_FOR_VALUE_ENTRY_Regional_Network_Provider;
            }
            if (VALUE_ENTRY_IP.equals(value)) {
                return VALUE_MAP_ENTRY_IP_FOR_VALUE_ENTRY_IP;
            }
            if (VALUE_ENTRY_IPX.equals(value)) {
                return VALUE_MAP_ENTRY_IPX_FOR_VALUE_ENTRY_IPX;
            }
            if (VALUE_ENTRY_SNA.equals(value)) {
                return VALUE_MAP_ENTRY_SNA_FOR_VALUE_ENTRY_SNA;
            }
            if (VALUE_ENTRY_Dial.equals(value)) {
                return VALUE_MAP_ENTRY_Dial_FOR_VALUE_ENTRY_Dial;
            }
            if (VALUE_ENTRY_WAN.equals(value)) {
                return VALUE_MAP_ENTRY_WAN_FOR_VALUE_ENTRY_WAN;
            }
            if (VALUE_ENTRY_LAN.equals(value)) {
                return VALUE_MAP_ENTRY_LAN_FOR_VALUE_ENTRY_LAN;
            }
            if (VALUE_ENTRY_ISDN.equals(value)) {
                return VALUE_MAP_ENTRY_ISDN_FOR_VALUE_ENTRY_ISDN;
            }
            if (VALUE_ENTRY_Frame_Relay.equals(value)) {
                return VALUE_MAP_ENTRY_Frame_Relay_FOR_VALUE_ENTRY_Frame_Relay;
            }
            if (VALUE_ENTRY_ATM.equals(value)) {
                return VALUE_MAP_ENTRY_ATM_FOR_VALUE_ENTRY_ATM;
            }
            if (VALUE_ENTRY_E_164.equals(value)) {
                return VALUE_MAP_ENTRY_E_164_FOR_VALUE_ENTRY_E_164;
            }
            if (VALUE_ENTRY_Infiniband.equals(value)) {
                return VALUE_MAP_ENTRY_IB_FOR_VALUE_ENTRY_Infiniband;
            }
            if (VALUE_ENTRY_Fibre_Channel.equals(value)) {
                return VALUE_MAP_ENTRY_FC_FOR_VALUE_ENTRY_Fibre_Channel;
            }
            if (VALUE_ENTRY_Policy_Repository.equals(value)) {
                return VALUE_MAP_ENTRY_Policy_Repository_FOR_VALUE_ENTRY_Policy_Repository;
            }
            if (VALUE_ENTRY_Fibre_Channel_Worldwide_Name.equals(value)) {
                return VALUE_MAP_ENTRY_WWN_FOR_VALUE_ENTRY_Fibre_Channel_Worldwide_Name;
            }
            return null;
        }

        /**
         * uses the element within array VALUE_ENTRIES_FOR_DISPLAY at index indexInPulldown to get the ValueMapEntry
         * @param indexInPulldown the index within the pulldown element, the list etc
         * @return the ValueMap entry from the displayed values
         */
        public static String getValueMapEntryFromDisplayedValue(Number indexInPulldown) {
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
        public static int getIndexForDisplay(String currentValue) {
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

        public static String getValueEntry(String valueMapEntry) {
            if (VALUE_MAP_ENTRY_Other_FOR_VALUE_ENTRY_Other.equals(valueMapEntry)) {
                return VALUE_ENTRY_Other;
            }
            if (VALUE_MAP_ENTRY_AS_FOR_VALUE_ENTRY_Autonomous_System.equals(valueMapEntry)) {
                return VALUE_ENTRY_Autonomous_System;
            }
            if (VALUE_MAP_ENTRY_NAP_FOR_VALUE_ENTRY_Network_Access_Provider.equals(valueMapEntry)) {
                return VALUE_ENTRY_Network_Access_Provider;
            }
            if (VALUE_MAP_ENTRY_NOC_FOR_VALUE_ENTRY_Network_Operations_Center.equals(valueMapEntry)) {
                return VALUE_ENTRY_Network_Operations_Center;
            }
            if (VALUE_MAP_ENTRY_POP_FOR_VALUE_ENTRY_Point_of_Presence.equals(valueMapEntry)) {
                return VALUE_ENTRY_Point_of_Presence;
            }
            if (VALUE_MAP_ENTRY_RNP_FOR_VALUE_ENTRY_Regional_Network_Provider.equals(valueMapEntry)) {
                return VALUE_ENTRY_Regional_Network_Provider;
            }
            if (VALUE_MAP_ENTRY_IP_FOR_VALUE_ENTRY_IP.equals(valueMapEntry)) {
                return VALUE_ENTRY_IP;
            }
            if (VALUE_MAP_ENTRY_IPX_FOR_VALUE_ENTRY_IPX.equals(valueMapEntry)) {
                return VALUE_ENTRY_IPX;
            }
            if (VALUE_MAP_ENTRY_SNA_FOR_VALUE_ENTRY_SNA.equals(valueMapEntry)) {
                return VALUE_ENTRY_SNA;
            }
            if (VALUE_MAP_ENTRY_Dial_FOR_VALUE_ENTRY_Dial.equals(valueMapEntry)) {
                return VALUE_ENTRY_Dial;
            }
            if (VALUE_MAP_ENTRY_WAN_FOR_VALUE_ENTRY_WAN.equals(valueMapEntry)) {
                return VALUE_ENTRY_WAN;
            }
            if (VALUE_MAP_ENTRY_LAN_FOR_VALUE_ENTRY_LAN.equals(valueMapEntry)) {
                return VALUE_ENTRY_LAN;
            }
            if (VALUE_MAP_ENTRY_ISDN_FOR_VALUE_ENTRY_ISDN.equals(valueMapEntry)) {
                return VALUE_ENTRY_ISDN;
            }
            if (VALUE_MAP_ENTRY_Frame_Relay_FOR_VALUE_ENTRY_Frame_Relay.equals(valueMapEntry)) {
                return VALUE_ENTRY_Frame_Relay;
            }
            if (VALUE_MAP_ENTRY_ATM_FOR_VALUE_ENTRY_ATM.equals(valueMapEntry)) {
                return VALUE_ENTRY_ATM;
            }
            if (VALUE_MAP_ENTRY_E_164_FOR_VALUE_ENTRY_E_164.equals(valueMapEntry)) {
                return VALUE_ENTRY_E_164;
            }
            if (VALUE_MAP_ENTRY_IB_FOR_VALUE_ENTRY_Infiniband.equals(valueMapEntry)) {
                return VALUE_ENTRY_Infiniband;
            }
            if (VALUE_MAP_ENTRY_FC_FOR_VALUE_ENTRY_Fibre_Channel.equals(valueMapEntry)) {
                return VALUE_ENTRY_Fibre_Channel;
            }
            if (VALUE_MAP_ENTRY_Policy_Repository_FOR_VALUE_ENTRY_Policy_Repository
                    .equals(valueMapEntry)) {
                return VALUE_ENTRY_Policy_Repository;
            }
            if (VALUE_MAP_ENTRY_WWN_FOR_VALUE_ENTRY_Fibre_Channel_Worldwide_Name
                    .equals(valueMapEntry)) {
                return VALUE_ENTRY_Fibre_Channel_Worldwide_Name;
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
         * Value Map for the property NameFormat   
         */
        public final static String[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_Other_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_AS_FOR_VALUE_ENTRY_Autonomous_System,
                VALUE_MAP_ENTRY_NAP_FOR_VALUE_ENTRY_Network_Access_Provider,
                VALUE_MAP_ENTRY_NOC_FOR_VALUE_ENTRY_Network_Operations_Center,
                VALUE_MAP_ENTRY_POP_FOR_VALUE_ENTRY_Point_of_Presence,
                VALUE_MAP_ENTRY_RNP_FOR_VALUE_ENTRY_Regional_Network_Provider,
                VALUE_MAP_ENTRY_IP_FOR_VALUE_ENTRY_IP, VALUE_MAP_ENTRY_IPX_FOR_VALUE_ENTRY_IPX,
                VALUE_MAP_ENTRY_SNA_FOR_VALUE_ENTRY_SNA, VALUE_MAP_ENTRY_Dial_FOR_VALUE_ENTRY_Dial,
                VALUE_MAP_ENTRY_WAN_FOR_VALUE_ENTRY_WAN, VALUE_MAP_ENTRY_LAN_FOR_VALUE_ENTRY_LAN,
                VALUE_MAP_ENTRY_ISDN_FOR_VALUE_ENTRY_ISDN,
                VALUE_MAP_ENTRY_Frame_Relay_FOR_VALUE_ENTRY_Frame_Relay,
                VALUE_MAP_ENTRY_ATM_FOR_VALUE_ENTRY_ATM,
                VALUE_MAP_ENTRY_E_164_FOR_VALUE_ENTRY_E_164,
                VALUE_MAP_ENTRY_IB_FOR_VALUE_ENTRY_Infiniband,
                VALUE_MAP_ENTRY_FC_FOR_VALUE_ENTRY_Fibre_Channel,
                VALUE_MAP_ENTRY_Policy_Repository_FOR_VALUE_ENTRY_Policy_Repository,
                VALUE_MAP_ENTRY_WWN_FOR_VALUE_ENTRY_Fibre_Channel_Worldwide_Name };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property NameFormat   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Other,
                VALUE_ENTRY_Autonomous_System, VALUE_ENTRY_Network_Access_Provider,
                VALUE_ENTRY_Network_Operations_Center, VALUE_ENTRY_Point_of_Presence,
                VALUE_ENTRY_Regional_Network_Provider, VALUE_ENTRY_IP, VALUE_ENTRY_IPX,
                VALUE_ENTRY_SNA, VALUE_ENTRY_Dial, VALUE_ENTRY_WAN, VALUE_ENTRY_LAN,
                VALUE_ENTRY_ISDN, VALUE_ENTRY_Frame_Relay, VALUE_ENTRY_ATM, VALUE_ENTRY_E_164,
                VALUE_ENTRY_Infiniband, VALUE_ENTRY_Fibre_Channel, VALUE_ENTRY_Policy_Repository,
                VALUE_ENTRY_Fibre_Channel_Worldwide_Name };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property NameFormat   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Other,
                VALUE_ENTRY_Autonomous_System, VALUE_ENTRY_Network_Access_Provider,
                VALUE_ENTRY_Network_Operations_Center, VALUE_ENTRY_Point_of_Presence,
                VALUE_ENTRY_Regional_Network_Provider, VALUE_ENTRY_IP, VALUE_ENTRY_IPX,
                VALUE_ENTRY_SNA, VALUE_ENTRY_Dial, VALUE_ENTRY_WAN, VALUE_ENTRY_LAN,
                VALUE_ENTRY_ISDN, VALUE_ENTRY_Frame_Relay, VALUE_ENTRY_ATM, VALUE_ENTRY_E_164,
                VALUE_ENTRY_Infiniband, VALUE_ENTRY_Fibre_Channel, VALUE_ENTRY_Policy_Repository,
                VALUE_ENTRY_Fibre_Channel_Worldwide_Name };

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
     *   This is a special grouping of ManagedSystemElements. The grouping is viewed as a single entity, reflecting that all of its components are administered similarly - either by the same user, group of users or policy. It serves as an aggregation point to associate one or more of the following elements: network devices, such as routers and switches, servers, and other resources that can be accessed by end systems. This grouping of devices plays an essential role in ensuring that the same administrative policy and actions are applied to all of the devices in the grouping. The specific behavior and/or semantics of the AdminDomain can be identified through its aggregated and associated entities.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_AdminDomain(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   This is a special grouping of ManagedSystemElements. The grouping is viewed as a single entity, reflecting that all of its components are administered similarly - either by the same user, group of users or policy. It serves as an aggregation point to associate one or more of the following elements: network devices, such as routers and switches, servers, and other resources that can be accessed by end systems. This grouping of devices plays an essential role in ensuring that the same administrative policy and actions are applied to all of the devices in the grouping. The specific behavior and/or semantics of the AdminDomain can be identified through its aggregated and associated entities.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_AdminDomain(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_AdminDomain() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("NameFormat", new CIMProperty("NameFormat", CIMDataType.STRING_T,
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
     * Get the property NameFormat
     *     * <br>
     * The NameFormat property identifies how the Name of the AdminDomain is generated, using the heuristic specified in the CIM V2 System Model spec. It assumes that the documented rules are traversed in order, to determine and assign a Name. The NameFormat Values list defines the precedence order for assigning the Name of the AdminDomain. 
     * 
     * "FC" has been deprecated and replaced by "WWN" to be consistent with the other ValueMaps.
     *     */

    public String get_NameFormat() {
        CIMProperty currentProperty = getProperty(PROPERTY_NAMEFORMAT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_NAMEFORMAT.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property NameFormat
     * <br>
     * The NameFormat property identifies how the Name of the AdminDomain is generated, using the heuristic specified in the CIM V2 System Model spec. It assumes that the documented rules are traversed in order, to determine and assign a Name. The NameFormat Values list defines the precedence order for assigning the Name of the AdminDomain. 
     * 
     * "FC" has been deprecated and replaced by "WWN" to be consistent with the other ValueMaps.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_NameFormat(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_NAMEFORMAT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_NameFormat(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_NAMEFORMAT.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property NameFormat by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_NameFormat(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_AdminDomain fco = new CIM_AdminDomain(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_NAMEFORMAT.NAME);
        if (property != null) {
            property = setPropertyValue_NameFormat(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_NAMEFORMAT.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property NameFormat
     * <br>
     * The NameFormat property identifies how the Name of the AdminDomain is generated, using the heuristic specified in the CIM V2 System Model spec. It assumes that the documented rules are traversed in order, to determine and assign a Name. The NameFormat Values list defines the precedence order for assigning the Name of the AdminDomain. 
     * 
     * "FC" has been deprecated and replaced by "WWN" to be consistent with the other ValueMaps.
     */

    private static CIMProperty setPropertyValue_NameFormat(CIMProperty currentProperty,
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

    /**
     * Get the list with CIM_AdminDomain objects associated by the association CIM_ContainedDomain
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_CONTAINEDDOMAIN as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_AdminDomain_CIM_ContainedDomains(WBEMClient cimClient)
            throws WbemsmtException {

        return getAssociated_CIM_AdminDomain_CIM_ContainedDomains(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_CONTAINEDDOMAIN, CIM_AdminDomain.CIM_CLASS_NAME,
                null, null, false, false, null);

    }

    /**
     * Get the list with CIM_AdminDomain objects associated by the association CIM_ContainedDomain
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_CONTAINEDDOMAIN or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_CONTAINEDDOMAIN as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_AdminDomain_CIM_ContainedDomains(WBEMClient cimClient,
            String resultClass, String role, String resultRole) throws WbemsmtException {

        return getAssociated_CIM_AdminDomain_CIM_ContainedDomains(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_CONTAINEDDOMAIN, resultClass, role, resultRole,
                false, false, null);

    }

    /**
     * Get the list with CIM_AdminDomain objects associated by the association CIM_ContainedDomain
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_CONTAINEDDOMAIN or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_AdminDomain_CIM_ContainedDomains(WBEMClient cimClient,
            String associationClass, String resultClass, String role, String resultRole,
            boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList)
            throws WbemsmtException {

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
                CIM_AdminDomainHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_AdminDomainHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_AdminDomainHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_AdminDomain(cimInstance));
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
                        result.add(new CIM_AdminDomain(cimInstance));
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
                        result.add(new CIM_AdminDomain(cimInstance));
                        continue;
                    }
                }
            }
            CIM_AdminDomainHelper.checkException(enumeration);
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
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_ContainedDomain
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_CONTAINEDDOMAIN as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_AdminDomain_CIM_ContainedDomainNames(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_AdminDomain_CIM_ContainedDomainNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_CONTAINEDDOMAIN, CIM_AdminDomain.CIM_CLASS_NAME,
                null, null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_ContainedDomain
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_CONTAINEDDOMAIN or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_CONTAINEDDOMAIN as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_AdminDomain_CIM_ContainedDomainNames(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_AdminDomain_CIM_ContainedDomainNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_CONTAINEDDOMAIN, resultClass, role, resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_ContainedDomain
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_AdminDomain_CIM_ContainedDomainNames(
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
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_CONTAINEDDOMAIN,
                    CIM_AdminDomain.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_AdminDomainHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_AdminDomainHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_AdminDomain.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_AdminDomainHelper.checkException(enumeration);
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
     * Get the list with CIM_ContainedDomain associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_ContainedDomain(WBEMClient cimClient,
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_CONTAINEDDOMAIN, role, includeQualifiers,
                    includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_CONTAINEDDOMAIN, role, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_AdminDomainHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_AdminDomainHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_ContainedDomainHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_ContainedDomain(cimInstance));
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
                        result.add(new CIM_ContainedDomain(cimInstance));
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
                        result.add(new CIM_ContainedDomain(cimInstance));
                        continue;
                    }
                }
            }
            CIM_AdminDomainHelper.checkException(enumeration);
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
     * Get a list of CIMObjectPath items of the associations CIM_ContainedDomain
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_ContainedDomain(WBEMClient cimClient,
            String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_CONTAINEDDOMAIN, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_CONTAINEDDOMAIN, role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_AdminDomainHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_AdminDomainHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_ContainedDomain.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_AdminDomainHelper.checkException(enumeration);
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
        return CIM_AdminDomain.CIM_CLASS_NAME;
    }

}