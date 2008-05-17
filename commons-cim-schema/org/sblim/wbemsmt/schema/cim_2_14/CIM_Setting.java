/** 
 * CIM_Setting.java
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
 * Description: The Setting class represents configuration-related and operational parameters for one or more ManagedSystemElements. An Element can have multiple Setting objects associated with it. The current operational values for the parameters of an Element are reflected by properties in the Element itself or by properties in its associations. These properties do not have to be the same values present in the Setting object. For example, a modem might have a Setting baud rate of 56Kb/sec but be operating at 19.2Kb/sec. 
 * Note: The CIM_SettingData class is very similar to CIM_Setting, yet both classes are present in the model because many implementations have successfully used CIM_Setting. However, issues have arisen that could not be resolved without defining a new class. Therefore, until a new major release occurs, both classes will exist in the model. Refer to the Core White Paper for additional information. Setting instances can be aggregated together into higher-level Setting objects using ConcreteComponent associations.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim_2_14;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;
import org.sblim.wbemsmt.exception.impl.*;
import org.sblim.wbemsmt.exception.impl.userobject.*;

import java.lang.reflect.*;
import javax.wbem.*;

public class CIM_Setting extends CIM_ManagedElement {

    public final static String CIM_CLASS_NAME = "CIM_Setting";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * ElementSetting represents the association between ManagedSystemElements and the Setting classes defined for them.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTSETTING = "CIM_ElementSetting";

    /**
     * This relationship associates Configuration objects with Setting objects. For example, a NetworkAdapter's Settings could change based on the site/network to which its hosting ComputerSystem is attached. In this case, the ComputerSystem would have two different Configuration objects, corresponding to the differences in network configuration for the two network segments. Configuration A would aggregate a Setting object for the NetworkAdapter when operating on segment "ANet", whereas Configuration B would aggregate a different NetworkAdapter Setting object, specific to segment "BNet". Note that many Settings of the computer are independent of the network Configuration. For example, both Configurations A and B would aggregate the same Setting object for the ComputerSystem's MonitorResolution.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_SETTINGCONTEXT = "CIM_SettingContext";

    /**
     * Constant for method\'s name and parameters
     * The ApplyIncrementalChangeToCollection method performs the application of a subset of the properties in this Setting to the referenced Collection of ManagedSystemElements. The net effect is to execute the ApplyIncrementalChangeToMSE method against each of the Elements that are aggregated by the Collection. If the input value ContinueOnError is false, this method applies the Setting to all Elements in the Collection until it encounters an error, in which case it stops execution, logs the key of the Element that caused the error in the CanNotApply array, and issues a return code of 2. If the input value ContinueOnError is true, then this method applies the Setting to all of the ManagedSystemElements in the Collection, and reports the failed Elements in the array, CanNotApply. For the latter, processing will continue until the method is applied to all Elements in the Collection, regardless of any errors encountered. The key of each ManagedSystemElement to which the Setting could not be applied is logged into the CanNotApply array. This method takes four input parameters: Collection (the Collection of Elements to which the Setting is being applied), TimeToApply (which, being a datetime, can be either a specific time or a time interval), ContinueOnError (true indicates to continue processing when an error is encountered), MustBeCompletedBy (which indicates the required completion time for the method), and a PropertiesToApply array (which contains a list of the property names whose values will be applied). If a property is not in this list, it will be ignored by the Apply. If the array is null or empty or contains the string "ALL" as a property name, then all Settings properties will be applied. If it is set to "NONE", then no Settings properties will be applied. 
     * The return value should be 0 if the Setting is successfully applied to the referenced Collection, 1 if the method is not supported, 2 if the Setting was not applied within the specified time, 3 if the Setting cannot be applied using the input value for ContinueOnError, and any other number if an error occurred. One output parameter, CanNotApplystring, is defined, which is an array that lists the keys of the ManagedSystemElements to which the Setting could not be applied. This output parameter has meaning only when the ContinueOnError parameter is true. 
     * In a subclass, the set of possible return codes could be specified using a ValueMap qualifier on the method. The strings to which the ValueMap contents are "translated" can also be specified in the subclass as a Values array qualifier. 
     * Note: If an error occurs when applying the Setting to a ManagedSystemElement in the Collection, the Element must be configured as it was when the "Apply" attempt began. That is, the Element should not be left in an indeterminate state.
     */

    public static class METHOD_APPLYINCREMENTALCHANGETOCOLLECTION {
        /**
         * Constant for method ApplyIncrementalChangeToCollection
         */
        public final static String NAME = "ApplyIncrementalChangeToCollection";

        /**
         * constants for parameter Collection
         */
        public static class PARAMETER_COLLECTION {
            /*
             * Name of the parameter Collection
             */
            public final static String NAME = "Collection";

        }

        /**
         * constants for parameter TimeToApply
         */
        public static class PARAMETER_TIMETOAPPLY {
            /*
             * Name of the parameter TimeToApply
             */
            public final static String NAME = "TimeToApply";

        }

        /**
         * constants for parameter ContinueOnError
         */
        public static class PARAMETER_CONTINUEONERROR {
            /*
             * Name of the parameter ContinueOnError
             */
            public final static String NAME = "ContinueOnError";

        }

        /**
         * constants for parameter MustBeCompletedBy
         */
        public static class PARAMETER_MUSTBECOMPLETEDBY {
            /*
             * Name of the parameter MustBeCompletedBy
             */
            public final static String NAME = "MustBeCompletedBy";

        }

        /**
         * constants for parameter PropertiesToApply
         */
        public static class PARAMETER_PROPERTIESTOAPPLY {
            /*
             * Name of the parameter PropertiesToApply
             */
            public final static String NAME = "PropertiesToApply";

        }

        /**
         * constants for parameter CanNotApply
         */
        public static class PARAMETER_CANNOTAPPLY {
            /*
             * Name of the parameter CanNotApply
             */
            public final static String NAME = "CanNotApply";

        }
    }

    /**
     * Constant for method\'s name and parameters
     * The ApplyIncrementalChangeToMSE method performs the actual application of a subset of the properties in the Setting to the referenced ManagedSystemElement. It takes four input parameters: MSE (the ManagedSystem Element to which the Setting is being applied), TimeToApply (which, being a datetime, can be either a specific time or a time interval), MustBeCompletedBy (which indicates the required completion time for the method), and a PropertiesToApply array (which contains a list of the property names whose values will be applied). If a property is not in this list, it will be ignored by the Apply. If the array is null, empty, or contains the string "ALL" as a property name, then all Settings properties will be applied. If it is set to "NONE", then no Settings properties will be applied. 
     * Note that the semantics of this method are that individual Settings are either wholly applied or not applied at all to their target ManagedSystemElement. The return value should be 0 if the Setting is successfully applied to the referenced ManagedSystemElement, 1 if the method is not supported, 2 if the Setting was not applied within the specified times, and any other number if an error occurred. In a subclass, the set of possible return codes could be specified using a ValueMap qualifier on the method. The strings to which the ValueMap contents are "translated" can also be specified in the subclass as a Values array qualifier. 
     * Note: If an error occurs when applying the Setting to a ManagedSystemElement, the Element must be configured as it was when the "Apply" attempt began. That is, the Element should not be left in an indeterminate state.
     */

    public static class METHOD_APPLYINCREMENTALCHANGETOMSE {
        /**
         * Constant for method ApplyIncrementalChangeToMSE
         */
        public final static String NAME = "ApplyIncrementalChangeToMSE";

        /**
         * constants for parameter MSE
         */
        public static class PARAMETER_MSE {
            /*
             * Name of the parameter MSE
             */
            public final static String NAME = "MSE";

        }

        /**
         * constants for parameter TimeToApply
         */
        public static class PARAMETER_TIMETOAPPLY {
            /*
             * Name of the parameter TimeToApply
             */
            public final static String NAME = "TimeToApply";

        }

        /**
         * constants for parameter MustBeCompletedBy
         */
        public static class PARAMETER_MUSTBECOMPLETEDBY {
            /*
             * Name of the parameter MustBeCompletedBy
             */
            public final static String NAME = "MustBeCompletedBy";

        }

        /**
         * constants for parameter PropertiesToApply
         */
        public static class PARAMETER_PROPERTIESTOAPPLY {
            /*
             * Name of the parameter PropertiesToApply
             */
            public final static String NAME = "PropertiesToApply";

        }
    }

    /**
     * Constant for method\'s name and parameters
     * The ApplyToCollection method performs the application of the Setting to the referenced Collection of ManagedSystemElements. The net effect is to execute the ApplyToMSE method against each of the Elements that are aggregated by the Collection. If the input value ContinueOnError is false, this method applies the Setting to all Elements in the Collection until it encounters an error. In the case of an error, the method stops execution, logs the key of the Element that caused the error in the CanNotApply array, and issues a return code of 2. If the input value ContinueOnError is true, then this method applies the Setting to all of the ManagedSystemElements in the Collection, and reports the failed Elements in the array, CanNotApply. For the latter, processing will continue until the method is applied to all Elements in the Collection, regardless of any errors encountered. The key of each ManagedSystemElement to which the Setting could not be applied is logged into the CanNotApply array. This method takes four input parameters: Collection (the Collection of Elements to which the Setting is being applied), TimeToApply (which, being a datetime, can be either a specific time or a time interval), ContinueOnError (true indicates to continue processing when an error is encountered), and MustBeCompletedBy (which indicates the required completion time for the method). The return value should be 0 if the Setting is successfully applied to the referenced Collection, 1 if the method is not supported, 2 if the Setting was not applied within the specified times, 3 if the Setting cannot be applied using the input value for ContinueOnError, and any other number if an error occurred. One output parameter, CanNotApplystring, is defined, which is an array that lists the keys of the ManagedSystemElements to which the Setting could not be applied. This output parameter has meaning only when the ContinueOnError parameter is true. 
     * In a subclass, the set of possible return codes could be specified using a ValueMap qualifier on the method. The strings to which the ValueMap contents are "translated" can also be specified in the subclass as a Values array qualifier. 
     * Note: If an error occurs when applying the Setting to a ManagedSystemElement in the Collection, the Element must be configured as it was when the "Apply" attempt began. That is, the Element should not be left in an indeterminate state.
     */

    public static class METHOD_APPLYTOCOLLECTION {
        /**
         * Constant for method ApplyToCollection
         */
        public final static String NAME = "ApplyToCollection";

        /**
         * constants for parameter Collection
         */
        public static class PARAMETER_COLLECTION {
            /*
             * Name of the parameter Collection
             */
            public final static String NAME = "Collection";

        }

        /**
         * constants for parameter TimeToApply
         */
        public static class PARAMETER_TIMETOAPPLY {
            /*
             * Name of the parameter TimeToApply
             */
            public final static String NAME = "TimeToApply";

        }

        /**
         * constants for parameter ContinueOnError
         */
        public static class PARAMETER_CONTINUEONERROR {
            /*
             * Name of the parameter ContinueOnError
             */
            public final static String NAME = "ContinueOnError";

        }

        /**
         * constants for parameter MustBeCompletedBy
         */
        public static class PARAMETER_MUSTBECOMPLETEDBY {
            /*
             * Name of the parameter MustBeCompletedBy
             */
            public final static String NAME = "MustBeCompletedBy";

        }

        /**
         * constants for parameter CanNotApply
         */
        public static class PARAMETER_CANNOTAPPLY {
            /*
             * Name of the parameter CanNotApply
             */
            public final static String NAME = "CanNotApply";

        }
    }

    /**
     * Constant for method\'s name and parameters
     * The ApplyToMSE method performs the actual application of the Setting to the referenced ManagedSystemElement. It takes three input parameters: MSE (the ManagedSystemElement to which the Setting is being applied), TimeToApply (which, being a datetime, can be either a specific time or a time interval), and MustBeCompletedBy (which indicates the required completion time for the method). Note that the semantics of this method are that individual Settings are either wholly applied or not applied at all to their target ManagedSystemElement. The return value should be 0 if the Setting is successfully applied to the referenced ManagedSystemElement, 1 if the method is not supported, 2 if the Setting was not applied within the specified times, and any other number if an error occurred. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are "translated" can also be specified in the subclass as a Values array qualifier. 
     * Note: If an error occurs when applying the Setting to a ManagedSystemElement, the Element must be configured as it was when the "Apply" attempt began. That is, the Element should not be left in an indeterminate state.
     */

    public static class METHOD_APPLYTOMSE {
        /**
         * Constant for method ApplyToMSE
         */
        public final static String NAME = "ApplyToMSE";

        /**
         * constants for parameter MSE
         */
        public static class PARAMETER_MSE {
            /*
             * Name of the parameter MSE
             */
            public final static String NAME = "MSE";

        }

        /**
         * constants for parameter TimeToApply
         */
        public static class PARAMETER_TIMETOAPPLY {
            /*
             * Name of the parameter TimeToApply
             */
            public final static String NAME = "TimeToApply";

        }

        /**
         * constants for parameter MustBeCompletedBy
         */
        public static class PARAMETER_MUSTBECOMPLETEDBY {
            /*
             * Name of the parameter MustBeCompletedBy
             */
            public final static String NAME = "MustBeCompletedBy";

        }
    }

    /**
     * Constant for method\'s name and parameters
     * The VerifyOKToApplyIncrementalChangeToCollection method is used to verify that a subset of the properties in this Setting can be applied to the referenced Collection of ManagedSystemElements at the given time or time interval, without causing adverse effects to either the Collection itself or its surrounding environment. The net effect is to execute the VerifyOKToApplyIncrementalChangeToMSE method against each of the Elements that are aggregated by the Collection. This method takes four input parameters: Collection (the Collection of ManagedSystemElements that is being verified), TimeToApply (which, being a datetime, can be either a specific time or a time interval), MustBeCompletedBy (which indicates the required completion time for the method), and a PropertiesToApply array (which contains a list of the property names whose values will be verified). If the array is null or empty or contains the string "all" as a property name, all Settings properties will be verified. If it is set to "none" then no Settings properties will be verified. The return value should be 0 if it is okay to apply the Setting, 1 if the method is not supported, 2 if the Setting cannot be applied within the specified times, and any other number if an error occurred. One output parameter, CanNotApply, is defined, which is a string array that lists the keys of the ManagedSystemElements to which the Setting cannot be applied. This parameter enables those Elements to be revisited and either fixed or have other corrective action taken on them. 
     * In a subclass, the set of possible return codes could be specified using a ValueMap qualifier on the method. The strings to which the ValueMap contents are "translated" can also be specified in the subclass as a Values array qualifier.
     */

    public static class METHOD_VERIFYOKTOAPPLYINCREMENTALCHANGETOCOLLECTION {
        /**
         * Constant for method VerifyOKToApplyIncrementalChangeToCollection
         */
        public final static String NAME = "VerifyOKToApplyIncrementalChangeToCollection";

        /**
         * constants for parameter Collection
         */
        public static class PARAMETER_COLLECTION {
            /*
             * Name of the parameter Collection
             */
            public final static String NAME = "Collection";

        }

        /**
         * constants for parameter TimeToApply
         */
        public static class PARAMETER_TIMETOAPPLY {
            /*
             * Name of the parameter TimeToApply
             */
            public final static String NAME = "TimeToApply";

        }

        /**
         * constants for parameter MustBeCompletedBy
         */
        public static class PARAMETER_MUSTBECOMPLETEDBY {
            /*
             * Name of the parameter MustBeCompletedBy
             */
            public final static String NAME = "MustBeCompletedBy";

        }

        /**
         * constants for parameter PropertiesToApply
         */
        public static class PARAMETER_PROPERTIESTOAPPLY {
            /*
             * Name of the parameter PropertiesToApply
             */
            public final static String NAME = "PropertiesToApply";

        }

        /**
         * constants for parameter CanNotApply
         */
        public static class PARAMETER_CANNOTAPPLY {
            /*
             * Name of the parameter CanNotApply
             */
            public final static String NAME = "CanNotApply";

        }
    }

    /**
     * Constant for method\'s name and parameters
     * The VerifyOKToApplyIncrementalChangeToMSE method is used to verify that a subset of the properties in this Setting can be applied to the referenced ManagedSystemElement at the given time or time interval. This method takes four input parameters: MSE (the ManagedSystemElement that is being verified), TimeToApply (which, being a datetime, can be either a specific time or a time interval), MustBeCompletedBy (which indicates the required completion time for the method), and a PropertiesToApply array (which contains a list of the property names whose values will be verified). If the array is null or empty or contains the string "ALL" as a property name, then all Settings properties will be verified. If it is set to "NONE", then no Settings properties will be verified. The return value should be 0 if it is okay to apply the Setting, 1 if the method is not supported, 2 if the Setting cannot be applied within the specified times, and any other number if an error occurred. In a subclass, the set of possible return codes could be specified using a ValueMap qualifier on the method. The strings to which the ValueMap contents are "translated" can also be specified in the subclass as a Values array qualifier.
     */

    public static class METHOD_VERIFYOKTOAPPLYINCREMENTALCHANGETOMSE {
        /**
         * Constant for method VerifyOKToApplyIncrementalChangeToMSE
         */
        public final static String NAME = "VerifyOKToApplyIncrementalChangeToMSE";

        /**
         * constants for parameter MSE
         */
        public static class PARAMETER_MSE {
            /*
             * Name of the parameter MSE
             */
            public final static String NAME = "MSE";

        }

        /**
         * constants for parameter TimeToApply
         */
        public static class PARAMETER_TIMETOAPPLY {
            /*
             * Name of the parameter TimeToApply
             */
            public final static String NAME = "TimeToApply";

        }

        /**
         * constants for parameter MustBeCompletedBy
         */
        public static class PARAMETER_MUSTBECOMPLETEDBY {
            /*
             * Name of the parameter MustBeCompletedBy
             */
            public final static String NAME = "MustBeCompletedBy";

        }

        /**
         * constants for parameter PropertiesToApply
         */
        public static class PARAMETER_PROPERTIESTOAPPLY {
            /*
             * Name of the parameter PropertiesToApply
             */
            public final static String NAME = "PropertiesToApply";

        }
    }

    /**
     * Constant for method\'s name and parameters
     * The VerifyOKToApplyToCollection method is used to verify that this Setting can be applied to the referenced Collection of ManagedSystemElements, at the given time or time interval, without causing adverse effects to either the Collection itself or its surrounding environment. The net effect is to execute the VerifyOKToApply method against each of the Elements that are aggregated by the Collection. This method takes three input parameters: Collection (the Collection of ManagedSystemElements that is being verified), TimeToApply (which, being a datetime, can be either a specific time or a time interval), and MustBeCompletedBy (which indicates the required completion time for the method). The return value should be 0 if it is okay to apply the Setting, 1 if the method is not supported, 2 if the Setting cannot be applied within the specified times, and any other number if an error occurred. One output parameter, CanNotApply, is defined, which is a string array that lists the keys of the ManagedSystemElements to which the Setting cannot be applied. This parameter enables those Elements to be revisited and either fixed or have other corrective action taken on them. 
     * In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are "translated" can also be specified in the subclass as a Values array qualifier.
     */

    public static class METHOD_VERIFYOKTOAPPLYTOCOLLECTION {
        /**
         * Constant for method VerifyOKToApplyToCollection
         */
        public final static String NAME = "VerifyOKToApplyToCollection";

        /**
         * constants for parameter Collection
         */
        public static class PARAMETER_COLLECTION {
            /*
             * Name of the parameter Collection
             */
            public final static String NAME = "Collection";

        }

        /**
         * constants for parameter TimeToApply
         */
        public static class PARAMETER_TIMETOAPPLY {
            /*
             * Name of the parameter TimeToApply
             */
            public final static String NAME = "TimeToApply";

        }

        /**
         * constants for parameter MustBeCompletedBy
         */
        public static class PARAMETER_MUSTBECOMPLETEDBY {
            /*
             * Name of the parameter MustBeCompletedBy
             */
            public final static String NAME = "MustBeCompletedBy";

        }

        /**
         * constants for parameter CanNotApply
         */
        public static class PARAMETER_CANNOTAPPLY {
            /*
             * Name of the parameter CanNotApply
             */
            public final static String NAME = "CanNotApply";

        }
    }

    /**
     * Constant for method\'s name and parameters
     * The VerifyOKToApplyToMSE method is used to verify that this Setting can be applied to the referenced ManagedSystemElement at the given time or time interval. This method takes three input parameters: MSE (the Managed SystemElement that is being verified), TimeToApply (which, being a datetime, can be either a specific time or a time interval), and MustBeCompletedBy (which indicates the required completion time for the method). The return value should be 0 if it is okay to apply the Setting, 1 if the method is not supported, 2 if the Setting cannot be applied within the specified times, and any other number if an error occurred. In a subclass, the set of possible return codes could be specified using a ValueMap qualifier on the method. The strings to which the ValueMap contents are "translated" can also be specified in the subclass as a Values array qualifier.
     */

    public static class METHOD_VERIFYOKTOAPPLYTOMSE {
        /**
         * Constant for method VerifyOKToApplyToMSE
         */
        public final static String NAME = "VerifyOKToApplyToMSE";

        /**
         * constants for parameter MSE
         */
        public static class PARAMETER_MSE {
            /*
             * Name of the parameter MSE
             */
            public final static String NAME = "MSE";

        }

        /**
         * constants for parameter TimeToApply
         */
        public static class PARAMETER_TIMETOAPPLY {
            /*
             * Name of the parameter TimeToApply
             */
            public final static String NAME = "TimeToApply";

        }

        /**
         * constants for parameter MustBeCompletedBy
         */
        public static class PARAMETER_MUSTBECOMPLETEDBY {
            /*
             * Name of the parameter MustBeCompletedBy
             */
            public final static String NAME = "MustBeCompletedBy";

        }
    }

    /**
     * Constants of property SettingID
     * The identifier by which the Setting object is known.
     */
    public static class PROPERTY_SETTINGID {
        /**
         * name of the property SettingID
         */
        public final static String NAME = "SettingID";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim_2_14");
        String[] parentClassPackageList = CIM_ManagedElement.getPackages();

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
     *   protected because this class should not be created directly because it represents an abstract CIM Class     *   <br>
     *   The Setting class represents configuration-related and operational parameters for one or more ManagedSystemElements. An Element can have multiple Setting objects associated with it. The current operational values for the parameters of an Element are reflected by properties in the Element itself or by properties in its associations. These properties do not have to be the same values present in the Setting object. For example, a modem might have a Setting baud rate of 56Kb/sec but be operating at 19.2Kb/sec. 
     * Note: The CIM_SettingData class is very similar to CIM_Setting, yet both classes are present in the model because many implementations have successfully used CIM_Setting. However, issues have arisen that could not be resolved without defining a new class. Therefore, until a new major release occurs, both classes will exist in the model. Refer to the Core White Paper for additional information. Setting instances can be aggregated together into higher-level Setting objects using ConcreteComponent associations.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    protected CIM_Setting(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *   protected because this class should not be created directly because it represents an abstract CIM Class     *   <br>
     *   The Setting class represents configuration-related and operational parameters for one or more ManagedSystemElements. An Element can have multiple Setting objects associated with it. The current operational values for the parameters of an Element are reflected by properties in the Element itself or by properties in its associations. These properties do not have to be the same values present in the Setting object. For example, a modem might have a Setting baud rate of 56Kb/sec but be operating at 19.2Kb/sec. 
     * Note: The CIM_SettingData class is very similar to CIM_Setting, yet both classes are present in the model because many implementations have successfully used CIM_Setting. However, issues have arisen that could not be resolved without defining a new class. Therefore, until a new major release occurs, both classes will exist in the model. Refer to the Core White Paper for additional information. Setting instances can be aggregated together into higher-level Setting objects using ConcreteComponent associations.
     *   @param cimInstance the instance that is used to create the Object
     */

    protected CIM_Setting(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_Setting() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck
                .put("SettingID", new CIMProperty("SettingID", CIMDataType.STRING_T, null));

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
     * Get the property SettingID
     *     * <br>
     * The identifier by which the Setting object is known.
     *     */

    public String get_SettingID() {
        CIMProperty currentProperty = getProperty(PROPERTY_SETTINGID.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SETTINGID.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property SettingID
     * <br>
     * The identifier by which the Setting object is known.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_SettingID(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SETTINGID.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_SettingID(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SETTINGID.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SettingID by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SettingID(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_Setting fco = new CIM_Setting(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SETTINGID.NAME);
        if (property != null) {
            property = setPropertyValue_SettingID(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SETTINGID.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SettingID
     * <br>
     * The identifier by which the Setting object is known.
     */

    private static CIMProperty setPropertyValue_SettingID(CIMProperty currentProperty,
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
     * Get the list with CIM_ManagedSystemElement objects associated by the association CIM_ElementSetting
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTSETTING as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_ManagedSystemElement_CIM_ElementSettings(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_ManagedSystemElement_CIM_ElementSettings(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTSETTING,
                CIM_ManagedSystemElement.CIM_CLASS_NAME, null, null, false, false, null);

    }

    /**
     * Get the list with CIM_ManagedSystemElement objects associated by the association CIM_ElementSetting
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTSETTING or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTSETTING as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_ManagedSystemElement_CIM_ElementSettings(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_ManagedSystemElement_CIM_ElementSettings(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTSETTING, resultClass, role, resultRole, false,
                false, null);

    }

    /**
     * Get the list with CIM_ManagedSystemElement objects associated by the association CIM_ElementSetting
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTSETTING or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_ManagedSystemElement_CIM_ElementSettings(
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
                CIM_SettingHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_SettingHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_SettingHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_ManagedSystemElement(cimInstance));
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
                        result.add(new CIM_ManagedSystemElement(cimInstance));
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
                        result.add(new CIM_ManagedSystemElement(cimInstance));
                        continue;
                    }
                }
            }
            CIM_SettingHelper.checkException(enumeration);
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
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_ElementSetting
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTSETTING as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_ManagedSystemElement_CIM_ElementSettingNames(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_ManagedSystemElement_CIM_ElementSettingNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTSETTING,
                CIM_ManagedSystemElement.CIM_CLASS_NAME, null, null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_ElementSetting
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTSETTING or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTSETTING as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_ManagedSystemElement_CIM_ElementSettingNames(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_ManagedSystemElement_CIM_ElementSettingNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTSETTING, resultClass, role, resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_ElementSetting
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_ManagedSystemElement_CIM_ElementSettingNames(
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
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTSETTING,
                    CIM_ManagedSystemElement.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_SettingHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_SettingHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_ManagedSystemElement.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_SettingHelper.checkException(enumeration);
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
     * Get the list with CIM_ElementSetting associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_ElementSetting(WBEMClient cimClient,
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTSETTING, role, includeQualifiers,
                    includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTSETTING, role, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_SettingHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_SettingHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_ElementSettingHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_ElementSetting(cimInstance));
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
                        result.add(new CIM_ElementSetting(cimInstance));
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
                        result.add(new CIM_ElementSetting(cimInstance));
                        continue;
                    }
                }
            }
            CIM_SettingHelper.checkException(enumeration);
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
     * Get a list of CIMObjectPath items of the associations CIM_ElementSetting
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_ElementSetting(WBEMClient cimClient, String role,
            boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTSETTING, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTSETTING, role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_SettingHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_SettingHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_ElementSetting.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_SettingHelper.checkException(enumeration);
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
     * Get the list with CIM_Configuration objects associated by the association CIM_SettingContext
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_SETTINGCONTEXT as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_Configuration_CIM_SettingContexts(WBEMClient cimClient)
            throws WbemsmtException {

        return getAssociated_CIM_Configuration_CIM_SettingContexts(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_SETTINGCONTEXT, CIM_Configuration.CIM_CLASS_NAME,
                null, null, false, false, null);

    }

    /**
     * Get the list with CIM_Configuration objects associated by the association CIM_SettingContext
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_SETTINGCONTEXT or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_SETTINGCONTEXT as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_Configuration_CIM_SettingContexts(WBEMClient cimClient,
            String resultClass, String role, String resultRole) throws WbemsmtException {

        return getAssociated_CIM_Configuration_CIM_SettingContexts(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_SETTINGCONTEXT, resultClass, role, resultRole, false,
                false, null);

    }

    /**
     * Get the list with CIM_Configuration objects associated by the association CIM_SettingContext
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_SETTINGCONTEXT or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_Configuration_CIM_SettingContexts(WBEMClient cimClient,
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
                CIM_SettingHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_SettingHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_SettingHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_Configuration(cimInstance));
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
                        result.add(new CIM_Configuration(cimInstance));
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
                        result.add(new CIM_Configuration(cimInstance));
                        continue;
                    }
                }
            }
            CIM_SettingHelper.checkException(enumeration);
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
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_SettingContext
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_SETTINGCONTEXT as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_Configuration_CIM_SettingContextNames(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_Configuration_CIM_SettingContextNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_SETTINGCONTEXT, CIM_Configuration.CIM_CLASS_NAME,
                null, null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_SettingContext
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_SETTINGCONTEXT or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_SETTINGCONTEXT as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_Configuration_CIM_SettingContextNames(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_Configuration_CIM_SettingContextNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_SETTINGCONTEXT, resultClass, role, resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_SettingContext
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_Configuration_CIM_SettingContextNames(
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
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_SETTINGCONTEXT,
                    CIM_Configuration.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_SettingHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_SettingHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_Configuration.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_SettingHelper.checkException(enumeration);
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
     * Get the list with CIM_SettingContext associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_SettingContext(WBEMClient cimClient,
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_SETTINGCONTEXT, role, includeQualifiers,
                    includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_SETTINGCONTEXT, role, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_SettingHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_SettingHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_SettingContextHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_SettingContext(cimInstance));
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
                        result.add(new CIM_SettingContext(cimInstance));
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
                        result.add(new CIM_SettingContext(cimInstance));
                        continue;
                    }
                }
            }
            CIM_SettingHelper.checkException(enumeration);
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
     * Get a list of CIMObjectPath items of the associations CIM_SettingContext
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_SettingContext(WBEMClient cimClient, String role,
            boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_SETTINGCONTEXT, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_SETTINGCONTEXT, role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_SettingHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_SettingHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_SettingContext.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_SettingHelper.checkException(enumeration);
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

    /**
     * Invokes the Method ApplyIncrementalChangeToCollection
     * <br>
     * @param client the cimclient
     * The ApplyIncrementalChangeToCollection method performs the application of a subset of the properties in this Setting to the referenced Collection of ManagedSystemElements. The net effect is to execute the ApplyIncrementalChangeToMSE method against each of the Elements that are aggregated by the Collection. If the input value ContinueOnError is false, this method applies the Setting to all Elements in the Collection until it encounters an error, in which case it stops execution, logs the key of the Element that caused the error in the CanNotApply array, and issues a return code of 2. If the input value ContinueOnError is true, then this method applies the Setting to all of the ManagedSystemElements in the Collection, and reports the failed Elements in the array, CanNotApply. For the latter, processing will continue until the method is applied to all Elements in the Collection, regardless of any errors encountered. The key of each ManagedSystemElement to which the Setting could not be applied is logged into the CanNotApply array. This method takes four input parameters: Collection (the Collection of Elements to which the Setting is being applied), TimeToApply (which, being a datetime, can be either a specific time or a time interval), ContinueOnError (true indicates to continue processing when an error is encountered), MustBeCompletedBy (which indicates the required completion time for the method), and a PropertiesToApply array (which contains a list of the property names whose values will be applied). If a property is not in this list, it will be ignored by the Apply. If the array is null or empty or contains the string "ALL" as a property name, then all Settings properties will be applied. If it is set to "NONE", then no Settings properties will be applied. 
     * The return value should be 0 if the Setting is successfully applied to the referenced Collection, 1 if the method is not supported, 2 if the Setting was not applied within the specified time, 3 if the Setting cannot be applied using the input value for ContinueOnError, and any other number if an error occurred. One output parameter, CanNotApplystring, is defined, which is an array that lists the keys of the ManagedSystemElements to which the Setting could not be applied. This output parameter has meaning only when the ContinueOnError parameter is true. 
     * In a subclass, the set of possible return codes could be specified using a ValueMap qualifier on the method. The strings to which the ValueMap contents are "translated" can also be specified in the subclass as a Values array qualifier. 
     * Note: If an error occurs when applying the Setting to a ManagedSystemElement in the Collection, the Element must be configured as it was when the "Apply" attempt began. That is, the Element should not be left in an indeterminate state.
     *   @param Collection The Collection of Elements to which the Setting is being applied.
     *   @param TimeToApply A specific time or a time interval.
     *   @param ContinueOnError True indicates to continue processing when an error is encountered.
     *   @param MustBeCompletedBy This parameter indicates the required completion time for the method.
     *   @param PropertiesToApply A list of the property names whose values will be verified.
     *
     */

    public ApplyIncrementalChangeToCollectionResult invoke_ApplyIncrementalChangeToCollection(
            WBEMClient cimClient, CIM_CollectionOfMSEs Collection,
            javax.cim.CIMDateTime TimeToApply, Boolean ContinueOnError,
            javax.cim.CIMDateTime MustBeCompletedBy, String[] PropertiesToApply)
            throws WbemsmtException {

        CIMArgument[] inParameter = new CIMArgument[5];
        CIMArgument[] outParameter = new CIMArgument[1];

        inParameter[0] = new CIMArgument("Collection", new CIMDataType(
                CIM_CollectionOfMSEs.CIM_CLASS_NAME), Collection.getCimObjectPath());
        inParameter[1] = new CIMArgument("TimeToApply", CIMDataType.DATETIME_T, TimeToApply);
        inParameter[2] = new CIMArgument("ContinueOnError", CIMDataType.BOOLEAN_T, ContinueOnError);
        inParameter[3] = new CIMArgument("MustBeCompletedBy", CIMDataType.DATETIME_T,
                MustBeCompletedBy);
        inParameter[4] = new CIMArgument("PropertiesToApply", CIMDataType.STRING_ARRAY_T,
                PropertiesToApply);

        javax.cim.UnsignedInteger32 resultObject = null;

        try {
            Object oResult = cimClient.invokeMethod(this.getCimObjectPath(),
                    METHOD_APPLYINCREMENTALCHANGETOCOLLECTION.NAME, inParameter, outParameter);
            if (oResult != null) {

                resultObject = (javax.cim.UnsignedInteger32) oResult;
            }
        }
        catch (WBEMException e) {
            throw new InvokeMethodException(e, new InvokeMethodUserObject(this.getCimObjectPath(),
                    METHOD_APPLYINCREMENTALCHANGETOCOLLECTION.NAME, inParameter, outParameter));
        }

        ApplyIncrementalChangeToCollectionResult result = new ApplyIncrementalChangeToCollectionResult();
        result.setResultObject(resultObject);

        java.util.HashMap mapOutParameter = new java.util.HashMap();
        for (int i = 0; i < outParameter.length; i++) {
            CIMArgument argument = outParameter[i];
            if (argument != null) {
                mapOutParameter.put(argument.getName(), argument);
            }
        }

        CIMArgument arg_CanNotApply = (CIMArgument) mapOutParameter.get("CanNotApply");
        if (arg_CanNotApply != null) {

            String[] out_CanNotApply = (String[]) arg_CanNotApply.getValue();

            result.set_CanNotApply(out_CanNotApply);
        }

        return result;
    }

    /**
     * Result object for the method ApplyIncrementalChangeToCollection
     */
    public static class ApplyIncrementalChangeToCollectionResult {
        /**
         * The return value of the method
         */

        javax.cim.UnsignedInteger32 resultObject = null;

        /**
         * Default constructor
         */
        ApplyIncrementalChangeToCollectionResult() {
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

        /**
         * The out parameter CanNotApply
         */
        String[] CanNotApply = null;

        /**
         * Set the out parameter CanNotApply
         * @param value
         */
        void set_CanNotApply(String[] value) {
            this.CanNotApply = value;
        }

        /**
         * get the out parameter CanNotApply
         * @return
         */
        public String[] get_CanNotApply() {
            return this.CanNotApply;
        }
    }

    /**
     * Invokes the Method ApplyIncrementalChangeToMSE
     * <br>
     * @param client the cimclient
     * The ApplyIncrementalChangeToMSE method performs the actual application of a subset of the properties in the Setting to the referenced ManagedSystemElement. It takes four input parameters: MSE (the ManagedSystem Element to which the Setting is being applied), TimeToApply (which, being a datetime, can be either a specific time or a time interval), MustBeCompletedBy (which indicates the required completion time for the method), and a PropertiesToApply array (which contains a list of the property names whose values will be applied). If a property is not in this list, it will be ignored by the Apply. If the array is null, empty, or contains the string "ALL" as a property name, then all Settings properties will be applied. If it is set to "NONE", then no Settings properties will be applied. 
     * Note that the semantics of this method are that individual Settings are either wholly applied or not applied at all to their target ManagedSystemElement. The return value should be 0 if the Setting is successfully applied to the referenced ManagedSystemElement, 1 if the method is not supported, 2 if the Setting was not applied within the specified times, and any other number if an error occurred. In a subclass, the set of possible return codes could be specified using a ValueMap qualifier on the method. The strings to which the ValueMap contents are "translated" can also be specified in the subclass as a Values array qualifier. 
     * Note: If an error occurs when applying the Setting to a ManagedSystemElement, the Element must be configured as it was when the "Apply" attempt began. That is, the Element should not be left in an indeterminate state.
     *   @param MSE The ManagedSystemElement to which the Setting is being applied.
     *   @param TimeToApply TimeToApply can be either a specific time or a time interval.
     *   @param MustBeCompletedBy The required completion time for the method.
     *   @param PropertiesToApply A list of the property names whose values will be applied.
     *
     */

    public ApplyIncrementalChangeToMSEResult invoke_ApplyIncrementalChangeToMSE(
            WBEMClient cimClient, CIM_ManagedSystemElement MSE, javax.cim.CIMDateTime TimeToApply,
            javax.cim.CIMDateTime MustBeCompletedBy, String[] PropertiesToApply)
            throws WbemsmtException {

        CIMArgument[] inParameter = new CIMArgument[4];
        CIMArgument[] outParameter = new CIMArgument[0];

        inParameter[0] = new CIMArgument("MSE", new CIMDataType(
                CIM_ManagedSystemElement.CIM_CLASS_NAME), MSE.getCimObjectPath());
        inParameter[1] = new CIMArgument("TimeToApply", CIMDataType.DATETIME_T, TimeToApply);
        inParameter[2] = new CIMArgument("MustBeCompletedBy", CIMDataType.DATETIME_T,
                MustBeCompletedBy);
        inParameter[3] = new CIMArgument("PropertiesToApply", CIMDataType.STRING_ARRAY_T,
                PropertiesToApply);

        javax.cim.UnsignedInteger32 resultObject = null;

        try {
            Object oResult = cimClient.invokeMethod(this.getCimObjectPath(),
                    METHOD_APPLYINCREMENTALCHANGETOMSE.NAME, inParameter, outParameter);
            if (oResult != null) {

                resultObject = (javax.cim.UnsignedInteger32) oResult;
            }
        }
        catch (WBEMException e) {
            throw new InvokeMethodException(e, new InvokeMethodUserObject(this.getCimObjectPath(),
                    METHOD_APPLYINCREMENTALCHANGETOMSE.NAME, inParameter, outParameter));
        }

        ApplyIncrementalChangeToMSEResult result = new ApplyIncrementalChangeToMSEResult();
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
     * Result object for the method ApplyIncrementalChangeToMSE
     */
    public static class ApplyIncrementalChangeToMSEResult {
        /**
         * The return value of the method
         */

        javax.cim.UnsignedInteger32 resultObject = null;

        /**
         * Default constructor
         */
        ApplyIncrementalChangeToMSEResult() {
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

    /**
     * Invokes the Method ApplyToCollection
     * <br>
     * @param client the cimclient
     * The ApplyToCollection method performs the application of the Setting to the referenced Collection of ManagedSystemElements. The net effect is to execute the ApplyToMSE method against each of the Elements that are aggregated by the Collection. If the input value ContinueOnError is false, this method applies the Setting to all Elements in the Collection until it encounters an error. In the case of an error, the method stops execution, logs the key of the Element that caused the error in the CanNotApply array, and issues a return code of 2. If the input value ContinueOnError is true, then this method applies the Setting to all of the ManagedSystemElements in the Collection, and reports the failed Elements in the array, CanNotApply. For the latter, processing will continue until the method is applied to all Elements in the Collection, regardless of any errors encountered. The key of each ManagedSystemElement to which the Setting could not be applied is logged into the CanNotApply array. This method takes four input parameters: Collection (the Collection of Elements to which the Setting is being applied), TimeToApply (which, being a datetime, can be either a specific time or a time interval), ContinueOnError (true indicates to continue processing when an error is encountered), and MustBeCompletedBy (which indicates the required completion time for the method). The return value should be 0 if the Setting is successfully applied to the referenced Collection, 1 if the method is not supported, 2 if the Setting was not applied within the specified times, 3 if the Setting cannot be applied using the input value for ContinueOnError, and any other number if an error occurred. One output parameter, CanNotApplystring, is defined, which is an array that lists the keys of the ManagedSystemElements to which the Setting could not be applied. This output parameter has meaning only when the ContinueOnError parameter is true. 
     * In a subclass, the set of possible return codes could be specified using a ValueMap qualifier on the method. The strings to which the ValueMap contents are "translated" can also be specified in the subclass as a Values array qualifier. 
     * Note: If an error occurs when applying the Setting to a ManagedSystemElement in the Collection, the Element must be configured as it was when the "Apply" attempt began. That is, the Element should not be left in an indeterminate state.
     *   @param Collection The Collection of ManagedSystemElements to be applied.
     *   @param TimeToApply TimeToApply can be either a specific time or a time interval.
     *   @param ContinueOnError True means to continue processing when an error is encountered.
     *   @param MustBeCompletedBy The required completion time for the method.
     *
     */

    public ApplyToCollectionResult invoke_ApplyToCollection(WBEMClient cimClient,
            CIM_CollectionOfMSEs Collection, javax.cim.CIMDateTime TimeToApply,
            Boolean ContinueOnError, javax.cim.CIMDateTime MustBeCompletedBy)
            throws WbemsmtException {

        CIMArgument[] inParameter = new CIMArgument[4];
        CIMArgument[] outParameter = new CIMArgument[1];

        inParameter[0] = new CIMArgument("Collection", new CIMDataType(
                CIM_CollectionOfMSEs.CIM_CLASS_NAME), Collection.getCimObjectPath());
        inParameter[1] = new CIMArgument("TimeToApply", CIMDataType.DATETIME_T, TimeToApply);
        inParameter[2] = new CIMArgument("ContinueOnError", CIMDataType.BOOLEAN_T, ContinueOnError);
        inParameter[3] = new CIMArgument("MustBeCompletedBy", CIMDataType.DATETIME_T,
                MustBeCompletedBy);

        javax.cim.UnsignedInteger32 resultObject = null;

        try {
            Object oResult = cimClient.invokeMethod(this.getCimObjectPath(),
                    METHOD_APPLYTOCOLLECTION.NAME, inParameter, outParameter);
            if (oResult != null) {

                resultObject = (javax.cim.UnsignedInteger32) oResult;
            }
        }
        catch (WBEMException e) {
            throw new InvokeMethodException(e, new InvokeMethodUserObject(this.getCimObjectPath(),
                    METHOD_APPLYTOCOLLECTION.NAME, inParameter, outParameter));
        }

        ApplyToCollectionResult result = new ApplyToCollectionResult();
        result.setResultObject(resultObject);

        java.util.HashMap mapOutParameter = new java.util.HashMap();
        for (int i = 0; i < outParameter.length; i++) {
            CIMArgument argument = outParameter[i];
            if (argument != null) {
                mapOutParameter.put(argument.getName(), argument);
            }
        }

        CIMArgument arg_CanNotApply = (CIMArgument) mapOutParameter.get("CanNotApply");
        if (arg_CanNotApply != null) {

            String[] out_CanNotApply = (String[]) arg_CanNotApply.getValue();

            result.set_CanNotApply(out_CanNotApply);
        }

        return result;
    }

    /**
     * Result object for the method ApplyToCollection
     */
    public static class ApplyToCollectionResult {
        /**
         * The return value of the method
         */

        javax.cim.UnsignedInteger32 resultObject = null;

        /**
         * Default constructor
         */
        ApplyToCollectionResult() {
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

        /**
         * The out parameter CanNotApply
         */
        String[] CanNotApply = null;

        /**
         * Set the out parameter CanNotApply
         * @param value
         */
        void set_CanNotApply(String[] value) {
            this.CanNotApply = value;
        }

        /**
         * get the out parameter CanNotApply
         * @return
         */
        public String[] get_CanNotApply() {
            return this.CanNotApply;
        }
    }

    /**
     * Invokes the Method ApplyToMSE
     * <br>
     * @param client the cimclient
     * The ApplyToMSE method performs the actual application of the Setting to the referenced ManagedSystemElement. It takes three input parameters: MSE (the ManagedSystemElement to which the Setting is being applied), TimeToApply (which, being a datetime, can be either a specific time or a time interval), and MustBeCompletedBy (which indicates the required completion time for the method). Note that the semantics of this method are that individual Settings are either wholly applied or not applied at all to their target ManagedSystemElement. The return value should be 0 if the Setting is successfully applied to the referenced ManagedSystemElement, 1 if the method is not supported, 2 if the Setting was not applied within the specified times, and any other number if an error occurred. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are "translated" can also be specified in the subclass as a Values array qualifier. 
     * Note: If an error occurs when applying the Setting to a ManagedSystemElement, the Element must be configured as it was when the "Apply" attempt began. That is, the Element should not be left in an indeterminate state.
     *   @param MSE The ManagedSystemElement to which the Setting is being applied.
     *   @param TimeToApply TimeToApply can be either a specific time or a time interval.
     *   @param MustBeCompletedBy The required completion time for the method.
     *
     */

    public ApplyToMSEResult invoke_ApplyToMSE(WBEMClient cimClient, CIM_ManagedSystemElement MSE,
            javax.cim.CIMDateTime TimeToApply, javax.cim.CIMDateTime MustBeCompletedBy)
            throws WbemsmtException {

        CIMArgument[] inParameter = new CIMArgument[3];
        CIMArgument[] outParameter = new CIMArgument[0];

        inParameter[0] = new CIMArgument("MSE", new CIMDataType(
                CIM_ManagedSystemElement.CIM_CLASS_NAME), MSE.getCimObjectPath());
        inParameter[1] = new CIMArgument("TimeToApply", CIMDataType.DATETIME_T, TimeToApply);
        inParameter[2] = new CIMArgument("MustBeCompletedBy", CIMDataType.DATETIME_T,
                MustBeCompletedBy);

        javax.cim.UnsignedInteger32 resultObject = null;

        try {
            Object oResult = cimClient.invokeMethod(this.getCimObjectPath(),
                    METHOD_APPLYTOMSE.NAME, inParameter, outParameter);
            if (oResult != null) {

                resultObject = (javax.cim.UnsignedInteger32) oResult;
            }
        }
        catch (WBEMException e) {
            throw new InvokeMethodException(e, new InvokeMethodUserObject(this.getCimObjectPath(),
                    METHOD_APPLYTOMSE.NAME, inParameter, outParameter));
        }

        ApplyToMSEResult result = new ApplyToMSEResult();
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
     * Result object for the method ApplyToMSE
     */
    public static class ApplyToMSEResult {
        /**
         * The return value of the method
         */

        javax.cim.UnsignedInteger32 resultObject = null;

        /**
         * Default constructor
         */
        ApplyToMSEResult() {
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

    /**
     * Invokes the Method VerifyOKToApplyIncrementalChangeToCollection
     * <br>
     * @param client the cimclient
     * The VerifyOKToApplyIncrementalChangeToCollection method is used to verify that a subset of the properties in this Setting can be applied to the referenced Collection of ManagedSystemElements at the given time or time interval, without causing adverse effects to either the Collection itself or its surrounding environment. The net effect is to execute the VerifyOKToApplyIncrementalChangeToMSE method against each of the Elements that are aggregated by the Collection. This method takes four input parameters: Collection (the Collection of ManagedSystemElements that is being verified), TimeToApply (which, being a datetime, can be either a specific time or a time interval), MustBeCompletedBy (which indicates the required completion time for the method), and a PropertiesToApply array (which contains a list of the property names whose values will be verified). If the array is null or empty or contains the string "all" as a property name, all Settings properties will be verified. If it is set to "none" then no Settings properties will be verified. The return value should be 0 if it is okay to apply the Setting, 1 if the method is not supported, 2 if the Setting cannot be applied within the specified times, and any other number if an error occurred. One output parameter, CanNotApply, is defined, which is a string array that lists the keys of the ManagedSystemElements to which the Setting cannot be applied. This parameter enables those Elements to be revisited and either fixed or have other corrective action taken on them. 
     * In a subclass, the set of possible return codes could be specified using a ValueMap qualifier on the method. The strings to which the ValueMap contents are "translated" can also be specified in the subclass as a Values array qualifier.
     *   @param Collection The Collection of ManagedSystemElements for which the setting is being verified.
     *   @param TimeToApply TimeToApply can be either a specific time or a time interval.
     *   @param MustBeCompletedBy The required completion time for the method.
     *   @param PropertiesToApply A list of the property names whose values will be verified.
     *
     */

    public VerifyOKToApplyIncrementalChangeToCollectionResult invoke_VerifyOKToApplyIncrementalChangeToCollection(
            WBEMClient cimClient, CIM_CollectionOfMSEs Collection,
            javax.cim.CIMDateTime TimeToApply, javax.cim.CIMDateTime MustBeCompletedBy,
            String[] PropertiesToApply) throws WbemsmtException {

        CIMArgument[] inParameter = new CIMArgument[4];
        CIMArgument[] outParameter = new CIMArgument[1];

        inParameter[0] = new CIMArgument("Collection", new CIMDataType(
                CIM_CollectionOfMSEs.CIM_CLASS_NAME), Collection.getCimObjectPath());
        inParameter[1] = new CIMArgument("TimeToApply", CIMDataType.DATETIME_T, TimeToApply);
        inParameter[2] = new CIMArgument("MustBeCompletedBy", CIMDataType.DATETIME_T,
                MustBeCompletedBy);
        inParameter[3] = new CIMArgument("PropertiesToApply", CIMDataType.STRING_ARRAY_T,
                PropertiesToApply);

        javax.cim.UnsignedInteger32 resultObject = null;

        try {
            Object oResult = cimClient.invokeMethod(this.getCimObjectPath(),
                    METHOD_VERIFYOKTOAPPLYINCREMENTALCHANGETOCOLLECTION.NAME, inParameter,
                    outParameter);
            if (oResult != null) {

                resultObject = (javax.cim.UnsignedInteger32) oResult;
            }
        }
        catch (WBEMException e) {
            throw new InvokeMethodException(e, new InvokeMethodUserObject(this.getCimObjectPath(),
                    METHOD_VERIFYOKTOAPPLYINCREMENTALCHANGETOCOLLECTION.NAME, inParameter,
                    outParameter));
        }

        VerifyOKToApplyIncrementalChangeToCollectionResult result = new VerifyOKToApplyIncrementalChangeToCollectionResult();
        result.setResultObject(resultObject);

        java.util.HashMap mapOutParameter = new java.util.HashMap();
        for (int i = 0; i < outParameter.length; i++) {
            CIMArgument argument = outParameter[i];
            if (argument != null) {
                mapOutParameter.put(argument.getName(), argument);
            }
        }

        CIMArgument arg_CanNotApply = (CIMArgument) mapOutParameter.get("CanNotApply");
        if (arg_CanNotApply != null) {

            String[] out_CanNotApply = (String[]) arg_CanNotApply.getValue();

            result.set_CanNotApply(out_CanNotApply);
        }

        return result;
    }

    /**
     * Result object for the method VerifyOKToApplyIncrementalChangeToCollection
     */
    public static class VerifyOKToApplyIncrementalChangeToCollectionResult {
        /**
         * The return value of the method
         */

        javax.cim.UnsignedInteger32 resultObject = null;

        /**
         * Default constructor
         */
        VerifyOKToApplyIncrementalChangeToCollectionResult() {
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

        /**
         * The out parameter CanNotApply
         */
        String[] CanNotApply = null;

        /**
         * Set the out parameter CanNotApply
         * @param value
         */
        void set_CanNotApply(String[] value) {
            this.CanNotApply = value;
        }

        /**
         * get the out parameter CanNotApply
         * @return
         */
        public String[] get_CanNotApply() {
            return this.CanNotApply;
        }
    }

    /**
     * Invokes the Method VerifyOKToApplyIncrementalChangeToMSE
     * <br>
     * @param client the cimclient
     * The VerifyOKToApplyIncrementalChangeToMSE method is used to verify that a subset of the properties in this Setting can be applied to the referenced ManagedSystemElement at the given time or time interval. This method takes four input parameters: MSE (the ManagedSystemElement that is being verified), TimeToApply (which, being a datetime, can be either a specific time or a time interval), MustBeCompletedBy (which indicates the required completion time for the method), and a PropertiesToApply array (which contains a list of the property names whose values will be verified). If the array is null or empty or contains the string "ALL" as a property name, then all Settings properties will be verified. If it is set to "NONE", then no Settings properties will be verified. The return value should be 0 if it is okay to apply the Setting, 1 if the method is not supported, 2 if the Setting cannot be applied within the specified times, and any other number if an error occurred. In a subclass, the set of possible return codes could be specified using a ValueMap qualifier on the method. The strings to which the ValueMap contents are "translated" can also be specified in the subclass as a Values array qualifier.
     *   @param MSE The ManagedSystemElement for which the Setting is being verified.
     *   @param TimeToApply TimeToApply can be either a specific time or a time interval.
     *   @param MustBeCompletedBy The required completion time for the method.
     *   @param PropertiesToApply A list of the property names whose values will be verified.
     *
     */

    public VerifyOKToApplyIncrementalChangeToMSEResult invoke_VerifyOKToApplyIncrementalChangeToMSE(
            WBEMClient cimClient, CIM_ManagedSystemElement MSE, javax.cim.CIMDateTime TimeToApply,
            javax.cim.CIMDateTime MustBeCompletedBy, String[] PropertiesToApply)
            throws WbemsmtException {

        CIMArgument[] inParameter = new CIMArgument[4];
        CIMArgument[] outParameter = new CIMArgument[0];

        inParameter[0] = new CIMArgument("MSE", new CIMDataType(
                CIM_ManagedSystemElement.CIM_CLASS_NAME), MSE.getCimObjectPath());
        inParameter[1] = new CIMArgument("TimeToApply", CIMDataType.DATETIME_T, TimeToApply);
        inParameter[2] = new CIMArgument("MustBeCompletedBy", CIMDataType.DATETIME_T,
                MustBeCompletedBy);
        inParameter[3] = new CIMArgument("PropertiesToApply", CIMDataType.STRING_ARRAY_T,
                PropertiesToApply);

        javax.cim.UnsignedInteger32 resultObject = null;

        try {
            Object oResult = cimClient.invokeMethod(this.getCimObjectPath(),
                    METHOD_VERIFYOKTOAPPLYINCREMENTALCHANGETOMSE.NAME, inParameter, outParameter);
            if (oResult != null) {

                resultObject = (javax.cim.UnsignedInteger32) oResult;
            }
        }
        catch (WBEMException e) {
            throw new InvokeMethodException(e, new InvokeMethodUserObject(this.getCimObjectPath(),
                    METHOD_VERIFYOKTOAPPLYINCREMENTALCHANGETOMSE.NAME, inParameter, outParameter));
        }

        VerifyOKToApplyIncrementalChangeToMSEResult result = new VerifyOKToApplyIncrementalChangeToMSEResult();
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
     * Result object for the method VerifyOKToApplyIncrementalChangeToMSE
     */
    public static class VerifyOKToApplyIncrementalChangeToMSEResult {
        /**
         * The return value of the method
         */

        javax.cim.UnsignedInteger32 resultObject = null;

        /**
         * Default constructor
         */
        VerifyOKToApplyIncrementalChangeToMSEResult() {
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

    /**
     * Invokes the Method VerifyOKToApplyToCollection
     * <br>
     * @param client the cimclient
     * The VerifyOKToApplyToCollection method is used to verify that this Setting can be applied to the referenced Collection of ManagedSystemElements, at the given time or time interval, without causing adverse effects to either the Collection itself or its surrounding environment. The net effect is to execute the VerifyOKToApply method against each of the Elements that are aggregated by the Collection. This method takes three input parameters: Collection (the Collection of ManagedSystemElements that is being verified), TimeToApply (which, being a datetime, can be either a specific time or a time interval), and MustBeCompletedBy (which indicates the required completion time for the method). The return value should be 0 if it is okay to apply the Setting, 1 if the method is not supported, 2 if the Setting cannot be applied within the specified times, and any other number if an error occurred. One output parameter, CanNotApply, is defined, which is a string array that lists the keys of the ManagedSystemElements to which the Setting cannot be applied. This parameter enables those Elements to be revisited and either fixed or have other corrective action taken on them. 
     * In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are "translated" can also be specified in the subclass as a Values array qualifier.
     *   @param Collection The Collection of ManagedSystemElements that is being verified.
     *   @param TimeToApply TimeToApply can be either a specific time or a time interval.
     *   @param MustBeCompletedBy The required completion time for the method.
     *
     */

    public VerifyOKToApplyToCollectionResult invoke_VerifyOKToApplyToCollection(
            WBEMClient cimClient, CIM_CollectionOfMSEs Collection,
            javax.cim.CIMDateTime TimeToApply, javax.cim.CIMDateTime MustBeCompletedBy)
            throws WbemsmtException {

        CIMArgument[] inParameter = new CIMArgument[3];
        CIMArgument[] outParameter = new CIMArgument[1];

        inParameter[0] = new CIMArgument("Collection", new CIMDataType(
                CIM_CollectionOfMSEs.CIM_CLASS_NAME), Collection.getCimObjectPath());
        inParameter[1] = new CIMArgument("TimeToApply", CIMDataType.DATETIME_T, TimeToApply);
        inParameter[2] = new CIMArgument("MustBeCompletedBy", CIMDataType.DATETIME_T,
                MustBeCompletedBy);

        javax.cim.UnsignedInteger32 resultObject = null;

        try {
            Object oResult = cimClient.invokeMethod(this.getCimObjectPath(),
                    METHOD_VERIFYOKTOAPPLYTOCOLLECTION.NAME, inParameter, outParameter);
            if (oResult != null) {

                resultObject = (javax.cim.UnsignedInteger32) oResult;
            }
        }
        catch (WBEMException e) {
            throw new InvokeMethodException(e, new InvokeMethodUserObject(this.getCimObjectPath(),
                    METHOD_VERIFYOKTOAPPLYTOCOLLECTION.NAME, inParameter, outParameter));
        }

        VerifyOKToApplyToCollectionResult result = new VerifyOKToApplyToCollectionResult();
        result.setResultObject(resultObject);

        java.util.HashMap mapOutParameter = new java.util.HashMap();
        for (int i = 0; i < outParameter.length; i++) {
            CIMArgument argument = outParameter[i];
            if (argument != null) {
                mapOutParameter.put(argument.getName(), argument);
            }
        }

        CIMArgument arg_CanNotApply = (CIMArgument) mapOutParameter.get("CanNotApply");
        if (arg_CanNotApply != null) {

            String[] out_CanNotApply = (String[]) arg_CanNotApply.getValue();

            result.set_CanNotApply(out_CanNotApply);
        }

        return result;
    }

    /**
     * Result object for the method VerifyOKToApplyToCollection
     */
    public static class VerifyOKToApplyToCollectionResult {
        /**
         * The return value of the method
         */

        javax.cim.UnsignedInteger32 resultObject = null;

        /**
         * Default constructor
         */
        VerifyOKToApplyToCollectionResult() {
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

        /**
         * The out parameter CanNotApply
         */
        String[] CanNotApply = null;

        /**
         * Set the out parameter CanNotApply
         * @param value
         */
        void set_CanNotApply(String[] value) {
            this.CanNotApply = value;
        }

        /**
         * get the out parameter CanNotApply
         * @return
         */
        public String[] get_CanNotApply() {
            return this.CanNotApply;
        }
    }

    /**
     * Invokes the Method VerifyOKToApplyToMSE
     * <br>
     * @param client the cimclient
     * The VerifyOKToApplyToMSE method is used to verify that this Setting can be applied to the referenced ManagedSystemElement at the given time or time interval. This method takes three input parameters: MSE (the Managed SystemElement that is being verified), TimeToApply (which, being a datetime, can be either a specific time or a time interval), and MustBeCompletedBy (which indicates the required completion time for the method). The return value should be 0 if it is okay to apply the Setting, 1 if the method is not supported, 2 if the Setting cannot be applied within the specified times, and any other number if an error occurred. In a subclass, the set of possible return codes could be specified using a ValueMap qualifier on the method. The strings to which the ValueMap contents are "translated" can also be specified in the subclass as a Values array qualifier.
     *   @param MSE The ManagedSystemElement that is being verified.
     *   @param TimeToApply TimeToApply can be either a specific time or a time interval.
     *   @param MustBeCompletedBy The required completion time for the method.
     *
     */

    public VerifyOKToApplyToMSEResult invoke_VerifyOKToApplyToMSE(WBEMClient cimClient,
            CIM_ManagedSystemElement MSE, javax.cim.CIMDateTime TimeToApply,
            javax.cim.CIMDateTime MustBeCompletedBy) throws WbemsmtException {

        CIMArgument[] inParameter = new CIMArgument[3];
        CIMArgument[] outParameter = new CIMArgument[0];

        inParameter[0] = new CIMArgument("MSE", new CIMDataType(
                CIM_ManagedSystemElement.CIM_CLASS_NAME), MSE.getCimObjectPath());
        inParameter[1] = new CIMArgument("TimeToApply", CIMDataType.DATETIME_T, TimeToApply);
        inParameter[2] = new CIMArgument("MustBeCompletedBy", CIMDataType.DATETIME_T,
                MustBeCompletedBy);

        javax.cim.UnsignedInteger32 resultObject = null;

        try {
            Object oResult = cimClient.invokeMethod(this.getCimObjectPath(),
                    METHOD_VERIFYOKTOAPPLYTOMSE.NAME, inParameter, outParameter);
            if (oResult != null) {

                resultObject = (javax.cim.UnsignedInteger32) oResult;
            }
        }
        catch (WBEMException e) {
            throw new InvokeMethodException(e, new InvokeMethodUserObject(this.getCimObjectPath(),
                    METHOD_VERIFYOKTOAPPLYTOMSE.NAME, inParameter, outParameter));
        }

        VerifyOKToApplyToMSEResult result = new VerifyOKToApplyToMSEResult();
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
     * Result object for the method VerifyOKToApplyToMSE
     */
    public static class VerifyOKToApplyToMSEResult {
        /**
         * The return value of the method
         */

        javax.cim.UnsignedInteger32 resultObject = null;

        /**
         * Default constructor
         */
        VerifyOKToApplyToMSEResult() {
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
        return CIM_Setting.CIM_CLASS_NAME;
    }

}