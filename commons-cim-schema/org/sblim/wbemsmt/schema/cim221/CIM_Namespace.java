/** 
  * CIM_Namespace.java
  *
  * 
  * Â© Copyright IBM Corp. 2006,2007
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
  *    Prashanth Karnam<prkarnam@in.ibm.com> 
  * 
  * Description: Namespace provides a domain (in other words, a container), in which the instances [of a class] are guaranteed to be unique per the KEY qualifier definitions. It is named relative to the CIM_ObjectManager implementation that provides such a domain.
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
public class CIM_Namespace extends  CIM_ManagedElement {



   public final static String CIM_CLASS_NAME = "CIM_Namespace";
   public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    
    /**
     * NamespaceInManager is an association describing the Namespaces hosted by a CIM ObjectManager.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_NAMESPACEINMANAGER = "CIM_NamespaceInManager";
    
    
    
	    /**
	     * Constants of property ClassInfo
     * Enumeration indicating the organization/schema of the Namespace's objects. For example, they may be instances of classes of a specific CIM version.
     */
    public static class PROPERTY_CLASSINFO
    {
       /**
        * name of the property ClassInfo
        */
       public final static String NAME = "ClassInfo";                  

	    	
    

              
       		
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
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_CIM_1_0 
                              = new javax.cim.UnsignedInteger16("2");
	          	
                       /**
              * constant for value entry CIM 1.0 (corresponds to mapEntry 2 )
              */
             public final static String VALUE_ENTRY_CIM_1_0 
                              = "CIM 1.0";
                    
       		
          /**
           * constant for value map entry 3
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_CIM_2_0 
                              = new javax.cim.UnsignedInteger16("3");
	          	
                       /**
              * constant for value entry CIM 2.0 (corresponds to mapEntry 3 )
              */
             public final static String VALUE_ENTRY_CIM_2_0 
                              = "CIM 2.0";
                    
       		
          /**
           * constant for value map entry 4
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_CIM_2_1 
                              = new javax.cim.UnsignedInteger16("4");
	          	
                       /**
              * constant for value entry CIM 2.1 (corresponds to mapEntry 4 )
              */
             public final static String VALUE_ENTRY_CIM_2_1 
                              = "CIM 2.1";
                    
       		
          /**
           * constant for value map entry 5
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_CIM_2_2 
                              = new javax.cim.UnsignedInteger16("5");
	          	
                       /**
              * constant for value entry CIM 2.2 (corresponds to mapEntry 5 )
              */
             public final static String VALUE_ENTRY_CIM_2_2 
                              = "CIM 2.2";
                    
       		
          /**
           * constant for value map entry 6
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_CIM_2_3 
                              = new javax.cim.UnsignedInteger16("6");
	          	
                       /**
              * constant for value entry CIM 2.3 (corresponds to mapEntry 6 )
              */
             public final static String VALUE_ENTRY_CIM_2_3 
                              = "CIM 2.3";
                    
       		
          /**
           * constant for value map entry 7
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_CIM_2_4 
                              = new javax.cim.UnsignedInteger16("7");
	          	
                       /**
              * constant for value entry CIM 2.4 (corresponds to mapEntry 7 )
              */
             public final static String VALUE_ENTRY_CIM_2_4 
                              = "CIM 2.4";
                    
       		
          /**
           * constant for value map entry 8
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_CIM_2_5 
                              = new javax.cim.UnsignedInteger16("8");
	          	
                       /**
              * constant for value entry CIM 2.5 (corresponds to mapEntry 8 )
              */
             public final static String VALUE_ENTRY_CIM_2_5 
                              = "CIM 2.5";
                    
       		
          /**
           * constant for value map entry 9
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_CIM_2_6 
                              = new javax.cim.UnsignedInteger16("9");
	          	
                       /**
              * constant for value entry CIM 2.6 (corresponds to mapEntry 9 )
              */
             public final static String VALUE_ENTRY_CIM_2_6 
                              = "CIM 2.6";
                    
       		
          /**
           * constant for value map entry 10
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_CIM_2_7 
                              = new javax.cim.UnsignedInteger16("10");
	          	
                       /**
              * constant for value entry CIM 2.7 (corresponds to mapEntry 10 )
              */
             public final static String VALUE_ENTRY_CIM_2_7 
                              = "CIM 2.7";
                    
       		
          /**
           * constant for value map entry 11
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_CIM_2_8 
                              = new javax.cim.UnsignedInteger16("11");
	          	
                       /**
              * constant for value entry CIM 2.8 (corresponds to mapEntry 11 )
              */
             public final static String VALUE_ENTRY_CIM_2_8 
                              = "CIM 2.8";
                    
       		
          /**
           * constant for value map entry 200
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_200_FOR_VALUE_ENTRY_DMI_Recast 
                              = new javax.cim.UnsignedInteger16("200");
	          	
                       /**
              * constant for value entry DMI Recast (corresponds to mapEntry 200 )
              */
             public final static String VALUE_ENTRY_DMI_Recast 
                              = "DMI Recast";
                    
       		
          /**
           * constant for value map entry 201
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_201_FOR_VALUE_ENTRY_SNMP_Recast 
                              = new javax.cim.UnsignedInteger16("201");
	          	
                       /**
              * constant for value entry SNMP Recast (corresponds to mapEntry 201 )
              */
             public final static String VALUE_ENTRY_SNMP_Recast 
                              = "SNMP Recast";
                    
       		
          /**
           * constant for value map entry 202
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_202_FOR_VALUE_ENTRY_CMIP_Recast 
                              = new javax.cim.UnsignedInteger16("202");
	          	
                       /**
              * constant for value entry CMIP Recast (corresponds to mapEntry 202 )
              */
             public final static String VALUE_ENTRY_CMIP_Recast 
                              = "CMIP Recast";
                    
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
	                      	                             
	                                               if (VALUE_ENTRY_CIM_1_0.equals(value))
                         {
                            return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_CIM_1_0;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_CIM_2_0.equals(value))
                         {
                            return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_CIM_2_0;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_CIM_2_1.equals(value))
                         {
                            return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_CIM_2_1;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_CIM_2_2.equals(value))
                         {
                            return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_CIM_2_2;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_CIM_2_3.equals(value))
                         {
                            return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_CIM_2_3;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_CIM_2_4.equals(value))
                         {
                            return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_CIM_2_4;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_CIM_2_5.equals(value))
                         {
                            return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_CIM_2_5;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_CIM_2_6.equals(value))
                         {
                            return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_CIM_2_6;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_CIM_2_7.equals(value))
                         {
                            return VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_CIM_2_7;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_CIM_2_8.equals(value))
                         {
                            return VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_CIM_2_8;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_DMI_Recast.equals(value))
                         {
                            return VALUE_MAP_ENTRY_200_FOR_VALUE_ENTRY_DMI_Recast;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_SNMP_Recast.equals(value))
                         {
                            return VALUE_MAP_ENTRY_201_FOR_VALUE_ENTRY_SNMP_Recast;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_CMIP_Recast.equals(value))
                         {
                            return VALUE_MAP_ENTRY_202_FOR_VALUE_ENTRY_CMIP_Recast;
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
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_CIM_1_0.intValue())
                         {
                            return VALUE_ENTRY_CIM_1_0;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_CIM_2_0.intValue())
                         {
                            return VALUE_ENTRY_CIM_2_0;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_CIM_2_1.intValue())
                         {
                            return VALUE_ENTRY_CIM_2_1;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_CIM_2_2.intValue())
                         {
                            return VALUE_ENTRY_CIM_2_2;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_CIM_2_3.intValue())
                         {
                            return VALUE_ENTRY_CIM_2_3;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_CIM_2_4.intValue())
                         {
                            return VALUE_ENTRY_CIM_2_4;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_CIM_2_5.intValue())
                         {
                            return VALUE_ENTRY_CIM_2_5;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_CIM_2_6.intValue())
                         {
                            return VALUE_ENTRY_CIM_2_6;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_CIM_2_7.intValue())
                         {
                            return VALUE_ENTRY_CIM_2_7;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_CIM_2_8.intValue())
                         {
                            return VALUE_ENTRY_CIM_2_8;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_200_FOR_VALUE_ENTRY_DMI_Recast.intValue())
                         {
                            return VALUE_ENTRY_DMI_Recast;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_201_FOR_VALUE_ENTRY_SNMP_Recast.intValue())
                         {
                            return VALUE_ENTRY_SNMP_Recast;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_202_FOR_VALUE_ENTRY_CMIP_Recast.intValue())
                         {
                            return VALUE_ENTRY_CMIP_Recast;
                         }
                                                                                  return null;
                                   
                }
          
                                    
          /**
	       * ValueMap entries
       * Contains no entries that having an integer value range representation
       * 
       * The couterpart for the value entries is returned by VALUE_ENTRIES_FOR_DISPLAY
       *
       * @see \#VALUE_ENTRIES_FOR_DISPLAY
       * 
       * Value Map for the property ClassInfo   
       */
      public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = { 
	         	                              VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown
                     	                            ,  VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other
                     	                            ,  VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_CIM_1_0
                     	                            ,  VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_CIM_2_0
                     	                            ,  VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_CIM_2_1
                     	                            ,  VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_CIM_2_2
                     	                            ,  VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_CIM_2_3
                     	                            ,  VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_CIM_2_4
                     	                            ,  VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_CIM_2_5
                     	                            ,  VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_CIM_2_6
                     	                            ,  VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_CIM_2_7
                     	                            ,  VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_CIM_2_8
                     	                            ,  VALUE_MAP_ENTRY_200_FOR_VALUE_ENTRY_DMI_Recast
                     	                            ,  VALUE_MAP_ENTRY_201_FOR_VALUE_ENTRY_SNMP_Recast
                     	                            ,  VALUE_MAP_ENTRY_202_FOR_VALUE_ENTRY_CMIP_Recast
                           };
    	
	           /**
        * Values
        * Contains all values even those having an integer value range representation within the valueMap
        * Value Map for the property ClassInfo   
        */
       public final static String[] VALUE_ENTRIES = { 
                                                   VALUE_ENTRY_Unknown
                                                                 ,  VALUE_ENTRY_Other
                                                                 ,  VALUE_ENTRY_CIM_1_0
                                                                 ,  VALUE_ENTRY_CIM_2_0
                                                                 ,  VALUE_ENTRY_CIM_2_1
                                                                 ,  VALUE_ENTRY_CIM_2_2
                                                                 ,  VALUE_ENTRY_CIM_2_3
                                                                 ,  VALUE_ENTRY_CIM_2_4
                                                                 ,  VALUE_ENTRY_CIM_2_5
                                                                 ,  VALUE_ENTRY_CIM_2_6
                                                                 ,  VALUE_ENTRY_CIM_2_7
                                                                 ,  VALUE_ENTRY_CIM_2_8
                                                                 ,  VALUE_ENTRY_DMI_Recast
                                                                 ,  VALUE_ENTRY_SNMP_Recast
                                                                 ,  VALUE_ENTRY_CMIP_Recast
                                    };

              /**
        * Values for displaying within pulldown elements, lists, radio buttons etc
        * Contains no values that having an integer value range representation within the valueMap
        * 
        * Value Map for the property ClassInfo   
        */
       public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { 
                                                   VALUE_ENTRY_Unknown
                                                                 ,  VALUE_ENTRY_Other
                                                                 ,  VALUE_ENTRY_CIM_1_0
                                                                 ,  VALUE_ENTRY_CIM_2_0
                                                                 ,  VALUE_ENTRY_CIM_2_1
                                                                 ,  VALUE_ENTRY_CIM_2_2
                                                                 ,  VALUE_ENTRY_CIM_2_3
                                                                 ,  VALUE_ENTRY_CIM_2_4
                                                                 ,  VALUE_ENTRY_CIM_2_5
                                                                 ,  VALUE_ENTRY_CIM_2_6
                                                                 ,  VALUE_ENTRY_CIM_2_7
                                                                 ,  VALUE_ENTRY_CIM_2_8
                                                                 ,  VALUE_ENTRY_DMI_Recast
                                                                 ,  VALUE_ENTRY_SNMP_Recast
                                                                 ,  VALUE_ENTRY_CMIP_Recast
                                    };

        
		    
	
	    
	    }
	    
	    /**
	     * Constants of property ClassType
     * Enumeration indicating the schema of the Namespace's objects. For example, they may be instances of classes of a specific CIM version or a mapping from another standard, such as SNMP. If 'Other' is selected, the DescriptionOfClassType property MUST be populated.
     */
    public static class PROPERTY_CLASSTYPE
    {
       /**
        * name of the property ClassType
        */
       public final static String NAME = "ClassType";                  

	    	
    

              
       		
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
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_CIM 
                              = new javax.cim.UnsignedInteger16("2");
	          	
                       /**
              * constant for value entry CIM (corresponds to mapEntry 2 )
              */
             public final static String VALUE_ENTRY_CIM 
                              = "CIM";
                    
       		
          /**
           * constant for value map entry 200
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_200_FOR_VALUE_ENTRY_DMI_Recast 
                              = new javax.cim.UnsignedInteger16("200");
	          	
                       /**
              * constant for value entry DMI Recast (corresponds to mapEntry 200 )
              */
             public final static String VALUE_ENTRY_DMI_Recast 
                              = "DMI Recast";
                    
       		
          /**
           * constant for value map entry 201
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_201_FOR_VALUE_ENTRY_SNMP_Recast 
                              = new javax.cim.UnsignedInteger16("201");
	          	
                       /**
              * constant for value entry SNMP Recast (corresponds to mapEntry 201 )
              */
             public final static String VALUE_ENTRY_SNMP_Recast 
                              = "SNMP Recast";
                    
       		
          /**
           * constant for value map entry 202
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_202_FOR_VALUE_ENTRY_CMIP_Recast 
                              = new javax.cim.UnsignedInteger16("202");
	          	
                       /**
              * constant for value entry CMIP Recast (corresponds to mapEntry 202 )
              */
             public final static String VALUE_ENTRY_CMIP_Recast 
                              = "CMIP Recast";
                    
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
	                      	                             
	                                               if (VALUE_ENTRY_CIM.equals(value))
                         {
                            return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_CIM;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_DMI_Recast.equals(value))
                         {
                            return VALUE_MAP_ENTRY_200_FOR_VALUE_ENTRY_DMI_Recast;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_SNMP_Recast.equals(value))
                         {
                            return VALUE_MAP_ENTRY_201_FOR_VALUE_ENTRY_SNMP_Recast;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_CMIP_Recast.equals(value))
                         {
                            return VALUE_MAP_ENTRY_202_FOR_VALUE_ENTRY_CMIP_Recast;
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
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_CIM.intValue())
                         {
                            return VALUE_ENTRY_CIM;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_200_FOR_VALUE_ENTRY_DMI_Recast.intValue())
                         {
                            return VALUE_ENTRY_DMI_Recast;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_201_FOR_VALUE_ENTRY_SNMP_Recast.intValue())
                         {
                            return VALUE_ENTRY_SNMP_Recast;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_202_FOR_VALUE_ENTRY_CMIP_Recast.intValue())
                         {
                            return VALUE_ENTRY_CMIP_Recast;
                         }
                                                                                  return null;
                                   
                }
          
                                    
          /**
	       * ValueMap entries
       * Contains no entries that having an integer value range representation
       * 
       * The couterpart for the value entries is returned by VALUE_ENTRIES_FOR_DISPLAY
       *
       * @see \#VALUE_ENTRIES_FOR_DISPLAY
       * 
       * Value Map for the property ClassType   
       */
      public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = { 
	         	                              VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown
                     	                            ,  VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other
                     	                            ,  VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_CIM
                     	                            ,  VALUE_MAP_ENTRY_200_FOR_VALUE_ENTRY_DMI_Recast
                     	                            ,  VALUE_MAP_ENTRY_201_FOR_VALUE_ENTRY_SNMP_Recast
                     	                            ,  VALUE_MAP_ENTRY_202_FOR_VALUE_ENTRY_CMIP_Recast
                           };
    	
	           /**
        * Values
        * Contains all values even those having an integer value range representation within the valueMap
        * Value Map for the property ClassType   
        */
       public final static String[] VALUE_ENTRIES = { 
                                                   VALUE_ENTRY_Unknown
                                                                 ,  VALUE_ENTRY_Other
                                                                 ,  VALUE_ENTRY_CIM
                                                                 ,  VALUE_ENTRY_DMI_Recast
                                                                 ,  VALUE_ENTRY_SNMP_Recast
                                                                 ,  VALUE_ENTRY_CMIP_Recast
                                    };

              /**
        * Values for displaying within pulldown elements, lists, radio buttons etc
        * Contains no values that having an integer value range representation within the valueMap
        * 
        * Value Map for the property ClassType   
        */
       public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { 
                                                   VALUE_ENTRY_Unknown
                                                                 ,  VALUE_ENTRY_Other
                                                                 ,  VALUE_ENTRY_CIM
                                                                 ,  VALUE_ENTRY_DMI_Recast
                                                                 ,  VALUE_ENTRY_SNMP_Recast
                                                                 ,  VALUE_ENTRY_CMIP_Recast
                                    };

        
		    
	
	    
	    }
	    
	    /**
	     * Constants of property ClassTypeVersion
     * The version of the objects in this namespace. The string representing the version MUST be in the form: 
     * M + "." + N + "." + U 
     * Where: 
     * M - The major version (in numeric form) 
     * N - The minor version (in numeric form) 
     * U - The update (e.g. errata, patch, ..., in numeric form)
     */
    public static class PROPERTY_CLASSTYPEVERSION
    {
       /**
        * name of the property ClassTypeVersion
        */
       public final static String NAME = "ClassTypeVersion";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property CreationClassName
     * CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
     */
    public static class PROPERTY_CREATIONCLASSNAME
    {
       /**
        * name of the property CreationClassName
        */
       public final static String NAME = "CreationClassName";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property DescriptionOfClassInfo
     * A string providing more detail (beyond the general classification in ClassInfo) for the object hierarchy of the Namespace.
     */
    public static class PROPERTY_DESCRIPTIONOFCLASSINFO
    {
       /**
        * name of the property DescriptionOfClassInfo
        */
       public final static String NAME = "DescriptionOfClassInfo";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property DescriptionOfClassType
     * A string providing more detail (beyond the general classification in ClassInfo) for the object hierarchy of the Namespace.
     */
    public static class PROPERTY_DESCRIPTIONOFCLASSTYPE
    {
       /**
        * name of the property DescriptionOfClassType
        */
       public final static String NAME = "DescriptionOfClassType";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property Name
     * A string to uniquely identify the Namespace within the ObjectManager.
     */
    public static class PROPERTY_NAME
    {
       /**
        * name of the property Name
        */
       public final static String NAME = "Name";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property ObjectManagerCreationClassName
     * The scoping ObjectManager's CreationClassName.
     */
    public static class PROPERTY_OBJECTMANAGERCREATIONCLASSNAME
    {
       /**
        * name of the property ObjectManagerCreationClassName
        */
       public final static String NAME = "ObjectManagerCreationClassName";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property ObjectManagerName
     * The scoping ObjectManager's Name.
     */
    public static class PROPERTY_OBJECTMANAGERNAME
    {
       /**
        * name of the property ObjectManagerName
        */
       public final static String NAME = "ObjectManagerName";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property SystemCreationClassName
     * The scoping System's CreationClassName.
     */
    public static class PROPERTY_SYSTEMCREATIONCLASSNAME
    {
       /**
        * name of the property SystemCreationClassName
        */
       public final static String NAME = "SystemCreationClassName";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property SystemName
     * The scoping System's Name.
     */
    public static class PROPERTY_SYSTEMNAME
    {
       /**
        * name of the property SystemName
        */
       public final static String NAME = "SystemName";                  

	    	
    

    		    
	
	    
	    }
	    	    

   

    
    static {    
           addPackage("org.sblim.wbemsmt.schema.cim221");
                         String[] parentClassPackageList = CIM_ManagedElement.getPackages();
        
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
    *   Namespace provides a domain (in other words, a container), in which the instances [of a class] are guaranteed to be unique per the KEY qualifier definitions. It is named relative to the CIM_ObjectManager implementation that provides such a domain.
    *   @param client the CIM Client
    *   @param namespace the target namespace
    */  

      
   public CIM_Namespace(WBEMClient client, String namespace) throws WbemsmtException
   {
       CIMClass cls = getClass(client,namespace);
       setFromServer(false);
       init(cls.newInstance(),true);
   }
        
   /**
    *   Class constructor
    * 
    *       *   <br>
    *   Namespace provides a domain (in other words, a container), in which the instances [of a class] are guaranteed to be unique per the KEY qualifier definitions. It is named relative to the CIM_ObjectManager implementation that provides such a domain.
    *   @param cimInstance the instance that is used to create the Object
    */  
   
   public CIM_Namespace(CIMInstance cimInstance)  throws WbemsmtException { 
        
       if (cimInstance == null) {
           throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER, "The cimInstance parameter does not contain a valid reference.");
       }
       setFromServer(true);
       init(cimInstance,false);
   }
   
   /**
    * Default constructor
    */
   protected CIM_Namespace()
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
              propertiesToCheck.put("ClassInfo",new CIMProperty("ClassInfo",CIMDataType.UINT16_T,null));
              propertiesToCheck.put("ClassType",new CIMProperty("ClassType",CIMDataType.UINT16_T,null));
              propertiesToCheck.put("ClassTypeVersion",new CIMProperty("ClassTypeVersion",CIMDataType.STRING_T,null));
              propertiesToCheck.put("CreationClassName",new CIMProperty("CreationClassName",CIMDataType.STRING_T,null));
              propertiesToCheck.put("DescriptionOfClassInfo",new CIMProperty("DescriptionOfClassInfo",CIMDataType.STRING_T,null));
              propertiesToCheck.put("DescriptionOfClassType",new CIMProperty("DescriptionOfClassType",CIMDataType.STRING_T,null));
              propertiesToCheck.put("Name",new CIMProperty("Name",CIMDataType.STRING_T,null));
              propertiesToCheck.put("ObjectManagerCreationClassName",new CIMProperty("ObjectManagerCreationClassName",CIMDataType.STRING_T,null));
              propertiesToCheck.put("ObjectManagerName",new CIMProperty("ObjectManagerName",CIMDataType.STRING_T,null));
              propertiesToCheck.put("SystemCreationClassName",new CIMProperty("SystemCreationClassName",CIMDataType.STRING_T,null));
              propertiesToCheck.put("SystemName",new CIMProperty("SystemName",CIMDataType.STRING_T,null));
       	
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
    * Get the property ClassInfo
    *     * <br>
    * Enumeration indicating the organization/schema of the Namespace's objects. For example, they may be instances of classes of a specific CIM version.
    *     */

      

               
   public javax.cim.UnsignedInteger16 get_ClassInfo()    {
       CIMProperty currentProperty = getProperty(PROPERTY_CLASSINFO.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_CLASSINFO.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (javax.cim.UnsignedInteger16)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property ClassInfo
    * <br>
    * Enumeration indicating the organization/schema of the Namespace's objects. For example, they may be instances of classes of a specific CIM version.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_ClassInfo(javax.cim.UnsignedInteger16 newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_CLASSINFO.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_ClassInfo(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_CLASSINFO.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property ClassInfo by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ClassInfo(WBEMClient client, String namespace, javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_Namespace fco = new CIM_Namespace(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CLASSINFO.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_ClassInfo(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_CLASSINFO.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property ClassInfo
    * <br>
    * Enumeration indicating the organization/schema of the Namespace's objects. For example, they may be instances of classes of a specific CIM version.
    */
    
   private static CIMProperty setPropertyValue_ClassInfo(CIMProperty currentProperty, javax.cim.UnsignedInteger16 newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property ClassType
    *     * <br>
    * Enumeration indicating the schema of the Namespace's objects. For example, they may be instances of classes of a specific CIM version or a mapping from another standard, such as SNMP. If 'Other' is selected, the DescriptionOfClassType property MUST be populated.
    *     */

      

               
   public javax.cim.UnsignedInteger16 get_ClassType()    {
       CIMProperty currentProperty = getProperty(PROPERTY_CLASSTYPE.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_CLASSTYPE.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (javax.cim.UnsignedInteger16)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property ClassType
    * <br>
    * Enumeration indicating the schema of the Namespace's objects. For example, they may be instances of classes of a specific CIM version or a mapping from another standard, such as SNMP. If 'Other' is selected, the DescriptionOfClassType property MUST be populated.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_ClassType(javax.cim.UnsignedInteger16 newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_CLASSTYPE.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_ClassType(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_CLASSTYPE.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property ClassType by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ClassType(WBEMClient client, String namespace, javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_Namespace fco = new CIM_Namespace(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CLASSTYPE.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_ClassType(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_CLASSTYPE.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property ClassType
    * <br>
    * Enumeration indicating the schema of the Namespace's objects. For example, they may be instances of classes of a specific CIM version or a mapping from another standard, such as SNMP. If 'Other' is selected, the DescriptionOfClassType property MUST be populated.
    */
    
   private static CIMProperty setPropertyValue_ClassType(CIMProperty currentProperty, javax.cim.UnsignedInteger16 newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property ClassTypeVersion
    *     * <br>
    * The version of the objects in this namespace. The string representing the version MUST be in the form: 
     * M + "." + N + "." + U 
     * Where: 
     * M - The major version (in numeric form) 
     * N - The minor version (in numeric form) 
     * U - The update (e.g. errata, patch, ..., in numeric form)
    *     */

      

               
   public String get_ClassTypeVersion()    {
       CIMProperty currentProperty = getProperty(PROPERTY_CLASSTYPEVERSION.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_CLASSTYPEVERSION.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property ClassTypeVersion
    * <br>
    * The version of the objects in this namespace. The string representing the version MUST be in the form: 
     * M + "." + N + "." + U 
     * Where: 
     * M - The major version (in numeric form) 
     * N - The minor version (in numeric form) 
     * U - The update (e.g. errata, patch, ..., in numeric form)
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_ClassTypeVersion(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_CLASSTYPEVERSION.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_ClassTypeVersion(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_CLASSTYPEVERSION.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property ClassTypeVersion by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ClassTypeVersion(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        CIM_Namespace fco = new CIM_Namespace(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CLASSTYPEVERSION.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_ClassTypeVersion(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_CLASSTYPEVERSION.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property ClassTypeVersion
    * <br>
    * The version of the objects in this namespace. The string representing the version MUST be in the form: 
     * M + "." + N + "." + U 
     * Where: 
     * M - The major version (in numeric form) 
     * N - The minor version (in numeric form) 
     * U - The update (e.g. errata, patch, ..., in numeric form)
    */
    
   private static CIMProperty setPropertyValue_ClassTypeVersion(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property CreationClassName
    *     * <br>
    * CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
    *     */

      

               
   public String get_key_CreationClassName()    {
       CIMProperty currentProperty = getProperty(PROPERTY_CREATIONCLASSNAME.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_CREATIONCLASSNAME.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property CreationClassName
    * <br>
    * CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_key_CreationClassName(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_CREATIONCLASSNAME.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_key_CreationClassName(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_CREATIONCLASSNAME.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property CreationClassName by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_key_CreationClassName(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        CIM_Namespace fco = new CIM_Namespace(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CREATIONCLASSNAME.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_key_CreationClassName(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_CREATIONCLASSNAME.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property CreationClassName
    * <br>
    * CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
    */
    
   private static CIMProperty setPropertyValue_key_CreationClassName(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property DescriptionOfClassInfo
    *     * <br>
    * A string providing more detail (beyond the general classification in ClassInfo) for the object hierarchy of the Namespace.
    *     */

      

               
   public String get_DescriptionOfClassInfo()    {
       CIMProperty currentProperty = getProperty(PROPERTY_DESCRIPTIONOFCLASSINFO.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_DESCRIPTIONOFCLASSINFO.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property DescriptionOfClassInfo
    * <br>
    * A string providing more detail (beyond the general classification in ClassInfo) for the object hierarchy of the Namespace.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_DescriptionOfClassInfo(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_DESCRIPTIONOFCLASSINFO.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_DescriptionOfClassInfo(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_DESCRIPTIONOFCLASSINFO.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property DescriptionOfClassInfo by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_DescriptionOfClassInfo(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        CIM_Namespace fco = new CIM_Namespace(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_DESCRIPTIONOFCLASSINFO.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_DescriptionOfClassInfo(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_DESCRIPTIONOFCLASSINFO.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property DescriptionOfClassInfo
    * <br>
    * A string providing more detail (beyond the general classification in ClassInfo) for the object hierarchy of the Namespace.
    */
    
   private static CIMProperty setPropertyValue_DescriptionOfClassInfo(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property DescriptionOfClassType
    *     * <br>
    * A string providing more detail (beyond the general classification in ClassInfo) for the object hierarchy of the Namespace.
    *     */

      

               
   public String get_DescriptionOfClassType()    {
       CIMProperty currentProperty = getProperty(PROPERTY_DESCRIPTIONOFCLASSTYPE.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_DESCRIPTIONOFCLASSTYPE.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property DescriptionOfClassType
    * <br>
    * A string providing more detail (beyond the general classification in ClassInfo) for the object hierarchy of the Namespace.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_DescriptionOfClassType(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_DESCRIPTIONOFCLASSTYPE.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_DescriptionOfClassType(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_DESCRIPTIONOFCLASSTYPE.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property DescriptionOfClassType by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_DescriptionOfClassType(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        CIM_Namespace fco = new CIM_Namespace(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_DESCRIPTIONOFCLASSTYPE.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_DescriptionOfClassType(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_DESCRIPTIONOFCLASSTYPE.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property DescriptionOfClassType
    * <br>
    * A string providing more detail (beyond the general classification in ClassInfo) for the object hierarchy of the Namespace.
    */
    
   private static CIMProperty setPropertyValue_DescriptionOfClassType(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property Name
    *     * <br>
    * A string to uniquely identify the Namespace within the ObjectManager.
    *     */

      

               
   public String get_key_Name()    {
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
    * A string to uniquely identify the Namespace within the ObjectManager.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_key_Name(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_NAME.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_key_Name(currentProperty,newValue));
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

    public static CIMProperty create_key_Name(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        CIM_Namespace fco = new CIM_Namespace(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_NAME.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_key_Name(property,newValue);
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
    * A string to uniquely identify the Namespace within the ObjectManager.
    */
    
   private static CIMProperty setPropertyValue_key_Name(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property ObjectManagerCreationClassName
    *     * <br>
    * The scoping ObjectManager's CreationClassName.
    *     */

      

               
   public String get_key_ObjectManagerCreationClassName()    {
       CIMProperty currentProperty = getProperty(PROPERTY_OBJECTMANAGERCREATIONCLASSNAME.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_OBJECTMANAGERCREATIONCLASSNAME.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property ObjectManagerCreationClassName
    * <br>
    * The scoping ObjectManager's CreationClassName.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_key_ObjectManagerCreationClassName(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_OBJECTMANAGERCREATIONCLASSNAME.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_key_ObjectManagerCreationClassName(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_OBJECTMANAGERCREATIONCLASSNAME.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property ObjectManagerCreationClassName by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_key_ObjectManagerCreationClassName(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        CIM_Namespace fco = new CIM_Namespace(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OBJECTMANAGERCREATIONCLASSNAME.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_key_ObjectManagerCreationClassName(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_OBJECTMANAGERCREATIONCLASSNAME.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property ObjectManagerCreationClassName
    * <br>
    * The scoping ObjectManager's CreationClassName.
    */
    
   private static CIMProperty setPropertyValue_key_ObjectManagerCreationClassName(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property ObjectManagerName
    *     * <br>
    * The scoping ObjectManager's Name.
    *     */

      

               
   public String get_key_ObjectManagerName()    {
       CIMProperty currentProperty = getProperty(PROPERTY_OBJECTMANAGERNAME.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_OBJECTMANAGERNAME.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property ObjectManagerName
    * <br>
    * The scoping ObjectManager's Name.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_key_ObjectManagerName(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_OBJECTMANAGERNAME.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_key_ObjectManagerName(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_OBJECTMANAGERNAME.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property ObjectManagerName by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_key_ObjectManagerName(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        CIM_Namespace fco = new CIM_Namespace(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OBJECTMANAGERNAME.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_key_ObjectManagerName(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_OBJECTMANAGERNAME.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property ObjectManagerName
    * <br>
    * The scoping ObjectManager's Name.
    */
    
   private static CIMProperty setPropertyValue_key_ObjectManagerName(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property SystemCreationClassName
    *     * <br>
    * The scoping System's CreationClassName.
    *     */

      

               
   public String get_key_SystemCreationClassName()    {
       CIMProperty currentProperty = getProperty(PROPERTY_SYSTEMCREATIONCLASSNAME.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_SYSTEMCREATIONCLASSNAME.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property SystemCreationClassName
    * <br>
    * The scoping System's CreationClassName.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_key_SystemCreationClassName(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_SYSTEMCREATIONCLASSNAME.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_key_SystemCreationClassName(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_SYSTEMCREATIONCLASSNAME.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property SystemCreationClassName by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_key_SystemCreationClassName(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        CIM_Namespace fco = new CIM_Namespace(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SYSTEMCREATIONCLASSNAME.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_key_SystemCreationClassName(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_SYSTEMCREATIONCLASSNAME.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property SystemCreationClassName
    * <br>
    * The scoping System's CreationClassName.
    */
    
   private static CIMProperty setPropertyValue_key_SystemCreationClassName(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property SystemName
    *     * <br>
    * The scoping System's Name.
    *     */

      

               
   public String get_key_SystemName()    {
       CIMProperty currentProperty = getProperty(PROPERTY_SYSTEMNAME.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_SYSTEMNAME.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property SystemName
    * <br>
    * The scoping System's Name.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_key_SystemName(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_SYSTEMNAME.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_key_SystemName(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_SYSTEMNAME.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property SystemName by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_key_SystemName(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        CIM_Namespace fco = new CIM_Namespace(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SYSTEMNAME.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_key_SystemName(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_SYSTEMNAME.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property SystemName
    * <br>
    * The scoping System's Name.
    */
    
   private static CIMProperty setPropertyValue_key_SystemName(CIMProperty currentProperty, String newValue)
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
     * Get the list with CIM_ObjectManager objects associated by the association CIM_NamespaceInManager
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_NAMESPACEINMANAGER as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<CIM_ObjectManager> getAssociated_CIM_ObjectManager_CIM_NamespaceInManagers(WBEMClient cimClient) throws WbemsmtException {
     
     	   return getAssociated_CIM_ObjectManager_CIM_NamespaceInManagers(
     	                cimClient,
     	                CIM_ASSOCIATOR_CLASS_NAME_CIM_NAMESPACEINMANAGER,
     	                CIM_ObjectManager.CIM_CLASS_NAME,
     	                null,
     	                null,
     	                false,
     	                false,
     	                null);
     		
     }

    /**
     * Get the list with CIM_ObjectManager objects associated by the association CIM_NamespaceInManager
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
                        
     public java.util.List<CIM_ObjectManager> getAssociated_CIM_ObjectManager_CIM_NamespaceInManagers(WBEMClient cimClient,String resultClass, String role, String resultRole) throws WbemsmtException {
     
     	   return getAssociated_CIM_ObjectManager_CIM_NamespaceInManagers(
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
     * Get the list with CIM_ObjectManager objects associated by the association CIM_NamespaceInManager
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
                        
     public java.util.List<CIM_ObjectManager> getAssociated_CIM_ObjectManager_CIM_NamespaceInManagers(WBEMClient cimClient, String associationClass, String resultClass, String role, String resultRole, boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList) throws WbemsmtException {

         if (cimClient == null) {
             throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
         }

         java.util.List<CIM_ObjectManager> result = new java.util.ArrayList<CIM_ObjectManager>();
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
                 CIM_NamespaceHelper.checkException(enumeration);
           
                 Object obj = enumeration.next();
                 CIM_NamespaceHelper.checkException(enumeration);

                 if (obj instanceof CIMInstance) {
                     CIMInstance cimInstance = (CIMInstance)obj;
                     Class<?> clazz = CIM_NamespaceHelper.findClass(cimClient, cimInstance);
                    
                     if (clazz == null) {
                         System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
                         result.add(new CIM_ObjectManager(cimInstance));
                         continue;
                     }

                     Class<?>[] constParams = new Class[1];
                     constParams[0] = CIMInstance.class;
                     Constructor<?> cons = null;
                     try {
                         cons = clazz.getConstructor(constParams);
                     } catch(NoSuchMethodException e) {
                         System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of the base class.");
                         result.add(new CIM_ObjectManager(cimInstance));
                         continue;
                     }

                     try {
                         Object[] actargs = new Object[] {cimInstance};
                         Object dataObj = cons.newInstance(actargs);
                         result.add((CIM_ObjectManager)dataObj);
                     } catch (Exception e) {
                         System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
                         result.add(new CIM_ObjectManager(cimInstance));
                         continue;
                     }
                 }
             }
             CIM_NamespaceHelper.checkException(enumeration);
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
                         
    public java.util.List<CIMObjectPath> getAssociated_CIM_ObjectManager_CIM_NamespaceInManagerNames(WBEMClient cimClient) throws WbemsmtException {
    
    	    return getAssociated_CIM_ObjectManager_CIM_NamespaceInManagerNames (
    	                             cimClient,
    	                             true,
    	                             CIM_ASSOCIATOR_CLASS_NAME_CIM_NAMESPACEINMANAGER,
    	                             CIM_ObjectManager.CIM_CLASS_NAME,
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
                         
    public java.util.List<CIMObjectPath> getAssociated_CIM_ObjectManager_CIM_NamespaceInManagerNames(WBEMClient cimClient,String resultClass, String role, String resultRole) throws WbemsmtException {
    
    	    return getAssociated_CIM_ObjectManager_CIM_NamespaceInManagerNames (
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
                         
    public java.util.List<CIMObjectPath> getAssociated_CIM_ObjectManager_CIM_NamespaceInManagerNames(WBEMClient cimClient,boolean deep,String associationClass, String resultClass, String role, String resultRole) throws WbemsmtException {

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
                CIM_ObjectManager.CIM_CLASS_NAME,
                null,null));	
         }
         
         try {
	            while (enumeration.hasNext()) {
                CIM_NamespaceHelper.checkException(enumeration);
                                
                Object obj = enumeration.next();
                CIM_NamespaceHelper.checkException(enumeration); 
                if (obj instanceof CIMObjectPath) {
                    if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_ObjectManager.CIM_CLASS_NAME)) {
                        result.add((CIMObjectPath)obj);
                    }
                }
            }
            CIM_NamespaceHelper.checkException(enumeration);
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
             CIM_NamespaceHelper.checkException(enumeration);
             Object obj = enumeration.next();
             CIM_NamespaceHelper.checkException(enumeration);

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
           CIM_NamespaceHelper.checkException(enumeration);
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
                   CIM_NamespaceHelper.checkException(enumeration);
                   Object obj = enumeration.next();
                   CIM_NamespaceHelper.checkException(enumeration); 
                   
                   if (obj instanceof CIMObjectPath) {
                      if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_NamespaceInManager.CIM_CLASS_NAME)) {
                         result.add((CIMObjectPath)obj);
                      }
                   }
                }
                CIM_NamespaceHelper.checkException(enumeration);
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
    	    return CIM_Namespace.CIM_CLASS_NAME;
    }



}