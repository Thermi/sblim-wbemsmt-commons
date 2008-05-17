/** 
 * CIM_TokenRingPortStatistics.java
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
 * Description: The TokenRingPortStatistics class describes the statistics for the TokenRingPort.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_TokenRingPortStatistics extends CIM_NetworkPortStatistics {

    public final static String CIM_CLASS_NAME = "CIM_TokenRingPortStatistics";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property ACErrors
     * This counter is incremented when a station receives an AMP or SMP frame in which A is equal to C is equal to 0, and then receives another SMP frame with A equal to C equal to 0 without first receiving an AMP frame. It denotes a station that cannot set the AC bits properly.
     */
    public static class PROPERTY_ACERRORS {
        /**
         * name of the property ACErrors
         */
        public final static String NAME = "ACErrors";

    }

    /**
     * Constants of property AbortTransErrors
     * This counter is incremented when a station transmits an abort delimiter while transmitting data.
     */
    public static class PROPERTY_ABORTTRANSERRORS {
        /**
         * name of the property AbortTransErrors
         */
        public final static String NAME = "AbortTransErrors";

    }

    /**
     * Constants of property BurstErrors
     * This counter is incremented when a station detects the absence of transitions for five half-bit timers (burst-five errors).
     */
    public static class PROPERTY_BURSTERRORS {
        /**
         * name of the property BurstErrors
         */
        public final static String NAME = "BurstErrors";

    }

    /**
     * Constants of property FrameCopiedErrors
     * This counter is incremented when a station recognizes a frame addressed to its specific address and detects that the FS field A bits are set to 1 indicating a possible line hit or duplicate address.
     */
    public static class PROPERTY_FRAMECOPIEDERRORS {
        /**
         * name of the property FrameCopiedErrors
         */
        public final static String NAME = "FrameCopiedErrors";

    }

    /**
     * Constants of property FrequencyErrors
     * The number of times the Device has detected that the frequency of the incoming signal differs from the expected frequency by more than that specified by the IEEE 802.5 standard.
     */
    public static class PROPERTY_FREQUENCYERRORS {
        /**
         * name of the property FrequencyErrors
         */
        public final static String NAME = "FrequencyErrors";

    }

    /**
     * Constants of property HardErrors
     * The number of times this Device has detected an immediately recoverable fatal error. It denotes the number of times this Device is either transmitting or receiving beacon MAC frames.
     */
    public static class PROPERTY_HARDERRORS {
        /**
         * name of the property HardErrors
         */
        public final static String NAME = "HardErrors";

    }

    /**
     * Constants of property InternalErrors
     * This counter is incremented when a station recognizes an internal error.
     */
    public static class PROPERTY_INTERNALERRORS {
        /**
         * name of the property InternalErrors
         */
        public final static String NAME = "InternalErrors";

    }

    /**
     * Constants of property LobeWires
     * The number of times the Device has detected an open or short circuit in the lobe data path. The port will be closed and RingState will signify this condition.
     */
    public static class PROPERTY_LOBEWIRES {
        /**
         * name of the property LobeWires
         */
        public final static String NAME = "LobeWires";

    }

    /**
     * Constants of property LostFrameErrors
     * This counter is incremented when a station is transmitting and its TRR timer expires. This denotes a condition where a transmitting station in strip mode does not receive the trailer of the frame before the TRR timer goes off.
     */
    public static class PROPERTY_LOSTFRAMEERRORS {
        /**
         * name of the property LostFrameErrors
         */
        public final static String NAME = "LostFrameErrors";

    }

    /**
     * Constants of property ReceiveCongestions
     * This counter is incremented when a station recognizes a frame addressed to its specific address, but has no available buffer space - indicating that the station is congested.
     */
    public static class PROPERTY_RECEIVECONGESTIONS {
        /**
         * name of the property ReceiveCongestions
         */
        public final static String NAME = "ReceiveCongestions";

    }

    /**
     * Constants of property Recoverys
     * The number of Claim Token MAC frames received or transmitted after the Device has received a Ring Purge MAC frame. This counter signifies the number of times the ring has been purged and is being recovered back into a normal operating state.
     */
    public static class PROPERTY_RECOVERYS {
        /**
         * name of the property Recoverys
         */
        public final static String NAME = "Recoverys";

    }

    /**
     * Constants of property Removes
     * The number of times the Device has received a Remove Ring Station MAC frame request. When this frame is received, the Device will enter the close state and RingState will signify this condition.
     */
    public static class PROPERTY_REMOVES {
        /**
         * name of the property Removes
         */
        public final static String NAME = "Removes";

    }

    /**
     * Constants of property SignalLossCount
     * The number of times this Device has detected the loss of signal condition from the ring.
     */
    public static class PROPERTY_SIGNALLOSSCOUNT {
        /**
         * name of the property SignalLossCount
         */
        public final static String NAME = "SignalLossCount";

    }

    /**
     * Constants of property Singles
     * The number of times the Device has sensed that it is the only station on the ring. This will happen if the Device is the first one up on a ring, or if there is a hardware problem.
     */
    public static class PROPERTY_SINGLES {
        /**
         * name of the property Singles
         */
        public final static String NAME = "Singles";

    }

    /**
     * Constants of property SoftErrors
     * The number of Soft Errors that the Device has detected. It directly corresponds to the number of Report Error MAC frames that this Device has transmitted. Soft Errors are those which are recoverable by the MAC layer protocols.
     */
    public static class PROPERTY_SOFTERRORS {
        /**
         * name of the property SoftErrors
         */
        public final static String NAME = "SoftErrors";

    }

    /**
     * Constants of property TokenErrors
     * This counter is incremented when a station acting as the active monitor recognizes an error condition that needs a token transmitted.
     */
    public static class PROPERTY_TOKENERRORS {
        /**
         * name of the property TokenErrors
         */
        public final static String NAME = "TokenErrors";

    }

    /**
     * Constants of property TransmittedBeacons
     * The number of times this Device has transmitted a beacon frame.
     */
    public static class PROPERTY_TRANSMITTEDBEACONS {
        /**
         * name of the property TransmittedBeacons
         */
        public final static String NAME = "TransmittedBeacons";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_NetworkPortStatistics.getPackages();

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
     *   The TokenRingPortStatistics class describes the statistics for the TokenRingPort.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_TokenRingPortStatistics(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   The TokenRingPortStatistics class describes the statistics for the TokenRingPort.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_TokenRingPortStatistics(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_TokenRingPortStatistics() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("ACErrors", new CIMProperty("ACErrors", CIMDataType.UINT32_T, null));
        propertiesToCheck.put("AbortTransErrors", new CIMProperty("AbortTransErrors",
                CIMDataType.UINT32_T, null));
        propertiesToCheck.put("BurstErrors", new CIMProperty("BurstErrors", CIMDataType.UINT32_T,
                null));
        propertiesToCheck.put("FrameCopiedErrors", new CIMProperty("FrameCopiedErrors",
                CIMDataType.UINT32_T, null));
        propertiesToCheck.put("FrequencyErrors", new CIMProperty("FrequencyErrors",
                CIMDataType.UINT32_T, null));
        propertiesToCheck.put("HardErrors", new CIMProperty("HardErrors", CIMDataType.UINT32_T,
                null));
        propertiesToCheck.put("InternalErrors", new CIMProperty("InternalErrors",
                CIMDataType.UINT32_T, null));
        propertiesToCheck
                .put("LobeWires", new CIMProperty("LobeWires", CIMDataType.UINT32_T, null));
        propertiesToCheck.put("LostFrameErrors", new CIMProperty("LostFrameErrors",
                CIMDataType.UINT32_T, null));
        propertiesToCheck.put("ReceiveCongestions", new CIMProperty("ReceiveCongestions",
                CIMDataType.UINT32_T, null));
        propertiesToCheck
                .put("Recoverys", new CIMProperty("Recoverys", CIMDataType.UINT32_T, null));
        propertiesToCheck.put("Removes", new CIMProperty("Removes", CIMDataType.UINT32_T, null));
        propertiesToCheck.put("SignalLossCount", new CIMProperty("SignalLossCount",
                CIMDataType.UINT32_T, null));
        propertiesToCheck.put("Singles", new CIMProperty("Singles", CIMDataType.UINT32_T, null));
        propertiesToCheck.put("SoftErrors", new CIMProperty("SoftErrors", CIMDataType.UINT32_T,
                null));
        propertiesToCheck.put("TokenErrors", new CIMProperty("TokenErrors", CIMDataType.UINT32_T,
                null));
        propertiesToCheck.put("TransmittedBeacons", new CIMProperty("TransmittedBeacons",
                CIMDataType.UINT32_T, null));

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
     * Get the property ACErrors
     *     * <br>
     * This counter is incremented when a station receives an AMP or SMP frame in which A is equal to C is equal to 0, and then receives another SMP frame with A equal to C equal to 0 without first receiving an AMP frame. It denotes a station that cannot set the AC bits properly.
     *     */

    public javax.cim.UnsignedInteger32 get_ACErrors() {
        CIMProperty currentProperty = getProperty(PROPERTY_ACERRORS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ACERRORS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property ACErrors
     * <br>
     * This counter is incremented when a station receives an AMP or SMP frame in which A is equal to C is equal to 0, and then receives another SMP frame with A equal to C equal to 0 without first receiving an AMP frame. It denotes a station that cannot set the AC bits properly.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ACErrors(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ACERRORS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ACErrors(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ACERRORS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ACErrors by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ACErrors(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_TokenRingPortStatistics fco = new CIM_TokenRingPortStatistics(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ACERRORS.NAME);
        if (property != null) {
            property = setPropertyValue_ACErrors(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ACERRORS.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ACErrors
     * <br>
     * This counter is incremented when a station receives an AMP or SMP frame in which A is equal to C is equal to 0, and then receives another SMP frame with A equal to C equal to 0 without first receiving an AMP frame. It denotes a station that cannot set the AC bits properly.
     */

    private static CIMProperty setPropertyValue_ACErrors(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property AbortTransErrors
     *     * <br>
     * This counter is incremented when a station transmits an abort delimiter while transmitting data.
     *     */

    public javax.cim.UnsignedInteger32 get_AbortTransErrors() {
        CIMProperty currentProperty = getProperty(PROPERTY_ABORTTRANSERRORS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ABORTTRANSERRORS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property AbortTransErrors
     * <br>
     * This counter is incremented when a station transmits an abort delimiter while transmitting data.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_AbortTransErrors(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ABORTTRANSERRORS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_AbortTransErrors(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ABORTTRANSERRORS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property AbortTransErrors by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_AbortTransErrors(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_TokenRingPortStatistics fco = new CIM_TokenRingPortStatistics(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ABORTTRANSERRORS.NAME);
        if (property != null) {
            property = setPropertyValue_AbortTransErrors(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ABORTTRANSERRORS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property AbortTransErrors
     * <br>
     * This counter is incremented when a station transmits an abort delimiter while transmitting data.
     */

    private static CIMProperty setPropertyValue_AbortTransErrors(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property BurstErrors
     *     * <br>
     * This counter is incremented when a station detects the absence of transitions for five half-bit timers (burst-five errors).
     *     */

    public javax.cim.UnsignedInteger32 get_BurstErrors() {
        CIMProperty currentProperty = getProperty(PROPERTY_BURSTERRORS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_BURSTERRORS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property BurstErrors
     * <br>
     * This counter is incremented when a station detects the absence of transitions for five half-bit timers (burst-five errors).
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_BurstErrors(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_BURSTERRORS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_BurstErrors(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_BURSTERRORS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property BurstErrors by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_BurstErrors(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_TokenRingPortStatistics fco = new CIM_TokenRingPortStatistics(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_BURSTERRORS.NAME);
        if (property != null) {
            property = setPropertyValue_BurstErrors(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_BURSTERRORS.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property BurstErrors
     * <br>
     * This counter is incremented when a station detects the absence of transitions for five half-bit timers (burst-five errors).
     */

    private static CIMProperty setPropertyValue_BurstErrors(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property FrameCopiedErrors
     *     * <br>
     * This counter is incremented when a station recognizes a frame addressed to its specific address and detects that the FS field A bits are set to 1 indicating a possible line hit or duplicate address.
     *     */

    public javax.cim.UnsignedInteger32 get_FrameCopiedErrors() {
        CIMProperty currentProperty = getProperty(PROPERTY_FRAMECOPIEDERRORS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_FRAMECOPIEDERRORS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property FrameCopiedErrors
     * <br>
     * This counter is incremented when a station recognizes a frame addressed to its specific address and detects that the FS field A bits are set to 1 indicating a possible line hit or duplicate address.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_FrameCopiedErrors(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_FRAMECOPIEDERRORS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_FrameCopiedErrors(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_FRAMECOPIEDERRORS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property FrameCopiedErrors by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_FrameCopiedErrors(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_TokenRingPortStatistics fco = new CIM_TokenRingPortStatistics(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_FRAMECOPIEDERRORS.NAME);
        if (property != null) {
            property = setPropertyValue_FrameCopiedErrors(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_FRAMECOPIEDERRORS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property FrameCopiedErrors
     * <br>
     * This counter is incremented when a station recognizes a frame addressed to its specific address and detects that the FS field A bits are set to 1 indicating a possible line hit or duplicate address.
     */

    private static CIMProperty setPropertyValue_FrameCopiedErrors(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property FrequencyErrors
     *     * <br>
     * The number of times the Device has detected that the frequency of the incoming signal differs from the expected frequency by more than that specified by the IEEE 802.5 standard.
     *     */

    public javax.cim.UnsignedInteger32 get_FrequencyErrors() {
        CIMProperty currentProperty = getProperty(PROPERTY_FREQUENCYERRORS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_FREQUENCYERRORS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property FrequencyErrors
     * <br>
     * The number of times the Device has detected that the frequency of the incoming signal differs from the expected frequency by more than that specified by the IEEE 802.5 standard.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_FrequencyErrors(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_FREQUENCYERRORS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_FrequencyErrors(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_FREQUENCYERRORS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property FrequencyErrors by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_FrequencyErrors(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_TokenRingPortStatistics fco = new CIM_TokenRingPortStatistics(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_FREQUENCYERRORS.NAME);
        if (property != null) {
            property = setPropertyValue_FrequencyErrors(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_FREQUENCYERRORS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property FrequencyErrors
     * <br>
     * The number of times the Device has detected that the frequency of the incoming signal differs from the expected frequency by more than that specified by the IEEE 802.5 standard.
     */

    private static CIMProperty setPropertyValue_FrequencyErrors(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property HardErrors
     *     * <br>
     * The number of times this Device has detected an immediately recoverable fatal error. It denotes the number of times this Device is either transmitting or receiving beacon MAC frames.
     *     */

    public javax.cim.UnsignedInteger32 get_HardErrors() {
        CIMProperty currentProperty = getProperty(PROPERTY_HARDERRORS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_HARDERRORS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property HardErrors
     * <br>
     * The number of times this Device has detected an immediately recoverable fatal error. It denotes the number of times this Device is either transmitting or receiving beacon MAC frames.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_HardErrors(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_HARDERRORS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_HardErrors(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_HARDERRORS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property HardErrors by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_HardErrors(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_TokenRingPortStatistics fco = new CIM_TokenRingPortStatistics(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_HARDERRORS.NAME);
        if (property != null) {
            property = setPropertyValue_HardErrors(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_HARDERRORS.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property HardErrors
     * <br>
     * The number of times this Device has detected an immediately recoverable fatal error. It denotes the number of times this Device is either transmitting or receiving beacon MAC frames.
     */

    private static CIMProperty setPropertyValue_HardErrors(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property InternalErrors
     *     * <br>
     * This counter is incremented when a station recognizes an internal error.
     *     */

    public javax.cim.UnsignedInteger32 get_InternalErrors() {
        CIMProperty currentProperty = getProperty(PROPERTY_INTERNALERRORS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_INTERNALERRORS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property InternalErrors
     * <br>
     * This counter is incremented when a station recognizes an internal error.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_InternalErrors(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_INTERNALERRORS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_InternalErrors(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_INTERNALERRORS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property InternalErrors by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_InternalErrors(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_TokenRingPortStatistics fco = new CIM_TokenRingPortStatistics(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_INTERNALERRORS.NAME);
        if (property != null) {
            property = setPropertyValue_InternalErrors(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_INTERNALERRORS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property InternalErrors
     * <br>
     * This counter is incremented when a station recognizes an internal error.
     */

    private static CIMProperty setPropertyValue_InternalErrors(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property LobeWires
     *     * <br>
     * The number of times the Device has detected an open or short circuit in the lobe data path. The port will be closed and RingState will signify this condition.
     *     */

    public javax.cim.UnsignedInteger32 get_LobeWires() {
        CIMProperty currentProperty = getProperty(PROPERTY_LOBEWIRES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_LOBEWIRES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property LobeWires
     * <br>
     * The number of times the Device has detected an open or short circuit in the lobe data path. The port will be closed and RingState will signify this condition.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_LobeWires(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_LOBEWIRES.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_LobeWires(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_LOBEWIRES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property LobeWires by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_LobeWires(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_TokenRingPortStatistics fco = new CIM_TokenRingPortStatistics(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_LOBEWIRES.NAME);
        if (property != null) {
            property = setPropertyValue_LobeWires(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_LOBEWIRES.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property LobeWires
     * <br>
     * The number of times the Device has detected an open or short circuit in the lobe data path. The port will be closed and RingState will signify this condition.
     */

    private static CIMProperty setPropertyValue_LobeWires(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property LostFrameErrors
     *     * <br>
     * This counter is incremented when a station is transmitting and its TRR timer expires. This denotes a condition where a transmitting station in strip mode does not receive the trailer of the frame before the TRR timer goes off.
     *     */

    public javax.cim.UnsignedInteger32 get_LostFrameErrors() {
        CIMProperty currentProperty = getProperty(PROPERTY_LOSTFRAMEERRORS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_LOSTFRAMEERRORS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property LostFrameErrors
     * <br>
     * This counter is incremented when a station is transmitting and its TRR timer expires. This denotes a condition where a transmitting station in strip mode does not receive the trailer of the frame before the TRR timer goes off.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_LostFrameErrors(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_LOSTFRAMEERRORS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_LostFrameErrors(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_LOSTFRAMEERRORS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property LostFrameErrors by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_LostFrameErrors(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_TokenRingPortStatistics fco = new CIM_TokenRingPortStatistics(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_LOSTFRAMEERRORS.NAME);
        if (property != null) {
            property = setPropertyValue_LostFrameErrors(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_LOSTFRAMEERRORS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property LostFrameErrors
     * <br>
     * This counter is incremented when a station is transmitting and its TRR timer expires. This denotes a condition where a transmitting station in strip mode does not receive the trailer of the frame before the TRR timer goes off.
     */

    private static CIMProperty setPropertyValue_LostFrameErrors(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ReceiveCongestions
     *     * <br>
     * This counter is incremented when a station recognizes a frame addressed to its specific address, but has no available buffer space - indicating that the station is congested.
     *     */

    public javax.cim.UnsignedInteger32 get_ReceiveCongestions() {
        CIMProperty currentProperty = getProperty(PROPERTY_RECEIVECONGESTIONS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_RECEIVECONGESTIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property ReceiveCongestions
     * <br>
     * This counter is incremented when a station recognizes a frame addressed to its specific address, but has no available buffer space - indicating that the station is congested.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ReceiveCongestions(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_RECEIVECONGESTIONS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ReceiveCongestions(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_RECEIVECONGESTIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ReceiveCongestions by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ReceiveCongestions(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_TokenRingPortStatistics fco = new CIM_TokenRingPortStatistics(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_RECEIVECONGESTIONS.NAME);
        if (property != null) {
            property = setPropertyValue_ReceiveCongestions(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_RECEIVECONGESTIONS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ReceiveCongestions
     * <br>
     * This counter is incremented when a station recognizes a frame addressed to its specific address, but has no available buffer space - indicating that the station is congested.
     */

    private static CIMProperty setPropertyValue_ReceiveCongestions(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Recoverys
     *     * <br>
     * The number of Claim Token MAC frames received or transmitted after the Device has received a Ring Purge MAC frame. This counter signifies the number of times the ring has been purged and is being recovered back into a normal operating state.
     *     */

    public javax.cim.UnsignedInteger32 get_Recoverys() {
        CIMProperty currentProperty = getProperty(PROPERTY_RECOVERYS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_RECOVERYS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property Recoverys
     * <br>
     * The number of Claim Token MAC frames received or transmitted after the Device has received a Ring Purge MAC frame. This counter signifies the number of times the ring has been purged and is being recovered back into a normal operating state.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Recoverys(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_RECOVERYS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Recoverys(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_RECOVERYS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Recoverys by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Recoverys(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_TokenRingPortStatistics fco = new CIM_TokenRingPortStatistics(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_RECOVERYS.NAME);
        if (property != null) {
            property = setPropertyValue_Recoverys(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_RECOVERYS.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Recoverys
     * <br>
     * The number of Claim Token MAC frames received or transmitted after the Device has received a Ring Purge MAC frame. This counter signifies the number of times the ring has been purged and is being recovered back into a normal operating state.
     */

    private static CIMProperty setPropertyValue_Recoverys(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Removes
     *     * <br>
     * The number of times the Device has received a Remove Ring Station MAC frame request. When this frame is received, the Device will enter the close state and RingState will signify this condition.
     *     */

    public javax.cim.UnsignedInteger32 get_Removes() {
        CIMProperty currentProperty = getProperty(PROPERTY_REMOVES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_REMOVES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property Removes
     * <br>
     * The number of times the Device has received a Remove Ring Station MAC frame request. When this frame is received, the Device will enter the close state and RingState will signify this condition.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Removes(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_REMOVES.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Removes(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_REMOVES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Removes by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Removes(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_TokenRingPortStatistics fco = new CIM_TokenRingPortStatistics(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_REMOVES.NAME);
        if (property != null) {
            property = setPropertyValue_Removes(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_REMOVES.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Removes
     * <br>
     * The number of times the Device has received a Remove Ring Station MAC frame request. When this frame is received, the Device will enter the close state and RingState will signify this condition.
     */

    private static CIMProperty setPropertyValue_Removes(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property SignalLossCount
     *     * <br>
     * The number of times this Device has detected the loss of signal condition from the ring.
     *     */

    public javax.cim.UnsignedInteger32 get_SignalLossCount() {
        CIMProperty currentProperty = getProperty(PROPERTY_SIGNALLOSSCOUNT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SIGNALLOSSCOUNT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property SignalLossCount
     * <br>
     * The number of times this Device has detected the loss of signal condition from the ring.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_SignalLossCount(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SIGNALLOSSCOUNT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_SignalLossCount(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SIGNALLOSSCOUNT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SignalLossCount by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SignalLossCount(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_TokenRingPortStatistics fco = new CIM_TokenRingPortStatistics(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SIGNALLOSSCOUNT.NAME);
        if (property != null) {
            property = setPropertyValue_SignalLossCount(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SIGNALLOSSCOUNT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SignalLossCount
     * <br>
     * The number of times this Device has detected the loss of signal condition from the ring.
     */

    private static CIMProperty setPropertyValue_SignalLossCount(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Singles
     *     * <br>
     * The number of times the Device has sensed that it is the only station on the ring. This will happen if the Device is the first one up on a ring, or if there is a hardware problem.
     *     */

    public javax.cim.UnsignedInteger32 get_Singles() {
        CIMProperty currentProperty = getProperty(PROPERTY_SINGLES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SINGLES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property Singles
     * <br>
     * The number of times the Device has sensed that it is the only station on the ring. This will happen if the Device is the first one up on a ring, or if there is a hardware problem.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Singles(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SINGLES.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Singles(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SINGLES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Singles by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Singles(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_TokenRingPortStatistics fco = new CIM_TokenRingPortStatistics(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SINGLES.NAME);
        if (property != null) {
            property = setPropertyValue_Singles(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SINGLES.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Singles
     * <br>
     * The number of times the Device has sensed that it is the only station on the ring. This will happen if the Device is the first one up on a ring, or if there is a hardware problem.
     */

    private static CIMProperty setPropertyValue_Singles(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property SoftErrors
     *     * <br>
     * The number of Soft Errors that the Device has detected. It directly corresponds to the number of Report Error MAC frames that this Device has transmitted. Soft Errors are those which are recoverable by the MAC layer protocols.
     *     */

    public javax.cim.UnsignedInteger32 get_SoftErrors() {
        CIMProperty currentProperty = getProperty(PROPERTY_SOFTERRORS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SOFTERRORS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property SoftErrors
     * <br>
     * The number of Soft Errors that the Device has detected. It directly corresponds to the number of Report Error MAC frames that this Device has transmitted. Soft Errors are those which are recoverable by the MAC layer protocols.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_SoftErrors(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SOFTERRORS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_SoftErrors(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SOFTERRORS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SoftErrors by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SoftErrors(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_TokenRingPortStatistics fco = new CIM_TokenRingPortStatistics(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SOFTERRORS.NAME);
        if (property != null) {
            property = setPropertyValue_SoftErrors(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SOFTERRORS.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SoftErrors
     * <br>
     * The number of Soft Errors that the Device has detected. It directly corresponds to the number of Report Error MAC frames that this Device has transmitted. Soft Errors are those which are recoverable by the MAC layer protocols.
     */

    private static CIMProperty setPropertyValue_SoftErrors(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property TokenErrors
     *     * <br>
     * This counter is incremented when a station acting as the active monitor recognizes an error condition that needs a token transmitted.
     *     */

    public javax.cim.UnsignedInteger32 get_TokenErrors() {
        CIMProperty currentProperty = getProperty(PROPERTY_TOKENERRORS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_TOKENERRORS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property TokenErrors
     * <br>
     * This counter is incremented when a station acting as the active monitor recognizes an error condition that needs a token transmitted.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_TokenErrors(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_TOKENERRORS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_TokenErrors(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_TOKENERRORS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property TokenErrors by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_TokenErrors(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_TokenRingPortStatistics fco = new CIM_TokenRingPortStatistics(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_TOKENERRORS.NAME);
        if (property != null) {
            property = setPropertyValue_TokenErrors(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_TOKENERRORS.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property TokenErrors
     * <br>
     * This counter is incremented when a station acting as the active monitor recognizes an error condition that needs a token transmitted.
     */

    private static CIMProperty setPropertyValue_TokenErrors(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property TransmittedBeacons
     *     * <br>
     * The number of times this Device has transmitted a beacon frame.
     *     */

    public javax.cim.UnsignedInteger32 get_TransmittedBeacons() {
        CIMProperty currentProperty = getProperty(PROPERTY_TRANSMITTEDBEACONS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_TRANSMITTEDBEACONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property TransmittedBeacons
     * <br>
     * The number of times this Device has transmitted a beacon frame.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_TransmittedBeacons(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_TRANSMITTEDBEACONS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_TransmittedBeacons(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_TRANSMITTEDBEACONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property TransmittedBeacons by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_TransmittedBeacons(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_TokenRingPortStatistics fco = new CIM_TokenRingPortStatistics(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_TRANSMITTEDBEACONS.NAME);
        if (property != null) {
            property = setPropertyValue_TransmittedBeacons(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_TRANSMITTEDBEACONS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property TransmittedBeacons
     * <br>
     * The number of times this Device has transmitted a beacon frame.
     */

    private static CIMProperty setPropertyValue_TransmittedBeacons(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
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
        return CIM_TokenRingPortStatistics.CIM_CLASS_NAME;
    }

}