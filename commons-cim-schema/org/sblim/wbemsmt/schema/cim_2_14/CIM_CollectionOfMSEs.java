/** 
 * CIM_CollectionOfMSEs.java
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
 * Description: The CollectionOfMSEs object allows the grouping of Managed SystemElements for various identification purposes and to reduce the complexity of associating Settings and Configurations. It is abstract to require further definition and semantic refinement in subclasses. The CollectionOfMSEs object does not carry any state or status information, but represents only a grouping or 'bag' of Elements. For this reason, it is incorrect to subclass groups that have state or status from CollectionOfMSEs. An example is CIM_Redundancy Group (which is subclassed from LogicalElement). 
 * Collections typically aggregate similar ('like') objects, but they are not required to do so. Collections simply identify 'bags' and might represent an optimization. This purpose is especially true with respect to their association to Settings and Configurations. Without Collections, you would need to define individual ElementSetting and ElementConfiguration associations, to tie Settings and Configuration objects to individual ManagedSystemElements. There might be duplication when assigning the same Setting to multiple objects. In addition, using the Collection object allows the determination that the Setting and Configuration associations are indeed the same for the Collection's members. This information would otherwise be obtained by defining the Collection in a proprietary manner, and then querying the ElementSetting and ElementConfiguration associations to determine if the Collection set is completely covered.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim_2_14;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_CollectionOfMSEs extends CIM_Collection {

    public final static String CIM_CLASS_NAME = "CIM_CollectionOfMSEs";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property CollectionID
     * The identification of the Collection object. When subclassed, the CollectionID property can be overridden to be a Key property.
     */
    public static class PROPERTY_COLLECTIONID {
        /**
         * name of the property CollectionID
         */
        public final static String NAME = "CollectionID";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim_2_14");
        String[] parentClassPackageList = CIM_Collection.getPackages();

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
     *   The CollectionOfMSEs object allows the grouping of Managed SystemElements for various identification purposes and to reduce the complexity of associating Settings and Configurations. It is abstract to require further definition and semantic refinement in subclasses. The CollectionOfMSEs object does not carry any state or status information, but represents only a grouping or 'bag' of Elements. For this reason, it is incorrect to subclass groups that have state or status from CollectionOfMSEs. An example is CIM_Redundancy Group (which is subclassed from LogicalElement). 
     * Collections typically aggregate similar ('like') objects, but they are not required to do so. Collections simply identify 'bags' and might represent an optimization. This purpose is especially true with respect to their association to Settings and Configurations. Without Collections, you would need to define individual ElementSetting and ElementConfiguration associations, to tie Settings and Configuration objects to individual ManagedSystemElements. There might be duplication when assigning the same Setting to multiple objects. In addition, using the Collection object allows the determination that the Setting and Configuration associations are indeed the same for the Collection's members. This information would otherwise be obtained by defining the Collection in a proprietary manner, and then querying the ElementSetting and ElementConfiguration associations to determine if the Collection set is completely covered.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    protected CIM_CollectionOfMSEs(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *   protected because this class should not be created directly because it represents an abstract CIM Class     *   <br>
     *   The CollectionOfMSEs object allows the grouping of Managed SystemElements for various identification purposes and to reduce the complexity of associating Settings and Configurations. It is abstract to require further definition and semantic refinement in subclasses. The CollectionOfMSEs object does not carry any state or status information, but represents only a grouping or 'bag' of Elements. For this reason, it is incorrect to subclass groups that have state or status from CollectionOfMSEs. An example is CIM_Redundancy Group (which is subclassed from LogicalElement). 
     * Collections typically aggregate similar ('like') objects, but they are not required to do so. Collections simply identify 'bags' and might represent an optimization. This purpose is especially true with respect to their association to Settings and Configurations. Without Collections, you would need to define individual ElementSetting and ElementConfiguration associations, to tie Settings and Configuration objects to individual ManagedSystemElements. There might be duplication when assigning the same Setting to multiple objects. In addition, using the Collection object allows the determination that the Setting and Configuration associations are indeed the same for the Collection's members. This information would otherwise be obtained by defining the Collection in a proprietary manner, and then querying the ElementSetting and ElementConfiguration associations to determine if the Collection set is completely covered.
     *   @param cimInstance the instance that is used to create the Object
     */

    protected CIM_CollectionOfMSEs(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_CollectionOfMSEs() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("CollectionID", new CIMProperty("CollectionID", CIMDataType.STRING_T,
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
     * Get the property CollectionID
     *     * <br>
     * The identification of the Collection object. When subclassed, the CollectionID property can be overridden to be a Key property.
     *     */

    public String get_CollectionID() {
        CIMProperty currentProperty = getProperty(PROPERTY_COLLECTIONID.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_COLLECTIONID.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property CollectionID
     * <br>
     * The identification of the Collection object. When subclassed, the CollectionID property can be overridden to be a Key property.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_CollectionID(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_COLLECTIONID.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_CollectionID(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_COLLECTIONID.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property CollectionID by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_CollectionID(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_CollectionOfMSEs fco = new CIM_CollectionOfMSEs(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_COLLECTIONID.NAME);
        if (property != null) {
            property = setPropertyValue_CollectionID(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_COLLECTIONID.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property CollectionID
     * <br>
     * The identification of the Collection object. When subclassed, the CollectionID property can be overridden to be a Key property.
     */

    private static CIMProperty setPropertyValue_CollectionID(CIMProperty currentProperty,
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
        return CIM_CollectionOfMSEs.CIM_CLASS_NAME;
    }

}