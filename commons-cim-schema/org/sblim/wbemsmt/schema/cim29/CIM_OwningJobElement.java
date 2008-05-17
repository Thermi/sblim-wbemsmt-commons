/** 
 * CIM_OwningJobElement.java
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
 * Description: OwningJobElement represents an association between a Job and the ManagedElement responsible for the creation of the Job. This association may not be possible, given that the execution of jobs can move between systems and that the lifecycle of the creating entity may not persist for the total duration of the job. However, this can be very useful information when available. This association defines a more specific 'owner' than is provided by the CIM_Job.Owner string.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_OwningJobElement extends org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco {

    public final static String CIM_CLASS_NAME = "CIM_OwningJobElement";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property OwningElement
     * 
     */
    public static class PROPERTY_OWNINGELEMENT_CIM_MANAGEDELEMENT {
        /**
         * name of the property OwningElement
         */
        public final static String NAME = "OwningElement";

    }

    /**
     * Constants of property OwnedElement
     * 
     */
    public static class PROPERTY_OWNEDELEMENT_CIM_JOB {
        /**
         * name of the property OwnedElement
         */
        public final static String NAME = "OwnedElement";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");

    };

    //**********************************************************************
    // Constructors     
    //**********************************************************************

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   OwningJobElement represents an association between a Job and the ManagedElement responsible for the creation of the Job. This association may not be possible, given that the execution of jobs can move between systems and that the lifecycle of the creating entity may not persist for the total duration of the job. However, this can be very useful information when available. This association defines a more specific 'owner' than is provided by the CIM_Job.Owner string.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_OwningJobElement(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   OwningJobElement represents an association between a Job and the ManagedElement responsible for the creation of the Job. This association may not be possible, given that the execution of jobs can move between systems and that the lifecycle of the creating entity may not persist for the total duration of the job. However, this can be very useful information when available. This association defines a more specific 'owner' than is provided by the CIM_Job.Owner string.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_OwningJobElement(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_OwningJobElement() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("OwningElement", new CIMProperty("OwningElement", new CIMDataType(
                CIM_ManagedElement.CIM_CLASS_NAME), null));
        propertiesToCheck.put("OwnedElement", new CIMProperty("OwnedElement", new CIMDataType(
                CIM_Job.CIM_CLASS_NAME), null));

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
     * Get the property OwningElement
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_ManagedElement get_OwningElement_CIM_ManagedElement(
            javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_OWNINGELEMENT_CIM_MANAGEDELEMENT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OWNINGELEMENT_CIM_MANAGEDELEMENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_ManagedElementHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property OwningElement
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OwningElement_CIM_ManagedElement(CIM_ManagedElement newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OWNINGELEMENT_CIM_MANAGEDELEMENT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_OwningElement_CIM_ManagedElement(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OWNINGELEMENT_CIM_MANAGEDELEMENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OwningElement by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OwningElement_CIM_ManagedElement(WBEMClient client,
            String namespace, CIM_ManagedElement newValue) throws WbemsmtException {
        CIM_OwningJobElement fco = new CIM_OwningJobElement(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OWNINGELEMENT_CIM_MANAGEDELEMENT.NAME);
        if (property != null) {
            property = setPropertyValue_OwningElement_CIM_ManagedElement(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OWNINGELEMENT_CIM_MANAGEDELEMENT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OwningElement
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_OwningElement_CIM_ManagedElement(
            CIMProperty currentProperty, CIM_ManagedElement newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getCimObjectPath() : null;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OwnedElement
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_Job get_OwnedElement_CIM_Job(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_OWNEDELEMENT_CIM_JOB.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OWNEDELEMENT_CIM_JOB.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_JobHelper.getInstance(client, (CIMObjectPath) currentProperty.getValue());

    }

    /**
     * Set the property OwnedElement
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OwnedElement_CIM_Job(CIM_Job newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OWNEDELEMENT_CIM_JOB.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_OwnedElement_CIM_Job(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OWNEDELEMENT_CIM_JOB.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OwnedElement by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OwnedElement_CIM_Job(WBEMClient client, String namespace,
            CIM_Job newValue) throws WbemsmtException {
        CIM_OwningJobElement fco = new CIM_OwningJobElement(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OWNEDELEMENT_CIM_JOB.NAME);
        if (property != null) {
            property = setPropertyValue_OwnedElement_CIM_Job(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OWNEDELEMENT_CIM_JOB.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OwnedElement
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_OwnedElement_CIM_Job(CIMProperty currentProperty,
            CIM_Job newValue) {
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
     * returns true if the objects are the same
     * 
     * @return
     * @see org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco\#equals(Object)
     */
    public boolean equals(Object object) {
        if (!(object instanceof CIM_OwningJobElement)) {
            return false;
        }

        return super.equals(object);
    }

    /**
     * return the name of the CIMClass
     * @return
     */
    public String getObjectName() {
        return CIM_OwningJobElement.CIM_CLASS_NAME;
    }

}