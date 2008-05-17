/** 
 * CIM_SoftwareElement.java
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
 * Description: The CIM_SoftwareElement class is used to decompose a CIM_SoftwareFeature object into a set of individually manageable or deployable parts, for a particular platform. A SoftwareElement's platform is uniquely identified by its underlying hardware architecture and operating system (for example Sun Solaris on Sun Sparc or Windows NT on Intel platforms). As such, to understand the details of how the functionality of a particular SoftwareFeature is provided on a particular platform, the CIM_SoftwareElement objects referenced by CIM_SoftwareFeatureSoftwareElements associations are organized in disjoint sets based on the TargetOperatingSystem property. A CIM_SoftwareElement object captures the management details of a part or component in one of four states characterized by the SoftwareElementState property.
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

public class CIM_SoftwareElement extends CIM_LogicalElement {

    public final static String CIM_CLASS_NAME = "CIM_SoftwareElement";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * SoftwareFeatureSoftwareElements identifies the Software Elements that make up a particular SoftwareFeature.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREFEATURESOFTWAREELEMENTS = "CIM_SoftwareFeatureSoftwareElements";

    /**
     * SoftwareElements may have an arbitrarily complex hierarchy. SoftwareElementComponent is used to construct that hierarchy. It should not be used to represent dependency.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREELEMENTCOMPONENT = "CIM_SoftwareElementComponent";

    /**
     * An association between a Service and how it is implemented by one or more executable SoftwareElements. Note that this association is restricted to 'executable' Elements. In earlier phases of deployment, the SoftwareFeatureService Implementation association is adequate and recommended. 
     * The relationship between this association and Software FeatureServiceImplementation is more fully described here. SoftwareElementServiceImplementation allows the description of greater granularity than SoftwareFeatureService Implementation, when a SoftwareFeature is fully deployed and results in several executable Elements. These Elements may implement several different Services. 
     * Since SoftwareFeatures decompose into SoftwareElements, it is possible to describe how software implements a Service by using either this association or the SoftwareFeature ServiceImplementation relationship. One or the other should be chosen. Both associations should not be used for a single Service instance, since their information is redundant. 
     * This relationship is especially important when the SoftwareFeature and Product aspects are not described for a SoftwareElement (ie, when the acquisition and deployment of the software is not detailed). In this case, the Software ElementServiceImplementation association is the only one available to describe how a Service is implemented in software. Since SoftwareFeatures are not instantiated, it is not possible to use the SoftwareFeatureService Implementation association. 
     * The cardinality of this association is many-to-many. A Service may be provided by more than one SoftwareElement. If this is true, it is assumed that the SoftwareElements operate in conjunction. And, any SoftwareElement may provide more than one Service.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREELEMENTSERVICEIMPLEMENTATION = "CIM_SoftwareElementServiceImplementation";

    /**
     * An association between a ServiceAccessPoint and how it is implemented by one or more executable SoftwareElements. Note that this association is restricted to 'executable' Elements. In earlier phases of deployment, the Software FeatureSAPImplementation association is adequate and recommended. 
     * The relationship between this association and Software FeatureSAPImplementation is more fully described here. SoftwareElementSAPImplementation allows the description of greater granularity than SoftwareFeatureSAPImplementation, when a SoftwareFeature is fully deployed and results in several executable Elements. These Elements may implement several different ServiceAccessPoints. 
     * Since SoftwareFeatures decompose into SoftwareElements, it is possible to describe how software implements a SAP by using either this association or the SoftwareFeatureSAP Implementation relationship. One or the other should be chosen. Both associations should not be used for a particular AccessPoint, since their information is redundant. 
     * This relationship is especially important when the SoftwareFeature and Product aspects are not described for a SoftwareElement (ie, when the acquisition and deployment of the software is not detailed). In this case, the Software ElementSAPImplementation association is the only one available to describe how an AccessPoint is implemented in software. Since SoftwareFeatures are not instantiated, it is not possible to use the SoftwareFeatureSAP Implementation association. 
     * The cardinality of this association is many-to-many. A ServiceAccessPoint may be provided by more than one Software Element. (If this is true, it is assumed that the Software Elements operate in conjunction.) And, any SoftwareElement may provide more than one SAP.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREELEMENTSAPIMPLEMENTATION = "CIM_SoftwareElementSAPImplementation";

    /**
     * Constants of property BuildNumber
     * The internal identifier for this compilation of SoftwareElement.
     */
    public static class PROPERTY_BUILDNUMBER {
        /**
         * name of the property BuildNumber
         */
        public final static String NAME = "BuildNumber";

    }

    /**
     * Constants of property CodeSet
     * The code set used by this SoftwareElement. It defines the bit patterns that a system uses to identify characters. ISO defines various code sets such as UTF-8 and ISO8859-1.
     */
    public static class PROPERTY_CODESET {
        /**
         * name of the property CodeSet
         */
        public final static String NAME = "CodeSet";

    }

    /**
     * Constants of property IdentificationCode
     * The manufacturer's identifier for this SoftwareElement. Often this will be a stock keeping unit (SKU) or a part number.
     */
    public static class PROPERTY_IDENTIFICATIONCODE {
        /**
         * name of the property IdentificationCode
         */
        public final static String NAME = "IdentificationCode";

    }

    /**
     * Constants of property LanguageEdition
     * The value of this property identifies the language edition of this SoftwareElement. The language codes defined in ISO 639 should be used. Where the element represents a multi-lingual or international version, the string "Multilingual" should be used.
     */
    public static class PROPERTY_LANGUAGEEDITION {
        /**
         * name of the property LanguageEdition
         */
        public final static String NAME = "LanguageEdition";

    }

    /**
     * Constants of property Manufacturer
     * Manufacturer of this SoftwareElement.
     */
    public static class PROPERTY_MANUFACTURER {
        /**
         * name of the property Manufacturer
         */
        public final static String NAME = "Manufacturer";

    }

    /**
     * Constants of property Name
     * The name used to identify this SoftwareElement.
     */
    public static class PROPERTY_NAME {
        /**
         * name of the property Name
         */
        public final static String NAME = "Name";

    }

    /**
     * Constants of property OtherTargetOS
     * The OtherTargetOS property records the manufacturer and operating system type for a SoftwareElement when the TargetOperatingSystem property has a value of 1 ("Other"). For all other values of TargetOperatingSystem, the OtherTargetOS property is NULL.
     */
    public static class PROPERTY_OTHERTARGETOS {
        /**
         * name of the property OtherTargetOS
         */
        public final static String NAME = "OtherTargetOS";

    }

    /**
     * Constants of property SerialNumber
     * The assigned serial number of this SoftwareElement.
     */
    public static class PROPERTY_SERIALNUMBER {
        /**
         * name of the property SerialNumber
         */
        public final static String NAME = "SerialNumber";

    }

    /**
     * Constants of property SoftwareElementID
     * This is an identifier for the SoftwareElement and is designed to be used in conjunction with other keys to create a unique representation of the element.
     */
    public static class PROPERTY_SOFTWAREELEMENTID {
        /**
         * name of the property SoftwareElementID
         */
        public final static String NAME = "SoftwareElementID";

    }

    /**
     * Constants of property SoftwareElementState
     * The SoftwareElementState is defined in this model to identify various states of a SoftwareElement's life cycle. 
     * - A SoftwareElement in the deployable state describes the details necessary to successfully distribute it and the details (Checks and Actions) required to move it to the installable state (i.e, the next state). 
     * - A SoftwareElement in the installable state describes the details necessary to successfully install it and the details (Checks and Actions) required to create an element in the executable state (i.e., the next state). 
     * - A SoftwareElement in the executable state describes the details necessary to successfully start it and the details (Checks and Actions) required to move it to the running state (i.e., the next state). 
     * - A SoftwareElement in the running state describes the details necessary to manage the started element.
     */
    public static class PROPERTY_SOFTWAREELEMENTSTATE {
        /**
         * name of the property SoftwareElementState
         */
        public final static String NAME = "SoftwareElementState";

        /**
         * constant for value map entry 0
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Deployable = new javax.cim.UnsignedInteger16(
                "0");

        /**
         * constant for value entry Deployable (corresponds to mapEntry 0 )
         */
        public final static String VALUE_ENTRY_Deployable = "Deployable";

        /**
         * constant for value map entry 1
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Installable = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry Installable (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_Installable = "Installable";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Executable = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Executable (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Executable = "Executable";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Running = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Running (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Running = "Running";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@68466846
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Deployable.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Deployable;
            }

            if (VALUE_ENTRY_Installable.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Installable;
            }

            if (VALUE_ENTRY_Executable.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Executable;
            }

            if (VALUE_ENTRY_Running.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Running;
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

            if (iValue == VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Deployable.intValue()) {
                return VALUE_ENTRY_Deployable;
            }

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Installable.intValue()) {
                return VALUE_ENTRY_Installable;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Executable.intValue()) {
                return VALUE_ENTRY_Executable;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Running.intValue()) {
                return VALUE_ENTRY_Running;
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
         * Value Map for the property SoftwareElementState   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Deployable,
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Installable,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Executable,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Running };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property SoftwareElementState   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Deployable,
                VALUE_ENTRY_Installable, VALUE_ENTRY_Executable, VALUE_ENTRY_Running };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property SoftwareElementState   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Deployable,
                VALUE_ENTRY_Installable, VALUE_ENTRY_Executable, VALUE_ENTRY_Running };

    }

    /**
     * Constants of property TargetOperatingSystem
     * The TargetOperatingSystem property specifies the element's operating system environment. The value of this property does not ensure that it is binary executable. Two other pieces of information are needed. First, the version of the OS needs to be specified using the class, CIM_OSVersion Check. The second piece of information is the architecture that the OS runs on. This information is verified using CIM_ArchitectureCheck. The combination of these constructs clearly identifies the level of OS required for a particular SoftwareElement.
     */
    public static class PROPERTY_TARGETOPERATINGSYSTEM {
        /**
         * name of the property TargetOperatingSystem
         */
        public final static String NAME = "TargetOperatingSystem";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_MACOS = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry MACOS (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_MACOS = "MACOS";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_ATTUNIX = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry ATTUNIX (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_ATTUNIX = "ATTUNIX";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_DGUX = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry DGUX (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_DGUX = "DGUX";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_DECNT = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry DECNT (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_DECNT = "DECNT";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Tru64_UNIX = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry Tru64 UNIX (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Tru64_UNIX = "Tru64 UNIX";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_OpenVMS = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry OpenVMS (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_OpenVMS = "OpenVMS";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_HPUX = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry HPUX (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_HPUX = "HPUX";

        /**
         * constant for value map entry 9
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_AIX = new javax.cim.UnsignedInteger16(
                "9");

        /**
         * constant for value entry AIX (corresponds to mapEntry 9 )
         */
        public final static String VALUE_ENTRY_AIX = "AIX";

        /**
         * constant for value map entry 10
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_MVS = new javax.cim.UnsignedInteger16(
                "10");

        /**
         * constant for value entry MVS (corresponds to mapEntry 10 )
         */
        public final static String VALUE_ENTRY_MVS = "MVS";

        /**
         * constant for value map entry 11
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_OS400 = new javax.cim.UnsignedInteger16(
                "11");

        /**
         * constant for value entry OS400 (corresponds to mapEntry 11 )
         */
        public final static String VALUE_ENTRY_OS400 = "OS400";

        /**
         * constant for value map entry 12
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_OS_2 = new javax.cim.UnsignedInteger16(
                "12");

        /**
         * constant for value entry OS/2 (corresponds to mapEntry 12 )
         */
        public final static String VALUE_ENTRY_OS_2 = "OS/2";

        /**
         * constant for value map entry 13
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_JavaVM = new javax.cim.UnsignedInteger16(
                "13");

        /**
         * constant for value entry JavaVM (corresponds to mapEntry 13 )
         */
        public final static String VALUE_ENTRY_JavaVM = "JavaVM";

        /**
         * constant for value map entry 14
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_MSDOS = new javax.cim.UnsignedInteger16(
                "14");

        /**
         * constant for value entry MSDOS (corresponds to mapEntry 14 )
         */
        public final static String VALUE_ENTRY_MSDOS = "MSDOS";

        /**
         * constant for value map entry 15
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_WIN3x = new javax.cim.UnsignedInteger16(
                "15");

        /**
         * constant for value entry WIN3x (corresponds to mapEntry 15 )
         */
        public final static String VALUE_ENTRY_WIN3x = "WIN3x";

        /**
         * constant for value map entry 16
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_WIN95 = new javax.cim.UnsignedInteger16(
                "16");

        /**
         * constant for value entry WIN95 (corresponds to mapEntry 16 )
         */
        public final static String VALUE_ENTRY_WIN95 = "WIN95";

        /**
         * constant for value map entry 17
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_WIN98 = new javax.cim.UnsignedInteger16(
                "17");

        /**
         * constant for value entry WIN98 (corresponds to mapEntry 17 )
         */
        public final static String VALUE_ENTRY_WIN98 = "WIN98";

        /**
         * constant for value map entry 18
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_WINNT = new javax.cim.UnsignedInteger16(
                "18");

        /**
         * constant for value entry WINNT (corresponds to mapEntry 18 )
         */
        public final static String VALUE_ENTRY_WINNT = "WINNT";

        /**
         * constant for value map entry 19
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_WINCE = new javax.cim.UnsignedInteger16(
                "19");

        /**
         * constant for value entry WINCE (corresponds to mapEntry 19 )
         */
        public final static String VALUE_ENTRY_WINCE = "WINCE";

        /**
         * constant for value map entry 20
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_NCR3000 = new javax.cim.UnsignedInteger16(
                "20");

        /**
         * constant for value entry NCR3000 (corresponds to mapEntry 20 )
         */
        public final static String VALUE_ENTRY_NCR3000 = "NCR3000";

        /**
         * constant for value map entry 21
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_NetWare = new javax.cim.UnsignedInteger16(
                "21");

        /**
         * constant for value entry NetWare (corresponds to mapEntry 21 )
         */
        public final static String VALUE_ENTRY_NetWare = "NetWare";

        /**
         * constant for value map entry 22
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_OSF = new javax.cim.UnsignedInteger16(
                "22");

        /**
         * constant for value entry OSF (corresponds to mapEntry 22 )
         */
        public final static String VALUE_ENTRY_OSF = "OSF";

        /**
         * constant for value map entry 23
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_DC_OS = new javax.cim.UnsignedInteger16(
                "23");

        /**
         * constant for value entry DC/OS (corresponds to mapEntry 23 )
         */
        public final static String VALUE_ENTRY_DC_OS = "DC/OS";

        /**
         * constant for value map entry 24
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_Reliant_UNIX = new javax.cim.UnsignedInteger16(
                "24");

        /**
         * constant for value entry Reliant UNIX (corresponds to mapEntry 24 )
         */
        public final static String VALUE_ENTRY_Reliant_UNIX = "Reliant UNIX";

        /**
         * constant for value map entry 25
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_SCO_UnixWare = new javax.cim.UnsignedInteger16(
                "25");

        /**
         * constant for value entry SCO UnixWare (corresponds to mapEntry 25 )
         */
        public final static String VALUE_ENTRY_SCO_UnixWare = "SCO UnixWare";

        /**
         * constant for value map entry 26
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_SCO_OpenServer = new javax.cim.UnsignedInteger16(
                "26");

        /**
         * constant for value entry SCO OpenServer (corresponds to mapEntry 26 )
         */
        public final static String VALUE_ENTRY_SCO_OpenServer = "SCO OpenServer";

        /**
         * constant for value map entry 27
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_Sequent = new javax.cim.UnsignedInteger16(
                "27");

        /**
         * constant for value entry Sequent (corresponds to mapEntry 27 )
         */
        public final static String VALUE_ENTRY_Sequent = "Sequent";

        /**
         * constant for value map entry 28
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_28_FOR_VALUE_ENTRY_IRIX = new javax.cim.UnsignedInteger16(
                "28");

        /**
         * constant for value entry IRIX (corresponds to mapEntry 28 )
         */
        public final static String VALUE_ENTRY_IRIX = "IRIX";

        /**
         * constant for value map entry 29
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_29_FOR_VALUE_ENTRY_Solaris = new javax.cim.UnsignedInteger16(
                "29");

        /**
         * constant for value entry Solaris (corresponds to mapEntry 29 )
         */
        public final static String VALUE_ENTRY_Solaris = "Solaris";

        /**
         * constant for value map entry 30
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_30_FOR_VALUE_ENTRY_SunOS = new javax.cim.UnsignedInteger16(
                "30");

        /**
         * constant for value entry SunOS (corresponds to mapEntry 30 )
         */
        public final static String VALUE_ENTRY_SunOS = "SunOS";

        /**
         * constant for value map entry 31
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_31_FOR_VALUE_ENTRY_U6000 = new javax.cim.UnsignedInteger16(
                "31");

        /**
         * constant for value entry U6000 (corresponds to mapEntry 31 )
         */
        public final static String VALUE_ENTRY_U6000 = "U6000";

        /**
         * constant for value map entry 32
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_32_FOR_VALUE_ENTRY_ASERIES = new javax.cim.UnsignedInteger16(
                "32");

        /**
         * constant for value entry ASERIES (corresponds to mapEntry 32 )
         */
        public final static String VALUE_ENTRY_ASERIES = "ASERIES";

        /**
         * constant for value map entry 33
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_33_FOR_VALUE_ENTRY_TandemNSK = new javax.cim.UnsignedInteger16(
                "33");

        /**
         * constant for value entry TandemNSK (corresponds to mapEntry 33 )
         */
        public final static String VALUE_ENTRY_TandemNSK = "TandemNSK";

        /**
         * constant for value map entry 34
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_34_FOR_VALUE_ENTRY_TandemNT = new javax.cim.UnsignedInteger16(
                "34");

        /**
         * constant for value entry TandemNT (corresponds to mapEntry 34 )
         */
        public final static String VALUE_ENTRY_TandemNT = "TandemNT";

        /**
         * constant for value map entry 35
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_35_FOR_VALUE_ENTRY_BS2000 = new javax.cim.UnsignedInteger16(
                "35");

        /**
         * constant for value entry BS2000 (corresponds to mapEntry 35 )
         */
        public final static String VALUE_ENTRY_BS2000 = "BS2000";

        /**
         * constant for value map entry 36
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_36_FOR_VALUE_ENTRY_LINUX = new javax.cim.UnsignedInteger16(
                "36");

        /**
         * constant for value entry LINUX (corresponds to mapEntry 36 )
         */
        public final static String VALUE_ENTRY_LINUX = "LINUX";

        /**
         * constant for value map entry 37
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_37_FOR_VALUE_ENTRY_Lynx = new javax.cim.UnsignedInteger16(
                "37");

        /**
         * constant for value entry Lynx (corresponds to mapEntry 37 )
         */
        public final static String VALUE_ENTRY_Lynx = "Lynx";

        /**
         * constant for value map entry 38
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_38_FOR_VALUE_ENTRY_XENIX = new javax.cim.UnsignedInteger16(
                "38");

        /**
         * constant for value entry XENIX (corresponds to mapEntry 38 )
         */
        public final static String VALUE_ENTRY_XENIX = "XENIX";

        /**
         * constant for value map entry 39
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_39_FOR_VALUE_ENTRY_VM = new javax.cim.UnsignedInteger16(
                "39");

        /**
         * constant for value entry VM (corresponds to mapEntry 39 )
         */
        public final static String VALUE_ENTRY_VM = "VM";

        /**
         * constant for value map entry 40
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_40_FOR_VALUE_ENTRY_Interactive_UNIX = new javax.cim.UnsignedInteger16(
                "40");

        /**
         * constant for value entry Interactive UNIX (corresponds to mapEntry 40 )
         */
        public final static String VALUE_ENTRY_Interactive_UNIX = "Interactive UNIX";

        /**
         * constant for value map entry 41
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_41_FOR_VALUE_ENTRY_BSDUNIX = new javax.cim.UnsignedInteger16(
                "41");

        /**
         * constant for value entry BSDUNIX (corresponds to mapEntry 41 )
         */
        public final static String VALUE_ENTRY_BSDUNIX = "BSDUNIX";

        /**
         * constant for value map entry 42
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_42_FOR_VALUE_ENTRY_FreeBSD = new javax.cim.UnsignedInteger16(
                "42");

        /**
         * constant for value entry FreeBSD (corresponds to mapEntry 42 )
         */
        public final static String VALUE_ENTRY_FreeBSD = "FreeBSD";

        /**
         * constant for value map entry 43
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_43_FOR_VALUE_ENTRY_NetBSD = new javax.cim.UnsignedInteger16(
                "43");

        /**
         * constant for value entry NetBSD (corresponds to mapEntry 43 )
         */
        public final static String VALUE_ENTRY_NetBSD = "NetBSD";

        /**
         * constant for value map entry 44
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_44_FOR_VALUE_ENTRY_GNU_Hurd = new javax.cim.UnsignedInteger16(
                "44");

        /**
         * constant for value entry GNU Hurd (corresponds to mapEntry 44 )
         */
        public final static String VALUE_ENTRY_GNU_Hurd = "GNU Hurd";

        /**
         * constant for value map entry 45
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_45_FOR_VALUE_ENTRY_OS9 = new javax.cim.UnsignedInteger16(
                "45");

        /**
         * constant for value entry OS9 (corresponds to mapEntry 45 )
         */
        public final static String VALUE_ENTRY_OS9 = "OS9";

        /**
         * constant for value map entry 46
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_46_FOR_VALUE_ENTRY_MACH_Kernel = new javax.cim.UnsignedInteger16(
                "46");

        /**
         * constant for value entry MACH Kernel (corresponds to mapEntry 46 )
         */
        public final static String VALUE_ENTRY_MACH_Kernel = "MACH Kernel";

        /**
         * constant for value map entry 47
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_47_FOR_VALUE_ENTRY_Inferno = new javax.cim.UnsignedInteger16(
                "47");

        /**
         * constant for value entry Inferno (corresponds to mapEntry 47 )
         */
        public final static String VALUE_ENTRY_Inferno = "Inferno";

        /**
         * constant for value map entry 48
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_48_FOR_VALUE_ENTRY_QNX = new javax.cim.UnsignedInteger16(
                "48");

        /**
         * constant for value entry QNX (corresponds to mapEntry 48 )
         */
        public final static String VALUE_ENTRY_QNX = "QNX";

        /**
         * constant for value map entry 49
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_49_FOR_VALUE_ENTRY_EPOC = new javax.cim.UnsignedInteger16(
                "49");

        /**
         * constant for value entry EPOC (corresponds to mapEntry 49 )
         */
        public final static String VALUE_ENTRY_EPOC = "EPOC";

        /**
         * constant for value map entry 50
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_50_FOR_VALUE_ENTRY_IxWorks = new javax.cim.UnsignedInteger16(
                "50");

        /**
         * constant for value entry IxWorks (corresponds to mapEntry 50 )
         */
        public final static String VALUE_ENTRY_IxWorks = "IxWorks";

        /**
         * constant for value map entry 51
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_51_FOR_VALUE_ENTRY_VxWorks = new javax.cim.UnsignedInteger16(
                "51");

        /**
         * constant for value entry VxWorks (corresponds to mapEntry 51 )
         */
        public final static String VALUE_ENTRY_VxWorks = "VxWorks";

        /**
         * constant for value map entry 52
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_52_FOR_VALUE_ENTRY_MiNT = new javax.cim.UnsignedInteger16(
                "52");

        /**
         * constant for value entry MiNT (corresponds to mapEntry 52 )
         */
        public final static String VALUE_ENTRY_MiNT = "MiNT";

        /**
         * constant for value map entry 53
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_53_FOR_VALUE_ENTRY_BeOS = new javax.cim.UnsignedInteger16(
                "53");

        /**
         * constant for value entry BeOS (corresponds to mapEntry 53 )
         */
        public final static String VALUE_ENTRY_BeOS = "BeOS";

        /**
         * constant for value map entry 54
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_54_FOR_VALUE_ENTRY_HP_MPE = new javax.cim.UnsignedInteger16(
                "54");

        /**
         * constant for value entry HP MPE (corresponds to mapEntry 54 )
         */
        public final static String VALUE_ENTRY_HP_MPE = "HP MPE";

        /**
         * constant for value map entry 55
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_55_FOR_VALUE_ENTRY_NextStep = new javax.cim.UnsignedInteger16(
                "55");

        /**
         * constant for value entry NextStep (corresponds to mapEntry 55 )
         */
        public final static String VALUE_ENTRY_NextStep = "NextStep";

        /**
         * constant for value map entry 56
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_56_FOR_VALUE_ENTRY_PalmPilot = new javax.cim.UnsignedInteger16(
                "56");

        /**
         * constant for value entry PalmPilot (corresponds to mapEntry 56 )
         */
        public final static String VALUE_ENTRY_PalmPilot = "PalmPilot";

        /**
         * constant for value map entry 57
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_57_FOR_VALUE_ENTRY_Rhapsody = new javax.cim.UnsignedInteger16(
                "57");

        /**
         * constant for value entry Rhapsody (corresponds to mapEntry 57 )
         */
        public final static String VALUE_ENTRY_Rhapsody = "Rhapsody";

        /**
         * constant for value map entry 58
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_58_FOR_VALUE_ENTRY_Windows_2000 = new javax.cim.UnsignedInteger16(
                "58");

        /**
         * constant for value entry Windows 2000 (corresponds to mapEntry 58 )
         */
        public final static String VALUE_ENTRY_Windows_2000 = "Windows 2000";

        /**
         * constant for value map entry 59
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_59_FOR_VALUE_ENTRY_Dedicated = new javax.cim.UnsignedInteger16(
                "59");

        /**
         * constant for value entry Dedicated (corresponds to mapEntry 59 )
         */
        public final static String VALUE_ENTRY_Dedicated = "Dedicated";

        /**
         * constant for value map entry 60
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_60_FOR_VALUE_ENTRY_OS_390 = new javax.cim.UnsignedInteger16(
                "60");

        /**
         * constant for value entry OS/390 (corresponds to mapEntry 60 )
         */
        public final static String VALUE_ENTRY_OS_390 = "OS/390";

        /**
         * constant for value map entry 61
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_61_FOR_VALUE_ENTRY_VSE = new javax.cim.UnsignedInteger16(
                "61");

        /**
         * constant for value entry VSE (corresponds to mapEntry 61 )
         */
        public final static String VALUE_ENTRY_VSE = "VSE";

        /**
         * constant for value map entry 62
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_62_FOR_VALUE_ENTRY_TPF = new javax.cim.UnsignedInteger16(
                "62");

        /**
         * constant for value entry TPF (corresponds to mapEntry 62 )
         */
        public final static String VALUE_ENTRY_TPF = "TPF";

        /**
         * constant for value map entry 63
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_63_FOR_VALUE_ENTRY_Windows__R__Me = new javax.cim.UnsignedInteger16(
                "63");

        /**
         * constant for value entry Windows (R) Me (corresponds to mapEntry 63 )
         */
        public final static String VALUE_ENTRY_Windows__R__Me = "Windows (R) Me";

        /**
         * constant for value map entry 64
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_64_FOR_VALUE_ENTRY_Caldera_Open_UNIX = new javax.cim.UnsignedInteger16(
                "64");

        /**
         * constant for value entry Caldera Open UNIX (corresponds to mapEntry 64 )
         */
        public final static String VALUE_ENTRY_Caldera_Open_UNIX = "Caldera Open UNIX";

        /**
         * constant for value map entry 65
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_65_FOR_VALUE_ENTRY_OpenBSD = new javax.cim.UnsignedInteger16(
                "65");

        /**
         * constant for value entry OpenBSD (corresponds to mapEntry 65 )
         */
        public final static String VALUE_ENTRY_OpenBSD = "OpenBSD";

        /**
         * constant for value map entry 66
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_66_FOR_VALUE_ENTRY_Not_Applicable = new javax.cim.UnsignedInteger16(
                "66");

        /**
         * constant for value entry Not Applicable (corresponds to mapEntry 66 )
         */
        public final static String VALUE_ENTRY_Not_Applicable = "Not Applicable";

        /**
         * constant for value map entry 67
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_67_FOR_VALUE_ENTRY_Windows_XP = new javax.cim.UnsignedInteger16(
                "67");

        /**
         * constant for value entry Windows XP (corresponds to mapEntry 67 )
         */
        public final static String VALUE_ENTRY_Windows_XP = "Windows XP";

        /**
         * constant for value map entry 68
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_68_FOR_VALUE_ENTRY_z_OS = new javax.cim.UnsignedInteger16(
                "68");

        /**
         * constant for value entry z/OS (corresponds to mapEntry 68 )
         */
        public final static String VALUE_ENTRY_z_OS = "z/OS";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@25b225b2
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_MACOS.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_MACOS;
            }

            if (VALUE_ENTRY_ATTUNIX.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_ATTUNIX;
            }

            if (VALUE_ENTRY_DGUX.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_DGUX;
            }

            if (VALUE_ENTRY_DECNT.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_DECNT;
            }

            if (VALUE_ENTRY_Tru64_UNIX.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Tru64_UNIX;
            }

            if (VALUE_ENTRY_OpenVMS.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_OpenVMS;
            }

            if (VALUE_ENTRY_HPUX.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_HPUX;
            }

            if (VALUE_ENTRY_AIX.equals(value)) {
                return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_AIX;
            }

            if (VALUE_ENTRY_MVS.equals(value)) {
                return VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_MVS;
            }

            if (VALUE_ENTRY_OS400.equals(value)) {
                return VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_OS400;
            }

            if (VALUE_ENTRY_OS_2.equals(value)) {
                return VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_OS_2;
            }

            if (VALUE_ENTRY_JavaVM.equals(value)) {
                return VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_JavaVM;
            }

            if (VALUE_ENTRY_MSDOS.equals(value)) {
                return VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_MSDOS;
            }

            if (VALUE_ENTRY_WIN3x.equals(value)) {
                return VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_WIN3x;
            }

            if (VALUE_ENTRY_WIN95.equals(value)) {
                return VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_WIN95;
            }

            if (VALUE_ENTRY_WIN98.equals(value)) {
                return VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_WIN98;
            }

            if (VALUE_ENTRY_WINNT.equals(value)) {
                return VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_WINNT;
            }

            if (VALUE_ENTRY_WINCE.equals(value)) {
                return VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_WINCE;
            }

            if (VALUE_ENTRY_NCR3000.equals(value)) {
                return VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_NCR3000;
            }

            if (VALUE_ENTRY_NetWare.equals(value)) {
                return VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_NetWare;
            }

            if (VALUE_ENTRY_OSF.equals(value)) {
                return VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_OSF;
            }

            if (VALUE_ENTRY_DC_OS.equals(value)) {
                return VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_DC_OS;
            }

            if (VALUE_ENTRY_Reliant_UNIX.equals(value)) {
                return VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_Reliant_UNIX;
            }

            if (VALUE_ENTRY_SCO_UnixWare.equals(value)) {
                return VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_SCO_UnixWare;
            }

            if (VALUE_ENTRY_SCO_OpenServer.equals(value)) {
                return VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_SCO_OpenServer;
            }

            if (VALUE_ENTRY_Sequent.equals(value)) {
                return VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_Sequent;
            }

            if (VALUE_ENTRY_IRIX.equals(value)) {
                return VALUE_MAP_ENTRY_28_FOR_VALUE_ENTRY_IRIX;
            }

            if (VALUE_ENTRY_Solaris.equals(value)) {
                return VALUE_MAP_ENTRY_29_FOR_VALUE_ENTRY_Solaris;
            }

            if (VALUE_ENTRY_SunOS.equals(value)) {
                return VALUE_MAP_ENTRY_30_FOR_VALUE_ENTRY_SunOS;
            }

            if (VALUE_ENTRY_U6000.equals(value)) {
                return VALUE_MAP_ENTRY_31_FOR_VALUE_ENTRY_U6000;
            }

            if (VALUE_ENTRY_ASERIES.equals(value)) {
                return VALUE_MAP_ENTRY_32_FOR_VALUE_ENTRY_ASERIES;
            }

            if (VALUE_ENTRY_TandemNSK.equals(value)) {
                return VALUE_MAP_ENTRY_33_FOR_VALUE_ENTRY_TandemNSK;
            }

            if (VALUE_ENTRY_TandemNT.equals(value)) {
                return VALUE_MAP_ENTRY_34_FOR_VALUE_ENTRY_TandemNT;
            }

            if (VALUE_ENTRY_BS2000.equals(value)) {
                return VALUE_MAP_ENTRY_35_FOR_VALUE_ENTRY_BS2000;
            }

            if (VALUE_ENTRY_LINUX.equals(value)) {
                return VALUE_MAP_ENTRY_36_FOR_VALUE_ENTRY_LINUX;
            }

            if (VALUE_ENTRY_Lynx.equals(value)) {
                return VALUE_MAP_ENTRY_37_FOR_VALUE_ENTRY_Lynx;
            }

            if (VALUE_ENTRY_XENIX.equals(value)) {
                return VALUE_MAP_ENTRY_38_FOR_VALUE_ENTRY_XENIX;
            }

            if (VALUE_ENTRY_VM.equals(value)) {
                return VALUE_MAP_ENTRY_39_FOR_VALUE_ENTRY_VM;
            }

            if (VALUE_ENTRY_Interactive_UNIX.equals(value)) {
                return VALUE_MAP_ENTRY_40_FOR_VALUE_ENTRY_Interactive_UNIX;
            }

            if (VALUE_ENTRY_BSDUNIX.equals(value)) {
                return VALUE_MAP_ENTRY_41_FOR_VALUE_ENTRY_BSDUNIX;
            }

            if (VALUE_ENTRY_FreeBSD.equals(value)) {
                return VALUE_MAP_ENTRY_42_FOR_VALUE_ENTRY_FreeBSD;
            }

            if (VALUE_ENTRY_NetBSD.equals(value)) {
                return VALUE_MAP_ENTRY_43_FOR_VALUE_ENTRY_NetBSD;
            }

            if (VALUE_ENTRY_GNU_Hurd.equals(value)) {
                return VALUE_MAP_ENTRY_44_FOR_VALUE_ENTRY_GNU_Hurd;
            }

            if (VALUE_ENTRY_OS9.equals(value)) {
                return VALUE_MAP_ENTRY_45_FOR_VALUE_ENTRY_OS9;
            }

            if (VALUE_ENTRY_MACH_Kernel.equals(value)) {
                return VALUE_MAP_ENTRY_46_FOR_VALUE_ENTRY_MACH_Kernel;
            }

            if (VALUE_ENTRY_Inferno.equals(value)) {
                return VALUE_MAP_ENTRY_47_FOR_VALUE_ENTRY_Inferno;
            }

            if (VALUE_ENTRY_QNX.equals(value)) {
                return VALUE_MAP_ENTRY_48_FOR_VALUE_ENTRY_QNX;
            }

            if (VALUE_ENTRY_EPOC.equals(value)) {
                return VALUE_MAP_ENTRY_49_FOR_VALUE_ENTRY_EPOC;
            }

            if (VALUE_ENTRY_IxWorks.equals(value)) {
                return VALUE_MAP_ENTRY_50_FOR_VALUE_ENTRY_IxWorks;
            }

            if (VALUE_ENTRY_VxWorks.equals(value)) {
                return VALUE_MAP_ENTRY_51_FOR_VALUE_ENTRY_VxWorks;
            }

            if (VALUE_ENTRY_MiNT.equals(value)) {
                return VALUE_MAP_ENTRY_52_FOR_VALUE_ENTRY_MiNT;
            }

            if (VALUE_ENTRY_BeOS.equals(value)) {
                return VALUE_MAP_ENTRY_53_FOR_VALUE_ENTRY_BeOS;
            }

            if (VALUE_ENTRY_HP_MPE.equals(value)) {
                return VALUE_MAP_ENTRY_54_FOR_VALUE_ENTRY_HP_MPE;
            }

            if (VALUE_ENTRY_NextStep.equals(value)) {
                return VALUE_MAP_ENTRY_55_FOR_VALUE_ENTRY_NextStep;
            }

            if (VALUE_ENTRY_PalmPilot.equals(value)) {
                return VALUE_MAP_ENTRY_56_FOR_VALUE_ENTRY_PalmPilot;
            }

            if (VALUE_ENTRY_Rhapsody.equals(value)) {
                return VALUE_MAP_ENTRY_57_FOR_VALUE_ENTRY_Rhapsody;
            }

            if (VALUE_ENTRY_Windows_2000.equals(value)) {
                return VALUE_MAP_ENTRY_58_FOR_VALUE_ENTRY_Windows_2000;
            }

            if (VALUE_ENTRY_Dedicated.equals(value)) {
                return VALUE_MAP_ENTRY_59_FOR_VALUE_ENTRY_Dedicated;
            }

            if (VALUE_ENTRY_OS_390.equals(value)) {
                return VALUE_MAP_ENTRY_60_FOR_VALUE_ENTRY_OS_390;
            }

            if (VALUE_ENTRY_VSE.equals(value)) {
                return VALUE_MAP_ENTRY_61_FOR_VALUE_ENTRY_VSE;
            }

            if (VALUE_ENTRY_TPF.equals(value)) {
                return VALUE_MAP_ENTRY_62_FOR_VALUE_ENTRY_TPF;
            }

            if (VALUE_ENTRY_Windows__R__Me.equals(value)) {
                return VALUE_MAP_ENTRY_63_FOR_VALUE_ENTRY_Windows__R__Me;
            }

            if (VALUE_ENTRY_Caldera_Open_UNIX.equals(value)) {
                return VALUE_MAP_ENTRY_64_FOR_VALUE_ENTRY_Caldera_Open_UNIX;
            }

            if (VALUE_ENTRY_OpenBSD.equals(value)) {
                return VALUE_MAP_ENTRY_65_FOR_VALUE_ENTRY_OpenBSD;
            }

            if (VALUE_ENTRY_Not_Applicable.equals(value)) {
                return VALUE_MAP_ENTRY_66_FOR_VALUE_ENTRY_Not_Applicable;
            }

            if (VALUE_ENTRY_Windows_XP.equals(value)) {
                return VALUE_MAP_ENTRY_67_FOR_VALUE_ENTRY_Windows_XP;
            }

            if (VALUE_ENTRY_z_OS.equals(value)) {
                return VALUE_MAP_ENTRY_68_FOR_VALUE_ENTRY_z_OS;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_MACOS.intValue()) {
                return VALUE_ENTRY_MACOS;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_ATTUNIX.intValue()) {
                return VALUE_ENTRY_ATTUNIX;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_DGUX.intValue()) {
                return VALUE_ENTRY_DGUX;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_DECNT.intValue()) {
                return VALUE_ENTRY_DECNT;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Tru64_UNIX.intValue()) {
                return VALUE_ENTRY_Tru64_UNIX;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_OpenVMS.intValue()) {
                return VALUE_ENTRY_OpenVMS;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_HPUX.intValue()) {
                return VALUE_ENTRY_HPUX;
            }

            if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_AIX.intValue()) {
                return VALUE_ENTRY_AIX;
            }

            if (iValue == VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_MVS.intValue()) {
                return VALUE_ENTRY_MVS;
            }

            if (iValue == VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_OS400.intValue()) {
                return VALUE_ENTRY_OS400;
            }

            if (iValue == VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_OS_2.intValue()) {
                return VALUE_ENTRY_OS_2;
            }

            if (iValue == VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_JavaVM.intValue()) {
                return VALUE_ENTRY_JavaVM;
            }

            if (iValue == VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_MSDOS.intValue()) {
                return VALUE_ENTRY_MSDOS;
            }

            if (iValue == VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_WIN3x.intValue()) {
                return VALUE_ENTRY_WIN3x;
            }

            if (iValue == VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_WIN95.intValue()) {
                return VALUE_ENTRY_WIN95;
            }

            if (iValue == VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_WIN98.intValue()) {
                return VALUE_ENTRY_WIN98;
            }

            if (iValue == VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_WINNT.intValue()) {
                return VALUE_ENTRY_WINNT;
            }

            if (iValue == VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_WINCE.intValue()) {
                return VALUE_ENTRY_WINCE;
            }

            if (iValue == VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_NCR3000.intValue()) {
                return VALUE_ENTRY_NCR3000;
            }

            if (iValue == VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_NetWare.intValue()) {
                return VALUE_ENTRY_NetWare;
            }

            if (iValue == VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_OSF.intValue()) {
                return VALUE_ENTRY_OSF;
            }

            if (iValue == VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_DC_OS.intValue()) {
                return VALUE_ENTRY_DC_OS;
            }

            if (iValue == VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_Reliant_UNIX.intValue()) {
                return VALUE_ENTRY_Reliant_UNIX;
            }

            if (iValue == VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_SCO_UnixWare.intValue()) {
                return VALUE_ENTRY_SCO_UnixWare;
            }

            if (iValue == VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_SCO_OpenServer.intValue()) {
                return VALUE_ENTRY_SCO_OpenServer;
            }

            if (iValue == VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_Sequent.intValue()) {
                return VALUE_ENTRY_Sequent;
            }

            if (iValue == VALUE_MAP_ENTRY_28_FOR_VALUE_ENTRY_IRIX.intValue()) {
                return VALUE_ENTRY_IRIX;
            }

            if (iValue == VALUE_MAP_ENTRY_29_FOR_VALUE_ENTRY_Solaris.intValue()) {
                return VALUE_ENTRY_Solaris;
            }

            if (iValue == VALUE_MAP_ENTRY_30_FOR_VALUE_ENTRY_SunOS.intValue()) {
                return VALUE_ENTRY_SunOS;
            }

            if (iValue == VALUE_MAP_ENTRY_31_FOR_VALUE_ENTRY_U6000.intValue()) {
                return VALUE_ENTRY_U6000;
            }

            if (iValue == VALUE_MAP_ENTRY_32_FOR_VALUE_ENTRY_ASERIES.intValue()) {
                return VALUE_ENTRY_ASERIES;
            }

            if (iValue == VALUE_MAP_ENTRY_33_FOR_VALUE_ENTRY_TandemNSK.intValue()) {
                return VALUE_ENTRY_TandemNSK;
            }

            if (iValue == VALUE_MAP_ENTRY_34_FOR_VALUE_ENTRY_TandemNT.intValue()) {
                return VALUE_ENTRY_TandemNT;
            }

            if (iValue == VALUE_MAP_ENTRY_35_FOR_VALUE_ENTRY_BS2000.intValue()) {
                return VALUE_ENTRY_BS2000;
            }

            if (iValue == VALUE_MAP_ENTRY_36_FOR_VALUE_ENTRY_LINUX.intValue()) {
                return VALUE_ENTRY_LINUX;
            }

            if (iValue == VALUE_MAP_ENTRY_37_FOR_VALUE_ENTRY_Lynx.intValue()) {
                return VALUE_ENTRY_Lynx;
            }

            if (iValue == VALUE_MAP_ENTRY_38_FOR_VALUE_ENTRY_XENIX.intValue()) {
                return VALUE_ENTRY_XENIX;
            }

            if (iValue == VALUE_MAP_ENTRY_39_FOR_VALUE_ENTRY_VM.intValue()) {
                return VALUE_ENTRY_VM;
            }

            if (iValue == VALUE_MAP_ENTRY_40_FOR_VALUE_ENTRY_Interactive_UNIX.intValue()) {
                return VALUE_ENTRY_Interactive_UNIX;
            }

            if (iValue == VALUE_MAP_ENTRY_41_FOR_VALUE_ENTRY_BSDUNIX.intValue()) {
                return VALUE_ENTRY_BSDUNIX;
            }

            if (iValue == VALUE_MAP_ENTRY_42_FOR_VALUE_ENTRY_FreeBSD.intValue()) {
                return VALUE_ENTRY_FreeBSD;
            }

            if (iValue == VALUE_MAP_ENTRY_43_FOR_VALUE_ENTRY_NetBSD.intValue()) {
                return VALUE_ENTRY_NetBSD;
            }

            if (iValue == VALUE_MAP_ENTRY_44_FOR_VALUE_ENTRY_GNU_Hurd.intValue()) {
                return VALUE_ENTRY_GNU_Hurd;
            }

            if (iValue == VALUE_MAP_ENTRY_45_FOR_VALUE_ENTRY_OS9.intValue()) {
                return VALUE_ENTRY_OS9;
            }

            if (iValue == VALUE_MAP_ENTRY_46_FOR_VALUE_ENTRY_MACH_Kernel.intValue()) {
                return VALUE_ENTRY_MACH_Kernel;
            }

            if (iValue == VALUE_MAP_ENTRY_47_FOR_VALUE_ENTRY_Inferno.intValue()) {
                return VALUE_ENTRY_Inferno;
            }

            if (iValue == VALUE_MAP_ENTRY_48_FOR_VALUE_ENTRY_QNX.intValue()) {
                return VALUE_ENTRY_QNX;
            }

            if (iValue == VALUE_MAP_ENTRY_49_FOR_VALUE_ENTRY_EPOC.intValue()) {
                return VALUE_ENTRY_EPOC;
            }

            if (iValue == VALUE_MAP_ENTRY_50_FOR_VALUE_ENTRY_IxWorks.intValue()) {
                return VALUE_ENTRY_IxWorks;
            }

            if (iValue == VALUE_MAP_ENTRY_51_FOR_VALUE_ENTRY_VxWorks.intValue()) {
                return VALUE_ENTRY_VxWorks;
            }

            if (iValue == VALUE_MAP_ENTRY_52_FOR_VALUE_ENTRY_MiNT.intValue()) {
                return VALUE_ENTRY_MiNT;
            }

            if (iValue == VALUE_MAP_ENTRY_53_FOR_VALUE_ENTRY_BeOS.intValue()) {
                return VALUE_ENTRY_BeOS;
            }

            if (iValue == VALUE_MAP_ENTRY_54_FOR_VALUE_ENTRY_HP_MPE.intValue()) {
                return VALUE_ENTRY_HP_MPE;
            }

            if (iValue == VALUE_MAP_ENTRY_55_FOR_VALUE_ENTRY_NextStep.intValue()) {
                return VALUE_ENTRY_NextStep;
            }

            if (iValue == VALUE_MAP_ENTRY_56_FOR_VALUE_ENTRY_PalmPilot.intValue()) {
                return VALUE_ENTRY_PalmPilot;
            }

            if (iValue == VALUE_MAP_ENTRY_57_FOR_VALUE_ENTRY_Rhapsody.intValue()) {
                return VALUE_ENTRY_Rhapsody;
            }

            if (iValue == VALUE_MAP_ENTRY_58_FOR_VALUE_ENTRY_Windows_2000.intValue()) {
                return VALUE_ENTRY_Windows_2000;
            }

            if (iValue == VALUE_MAP_ENTRY_59_FOR_VALUE_ENTRY_Dedicated.intValue()) {
                return VALUE_ENTRY_Dedicated;
            }

            if (iValue == VALUE_MAP_ENTRY_60_FOR_VALUE_ENTRY_OS_390.intValue()) {
                return VALUE_ENTRY_OS_390;
            }

            if (iValue == VALUE_MAP_ENTRY_61_FOR_VALUE_ENTRY_VSE.intValue()) {
                return VALUE_ENTRY_VSE;
            }

            if (iValue == VALUE_MAP_ENTRY_62_FOR_VALUE_ENTRY_TPF.intValue()) {
                return VALUE_ENTRY_TPF;
            }

            if (iValue == VALUE_MAP_ENTRY_63_FOR_VALUE_ENTRY_Windows__R__Me.intValue()) {
                return VALUE_ENTRY_Windows__R__Me;
            }

            if (iValue == VALUE_MAP_ENTRY_64_FOR_VALUE_ENTRY_Caldera_Open_UNIX.intValue()) {
                return VALUE_ENTRY_Caldera_Open_UNIX;
            }

            if (iValue == VALUE_MAP_ENTRY_65_FOR_VALUE_ENTRY_OpenBSD.intValue()) {
                return VALUE_ENTRY_OpenBSD;
            }

            if (iValue == VALUE_MAP_ENTRY_66_FOR_VALUE_ENTRY_Not_Applicable.intValue()) {
                return VALUE_ENTRY_Not_Applicable;
            }

            if (iValue == VALUE_MAP_ENTRY_67_FOR_VALUE_ENTRY_Windows_XP.intValue()) {
                return VALUE_ENTRY_Windows_XP;
            }

            if (iValue == VALUE_MAP_ENTRY_68_FOR_VALUE_ENTRY_z_OS.intValue()) {
                return VALUE_ENTRY_z_OS;
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
         * Value Map for the property TargetOperatingSystem   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_MACOS, VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_ATTUNIX,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_DGUX, VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_DECNT,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Tru64_UNIX,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_OpenVMS, VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_HPUX,
                VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_AIX, VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_MVS,
                VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_OS400, VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_OS_2,
                VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_JavaVM,
                VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_MSDOS, VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_WIN3x,
                VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_WIN95, VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_WIN98,
                VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_WINNT, VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_WINCE,
                VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_NCR3000,
                VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_NetWare, VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_OSF,
                VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_DC_OS,
                VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_Reliant_UNIX,
                VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_SCO_UnixWare,
                VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_SCO_OpenServer,
                VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_Sequent,
                VALUE_MAP_ENTRY_28_FOR_VALUE_ENTRY_IRIX,
                VALUE_MAP_ENTRY_29_FOR_VALUE_ENTRY_Solaris,
                VALUE_MAP_ENTRY_30_FOR_VALUE_ENTRY_SunOS, VALUE_MAP_ENTRY_31_FOR_VALUE_ENTRY_U6000,
                VALUE_MAP_ENTRY_32_FOR_VALUE_ENTRY_ASERIES,
                VALUE_MAP_ENTRY_33_FOR_VALUE_ENTRY_TandemNSK,
                VALUE_MAP_ENTRY_34_FOR_VALUE_ENTRY_TandemNT,
                VALUE_MAP_ENTRY_35_FOR_VALUE_ENTRY_BS2000,
                VALUE_MAP_ENTRY_36_FOR_VALUE_ENTRY_LINUX, VALUE_MAP_ENTRY_37_FOR_VALUE_ENTRY_Lynx,
                VALUE_MAP_ENTRY_38_FOR_VALUE_ENTRY_XENIX, VALUE_MAP_ENTRY_39_FOR_VALUE_ENTRY_VM,
                VALUE_MAP_ENTRY_40_FOR_VALUE_ENTRY_Interactive_UNIX,
                VALUE_MAP_ENTRY_41_FOR_VALUE_ENTRY_BSDUNIX,
                VALUE_MAP_ENTRY_42_FOR_VALUE_ENTRY_FreeBSD,
                VALUE_MAP_ENTRY_43_FOR_VALUE_ENTRY_NetBSD,
                VALUE_MAP_ENTRY_44_FOR_VALUE_ENTRY_GNU_Hurd,
                VALUE_MAP_ENTRY_45_FOR_VALUE_ENTRY_OS9,
                VALUE_MAP_ENTRY_46_FOR_VALUE_ENTRY_MACH_Kernel,
                VALUE_MAP_ENTRY_47_FOR_VALUE_ENTRY_Inferno, VALUE_MAP_ENTRY_48_FOR_VALUE_ENTRY_QNX,
                VALUE_MAP_ENTRY_49_FOR_VALUE_ENTRY_EPOC,
                VALUE_MAP_ENTRY_50_FOR_VALUE_ENTRY_IxWorks,
                VALUE_MAP_ENTRY_51_FOR_VALUE_ENTRY_VxWorks,
                VALUE_MAP_ENTRY_52_FOR_VALUE_ENTRY_MiNT, VALUE_MAP_ENTRY_53_FOR_VALUE_ENTRY_BeOS,
                VALUE_MAP_ENTRY_54_FOR_VALUE_ENTRY_HP_MPE,
                VALUE_MAP_ENTRY_55_FOR_VALUE_ENTRY_NextStep,
                VALUE_MAP_ENTRY_56_FOR_VALUE_ENTRY_PalmPilot,
                VALUE_MAP_ENTRY_57_FOR_VALUE_ENTRY_Rhapsody,
                VALUE_MAP_ENTRY_58_FOR_VALUE_ENTRY_Windows_2000,
                VALUE_MAP_ENTRY_59_FOR_VALUE_ENTRY_Dedicated,
                VALUE_MAP_ENTRY_60_FOR_VALUE_ENTRY_OS_390, VALUE_MAP_ENTRY_61_FOR_VALUE_ENTRY_VSE,
                VALUE_MAP_ENTRY_62_FOR_VALUE_ENTRY_TPF,
                VALUE_MAP_ENTRY_63_FOR_VALUE_ENTRY_Windows__R__Me,
                VALUE_MAP_ENTRY_64_FOR_VALUE_ENTRY_Caldera_Open_UNIX,
                VALUE_MAP_ENTRY_65_FOR_VALUE_ENTRY_OpenBSD,
                VALUE_MAP_ENTRY_66_FOR_VALUE_ENTRY_Not_Applicable,
                VALUE_MAP_ENTRY_67_FOR_VALUE_ENTRY_Windows_XP,
                VALUE_MAP_ENTRY_68_FOR_VALUE_ENTRY_z_OS };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property TargetOperatingSystem   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_MACOS, VALUE_ENTRY_ATTUNIX, VALUE_ENTRY_DGUX, VALUE_ENTRY_DECNT,
                VALUE_ENTRY_Tru64_UNIX, VALUE_ENTRY_OpenVMS, VALUE_ENTRY_HPUX, VALUE_ENTRY_AIX,
                VALUE_ENTRY_MVS, VALUE_ENTRY_OS400, VALUE_ENTRY_OS_2, VALUE_ENTRY_JavaVM,
                VALUE_ENTRY_MSDOS, VALUE_ENTRY_WIN3x, VALUE_ENTRY_WIN95, VALUE_ENTRY_WIN98,
                VALUE_ENTRY_WINNT, VALUE_ENTRY_WINCE, VALUE_ENTRY_NCR3000, VALUE_ENTRY_NetWare,
                VALUE_ENTRY_OSF, VALUE_ENTRY_DC_OS, VALUE_ENTRY_Reliant_UNIX,
                VALUE_ENTRY_SCO_UnixWare, VALUE_ENTRY_SCO_OpenServer, VALUE_ENTRY_Sequent,
                VALUE_ENTRY_IRIX, VALUE_ENTRY_Solaris, VALUE_ENTRY_SunOS, VALUE_ENTRY_U6000,
                VALUE_ENTRY_ASERIES, VALUE_ENTRY_TandemNSK, VALUE_ENTRY_TandemNT,
                VALUE_ENTRY_BS2000, VALUE_ENTRY_LINUX, VALUE_ENTRY_Lynx, VALUE_ENTRY_XENIX,
                VALUE_ENTRY_VM, VALUE_ENTRY_Interactive_UNIX, VALUE_ENTRY_BSDUNIX,
                VALUE_ENTRY_FreeBSD, VALUE_ENTRY_NetBSD, VALUE_ENTRY_GNU_Hurd, VALUE_ENTRY_OS9,
                VALUE_ENTRY_MACH_Kernel, VALUE_ENTRY_Inferno, VALUE_ENTRY_QNX, VALUE_ENTRY_EPOC,
                VALUE_ENTRY_IxWorks, VALUE_ENTRY_VxWorks, VALUE_ENTRY_MiNT, VALUE_ENTRY_BeOS,
                VALUE_ENTRY_HP_MPE, VALUE_ENTRY_NextStep, VALUE_ENTRY_PalmPilot,
                VALUE_ENTRY_Rhapsody, VALUE_ENTRY_Windows_2000, VALUE_ENTRY_Dedicated,
                VALUE_ENTRY_OS_390, VALUE_ENTRY_VSE, VALUE_ENTRY_TPF, VALUE_ENTRY_Windows__R__Me,
                VALUE_ENTRY_Caldera_Open_UNIX, VALUE_ENTRY_OpenBSD, VALUE_ENTRY_Not_Applicable,
                VALUE_ENTRY_Windows_XP, VALUE_ENTRY_z_OS };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property TargetOperatingSystem   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_MACOS, VALUE_ENTRY_ATTUNIX, VALUE_ENTRY_DGUX,
                VALUE_ENTRY_DECNT, VALUE_ENTRY_Tru64_UNIX, VALUE_ENTRY_OpenVMS, VALUE_ENTRY_HPUX,
                VALUE_ENTRY_AIX, VALUE_ENTRY_MVS, VALUE_ENTRY_OS400, VALUE_ENTRY_OS_2,
                VALUE_ENTRY_JavaVM, VALUE_ENTRY_MSDOS, VALUE_ENTRY_WIN3x, VALUE_ENTRY_WIN95,
                VALUE_ENTRY_WIN98, VALUE_ENTRY_WINNT, VALUE_ENTRY_WINCE, VALUE_ENTRY_NCR3000,
                VALUE_ENTRY_NetWare, VALUE_ENTRY_OSF, VALUE_ENTRY_DC_OS, VALUE_ENTRY_Reliant_UNIX,
                VALUE_ENTRY_SCO_UnixWare, VALUE_ENTRY_SCO_OpenServer, VALUE_ENTRY_Sequent,
                VALUE_ENTRY_IRIX, VALUE_ENTRY_Solaris, VALUE_ENTRY_SunOS, VALUE_ENTRY_U6000,
                VALUE_ENTRY_ASERIES, VALUE_ENTRY_TandemNSK, VALUE_ENTRY_TandemNT,
                VALUE_ENTRY_BS2000, VALUE_ENTRY_LINUX, VALUE_ENTRY_Lynx, VALUE_ENTRY_XENIX,
                VALUE_ENTRY_VM, VALUE_ENTRY_Interactive_UNIX, VALUE_ENTRY_BSDUNIX,
                VALUE_ENTRY_FreeBSD, VALUE_ENTRY_NetBSD, VALUE_ENTRY_GNU_Hurd, VALUE_ENTRY_OS9,
                VALUE_ENTRY_MACH_Kernel, VALUE_ENTRY_Inferno, VALUE_ENTRY_QNX, VALUE_ENTRY_EPOC,
                VALUE_ENTRY_IxWorks, VALUE_ENTRY_VxWorks, VALUE_ENTRY_MiNT, VALUE_ENTRY_BeOS,
                VALUE_ENTRY_HP_MPE, VALUE_ENTRY_NextStep, VALUE_ENTRY_PalmPilot,
                VALUE_ENTRY_Rhapsody, VALUE_ENTRY_Windows_2000, VALUE_ENTRY_Dedicated,
                VALUE_ENTRY_OS_390, VALUE_ENTRY_VSE, VALUE_ENTRY_TPF, VALUE_ENTRY_Windows__R__Me,
                VALUE_ENTRY_Caldera_Open_UNIX, VALUE_ENTRY_OpenBSD, VALUE_ENTRY_Not_Applicable,
                VALUE_ENTRY_Windows_XP, VALUE_ENTRY_z_OS };

    }

    /**
     * Constants of property Version
     * Software Version should be in the form <Major>.<Minor>.<Revision> or <Major>.<Minor><letter><revision>.
     */
    public static class PROPERTY_VERSION {
        /**
         * name of the property Version
         */
        public final static String NAME = "Version";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_LogicalElement.getPackages();

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
     *   The CIM_SoftwareElement class is used to decompose a CIM_SoftwareFeature object into a set of individually manageable or deployable parts, for a particular platform. A SoftwareElement's platform is uniquely identified by its underlying hardware architecture and operating system (for example Sun Solaris on Sun Sparc or Windows NT on Intel platforms). As such, to understand the details of how the functionality of a particular SoftwareFeature is provided on a particular platform, the CIM_SoftwareElement objects referenced by CIM_SoftwareFeatureSoftwareElements associations are organized in disjoint sets based on the TargetOperatingSystem property. A CIM_SoftwareElement object captures the management details of a part or component in one of four states characterized by the SoftwareElementState property.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_SoftwareElement(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   The CIM_SoftwareElement class is used to decompose a CIM_SoftwareFeature object into a set of individually manageable or deployable parts, for a particular platform. A SoftwareElement's platform is uniquely identified by its underlying hardware architecture and operating system (for example Sun Solaris on Sun Sparc or Windows NT on Intel platforms). As such, to understand the details of how the functionality of a particular SoftwareFeature is provided on a particular platform, the CIM_SoftwareElement objects referenced by CIM_SoftwareFeatureSoftwareElements associations are organized in disjoint sets based on the TargetOperatingSystem property. A CIM_SoftwareElement object captures the management details of a part or component in one of four states characterized by the SoftwareElementState property.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_SoftwareElement(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_SoftwareElement() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("BuildNumber", new CIMProperty("BuildNumber", CIMDataType.STRING_T,
                null));
        propertiesToCheck.put("CodeSet", new CIMProperty("CodeSet", CIMDataType.STRING_T, null));
        propertiesToCheck.put("IdentificationCode", new CIMProperty("IdentificationCode",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("LanguageEdition", new CIMProperty("LanguageEdition",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("Manufacturer", new CIMProperty("Manufacturer", CIMDataType.STRING_T,
                null));
        propertiesToCheck.put("Name", new CIMProperty("Name", CIMDataType.STRING_T, null));
        propertiesToCheck.put("OtherTargetOS", new CIMProperty("OtherTargetOS",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("SerialNumber", new CIMProperty("SerialNumber", CIMDataType.STRING_T,
                null));
        propertiesToCheck.put("SoftwareElementID", new CIMProperty("SoftwareElementID",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("SoftwareElementState", new CIMProperty("SoftwareElementState",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("TargetOperatingSystem", new CIMProperty("TargetOperatingSystem",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("Version", new CIMProperty("Version", CIMDataType.STRING_T, null));

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
     * Get the property BuildNumber
     *     * <br>
     * The internal identifier for this compilation of SoftwareElement.
     *     */

    public String get_BuildNumber() {
        CIMProperty currentProperty = getProperty(PROPERTY_BUILDNUMBER.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_BUILDNUMBER.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property BuildNumber
     * <br>
     * The internal identifier for this compilation of SoftwareElement.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_BuildNumber(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_BUILDNUMBER.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_BuildNumber(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_BUILDNUMBER.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property BuildNumber by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_BuildNumber(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_SoftwareElement fco = new CIM_SoftwareElement(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_BUILDNUMBER.NAME);
        if (property != null) {
            property = setPropertyValue_BuildNumber(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_BUILDNUMBER.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property BuildNumber
     * <br>
     * The internal identifier for this compilation of SoftwareElement.
     */

    private static CIMProperty setPropertyValue_BuildNumber(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property CodeSet
     *     * <br>
     * The code set used by this SoftwareElement. It defines the bit patterns that a system uses to identify characters. ISO defines various code sets such as UTF-8 and ISO8859-1.
     *     */

    public String get_CodeSet() {
        CIMProperty currentProperty = getProperty(PROPERTY_CODESET.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CODESET.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property CodeSet
     * <br>
     * The code set used by this SoftwareElement. It defines the bit patterns that a system uses to identify characters. ISO defines various code sets such as UTF-8 and ISO8859-1.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_CodeSet(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CODESET.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_CodeSet(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CODESET.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property CodeSet by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_CodeSet(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_SoftwareElement fco = new CIM_SoftwareElement(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CODESET.NAME);
        if (property != null) {
            property = setPropertyValue_CodeSet(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CODESET.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property CodeSet
     * <br>
     * The code set used by this SoftwareElement. It defines the bit patterns that a system uses to identify characters. ISO defines various code sets such as UTF-8 and ISO8859-1.
     */

    private static CIMProperty setPropertyValue_CodeSet(CIMProperty currentProperty, String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property IdentificationCode
     *     * <br>
     * The manufacturer's identifier for this SoftwareElement. Often this will be a stock keeping unit (SKU) or a part number.
     *     */

    public String get_IdentificationCode() {
        CIMProperty currentProperty = getProperty(PROPERTY_IDENTIFICATIONCODE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_IDENTIFICATIONCODE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property IdentificationCode
     * <br>
     * The manufacturer's identifier for this SoftwareElement. Often this will be a stock keeping unit (SKU) or a part number.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_IdentificationCode(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_IDENTIFICATIONCODE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_IdentificationCode(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_IDENTIFICATIONCODE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property IdentificationCode by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_IdentificationCode(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_SoftwareElement fco = new CIM_SoftwareElement(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_IDENTIFICATIONCODE.NAME);
        if (property != null) {
            property = setPropertyValue_IdentificationCode(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_IDENTIFICATIONCODE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property IdentificationCode
     * <br>
     * The manufacturer's identifier for this SoftwareElement. Often this will be a stock keeping unit (SKU) or a part number.
     */

    private static CIMProperty setPropertyValue_IdentificationCode(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property LanguageEdition
     *     * <br>
     * The value of this property identifies the language edition of this SoftwareElement. The language codes defined in ISO 639 should be used. Where the element represents a multi-lingual or international version, the string "Multilingual" should be used.
     *     */

    public String get_LanguageEdition() {
        CIMProperty currentProperty = getProperty(PROPERTY_LANGUAGEEDITION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_LANGUAGEEDITION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property LanguageEdition
     * <br>
     * The value of this property identifies the language edition of this SoftwareElement. The language codes defined in ISO 639 should be used. Where the element represents a multi-lingual or international version, the string "Multilingual" should be used.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_LanguageEdition(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_LANGUAGEEDITION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_LanguageEdition(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_LANGUAGEEDITION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property LanguageEdition by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_LanguageEdition(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_SoftwareElement fco = new CIM_SoftwareElement(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_LANGUAGEEDITION.NAME);
        if (property != null) {
            property = setPropertyValue_LanguageEdition(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_LANGUAGEEDITION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property LanguageEdition
     * <br>
     * The value of this property identifies the language edition of this SoftwareElement. The language codes defined in ISO 639 should be used. Where the element represents a multi-lingual or international version, the string "Multilingual" should be used.
     */

    private static CIMProperty setPropertyValue_LanguageEdition(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Manufacturer
     *     * <br>
     * Manufacturer of this SoftwareElement.
     *     */

    public String get_Manufacturer() {
        CIMProperty currentProperty = getProperty(PROPERTY_MANUFACTURER.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_MANUFACTURER.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property Manufacturer
     * <br>
     * Manufacturer of this SoftwareElement.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Manufacturer(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_MANUFACTURER.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Manufacturer(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_MANUFACTURER.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Manufacturer by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Manufacturer(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_SoftwareElement fco = new CIM_SoftwareElement(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MANUFACTURER.NAME);
        if (property != null) {
            property = setPropertyValue_Manufacturer(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_MANUFACTURER.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Manufacturer
     * <br>
     * Manufacturer of this SoftwareElement.
     */

    private static CIMProperty setPropertyValue_Manufacturer(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Name
     *     * <br>
     * The name used to identify this SoftwareElement.
     *     */

    public String get_key_Name() {
        CIMProperty currentProperty = getProperty(PROPERTY_NAME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_NAME.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property Name
     * <br>
     * The name used to identify this SoftwareElement.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_key_Name(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_NAME.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_key_Name(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_NAME.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Name by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_key_Name(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_SoftwareElement fco = new CIM_SoftwareElement(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_NAME.NAME);
        if (property != null) {
            property = setPropertyValue_key_Name(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_NAME.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Name
     * <br>
     * The name used to identify this SoftwareElement.
     */

    private static CIMProperty setPropertyValue_key_Name(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OtherTargetOS
     *     * <br>
     * The OtherTargetOS property records the manufacturer and operating system type for a SoftwareElement when the TargetOperatingSystem property has a value of 1 ("Other"). For all other values of TargetOperatingSystem, the OtherTargetOS property is NULL.
     *     */

    public String get_OtherTargetOS() {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERTARGETOS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OTHERTARGETOS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property OtherTargetOS
     * <br>
     * The OtherTargetOS property records the manufacturer and operating system type for a SoftwareElement when the TargetOperatingSystem property has a value of 1 ("Other"). For all other values of TargetOperatingSystem, the OtherTargetOS property is NULL.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OtherTargetOS(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERTARGETOS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_OtherTargetOS(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERTARGETOS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OtherTargetOS by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherTargetOS(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_SoftwareElement fco = new CIM_SoftwareElement(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OTHERTARGETOS.NAME);
        if (property != null) {
            property = setPropertyValue_OtherTargetOS(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERTARGETOS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OtherTargetOS
     * <br>
     * The OtherTargetOS property records the manufacturer and operating system type for a SoftwareElement when the TargetOperatingSystem property has a value of 1 ("Other"). For all other values of TargetOperatingSystem, the OtherTargetOS property is NULL.
     */

    private static CIMProperty setPropertyValue_OtherTargetOS(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property SerialNumber
     *     * <br>
     * The assigned serial number of this SoftwareElement.
     *     */

    public String get_SerialNumber() {
        CIMProperty currentProperty = getProperty(PROPERTY_SERIALNUMBER.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SERIALNUMBER.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property SerialNumber
     * <br>
     * The assigned serial number of this SoftwareElement.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_SerialNumber(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SERIALNUMBER.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_SerialNumber(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SERIALNUMBER.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SerialNumber by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SerialNumber(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_SoftwareElement fco = new CIM_SoftwareElement(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SERIALNUMBER.NAME);
        if (property != null) {
            property = setPropertyValue_SerialNumber(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SERIALNUMBER.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SerialNumber
     * <br>
     * The assigned serial number of this SoftwareElement.
     */

    private static CIMProperty setPropertyValue_SerialNumber(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property SoftwareElementID
     *     * <br>
     * This is an identifier for the SoftwareElement and is designed to be used in conjunction with other keys to create a unique representation of the element.
     *     */

    public String get_key_SoftwareElementID() {
        CIMProperty currentProperty = getProperty(PROPERTY_SOFTWAREELEMENTID.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SOFTWAREELEMENTID.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property SoftwareElementID
     * <br>
     * This is an identifier for the SoftwareElement and is designed to be used in conjunction with other keys to create a unique representation of the element.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_key_SoftwareElementID(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SOFTWAREELEMENTID.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_key_SoftwareElementID(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SOFTWAREELEMENTID.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SoftwareElementID by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_key_SoftwareElementID(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_SoftwareElement fco = new CIM_SoftwareElement(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SOFTWAREELEMENTID.NAME);
        if (property != null) {
            property = setPropertyValue_key_SoftwareElementID(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SOFTWAREELEMENTID.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SoftwareElementID
     * <br>
     * This is an identifier for the SoftwareElement and is designed to be used in conjunction with other keys to create a unique representation of the element.
     */

    private static CIMProperty setPropertyValue_key_SoftwareElementID(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property SoftwareElementState
     *     * <br>
     * The SoftwareElementState is defined in this model to identify various states of a SoftwareElement's life cycle. 
     * - A SoftwareElement in the deployable state describes the details necessary to successfully distribute it and the details (Checks and Actions) required to move it to the installable state (i.e, the next state). 
     * - A SoftwareElement in the installable state describes the details necessary to successfully install it and the details (Checks and Actions) required to create an element in the executable state (i.e., the next state). 
     * - A SoftwareElement in the executable state describes the details necessary to successfully start it and the details (Checks and Actions) required to move it to the running state (i.e., the next state). 
     * - A SoftwareElement in the running state describes the details necessary to manage the started element.
     *     */

    public javax.cim.UnsignedInteger16 get_key_SoftwareElementState() {
        CIMProperty currentProperty = getProperty(PROPERTY_SOFTWAREELEMENTSTATE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SOFTWAREELEMENTSTATE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property SoftwareElementState
     * <br>
     * The SoftwareElementState is defined in this model to identify various states of a SoftwareElement's life cycle. 
     * - A SoftwareElement in the deployable state describes the details necessary to successfully distribute it and the details (Checks and Actions) required to move it to the installable state (i.e, the next state). 
     * - A SoftwareElement in the installable state describes the details necessary to successfully install it and the details (Checks and Actions) required to create an element in the executable state (i.e., the next state). 
     * - A SoftwareElement in the executable state describes the details necessary to successfully start it and the details (Checks and Actions) required to move it to the running state (i.e., the next state). 
     * - A SoftwareElement in the running state describes the details necessary to manage the started element.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_key_SoftwareElementState(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SOFTWAREELEMENTSTATE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_key_SoftwareElementState(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SOFTWAREELEMENTSTATE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SoftwareElementState by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_key_SoftwareElementState(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_SoftwareElement fco = new CIM_SoftwareElement(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SOFTWAREELEMENTSTATE.NAME);
        if (property != null) {
            property = setPropertyValue_key_SoftwareElementState(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SOFTWAREELEMENTSTATE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SoftwareElementState
     * <br>
     * The SoftwareElementState is defined in this model to identify various states of a SoftwareElement's life cycle. 
     * - A SoftwareElement in the deployable state describes the details necessary to successfully distribute it and the details (Checks and Actions) required to move it to the installable state (i.e, the next state). 
     * - A SoftwareElement in the installable state describes the details necessary to successfully install it and the details (Checks and Actions) required to create an element in the executable state (i.e., the next state). 
     * - A SoftwareElement in the executable state describes the details necessary to successfully start it and the details (Checks and Actions) required to move it to the running state (i.e., the next state). 
     * - A SoftwareElement in the running state describes the details necessary to manage the started element.
     */

    private static CIMProperty setPropertyValue_key_SoftwareElementState(
            CIMProperty currentProperty, javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property TargetOperatingSystem
     *     * <br>
     * The TargetOperatingSystem property specifies the element's operating system environment. The value of this property does not ensure that it is binary executable. Two other pieces of information are needed. First, the version of the OS needs to be specified using the class, CIM_OSVersion Check. The second piece of information is the architecture that the OS runs on. This information is verified using CIM_ArchitectureCheck. The combination of these constructs clearly identifies the level of OS required for a particular SoftwareElement.
     *     */

    public javax.cim.UnsignedInteger16 get_key_TargetOperatingSystem() {
        CIMProperty currentProperty = getProperty(PROPERTY_TARGETOPERATINGSYSTEM.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_TARGETOPERATINGSYSTEM.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property TargetOperatingSystem
     * <br>
     * The TargetOperatingSystem property specifies the element's operating system environment. The value of this property does not ensure that it is binary executable. Two other pieces of information are needed. First, the version of the OS needs to be specified using the class, CIM_OSVersion Check. The second piece of information is the architecture that the OS runs on. This information is verified using CIM_ArchitectureCheck. The combination of these constructs clearly identifies the level of OS required for a particular SoftwareElement.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_key_TargetOperatingSystem(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_TARGETOPERATINGSYSTEM.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_key_TargetOperatingSystem(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_TARGETOPERATINGSYSTEM.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property TargetOperatingSystem by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_key_TargetOperatingSystem(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_SoftwareElement fco = new CIM_SoftwareElement(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_TARGETOPERATINGSYSTEM.NAME);
        if (property != null) {
            property = setPropertyValue_key_TargetOperatingSystem(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_TARGETOPERATINGSYSTEM.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property TargetOperatingSystem
     * <br>
     * The TargetOperatingSystem property specifies the element's operating system environment. The value of this property does not ensure that it is binary executable. Two other pieces of information are needed. First, the version of the OS needs to be specified using the class, CIM_OSVersion Check. The second piece of information is the architecture that the OS runs on. This information is verified using CIM_ArchitectureCheck. The combination of these constructs clearly identifies the level of OS required for a particular SoftwareElement.
     */

    private static CIMProperty setPropertyValue_key_TargetOperatingSystem(
            CIMProperty currentProperty, javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Version
     *     * <br>
     * Software Version should be in the form <Major>.<Minor>.<Revision> or <Major>.<Minor><letter><revision>.
     *     */

    public String get_key_Version() {
        CIMProperty currentProperty = getProperty(PROPERTY_VERSION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_VERSION.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property Version
     * <br>
     * Software Version should be in the form <Major>.<Minor>.<Revision> or <Major>.<Minor><letter><revision>.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_key_Version(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_VERSION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_key_Version(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_VERSION.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Version by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_key_Version(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_SoftwareElement fco = new CIM_SoftwareElement(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_VERSION.NAME);
        if (property != null) {
            property = setPropertyValue_key_Version(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_VERSION.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Version
     * <br>
     * Software Version should be in the form <Major>.<Minor>.<Revision> or <Major>.<Minor><letter><revision>.
     */

    private static CIMProperty setPropertyValue_key_Version(CIMProperty currentProperty,
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
     * Get the list with CIM_SoftwareFeature objects associated by the association CIM_SoftwareFeatureSoftwareElements
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREFEATURESOFTWAREELEMENTS as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_SoftwareFeature_CIM_SoftwareFeatureSoftwareElementss(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_SoftwareFeature_CIM_SoftwareFeatureSoftwareElementss(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREFEATURESOFTWAREELEMENTS,
                CIM_SoftwareFeature.CIM_CLASS_NAME, null, null, false, false, null);

    }

    /**
     * Get the list with CIM_SoftwareFeature objects associated by the association CIM_SoftwareFeatureSoftwareElements
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREFEATURESOFTWAREELEMENTS or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREFEATURESOFTWAREELEMENTS as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_SoftwareFeature_CIM_SoftwareFeatureSoftwareElementss(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_SoftwareFeature_CIM_SoftwareFeatureSoftwareElementss(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREFEATURESOFTWAREELEMENTS, resultClass, role,
                resultRole, false, false, null);

    }

    /**
     * Get the list with CIM_SoftwareFeature objects associated by the association CIM_SoftwareFeatureSoftwareElements
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREFEATURESOFTWAREELEMENTS or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_SoftwareFeature_CIM_SoftwareFeatureSoftwareElementss(
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
                CIM_SoftwareElementHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_SoftwareElementHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_SoftwareElementHelper.findClass(cimClient, cimInstance);

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
            CIM_SoftwareElementHelper.checkException(enumeration);
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
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_SoftwareFeatureSoftwareElements
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREFEATURESOFTWAREELEMENTS as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_SoftwareFeature_CIM_SoftwareFeatureSoftwareElementsNames(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_SoftwareFeature_CIM_SoftwareFeatureSoftwareElementsNames(
                cimClient, true, CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREFEATURESOFTWAREELEMENTS,
                CIM_SoftwareFeature.CIM_CLASS_NAME, null, null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_SoftwareFeatureSoftwareElements
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREFEATURESOFTWAREELEMENTS or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREFEATURESOFTWAREELEMENTS as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_SoftwareFeature_CIM_SoftwareFeatureSoftwareElementsNames(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_SoftwareFeature_CIM_SoftwareFeatureSoftwareElementsNames(
                cimClient, true, CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREFEATURESOFTWAREELEMENTS,
                resultClass, role, resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_SoftwareFeatureSoftwareElements
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_SoftwareFeature_CIM_SoftwareFeatureSoftwareElementsNames(
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREFEATURESOFTWAREELEMENTS,
                    CIM_SoftwareFeature.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_SoftwareElementHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_SoftwareElementHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_SoftwareFeature.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_SoftwareElementHelper.checkException(enumeration);
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
     * Get the list with CIM_SoftwareFeatureSoftwareElements associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_SoftwareFeatureSoftwareElements(WBEMClient cimClient,
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREFEATURESOFTWAREELEMENTS, role,
                    includeQualifiers, includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREFEATURESOFTWAREELEMENTS, role,
                    includeQualifiers, includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_SoftwareElementHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_SoftwareElementHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_SoftwareFeatureSoftwareElementsHelper.findClass(cimClient,
                            cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_SoftwareFeatureSoftwareElements(cimInstance));
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
                        result.add(new CIM_SoftwareFeatureSoftwareElements(cimInstance));
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
                        result.add(new CIM_SoftwareFeatureSoftwareElements(cimInstance));
                        continue;
                    }
                }
            }
            CIM_SoftwareElementHelper.checkException(enumeration);
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
     * Get a list of CIMObjectPath items of the associations CIM_SoftwareFeatureSoftwareElements
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_SoftwareFeatureSoftwareElements(
            WBEMClient cimClient, String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREFEATURESOFTWAREELEMENTS, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREFEATURESOFTWAREELEMENTS, role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_SoftwareElementHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_SoftwareElementHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_SoftwareFeatureSoftwareElements.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_SoftwareElementHelper.checkException(enumeration);
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
     * Get the list with CIM_SoftwareElement objects associated by the association CIM_SoftwareElementComponent
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREELEMENTCOMPONENT as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_SoftwareElement_CIM_SoftwareElementComponents(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_SoftwareElement_CIM_SoftwareElementComponents(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREELEMENTCOMPONENT,
                CIM_SoftwareElement.CIM_CLASS_NAME, null, null, false, false, null);

    }

    /**
     * Get the list with CIM_SoftwareElement objects associated by the association CIM_SoftwareElementComponent
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREELEMENTCOMPONENT or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREELEMENTCOMPONENT as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_SoftwareElement_CIM_SoftwareElementComponents(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_SoftwareElement_CIM_SoftwareElementComponents(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREELEMENTCOMPONENT, resultClass, role,
                resultRole, false, false, null);

    }

    /**
     * Get the list with CIM_SoftwareElement objects associated by the association CIM_SoftwareElementComponent
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREELEMENTCOMPONENT or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_SoftwareElement_CIM_SoftwareElementComponents(
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
                CIM_SoftwareElementHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_SoftwareElementHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_SoftwareElementHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_SoftwareElement(cimInstance));
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
                        result.add(new CIM_SoftwareElement(cimInstance));
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
                        result.add(new CIM_SoftwareElement(cimInstance));
                        continue;
                    }
                }
            }
            CIM_SoftwareElementHelper.checkException(enumeration);
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
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_SoftwareElementComponent
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREELEMENTCOMPONENT as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_SoftwareElement_CIM_SoftwareElementComponentNames(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_SoftwareElement_CIM_SoftwareElementComponentNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREELEMENTCOMPONENT,
                CIM_SoftwareElement.CIM_CLASS_NAME, null, null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_SoftwareElementComponent
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREELEMENTCOMPONENT or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREELEMENTCOMPONENT as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_SoftwareElement_CIM_SoftwareElementComponentNames(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_SoftwareElement_CIM_SoftwareElementComponentNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREELEMENTCOMPONENT, resultClass, role,
                resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_SoftwareElementComponent
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_SoftwareElement_CIM_SoftwareElementComponentNames(
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
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREELEMENTCOMPONENT,
                    CIM_SoftwareElement.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_SoftwareElementHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_SoftwareElementHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_SoftwareElement.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_SoftwareElementHelper.checkException(enumeration);
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
     * Get the list with CIM_SoftwareElementComponent associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_SoftwareElementComponent(WBEMClient cimClient,
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREELEMENTCOMPONENT, role,
                    includeQualifiers, includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREELEMENTCOMPONENT, role,
                    includeQualifiers, includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_SoftwareElementHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_SoftwareElementHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_SoftwareElementComponentHelper.findClass(cimClient,
                            cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_SoftwareElementComponent(cimInstance));
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
                        result.add(new CIM_SoftwareElementComponent(cimInstance));
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
                        result.add(new CIM_SoftwareElementComponent(cimInstance));
                        continue;
                    }
                }
            }
            CIM_SoftwareElementHelper.checkException(enumeration);
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
     * Get a list of CIMObjectPath items of the associations CIM_SoftwareElementComponent
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_SoftwareElementComponent(WBEMClient cimClient,
            String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREELEMENTCOMPONENT, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREELEMENTCOMPONENT,
                    role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_SoftwareElementHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_SoftwareElementHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_SoftwareElementComponent.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_SoftwareElementHelper.checkException(enumeration);
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
     * Get the list with CIM_Service objects associated by the association CIM_SoftwareElementServiceImplementation
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREELEMENTSERVICEIMPLEMENTATION as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_Service_CIM_SoftwareElementServiceImplementations(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_Service_CIM_SoftwareElementServiceImplementations(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREELEMENTSERVICEIMPLEMENTATION,
                CIM_Service.CIM_CLASS_NAME, null, null, false, false, null);

    }

    /**
     * Get the list with CIM_Service objects associated by the association CIM_SoftwareElementServiceImplementation
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREELEMENTSERVICEIMPLEMENTATION or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREELEMENTSERVICEIMPLEMENTATION as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_Service_CIM_SoftwareElementServiceImplementations(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_Service_CIM_SoftwareElementServiceImplementations(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREELEMENTSERVICEIMPLEMENTATION, resultClass,
                role, resultRole, false, false, null);

    }

    /**
     * Get the list with CIM_Service objects associated by the association CIM_SoftwareElementServiceImplementation
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREELEMENTSERVICEIMPLEMENTATION or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_Service_CIM_SoftwareElementServiceImplementations(
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
                CIM_SoftwareElementHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_SoftwareElementHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_SoftwareElementHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_Service(cimInstance));
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
                        result.add(new CIM_Service(cimInstance));
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
                        result.add(new CIM_Service(cimInstance));
                        continue;
                    }
                }
            }
            CIM_SoftwareElementHelper.checkException(enumeration);
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
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_SoftwareElementServiceImplementation
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREELEMENTSERVICEIMPLEMENTATION as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_Service_CIM_SoftwareElementServiceImplementationNames(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_Service_CIM_SoftwareElementServiceImplementationNames(cimClient,
                true, CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREELEMENTSERVICEIMPLEMENTATION,
                CIM_Service.CIM_CLASS_NAME, null, null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_SoftwareElementServiceImplementation
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREELEMENTSERVICEIMPLEMENTATION or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREELEMENTSERVICEIMPLEMENTATION as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_Service_CIM_SoftwareElementServiceImplementationNames(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_Service_CIM_SoftwareElementServiceImplementationNames(cimClient,
                true, CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREELEMENTSERVICEIMPLEMENTATION,
                resultClass, role, resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_SoftwareElementServiceImplementation
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_Service_CIM_SoftwareElementServiceImplementationNames(
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREELEMENTSERVICEIMPLEMENTATION,
                    CIM_Service.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_SoftwareElementHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_SoftwareElementHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_Service.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_SoftwareElementHelper.checkException(enumeration);
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
     * Get the list with CIM_SoftwareElementServiceImplementation associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_SoftwareElementServiceImplementation(
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREELEMENTSERVICEIMPLEMENTATION, role,
                    includeQualifiers, includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREELEMENTSERVICEIMPLEMENTATION, role,
                    includeQualifiers, includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_SoftwareElementHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_SoftwareElementHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_SoftwareElementServiceImplementationHelper.findClass(
                            cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_SoftwareElementServiceImplementation(cimInstance));
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
                        result.add(new CIM_SoftwareElementServiceImplementation(cimInstance));
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
                        result.add(new CIM_SoftwareElementServiceImplementation(cimInstance));
                        continue;
                    }
                }
            }
            CIM_SoftwareElementHelper.checkException(enumeration);
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
     * Get a list of CIMObjectPath items of the associations CIM_SoftwareElementServiceImplementation
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_SoftwareElementServiceImplementation(
            WBEMClient cimClient, String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREELEMENTSERVICEIMPLEMENTATION, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREELEMENTSERVICEIMPLEMENTATION, role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_SoftwareElementHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_SoftwareElementHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_SoftwareElementServiceImplementation.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_SoftwareElementHelper.checkException(enumeration);
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
     * Get the list with CIM_ServiceAccessPoint objects associated by the association CIM_SoftwareElementSAPImplementation
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREELEMENTSAPIMPLEMENTATION as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_ServiceAccessPoint_CIM_SoftwareElementSAPImplementations(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_ServiceAccessPoint_CIM_SoftwareElementSAPImplementations(
                cimClient, CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREELEMENTSAPIMPLEMENTATION,
                CIM_ServiceAccessPoint.CIM_CLASS_NAME, null, null, false, false, null);

    }

    /**
     * Get the list with CIM_ServiceAccessPoint objects associated by the association CIM_SoftwareElementSAPImplementation
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREELEMENTSAPIMPLEMENTATION or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREELEMENTSAPIMPLEMENTATION as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_ServiceAccessPoint_CIM_SoftwareElementSAPImplementations(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_ServiceAccessPoint_CIM_SoftwareElementSAPImplementations(
                cimClient, CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREELEMENTSAPIMPLEMENTATION,
                resultClass, role, resultRole, false, false, null);

    }

    /**
     * Get the list with CIM_ServiceAccessPoint objects associated by the association CIM_SoftwareElementSAPImplementation
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREELEMENTSAPIMPLEMENTATION or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_ServiceAccessPoint_CIM_SoftwareElementSAPImplementations(
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
                CIM_SoftwareElementHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_SoftwareElementHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_SoftwareElementHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_ServiceAccessPoint(cimInstance));
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
                        result.add(new CIM_ServiceAccessPoint(cimInstance));
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
                        result.add(new CIM_ServiceAccessPoint(cimInstance));
                        continue;
                    }
                }
            }
            CIM_SoftwareElementHelper.checkException(enumeration);
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
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_SoftwareElementSAPImplementation
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREELEMENTSAPIMPLEMENTATION as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_ServiceAccessPoint_CIM_SoftwareElementSAPImplementationNames(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_ServiceAccessPoint_CIM_SoftwareElementSAPImplementationNames(
                cimClient, true, CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREELEMENTSAPIMPLEMENTATION,
                CIM_ServiceAccessPoint.CIM_CLASS_NAME, null, null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_SoftwareElementSAPImplementation
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREELEMENTSAPIMPLEMENTATION or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREELEMENTSAPIMPLEMENTATION as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_ServiceAccessPoint_CIM_SoftwareElementSAPImplementationNames(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_ServiceAccessPoint_CIM_SoftwareElementSAPImplementationNames(
                cimClient, true, CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREELEMENTSAPIMPLEMENTATION,
                resultClass, role, resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_SoftwareElementSAPImplementation
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_ServiceAccessPoint_CIM_SoftwareElementSAPImplementationNames(
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREELEMENTSAPIMPLEMENTATION,
                    CIM_ServiceAccessPoint.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_SoftwareElementHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_SoftwareElementHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_ServiceAccessPoint.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_SoftwareElementHelper.checkException(enumeration);
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
     * Get the list with CIM_SoftwareElementSAPImplementation associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_SoftwareElementSAPImplementation(
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREELEMENTSAPIMPLEMENTATION, role,
                    includeQualifiers, includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREELEMENTSAPIMPLEMENTATION, role,
                    includeQualifiers, includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_SoftwareElementHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_SoftwareElementHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_SoftwareElementSAPImplementationHelper.findClass(cimClient,
                            cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_SoftwareElementSAPImplementation(cimInstance));
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
                        result.add(new CIM_SoftwareElementSAPImplementation(cimInstance));
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
                        result.add(new CIM_SoftwareElementSAPImplementation(cimInstance));
                        continue;
                    }
                }
            }
            CIM_SoftwareElementHelper.checkException(enumeration);
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
     * Get a list of CIMObjectPath items of the associations CIM_SoftwareElementSAPImplementation
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_SoftwareElementSAPImplementation(
            WBEMClient cimClient, String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREELEMENTSAPIMPLEMENTATION, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_SOFTWAREELEMENTSAPIMPLEMENTATION, role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_SoftwareElementHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_SoftwareElementHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_SoftwareElementSAPImplementation.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_SoftwareElementHelper.checkException(enumeration);
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
        return CIM_SoftwareElement.CIM_CLASS_NAME;
    }

}