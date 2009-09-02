/** 
  * CIM_ObjectManager.java
  *
  * 
  * Â© Copyright IBM Corp.  2009,2005
  *
  * THIS FILE IS PROVIDED UNDER THE TERMS OF THE ECLIPSE PUBLIC LICENSE
  * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
  * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
  *
  * You can obtain a current copy of the Eclipse Public License from
  * http://www.opensource.org/licenses/eclipse-1.0.php
  *
  * @author: org.sblim.wbemsmt.dcg.generator.fco.jsr48.FcoGenerator
  * @template: org/sblim/wbemsmt/dcg/templates/fco/jsr48/fco.vm
  *
  * Contributors:
  *    Prashanth Karnam<prkarnam@in.ibm.com> 
  * 
  * Description: A type of CIM_Service that defines the capabilities of the CIM Server in which this ObjectManager class resides. Details related to communicating with the ObjectManager, and the Manager's basic capabilities, are stored in instances of the associated CommunicationMechanism class available through the CommMechanismForManager association. It is assumed that Basic Read operations must be supported by all ObjectManager's in order to retrieve any additional detail.
  * 
  * generated Class
  */

package org.sblim.wbemsmt.schema.cim221;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;
   import org.sblim.wbemsmt.exception.impl.*;
	   import org.sblim.wbemsmt.exception.impl.userobject.*;




import java.lang.reflect.*;
import javax.wbem.*;
public class CIM_ObjectManager extends  CIM_WBEMService {



   public final static String CIM_CLASS_NAME = "CIM_ObjectManager";
   public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    
    /**
     * CommMechanismForManager is an association between an ObjectManager and an ObjectManagerCommunicationMechanism class. The latter describes a possible encoding/protocol/ set of operations for accessing the referenced ObjectManager.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFORMANAGER = "CIM_CommMechanismForManager";
    
    /**
     * NamespaceInManager is an association describing the Namespaces hosted by a CIM ObjectManager.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_NAMESPACEINMANAGER = "CIM_NamespaceInManager";
    
    
    
	    /**
	     * Constants of property Description
     * The description property is used as a description of the CIM Server for human interfaces. For example, " ACME CIM Server version 2.2"). This property is required to support the SLP discovery mechanism. In the next major release this property MAY include the required qualifier.
     */
    public static class PROPERTY_DESCRIPTION
    {
       /**
        * name of the property Description
        */
       public final static String NAME = "Description";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property ElementName
     * The ElmentName property is used as a name of the CIM Server for human interfaces. For example, "ACME CIM Server"). This property is required to support the SLP discovery mechanism. In the next major release this property MAY include the required qualifier.
     */
    public static class PROPERTY_ELEMENTNAME
    {
       /**
        * name of the property ElementName
        */
       public final static String NAME = "ElementName";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property GatherStatisticalData
     * The GatherStatisticalData property is used to control the gathering of statistical data made accessible through the CIM_CIMOMStatisticalData objects. If set to true, the data is gathered and can be accessed. If false, the CIM_CIMOMStatisticalData instance MAY exist but MUST show zero values for the counter properties.
     */
    public static class PROPERTY_GATHERSTATISTICALDATA
    {
       /**
        * name of the property GatherStatisticalData
        */
       public final static String NAME = "GatherStatisticalData";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property Name
     * The Name property is used to uniquely identify a CIM Server. The CIM Server MUST ensure that this value is globally unique. In order to ensure uniqueness, this value SHOULD be constructed in the following manner. <Vendor ID>:<Unique ID> 
     * <Vendor ID> MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity or a registered ID that is assigned to the business entity that is defining the Name. (This is similar to the <Schema Name>_<Class Name> structure of Schema class names.) The purpose of <Vendor ID> is to ensure that <ID> is truly unique across multiple vendor implementations. If such a name is not used, the defining entity MUST assure that the <ID> portion of the Instance ID is unique when compared with other instance providers. For DMTF defined instances, the <Vendor ID> is 'CIM'. 
     * <Unique ID> MUST include a vendor specified unique identifier. 
     * Note: Name is semantically the same as InstanceID. In the next major version of the CIM Schema, Name will be renamed to InstanceID and become the only key of this class.
     */
    public static class PROPERTY_NAME
    {
       /**
        * name of the property Name
        */
       public final static String NAME = "Name";                  

	    	
    

    		    
	
	    
	    }
	    	    

   

    
    static {    
           addPackage("org.sblim.wbemsmt.schema.cim221");
                         String[] parentClassPackageList = CIM_WBEMService.getPackages();
        
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
    *   A type of CIM_Service that defines the capabilities of the CIM Server in which this ObjectManager class resides. Details related to communicating with the ObjectManager, and the Manager's basic capabilities, are stored in instances of the associated CommunicationMechanism class available through the CommMechanismForManager association. It is assumed that Basic Read operations must be supported by all ObjectManager's in order to retrieve any additional detail.
    *   @param client the CIM Client
    *   @param namespace the target namespace
    */  

      
   public CIM_ObjectManager(WBEMClient client, String namespace) throws WbemsmtException
   {
       CIMClass cls = getClass(client,namespace);
       setFromServer(false);
       init(cls.newInstance(),true);
   }
        
   /**
    *   Class constructor
    * 
    *       *   <br>
    *   A type of CIM_Service that defines the capabilities of the CIM Server in which this ObjectManager class resides. Details related to communicating with the ObjectManager, and the Manager's basic capabilities, are stored in instances of the associated CommunicationMechanism class available through the CommMechanismForManager association. It is assumed that Basic Read operations must be supported by all ObjectManager's in order to retrieve any additional detail.
    *   @param cimInstance the instance that is used to create the Object
    */  
   
   public CIM_ObjectManager(CIMInstance cimInstance)  throws WbemsmtException { 
        
       if (cimInstance == null) {
           throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER, "The cimInstance parameter does not contain a valid reference.");
       }
       setFromServer(true);
       init(cimInstance,false);
   }
   
