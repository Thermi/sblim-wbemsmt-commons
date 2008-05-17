/** 
 * CIM_SymbolicLink.java
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
 * Description: This class is a special type of LogicalFile that represents a Symbolic Link. This convention is useful for some operating systems that want to represent a single file in multiple places or a single file that is represented via multiple names.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_SymbolicLink extends CIM_LogicalFile {

    public final static String CIM_CLASS_NAME = "CIM_SymbolicLink";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property TargetFile
     * The target file of the symbolic link.
     */
    public static class PROPERTY_TARGETFILE {
        /**
         * name of the property TargetFile
         */
        public final static String NAME = "TargetFile";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_LogicalFile.getPackages();

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
     *   This class is a special type of LogicalFile that represents a Symbolic Link. This convention is useful for some operating systems that want to represent a single file in multiple places or a single file that is represented via multiple names.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_SymbolicLink(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   This class is a special type of LogicalFile that represents a Symbolic Link. This convention is useful for some operating systems that want to represent a single file in multiple places or a single file that is represented via multiple names.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_SymbolicLink(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_SymbolicLink() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("TargetFile", new CIMProperty("TargetFile", CIMDataType.STRING_T,
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
     * Get the property TargetFile
     *     * <br>
     * The target file of the symbolic link.
     *     */

    public String get_TargetFile() {
        CIMProperty currentProperty = getProperty(PROPERTY_TARGETFILE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_TARGETFILE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property TargetFile
     * <br>
     * The target file of the symbolic link.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_TargetFile(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_TARGETFILE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_TargetFile(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_TARGETFILE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property TargetFile by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_TargetFile(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_SymbolicLink fco = new CIM_SymbolicLink(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_TARGETFILE.NAME);
        if (property != null) {
            property = setPropertyValue_TargetFile(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_TARGETFILE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property TargetFile
     * <br>
     * The target file of the symbolic link.
     */

    private static CIMProperty setPropertyValue_TargetFile(CIMProperty currentProperty,
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
        return CIM_SymbolicLink.CIM_CLASS_NAME;
    }

}