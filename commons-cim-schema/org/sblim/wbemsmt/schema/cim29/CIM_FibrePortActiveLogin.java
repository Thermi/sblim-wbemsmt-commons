/** 
 * CIM_FibrePortActiveLogin.java
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
 * Description: The use of FibrePortActiveLogin is deprecated since FibrePort is deprecated. Its information is found by examining the individual FCPorts, and an ActiveConnection between the FCProtocolEndpoints associated with the ports. FibrePortActiveLogin indicates that two FibrePorts are connected via a login and have negotiated their Class Of Service, frame size and other link characteristics, as specified by an instance of this class.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_FibrePortActiveLogin extends org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco {

    public final static String CIM_CLASS_NAME = "CIM_FibrePortActiveLogin";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property ACKModel
     * Acknowledgement model negotiated during Port login. For example, ACK-1 indicates that each frame should be acknowledged.
     */
    public static class PROPERTY_ACKMODEL {
        /**
         * name of the property ACKModel
         */
        public final static String NAME = "ACKModel";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_ACK_0 = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry ACK-0 (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_ACK_0 = "ACK-0";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_ACK_1 = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry ACK-1 (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_ACK_1 = "ACK-1";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_ACK_N = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry ACK-N (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_ACK_N = "ACK-N";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@6620662
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_ACK_0.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_ACK_0;
            }

            if (VALUE_ENTRY_ACK_1.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_ACK_1;
            }

            if (VALUE_ENTRY_ACK_N.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_ACK_N;
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

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_ACK_0.intValue()) {
                return VALUE_ENTRY_ACK_0;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_ACK_1.intValue()) {
                return VALUE_ENTRY_ACK_1;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_ACK_N.intValue()) {
                return VALUE_ENTRY_ACK_N;
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
         * Value Map for the property ACKModel   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_ACK_0,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_ACK_1, VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_ACK_N };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property ACKModel   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_ACK_0,
                VALUE_ENTRY_ACK_1, VALUE_ENTRY_ACK_N };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property ACKModel   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_ACK_0, VALUE_ENTRY_ACK_1, VALUE_ENTRY_ACK_N };

    }

    /**
     * Constants of property BufferToBufferModel
     * The buffer-to-buffer model negotiated during Port login. Either the model defined by the FC-PH standard is used (value=1, "Regular"), or an "Alternate" model is negotiated.
     */
    public static class PROPERTY_BUFFERTOBUFFERMODEL {
        /**
         * name of the property BufferToBufferModel
         */
        public final static String NAME = "BufferToBufferModel";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Regular = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry Regular (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_Regular = "Regular";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Alternate = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Alternate (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Alternate = "Alternate";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@70547054
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Regular.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Regular;
            }

            if (VALUE_ENTRY_Alternate.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Alternate;
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

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Regular.intValue()) {
                return VALUE_ENTRY_Regular;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Alternate.intValue()) {
                return VALUE_ENTRY_Alternate;
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
         * Value Map for the property BufferToBufferModel   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Regular,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Alternate };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property BufferToBufferModel   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Regular,
                VALUE_ENTRY_Alternate };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property BufferToBufferModel   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Regular, VALUE_ENTRY_Alternate };

    }

    /**
     * Constants of property NegotiatedCOS
     * The Fibre Channel Class of Service that is currently running between the Ports. Since two Ports can be simultaneously connected at different Classes of Service, this property had to be part of the object's key and therefore, an instance's identity.
     */
    public static class PROPERTY_NEGOTIATEDCOS {
        /**
         * name of the property NegotiatedCOS
         */
        public final static String NAME = "NegotiatedCOS";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_1 = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry 1 (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_1 = "1";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_2 = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry 2 (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_2 = "2";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_3 = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry 3 (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_3 = "3";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_4 = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry 4 (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_4 = "4";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_6 = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry 6 (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_6 = "6";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_F = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry F (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_F = "F";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@15f015f0
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_1.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_1;
            }

            if (VALUE_ENTRY_2.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_2;
            }

            if (VALUE_ENTRY_3.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_3;
            }

            if (VALUE_ENTRY_4.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_4;
            }

            if (VALUE_ENTRY_6.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_6;
            }

            if (VALUE_ENTRY_F.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_F;
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

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_1.intValue()) {
                return VALUE_ENTRY_1;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_2.intValue()) {
                return VALUE_ENTRY_2;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_3.intValue()) {
                return VALUE_ENTRY_3;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_4.intValue()) {
                return VALUE_ENTRY_4;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_6.intValue()) {
                return VALUE_ENTRY_6;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_F.intValue()) {
                return VALUE_ENTRY_F;
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
         * Value Map for the property NegotiatedCOS   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_1,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_2, VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_3,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_4, VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_6,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_F };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property NegotiatedCOS   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_1,
                VALUE_ENTRY_2, VALUE_ENTRY_3, VALUE_ENTRY_4, VALUE_ENTRY_6, VALUE_ENTRY_F };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property NegotiatedCOS   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_1, VALUE_ENTRY_2, VALUE_ENTRY_3, VALUE_ENTRY_4, VALUE_ENTRY_6,
                VALUE_ENTRY_F };

    }

    /**
     * Constants of property NegotiatedFrameSize
     * The Fibre Channel frame size, in bytes, that is currently negotiated between the two Ports.
     */
    public static class PROPERTY_NEGOTIATEDFRAMESIZE {
        /**
         * name of the property NegotiatedFrameSize
         */
        public final static String NAME = "NegotiatedFrameSize";

    }

    /**
     * Constants of property NegotiatedSpeed
     * The speed for communications that is currently negotiated between the two Ports. Speed is specified in bits per second. If this information is not available, the property should be set to 0.
     */
    public static class PROPERTY_NEGOTIATEDSPEED {
        /**
         * name of the property NegotiatedSpeed
         */
        public final static String NAME = "NegotiatedSpeed";

    }

    /**
     * Constants of property OriginatorBufferCredit
     * OriginatorBufferCredit reflects the buffer credit of the Port defined as the LoginOriginator. It is the number of frame buffers made available BY the originating Port, TO the responder Port. Buffer credits are used in point to point connections, when an NL-Local Port is logged into another NL-Local Port, and when Nx Ports are logged into Fx Ports. In other scenarios, this value is undefined.
     */
    public static class PROPERTY_ORIGINATORBUFFERCREDIT {
        /**
         * name of the property OriginatorBufferCredit
         */
        public final static String NAME = "OriginatorBufferCredit";

    }

    /**
     * Constants of property OriginatorEndCredit
     * OriginatorEndCredit reflects the end credit of the Port defined as the LoginOriginator. It is the number of frame buffers made available BY the originating Port, TO the responder Port. End credits are used in point to point connections, when an NL-Local Port is logged into another NL-Local Port, and when Nx Ports are logged into remote Nx Ports. In other scenarios, this value is undefined.
     */
    public static class PROPERTY_ORIGINATORENDCREDIT {
        /**
         * name of the property OriginatorEndCredit
         */
        public final static String NAME = "OriginatorEndCredit";

    }

    /**
     * Constants of property ResponderBufferCredit
     * ResponderBufferCredit reflects the buffer credit of the Port defined as the LoginResponder. It is the number of frame buffers made available BY the responder Port, TO the originating Port. Buffer credits are used in point to point connections, when an NL-Local Port is logged into another NL-Local Port, and when Nx Ports are logged into Fx Ports. In other scenarios, this value is undefined.
     */
    public static class PROPERTY_RESPONDERBUFFERCREDIT {
        /**
         * name of the property ResponderBufferCredit
         */
        public final static String NAME = "ResponderBufferCredit";

    }

    /**
     * Constants of property ResponderEndCredit
     * ResponderEndCredit reflects the end credit of the Port defined as the LoginResponder. It is the number of frame buffers made available BY the responder Port, TO the originating Port. End credits are used in point to point connections, when an NL-Local Port is logged into another NL-Local Port, and when Nx Ports are logged into remote Nx Ports. In other scenarios, this value is undefined.
     */
    public static class PROPERTY_RESPONDERENDCREDIT {
        /**
         * name of the property ResponderEndCredit
         */
        public final static String NAME = "ResponderEndCredit";

    }

    /**
     * Constants of property LoginOriginator
     * 
     */
    public static class PROPERTY_LOGINORIGINATOR_CIM_FIBREPORT {
        /**
         * name of the property LoginOriginator
         */
        public final static String NAME = "LoginOriginator";

    }

    /**
     * Constants of property LoginResponder
     * 
     */
    public static class PROPERTY_LOGINRESPONDER_CIM_FIBREPORT {
        /**
         * name of the property LoginResponder
         */
        public final static String NAME = "LoginResponder";

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
     *   The use of FibrePortActiveLogin is deprecated since FibrePort is deprecated. Its information is found by examining the individual FCPorts, and an ActiveConnection between the FCProtocolEndpoints associated with the ports. FibrePortActiveLogin indicates that two FibrePorts are connected via a login and have negotiated their Class Of Service, frame size and other link characteristics, as specified by an instance of this class.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_FibrePortActiveLogin(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   The use of FibrePortActiveLogin is deprecated since FibrePort is deprecated. Its information is found by examining the individual FCPorts, and an ActiveConnection between the FCProtocolEndpoints associated with the ports. FibrePortActiveLogin indicates that two FibrePorts are connected via a login and have negotiated their Class Of Service, frame size and other link characteristics, as specified by an instance of this class.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_FibrePortActiveLogin(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_FibrePortActiveLogin() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("ACKModel", new CIMProperty("ACKModel", CIMDataType.UINT16_T, null));
        propertiesToCheck.put("BufferToBufferModel", new CIMProperty("BufferToBufferModel",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("NegotiatedCOS", new CIMProperty("NegotiatedCOS",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("NegotiatedFrameSize", new CIMProperty("NegotiatedFrameSize",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("NegotiatedSpeed", new CIMProperty("NegotiatedSpeed",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("OriginatorBufferCredit", new CIMProperty("OriginatorBufferCredit",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("OriginatorEndCredit", new CIMProperty("OriginatorEndCredit",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("ResponderBufferCredit", new CIMProperty("ResponderBufferCredit",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("ResponderEndCredit", new CIMProperty("ResponderEndCredit",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("LoginOriginator", new CIMProperty("LoginOriginator",
                new CIMDataType(CIM_FibrePort.CIM_CLASS_NAME), null));
        propertiesToCheck.put("LoginResponder", new CIMProperty("LoginResponder", new CIMDataType(
                CIM_FibrePort.CIM_CLASS_NAME), null));

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
     * Get the property ACKModel
     *     * <br>
     * Acknowledgement model negotiated during Port login. For example, ACK-1 indicates that each frame should be acknowledged.
     *     */

    public javax.cim.UnsignedInteger16 get_ACKModel() {
        CIMProperty currentProperty = getProperty(PROPERTY_ACKMODEL.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ACKMODEL.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property ACKModel
     * <br>
     * Acknowledgement model negotiated during Port login. For example, ACK-1 indicates that each frame should be acknowledged.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ACKModel(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ACKMODEL.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ACKModel(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ACKMODEL.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ACKModel by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ACKModel(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_FibrePortActiveLogin fco = new CIM_FibrePortActiveLogin(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ACKMODEL.NAME);
        if (property != null) {
            property = setPropertyValue_ACKModel(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ACKMODEL.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ACKModel
     * <br>
     * Acknowledgement model negotiated during Port login. For example, ACK-1 indicates that each frame should be acknowledged.
     */

    private static CIMProperty setPropertyValue_ACKModel(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property BufferToBufferModel
     *     * <br>
     * The buffer-to-buffer model negotiated during Port login. Either the model defined by the FC-PH standard is used (value=1, "Regular"), or an "Alternate" model is negotiated.
     *     */

    public javax.cim.UnsignedInteger16 get_BufferToBufferModel() {
        CIMProperty currentProperty = getProperty(PROPERTY_BUFFERTOBUFFERMODEL.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_BUFFERTOBUFFERMODEL.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property BufferToBufferModel
     * <br>
     * The buffer-to-buffer model negotiated during Port login. Either the model defined by the FC-PH standard is used (value=1, "Regular"), or an "Alternate" model is negotiated.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_BufferToBufferModel(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_BUFFERTOBUFFERMODEL.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_BufferToBufferModel(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_BUFFERTOBUFFERMODEL.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property BufferToBufferModel by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_BufferToBufferModel(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_FibrePortActiveLogin fco = new CIM_FibrePortActiveLogin(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_BUFFERTOBUFFERMODEL.NAME);
        if (property != null) {
            property = setPropertyValue_BufferToBufferModel(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_BUFFERTOBUFFERMODEL.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property BufferToBufferModel
     * <br>
     * The buffer-to-buffer model negotiated during Port login. Either the model defined by the FC-PH standard is used (value=1, "Regular"), or an "Alternate" model is negotiated.
     */

    private static CIMProperty setPropertyValue_BufferToBufferModel(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property NegotiatedCOS
     *     * <br>
     * The Fibre Channel Class of Service that is currently running between the Ports. Since two Ports can be simultaneously connected at different Classes of Service, this property had to be part of the object's key and therefore, an instance's identity.
     *     */

    public javax.cim.UnsignedInteger16 get_key_NegotiatedCOS() {
        CIMProperty currentProperty = getProperty(PROPERTY_NEGOTIATEDCOS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_NEGOTIATEDCOS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property NegotiatedCOS
     * <br>
     * The Fibre Channel Class of Service that is currently running between the Ports. Since two Ports can be simultaneously connected at different Classes of Service, this property had to be part of the object's key and therefore, an instance's identity.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_key_NegotiatedCOS(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_NEGOTIATEDCOS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_key_NegotiatedCOS(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_NEGOTIATEDCOS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property NegotiatedCOS by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_key_NegotiatedCOS(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_FibrePortActiveLogin fco = new CIM_FibrePortActiveLogin(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_NEGOTIATEDCOS.NAME);
        if (property != null) {
            property = setPropertyValue_key_NegotiatedCOS(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_NEGOTIATEDCOS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property NegotiatedCOS
     * <br>
     * The Fibre Channel Class of Service that is currently running between the Ports. Since two Ports can be simultaneously connected at different Classes of Service, this property had to be part of the object's key and therefore, an instance's identity.
     */

    private static CIMProperty setPropertyValue_key_NegotiatedCOS(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property NegotiatedFrameSize
     *     * <br>
     * The Fibre Channel frame size, in bytes, that is currently negotiated between the two Ports.
     *     */

    public javax.cim.UnsignedInteger64 get_NegotiatedFrameSize() {
        CIMProperty currentProperty = getProperty(PROPERTY_NEGOTIATEDFRAMESIZE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_NEGOTIATEDFRAMESIZE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property NegotiatedFrameSize
     * <br>
     * The Fibre Channel frame size, in bytes, that is currently negotiated between the two Ports.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_NegotiatedFrameSize(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_NEGOTIATEDFRAMESIZE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_NegotiatedFrameSize(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_NEGOTIATEDFRAMESIZE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property NegotiatedFrameSize by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_NegotiatedFrameSize(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FibrePortActiveLogin fco = new CIM_FibrePortActiveLogin(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_NEGOTIATEDFRAMESIZE.NAME);
        if (property != null) {
            property = setPropertyValue_NegotiatedFrameSize(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_NEGOTIATEDFRAMESIZE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property NegotiatedFrameSize
     * <br>
     * The Fibre Channel frame size, in bytes, that is currently negotiated between the two Ports.
     */

    private static CIMProperty setPropertyValue_NegotiatedFrameSize(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property NegotiatedSpeed
     *     * <br>
     * The speed for communications that is currently negotiated between the two Ports. Speed is specified in bits per second. If this information is not available, the property should be set to 0.
     *     */

    public javax.cim.UnsignedInteger64 get_NegotiatedSpeed() {
        CIMProperty currentProperty = getProperty(PROPERTY_NEGOTIATEDSPEED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_NEGOTIATEDSPEED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property NegotiatedSpeed
     * <br>
     * The speed for communications that is currently negotiated between the two Ports. Speed is specified in bits per second. If this information is not available, the property should be set to 0.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_NegotiatedSpeed(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_NEGOTIATEDSPEED.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_NegotiatedSpeed(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_NEGOTIATEDSPEED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property NegotiatedSpeed by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_NegotiatedSpeed(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FibrePortActiveLogin fco = new CIM_FibrePortActiveLogin(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_NEGOTIATEDSPEED.NAME);
        if (property != null) {
            property = setPropertyValue_NegotiatedSpeed(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_NEGOTIATEDSPEED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property NegotiatedSpeed
     * <br>
     * The speed for communications that is currently negotiated between the two Ports. Speed is specified in bits per second. If this information is not available, the property should be set to 0.
     */

    private static CIMProperty setPropertyValue_NegotiatedSpeed(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OriginatorBufferCredit
     *     * <br>
     * OriginatorBufferCredit reflects the buffer credit of the Port defined as the LoginOriginator. It is the number of frame buffers made available BY the originating Port, TO the responder Port. Buffer credits are used in point to point connections, when an NL-Local Port is logged into another NL-Local Port, and when Nx Ports are logged into Fx Ports. In other scenarios, this value is undefined.
     *     */

    public javax.cim.UnsignedInteger64 get_OriginatorBufferCredit() {
        CIMProperty currentProperty = getProperty(PROPERTY_ORIGINATORBUFFERCREDIT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ORIGINATORBUFFERCREDIT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property OriginatorBufferCredit
     * <br>
     * OriginatorBufferCredit reflects the buffer credit of the Port defined as the LoginOriginator. It is the number of frame buffers made available BY the originating Port, TO the responder Port. Buffer credits are used in point to point connections, when an NL-Local Port is logged into another NL-Local Port, and when Nx Ports are logged into Fx Ports. In other scenarios, this value is undefined.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OriginatorBufferCredit(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ORIGINATORBUFFERCREDIT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_OriginatorBufferCredit(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ORIGINATORBUFFERCREDIT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OriginatorBufferCredit by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OriginatorBufferCredit(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FibrePortActiveLogin fco = new CIM_FibrePortActiveLogin(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ORIGINATORBUFFERCREDIT.NAME);
        if (property != null) {
            property = setPropertyValue_OriginatorBufferCredit(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ORIGINATORBUFFERCREDIT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OriginatorBufferCredit
     * <br>
     * OriginatorBufferCredit reflects the buffer credit of the Port defined as the LoginOriginator. It is the number of frame buffers made available BY the originating Port, TO the responder Port. Buffer credits are used in point to point connections, when an NL-Local Port is logged into another NL-Local Port, and when Nx Ports are logged into Fx Ports. In other scenarios, this value is undefined.
     */

    private static CIMProperty setPropertyValue_OriginatorBufferCredit(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OriginatorEndCredit
     *     * <br>
     * OriginatorEndCredit reflects the end credit of the Port defined as the LoginOriginator. It is the number of frame buffers made available BY the originating Port, TO the responder Port. End credits are used in point to point connections, when an NL-Local Port is logged into another NL-Local Port, and when Nx Ports are logged into remote Nx Ports. In other scenarios, this value is undefined.
     *     */

    public javax.cim.UnsignedInteger64 get_OriginatorEndCredit() {
        CIMProperty currentProperty = getProperty(PROPERTY_ORIGINATORENDCREDIT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ORIGINATORENDCREDIT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property OriginatorEndCredit
     * <br>
     * OriginatorEndCredit reflects the end credit of the Port defined as the LoginOriginator. It is the number of frame buffers made available BY the originating Port, TO the responder Port. End credits are used in point to point connections, when an NL-Local Port is logged into another NL-Local Port, and when Nx Ports are logged into remote Nx Ports. In other scenarios, this value is undefined.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OriginatorEndCredit(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ORIGINATORENDCREDIT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_OriginatorEndCredit(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ORIGINATORENDCREDIT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OriginatorEndCredit by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OriginatorEndCredit(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FibrePortActiveLogin fco = new CIM_FibrePortActiveLogin(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ORIGINATORENDCREDIT.NAME);
        if (property != null) {
            property = setPropertyValue_OriginatorEndCredit(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ORIGINATORENDCREDIT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OriginatorEndCredit
     * <br>
     * OriginatorEndCredit reflects the end credit of the Port defined as the LoginOriginator. It is the number of frame buffers made available BY the originating Port, TO the responder Port. End credits are used in point to point connections, when an NL-Local Port is logged into another NL-Local Port, and when Nx Ports are logged into remote Nx Ports. In other scenarios, this value is undefined.
     */

    private static CIMProperty setPropertyValue_OriginatorEndCredit(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ResponderBufferCredit
     *     * <br>
     * ResponderBufferCredit reflects the buffer credit of the Port defined as the LoginResponder. It is the number of frame buffers made available BY the responder Port, TO the originating Port. Buffer credits are used in point to point connections, when an NL-Local Port is logged into another NL-Local Port, and when Nx Ports are logged into Fx Ports. In other scenarios, this value is undefined.
     *     */

    public javax.cim.UnsignedInteger64 get_ResponderBufferCredit() {
        CIMProperty currentProperty = getProperty(PROPERTY_RESPONDERBUFFERCREDIT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_RESPONDERBUFFERCREDIT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property ResponderBufferCredit
     * <br>
     * ResponderBufferCredit reflects the buffer credit of the Port defined as the LoginResponder. It is the number of frame buffers made available BY the responder Port, TO the originating Port. Buffer credits are used in point to point connections, when an NL-Local Port is logged into another NL-Local Port, and when Nx Ports are logged into Fx Ports. In other scenarios, this value is undefined.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ResponderBufferCredit(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_RESPONDERBUFFERCREDIT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ResponderBufferCredit(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_RESPONDERBUFFERCREDIT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ResponderBufferCredit by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ResponderBufferCredit(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FibrePortActiveLogin fco = new CIM_FibrePortActiveLogin(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_RESPONDERBUFFERCREDIT.NAME);
        if (property != null) {
            property = setPropertyValue_ResponderBufferCredit(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_RESPONDERBUFFERCREDIT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ResponderBufferCredit
     * <br>
     * ResponderBufferCredit reflects the buffer credit of the Port defined as the LoginResponder. It is the number of frame buffers made available BY the responder Port, TO the originating Port. Buffer credits are used in point to point connections, when an NL-Local Port is logged into another NL-Local Port, and when Nx Ports are logged into Fx Ports. In other scenarios, this value is undefined.
     */

    private static CIMProperty setPropertyValue_ResponderBufferCredit(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ResponderEndCredit
     *     * <br>
     * ResponderEndCredit reflects the end credit of the Port defined as the LoginResponder. It is the number of frame buffers made available BY the responder Port, TO the originating Port. End credits are used in point to point connections, when an NL-Local Port is logged into another NL-Local Port, and when Nx Ports are logged into remote Nx Ports. In other scenarios, this value is undefined.
     *     */

    public javax.cim.UnsignedInteger64 get_ResponderEndCredit() {
        CIMProperty currentProperty = getProperty(PROPERTY_RESPONDERENDCREDIT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_RESPONDERENDCREDIT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property ResponderEndCredit
     * <br>
     * ResponderEndCredit reflects the end credit of the Port defined as the LoginResponder. It is the number of frame buffers made available BY the responder Port, TO the originating Port. End credits are used in point to point connections, when an NL-Local Port is logged into another NL-Local Port, and when Nx Ports are logged into remote Nx Ports. In other scenarios, this value is undefined.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ResponderEndCredit(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_RESPONDERENDCREDIT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ResponderEndCredit(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_RESPONDERENDCREDIT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ResponderEndCredit by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ResponderEndCredit(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FibrePortActiveLogin fco = new CIM_FibrePortActiveLogin(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_RESPONDERENDCREDIT.NAME);
        if (property != null) {
            property = setPropertyValue_ResponderEndCredit(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_RESPONDERENDCREDIT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ResponderEndCredit
     * <br>
     * ResponderEndCredit reflects the end credit of the Port defined as the LoginResponder. It is the number of frame buffers made available BY the responder Port, TO the originating Port. End credits are used in point to point connections, when an NL-Local Port is logged into another NL-Local Port, and when Nx Ports are logged into remote Nx Ports. In other scenarios, this value is undefined.
     */

    private static CIMProperty setPropertyValue_ResponderEndCredit(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property LoginOriginator
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_FibrePort get_LoginOriginator_CIM_FibrePort(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_LOGINORIGINATOR_CIM_FIBREPORT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_LOGINORIGINATOR_CIM_FIBREPORT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_FibrePortHelper.getInstance(client, (CIMObjectPath) currentProperty.getValue());

    }

    /**
     * Set the property LoginOriginator
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_LoginOriginator_CIM_FibrePort(CIM_FibrePort newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_LOGINORIGINATOR_CIM_FIBREPORT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_LoginOriginator_CIM_FibrePort(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_LOGINORIGINATOR_CIM_FIBREPORT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property LoginOriginator by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_LoginOriginator_CIM_FibrePort(WBEMClient client,
            String namespace, CIM_FibrePort newValue) throws WbemsmtException {
        CIM_FibrePortActiveLogin fco = new CIM_FibrePortActiveLogin(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_LOGINORIGINATOR_CIM_FIBREPORT.NAME);
        if (property != null) {
            property = setPropertyValue_LoginOriginator_CIM_FibrePort(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_LOGINORIGINATOR_CIM_FIBREPORT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property LoginOriginator
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_LoginOriginator_CIM_FibrePort(
            CIMProperty currentProperty, CIM_FibrePort newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getCimObjectPath() : null;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property LoginResponder
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_FibrePort get_LoginResponder_CIM_FibrePort(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_LOGINRESPONDER_CIM_FIBREPORT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_LOGINRESPONDER_CIM_FIBREPORT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_FibrePortHelper.getInstance(client, (CIMObjectPath) currentProperty.getValue());

    }

    /**
     * Set the property LoginResponder
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_LoginResponder_CIM_FibrePort(CIM_FibrePort newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_LOGINRESPONDER_CIM_FIBREPORT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_LoginResponder_CIM_FibrePort(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_LOGINRESPONDER_CIM_FIBREPORT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property LoginResponder by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_LoginResponder_CIM_FibrePort(WBEMClient client,
            String namespace, CIM_FibrePort newValue) throws WbemsmtException {
        CIM_FibrePortActiveLogin fco = new CIM_FibrePortActiveLogin(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_LOGINRESPONDER_CIM_FIBREPORT.NAME);
        if (property != null) {
            property = setPropertyValue_LoginResponder_CIM_FibrePort(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_LOGINRESPONDER_CIM_FIBREPORT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property LoginResponder
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_LoginResponder_CIM_FibrePort(
            CIMProperty currentProperty, CIM_FibrePort newValue) {
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
        if (!(object instanceof CIM_FibrePortActiveLogin)) {
            return false;
        }

        return super.equals(object);
    }

    /**
     * return the name of the CIMClass
     * @return
     */
    public String getObjectName() {
        return CIM_FibrePortActiveLogin.CIM_CLASS_NAME;
    }

}