   /**
    * Default constructor
    */
   protected CIM_ObjectManager()
   {	
   }
   
   /**
    * initializes the FCO
    *
    *   @param cimInstance the instance that is used to create the Object
    *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
    */
   protected void init(CIMInstance cimInstance,boolean overwrite) throws WbemsmtException
   {
              propertiesToCheck.put("Description",new CIMProperty("Description",CIMDataType.STRING_T,null));
              propertiesToCheck.put("ElementName",new CIMProperty("ElementName",CIMDataType.STRING_T,null));
              propertiesToCheck.put("GatherStatisticalData",new CIMProperty("GatherStatisticalData",CIMDataType.BOOLEAN_T,null));
              propertiesToCheck.put("Name",new CIMProperty("Name",CIMDataType.STRING_T,null));
       	
	       super.init(cimInstance,overwrite);
	       
	       
	       //currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient
	       //we overwrite the dataType by setting null for every embeddedObject/Instance property
	       if (overwrite)
	       {
			                                                                                          
       }
   }

//**********************************************************************
// Properties get/set     
//**********************************************************************


   
   
   /**
    * Get the property Description
    *     * <br>
    * The description property is used as a description of the CIM Server for human interfaces. For example, " ACME CIM Server version 2.2"). This property is required to support the SLP discovery mechanism. In the next major release this property MAY include the required qualifier.
    *     */

      

               
   public String get_Description()    {
       CIMProperty currentProperty = getProperty(PROPERTY_DESCRIPTION.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_DESCRIPTION.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property Description
    * <br>
    * The description property is used as a description of the CIM Server for human interfaces. For example, " ACME CIM Server version 2.2"). This property is required to support the SLP discovery mechanism. In the next major release this property MAY include the required qualifier.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_Description(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_DESCRIPTION.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_Description(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_DESCRIPTION.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property Description by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Description(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        CIM_ObjectManager fco = new CIM_ObjectManager(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_DESCRIPTION.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_Description(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_DESCRIPTION.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property Description
    * <br>
    * The description property is used as a description of the CIM Server for human interfaces. For example, " ACME CIM Server version 2.2"). This property is required to support the SLP discovery mechanism. In the next major release this property MAY include the required qualifier.
    */
    
   private static CIMProperty setPropertyValue_Description(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property ElementName
    *     * <br>
    * The ElmentName property is used as a name of the CIM Server for human interfaces. For example, "ACME CIM Server"). This property is required to support the SLP discovery mechanism. In the next major release this property MAY include the required qualifier.
    *     */

      

               
   public String get_ElementName()    {
       CIMProperty currentProperty = getProperty(PROPERTY_ELEMENTNAME.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_ELEMENTNAME.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property ElementName
    * <br>
    * The ElmentName property is used as a name of the CIM Server for human interfaces. For example, "ACME CIM Server"). This property is required to support the SLP discovery mechanism. In the next major release this property MAY include the required qualifier.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_ElementName(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_ELEMENTNAME.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_ElementName(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_ELEMENTNAME.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property ElementName by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ElementName(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        CIM_ObjectManager fco = new CIM_ObjectManager(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ELEMENTNAME.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_ElementName(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_ELEMENTNAME.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property ElementName
    * <br>
    * The ElmentName property is used as a name of the CIM Server for human interfaces. For example, "ACME CIM Server"). This property is required to support the SLP discovery mechanism. In the next major release this property MAY include the required qualifier.
    */
    
   private static CIMProperty setPropertyValue_ElementName(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property GatherStatisticalData
    *     * <br>
    * The GatherStatisticalData property is used to control the gathering of statistical data made accessible through the CIM_CIMOMStatisticalData objects. If set to true, the data is gathered and can be accessed. If false, the CIM_CIMOMStatisticalData instance MAY exist but MUST show zero values for the counter properties.
    *     */

      

               
   public Boolean get_GatherStatisticalData()    {
       CIMProperty currentProperty = getProperty(PROPERTY_GATHERSTATISTICALDATA.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_GATHERSTATISTICALDATA.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (Boolean)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property GatherStatisticalData
    * <br>
    * The GatherStatisticalData property is used to control the gathering of statistical data made accessible through the CIM_CIMOMStatisticalData objects. If set to true, the data is gathered and can be accessed. If false, the CIM_CIMOMStatisticalData instance MAY exist but MUST show zero values for the counter properties.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_GatherStatisticalData(Boolean newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_GATHERSTATISTICALDATA.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_GatherStatisticalData(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_GATHERSTATISTICALDATA.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property GatherStatisticalData by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_GatherStatisticalData(WBEMClient client, String namespace, Boolean newValue) throws WbemsmtException {
        CIM_ObjectManager fco = new CIM_ObjectManager(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_GATHERSTATISTICALDATA.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_GatherStatisticalData(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_GATHERSTATISTICALDATA.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property GatherStatisticalData
    * <br>
    * The GatherStatisticalData property is used to control the gathering of statistical data made accessible through the CIM_CIMOMStatisticalData objects. If set to true, the data is gathered and can be accessed. If false, the CIM_CIMOMStatisticalData instance MAY exist but MUST show zero values for the counter properties.
    */
    
   private static CIMProperty setPropertyValue_GatherStatisticalData(CIMProperty currentProperty, Boolean newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property Name
    *     * <br>
    * The Name property is used to uniquely identify a CIM Server. The CIM Server MUST ensure that this value is globally unique. In order to ensure uniqueness, this value SHOULD be constructed in the following manner. <Vendor ID>:<Unique ID> 
     * <Vendor ID> MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity or a registered ID that is assigned to the business entity that is defining the Name. (This is similar to the <Schema Name>_<Class Name> structure of Schema class names.) The purpose of <Vendor ID> is to ensure that <ID> is truly unique across multiple vendor implementations. If such a name is not used, the defining entity MUST assure that the <ID> portion of the Instance ID is unique when compared with other instance providers. For DMTF defined instances, the <Vendor ID> is 'CIM'. 
     * <Unique ID> MUST include a vendor specified unique identifier. 
     * Note: Name is semantically the same as InstanceID. In the next major version of the CIM Schema, Name will be renamed to InstanceID and become the only key of this class.
    *     */

      

               
   public String get_Name()    {
       CIMProperty currentProperty = getProperty(PROPERTY_NAME.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_NAME.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property Name
    * <br>
    * The Name property is used to uniquely identify a CIM Server. The CIM Server MUST ensure that this value is globally unique. In order to ensure uniqueness, this value SHOULD be constructed in the following manner. <Vendor ID>:<Unique ID> 
     * <Vendor ID> MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity or a registered ID that is assigned to the business entity that is defining the Name. (This is similar to the <Schema Name>_<Class Name> structure of Schema class names.) The purpose of <Vendor ID> is to ensure that <ID> is truly unique across multiple vendor implementations. If such a name is not used, the defining entity MUST assure that the <ID> portion of the Instance ID is unique when compared with other instance providers. For DMTF defined instances, the <Vendor ID> is 'CIM'. 
     * <Unique ID> MUST include a vendor specified unique identifier. 
     * Note: Name is semantically the same as InstanceID. In the next major version of the CIM Schema, Name will be renamed to InstanceID and become the only key of this class.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_Name(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_NAME.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_Name(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_NAME.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property Name by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Name(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        CIM_ObjectManager fco = new CIM_ObjectManager(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_NAME.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_Name(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_NAME.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property Name
    * <br>
    * The Name property is used to uniquely identify a CIM Server. The CIM Server MUST ensure that this value is globally unique. In order to ensure uniqueness, this value SHOULD be constructed in the following manner. <Vendor ID>:<Unique ID> 
     * <Vendor ID> MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity or a registered ID that is assigned to the business entity that is defining the Name. (This is similar to the <Schema Name>_<Class Name> structure of Schema class names.) The purpose of <Vendor ID> is to ensure that <ID> is truly unique across multiple vendor implementations. If such a name is not used, the defining entity MUST assure that the <ID> portion of the Instance ID is unique when compared with other instance providers. For DMTF defined instances, the <Vendor ID> is 'CIM'. 
     * <Unique ID> MUST include a vendor specified unique identifier. 
     * Note: Name is semantically the same as InstanceID. In the next major version of the CIM Schema, Name will be renamed to InstanceID and become the only key of this class.
    */
    
   private static CIMProperty setPropertyValue_Name(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
    
//**********************************************************************
// Associators methods     
//**********************************************************************



    
                    
                                        
                            
                                        
        
    /**
     * Get the list with CIM_ObjectManagerCommunicationMechanism objects associated by the association CIM_CommMechanismForManager
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFORMANAGER as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<CIM_ObjectManagerCommunicationMechanism> getAssociated_CIM_ObjectManagerCommunicationMechanism_CIM_CommMechanismForManagers(WBEMClient cimClient) throws WbemsmtException {
     
     	   return getAssociated_CIM_ObjectManagerCommunicationMechanism_CIM_CommMechanismForManagers(
     	                cimClient,
     	                CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFORMANAGER,
     	                CIM_ObjectManagerCommunicationMechanism.CIM_CLASS_NAME,
     	                null,
     	                null,
     	                false,
     	                false,
     	                null);
     		
     }

    /**
     * Get the list with CIM_ObjectManagerCommunicationMechanism objects associated by the association CIM_CommMechanismForManager
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFORMANAGER or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFORMANAGER as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<CIM_ObjectManagerCommunicationMechanism> getAssociated_CIM_ObjectManagerCommunicationMechanism_CIM_CommMechanismForManagers(WBEMClient cimClient,String resultClass, String role, String resultRole) throws WbemsmtException {
     
     	   return getAssociated_CIM_ObjectManagerCommunicationMechanism_CIM_CommMechanismForManagers(
     	                cimClient,
     	                CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFORMANAGER,
     	                resultClass,
     	                role,
     	                resultRole,
     	                false,
     	                false,
     	                null);
     		
     }

    /**
     * Get the list with CIM_ObjectManagerCommunicationMechanism objects associated by the association CIM_CommMechanismForManager
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFORMANAGER or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<CIM_ObjectManagerCommunicationMechanism> getAssociated_CIM_ObjectManagerCommunicationMechanism_CIM_CommMechanismForManagers(WBEMClient cimClient, String associationClass, String resultClass, String role, String resultRole, boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList) throws WbemsmtException {

         if (cimClient == null) {
             throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
         }

         java.util.List<CIM_ObjectManagerCommunicationMechanism> result = new java.util.ArrayList<CIM_ObjectManagerCommunicationMechanism>();
         CloseableIterator enumeration = null;

         try {
             enumeration = cimClient.associators(
                 this.getCimObjectPath(),
                 associationClass, 
                 resultClass,
                 role,resultRole, 
                 includeQualifiers,
                 includeClassOrigin,
                 propertyList);
         } catch (WBEMException e) {
         	  throw new AssociatorException(e, new AssociatorUserObject(
                 this.getCimObjectPath(),
                 associationClass, 
                 resultClass,
                 role,resultRole, 
                 includeQualifiers,
                 includeClassOrigin,
                 propertyList));	
         }
         
         try {
	             while (enumeration.hasNext()) {
                 CIM_ObjectManagerHelper.checkException(enumeration);
           
                 Object obj = enumeration.next();
                 CIM_ObjectManagerHelper.checkException(enumeration);

                 if (obj instanceof CIMInstance) {
                     CIMInstance cimInstance = (CIMInstance)obj;
                     Class<?> clazz = CIM_ObjectManagerHelper.findClass(cimClient, cimInstance);
                    
                     if (clazz == null) {
                         System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
                         result.add(new CIM_ObjectManagerCommunicationMechanism(cimInstance));
                         continue;
                     }

                     Class<?>[] constParams = new Class[1];
                     constParams[0] = CIMInstance.class;
                     Constructor<?> cons = null;
                     try {
                         cons = clazz.getConstructor(constParams);
                     } catch(NoSuchMethodException e) {
                         System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of the base class.");
                         result.add(new CIM_ObjectManagerCommunicationMechanism(cimInstance));
                         continue;
                     }

                     try {
                         Object[] actargs = new Object[] {cimInstance};
                         Object dataObj = cons.newInstance(actargs);
                         result.add((CIM_ObjectManagerCommunicationMechanism)dataObj);
                     } catch (Exception e) {
                         System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
                         result.add(new CIM_ObjectManagerCommunicationMechanism(cimInstance));
                         continue;
                     }
                 }
             }
             CIM_ObjectManagerHelper.checkException(enumeration);
         } finally {
         try {
             if (enumeration != null) {
                 enumeration.close();
             }
         } catch(Exception e) {
             throw new WbemsmtException(WbemsmtException.ERR_FAILED, "The socket of the result could not be closed properly.");
         }
     }

     return result;
   }
    
   /**
    * Get the list of CIMObjectPath items of the objects associated by the association CIM_CommMechanismForManager
    * @param cimClient the WBEMClient for the communication
    *
    * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFORMANAGER as associationClass<br>
    * uses false for includeQualifiers and includeClassOrigin <br>
    * uses null for resultClass, role, resultRole<br>
    * <br>
    
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_CIM_ObjectManagerCommunicationMechanism_CIM_CommMechanismForManagerNames(WBEMClient cimClient) throws WbemsmtException {
    
    	    return getAssociated_CIM_ObjectManagerCommunicationMechanism_CIM_CommMechanismForManagerNames (
    	                             cimClient,
    	                             true,
    	                             CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFORMANAGER,
    	                             CIM_ObjectManagerCommunicationMechanism.CIM_CLASS_NAME,
    	                             null,
    	                             null);
    }

   /**
    * Get the list of CIMObjectPath items of the objects associated by the association CIM_CommMechanismForManager
    * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFORMANAGER or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
    *
    * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFORMANAGER as associationClass<br>
    * uses false for includeQualifiers and includeClassOrigin <br>
    * uses null for resultClass, role, resultRole<br>
    * <br>
    
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_CIM_ObjectManagerCommunicationMechanism_CIM_CommMechanismForManagerNames(WBEMClient cimClient,String resultClass, String role, String resultRole) throws WbemsmtException {
    
    	    return getAssociated_CIM_ObjectManagerCommunicationMechanism_CIM_CommMechanismForManagerNames (
    	                             cimClient,
    	                             true,
    	                             CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFORMANAGER,
    	                             resultClass,
    	                             role,
    	                             resultRole);
    }

   /**
    * Get the list of CIMObjectPath items of the objects associated by the association CIM_CommMechanismForManager
    * @param cimClient the WBEMClient for the communication
    * @param deep if true the subclasses returned also
    *
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_CIM_ObjectManagerCommunicationMechanism_CIM_CommMechanismForManagerNames(WBEMClient cimClient,boolean deep,String associationClass, String resultClass, String role, String resultRole) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
        }

        java.util.List<CIMObjectPath> result = new java.util.ArrayList<CIMObjectPath>();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.associatorNames(
                this.getCimObjectPath(),
                associationClass, 
                resultClass,
                role,resultRole);
		        
         } catch (WBEMException e) {
         	  throw new AssociatorNamesException(e, new AssociatorNamesUserObject(this.getCimObjectPath(),
                CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFORMANAGER, 
                CIM_ObjectManagerCommunicationMechanism.CIM_CLASS_NAME,
                null,null));	
         }
         
         try {
	            while (enumeration.hasNext()) {
                CIM_ObjectManagerHelper.checkException(enumeration);
                                
                Object obj = enumeration.next();
                CIM_ObjectManagerHelper.checkException(enumeration); 
                if (obj instanceof CIMObjectPath) {
                    if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_ObjectManagerCommunicationMechanism.CIM_CLASS_NAME)) {
                        result.add((CIMObjectPath)obj);
                    }
                }
            }
            CIM_ObjectManagerHelper.checkException(enumeration);
        } finally {
        try {
            if (enumeration != null) {
                    enumeration.close();
            }
        } catch(Exception e) {
               throw new WbemsmtException(WbemsmtException.ERR_FAILED, "The socket of the result could not be closed properly.");
        }
      }
      return result;
   }
    
   /**
    * Get the list with CIM_CommMechanismForManager associations
    *
    * @param cimClient the WBEMClient for the communication
    * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
    * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
    * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
    * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
    *
    * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
    **/
                        
                        
   public java.util.List<CIM_CommMechanismForManager> getAssociations_CIM_CommMechanismForManager(WBEMClient cimClient, boolean includeQualifiers, boolean includeClassOrigin, String role,java.lang.String[] propertyList) throws WbemsmtException {

       if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
       }

       java.util.List<CIM_CommMechanismForManager> result = new java.util.ArrayList<CIM_CommMechanismForManager>();
       CloseableIterator enumeration = null;

       try {
          enumeration = cimClient.references(
             this.getCimObjectPath(),
             CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFORMANAGER, 
             role,
             includeQualifiers,
             includeClassOrigin,
             propertyList);
        } catch (WBEMException e) {
         	  throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
             CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFORMANAGER, 
             role,
             includeQualifiers,
             includeClassOrigin,
             propertyList));	
        }
         
        try {
          while (enumeration.hasNext()) {
             CIM_ObjectManagerHelper.checkException(enumeration);
             Object obj = enumeration.next();
             CIM_ObjectManagerHelper.checkException(enumeration);

             if (obj instanceof CIMInstance) {
                CIMInstance cimInstance = (CIMInstance)obj;
                Class<?> clazz = CIM_CommMechanismForManagerHelper.findClass(cimClient, cimInstance);
                    
                if (clazz == null) {
                   System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
                   result.add(new CIM_CommMechanismForManager(cimInstance));
                   continue;
                }

                Class<?>[] constParams = new Class[1];
                constParams[0] = CIMInstance.class;
                Constructor<?> cons = null;
                try {
                   cons = clazz.getConstructor(constParams);
                } catch(NoSuchMethodException e) {
                   System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of the base class.");
                   result.add(new CIM_CommMechanismForManager(cimInstance));
                   continue;
                }

                try {
                   Object[] actargs = new Object[] {cimInstance};
                   Object dataObj = cons.newInstance(actargs);
                   result.add((CIM_CommMechanismForManager)dataObj);
                } catch (Exception e) {
                   System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
                   result.add(new CIM_CommMechanismForManager(cimInstance));
                   continue;
                }
              }
           }
           CIM_ObjectManagerHelper.checkException(enumeration);
        } finally {
           try {
              if (enumeration != null) {
                 enumeration.close();
              }
           } catch(Exception e) {
              throw new WbemsmtException(WbemsmtException.ERR_FAILED, "The socket of the result could not be closed properly.");
           }
       }

       return result;
   }
    
   /**
    * Get a list of CIMObjectPath items of the associations CIM_CommMechanismForManager
    *
    * @param cimClient the WBEMClient for the communication
    * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
    * @param deep if true the subclasses returned also
    *
    * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociationNames_CIM_CommMechanismForManager(WBEMClient cimClient,String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
        }

        java.util.List<CIMObjectPath> result = new java.util.ArrayList<CIMObjectPath>();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(
                this.getCimObjectPath(),
                CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFORMANAGER, 
                role);
        } catch (WBEMException e) {
         	  throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this.getCimObjectPath(),
                CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFORMANAGER, 
                role));	
        }
         
        try {
                while (enumeration.hasNext()) {
                   CIM_ObjectManagerHelper.checkException(enumeration);
                   Object obj = enumeration.next();
                   CIM_ObjectManagerHelper.checkException(enumeration); 
                   
                   if (obj instanceof CIMObjectPath) {
                      if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_CommMechanismForManager.CIM_CLASS_NAME)) {
                         result.add((CIMObjectPath)obj);
                      }
                   }
                }
                CIM_ObjectManagerHelper.checkException(enumeration);
        } finally {
        try {
            if (enumeration != null) {
                    enumeration.close();
            }
        } catch(Exception e) {
               throw new WbemsmtException(WbemsmtException.ERR_FAILED, "The socket of the result could not be closed properly.");
        }
     }
     return result;
   }
    
           
    
                    
                                        
                            
                                        
        
    /**
     * Get the list with CIM_Namespace objects associated by the association CIM_NamespaceInManager
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_NAMESPACEINMANAGER as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<CIM_Namespace> getAssociated_CIM_Namespace_CIM_NamespaceInManagers(WBEMClient cimClient) throws WbemsmtException {
     
     	   return getAssociated_CIM_Namespace_CIM_NamespaceInManagers(
     	                cimClient,
     	                CIM_ASSOCIATOR_CLASS_NAME_CIM_NAMESPACEINMANAGER,
     	                CIM_Namespace.CIM_CLASS_NAME,
     	                null,
     	                null,
     	                false,
     	                false,
     	                null);
     		
     }

    /**
     * Get the list with CIM_Namespace objects associated by the association CIM_NamespaceInManager
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_NAMESPACEINMANAGER or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_NAMESPACEINMANAGER as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<CIM_Namespace> getAssociated_CIM_Namespace_CIM_NamespaceInManagers(WBEMClient cimClient,String resultClass, String role, String resultRole) throws WbemsmtException {
     
     	   return getAssociated_CIM_Namespace_CIM_NamespaceInManagers(
     	                cimClient,
     	                CIM_ASSOCIATOR_CLASS_NAME_CIM_NAMESPACEINMANAGER,
     	                resultClass,
     	                role,
     	                resultRole,
     	                false,
     	                false,
     	                null);
     		
     }

    /**
     * Get the list with CIM_Namespace objects associated by the association CIM_NamespaceInManager
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_NAMESPACEINMANAGER or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<CIM_Namespace> getAssociated_CIM_Namespace_CIM_NamespaceInManagers(WBEMClient cimClient, String associationClass, String resultClass, String role, String resultRole, boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList) throws WbemsmtException {

         if (cimClient == null) {
             throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
         }

         java.util.List<CIM_Namespace> result = new java.util.ArrayList<CIM_Namespace>();
         CloseableIterator enumeration = null;

         try {
             enumeration = cimClient.associators(
                 this.getCimObjectPath(),
                 associationClass, 
                 resultClass,
                 role,resultRole, 
                 includeQualifiers,
                 includeClassOrigin,
                 propertyList);
         } catch (WBEMException e) {
         	  throw new AssociatorException(e, new AssociatorUserObject(
                 this.getCimObjectPath(),
                 associationClass, 
                 resultClass,
                 role,resultRole, 
                 includeQualifiers,
                 includeClassOrigin,
                 propertyList));	
         }
         
         try {
	             while (enumeration.hasNext()) {
                 CIM_ObjectManagerHelper.checkException(enumeration);
           
                 Object obj = enumeration.next();
                 CIM_ObjectManagerHelper.checkException(enumeration);

                 if (obj instanceof CIMInstance) {
                     CIMInstance cimInstance = (CIMInstance)obj;
                     Class<?> clazz = CIM_ObjectManagerHelper.findClass(cimClient, cimInstance);
                    
                     if (clazz == null) {
                         System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
                         result.add(new CIM_Namespace(cimInstance));
                         continue;
                     }

                     Class<?>[] constParams = new Class[1];
                     constParams[0] = CIMInstance.class;
                     Constructor<?> cons = null;
                     try {
                         cons = clazz.getConstructor(constParams);
                     } catch(NoSuchMethodException e) {
                         System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of the base class.");
                         result.add(new CIM_Namespace(cimInstance));
                         continue;
                     }

                     try {
                         Object[] actargs = new Object[] {cimInstance};
                         Object dataObj = cons.newInstance(actargs);
                         result.add((CIM_Namespace)dataObj);
                     } catch (Exception e) {
                         System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
                         result.add(new CIM_Namespace(cimInstance));
                         continue;
                     }
                 }
             }
             CIM_ObjectManagerHelper.checkException(enumeration);
         } finally {
         try {
             if (enumeration != null) {
                 enumeration.close();
             }
         } catch(Exception e) {
             throw new WbemsmtException(WbemsmtException.ERR_FAILED, "The socket of the result could not be closed properly.");
         }
     }

     return result;
   }
    
   /**
    * Get the list of CIMObjectPath items of the objects associated by the association CIM_NamespaceInManager
    * @param cimClient the WBEMClient for the communication
    *
    * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_NAMESPACEINMANAGER as associationClass<br>
    * uses false for includeQualifiers and includeClassOrigin <br>
    * uses null for resultClass, role, resultRole<br>
    * <br>
    
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_CIM_Namespace_CIM_NamespaceInManagerNames(WBEMClient cimClient) throws WbemsmtException {
    
    	    return getAssociated_CIM_Namespace_CIM_NamespaceInManagerNames (
    	                             cimClient,
    	                             true,
    	                             CIM_ASSOCIATOR_CLASS_NAME_CIM_NAMESPACEINMANAGER,
    	                             CIM_Namespace.CIM_CLASS_NAME,
    	                             null,
    	                             null);
    }

   /**
    * Get the list of CIMObjectPath items of the objects associated by the association CIM_NamespaceInManager
    * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_NAMESPACEINMANAGER or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
    *
    * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_NAMESPACEINMANAGER as associationClass<br>
    * uses false for includeQualifiers and includeClassOrigin <br>
    * uses null for resultClass, role, resultRole<br>
    * <br>
    
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_CIM_Namespace_CIM_NamespaceInManagerNames(WBEMClient cimClient,String resultClass, String role, String resultRole) throws WbemsmtException {
    
    	    return getAssociated_CIM_Namespace_CIM_NamespaceInManagerNames (
    	                             cimClient,
    	                             true,
    	                             CIM_ASSOCIATOR_CLASS_NAME_CIM_NAMESPACEINMANAGER,
    	                             resultClass,
    	                             role,
    	                             resultRole);
    }

   /**
    * Get the list of CIMObjectPath items of the objects associated by the association CIM_NamespaceInManager
    * @param cimClient the WBEMClient for the communication
    * @param deep if true the subclasses returned also
    *
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_CIM_Namespace_CIM_NamespaceInManagerNames(WBEMClient cimClient,boolean deep,String associationClass, String resultClass, String role, String resultRole) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
        }

        java.util.List<CIMObjectPath> result = new java.util.ArrayList<CIMObjectPath>();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.associatorNames(
                this.getCimObjectPath(),
                associationClass, 
                resultClass,
                role,resultRole);
		        
         } catch (WBEMException e) {
         	  throw new AssociatorNamesException(e, new AssociatorNamesUserObject(this.getCimObjectPath(),
                CIM_ASSOCIATOR_CLASS_NAME_CIM_NAMESPACEINMANAGER, 
                CIM_Namespace.CIM_CLASS_NAME,
                null,null));	
         }
         
         try {
	            while (enumeration.hasNext()) {
                CIM_ObjectManagerHelper.checkException(enumeration);
                                
                Object obj = enumeration.next();
                CIM_ObjectManagerHelper.checkException(enumeration); 
                if (obj instanceof CIMObjectPath) {
                    if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_Namespace.CIM_CLASS_NAME)) {
                        result.add((CIMObjectPath)obj);
                    }
                }
            }
            CIM_ObjectManagerHelper.checkException(enumeration);
        } finally {
        try {
            if (enumeration != null) {
                    enumeration.close();
            }
        } catch(Exception e) {
               throw new WbemsmtException(WbemsmtException.ERR_FAILED, "The socket of the result could not be closed properly.");
        }
      }
      return result;
   }
    
   /**
    * Get the list with CIM_NamespaceInManager associations
    *
    * @param cimClient the WBEMClient for the communication
    * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
    * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
    * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
    * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
    *
    * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
    **/
                        
                        
   public java.util.List<CIM_NamespaceInManager> getAssociations_CIM_NamespaceInManager(WBEMClient cimClient, boolean includeQualifiers, boolean includeClassOrigin, String role,java.lang.String[] propertyList) throws WbemsmtException {

       if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
       }

       java.util.List<CIM_NamespaceInManager> result = new java.util.ArrayList<CIM_NamespaceInManager>();
       CloseableIterator enumeration = null;

       try {
          enumeration = cimClient.references(
             this.getCimObjectPath(),
             CIM_ASSOCIATOR_CLASS_NAME_CIM_NAMESPACEINMANAGER, 
             role,
             includeQualifiers,
             includeClassOrigin,
             propertyList);
        } catch (WBEMException e) {
         	  throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
             CIM_ASSOCIATOR_CLASS_NAME_CIM_NAMESPACEINMANAGER, 
             role,
             includeQualifiers,
             includeClassOrigin,
             propertyList));	
        }
         
        try {
          while (enumeration.hasNext()) {
             CIM_ObjectManagerHelper.checkException(enumeration);
             Object obj = enumeration.next();
             CIM_ObjectManagerHelper.checkException(enumeration);

             if (obj instanceof CIMInstance) {
                CIMInstance cimInstance = (CIMInstance)obj;
                Class<?> clazz = CIM_NamespaceInManagerHelper.findClass(cimClient, cimInstance);
                    
                if (clazz == null) {
                   System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
                   result.add(new CIM_NamespaceInManager(cimInstance));
                   continue;
                }

                Class<?>[] constParams = new Class[1];
                constParams[0] = CIMInstance.class;
                Constructor<?> cons = null;
                try {
                   cons = clazz.getConstructor(constParams);
                } catch(NoSuchMethodException e) {
                   System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of the base class.");
                   result.add(new CIM_NamespaceInManager(cimInstance));
                   continue;
                }

                try {
                   Object[] actargs = new Object[] {cimInstance};
                   Object dataObj = cons.newInstance(actargs);
                   result.add((CIM_NamespaceInManager)dataObj);
                } catch (Exception e) {
                   System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
                   result.add(new CIM_NamespaceInManager(cimInstance));
                   continue;
                }
              }
           }
           CIM_ObjectManagerHelper.checkException(enumeration);
        } finally {
           try {
              if (enumeration != null) {
                 enumeration.close();
              }
           } catch(Exception e) {
              throw new WbemsmtException(WbemsmtException.ERR_FAILED, "The socket of the result could not be closed properly.");
           }
       }

       return result;
   }
    
   /**
    * Get a list of CIMObjectPath items of the associations CIM_NamespaceInManager
    *
    * @param cimClient the WBEMClient for the communication
    * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
    * @param deep if true the subclasses returned also
    *
    * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociationNames_CIM_NamespaceInManager(WBEMClient cimClient,String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
        }

        java.util.List<CIMObjectPath> result = new java.util.ArrayList<CIMObjectPath>();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(
                this.getCimObjectPath(),
                CIM_ASSOCIATOR_CLASS_NAME_CIM_NAMESPACEINMANAGER, 
                role);
        } catch (WBEMException e) {
         	  throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this.getCimObjectPath(),
                CIM_ASSOCIATOR_CLASS_NAME_CIM_NAMESPACEINMANAGER, 
                role));	
        }
         
        try {
                while (enumeration.hasNext()) {
                   CIM_ObjectManagerHelper.checkException(enumeration);
                   Object obj = enumeration.next();
                   CIM_ObjectManagerHelper.checkException(enumeration); 
                   
                   if (obj instanceof CIMObjectPath) {
                      if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_NamespaceInManager.CIM_CLASS_NAME)) {
                         result.add((CIMObjectPath)obj);
                      }
                   }
                }
                CIM_ObjectManagerHelper.checkException(enumeration);
        } finally {
        try {
            if (enumeration != null) {
                    enumeration.close();
            }
        } catch(Exception e) {
               throw new WbemsmtException(WbemsmtException.ERR_FAILED, "The socket of the result could not be closed properly.");
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
    public String getObjectName()
    {
    	    return CIM_ObjectManager.CIM_CLASS_NAME;
    }



}