/** 
 * CIM_OperatingSystem.java
 *
 * (C) Copyright IBM Corp. 2005
 *
 * THIS FILE IS PROVIDED UNDER THE TERMS OF THE COMMON PUBLIC LICENSE
 * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
 *
 * You can obtain a current copy of the Common Public License from
 * http://www.opensource.org/licenses/cpl1.0.php
 *
 * @author:	ECCG 0.9.7 generated 
 * 			(author should be changed, e.g. First and Last Name <xxx@cc.ibm.com>)
 *
 * Contributors:
 *
 *
 * Description:  An OperatingSystem is software/firmware that makes a ComputerSystem's hardware
 * usable, and implements and/or manages the resources, file systems, processes,
 * user interfaces, services, ... available on the ComputerSystem.
 * 
 */

package org.sblim.wbemsmt.schema.cim_2_14;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.Enumeration;
import java.lang.reflect.Constructor;
import org.sblim.wbem.client.*;



/**
 *  An OperatingSystem is software/firmware that makes a ComputerSystem's hardware
 * usable, and implements and/or manages the resources, file systems, processes,
 * user interfaces, services, ... available on the ComputerSystem.
 */
public class CIM_OperatingSystem extends CIM_EnabledLogicalElement  {
	
	public final static String CIM_CLASS_NAME = "CIM_OperatingSystem"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_OSPROCESS = "CIM_OSProcess"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_RUNNINGOS = "CIM_RunningOS"; //$NON-NLS-1$
	
	
	/**
	*	The scoping ComputerSystem's CreationClassName.
	*/
	public final static String CIM_PROPERTY_CSCREATIONCLASSNAME = "CSCreationClassName"; //$NON-NLS-1$
	/**
	*	The scoping ComputerSystem's Name.
	*/
	public final static String CIM_PROPERTY_CSNAME = "CSName"; //$NON-NLS-1$
	/**
	*	CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
	*/
	public final static String CIM_PROPERTY_CREATIONCLASSNAME = "CreationClassName"; //$NON-NLS-1$
	/**
	*	CurrentTimeZone indicates the number of minutes the OperatingSystem is offset from Greenwich Mean Time. Either the number is positive, negative or zero.
	*/
	public final static String CIM_PROPERTY_CURRENTTIMEZONE = "CurrentTimeZone"; //$NON-NLS-1$
	/**
	*	Boolean indicating whether the OperatingSystem is distributed across several ComputerSystem nodes. If so, these nodes should be grouped as a Cluster.
	*/
	public final static String CIM_PROPERTY_DISTRIBUTED = "Distributed"; //$NON-NLS-1$
	/**
	*	Number of Kbytes of physical memory currently unused and available.
	*/
	public final static String CIM_PROPERTY_FREEPHYSICALMEMORY = "FreePhysicalMemory"; //$NON-NLS-1$
	/**
	*	The total number of KBytes that can be mapped into the OperatingSystem's paging files without causing any other pages to be swapped out. 0 indicates that there are no paging files.
	*/
	public final static String CIM_PROPERTY_FREESPACEINPAGINGFILES = "FreeSpaceInPagingFiles"; //$NON-NLS-1$
	/**
	*	Number of Kbytes of virtual memory currently unused and available. For example, this may be calculated by adding the amount of free RAM to the amount of free paging space (ie, adding the properties, FreePhysicalMemory and FreeSpace InPagingFiles).
	*/
	public final static String CIM_PROPERTY_FREEVIRTUALMEMORY = "FreeVirtualMemory"; //$NON-NLS-1$
	/**
	*	Time when the OperatingSystem was last booted.
	*/
	public final static String CIM_PROPERTY_LASTBOOTUPTIME = "LastBootUpTime"; //$NON-NLS-1$
	/**
	*	OperatingSystem's notion of the local date and time of day.
	*/
	public final static String CIM_PROPERTY_LOCALDATETIME = "LocalDateTime"; //$NON-NLS-1$
	/**
	*	Maximum number of process contexts the OperatingSystem can support. If there is no fixed maximum, the value should be 0. On systems that have a fixed maximum, this object can help diagnose failures that occur when the maximum is reached.
	*/
	public final static String CIM_PROPERTY_MAXNUMBEROFPROCESSES = "MaxNumberOfProcesses"; //$NON-NLS-1$
	/**
	*	Maximum number of Kbytes of memory that can be allocated to a Process. For Operating Systems with no virtual memory, this value is typically equal to the total amount of physical Memory minus memory used by the BIOS and OS. For some Operating Systems, this value may be infinity - in which case, 0 should be entered. In other cases, this value could be a constant - for example, 2G or 4G.
	*/
	public final static String CIM_PROPERTY_MAXPROCESSMEMORYSIZE = "MaxProcessMemorySize"; //$NON-NLS-1$
	/**
	*	A value that indicates the maximum processes that a user can have associate with it.
	*/
	public final static String CIM_PROPERTY_MAXPROCESSESPERUSER = "MaxProcessesPerUser"; //$NON-NLS-1$
	/**
	*	The inherited Name serves as key of an OperatingSystem instance within a ComputerSystem.
	*/
	public final static String CIM_PROPERTY_NAME = "Name"; //$NON-NLS-1$
	/**
	*	Number of user licenses for the OperatingSystem. If unlimited, enter 0.
	*/
	public final static String CIM_PROPERTY_NUMBEROFLICENSEDUSERS = "NumberOfLicensedUsers"; //$NON-NLS-1$
	/**
	*	Number of process contexts currently loaded or running on the OperatingSystem.
	*/
	public final static String CIM_PROPERTY_NUMBEROFPROCESSES = "NumberOfProcesses"; //$NON-NLS-1$
	/**
	*	Number of user sessions for which the OperatingSystem is currently storing state information.
	*/
	public final static String CIM_PROPERTY_NUMBEROFUSERS = "NumberOfUsers"; //$NON-NLS-1$
	/**
	*	A integer indicating the type of OperatingSystem.
	*/
	public final static String CIM_PROPERTY_OSTYPE = "OSType"; //$NON-NLS-1$
	/**
	*	A string describing the manufacturer and OperatingSystem type - used when the OperatingSystem property, OSType, is set to 1 or 59 ("Other" or "Dedicated"). The format of the string inserted in OtherTypeDescription should be similar in format to the Values strings defined for OSType. OtherTypeDescription should be set to NULL when OSType is any value other than 1 or 59.
	*/
	public final static String CIM_PROPERTY_OTHERTYPEDESCRIPTION = "OtherTypeDescription"; //$NON-NLS-1$
	/**
	*	The total number of KBytes that can be stored in the OperatingSystem's paging files. 0 indicates that there are no paging files.
	*/
	public final static String CIM_PROPERTY_SIZESTOREDINPAGINGFILES = "SizeStoredInPagingFiles"; //$NON-NLS-1$
	/**
	*	Total swap space in Kbytes. This value may be NULL (unspecified) if swap space is not distinguished from page files. However, some Operating Systems distinguish these concepts. For example, in UNIX, whole processes can be 'swapped out' when the free page list falls and remains below a specified amount.
	*/
	public final static String CIM_PROPERTY_TOTALSWAPSPACESIZE = "TotalSwapSpaceSize"; //$NON-NLS-1$
	/**
	*	Number of Kbytes of virtual memory. For example, this may be calculated by adding the amount of total RAM to the amount of paging space (ie, adding the amount of memory in/aggregated by the ComputerSystem to the property, SizeStoredInPagingFiles.
	*/
	public final static String CIM_PROPERTY_TOTALVIRTUALMEMORYSIZE = "TotalVirtualMemorySize"; //$NON-NLS-1$
	/**
	*	The total amount of physical memory (in Kbytes) available to the OperatingSystem. This value does not necessarily indicate the true amount of physical memory, but what is reported to the OperatingSystem as available to it.
	*/
	public final static String CIM_PROPERTY_TOTALVISIBLEMEMORYSIZE = "TotalVisibleMemorySize"; //$NON-NLS-1$
	/**
	*	A string describing the Operating System's version number. The format of the version information is as follows: <Major Number>.<Minor Number>.<Revision> or <Major Number>.<Minor Number>.<Revision Letter>.
	*/
	public final static String CIM_PROPERTY_VERSION = "Version"; //$NON-NLS-1$
	
	
	/**
	*	Requests a reboot of the OperatingSystem. The return value should be 0 if the request was successfully executed, 1 if the request is not supported and some other value if an error occurred. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
	*/
	public final static String CIM_METHOD_REBOOT = "Reboot";
	/**
	*	Requests a shutdown of the OperatingSystem. The return value should be 0 if the request was successfully executed, 1 if the request is not supported and some other value if an error occurred. It is up to the implementation or subclass of OperatingSystem to establish dependencies between the Shutdown and Reboot methods, and for example, to provide more sophisticated capabilities such as scheduled shutdown/ reboot, etc. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
	*/
	public final static String CIM_METHOD_SHUTDOWN = "Shutdown";
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CSCREATIONCLASSNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_CSNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_CREATIONCLASSNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_CURRENTTIMEZONE);
		CIM_PropertyNameList.add(CIM_PROPERTY_DISTRIBUTED);
		CIM_PropertyNameList.add(CIM_PROPERTY_FREEPHYSICALMEMORY);
		CIM_PropertyNameList.add(CIM_PROPERTY_FREESPACEINPAGINGFILES);
		CIM_PropertyNameList.add(CIM_PROPERTY_FREEVIRTUALMEMORY);
		CIM_PropertyNameList.add(CIM_PROPERTY_LASTBOOTUPTIME);
		CIM_PropertyNameList.add(CIM_PROPERTY_LOCALDATETIME);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXNUMBEROFPROCESSES);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXPROCESSMEMORYSIZE);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXPROCESSESPERUSER);
		CIM_PropertyNameList.add(CIM_PROPERTY_NAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_NUMBEROFLICENSEDUSERS);
		CIM_PropertyNameList.add(CIM_PROPERTY_NUMBEROFPROCESSES);
		CIM_PropertyNameList.add(CIM_PROPERTY_NUMBEROFUSERS);
		CIM_PropertyNameList.add(CIM_PROPERTY_OSTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERTYPEDESCRIPTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_SIZESTOREDINPAGINGFILES);
		CIM_PropertyNameList.add(CIM_PROPERTY_TOTALSWAPSPACESIZE);
		CIM_PropertyNameList.add(CIM_PROPERTY_TOTALVIRTUALMEMORYSIZE);
		CIM_PropertyNameList.add(CIM_PROPERTY_TOTALVISIBLEMEMORYSIZE);
		CIM_PropertyNameList.add(CIM_PROPERTY_VERSION);
				
		for (int i = 0; i < CIM_EnabledLogicalElement.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_EnabledLogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CSCREATIONCLASSNAME)||
				((String)CIM_EnabledLogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CSNAME)||
				((String)CIM_EnabledLogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CREATIONCLASSNAME)||
				((String)CIM_EnabledLogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CURRENTTIMEZONE)||
				((String)CIM_EnabledLogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DISTRIBUTED)||
				((String)CIM_EnabledLogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FREEPHYSICALMEMORY)||
				((String)CIM_EnabledLogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FREESPACEINPAGINGFILES)||
				((String)CIM_EnabledLogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FREEVIRTUALMEMORY)||
				((String)CIM_EnabledLogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LASTBOOTUPTIME)||
				((String)CIM_EnabledLogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LOCALDATETIME)||
				((String)CIM_EnabledLogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXNUMBEROFPROCESSES)||
				((String)CIM_EnabledLogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXPROCESSMEMORYSIZE)||
				((String)CIM_EnabledLogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXPROCESSESPERUSER)||
				((String)CIM_EnabledLogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NAME)||
				((String)CIM_EnabledLogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NUMBEROFLICENSEDUSERS)||
				((String)CIM_EnabledLogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NUMBEROFPROCESSES)||
				((String)CIM_EnabledLogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NUMBEROFUSERS)||
				((String)CIM_EnabledLogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OSTYPE)||
				((String)CIM_EnabledLogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERTYPEDESCRIPTION)||
				((String)CIM_EnabledLogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SIZESTOREDINPAGINGFILES)||
				((String)CIM_EnabledLogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TOTALSWAPSPACESIZE)||
				((String)CIM_EnabledLogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TOTALVIRTUALMEMORYSIZE)||
				((String)CIM_EnabledLogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TOTALVISIBLEMEMORYSIZE)||
				((String)CIM_EnabledLogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_VERSION)){
				continue;
			}
			
			CIM_OperatingSystem.CIM_PropertyNameList.add(CIM_EnabledLogicalElement.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CSCREATIONCLASSNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CSNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CREATIONCLASSNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CURRENTTIMEZONE, new CIMValue(null, new CIMDataType(CIMDataType.SINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DISTRIBUTED, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FREEPHYSICALMEMORY, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FREESPACEINPAGINGFILES, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FREEVIRTUALMEMORY, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LASTBOOTUPTIME, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LOCALDATETIME, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXNUMBEROFPROCESSES, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXPROCESSMEMORYSIZE, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXPROCESSESPERUSER, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NUMBEROFLICENSEDUSERS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NUMBEROFPROCESSES, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NUMBEROFUSERS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OSTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERTYPEDESCRIPTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SIZESTOREDINPAGINGFILES, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TOTALSWAPSPACESIZE, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TOTALVIRTUALMEMORYSIZE, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TOTALVISIBLEMEMORYSIZE, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_VERSION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_EnabledLogicalElement.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_EnabledLogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CSCREATIONCLASSNAME)||
				((CIMProperty)CIM_EnabledLogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CSNAME)||
				((CIMProperty)CIM_EnabledLogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CREATIONCLASSNAME)||
				((CIMProperty)CIM_EnabledLogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CURRENTTIMEZONE)||
				((CIMProperty)CIM_EnabledLogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DISTRIBUTED)||
				((CIMProperty)CIM_EnabledLogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FREEPHYSICALMEMORY)||
				((CIMProperty)CIM_EnabledLogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FREESPACEINPAGINGFILES)||
				((CIMProperty)CIM_EnabledLogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FREEVIRTUALMEMORY)||
				((CIMProperty)CIM_EnabledLogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LASTBOOTUPTIME)||
				((CIMProperty)CIM_EnabledLogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LOCALDATETIME)||
				((CIMProperty)CIM_EnabledLogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXNUMBEROFPROCESSES)||
				((CIMProperty)CIM_EnabledLogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXPROCESSMEMORYSIZE)||
				((CIMProperty)CIM_EnabledLogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXPROCESSESPERUSER)||
				((CIMProperty)CIM_EnabledLogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NAME)||
				((CIMProperty)CIM_EnabledLogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NUMBEROFLICENSEDUSERS)||
				((CIMProperty)CIM_EnabledLogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NUMBEROFPROCESSES)||
				((CIMProperty)CIM_EnabledLogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NUMBEROFUSERS)||
				((CIMProperty)CIM_EnabledLogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OSTYPE)||
				((CIMProperty)CIM_EnabledLogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERTYPEDESCRIPTION)||
				((CIMProperty)CIM_EnabledLogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SIZESTOREDINPAGINGFILES)||
				((CIMProperty)CIM_EnabledLogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TOTALSWAPSPACESIZE)||
				((CIMProperty)CIM_EnabledLogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TOTALVIRTUALMEMORYSIZE)||
				((CIMProperty)CIM_EnabledLogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TOTALVISIBLEMEMORYSIZE)||
				((CIMProperty)CIM_EnabledLogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_VERSION)){
				continue;
			}
			
			CIM_OperatingSystem.CIM_PropertyList.add(CIM_EnabledLogicalElement.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_EnabledLogicalElement.Java_Package_List.size(); i++) {
			if (((String)CIM_EnabledLogicalElement.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_EnabledLogicalElement.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_OSTYPE = {"Unknown","Other","MACOS","ATTUNIX","DGUX","DECNT","Tru64 UNIX","OpenVMS","HPUX","AIX","MVS","OS400","OS/2","JavaVM","MSDOS","WIN3x","WIN95","WIN98","WINNT","WINCE","NCR3000","NetWare","OSF","DC/OS","Reliant UNIX","SCO UnixWare","SCO OpenServer","Sequent","IRIX","Solaris","SunOS","U6000","ASERIES","HP NonStop OS","HP NonStop OSS","BS2000","LINUX","Lynx","XENIX","VM","Interactive UNIX","BSDUNIX","FreeBSD","NetBSD","GNU Hurd","OS9","MACH Kernel","Inferno","QNX","EPOC","IxWorks","VxWorks","MiNT","BeOS","HP MPE","NextStep","PalmPilot","Rhapsody","Windows 2000","Dedicated","OS/390","VSE","TPF","Windows (R) Me","Caldera Open UNIX","OpenBSD","Not Applicable","Windows XP","z/OS","Microsoft Windows Server 2003","Microsoft Windows Server 2003 64-Bit"};
	
	
	public final static int OSTYPE_UNKNOWN = 0;
	public final static int OSTYPE_OTHER = 1;
	public final static int OSTYPE_MACOS = 2;
	public final static int OSTYPE_ATTUNIX = 3;
	public final static int OSTYPE_DGUX = 4;
	public final static int OSTYPE_DECNT = 5;
	public final static int OSTYPE_TRU64UNIX = 6;
	public final static int OSTYPE_OPENVMS = 7;
	public final static int OSTYPE_HPUX = 8;
	public final static int OSTYPE_AIX = 9;
	public final static int OSTYPE_MVS = 10;
	public final static int OSTYPE_OS400 = 11;
	public final static int OSTYPE_OS_2 = 12;
	public final static int OSTYPE_JAVAVM = 13;
	public final static int OSTYPE_MSDOS = 14;
	public final static int OSTYPE_WIN3X = 15;
	public final static int OSTYPE_WIN95 = 16;
	public final static int OSTYPE_WIN98 = 17;
	public final static int OSTYPE_WINNT = 18;
	public final static int OSTYPE_WINCE = 19;
	public final static int OSTYPE_NCR3000 = 20;
	public final static int OSTYPE_NETWARE = 21;
	public final static int OSTYPE_OSF = 22;
	public final static int OSTYPE_DC_OS = 23;
	public final static int OSTYPE_RELIANTUNIX = 24;
	public final static int OSTYPE_SCOUNIXWARE = 25;
	public final static int OSTYPE_SCOOPENSERVER = 26;
	public final static int OSTYPE_SEQUENT = 27;
	public final static int OSTYPE_IRIX = 28;
	public final static int OSTYPE_SOLARIS = 29;
	public final static int OSTYPE_SUNOS = 30;
	public final static int OSTYPE_U6000 = 31;
	public final static int OSTYPE_ASERIES = 32;
	public final static int OSTYPE_HPNONSTOPOS = 33;
	public final static int OSTYPE_HPNONSTOPOSS = 34;
	public final static int OSTYPE_BS2000 = 35;
	public final static int OSTYPE_LINUX = 36;
	public final static int OSTYPE_LYNX = 37;
	public final static int OSTYPE_XENIX = 38;
	public final static int OSTYPE_VM = 39;
	public final static int OSTYPE_INTERACTIVEUNIX = 40;
	public final static int OSTYPE_BSDUNIX = 41;
	public final static int OSTYPE_FREEBSD = 42;
	public final static int OSTYPE_NETBSD = 43;
	public final static int OSTYPE_GNUHURD = 44;
	public final static int OSTYPE_OS9 = 45;
	public final static int OSTYPE_MACHKERNEL = 46;
	public final static int OSTYPE_INFERNO = 47;
	public final static int OSTYPE_QNX = 48;
	public final static int OSTYPE_EPOC = 49;
	public final static int OSTYPE_IXWORKS = 50;
	public final static int OSTYPE_VXWORKS = 51;
	public final static int OSTYPE_MINT = 52;
	public final static int OSTYPE_BEOS = 53;
	public final static int OSTYPE_HPMPE = 54;
	public final static int OSTYPE_NEXTSTEP = 55;
	public final static int OSTYPE_PALMPILOT = 56;
	public final static int OSTYPE_RHAPSODY = 57;
	public final static int OSTYPE_WINDOWS2000 = 58;
	public final static int OSTYPE_DEDICATED = 59;
	public final static int OSTYPE_OS_390 = 60;
	public final static int OSTYPE_VSE = 61;
	public final static int OSTYPE_TPF = 62;
	public final static int OSTYPE_WINDOWSRME = 63;
	public final static int OSTYPE_CALDERAOPENUNIX = 64;
	public final static int OSTYPE_OPENBSD = 65;
	public final static int OSTYPE_NOTAPPLICABLE = 66;
	public final static int OSTYPE_WINDOWSXP = 67;
	public final static int OSTYPE_Z_OS = 68;
	public final static int OSTYPE_MICROSOFTWINDOWSSERVER2003 = 69;
	public final static int OSTYPE_MICROSOFTWINDOWSSERVER200364_BIT = 70;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_OperatingSystem() {

		this.cimInstance	= new CIMInstance();
		
		for (int i = 0; i < CIM_PropertyList.size(); i++) {
			this.cimInstance.addProperty((CIMProperty)((CIMProperty)CIM_PropertyList.get(i)).clone());
		}
		
		this.cimObjectPath 	= new CIMObjectPath(CIM_CLASS_NAME);
		this.cimInstance.setObjectPath(this.cimObjectPath);

		this.original_cimInstance	= (CIMInstance)this.cimInstance.clone();

		setValidCimInstance(false);
	}


	/**
	*	Class constructor
	*/	
	public CIM_OperatingSystem(Vector keyProperties){ 
		this();
		
		if (keyProperties == null) {
			throw new InvalidParameterException("The keyProperties parameter does not contain a valid reference.");
		
		}
		
		Iterator iter = keyProperties.iterator();
		while (iter.hasNext()) {
			Object property = iter.next();
			
			if (property instanceof CIMProperty) {
				CIMProperty keyProperty = (CIMProperty)property;
				this.cimObjectPath.addKey(keyProperty);
				
				if (this.cimInstance.getProperty(keyProperty.getName()) != null) {
					this.cimInstance.removeProperty(keyProperty.getName());
				}
				this.cimInstance.addProperty(keyProperty);
				
			} else {
				throw new InvalidParameterException("The keyProperties parameter should only contain objects of class CIMProperty.");
				
			}
		}
		
		setValidCimInstance(false);
	}

	
	/**
	*	Class constructor
	*/	
	public CIM_OperatingSystem(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
		if (cimInstance == null) {
			throw new InvalidParameterException("The cimInstance parameter does not contain a valid reference.");
		
		} else if (cimObjectPath == null){
			throw new InvalidParameterException("The cimObjectPath parameter does not contain a valid reference.");		
		
		} else if (!CIM_CLASS_NAME.equals(cimInstance.getClassName())) {
			throw new InvalidParameterException("The class of the cimInstance must be of type " + CIM_CLASS_NAME + ".");
		}
		
		setCimInstance(cimInstance);
		this.original_cimInstance = (CIMInstance)cimInstance.clone();
		this.cimObjectPath        = cimObjectPath;
		setValidCimInstance(true);
	}

	
	/**
	*	The method returns the display name of the class
	*/	
	public String getClassDisplayName(){
		return CIM_CLASS_DISPLAYNAME;
	}
	
	//**********************************************************************
	// Instance methods
	//**********************************************************************

	/**
	*	no description
	*/	
	public boolean isDataValid(Vector invalidProperties) {
		boolean result = true;
		
		if (invalidProperties == null) {
			invalidProperties = new Vector();
		} else {
			invalidProperties.removeAllElements();
		}
		
		CIMProperty CIMProperty_CSCreationClassName = this.cimInstance.getProperty(CIM_PROPERTY_CSCREATIONCLASSNAME);
		
		if (CIMProperty_CSCreationClassName == null || CIMProperty_CSCreationClassName.getValue().isEmpty() || CIMProperty_CSCreationClassName.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_CSCREATIONCLASSNAME, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_CSName = this.cimInstance.getProperty(CIM_PROPERTY_CSNAME);
		
		if (CIMProperty_CSName == null || CIMProperty_CSName.getValue().isEmpty() || CIMProperty_CSName.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_CSNAME, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_CreationClassName = this.cimInstance.getProperty(CIM_PROPERTY_CREATIONCLASSNAME);
		
		if (CIMProperty_CreationClassName == null || CIMProperty_CreationClassName.getValue().isEmpty() || CIMProperty_CreationClassName.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_CREATIONCLASSNAME, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_Name = this.cimInstance.getProperty(CIM_PROPERTY_NAME);
		
		if (CIMProperty_Name == null || CIMProperty_Name.getValue().isEmpty() || CIMProperty_Name.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_NAME, "Key"});
			result = false;
		}
		
		return result;
	}
	
	/**
	 * @return Returns the validCimInstance.
	 */
	public boolean isValidCimInstance() {
		return this.validCimInstance;
	}
	
	/**
	 * @param validCimInstance The validCimInstance to set.
	 */
	private void setValidCimInstance(boolean isValidCimInstance) {

		this.validCimInstance = isValidCimInstance;
	}
	
	
	/**
	*	The method returns this CIM instance
	*/
	public CIMInstance getCimInstance() {
		
		return this.cimInstance;
	}
	
	
	/**
	*	The method sets this CIM instance
	*/
	public void setCimInstance(CIMInstance cimInstance) {
		
		this.cimInstance = cimInstance;
	}
	
		
	/**
	*	The method returns this CIM object path
	*/
	public CIMObjectPath getCimObjectPath() {
		return this.cimObjectPath;
	}
	
	
	/**
	*	The method checks if the cimInstance has been modified
	*/
	public boolean isModified() {
	    
	    if (!this.original_cimInstance.equals(this.cimInstance)) 
	        return true;
	    
	    return false;
	}
	
	
	/**
	*	The method resets the values of the cimInstance
	*/	
	public void resetValues() {
	    this.cimInstance = (CIMInstance)this.original_cimInstance.clone();
	}
	
	
	/**
	*	The method checks if the cimInstance equals an other cimInstance
	*/	
	public boolean equals(Object object) {
	    
	    if (!(object instanceof CIM_OperatingSystem)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_OperatingSystem)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_OperatingSystem)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_OperatingSystem)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_OperatingSystem)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_OperatingSystem)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_OperatingSystem)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_OperatingSystem)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_OperatingSystem)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_OperatingSystem)object).cimObjectPath)) {
	        return false;
	        
	    } 
	    
	    return true;
	}
	
	/**
	*	The method return this method as a string
	*/	
	public String toString() {
		return this.cimInstance.toString();
	}

	//*****************************************************
	// Associators methods
	//*****************************************************
	
	public ArrayList getAssociated_CIM_Process_CIM_OSProcesss(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_OSPROCESS, 
					CIM_Process.CIM_CLASS_NAME, 
					"GroupComponent", //$NON-NLS-1$
					"PartComponent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_OperatingSystem.Java_Package_List.size(); i++) {
						if (!((String)(CIM_OperatingSystem.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_OperatingSystem.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_OperatingSystem.Java_Package_List.setElementAt((String)(CIM_OperatingSystem.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_OperatingSystem.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_Process(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
					
					Class[] constParams = new Class[2];
					constParams[0] = CIMObjectPath.class;
					constParams[1] = CIMInstance.class;
					Constructor cons = null;
					try {
						cons = clazz.getConstructor(constParams);
						
					} catch(NoSuchMethodException e) {
						System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_Process(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_Process(cimInstance.getObjectPath(), cimInstance));
						continue;
					}

				}
			}
		} finally {
			try {
				if (enumeration != null) {
					((CIMEnumeration)enumeration).close();
				}
			} catch(Exception e) {
				throw new CIMException(CIMException.CIM_ERR_FAILED, "The socket of the result could not be closed properly.");
			}
		}
			
		return resultArrayList;
	}

	public ArrayList getAssociated_CIM_Process_CIM_OSProcess_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_OSPROCESS, 
					CIM_Process.CIM_CLASS_NAME, 
					"GroupComponent", //$NON-NLS-1$
					"PartComponent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_Process.CIM_CLASS_NAME)) {
						resultArrayList.add(obj);
					}
				}
			}
		} finally {
			try {
				if (enumeration != null) {
					((CIMEnumeration)enumeration).close();
				}
			} catch(Exception e) {
				throw new CIMException(CIMException.CIM_ERR_FAILED, "The socket of the result could not be closed properly.");
			}
		}
			
		return resultArrayList;
	}

	public ArrayList getAssociated_CIM_ComputerSystem_CIM_RunningOSs(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_RUNNINGOS, 
					CIM_ComputerSystem.CIM_CLASS_NAME, 
					"Antecedent", //$NON-NLS-1$
					"Dependent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_OperatingSystem.Java_Package_List.size(); i++) {
						if (!((String)(CIM_OperatingSystem.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_OperatingSystem.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_OperatingSystem.Java_Package_List.setElementAt((String)(CIM_OperatingSystem.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_OperatingSystem.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_ComputerSystem(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
					
					Class[] constParams = new Class[2];
					constParams[0] = CIMObjectPath.class;
					constParams[1] = CIMInstance.class;
					Constructor cons = null;
					try {
						cons = clazz.getConstructor(constParams);
						
					} catch(NoSuchMethodException e) {
						System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_ComputerSystem(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_ComputerSystem(cimInstance.getObjectPath(), cimInstance));
						continue;
					}

				}
			}
		} finally {
			try {
				if (enumeration != null) {
					((CIMEnumeration)enumeration).close();
				}
			} catch(Exception e) {
				throw new CIMException(CIMException.CIM_ERR_FAILED, "The socket of the result could not be closed properly.");
			}
		}
			
		return resultArrayList;
	}

	public ArrayList getAssociated_CIM_ComputerSystem_CIM_RunningOS_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_RUNNINGOS, 
					CIM_ComputerSystem.CIM_CLASS_NAME, 
					"Antecedent", //$NON-NLS-1$
					"Dependent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_ComputerSystem.CIM_CLASS_NAME)) {
						resultArrayList.add(obj);
					}
				}
			}
		} finally {
			try {
				if (enumeration != null) {
					((CIMEnumeration)enumeration).close();
				}
			} catch(Exception e) {
				throw new CIMException(CIMException.CIM_ERR_FAILED, "The socket of the result could not be closed properly.");
			}
		}
			
		return resultArrayList;
	}

	
	
	//*****************************************************
	// Attribute methods
	//*****************************************************
	
	// Attribute CSCreationClassName
	
	public String get_CSCreationClassName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OperatingSystem.CIM_PROPERTY_CSCREATIONCLASSNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OperatingSystem.CIM_PROPERTY_CSCREATIONCLASSNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OperatingSystem.CIM_PROPERTY_CSCREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CSCreationClassName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OperatingSystem.CIM_PROPERTY_CSCREATIONCLASSNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_OperatingSystem.CIM_PROPERTY_CSCREATIONCLASSNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OperatingSystem.CIM_PROPERTY_CSCREATIONCLASSNAME + " could not be found");
    		
		} else if (!CIM_OperatingSystemHelper.isValid_CSCreationClassName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OperatingSystem.CIM_PROPERTY_CSCREATIONCLASSNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OperatingSystem.CIM_PROPERTY_CSCREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CSName
	
	public String get_CSName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OperatingSystem.CIM_PROPERTY_CSNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OperatingSystem.CIM_PROPERTY_CSNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OperatingSystem.CIM_PROPERTY_CSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CSName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OperatingSystem.CIM_PROPERTY_CSNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_OperatingSystem.CIM_PROPERTY_CSNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OperatingSystem.CIM_PROPERTY_CSNAME + " could not be found");
    		
		} else if (!CIM_OperatingSystemHelper.isValid_CSName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OperatingSystem.CIM_PROPERTY_CSNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OperatingSystem.CIM_PROPERTY_CSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CreationClassName
	
	public String get_CreationClassName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OperatingSystem.CIM_PROPERTY_CREATIONCLASSNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OperatingSystem.CIM_PROPERTY_CREATIONCLASSNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OperatingSystem.CIM_PROPERTY_CREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CreationClassName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OperatingSystem.CIM_PROPERTY_CREATIONCLASSNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_OperatingSystem.CIM_PROPERTY_CREATIONCLASSNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OperatingSystem.CIM_PROPERTY_CREATIONCLASSNAME + " could not be found");
    		
		} else if (!CIM_OperatingSystemHelper.isValid_CreationClassName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OperatingSystem.CIM_PROPERTY_CREATIONCLASSNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OperatingSystem.CIM_PROPERTY_CREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CurrentTimeZone
	
	public Short get_CurrentTimeZone() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OperatingSystem.CIM_PROPERTY_CURRENTTIMEZONE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OperatingSystem.CIM_PROPERTY_CURRENTTIMEZONE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OperatingSystem.CIM_PROPERTY_CURRENTTIMEZONE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Short)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CurrentTimeZone(Short newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OperatingSystem.CIM_PROPERTY_CURRENTTIMEZONE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OperatingSystem.CIM_PROPERTY_CURRENTTIMEZONE + " could not be found");
    		
		} else if (!CIM_OperatingSystemHelper.isValid_CurrentTimeZone(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OperatingSystem.CIM_PROPERTY_CURRENTTIMEZONE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OperatingSystem.CIM_PROPERTY_CURRENTTIMEZONE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.SINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Distributed
	
	public Boolean get_Distributed() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OperatingSystem.CIM_PROPERTY_DISTRIBUTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OperatingSystem.CIM_PROPERTY_DISTRIBUTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OperatingSystem.CIM_PROPERTY_DISTRIBUTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Distributed(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OperatingSystem.CIM_PROPERTY_DISTRIBUTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OperatingSystem.CIM_PROPERTY_DISTRIBUTED + " could not be found");
    		
		} else if (!CIM_OperatingSystemHelper.isValid_Distributed(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OperatingSystem.CIM_PROPERTY_DISTRIBUTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OperatingSystem.CIM_PROPERTY_DISTRIBUTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute FreePhysicalMemory
	
	public UnsignedInt64 get_FreePhysicalMemory() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OperatingSystem.CIM_PROPERTY_FREEPHYSICALMEMORY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OperatingSystem.CIM_PROPERTY_FREEPHYSICALMEMORY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OperatingSystem.CIM_PROPERTY_FREEPHYSICALMEMORY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_FreePhysicalMemory(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OperatingSystem.CIM_PROPERTY_FREEPHYSICALMEMORY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OperatingSystem.CIM_PROPERTY_FREEPHYSICALMEMORY + " could not be found");
    		
		} else if (!CIM_OperatingSystemHelper.isValid_FreePhysicalMemory(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OperatingSystem.CIM_PROPERTY_FREEPHYSICALMEMORY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OperatingSystem.CIM_PROPERTY_FREEPHYSICALMEMORY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute FreeSpaceInPagingFiles
	
	public UnsignedInt64 get_FreeSpaceInPagingFiles() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OperatingSystem.CIM_PROPERTY_FREESPACEINPAGINGFILES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OperatingSystem.CIM_PROPERTY_FREESPACEINPAGINGFILES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OperatingSystem.CIM_PROPERTY_FREESPACEINPAGINGFILES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_FreeSpaceInPagingFiles(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OperatingSystem.CIM_PROPERTY_FREESPACEINPAGINGFILES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OperatingSystem.CIM_PROPERTY_FREESPACEINPAGINGFILES + " could not be found");
    		
		} else if (!CIM_OperatingSystemHelper.isValid_FreeSpaceInPagingFiles(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OperatingSystem.CIM_PROPERTY_FREESPACEINPAGINGFILES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OperatingSystem.CIM_PROPERTY_FREESPACEINPAGINGFILES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute FreeVirtualMemory
	
	public UnsignedInt64 get_FreeVirtualMemory() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OperatingSystem.CIM_PROPERTY_FREEVIRTUALMEMORY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OperatingSystem.CIM_PROPERTY_FREEVIRTUALMEMORY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OperatingSystem.CIM_PROPERTY_FREEVIRTUALMEMORY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_FreeVirtualMemory(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OperatingSystem.CIM_PROPERTY_FREEVIRTUALMEMORY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OperatingSystem.CIM_PROPERTY_FREEVIRTUALMEMORY + " could not be found");
    		
		} else if (!CIM_OperatingSystemHelper.isValid_FreeVirtualMemory(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OperatingSystem.CIM_PROPERTY_FREEVIRTUALMEMORY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OperatingSystem.CIM_PROPERTY_FREEVIRTUALMEMORY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LastBootUpTime
	
	public Calendar get_LastBootUpTime() {

		CIMProperty property = this.cimInstance.getProperty(CIM_OperatingSystem.CIM_PROPERTY_LASTBOOTUPTIME);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OperatingSystem.CIM_PROPERTY_LASTBOOTUPTIME + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OperatingSystem.CIM_PROPERTY_LASTBOOTUPTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_LastBootUpTime(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OperatingSystem.CIM_PROPERTY_LASTBOOTUPTIME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OperatingSystem.CIM_PROPERTY_LASTBOOTUPTIME + " could not be found");
    		
		} else if (!CIM_OperatingSystemHelper.isValid_LastBootUpTime(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OperatingSystem.CIM_PROPERTY_LASTBOOTUPTIME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OperatingSystem.CIM_PROPERTY_LASTBOOTUPTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	// Attribute LocalDateTime
	
	public Calendar get_LocalDateTime() {

		CIMProperty property = this.cimInstance.getProperty(CIM_OperatingSystem.CIM_PROPERTY_LOCALDATETIME);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OperatingSystem.CIM_PROPERTY_LOCALDATETIME + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OperatingSystem.CIM_PROPERTY_LOCALDATETIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_LocalDateTime(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OperatingSystem.CIM_PROPERTY_LOCALDATETIME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OperatingSystem.CIM_PROPERTY_LOCALDATETIME + " could not be found");
    		
		} else if (!CIM_OperatingSystemHelper.isValid_LocalDateTime(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OperatingSystem.CIM_PROPERTY_LOCALDATETIME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OperatingSystem.CIM_PROPERTY_LOCALDATETIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	// Attribute MaxNumberOfProcesses
	
	public UnsignedInt32 get_MaxNumberOfProcesses() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OperatingSystem.CIM_PROPERTY_MAXNUMBEROFPROCESSES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OperatingSystem.CIM_PROPERTY_MAXNUMBEROFPROCESSES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OperatingSystem.CIM_PROPERTY_MAXNUMBEROFPROCESSES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxNumberOfProcesses(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OperatingSystem.CIM_PROPERTY_MAXNUMBEROFPROCESSES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OperatingSystem.CIM_PROPERTY_MAXNUMBEROFPROCESSES + " could not be found");
    		
		} else if (!CIM_OperatingSystemHelper.isValid_MaxNumberOfProcesses(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OperatingSystem.CIM_PROPERTY_MAXNUMBEROFPROCESSES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OperatingSystem.CIM_PROPERTY_MAXNUMBEROFPROCESSES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxProcessMemorySize
	
	public UnsignedInt64 get_MaxProcessMemorySize() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OperatingSystem.CIM_PROPERTY_MAXPROCESSMEMORYSIZE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OperatingSystem.CIM_PROPERTY_MAXPROCESSMEMORYSIZE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OperatingSystem.CIM_PROPERTY_MAXPROCESSMEMORYSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxProcessMemorySize(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OperatingSystem.CIM_PROPERTY_MAXPROCESSMEMORYSIZE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OperatingSystem.CIM_PROPERTY_MAXPROCESSMEMORYSIZE + " could not be found");
    		
		} else if (!CIM_OperatingSystemHelper.isValid_MaxProcessMemorySize(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OperatingSystem.CIM_PROPERTY_MAXPROCESSMEMORYSIZE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OperatingSystem.CIM_PROPERTY_MAXPROCESSMEMORYSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxProcessesPerUser
	
	public UnsignedInt32 get_MaxProcessesPerUser() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OperatingSystem.CIM_PROPERTY_MAXPROCESSESPERUSER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OperatingSystem.CIM_PROPERTY_MAXPROCESSESPERUSER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OperatingSystem.CIM_PROPERTY_MAXPROCESSESPERUSER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxProcessesPerUser(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OperatingSystem.CIM_PROPERTY_MAXPROCESSESPERUSER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OperatingSystem.CIM_PROPERTY_MAXPROCESSESPERUSER + " could not be found");
    		
		} else if (!CIM_OperatingSystemHelper.isValid_MaxProcessesPerUser(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OperatingSystem.CIM_PROPERTY_MAXPROCESSESPERUSER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OperatingSystem.CIM_PROPERTY_MAXPROCESSESPERUSER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Name
	
	public String get_Name() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OperatingSystem.CIM_PROPERTY_NAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OperatingSystem.CIM_PROPERTY_NAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OperatingSystem.CIM_PROPERTY_NAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Name(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OperatingSystem.CIM_PROPERTY_NAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_OperatingSystem.CIM_PROPERTY_NAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OperatingSystem.CIM_PROPERTY_NAME + " could not be found");
    		
		} else if (!CIM_OperatingSystemHelper.isValid_Name(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OperatingSystem.CIM_PROPERTY_NAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OperatingSystem.CIM_PROPERTY_NAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute NumberOfLicensedUsers
	
	public UnsignedInt32 get_NumberOfLicensedUsers() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OperatingSystem.CIM_PROPERTY_NUMBEROFLICENSEDUSERS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OperatingSystem.CIM_PROPERTY_NUMBEROFLICENSEDUSERS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OperatingSystem.CIM_PROPERTY_NUMBEROFLICENSEDUSERS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_NumberOfLicensedUsers(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OperatingSystem.CIM_PROPERTY_NUMBEROFLICENSEDUSERS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OperatingSystem.CIM_PROPERTY_NUMBEROFLICENSEDUSERS + " could not be found");
    		
		} else if (!CIM_OperatingSystemHelper.isValid_NumberOfLicensedUsers(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OperatingSystem.CIM_PROPERTY_NUMBEROFLICENSEDUSERS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OperatingSystem.CIM_PROPERTY_NUMBEROFLICENSEDUSERS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute NumberOfProcesses
	
	public UnsignedInt32 get_NumberOfProcesses() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OperatingSystem.CIM_PROPERTY_NUMBEROFPROCESSES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OperatingSystem.CIM_PROPERTY_NUMBEROFPROCESSES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OperatingSystem.CIM_PROPERTY_NUMBEROFPROCESSES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_NumberOfProcesses(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OperatingSystem.CIM_PROPERTY_NUMBEROFPROCESSES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OperatingSystem.CIM_PROPERTY_NUMBEROFPROCESSES + " could not be found");
    		
		} else if (!CIM_OperatingSystemHelper.isValid_NumberOfProcesses(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OperatingSystem.CIM_PROPERTY_NUMBEROFPROCESSES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OperatingSystem.CIM_PROPERTY_NUMBEROFPROCESSES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute NumberOfUsers
	
	public UnsignedInt32 get_NumberOfUsers() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OperatingSystem.CIM_PROPERTY_NUMBEROFUSERS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OperatingSystem.CIM_PROPERTY_NUMBEROFUSERS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OperatingSystem.CIM_PROPERTY_NUMBEROFUSERS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_NumberOfUsers(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OperatingSystem.CIM_PROPERTY_NUMBEROFUSERS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OperatingSystem.CIM_PROPERTY_NUMBEROFUSERS + " could not be found");
    		
		} else if (!CIM_OperatingSystemHelper.isValid_NumberOfUsers(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OperatingSystem.CIM_PROPERTY_NUMBEROFUSERS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OperatingSystem.CIM_PROPERTY_NUMBEROFUSERS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OSType
	
	public UnsignedInt16 get_OSType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OperatingSystem.CIM_PROPERTY_OSTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OperatingSystem.CIM_PROPERTY_OSTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OperatingSystem.CIM_PROPERTY_OSTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OSType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OperatingSystem.CIM_PROPERTY_OSTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OperatingSystem.CIM_PROPERTY_OSTYPE + " could not be found");
    		
		} else if (!CIM_OperatingSystemHelper.isValid_OSType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OperatingSystem.CIM_PROPERTY_OSTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OperatingSystem.CIM_PROPERTY_OSTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherTypeDescription
	
	public String get_OtherTypeDescription() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OperatingSystem.CIM_PROPERTY_OTHERTYPEDESCRIPTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OperatingSystem.CIM_PROPERTY_OTHERTYPEDESCRIPTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OperatingSystem.CIM_PROPERTY_OTHERTYPEDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherTypeDescription(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OperatingSystem.CIM_PROPERTY_OTHERTYPEDESCRIPTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OperatingSystem.CIM_PROPERTY_OTHERTYPEDESCRIPTION + " could not be found");
    		
		} else if (!CIM_OperatingSystemHelper.isValid_OtherTypeDescription(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OperatingSystem.CIM_PROPERTY_OTHERTYPEDESCRIPTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OperatingSystem.CIM_PROPERTY_OTHERTYPEDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SizeStoredInPagingFiles
	
	public UnsignedInt64 get_SizeStoredInPagingFiles() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OperatingSystem.CIM_PROPERTY_SIZESTOREDINPAGINGFILES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OperatingSystem.CIM_PROPERTY_SIZESTOREDINPAGINGFILES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OperatingSystem.CIM_PROPERTY_SIZESTOREDINPAGINGFILES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SizeStoredInPagingFiles(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OperatingSystem.CIM_PROPERTY_SIZESTOREDINPAGINGFILES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OperatingSystem.CIM_PROPERTY_SIZESTOREDINPAGINGFILES + " could not be found");
    		
		} else if (!CIM_OperatingSystemHelper.isValid_SizeStoredInPagingFiles(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OperatingSystem.CIM_PROPERTY_SIZESTOREDINPAGINGFILES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OperatingSystem.CIM_PROPERTY_SIZESTOREDINPAGINGFILES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TotalSwapSpaceSize
	
	public UnsignedInt64 get_TotalSwapSpaceSize() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OperatingSystem.CIM_PROPERTY_TOTALSWAPSPACESIZE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OperatingSystem.CIM_PROPERTY_TOTALSWAPSPACESIZE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OperatingSystem.CIM_PROPERTY_TOTALSWAPSPACESIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TotalSwapSpaceSize(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OperatingSystem.CIM_PROPERTY_TOTALSWAPSPACESIZE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OperatingSystem.CIM_PROPERTY_TOTALSWAPSPACESIZE + " could not be found");
    		
		} else if (!CIM_OperatingSystemHelper.isValid_TotalSwapSpaceSize(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OperatingSystem.CIM_PROPERTY_TOTALSWAPSPACESIZE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OperatingSystem.CIM_PROPERTY_TOTALSWAPSPACESIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TotalVirtualMemorySize
	
	public UnsignedInt64 get_TotalVirtualMemorySize() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OperatingSystem.CIM_PROPERTY_TOTALVIRTUALMEMORYSIZE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OperatingSystem.CIM_PROPERTY_TOTALVIRTUALMEMORYSIZE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OperatingSystem.CIM_PROPERTY_TOTALVIRTUALMEMORYSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TotalVirtualMemorySize(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OperatingSystem.CIM_PROPERTY_TOTALVIRTUALMEMORYSIZE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OperatingSystem.CIM_PROPERTY_TOTALVIRTUALMEMORYSIZE + " could not be found");
    		
		} else if (!CIM_OperatingSystemHelper.isValid_TotalVirtualMemorySize(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OperatingSystem.CIM_PROPERTY_TOTALVIRTUALMEMORYSIZE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OperatingSystem.CIM_PROPERTY_TOTALVIRTUALMEMORYSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TotalVisibleMemorySize
	
	public UnsignedInt64 get_TotalVisibleMemorySize() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OperatingSystem.CIM_PROPERTY_TOTALVISIBLEMEMORYSIZE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OperatingSystem.CIM_PROPERTY_TOTALVISIBLEMEMORYSIZE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OperatingSystem.CIM_PROPERTY_TOTALVISIBLEMEMORYSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TotalVisibleMemorySize(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OperatingSystem.CIM_PROPERTY_TOTALVISIBLEMEMORYSIZE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OperatingSystem.CIM_PROPERTY_TOTALVISIBLEMEMORYSIZE + " could not be found");
    		
		} else if (!CIM_OperatingSystemHelper.isValid_TotalVisibleMemorySize(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OperatingSystem.CIM_PROPERTY_TOTALVISIBLEMEMORYSIZE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OperatingSystem.CIM_PROPERTY_TOTALVISIBLEMEMORYSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Version
	
	public String get_Version() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OperatingSystem.CIM_PROPERTY_VERSION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OperatingSystem.CIM_PROPERTY_VERSION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OperatingSystem.CIM_PROPERTY_VERSION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Version(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OperatingSystem.CIM_PROPERTY_VERSION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OperatingSystem.CIM_PROPERTY_VERSION + " could not be found");
    		
		} else if (!CIM_OperatingSystemHelper.isValid_Version(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OperatingSystem.CIM_PROPERTY_VERSION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OperatingSystem.CIM_PROPERTY_VERSION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	
	public UnsignedInt32 invoke_reboot(CIMClient cimClient) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_OperatingSystem.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	
	  	
	  	
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_REBOOT,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_OperatingSystem.CIM_METHOD_REBOOT + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_OperatingSystem.CIM_METHOD_REBOOT + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_OperatingSystem.CIM_METHOD_REBOOT + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	
	public UnsignedInt32 invoke_shutdown(CIMClient cimClient) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_OperatingSystem.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	
	  	
	  	
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_SHUTDOWN,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_OperatingSystem.CIM_METHOD_SHUTDOWN + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_OperatingSystem.CIM_METHOD_SHUTDOWN + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_OperatingSystem.CIM_METHOD_SHUTDOWN + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	

}
