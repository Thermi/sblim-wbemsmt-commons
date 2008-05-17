/** 
 * CIM_CollectedMSEs.java
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
 * Description: CIM_CollectedMSEs is a generic association used to establish the members of the grouping object, CollectionOf MSEs.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_CollectedMSEs extends CIM_MemberOfCollection {

    public final static String CIM_CLASS_NAME = "CIM_CollectedMSEs";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property Collection
     * 
     */
    public static class PROPERTY_COLLECTION_CIM_COLLECTIONOFMSES {
        /**
         * name of the property Collection
         */
        public final static String NAME = "Collection";

    }

    /**
     * Constants of property Member
     * 
     */
    public static class PROPERTY_MEMBER_CIM_MANAGEDSYSTEMELEMENT {
        /**
         * name of the property Member
         */
        public final static String NAME = "Member";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_MemberOfCollection.getPackages();

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
     *   CIM_CollectedMSEs is a generic association used to establish the members of the grouping object, CollectionOf MSEs.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_CollectedMSEs(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   CIM_CollectedMSEs is a generic association used to establish the members of the grouping object, CollectionOf MSEs.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_CollectedMSEs(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_CollectedMSEs() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("Collection", new CIMProperty("Collection", new CIMDataType(
                CIM_CollectionOfMSEs.CIM_CLASS_NAME), null));
        propertiesToCheck.put("Member", new CIMProperty("Member", new CIMDataType(
                CIM_ManagedSystemElement.CIM_CLASS_NAME), null));

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
     * Get the property Collection
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_CollectionOfMSEs get_Collection_CIM_CollectionOfMSEs(
            javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_COLLECTION_CIM_COLLECTIONOFMSES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_COLLECTION_CIM_COLLECTIONOFMSES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_CollectionOfMSEsHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property Collection
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Collection_CIM_CollectionOfMSEs(CIM_CollectionOfMSEs newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_COLLECTION_CIM_COLLECTIONOFMSES.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Collection_CIM_CollectionOfMSEs(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_COLLECTION_CIM_COLLECTIONOFMSES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Collection by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Collection_CIM_CollectionOfMSEs(WBEMClient client,
            String namespace, CIM_CollectionOfMSEs newValue) throws WbemsmtException {
        CIM_CollectedMSEs fco = new CIM_CollectedMSEs(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_COLLECTION_CIM_COLLECTIONOFMSES.NAME);
        if (property != null) {
            property = setPropertyValue_Collection_CIM_CollectionOfMSEs(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_COLLECTION_CIM_COLLECTIONOFMSES.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Collection
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_Collection_CIM_CollectionOfMSEs(
            CIMProperty currentProperty, CIM_CollectionOfMSEs newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getCimObjectPath() : null;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Member
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_ManagedSystemElement get_Member_CIM_ManagedSystemElement(
            javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_MEMBER_CIM_MANAGEDSYSTEMELEMENT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_MEMBER_CIM_MANAGEDSYSTEMELEMENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_ManagedSystemElementHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property Member
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Member_CIM_ManagedSystemElement(CIM_ManagedSystemElement newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_MEMBER_CIM_MANAGEDSYSTEMELEMENT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Member_CIM_ManagedSystemElement(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_MEMBER_CIM_MANAGEDSYSTEMELEMENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Member by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Member_CIM_ManagedSystemElement(WBEMClient client,
            String namespace, CIM_ManagedSystemElement newValue) throws WbemsmtException {
        CIM_CollectedMSEs fco = new CIM_CollectedMSEs(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MEMBER_CIM_MANAGEDSYSTEMELEMENT.NAME);
        if (property != null) {
            property = setPropertyValue_Member_CIM_ManagedSystemElement(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_MEMBER_CIM_MANAGEDSYSTEMELEMENT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Member
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_Member_CIM_ManagedSystemElement(
            CIMProperty currentProperty, CIM_ManagedSystemElement newValue) {
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
     * return the name of the CIMClass
     * @return
     */
    public String getObjectName() {
        return CIM_CollectedMSEs.CIM_CLASS_NAME;
    }

}