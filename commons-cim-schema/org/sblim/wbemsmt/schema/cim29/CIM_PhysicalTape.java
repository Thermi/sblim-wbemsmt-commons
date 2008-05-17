/** 
 * CIM_PhysicalTape.java
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
 * Description: The PhysicalTape class represents additional data for a Tape Media. Information on the tape length and whether it must be unloaded from BOT are properties of this class.
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

public class CIM_PhysicalTape extends CIM_PhysicalMedia {

    public final static String CIM_CLASS_NAME = "CIM_PhysicalTape";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * TapePartitions are realized on PhysicalTape. This relationship is made explicit by the RealizesTapePartition association.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_REALIZESTAPEPARTITION = "CIM_RealizesTapePartition";

    /**
     * Constants of property TapeLength
     * The physical length of the Tape in feet.
     */
    public static class PROPERTY_TAPELENGTH {
        /**
         * name of the property TapeLength
         */
        public final static String NAME = "TapeLength";

    }

    /**
     * Constants of property UnloadAnywhere
     * Boolean set to TRUE if the Tape can be unloaded at any position on the Media. It is set to FALSE if the tape must be at a certain position for unload - such as at the beginning of tape (BOT) area, or at mid-tape point for TapeDrives with mid-tape load.
     */
    public static class PROPERTY_UNLOADANYWHERE {
        /**
         * name of the property UnloadAnywhere
         */
        public final static String NAME = "UnloadAnywhere";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_PhysicalMedia.getPackages();

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
     *   The PhysicalTape class represents additional data for a Tape Media. Information on the tape length and whether it must be unloaded from BOT are properties of this class.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_PhysicalTape(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   The PhysicalTape class represents additional data for a Tape Media. Information on the tape length and whether it must be unloaded from BOT are properties of this class.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_PhysicalTape(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_PhysicalTape() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("TapeLength", new CIMProperty("TapeLength", CIMDataType.REAL32_T,
                null));
        propertiesToCheck.put("UnloadAnywhere", new CIMProperty("UnloadAnywhere",
                CIMDataType.BOOLEAN_T, null));

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
     * Get the property TapeLength
     *     * <br>
     * The physical length of the Tape in feet.
     *     */

    public Float get_TapeLength() {
        CIMProperty currentProperty = getProperty(PROPERTY_TAPELENGTH.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_TAPELENGTH.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (Float) currentProperty.getValue();

    }

    /**
     * Set the property TapeLength
     * <br>
     * The physical length of the Tape in feet.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_TapeLength(Float newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_TAPELENGTH.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_TapeLength(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_TAPELENGTH.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property TapeLength by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_TapeLength(WBEMClient client, String namespace, Float newValue)
            throws WbemsmtException {
        CIM_PhysicalTape fco = new CIM_PhysicalTape(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_TAPELENGTH.NAME);
        if (property != null) {
            property = setPropertyValue_TapeLength(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_TAPELENGTH.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property TapeLength
     * <br>
     * The physical length of the Tape in feet.
     */

    private static CIMProperty setPropertyValue_TapeLength(CIMProperty currentProperty,
            Float newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property UnloadAnywhere
     *     * <br>
     * Boolean set to TRUE if the Tape can be unloaded at any position on the Media. It is set to FALSE if the tape must be at a certain position for unload - such as at the beginning of tape (BOT) area, or at mid-tape point for TapeDrives with mid-tape load.
     *     */

    public Boolean get_UnloadAnywhere() {
        CIMProperty currentProperty = getProperty(PROPERTY_UNLOADANYWHERE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_UNLOADANYWHERE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property UnloadAnywhere
     * <br>
     * Boolean set to TRUE if the Tape can be unloaded at any position on the Media. It is set to FALSE if the tape must be at a certain position for unload - such as at the beginning of tape (BOT) area, or at mid-tape point for TapeDrives with mid-tape load.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_UnloadAnywhere(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_UNLOADANYWHERE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_UnloadAnywhere(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_UNLOADANYWHERE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property UnloadAnywhere by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_UnloadAnywhere(WBEMClient client, String namespace,
            Boolean newValue) throws WbemsmtException {
        CIM_PhysicalTape fco = new CIM_PhysicalTape(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_UNLOADANYWHERE.NAME);
        if (property != null) {
            property = setPropertyValue_UnloadAnywhere(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_UNLOADANYWHERE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property UnloadAnywhere
     * <br>
     * Boolean set to TRUE if the Tape can be unloaded at any position on the Media. It is set to FALSE if the tape must be at a certain position for unload - such as at the beginning of tape (BOT) area, or at mid-tape point for TapeDrives with mid-tape load.
     */

    private static CIMProperty setPropertyValue_UnloadAnywhere(CIMProperty currentProperty,
            Boolean newValue) {
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
     * Get the list with CIM_TapePartition objects associated by the association CIM_RealizesTapePartition
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_REALIZESTAPEPARTITION as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_TapePartition_CIM_RealizesTapePartitions(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_TapePartition_CIM_RealizesTapePartitions(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_REALIZESTAPEPARTITION,
                CIM_TapePartition.CIM_CLASS_NAME, null, null, false, false, null);

    }

    /**
     * Get the list with CIM_TapePartition objects associated by the association CIM_RealizesTapePartition
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_REALIZESTAPEPARTITION or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_REALIZESTAPEPARTITION as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_TapePartition_CIM_RealizesTapePartitions(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_TapePartition_CIM_RealizesTapePartitions(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_REALIZESTAPEPARTITION, resultClass, role, resultRole,
                false, false, null);

    }

    /**
     * Get the list with CIM_TapePartition objects associated by the association CIM_RealizesTapePartition
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_REALIZESTAPEPARTITION or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_TapePartition_CIM_RealizesTapePartitions(
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
                CIM_PhysicalTapeHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_PhysicalTapeHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_PhysicalTapeHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_TapePartition(cimInstance));
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
                        result.add(new CIM_TapePartition(cimInstance));
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
                        result.add(new CIM_TapePartition(cimInstance));
                        continue;
                    }
                }
            }
            CIM_PhysicalTapeHelper.checkException(enumeration);
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
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_RealizesTapePartition
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_REALIZESTAPEPARTITION as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_TapePartition_CIM_RealizesTapePartitionNames(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_TapePartition_CIM_RealizesTapePartitionNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_REALIZESTAPEPARTITION,
                CIM_TapePartition.CIM_CLASS_NAME, null, null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_RealizesTapePartition
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_REALIZESTAPEPARTITION or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_REALIZESTAPEPARTITION as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_TapePartition_CIM_RealizesTapePartitionNames(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_TapePartition_CIM_RealizesTapePartitionNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_REALIZESTAPEPARTITION, resultClass, role, resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_RealizesTapePartition
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_TapePartition_CIM_RealizesTapePartitionNames(
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
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_REALIZESTAPEPARTITION,
                    CIM_TapePartition.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_PhysicalTapeHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_PhysicalTapeHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_TapePartition.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_PhysicalTapeHelper.checkException(enumeration);
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
     * Get the list with CIM_RealizesTapePartition associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_RealizesTapePartition(WBEMClient cimClient,
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_REALIZESTAPEPARTITION, role, includeQualifiers,
                    includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_REALIZESTAPEPARTITION, role, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_PhysicalTapeHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_PhysicalTapeHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_RealizesTapePartitionHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_RealizesTapePartition(cimInstance));
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
                        result.add(new CIM_RealizesTapePartition(cimInstance));
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
                        result.add(new CIM_RealizesTapePartition(cimInstance));
                        continue;
                    }
                }
            }
            CIM_PhysicalTapeHelper.checkException(enumeration);
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
     * Get a list of CIMObjectPath items of the associations CIM_RealizesTapePartition
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_RealizesTapePartition(WBEMClient cimClient,
            String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_REALIZESTAPEPARTITION, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_REALIZESTAPEPARTITION, role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_PhysicalTapeHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_PhysicalTapeHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_RealizesTapePartition.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_PhysicalTapeHelper.checkException(enumeration);
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
        return CIM_PhysicalTape.CIM_CLASS_NAME;
    }

}