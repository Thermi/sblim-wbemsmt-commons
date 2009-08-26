/** 
  * CIM_OperatingSystem.java
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
  * Description: An OperatingSystem is software/firmware that makes a ComputerSystem's hardware usable, and implements and/or manages the resources, file systems, processes, user interfaces, services, ... available on the ComputerSystem.
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
public class CIM_OperatingSystem extends  CIM_EnabledLogicalElement {



   public final static String CIM_CLASS_NAME = "CIM_OperatingSystem";
   public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    
    /**
     * A link between the OperatingSystem and Process(es) running in the context of this OperatingSystem.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_OSPROCESS = "CIM_OSProcess";
    
    /**
     * RunningOS indicates the currently executing OperatingSystem. At most one OperatingSystem can execute at any time on a ComputerSystem. 'At most one' is specified, since the Computer System may not be currently booted, or its OperatingSystem may be unknown.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_RUNNINGOS = "CIM_RunningOS";
    
    
    /**
     * Constant for method\'s name and parameters
     * Requests a reboot of the OperatingSystem. The return value should be 0 if the request was successfully executed, 1 if the request is not supported and some other value if an error occurred. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
     */

    public static class METHOD_REBOOT
    {
       /**
        * Constant for method Reboot
        */ 
       public final static String NAME = "Reboot";

	       	       

    		    
	
    
           }
                  
    
    
    
    /**
     * Constant for method\'s name and parameters
     * Requests a shutdown of the OperatingSystem. The return value should be 0 if the request was successfully executed, 1 if the request is not supported and some other value if an error occurred. It is up to the implementation or subclass of OperatingSystem to establish dependencies between the Shutdown and Reboot methods, and for example, to provide more sophisticated capabilities such as scheduled shutdown/ reboot, etc. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
     */

    public static class METHOD_SHUTDOWN
    {
       /**
        * Constant for method Shutdown
        */ 
       public final static String NAME = "Shutdown";

	       	       

    		    
	
    
           }
                  
    
    
    
    
	    /**
	     * Constants of property CSCreationClassName
     * The scoping ComputerSystem's CreationClassName.
     */
    public static class PROPERTY_CSCREATIONCLASSNAME
    {
       /**
        * name of the property CSCreationClassName
        */
       public final static String NAME = "CSCreationClassName";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property CSName
     * The scoping ComputerSystem's Name.
     */
    public static class PROPERTY_CSNAME
    {
       /**
        * name of the property CSName
        */
       public final static String NAME = "CSName";                  

	    	
    

    		    
	
	    
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
	     * Constants of property CurrentTimeZone
     * CurrentTimeZone indicates the number of minutes the OperatingSystem is offset from Greenwich Mean Time. Either the number is positive, negative or zero.
     */
    public static class PROPERTY_CURRENTTIMEZONE
    {
       /**
        * name of the property CurrentTimeZone
        */
       public final static String NAME = "CurrentTimeZone";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property Distributed
     * Boolean indicating whether the OperatingSystem is distributed across several ComputerSystem nodes. If so, these nodes should be grouped as a Cluster.
     */
    public static class PROPERTY_DISTRIBUTED
    {
       /**
        * name of the property Distributed
        */
       public final static String NAME = "Distributed";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property FreePhysicalMemory
     * Number of Kbytes of physical memory currently unused and available.
     */
    public static class PROPERTY_FREEPHYSICALMEMORY
    {
       /**
        * name of the property FreePhysicalMemory
        */
       public final static String NAME = "FreePhysicalMemory";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property FreeSpaceInPagingFiles
     * The total number of KBytes that can be mapped into the OperatingSystem's paging files without causing any other pages to be swapped out. 0 indicates that there are no paging files.
     */
    public static class PROPERTY_FREESPACEINPAGINGFILES
    {
       /**
        * name of the property FreeSpaceInPagingFiles
        */
       public final static String NAME = "FreeSpaceInPagingFiles";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property FreeVirtualMemory
     * Number of Kbytes of virtual memory currently unused and available. For example, this may be calculated by adding the amount of free RAM to the amount of free paging space (ie, adding the properties, FreePhysicalMemory and FreeSpace InPagingFiles).
     */
    public static class PROPERTY_FREEVIRTUALMEMORY
    {
       /**
        * name of the property FreeVirtualMemory
        */
       public final static String NAME = "FreeVirtualMemory";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property LastBootUpTime
     * Time when the OperatingSystem was last booted.
     */
    public static class PROPERTY_LASTBOOTUPTIME
    {
       /**
        * name of the property LastBootUpTime
        */
       public final static String NAME = "LastBootUpTime";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property LocalDateTime
     * OperatingSystem's notion of the local date and time of day.
     */
    public static class PROPERTY_LOCALDATETIME
    {
       /**
        * name of the property LocalDateTime
        */
       public final static String NAME = "LocalDateTime";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property MaxNumberOfProcesses
     * Maximum number of process contexts the OperatingSystem can support. If there is no fixed maximum, the value should be 0. On systems that have a fixed maximum, this object can help diagnose failures that occur when the maximum is reached.
     */
    public static class PROPERTY_MAXNUMBEROFPROCESSES
    {
       /**
        * name of the property MaxNumberOfProcesses
        */
       public final static String NAME = "MaxNumberOfProcesses";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property MaxProcessMemorySize
     * Maximum number of Kbytes of memory that can be allocated to a Process. For Operating Systems with no virtual memory, this value is typically equal to the total amount of physical Memory minus memory used by the BIOS and OS. For some Operating Systems, this value may be infinity - in which case, 0 should be entered. In other cases, this value could be a constant - for example, 2G or 4G.
     */
    public static class PROPERTY_MAXPROCESSMEMORYSIZE
    {
       /**
        * name of the property MaxProcessMemorySize
        */
       public final static String NAME = "MaxProcessMemorySize";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property MaxProcessesPerUser
     * A value that indicates the maximum processes that a user can have associate with it.
     */
    public static class PROPERTY_MAXPROCESSESPERUSER
    {
       /**
        * name of the property MaxProcessesPerUser
        */
       public final static String NAME = "MaxProcessesPerUser";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property Name
     * The inherited Name serves as key of an OperatingSystem instance within a ComputerSystem.
     */
    public static class PROPERTY_NAME
    {
       /**
        * name of the property Name
        */
       public final static String NAME = "Name";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property NumberOfLicensedUsers
     * Number of user licenses for the OperatingSystem. If unlimited, enter 0.
     */
    public static class PROPERTY_NUMBEROFLICENSEDUSERS
    {
       /**
        * name of the property NumberOfLicensedUsers
        */
       public final static String NAME = "NumberOfLicensedUsers";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property NumberOfProcesses
     * Number of process contexts currently loaded or running on the OperatingSystem.
     */
    public static class PROPERTY_NUMBEROFPROCESSES
    {
       /**
        * name of the property NumberOfProcesses
        */
       public final static String NAME = "NumberOfProcesses";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property NumberOfUsers
     * Number of user sessions for which the OperatingSystem is currently storing state information.
     */
    public static class PROPERTY_NUMBEROFUSERS
    {
       /**
        * name of the property NumberOfUsers
        */
       public final static String NAME = "NumberOfUsers";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property OSType
     * A integer indicating the type of OperatingSystem.
     */
    public static class PROPERTY_OSTYPE
    {
       /**
        * name of the property OSType
        */
       public final static String NAME = "OSType";                  

	    	
    

              
       		
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
	       * ValueMap entries
       * Contains no entries that having an integer value range representation
       * 
       * The couterpart for the value entries is returned by VALUE_ENTRIES_FOR_DISPLAY
       *
       * @see \#VALUE_ENTRIES_FOR_DISPLAY
       * 
       * Value Map for the property OSType   
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
        * Value Map for the property OSType   
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
        * Value Map for the property OSType   
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
	     * Constants of property OtherTypeDescription
     * A string describing the manufacturer and OperatingSystem type - used when the OperatingSystem property, OSType, is set to 1 or 59 ("Other" or "Dedicated"). The format of the string inserted in OtherTypeDescription should be similar in format to the Values strings defined for OSType. OtherTypeDescription should be set to NULL when OSType is any value other than 1 or 59.
     */
    public static class PROPERTY_OTHERTYPEDESCRIPTION
    {
       /**
        * name of the property OtherTypeDescription
        */
       public final static String NAME = "OtherTypeDescription";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property SizeStoredInPagingFiles
     * The total number of KBytes that can be stored in the OperatingSystem's paging files. 0 indicates that there are no paging files.
     */
    public static class PROPERTY_SIZESTOREDINPAGINGFILES
    {
       /**
        * name of the property SizeStoredInPagingFiles
        */
       public final static String NAME = "SizeStoredInPagingFiles";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property TotalSwapSpaceSize
     * Total swap space in Kbytes. This value may be NULL (unspecified) if swap space is not distinguished from page files. However, some Operating Systems distinguish these concepts. For example, in UNIX, whole processes can be 'swapped out' when the free page list falls and remains below a specified amount.
     */
    public static class PROPERTY_TOTALSWAPSPACESIZE
    {
       /**
        * name of the property TotalSwapSpaceSize
        */
       public final static String NAME = "TotalSwapSpaceSize";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property TotalVirtualMemorySize
     * Number of Kbytes of virtual memory. For example, this may be calculated by adding the amount of total RAM to the amount of paging space (ie, adding the amount of memory in/aggregated by the ComputerSystem to the property, SizeStoredInPagingFiles.
     */
    public static class PROPERTY_TOTALVIRTUALMEMORYSIZE
    {
       /**
        * name of the property TotalVirtualMemorySize
        */
       public final static String NAME = "TotalVirtualMemorySize";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property TotalVisibleMemorySize
     * The total amount of physical memory (in Kbytes) available to the OperatingSystem. This value does not necessarily indicate the true amount of physical memory, but what is reported to the OperatingSystem as available to it.
     */
    public static class PROPERTY_TOTALVISIBLEMEMORYSIZE
    {
       /**
        * name of the property TotalVisibleMemorySize
        */
       public final static String NAME = "TotalVisibleMemorySize";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property Version
     * A string describing the Operating System's version number. The format of the version information is as follows: <Major Number>.<Minor Number>.<Revision> or <Major Number>.<Minor Number>.<Revision Letter>.
     */
    public static class PROPERTY_VERSION
    {
       /**
        * name of the property Version
        */
       public final static String NAME = "Version";                  

	    	
    

    		    
	
	    
	    }
	    	    

   

    
    static {    
           addPackage("org.sblim.wbemsmt.schema.cim221");
                         String[] parentClassPackageList = CIM_EnabledLogicalElement.getPackages();
        
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
    *   An OperatingSystem is software/firmware that makes a ComputerSystem's hardware usable, and implements and/or manages the resources, file systems, processes, user interfaces, services, ... available on the ComputerSystem.
    *   @param client the CIM Client
    *   @param namespace the target namespace
    */  

      
   public CIM_OperatingSystem(WBEMClient client, String namespace) throws WbemsmtException
   {
       CIMClass cls = getClass(client,namespace);
       setFromServer(false);
       init(cls.newInstance(),true);
   }
        
   /**
    *   Class constructor
    * 
    *       *   <br>
    *   An OperatingSystem is software/firmware that makes a ComputerSystem's hardware usable, and implements and/or manages the resources, file systems, processes, user interfaces, services, ... available on the ComputerSystem.
    *   @param cimInstance the instance that is used to create the Object
    */  
   
   public CIM_OperatingSystem(CIMInstance cimInstance)  throws WbemsmtException { 
        
       if (cimInstance == null) {
           throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER, "The cimInstance parameter does not contain a valid reference.");
       }
       setFromServer(true);
       init(cimInstance,false);
   }
   
   /**
    * Default constructor
    */
   protected CIM_OperatingSystem()
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
              propertiesToCheck.put("CSCreationClassName",new CIMProperty("CSCreationClassName",CIMDataType.STRING_T,null));
              propertiesToCheck.put("CSName",new CIMProperty("CSName",CIMDataType.STRING_T,null));
              propertiesToCheck.put("CreationClassName",new CIMProperty("CreationClassName",CIMDataType.STRING_T,null));
              propertiesToCheck.put("CurrentTimeZone",new CIMProperty("CurrentTimeZone",CIMDataType.SINT16_T,null));
              propertiesToCheck.put("Distributed",new CIMProperty("Distributed",CIMDataType.BOOLEAN_T,null));
              propertiesToCheck.put("FreePhysicalMemory",new CIMProperty("FreePhysicalMemory",CIMDataType.UINT64_T,null));
              propertiesToCheck.put("FreeSpaceInPagingFiles",new CIMProperty("FreeSpaceInPagingFiles",CIMDataType.UINT64_T,null));
              propertiesToCheck.put("FreeVirtualMemory",new CIMProperty("FreeVirtualMemory",CIMDataType.UINT64_T,null));
              propertiesToCheck.put("LastBootUpTime",new CIMProperty("LastBootUpTime",CIMDataType.DATETIME_T,null));
              propertiesToCheck.put("LocalDateTime",new CIMProperty("LocalDateTime",CIMDataType.DATETIME_T,null));
              propertiesToCheck.put("MaxNumberOfProcesses",new CIMProperty("MaxNumberOfProcesses",CIMDataType.UINT32_T,null));
              propertiesToCheck.put("MaxProcessMemorySize",new CIMProperty("MaxProcessMemorySize",CIMDataType.UINT64_T,null));
              propertiesToCheck.put("MaxProcessesPerUser",new CIMProperty("MaxProcessesPerUser",CIMDataType.UINT32_T,null));
              propertiesToCheck.put("Name",new CIMProperty("Name",CIMDataType.STRING_T,null));
              propertiesToCheck.put("NumberOfLicensedUsers",new CIMProperty("NumberOfLicensedUsers",CIMDataType.UINT32_T,null));
              propertiesToCheck.put("NumberOfProcesses",new CIMProperty("NumberOfProcesses",CIMDataType.UINT32_T,null));
              propertiesToCheck.put("NumberOfUsers",new CIMProperty("NumberOfUsers",CIMDataType.UINT32_T,null));
              propertiesToCheck.put("OSType",new CIMProperty("OSType",CIMDataType.UINT16_T,null));
              propertiesToCheck.put("OtherTypeDescription",new CIMProperty("OtherTypeDescription",CIMDataType.STRING_T,null));
              propertiesToCheck.put("SizeStoredInPagingFiles",new CIMProperty("SizeStoredInPagingFiles",CIMDataType.UINT64_T,null));
              propertiesToCheck.put("TotalSwapSpaceSize",new CIMProperty("TotalSwapSpaceSize",CIMDataType.UINT64_T,null));
              propertiesToCheck.put("TotalVirtualMemorySize",new CIMProperty("TotalVirtualMemorySize",CIMDataType.UINT64_T,null));
              propertiesToCheck.put("TotalVisibleMemorySize",new CIMProperty("TotalVisibleMemorySize",CIMDataType.UINT64_T,null));
              propertiesToCheck.put("Version",new CIMProperty("Version",CIMDataType.STRING_T,null));
       	
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
    * Get the property CSCreationClassName
    *     * <br>
    * The scoping ComputerSystem's CreationClassName.
    *     */

      

               
   public String get_key_CSCreationClassName()    {
       CIMProperty currentProperty = getProperty(PROPERTY_CSCREATIONCLASSNAME.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_CSCREATIONCLASSNAME.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property CSCreationClassName
    * <br>
    * The scoping ComputerSystem's CreationClassName.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_key_CSCreationClassName(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_CSCREATIONCLASSNAME.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_key_CSCreationClassName(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_CSCREATIONCLASSNAME.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property CSCreationClassName by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_key_CSCreationClassName(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        CIM_OperatingSystem fco = new CIM_OperatingSystem(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CSCREATIONCLASSNAME.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_key_CSCreationClassName(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_CSCREATIONCLASSNAME.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property CSCreationClassName
    * <br>
    * The scoping ComputerSystem's CreationClassName.
    */
    
   private static CIMProperty setPropertyValue_key_CSCreationClassName(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property CSName
    *     * <br>
    * The scoping ComputerSystem's Name.
    *     */

      

               
   public String get_key_CSName()    {
       CIMProperty currentProperty = getProperty(PROPERTY_CSNAME.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_CSNAME.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property CSName
    * <br>
    * The scoping ComputerSystem's Name.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_key_CSName(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_CSNAME.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_key_CSName(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_CSNAME.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property CSName by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_key_CSName(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        CIM_OperatingSystem fco = new CIM_OperatingSystem(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CSNAME.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_key_CSName(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_CSNAME.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property CSName
    * <br>
    * The scoping ComputerSystem's Name.
    */
    
   private static CIMProperty setPropertyValue_key_CSName(CIMProperty currentProperty, String newValue)
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
        CIM_OperatingSystem fco = new CIM_OperatingSystem(client,namespace);
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
    * Get the property CurrentTimeZone
    *     * <br>
    * CurrentTimeZone indicates the number of minutes the OperatingSystem is offset from Greenwich Mean Time. Either the number is positive, negative or zero.
    *     */

      

               
   public Short get_CurrentTimeZone()    {
       CIMProperty currentProperty = getProperty(PROPERTY_CURRENTTIMEZONE.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_CURRENTTIMEZONE.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (Short)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property CurrentTimeZone
    * <br>
    * CurrentTimeZone indicates the number of minutes the OperatingSystem is offset from Greenwich Mean Time. Either the number is positive, negative or zero.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_CurrentTimeZone(Short newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_CURRENTTIMEZONE.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_CurrentTimeZone(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_CURRENTTIMEZONE.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property CurrentTimeZone by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_CurrentTimeZone(WBEMClient client, String namespace, Short newValue) throws WbemsmtException {
        CIM_OperatingSystem fco = new CIM_OperatingSystem(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CURRENTTIMEZONE.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_CurrentTimeZone(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_CURRENTTIMEZONE.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property CurrentTimeZone
    * <br>
    * CurrentTimeZone indicates the number of minutes the OperatingSystem is offset from Greenwich Mean Time. Either the number is positive, negative or zero.
    */
    
   private static CIMProperty setPropertyValue_CurrentTimeZone(CIMProperty currentProperty, Short newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property Distributed
    *     * <br>
    * Boolean indicating whether the OperatingSystem is distributed across several ComputerSystem nodes. If so, these nodes should be grouped as a Cluster.
    *     */

      

               
   public Boolean get_Distributed()    {
       CIMProperty currentProperty = getProperty(PROPERTY_DISTRIBUTED.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_DISTRIBUTED.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (Boolean)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property Distributed
    * <br>
    * Boolean indicating whether the OperatingSystem is distributed across several ComputerSystem nodes. If so, these nodes should be grouped as a Cluster.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_Distributed(Boolean newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_DISTRIBUTED.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_Distributed(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_DISTRIBUTED.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property Distributed by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Distributed(WBEMClient client, String namespace, Boolean newValue) throws WbemsmtException {
        CIM_OperatingSystem fco = new CIM_OperatingSystem(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_DISTRIBUTED.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_Distributed(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_DISTRIBUTED.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property Distributed
    * <br>
    * Boolean indicating whether the OperatingSystem is distributed across several ComputerSystem nodes. If so, these nodes should be grouped as a Cluster.
    */
    
   private static CIMProperty setPropertyValue_Distributed(CIMProperty currentProperty, Boolean newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property FreePhysicalMemory
    *     * <br>
    * Number of Kbytes of physical memory currently unused and available.
    *     */

      

               
   public javax.cim.UnsignedInteger64 get_FreePhysicalMemory()    {
       CIMProperty currentProperty = getProperty(PROPERTY_FREEPHYSICALMEMORY.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_FREEPHYSICALMEMORY.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (javax.cim.UnsignedInteger64)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property FreePhysicalMemory
    * <br>
    * Number of Kbytes of physical memory currently unused and available.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_FreePhysicalMemory(javax.cim.UnsignedInteger64 newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_FREEPHYSICALMEMORY.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_FreePhysicalMemory(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_FREEPHYSICALMEMORY.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property FreePhysicalMemory by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_FreePhysicalMemory(WBEMClient client, String namespace, javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_OperatingSystem fco = new CIM_OperatingSystem(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_FREEPHYSICALMEMORY.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_FreePhysicalMemory(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_FREEPHYSICALMEMORY.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property FreePhysicalMemory
    * <br>
    * Number of Kbytes of physical memory currently unused and available.
    */
    
   private static CIMProperty setPropertyValue_FreePhysicalMemory(CIMProperty currentProperty, javax.cim.UnsignedInteger64 newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property FreeSpaceInPagingFiles
    *     * <br>
    * The total number of KBytes that can be mapped into the OperatingSystem's paging files without causing any other pages to be swapped out. 0 indicates that there are no paging files.
    *     */

      

               
   public javax.cim.UnsignedInteger64 get_FreeSpaceInPagingFiles()    {
       CIMProperty currentProperty = getProperty(PROPERTY_FREESPACEINPAGINGFILES.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_FREESPACEINPAGINGFILES.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (javax.cim.UnsignedInteger64)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property FreeSpaceInPagingFiles
    * <br>
    * The total number of KBytes that can be mapped into the OperatingSystem's paging files without causing any other pages to be swapped out. 0 indicates that there are no paging files.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_FreeSpaceInPagingFiles(javax.cim.UnsignedInteger64 newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_FREESPACEINPAGINGFILES.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_FreeSpaceInPagingFiles(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_FREESPACEINPAGINGFILES.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property FreeSpaceInPagingFiles by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_FreeSpaceInPagingFiles(WBEMClient client, String namespace, javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_OperatingSystem fco = new CIM_OperatingSystem(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_FREESPACEINPAGINGFILES.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_FreeSpaceInPagingFiles(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_FREESPACEINPAGINGFILES.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property FreeSpaceInPagingFiles
    * <br>
    * The total number of KBytes that can be mapped into the OperatingSystem's paging files without causing any other pages to be swapped out. 0 indicates that there are no paging files.
    */
    
   private static CIMProperty setPropertyValue_FreeSpaceInPagingFiles(CIMProperty currentProperty, javax.cim.UnsignedInteger64 newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property FreeVirtualMemory
    *     * <br>
    * Number of Kbytes of virtual memory currently unused and available. For example, this may be calculated by adding the amount of free RAM to the amount of free paging space (ie, adding the properties, FreePhysicalMemory and FreeSpace InPagingFiles).
    *     */

      

               
   public javax.cim.UnsignedInteger64 get_FreeVirtualMemory()    {
       CIMProperty currentProperty = getProperty(PROPERTY_FREEVIRTUALMEMORY.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_FREEVIRTUALMEMORY.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (javax.cim.UnsignedInteger64)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property FreeVirtualMemory
    * <br>
    * Number of Kbytes of virtual memory currently unused and available. For example, this may be calculated by adding the amount of free RAM to the amount of free paging space (ie, adding the properties, FreePhysicalMemory and FreeSpace InPagingFiles).
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_FreeVirtualMemory(javax.cim.UnsignedInteger64 newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_FREEVIRTUALMEMORY.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_FreeVirtualMemory(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_FREEVIRTUALMEMORY.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property FreeVirtualMemory by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_FreeVirtualMemory(WBEMClient client, String namespace, javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_OperatingSystem fco = new CIM_OperatingSystem(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_FREEVIRTUALMEMORY.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_FreeVirtualMemory(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_FREEVIRTUALMEMORY.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property FreeVirtualMemory
    * <br>
    * Number of Kbytes of virtual memory currently unused and available. For example, this may be calculated by adding the amount of free RAM to the amount of free paging space (ie, adding the properties, FreePhysicalMemory and FreeSpace InPagingFiles).
    */
    
   private static CIMProperty setPropertyValue_FreeVirtualMemory(CIMProperty currentProperty, javax.cim.UnsignedInteger64 newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property LastBootUpTime
    *     * <br>
    * Time when the OperatingSystem was last booted.
    *     */

      

               
   public javax.cim.CIMDateTime get_LastBootUpTime()    {
       CIMProperty currentProperty = getProperty(PROPERTY_LASTBOOTUPTIME.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_LASTBOOTUPTIME.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (javax.cim.CIMDateTime)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property LastBootUpTime
    * <br>
    * Time when the OperatingSystem was last booted.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_LastBootUpTime(javax.cim.CIMDateTime newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_LASTBOOTUPTIME.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_LastBootUpTime(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_LASTBOOTUPTIME.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property LastBootUpTime by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_LastBootUpTime(WBEMClient client, String namespace, javax.cim.CIMDateTime newValue) throws WbemsmtException {
        CIM_OperatingSystem fco = new CIM_OperatingSystem(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_LASTBOOTUPTIME.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_LastBootUpTime(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_LASTBOOTUPTIME.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property LastBootUpTime
    * <br>
    * Time when the OperatingSystem was last booted.
    */
    
   private static CIMProperty setPropertyValue_LastBootUpTime(CIMProperty currentProperty, javax.cim.CIMDateTime newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property LocalDateTime
    *     * <br>
    * OperatingSystem's notion of the local date and time of day.
    *     */

      

               
   public javax.cim.CIMDateTime get_LocalDateTime()    {
       CIMProperty currentProperty = getProperty(PROPERTY_LOCALDATETIME.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_LOCALDATETIME.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (javax.cim.CIMDateTime)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property LocalDateTime
    * <br>
    * OperatingSystem's notion of the local date and time of day.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_LocalDateTime(javax.cim.CIMDateTime newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_LOCALDATETIME.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_LocalDateTime(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_LOCALDATETIME.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property LocalDateTime by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_LocalDateTime(WBEMClient client, String namespace, javax.cim.CIMDateTime newValue) throws WbemsmtException {
        CIM_OperatingSystem fco = new CIM_OperatingSystem(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_LOCALDATETIME.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_LocalDateTime(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_LOCALDATETIME.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property LocalDateTime
    * <br>
    * OperatingSystem's notion of the local date and time of day.
    */
    
   private static CIMProperty setPropertyValue_LocalDateTime(CIMProperty currentProperty, javax.cim.CIMDateTime newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property MaxNumberOfProcesses
    *     * <br>
    * Maximum number of process contexts the OperatingSystem can support. If there is no fixed maximum, the value should be 0. On systems that have a fixed maximum, this object can help diagnose failures that occur when the maximum is reached.
    *     */

      

               
   public javax.cim.UnsignedInteger32 get_MaxNumberOfProcesses()    {
       CIMProperty currentProperty = getProperty(PROPERTY_MAXNUMBEROFPROCESSES.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_MAXNUMBEROFPROCESSES.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (javax.cim.UnsignedInteger32)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property MaxNumberOfProcesses
    * <br>
    * Maximum number of process contexts the OperatingSystem can support. If there is no fixed maximum, the value should be 0. On systems that have a fixed maximum, this object can help diagnose failures that occur when the maximum is reached.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_MaxNumberOfProcesses(javax.cim.UnsignedInteger32 newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_MAXNUMBEROFPROCESSES.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_MaxNumberOfProcesses(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_MAXNUMBEROFPROCESSES.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property MaxNumberOfProcesses by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_MaxNumberOfProcesses(WBEMClient client, String namespace, javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_OperatingSystem fco = new CIM_OperatingSystem(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MAXNUMBEROFPROCESSES.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_MaxNumberOfProcesses(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_MAXNUMBEROFPROCESSES.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property MaxNumberOfProcesses
    * <br>
    * Maximum number of process contexts the OperatingSystem can support. If there is no fixed maximum, the value should be 0. On systems that have a fixed maximum, this object can help diagnose failures that occur when the maximum is reached.
    */
    
   private static CIMProperty setPropertyValue_MaxNumberOfProcesses(CIMProperty currentProperty, javax.cim.UnsignedInteger32 newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property MaxProcessMemorySize
    *     * <br>
    * Maximum number of Kbytes of memory that can be allocated to a Process. For Operating Systems with no virtual memory, this value is typically equal to the total amount of physical Memory minus memory used by the BIOS and OS. For some Operating Systems, this value may be infinity - in which case, 0 should be entered. In other cases, this value could be a constant - for example, 2G or 4G.
    *     */

      

               
   public javax.cim.UnsignedInteger64 get_MaxProcessMemorySize()    {
       CIMProperty currentProperty = getProperty(PROPERTY_MAXPROCESSMEMORYSIZE.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_MAXPROCESSMEMORYSIZE.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (javax.cim.UnsignedInteger64)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property MaxProcessMemorySize
    * <br>
    * Maximum number of Kbytes of memory that can be allocated to a Process. For Operating Systems with no virtual memory, this value is typically equal to the total amount of physical Memory minus memory used by the BIOS and OS. For some Operating Systems, this value may be infinity - in which case, 0 should be entered. In other cases, this value could be a constant - for example, 2G or 4G.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_MaxProcessMemorySize(javax.cim.UnsignedInteger64 newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_MAXPROCESSMEMORYSIZE.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_MaxProcessMemorySize(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_MAXPROCESSMEMORYSIZE.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property MaxProcessMemorySize by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_MaxProcessMemorySize(WBEMClient client, String namespace, javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_OperatingSystem fco = new CIM_OperatingSystem(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MAXPROCESSMEMORYSIZE.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_MaxProcessMemorySize(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_MAXPROCESSMEMORYSIZE.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property MaxProcessMemorySize
    * <br>
    * Maximum number of Kbytes of memory that can be allocated to a Process. For Operating Systems with no virtual memory, this value is typically equal to the total amount of physical Memory minus memory used by the BIOS and OS. For some Operating Systems, this value may be infinity - in which case, 0 should be entered. In other cases, this value could be a constant - for example, 2G or 4G.
    */
    
   private static CIMProperty setPropertyValue_MaxProcessMemorySize(CIMProperty currentProperty, javax.cim.UnsignedInteger64 newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property MaxProcessesPerUser
    *     * <br>
    * A value that indicates the maximum processes that a user can have associate with it.
    *     */

      

               
   public javax.cim.UnsignedInteger32 get_MaxProcessesPerUser()    {
       CIMProperty currentProperty = getProperty(PROPERTY_MAXPROCESSESPERUSER.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_MAXPROCESSESPERUSER.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (javax.cim.UnsignedInteger32)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property MaxProcessesPerUser
    * <br>
    * A value that indicates the maximum processes that a user can have associate with it.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_MaxProcessesPerUser(javax.cim.UnsignedInteger32 newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_MAXPROCESSESPERUSER.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_MaxProcessesPerUser(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_MAXPROCESSESPERUSER.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property MaxProcessesPerUser by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_MaxProcessesPerUser(WBEMClient client, String namespace, javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_OperatingSystem fco = new CIM_OperatingSystem(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MAXPROCESSESPERUSER.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_MaxProcessesPerUser(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_MAXPROCESSESPERUSER.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property MaxProcessesPerUser
    * <br>
    * A value that indicates the maximum processes that a user can have associate with it.
    */
    
   private static CIMProperty setPropertyValue_MaxProcessesPerUser(CIMProperty currentProperty, javax.cim.UnsignedInteger32 newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property Name
    *     * <br>
    * The inherited Name serves as key of an OperatingSystem instance within a ComputerSystem.
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
    * The inherited Name serves as key of an OperatingSystem instance within a ComputerSystem.
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
        CIM_OperatingSystem fco = new CIM_OperatingSystem(client,namespace);
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
    * The inherited Name serves as key of an OperatingSystem instance within a ComputerSystem.
    */
    
   private static CIMProperty setPropertyValue_key_Name(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property NumberOfLicensedUsers
    *     * <br>
    * Number of user licenses for the OperatingSystem. If unlimited, enter 0.
    *     */

      

               
   public javax.cim.UnsignedInteger32 get_NumberOfLicensedUsers()    {
       CIMProperty currentProperty = getProperty(PROPERTY_NUMBEROFLICENSEDUSERS.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_NUMBEROFLICENSEDUSERS.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (javax.cim.UnsignedInteger32)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property NumberOfLicensedUsers
    * <br>
    * Number of user licenses for the OperatingSystem. If unlimited, enter 0.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_NumberOfLicensedUsers(javax.cim.UnsignedInteger32 newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_NUMBEROFLICENSEDUSERS.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_NumberOfLicensedUsers(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_NUMBEROFLICENSEDUSERS.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property NumberOfLicensedUsers by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_NumberOfLicensedUsers(WBEMClient client, String namespace, javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_OperatingSystem fco = new CIM_OperatingSystem(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_NUMBEROFLICENSEDUSERS.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_NumberOfLicensedUsers(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_NUMBEROFLICENSEDUSERS.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property NumberOfLicensedUsers
    * <br>
    * Number of user licenses for the OperatingSystem. If unlimited, enter 0.
    */
    
   private static CIMProperty setPropertyValue_NumberOfLicensedUsers(CIMProperty currentProperty, javax.cim.UnsignedInteger32 newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property NumberOfProcesses
    *     * <br>
    * Number of process contexts currently loaded or running on the OperatingSystem.
    *     */

      

               
   public javax.cim.UnsignedInteger32 get_NumberOfProcesses()    {
       CIMProperty currentProperty = getProperty(PROPERTY_NUMBEROFPROCESSES.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_NUMBEROFPROCESSES.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (javax.cim.UnsignedInteger32)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property NumberOfProcesses
    * <br>
    * Number of process contexts currently loaded or running on the OperatingSystem.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_NumberOfProcesses(javax.cim.UnsignedInteger32 newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_NUMBEROFPROCESSES.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_NumberOfProcesses(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_NUMBEROFPROCESSES.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property NumberOfProcesses by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_NumberOfProcesses(WBEMClient client, String namespace, javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_OperatingSystem fco = new CIM_OperatingSystem(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_NUMBEROFPROCESSES.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_NumberOfProcesses(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_NUMBEROFPROCESSES.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property NumberOfProcesses
    * <br>
    * Number of process contexts currently loaded or running on the OperatingSystem.
    */
    
   private static CIMProperty setPropertyValue_NumberOfProcesses(CIMProperty currentProperty, javax.cim.UnsignedInteger32 newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property NumberOfUsers
    *     * <br>
    * Number of user sessions for which the OperatingSystem is currently storing state information.
    *     */

      

               
   public javax.cim.UnsignedInteger32 get_NumberOfUsers()    {
       CIMProperty currentProperty = getProperty(PROPERTY_NUMBEROFUSERS.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_NUMBEROFUSERS.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (javax.cim.UnsignedInteger32)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property NumberOfUsers
    * <br>
    * Number of user sessions for which the OperatingSystem is currently storing state information.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_NumberOfUsers(javax.cim.UnsignedInteger32 newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_NUMBEROFUSERS.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_NumberOfUsers(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_NUMBEROFUSERS.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property NumberOfUsers by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_NumberOfUsers(WBEMClient client, String namespace, javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_OperatingSystem fco = new CIM_OperatingSystem(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_NUMBEROFUSERS.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_NumberOfUsers(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_NUMBEROFUSERS.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property NumberOfUsers
    * <br>
    * Number of user sessions for which the OperatingSystem is currently storing state information.
    */
    
   private static CIMProperty setPropertyValue_NumberOfUsers(CIMProperty currentProperty, javax.cim.UnsignedInteger32 newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property OSType
    *     * <br>
    * A integer indicating the type of OperatingSystem.
    *     */

      

               
   public javax.cim.UnsignedInteger16 get_OSType()    {
       CIMProperty currentProperty = getProperty(PROPERTY_OSTYPE.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_OSTYPE.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (javax.cim.UnsignedInteger16)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property OSType
    * <br>
    * A integer indicating the type of OperatingSystem.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_OSType(javax.cim.UnsignedInteger16 newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_OSTYPE.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_OSType(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_OSTYPE.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property OSType by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OSType(WBEMClient client, String namespace, javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_OperatingSystem fco = new CIM_OperatingSystem(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OSTYPE.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_OSType(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_OSTYPE.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property OSType
    * <br>
    * A integer indicating the type of OperatingSystem.
    */
    
   private static CIMProperty setPropertyValue_OSType(CIMProperty currentProperty, javax.cim.UnsignedInteger16 newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property OtherTypeDescription
    *     * <br>
    * A string describing the manufacturer and OperatingSystem type - used when the OperatingSystem property, OSType, is set to 1 or 59 ("Other" or "Dedicated"). The format of the string inserted in OtherTypeDescription should be similar in format to the Values strings defined for OSType. OtherTypeDescription should be set to NULL when OSType is any value other than 1 or 59.
    *     */

      

               
   public String get_OtherTypeDescription()    {
       CIMProperty currentProperty = getProperty(PROPERTY_OTHERTYPEDESCRIPTION.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_OTHERTYPEDESCRIPTION.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property OtherTypeDescription
    * <br>
    * A string describing the manufacturer and OperatingSystem type - used when the OperatingSystem property, OSType, is set to 1 or 59 ("Other" or "Dedicated"). The format of the string inserted in OtherTypeDescription should be similar in format to the Values strings defined for OSType. OtherTypeDescription should be set to NULL when OSType is any value other than 1 or 59.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_OtherTypeDescription(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_OTHERTYPEDESCRIPTION.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_OtherTypeDescription(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_OTHERTYPEDESCRIPTION.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property OtherTypeDescription by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherTypeDescription(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        CIM_OperatingSystem fco = new CIM_OperatingSystem(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OTHERTYPEDESCRIPTION.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_OtherTypeDescription(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_OTHERTYPEDESCRIPTION.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property OtherTypeDescription
    * <br>
    * A string describing the manufacturer and OperatingSystem type - used when the OperatingSystem property, OSType, is set to 1 or 59 ("Other" or "Dedicated"). The format of the string inserted in OtherTypeDescription should be similar in format to the Values strings defined for OSType. OtherTypeDescription should be set to NULL when OSType is any value other than 1 or 59.
    */
    
   private static CIMProperty setPropertyValue_OtherTypeDescription(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property SizeStoredInPagingFiles
    *     * <br>
    * The total number of KBytes that can be stored in the OperatingSystem's paging files. 0 indicates that there are no paging files.
    *     */

      

               
   public javax.cim.UnsignedInteger64 get_SizeStoredInPagingFiles()    {
       CIMProperty currentProperty = getProperty(PROPERTY_SIZESTOREDINPAGINGFILES.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_SIZESTOREDINPAGINGFILES.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (javax.cim.UnsignedInteger64)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property SizeStoredInPagingFiles
    * <br>
    * The total number of KBytes that can be stored in the OperatingSystem's paging files. 0 indicates that there are no paging files.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_SizeStoredInPagingFiles(javax.cim.UnsignedInteger64 newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_SIZESTOREDINPAGINGFILES.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_SizeStoredInPagingFiles(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_SIZESTOREDINPAGINGFILES.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property SizeStoredInPagingFiles by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SizeStoredInPagingFiles(WBEMClient client, String namespace, javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_OperatingSystem fco = new CIM_OperatingSystem(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SIZESTOREDINPAGINGFILES.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_SizeStoredInPagingFiles(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_SIZESTOREDINPAGINGFILES.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property SizeStoredInPagingFiles
    * <br>
    * The total number of KBytes that can be stored in the OperatingSystem's paging files. 0 indicates that there are no paging files.
    */
    
   private static CIMProperty setPropertyValue_SizeStoredInPagingFiles(CIMProperty currentProperty, javax.cim.UnsignedInteger64 newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property TotalSwapSpaceSize
    *     * <br>
    * Total swap space in Kbytes. This value may be NULL (unspecified) if swap space is not distinguished from page files. However, some Operating Systems distinguish these concepts. For example, in UNIX, whole processes can be 'swapped out' when the free page list falls and remains below a specified amount.
    *     */

      

               
   public javax.cim.UnsignedInteger64 get_TotalSwapSpaceSize()    {
       CIMProperty currentProperty = getProperty(PROPERTY_TOTALSWAPSPACESIZE.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_TOTALSWAPSPACESIZE.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (javax.cim.UnsignedInteger64)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property TotalSwapSpaceSize
    * <br>
    * Total swap space in Kbytes. This value may be NULL (unspecified) if swap space is not distinguished from page files. However, some Operating Systems distinguish these concepts. For example, in UNIX, whole processes can be 'swapped out' when the free page list falls and remains below a specified amount.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_TotalSwapSpaceSize(javax.cim.UnsignedInteger64 newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_TOTALSWAPSPACESIZE.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_TotalSwapSpaceSize(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_TOTALSWAPSPACESIZE.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property TotalSwapSpaceSize by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_TotalSwapSpaceSize(WBEMClient client, String namespace, javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_OperatingSystem fco = new CIM_OperatingSystem(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_TOTALSWAPSPACESIZE.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_TotalSwapSpaceSize(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_TOTALSWAPSPACESIZE.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property TotalSwapSpaceSize
    * <br>
    * Total swap space in Kbytes. This value may be NULL (unspecified) if swap space is not distinguished from page files. However, some Operating Systems distinguish these concepts. For example, in UNIX, whole processes can be 'swapped out' when the free page list falls and remains below a specified amount.
    */
    
   private static CIMProperty setPropertyValue_TotalSwapSpaceSize(CIMProperty currentProperty, javax.cim.UnsignedInteger64 newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property TotalVirtualMemorySize
    *     * <br>
    * Number of Kbytes of virtual memory. For example, this may be calculated by adding the amount of total RAM to the amount of paging space (ie, adding the amount of memory in/aggregated by the ComputerSystem to the property, SizeStoredInPagingFiles.
    *     */

      

               
   public javax.cim.UnsignedInteger64 get_TotalVirtualMemorySize()    {
       CIMProperty currentProperty = getProperty(PROPERTY_TOTALVIRTUALMEMORYSIZE.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_TOTALVIRTUALMEMORYSIZE.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (javax.cim.UnsignedInteger64)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property TotalVirtualMemorySize
    * <br>
    * Number of Kbytes of virtual memory. For example, this may be calculated by adding the amount of total RAM to the amount of paging space (ie, adding the amount of memory in/aggregated by the ComputerSystem to the property, SizeStoredInPagingFiles.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_TotalVirtualMemorySize(javax.cim.UnsignedInteger64 newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_TOTALVIRTUALMEMORYSIZE.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_TotalVirtualMemorySize(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_TOTALVIRTUALMEMORYSIZE.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property TotalVirtualMemorySize by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_TotalVirtualMemorySize(WBEMClient client, String namespace, javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_OperatingSystem fco = new CIM_OperatingSystem(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_TOTALVIRTUALMEMORYSIZE.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_TotalVirtualMemorySize(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_TOTALVIRTUALMEMORYSIZE.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property TotalVirtualMemorySize
    * <br>
    * Number of Kbytes of virtual memory. For example, this may be calculated by adding the amount of total RAM to the amount of paging space (ie, adding the amount of memory in/aggregated by the ComputerSystem to the property, SizeStoredInPagingFiles.
    */
    
   private static CIMProperty setPropertyValue_TotalVirtualMemorySize(CIMProperty currentProperty, javax.cim.UnsignedInteger64 newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property TotalVisibleMemorySize
    *     * <br>
    * The total amount of physical memory (in Kbytes) available to the OperatingSystem. This value does not necessarily indicate the true amount of physical memory, but what is reported to the OperatingSystem as available to it.
    *     */

      

               
   public javax.cim.UnsignedInteger64 get_TotalVisibleMemorySize()    {
       CIMProperty currentProperty = getProperty(PROPERTY_TOTALVISIBLEMEMORYSIZE.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_TOTALVISIBLEMEMORYSIZE.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (javax.cim.UnsignedInteger64)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property TotalVisibleMemorySize
    * <br>
    * The total amount of physical memory (in Kbytes) available to the OperatingSystem. This value does not necessarily indicate the true amount of physical memory, but what is reported to the OperatingSystem as available to it.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_TotalVisibleMemorySize(javax.cim.UnsignedInteger64 newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_TOTALVISIBLEMEMORYSIZE.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_TotalVisibleMemorySize(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_TOTALVISIBLEMEMORYSIZE.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property TotalVisibleMemorySize by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_TotalVisibleMemorySize(WBEMClient client, String namespace, javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_OperatingSystem fco = new CIM_OperatingSystem(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_TOTALVISIBLEMEMORYSIZE.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_TotalVisibleMemorySize(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_TOTALVISIBLEMEMORYSIZE.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property TotalVisibleMemorySize
    * <br>
    * The total amount of physical memory (in Kbytes) available to the OperatingSystem. This value does not necessarily indicate the true amount of physical memory, but what is reported to the OperatingSystem as available to it.
    */
    
   private static CIMProperty setPropertyValue_TotalVisibleMemorySize(CIMProperty currentProperty, javax.cim.UnsignedInteger64 newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property Version
    *     * <br>
    * A string describing the Operating System's version number. The format of the version information is as follows: <Major Number>.<Minor Number>.<Revision> or <Major Number>.<Minor Number>.<Revision Letter>.
    *     */

      

               
   public String get_Version()    {
       CIMProperty currentProperty = getProperty(PROPERTY_VERSION.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_VERSION.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property Version
    * <br>
    * A string describing the Operating System's version number. The format of the version information is as follows: <Major Number>.<Minor Number>.<Revision> or <Major Number>.<Minor Number>.<Revision Letter>.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_Version(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_VERSION.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_Version(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_VERSION.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property Version by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Version(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        CIM_OperatingSystem fco = new CIM_OperatingSystem(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_VERSION.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_Version(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_VERSION.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property Version
    * <br>
    * A string describing the Operating System's version number. The format of the version information is as follows: <Major Number>.<Minor Number>.<Revision> or <Major Number>.<Minor Number>.<Revision Letter>.
    */
    
   private static CIMProperty setPropertyValue_Version(CIMProperty currentProperty, String newValue)
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
     * Get the list with CIM_Process objects associated by the association CIM_OSProcess
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_OSPROCESS as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<CIM_Process> getAssociated_CIM_Process_CIM_OSProcesss(WBEMClient cimClient) throws WbemsmtException {
     
     	   return getAssociated_CIM_Process_CIM_OSProcesss(
     	                cimClient,
     	                CIM_ASSOCIATOR_CLASS_NAME_CIM_OSPROCESS,
     	                CIM_Process.CIM_CLASS_NAME,
     	                null,
     	                null,
     	                false,
     	                false,
     	                null);
     		
     }

    /**
     * Get the list with CIM_Process objects associated by the association CIM_OSProcess
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_OSPROCESS or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_OSPROCESS as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<CIM_Process> getAssociated_CIM_Process_CIM_OSProcesss(WBEMClient cimClient,String resultClass, String role, String resultRole) throws WbemsmtException {
     
     	   return getAssociated_CIM_Process_CIM_OSProcesss(
     	                cimClient,
     	                CIM_ASSOCIATOR_CLASS_NAME_CIM_OSPROCESS,
     	                resultClass,
     	                role,
     	                resultRole,
     	                false,
     	                false,
     	                null);
     		
     }

    /**
     * Get the list with CIM_Process objects associated by the association CIM_OSProcess
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_OSPROCESS or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<CIM_Process> getAssociated_CIM_Process_CIM_OSProcesss(WBEMClient cimClient, String associationClass, String resultClass, String role, String resultRole, boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList) throws WbemsmtException {

         if (cimClient == null) {
             throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
         }

         java.util.List<CIM_Process> result = new java.util.ArrayList<CIM_Process>();
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
                 CIM_OperatingSystemHelper.checkException(enumeration);
           
                 Object obj = enumeration.next();
                 CIM_OperatingSystemHelper.checkException(enumeration);

                 if (obj instanceof CIMInstance) {
                     CIMInstance cimInstance = (CIMInstance)obj;
                     Class<?> clazz = CIM_OperatingSystemHelper.findClass(cimClient, cimInstance);
                    
                     if (clazz == null) {
                         System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
                         result.add(new CIM_Process(cimInstance));
                         continue;
                     }

                     Class<?>[] constParams = new Class[1];
                     constParams[0] = CIMInstance.class;
                     Constructor<?> cons = null;
                     try {
                         cons = clazz.getConstructor(constParams);
                     } catch(NoSuchMethodException e) {
                         System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of the base class.");
                         result.add(new CIM_Process(cimInstance));
                         continue;
                     }

                     try {
                         Object[] actargs = new Object[] {cimInstance};
                         Object dataObj = cons.newInstance(actargs);
                         result.add((CIM_Process)dataObj);
                     } catch (Exception e) {
                         System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
                         result.add(new CIM_Process(cimInstance));
                         continue;
                     }
                 }
             }
             CIM_OperatingSystemHelper.checkException(enumeration);
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
    * Get the list of CIMObjectPath items of the objects associated by the association CIM_OSProcess
    * @param cimClient the WBEMClient for the communication
    *
    * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_OSPROCESS as associationClass<br>
    * uses false for includeQualifiers and includeClassOrigin <br>
    * uses null for resultClass, role, resultRole<br>
    * <br>
    
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_CIM_Process_CIM_OSProcessNames(WBEMClient cimClient) throws WbemsmtException {
    
    	    return getAssociated_CIM_Process_CIM_OSProcessNames (
    	                             cimClient,
    	                             true,
    	                             CIM_ASSOCIATOR_CLASS_NAME_CIM_OSPROCESS,
    	                             CIM_Process.CIM_CLASS_NAME,
    	                             null,
    	                             null);
    }

   /**
    * Get the list of CIMObjectPath items of the objects associated by the association CIM_OSProcess
    * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_OSPROCESS or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
    *
    * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_OSPROCESS as associationClass<br>
    * uses false for includeQualifiers and includeClassOrigin <br>
    * uses null for resultClass, role, resultRole<br>
    * <br>
    
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_CIM_Process_CIM_OSProcessNames(WBEMClient cimClient,String resultClass, String role, String resultRole) throws WbemsmtException {
    
    	    return getAssociated_CIM_Process_CIM_OSProcessNames (
    	                             cimClient,
    	                             true,
    	                             CIM_ASSOCIATOR_CLASS_NAME_CIM_OSPROCESS,
    	                             resultClass,
    	                             role,
    	                             resultRole);
    }

   /**
    * Get the list of CIMObjectPath items of the objects associated by the association CIM_OSProcess
    * @param cimClient the WBEMClient for the communication
    * @param deep if true the subclasses returned also
    *
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_CIM_Process_CIM_OSProcessNames(WBEMClient cimClient,boolean deep,String associationClass, String resultClass, String role, String resultRole) throws WbemsmtException {

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
                CIM_ASSOCIATOR_CLASS_NAME_CIM_OSPROCESS, 
                CIM_Process.CIM_CLASS_NAME,
                null,null));	
         }
         
         try {
	            while (enumeration.hasNext()) {
                CIM_OperatingSystemHelper.checkException(enumeration);
                                
                Object obj = enumeration.next();
                CIM_OperatingSystemHelper.checkException(enumeration); 
                if (obj instanceof CIMObjectPath) {
                    if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_Process.CIM_CLASS_NAME)) {
                        result.add((CIMObjectPath)obj);
                    }
                }
            }
            CIM_OperatingSystemHelper.checkException(enumeration);
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
    * Get the list with CIM_OSProcess associations
    *
    * @param cimClient the WBEMClient for the communication
    * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
    * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
    * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
    * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
    *
    * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
    **/
                        
                        
   public java.util.List<CIM_OSProcess> getAssociations_CIM_OSProcess(WBEMClient cimClient, boolean includeQualifiers, boolean includeClassOrigin, String role,java.lang.String[] propertyList) throws WbemsmtException {

       if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
       }

       java.util.List<CIM_OSProcess> result = new java.util.ArrayList<CIM_OSProcess>();
       CloseableIterator enumeration = null;

       try {
          enumeration = cimClient.references(
             this.getCimObjectPath(),
             CIM_ASSOCIATOR_CLASS_NAME_CIM_OSPROCESS, 
             role,
             includeQualifiers,
             includeClassOrigin,
             propertyList);
        } catch (WBEMException e) {
         	  throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
             CIM_ASSOCIATOR_CLASS_NAME_CIM_OSPROCESS, 
             role,
             includeQualifiers,
             includeClassOrigin,
             propertyList));	
        }
         
        try {
          while (enumeration.hasNext()) {
             CIM_OperatingSystemHelper.checkException(enumeration);
             Object obj = enumeration.next();
             CIM_OperatingSystemHelper.checkException(enumeration);

             if (obj instanceof CIMInstance) {
                CIMInstance cimInstance = (CIMInstance)obj;
                Class<?> clazz = CIM_OSProcessHelper.findClass(cimClient, cimInstance);
                    
                if (clazz == null) {
                   System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
                   result.add(new CIM_OSProcess(cimInstance));
                   continue;
                }

                Class<?>[] constParams = new Class[1];
                constParams[0] = CIMInstance.class;
                Constructor<?> cons = null;
                try {
                   cons = clazz.getConstructor(constParams);
                } catch(NoSuchMethodException e) {
                   System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of the base class.");
                   result.add(new CIM_OSProcess(cimInstance));
                   continue;
                }

                try {
                   Object[] actargs = new Object[] {cimInstance};
                   Object dataObj = cons.newInstance(actargs);
                   result.add((CIM_OSProcess)dataObj);
                } catch (Exception e) {
                   System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
                   result.add(new CIM_OSProcess(cimInstance));
                   continue;
                }
              }
           }
           CIM_OperatingSystemHelper.checkException(enumeration);
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
    * Get a list of CIMObjectPath items of the associations CIM_OSProcess
    *
    * @param cimClient the WBEMClient for the communication
    * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
    * @param deep if true the subclasses returned also
    *
    * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociationNames_CIM_OSProcess(WBEMClient cimClient,String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
        }

        java.util.List<CIMObjectPath> result = new java.util.ArrayList<CIMObjectPath>();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(
                this.getCimObjectPath(),
                CIM_ASSOCIATOR_CLASS_NAME_CIM_OSPROCESS, 
                role);
        } catch (WBEMException e) {
         	  throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this.getCimObjectPath(),
                CIM_ASSOCIATOR_CLASS_NAME_CIM_OSPROCESS, 
                role));	
        }
         
        try {
                while (enumeration.hasNext()) {
                   CIM_OperatingSystemHelper.checkException(enumeration);
                   Object obj = enumeration.next();
                   CIM_OperatingSystemHelper.checkException(enumeration); 
                   
                   if (obj instanceof CIMObjectPath) {
                      if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_OSProcess.CIM_CLASS_NAME)) {
                         result.add((CIMObjectPath)obj);
                      }
                   }
                }
                CIM_OperatingSystemHelper.checkException(enumeration);
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
     * Get the list with CIM_ComputerSystem objects associated by the association CIM_RunningOS
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_RUNNINGOS as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<CIM_ComputerSystem> getAssociated_CIM_ComputerSystem_CIM_RunningOSs(WBEMClient cimClient) throws WbemsmtException {
     
     	   return getAssociated_CIM_ComputerSystem_CIM_RunningOSs(
     	                cimClient,
     	                CIM_ASSOCIATOR_CLASS_NAME_CIM_RUNNINGOS,
     	                CIM_ComputerSystem.CIM_CLASS_NAME,
     	                null,
     	                null,
     	                false,
     	                false,
     	                null);
     		
     }

    /**
     * Get the list with CIM_ComputerSystem objects associated by the association CIM_RunningOS
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_RUNNINGOS or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_RUNNINGOS as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<CIM_ComputerSystem> getAssociated_CIM_ComputerSystem_CIM_RunningOSs(WBEMClient cimClient,String resultClass, String role, String resultRole) throws WbemsmtException {
     
     	   return getAssociated_CIM_ComputerSystem_CIM_RunningOSs(
     	                cimClient,
     	                CIM_ASSOCIATOR_CLASS_NAME_CIM_RUNNINGOS,
     	                resultClass,
     	                role,
     	                resultRole,
     	                false,
     	                false,
     	                null);
     		
     }

    /**
     * Get the list with CIM_ComputerSystem objects associated by the association CIM_RunningOS
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_RUNNINGOS or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<CIM_ComputerSystem> getAssociated_CIM_ComputerSystem_CIM_RunningOSs(WBEMClient cimClient, String associationClass, String resultClass, String role, String resultRole, boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList) throws WbemsmtException {

         if (cimClient == null) {
             throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
         }

         java.util.List<CIM_ComputerSystem> result = new java.util.ArrayList<CIM_ComputerSystem>();
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
                 CIM_OperatingSystemHelper.checkException(enumeration);
           
                 Object obj = enumeration.next();
                 CIM_OperatingSystemHelper.checkException(enumeration);

                 if (obj instanceof CIMInstance) {
                     CIMInstance cimInstance = (CIMInstance)obj;
                     Class<?> clazz = CIM_OperatingSystemHelper.findClass(cimClient, cimInstance);
                    
                     if (clazz == null) {
                         System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
                         result.add(new CIM_ComputerSystem(cimInstance));
                         continue;
                     }

                     Class<?>[] constParams = new Class[1];
                     constParams[0] = CIMInstance.class;
                     Constructor<?> cons = null;
                     try {
                         cons = clazz.getConstructor(constParams);
                     } catch(NoSuchMethodException e) {
                         System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of the base class.");
                         result.add(new CIM_ComputerSystem(cimInstance));
                         continue;
                     }

                     try {
                         Object[] actargs = new Object[] {cimInstance};
                         Object dataObj = cons.newInstance(actargs);
                         result.add((CIM_ComputerSystem)dataObj);
                     } catch (Exception e) {
                         System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
                         result.add(new CIM_ComputerSystem(cimInstance));
                         continue;
                     }
                 }
             }
             CIM_OperatingSystemHelper.checkException(enumeration);
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
    * Get the list of CIMObjectPath items of the objects associated by the association CIM_RunningOS
    * @param cimClient the WBEMClient for the communication
    *
    * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_RUNNINGOS as associationClass<br>
    * uses false for includeQualifiers and includeClassOrigin <br>
    * uses null for resultClass, role, resultRole<br>
    * <br>
    
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_CIM_ComputerSystem_CIM_RunningOSNames(WBEMClient cimClient) throws WbemsmtException {
    
    	    return getAssociated_CIM_ComputerSystem_CIM_RunningOSNames (
    	                             cimClient,
    	                             true,
    	                             CIM_ASSOCIATOR_CLASS_NAME_CIM_RUNNINGOS,
    	                             CIM_ComputerSystem.CIM_CLASS_NAME,
    	                             null,
    	                             null);
    }

   /**
    * Get the list of CIMObjectPath items of the objects associated by the association CIM_RunningOS
    * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_RUNNINGOS or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
    *
    * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_RUNNINGOS as associationClass<br>
    * uses false for includeQualifiers and includeClassOrigin <br>
    * uses null for resultClass, role, resultRole<br>
    * <br>
    
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_CIM_ComputerSystem_CIM_RunningOSNames(WBEMClient cimClient,String resultClass, String role, String resultRole) throws WbemsmtException {
    
    	    return getAssociated_CIM_ComputerSystem_CIM_RunningOSNames (
    	                             cimClient,
    	                             true,
    	                             CIM_ASSOCIATOR_CLASS_NAME_CIM_RUNNINGOS,
    	                             resultClass,
    	                             role,
    	                             resultRole);
    }

   /**
    * Get the list of CIMObjectPath items of the objects associated by the association CIM_RunningOS
    * @param cimClient the WBEMClient for the communication
    * @param deep if true the subclasses returned also
    *
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_CIM_ComputerSystem_CIM_RunningOSNames(WBEMClient cimClient,boolean deep,String associationClass, String resultClass, String role, String resultRole) throws WbemsmtException {

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
                CIM_ASSOCIATOR_CLASS_NAME_CIM_RUNNINGOS, 
                CIM_ComputerSystem.CIM_CLASS_NAME,
                null,null));	
         }
         
         try {
	            while (enumeration.hasNext()) {
                CIM_OperatingSystemHelper.checkException(enumeration);
                                
                Object obj = enumeration.next();
                CIM_OperatingSystemHelper.checkException(enumeration); 
                if (obj instanceof CIMObjectPath) {
                    if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_ComputerSystem.CIM_CLASS_NAME)) {
                        result.add((CIMObjectPath)obj);
                    }
                }
            }
            CIM_OperatingSystemHelper.checkException(enumeration);
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
    * Get the list with CIM_RunningOS associations
    *
    * @param cimClient the WBEMClient for the communication
    * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
    * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
    * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
    * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
    *
    * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
    **/
                        
                        
   public java.util.List<CIM_RunningOS> getAssociations_CIM_RunningOS(WBEMClient cimClient, boolean includeQualifiers, boolean includeClassOrigin, String role,java.lang.String[] propertyList) throws WbemsmtException {

       if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
       }

       java.util.List<CIM_RunningOS> result = new java.util.ArrayList<CIM_RunningOS>();
       CloseableIterator enumeration = null;

       try {
          enumeration = cimClient.references(
             this.getCimObjectPath(),
             CIM_ASSOCIATOR_CLASS_NAME_CIM_RUNNINGOS, 
             role,
             includeQualifiers,
             includeClassOrigin,
             propertyList);
        } catch (WBEMException e) {
         	  throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
             CIM_ASSOCIATOR_CLASS_NAME_CIM_RUNNINGOS, 
             role,
             includeQualifiers,
             includeClassOrigin,
             propertyList));	
        }
         
        try {
          while (enumeration.hasNext()) {
             CIM_OperatingSystemHelper.checkException(enumeration);
             Object obj = enumeration.next();
             CIM_OperatingSystemHelper.checkException(enumeration);

             if (obj instanceof CIMInstance) {
                CIMInstance cimInstance = (CIMInstance)obj;
                Class<?> clazz = CIM_RunningOSHelper.findClass(cimClient, cimInstance);
                    
                if (clazz == null) {
                   System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
                   result.add(new CIM_RunningOS(cimInstance));
                   continue;
                }

                Class<?>[] constParams = new Class[1];
                constParams[0] = CIMInstance.class;
                Constructor<?> cons = null;
                try {
                   cons = clazz.getConstructor(constParams);
                } catch(NoSuchMethodException e) {
                   System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of the base class.");
                   result.add(new CIM_RunningOS(cimInstance));
                   continue;
                }

                try {
                   Object[] actargs = new Object[] {cimInstance};
                   Object dataObj = cons.newInstance(actargs);
                   result.add((CIM_RunningOS)dataObj);
                } catch (Exception e) {
                   System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
                   result.add(new CIM_RunningOS(cimInstance));
                   continue;
                }
              }
           }
           CIM_OperatingSystemHelper.checkException(enumeration);
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
    * Get a list of CIMObjectPath items of the associations CIM_RunningOS
    *
    * @param cimClient the WBEMClient for the communication
    * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
    * @param deep if true the subclasses returned also
    *
    * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociationNames_CIM_RunningOS(WBEMClient cimClient,String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
        }

        java.util.List<CIMObjectPath> result = new java.util.ArrayList<CIMObjectPath>();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(
                this.getCimObjectPath(),
                CIM_ASSOCIATOR_CLASS_NAME_CIM_RUNNINGOS, 
                role);
        } catch (WBEMException e) {
         	  throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this.getCimObjectPath(),
                CIM_ASSOCIATOR_CLASS_NAME_CIM_RUNNINGOS, 
                role));	
        }
         
        try {
                while (enumeration.hasNext()) {
                   CIM_OperatingSystemHelper.checkException(enumeration);
                   Object obj = enumeration.next();
                   CIM_OperatingSystemHelper.checkException(enumeration); 
                   
                   if (obj instanceof CIMObjectPath) {
                      if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_RunningOS.CIM_CLASS_NAME)) {
                         result.add((CIMObjectPath)obj);
                      }
                   }
                }
                CIM_OperatingSystemHelper.checkException(enumeration);
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
                         


 
    /**
     * Invokes the Method Reboot
     * <br>
     * @param client the cimclient
     * Requests a reboot of the OperatingSystem. The return value should be 0 if the request was successfully executed, 1 if the request is not supported and some other value if an error occurred. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
          *
     */
              
    public RebootResult invoke_Reboot(WBEMClient cimClient
                                 ) throws WbemsmtException {
         
       CIMArgument[] inParameter = new CIMArgument[0];
       CIMArgument[] outParameter = new CIMArgument[0];
    
                            
       javax.cim.UnsignedInteger32 resultObject = null;
          
       try {
           Object oResult =  cimClient.invokeMethod(           	                                            this.getCimObjectPath()
           	                                         , 
                                                    METHOD_REBOOT.NAME,
                                                    inParameter,
                                                    outParameter);
           if (oResult != null)
           {
              
                                 resultObject = (javax.cim.UnsignedInteger32)oResult;    
                         }
        } catch (WBEMException e) {
            throw new InvokeMethodException(e,new InvokeMethodUserObject( this.getCimObjectPath() , 
                                                          METHOD_REBOOT.NAME,
                                                          inParameter,
                                                          outParameter));
        }
        
        RebootResult result = new RebootResult();
        result.setResultObject(resultObject);

        java.util.HashMap<String, CIMArgument> mapOutParameter = new java.util.HashMap<String, CIMArgument>();
        for (int i = 0; i < outParameter.length; i++) {
           CIMArgument argument = outParameter[i];
           if (argument != null)
           {
              mapOutParameter.put(argument.getName(), argument);
           }
        }
                  
     return result;               
   }
      
   /**
    * Result object for the method Reboot
    */
   public static class RebootResult
   {
      /**
       * The return value of the method
       */
       
      javax.cim.UnsignedInteger32 resultObject = null;
               
      /**
       * Default constructor
       */
      RebootResult()
      {}
               
      /**
       * Set the return value
       * @param rc
       */
      void setResultObject(javax.cim.UnsignedInteger32 resultObject)
      {
         this.resultObject = resultObject;    
      }

	      /**
	       * Get the return value of the methid
	       * @return the return value
	       */               
      public javax.cim.UnsignedInteger32 getResultObject()
      {
         return this.resultObject;
      }
               
         }
              
   
 
    /**
     * Invokes the Method Shutdown
     * <br>
     * @param client the cimclient
     * Requests a shutdown of the OperatingSystem. The return value should be 0 if the request was successfully executed, 1 if the request is not supported and some other value if an error occurred. It is up to the implementation or subclass of OperatingSystem to establish dependencies between the Shutdown and Reboot methods, and for example, to provide more sophisticated capabilities such as scheduled shutdown/ reboot, etc. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
          *
     */
              
    public ShutdownResult invoke_Shutdown(WBEMClient cimClient
                                 ) throws WbemsmtException {
         
       CIMArgument[] inParameter = new CIMArgument[0];
       CIMArgument[] outParameter = new CIMArgument[0];
    
                            
       javax.cim.UnsignedInteger32 resultObject = null;
          
       try {
           Object oResult =  cimClient.invokeMethod(           	                                            this.getCimObjectPath()
           	                                         , 
                                                    METHOD_SHUTDOWN.NAME,
                                                    inParameter,
                                                    outParameter);
           if (oResult != null)
           {
              
                                 resultObject = (javax.cim.UnsignedInteger32)oResult;    
                         }
        } catch (WBEMException e) {
            throw new InvokeMethodException(e,new InvokeMethodUserObject( this.getCimObjectPath() , 
                                                          METHOD_SHUTDOWN.NAME,
                                                          inParameter,
                                                          outParameter));
        }
        
        ShutdownResult result = new ShutdownResult();
        result.setResultObject(resultObject);

        java.util.HashMap<String, CIMArgument> mapOutParameter = new java.util.HashMap<String, CIMArgument>();
        for (int i = 0; i < outParameter.length; i++) {
           CIMArgument argument = outParameter[i];
           if (argument != null)
           {
              mapOutParameter.put(argument.getName(), argument);
           }
        }
                  
     return result;               
   }
      
   /**
    * Result object for the method Shutdown
    */
   public static class ShutdownResult
   {
      /**
       * The return value of the method
       */
       
      javax.cim.UnsignedInteger32 resultObject = null;
               
      /**
       * Default constructor
       */
      ShutdownResult()
      {}
               
      /**
       * Set the return value
       * @param rc
       */
      void setResultObject(javax.cim.UnsignedInteger32 resultObject)
      {
         this.resultObject = resultObject;    
      }

	      /**
	       * Get the return value of the methid
	       * @return the return value
	       */               
      public javax.cim.UnsignedInteger32 getResultObject()
      {
         return this.resultObject;
      }
               
         }
              
    

//**********************************************************************
// utility methods     
//**********************************************************************                         
    


    /**
     * return the name of the CIMClass
     * @return
     */
    public String getObjectName()
    {
    	    return CIM_OperatingSystem.CIM_CLASS_NAME;
    }



}