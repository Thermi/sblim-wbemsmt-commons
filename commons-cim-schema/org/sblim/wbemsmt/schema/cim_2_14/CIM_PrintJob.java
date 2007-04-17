/** 
 * CIM_PrintJob.java
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
 * Description:  Description of a print request that is either waiting on a Queue for a Printer
 * to become available or in the process of being output on a Printer, or that
 * has previously been printed on a Printer. PrintJobs are weak to their current
 * Queue, or to the last Queue that held them. The ABNF for CIM references to
 * PWG Standards and MIBs is in the directory
 * 'ftp://ftp.pwg.org/pub/pwg/general/process' in the file
 * 'pwg-cim-references-format-20060309.txt'. An example for a MappingStrings
 * reference to a PWG Standard is 'PWG5101-1.PWG|Section 4 Media Color Names'.
 * An example for a MappingStrings reference to a PWG MIB is
 * 'MIB.PWG|PWG-IMAGING-COUNTER-MIB.icMonitorCompletedJobs'.
 * 
 */

package org.sblim.wbemsmt.schema.cim_2_14;

import java.lang.reflect.Constructor;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

import org.sblim.wbem.cim.CIMDataType;
import org.sblim.wbem.cim.CIMDateTime;
import org.sblim.wbem.cim.CIMException;
import org.sblim.wbem.cim.CIMInstance;
import org.sblim.wbem.cim.CIMObjectPath;
import org.sblim.wbem.cim.CIMProperty;
import org.sblim.wbem.cim.CIMSimpleDateTime;
import org.sblim.wbem.cim.CIMValue;
import org.sblim.wbem.cim.UnsignedInt16;
import org.sblim.wbem.cim.UnsignedInt32;
import org.sblim.wbem.client.CIMClient;
import org.sblim.wbem.client.CIMEnumeration;



/**
 *  Description of a print request that is either waiting on a Queue for a Printer
 * to become available or in the process of being output on a Printer, or that
 * has previously been printed on a Printer. PrintJobs are weak to their current
 * Queue, or to the last Queue that held them. The ABNF for CIM references to
 * PWG Standards and MIBs is in the directory
 * 'ftp://ftp.pwg.org/pub/pwg/general/process' in the file
 * 'pwg-cim-references-format-20060309.txt'. An example for a MappingStrings
 * reference to a PWG Standard is 'PWG5101-1.PWG|Section 4 Media Color Names'.
 * An example for a MappingStrings reference to a PWG MIB is
 * 'MIB.PWG|PWG-IMAGING-COUNTER-MIB.icMonitorCompletedJobs'.
 */
public class CIM_PrintJob extends CIM_Job  {
	
