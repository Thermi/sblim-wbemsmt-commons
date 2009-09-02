/** 
  * CIM_SoftwareIdentity.java
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
  * Description: SoftwareIdentity provides descriptive information about a software component for asset tracking and/or installation dependency management. When the IsEntity property has the value TRUE, the instance of SoftwareIdentity represents an individually identifiable entity similar to Physical Element. SoftwareIdentity does NOT indicate whether the software is installed, executing, etc. This extra information may be provided through specialized associations to Software Identity. For instance, both InstalledSoftwareIdentity and ElementSoftwareIdentity may be used to indicate that the software identified by this class is installed. SoftwareIdentity is used when managing the software components of a ManagedElement that is the management focus. Since software may be acquired, SoftwareIdentity can be associated with a Product using the ProductSoftwareComponent relationship. The Application Model manages the deployment and installation of software via the classes, SoftwareFeatures and SoftwareElements. SoftwareFeature and SoftwareElement are used when the software component is the management focus. The deployment/installation concepts are related to the asset/identity one. In fact, a SoftwareIdentity may correspond to a Product, or to one or more SoftwareFeatures or SoftwareElements - depending on the granularity of these classes and the deployment model. The correspondence of Software Identity to Product, SoftwareFeature or SoftwareElement is indicated using the ConcreteIdentity association. Note that there may not be sufficient detail or instrumentation to instantiate ConcreteIdentity. And, if the association is instantiated, some duplication of information may result. For example, the Vendor described in the instances of Product and SoftwareIdentity MAY be the same. However, this is not necessarily true, and it is why vendor and similar information are duplicated in this class. 
  * Note that ConcreteIdentity can also be used to describe the relationship of the software to any LogicalFiles that result from installing it. As above, there may not be sufficient detail or instrumentation to instantiate this association.
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
public class CIM_SoftwareIdentity extends  CIM_LogicalElement {



   public final static String CIM_CLASS_NAME = "CIM_SoftwareIdentity";
   public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    
    /**
     * ElementSoftwareIdentity allows a Managed Element to report its software related asset information (firmware, drivers, configuration software, and etc.)
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTSOFTWAREIDENTITY = "CIM_ElementSoftwareIdentity";
    
    
    
	    /**
	     * Constants of property BuildNumber
     * The build number of the software.
     */
    public static class PROPERTY_BUILDNUMBER
    {
       /**
        * name of the property BuildNumber
        */
       public final static String NAME = "BuildNumber";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property ClassificationDescriptions
     * An array of free-form strings providing more detailed explanations for any of the entries in the Classifications array. Note that each entry is related to one in the Classifications array located at the same index.
     */
    public static class PROPERTY_CLASSIFICATIONDESCRIPTIONS
    {
       /**
        * name of the property ClassificationDescriptions
        */
       public final static String NAME = "ClassificationDescriptions";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property Classifications
     * An array of enumerated integers that classify this software. For example, the software MAY be instrumentation (value=5) or firmware and diagnostic software (10 and 7). The use of value 6, Firmware/BIOS, is being deprecated. Instead, either the value 10 (Firmware) and/or 11 (BIOS/FCode) SHOULD be used. The value 13, Software Bundle, identifies a software package consisting of multiple discrete software instances that can be installed individually or together.
     * Each contained software instance is represented by an instance of SoftwareIdentity that is associated to this instance of SoftwareIdentityinstance via a Component association.
     */
    public static class PROPERTY_CLASSIFICATIONS
    {
       /**
        * name of the property Classifications
        */
       public final static String NAME = "Classifications";                  

	    	
    

              
       		
          /**
           * constant for value map entry 0
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown 
                              = new javax.cim.UnsignedInteger16("0");
	          	
                       /**
              * constant for value entry Unknown (corresponds to mapEntry 0 )
              */
             public final static String VALUE_ENTRY_Unknown 
                              = "Unknown";
                    
       		
          /**
           * constant for value map entry 1
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other 
                              = new javax.cim.UnsignedInteger16("1");
	          	
                       /**
              * constant for value entry Other (corresponds to mapEntry 1 )
              */
             public final static String VALUE_ENTRY_Other 
                              = "Other";
                    
       		
          /**
           * constant for value map entry 2
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Driver 
                              = new javax.cim.UnsignedInteger16("2");
	          	
                       /**
              * constant for value entry Driver (corresponds to mapEntry 2 )
              */
             public final static String VALUE_ENTRY_Driver 
                              = "Driver";
                    
       		
          /**
           * constant for value map entry 3
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Configuration_Software 
                              = new javax.cim.UnsignedInteger16("3");
	          	
                       /**
              * constant for value entry Configuration Software (corresponds to mapEntry 3 )
              */
             public final static String VALUE_ENTRY_Configuration_Software 
                              = "Configuration Software";
                    
       		
          /**
           * constant for value map entry 4
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Application_Software 
                              = new javax.cim.UnsignedInteger16("4");
	          	
                       /**
              * constant for value entry Application Software (corresponds to mapEntry 4 )
              */
             public final static String VALUE_ENTRY_Application_Software 
                              = "Application Software";
                    
       		
          /**
           * constant for value map entry 5
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Instrumentation 
                              = new javax.cim.UnsignedInteger16("5");
	          	
                       /**
              * constant for value entry Instrumentation (corresponds to mapEntry 5 )
              */
             public final static String VALUE_ENTRY_Instrumentation 
                              = "Instrumentation";
                    
       		
          /**
           * constant for value map entry 6
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Firmware_BIOS 
                              = new javax.cim.UnsignedInteger16("6");
	          	
                       /**
              * constant for value entry Firmware/BIOS (corresponds to mapEntry 6 )
              */
             public final static String VALUE_ENTRY_Firmware_BIOS 
                              = "Firmware/BIOS";
                    
       		
          /**
           * constant for value map entry 7
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Diagnostic_Software 
                              = new javax.cim.UnsignedInteger16("7");
	          	
                       /**
              * constant for value entry Diagnostic Software (corresponds to mapEntry 7 )
              */
             public final static String VALUE_ENTRY_Diagnostic_Software 
                              = "Diagnostic Software";
                    
       		
          /**
           * constant for value map entry 8
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Operating_System 
                              = new javax.cim.UnsignedInteger16("8");
	          	
                       /**
              * constant for value entry Operating System (corresponds to mapEntry 8 )
              */
             public final static String VALUE_ENTRY_Operating_System 
                              = "Operating System";
                    
       		
          /**
           * constant for value map entry 9
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Middleware 
                              = new javax.cim.UnsignedInteger16("9");
	          	
                       /**
              * constant for value entry Middleware (corresponds to mapEntry 9 )
              */
             public final static String VALUE_ENTRY_Middleware 
                              = "Middleware";
                    
       		
          /**
           * constant for value map entry 10
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Firmware 
                              = new javax.cim.UnsignedInteger16("10");
	          	
                       /**
              * constant for value entry Firmware (corresponds to mapEntry 10 )
              */
             public final static String VALUE_ENTRY_Firmware 
                              = "Firmware";
                    
       		
          /**
           * constant for value map entry 11
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_BIOS_FCode 
                              = new javax.cim.UnsignedInteger16("11");
	          	
                       /**
              * constant for value entry BIOS/FCode (corresponds to mapEntry 11 )
              */
             public final static String VALUE_ENTRY_BIOS_FCode 
                              = "BIOS/FCode";
                    
       		
          /**
           * constant for value map entry 12
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Support_Service_Pack 
                              = new javax.cim.UnsignedInteger16("12");
	          	
                       /**
              * constant for value entry Support/Service Pack (corresponds to mapEntry 12 )
              */
             public final static String VALUE_ENTRY_Support_Service_Pack 
                              = "Support/Service Pack";
                    
       		
          /**
           * constant for value map entry 13
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Software_Bundle 
                              = new javax.cim.UnsignedInteger16("13");
	          	
                       /**
              * constant for value entry Software Bundle (corresponds to mapEntry 13 )
              */
             public final static String VALUE_ENTRY_Software_Bundle 
                              = "Software Bundle";
                    
       		
          /**
           * constant for value map entry ..
           */ 
		          	
                       /**
              * constant for value entry DMTF Reserved (corresponds to mapEntry .. )
              */
             public final static String VALUE_ENTRY_DMTF_Reserved 
                              = "DMTF Reserved";
                    
       		
          /**
           * constant for value map entry 0x8000..0xFFFF
           */ 
		          	
                       /**
              * constant for value entry Vendor Reserved (corresponds to mapEntry 0x8000..0xFFFF )
              */
             public final static String VALUE_ENTRY_Vendor_Reserved 
                              = "Vendor Reserved";
                    
                                        /**
                 * get the ValueMapEntry of the given value
                 * @param value the value to find the ValueMapEntry for
                 * @return the ValueMap entry or null if not found
                 */
                public static javax.cim.UnsignedInteger16 getValueMapEntry(String value)
                {
                                                
	                                               if (VALUE_ENTRY_Unknown.equals(value))
                         {
                            return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Other.equals(value))
                         {
                            return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Driver.equals(value))
                         {
                            return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Driver;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Configuration_Software.equals(value))
                         {
                            return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Configuration_Software;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Application_Software.equals(value))
                         {
                            return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Application_Software;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Instrumentation.equals(value))
                         {
                            return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Instrumentation;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Firmware_BIOS.equals(value))
                         {
                            return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Firmware_BIOS;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Diagnostic_Software.equals(value))
                         {
                            return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Diagnostic_Software;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Operating_System.equals(value))
                         {
                            return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Operating_System;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Middleware.equals(value))
                         {
                            return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Middleware;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Firmware.equals(value))
                         {
                            return VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Firmware;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_BIOS_FCode.equals(value))
                         {
                            return VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_BIOS_FCode;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Support_Service_Pack.equals(value))
                         {
                            return VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Support_Service_Pack;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Software_Bundle.equals(value))
                         {
                            return VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Software_Bundle;
                         }
	                      	                             
	                      	                             
	                      	                   	                                         return null;
                                   
                }
                
                /**
                 * uses the element within array VALUE_ENTRIES_FOR_DISPLAY at index indexInPulldown to get the ValueMapEntry
                 * @param indexInPulldown the index within the pulldown element, the list etc
                 * @return the ValueMap entry from the displayed values
                 */
                public static javax.cim.UnsignedInteger16 getValueMapEntryFromDisplayedValue(Number indexInPulldown)
                {
                   return getValueMapEntry(VALUE_ENTRIES_FOR_DISPLAY[indexInPulldown.intValue()]);
                }
                
               /**
                 * gets the value for the given valueMap entry (currentValue) and gives back the index of this value within the VALUE_ENTRIES_FOR_DISPLAY array
                 *
                 * can be used to set the correct selection index for a pulldown field
                 *
                 * @return -1 if for the currentValue no value within VALUE_ENTRIES_FOR_DISPLAY was found
                 * @param currentValue the currentValue to get the index for
                 */
                public static int getIndexForDisplay(javax.cim.UnsignedInteger16 currentValue)
                {
                   String valueEntry = getValueEntry(currentValue);
                   if (valueEntry != null)
                   {
                      for (int i=0; i < VALUE_ENTRIES_FOR_DISPLAY.length; i++)
                      {
                         if (VALUE_ENTRIES_FOR_DISPLAY[	i].equals(valueEntry))
                         {
                         	   return i;
                         }
                      }
                   }
                  	 return -1;
                   
                }

                /**
                 * get the ValueEntry of the given valueMapEntry
                 * @param valueMapEntry the entry within the valueMap to find the ValueEntry for
                 * @return the Value entry or null if not found
                 */
                
                public static String getValueEntry(javax.cim.UnsignedInteger16 value)
                {
                   int iValue = value.intValue();
                                                                                     
                         if (iValue == VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown.intValue())
                         {
                            return VALUE_ENTRY_Unknown;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other.intValue())
                         {
                            return VALUE_ENTRY_Other;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Driver.intValue())
                         {
                            return VALUE_ENTRY_Driver;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Configuration_Software.intValue())
                         {
                            return VALUE_ENTRY_Configuration_Software;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Application_Software.intValue())
                         {
                            return VALUE_ENTRY_Application_Software;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Instrumentation.intValue())
                         {
                            return VALUE_ENTRY_Instrumentation;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Firmware_BIOS.intValue())
                         {
                            return VALUE_ENTRY_Firmware_BIOS;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Diagnostic_Software.intValue())
                         {
                            return VALUE_ENTRY_Diagnostic_Software;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Operating_System.intValue())
                         {
                            return VALUE_ENTRY_Operating_System;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Middleware.intValue())
                         {
                            return VALUE_ENTRY_Middleware;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Firmware.intValue())
                         {
                            return VALUE_ENTRY_Firmware;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_BIOS_FCode.intValue())
                         {
                            return VALUE_ENTRY_BIOS_FCode;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Support_Service_Pack.intValue())
                         {
                            return VALUE_ENTRY_Support_Service_Pack;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Software_Bundle.intValue())
                         {
                            return VALUE_ENTRY_Software_Bundle;
                         }
                                                                                        
                         if (iValue >= 0x8000 || iValue <= 0xFFFF)
                         {
                            return VALUE_ENTRY_Vendor_Reserved;
                         }
                                                                                        return VALUE_ENTRY_DMTF_Reserved;
                                                                            
                }
          
                          
                /**
                 * get the ValueEntries of the given valueMapEntries
                 * @param values the values to find the ValueMapEntries for
                 * @return the array with ValueMap entries. Some of them may be null to if no valueMap entry was found
                 */
                 
                public static javax.cim.UnsignedInteger16[] getValueMapEntries(String[] values)
                {
                    javax.cim.UnsignedInteger16[] result = new javax.cim.UnsignedInteger16[values.length];
                    
                    for (int i=0; i < result.length; i++)
                    {
	                       result[i] = getValueMapEntry(values[i]);
                    }
                    
                    return result;
                }
                
                
                /**
                 * get the ValueMapEntries of the given valueEntries
                 * @param valueMapEntries the valueMap entries to find the Values for
                 * @return the array with Value entries. Some of them may be null to if no value entry was found
                 */          
                
                public static String[] getValueEntries(javax.cim.UnsignedInteger16[] values)
                {
                    String[] result = new String[values.length];
                    
                    for (int i=0; i < result.length; i++)
                    {
	                       result[i] = getValueEntry(values[i]);
                    }
                    
                    return result;
                }
                                    
          /**
	       * ValueMap entries
       * Contains no entries that having an integer value range representation
       * 
       * The couterpart for the value entries is returned by VALUE_ENTRIES_FOR_DISPLAY
       *
       * @see \#VALUE_ENTRIES_FOR_DISPLAY
       * 
       * Value Map for the property Classifications   
       */
      public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = { 
	         	                              VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown
                     	                            ,  VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other
                     	                            ,  VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Driver
                     	                            ,  VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Configuration_Software
                     	                            ,  VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Application_Software
                     	                            ,  VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Instrumentation
                     	                            ,  VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Firmware_BIOS
                     	                            ,  VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Diagnostic_Software
                     	                            ,  VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Operating_System
                     	                            ,  VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Middleware
                     	                            ,  VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Firmware
                     	                            ,  VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_BIOS_FCode
                     	                            ,  VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Support_Service_Pack
                     	                            ,  VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Software_Bundle
                     	                     	                           };
    	
	           /**
        * Values
        * Contains all values even those having an integer value range representation within the valueMap
        * Value Map for the property Classifications   
        */
       public final static String[] VALUE_ENTRIES = { 
                                                   VALUE_ENTRY_Unknown
                                                                 ,  VALUE_ENTRY_Other
                                                                 ,  VALUE_ENTRY_Driver
                                                                 ,  VALUE_ENTRY_Configuration_Software
                                                                 ,  VALUE_ENTRY_Application_Software
                                                                 ,  VALUE_ENTRY_Instrumentation
                                                                 ,  VALUE_ENTRY_Firmware_BIOS
                                                                 ,  VALUE_ENTRY_Diagnostic_Software
                                                                 ,  VALUE_ENTRY_Operating_System
                                                                 ,  VALUE_ENTRY_Middleware
                                                                 ,  VALUE_ENTRY_Firmware
                                                                 ,  VALUE_ENTRY_BIOS_FCode
                                                                 ,  VALUE_ENTRY_Support_Service_Pack
                                                                 ,  VALUE_ENTRY_Software_Bundle
                                                                 ,  VALUE_ENTRY_DMTF_Reserved
                                                                 ,  VALUE_ENTRY_Vendor_Reserved
                                    };

              /**
        * Values for displaying within pulldown elements, lists, radio buttons etc
        * Contains no values that having an integer value range representation within the valueMap
        * 
        * Value Map for the property Classifications   
        */
       public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { 
                                                   VALUE_ENTRY_Unknown
                                                                 ,  VALUE_ENTRY_Other
                                                                 ,  VALUE_ENTRY_Driver
                                                                 ,  VALUE_ENTRY_Configuration_Software
                                                                 ,  VALUE_ENTRY_Application_Software
                                                                 ,  VALUE_ENTRY_Instrumentation
                                                                 ,  VALUE_ENTRY_Firmware_BIOS
                                                                 ,  VALUE_ENTRY_Diagnostic_Software
                                                                 ,  VALUE_ENTRY_Operating_System
                                                                 ,  VALUE_ENTRY_Middleware
                                                                 ,  VALUE_ENTRY_Firmware
                                                                 ,  VALUE_ENTRY_BIOS_FCode
                                                                 ,  VALUE_ENTRY_Support_Service_Pack
                                                                 ,  VALUE_ENTRY_Software_Bundle
                                                                                              };

        
		    
	
	    
	    }
	    
	    /**
	     * Constants of property IdentityInfoType
     * An indexed array of fixed-form strings that provide the description of the type of information that is stored in the corresponding component of the IdentityInfoValue array. The elements of this property array describe the type of the value in the corresponding elements of the IndetityInfoValue array. When the IdentityInfoValue property is implemented, the IdentityInfoType property MUST be implemented. To insure uniqueness the IdentityInfoType property SHOULD be formatted using the following algorithm: < OrgID > : < LocalID > Where < OrgID > and < LocalID > are separated by a colon (:), and where < OrgID > MUST include a copyrighted, trademarked, or otherwise unique name that is owned by the business entity that is creating or defining the IdentityInfoType or that is a registered ID assigned to the business entity by a recognized global authority. (This requirement is similar to the < Schema Name > _ < Class Name > structure of Schema class names.) In addition, to ensure uniqueness, < OrgID > MUST NOT contain a colon (:). When using this algorithm, the first colon to appear in IdentityInfoType MUST appear between < OrgID > and < LocalID > . < LocalID > is chosen by the business entity and SHOULD NOT be reused to identify different underlying software elements.
     */
    public static class PROPERTY_IDENTITYINFOTYPE
    {
       /**
        * name of the property IdentityInfoType
        */
       public final static String NAME = "IdentityInfoType";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property IdentityInfoValue
     * IdentityInfoValue captures additional information that MAY be used by an organization to describe or identify a software instance within the context of the organization. For example, large organizations may have several ways to address or identify a particular instance of software depending on where it is stored; a catalog, a web site, or for whom it is intended; development, customer service, etc. The indexed array property IdentityInfoValue contains 0 or more strings that contain a specific identity info string value. IdentityInfoValue is mapped and indexed to IdentityInfoType. When the IdentityInfoValue property is implemented, the IdentityInfoType property MUST be implemented and shall be formatted using the algorithm provided in the IdentityInfoType property Description.
     */
    public static class PROPERTY_IDENTITYINFOVALUE
    {
       /**
        * name of the property IdentityInfoValue
        */
       public final static String NAME = "IdentityInfoValue";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property InstanceID
     * Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. In order to ensure uniqueness within the NameSpace, the value of InstanceID SHOULD be constructed using the following 'preferred' algorithm: 
     * <OrgID>:<LocalID> 
     * Where <OrgID> and <LocalID> are separated by a colon ':', and where <OrgID> MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity creating/defining the InstanceID, or is a registered ID that is assigned to the business entity by a recognized global authority (This is similar to the <Schema Name>_<Class Name> structure of Schema class names.) In addition, to ensure uniqueness <OrgID> MUST NOT contain a colon (':'). When using this algorithm, the first colon to appear in InstanceID MUST appear between <OrgID> and <LocalID>. 
     * <LocalID> is chosen by the business entity and SHOULD not be re-used to identify different underlying (real-world) elements. If the above 'preferred' algorithm is not used, the defining entity MUST assure that the resultant InstanceID is not re-used across any InstanceIDs produced by this or other providers for this instance's NameSpace. 
     * For DMTF defined instances, the 'preferred' algorithm MUST be used with the <OrgID> set to 'CIM'.
     */
    public static class PROPERTY_INSTANCEID
    {
       /**
        * name of the property InstanceID
        */
       public final static String NAME = "InstanceID";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property IsEntity
     * The IsEntity property is used to indicate whether the SoftwareIdentity corresponds to a discrete copy of the software component or is being used to convey descriptive and identifying information about software that is not present in the management domain.A value of TRUE shall indicate that the SoftwareIdentity instance corresponds to a discrete copy of the software component. A value of FALSE shall indicate that the SoftwareIdentity instance does not correspond to a discrete copy of the Software.
     */
    public static class PROPERTY_ISENTITY
    {
       /**
        * name of the property IsEntity
        */
       public final static String NAME = "IsEntity";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property Languages
     * The language editions supported by the software. The language codes defined in ISO 639 should be used.
     */
    public static class PROPERTY_LANGUAGES
    {
       /**
        * name of the property Languages
        */
       public final static String NAME = "Languages";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property MajorVersion
     * The major number component of the software's version information - for example, '12' from version 12.1(3)T. This property is defined as a numeric value to allow the determination of 'newer' vs. 'older' releases. A 'newer' major release is indicated by a larger numeric value.
     */
    public static class PROPERTY_MAJORVERSION
    {
       /**
        * name of the property MajorVersion
        */
       public final static String NAME = "MajorVersion";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property Manufacturer
     * Manufacturer of this software.
     */
    public static class PROPERTY_MANUFACTURER
    {
       /**
        * name of the property Manufacturer
        */
       public final static String NAME = "Manufacturer";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property MinorVersion
     * The minor number component of the software's version information - for example, '1' from version 12.1(3)T. This property is defined as a numeric value to allow the determination of 'newer' vs. 'older' releases. A 'newer' minor release is indicated by a larger numeric value.
     */
    public static class PROPERTY_MINORVERSION
    {
       /**
        * name of the property MinorVersion
        */
       public final static String NAME = "MinorVersion";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property ReleaseDate
     * The date the software was released.
     */
    public static class PROPERTY_RELEASEDATE
    {
       /**
        * name of the property ReleaseDate
        */
       public final static String NAME = "ReleaseDate";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property RevisionNumber
     * The revision or maintenance release component of the software's version information - for example, '3' from version 12.1(3)T. This property is defined as a numeric value to allow the determination of 'newer' vs. 'older' releases. A 'newer' revision is indicated by a larger numeric value.
     */
    public static class PROPERTY_REVISIONNUMBER
    {
       /**
        * name of the property RevisionNumber
        */
       public final static String NAME = "RevisionNumber";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property SerialNumber
     * A manufacturer-allocated number used to identify the software.
     */
    public static class PROPERTY_SERIALNUMBER
    {
       /**
        * name of the property SerialNumber
        */
       public final static String NAME = "SerialNumber";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property TargetOSTypes
     * The TargetOSTypes property specifies the target operating systems supported by the software. When the target operating system of the software is not listed in the enumeration values, TargetOperatingSystems[] property should be used to specify the target operating system.
     */
    public static class PROPERTY_TARGETOSTYPES
    {
       /**
        * name of the property TargetOSTypes
        */
       public final static String NAME = "TargetOSTypes";                  

	    	
    

              
       		
          /**
           * constant for value map entry 0
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown 
                              = new javax.cim.UnsignedInteger16("0");
	          	
                       /**
              * constant for value entry Unknown (corresponds to mapEntry 0 )
              */
             public final static String VALUE_ENTRY_Unknown 
                              = "Unknown";
                    
       		
          /**
           * constant for value map entry 1
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other 
                              = new javax.cim.UnsignedInteger16("1");
	          	
                       /**
              * constant for value entry Other (corresponds to mapEntry 1 )
              */
             public final static String VALUE_ENTRY_Other 
                              = "Other";
                    
       		
          /**
           * constant for value map entry 2
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_MACOS 
                              = new javax.cim.UnsignedInteger16("2");
	          	
                       /**
              * constant for value entry MACOS (corresponds to mapEntry 2 )
              */
             public final static String VALUE_ENTRY_MACOS 
                              = "MACOS";
                    
       		
          /**
           * constant for value map entry 3
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_ATTUNIX 
                              = new javax.cim.UnsignedInteger16("3");
	          	
                       /**
              * constant for value entry ATTUNIX (corresponds to mapEntry 3 )
              */
             public final static String VALUE_ENTRY_ATTUNIX 
                              = "ATTUNIX";
                    
       		
          /**
           * constant for value map entry 4
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_DGUX 
                              = new javax.cim.UnsignedInteger16("4");
	          	
                       /**
              * constant for value entry DGUX (corresponds to mapEntry 4 )
              */
             public final static String VALUE_ENTRY_DGUX 
                              = "DGUX";
                    
       		
          /**
           * constant for value map entry 5
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_DECNT 
                              = new javax.cim.UnsignedInteger16("5");
	          	
                       /**
              * constant for value entry DECNT (corresponds to mapEntry 5 )
              */
             public final static String VALUE_ENTRY_DECNT 
                              = "DECNT";
                    
       		
          /**
           * constant for value map entry 6
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Tru64_UNIX 
                              = new javax.cim.UnsignedInteger16("6");
	          	
                       /**
              * constant for value entry Tru64 UNIX (corresponds to mapEntry 6 )
              */
             public final static String VALUE_ENTRY_Tru64_UNIX 
                              = "Tru64 UNIX";
                    
       		
          /**
           * constant for value map entry 7
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_OpenVMS 
                              = new javax.cim.UnsignedInteger16("7");
	          	
                       /**
              * constant for value entry OpenVMS (corresponds to mapEntry 7 )
              */
             public final static String VALUE_ENTRY_OpenVMS 
                              = "OpenVMS";
                    
       		
          /**
           * constant for value map entry 8
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_HPUX 
                              = new javax.cim.UnsignedInteger16("8");
	          	
                       /**
              * constant for value entry HPUX (corresponds to mapEntry 8 )
              */
             public final static String VALUE_ENTRY_HPUX 
                              = "HPUX";
                    
       		
          /**
           * constant for value map entry 9
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_AIX 
                              = new javax.cim.UnsignedInteger16("9");
	          	
                       /**
              * constant for value entry AIX (corresponds to mapEntry 9 )
              */
             public final static String VALUE_ENTRY_AIX 
                              = "AIX";
                    
       		
          /**
           * constant for value map entry 10
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_MVS 
                              = new javax.cim.UnsignedInteger16("10");
	          	
                       /**
              * constant for value entry MVS (corresponds to mapEntry 10 )
              */
             public final static String VALUE_ENTRY_MVS 
                              = "MVS";
                    
       		
          /**
           * constant for value map entry 11
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_OS400 
                              = new javax.cim.UnsignedInteger16("11");
	          	
                       /**
              * constant for value entry OS400 (corresponds to mapEntry 11 )
              */
             public final static String VALUE_ENTRY_OS400 
                              = "OS400";
                    
       		
          /**
           * constant for value map entry 12
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_OS_2 
                              = new javax.cim.UnsignedInteger16("12");
	          	
                       /**
              * constant for value entry OS/2 (corresponds to mapEntry 12 )
              */
             public final static String VALUE_ENTRY_OS_2 
                              = "OS/2";
                    
       		
          /**
           * constant for value map entry 13
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_JavaVM 
                              = new javax.cim.UnsignedInteger16("13");
	          	
                       /**
              * constant for value entry JavaVM (corresponds to mapEntry 13 )
              */
             public final static String VALUE_ENTRY_JavaVM 
                              = "JavaVM";
                    
       		
          /**
           * constant for value map entry 14
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_MSDOS 
                              = new javax.cim.UnsignedInteger16("14");
	          	
                       /**
              * constant for value entry MSDOS (corresponds to mapEntry 14 )
              */
             public final static String VALUE_ENTRY_MSDOS 
                              = "MSDOS";
                    
       		
          /**
           * constant for value map entry 15
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_WIN3x 
                              = new javax.cim.UnsignedInteger16("15");
	          	
                       /**
              * constant for value entry WIN3x (corresponds to mapEntry 15 )
              */
             public final static String VALUE_ENTRY_WIN3x 
                              = "WIN3x";
                    
       		
          /**
           * constant for value map entry 16
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_WIN95 
                              = new javax.cim.UnsignedInteger16("16");
	          	
                       /**
              * constant for value entry WIN95 (corresponds to mapEntry 16 )
              */
             public final static String VALUE_ENTRY_WIN95 
                              = "WIN95";
                    
       		
          /**
           * constant for value map entry 17
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_WIN98 
                              = new javax.cim.UnsignedInteger16("17");
	          	
                       /**
              * constant for value entry WIN98 (corresponds to mapEntry 17 )
              */
             public final static String VALUE_ENTRY_WIN98 
                              = "WIN98";
                    
       		
          /**
           * constant for value map entry 18
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_WINNT 
                              = new javax.cim.UnsignedInteger16("18");
	          	
                       /**
              * constant for value entry WINNT (corresponds to mapEntry 18 )
              */
             public final static String VALUE_ENTRY_WINNT 
                              = "WINNT";
                    
       		
          /**
           * constant for value map entry 19
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_WINCE 
                              = new javax.cim.UnsignedInteger16("19");
	          	
                       /**
              * constant for value entry WINCE (corresponds to mapEntry 19 )
              */
             public final static String VALUE_ENTRY_WINCE 
                              = "WINCE";
                    
       		
          /**
           * constant for value map entry 20
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_NCR3000 
                              = new javax.cim.UnsignedInteger16("20");
	          	
                       /**
              * constant for value entry NCR3000 (corresponds to mapEntry 20 )
              */
             public final static String VALUE_ENTRY_NCR3000 
                              = "NCR3000";
                    
       		
          /**
           * constant for value map entry 21
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_NetWare 
                              = new javax.cim.UnsignedInteger16("21");
	          	
                       /**
              * constant for value entry NetWare (corresponds to mapEntry 21 )
              */
             public final static String VALUE_ENTRY_NetWare 
                              = "NetWare";
                    
       		
          /**
           * constant for value map entry 22
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_OSF 
                              = new javax.cim.UnsignedInteger16("22");
	          	
                       /**
              * constant for value entry OSF (corresponds to mapEntry 22 )
              */
             public final static String VALUE_ENTRY_OSF 
                              = "OSF";
                    
       		
          /**
           * constant for value map entry 23
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_DC_OS 
                              = new javax.cim.UnsignedInteger16("23");
	          	
                       /**
              * constant for value entry DC/OS (corresponds to mapEntry 23 )
              */
             public final static String VALUE_ENTRY_DC_OS 
                              = "DC/OS";
                    
       		
          /**
           * constant for value map entry 24
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_Reliant_UNIX 
                              = new javax.cim.UnsignedInteger16("24");
	          	
                       /**
              * constant for value entry Reliant UNIX (corresponds to mapEntry 24 )
              */
             public final static String VALUE_ENTRY_Reliant_UNIX 
                              = "Reliant UNIX";
                    
       		
          /**
           * constant for value map entry 25
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_SCO_UnixWare 
                              = new javax.cim.UnsignedInteger16("25");
	          	
                       /**
              * constant for value entry SCO UnixWare (corresponds to mapEntry 25 )
              */
             public final static String VALUE_ENTRY_SCO_UnixWare 
                              = "SCO UnixWare";
                    
       		
          /**
           * constant for value map entry 26
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_SCO_OpenServer 
                              = new javax.cim.UnsignedInteger16("26");
	          	
                       /**
              * constant for value entry SCO OpenServer (corresponds to mapEntry 26 )
              */
             public final static String VALUE_ENTRY_SCO_OpenServer 
                              = "SCO OpenServer";
                    
       		
          /**
           * constant for value map entry 27
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_Sequent 
                              = new javax.cim.UnsignedInteger16("27");
	          	
                       /**
              * constant for value entry Sequent (corresponds to mapEntry 27 )
              */
             public final static String VALUE_ENTRY_Sequent 
                              = "Sequent";
                    
       		
          /**
           * constant for value map entry 28
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_28_FOR_VALUE_ENTRY_IRIX 
                              = new javax.cim.UnsignedInteger16("28");
	          	
                       /**
              * constant for value entry IRIX (corresponds to mapEntry 28 )
              */
             public final static String VALUE_ENTRY_IRIX 
                              = "IRIX";
                    
       		
          /**
           * constant for value map entry 29
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_29_FOR_VALUE_ENTRY_Solaris 
                              = new javax.cim.UnsignedInteger16("29");
	          	
                       /**
              * constant for value entry Solaris (corresponds to mapEntry 29 )
              */
             public final static String VALUE_ENTRY_Solaris 
                              = "Solaris";
                    
       		
          /**
           * constant for value map entry 30
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_30_FOR_VALUE_ENTRY_SunOS 
                              = new javax.cim.UnsignedInteger16("30");
	          	
                       /**
              * constant for value entry SunOS (corresponds to mapEntry 30 )
              */
             public final static String VALUE_ENTRY_SunOS 
                              = "SunOS";
                    
       		
          /**
           * constant for value map entry 31
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_31_FOR_VALUE_ENTRY_U6000 
                              = new javax.cim.UnsignedInteger16("31");
	          	
                       /**
              * constant for value entry U6000 (corresponds to mapEntry 31 )
              */
             public final static String VALUE_ENTRY_U6000 
                              = "U6000";
                    
       		
          /**
           * constant for value map entry 32
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_32_FOR_VALUE_ENTRY_ASERIES 
                              = new javax.cim.UnsignedInteger16("32");
	          	
                       /**
              * constant for value entry ASERIES (corresponds to mapEntry 32 )
              */
             public final static String VALUE_ENTRY_ASERIES 
                              = "ASERIES";
                    
       		
          /**
           * constant for value map entry 33
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_33_FOR_VALUE_ENTRY_HP_NonStop_OS 
                              = new javax.cim.UnsignedInteger16("33");
	          	
                       /**
              * constant for value entry HP NonStop OS (corresponds to mapEntry 33 )
              */
             public final static String VALUE_ENTRY_HP_NonStop_OS 
                              = "HP NonStop OS";
                    
       		
          /**
           * constant for value map entry 34
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_34_FOR_VALUE_ENTRY_HP_NonStop_OSS 
                              = new javax.cim.UnsignedInteger16("34");
	          	
                       /**
              * constant for value entry HP NonStop OSS (corresponds to mapEntry 34 )
              */
             public final static String VALUE_ENTRY_HP_NonStop_OSS 
                              = "HP NonStop OSS";
                    
       		
          /**
           * constant for value map entry 35
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_35_FOR_VALUE_ENTRY_BS2000 
                              = new javax.cim.UnsignedInteger16("35");
	          	
                       /**
              * constant for value entry BS2000 (corresponds to mapEntry 35 )
              */
             public final static String VALUE_ENTRY_BS2000 
                              = "BS2000";
                    
       		
          /**
           * constant for value map entry 36
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_36_FOR_VALUE_ENTRY_LINUX 
                              = new javax.cim.UnsignedInteger16("36");
	          	
                       /**
              * constant for value entry LINUX (corresponds to mapEntry 36 )
              */
             public final static String VALUE_ENTRY_LINUX 
                              = "LINUX";
                    
       		
          /**
           * constant for value map entry 37
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_37_FOR_VALUE_ENTRY_Lynx 
                              = new javax.cim.UnsignedInteger16("37");
	          	
                       /**
              * constant for value entry Lynx (corresponds to mapEntry 37 )
              */
             public final static String VALUE_ENTRY_Lynx 
                              = "Lynx";
                    
       		
          /**
           * constant for value map entry 38
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_38_FOR_VALUE_ENTRY_XENIX 
                              = new javax.cim.UnsignedInteger16("38");
	          	
                       /**
              * constant for value entry XENIX (corresponds to mapEntry 38 )
              */
             public final static String VALUE_ENTRY_XENIX 
                              = "XENIX";
                    
       		
          /**
           * constant for value map entry 39
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_39_FOR_VALUE_ENTRY_VM 
                              = new javax.cim.UnsignedInteger16("39");
	          	
                       /**
              * constant for value entry VM (corresponds to mapEntry 39 )
              */
             public final static String VALUE_ENTRY_VM 
                              = "VM";
                    
       		
          /**
           * constant for value map entry 40
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_40_FOR_VALUE_ENTRY_Interactive_UNIX 
                              = new javax.cim.UnsignedInteger16("40");
	          	
                       /**
              * constant for value entry Interactive UNIX (corresponds to mapEntry 40 )
              */
             public final static String VALUE_ENTRY_Interactive_UNIX 
                              = "Interactive UNIX";
                    
       		
          /**
           * constant for value map entry 41
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_41_FOR_VALUE_ENTRY_BSDUNIX 
                              = new javax.cim.UnsignedInteger16("41");
	          	
                       /**
              * constant for value entry BSDUNIX (corresponds to mapEntry 41 )
              */
             public final static String VALUE_ENTRY_BSDUNIX 
                              = "BSDUNIX";
                    
       		
          /**
           * constant for value map entry 42
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_42_FOR_VALUE_ENTRY_FreeBSD 
                              = new javax.cim.UnsignedInteger16("42");
	          	
                       /**
              * constant for value entry FreeBSD (corresponds to mapEntry 42 )
              */
             public final static String VALUE_ENTRY_FreeBSD 
                              = "FreeBSD";
                    
       		
          /**
           * constant for value map entry 43
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_43_FOR_VALUE_ENTRY_NetBSD 
                              = new javax.cim.UnsignedInteger16("43");
	          	
                       /**
              * constant for value entry NetBSD (corresponds to mapEntry 43 )
              */
             public final static String VALUE_ENTRY_NetBSD 
                              = "NetBSD";
                    
       		
          /**
           * constant for value map entry 44
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_44_FOR_VALUE_ENTRY_GNU_Hurd 
                              = new javax.cim.UnsignedInteger16("44");
	          	
                       /**
              * constant for value entry GNU Hurd (corresponds to mapEntry 44 )
              */
             public final static String VALUE_ENTRY_GNU_Hurd 
                              = "GNU Hurd";
                    
       		
          /**
           * constant for value map entry 45
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_45_FOR_VALUE_ENTRY_OS9 
                              = new javax.cim.UnsignedInteger16("45");
	          	
                       /**
              * constant for value entry OS9 (corresponds to mapEntry 45 )
              */
             public final static String VALUE_ENTRY_OS9 
                              = "OS9";
                    
       		
          /**
           * constant for value map entry 46
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_46_FOR_VALUE_ENTRY_MACH_Kernel 
                              = new javax.cim.UnsignedInteger16("46");
	          	
                       /**
              * constant for value entry MACH Kernel (corresponds to mapEntry 46 )
              */
             public final static String VALUE_ENTRY_MACH_Kernel 
                              = "MACH Kernel";
                    
       		
          /**
           * constant for value map entry 47
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_47_FOR_VALUE_ENTRY_Inferno 
                              = new javax.cim.UnsignedInteger16("47");
	          	
                       /**
              * constant for value entry Inferno (corresponds to mapEntry 47 )
              */
             public final static String VALUE_ENTRY_Inferno 
                              = "Inferno";
                    
       		
          /**
           * constant for value map entry 48
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_48_FOR_VALUE_ENTRY_QNX 
                              = new javax.cim.UnsignedInteger16("48");
	          	
                       /**
              * constant for value entry QNX (corresponds to mapEntry 48 )
              */
             public final static String VALUE_ENTRY_QNX 
                              = "QNX";
                    
       		
          /**
           * constant for value map entry 49
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_49_FOR_VALUE_ENTRY_EPOC 
                              = new javax.cim.UnsignedInteger16("49");
	          	
                       /**
              * constant for value entry EPOC (corresponds to mapEntry 49 )
              */
             public final static String VALUE_ENTRY_EPOC 
                              = "EPOC";
                    
       		
          /**
           * constant for value map entry 50
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_50_FOR_VALUE_ENTRY_IxWorks 
                              = new javax.cim.UnsignedInteger16("50");
	          	
                       /**
              * constant for value entry IxWorks (corresponds to mapEntry 50 )
              */
             public final static String VALUE_ENTRY_IxWorks 
                              = "IxWorks";
                    
       		
          /**
           * constant for value map entry 51
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_51_FOR_VALUE_ENTRY_VxWorks 
                              = new javax.cim.UnsignedInteger16("51");
	          	
                       /**
              * constant for value entry VxWorks (corresponds to mapEntry 51 )
              */
             public final static String VALUE_ENTRY_VxWorks 
                              = "VxWorks";
                    
       		
          /**
           * constant for value map entry 52
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_52_FOR_VALUE_ENTRY_MiNT 
                              = new javax.cim.UnsignedInteger16("52");
	          	
                       /**
              * constant for value entry MiNT (corresponds to mapEntry 52 )
              */
             public final static String VALUE_ENTRY_MiNT 
                              = "MiNT";
                    
       		
          /**
           * constant for value map entry 53
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_53_FOR_VALUE_ENTRY_BeOS 
                              = new javax.cim.UnsignedInteger16("53");
	          	
                       /**
              * constant for value entry BeOS (corresponds to mapEntry 53 )
              */
             public final static String VALUE_ENTRY_BeOS 
                              = "BeOS";
                    
       		
          /**
           * constant for value map entry 54
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_54_FOR_VALUE_ENTRY_HP_MPE 
                              = new javax.cim.UnsignedInteger16("54");
	          	
                       /**
              * constant for value entry HP MPE (corresponds to mapEntry 54 )
              */
             public final static String VALUE_ENTRY_HP_MPE 
                              = "HP MPE";
                    
       		
          /**
           * constant for value map entry 55
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_55_FOR_VALUE_ENTRY_NextStep 
                              = new javax.cim.UnsignedInteger16("55");
	          	
                       /**
              * constant for value entry NextStep (corresponds to mapEntry 55 )
              */
             public final static String VALUE_ENTRY_NextStep 
                              = "NextStep";
                    
       		
          /**
           * constant for value map entry 56
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_56_FOR_VALUE_ENTRY_PalmPilot 
                              = new javax.cim.UnsignedInteger16("56");
	          	
                       /**
              * constant for value entry PalmPilot (corresponds to mapEntry 56 )
              */
             public final static String VALUE_ENTRY_PalmPilot 
                              = "PalmPilot";
                    
       		
          /**
           * constant for value map entry 57
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_57_FOR_VALUE_ENTRY_Rhapsody 
                              = new javax.cim.UnsignedInteger16("57");
	          	
                       /**
              * constant for value entry Rhapsody (corresponds to mapEntry 57 )
              */
             public final static String VALUE_ENTRY_Rhapsody 
                              = "Rhapsody";
                    
       		
          /**
           * constant for value map entry 58
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_58_FOR_VALUE_ENTRY_Windows_2000 
                              = new javax.cim.UnsignedInteger16("58");
	          	
                       /**
              * constant for value entry Windows 2000 (corresponds to mapEntry 58 )
              */
             public final static String VALUE_ENTRY_Windows_2000 
                              = "Windows 2000";
                    
       		
          /**
           * constant for value map entry 59
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_59_FOR_VALUE_ENTRY_Dedicated 
                              = new javax.cim.UnsignedInteger16("59");
	          	
                       /**
              * constant for value entry Dedicated (corresponds to mapEntry 59 )
              */
             public final static String VALUE_ENTRY_Dedicated 
                              = "Dedicated";
                    
       		
          /**
           * constant for value map entry 60
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_60_FOR_VALUE_ENTRY_OS_390 
                              = new javax.cim.UnsignedInteger16("60");
	          	
                       /**
              * constant for value entry OS/390 (corresponds to mapEntry 60 )
              */
             public final static String VALUE_ENTRY_OS_390 
                              = "OS/390";
                    
       		
          /**
           * constant for value map entry 61
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_61_FOR_VALUE_ENTRY_VSE 
                              = new javax.cim.UnsignedInteger16("61");
	          	
                       /**
              * constant for value entry VSE (corresponds to mapEntry 61 )
              */
             public final static String VALUE_ENTRY_VSE 
                              = "VSE";
                    
       		
          /**
           * constant for value map entry 62
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_62_FOR_VALUE_ENTRY_TPF 
                              = new javax.cim.UnsignedInteger16("62");
	          	
                       /**
              * constant for value entry TPF (corresponds to mapEntry 62 )
              */
             public final static String VALUE_ENTRY_TPF 
                              = "TPF";
                    
       		
          /**
           * constant for value map entry 63
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_63_FOR_VALUE_ENTRY_Windows__R__Me 
                              = new javax.cim.UnsignedInteger16("63");
	          	
                       /**
              * constant for value entry Windows (R) Me (corresponds to mapEntry 63 )
              */
             public final static String VALUE_ENTRY_Windows__R__Me 
                              = "Windows (R) Me";
                    
       		
          /**
           * constant for value map entry 64
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_64_FOR_VALUE_ENTRY_Caldera_Open_UNIX 
                              = new javax.cim.UnsignedInteger16("64");
	          	
                       /**
              * constant for value entry Caldera Open UNIX (corresponds to mapEntry 64 )
              */
             public final static String VALUE_ENTRY_Caldera_Open_UNIX 
                              = "Caldera Open UNIX";
                    
       		
          /**
           * constant for value map entry 65
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_65_FOR_VALUE_ENTRY_OpenBSD 
                              = new javax.cim.UnsignedInteger16("65");
	          	
                       /**
              * constant for value entry OpenBSD (corresponds to mapEntry 65 )
              */
             public final static String VALUE_ENTRY_OpenBSD 
                              = "OpenBSD";
                    
       		
          /**
           * constant for value map entry 66
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_66_FOR_VALUE_ENTRY_Not_Applicable 
                              = new javax.cim.UnsignedInteger16("66");
	          	
                       /**
              * constant for value entry Not Applicable (corresponds to mapEntry 66 )
              */
             public final static String VALUE_ENTRY_Not_Applicable 
                              = "Not Applicable";
                    
       		
          /**
           * constant for value map entry 67
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_67_FOR_VALUE_ENTRY_Windows_XP 
                              = new javax.cim.UnsignedInteger16("67");
	          	
                       /**
              * constant for value entry Windows XP (corresponds to mapEntry 67 )
              */
             public final static String VALUE_ENTRY_Windows_XP 
                              = "Windows XP";
                    
       		
          /**
           * constant for value map entry 68
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_68_FOR_VALUE_ENTRY_z_OS 
                              = new javax.cim.UnsignedInteger16("68");
	          	
                       /**
              * constant for value entry z/OS (corresponds to mapEntry 68 )
              */
             public final static String VALUE_ENTRY_z_OS 
                              = "z/OS";
                    
       		
          /**
           * constant for value map entry 69
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_69_FOR_VALUE_ENTRY_Microsoft_Windows_Server_2003 
                              = new javax.cim.UnsignedInteger16("69");
	          	
                       /**
              * constant for value entry Microsoft Windows Server 2003 (corresponds to mapEntry 69 )
              */
             public final static String VALUE_ENTRY_Microsoft_Windows_Server_2003 
                              = "Microsoft Windows Server 2003";
                    
       		
          /**
           * constant for value map entry 70
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_70_FOR_VALUE_ENTRY_Microsoft_Windows_Server_2003_64_Bit 
                              = new javax.cim.UnsignedInteger16("70");
	          	
                       /**
              * constant for value entry Microsoft Windows Server 2003 64-Bit (corresponds to mapEntry 70 )
              */
             public final static String VALUE_ENTRY_Microsoft_Windows_Server_2003_64_Bit 
                              = "Microsoft Windows Server 2003 64-Bit";
                    
       		
          /**
           * constant for value map entry 71
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_71_FOR_VALUE_ENTRY_Windows_XP_64_Bit 
                              = new javax.cim.UnsignedInteger16("71");
	          	
                       /**
              * constant for value entry Windows XP 64-Bit (corresponds to mapEntry 71 )
              */
             public final static String VALUE_ENTRY_Windows_XP_64_Bit 
                              = "Windows XP 64-Bit";
                    
       		
          /**
           * constant for value map entry 72
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_72_FOR_VALUE_ENTRY_Windows_XP_Embedded 
                              = new javax.cim.UnsignedInteger16("72");
	          	
                       /**
              * constant for value entry Windows XP Embedded (corresponds to mapEntry 72 )
              */
             public final static String VALUE_ENTRY_Windows_XP_Embedded 
                              = "Windows XP Embedded";
                    
       		
          /**
           * constant for value map entry 73
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_73_FOR_VALUE_ENTRY_Windows_Vista 
                              = new javax.cim.UnsignedInteger16("73");
	          	
                       /**
              * constant for value entry Windows Vista (corresponds to mapEntry 73 )
              */
             public final static String VALUE_ENTRY_Windows_Vista 
                              = "Windows Vista";
                    
       		
          /**
           * constant for value map entry 74
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_74_FOR_VALUE_ENTRY_Windows_Vista_64_Bit 
                              = new javax.cim.UnsignedInteger16("74");
	          	
                       /**
              * constant for value entry Windows Vista 64-Bit (corresponds to mapEntry 74 )
              */
             public final static String VALUE_ENTRY_Windows_Vista_64_Bit 
                              = "Windows Vista 64-Bit";
                    
       		
          /**
           * constant for value map entry 75
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_75_FOR_VALUE_ENTRY_Windows_Embedded_for_Point_of_Service 
                              = new javax.cim.UnsignedInteger16("75");
	          	
                       /**
              * constant for value entry Windows Embedded for Point of Service (corresponds to mapEntry 75 )
              */
             public final static String VALUE_ENTRY_Windows_Embedded_for_Point_of_Service 
                              = "Windows Embedded for Point of Service";
                    
       		
          /**
           * constant for value map entry 76
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_76_FOR_VALUE_ENTRY_Microsoft_Windows_Server_2008 
                              = new javax.cim.UnsignedInteger16("76");
	          	
                       /**
              * constant for value entry Microsoft Windows Server 2008 (corresponds to mapEntry 76 )
              */
             public final static String VALUE_ENTRY_Microsoft_Windows_Server_2008 
                              = "Microsoft Windows Server 2008";
                    
       		
          /**
           * constant for value map entry 77
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_77_FOR_VALUE_ENTRY_Microsoft_Windows_Server_2008_64_Bit 
                              = new javax.cim.UnsignedInteger16("77");
	          	
                       /**
              * constant for value entry Microsoft Windows Server 2008 64-Bit (corresponds to mapEntry 77 )
              */
             public final static String VALUE_ENTRY_Microsoft_Windows_Server_2008_64_Bit 
                              = "Microsoft Windows Server 2008 64-Bit";
                    
       		
          /**
           * constant for value map entry 78
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_78_FOR_VALUE_ENTRY_FreeBSD_64_Bit 
                              = new javax.cim.UnsignedInteger16("78");
	          	
                       /**
              * constant for value entry FreeBSD 64-Bit (corresponds to mapEntry 78 )
              */
             public final static String VALUE_ENTRY_FreeBSD_64_Bit 
                              = "FreeBSD 64-Bit";
                    
       		
          /**
           * constant for value map entry 79
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_79_FOR_VALUE_ENTRY_RedHat_Enterprise_Linux 
                              = new javax.cim.UnsignedInteger16("79");
	          	
                       /**
              * constant for value entry RedHat Enterprise Linux (corresponds to mapEntry 79 )
              */
             public final static String VALUE_ENTRY_RedHat_Enterprise_Linux 
                              = "RedHat Enterprise Linux";
                    
       		
          /**
           * constant for value map entry 80
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_80_FOR_VALUE_ENTRY_RedHat_Enterprise_Linux_64_Bit 
                              = new javax.cim.UnsignedInteger16("80");
	          	
                       /**
              * constant for value entry RedHat Enterprise Linux 64-Bit (corresponds to mapEntry 80 )
              */
             public final static String VALUE_ENTRY_RedHat_Enterprise_Linux_64_Bit 
                              = "RedHat Enterprise Linux 64-Bit";
                    
       		
          /**
           * constant for value map entry 81
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_81_FOR_VALUE_ENTRY_Solaris_64_Bit 
                              = new javax.cim.UnsignedInteger16("81");
	          	
                       /**
              * constant for value entry Solaris 64-Bit (corresponds to mapEntry 81 )
              */
             public final static String VALUE_ENTRY_Solaris_64_Bit 
                              = "Solaris 64-Bit";
                    
       		
          /**
           * constant for value map entry 82
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_82_FOR_VALUE_ENTRY_SUSE 
                              = new javax.cim.UnsignedInteger16("82");
	          	
                       /**
              * constant for value entry SUSE (corresponds to mapEntry 82 )
              */
             public final static String VALUE_ENTRY_SUSE 
                              = "SUSE";
                    
       		
          /**
           * constant for value map entry 83
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_83_FOR_VALUE_ENTRY_SUSE_64_Bit 
                              = new javax.cim.UnsignedInteger16("83");
	          	
                       /**
              * constant for value entry SUSE 64-Bit (corresponds to mapEntry 83 )
              */
             public final static String VALUE_ENTRY_SUSE_64_Bit 
                              = "SUSE 64-Bit";
                    
       		
          /**
           * constant for value map entry 84
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_84_FOR_VALUE_ENTRY_SLES 
                              = new javax.cim.UnsignedInteger16("84");
	          	
                       /**
              * constant for value entry SLES (corresponds to mapEntry 84 )
              */
             public final static String VALUE_ENTRY_SLES 
                              = "SLES";
                    
       		
          /**
           * constant for value map entry 85
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_85_FOR_VALUE_ENTRY_SLES_64_Bit 
                              = new javax.cim.UnsignedInteger16("85");
	          	
                       /**
              * constant for value entry SLES 64-Bit (corresponds to mapEntry 85 )
              */
             public final static String VALUE_ENTRY_SLES_64_Bit 
                              = "SLES 64-Bit";
                    
       		
          /**
           * constant for value map entry 86
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_86_FOR_VALUE_ENTRY_Novell_OES 
                              = new javax.cim.UnsignedInteger16("86");
	          	
                       /**
              * constant for value entry Novell OES (corresponds to mapEntry 86 )
              */
             public final static String VALUE_ENTRY_Novell_OES 
                              = "Novell OES";
                    
       		
          /**
           * constant for value map entry 87
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_87_FOR_VALUE_ENTRY_Novell_Linux_Desktop 
                              = new javax.cim.UnsignedInteger16("87");
	          	
                       /**
              * constant for value entry Novell Linux Desktop (corresponds to mapEntry 87 )
              */
             public final static String VALUE_ENTRY_Novell_Linux_Desktop 
                              = "Novell Linux Desktop";
                    
       		
          /**
           * constant for value map entry 88
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_88_FOR_VALUE_ENTRY_Sun_Java_Desktop_System 
                              = new javax.cim.UnsignedInteger16("88");
	          	
                       /**
              * constant for value entry Sun Java Desktop System (corresponds to mapEntry 88 )
              */
             public final static String VALUE_ENTRY_Sun_Java_Desktop_System 
                              = "Sun Java Desktop System";
                    
       		
          /**
           * constant for value map entry 89
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_89_FOR_VALUE_ENTRY_Mandriva 
                              = new javax.cim.UnsignedInteger16("89");
	          	
                       /**
              * constant for value entry Mandriva (corresponds to mapEntry 89 )
              */
             public final static String VALUE_ENTRY_Mandriva 
                              = "Mandriva";
                    
       		
          /**
           * constant for value map entry 90
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_90_FOR_VALUE_ENTRY_Mandriva_64_Bit 
                              = new javax.cim.UnsignedInteger16("90");
	          	
                       /**
              * constant for value entry Mandriva 64-Bit (corresponds to mapEntry 90 )
              */
             public final static String VALUE_ENTRY_Mandriva_64_Bit 
                              = "Mandriva 64-Bit";
                    
       		
          /**
           * constant for value map entry 91
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_91_FOR_VALUE_ENTRY_TurboLinux 
                              = new javax.cim.UnsignedInteger16("91");
	          	
                       /**
              * constant for value entry TurboLinux (corresponds to mapEntry 91 )
              */
             public final static String VALUE_ENTRY_TurboLinux 
                              = "TurboLinux";
                    
       		
          /**
           * constant for value map entry 92
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_92_FOR_VALUE_ENTRY_TurboLinux_64_Bit 
                              = new javax.cim.UnsignedInteger16("92");
	          	
                       /**
              * constant for value entry TurboLinux 64-Bit (corresponds to mapEntry 92 )
              */
             public final static String VALUE_ENTRY_TurboLinux_64_Bit 
                              = "TurboLinux 64-Bit";
                    
       		
          /**
           * constant for value map entry 93
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_93_FOR_VALUE_ENTRY_Ubuntu 
                              = new javax.cim.UnsignedInteger16("93");
	          	
                       /**
              * constant for value entry Ubuntu (corresponds to mapEntry 93 )
              */
             public final static String VALUE_ENTRY_Ubuntu 
                              = "Ubuntu";
                    
       		
          /**
           * constant for value map entry 94
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_94_FOR_VALUE_ENTRY_Ubuntu_64_Bit 
                              = new javax.cim.UnsignedInteger16("94");
	          	
                       /**
              * constant for value entry Ubuntu 64-Bit (corresponds to mapEntry 94 )
              */
             public final static String VALUE_ENTRY_Ubuntu_64_Bit 
                              = "Ubuntu 64-Bit";
                    
       		
          /**
           * constant for value map entry 95
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_95_FOR_VALUE_ENTRY_Debian 
                              = new javax.cim.UnsignedInteger16("95");
	          	
                       /**
              * constant for value entry Debian (corresponds to mapEntry 95 )
              */
             public final static String VALUE_ENTRY_Debian 
                              = "Debian";
                    
       		
          /**
           * constant for value map entry 96
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_96_FOR_VALUE_ENTRY_Debian_64_Bit 
                              = new javax.cim.UnsignedInteger16("96");
	          	
                       /**
              * constant for value entry Debian 64-Bit (corresponds to mapEntry 96 )
              */
             public final static String VALUE_ENTRY_Debian_64_Bit 
                              = "Debian 64-Bit";
                    
       		
          /**
           * constant for value map entry 97
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_97_FOR_VALUE_ENTRY_Linux_2_4_x 
                              = new javax.cim.UnsignedInteger16("97");
	          	
                       /**
              * constant for value entry Linux 2.4.x (corresponds to mapEntry 97 )
              */
             public final static String VALUE_ENTRY_Linux_2_4_x 
                              = "Linux 2.4.x";
                    
       		
          /**
           * constant for value map entry 98
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_98_FOR_VALUE_ENTRY_Linux_2_4_x_64_Bit 
                              = new javax.cim.UnsignedInteger16("98");
	          	
                       /**
              * constant for value entry Linux 2.4.x 64-Bit (corresponds to mapEntry 98 )
              */
             public final static String VALUE_ENTRY_Linux_2_4_x_64_Bit 
                              = "Linux 2.4.x 64-Bit";
                    
       		
          /**
           * constant for value map entry 99
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_99_FOR_VALUE_ENTRY_Linux_2_6_x 
                              = new javax.cim.UnsignedInteger16("99");
	          	
                       /**
              * constant for value entry Linux 2.6.x (corresponds to mapEntry 99 )
              */
             public final static String VALUE_ENTRY_Linux_2_6_x 
                              = "Linux 2.6.x";
                    
       		
          /**
           * constant for value map entry 100
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_100_FOR_VALUE_ENTRY_Linux_2_6_x_64_Bit 
                              = new javax.cim.UnsignedInteger16("100");
	          	
                       /**
              * constant for value entry Linux 2.6.x 64-Bit (corresponds to mapEntry 100 )
              */
             public final static String VALUE_ENTRY_Linux_2_6_x_64_Bit 
                              = "Linux 2.6.x 64-Bit";
                    
       		
          /**
           * constant for value map entry 101
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_101_FOR_VALUE_ENTRY_Linux_64_Bit 
                              = new javax.cim.UnsignedInteger16("101");
	          	
                       /**
              * constant for value entry Linux 64-Bit (corresponds to mapEntry 101 )
              */
             public final static String VALUE_ENTRY_Linux_64_Bit 
                              = "Linux 64-Bit";
                    
       		
          /**
           * constant for value map entry 102
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_102_FOR_VALUE_ENTRY_Other_64_Bit 
                              = new javax.cim.UnsignedInteger16("102");
	          	
                       /**
              * constant for value entry Other 64-Bit (corresponds to mapEntry 102 )
              */
             public final static String VALUE_ENTRY_Other_64_Bit 
                              = "Other 64-Bit";
                    
                                        /**
                 * get the ValueMapEntry of the given value
                 * @param value the value to find the ValueMapEntry for
                 * @return the ValueMap entry or null if not found
                 */
                public static javax.cim.UnsignedInteger16 getValueMapEntry(String value)
                {
                                                
	                                               if (VALUE_ENTRY_Unknown.equals(value))
                         {
                            return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Other.equals(value))
                         {
                            return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_MACOS.equals(value))
                         {
                            return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_MACOS;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_ATTUNIX.equals(value))
                         {
                            return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_ATTUNIX;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_DGUX.equals(value))
                         {
                            return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_DGUX;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_DECNT.equals(value))
                         {
                            return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_DECNT;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Tru64_UNIX.equals(value))
                         {
                            return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Tru64_UNIX;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_OpenVMS.equals(value))
                         {
                            return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_OpenVMS;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_HPUX.equals(value))
                         {
                            return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_HPUX;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_AIX.equals(value))
                         {
                            return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_AIX;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_MVS.equals(value))
                         {
                            return VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_MVS;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_OS400.equals(value))
                         {
                            return VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_OS400;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_OS_2.equals(value))
                         {
                            return VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_OS_2;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_JavaVM.equals(value))
                         {
                            return VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_JavaVM;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_MSDOS.equals(value))
                         {
                            return VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_MSDOS;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_WIN3x.equals(value))
                         {
                            return VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_WIN3x;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_WIN95.equals(value))
                         {
                            return VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_WIN95;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_WIN98.equals(value))
                         {
                            return VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_WIN98;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_WINNT.equals(value))
                         {
                            return VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_WINNT;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_WINCE.equals(value))
                         {
                            return VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_WINCE;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_NCR3000.equals(value))
                         {
                            return VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_NCR3000;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_NetWare.equals(value))
                         {
                            return VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_NetWare;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_OSF.equals(value))
                         {
                            return VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_OSF;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_DC_OS.equals(value))
                         {
                            return VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_DC_OS;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Reliant_UNIX.equals(value))
                         {
                            return VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_Reliant_UNIX;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_SCO_UnixWare.equals(value))
                         {
                            return VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_SCO_UnixWare;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_SCO_OpenServer.equals(value))
                         {
                            return VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_SCO_OpenServer;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Sequent.equals(value))
                         {
                            return VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_Sequent;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_IRIX.equals(value))
                         {
                            return VALUE_MAP_ENTRY_28_FOR_VALUE_ENTRY_IRIX;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Solaris.equals(value))
                         {
                            return VALUE_MAP_ENTRY_29_FOR_VALUE_ENTRY_Solaris;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_SunOS.equals(value))
                         {
                            return VALUE_MAP_ENTRY_30_FOR_VALUE_ENTRY_SunOS;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_U6000.equals(value))
                         {
                            return VALUE_MAP_ENTRY_31_FOR_VALUE_ENTRY_U6000;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_ASERIES.equals(value))
                         {
                            return VALUE_MAP_ENTRY_32_FOR_VALUE_ENTRY_ASERIES;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_HP_NonStop_OS.equals(value))
                         {
                            return VALUE_MAP_ENTRY_33_FOR_VALUE_ENTRY_HP_NonStop_OS;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_HP_NonStop_OSS.equals(value))
                         {
                            return VALUE_MAP_ENTRY_34_FOR_VALUE_ENTRY_HP_NonStop_OSS;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_BS2000.equals(value))
                         {
                            return VALUE_MAP_ENTRY_35_FOR_VALUE_ENTRY_BS2000;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_LINUX.equals(value))
                         {
                            return VALUE_MAP_ENTRY_36_FOR_VALUE_ENTRY_LINUX;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Lynx.equals(value))
                         {
                            return VALUE_MAP_ENTRY_37_FOR_VALUE_ENTRY_Lynx;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_XENIX.equals(value))
                         {
                            return VALUE_MAP_ENTRY_38_FOR_VALUE_ENTRY_XENIX;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_VM.equals(value))
                         {
                            return VALUE_MAP_ENTRY_39_FOR_VALUE_ENTRY_VM;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Interactive_UNIX.equals(value))
                         {
                            return VALUE_MAP_ENTRY_40_FOR_VALUE_ENTRY_Interactive_UNIX;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_BSDUNIX.equals(value))
                         {
                            return VALUE_MAP_ENTRY_41_FOR_VALUE_ENTRY_BSDUNIX;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_FreeBSD.equals(value))
                         {
                            return VALUE_MAP_ENTRY_42_FOR_VALUE_ENTRY_FreeBSD;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_NetBSD.equals(value))
                         {
                            return VALUE_MAP_ENTRY_43_FOR_VALUE_ENTRY_NetBSD;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_GNU_Hurd.equals(value))
                         {
                            return VALUE_MAP_ENTRY_44_FOR_VALUE_ENTRY_GNU_Hurd;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_OS9.equals(value))
                         {
                            return VALUE_MAP_ENTRY_45_FOR_VALUE_ENTRY_OS9;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_MACH_Kernel.equals(value))
                         {
                            return VALUE_MAP_ENTRY_46_FOR_VALUE_ENTRY_MACH_Kernel;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Inferno.equals(value))
                         {
                            return VALUE_MAP_ENTRY_47_FOR_VALUE_ENTRY_Inferno;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_QNX.equals(value))
                         {
                            return VALUE_MAP_ENTRY_48_FOR_VALUE_ENTRY_QNX;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_EPOC.equals(value))
                         {
                            return VALUE_MAP_ENTRY_49_FOR_VALUE_ENTRY_EPOC;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_IxWorks.equals(value))
                         {
                            return VALUE_MAP_ENTRY_50_FOR_VALUE_ENTRY_IxWorks;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_VxWorks.equals(value))
                         {
                            return VALUE_MAP_ENTRY_51_FOR_VALUE_ENTRY_VxWorks;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_MiNT.equals(value))
                         {
                            return VALUE_MAP_ENTRY_52_FOR_VALUE_ENTRY_MiNT;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_BeOS.equals(value))
                         {
                            return VALUE_MAP_ENTRY_53_FOR_VALUE_ENTRY_BeOS;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_HP_MPE.equals(value))
                         {
                            return VALUE_MAP_ENTRY_54_FOR_VALUE_ENTRY_HP_MPE;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_NextStep.equals(value))
                         {
                            return VALUE_MAP_ENTRY_55_FOR_VALUE_ENTRY_NextStep;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_PalmPilot.equals(value))
                         {
                            return VALUE_MAP_ENTRY_56_FOR_VALUE_ENTRY_PalmPilot;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Rhapsody.equals(value))
                         {
                            return VALUE_MAP_ENTRY_57_FOR_VALUE_ENTRY_Rhapsody;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Windows_2000.equals(value))
                         {
                            return VALUE_MAP_ENTRY_58_FOR_VALUE_ENTRY_Windows_2000;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Dedicated.equals(value))
                         {
                            return VALUE_MAP_ENTRY_59_FOR_VALUE_ENTRY_Dedicated;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_OS_390.equals(value))
                         {
                            return VALUE_MAP_ENTRY_60_FOR_VALUE_ENTRY_OS_390;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_VSE.equals(value))
                         {
                            return VALUE_MAP_ENTRY_61_FOR_VALUE_ENTRY_VSE;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_TPF.equals(value))
                         {
                            return VALUE_MAP_ENTRY_62_FOR_VALUE_ENTRY_TPF;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Windows__R__Me.equals(value))
                         {
                            return VALUE_MAP_ENTRY_63_FOR_VALUE_ENTRY_Windows__R__Me;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Caldera_Open_UNIX.equals(value))
                         {
                            return VALUE_MAP_ENTRY_64_FOR_VALUE_ENTRY_Caldera_Open_UNIX;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_OpenBSD.equals(value))
                         {
                            return VALUE_MAP_ENTRY_65_FOR_VALUE_ENTRY_OpenBSD;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Not_Applicable.equals(value))
                         {
                            return VALUE_MAP_ENTRY_66_FOR_VALUE_ENTRY_Not_Applicable;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Windows_XP.equals(value))
                         {
                            return VALUE_MAP_ENTRY_67_FOR_VALUE_ENTRY_Windows_XP;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_z_OS.equals(value))
                         {
                            return VALUE_MAP_ENTRY_68_FOR_VALUE_ENTRY_z_OS;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Microsoft_Windows_Server_2003.equals(value))
                         {
                            return VALUE_MAP_ENTRY_69_FOR_VALUE_ENTRY_Microsoft_Windows_Server_2003;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Microsoft_Windows_Server_2003_64_Bit.equals(value))
                         {
                            return VALUE_MAP_ENTRY_70_FOR_VALUE_ENTRY_Microsoft_Windows_Server_2003_64_Bit;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Windows_XP_64_Bit.equals(value))
                         {
                            return VALUE_MAP_ENTRY_71_FOR_VALUE_ENTRY_Windows_XP_64_Bit;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Windows_XP_Embedded.equals(value))
                         {
                            return VALUE_MAP_ENTRY_72_FOR_VALUE_ENTRY_Windows_XP_Embedded;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Windows_Vista.equals(value))
                         {
                            return VALUE_MAP_ENTRY_73_FOR_VALUE_ENTRY_Windows_Vista;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Windows_Vista_64_Bit.equals(value))
                         {
                            return VALUE_MAP_ENTRY_74_FOR_VALUE_ENTRY_Windows_Vista_64_Bit;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Windows_Embedded_for_Point_of_Service.equals(value))
                         {
                            return VALUE_MAP_ENTRY_75_FOR_VALUE_ENTRY_Windows_Embedded_for_Point_of_Service;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Microsoft_Windows_Server_2008.equals(value))
                         {
                            return VALUE_MAP_ENTRY_76_FOR_VALUE_ENTRY_Microsoft_Windows_Server_2008;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Microsoft_Windows_Server_2008_64_Bit.equals(value))
                         {
                            return VALUE_MAP_ENTRY_77_FOR_VALUE_ENTRY_Microsoft_Windows_Server_2008_64_Bit;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_FreeBSD_64_Bit.equals(value))
                         {
                            return VALUE_MAP_ENTRY_78_FOR_VALUE_ENTRY_FreeBSD_64_Bit;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_RedHat_Enterprise_Linux.equals(value))
                         {
                            return VALUE_MAP_ENTRY_79_FOR_VALUE_ENTRY_RedHat_Enterprise_Linux;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_RedHat_Enterprise_Linux_64_Bit.equals(value))
                         {
                            return VALUE_MAP_ENTRY_80_FOR_VALUE_ENTRY_RedHat_Enterprise_Linux_64_Bit;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Solaris_64_Bit.equals(value))
                         {
                            return VALUE_MAP_ENTRY_81_FOR_VALUE_ENTRY_Solaris_64_Bit;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_SUSE.equals(value))
                         {
                            return VALUE_MAP_ENTRY_82_FOR_VALUE_ENTRY_SUSE;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_SUSE_64_Bit.equals(value))
                         {
                            return VALUE_MAP_ENTRY_83_FOR_VALUE_ENTRY_SUSE_64_Bit;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_SLES.equals(value))
                         {
                            return VALUE_MAP_ENTRY_84_FOR_VALUE_ENTRY_SLES;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_SLES_64_Bit.equals(value))
                         {
                            return VALUE_MAP_ENTRY_85_FOR_VALUE_ENTRY_SLES_64_Bit;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Novell_OES.equals(value))
                         {
                            return VALUE_MAP_ENTRY_86_FOR_VALUE_ENTRY_Novell_OES;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Novell_Linux_Desktop.equals(value))
                         {
                            return VALUE_MAP_ENTRY_87_FOR_VALUE_ENTRY_Novell_Linux_Desktop;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Sun_Java_Desktop_System.equals(value))
                         {
                            return VALUE_MAP_ENTRY_88_FOR_VALUE_ENTRY_Sun_Java_Desktop_System;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Mandriva.equals(value))
                         {
                            return VALUE_MAP_ENTRY_89_FOR_VALUE_ENTRY_Mandriva;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Mandriva_64_Bit.equals(value))
                         {
                            return VALUE_MAP_ENTRY_90_FOR_VALUE_ENTRY_Mandriva_64_Bit;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_TurboLinux.equals(value))
                         {
                            return VALUE_MAP_ENTRY_91_FOR_VALUE_ENTRY_TurboLinux;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_TurboLinux_64_Bit.equals(value))
                         {
                            return VALUE_MAP_ENTRY_92_FOR_VALUE_ENTRY_TurboLinux_64_Bit;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Ubuntu.equals(value))
                         {
                            return VALUE_MAP_ENTRY_93_FOR_VALUE_ENTRY_Ubuntu;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Ubuntu_64_Bit.equals(value))
                         {
                            return VALUE_MAP_ENTRY_94_FOR_VALUE_ENTRY_Ubuntu_64_Bit;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Debian.equals(value))
                         {
                            return VALUE_MAP_ENTRY_95_FOR_VALUE_ENTRY_Debian;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Debian_64_Bit.equals(value))
                         {
                            return VALUE_MAP_ENTRY_96_FOR_VALUE_ENTRY_Debian_64_Bit;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Linux_2_4_x.equals(value))
                         {
                            return VALUE_MAP_ENTRY_97_FOR_VALUE_ENTRY_Linux_2_4_x;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Linux_2_4_x_64_Bit.equals(value))
                         {
                            return VALUE_MAP_ENTRY_98_FOR_VALUE_ENTRY_Linux_2_4_x_64_Bit;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Linux_2_6_x.equals(value))
                         {
                            return VALUE_MAP_ENTRY_99_FOR_VALUE_ENTRY_Linux_2_6_x;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Linux_2_6_x_64_Bit.equals(value))
                         {
                            return VALUE_MAP_ENTRY_100_FOR_VALUE_ENTRY_Linux_2_6_x_64_Bit;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Linux_64_Bit.equals(value))
                         {
                            return VALUE_MAP_ENTRY_101_FOR_VALUE_ENTRY_Linux_64_Bit;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Other_64_Bit.equals(value))
                         {
                            return VALUE_MAP_ENTRY_102_FOR_VALUE_ENTRY_Other_64_Bit;
                         }
	                      	                   	                                         return null;
                                   
                }
                
                /**
                 * uses the element within array VALUE_ENTRIES_FOR_DISPLAY at index indexInPulldown to get the ValueMapEntry
                 * @param indexInPulldown the index within the pulldown element, the list etc
                 * @return the ValueMap entry from the displayed values
                 */
                public static javax.cim.UnsignedInteger16 getValueMapEntryFromDisplayedValue(Number indexInPulldown)
                {
                   return getValueMapEntry(VALUE_ENTRIES_FOR_DISPLAY[indexInPulldown.intValue()]);
                }
                
               /**
                 * gets the value for the given valueMap entry (currentValue) and gives back the index of this value within the VALUE_ENTRIES_FOR_DISPLAY array
                 *
                 * can be used to set the correct selection index for a pulldown field
                 *
                 * @return -1 if for the currentValue no value within VALUE_ENTRIES_FOR_DISPLAY was found
                 * @param currentValue the currentValue to get the index for
                 */
                public static int getIndexForDisplay(javax.cim.UnsignedInteger16 currentValue)
                {
                   String valueEntry = getValueEntry(currentValue);
                   if (valueEntry != null)
                   {
                      for (int i=0; i < VALUE_ENTRIES_FOR_DISPLAY.length; i++)
                      {
                         if (VALUE_ENTRIES_FOR_DISPLAY[	i].equals(valueEntry))
                         {
                         	   return i;
                         }
                      }
                   }
                  	 return -1;
                   
                }

                /**
                 * get the ValueEntry of the given valueMapEntry
                 * @param valueMapEntry the entry within the valueMap to find the ValueEntry for
                 * @return the Value entry or null if not found
                 */
                
                public static String getValueEntry(javax.cim.UnsignedInteger16 value)
                {
                   int iValue = value.intValue();
                                                                                     
                         if (iValue == VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown.intValue())
                         {
                            return VALUE_ENTRY_Unknown;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other.intValue())
                         {
                            return VALUE_ENTRY_Other;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_MACOS.intValue())
                         {
                            return VALUE_ENTRY_MACOS;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_ATTUNIX.intValue())
                         {
                            return VALUE_ENTRY_ATTUNIX;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_DGUX.intValue())
                         {
                            return VALUE_ENTRY_DGUX;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_DECNT.intValue())
                         {
                            return VALUE_ENTRY_DECNT;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Tru64_UNIX.intValue())
                         {
                            return VALUE_ENTRY_Tru64_UNIX;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_OpenVMS.intValue())
                         {
                            return VALUE_ENTRY_OpenVMS;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_HPUX.intValue())
                         {
                            return VALUE_ENTRY_HPUX;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_AIX.intValue())
                         {
                            return VALUE_ENTRY_AIX;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_MVS.intValue())
                         {
                            return VALUE_ENTRY_MVS;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_OS400.intValue())
                         {
                            return VALUE_ENTRY_OS400;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_OS_2.intValue())
                         {
                            return VALUE_ENTRY_OS_2;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_JavaVM.intValue())
                         {
                            return VALUE_ENTRY_JavaVM;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_MSDOS.intValue())
                         {
                            return VALUE_ENTRY_MSDOS;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_WIN3x.intValue())
                         {
                            return VALUE_ENTRY_WIN3x;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_WIN95.intValue())
                         {
                            return VALUE_ENTRY_WIN95;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_WIN98.intValue())
                         {
                            return VALUE_ENTRY_WIN98;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_WINNT.intValue())
                         {
                            return VALUE_ENTRY_WINNT;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_WINCE.intValue())
                         {
                            return VALUE_ENTRY_WINCE;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_NCR3000.intValue())
                         {
                            return VALUE_ENTRY_NCR3000;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_NetWare.intValue())
                         {
                            return VALUE_ENTRY_NetWare;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_OSF.intValue())
                         {
                            return VALUE_ENTRY_OSF;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_DC_OS.intValue())
                         {
                            return VALUE_ENTRY_DC_OS;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_Reliant_UNIX.intValue())
                         {
                            return VALUE_ENTRY_Reliant_UNIX;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_SCO_UnixWare.intValue())
                         {
                            return VALUE_ENTRY_SCO_UnixWare;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_SCO_OpenServer.intValue())
                         {
                            return VALUE_ENTRY_SCO_OpenServer;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_Sequent.intValue())
                         {
                            return VALUE_ENTRY_Sequent;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_28_FOR_VALUE_ENTRY_IRIX.intValue())
                         {
                            return VALUE_ENTRY_IRIX;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_29_FOR_VALUE_ENTRY_Solaris.intValue())
                         {
                            return VALUE_ENTRY_Solaris;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_30_FOR_VALUE_ENTRY_SunOS.intValue())
                         {
                            return VALUE_ENTRY_SunOS;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_31_FOR_VALUE_ENTRY_U6000.intValue())
                         {
                            return VALUE_ENTRY_U6000;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_32_FOR_VALUE_ENTRY_ASERIES.intValue())
                         {
                            return VALUE_ENTRY_ASERIES;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_33_FOR_VALUE_ENTRY_HP_NonStop_OS.intValue())
                         {
                            return VALUE_ENTRY_HP_NonStop_OS;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_34_FOR_VALUE_ENTRY_HP_NonStop_OSS.intValue())
                         {
                            return VALUE_ENTRY_HP_NonStop_OSS;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_35_FOR_VALUE_ENTRY_BS2000.intValue())
                         {
                            return VALUE_ENTRY_BS2000;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_36_FOR_VALUE_ENTRY_LINUX.intValue())
                         {
                            return VALUE_ENTRY_LINUX;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_37_FOR_VALUE_ENTRY_Lynx.intValue())
                         {
                            return VALUE_ENTRY_Lynx;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_38_FOR_VALUE_ENTRY_XENIX.intValue())
                         {
                            return VALUE_ENTRY_XENIX;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_39_FOR_VALUE_ENTRY_VM.intValue())
                         {
                            return VALUE_ENTRY_VM;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_40_FOR_VALUE_ENTRY_Interactive_UNIX.intValue())
                         {
                            return VALUE_ENTRY_Interactive_UNIX;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_41_FOR_VALUE_ENTRY_BSDUNIX.intValue())
                         {
                            return VALUE_ENTRY_BSDUNIX;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_42_FOR_VALUE_ENTRY_FreeBSD.intValue())
                         {
                            return VALUE_ENTRY_FreeBSD;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_43_FOR_VALUE_ENTRY_NetBSD.intValue())
                         {
                            return VALUE_ENTRY_NetBSD;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_44_FOR_VALUE_ENTRY_GNU_Hurd.intValue())
                         {
                            return VALUE_ENTRY_GNU_Hurd;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_45_FOR_VALUE_ENTRY_OS9.intValue())
                         {
                            return VALUE_ENTRY_OS9;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_46_FOR_VALUE_ENTRY_MACH_Kernel.intValue())
                         {
                            return VALUE_ENTRY_MACH_Kernel;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_47_FOR_VALUE_ENTRY_Inferno.intValue())
                         {
                            return VALUE_ENTRY_Inferno;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_48_FOR_VALUE_ENTRY_QNX.intValue())
                         {
                            return VALUE_ENTRY_QNX;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_49_FOR_VALUE_ENTRY_EPOC.intValue())
                         {
                            return VALUE_ENTRY_EPOC;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_50_FOR_VALUE_ENTRY_IxWorks.intValue())
                         {
                            return VALUE_ENTRY_IxWorks;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_51_FOR_VALUE_ENTRY_VxWorks.intValue())
                         {
                            return VALUE_ENTRY_VxWorks;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_52_FOR_VALUE_ENTRY_MiNT.intValue())
                         {
                            return VALUE_ENTRY_MiNT;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_53_FOR_VALUE_ENTRY_BeOS.intValue())
                         {
                            return VALUE_ENTRY_BeOS;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_54_FOR_VALUE_ENTRY_HP_MPE.intValue())
                         {
                            return VALUE_ENTRY_HP_MPE;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_55_FOR_VALUE_ENTRY_NextStep.intValue())
                         {
                            return VALUE_ENTRY_NextStep;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_56_FOR_VALUE_ENTRY_PalmPilot.intValue())
                         {
                            return VALUE_ENTRY_PalmPilot;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_57_FOR_VALUE_ENTRY_Rhapsody.intValue())
                         {
                            return VALUE_ENTRY_Rhapsody;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_58_FOR_VALUE_ENTRY_Windows_2000.intValue())
                         {
                            return VALUE_ENTRY_Windows_2000;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_59_FOR_VALUE_ENTRY_Dedicated.intValue())
                         {
                            return VALUE_ENTRY_Dedicated;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_60_FOR_VALUE_ENTRY_OS_390.intValue())
                         {
                            return VALUE_ENTRY_OS_390;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_61_FOR_VALUE_ENTRY_VSE.intValue())
                         {
                            return VALUE_ENTRY_VSE;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_62_FOR_VALUE_ENTRY_TPF.intValue())
                         {
                            return VALUE_ENTRY_TPF;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_63_FOR_VALUE_ENTRY_Windows__R__Me.intValue())
                         {
                            return VALUE_ENTRY_Windows__R__Me;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_64_FOR_VALUE_ENTRY_Caldera_Open_UNIX.intValue())
                         {
                            return VALUE_ENTRY_Caldera_Open_UNIX;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_65_FOR_VALUE_ENTRY_OpenBSD.intValue())
                         {
                            return VALUE_ENTRY_OpenBSD;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_66_FOR_VALUE_ENTRY_Not_Applicable.intValue())
                         {
                            return VALUE_ENTRY_Not_Applicable;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_67_FOR_VALUE_ENTRY_Windows_XP.intValue())
                         {
                            return VALUE_ENTRY_Windows_XP;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_68_FOR_VALUE_ENTRY_z_OS.intValue())
                         {
                            return VALUE_ENTRY_z_OS;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_69_FOR_VALUE_ENTRY_Microsoft_Windows_Server_2003.intValue())
                         {
                            return VALUE_ENTRY_Microsoft_Windows_Server_2003;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_70_FOR_VALUE_ENTRY_Microsoft_Windows_Server_2003_64_Bit.intValue())
                         {
                            return VALUE_ENTRY_Microsoft_Windows_Server_2003_64_Bit;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_71_FOR_VALUE_ENTRY_Windows_XP_64_Bit.intValue())
                         {
                            return VALUE_ENTRY_Windows_XP_64_Bit;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_72_FOR_VALUE_ENTRY_Windows_XP_Embedded.intValue())
                         {
                            return VALUE_ENTRY_Windows_XP_Embedded;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_73_FOR_VALUE_ENTRY_Windows_Vista.intValue())
                         {
                            return VALUE_ENTRY_Windows_Vista;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_74_FOR_VALUE_ENTRY_Windows_Vista_64_Bit.intValue())
                         {
                            return VALUE_ENTRY_Windows_Vista_64_Bit;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_75_FOR_VALUE_ENTRY_Windows_Embedded_for_Point_of_Service.intValue())
                         {
                            return VALUE_ENTRY_Windows_Embedded_for_Point_of_Service;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_76_FOR_VALUE_ENTRY_Microsoft_Windows_Server_2008.intValue())
                         {
                            return VALUE_ENTRY_Microsoft_Windows_Server_2008;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_77_FOR_VALUE_ENTRY_Microsoft_Windows_Server_2008_64_Bit.intValue())
                         {
                            return VALUE_ENTRY_Microsoft_Windows_Server_2008_64_Bit;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_78_FOR_VALUE_ENTRY_FreeBSD_64_Bit.intValue())
                         {
                            return VALUE_ENTRY_FreeBSD_64_Bit;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_79_FOR_VALUE_ENTRY_RedHat_Enterprise_Linux.intValue())
                         {
                            return VALUE_ENTRY_RedHat_Enterprise_Linux;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_80_FOR_VALUE_ENTRY_RedHat_Enterprise_Linux_64_Bit.intValue())
                         {
                            return VALUE_ENTRY_RedHat_Enterprise_Linux_64_Bit;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_81_FOR_VALUE_ENTRY_Solaris_64_Bit.intValue())
                         {
                            return VALUE_ENTRY_Solaris_64_Bit;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_82_FOR_VALUE_ENTRY_SUSE.intValue())
                         {
                            return VALUE_ENTRY_SUSE;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_83_FOR_VALUE_ENTRY_SUSE_64_Bit.intValue())
                         {
                            return VALUE_ENTRY_SUSE_64_Bit;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_84_FOR_VALUE_ENTRY_SLES.intValue())
                         {
                            return VALUE_ENTRY_SLES;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_85_FOR_VALUE_ENTRY_SLES_64_Bit.intValue())
                         {
                            return VALUE_ENTRY_SLES_64_Bit;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_86_FOR_VALUE_ENTRY_Novell_OES.intValue())
                         {
                            return VALUE_ENTRY_Novell_OES;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_87_FOR_VALUE_ENTRY_Novell_Linux_Desktop.intValue())
                         {
                            return VALUE_ENTRY_Novell_Linux_Desktop;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_88_FOR_VALUE_ENTRY_Sun_Java_Desktop_System.intValue())
                         {
                            return VALUE_ENTRY_Sun_Java_Desktop_System;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_89_FOR_VALUE_ENTRY_Mandriva.intValue())
                         {
                            return VALUE_ENTRY_Mandriva;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_90_FOR_VALUE_ENTRY_Mandriva_64_Bit.intValue())
                         {
                            return VALUE_ENTRY_Mandriva_64_Bit;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_91_FOR_VALUE_ENTRY_TurboLinux.intValue())
                         {
                            return VALUE_ENTRY_TurboLinux;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_92_FOR_VALUE_ENTRY_TurboLinux_64_Bit.intValue())
                         {
                            return VALUE_ENTRY_TurboLinux_64_Bit;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_93_FOR_VALUE_ENTRY_Ubuntu.intValue())
                         {
                            return VALUE_ENTRY_Ubuntu;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_94_FOR_VALUE_ENTRY_Ubuntu_64_Bit.intValue())
                         {
                            return VALUE_ENTRY_Ubuntu_64_Bit;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_95_FOR_VALUE_ENTRY_Debian.intValue())
                         {
                            return VALUE_ENTRY_Debian;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_96_FOR_VALUE_ENTRY_Debian_64_Bit.intValue())
                         {
                            return VALUE_ENTRY_Debian_64_Bit;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_97_FOR_VALUE_ENTRY_Linux_2_4_x.intValue())
                         {
                            return VALUE_ENTRY_Linux_2_4_x;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_98_FOR_VALUE_ENTRY_Linux_2_4_x_64_Bit.intValue())
                         {
                            return VALUE_ENTRY_Linux_2_4_x_64_Bit;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_99_FOR_VALUE_ENTRY_Linux_2_6_x.intValue())
                         {
                            return VALUE_ENTRY_Linux_2_6_x;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_100_FOR_VALUE_ENTRY_Linux_2_6_x_64_Bit.intValue())
                         {
                            return VALUE_ENTRY_Linux_2_6_x_64_Bit;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_101_FOR_VALUE_ENTRY_Linux_64_Bit.intValue())
                         {
                            return VALUE_ENTRY_Linux_64_Bit;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_102_FOR_VALUE_ENTRY_Other_64_Bit.intValue())
                         {
                            return VALUE_ENTRY_Other_64_Bit;
                         }
                                                                                  return null;
                                   
                }
          
                          
                /**
                 * get the ValueEntries of the given valueMapEntries
                 * @param values the values to find the ValueMapEntries for
                 * @return the array with ValueMap entries. Some of them may be null to if no valueMap entry was found
                 */
                 
                public static javax.cim.UnsignedInteger16[] getValueMapEntries(String[] values)
                {
                    javax.cim.UnsignedInteger16[] result = new javax.cim.UnsignedInteger16[values.length];
                    
                    for (int i=0; i < result.length; i++)
                    {
	                       result[i] = getValueMapEntry(values[i]);
                    }
                    
                    return result;
                }
                
                
                /**
                 * get the ValueMapEntries of the given valueEntries
                 * @param valueMapEntries the valueMap entries to find the Values for
                 * @return the array with Value entries. Some of them may be null to if no value entry was found
                 */          
                
                public static String[] getValueEntries(javax.cim.UnsignedInteger16[] values)
                {
                    String[] result = new String[values.length];
                    
                    for (int i=0; i < result.length; i++)
                    {
	                       result[i] = getValueEntry(values[i]);
                    }
                    
                    return result;
                }
                                    
          /**
	       * ValueMap entries
       * Contains no entries that having an integer value range representation
       * 
       * The couterpart for the value entries is returned by VALUE_ENTRIES_FOR_DISPLAY
       *
       * @see \#VALUE_ENTRIES_FOR_DISPLAY
       * 
       * Value Map for the property TargetOSTypes   
       */
      public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = { 
	         	                              VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown
                     	                            ,  VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other
                     	                            ,  VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_MACOS
                     	                            ,  VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_ATTUNIX
                     	                            ,  VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_DGUX
                     	                            ,  VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_DECNT
                     	                            ,  VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Tru64_UNIX
                     	                            ,  VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_OpenVMS
                     	                            ,  VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_HPUX
                     	                            ,  VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_AIX
                     	                            ,  VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_MVS
                     	                            ,  VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_OS400
                     	                            ,  VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_OS_2
                     	                            ,  VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_JavaVM
                     	                            ,  VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_MSDOS
                     	                            ,  VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_WIN3x
                     	                            ,  VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_WIN95
                     	                            ,  VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_WIN98
                     	                            ,  VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_WINNT
                     	                            ,  VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_WINCE
                     	                            ,  VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_NCR3000
                     	                            ,  VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_NetWare
                     	                            ,  VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_OSF
                     	                            ,  VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_DC_OS
                     	                            ,  VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_Reliant_UNIX
                     	                            ,  VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_SCO_UnixWare
                     	                            ,  VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_SCO_OpenServer
                     	                            ,  VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_Sequent
                     	                            ,  VALUE_MAP_ENTRY_28_FOR_VALUE_ENTRY_IRIX
                     	                            ,  VALUE_MAP_ENTRY_29_FOR_VALUE_ENTRY_Solaris
                     	                            ,  VALUE_MAP_ENTRY_30_FOR_VALUE_ENTRY_SunOS
                     	                            ,  VALUE_MAP_ENTRY_31_FOR_VALUE_ENTRY_U6000
                     	                            ,  VALUE_MAP_ENTRY_32_FOR_VALUE_ENTRY_ASERIES
                     	                            ,  VALUE_MAP_ENTRY_33_FOR_VALUE_ENTRY_HP_NonStop_OS
                     	                            ,  VALUE_MAP_ENTRY_34_FOR_VALUE_ENTRY_HP_NonStop_OSS
                     	                            ,  VALUE_MAP_ENTRY_35_FOR_VALUE_ENTRY_BS2000
                     	                            ,  VALUE_MAP_ENTRY_36_FOR_VALUE_ENTRY_LINUX
                     	                            ,  VALUE_MAP_ENTRY_37_FOR_VALUE_ENTRY_Lynx
                     	                            ,  VALUE_MAP_ENTRY_38_FOR_VALUE_ENTRY_XENIX
                     	                            ,  VALUE_MAP_ENTRY_39_FOR_VALUE_ENTRY_VM
                     	                            ,  VALUE_MAP_ENTRY_40_FOR_VALUE_ENTRY_Interactive_UNIX
                     	                            ,  VALUE_MAP_ENTRY_41_FOR_VALUE_ENTRY_BSDUNIX
                     	                            ,  VALUE_MAP_ENTRY_42_FOR_VALUE_ENTRY_FreeBSD
                     	                            ,  VALUE_MAP_ENTRY_43_FOR_VALUE_ENTRY_NetBSD
                     	                            ,  VALUE_MAP_ENTRY_44_FOR_VALUE_ENTRY_GNU_Hurd
                     	                            ,  VALUE_MAP_ENTRY_45_FOR_VALUE_ENTRY_OS9
                     	                            ,  VALUE_MAP_ENTRY_46_FOR_VALUE_ENTRY_MACH_Kernel
                     	                            ,  VALUE_MAP_ENTRY_47_FOR_VALUE_ENTRY_Inferno
                     	                            ,  VALUE_MAP_ENTRY_48_FOR_VALUE_ENTRY_QNX
                     	                            ,  VALUE_MAP_ENTRY_49_FOR_VALUE_ENTRY_EPOC
                     	                            ,  VALUE_MAP_ENTRY_50_FOR_VALUE_ENTRY_IxWorks
                     	                            ,  VALUE_MAP_ENTRY_51_FOR_VALUE_ENTRY_VxWorks
                     	                            ,  VALUE_MAP_ENTRY_52_FOR_VALUE_ENTRY_MiNT
                     	                            ,  VALUE_MAP_ENTRY_53_FOR_VALUE_ENTRY_BeOS
                     	                            ,  VALUE_MAP_ENTRY_54_FOR_VALUE_ENTRY_HP_MPE
                     	                            ,  VALUE_MAP_ENTRY_55_FOR_VALUE_ENTRY_NextStep
                     	                            ,  VALUE_MAP_ENTRY_56_FOR_VALUE_ENTRY_PalmPilot
                     	                            ,  VALUE_MAP_ENTRY_57_FOR_VALUE_ENTRY_Rhapsody
                     	                            ,  VALUE_MAP_ENTRY_58_FOR_VALUE_ENTRY_Windows_2000
                     	                            ,  VALUE_MAP_ENTRY_59_FOR_VALUE_ENTRY_Dedicated
                     	                            ,  VALUE_MAP_ENTRY_60_FOR_VALUE_ENTRY_OS_390
                     	                            ,  VALUE_MAP_ENTRY_61_FOR_VALUE_ENTRY_VSE
                     	                            ,  VALUE_MAP_ENTRY_62_FOR_VALUE_ENTRY_TPF
                     	                            ,  VALUE_MAP_ENTRY_63_FOR_VALUE_ENTRY_Windows__R__Me
                     	                            ,  VALUE_MAP_ENTRY_64_FOR_VALUE_ENTRY_Caldera_Open_UNIX
                     	                            ,  VALUE_MAP_ENTRY_65_FOR_VALUE_ENTRY_OpenBSD
                     	                            ,  VALUE_MAP_ENTRY_66_FOR_VALUE_ENTRY_Not_Applicable
                     	                            ,  VALUE_MAP_ENTRY_67_FOR_VALUE_ENTRY_Windows_XP
                     	                            ,  VALUE_MAP_ENTRY_68_FOR_VALUE_ENTRY_z_OS
                     	                            ,  VALUE_MAP_ENTRY_69_FOR_VALUE_ENTRY_Microsoft_Windows_Server_2003
                     	                            ,  VALUE_MAP_ENTRY_70_FOR_VALUE_ENTRY_Microsoft_Windows_Server_2003_64_Bit
                     	                            ,  VALUE_MAP_ENTRY_71_FOR_VALUE_ENTRY_Windows_XP_64_Bit
                     	                            ,  VALUE_MAP_ENTRY_72_FOR_VALUE_ENTRY_Windows_XP_Embedded
                     	                            ,  VALUE_MAP_ENTRY_73_FOR_VALUE_ENTRY_Windows_Vista
                     	                            ,  VALUE_MAP_ENTRY_74_FOR_VALUE_ENTRY_Windows_Vista_64_Bit
                     	                            ,  VALUE_MAP_ENTRY_75_FOR_VALUE_ENTRY_Windows_Embedded_for_Point_of_Service
                     	                            ,  VALUE_MAP_ENTRY_76_FOR_VALUE_ENTRY_Microsoft_Windows_Server_2008
                     	                            ,  VALUE_MAP_ENTRY_77_FOR_VALUE_ENTRY_Microsoft_Windows_Server_2008_64_Bit
                     	                            ,  VALUE_MAP_ENTRY_78_FOR_VALUE_ENTRY_FreeBSD_64_Bit
                     	                            ,  VALUE_MAP_ENTRY_79_FOR_VALUE_ENTRY_RedHat_Enterprise_Linux
                     	                            ,  VALUE_MAP_ENTRY_80_FOR_VALUE_ENTRY_RedHat_Enterprise_Linux_64_Bit
                     	                            ,  VALUE_MAP_ENTRY_81_FOR_VALUE_ENTRY_Solaris_64_Bit
                     	                            ,  VALUE_MAP_ENTRY_82_FOR_VALUE_ENTRY_SUSE
                     	                            ,  VALUE_MAP_ENTRY_83_FOR_VALUE_ENTRY_SUSE_64_Bit
                     	                            ,  VALUE_MAP_ENTRY_84_FOR_VALUE_ENTRY_SLES
                     	                            ,  VALUE_MAP_ENTRY_85_FOR_VALUE_ENTRY_SLES_64_Bit
                     	                            ,  VALUE_MAP_ENTRY_86_FOR_VALUE_ENTRY_Novell_OES
                     	                            ,  VALUE_MAP_ENTRY_87_FOR_VALUE_ENTRY_Novell_Linux_Desktop
                     	                            ,  VALUE_MAP_ENTRY_88_FOR_VALUE_ENTRY_Sun_Java_Desktop_System
                     	                            ,  VALUE_MAP_ENTRY_89_FOR_VALUE_ENTRY_Mandriva
                     	                            ,  VALUE_MAP_ENTRY_90_FOR_VALUE_ENTRY_Mandriva_64_Bit
                     	                            ,  VALUE_MAP_ENTRY_91_FOR_VALUE_ENTRY_TurboLinux
                     	                            ,  VALUE_MAP_ENTRY_92_FOR_VALUE_ENTRY_TurboLinux_64_Bit
                     	                            ,  VALUE_MAP_ENTRY_93_FOR_VALUE_ENTRY_Ubuntu
                     	                            ,  VALUE_MAP_ENTRY_94_FOR_VALUE_ENTRY_Ubuntu_64_Bit
                     	                            ,  VALUE_MAP_ENTRY_95_FOR_VALUE_ENTRY_Debian
                     	                            ,  VALUE_MAP_ENTRY_96_FOR_VALUE_ENTRY_Debian_64_Bit
                     	                            ,  VALUE_MAP_ENTRY_97_FOR_VALUE_ENTRY_Linux_2_4_x
                     	                            ,  VALUE_MAP_ENTRY_98_FOR_VALUE_ENTRY_Linux_2_4_x_64_Bit
                     	                            ,  VALUE_MAP_ENTRY_99_FOR_VALUE_ENTRY_Linux_2_6_x
                     	                            ,  VALUE_MAP_ENTRY_100_FOR_VALUE_ENTRY_Linux_2_6_x_64_Bit
                     	                            ,  VALUE_MAP_ENTRY_101_FOR_VALUE_ENTRY_Linux_64_Bit
                     	                            ,  VALUE_MAP_ENTRY_102_FOR_VALUE_ENTRY_Other_64_Bit
                           };
    	
	           /**
        * Values
        * Contains all values even those having an integer value range representation within the valueMap
        * Value Map for the property TargetOSTypes   
        */
       public final static String[] VALUE_ENTRIES = { 
                                                   VALUE_ENTRY_Unknown
                                                                 ,  VALUE_ENTRY_Other
                                                                 ,  VALUE_ENTRY_MACOS
                                                                 ,  VALUE_ENTRY_ATTUNIX
                                                                 ,  VALUE_ENTRY_DGUX
                                                                 ,  VALUE_ENTRY_DECNT
                                                                 ,  VALUE_ENTRY_Tru64_UNIX
                                                                 ,  VALUE_ENTRY_OpenVMS
                                                                 ,  VALUE_ENTRY_HPUX
                                                                 ,  VALUE_ENTRY_AIX
                                                                 ,  VALUE_ENTRY_MVS
                                                                 ,  VALUE_ENTRY_OS400
                                                                 ,  VALUE_ENTRY_OS_2
                                                                 ,  VALUE_ENTRY_JavaVM
                                                                 ,  VALUE_ENTRY_MSDOS
                                                                 ,  VALUE_ENTRY_WIN3x
                                                                 ,  VALUE_ENTRY_WIN95
                                                                 ,  VALUE_ENTRY_WIN98
                                                                 ,  VALUE_ENTRY_WINNT
                                                                 ,  VALUE_ENTRY_WINCE
                                                                 ,  VALUE_ENTRY_NCR3000
                                                                 ,  VALUE_ENTRY_NetWare
                                                                 ,  VALUE_ENTRY_OSF
                                                                 ,  VALUE_ENTRY_DC_OS
                                                                 ,  VALUE_ENTRY_Reliant_UNIX
                                                                 ,  VALUE_ENTRY_SCO_UnixWare
                                                                 ,  VALUE_ENTRY_SCO_OpenServer
                                                                 ,  VALUE_ENTRY_Sequent
                                                                 ,  VALUE_ENTRY_IRIX
                                                                 ,  VALUE_ENTRY_Solaris
                                                                 ,  VALUE_ENTRY_SunOS
                                                                 ,  VALUE_ENTRY_U6000
                                                                 ,  VALUE_ENTRY_ASERIES
                                                                 ,  VALUE_ENTRY_HP_NonStop_OS
                                                                 ,  VALUE_ENTRY_HP_NonStop_OSS
                                                                 ,  VALUE_ENTRY_BS2000
                                                                 ,  VALUE_ENTRY_LINUX
                                                                 ,  VALUE_ENTRY_Lynx
                                                                 ,  VALUE_ENTRY_XENIX
                                                                 ,  VALUE_ENTRY_VM
                                                                 ,  VALUE_ENTRY_Interactive_UNIX
                                                                 ,  VALUE_ENTRY_BSDUNIX
                                                                 ,  VALUE_ENTRY_FreeBSD
                                                                 ,  VALUE_ENTRY_NetBSD
                                                                 ,  VALUE_ENTRY_GNU_Hurd
                                                                 ,  VALUE_ENTRY_OS9
                                                                 ,  VALUE_ENTRY_MACH_Kernel
                                                                 ,  VALUE_ENTRY_Inferno
                                                                 ,  VALUE_ENTRY_QNX
                                                                 ,  VALUE_ENTRY_EPOC
                                                                 ,  VALUE_ENTRY_IxWorks
                                                                 ,  VALUE_ENTRY_VxWorks
                                                                 ,  VALUE_ENTRY_MiNT
                                                                 ,  VALUE_ENTRY_BeOS
                                                                 ,  VALUE_ENTRY_HP_MPE
                                                                 ,  VALUE_ENTRY_NextStep
                                                                 ,  VALUE_ENTRY_PalmPilot
                                                                 ,  VALUE_ENTRY_Rhapsody
                                                                 ,  VALUE_ENTRY_Windows_2000
                                                                 ,  VALUE_ENTRY_Dedicated
                                                                 ,  VALUE_ENTRY_OS_390
                                                                 ,  VALUE_ENTRY_VSE
                                                                 ,  VALUE_ENTRY_TPF
                                                                 ,  VALUE_ENTRY_Windows__R__Me
                                                                 ,  VALUE_ENTRY_Caldera_Open_UNIX
                                                                 ,  VALUE_ENTRY_OpenBSD
                                                                 ,  VALUE_ENTRY_Not_Applicable
                                                                 ,  VALUE_ENTRY_Windows_XP
                                                                 ,  VALUE_ENTRY_z_OS
                                                                 ,  VALUE_ENTRY_Microsoft_Windows_Server_2003
                                                                 ,  VALUE_ENTRY_Microsoft_Windows_Server_2003_64_Bit
                                                                 ,  VALUE_ENTRY_Windows_XP_64_Bit
                                                                 ,  VALUE_ENTRY_Windows_XP_Embedded
                                                                 ,  VALUE_ENTRY_Windows_Vista
                                                                 ,  VALUE_ENTRY_Windows_Vista_64_Bit
                                                                 ,  VALUE_ENTRY_Windows_Embedded_for_Point_of_Service
                                                                 ,  VALUE_ENTRY_Microsoft_Windows_Server_2008
                                                                 ,  VALUE_ENTRY_Microsoft_Windows_Server_2008_64_Bit
                                                                 ,  VALUE_ENTRY_FreeBSD_64_Bit
                                                                 ,  VALUE_ENTRY_RedHat_Enterprise_Linux
                                                                 ,  VALUE_ENTRY_RedHat_Enterprise_Linux_64_Bit
                                                                 ,  VALUE_ENTRY_Solaris_64_Bit
                                                                 ,  VALUE_ENTRY_SUSE
                                                                 ,  VALUE_ENTRY_SUSE_64_Bit
                                                                 ,  VALUE_ENTRY_SLES
                                                                 ,  VALUE_ENTRY_SLES_64_Bit
                                                                 ,  VALUE_ENTRY_Novell_OES
                                                                 ,  VALUE_ENTRY_Novell_Linux_Desktop
                                                                 ,  VALUE_ENTRY_Sun_Java_Desktop_System
                                                                 ,  VALUE_ENTRY_Mandriva
                                                                 ,  VALUE_ENTRY_Mandriva_64_Bit
                                                                 ,  VALUE_ENTRY_TurboLinux
                                                                 ,  VALUE_ENTRY_TurboLinux_64_Bit
                                                                 ,  VALUE_ENTRY_Ubuntu
                                                                 ,  VALUE_ENTRY_Ubuntu_64_Bit
                                                                 ,  VALUE_ENTRY_Debian
                                                                 ,  VALUE_ENTRY_Debian_64_Bit
                                                                 ,  VALUE_ENTRY_Linux_2_4_x
                                                                 ,  VALUE_ENTRY_Linux_2_4_x_64_Bit
                                                                 ,  VALUE_ENTRY_Linux_2_6_x
                                                                 ,  VALUE_ENTRY_Linux_2_6_x_64_Bit
                                                                 ,  VALUE_ENTRY_Linux_64_Bit
                                                                 ,  VALUE_ENTRY_Other_64_Bit
                                    };

              /**
        * Values for displaying within pulldown elements, lists, radio buttons etc
        * Contains no values that having an integer value range representation within the valueMap
        * 
        * Value Map for the property TargetOSTypes   
        */
       public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { 
                                                   VALUE_ENTRY_Unknown
                                                                 ,  VALUE_ENTRY_Other
                                                                 ,  VALUE_ENTRY_MACOS
                                                                 ,  VALUE_ENTRY_ATTUNIX
                                                                 ,  VALUE_ENTRY_DGUX
                                                                 ,  VALUE_ENTRY_DECNT
                                                                 ,  VALUE_ENTRY_Tru64_UNIX
                                                                 ,  VALUE_ENTRY_OpenVMS
                                                                 ,  VALUE_ENTRY_HPUX
                                                                 ,  VALUE_ENTRY_AIX
                                                                 ,  VALUE_ENTRY_MVS
                                                                 ,  VALUE_ENTRY_OS400
                                                                 ,  VALUE_ENTRY_OS_2
                                                                 ,  VALUE_ENTRY_JavaVM
                                                                 ,  VALUE_ENTRY_MSDOS
                                                                 ,  VALUE_ENTRY_WIN3x
                                                                 ,  VALUE_ENTRY_WIN95
                                                                 ,  VALUE_ENTRY_WIN98
                                                                 ,  VALUE_ENTRY_WINNT
                                                                 ,  VALUE_ENTRY_WINCE
                                                                 ,  VALUE_ENTRY_NCR3000
                                                                 ,  VALUE_ENTRY_NetWare
                                                                 ,  VALUE_ENTRY_OSF
                                                                 ,  VALUE_ENTRY_DC_OS
                                                                 ,  VALUE_ENTRY_Reliant_UNIX
                                                                 ,  VALUE_ENTRY_SCO_UnixWare
                                                                 ,  VALUE_ENTRY_SCO_OpenServer
                                                                 ,  VALUE_ENTRY_Sequent
                                                                 ,  VALUE_ENTRY_IRIX
                                                                 ,  VALUE_ENTRY_Solaris
                                                                 ,  VALUE_ENTRY_SunOS
                                                                 ,  VALUE_ENTRY_U6000
                                                                 ,  VALUE_ENTRY_ASERIES
                                                                 ,  VALUE_ENTRY_HP_NonStop_OS
                                                                 ,  VALUE_ENTRY_HP_NonStop_OSS
                                                                 ,  VALUE_ENTRY_BS2000
                                                                 ,  VALUE_ENTRY_LINUX
                                                                 ,  VALUE_ENTRY_Lynx
                                                                 ,  VALUE_ENTRY_XENIX
                                                                 ,  VALUE_ENTRY_VM
                                                                 ,  VALUE_ENTRY_Interactive_UNIX
                                                                 ,  VALUE_ENTRY_BSDUNIX
                                                                 ,  VALUE_ENTRY_FreeBSD
                                                                 ,  VALUE_ENTRY_NetBSD
                                                                 ,  VALUE_ENTRY_GNU_Hurd
                                                                 ,  VALUE_ENTRY_OS9
                                                                 ,  VALUE_ENTRY_MACH_Kernel
                                                                 ,  VALUE_ENTRY_Inferno
                                                                 ,  VALUE_ENTRY_QNX
                                                                 ,  VALUE_ENTRY_EPOC
                                                                 ,  VALUE_ENTRY_IxWorks
                                                                 ,  VALUE_ENTRY_VxWorks
                                                                 ,  VALUE_ENTRY_MiNT
                                                                 ,  VALUE_ENTRY_BeOS
                                                                 ,  VALUE_ENTRY_HP_MPE
                                                                 ,  VALUE_ENTRY_NextStep
                                                                 ,  VALUE_ENTRY_PalmPilot
                                                                 ,  VALUE_ENTRY_Rhapsody
                                                                 ,  VALUE_ENTRY_Windows_2000
                                                                 ,  VALUE_ENTRY_Dedicated
                                                                 ,  VALUE_ENTRY_OS_390
                                                                 ,  VALUE_ENTRY_VSE
                                                                 ,  VALUE_ENTRY_TPF
                                                                 ,  VALUE_ENTRY_Windows__R__Me
                                                                 ,  VALUE_ENTRY_Caldera_Open_UNIX
                                                                 ,  VALUE_ENTRY_OpenBSD
                                                                 ,  VALUE_ENTRY_Not_Applicable
                                                                 ,  VALUE_ENTRY_Windows_XP
                                                                 ,  VALUE_ENTRY_z_OS
                                                                 ,  VALUE_ENTRY_Microsoft_Windows_Server_2003
                                                                 ,  VALUE_ENTRY_Microsoft_Windows_Server_2003_64_Bit
                                                                 ,  VALUE_ENTRY_Windows_XP_64_Bit
                                                                 ,  VALUE_ENTRY_Windows_XP_Embedded
                                                                 ,  VALUE_ENTRY_Windows_Vista
                                                                 ,  VALUE_ENTRY_Windows_Vista_64_Bit
                                                                 ,  VALUE_ENTRY_Windows_Embedded_for_Point_of_Service
                                                                 ,  VALUE_ENTRY_Microsoft_Windows_Server_2008
                                                                 ,  VALUE_ENTRY_Microsoft_Windows_Server_2008_64_Bit
                                                                 ,  VALUE_ENTRY_FreeBSD_64_Bit
                                                                 ,  VALUE_ENTRY_RedHat_Enterprise_Linux
                                                                 ,  VALUE_ENTRY_RedHat_Enterprise_Linux_64_Bit
                                                                 ,  VALUE_ENTRY_Solaris_64_Bit
                                                                 ,  VALUE_ENTRY_SUSE
                                                                 ,  VALUE_ENTRY_SUSE_64_Bit
                                                                 ,  VALUE_ENTRY_SLES
                                                                 ,  VALUE_ENTRY_SLES_64_Bit
                                                                 ,  VALUE_ENTRY_Novell_OES
                                                                 ,  VALUE_ENTRY_Novell_Linux_Desktop
                                                                 ,  VALUE_ENTRY_Sun_Java_Desktop_System
                                                                 ,  VALUE_ENTRY_Mandriva
                                                                 ,  VALUE_ENTRY_Mandriva_64_Bit
                                                                 ,  VALUE_ENTRY_TurboLinux
                                                                 ,  VALUE_ENTRY_TurboLinux_64_Bit
                                                                 ,  VALUE_ENTRY_Ubuntu
                                                                 ,  VALUE_ENTRY_Ubuntu_64_Bit
                                                                 ,  VALUE_ENTRY_Debian
                                                                 ,  VALUE_ENTRY_Debian_64_Bit
                                                                 ,  VALUE_ENTRY_Linux_2_4_x
                                                                 ,  VALUE_ENTRY_Linux_2_4_x_64_Bit
                                                                 ,  VALUE_ENTRY_Linux_2_6_x
                                                                 ,  VALUE_ENTRY_Linux_2_6_x_64_Bit
                                                                 ,  VALUE_ENTRY_Linux_64_Bit
                                                                 ,  VALUE_ENTRY_Other_64_Bit
                                    };

        
		    
	
	    
	    }
	    
	    /**
	     * Constants of property TargetOperatingSystems
     * Specifies the target operating systems of the software. This property should be used when a target operating system is not listed in the TargetOSTypes array values.
     */
    public static class PROPERTY_TARGETOPERATINGSYSTEMS
    {
       /**
        * name of the property TargetOperatingSystems
        */
       public final static String NAME = "TargetOperatingSystems";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property VersionString
     * A string representing the complete software version information - for example, '12.1(3)T'. This string and the numeric major/minor/revision/build properties are complementary. Since vastly different representations and semantics exist for versions, it is not assumed that one representation is sufficient to permit a client to perform computations (i.e., the values are numeric) and a user to recognize the software's version (i.e., the values are understandable and readable). Hence, both numeric and string representations of version are provided.
     */
    public static class PROPERTY_VERSIONSTRING
    {
       /**
        * name of the property VersionString
        */
       public final static String NAME = "VersionString";                  

	    	
    

    		    
	
	    
	    }
	    	    

   

    
    static {    
           addPackage("org.sblim.wbemsmt.schema.cim221");
                         String[] parentClassPackageList = CIM_LogicalElement.getPackages();
        
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
    *   SoftwareIdentity provides descriptive information about a software component for asset tracking and/or installation dependency management. When the IsEntity property has the value TRUE, the instance of SoftwareIdentity represents an individually identifiable entity similar to Physical Element. SoftwareIdentity does NOT indicate whether the software is installed, executing, etc. This extra information may be provided through specialized associations to Software Identity. For instance, both InstalledSoftwareIdentity and ElementSoftwareIdentity may be used to indicate that the software identified by this class is installed. SoftwareIdentity is used when managing the software components of a ManagedElement that is the management focus. Since software may be acquired, SoftwareIdentity can be associated with a Product using the ProductSoftwareComponent relationship. The Application Model manages the deployment and installation of software via the classes, SoftwareFeatures and SoftwareElements. SoftwareFeature and SoftwareElement are used when the software component is the management focus. The deployment/installation concepts are related to the asset/identity one. In fact, a SoftwareIdentity may correspond to a Product, or to one or more SoftwareFeatures or SoftwareElements - depending on the granularity of these classes and the deployment model. The correspondence of Software Identity to Product, SoftwareFeature or SoftwareElement is indicated using the ConcreteIdentity association. Note that there may not be sufficient detail or instrumentation to instantiate ConcreteIdentity. And, if the association is instantiated, some duplication of information may result. For example, the Vendor described in the instances of Product and SoftwareIdentity MAY be the same. However, this is not necessarily true, and it is why vendor and similar information are duplicated in this class. 
     * Note that ConcreteIdentity can also be used to describe the relationship of the software to any LogicalFiles that result from installing it. As above, there may not be sufficient detail or instrumentation to instantiate this association.
    *   @param client the CIM Client
    *   @param namespace the target namespace
    */  

      
   public CIM_SoftwareIdentity(WBEMClient client, String namespace) throws WbemsmtException
   {
       CIMClass cls = getClass(client,namespace);
       setFromServer(false);
       init(cls.newInstance(),true);
   }
        
   /**
    *   Class constructor
    * 
    *       *   <br>
    *   SoftwareIdentity provides descriptive information about a software component for asset tracking and/or installation dependency management. When the IsEntity property has the value TRUE, the instance of SoftwareIdentity represents an individually identifiable entity similar to Physical Element. SoftwareIdentity does NOT indicate whether the software is installed, executing, etc. This extra information may be provided through specialized associations to Software Identity. For instance, both InstalledSoftwareIdentity and ElementSoftwareIdentity may be used to indicate that the software identified by this class is installed. SoftwareIdentity is used when managing the software components of a ManagedElement that is the management focus. Since software may be acquired, SoftwareIdentity can be associated with a Product using the ProductSoftwareComponent relationship. The Application Model manages the deployment and installation of software via the classes, SoftwareFeatures and SoftwareElements. SoftwareFeature and SoftwareElement are used when the software component is the management focus. The deployment/installation concepts are related to the asset/identity one. In fact, a SoftwareIdentity may correspond to a Product, or to one or more SoftwareFeatures or SoftwareElements - depending on the granularity of these classes and the deployment model. The correspondence of Software Identity to Product, SoftwareFeature or SoftwareElement is indicated using the ConcreteIdentity association. Note that there may not be sufficient detail or instrumentation to instantiate ConcreteIdentity. And, if the association is instantiated, some duplication of information may result. For example, the Vendor described in the instances of Product and SoftwareIdentity MAY be the same. However, this is not necessarily true, and it is why vendor and similar information are duplicated in this class. 
     * Note that ConcreteIdentity can also be used to describe the relationship of the software to any LogicalFiles that result from installing it. As above, there may not be sufficient detail or instrumentation to instantiate this association.
    *   @param cimInstance the instance that is used to create the Object
    */  
   
   public CIM_SoftwareIdentity(CIMInstance cimInstance)  throws WbemsmtException { 
        
       if (cimInstance == null) {
           throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER, "The cimInstance parameter does not contain a valid reference.");
       }
       setFromServer(true);
       init(cimInstance,false);
   }
   
   /**
    * Default constructor
    */
   protected CIM_SoftwareIdentity()
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
              propertiesToCheck.put("BuildNumber",new CIMProperty("BuildNumber",CIMDataType.UINT16_T,null));
              propertiesToCheck.put("ClassificationDescriptions",new CIMProperty("ClassificationDescriptions",CIMDataType.STRING_ARRAY_T,null));
              propertiesToCheck.put("Classifications",new CIMProperty("Classifications",CIMDataType.UINT16_ARRAY_T,null));
              propertiesToCheck.put("IdentityInfoType",new CIMProperty("IdentityInfoType",CIMDataType.STRING_ARRAY_T,null));
              propertiesToCheck.put("IdentityInfoValue",new CIMProperty("IdentityInfoValue",CIMDataType.STRING_ARRAY_T,null));
              propertiesToCheck.put("InstanceID",new CIMProperty("InstanceID",CIMDataType.STRING_T,null));
              propertiesToCheck.put("IsEntity",new CIMProperty("IsEntity",CIMDataType.BOOLEAN_T,null));
              propertiesToCheck.put("Languages",new CIMProperty("Languages",CIMDataType.STRING_ARRAY_T,null));
              propertiesToCheck.put("MajorVersion",new CIMProperty("MajorVersion",CIMDataType.UINT16_T,null));
              propertiesToCheck.put("Manufacturer",new CIMProperty("Manufacturer",CIMDataType.STRING_T,null));
              propertiesToCheck.put("MinorVersion",new CIMProperty("MinorVersion",CIMDataType.UINT16_T,null));
              propertiesToCheck.put("ReleaseDate",new CIMProperty("ReleaseDate",CIMDataType.DATETIME_T,null));
              propertiesToCheck.put("RevisionNumber",new CIMProperty("RevisionNumber",CIMDataType.UINT16_T,null));
              propertiesToCheck.put("SerialNumber",new CIMProperty("SerialNumber",CIMDataType.STRING_T,null));
              propertiesToCheck.put("TargetOSTypes",new CIMProperty("TargetOSTypes",CIMDataType.UINT16_ARRAY_T,null));
              propertiesToCheck.put("TargetOperatingSystems",new CIMProperty("TargetOperatingSystems",CIMDataType.STRING_ARRAY_T,null));
              propertiesToCheck.put("VersionString",new CIMProperty("VersionString",CIMDataType.STRING_T,null));
       	
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
    * Get the property BuildNumber
    *     * <br>
    * The build number of the software.
    *     */

      

               
   public javax.cim.UnsignedInteger16 get_BuildNumber()    {
       CIMProperty currentProperty = getProperty(PROPERTY_BUILDNUMBER.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_BUILDNUMBER.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (javax.cim.UnsignedInteger16)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property BuildNumber
    * <br>
    * The build number of the software.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_BuildNumber(javax.cim.UnsignedInteger16 newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_BUILDNUMBER.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_BuildNumber(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_BUILDNUMBER.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property BuildNumber by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_BuildNumber(WBEMClient client, String namespace, javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_SoftwareIdentity fco = new CIM_SoftwareIdentity(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_BUILDNUMBER.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_BuildNumber(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_BUILDNUMBER.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property BuildNumber
    * <br>
    * The build number of the software.
    */
    
   private static CIMProperty setPropertyValue_BuildNumber(CIMProperty currentProperty, javax.cim.UnsignedInteger16 newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property ClassificationDescriptions
    *     * <br>
    * An array of free-form strings providing more detailed explanations for any of the entries in the Classifications array. Note that each entry is related to one in the Classifications array located at the same index.
    *     */

      

               
   public String[] get_ClassificationDescriptions()    {
       CIMProperty currentProperty = getProperty(PROPERTY_CLASSIFICATIONDESCRIPTIONS.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_CLASSIFICATIONDESCRIPTIONS.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String[])currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property ClassificationDescriptions
    * <br>
    * An array of free-form strings providing more detailed explanations for any of the entries in the Classifications array. Note that each entry is related to one in the Classifications array located at the same index.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_ClassificationDescriptions(String[] newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_CLASSIFICATIONDESCRIPTIONS.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_ClassificationDescriptions(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_CLASSIFICATIONDESCRIPTIONS.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property ClassificationDescriptions by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ClassificationDescriptions(WBEMClient client, String namespace, String[] newValue) throws WbemsmtException {
        CIM_SoftwareIdentity fco = new CIM_SoftwareIdentity(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CLASSIFICATIONDESCRIPTIONS.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_ClassificationDescriptions(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_CLASSIFICATIONDESCRIPTIONS.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property ClassificationDescriptions
    * <br>
    * An array of free-form strings providing more detailed explanations for any of the entries in the Classifications array. Note that each entry is related to one in the Classifications array located at the same index.
    */
    
   private static CIMProperty setPropertyValue_ClassificationDescriptions(CIMProperty currentProperty, String[] newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property Classifications
    *     * <br>
    * An array of enumerated integers that classify this software. For example, the software MAY be instrumentation (value=5) or firmware and diagnostic software (10 and 7). The use of value 6, Firmware/BIOS, is being deprecated. Instead, either the value 10 (Firmware) and/or 11 (BIOS/FCode) SHOULD be used. The value 13, Software Bundle, identifies a software package consisting of multiple discrete software instances that can be installed individually or together.
     * Each contained software instance is represented by an instance of SoftwareIdentity that is associated to this instance of SoftwareIdentityinstance via a Component association.
    *     */

      

               
   public javax.cim.UnsignedInteger16[] get_Classifications()    {
       CIMProperty currentProperty = getProperty(PROPERTY_CLASSIFICATIONS.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_CLASSIFICATIONS.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (javax.cim.UnsignedInteger16[])currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property Classifications
    * <br>
    * An array of enumerated integers that classify this software. For example, the software MAY be instrumentation (value=5) or firmware and diagnostic software (10 and 7). The use of value 6, Firmware/BIOS, is being deprecated. Instead, either the value 10 (Firmware) and/or 11 (BIOS/FCode) SHOULD be used. The value 13, Software Bundle, identifies a software package consisting of multiple discrete software instances that can be installed individually or together.
     * Each contained software instance is represented by an instance of SoftwareIdentity that is associated to this instance of SoftwareIdentityinstance via a Component association.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_Classifications(javax.cim.UnsignedInteger16[] newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_CLASSIFICATIONS.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_Classifications(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_CLASSIFICATIONS.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property Classifications by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Classifications(WBEMClient client, String namespace, javax.cim.UnsignedInteger16[] newValue) throws WbemsmtException {
        CIM_SoftwareIdentity fco = new CIM_SoftwareIdentity(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CLASSIFICATIONS.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_Classifications(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_CLASSIFICATIONS.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property Classifications
    * <br>
    * An array of enumerated integers that classify this software. For example, the software MAY be instrumentation (value=5) or firmware and diagnostic software (10 and 7). The use of value 6, Firmware/BIOS, is being deprecated. Instead, either the value 10 (Firmware) and/or 11 (BIOS/FCode) SHOULD be used. The value 13, Software Bundle, identifies a software package consisting of multiple discrete software instances that can be installed individually or together.
     * Each contained software instance is represented by an instance of SoftwareIdentity that is associated to this instance of SoftwareIdentityinstance via a Component association.
    */
    
   private static CIMProperty setPropertyValue_Classifications(CIMProperty currentProperty, javax.cim.UnsignedInteger16[] newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property IdentityInfoType
    *     * <br>
    * An indexed array of fixed-form strings that provide the description of the type of information that is stored in the corresponding component of the IdentityInfoValue array. The elements of this property array describe the type of the value in the corresponding elements of the IndetityInfoValue array. When the IdentityInfoValue property is implemented, the IdentityInfoType property MUST be implemented. To insure uniqueness the IdentityInfoType property SHOULD be formatted using the following algorithm: < OrgID > : < LocalID > Where < OrgID > and < LocalID > are separated by a colon (:), and where < OrgID > MUST include a copyrighted, trademarked, or otherwise unique name that is owned by the business entity that is creating or defining the IdentityInfoType or that is a registered ID assigned to the business entity by a recognized global authority. (This requirement is similar to the < Schema Name > _ < Class Name > structure of Schema class names.) In addition, to ensure uniqueness, < OrgID > MUST NOT contain a colon (:). When using this algorithm, the first colon to appear in IdentityInfoType MUST appear between < OrgID > and < LocalID > . < LocalID > is chosen by the business entity and SHOULD NOT be reused to identify different underlying software elements.
    *     */

      

               
   public String[] get_IdentityInfoType()    {
       CIMProperty currentProperty = getProperty(PROPERTY_IDENTITYINFOTYPE.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_IDENTITYINFOTYPE.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String[])currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property IdentityInfoType
    * <br>
    * An indexed array of fixed-form strings that provide the description of the type of information that is stored in the corresponding component of the IdentityInfoValue array. The elements of this property array describe the type of the value in the corresponding elements of the IndetityInfoValue array. When the IdentityInfoValue property is implemented, the IdentityInfoType property MUST be implemented. To insure uniqueness the IdentityInfoType property SHOULD be formatted using the following algorithm: < OrgID > : < LocalID > Where < OrgID > and < LocalID > are separated by a colon (:), and where < OrgID > MUST include a copyrighted, trademarked, or otherwise unique name that is owned by the business entity that is creating or defining the IdentityInfoType or that is a registered ID assigned to the business entity by a recognized global authority. (This requirement is similar to the < Schema Name > _ < Class Name > structure of Schema class names.) In addition, to ensure uniqueness, < OrgID > MUST NOT contain a colon (:). When using this algorithm, the first colon to appear in IdentityInfoType MUST appear between < OrgID > and < LocalID > . < LocalID > is chosen by the business entity and SHOULD NOT be reused to identify different underlying software elements.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_IdentityInfoType(String[] newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_IDENTITYINFOTYPE.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_IdentityInfoType(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_IDENTITYINFOTYPE.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property IdentityInfoType by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_IdentityInfoType(WBEMClient client, String namespace, String[] newValue) throws WbemsmtException {
        CIM_SoftwareIdentity fco = new CIM_SoftwareIdentity(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_IDENTITYINFOTYPE.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_IdentityInfoType(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_IDENTITYINFOTYPE.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property IdentityInfoType
    * <br>
    * An indexed array of fixed-form strings that provide the description of the type of information that is stored in the corresponding component of the IdentityInfoValue array. The elements of this property array describe the type of the value in the corresponding elements of the IndetityInfoValue array. When the IdentityInfoValue property is implemented, the IdentityInfoType property MUST be implemented. To insure uniqueness the IdentityInfoType property SHOULD be formatted using the following algorithm: < OrgID > : < LocalID > Where < OrgID > and < LocalID > are separated by a colon (:), and where < OrgID > MUST include a copyrighted, trademarked, or otherwise unique name that is owned by the business entity that is creating or defining the IdentityInfoType or that is a registered ID assigned to the business entity by a recognized global authority. (This requirement is similar to the < Schema Name > _ < Class Name > structure of Schema class names.) In addition, to ensure uniqueness, < OrgID > MUST NOT contain a colon (:). When using this algorithm, the first colon to appear in IdentityInfoType MUST appear between < OrgID > and < LocalID > . < LocalID > is chosen by the business entity and SHOULD NOT be reused to identify different underlying software elements.
    */
    
   private static CIMProperty setPropertyValue_IdentityInfoType(CIMProperty currentProperty, String[] newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property IdentityInfoValue
    *     * <br>
    * IdentityInfoValue captures additional information that MAY be used by an organization to describe or identify a software instance within the context of the organization. For example, large organizations may have several ways to address or identify a particular instance of software depending on where it is stored; a catalog, a web site, or for whom it is intended; development, customer service, etc. The indexed array property IdentityInfoValue contains 0 or more strings that contain a specific identity info string value. IdentityInfoValue is mapped and indexed to IdentityInfoType. When the IdentityInfoValue property is implemented, the IdentityInfoType property MUST be implemented and shall be formatted using the algorithm provided in the IdentityInfoType property Description.
    *     */

      

               
   public String[] get_IdentityInfoValue()    {
       CIMProperty currentProperty = getProperty(PROPERTY_IDENTITYINFOVALUE.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_IDENTITYINFOVALUE.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String[])currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property IdentityInfoValue
    * <br>
    * IdentityInfoValue captures additional information that MAY be used by an organization to describe or identify a software instance within the context of the organization. For example, large organizations may have several ways to address or identify a particular instance of software depending on where it is stored; a catalog, a web site, or for whom it is intended; development, customer service, etc. The indexed array property IdentityInfoValue contains 0 or more strings that contain a specific identity info string value. IdentityInfoValue is mapped and indexed to IdentityInfoType. When the IdentityInfoValue property is implemented, the IdentityInfoType property MUST be implemented and shall be formatted using the algorithm provided in the IdentityInfoType property Description.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_IdentityInfoValue(String[] newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_IDENTITYINFOVALUE.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_IdentityInfoValue(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_IDENTITYINFOVALUE.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property IdentityInfoValue by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_IdentityInfoValue(WBEMClient client, String namespace, String[] newValue) throws WbemsmtException {
        CIM_SoftwareIdentity fco = new CIM_SoftwareIdentity(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_IDENTITYINFOVALUE.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_IdentityInfoValue(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_IDENTITYINFOVALUE.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property IdentityInfoValue
    * <br>
    * IdentityInfoValue captures additional information that MAY be used by an organization to describe or identify a software instance within the context of the organization. For example, large organizations may have several ways to address or identify a particular instance of software depending on where it is stored; a catalog, a web site, or for whom it is intended; development, customer service, etc. The indexed array property IdentityInfoValue contains 0 or more strings that contain a specific identity info string value. IdentityInfoValue is mapped and indexed to IdentityInfoType. When the IdentityInfoValue property is implemented, the IdentityInfoType property MUST be implemented and shall be formatted using the algorithm provided in the IdentityInfoType property Description.
    */
    
   private static CIMProperty setPropertyValue_IdentityInfoValue(CIMProperty currentProperty, String[] newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property InstanceID
    *     * <br>
    * Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. In order to ensure uniqueness within the NameSpace, the value of InstanceID SHOULD be constructed using the following 'preferred' algorithm: 
     * <OrgID>:<LocalID> 
     * Where <OrgID> and <LocalID> are separated by a colon ':', and where <OrgID> MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity creating/defining the InstanceID, or is a registered ID that is assigned to the business entity by a recognized global authority (This is similar to the <Schema Name>_<Class Name> structure of Schema class names.) In addition, to ensure uniqueness <OrgID> MUST NOT contain a colon (':'). When using this algorithm, the first colon to appear in InstanceID MUST appear between <OrgID> and <LocalID>. 
     * <LocalID> is chosen by the business entity and SHOULD not be re-used to identify different underlying (real-world) elements. If the above 'preferred' algorithm is not used, the defining entity MUST assure that the resultant InstanceID is not re-used across any InstanceIDs produced by this or other providers for this instance's NameSpace. 
     * For DMTF defined instances, the 'preferred' algorithm MUST be used with the <OrgID> set to 'CIM'.
    *     */

      

               
   public String get_key_InstanceID()    {
       CIMProperty currentProperty = getProperty(PROPERTY_INSTANCEID.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_INSTANCEID.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property InstanceID
    * <br>
    * Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. In order to ensure uniqueness within the NameSpace, the value of InstanceID SHOULD be constructed using the following 'preferred' algorithm: 
     * <OrgID>:<LocalID> 
     * Where <OrgID> and <LocalID> are separated by a colon ':', and where <OrgID> MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity creating/defining the InstanceID, or is a registered ID that is assigned to the business entity by a recognized global authority (This is similar to the <Schema Name>_<Class Name> structure of Schema class names.) In addition, to ensure uniqueness <OrgID> MUST NOT contain a colon (':'). When using this algorithm, the first colon to appear in InstanceID MUST appear between <OrgID> and <LocalID>. 
     * <LocalID> is chosen by the business entity and SHOULD not be re-used to identify different underlying (real-world) elements. If the above 'preferred' algorithm is not used, the defining entity MUST assure that the resultant InstanceID is not re-used across any InstanceIDs produced by this or other providers for this instance's NameSpace. 
     * For DMTF defined instances, the 'preferred' algorithm MUST be used with the <OrgID> set to 'CIM'.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_key_InstanceID(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_INSTANCEID.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_key_InstanceID(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_INSTANCEID.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property InstanceID by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_key_InstanceID(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        CIM_SoftwareIdentity fco = new CIM_SoftwareIdentity(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_INSTANCEID.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_key_InstanceID(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_INSTANCEID.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property InstanceID
    * <br>
    * Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. In order to ensure uniqueness within the NameSpace, the value of InstanceID SHOULD be constructed using the following 'preferred' algorithm: 
     * <OrgID>:<LocalID> 
     * Where <OrgID> and <LocalID> are separated by a colon ':', and where <OrgID> MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity creating/defining the InstanceID, or is a registered ID that is assigned to the business entity by a recognized global authority (This is similar to the <Schema Name>_<Class Name> structure of Schema class names.) In addition, to ensure uniqueness <OrgID> MUST NOT contain a colon (':'). When using this algorithm, the first colon to appear in InstanceID MUST appear between <OrgID> and <LocalID>. 
     * <LocalID> is chosen by the business entity and SHOULD not be re-used to identify different underlying (real-world) elements. If the above 'preferred' algorithm is not used, the defining entity MUST assure that the resultant InstanceID is not re-used across any InstanceIDs produced by this or other providers for this instance's NameSpace. 
     * For DMTF defined instances, the 'preferred' algorithm MUST be used with the <OrgID> set to 'CIM'.
    */
    
   private static CIMProperty setPropertyValue_key_InstanceID(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property IsEntity
    *     * <br>
    * The IsEntity property is used to indicate whether the SoftwareIdentity corresponds to a discrete copy of the software component or is being used to convey descriptive and identifying information about software that is not present in the management domain.A value of TRUE shall indicate that the SoftwareIdentity instance corresponds to a discrete copy of the software component. A value of FALSE shall indicate that the SoftwareIdentity instance does not correspond to a discrete copy of the Software.
    *     */

      

               
   public Boolean get_IsEntity()    {
       CIMProperty currentProperty = getProperty(PROPERTY_ISENTITY.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_ISENTITY.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (Boolean)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property IsEntity
    * <br>
    * The IsEntity property is used to indicate whether the SoftwareIdentity corresponds to a discrete copy of the software component or is being used to convey descriptive and identifying information about software that is not present in the management domain.A value of TRUE shall indicate that the SoftwareIdentity instance corresponds to a discrete copy of the software component. A value of FALSE shall indicate that the SoftwareIdentity instance does not correspond to a discrete copy of the Software.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_IsEntity(Boolean newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_ISENTITY.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_IsEntity(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_ISENTITY.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property IsEntity by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_IsEntity(WBEMClient client, String namespace, Boolean newValue) throws WbemsmtException {
        CIM_SoftwareIdentity fco = new CIM_SoftwareIdentity(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ISENTITY.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_IsEntity(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_ISENTITY.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property IsEntity
    * <br>
    * The IsEntity property is used to indicate whether the SoftwareIdentity corresponds to a discrete copy of the software component or is being used to convey descriptive and identifying information about software that is not present in the management domain.A value of TRUE shall indicate that the SoftwareIdentity instance corresponds to a discrete copy of the software component. A value of FALSE shall indicate that the SoftwareIdentity instance does not correspond to a discrete copy of the Software.
    */
    
   private static CIMProperty setPropertyValue_IsEntity(CIMProperty currentProperty, Boolean newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property Languages
    *     * <br>
    * The language editions supported by the software. The language codes defined in ISO 639 should be used.
    *     */

      

               
   public String[] get_Languages()    {
       CIMProperty currentProperty = getProperty(PROPERTY_LANGUAGES.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_LANGUAGES.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String[])currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property Languages
    * <br>
    * The language editions supported by the software. The language codes defined in ISO 639 should be used.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_Languages(String[] newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_LANGUAGES.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_Languages(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_LANGUAGES.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property Languages by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Languages(WBEMClient client, String namespace, String[] newValue) throws WbemsmtException {
        CIM_SoftwareIdentity fco = new CIM_SoftwareIdentity(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_LANGUAGES.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_Languages(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_LANGUAGES.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property Languages
    * <br>
    * The language editions supported by the software. The language codes defined in ISO 639 should be used.
    */
    
   private static CIMProperty setPropertyValue_Languages(CIMProperty currentProperty, String[] newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property MajorVersion
    *     * <br>
    * The major number component of the software's version information - for example, '12' from version 12.1(3)T. This property is defined as a numeric value to allow the determination of 'newer' vs. 'older' releases. A 'newer' major release is indicated by a larger numeric value.
    *     */

      

               
   public javax.cim.UnsignedInteger16 get_MajorVersion()    {
       CIMProperty currentProperty = getProperty(PROPERTY_MAJORVERSION.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_MAJORVERSION.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (javax.cim.UnsignedInteger16)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property MajorVersion
    * <br>
    * The major number component of the software's version information - for example, '12' from version 12.1(3)T. This property is defined as a numeric value to allow the determination of 'newer' vs. 'older' releases. A 'newer' major release is indicated by a larger numeric value.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_MajorVersion(javax.cim.UnsignedInteger16 newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_MAJORVERSION.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_MajorVersion(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_MAJORVERSION.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property MajorVersion by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_MajorVersion(WBEMClient client, String namespace, javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_SoftwareIdentity fco = new CIM_SoftwareIdentity(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MAJORVERSION.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_MajorVersion(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_MAJORVERSION.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property MajorVersion
    * <br>
    * The major number component of the software's version information - for example, '12' from version 12.1(3)T. This property is defined as a numeric value to allow the determination of 'newer' vs. 'older' releases. A 'newer' major release is indicated by a larger numeric value.
    */
    
   private static CIMProperty setPropertyValue_MajorVersion(CIMProperty currentProperty, javax.cim.UnsignedInteger16 newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property Manufacturer
    *     * <br>
    * Manufacturer of this software.
    *     */

      

               
   public String get_Manufacturer()    {
       CIMProperty currentProperty = getProperty(PROPERTY_MANUFACTURER.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_MANUFACTURER.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property Manufacturer
    * <br>
    * Manufacturer of this software.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_Manufacturer(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_MANUFACTURER.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_Manufacturer(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_MANUFACTURER.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property Manufacturer by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Manufacturer(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        CIM_SoftwareIdentity fco = new CIM_SoftwareIdentity(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MANUFACTURER.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_Manufacturer(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_MANUFACTURER.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property Manufacturer
    * <br>
    * Manufacturer of this software.
    */
    
   private static CIMProperty setPropertyValue_Manufacturer(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property MinorVersion
    *     * <br>
    * The minor number component of the software's version information - for example, '1' from version 12.1(3)T. This property is defined as a numeric value to allow the determination of 'newer' vs. 'older' releases. A 'newer' minor release is indicated by a larger numeric value.
    *     */

      

               
   public javax.cim.UnsignedInteger16 get_MinorVersion()    {
       CIMProperty currentProperty = getProperty(PROPERTY_MINORVERSION.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_MINORVERSION.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (javax.cim.UnsignedInteger16)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property MinorVersion
    * <br>
    * The minor number component of the software's version information - for example, '1' from version 12.1(3)T. This property is defined as a numeric value to allow the determination of 'newer' vs. 'older' releases. A 'newer' minor release is indicated by a larger numeric value.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_MinorVersion(javax.cim.UnsignedInteger16 newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_MINORVERSION.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_MinorVersion(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_MINORVERSION.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property MinorVersion by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_MinorVersion(WBEMClient client, String namespace, javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_SoftwareIdentity fco = new CIM_SoftwareIdentity(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MINORVERSION.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_MinorVersion(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_MINORVERSION.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property MinorVersion
    * <br>
    * The minor number component of the software's version information - for example, '1' from version 12.1(3)T. This property is defined as a numeric value to allow the determination of 'newer' vs. 'older' releases. A 'newer' minor release is indicated by a larger numeric value.
    */
    
   private static CIMProperty setPropertyValue_MinorVersion(CIMProperty currentProperty, javax.cim.UnsignedInteger16 newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property ReleaseDate
    *     * <br>
    * The date the software was released.
    *     */

      

               
   public javax.cim.CIMDateTime get_ReleaseDate()    {
       CIMProperty currentProperty = getProperty(PROPERTY_RELEASEDATE.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_RELEASEDATE.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (javax.cim.CIMDateTime)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property ReleaseDate
    * <br>
    * The date the software was released.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_ReleaseDate(javax.cim.CIMDateTime newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_RELEASEDATE.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_ReleaseDate(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_RELEASEDATE.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property ReleaseDate by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ReleaseDate(WBEMClient client, String namespace, javax.cim.CIMDateTime newValue) throws WbemsmtException {
        CIM_SoftwareIdentity fco = new CIM_SoftwareIdentity(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_RELEASEDATE.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_ReleaseDate(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_RELEASEDATE.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property ReleaseDate
    * <br>
    * The date the software was released.
    */
    
   private static CIMProperty setPropertyValue_ReleaseDate(CIMProperty currentProperty, javax.cim.CIMDateTime newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property RevisionNumber
    *     * <br>
    * The revision or maintenance release component of the software's version information - for example, '3' from version 12.1(3)T. This property is defined as a numeric value to allow the determination of 'newer' vs. 'older' releases. A 'newer' revision is indicated by a larger numeric value.
    *     */

      

               
   public javax.cim.UnsignedInteger16 get_RevisionNumber()    {
       CIMProperty currentProperty = getProperty(PROPERTY_REVISIONNUMBER.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_REVISIONNUMBER.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (javax.cim.UnsignedInteger16)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property RevisionNumber
    * <br>
    * The revision or maintenance release component of the software's version information - for example, '3' from version 12.1(3)T. This property is defined as a numeric value to allow the determination of 'newer' vs. 'older' releases. A 'newer' revision is indicated by a larger numeric value.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_RevisionNumber(javax.cim.UnsignedInteger16 newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_REVISIONNUMBER.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_RevisionNumber(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_REVISIONNUMBER.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property RevisionNumber by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_RevisionNumber(WBEMClient client, String namespace, javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_SoftwareIdentity fco = new CIM_SoftwareIdentity(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_REVISIONNUMBER.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_RevisionNumber(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_REVISIONNUMBER.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property RevisionNumber
    * <br>
    * The revision or maintenance release component of the software's version information - for example, '3' from version 12.1(3)T. This property is defined as a numeric value to allow the determination of 'newer' vs. 'older' releases. A 'newer' revision is indicated by a larger numeric value.
    */
    
   private static CIMProperty setPropertyValue_RevisionNumber(CIMProperty currentProperty, javax.cim.UnsignedInteger16 newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property SerialNumber
    *     * <br>
    * A manufacturer-allocated number used to identify the software.
    *     */

      

               
   public String get_SerialNumber()    {
       CIMProperty currentProperty = getProperty(PROPERTY_SERIALNUMBER.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_SERIALNUMBER.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property SerialNumber
    * <br>
    * A manufacturer-allocated number used to identify the software.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_SerialNumber(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_SERIALNUMBER.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_SerialNumber(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_SERIALNUMBER.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property SerialNumber by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SerialNumber(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        CIM_SoftwareIdentity fco = new CIM_SoftwareIdentity(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SERIALNUMBER.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_SerialNumber(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_SERIALNUMBER.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property SerialNumber
    * <br>
    * A manufacturer-allocated number used to identify the software.
    */
    
   private static CIMProperty setPropertyValue_SerialNumber(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property TargetOSTypes
    *     * <br>
    * The TargetOSTypes property specifies the target operating systems supported by the software. When the target operating system of the software is not listed in the enumeration values, TargetOperatingSystems[] property should be used to specify the target operating system.
    *     */

      

               
   public javax.cim.UnsignedInteger16[] get_TargetOSTypes()    {
       CIMProperty currentProperty = getProperty(PROPERTY_TARGETOSTYPES.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_TARGETOSTYPES.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (javax.cim.UnsignedInteger16[])currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property TargetOSTypes
    * <br>
    * The TargetOSTypes property specifies the target operating systems supported by the software. When the target operating system of the software is not listed in the enumeration values, TargetOperatingSystems[] property should be used to specify the target operating system.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_TargetOSTypes(javax.cim.UnsignedInteger16[] newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_TARGETOSTYPES.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_TargetOSTypes(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_TARGETOSTYPES.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property TargetOSTypes by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_TargetOSTypes(WBEMClient client, String namespace, javax.cim.UnsignedInteger16[] newValue) throws WbemsmtException {
        CIM_SoftwareIdentity fco = new CIM_SoftwareIdentity(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_TARGETOSTYPES.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_TargetOSTypes(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_TARGETOSTYPES.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property TargetOSTypes
    * <br>
    * The TargetOSTypes property specifies the target operating systems supported by the software. When the target operating system of the software is not listed in the enumeration values, TargetOperatingSystems[] property should be used to specify the target operating system.
    */
    
   private static CIMProperty setPropertyValue_TargetOSTypes(CIMProperty currentProperty, javax.cim.UnsignedInteger16[] newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property TargetOperatingSystems
    *     * <br>
    * Specifies the target operating systems of the software. This property should be used when a target operating system is not listed in the TargetOSTypes array values.
    *     */

      

               
   public String[] get_TargetOperatingSystems()    {
       CIMProperty currentProperty = getProperty(PROPERTY_TARGETOPERATINGSYSTEMS.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_TARGETOPERATINGSYSTEMS.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String[])currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property TargetOperatingSystems
    * <br>
    * Specifies the target operating systems of the software. This property should be used when a target operating system is not listed in the TargetOSTypes array values.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_TargetOperatingSystems(String[] newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_TARGETOPERATINGSYSTEMS.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_TargetOperatingSystems(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_TARGETOPERATINGSYSTEMS.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property TargetOperatingSystems by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_TargetOperatingSystems(WBEMClient client, String namespace, String[] newValue) throws WbemsmtException {
        CIM_SoftwareIdentity fco = new CIM_SoftwareIdentity(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_TARGETOPERATINGSYSTEMS.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_TargetOperatingSystems(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_TARGETOPERATINGSYSTEMS.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property TargetOperatingSystems
    * <br>
    * Specifies the target operating systems of the software. This property should be used when a target operating system is not listed in the TargetOSTypes array values.
    */
    
   private static CIMProperty setPropertyValue_TargetOperatingSystems(CIMProperty currentProperty, String[] newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property VersionString
    *     * <br>
    * A string representing the complete software version information - for example, '12.1(3)T'. This string and the numeric major/minor/revision/build properties are complementary. Since vastly different representations and semantics exist for versions, it is not assumed that one representation is sufficient to permit a client to perform computations (i.e., the values are numeric) and a user to recognize the software's version (i.e., the values are understandable and readable). Hence, both numeric and string representations of version are provided.
    *     */

      

               
   public String get_VersionString()    {
       CIMProperty currentProperty = getProperty(PROPERTY_VERSIONSTRING.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_VERSIONSTRING.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property VersionString
    * <br>
    * A string representing the complete software version information - for example, '12.1(3)T'. This string and the numeric major/minor/revision/build properties are complementary. Since vastly different representations and semantics exist for versions, it is not assumed that one representation is sufficient to permit a client to perform computations (i.e., the values are numeric) and a user to recognize the software's version (i.e., the values are understandable and readable). Hence, both numeric and string representations of version are provided.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_VersionString(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_VERSIONSTRING.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_VersionString(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_VERSIONSTRING.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property VersionString by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_VersionString(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        CIM_SoftwareIdentity fco = new CIM_SoftwareIdentity(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_VERSIONSTRING.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_VersionString(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_VERSIONSTRING.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property VersionString
    * <br>
    * A string representing the complete software version information - for example, '12.1(3)T'. This string and the numeric major/minor/revision/build properties are complementary. Since vastly different representations and semantics exist for versions, it is not assumed that one representation is sufficient to permit a client to perform computations (i.e., the values are numeric) and a user to recognize the software's version (i.e., the values are understandable and readable). Hence, both numeric and string representations of version are provided.
    */
    
   private static CIMProperty setPropertyValue_VersionString(CIMProperty currentProperty, String newValue)
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
     * Get the list with CIM_ManagedElement objects associated by the association CIM_ElementSoftwareIdentity
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTSOFTWAREIDENTITY as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<CIM_ManagedElement> getAssociated_CIM_ManagedElement_CIM_ElementSoftwareIdentitys(WBEMClient cimClient) throws WbemsmtException {
     
     	   return getAssociated_CIM_ManagedElement_CIM_ElementSoftwareIdentitys(
     	                cimClient,
     	                CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTSOFTWAREIDENTITY,
     	                CIM_ManagedElement.CIM_CLASS_NAME,
     	                null,
     	                null,
     	                false,
     	                false,
     	                null);
     		
     }

    /**
     * Get the list with CIM_ManagedElement objects associated by the association CIM_ElementSoftwareIdentity
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTSOFTWAREIDENTITY or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTSOFTWAREIDENTITY as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<CIM_ManagedElement> getAssociated_CIM_ManagedElement_CIM_ElementSoftwareIdentitys(WBEMClient cimClient,String resultClass, String role, String resultRole) throws WbemsmtException {
     
     	   return getAssociated_CIM_ManagedElement_CIM_ElementSoftwareIdentitys(
     	                cimClient,
     	                CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTSOFTWAREIDENTITY,
     	                resultClass,
     	                role,
     	                resultRole,
     	                false,
     	                false,
     	                null);
     		
     }

    /**
     * Get the list with CIM_ManagedElement objects associated by the association CIM_ElementSoftwareIdentity
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTSOFTWAREIDENTITY or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<CIM_ManagedElement> getAssociated_CIM_ManagedElement_CIM_ElementSoftwareIdentitys(WBEMClient cimClient, String associationClass, String resultClass, String role, String resultRole, boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList) throws WbemsmtException {

         if (cimClient == null) {
             throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
         }

         java.util.List<CIM_ManagedElement> result = new java.util.ArrayList<CIM_ManagedElement>();
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
                 CIM_SoftwareIdentityHelper.checkException(enumeration);
           
                 Object obj = enumeration.next();
                 CIM_SoftwareIdentityHelper.checkException(enumeration);

                 if (obj instanceof CIMInstance) {
                     CIMInstance cimInstance = (CIMInstance)obj;
                     Class<?> clazz = CIM_SoftwareIdentityHelper.findClass(cimClient, cimInstance);
                    
                     if (clazz == null) {
                         System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
                         result.add(new CIM_ManagedElement(cimInstance));
                         continue;
                     }

                     Class<?>[] constParams = new Class[1];
                     constParams[0] = CIMInstance.class;
                     Constructor<?> cons = null;
                     try {
                         cons = clazz.getConstructor(constParams);
                     } catch(NoSuchMethodException e) {
                         System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of the base class.");
                         result.add(new CIM_ManagedElement(cimInstance));
                         continue;
                     }

                     try {
                         Object[] actargs = new Object[] {cimInstance};
                         Object dataObj = cons.newInstance(actargs);
                         result.add((CIM_ManagedElement)dataObj);
                     } catch (Exception e) {
                         System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
                         result.add(new CIM_ManagedElement(cimInstance));
                         continue;
                     }
                 }
             }
             CIM_SoftwareIdentityHelper.checkException(enumeration);
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
    * Get the list of CIMObjectPath items of the objects associated by the association CIM_ElementSoftwareIdentity
    * @param cimClient the WBEMClient for the communication
    *
    * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTSOFTWAREIDENTITY as associationClass<br>
    * uses false for includeQualifiers and includeClassOrigin <br>
    * uses null for resultClass, role, resultRole<br>
    * <br>
    
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_CIM_ManagedElement_CIM_ElementSoftwareIdentityNames(WBEMClient cimClient) throws WbemsmtException {
    
    	    return getAssociated_CIM_ManagedElement_CIM_ElementSoftwareIdentityNames (
    	                             cimClient,
    	                             true,
    	                             CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTSOFTWAREIDENTITY,
    	                             CIM_ManagedElement.CIM_CLASS_NAME,
    	                             null,
    	                             null);
    }

   /**
    * Get the list of CIMObjectPath items of the objects associated by the association CIM_ElementSoftwareIdentity
    * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTSOFTWAREIDENTITY or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
    *
    * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTSOFTWAREIDENTITY as associationClass<br>
    * uses false for includeQualifiers and includeClassOrigin <br>
    * uses null for resultClass, role, resultRole<br>
    * <br>
    
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_CIM_ManagedElement_CIM_ElementSoftwareIdentityNames(WBEMClient cimClient,String resultClass, String role, String resultRole) throws WbemsmtException {
    
    	    return getAssociated_CIM_ManagedElement_CIM_ElementSoftwareIdentityNames (
    	                             cimClient,
    	                             true,
    	                             CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTSOFTWAREIDENTITY,
    	                             resultClass,
    	                             role,
    	                             resultRole);
    }

   /**
    * Get the list of CIMObjectPath items of the objects associated by the association CIM_ElementSoftwareIdentity
    * @param cimClient the WBEMClient for the communication
    * @param deep if true the subclasses returned also
    *
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_CIM_ManagedElement_CIM_ElementSoftwareIdentityNames(WBEMClient cimClient,boolean deep,String associationClass, String resultClass, String role, String resultRole) throws WbemsmtException {

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
                CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTSOFTWAREIDENTITY, 
                CIM_ManagedElement.CIM_CLASS_NAME,
                null,null));	
         }
         
         try {
	            while (enumeration.hasNext()) {
                CIM_SoftwareIdentityHelper.checkException(enumeration);
                                
                Object obj = enumeration.next();
                CIM_SoftwareIdentityHelper.checkException(enumeration); 
                if (obj instanceof CIMObjectPath) {
                    if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_ManagedElement.CIM_CLASS_NAME)) {
                        result.add((CIMObjectPath)obj);
                    }
                }
            }
            CIM_SoftwareIdentityHelper.checkException(enumeration);
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
    * Get the list with CIM_ElementSoftwareIdentity associations
    *
    * @param cimClient the WBEMClient for the communication
    * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
    * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
    * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
    * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
    *
    * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
    **/
                        
                        
   public java.util.List<CIM_ElementSoftwareIdentity> getAssociations_CIM_ElementSoftwareIdentity(WBEMClient cimClient, boolean includeQualifiers, boolean includeClassOrigin, String role,java.lang.String[] propertyList) throws WbemsmtException {

       if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
       }

       java.util.List<CIM_ElementSoftwareIdentity> result = new java.util.ArrayList<CIM_ElementSoftwareIdentity>();
       CloseableIterator enumeration = null;

       try {
          enumeration = cimClient.references(
             this.getCimObjectPath(),
             CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTSOFTWAREIDENTITY, 
             role,
             includeQualifiers,
             includeClassOrigin,
             propertyList);
        } catch (WBEMException e) {
         	  throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
             CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTSOFTWAREIDENTITY, 
             role,
             includeQualifiers,
             includeClassOrigin,
             propertyList));	
        }
         
        try {
          while (enumeration.hasNext()) {
             CIM_SoftwareIdentityHelper.checkException(enumeration);
             Object obj = enumeration.next();
             CIM_SoftwareIdentityHelper.checkException(enumeration);

             if (obj instanceof CIMInstance) {
                CIMInstance cimInstance = (CIMInstance)obj;
                Class<?> clazz = CIM_ElementSoftwareIdentityHelper.findClass(cimClient, cimInstance);
                    
                if (clazz == null) {
                   System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
                   result.add(new CIM_ElementSoftwareIdentity(cimInstance));
                   continue;
                }

                Class<?>[] constParams = new Class[1];
                constParams[0] = CIMInstance.class;
                Constructor<?> cons = null;
                try {
                   cons = clazz.getConstructor(constParams);
                } catch(NoSuchMethodException e) {
                   System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of the base class.");
                   result.add(new CIM_ElementSoftwareIdentity(cimInstance));
                   continue;
                }

                try {
                   Object[] actargs = new Object[] {cimInstance};
                   Object dataObj = cons.newInstance(actargs);
                   result.add((CIM_ElementSoftwareIdentity)dataObj);
                } catch (Exception e) {
                   System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
                   result.add(new CIM_ElementSoftwareIdentity(cimInstance));
                   continue;
                }
              }
           }
           CIM_SoftwareIdentityHelper.checkException(enumeration);
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
    * Get a list of CIMObjectPath items of the associations CIM_ElementSoftwareIdentity
    *
    * @param cimClient the WBEMClient for the communication
    * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
    * @param deep if true the subclasses returned also
    *
    * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociationNames_CIM_ElementSoftwareIdentity(WBEMClient cimClient,String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
        }

        java.util.List<CIMObjectPath> result = new java.util.ArrayList<CIMObjectPath>();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(
                this.getCimObjectPath(),
                CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTSOFTWAREIDENTITY, 
                role);
        } catch (WBEMException e) {
         	  throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this.getCimObjectPath(),
                CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTSOFTWAREIDENTITY, 
                role));	
        }
         
        try {
                while (enumeration.hasNext()) {
                   CIM_SoftwareIdentityHelper.checkException(enumeration);
                   Object obj = enumeration.next();
                   CIM_SoftwareIdentityHelper.checkException(enumeration); 
                   
                   if (obj instanceof CIMObjectPath) {
                      if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_ElementSoftwareIdentity.CIM_CLASS_NAME)) {
                         result.add((CIMObjectPath)obj);
                      }
                   }
                }
                CIM_SoftwareIdentityHelper.checkException(enumeration);
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
    	    return CIM_SoftwareIdentity.CIM_CLASS_NAME;
    }



}