/** 
 * CIM_ProcessOfJob.java
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
 * Description: ProcessOfJob describes that the referenced Process is the result of the execution of the Job. A Job may cause multiple Processes to run, perhaps on different operating systems. This is allowed by the '*' cardinality of the Process reference. Note that a Process can result from only one Job - hence, the '0..1' cardinality on Job.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_ProcessOfJob extends CIM_Component {

    public final static String CIM_CLASS_NAME = "CIM_ProcessOfJob";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property GroupComponent
     * 
     */
    public static class PROPERTY_GROUPCOMPONENT_CIM_JOB {
        /**
         * name of the property GroupComponent
         */
        public final static String NAME = "GroupComponent";

    }

    /**
     * Constants of property PartComponent
     * 
     */
    public static class PROPERTY_PARTCOMPONENT_CIM_PROCESS {
        /**
         * name of the property PartComponent
         */
        public final static String NAME = "PartComponent";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_Component.getPackages();

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
     *   ProcessOfJob describes that the referenced Process is the result of the execution of the Job. A Job may cause multiple Processes to run, perhaps on different operating systems. This is allowed by the '*' cardinality of the Process reference. Note that a Process can result from only one Job - hence, the '0..1' cardinality on Job.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_ProcessOfJob(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   ProcessOfJob describes that the referenced Process is the result of the execution of the Job. A Job may cause multiple Processes to run, perhaps on different operating systems. This is allowed by the '*' cardinality of the Process reference. Note that a Process can result from only one Job - hence, the '0..1' cardinality on Job.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_ProcessOfJob(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_ProcessOfJob() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("GroupComponent", new CIMProperty("GroupComponent", new CIMDataType(
                CIM_Job.CIM_CLASS_NAME), null));
        propertiesToCheck.put("PartComponent", new CIMProperty("PartComponent", new CIMDataType(
                CIM_Process.CIM_CLASS_NAME), null));

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
     * Get the property GroupComponent
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_Job get_GroupComponent_CIM_Job(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_GROUPCOMPONENT_CIM_JOB.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_GROUPCOMPONENT_CIM_JOB.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_JobHelper.getInstance(client, (CIMObjectPath) currentProperty.getValue());

    }

    /**
     * Set the property GroupComponent
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_GroupComponent_CIM_Job(CIM_Job newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_GROUPCOMPONENT_CIM_JOB.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_GroupComponent_CIM_Job(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_GROUPCOMPONENT_CIM_JOB.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property GroupComponent by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_GroupComponent_CIM_Job(WBEMClient client, String namespace,
            CIM_Job newValue) throws WbemsmtException {
        CIM_ProcessOfJob fco = new CIM_ProcessOfJob(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_GROUPCOMPONENT_CIM_JOB.NAME);
        if (property != null) {
            property = setPropertyValue_GroupComponent_CIM_Job(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_GROUPCOMPONENT_CIM_JOB.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property GroupComponent
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_GroupComponent_CIM_Job(CIMProperty currentProperty,
            CIM_Job newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getCimObjectPath() : null;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PartComponent
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_Process get_PartComponent_CIM_Process(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_PARTCOMPONENT_CIM_PROCESS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PARTCOMPONENT_CIM_PROCESS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_ProcessHelper.getInstance(client, (CIMObjectPath) currentProperty.getValue());

    }

    /**
     * Set the property PartComponent
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PartComponent_CIM_Process(CIM_Process newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PARTCOMPONENT_CIM_PROCESS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_PartComponent_CIM_Process(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PARTCOMPONENT_CIM_PROCESS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PartComponent by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PartComponent_CIM_Process(WBEMClient client, String namespace,
            CIM_Process newValue) throws WbemsmtException {
        CIM_ProcessOfJob fco = new CIM_ProcessOfJob(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PARTCOMPONENT_CIM_PROCESS.NAME);
        if (property != null) {
            property = setPropertyValue_PartComponent_CIM_Process(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PARTCOMPONENT_CIM_PROCESS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PartComponent
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_PartComponent_CIM_Process(
            CIMProperty currentProperty, CIM_Process newValue) {
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
        return CIM_ProcessOfJob.CIM_CLASS_NAME;
    }

}