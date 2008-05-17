/** 
 * CIM_Chip.java
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
 * Description: The Chip class represents any type of integrated circuit hardware, including ASICs, processors, memory chips, etc.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_Chip extends CIM_PhysicalComponent {

    public final static String CIM_CLASS_NAME = "CIM_Chip";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property FormFactor
     * The implementation form factor for the Chip. For example, values such as SIMM (7), TSOP (9) or PGA (10) can be specified.
     */
    public static class PROPERTY_FORMFACTOR {
        /**
         * name of the property FormFactor
         */
        public final static String NAME = "FormFactor";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_SIP = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry SIP (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_SIP = "SIP";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_DIP = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry DIP (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_DIP = "DIP";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_ZIP = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry ZIP (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_ZIP = "ZIP";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_SOJ = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry SOJ (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_SOJ = "SOJ";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Proprietary = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry Proprietary (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Proprietary = "Proprietary";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_SIMM = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry SIMM (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_SIMM = "SIMM";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_DIMM = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry DIMM (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_DIMM = "DIMM";

        /**
         * constant for value map entry 9
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_TSOP = new javax.cim.UnsignedInteger16(
                "9");

        /**
         * constant for value entry TSOP (corresponds to mapEntry 9 )
         */
        public final static String VALUE_ENTRY_TSOP = "TSOP";

        /**
         * constant for value map entry 10
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_PGA = new javax.cim.UnsignedInteger16(
                "10");

        /**
         * constant for value entry PGA (corresponds to mapEntry 10 )
         */
        public final static String VALUE_ENTRY_PGA = "PGA";

        /**
         * constant for value map entry 11
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_RIMM = new javax.cim.UnsignedInteger16(
                "11");

        /**
         * constant for value entry RIMM (corresponds to mapEntry 11 )
         */
        public final static String VALUE_ENTRY_RIMM = "RIMM";

        /**
         * constant for value map entry 12
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_SODIMM = new javax.cim.UnsignedInteger16(
                "12");

        /**
         * constant for value entry SODIMM (corresponds to mapEntry 12 )
         */
        public final static String VALUE_ENTRY_SODIMM = "SODIMM";

        /**
         * constant for value map entry 13
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_SRIMM = new javax.cim.UnsignedInteger16(
                "13");

        /**
         * constant for value entry SRIMM (corresponds to mapEntry 13 )
         */
        public final static String VALUE_ENTRY_SRIMM = "SRIMM";

        /**
         * constant for value map entry 14
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_SMD = new javax.cim.UnsignedInteger16(
                "14");

        /**
         * constant for value entry SMD (corresponds to mapEntry 14 )
         */
        public final static String VALUE_ENTRY_SMD = "SMD";

        /**
         * constant for value map entry 15
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_SSMP = new javax.cim.UnsignedInteger16(
                "15");

        /**
         * constant for value entry SSMP (corresponds to mapEntry 15 )
         */
        public final static String VALUE_ENTRY_SSMP = "SSMP";

        /**
         * constant for value map entry 16
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_QFP = new javax.cim.UnsignedInteger16(
                "16");

        /**
         * constant for value entry QFP (corresponds to mapEntry 16 )
         */
        public final static String VALUE_ENTRY_QFP = "QFP";

        /**
         * constant for value map entry 17
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_TQFP = new javax.cim.UnsignedInteger16(
                "17");

        /**
         * constant for value entry TQFP (corresponds to mapEntry 17 )
         */
        public final static String VALUE_ENTRY_TQFP = "TQFP";

        /**
         * constant for value map entry 18
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_SOIC = new javax.cim.UnsignedInteger16(
                "18");

        /**
         * constant for value entry SOIC (corresponds to mapEntry 18 )
         */
        public final static String VALUE_ENTRY_SOIC = "SOIC";

        /**
         * constant for value map entry 19
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_LCC = new javax.cim.UnsignedInteger16(
                "19");

        /**
         * constant for value entry LCC (corresponds to mapEntry 19 )
         */
        public final static String VALUE_ENTRY_LCC = "LCC";

        /**
         * constant for value map entry 20
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_PLCC = new javax.cim.UnsignedInteger16(
                "20");

        /**
         * constant for value entry PLCC (corresponds to mapEntry 20 )
         */
        public final static String VALUE_ENTRY_PLCC = "PLCC";

        /**
         * constant for value map entry 21
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_BGA = new javax.cim.UnsignedInteger16(
                "21");

        /**
         * constant for value entry BGA (corresponds to mapEntry 21 )
         */
        public final static String VALUE_ENTRY_BGA = "BGA";

        /**
         * constant for value map entry 22
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_FPBGA = new javax.cim.UnsignedInteger16(
                "22");

        /**
         * constant for value entry FPBGA (corresponds to mapEntry 22 )
         */
        public final static String VALUE_ENTRY_FPBGA = "FPBGA";

        /**
         * constant for value map entry 23
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_LGA = new javax.cim.UnsignedInteger16(
                "23");

        /**
         * constant for value entry LGA (corresponds to mapEntry 23 )
         */
        public final static String VALUE_ENTRY_LGA = "LGA";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@4b564b56
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_SIP.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_SIP;
            }

            if (VALUE_ENTRY_DIP.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_DIP;
            }

            if (VALUE_ENTRY_ZIP.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_ZIP;
            }

            if (VALUE_ENTRY_SOJ.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_SOJ;
            }

            if (VALUE_ENTRY_Proprietary.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Proprietary;
            }

            if (VALUE_ENTRY_SIMM.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_SIMM;
            }

            if (VALUE_ENTRY_DIMM.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_DIMM;
            }

            if (VALUE_ENTRY_TSOP.equals(value)) {
                return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_TSOP;
            }

            if (VALUE_ENTRY_PGA.equals(value)) {
                return VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_PGA;
            }

            if (VALUE_ENTRY_RIMM.equals(value)) {
                return VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_RIMM;
            }

            if (VALUE_ENTRY_SODIMM.equals(value)) {
                return VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_SODIMM;
            }

            if (VALUE_ENTRY_SRIMM.equals(value)) {
                return VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_SRIMM;
            }

            if (VALUE_ENTRY_SMD.equals(value)) {
                return VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_SMD;
            }

            if (VALUE_ENTRY_SSMP.equals(value)) {
                return VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_SSMP;
            }

            if (VALUE_ENTRY_QFP.equals(value)) {
                return VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_QFP;
            }

            if (VALUE_ENTRY_TQFP.equals(value)) {
                return VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_TQFP;
            }

            if (VALUE_ENTRY_SOIC.equals(value)) {
                return VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_SOIC;
            }

            if (VALUE_ENTRY_LCC.equals(value)) {
                return VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_LCC;
            }

            if (VALUE_ENTRY_PLCC.equals(value)) {
                return VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_PLCC;
            }

            if (VALUE_ENTRY_BGA.equals(value)) {
                return VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_BGA;
            }

            if (VALUE_ENTRY_FPBGA.equals(value)) {
                return VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_FPBGA;
            }

            if (VALUE_ENTRY_LGA.equals(value)) {
                return VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_LGA;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_SIP.intValue()) {
                return VALUE_ENTRY_SIP;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_DIP.intValue()) {
                return VALUE_ENTRY_DIP;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_ZIP.intValue()) {
                return VALUE_ENTRY_ZIP;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_SOJ.intValue()) {
                return VALUE_ENTRY_SOJ;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Proprietary.intValue()) {
                return VALUE_ENTRY_Proprietary;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_SIMM.intValue()) {
                return VALUE_ENTRY_SIMM;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_DIMM.intValue()) {
                return VALUE_ENTRY_DIMM;
            }

            if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_TSOP.intValue()) {
                return VALUE_ENTRY_TSOP;
            }

            if (iValue == VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_PGA.intValue()) {
                return VALUE_ENTRY_PGA;
            }

            if (iValue == VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_RIMM.intValue()) {
                return VALUE_ENTRY_RIMM;
            }

            if (iValue == VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_SODIMM.intValue()) {
                return VALUE_ENTRY_SODIMM;
            }

            if (iValue == VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_SRIMM.intValue()) {
                return VALUE_ENTRY_SRIMM;
            }

            if (iValue == VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_SMD.intValue()) {
                return VALUE_ENTRY_SMD;
            }

            if (iValue == VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_SSMP.intValue()) {
                return VALUE_ENTRY_SSMP;
            }

            if (iValue == VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_QFP.intValue()) {
                return VALUE_ENTRY_QFP;
            }

            if (iValue == VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_TQFP.intValue()) {
                return VALUE_ENTRY_TQFP;
            }

            if (iValue == VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_SOIC.intValue()) {
                return VALUE_ENTRY_SOIC;
            }

            if (iValue == VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_LCC.intValue()) {
                return VALUE_ENTRY_LCC;
            }

            if (iValue == VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_PLCC.intValue()) {
                return VALUE_ENTRY_PLCC;
            }

            if (iValue == VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_BGA.intValue()) {
                return VALUE_ENTRY_BGA;
            }

            if (iValue == VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_FPBGA.intValue()) {
                return VALUE_ENTRY_FPBGA;
            }

            if (iValue == VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_LGA.intValue()) {
                return VALUE_ENTRY_LGA;
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
         * Value Map for the property FormFactor   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_SIP, VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_DIP,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_ZIP, VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_SOJ,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Proprietary,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_SIMM, VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_DIMM,
                VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_TSOP, VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_PGA,
                VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_RIMM, VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_SODIMM,
                VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_SRIMM, VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_SMD,
                VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_SSMP, VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_QFP,
                VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_TQFP, VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_SOIC,
                VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_LCC, VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_PLCC,
                VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_BGA, VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_FPBGA,
                VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_LGA };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property FormFactor   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_SIP, VALUE_ENTRY_DIP, VALUE_ENTRY_ZIP, VALUE_ENTRY_SOJ,
                VALUE_ENTRY_Proprietary, VALUE_ENTRY_SIMM, VALUE_ENTRY_DIMM, VALUE_ENTRY_TSOP,
                VALUE_ENTRY_PGA, VALUE_ENTRY_RIMM, VALUE_ENTRY_SODIMM, VALUE_ENTRY_SRIMM,
                VALUE_ENTRY_SMD, VALUE_ENTRY_SSMP, VALUE_ENTRY_QFP, VALUE_ENTRY_TQFP,
                VALUE_ENTRY_SOIC, VALUE_ENTRY_LCC, VALUE_ENTRY_PLCC, VALUE_ENTRY_BGA,
                VALUE_ENTRY_FPBGA, VALUE_ENTRY_LGA };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property FormFactor   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_SIP, VALUE_ENTRY_DIP, VALUE_ENTRY_ZIP,
                VALUE_ENTRY_SOJ, VALUE_ENTRY_Proprietary, VALUE_ENTRY_SIMM, VALUE_ENTRY_DIMM,
                VALUE_ENTRY_TSOP, VALUE_ENTRY_PGA, VALUE_ENTRY_RIMM, VALUE_ENTRY_SODIMM,
                VALUE_ENTRY_SRIMM, VALUE_ENTRY_SMD, VALUE_ENTRY_SSMP, VALUE_ENTRY_QFP,
                VALUE_ENTRY_TQFP, VALUE_ENTRY_SOIC, VALUE_ENTRY_LCC, VALUE_ENTRY_PLCC,
                VALUE_ENTRY_BGA, VALUE_ENTRY_FPBGA, VALUE_ENTRY_LGA };

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_PhysicalComponent.getPackages();

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
     *   The Chip class represents any type of integrated circuit hardware, including ASICs, processors, memory chips, etc.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_Chip(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   The Chip class represents any type of integrated circuit hardware, including ASICs, processors, memory chips, etc.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_Chip(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_Chip() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("FormFactor", new CIMProperty("FormFactor", CIMDataType.UINT16_T,
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
     * Get the property FormFactor
     *     * <br>
     * The implementation form factor for the Chip. For example, values such as SIMM (7), TSOP (9) or PGA (10) can be specified.
     *     */

    public javax.cim.UnsignedInteger16 get_FormFactor() {
        CIMProperty currentProperty = getProperty(PROPERTY_FORMFACTOR.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_FORMFACTOR.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property FormFactor
     * <br>
     * The implementation form factor for the Chip. For example, values such as SIMM (7), TSOP (9) or PGA (10) can be specified.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_FormFactor(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_FORMFACTOR.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_FormFactor(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_FORMFACTOR.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property FormFactor by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_FormFactor(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_Chip fco = new CIM_Chip(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_FORMFACTOR.NAME);
        if (property != null) {
            property = setPropertyValue_FormFactor(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_FORMFACTOR.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property FormFactor
     * <br>
     * The implementation form factor for the Chip. For example, values such as SIMM (7), TSOP (9) or PGA (10) can be specified.
     */

    private static CIMProperty setPropertyValue_FormFactor(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
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
        return CIM_Chip.CIM_CLASS_NAME;
    }

}