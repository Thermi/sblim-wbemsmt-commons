/** 
 * CIM_CompositeExtent.java
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
 * Description: A CompositeExtent is used to model the distribution of user data across one or more underlying StorageExtents, which may or not be protected by some redundancy mechanism. CompositeExtents represent a contiguous range of logical blocks. CompositeExtents may overlap, however, the underlying StorageExtents within the overlap shall not contain any check data. Distribution of check data may be specified using the CompositeExtentBasedOn association.
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

public class CIM_CompositeExtent extends CIM_StorageExtent {

    public final static String CIM_CLASS_NAME = "CIM_CompositeExtent";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * This specialization defines how data is striped across StorageExtents. Additionally, it includes information on distribution of check data so that the 'usual case' RAID devices can be created in one step.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPOSITEEXTENTBASEDON = "CIM_CompositeExtentBasedOn";

    /**
     * Constants of property ExtentInterleaveDepth
     * Number of StorageExtents to stripe as a collective set. In SCC, this value is defined as the number of stripes to count before continuing to map into the next contiguous set of Extents, beyond the current stripe.
     */
    public static class PROPERTY_EXTENTINTERLEAVEDEPTH {
        /**
         * name of the property ExtentInterleaveDepth
         */
        public final static String NAME = "ExtentInterleaveDepth";

    }

    /**
     * Constants of property ExtentStripeLength
     * Number of contiguous underlying StorageExtents counted before looping back to the first underlying StorageExtent of the current stripe. It is the number of StorageExtents forming the user data stripe.
     */
    public static class PROPERTY_EXTENTSTRIPELENGTH {
        /**
         * name of the property ExtentStripeLength
         */
        public final static String NAME = "ExtentStripeLength";

    }

    /**
     * Constants of property IsConcatenated
     * True indicates that the data is concatenated across the various StorageExtents in the Group.
     */
    public static class PROPERTY_ISCONCATENATED {
        /**
         * name of the property IsConcatenated
         */
        public final static String NAME = "IsConcatenated";

    }

    /**
     * Constants of property NumberOfBlocks
     * 
     */
    public static class PROPERTY_NUMBEROFBLOCKS {
        /**
         * name of the property NumberOfBlocks
         */
        public final static String NAME = "NumberOfBlocks";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_StorageExtent.getPackages();

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
     *   A CompositeExtent is used to model the distribution of user data across one or more underlying StorageExtents, which may or not be protected by some redundancy mechanism. CompositeExtents represent a contiguous range of logical blocks. CompositeExtents may overlap, however, the underlying StorageExtents within the overlap shall not contain any check data. Distribution of check data may be specified using the CompositeExtentBasedOn association.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_CompositeExtent(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   A CompositeExtent is used to model the distribution of user data across one or more underlying StorageExtents, which may or not be protected by some redundancy mechanism. CompositeExtents represent a contiguous range of logical blocks. CompositeExtents may overlap, however, the underlying StorageExtents within the overlap shall not contain any check data. Distribution of check data may be specified using the CompositeExtentBasedOn association.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_CompositeExtent(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_CompositeExtent() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("ExtentInterleaveDepth", new CIMProperty("ExtentInterleaveDepth",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("ExtentStripeLength", new CIMProperty("ExtentStripeLength",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("IsConcatenated", new CIMProperty("IsConcatenated",
                CIMDataType.BOOLEAN_T, null));
        propertiesToCheck.put("NumberOfBlocks", new CIMProperty("NumberOfBlocks",
                CIMDataType.UINT64_T, null));

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
     * Get the property ExtentInterleaveDepth
     *     * <br>
     * Number of StorageExtents to stripe as a collective set. In SCC, this value is defined as the number of stripes to count before continuing to map into the next contiguous set of Extents, beyond the current stripe.
     *     */

    public javax.cim.UnsignedInteger64 get_ExtentInterleaveDepth() {
        CIMProperty currentProperty = getProperty(PROPERTY_EXTENTINTERLEAVEDEPTH.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_EXTENTINTERLEAVEDEPTH.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property ExtentInterleaveDepth
     * <br>
     * Number of StorageExtents to stripe as a collective set. In SCC, this value is defined as the number of stripes to count before continuing to map into the next contiguous set of Extents, beyond the current stripe.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ExtentInterleaveDepth(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_EXTENTINTERLEAVEDEPTH.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ExtentInterleaveDepth(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_EXTENTINTERLEAVEDEPTH.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ExtentInterleaveDepth by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ExtentInterleaveDepth(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_CompositeExtent fco = new CIM_CompositeExtent(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_EXTENTINTERLEAVEDEPTH.NAME);
        if (property != null) {
            property = setPropertyValue_ExtentInterleaveDepth(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_EXTENTINTERLEAVEDEPTH.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ExtentInterleaveDepth
     * <br>
     * Number of StorageExtents to stripe as a collective set. In SCC, this value is defined as the number of stripes to count before continuing to map into the next contiguous set of Extents, beyond the current stripe.
     */

    private static CIMProperty setPropertyValue_ExtentInterleaveDepth(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ExtentStripeLength
     *     * <br>
     * Number of contiguous underlying StorageExtents counted before looping back to the first underlying StorageExtent of the current stripe. It is the number of StorageExtents forming the user data stripe.
     *     */

    public javax.cim.UnsignedInteger64 get_ExtentStripeLength() {
        CIMProperty currentProperty = getProperty(PROPERTY_EXTENTSTRIPELENGTH.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_EXTENTSTRIPELENGTH.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property ExtentStripeLength
     * <br>
     * Number of contiguous underlying StorageExtents counted before looping back to the first underlying StorageExtent of the current stripe. It is the number of StorageExtents forming the user data stripe.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ExtentStripeLength(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_EXTENTSTRIPELENGTH.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ExtentStripeLength(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_EXTENTSTRIPELENGTH.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ExtentStripeLength by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ExtentStripeLength(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_CompositeExtent fco = new CIM_CompositeExtent(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_EXTENTSTRIPELENGTH.NAME);
        if (property != null) {
            property = setPropertyValue_ExtentStripeLength(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_EXTENTSTRIPELENGTH.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ExtentStripeLength
     * <br>
     * Number of contiguous underlying StorageExtents counted before looping back to the first underlying StorageExtent of the current stripe. It is the number of StorageExtents forming the user data stripe.
     */

    private static CIMProperty setPropertyValue_ExtentStripeLength(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property IsConcatenated
     *     * <br>
     * True indicates that the data is concatenated across the various StorageExtents in the Group.
     *     */

    public Boolean get_IsConcatenated() {
        CIMProperty currentProperty = getProperty(PROPERTY_ISCONCATENATED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ISCONCATENATED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property IsConcatenated
     * <br>
     * True indicates that the data is concatenated across the various StorageExtents in the Group.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_IsConcatenated(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ISCONCATENATED.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_IsConcatenated(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ISCONCATENATED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property IsConcatenated by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_IsConcatenated(WBEMClient client, String namespace,
            Boolean newValue) throws WbemsmtException {
        CIM_CompositeExtent fco = new CIM_CompositeExtent(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ISCONCATENATED.NAME);
        if (property != null) {
            property = setPropertyValue_IsConcatenated(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ISCONCATENATED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property IsConcatenated
     * <br>
     * True indicates that the data is concatenated across the various StorageExtents in the Group.
     */

    private static CIMProperty setPropertyValue_IsConcatenated(CIMProperty currentProperty,
            Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property NumberOfBlocks
     *     * <br>
     * 
     *     */

    public javax.cim.UnsignedInteger64 get_NumberOfBlocks() {
        CIMProperty currentProperty = getProperty(PROPERTY_NUMBEROFBLOCKS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_NUMBEROFBLOCKS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property NumberOfBlocks
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_NumberOfBlocks(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_NUMBEROFBLOCKS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_NumberOfBlocks(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_NUMBEROFBLOCKS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property NumberOfBlocks by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_NumberOfBlocks(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_CompositeExtent fco = new CIM_CompositeExtent(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_NUMBEROFBLOCKS.NAME);
        if (property != null) {
            property = setPropertyValue_NumberOfBlocks(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_NUMBEROFBLOCKS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property NumberOfBlocks
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_NumberOfBlocks(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
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
     * Get the list with CIM_StorageExtent objects associated by the association CIM_CompositeExtentBasedOn
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPOSITEEXTENTBASEDON as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_StorageExtent_CIM_CompositeExtentBasedOns(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_StorageExtent_CIM_CompositeExtentBasedOns(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPOSITEEXTENTBASEDON,
                CIM_StorageExtent.CIM_CLASS_NAME, null, null, false, false, null);

    }

    /**
     * Get the list with CIM_StorageExtent objects associated by the association CIM_CompositeExtentBasedOn
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPOSITEEXTENTBASEDON or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPOSITEEXTENTBASEDON as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_StorageExtent_CIM_CompositeExtentBasedOns(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_StorageExtent_CIM_CompositeExtentBasedOns(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPOSITEEXTENTBASEDON, resultClass, role,
                resultRole, false, false, null);

    }

    /**
     * Get the list with CIM_StorageExtent objects associated by the association CIM_CompositeExtentBasedOn
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPOSITEEXTENTBASEDON or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_StorageExtent_CIM_CompositeExtentBasedOns(
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
                CIM_CompositeExtentHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_CompositeExtentHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_CompositeExtentHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_StorageExtent(cimInstance));
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
                        result.add(new CIM_StorageExtent(cimInstance));
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
                        result.add(new CIM_StorageExtent(cimInstance));
                        continue;
                    }
                }
            }
            CIM_CompositeExtentHelper.checkException(enumeration);
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
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_CompositeExtentBasedOn
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPOSITEEXTENTBASEDON as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_StorageExtent_CIM_CompositeExtentBasedOnNames(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_StorageExtent_CIM_CompositeExtentBasedOnNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPOSITEEXTENTBASEDON,
                CIM_StorageExtent.CIM_CLASS_NAME, null, null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_CompositeExtentBasedOn
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPOSITEEXTENTBASEDON or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPOSITEEXTENTBASEDON as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_StorageExtent_CIM_CompositeExtentBasedOnNames(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_StorageExtent_CIM_CompositeExtentBasedOnNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPOSITEEXTENTBASEDON, resultClass, role, resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_CompositeExtentBasedOn
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_StorageExtent_CIM_CompositeExtentBasedOnNames(
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
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPOSITEEXTENTBASEDON,
                    CIM_StorageExtent.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_CompositeExtentHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_CompositeExtentHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_StorageExtent.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_CompositeExtentHelper.checkException(enumeration);
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
     * Get the list with CIM_CompositeExtentBasedOn associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_CompositeExtentBasedOn(WBEMClient cimClient,
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPOSITEEXTENTBASEDON, role, includeQualifiers,
                    includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPOSITEEXTENTBASEDON, role, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_CompositeExtentHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_CompositeExtentHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_CompositeExtentBasedOnHelper
                            .findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_CompositeExtentBasedOn(cimInstance));
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
                        result.add(new CIM_CompositeExtentBasedOn(cimInstance));
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
                        result.add(new CIM_CompositeExtentBasedOn(cimInstance));
                        continue;
                    }
                }
            }
            CIM_CompositeExtentHelper.checkException(enumeration);
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
     * Get a list of CIMObjectPath items of the associations CIM_CompositeExtentBasedOn
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_CompositeExtentBasedOn(WBEMClient cimClient,
            String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPOSITEEXTENTBASEDON, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e,
                    new ReferenceNamesUserObject(this.getCimObjectPath(),
                            CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPOSITEEXTENTBASEDON, role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_CompositeExtentHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_CompositeExtentHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_CompositeExtentBasedOn.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_CompositeExtentHelper.checkException(enumeration);
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
        return CIM_CompositeExtent.CIM_CLASS_NAME;
    }

}