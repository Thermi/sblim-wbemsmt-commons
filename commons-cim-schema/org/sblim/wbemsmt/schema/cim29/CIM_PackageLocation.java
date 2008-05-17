/** 
 * CIM_PackageLocation.java
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
 * Description: PackageLocation is a space/hole/shelf, possibly with mounting brackets or other connecting hardware, where other PhysicalPackages may be placed. This class describes an entity that holds something else and is not just a 'place' (as is conveyed by the CIM_Location object). This class has several corollaries to HostingBoard. Where a HostingBoard (backplane) has connectors/slots to describe the capabilities of holding additional PhysicalPackages, a PackageLocation is used to describe the same case for the general package, where there may or may not be no connectors. Examples of PackageLocations would include a disk cage in a tower PC or the chassis area where the power supply is mounted.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_PackageLocation extends CIM_PhysicalPackage {

    public final static String CIM_CLASS_NAME = "CIM_PackageLocation";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property LocationCoordinates
     * LocationCoordinates represent the physical location of the the FrameSlot instance. The property is defined as a free-form string to allow the location information to be described in vendor-unique terminology.
     */
    public static class PROPERTY_LOCATIONCOORDINATES {
        /**
         * name of the property LocationCoordinates
         */
        public final static String NAME = "LocationCoordinates";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_PhysicalPackage.getPackages();

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
     *   PackageLocation is a space/hole/shelf, possibly with mounting brackets or other connecting hardware, where other PhysicalPackages may be placed. This class describes an entity that holds something else and is not just a 'place' (as is conveyed by the CIM_Location object). This class has several corollaries to HostingBoard. Where a HostingBoard (backplane) has connectors/slots to describe the capabilities of holding additional PhysicalPackages, a PackageLocation is used to describe the same case for the general package, where there may or may not be no connectors. Examples of PackageLocations would include a disk cage in a tower PC or the chassis area where the power supply is mounted.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_PackageLocation(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   PackageLocation is a space/hole/shelf, possibly with mounting brackets or other connecting hardware, where other PhysicalPackages may be placed. This class describes an entity that holds something else and is not just a 'place' (as is conveyed by the CIM_Location object). This class has several corollaries to HostingBoard. Where a HostingBoard (backplane) has connectors/slots to describe the capabilities of holding additional PhysicalPackages, a PackageLocation is used to describe the same case for the general package, where there may or may not be no connectors. Examples of PackageLocations would include a disk cage in a tower PC or the chassis area where the power supply is mounted.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_PackageLocation(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_PackageLocation() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("LocationCoordinates", new CIMProperty("LocationCoordinates",
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
     * Get the property LocationCoordinates
     *     * <br>
     * LocationCoordinates represent the physical location of the the FrameSlot instance. The property is defined as a free-form string to allow the location information to be described in vendor-unique terminology.
     *     */

    public String get_LocationCoordinates() {
        CIMProperty currentProperty = getProperty(PROPERTY_LOCATIONCOORDINATES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_LOCATIONCOORDINATES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property LocationCoordinates
     * <br>
     * LocationCoordinates represent the physical location of the the FrameSlot instance. The property is defined as a free-form string to allow the location information to be described in vendor-unique terminology.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_LocationCoordinates(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_LOCATIONCOORDINATES.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_LocationCoordinates(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_LOCATIONCOORDINATES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property LocationCoordinates by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_LocationCoordinates(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_PackageLocation fco = new CIM_PackageLocation(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_LOCATIONCOORDINATES.NAME);
        if (property != null) {
            property = setPropertyValue_LocationCoordinates(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_LOCATIONCOORDINATES.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property LocationCoordinates
     * <br>
     * LocationCoordinates represent the physical location of the the FrameSlot instance. The property is defined as a free-form string to allow the location information to be described in vendor-unique terminology.
     */

    private static CIMProperty setPropertyValue_LocationCoordinates(CIMProperty currentProperty,
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
        return CIM_PackageLocation.CIM_CLASS_NAME;
    }

}