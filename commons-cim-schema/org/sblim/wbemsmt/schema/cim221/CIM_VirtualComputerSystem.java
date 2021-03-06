/**
 * CIM_VirtualComputerSystem.java Â© Copyright IBM Corp.  2009,2005 THIS FILE IS PROVIDED UNDER THE
 * TERMS OF THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS
 * FILE CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of the
 * Common Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.fco.jsr48.FcoGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/fco/jsr48/fco.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: A class derived from ComputerSystem that
 *            represents the ability to virtualize or emulate another ComputerSystem. generated
 *            Class
 */

package org.sblim.wbemsmt.schema.cim221;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_VirtualComputerSystem extends CIM_ComputerSystem {

    public final static String CIM_CLASS_NAME = "CIM_VirtualComputerSystem";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property VirtualSystem
     * A string describing the type of System or hardware platform that is virtualized. OperatingSystem information is obtained via the RunningOS inherited from ComputerSystem.
     */
    public static class PROPERTY_VIRTUALSYSTEM {
        /**
         * name of the property VirtualSystem
         */
        public final static String NAME = "VirtualSystem";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim221");
        String[] parentClassPackageList = CIM_ComputerSystem.getPackages();

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
     *   A class derived from ComputerSystem that represents the ability to virtualize or emulate another ComputerSystem.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_VirtualComputerSystem(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   A class derived from ComputerSystem that represents the ability to virtualize or emulate another ComputerSystem.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_VirtualComputerSystem(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_VirtualComputerSystem() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("VirtualSystem", new CIMProperty("VirtualSystem",
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
     * Get the property VirtualSystem
     *     * <br>
     * A string describing the type of System or hardware platform that is virtualized. OperatingSystem information is obtained via the RunningOS inherited from ComputerSystem.
     *     */

    public String get_VirtualSystem() {
        CIMProperty currentProperty = getProperty(PROPERTY_VIRTUALSYSTEM.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_VIRTUALSYSTEM.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property VirtualSystem
     * <br>
     * A string describing the type of System or hardware platform that is virtualized. OperatingSystem information is obtained via the RunningOS inherited from ComputerSystem.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_VirtualSystem(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_VIRTUALSYSTEM.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_VirtualSystem(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_VIRTUALSYSTEM.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property VirtualSystem by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_VirtualSystem(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_VirtualComputerSystem fco = new CIM_VirtualComputerSystem(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_VIRTUALSYSTEM.NAME);
        if (property != null) {
            property = setPropertyValue_VirtualSystem(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_VIRTUALSYSTEM.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property VirtualSystem
     * <br>
     * A string describing the type of System or hardware platform that is virtualized. OperatingSystem information is obtained via the RunningOS inherited from ComputerSystem.
     */

    private static CIMProperty setPropertyValue_VirtualSystem(CIMProperty currentProperty,
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
        return CIM_VirtualComputerSystem.CIM_CLASS_NAME;
    }

}