	public final static String CIM_CLASS_NAME = "CIM_PrintJob"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.14.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_OWNINGPRINTQUEUE = "CIM_OwningPrintQueue"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_PRINTJOBFILE = "CIM_PrintJobFile"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_PRINTERSERVICINGJOB = "CIM_PrinterServicingJob"; //$NON-NLS-1$
	
	
	/**
	*	Specifies the character set and encoding method that should be used by the Printer for the management of this Job. The strings should conform to the semantics and syntax that are specified by section 4.1.2 ("Charset parameter") in RFC 2046 (MIME Part 2) and contained in the IANA character-set registry. Examples include "utf-8", "us-ascii" and "iso-8859-1".
	*/
	public final static String CIM_PROPERTY_CHARSET = "CharSet"; //$NON-NLS-1$
	/**
	*	The number of physical copies of the output that will be produced from this Job.
	*/
	public final static String CIM_PROPERTY_COPIES = "Copies"; //$NON-NLS-1$
	/**
	*	An array of integers that indicates the type of finishing that is required by this Job. It is equivalent to the Capabilities property that is provided by the Printer.
	*/
	public final static String CIM_PROPERTY_FINISHING = "Finishing"; //$NON-NLS-1$
	/**
	*	The resolution of the in Pixels per Inch for the Job in the cross-feed direction, i.e., short-edge in portrait feed mode.
	*/
	public final static String CIM_PROPERTY_HORIZONTALRESOLUTION = "HorizontalResolution"; //$NON-NLS-1$
	/**
	*	Uniquely identifies this Job within its scoping Queue, but NOT across different Queues or PrintServices.
	*/
	public final static String CIM_PROPERTY_JOBID = "JobID"; //$NON-NLS-1$
	/**
	*	Provides additional information, beyond Job Owner that is inherited from CIM_Job, to identify the origins of the PrintJob. This property could include information such as the System, Application, or Process that created the Job.
	*/
	public final static String CIM_PROPERTY_JOBORIGINATION = "JobOrigination"; //$NON-NLS-1$
	/**
	*	Specifies the size of the PrintJob (as a byte stream) in units of Kbytes.
	*/
	public final static String CIM_PROPERTY_JOBSIZE = "JobSize"; //$NON-NLS-1$
	/**
	*	The inherited JobStatus is used to provide additional information about the status of a PrintJob beyond that enumerated by PrintJobStatus.
	*/
	public final static String CIM_PROPERTY_JOBSTATUS = "JobStatus"; //$NON-NLS-1$
	/**
	*	Specifies the print language that is used by this Job.
	*/
	public final static String CIM_PROPERTY_LANGUAGE = "Language"; //$NON-NLS-1$
	/**
	*	Specifies the MIME types that are used by the PrintJob if Language is set to indicate that a MIME type is in use (value=47).
	*/
	public final static String CIM_PROPERTY_MIMETYPES = "MimeTypes"; //$NON-NLS-1$
	/**
	*	Identifies the language that should be used by the Printer for the management of this Job. The specified value should conform to RFC 1766. For example, "en" is used for English.
	*/
	public final static String CIM_PROPERTY_NATURALLANGUAGE = "NaturalLanguage"; //$NON-NLS-1$
	/**
	*	The number of print-stream pages that should be rendered onto a single media sheet when the Printer outputs this PrintJob.
	*/
	public final static String CIM_PROPERTY_NUMBERUP = "NumberUp"; //$NON-NLS-1$
	/**
	*	Describes the current state of this Job with respect to the PrintQueue and the Printer. Additional information can be specified in JobStatus.
	*/
	public final static String CIM_PROPERTY_PRINTJOBSTATUS = "PrintJobStatus"; //$NON-NLS-1$
	/**
	*	The CreationClassName of the scoping Queue.
	*/
	public final static String CIM_PROPERTY_QUEUECREATIONCLASSNAME = "QueueCreationClassName"; //$NON-NLS-1$
	/**
	*	The Name of the scoping Queue.
	*/
	public final static String CIM_PROPERTY_QUEUENAME = "QueueName"; //$NON-NLS-1$
	/**
	*	Describes the job sheets that should be used when this Job is output on the Printer.
	*/
	public final static String CIM_PROPERTY_REQUIREDJOBSHEETS = "RequiredJobSheets"; //$NON-NLS-1$
	/**
	*	A string that specifies the type of paper that is required by this PrintJob. The values of the property SHOULD conform to the requirements of the PWG Media Standardized Names specification [PWG5101.1], which defines the normative values for this property. See older Appendix B 'Media Size Names' and Appendix C 'Media Names' of IETF Printer MIB v2 [RFC3805] which list the values of standardized media names defined in ISO DPA [ISO10175].
	*/
	public final static String CIM_PROPERTY_REQUIREDPAPERTYPE = "RequiredPaperType"; //$NON-NLS-1$
	/**
	*	Note: The use of this free-form string property is deprecated in lieu of the more semantically rich CIM_JobSettingData class inherited from CIM_Job.
	*/
	public final static String CIM_PROPERTY_SCHEDULINGINFORMATION = "SchedulingInformation"; //$NON-NLS-1$
	/**
	*	The CreationClassName of the scoping System.
	*/
	public final static String CIM_PROPERTY_SYSTEMCREATIONCLASSNAME = "SystemCreationClassName"; //$NON-NLS-1$
	/**
	*	The Name of the scoping System.
	*/
	public final static String CIM_PROPERTY_SYSTEMNAME = "SystemName"; //$NON-NLS-1$
	/**
	*	The time when this Job was completed. This value is valid only if the PrintJobStatus has been assigned to "Complete" (value=5) or "Completed With Error" (value=6).
	*/
	public final static String CIM_PROPERTY_TIMECOMPLETED = "TimeCompleted"; //$NON-NLS-1$
	/**
	*	The resolution in Pixels per Inch for the Job in the feed direction, i.e., long-edge in portrait feed mode.
	*/
	public final static String CIM_PROPERTY_VERTICALRESOLUTION = "VerticalResolution"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CHARSET);
		CIM_PropertyNameList.add(CIM_PROPERTY_COPIES);
		CIM_PropertyNameList.add(CIM_PROPERTY_FINISHING);
		CIM_PropertyNameList.add(CIM_PROPERTY_HORIZONTALRESOLUTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_JOBID);
		CIM_PropertyNameList.add(CIM_PROPERTY_JOBORIGINATION);
		CIM_PropertyNameList.add(CIM_PROPERTY_JOBSIZE);
		CIM_PropertyNameList.add(CIM_PROPERTY_JOBSTATUS);
		CIM_PropertyNameList.add(CIM_PROPERTY_LANGUAGE);
		CIM_PropertyNameList.add(CIM_PROPERTY_MIMETYPES);
		CIM_PropertyNameList.add(CIM_PROPERTY_NATURALLANGUAGE);
		CIM_PropertyNameList.add(CIM_PROPERTY_NUMBERUP);
		CIM_PropertyNameList.add(CIM_PROPERTY_PRINTJOBSTATUS);
		CIM_PropertyNameList.add(CIM_PROPERTY_QUEUECREATIONCLASSNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_QUEUENAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_REQUIREDJOBSHEETS);
		CIM_PropertyNameList.add(CIM_PROPERTY_REQUIREDPAPERTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_SCHEDULINGINFORMATION);
		CIM_PropertyNameList.add(CIM_PROPERTY_SYSTEMCREATIONCLASSNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_SYSTEMNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_TIMECOMPLETED);
		CIM_PropertyNameList.add(CIM_PROPERTY_VERTICALRESOLUTION);
				
		for (int i = 0; i < CIM_Job.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Job.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CHARSET)||
				((String)CIM_Job.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_COPIES)||
				((String)CIM_Job.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FINISHING)||
				((String)CIM_Job.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_HORIZONTALRESOLUTION)||
				((String)CIM_Job.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_JOBID)||
				((String)CIM_Job.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_JOBORIGINATION)||
				((String)CIM_Job.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_JOBSIZE)||
				((String)CIM_Job.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_JOBSTATUS)||
				((String)CIM_Job.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LANGUAGE)||
				((String)CIM_Job.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MIMETYPES)||
				((String)CIM_Job.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NATURALLANGUAGE)||
				((String)CIM_Job.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NUMBERUP)||
				((String)CIM_Job.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PRINTJOBSTATUS)||
				((String)CIM_Job.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_QUEUECREATIONCLASSNAME)||
				((String)CIM_Job.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_QUEUENAME)||
				((String)CIM_Job.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REQUIREDJOBSHEETS)||
				((String)CIM_Job.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REQUIREDPAPERTYPE)||
				((String)CIM_Job.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SCHEDULINGINFORMATION)||
				((String)CIM_Job.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SYSTEMCREATIONCLASSNAME)||
				((String)CIM_Job.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SYSTEMNAME)||
				((String)CIM_Job.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TIMECOMPLETED)||
				((String)CIM_Job.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_VERTICALRESOLUTION)){
				continue;
			}
			
			CIM_PrintJob.CIM_PropertyNameList.add(CIM_Job.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CHARSET, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_COPIES, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FINISHING, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HORIZONTALRESOLUTION, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_JOBID, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_JOBORIGINATION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_JOBSIZE, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_JOBSTATUS, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LANGUAGE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MIMETYPES, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NATURALLANGUAGE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NUMBERUP, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PRINTJOBSTATUS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_QUEUECREATIONCLASSNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_QUEUENAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REQUIREDJOBSHEETS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REQUIREDPAPERTYPE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SCHEDULINGINFORMATION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SYSTEMCREATIONCLASSNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SYSTEMNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TIMECOMPLETED, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_VERTICALRESOLUTION, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
				
		for (int i = 0; i < CIM_Job.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Job.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CHARSET)||
				((CIMProperty)CIM_Job.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_COPIES)||
				((CIMProperty)CIM_Job.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FINISHING)||
				((CIMProperty)CIM_Job.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_HORIZONTALRESOLUTION)||
				((CIMProperty)CIM_Job.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_JOBID)||
				((CIMProperty)CIM_Job.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_JOBORIGINATION)||
				((CIMProperty)CIM_Job.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_JOBSIZE)||
				((CIMProperty)CIM_Job.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_JOBSTATUS)||
				((CIMProperty)CIM_Job.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LANGUAGE)||
				((CIMProperty)CIM_Job.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MIMETYPES)||
				((CIMProperty)CIM_Job.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NATURALLANGUAGE)||
				((CIMProperty)CIM_Job.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NUMBERUP)||
				((CIMProperty)CIM_Job.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PRINTJOBSTATUS)||
				((CIMProperty)CIM_Job.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_QUEUECREATIONCLASSNAME)||
				((CIMProperty)CIM_Job.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_QUEUENAME)||
				((CIMProperty)CIM_Job.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REQUIREDJOBSHEETS)||
				((CIMProperty)CIM_Job.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REQUIREDPAPERTYPE)||
				((CIMProperty)CIM_Job.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SCHEDULINGINFORMATION)||
				((CIMProperty)CIM_Job.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SYSTEMCREATIONCLASSNAME)||
				((CIMProperty)CIM_Job.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SYSTEMNAME)||
				((CIMProperty)CIM_Job.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TIMECOMPLETED)||
				((CIMProperty)CIM_Job.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_VERTICALRESOLUTION)){
				continue;
			}
			
			CIM_PrintJob.CIM_PropertyList.add(CIM_Job.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_Job.Java_Package_List.size(); i++) {
			if (((String)CIM_Job.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_Job.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_FINISHING = {"Unknown","Other","Color Printing","Duplex Printing","Copies","Collation","Stapling","Transparency Printing","Punch","Cover","Bind","Black and White Printing","One Sided","Two Sided Long Edge","Two Sided Short Edge","Portrait","Landscape","Reverse Portrait","Reverse Landscape","Quality High","Quality Normal","Quality Low"};
	public final static String[] CIM_VALUEMAP_LANGUAGE = {"Other","Unknown","PCL","HPGL","PJL","PS","PSPrinter","IPDS","PPDS","EscapeP","Epson","DDIF","Interpress","ISO6429","Line Data","MODCA","REGIS","SCS","SPDL","TEK4014","PDS","IGP","CodeV","DSCDSE","WPS","LN03","CCITT","QUIC","CPAP","DecPPL","Simple Text","NPAP","DOC","imPress","Pinwriter","NPDL","NEC201PL","Automatic","Pages","LIPS","TIFF","Diagnostic","CaPSL","EXCL","LCDS","XES","MIME","TIPSI","Prescribe","LinePrinter","IDP","XJCL","PDF","RPDL","IntermecIPL","UBIFingerprint","UBIDirectProtocol","Fujitsu","PCLXL","ART","CGM","JPEG","CALS1","CALS2","NIRS","C4"};
	public final static String[] CIM_VALUEMAP_PRINTJOBSTATUS = {"Other","Unknown","Pending","Blocked","Complete","Completed With Error","Printing"};
	
	
	public final static int FINISHING_UNKNOWN = 0;
	public final static int FINISHING_OTHER = 1;
	public final static int FINISHING_COLORPRINTING = 2;
	public final static int FINISHING_DUPLEXPRINTING = 3;
	public final static int FINISHING_COPIES = 4;
	public final static int FINISHING_COLLATION = 5;
	public final static int FINISHING_STAPLING = 6;
	public final static int FINISHING_TRANSPARENCYPRINTING = 7;
	public final static int FINISHING_PUNCH = 8;
	public final static int FINISHING_COVER = 9;
	public final static int FINISHING_BIND = 10;
	public final static int FINISHING_BLACKANDWHITEPRINTING = 11;
	public final static int FINISHING_ONESIDED = 12;
	public final static int FINISHING_TWOSIDEDLONGEDGE = 13;
	public final static int FINISHING_TWOSIDEDSHORTEDGE = 14;
	public final static int FINISHING_PORTRAIT = 15;
	public final static int FINISHING_LANDSCAPE = 16;
	public final static int FINISHING_REVERSEPORTRAIT = 17;
	public final static int FINISHING_REVERSELANDSCAPE = 18;
	public final static int FINISHING_QUALITYHIGH = 19;
	public final static int FINISHING_QUALITYNORMAL = 20;
	public final static int FINISHING_QUALITYLOW = 21;
	
	public final static int LANGUAGE_OTHER = 1;
	public final static int LANGUAGE_UNKNOWN = 2;
	public final static int LANGUAGE_PCL = 3;
	public final static int LANGUAGE_HPGL = 4;
	public final static int LANGUAGE_PJL = 5;
	public final static int LANGUAGE_PS = 6;
	public final static int LANGUAGE_PSPRINTER = 7;
	public final static int LANGUAGE_IPDS = 8;
	public final static int LANGUAGE_PPDS = 9;
	public final static int LANGUAGE_ESCAPEP = 10;
	public final static int LANGUAGE_EPSON = 11;
	public final static int LANGUAGE_DDIF = 12;
	public final static int LANGUAGE_INTERPRESS = 13;
	public final static int LANGUAGE_ISO6429 = 14;
	public final static int LANGUAGE_LINEDATA = 15;
	public final static int LANGUAGE_MODCA = 16;
	public final static int LANGUAGE_REGIS = 17;
	public final static int LANGUAGE_SCS = 18;
	public final static int LANGUAGE_SPDL = 19;
	public final static int LANGUAGE_TEK4014 = 20;
	public final static int LANGUAGE_PDS = 21;
	public final static int LANGUAGE_IGP = 22;
	public final static int LANGUAGE_CODEV = 23;
	public final static int LANGUAGE_DSCDSE = 24;
	public final static int LANGUAGE_WPS = 25;
	public final static int LANGUAGE_LN03 = 26;
	public final static int LANGUAGE_CCITT = 27;
	public final static int LANGUAGE_QUIC = 28;
	public final static int LANGUAGE_CPAP = 29;
	public final static int LANGUAGE_DECPPL = 30;
	public final static int LANGUAGE_SIMPLETEXT = 31;
	public final static int LANGUAGE_NPAP = 32;
	public final static int LANGUAGE_DOC = 33;
	public final static int LANGUAGE_IMPRESS = 34;
	public final static int LANGUAGE_PINWRITER = 35;
	public final static int LANGUAGE_NPDL = 36;
	public final static int LANGUAGE_NEC201PL = 37;
	public final static int LANGUAGE_AUTOMATIC = 38;
	public final static int LANGUAGE_PAGES = 39;
	public final static int LANGUAGE_LIPS = 40;
	public final static int LANGUAGE_TIFF = 41;
	public final static int LANGUAGE_DIAGNOSTIC = 42;
	public final static int LANGUAGE_CAPSL = 43;
	public final static int LANGUAGE_EXCL = 44;
	public final static int LANGUAGE_LCDS = 45;
	public final static int LANGUAGE_XES = 46;
	public final static int LANGUAGE_MIME = 47;
	public final static int LANGUAGE_TIPSI = 48;
	public final static int LANGUAGE_PRESCRIBE = 50;
	public final static int LANGUAGE_LINEPRINTER = 51;
	public final static int LANGUAGE_IDP = 52;
	public final static int LANGUAGE_XJCL = 53;
	public final static int LANGUAGE_PDF = 54;
	public final static int LANGUAGE_RPDL = 55;
	public final static int LANGUAGE_INTERMECIPL = 56;
	public final static int LANGUAGE_UBIFINGERPRINT = 57;
	public final static int LANGUAGE_UBIDIRECTPROTOCOL = 58;
	public final static int LANGUAGE_FUJITSU = 59;
	public final static int LANGUAGE_PCLXL = 60;
	public final static int LANGUAGE_ART = 61;
	public final static int LANGUAGE_CGM = 62;
	public final static int LANGUAGE_JPEG = 63;
	public final static int LANGUAGE_CALS1 = 64;
	public final static int LANGUAGE_CALS2 = 65;
	public final static int LANGUAGE_NIRS = 66;
	public final static int LANGUAGE_C4 = 67;
	
	public final static int PRINTJOBSTATUS_OTHER = 1;
	public final static int PRINTJOBSTATUS_UNKNOWN = 2;
	public final static int PRINTJOBSTATUS_PENDING = 3;
	public final static int PRINTJOBSTATUS_BLOCKED = 4;
	public final static int PRINTJOBSTATUS_COMPLETE = 5;
	public final static int PRINTJOBSTATUS_COMPLETEDWITHERROR = 6;
	public final static int PRINTJOBSTATUS_PRINTING = 7;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_PrintJob() {

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
	public CIM_PrintJob(Vector keyProperties){ 
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
	public CIM_PrintJob(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_JobID = this.cimInstance.getProperty(CIM_PROPERTY_JOBID);
		
		if (CIMProperty_JobID == null || CIMProperty_JobID.getValue().isEmpty() || CIMProperty_JobID.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_JOBID, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_QueueCreationClassName = this.cimInstance.getProperty(CIM_PROPERTY_QUEUECREATIONCLASSNAME);
		
		if (CIMProperty_QueueCreationClassName == null || CIMProperty_QueueCreationClassName.getValue().isEmpty() || CIMProperty_QueueCreationClassName.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_QUEUECREATIONCLASSNAME, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_QueueName = this.cimInstance.getProperty(CIM_PROPERTY_QUEUENAME);
		
		if (CIMProperty_QueueName == null || CIMProperty_QueueName.getValue().isEmpty() || CIMProperty_QueueName.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_QUEUENAME, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_SystemCreationClassName = this.cimInstance.getProperty(CIM_PROPERTY_SYSTEMCREATIONCLASSNAME);
		
		if (CIMProperty_SystemCreationClassName == null || CIMProperty_SystemCreationClassName.getValue().isEmpty() || CIMProperty_SystemCreationClassName.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_SYSTEMCREATIONCLASSNAME, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_SystemName = this.cimInstance.getProperty(CIM_PROPERTY_SYSTEMNAME);
		
		if (CIMProperty_SystemName == null || CIMProperty_SystemName.getValue().isEmpty() || CIMProperty_SystemName.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_SYSTEMNAME, "Key"});
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
	    
	    if (!(object instanceof CIM_PrintJob)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_PrintJob)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_PrintJob)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_PrintJob)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_PrintJob)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_PrintJob)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_PrintJob)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_PrintJob)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_PrintJob)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_PrintJob)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_PrintQueue_CIM_OwningPrintQueues(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_OWNINGPRINTQUEUE, 
					CIM_PrintQueue.CIM_CLASS_NAME, 
					"Dependent", //$NON-NLS-1$
					"Antecedent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_PrintJob.Java_Package_List.size(); i++) {
						if (!((String)(CIM_PrintJob.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_PrintJob.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_PrintJob.Java_Package_List.setElementAt((String)(CIM_PrintJob.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_PrintJob.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_PrintQueue(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_PrintQueue(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_PrintQueue(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_PrintQueue_CIM_OwningPrintQueue_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_OWNINGPRINTQUEUE, 
					CIM_PrintQueue.CIM_CLASS_NAME, 
					"Dependent", //$NON-NLS-1$
					"Antecedent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_PrintQueue.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_DataFile_CIM_PrintJobFiles(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_PRINTJOBFILE, 
					CIM_DataFile.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_PrintJob.Java_Package_List.size(); i++) {
						if (!((String)(CIM_PrintJob.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_PrintJob.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_PrintJob.Java_Package_List.setElementAt((String)(CIM_PrintJob.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_PrintJob.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_DataFile(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_DataFile(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_DataFile(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_DataFile_CIM_PrintJobFile_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_PRINTJOBFILE, 
					CIM_DataFile.CIM_CLASS_NAME, 
					"GroupComponent", //$NON-NLS-1$
					"PartComponent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_DataFile.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_Printer_CIM_PrinterServicingJobs(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_PRINTERSERVICINGJOB, 
					CIM_Printer.CIM_CLASS_NAME, 
					"Dependent", //$NON-NLS-1$
					"Antecedent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_PrintJob.Java_Package_List.size(); i++) {
						if (!((String)(CIM_PrintJob.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_PrintJob.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_PrintJob.Java_Package_List.setElementAt((String)(CIM_PrintJob.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_PrintJob.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_Printer(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_Printer(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_Printer(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_Printer_CIM_PrinterServicingJob_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_PRINTERSERVICINGJOB, 
					CIM_Printer.CIM_CLASS_NAME, 
					"Dependent", //$NON-NLS-1$
					"Antecedent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_Printer.CIM_CLASS_NAME)) {
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
	
	// Attribute CharSet
	
	public String get_CharSet() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintJob.CIM_PROPERTY_CHARSET);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintJob.CIM_PROPERTY_CHARSET + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintJob.CIM_PROPERTY_CHARSET + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CharSet(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintJob.CIM_PROPERTY_CHARSET);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintJob.CIM_PROPERTY_CHARSET + " could not be found");
    		
		} else if (!CIM_PrintJobHelper.isValid_CharSet(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PrintJob.CIM_PROPERTY_CHARSET);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintJob.CIM_PROPERTY_CHARSET + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Copies
	
	public UnsignedInt32 get_Copies() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintJob.CIM_PROPERTY_COPIES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintJob.CIM_PROPERTY_COPIES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintJob.CIM_PROPERTY_COPIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Copies(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintJob.CIM_PROPERTY_COPIES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintJob.CIM_PROPERTY_COPIES + " could not be found");
    		
		} else if (!CIM_PrintJobHelper.isValid_Copies(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PrintJob.CIM_PROPERTY_COPIES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintJob.CIM_PROPERTY_COPIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Finishing
	
	public UnsignedInt16[] get_Finishing() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintJob.CIM_PROPERTY_FINISHING);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintJob.CIM_PROPERTY_FINISHING + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintJob.CIM_PROPERTY_FINISHING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		UnsignedInt16[] resultArray = new UnsignedInt16[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (UnsignedInt16)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_Finishing(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintJob.CIM_PROPERTY_FINISHING);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintJob.CIM_PROPERTY_FINISHING + " could not be found");
    		
		} else if (!CIM_PrintJobHelper.isValid_Finishing(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PrintJob.CIM_PROPERTY_FINISHING);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintJob.CIM_PROPERTY_FINISHING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute HorizontalResolution
	
	public UnsignedInt32 get_HorizontalResolution() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintJob.CIM_PROPERTY_HORIZONTALRESOLUTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintJob.CIM_PROPERTY_HORIZONTALRESOLUTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintJob.CIM_PROPERTY_HORIZONTALRESOLUTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_HorizontalResolution(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintJob.CIM_PROPERTY_HORIZONTALRESOLUTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintJob.CIM_PROPERTY_HORIZONTALRESOLUTION + " could not be found");
    		
		} else if (!CIM_PrintJobHelper.isValid_HorizontalResolution(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PrintJob.CIM_PROPERTY_HORIZONTALRESOLUTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintJob.CIM_PROPERTY_HORIZONTALRESOLUTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute JobID
	
	public String get_JobID() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintJob.CIM_PROPERTY_JOBID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintJob.CIM_PROPERTY_JOBID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintJob.CIM_PROPERTY_JOBID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_JobID(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintJob.CIM_PROPERTY_JOBID);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_PrintJob.CIM_PROPERTY_JOBID + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintJob.CIM_PROPERTY_JOBID + " could not be found");
    		
		} else if (!CIM_PrintJobHelper.isValid_JobID(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PrintJob.CIM_PROPERTY_JOBID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintJob.CIM_PROPERTY_JOBID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute JobOrigination
	
	public String get_JobOrigination() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintJob.CIM_PROPERTY_JOBORIGINATION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintJob.CIM_PROPERTY_JOBORIGINATION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintJob.CIM_PROPERTY_JOBORIGINATION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_JobOrigination(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintJob.CIM_PROPERTY_JOBORIGINATION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintJob.CIM_PROPERTY_JOBORIGINATION + " could not be found");
    		
		} else if (!CIM_PrintJobHelper.isValid_JobOrigination(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PrintJob.CIM_PROPERTY_JOBORIGINATION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintJob.CIM_PROPERTY_JOBORIGINATION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute JobSize
	
	public UnsignedInt32 get_JobSize() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintJob.CIM_PROPERTY_JOBSIZE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintJob.CIM_PROPERTY_JOBSIZE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintJob.CIM_PROPERTY_JOBSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_JobSize(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintJob.CIM_PROPERTY_JOBSIZE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintJob.CIM_PROPERTY_JOBSIZE + " could not be found");
    		
		} else if (!CIM_PrintJobHelper.isValid_JobSize(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PrintJob.CIM_PROPERTY_JOBSIZE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintJob.CIM_PROPERTY_JOBSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute JobStatus
	
	public String get_JobStatus() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintJob.CIM_PROPERTY_JOBSTATUS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintJob.CIM_PROPERTY_JOBSTATUS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintJob.CIM_PROPERTY_JOBSTATUS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_JobStatus(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintJob.CIM_PROPERTY_JOBSTATUS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintJob.CIM_PROPERTY_JOBSTATUS + " could not be found");
    		
		} else if (!CIM_PrintJobHelper.isValid_JobStatus(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PrintJob.CIM_PROPERTY_JOBSTATUS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintJob.CIM_PROPERTY_JOBSTATUS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Language
	
	public UnsignedInt16 get_Language() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintJob.CIM_PROPERTY_LANGUAGE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintJob.CIM_PROPERTY_LANGUAGE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintJob.CIM_PROPERTY_LANGUAGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Language(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintJob.CIM_PROPERTY_LANGUAGE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintJob.CIM_PROPERTY_LANGUAGE + " could not be found");
    		
		} else if (!CIM_PrintJobHelper.isValid_Language(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PrintJob.CIM_PROPERTY_LANGUAGE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintJob.CIM_PROPERTY_LANGUAGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MimeTypes
	
	public String[] get_MimeTypes() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintJob.CIM_PROPERTY_MIMETYPES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintJob.CIM_PROPERTY_MIMETYPES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintJob.CIM_PROPERTY_MIMETYPES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		String[] resultArray = new String[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (String)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_MimeTypes(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintJob.CIM_PROPERTY_MIMETYPES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintJob.CIM_PROPERTY_MIMETYPES + " could not be found");
    		
		} else if (!CIM_PrintJobHelper.isValid_MimeTypes(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PrintJob.CIM_PROPERTY_MIMETYPES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintJob.CIM_PROPERTY_MIMETYPES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute NaturalLanguage
	
	public String get_NaturalLanguage() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintJob.CIM_PROPERTY_NATURALLANGUAGE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintJob.CIM_PROPERTY_NATURALLANGUAGE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintJob.CIM_PROPERTY_NATURALLANGUAGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_NaturalLanguage(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintJob.CIM_PROPERTY_NATURALLANGUAGE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintJob.CIM_PROPERTY_NATURALLANGUAGE + " could not be found");
    		
		} else if (!CIM_PrintJobHelper.isValid_NaturalLanguage(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PrintJob.CIM_PROPERTY_NATURALLANGUAGE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintJob.CIM_PROPERTY_NATURALLANGUAGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute NumberUp
	
	public UnsignedInt32 get_NumberUp() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintJob.CIM_PROPERTY_NUMBERUP);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintJob.CIM_PROPERTY_NUMBERUP + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintJob.CIM_PROPERTY_NUMBERUP + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_NumberUp(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintJob.CIM_PROPERTY_NUMBERUP);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintJob.CIM_PROPERTY_NUMBERUP + " could not be found");
    		
		} else if (!CIM_PrintJobHelper.isValid_NumberUp(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PrintJob.CIM_PROPERTY_NUMBERUP);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintJob.CIM_PROPERTY_NUMBERUP + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PrintJobStatus
	
	public UnsignedInt16 get_PrintJobStatus() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintJob.CIM_PROPERTY_PRINTJOBSTATUS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintJob.CIM_PROPERTY_PRINTJOBSTATUS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintJob.CIM_PROPERTY_PRINTJOBSTATUS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PrintJobStatus(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintJob.CIM_PROPERTY_PRINTJOBSTATUS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintJob.CIM_PROPERTY_PRINTJOBSTATUS + " could not be found");
    		
		} else if (!CIM_PrintJobHelper.isValid_PrintJobStatus(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PrintJob.CIM_PROPERTY_PRINTJOBSTATUS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintJob.CIM_PROPERTY_PRINTJOBSTATUS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute QueueCreationClassName
	
	public String get_QueueCreationClassName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintJob.CIM_PROPERTY_QUEUECREATIONCLASSNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintJob.CIM_PROPERTY_QUEUECREATIONCLASSNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintJob.CIM_PROPERTY_QUEUECREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_QueueCreationClassName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintJob.CIM_PROPERTY_QUEUECREATIONCLASSNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_PrintJob.CIM_PROPERTY_QUEUECREATIONCLASSNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintJob.CIM_PROPERTY_QUEUECREATIONCLASSNAME + " could not be found");
    		
		} else if (!CIM_PrintJobHelper.isValid_QueueCreationClassName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PrintJob.CIM_PROPERTY_QUEUECREATIONCLASSNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintJob.CIM_PROPERTY_QUEUECREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute QueueName
	
	public String get_QueueName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintJob.CIM_PROPERTY_QUEUENAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintJob.CIM_PROPERTY_QUEUENAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintJob.CIM_PROPERTY_QUEUENAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_QueueName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintJob.CIM_PROPERTY_QUEUENAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_PrintJob.CIM_PROPERTY_QUEUENAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintJob.CIM_PROPERTY_QUEUENAME + " could not be found");
    		
		} else if (!CIM_PrintJobHelper.isValid_QueueName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PrintJob.CIM_PROPERTY_QUEUENAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintJob.CIM_PROPERTY_QUEUENAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RequiredJobSheets
	
	public String[] get_RequiredJobSheets() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintJob.CIM_PROPERTY_REQUIREDJOBSHEETS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintJob.CIM_PROPERTY_REQUIREDJOBSHEETS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintJob.CIM_PROPERTY_REQUIREDJOBSHEETS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		String[] resultArray = new String[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (String)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_RequiredJobSheets(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintJob.CIM_PROPERTY_REQUIREDJOBSHEETS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintJob.CIM_PROPERTY_REQUIREDJOBSHEETS + " could not be found");
    		
		} else if (!CIM_PrintJobHelper.isValid_RequiredJobSheets(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PrintJob.CIM_PROPERTY_REQUIREDJOBSHEETS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintJob.CIM_PROPERTY_REQUIREDJOBSHEETS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RequiredPaperType
	
	public String get_RequiredPaperType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintJob.CIM_PROPERTY_REQUIREDPAPERTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintJob.CIM_PROPERTY_REQUIREDPAPERTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintJob.CIM_PROPERTY_REQUIREDPAPERTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RequiredPaperType(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintJob.CIM_PROPERTY_REQUIREDPAPERTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintJob.CIM_PROPERTY_REQUIREDPAPERTYPE + " could not be found");
    		
		} else if (!CIM_PrintJobHelper.isValid_RequiredPaperType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PrintJob.CIM_PROPERTY_REQUIREDPAPERTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintJob.CIM_PROPERTY_REQUIREDPAPERTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SchedulingInformation
	
	public String get_SchedulingInformation() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintJob.CIM_PROPERTY_SCHEDULINGINFORMATION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintJob.CIM_PROPERTY_SCHEDULINGINFORMATION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintJob.CIM_PROPERTY_SCHEDULINGINFORMATION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SchedulingInformation(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintJob.CIM_PROPERTY_SCHEDULINGINFORMATION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintJob.CIM_PROPERTY_SCHEDULINGINFORMATION + " could not be found");
    		
		} else if (!CIM_PrintJobHelper.isValid_SchedulingInformation(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PrintJob.CIM_PROPERTY_SCHEDULINGINFORMATION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintJob.CIM_PROPERTY_SCHEDULINGINFORMATION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SystemCreationClassName
	
	public String get_SystemCreationClassName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintJob.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintJob.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintJob.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SystemCreationClassName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintJob.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_PrintJob.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintJob.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME + " could not be found");
    		
		} else if (!CIM_PrintJobHelper.isValid_SystemCreationClassName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PrintJob.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintJob.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SystemName
	
	public String get_SystemName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintJob.CIM_PROPERTY_SYSTEMNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintJob.CIM_PROPERTY_SYSTEMNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintJob.CIM_PROPERTY_SYSTEMNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SystemName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintJob.CIM_PROPERTY_SYSTEMNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_PrintJob.CIM_PROPERTY_SYSTEMNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintJob.CIM_PROPERTY_SYSTEMNAME + " could not be found");
    		
		} else if (!CIM_PrintJobHelper.isValid_SystemName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PrintJob.CIM_PROPERTY_SYSTEMNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintJob.CIM_PROPERTY_SYSTEMNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TimeCompleted
	
	public Calendar get_TimeCompleted() {

		CIMProperty property = this.cimInstance.getProperty(CIM_PrintJob.CIM_PROPERTY_TIMECOMPLETED);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintJob.CIM_PROPERTY_TIMECOMPLETED + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintJob.CIM_PROPERTY_TIMECOMPLETED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_TimeCompleted(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintJob.CIM_PROPERTY_TIMECOMPLETED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintJob.CIM_PROPERTY_TIMECOMPLETED + " could not be found");
    		
		} else if (!CIM_PrintJobHelper.isValid_TimeCompleted(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PrintJob.CIM_PROPERTY_TIMECOMPLETED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintJob.CIM_PROPERTY_TIMECOMPLETED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	// Attribute VerticalResolution
	
	public UnsignedInt32 get_VerticalResolution() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintJob.CIM_PROPERTY_VERTICALRESOLUTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintJob.CIM_PROPERTY_VERTICALRESOLUTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintJob.CIM_PROPERTY_VERTICALRESOLUTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_VerticalResolution(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintJob.CIM_PROPERTY_VERTICALRESOLUTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintJob.CIM_PROPERTY_VERTICALRESOLUTION + " could not be found");
    		
		} else if (!CIM_PrintJobHelper.isValid_VerticalResolution(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PrintJob.CIM_PROPERTY_VERTICALRESOLUTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintJob.CIM_PROPERTY_VERTICALRESOLUTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
