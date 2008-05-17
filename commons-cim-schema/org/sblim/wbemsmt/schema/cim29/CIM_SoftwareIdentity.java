/** 
 * CIM_SoftwareIdentity.java
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
 * Description: SoftwareIdentity represents software, viewed as an asset and/or individually identifiable entity (similar to Physical Element). It does NOT indicate whether the software is installed, executing, etc. (The latter is the role of the SoftwareFeature/ SoftwareElement classes and the Application Model.) Since software may be acquired, SoftwareIdentity can be associated with a Product using the ProductSoftwareComponent relationship. 
 * Note that the Application Model manages the deployment and installation of software via the classes, SoftwareFeatures and SoftwareElements. The deployment/installation concepts are related to the asset/identity one. In fact, a SoftwareIdentity may correspond to a Product, or to one or more SoftwareFeatures or SoftwareElements - depending on the granularity of these classes and the deployment model. The correspondence of Software Identity to Product, SoftwareFeature or SoftwareElement is indicated using the ConcreteIdentity association. Note that there may not be sufficient detail or instrumentation to instantiate ConcreteIdentity. And, if the association is instantiated, some duplication of information may result. For example, the Vendor described in the instances of Product and SoftwareIdentity MAY be the same. However, this is not necessarily true, and it is why vendor and similar information are duplicated in this class. 
 * Note that ConcreteIdentity can also be used to describe the relationship of the software to any LogicalFiles that result from installing it. As above, there may not be sufficient detail or instrumentation to instantiate this association.
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

public class CIM_SoftwareIdentity extends CIM_LogicalElement {

    public final static String CIM_CLASS_NAME = "CIM_SoftwareIdentity";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Indicates that the referenced SoftwareIdentity is acquired as part of a Product.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_PRODUCTSOFTWARECOMPONENT = "CIM_ProductSoftwareComponent";

    /**
     * ElementSoftwareIdentity allows a Managed Element to report its software related asset information (firmware, drivers, configuration software, and etc.)
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTSOFTWAREIDENTITY = "CIM_ElementSoftwareIdentity";

    /**
     * The InstalledSoftwareIdentity association identifies the System on which a SoftwareIdentity is installed. This class is a corollary to InstalledSoftwareElement, but deals with the asset aspects of software (as indicated by SoftwareIdentity), versus the deployment aspects (as indicated by SoftwareElement).
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_INSTALLEDSOFTWAREIDENTITY = "CIM_InstalledSoftwareIdentity";

    /**
     * Constants of property BuildNumber
     * The build number of the software.
     */
    public static class PROPERTY_BUILDNUMBER {
        /**
         * name of the property BuildNumber
         */
        public final static String NAME = "BuildNumber";

    }

    /**
     * Constants of property ClassificationDescriptions
     * An array of free-form strings providing more detailed explanations for any of the entries in the Classifications array. Note that each entry is related to one in the Classifications array located at the same index.
     */
    public static class PROPERTY_CLASSIFICATIONDESCRIPTIONS {
        /**
         * name of the property ClassificationDescriptions
         */
        public final static String NAME = "ClassificationDescriptions";

    }

    /**
     * Constants of property Classifications
     * An array of enumerated integers that classify this software. For example, the software MAY be instrumentation (value=5) or firmware and diagnostic software (10 and 7). The use of value 6, Firmware/BIOS, is being deprecated. Instead, either the value 10 (Firmware) and/or 11 (BIOS/FCode) SHOULD be used.
     */
    public static class PROPERTY_CLASSIFICATIONS {
        /**
         * name of the property Classifications
         */
        public final static String NAME = "Classifications";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Driver = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Driver (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Driver = "Driver";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Configuration_Software = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Configuration Software (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Configuration_Software = "Configuration Software";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Application_Software = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Application Software (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Application_Software = "Application Software";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Instrumentation = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry Instrumentation (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Instrumentation = "Instrumentation";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Firmware_BIOS = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry Firmware/BIOS (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Firmware_BIOS = "Firmware/BIOS";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Diagnostic_Software = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry Diagnostic Software (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_Diagnostic_Software = "Diagnostic Software";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Operating_System = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry Operating System (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_Operating_System = "Operating System";

        /**
         * constant for value map entry 9
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Middleware = new javax.cim.UnsignedInteger16(
                "9");

        /**
         * constant for value entry Middleware (corresponds to mapEntry 9 )
         */
        public final static String VALUE_ENTRY_Middleware = "Middleware";

        /**
         * constant for value map entry 10
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Firmware = new javax.cim.UnsignedInteger16(
                "10");

        /**
         * constant for value entry Firmware (corresponds to mapEntry 10 )
         */
        public final static String VALUE_ENTRY_Firmware = "Firmware";

        /**
         * constant for value map entry 11
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_BIOS_FCode = new javax.cim.UnsignedInteger16(
                "11");

        /**
         * constant for value entry BIOS/FCode (corresponds to mapEntry 11 )
         */
        public final static String VALUE_ENTRY_BIOS_FCode = "BIOS/FCode";

        /**
         * constant for value map entry ..
         */

        /**
         * constant for value entry DMTF Reserved (corresponds to mapEntry .. )
         */
        public final static String VALUE_ENTRY_DMTF_Reserved = "DMTF Reserved";

        /**
         * constant for value map entry 0x8000..0xFFFF
         */

        /**
         * constant for value entry Vendor Reserved (corresponds to mapEntry 0x8000..0xFFFF )
         */
        public final static String VALUE_ENTRY_Vendor_Reserved = "Vendor Reserved";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@4880488
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Driver.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Driver;
            }

            if (VALUE_ENTRY_Configuration_Software.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Configuration_Software;
            }

            if (VALUE_ENTRY_Application_Software.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Application_Software;
            }

            if (VALUE_ENTRY_Instrumentation.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Instrumentation;
            }

            if (VALUE_ENTRY_Firmware_BIOS.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Firmware_BIOS;
            }

            if (VALUE_ENTRY_Diagnostic_Software.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Diagnostic_Software;
            }

            if (VALUE_ENTRY_Operating_System.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Operating_System;
            }

            if (VALUE_ENTRY_Middleware.equals(value)) {
                return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Middleware;
            }

            if (VALUE_ENTRY_Firmware.equals(value)) {
                return VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Firmware;
            }

            if (VALUE_ENTRY_BIOS_FCode.equals(value)) {
                return VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_BIOS_FCode;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Driver.intValue()) {
                return VALUE_ENTRY_Driver;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Configuration_Software.intValue()) {
                return VALUE_ENTRY_Configuration_Software;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Application_Software.intValue()) {
                return VALUE_ENTRY_Application_Software;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Instrumentation.intValue()) {
                return VALUE_ENTRY_Instrumentation;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Firmware_BIOS.intValue()) {
                return VALUE_ENTRY_Firmware_BIOS;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Diagnostic_Software.intValue()) {
                return VALUE_ENTRY_Diagnostic_Software;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Operating_System.intValue()) {
                return VALUE_ENTRY_Operating_System;
            }

            if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Middleware.intValue()) {
                return VALUE_ENTRY_Middleware;
            }

            if (iValue == VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Firmware.intValue()) {
                return VALUE_ENTRY_Firmware;
            }

            if (iValue == VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_BIOS_FCode.intValue()) {
                return VALUE_ENTRY_BIOS_FCode;
            }

            if (iValue >= 0x8000 || iValue <= 0xFFFF) {
                return VALUE_ENTRY_Vendor_Reserved;
            }
            return VALUE_ENTRY_DMTF_Reserved;

        }

        /**
         * get the ValueEntries of the given valueMapEntries
         * @param values the values to find the ValueMapEntries for
         * @return the array with ValueMap entries. Some of them may be null to if no valueMap entry was found
         */

        public static javax.cim.UnsignedInteger16[] getValueMapEntries(String[] values) {
            javax.cim.UnsignedInteger16[] result = new javax.cim.UnsignedInteger16[values.length];

            for (int i = 0; i < result.length; i++) {
                result[i] = getValueMapEntry(values[i]);
            }

            return result;
        }

        /**
         * get the ValueMapEntries of the given valueEntries
         * @param valueMapEntries the valueMap entries to find the Values for
         * @return the array with Value entries. Some of them may be null to if no value entry was found
         */

        public static String[] getValueEntries(javax.cim.UnsignedInteger16[] values) {
            String[] result = new String[values.length];

            for (int i = 0; i < result.length; i++) {
                result[i] = getValueEntry(values[i]);
            }

            return result;
        }

        /**
         * ValueMap entries
         * Contains no entries that having an integer value range representation
         * 
         * The couterpart for the value entries is returned by VALUE_ENTRIES_FOR_DISPLAY
         *
         * @see \#VALUE_ENTRIES_FOR_DISPLAY
         * 
         * Value Map for the property Classifications   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Driver,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Configuration_Software,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Application_Software,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Instrumentation,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Firmware_BIOS,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Diagnostic_Software,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Operating_System,
                VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Middleware,
                VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Firmware,
                VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_BIOS_FCode };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property Classifications   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_Driver, VALUE_ENTRY_Configuration_Software,
                VALUE_ENTRY_Application_Software, VALUE_ENTRY_Instrumentation,
                VALUE_ENTRY_Firmware_BIOS, VALUE_ENTRY_Diagnostic_Software,
                VALUE_ENTRY_Operating_System, VALUE_ENTRY_Middleware, VALUE_ENTRY_Firmware,
                VALUE_ENTRY_BIOS_FCode, VALUE_ENTRY_DMTF_Reserved, VALUE_ENTRY_Vendor_Reserved };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property Classifications   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_Driver, VALUE_ENTRY_Configuration_Software,
                VALUE_ENTRY_Application_Software, VALUE_ENTRY_Instrumentation,
                VALUE_ENTRY_Firmware_BIOS, VALUE_ENTRY_Diagnostic_Software,
                VALUE_ENTRY_Operating_System, VALUE_ENTRY_Middleware, VALUE_ENTRY_Firmware,
                VALUE_ENTRY_BIOS_FCode };

    }

    /**
     * Constants of property InstanceID
     * Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. In order to ensure uniqueness within the NameSpace, the value of InstanceID SHOULD be constructed using the following 'preferred' algorithm: 
     * <OrgID>:<LocalID> 
     * Where <OrgID> and <LocalID> are separated by a colon ':', and where <OrgID> MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity creating/defining the InstanceID, or is a registered ID that is assigned to the business entity by a recognized global authority (This is similar to the <Schema Name>_<Class Name> structure of Schema class names.) In addition, to ensure uniqueness <OrgID> MUST NOT contain a colon (':'). When using this algorithm, the first colon to appear in InstanceID MUST appear between <OrgID> and <LocalID>. 
     * <LocalID> is chosen by the business entity and SHOULD not be re-used to identify different underlying (real-world) elements. If the above 'preferred' algorithm is not used, the defining entity MUST assure that the resultant InstanceID is not re-used across any InstanceIDs produced by this or other providers for this instance's NameSpace. 
     * For DMTF defined instances, the 'preferred' algorithm MUST be used with the <OrgID> set to 'CIM'.
     */
    public static class PROPERTY_INSTANCEID {
        /**
         * name of the property InstanceID
         */
        public final static String NAME = "InstanceID";

    }

    /**
     * Constants of property Languages
     * The language editions supported by the software. The language codes defined in ISO 639 should be used.
     */
    public static class PROPERTY_LANGUAGES {
        /**
         * name of the property Languages
         */
        public final static String NAME = "Languages";

    }

    /**
     * Constants of property MajorVersion
     * The major number component of the software's version information - for example, '12' from version 12.1(3)T. This property is defined as a numeric value to allow the determination of 'newer' vs. 'older' releases. A 'newer' major release is indicated by a larger numeric value.
     */
    public static class PROPERTY_MAJORVERSION {
        /**
         * name of the property MajorVersion
         */
        public final static String NAME = "MajorVersion";

    }

    /**
     * Constants of property Manufacturer
     * Manufacturer of this software.
     */
    public static class PROPERTY_MANUFACTURER {
        /**
         * name of the property Manufacturer
         */
        public final static String NAME = "Manufacturer";

    }

    /**
     * Constants of property MinorVersion
     * The minor number component of the software's version information - for example, '1' from version 12.1(3)T. This property is defined as a numeric value to allow the determination of 'newer' vs. 'older' releases. A 'newer' minor release is indicated by a larger numeric value.
     */
    public static class PROPERTY_MINORVERSION {
        /**
         * name of the property MinorVersion
         */
        public final static String NAME = "MinorVersion";

    }

    /**
     * Constants of property ReleaseDate
     * The date the software was released.
     */
    public static class PROPERTY_RELEASEDATE {
        /**
         * name of the property ReleaseDate
         */
        public final static String NAME = "ReleaseDate";

    }

    /**
     * Constants of property RevisionNumber
     * The revision or maintenance release component of the software's version information - for example, '3' from version 12.1(3)T. This property is defined as a numeric value to allow the determination of 'newer' vs. 'older' releases. A 'newer' revision is indicated by a larger numeric value.
     */
    public static class PROPERTY_REVISIONNUMBER {
        /**
         * name of the property RevisionNumber
         */
        public final static String NAME = "RevisionNumber";

    }

    /**
     * Constants of property SerialNumber
     * A manufacturer-allocated number used to identify the software.
     */
    public static class PROPERTY_SERIALNUMBER {
        /**
         * name of the property SerialNumber
         */
        public final static String NAME = "SerialNumber";

    }

    /**
     * Constants of property TargetOperatingSystems
     * Specifies the target operating systems of the software. Due to the extreme variability in operating systems, this property is defined as a string array.
     */
    public static class PROPERTY_TARGETOPERATINGSYSTEMS {
        /**
         * name of the property TargetOperatingSystems
         */
        public final static String NAME = "TargetOperatingSystems";

    }

    /**
     * Constants of property VersionString
     * A string representing the complete software version information - for example, '12.1(3)T'. This string and the numeric major/minor/revision/build properties are complementary. Since vastly different representations and semantics exist for versions, it is not assumed that one representation is sufficient to permit a client to perform computations (i.e., the values are numeric) and a user to recognize the software's version (i.e., the values are understandable and readable). Hence, both numeric and string representations of version are provided.
     */
    public static class PROPERTY_VERSIONSTRING {
        /**
         * name of the property VersionString
         */
        public final static String NAME = "VersionString";

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
     *   SoftwareIdentity represents software, viewed as an asset and/or individually identifiable entity (similar to Physical Element). It does NOT indicate whether the software is installed, executing, etc. (The latter is the role of the SoftwareFeature/ SoftwareElement classes and the Application Model.) Since software may be acquired, SoftwareIdentity can be associated with a Product using the ProductSoftwareComponent relationship. 
     * Note that the Application Model manages the deployment and installation of software via the classes, SoftwareFeatures and SoftwareElements. The deployment/installation concepts are related to the asset/identity one. In fact, a SoftwareIdentity may correspond to a Product, or to one or more SoftwareFeatures or SoftwareElements - depending on the granularity of these classes and the deployment model. The correspondence of Software Identity to Product, SoftwareFeature or SoftwareElement is indicated using the ConcreteIdentity association. Note that there may not be sufficient detail or instrumentation to instantiate ConcreteIdentity. And, if the association is instantiated, some duplication of information may result. For example, the Vendor described in the instances of Product and SoftwareIdentity MAY be the same. However, this is not necessarily true, and it is why vendor and similar information are duplicated in this class. 
     * Note that ConcreteIdentity can also be used to describe the relationship of the software to any LogicalFiles that result from installing it. As above, there may not be sufficient detail or instrumentation to instantiate this association.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_SoftwareIdentity(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   SoftwareIdentity represents software, viewed as an asset and/or individually identifiable entity (similar to Physical Element). It does NOT indicate whether the software is installed, executing, etc. (The latter is the role of the SoftwareFeature/ SoftwareElement classes and the Application Model.) Since software may be acquired, SoftwareIdentity can be associated with a Product using the ProductSoftwareComponent relationship. 
     * Note that the Application Model manages the deployment and installation of software via the classes, SoftwareFeatures and SoftwareElements. The deployment/installation concepts are related to the asset/identity one. In fact, a SoftwareIdentity may correspond to a Product, or to one or more SoftwareFeatures or SoftwareElements - depending on the granularity of these classes and the deployment model. The correspondence of Software Identity to Product, SoftwareFeature or SoftwareElement is indicated using the ConcreteIdentity association. Note that there may not be sufficient detail or instrumentation to instantiate ConcreteIdentity. And, if the association is instantiated, some duplication of information may result. For example, the Vendor described in the instances of Product and SoftwareIdentity MAY be the same. However, this is not necessarily true, and it is why vendor and similar information are duplicated in this class. 
     * Note that ConcreteIdentity can also be used to describe the relationship of the software to any LogicalFiles that result from installing it. As above, there may not be sufficient detail or instrumentation to instantiate this association.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_SoftwareIdentity(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_SoftwareIdentity() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("BuildNumber", new CIMProperty("BuildNumber", CIMDataType.UINT16_T,
                null));
        propertiesToCheck.put("ClassificationDescriptions", new CIMProperty(
                "ClassificationDescriptions", CIMDataType.STRING_ARRAY_T, null));
        propertiesToCheck.put("Classifications", new CIMProperty("Classifications",
                CIMDataType.UINT16_ARRAY_T, null));
        propertiesToCheck.put("InstanceID", new CIMProperty("InstanceID", CIMDataType.STRING_T,
                null));
        propertiesToCheck.put("Languages", new CIMProperty("Languages", CIMDataType.STRING_ARRAY_T,
                null));
        propertiesToCheck.put("MajorVersion", new CIMProperty("MajorVersion", CIMDataType.UINT16_T,
                null));
        propertiesToCheck.put("Manufacturer", new CIMProperty("Manufacturer", CIMDataType.STRING_T,
                null));
        propertiesToCheck.put("MinorVersion", new CIMProperty("MinorVersion", CIMDataType.UINT16_T,
                null));
        propertiesToCheck.put("ReleaseDate", new CIMProperty("ReleaseDate", CIMDataType.DATETIME_T,
                null));
        propertiesToCheck.put("RevisionNumber", new CIMProperty("RevisionNumber",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("SerialNumber", new CIMProperty("SerialNumber", CIMDataType.STRING_T,
                null));
        propertiesToCheck.put("TargetOperatingSystems", new CIMProperty("TargetOperatingSystems",
                CIMDataType.STRING_ARRAY_T, null));
        propertiesToCheck.put("VersionString", new CIMProperty("VersionString",
                CIMDataType.STRING_T, null));

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
     * The build number of the software.
     *     */

    public javax.cim.UnsignedInteger16 get_BuildNumber() {
        CIMProperty currentProperty = getProperty(PROPERTY_BUILDNUMBER.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_BUILDNUMBER.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property BuildNumber
     * <br>
     * The build number of the software.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_BuildNumber(javax.cim.UnsignedInteger16 newValue) {
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
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_SoftwareIdentity fco = new CIM_SoftwareIdentity(client, namespace);
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
     * The build number of the software.
     */

    private static CIMProperty setPropertyValue_BuildNumber(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ClassificationDescriptions
     *     * <br>
     * An array of free-form strings providing more detailed explanations for any of the entries in the Classifications array. Note that each entry is related to one in the Classifications array located at the same index.
     *     */

    public String[] get_ClassificationDescriptions() {
        CIMProperty currentProperty = getProperty(PROPERTY_CLASSIFICATIONDESCRIPTIONS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CLASSIFICATIONDESCRIPTIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String[]) currentProperty.getValue();

    }

    /**
     * Set the property ClassificationDescriptions
     * <br>
     * An array of free-form strings providing more detailed explanations for any of the entries in the Classifications array. Note that each entry is related to one in the Classifications array located at the same index.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ClassificationDescriptions(String[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CLASSIFICATIONDESCRIPTIONS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ClassificationDescriptions(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CLASSIFICATIONDESCRIPTIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ClassificationDescriptions by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ClassificationDescriptions(WBEMClient client,
            String namespace, String[] newValue) throws WbemsmtException {
        CIM_SoftwareIdentity fco = new CIM_SoftwareIdentity(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CLASSIFICATIONDESCRIPTIONS.NAME);
        if (property != null) {
            property = setPropertyValue_ClassificationDescriptions(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CLASSIFICATIONDESCRIPTIONS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ClassificationDescriptions
     * <br>
     * An array of free-form strings providing more detailed explanations for any of the entries in the Classifications array. Note that each entry is related to one in the Classifications array located at the same index.
     */

    private static CIMProperty setPropertyValue_ClassificationDescriptions(
            CIMProperty currentProperty, String[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Classifications
     *     * <br>
     * An array of enumerated integers that classify this software. For example, the software MAY be instrumentation (value=5) or firmware and diagnostic software (10 and 7). The use of value 6, Firmware/BIOS, is being deprecated. Instead, either the value 10 (Firmware) and/or 11 (BIOS/FCode) SHOULD be used.
     *     */

    public javax.cim.UnsignedInteger16[] get_Classifications() {
        CIMProperty currentProperty = getProperty(PROPERTY_CLASSIFICATIONS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CLASSIFICATIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16[]) currentProperty.getValue();

    }

    /**
     * Set the property Classifications
     * <br>
     * An array of enumerated integers that classify this software. For example, the software MAY be instrumentation (value=5) or firmware and diagnostic software (10 and 7). The use of value 6, Firmware/BIOS, is being deprecated. Instead, either the value 10 (Firmware) and/or 11 (BIOS/FCode) SHOULD be used.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Classifications(javax.cim.UnsignedInteger16[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CLASSIFICATIONS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Classifications(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CLASSIFICATIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Classifications by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Classifications(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16[] newValue) throws WbemsmtException {
        CIM_SoftwareIdentity fco = new CIM_SoftwareIdentity(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CLASSIFICATIONS.NAME);
        if (property != null) {
            property = setPropertyValue_Classifications(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CLASSIFICATIONS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Classifications
     * <br>
     * An array of enumerated integers that classify this software. For example, the software MAY be instrumentation (value=5) or firmware and diagnostic software (10 and 7). The use of value 6, Firmware/BIOS, is being deprecated. Instead, either the value 10 (Firmware) and/or 11 (BIOS/FCode) SHOULD be used.
     */

    private static CIMProperty setPropertyValue_Classifications(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property InstanceID
     *     * <br>
     * Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. In order to ensure uniqueness within the NameSpace, the value of InstanceID SHOULD be constructed using the following 'preferred' algorithm: 
     * <OrgID>:<LocalID> 
     * Where <OrgID> and <LocalID> are separated by a colon ':', and where <OrgID> MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity creating/defining the InstanceID, or is a registered ID that is assigned to the business entity by a recognized global authority (This is similar to the <Schema Name>_<Class Name> structure of Schema class names.) In addition, to ensure uniqueness <OrgID> MUST NOT contain a colon (':'). When using this algorithm, the first colon to appear in InstanceID MUST appear between <OrgID> and <LocalID>. 
     * <LocalID> is chosen by the business entity and SHOULD not be re-used to identify different underlying (real-world) elements. If the above 'preferred' algorithm is not used, the defining entity MUST assure that the resultant InstanceID is not re-used across any InstanceIDs produced by this or other providers for this instance's NameSpace. 
     * For DMTF defined instances, the 'preferred' algorithm MUST be used with the <OrgID> set to 'CIM'.
     *     */

    public String get_key_InstanceID() {
        CIMProperty currentProperty = getProperty(PROPERTY_INSTANCEID.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_INSTANCEID.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property InstanceID
     * <br>
     * Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. In order to ensure uniqueness within the NameSpace, the value of InstanceID SHOULD be constructed using the following 'preferred' algorithm: 
     * <OrgID>:<LocalID> 
     * Where <OrgID> and <LocalID> are separated by a colon ':', and where <OrgID> MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity creating/defining the InstanceID, or is a registered ID that is assigned to the business entity by a recognized global authority (This is similar to the <Schema Name>_<Class Name> structure of Schema class names.) In addition, to ensure uniqueness <OrgID> MUST NOT contain a colon (':'). When using this algorithm, the first colon to appear in InstanceID MUST appear between <OrgID> and <LocalID>. 
     * <LocalID> is chosen by the business entity and SHOULD not be re-used to identify different underlying (real-world) elements. If the above 'preferred' algorithm is not used, the defining entity MUST assure that the resultant InstanceID is not re-used across any InstanceIDs produced by this or other providers for this instance's NameSpace. 
     * For DMTF defined instances, the 'preferred' algorithm MUST be used with the <OrgID> set to 'CIM'.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_key_InstanceID(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_INSTANCEID.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_key_InstanceID(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_INSTANCEID.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property InstanceID by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_key_InstanceID(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_SoftwareIdentity fco = new CIM_SoftwareIdentity(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_INSTANCEID.NAME);
        if (property != null) {
            property = setPropertyValue_key_InstanceID(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_INSTANCEID.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property InstanceID
     * <br>
     * Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. In order to ensure uniqueness within the NameSpace, the value of InstanceID SHOULD be constructed using the following 'preferred' algorithm: 
     * <OrgID>:<LocalID> 
     * Where <OrgID> and <LocalID> are separated by a colon ':', and where <OrgID> MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity creating/defining the InstanceID, or is a registered ID that is assigned to the business entity by a recognized global authority (This is similar to the <Schema Name>_<Class Name> structure of Schema class names.) In addition, to ensure uniqueness <OrgID> MUST NOT contain a colon (':'). When using this algorithm, the first colon to appear in InstanceID MUST appear between <OrgID> and <LocalID>. 
     * <LocalID> is chosen by the business entity and SHOULD not be re-used to identify different underlying (real-world) elements. If the above 'preferred' algorithm is not used, the defining entity MUST assure that the resultant InstanceID is not re-used across any InstanceIDs produced by this or other providers for this instance's NameSpace. 
     * For DMTF defined instances, the 'preferred' algorithm MUST be used with the <OrgID> set to 'CIM'.
     */

    private static CIMProperty setPropertyValue_key_InstanceID(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Languages
     *     * <br>
     * The language editions supported by the software. The language codes defined in ISO 639 should be used.
     *     */

    public String[] get_Languages() {
        CIMProperty currentProperty = getProperty(PROPERTY_LANGUAGES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_LANGUAGES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String[]) currentProperty.getValue();

    }

    /**
     * Set the property Languages
     * <br>
     * The language editions supported by the software. The language codes defined in ISO 639 should be used.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Languages(String[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_LANGUAGES.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Languages(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_LANGUAGES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Languages by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Languages(WBEMClient client, String namespace,
            String[] newValue) throws WbemsmtException {
        CIM_SoftwareIdentity fco = new CIM_SoftwareIdentity(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_LANGUAGES.NAME);
        if (property != null) {
            property = setPropertyValue_Languages(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_LANGUAGES.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Languages
     * <br>
     * The language editions supported by the software. The language codes defined in ISO 639 should be used.
     */

    private static CIMProperty setPropertyValue_Languages(CIMProperty currentProperty,
            String[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property MajorVersion
     *     * <br>
     * The major number component of the software's version information - for example, '12' from version 12.1(3)T. This property is defined as a numeric value to allow the determination of 'newer' vs. 'older' releases. A 'newer' major release is indicated by a larger numeric value.
     *     */

    public javax.cim.UnsignedInteger16 get_MajorVersion() {
        CIMProperty currentProperty = getProperty(PROPERTY_MAJORVERSION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_MAJORVERSION.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property MajorVersion
     * <br>
     * The major number component of the software's version information - for example, '12' from version 12.1(3)T. This property is defined as a numeric value to allow the determination of 'newer' vs. 'older' releases. A 'newer' major release is indicated by a larger numeric value.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_MajorVersion(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_MAJORVERSION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_MajorVersion(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_MAJORVERSION.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property MajorVersion by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_MajorVersion(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_SoftwareIdentity fco = new CIM_SoftwareIdentity(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MAJORVERSION.NAME);
        if (property != null) {
            property = setPropertyValue_MajorVersion(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_MAJORVERSION.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property MajorVersion
     * <br>
     * The major number component of the software's version information - for example, '12' from version 12.1(3)T. This property is defined as a numeric value to allow the determination of 'newer' vs. 'older' releases. A 'newer' major release is indicated by a larger numeric value.
     */

    private static CIMProperty setPropertyValue_MajorVersion(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
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
     * Manufacturer of this software.
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
     * Manufacturer of this software.
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
        CIM_SoftwareIdentity fco = new CIM_SoftwareIdentity(client, namespace);
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
     * Manufacturer of this software.
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
     * Get the property MinorVersion
     *     * <br>
     * The minor number component of the software's version information - for example, '1' from version 12.1(3)T. This property is defined as a numeric value to allow the determination of 'newer' vs. 'older' releases. A 'newer' minor release is indicated by a larger numeric value.
     *     */

    public javax.cim.UnsignedInteger16 get_MinorVersion() {
        CIMProperty currentProperty = getProperty(PROPERTY_MINORVERSION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_MINORVERSION.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property MinorVersion
     * <br>
     * The minor number component of the software's version information - for example, '1' from version 12.1(3)T. This property is defined as a numeric value to allow the determination of 'newer' vs. 'older' releases. A 'newer' minor release is indicated by a larger numeric value.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_MinorVersion(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_MINORVERSION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_MinorVersion(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_MINORVERSION.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property MinorVersion by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_MinorVersion(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_SoftwareIdentity fco = new CIM_SoftwareIdentity(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MINORVERSION.NAME);
        if (property != null) {
            property = setPropertyValue_MinorVersion(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_MINORVERSION.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property MinorVersion
     * <br>
     * The minor number component of the software's version information - for example, '1' from version 12.1(3)T. This property is defined as a numeric value to allow the determination of 'newer' vs. 'older' releases. A 'newer' minor release is indicated by a larger numeric value.
     */

    private static CIMProperty setPropertyValue_MinorVersion(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ReleaseDate
     *     * <br>
     * The date the software was released.
     *     */

    public javax.cim.CIMDateTime get_ReleaseDate() {
        CIMProperty currentProperty = getProperty(PROPERTY_RELEASEDATE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_RELEASEDATE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.CIMDateTime) currentProperty.getValue();

    }

    /**
     * Set the property ReleaseDate
     * <br>
     * The date the software was released.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ReleaseDate(javax.cim.CIMDateTime newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_RELEASEDATE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ReleaseDate(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_RELEASEDATE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ReleaseDate by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ReleaseDate(WBEMClient client, String namespace,
            javax.cim.CIMDateTime newValue) throws WbemsmtException {
        CIM_SoftwareIdentity fco = new CIM_SoftwareIdentity(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_RELEASEDATE.NAME);
        if (property != null) {
            property = setPropertyValue_ReleaseDate(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_RELEASEDATE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ReleaseDate
     * <br>
     * The date the software was released.
     */

    private static CIMProperty setPropertyValue_ReleaseDate(CIMProperty currentProperty,
            javax.cim.CIMDateTime newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property RevisionNumber
     *     * <br>
     * The revision or maintenance release component of the software's version information - for example, '3' from version 12.1(3)T. This property is defined as a numeric value to allow the determination of 'newer' vs. 'older' releases. A 'newer' revision is indicated by a larger numeric value.
     *     */

    public javax.cim.UnsignedInteger16 get_RevisionNumber() {
        CIMProperty currentProperty = getProperty(PROPERTY_REVISIONNUMBER.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_REVISIONNUMBER.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property RevisionNumber
     * <br>
     * The revision or maintenance release component of the software's version information - for example, '3' from version 12.1(3)T. This property is defined as a numeric value to allow the determination of 'newer' vs. 'older' releases. A 'newer' revision is indicated by a larger numeric value.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_RevisionNumber(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_REVISIONNUMBER.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_RevisionNumber(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_REVISIONNUMBER.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property RevisionNumber by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_RevisionNumber(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_SoftwareIdentity fco = new CIM_SoftwareIdentity(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_REVISIONNUMBER.NAME);
        if (property != null) {
            property = setPropertyValue_RevisionNumber(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_REVISIONNUMBER.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property RevisionNumber
     * <br>
     * The revision or maintenance release component of the software's version information - for example, '3' from version 12.1(3)T. This property is defined as a numeric value to allow the determination of 'newer' vs. 'older' releases. A 'newer' revision is indicated by a larger numeric value.
     */

    private static CIMProperty setPropertyValue_RevisionNumber(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
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
     * A manufacturer-allocated number used to identify the software.
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
     * A manufacturer-allocated number used to identify the software.
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
        CIM_SoftwareIdentity fco = new CIM_SoftwareIdentity(client, namespace);
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
     * A manufacturer-allocated number used to identify the software.
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
     * Get the property TargetOperatingSystems
     *     * <br>
     * Specifies the target operating systems of the software. Due to the extreme variability in operating systems, this property is defined as a string array.
     *     */

    public String[] get_TargetOperatingSystems() {
        CIMProperty currentProperty = getProperty(PROPERTY_TARGETOPERATINGSYSTEMS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_TARGETOPERATINGSYSTEMS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String[]) currentProperty.getValue();

    }

    /**
     * Set the property TargetOperatingSystems
     * <br>
     * Specifies the target operating systems of the software. Due to the extreme variability in operating systems, this property is defined as a string array.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_TargetOperatingSystems(String[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_TARGETOPERATINGSYSTEMS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_TargetOperatingSystems(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_TARGETOPERATINGSYSTEMS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property TargetOperatingSystems by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_TargetOperatingSystems(WBEMClient client, String namespace,
            String[] newValue) throws WbemsmtException {
        CIM_SoftwareIdentity fco = new CIM_SoftwareIdentity(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_TARGETOPERATINGSYSTEMS.NAME);
        if (property != null) {
            property = setPropertyValue_TargetOperatingSystems(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_TARGETOPERATINGSYSTEMS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property TargetOperatingSystems
     * <br>
     * Specifies the target operating systems of the software. Due to the extreme variability in operating systems, this property is defined as a string array.
     */

    private static CIMProperty setPropertyValue_TargetOperatingSystems(CIMProperty currentProperty,
            String[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property VersionString
     *     * <br>
     * A string representing the complete software version information - for example, '12.1(3)T'. This string and the numeric major/minor/revision/build properties are complementary. Since vastly different representations and semantics exist for versions, it is not assumed that one representation is sufficient to permit a client to perform computations (i.e., the values are numeric) and a user to recognize the software's version (i.e., the values are understandable and readable). Hence, both numeric and string representations of version are provided.
     *     */

    public String get_VersionString() {
        CIMProperty currentProperty = getProperty(PROPERTY_VERSIONSTRING.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_VERSIONSTRING.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property VersionString
     * <br>
     * A string representing the complete software version information - for example, '12.1(3)T'. This string and the numeric major/minor/revision/build properties are complementary. Since vastly different representations and semantics exist for versions, it is not assumed that one representation is sufficient to permit a client to perform computations (i.e., the values are numeric) and a user to recognize the software's version (i.e., the values are understandable and readable). Hence, both numeric and string representations of version are provided.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_VersionString(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_VERSIONSTRING.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_VersionString(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_VERSIONSTRING.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property VersionString by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_VersionString(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_SoftwareIdentity fco = new CIM_SoftwareIdentity(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_VERSIONSTRING.NAME);
        if (property != null) {
            property = setPropertyValue_VersionString(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_VERSIONSTRING.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property VersionString
     * <br>
     * A string representing the complete software version information - for example, '12.1(3)T'. This string and the numeric major/minor/revision/build properties are complementary. Since vastly different representations and semantics exist for versions, it is not assumed that one representation is sufficient to permit a client to perform computations (i.e., the values are numeric) and a user to recognize the software's version (i.e., the values are understandable and readable). Hence, both numeric and string representations of version are provided.
     */

    private static CIMProperty setPropertyValue_VersionString(CIMProperty currentProperty,
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
     * Get the list with CIM_Product objects associated by the association CIM_ProductSoftwareComponent
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_PRODUCTSOFTWARECOMPONENT as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_Product_CIM_ProductSoftwareComponents(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_Product_CIM_ProductSoftwareComponents(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_PRODUCTSOFTWARECOMPONENT, CIM_Product.CIM_CLASS_NAME,
                null, null, false, false, null);

    }

    /**
     * Get the list with CIM_Product objects associated by the association CIM_ProductSoftwareComponent
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_PRODUCTSOFTWARECOMPONENT or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_PRODUCTSOFTWARECOMPONENT as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_Product_CIM_ProductSoftwareComponents(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_Product_CIM_ProductSoftwareComponents(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_PRODUCTSOFTWARECOMPONENT, resultClass, role,
                resultRole, false, false, null);

    }

    /**
     * Get the list with CIM_Product objects associated by the association CIM_ProductSoftwareComponent
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_PRODUCTSOFTWARECOMPONENT or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_Product_CIM_ProductSoftwareComponents(
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
                CIM_SoftwareIdentityHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_SoftwareIdentityHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_SoftwareIdentityHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_Product(cimInstance));
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
                        result.add(new CIM_Product(cimInstance));
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
                        result.add(new CIM_Product(cimInstance));
                        continue;
                    }
                }
            }
            CIM_SoftwareIdentityHelper.checkException(enumeration);
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
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_ProductSoftwareComponent
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_PRODUCTSOFTWARECOMPONENT as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_Product_CIM_ProductSoftwareComponentNames(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_Product_CIM_ProductSoftwareComponentNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_PRODUCTSOFTWARECOMPONENT, CIM_Product.CIM_CLASS_NAME,
                null, null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_ProductSoftwareComponent
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_PRODUCTSOFTWARECOMPONENT or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_PRODUCTSOFTWARECOMPONENT as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_Product_CIM_ProductSoftwareComponentNames(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_Product_CIM_ProductSoftwareComponentNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_PRODUCTSOFTWARECOMPONENT, resultClass, role,
                resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_ProductSoftwareComponent
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_Product_CIM_ProductSoftwareComponentNames(
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
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_PRODUCTSOFTWARECOMPONENT,
                    CIM_Product.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_SoftwareIdentityHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_SoftwareIdentityHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_Product.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_SoftwareIdentityHelper.checkException(enumeration);
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
     * Get the list with CIM_ProductSoftwareComponent associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_ProductSoftwareComponent(WBEMClient cimClient,
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_PRODUCTSOFTWARECOMPONENT, role,
                    includeQualifiers, includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_PRODUCTSOFTWARECOMPONENT, role,
                    includeQualifiers, includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_SoftwareIdentityHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_SoftwareIdentityHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_ProductSoftwareComponentHelper.findClass(cimClient,
                            cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_ProductSoftwareComponent(cimInstance));
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
                        result.add(new CIM_ProductSoftwareComponent(cimInstance));
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
                        result.add(new CIM_ProductSoftwareComponent(cimInstance));
                        continue;
                    }
                }
            }
            CIM_SoftwareIdentityHelper.checkException(enumeration);
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
     * Get a list of CIMObjectPath items of the associations CIM_ProductSoftwareComponent
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_ProductSoftwareComponent(WBEMClient cimClient,
            String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_PRODUCTSOFTWARECOMPONENT, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_PRODUCTSOFTWARECOMPONENT,
                    role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_SoftwareIdentityHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_SoftwareIdentityHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_ProductSoftwareComponent.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_SoftwareIdentityHelper.checkException(enumeration);
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
     * Get the list with CIM_ManagedElement objects associated by the association CIM_ElementSoftwareIdentity
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTSOFTWAREIDENTITY as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_ManagedElement_CIM_ElementSoftwareIdentitys(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_ManagedElement_CIM_ElementSoftwareIdentitys(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTSOFTWAREIDENTITY,
                CIM_ManagedElement.CIM_CLASS_NAME, null, null, false, false, null);

    }

    /**
     * Get the list with CIM_ManagedElement objects associated by the association CIM_ElementSoftwareIdentity
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTSOFTWAREIDENTITY or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTSOFTWAREIDENTITY as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_ManagedElement_CIM_ElementSoftwareIdentitys(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_ManagedElement_CIM_ElementSoftwareIdentitys(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTSOFTWAREIDENTITY, resultClass, role,
                resultRole, false, false, null);

    }

    /**
     * Get the list with CIM_ManagedElement objects associated by the association CIM_ElementSoftwareIdentity
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTSOFTWAREIDENTITY or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_ManagedElement_CIM_ElementSoftwareIdentitys(
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
                CIM_SoftwareIdentityHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_SoftwareIdentityHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_SoftwareIdentityHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_ManagedElement(cimInstance));
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
                        result.add(new CIM_ManagedElement(cimInstance));
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
                        result.add(new CIM_ManagedElement(cimInstance));
                        continue;
                    }
                }
            }
            CIM_SoftwareIdentityHelper.checkException(enumeration);
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
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_ElementSoftwareIdentity
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTSOFTWAREIDENTITY as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_ManagedElement_CIM_ElementSoftwareIdentityNames(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_ManagedElement_CIM_ElementSoftwareIdentityNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTSOFTWAREIDENTITY,
                CIM_ManagedElement.CIM_CLASS_NAME, null, null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_ElementSoftwareIdentity
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTSOFTWAREIDENTITY or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTSOFTWAREIDENTITY as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_ManagedElement_CIM_ElementSoftwareIdentityNames(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_ManagedElement_CIM_ElementSoftwareIdentityNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTSOFTWAREIDENTITY, resultClass, role,
                resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_ElementSoftwareIdentity
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_ManagedElement_CIM_ElementSoftwareIdentityNames(
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
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTSOFTWAREIDENTITY,
                    CIM_ManagedElement.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_SoftwareIdentityHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_SoftwareIdentityHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_ManagedElement.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_SoftwareIdentityHelper.checkException(enumeration);
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
     * Get the list with CIM_ElementSoftwareIdentity associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_ElementSoftwareIdentity(WBEMClient cimClient,
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTSOFTWAREIDENTITY, role, includeQualifiers,
                    includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTSOFTWAREIDENTITY, role, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_SoftwareIdentityHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_SoftwareIdentityHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_ElementSoftwareIdentityHelper.findClass(cimClient,
                            cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_ElementSoftwareIdentity(cimInstance));
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
                        result.add(new CIM_ElementSoftwareIdentity(cimInstance));
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
                        result.add(new CIM_ElementSoftwareIdentity(cimInstance));
                        continue;
                    }
                }
            }
            CIM_SoftwareIdentityHelper.checkException(enumeration);
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
     * Get a list of CIMObjectPath items of the associations CIM_ElementSoftwareIdentity
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_ElementSoftwareIdentity(WBEMClient cimClient,
            String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTSOFTWAREIDENTITY, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTSOFTWAREIDENTITY,
                    role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_SoftwareIdentityHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_SoftwareIdentityHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_ElementSoftwareIdentity.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_SoftwareIdentityHelper.checkException(enumeration);
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
     * Get the list with CIM_System objects associated by the association CIM_InstalledSoftwareIdentity
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_INSTALLEDSOFTWAREIDENTITY as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_System_CIM_InstalledSoftwareIdentitys(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_System_CIM_InstalledSoftwareIdentitys(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_INSTALLEDSOFTWAREIDENTITY, CIM_System.CIM_CLASS_NAME,
                null, null, false, false, null);

    }

    /**
     * Get the list with CIM_System objects associated by the association CIM_InstalledSoftwareIdentity
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_INSTALLEDSOFTWAREIDENTITY or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_INSTALLEDSOFTWAREIDENTITY as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_System_CIM_InstalledSoftwareIdentitys(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_System_CIM_InstalledSoftwareIdentitys(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_INSTALLEDSOFTWAREIDENTITY, resultClass, role,
                resultRole, false, false, null);

    }

    /**
     * Get the list with CIM_System objects associated by the association CIM_InstalledSoftwareIdentity
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_INSTALLEDSOFTWAREIDENTITY or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_System_CIM_InstalledSoftwareIdentitys(
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
                CIM_SoftwareIdentityHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_SoftwareIdentityHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_SoftwareIdentityHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_System(cimInstance));
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
                        result.add(new CIM_System(cimInstance));
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
                        result.add(new CIM_System(cimInstance));
                        continue;
                    }
                }
            }
            CIM_SoftwareIdentityHelper.checkException(enumeration);
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
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_InstalledSoftwareIdentity
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_INSTALLEDSOFTWAREIDENTITY as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_System_CIM_InstalledSoftwareIdentityNames(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_System_CIM_InstalledSoftwareIdentityNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_INSTALLEDSOFTWAREIDENTITY, CIM_System.CIM_CLASS_NAME,
                null, null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_InstalledSoftwareIdentity
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_INSTALLEDSOFTWAREIDENTITY or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_INSTALLEDSOFTWAREIDENTITY as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_System_CIM_InstalledSoftwareIdentityNames(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_System_CIM_InstalledSoftwareIdentityNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_INSTALLEDSOFTWAREIDENTITY, resultClass, role,
                resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_InstalledSoftwareIdentity
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_System_CIM_InstalledSoftwareIdentityNames(
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
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_INSTALLEDSOFTWAREIDENTITY,
                    CIM_System.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_SoftwareIdentityHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_SoftwareIdentityHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_System.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_SoftwareIdentityHelper.checkException(enumeration);
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
     * Get the list with CIM_InstalledSoftwareIdentity associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_InstalledSoftwareIdentity(WBEMClient cimClient,
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_INSTALLEDSOFTWAREIDENTITY, role,
                    includeQualifiers, includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_INSTALLEDSOFTWAREIDENTITY, role,
                    includeQualifiers, includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_SoftwareIdentityHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_SoftwareIdentityHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_InstalledSoftwareIdentityHelper.findClass(cimClient,
                            cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_InstalledSoftwareIdentity(cimInstance));
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
                        result.add(new CIM_InstalledSoftwareIdentity(cimInstance));
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
                        result.add(new CIM_InstalledSoftwareIdentity(cimInstance));
                        continue;
                    }
                }
            }
            CIM_SoftwareIdentityHelper.checkException(enumeration);
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
     * Get a list of CIMObjectPath items of the associations CIM_InstalledSoftwareIdentity
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_InstalledSoftwareIdentity(WBEMClient cimClient,
            String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_INSTALLEDSOFTWAREIDENTITY, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_INSTALLEDSOFTWAREIDENTITY,
                    role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_SoftwareIdentityHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_SoftwareIdentityHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_InstalledSoftwareIdentity.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_SoftwareIdentityHelper.checkException(enumeration);
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
        return CIM_SoftwareIdentity.CIM_CLASS_NAME;
    }

}