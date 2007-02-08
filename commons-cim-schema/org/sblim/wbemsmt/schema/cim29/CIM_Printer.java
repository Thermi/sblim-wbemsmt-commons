/** 
 * CIM_Printer.java
 *
 * © Copyright IBM Corp. 2005
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
 * Description: Capabilities and management of the Printer LogicalDevice.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.Enumeration;
import java.lang.reflect.Constructor;
import org.sblim.wbem.client.*;



public class CIM_Printer extends CIM_LogicalDevice  {
	
	public final static String CIM_CLASS_NAME = "CIM_Printer";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.1";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_PRINTERSERVICINGJOB = "CIM_PrinterServicingJob";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_PRINTERSERVICINGQUEUE = "CIM_PrinterServicingQueue";
	
	
	/**
	*	Describes all of the job sheets that are available on the Printer. This can also be used to describe the banner that a Printer might provide at the beginning of each Job, or can describe other user specified options.
	*/
	public final static String CIM_PROPERTY_AVAILABLEJOBSHEETS = "AvailableJobSheets"; //$NON-NLS-1$
	/**
	*	An array of integers indicating Printer capabilities. Information such as "Duplex Printing" (value=3) or "Transparency Printing" (7) is specified in this property.
	*/
	public final static String CIM_PROPERTY_CAPABILITIES = "Capabilities"; //$NON-NLS-1$
	/**
	*	An array of free-form strings providing more detailed explanations for any of the Printer features indicated in the Capabilities array. Note, each entry of this array is related to the entry in the Capabilities array that is located at the same index.
	*/
	public final static String CIM_PROPERTY_CAPABILITYDESCRIPTIONS = "CapabilityDescriptions"; //$NON-NLS-1$
	/**
	*	Identifies the available character sets for the output of text related to managing the Printer. Strings provided in this property should conform to the semantics and syntax specified by section 4.1.2 ("Charset parameter") in RFC 2046 (MIME Part 2) and contained in the IANA character-set registry. Examples include "utf-8", "us-ascii" and "iso-8859-1".
	*/
	public final static String CIM_PROPERTY_CHARSETSSUPPORTED = "CharSetsSupported"; //$NON-NLS-1$
	/**
	*	Specifies which finishings and other capabilities of the Printer are currently being used. An entry in this property should also be listed in the Capabilities array.
	*/
	public final static String CIM_PROPERTY_CURRENTCAPABILITIES = "CurrentCapabilities"; //$NON-NLS-1$
	/**
	*	Specifies the current character set being used for the output of text relating to management of the Printer. The character set described by this property should also be listed in CharsetsSupported. The string specified by this property should conform to the semantics and syntax specified by section 4.1.2 ("Charset parameter") in RFC 2046 (MIME Part 2) and contained in the IANA character-set registry. Examples include "utf-8", "us-ascii" and "iso-8859-1".
	*/
	public final static String CIM_PROPERTY_CURRENTCHARSET = "CurrentCharSet"; //$NON-NLS-1$
	/**
	*	Indicates the current printer language being used. A language that is being used by the Printer should also be listed in LanguagesSupported.
	*/
	public final static String CIM_PROPERTY_CURRENTLANGUAGE = "CurrentLanguage"; //$NON-NLS-1$
	/**
	*	Specifies the mime type currently being used by the Printer if the CurrentLanguage is set to indicate a mime type is in use (value = 47).
	*/
	public final static String CIM_PROPERTY_CURRENTMIMETYPE = "CurrentMimeType"; //$NON-NLS-1$
	/**
	*	Identifies the current language being used by the Printer for management. The language listed in the CurrentNaturalLanguage property should also be listed in NaturalLanguagesSupported.
	*/
	public final static String CIM_PROPERTY_CURRENTNATURALLANGUAGE = "CurrentNaturalLanguage"; //$NON-NLS-1$
	/**
	*	Specifies the paper type that the Printer is currently using. The string should be expressed in the form specified by ISO/IEC 10175 Document Printing Application (DPA) which is also summarized in Appendix C of RFC 1759 (Printer MIB).
	*/
	public final static String CIM_PROPERTY_CURRENTPAPERTYPE = "CurrentPaperType"; //$NON-NLS-1$
	/**
	*	Specifies which finishings and other capabilities of the Printer will be used by default. An entry in Default Capabilities should also be listed in the Capabilities array.
	*/
	public final static String CIM_PROPERTY_DEFAULTCAPABILITIES = "DefaultCapabilities"; //$NON-NLS-1$
	/**
	*	The number of copies that will be produced for a single Job unless otherwise specified.
	*/
	public final static String CIM_PROPERTY_DEFAULTCOPIES = "DefaultCopies"; //$NON-NLS-1$
	/**
	*	Indicates the default printer language. A language that is used as a default by the Printer should also be listed in LanguagesSupported.
	*/
	public final static String CIM_PROPERTY_DEFAULTLANGUAGE = "DefaultLanguage"; //$NON-NLS-1$
	/**
	*	Specifies the default mime type used by the Printer if the DefaultLanguage is set to indicate a mime type is in use (value=47).
	*/
	public final static String CIM_PROPERTY_DEFAULTMIMETYPE = "DefaultMimeType"; //$NON-NLS-1$
	/**
	*	The number of print-stream pages that the Printer will render onto a single media sheet unless a Job specifies otherwise.
	*/
	public final static String CIM_PROPERTY_DEFAULTNUMBERUP = "DefaultNumberUp"; //$NON-NLS-1$
	/**
	*	Specifies the paper type that the Printer will use if a PrintJob does not specify a particular type. The string should be expressed in the form specified by ISO/IEC 10175 Document Printing Application (DPA) which is also summarized in Appendix C of RFC 1759 (Printer MIB).
	*/
	public final static String CIM_PROPERTY_DEFAULTPAPERTYPE = "DefaultPaperType"; //$NON-NLS-1$
	/**
	*	Printer error information.
	*/
	public final static String CIM_PROPERTY_DETECTEDERRORSTATE = "DetectedErrorState"; //$NON-NLS-1$
	/**
	*	An array providing supplemental information for the current error state, indicated in DetectedErrorState.
	*/
	public final static String CIM_PROPERTY_ERRORINFORMATION = "ErrorInformation"; //$NON-NLS-1$
	/**
	*	Printer's horizontal resolution in Pixels per Inch.
	*/
	public final static String CIM_PROPERTY_HORIZONTALRESOLUTION = "HorizontalResolution"; //$NON-NLS-1$
	/**
	*	Printer jobs processed since last reset. These jobs may be processed from one or more PrintQueues.
	*/
	public final static String CIM_PROPERTY_JOBCOUNTSINCELASTRESET = "JobCountSinceLastReset"; //$NON-NLS-1$
	/**
	*	An array indicating the print languages natively supported.
	*/
	public final static String CIM_PROPERTY_LANGUAGESSUPPORTED = "LanguagesSupported"; //$NON-NLS-1$
	/**
	*	Specifies the marking technology used by the Printer.
	*/
	public final static String CIM_PROPERTY_MARKINGTECHNOLOGY = "MarkingTechnology"; //$NON-NLS-1$
	/**
	*	The maximum number of copies that can be produced by the Printer from a single Job.
	*/
	public final static String CIM_PROPERTY_MAXCOPIES = "MaxCopies"; //$NON-NLS-1$
	/**
	*	The maximum number of print-stream pages that the Printer can render onto a single media sheet.
	*/
	public final static String CIM_PROPERTY_MAXNUMBERUP = "MaxNumberUp"; //$NON-NLS-1$
	/**
	*	Specifies the largest Job (as a byte stream) that the Printer will accept in units of Kbytes. A value of zero indicates that no limit has been set.
	*/
	public final static String CIM_PROPERTY_MAXSIZESUPPORTED = "MaxSizeSupported"; //$NON-NLS-1$
	/**
	*	An array of free-form strings providing more detailed explanations of any mime types that are supported by the Printer. If data is provided for this property, then the value 47, "Mime", should be included in the Languages Supported property.
	*/
	public final static String CIM_PROPERTY_MIMETYPESSUPPORTED = "MimeTypesSupported"; //$NON-NLS-1$
	/**
	*	Identifies the available languages for strings used by the Printer for the output of management information. The strings should conform to RFC 1766, for example "en" is used for English.
	*/
	public final static String CIM_PROPERTY_NATURALLANGUAGESSUPPORTED = "NaturalLanguagesSupported"; //$NON-NLS-1$
	/**
	*	An integer array indicating the types of paper supported.
	*/
	public final static String CIM_PROPERTY_PAPERSIZESSUPPORTED = "PaperSizesSupported"; //$NON-NLS-1$
	/**
	*	An array of free-form strings specifying the types of paper that are currently available on the Printer. Each string should be expressed in the form specified by ISO/IEC 10175 Document Printing Application (DPA) which is also summarized in Appendix C of RFC 1759 (Printer MIB). Examples of valid strings are "iso-a4-colored" and "na-10x14-envelope". By definition a paper size that is available and listed in PaperTypesAvailable should also appear in the PaperSizesSupported property.
	*/
	public final static String CIM_PROPERTY_PAPERTYPESAVAILABLE = "PaperTypesAvailable"; //$NON-NLS-1$
	/**
	*	Status information for a Printer, beyond that specified in the LogicalDevice Availability property. Values include "Idle" (3) and an indication that the Device is currently printing (4).
	*/
	public final static String CIM_PROPERTY_PRINTERSTATUS = "PrinterStatus"; //$NON-NLS-1$
	/**
	*	Time of last reset of the Printer Device.
	*/
	public final static String CIM_PROPERTY_TIMEOFLASTRESET = "TimeOfLastReset"; //$NON-NLS-1$
	/**
	*	Printer's vertical resolution in Pixels per Inch.
	*/
	public final static String CIM_PROPERTY_VERTICALRESOLUTION = "VerticalResolution"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_AVAILABLEJOBSHEETS);
		CIM_PropertyNameList.add(CIM_PROPERTY_CAPABILITIES);
		CIM_PropertyNameList.add(CIM_PROPERTY_CAPABILITYDESCRIPTIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_CHARSETSSUPPORTED);
		CIM_PropertyNameList.add(CIM_PROPERTY_CURRENTCAPABILITIES);
		CIM_PropertyNameList.add(CIM_PROPERTY_CURRENTCHARSET);
		CIM_PropertyNameList.add(CIM_PROPERTY_CURRENTLANGUAGE);
		CIM_PropertyNameList.add(CIM_PROPERTY_CURRENTMIMETYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_CURRENTNATURALLANGUAGE);
		CIM_PropertyNameList.add(CIM_PROPERTY_CURRENTPAPERTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_DEFAULTCAPABILITIES);
		CIM_PropertyNameList.add(CIM_PROPERTY_DEFAULTCOPIES);
		CIM_PropertyNameList.add(CIM_PROPERTY_DEFAULTLANGUAGE);
		CIM_PropertyNameList.add(CIM_PROPERTY_DEFAULTMIMETYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_DEFAULTNUMBERUP);
		CIM_PropertyNameList.add(CIM_PROPERTY_DEFAULTPAPERTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_DETECTEDERRORSTATE);
		CIM_PropertyNameList.add(CIM_PROPERTY_ERRORINFORMATION);
		CIM_PropertyNameList.add(CIM_PROPERTY_HORIZONTALRESOLUTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_JOBCOUNTSINCELASTRESET);
		CIM_PropertyNameList.add(CIM_PROPERTY_LANGUAGESSUPPORTED);
		CIM_PropertyNameList.add(CIM_PROPERTY_MARKINGTECHNOLOGY);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXCOPIES);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXNUMBERUP);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXSIZESUPPORTED);
		CIM_PropertyNameList.add(CIM_PROPERTY_MIMETYPESSUPPORTED);
		CIM_PropertyNameList.add(CIM_PROPERTY_NATURALLANGUAGESSUPPORTED);
		CIM_PropertyNameList.add(CIM_PROPERTY_PAPERSIZESSUPPORTED);
		CIM_PropertyNameList.add(CIM_PROPERTY_PAPERTYPESAVAILABLE);
		CIM_PropertyNameList.add(CIM_PROPERTY_PRINTERSTATUS);
		CIM_PropertyNameList.add(CIM_PROPERTY_TIMEOFLASTRESET);
		CIM_PropertyNameList.add(CIM_PROPERTY_VERTICALRESOLUTION);
				
		for (int i = 0; i < CIM_LogicalDevice.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_AVAILABLEJOBSHEETS)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CAPABILITIES)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CAPABILITYDESCRIPTIONS)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CHARSETSSUPPORTED)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CURRENTCAPABILITIES)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CURRENTCHARSET)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CURRENTLANGUAGE)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CURRENTMIMETYPE)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CURRENTNATURALLANGUAGE)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CURRENTPAPERTYPE)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DEFAULTCAPABILITIES)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DEFAULTCOPIES)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DEFAULTLANGUAGE)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DEFAULTMIMETYPE)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DEFAULTNUMBERUP)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DEFAULTPAPERTYPE)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DETECTEDERRORSTATE)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ERRORINFORMATION)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_HORIZONTALRESOLUTION)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_JOBCOUNTSINCELASTRESET)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LANGUAGESSUPPORTED)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MARKINGTECHNOLOGY)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXCOPIES)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXNUMBERUP)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXSIZESUPPORTED)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MIMETYPESSUPPORTED)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NATURALLANGUAGESSUPPORTED)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PAPERSIZESSUPPORTED)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PAPERTYPESAVAILABLE)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PRINTERSTATUS)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TIMEOFLASTRESET)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_VERTICALRESOLUTION)){
				continue;
			}
			
			CIM_Printer.CIM_PropertyNameList.add(CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_AVAILABLEJOBSHEETS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CAPABILITIES, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CAPABILITYDESCRIPTIONS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CHARSETSSUPPORTED, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CURRENTCAPABILITIES, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CURRENTCHARSET, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CURRENTLANGUAGE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CURRENTMIMETYPE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CURRENTNATURALLANGUAGE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CURRENTPAPERTYPE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DEFAULTCAPABILITIES, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DEFAULTCOPIES, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DEFAULTLANGUAGE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DEFAULTMIMETYPE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DEFAULTNUMBERUP, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DEFAULTPAPERTYPE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DETECTEDERRORSTATE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ERRORINFORMATION, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HORIZONTALRESOLUTION, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_JOBCOUNTSINCELASTRESET, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LANGUAGESSUPPORTED, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MARKINGTECHNOLOGY, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXCOPIES, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXNUMBERUP, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXSIZESUPPORTED, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MIMETYPESSUPPORTED, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NATURALLANGUAGESSUPPORTED, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PAPERSIZESSUPPORTED, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PAPERTYPESAVAILABLE, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PRINTERSTATUS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TIMEOFLASTRESET, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_VERTICALRESOLUTION, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
				
		for (int i = 0; i < CIM_LogicalDevice.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_AVAILABLEJOBSHEETS)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CAPABILITIES)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CAPABILITYDESCRIPTIONS)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CHARSETSSUPPORTED)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CURRENTCAPABILITIES)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CURRENTCHARSET)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CURRENTLANGUAGE)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CURRENTMIMETYPE)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CURRENTNATURALLANGUAGE)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CURRENTPAPERTYPE)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DEFAULTCAPABILITIES)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DEFAULTCOPIES)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DEFAULTLANGUAGE)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DEFAULTMIMETYPE)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DEFAULTNUMBERUP)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DEFAULTPAPERTYPE)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DETECTEDERRORSTATE)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ERRORINFORMATION)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_HORIZONTALRESOLUTION)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_JOBCOUNTSINCELASTRESET)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LANGUAGESSUPPORTED)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MARKINGTECHNOLOGY)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXCOPIES)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXNUMBERUP)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXSIZESUPPORTED)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MIMETYPESSUPPORTED)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NATURALLANGUAGESSUPPORTED)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PAPERSIZESSUPPORTED)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PAPERTYPESAVAILABLE)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PRINTERSTATUS)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TIMEOFLASTRESET)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_VERTICALRESOLUTION)){
				continue;
			}
			
			CIM_Printer.CIM_PropertyList.add(CIM_LogicalDevice.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_LogicalDevice.Java_Package_List.size(); i++) {
			if (((String)CIM_LogicalDevice.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_LogicalDevice.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_CAPABILITIES = {"Unknown","Other","Color Printing","Duplex Printing","Copies","Collation","Stapling","Transparency Printing","Punch","Cover","Bind","Black and White Printing","One Sided","Two Sided Long Edge","Two Sided Short Edge","Portrait","Landscape","Reverse Portrait","Reverse Landscape","Quality High","Quality Normal","Quality Low"};
	public final static String[] CIM_VALUEMAP_CURRENTCAPABILITIES = {"Unknown","Other","Color Printing","Duplex Printing","Copies","Collation","Stapling","Transparency Printing","Punch","Cover","Bind","Black and White Printing","One Sided","Two Sided Long Edge","Two Sided Short Edge","Portrait","Landscape","Reverse Portrait","Reverse Landscape","Quality High","Quality Normal","Quality Low"};
	public final static String[] CIM_VALUEMAP_CURRENTLANGUAGE = {"Other","Unknown","PCL","HPGL","PJL","PS","PSPrinter","IPDS","PPDS","EscapeP","Epson","DDIF","Interpress","ISO6429","Line Data","MODCA","REGIS","SCS","SPDL","TEK4014","PDS","IGP","CodeV","DSCDSE","WPS","LN03","CCITT","QUIC","CPAP","DecPPL","Simple Text","NPAP","DOC","imPress","Pinwriter","NPDL","NEC201PL","Automatic","Pages","LIPS","TIFF","Diagnostic","CaPSL","EXCL","LCDS","XES","MIME","TIPSI","Prescribe","LinePrinter","IDP","XJCL","PDF","RPDL","IntermecIPL","UBIFingerprint","UBIDirectProtocol","Fujitsu","PCLXL"};
	public final static String[] CIM_VALUEMAP_DEFAULTCAPABILITIES = {"Unknown","Other","Color Printing","Duplex Printing","Copies","Collation","Stapling","Transparency Printing","Punch","Cover","Bind","Black and White Printing","One Sided","Two Sided Long Edge","Two Sided Short Edge","Portrait","Landscape","Reverse Portrait","Reverse Landscape","Quality High","Quality Normal","Quality Low"};
	public final static String[] CIM_VALUEMAP_DEFAULTLANGUAGE = {"Other","Unknown","PCL","HPGL","PJL","PS","PSPrinter","IPDS","PPDS","EscapeP","Epson","DDIF","Interpress","ISO6429","Line Data","MODCA","REGIS","SCS","SPDL","TEK4014","PDS","IGP","CodeV","DSCDSE","WPS","LN03","CCITT","QUIC","CPAP","DecPPL","Simple Text","NPAP","DOC","imPress","Pinwriter","NPDL","NEC201PL","Automatic","Pages","LIPS","TIFF","Diagnostic","CaPSL","EXCL","LCDS","XES","MIME","TIPSI","Prescribe","LinePrinter","IDP","XJCL","PDF","RPDL","IntermecIPL","UBIFingerprint","UBIDirectProtocol","Fujitsu","PCLXL"};
	public final static String[] CIM_VALUEMAP_DETECTEDERRORSTATE = {"Unknown","Other","No Error","Low Paper","No Paper","Low Toner","No Toner","Door Open","Jammed","Offline","Service Requested","Output Bin Full"};
	public final static String[] CIM_VALUEMAP_LANGUAGESSUPPORTED = {"Other","Unknown","PCL","HPGL","PJL","PS","PSPrinter","IPDS","PPDS","EscapeP","Epson","DDIF","Interpress","ISO6429","Line Data","MODCA","REGIS","SCS","SPDL","TEK4014","PDS","IGP","CodeV","DSCDSE","WPS","LN03","CCITT","QUIC","CPAP","DecPPL","Simple Text","NPAP","DOC","imPress","Pinwriter","NPDL","NEC201PL","Automatic","Pages","LIPS","TIFF","Diagnostic","CaPSL","EXCL","LCDS","XES","MIME","TIPSI","Prescribe","LinePrinter","IDP","XJCL","PDF","RPDL","IntermecIPL","UBIFingerprint","UBIDirectProtocol","Fujitsu","PCLXL"};
	public final static String[] CIM_VALUEMAP_MARKINGTECHNOLOGY = {"Other","Unknown","Electrophotographic LED","Electrophotographic Laser","Electrophotographic Other","Impact Moving Head Dot Matrix 9pin","Impact Moving Head Dot Matrix 24pin","Impact Moving Head Dot Matrix Other","Impact Moving Head Fully Formed","Impact Band","Impact Other","Inkjet Aqueous","Inkjet Solid","Inkjet Other","Pen","Thermal Transfer","Thermal Sensitive","Thermal Diffusion","Thermal Other","Electroerosion","Electrostatic","Photographic Microfiche","Photographic Imagesetter","Photographic Other","Ion Deposition","eBeam","Typesetter"};
	public final static String[] CIM_VALUEMAP_PAPERSIZESSUPPORTED = {"Unknown","Other","A","B","C","D","E","Letter","Legal","NA-10x13-Envelope","NA-9x12-Envelope","NA-Number-10-Envelope","NA-7x9-Envelope","NA-9x11-Envelope","NA-10x14-Envelope","NA-Number-9-Envelope","NA-6x9-Envelope","NA-10x15-Envelope","A0","A1","A2","A3","A4","A5","A6","A7","A8","A9","A10","B0","B1","B2","B3","B4","B5","B6","B7","B8","B9","B10","C0","C1","C2","C3","C4","C5","C6","C7","C8","ISO-Designated","JIS B0","JIS B1","JIS B2","JIS B3","JIS B4","JIS B5","JIS B6","JIS B7","JIS B8","JIS B9","JIS B10","NA-Letter","NA-Legal","B4-Envelope","B5-Envelope","C3-Envelope","C4-Envelope","C5-Envelope","C6-Envelope","Designated-Long-Envelope","Monarch-Envelope","Executive","Folio","Invoice","Ledger","Quarto"};
	public final static String[] CIM_VALUEMAP_PRINTERSTATUS = {"Other","Unknown","Idle","Printing","Warmup","Stopped Printing","Offline"};
	
	
	public final static int CAPABILITIES_UNKNOWN = 0;
	public final static int CAPABILITIES_OTHER = 1;
	public final static int CAPABILITIES_COLORPRINTING = 2;
	public final static int CAPABILITIES_DUPLEXPRINTING = 3;
	public final static int CAPABILITIES_COPIES = 4;
	public final static int CAPABILITIES_COLLATION = 5;
	public final static int CAPABILITIES_STAPLING = 6;
	public final static int CAPABILITIES_TRANSPARENCYPRINTING = 7;
	public final static int CAPABILITIES_PUNCH = 8;
	public final static int CAPABILITIES_COVER = 9;
	public final static int CAPABILITIES_BIND = 10;
	public final static int CAPABILITIES_BLACKANDWHITEPRINTING = 11;
	public final static int CAPABILITIES_ONESIDED = 12;
	public final static int CAPABILITIES_TWOSIDEDLONGEDGE = 13;
	public final static int CAPABILITIES_TWOSIDEDSHORTEDGE = 14;
	public final static int CAPABILITIES_PORTRAIT = 15;
	public final static int CAPABILITIES_LANDSCAPE = 16;
	public final static int CAPABILITIES_REVERSEPORTRAIT = 17;
	public final static int CAPABILITIES_REVERSELANDSCAPE = 18;
	public final static int CAPABILITIES_QUALITYHIGH = 19;
	public final static int CAPABILITIES_QUALITYNORMAL = 20;
	public final static int CAPABILITIES_QUALITYLOW = 21;
	
	public final static int CURRENTCAPABILITIES_UNKNOWN = 0;
	public final static int CURRENTCAPABILITIES_OTHER = 1;
	public final static int CURRENTCAPABILITIES_COLORPRINTING = 2;
	public final static int CURRENTCAPABILITIES_DUPLEXPRINTING = 3;
	public final static int CURRENTCAPABILITIES_COPIES = 4;
	public final static int CURRENTCAPABILITIES_COLLATION = 5;
	public final static int CURRENTCAPABILITIES_STAPLING = 6;
	public final static int CURRENTCAPABILITIES_TRANSPARENCYPRINTING = 7;
	public final static int CURRENTCAPABILITIES_PUNCH = 8;
	public final static int CURRENTCAPABILITIES_COVER = 9;
	public final static int CURRENTCAPABILITIES_BIND = 10;
	public final static int CURRENTCAPABILITIES_BLACKANDWHITEPRINTING = 11;
	public final static int CURRENTCAPABILITIES_ONESIDED = 12;
	public final static int CURRENTCAPABILITIES_TWOSIDEDLONGEDGE = 13;
	public final static int CURRENTCAPABILITIES_TWOSIDEDSHORTEDGE = 14;
	public final static int CURRENTCAPABILITIES_PORTRAIT = 15;
	public final static int CURRENTCAPABILITIES_LANDSCAPE = 16;
	public final static int CURRENTCAPABILITIES_REVERSEPORTRAIT = 17;
	public final static int CURRENTCAPABILITIES_REVERSELANDSCAPE = 18;
	public final static int CURRENTCAPABILITIES_QUALITYHIGH = 19;
	public final static int CURRENTCAPABILITIES_QUALITYNORMAL = 20;
	public final static int CURRENTCAPABILITIES_QUALITYLOW = 21;
	
	public final static int CURRENTLANGUAGE_OTHER = 1;
	public final static int CURRENTLANGUAGE_UNKNOWN = 2;
	public final static int CURRENTLANGUAGE_PCL = 3;
	public final static int CURRENTLANGUAGE_HPGL = 4;
	public final static int CURRENTLANGUAGE_PJL = 5;
	public final static int CURRENTLANGUAGE_PS = 6;
	public final static int CURRENTLANGUAGE_PSPRINTER = 7;
	public final static int CURRENTLANGUAGE_IPDS = 8;
	public final static int CURRENTLANGUAGE_PPDS = 9;
	public final static int CURRENTLANGUAGE_ESCAPEP = 10;
	public final static int CURRENTLANGUAGE_EPSON = 11;
	public final static int CURRENTLANGUAGE_DDIF = 12;
	public final static int CURRENTLANGUAGE_INTERPRESS = 13;
	public final static int CURRENTLANGUAGE_ISO6429 = 14;
	public final static int CURRENTLANGUAGE_LINEDATA = 15;
	public final static int CURRENTLANGUAGE_MODCA = 16;
	public final static int CURRENTLANGUAGE_REGIS = 17;
	public final static int CURRENTLANGUAGE_SCS = 18;
	public final static int CURRENTLANGUAGE_SPDL = 19;
	public final static int CURRENTLANGUAGE_TEK4014 = 20;
	public final static int CURRENTLANGUAGE_PDS = 21;
	public final static int CURRENTLANGUAGE_IGP = 22;
	public final static int CURRENTLANGUAGE_CODEV = 23;
	public final static int CURRENTLANGUAGE_DSCDSE = 24;
	public final static int CURRENTLANGUAGE_WPS = 25;
	public final static int CURRENTLANGUAGE_LN03 = 26;
	public final static int CURRENTLANGUAGE_CCITT = 27;
	public final static int CURRENTLANGUAGE_QUIC = 28;
	public final static int CURRENTLANGUAGE_CPAP = 29;
	public final static int CURRENTLANGUAGE_DECPPL = 30;
	public final static int CURRENTLANGUAGE_SIMPLETEXT = 31;
	public final static int CURRENTLANGUAGE_NPAP = 32;
	public final static int CURRENTLANGUAGE_DOC = 33;
	public final static int CURRENTLANGUAGE_IMPRESS = 34;
	public final static int CURRENTLANGUAGE_PINWRITER = 35;
	public final static int CURRENTLANGUAGE_NPDL = 36;
	public final static int CURRENTLANGUAGE_NEC201PL = 37;
	public final static int CURRENTLANGUAGE_AUTOMATIC = 38;
	public final static int CURRENTLANGUAGE_PAGES = 39;
	public final static int CURRENTLANGUAGE_LIPS = 40;
	public final static int CURRENTLANGUAGE_TIFF = 41;
	public final static int CURRENTLANGUAGE_DIAGNOSTIC = 42;
	public final static int CURRENTLANGUAGE_CAPSL = 43;
	public final static int CURRENTLANGUAGE_EXCL = 44;
	public final static int CURRENTLANGUAGE_LCDS = 45;
	public final static int CURRENTLANGUAGE_XES = 46;
	public final static int CURRENTLANGUAGE_MIME = 47;
	public final static int CURRENTLANGUAGE_TIPSI = 48;
	public final static int CURRENTLANGUAGE_PRESCRIBE = 50;
	public final static int CURRENTLANGUAGE_LINEPRINTER = 51;
	public final static int CURRENTLANGUAGE_IDP = 52;
	public final static int CURRENTLANGUAGE_XJCL = 53;
	public final static int CURRENTLANGUAGE_PDF = 54;
	public final static int CURRENTLANGUAGE_RPDL = 55;
	public final static int CURRENTLANGUAGE_INTERMECIPL = 56;
	public final static int CURRENTLANGUAGE_UBIFINGERPRINT = 57;
	public final static int CURRENTLANGUAGE_UBIDIRECTPROTOCOL = 58;
	public final static int CURRENTLANGUAGE_FUJITSU = 59;
	public final static int CURRENTLANGUAGE_PCLXL = 60;
	
	public final static int DEFAULTCAPABILITIES_UNKNOWN = 0;
	public final static int DEFAULTCAPABILITIES_OTHER = 1;
	public final static int DEFAULTCAPABILITIES_COLORPRINTING = 2;
	public final static int DEFAULTCAPABILITIES_DUPLEXPRINTING = 3;
	public final static int DEFAULTCAPABILITIES_COPIES = 4;
	public final static int DEFAULTCAPABILITIES_COLLATION = 5;
	public final static int DEFAULTCAPABILITIES_STAPLING = 6;
	public final static int DEFAULTCAPABILITIES_TRANSPARENCYPRINTING = 7;
	public final static int DEFAULTCAPABILITIES_PUNCH = 8;
	public final static int DEFAULTCAPABILITIES_COVER = 9;
	public final static int DEFAULTCAPABILITIES_BIND = 10;
	public final static int DEFAULTCAPABILITIES_BLACKANDWHITEPRINTING = 11;
	public final static int DEFAULTCAPABILITIES_ONESIDED = 12;
	public final static int DEFAULTCAPABILITIES_TWOSIDEDLONGEDGE = 13;
	public final static int DEFAULTCAPABILITIES_TWOSIDEDSHORTEDGE = 14;
	public final static int DEFAULTCAPABILITIES_PORTRAIT = 15;
	public final static int DEFAULTCAPABILITIES_LANDSCAPE = 16;
	public final static int DEFAULTCAPABILITIES_REVERSEPORTRAIT = 17;
	public final static int DEFAULTCAPABILITIES_REVERSELANDSCAPE = 18;
	public final static int DEFAULTCAPABILITIES_QUALITYHIGH = 19;
	public final static int DEFAULTCAPABILITIES_QUALITYNORMAL = 20;
	public final static int DEFAULTCAPABILITIES_QUALITYLOW = 21;
	
	public final static int DEFAULTLANGUAGE_OTHER = 1;
	public final static int DEFAULTLANGUAGE_UNKNOWN = 2;
	public final static int DEFAULTLANGUAGE_PCL = 3;
	public final static int DEFAULTLANGUAGE_HPGL = 4;
	public final static int DEFAULTLANGUAGE_PJL = 5;
	public final static int DEFAULTLANGUAGE_PS = 6;
	public final static int DEFAULTLANGUAGE_PSPRINTER = 7;
	public final static int DEFAULTLANGUAGE_IPDS = 8;
	public final static int DEFAULTLANGUAGE_PPDS = 9;
	public final static int DEFAULTLANGUAGE_ESCAPEP = 10;
	public final static int DEFAULTLANGUAGE_EPSON = 11;
	public final static int DEFAULTLANGUAGE_DDIF = 12;
	public final static int DEFAULTLANGUAGE_INTERPRESS = 13;
	public final static int DEFAULTLANGUAGE_ISO6429 = 14;
	public final static int DEFAULTLANGUAGE_LINEDATA = 15;
	public final static int DEFAULTLANGUAGE_MODCA = 16;
	public final static int DEFAULTLANGUAGE_REGIS = 17;
	public final static int DEFAULTLANGUAGE_SCS = 18;
	public final static int DEFAULTLANGUAGE_SPDL = 19;
	public final static int DEFAULTLANGUAGE_TEK4014 = 20;
	public final static int DEFAULTLANGUAGE_PDS = 21;
	public final static int DEFAULTLANGUAGE_IGP = 22;
	public final static int DEFAULTLANGUAGE_CODEV = 23;
	public final static int DEFAULTLANGUAGE_DSCDSE = 24;
	public final static int DEFAULTLANGUAGE_WPS = 25;
	public final static int DEFAULTLANGUAGE_LN03 = 26;
	public final static int DEFAULTLANGUAGE_CCITT = 27;
	public final static int DEFAULTLANGUAGE_QUIC = 28;
	public final static int DEFAULTLANGUAGE_CPAP = 29;
	public final static int DEFAULTLANGUAGE_DECPPL = 30;
	public final static int DEFAULTLANGUAGE_SIMPLETEXT = 31;
	public final static int DEFAULTLANGUAGE_NPAP = 32;
	public final static int DEFAULTLANGUAGE_DOC = 33;
	public final static int DEFAULTLANGUAGE_IMPRESS = 34;
	public final static int DEFAULTLANGUAGE_PINWRITER = 35;
	public final static int DEFAULTLANGUAGE_NPDL = 36;
	public final static int DEFAULTLANGUAGE_NEC201PL = 37;
	public final static int DEFAULTLANGUAGE_AUTOMATIC = 38;
	public final static int DEFAULTLANGUAGE_PAGES = 39;
	public final static int DEFAULTLANGUAGE_LIPS = 40;
	public final static int DEFAULTLANGUAGE_TIFF = 41;
	public final static int DEFAULTLANGUAGE_DIAGNOSTIC = 42;
	public final static int DEFAULTLANGUAGE_CAPSL = 43;
	public final static int DEFAULTLANGUAGE_EXCL = 44;
	public final static int DEFAULTLANGUAGE_LCDS = 45;
	public final static int DEFAULTLANGUAGE_XES = 46;
	public final static int DEFAULTLANGUAGE_MIME = 47;
	public final static int DEFAULTLANGUAGE_TIPSI = 48;
	public final static int DEFAULTLANGUAGE_PRESCRIBE = 50;
	public final static int DEFAULTLANGUAGE_LINEPRINTER = 51;
	public final static int DEFAULTLANGUAGE_IDP = 52;
	public final static int DEFAULTLANGUAGE_XJCL = 53;
	public final static int DEFAULTLANGUAGE_PDF = 54;
	public final static int DEFAULTLANGUAGE_RPDL = 55;
	public final static int DEFAULTLANGUAGE_INTERMECIPL = 56;
	public final static int DEFAULTLANGUAGE_UBIFINGERPRINT = 57;
	public final static int DEFAULTLANGUAGE_UBIDIRECTPROTOCOL = 58;
	public final static int DEFAULTLANGUAGE_FUJITSU = 59;
	public final static int DEFAULTLANGUAGE_PCLXL = 60;
	
	public final static int DETECTEDERRORSTATE_UNKNOWN = 0;
	public final static int DETECTEDERRORSTATE_OTHER = 1;
	public final static int DETECTEDERRORSTATE_NOERROR = 2;
	public final static int DETECTEDERRORSTATE_LOWPAPER = 3;
	public final static int DETECTEDERRORSTATE_NOPAPER = 4;
	public final static int DETECTEDERRORSTATE_LOWTONER = 5;
	public final static int DETECTEDERRORSTATE_NOTONER = 6;
	public final static int DETECTEDERRORSTATE_DOOROPEN = 7;
	public final static int DETECTEDERRORSTATE_JAMMED = 8;
	public final static int DETECTEDERRORSTATE_OFFLINE = 9;
	public final static int DETECTEDERRORSTATE_SERVICEREQUESTED = 10;
	public final static int DETECTEDERRORSTATE_OUTPUTBINFULL = 11;
	
	public final static int LANGUAGESSUPPORTED_OTHER = 1;
	public final static int LANGUAGESSUPPORTED_UNKNOWN = 2;
	public final static int LANGUAGESSUPPORTED_PCL = 3;
	public final static int LANGUAGESSUPPORTED_HPGL = 4;
	public final static int LANGUAGESSUPPORTED_PJL = 5;
	public final static int LANGUAGESSUPPORTED_PS = 6;
	public final static int LANGUAGESSUPPORTED_PSPRINTER = 7;
	public final static int LANGUAGESSUPPORTED_IPDS = 8;
	public final static int LANGUAGESSUPPORTED_PPDS = 9;
	public final static int LANGUAGESSUPPORTED_ESCAPEP = 10;
	public final static int LANGUAGESSUPPORTED_EPSON = 11;
	public final static int LANGUAGESSUPPORTED_DDIF = 12;
	public final static int LANGUAGESSUPPORTED_INTERPRESS = 13;
	public final static int LANGUAGESSUPPORTED_ISO6429 = 14;
	public final static int LANGUAGESSUPPORTED_LINEDATA = 15;
	public final static int LANGUAGESSUPPORTED_MODCA = 16;
	public final static int LANGUAGESSUPPORTED_REGIS = 17;
	public final static int LANGUAGESSUPPORTED_SCS = 18;
	public final static int LANGUAGESSUPPORTED_SPDL = 19;
	public final static int LANGUAGESSUPPORTED_TEK4014 = 20;
	public final static int LANGUAGESSUPPORTED_PDS = 21;
	public final static int LANGUAGESSUPPORTED_IGP = 22;
	public final static int LANGUAGESSUPPORTED_CODEV = 23;
	public final static int LANGUAGESSUPPORTED_DSCDSE = 24;
	public final static int LANGUAGESSUPPORTED_WPS = 25;
	public final static int LANGUAGESSUPPORTED_LN03 = 26;
	public final static int LANGUAGESSUPPORTED_CCITT = 27;
	public final static int LANGUAGESSUPPORTED_QUIC = 28;
	public final static int LANGUAGESSUPPORTED_CPAP = 29;
	public final static int LANGUAGESSUPPORTED_DECPPL = 30;
	public final static int LANGUAGESSUPPORTED_SIMPLETEXT = 31;
	public final static int LANGUAGESSUPPORTED_NPAP = 32;
	public final static int LANGUAGESSUPPORTED_DOC = 33;
	public final static int LANGUAGESSUPPORTED_IMPRESS = 34;
	public final static int LANGUAGESSUPPORTED_PINWRITER = 35;
	public final static int LANGUAGESSUPPORTED_NPDL = 36;
	public final static int LANGUAGESSUPPORTED_NEC201PL = 37;
	public final static int LANGUAGESSUPPORTED_AUTOMATIC = 38;
	public final static int LANGUAGESSUPPORTED_PAGES = 39;
	public final static int LANGUAGESSUPPORTED_LIPS = 40;
	public final static int LANGUAGESSUPPORTED_TIFF = 41;
	public final static int LANGUAGESSUPPORTED_DIAGNOSTIC = 42;
	public final static int LANGUAGESSUPPORTED_CAPSL = 43;
	public final static int LANGUAGESSUPPORTED_EXCL = 44;
	public final static int LANGUAGESSUPPORTED_LCDS = 45;
	public final static int LANGUAGESSUPPORTED_XES = 46;
	public final static int LANGUAGESSUPPORTED_MIME = 47;
	public final static int LANGUAGESSUPPORTED_TIPSI = 48;
	public final static int LANGUAGESSUPPORTED_PRESCRIBE = 50;
	public final static int LANGUAGESSUPPORTED_LINEPRINTER = 51;
	public final static int LANGUAGESSUPPORTED_IDP = 52;
	public final static int LANGUAGESSUPPORTED_XJCL = 53;
	public final static int LANGUAGESSUPPORTED_PDF = 54;
	public final static int LANGUAGESSUPPORTED_RPDL = 55;
	public final static int LANGUAGESSUPPORTED_INTERMECIPL = 56;
	public final static int LANGUAGESSUPPORTED_UBIFINGERPRINT = 57;
	public final static int LANGUAGESSUPPORTED_UBIDIRECTPROTOCOL = 58;
	public final static int LANGUAGESSUPPORTED_FUJITSU = 59;
	public final static int LANGUAGESSUPPORTED_PCLXL = 60;
	
	public final static int MARKINGTECHNOLOGY_OTHER = 1;
	public final static int MARKINGTECHNOLOGY_UNKNOWN = 2;
	public final static int MARKINGTECHNOLOGY_ELECTROPHOTOGRAPHICLED = 3;
	public final static int MARKINGTECHNOLOGY_ELECTROPHOTOGRAPHICLASER = 4;
	public final static int MARKINGTECHNOLOGY_ELECTROPHOTOGRAPHICOTHER = 5;
	public final static int MARKINGTECHNOLOGY_IMPACTMOVINGHEADDOTMATRIX9PIN = 6;
	public final static int MARKINGTECHNOLOGY_IMPACTMOVINGHEADDOTMATRIX24PIN = 7;
	public final static int MARKINGTECHNOLOGY_IMPACTMOVINGHEADDOTMATRIXOTHER = 8;
	public final static int MARKINGTECHNOLOGY_IMPACTMOVINGHEADFULLYFORMED = 9;
	public final static int MARKINGTECHNOLOGY_IMPACTBAND = 10;
	public final static int MARKINGTECHNOLOGY_IMPACTOTHER = 11;
	public final static int MARKINGTECHNOLOGY_INKJETAQUEOUS = 12;
	public final static int MARKINGTECHNOLOGY_INKJETSOLID = 13;
	public final static int MARKINGTECHNOLOGY_INKJETOTHER = 14;
	public final static int MARKINGTECHNOLOGY_PEN = 15;
	public final static int MARKINGTECHNOLOGY_THERMALTRANSFER = 16;
	public final static int MARKINGTECHNOLOGY_THERMALSENSITIVE = 17;
	public final static int MARKINGTECHNOLOGY_THERMALDIFFUSION = 18;
	public final static int MARKINGTECHNOLOGY_THERMALOTHER = 19;
	public final static int MARKINGTECHNOLOGY_ELECTROEROSION = 20;
	public final static int MARKINGTECHNOLOGY_ELECTROSTATIC = 21;
	public final static int MARKINGTECHNOLOGY_PHOTOGRAPHICMICROFICHE = 22;
	public final static int MARKINGTECHNOLOGY_PHOTOGRAPHICIMAGESETTER = 23;
	public final static int MARKINGTECHNOLOGY_PHOTOGRAPHICOTHER = 24;
	public final static int MARKINGTECHNOLOGY_IONDEPOSITION = 25;
	public final static int MARKINGTECHNOLOGY_EBEAM = 26;
	public final static int MARKINGTECHNOLOGY_TYPESETTER = 27;
	
	public final static int PAPERSIZESSUPPORTED_UNKNOWN = 0;
	public final static int PAPERSIZESSUPPORTED_OTHER = 1;
	public final static int PAPERSIZESSUPPORTED_A = 2;
	public final static int PAPERSIZESSUPPORTED_B = 3;
	public final static int PAPERSIZESSUPPORTED_C = 4;
	public final static int PAPERSIZESSUPPORTED_D = 5;
	public final static int PAPERSIZESSUPPORTED_E = 6;
	public final static int PAPERSIZESSUPPORTED_LETTER = 7;
	public final static int PAPERSIZESSUPPORTED_LEGAL = 8;
	public final static int PAPERSIZESSUPPORTED_NA_10X13_ENVELOPE = 9;
	public final static int PAPERSIZESSUPPORTED_NA_9X12_ENVELOPE = 10;
	public final static int PAPERSIZESSUPPORTED_NA_NUMBER_10_ENVELOPE = 11;
	public final static int PAPERSIZESSUPPORTED_NA_7X9_ENVELOPE = 12;
	public final static int PAPERSIZESSUPPORTED_NA_9X11_ENVELOPE = 13;
	public final static int PAPERSIZESSUPPORTED_NA_10X14_ENVELOPE = 14;
	public final static int PAPERSIZESSUPPORTED_NA_NUMBER_9_ENVELOPE = 15;
	public final static int PAPERSIZESSUPPORTED_NA_6X9_ENVELOPE = 16;
	public final static int PAPERSIZESSUPPORTED_NA_10X15_ENVELOPE = 17;
	public final static int PAPERSIZESSUPPORTED_A0 = 18;
	public final static int PAPERSIZESSUPPORTED_A1 = 19;
	public final static int PAPERSIZESSUPPORTED_A2 = 20;
	public final static int PAPERSIZESSUPPORTED_A3 = 21;
	public final static int PAPERSIZESSUPPORTED_A4 = 22;
	public final static int PAPERSIZESSUPPORTED_A5 = 23;
	public final static int PAPERSIZESSUPPORTED_A6 = 24;
	public final static int PAPERSIZESSUPPORTED_A7 = 25;
	public final static int PAPERSIZESSUPPORTED_A8 = 26;
	public final static int PAPERSIZESSUPPORTED_A9 = 27;
	public final static int PAPERSIZESSUPPORTED_A10 = 28;
	public final static int PAPERSIZESSUPPORTED_B0 = 29;
	public final static int PAPERSIZESSUPPORTED_B1 = 30;
	public final static int PAPERSIZESSUPPORTED_B2 = 31;
	public final static int PAPERSIZESSUPPORTED_B3 = 32;
	public final static int PAPERSIZESSUPPORTED_B4 = 33;
	public final static int PAPERSIZESSUPPORTED_B5 = 34;
	public final static int PAPERSIZESSUPPORTED_B6 = 35;
	public final static int PAPERSIZESSUPPORTED_B7 = 36;
	public final static int PAPERSIZESSUPPORTED_B8 = 37;
	public final static int PAPERSIZESSUPPORTED_B9 = 38;
	public final static int PAPERSIZESSUPPORTED_B10 = 39;
	public final static int PAPERSIZESSUPPORTED_C0 = 40;
	public final static int PAPERSIZESSUPPORTED_C1 = 41;
	public final static int PAPERSIZESSUPPORTED_C2 = 42;
	public final static int PAPERSIZESSUPPORTED_C3 = 43;
	public final static int PAPERSIZESSUPPORTED_C4 = 44;
	public final static int PAPERSIZESSUPPORTED_C5 = 45;
	public final static int PAPERSIZESSUPPORTED_C6 = 46;
	public final static int PAPERSIZESSUPPORTED_C7 = 47;
	public final static int PAPERSIZESSUPPORTED_C8 = 48;
	public final static int PAPERSIZESSUPPORTED_ISO_DESIGNATED = 49;
	public final static int PAPERSIZESSUPPORTED_JISB0 = 50;
	public final static int PAPERSIZESSUPPORTED_JISB1 = 51;
	public final static int PAPERSIZESSUPPORTED_JISB2 = 52;
	public final static int PAPERSIZESSUPPORTED_JISB3 = 53;
	public final static int PAPERSIZESSUPPORTED_JISB4 = 54;
	public final static int PAPERSIZESSUPPORTED_JISB5 = 55;
	public final static int PAPERSIZESSUPPORTED_JISB6 = 56;
	public final static int PAPERSIZESSUPPORTED_JISB7 = 57;
	public final static int PAPERSIZESSUPPORTED_JISB8 = 58;
	public final static int PAPERSIZESSUPPORTED_JISB9 = 59;
	public final static int PAPERSIZESSUPPORTED_JISB10 = 60;
	public final static int PAPERSIZESSUPPORTED_NA_LETTER = 61;
	public final static int PAPERSIZESSUPPORTED_NA_LEGAL = 62;
	public final static int PAPERSIZESSUPPORTED_B4_ENVELOPE = 63;
	public final static int PAPERSIZESSUPPORTED_B5_ENVELOPE = 64;
	public final static int PAPERSIZESSUPPORTED_C3_ENVELOPE = 65;
	public final static int PAPERSIZESSUPPORTED_C4_ENVELOPE = 66;
	public final static int PAPERSIZESSUPPORTED_C5_ENVELOPE = 67;
	public final static int PAPERSIZESSUPPORTED_C6_ENVELOPE = 68;
	public final static int PAPERSIZESSUPPORTED_DESIGNATED_LONG_ENVELOPE = 69;
	public final static int PAPERSIZESSUPPORTED_MONARCH_ENVELOPE = 70;
	public final static int PAPERSIZESSUPPORTED_EXECUTIVE = 71;
	public final static int PAPERSIZESSUPPORTED_FOLIO = 72;
	public final static int PAPERSIZESSUPPORTED_INVOICE = 73;
	public final static int PAPERSIZESSUPPORTED_LEDGER = 74;
	public final static int PAPERSIZESSUPPORTED_QUARTO = 75;
	
	public final static int PRINTERSTATUS_OTHER = 1;
	public final static int PRINTERSTATUS_UNKNOWN = 2;
	public final static int PRINTERSTATUS_IDLE = 3;
	public final static int PRINTERSTATUS_PRINTING = 4;
	public final static int PRINTERSTATUS_WARMUP = 5;
	public final static int PRINTERSTATUS_STOPPEDPRINTING = 6;
	public final static int PRINTERSTATUS_OFFLINE = 7;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_Printer() {

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
	public CIM_Printer(Vector keyProperties){ 
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
	public CIM_Printer(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		return result;
	}
	
	/**
	 * @return Returns the validCimInstance.
	 */
	public boolean isValidCimInstance() {
		return validCimInstance;
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
	    
	    if (!(object instanceof CIM_Printer)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_Printer)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_Printer)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_Printer)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_Printer)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_Printer)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_Printer)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_Printer)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_Printer)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_Printer)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_PrintJob_CIM_PrinterServicingJobs(CIMClient cimClient,
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
					CIM_PrintJob.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_Printer.Java_Package_List.size(); i++) {
						if (!((String)(CIM_Printer.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_Printer.Java_Package_List.get(i))).endsWith(".")) {
							CIM_Printer.Java_Package_List.setElementAt((String)(CIM_Printer.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_Printer.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_PrintJob(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_PrintJob(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_PrintJob(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_PrintJob_CIM_PrinterServicingJob_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_PRINTERSERVICINGJOB, 
					CIM_PrintJob.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_PrintJob.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_PrintQueue_CIM_PrinterServicingQueues(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_PRINTERSERVICINGQUEUE, 
					CIM_PrintQueue.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_Printer.Java_Package_List.size(); i++) {
						if (!((String)(CIM_Printer.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_Printer.Java_Package_List.get(i))).endsWith(".")) {
							CIM_Printer.Java_Package_List.setElementAt((String)(CIM_Printer.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_Printer.Java_Package_List.get(i)) + cimClassName;

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

	public ArrayList getAssociated_CIM_PrintQueue_CIM_PrinterServicingQueue_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_PRINTERSERVICINGQUEUE, 
					CIM_PrintQueue.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent");
		
		
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

	
	
	//*****************************************************
	// Attribute methods
	//*****************************************************
	
	// Attribute AvailableJobSheets
	
	public String[] get_AvailableJobSheets() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_AVAILABLEJOBSHEETS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_AVAILABLEJOBSHEETS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_AVAILABLEJOBSHEETS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_AvailableJobSheets(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_AVAILABLEJOBSHEETS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_AVAILABLEJOBSHEETS + " could not be found");
    		
		} else if (!CIM_PrinterHelper.isValid_AvailableJobSheets(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Printer.CIM_PROPERTY_AVAILABLEJOBSHEETS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_AVAILABLEJOBSHEETS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Capabilities
	
	public UnsignedInt16[] get_Capabilities() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_CAPABILITIES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_CAPABILITIES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_CAPABILITIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_Capabilities(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_CAPABILITIES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_CAPABILITIES + " could not be found");
    		
		} else if (!CIM_PrinterHelper.isValid_Capabilities(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Printer.CIM_PROPERTY_CAPABILITIES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_CAPABILITIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CapabilityDescriptions
	
	public String[] get_CapabilityDescriptions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_CAPABILITYDESCRIPTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_CAPABILITYDESCRIPTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_CAPABILITYDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_CapabilityDescriptions(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_CAPABILITYDESCRIPTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_CAPABILITYDESCRIPTIONS + " could not be found");
    		
		} else if (!CIM_PrinterHelper.isValid_CapabilityDescriptions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Printer.CIM_PROPERTY_CAPABILITYDESCRIPTIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_CAPABILITYDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CharSetsSupported
	
	public String[] get_CharSetsSupported() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_CHARSETSSUPPORTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_CHARSETSSUPPORTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_CHARSETSSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_CharSetsSupported(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_CHARSETSSUPPORTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_CHARSETSSUPPORTED + " could not be found");
    		
		} else if (!CIM_PrinterHelper.isValid_CharSetsSupported(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Printer.CIM_PROPERTY_CHARSETSSUPPORTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_CHARSETSSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CurrentCapabilities
	
	public UnsignedInt16[] get_CurrentCapabilities() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_CURRENTCAPABILITIES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_CURRENTCAPABILITIES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_CURRENTCAPABILITIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_CurrentCapabilities(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_CURRENTCAPABILITIES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_CURRENTCAPABILITIES + " could not be found");
    		
		} else if (!CIM_PrinterHelper.isValid_CurrentCapabilities(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Printer.CIM_PROPERTY_CURRENTCAPABILITIES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_CURRENTCAPABILITIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CurrentCharSet
	
	public String get_CurrentCharSet() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_CURRENTCHARSET);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_CURRENTCHARSET + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_CURRENTCHARSET + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CurrentCharSet(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_CURRENTCHARSET);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_CURRENTCHARSET + " could not be found");
    		
		} else if (!CIM_PrinterHelper.isValid_CurrentCharSet(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Printer.CIM_PROPERTY_CURRENTCHARSET);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_CURRENTCHARSET + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CurrentLanguage
	
	public UnsignedInt16 get_CurrentLanguage() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_CURRENTLANGUAGE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_CURRENTLANGUAGE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_CURRENTLANGUAGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CurrentLanguage(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_CURRENTLANGUAGE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_CURRENTLANGUAGE + " could not be found");
    		
		} else if (!CIM_PrinterHelper.isValid_CurrentLanguage(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Printer.CIM_PROPERTY_CURRENTLANGUAGE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_CURRENTLANGUAGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CurrentMimeType
	
	public String get_CurrentMimeType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_CURRENTMIMETYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_CURRENTMIMETYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_CURRENTMIMETYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CurrentMimeType(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_CURRENTMIMETYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_CURRENTMIMETYPE + " could not be found");
    		
		} else if (!CIM_PrinterHelper.isValid_CurrentMimeType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Printer.CIM_PROPERTY_CURRENTMIMETYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_CURRENTMIMETYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CurrentNaturalLanguage
	
	public String get_CurrentNaturalLanguage() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_CURRENTNATURALLANGUAGE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_CURRENTNATURALLANGUAGE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_CURRENTNATURALLANGUAGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CurrentNaturalLanguage(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_CURRENTNATURALLANGUAGE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_CURRENTNATURALLANGUAGE + " could not be found");
    		
		} else if (!CIM_PrinterHelper.isValid_CurrentNaturalLanguage(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Printer.CIM_PROPERTY_CURRENTNATURALLANGUAGE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_CURRENTNATURALLANGUAGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CurrentPaperType
	
	public String get_CurrentPaperType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_CURRENTPAPERTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_CURRENTPAPERTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_CURRENTPAPERTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CurrentPaperType(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_CURRENTPAPERTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_CURRENTPAPERTYPE + " could not be found");
    		
		} else if (!CIM_PrinterHelper.isValid_CurrentPaperType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Printer.CIM_PROPERTY_CURRENTPAPERTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_CURRENTPAPERTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DefaultCapabilities
	
	public UnsignedInt16[] get_DefaultCapabilities() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_DEFAULTCAPABILITIES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_DEFAULTCAPABILITIES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_DEFAULTCAPABILITIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_DefaultCapabilities(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_DEFAULTCAPABILITIES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_DEFAULTCAPABILITIES + " could not be found");
    		
		} else if (!CIM_PrinterHelper.isValid_DefaultCapabilities(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Printer.CIM_PROPERTY_DEFAULTCAPABILITIES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_DEFAULTCAPABILITIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DefaultCopies
	
	public UnsignedInt32 get_DefaultCopies() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_DEFAULTCOPIES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_DEFAULTCOPIES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_DEFAULTCOPIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DefaultCopies(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_DEFAULTCOPIES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_DEFAULTCOPIES + " could not be found");
    		
		} else if (!CIM_PrinterHelper.isValid_DefaultCopies(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Printer.CIM_PROPERTY_DEFAULTCOPIES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_DEFAULTCOPIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DefaultLanguage
	
	public UnsignedInt16 get_DefaultLanguage() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_DEFAULTLANGUAGE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_DEFAULTLANGUAGE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_DEFAULTLANGUAGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DefaultLanguage(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_DEFAULTLANGUAGE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_DEFAULTLANGUAGE + " could not be found");
    		
		} else if (!CIM_PrinterHelper.isValid_DefaultLanguage(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Printer.CIM_PROPERTY_DEFAULTLANGUAGE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_DEFAULTLANGUAGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DefaultMimeType
	
	public String get_DefaultMimeType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_DEFAULTMIMETYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_DEFAULTMIMETYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_DEFAULTMIMETYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DefaultMimeType(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_DEFAULTMIMETYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_DEFAULTMIMETYPE + " could not be found");
    		
		} else if (!CIM_PrinterHelper.isValid_DefaultMimeType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Printer.CIM_PROPERTY_DEFAULTMIMETYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_DEFAULTMIMETYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DefaultNumberUp
	
	public UnsignedInt32 get_DefaultNumberUp() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_DEFAULTNUMBERUP);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_DEFAULTNUMBERUP + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_DEFAULTNUMBERUP + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DefaultNumberUp(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_DEFAULTNUMBERUP);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_DEFAULTNUMBERUP + " could not be found");
    		
		} else if (!CIM_PrinterHelper.isValid_DefaultNumberUp(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Printer.CIM_PROPERTY_DEFAULTNUMBERUP);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_DEFAULTNUMBERUP + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DefaultPaperType
	
	public String get_DefaultPaperType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_DEFAULTPAPERTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_DEFAULTPAPERTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_DEFAULTPAPERTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DefaultPaperType(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_DEFAULTPAPERTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_DEFAULTPAPERTYPE + " could not be found");
    		
		} else if (!CIM_PrinterHelper.isValid_DefaultPaperType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Printer.CIM_PROPERTY_DEFAULTPAPERTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_DEFAULTPAPERTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DetectedErrorState
	
	public UnsignedInt16 get_DetectedErrorState() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_DETECTEDERRORSTATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_DETECTEDERRORSTATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_DETECTEDERRORSTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DetectedErrorState(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_DETECTEDERRORSTATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_DETECTEDERRORSTATE + " could not be found");
    		
		} else if (!CIM_PrinterHelper.isValid_DetectedErrorState(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Printer.CIM_PROPERTY_DETECTEDERRORSTATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_DETECTEDERRORSTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ErrorInformation
	
	public String[] get_ErrorInformation() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_ERRORINFORMATION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_ERRORINFORMATION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_ERRORINFORMATION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_ErrorInformation(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_ERRORINFORMATION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_ERRORINFORMATION + " could not be found");
    		
		} else if (!CIM_PrinterHelper.isValid_ErrorInformation(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Printer.CIM_PROPERTY_ERRORINFORMATION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_ERRORINFORMATION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute HorizontalResolution
	
	public UnsignedInt32 get_HorizontalResolution() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_HORIZONTALRESOLUTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_HORIZONTALRESOLUTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_HORIZONTALRESOLUTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_HorizontalResolution(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_HORIZONTALRESOLUTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_HORIZONTALRESOLUTION + " could not be found");
    		
		} else if (!CIM_PrinterHelper.isValid_HorizontalResolution(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Printer.CIM_PROPERTY_HORIZONTALRESOLUTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_HORIZONTALRESOLUTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute JobCountSinceLastReset
	
	public UnsignedInt32 get_JobCountSinceLastReset() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_JOBCOUNTSINCELASTRESET);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_JOBCOUNTSINCELASTRESET + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_JOBCOUNTSINCELASTRESET + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_JobCountSinceLastReset(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_JOBCOUNTSINCELASTRESET);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_JOBCOUNTSINCELASTRESET + " could not be found");
    		
		} else if (!CIM_PrinterHelper.isValid_JobCountSinceLastReset(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Printer.CIM_PROPERTY_JOBCOUNTSINCELASTRESET);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_JOBCOUNTSINCELASTRESET + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LanguagesSupported
	
	public UnsignedInt16[] get_LanguagesSupported() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_LANGUAGESSUPPORTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_LANGUAGESSUPPORTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_LANGUAGESSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_LanguagesSupported(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_LANGUAGESSUPPORTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_LANGUAGESSUPPORTED + " could not be found");
    		
		} else if (!CIM_PrinterHelper.isValid_LanguagesSupported(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Printer.CIM_PROPERTY_LANGUAGESSUPPORTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_LANGUAGESSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MarkingTechnology
	
	public UnsignedInt16 get_MarkingTechnology() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_MARKINGTECHNOLOGY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_MARKINGTECHNOLOGY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_MARKINGTECHNOLOGY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MarkingTechnology(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_MARKINGTECHNOLOGY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_MARKINGTECHNOLOGY + " could not be found");
    		
		} else if (!CIM_PrinterHelper.isValid_MarkingTechnology(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Printer.CIM_PROPERTY_MARKINGTECHNOLOGY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_MARKINGTECHNOLOGY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxCopies
	
	public UnsignedInt32 get_MaxCopies() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_MAXCOPIES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_MAXCOPIES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_MAXCOPIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxCopies(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_MAXCOPIES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_MAXCOPIES + " could not be found");
    		
		} else if (!CIM_PrinterHelper.isValid_MaxCopies(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Printer.CIM_PROPERTY_MAXCOPIES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_MAXCOPIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxNumberUp
	
	public UnsignedInt32 get_MaxNumberUp() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_MAXNUMBERUP);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_MAXNUMBERUP + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_MAXNUMBERUP + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxNumberUp(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_MAXNUMBERUP);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_MAXNUMBERUP + " could not be found");
    		
		} else if (!CIM_PrinterHelper.isValid_MaxNumberUp(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Printer.CIM_PROPERTY_MAXNUMBERUP);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_MAXNUMBERUP + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxSizeSupported
	
	public UnsignedInt32 get_MaxSizeSupported() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_MAXSIZESUPPORTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_MAXSIZESUPPORTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_MAXSIZESUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxSizeSupported(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_MAXSIZESUPPORTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_MAXSIZESUPPORTED + " could not be found");
    		
		} else if (!CIM_PrinterHelper.isValid_MaxSizeSupported(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Printer.CIM_PROPERTY_MAXSIZESUPPORTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_MAXSIZESUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MimeTypesSupported
	
	public String[] get_MimeTypesSupported() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_MIMETYPESSUPPORTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_MIMETYPESSUPPORTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_MIMETYPESSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_MimeTypesSupported(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_MIMETYPESSUPPORTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_MIMETYPESSUPPORTED + " could not be found");
    		
		} else if (!CIM_PrinterHelper.isValid_MimeTypesSupported(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Printer.CIM_PROPERTY_MIMETYPESSUPPORTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_MIMETYPESSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute NaturalLanguagesSupported
	
	public String[] get_NaturalLanguagesSupported() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_NATURALLANGUAGESSUPPORTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_NATURALLANGUAGESSUPPORTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_NATURALLANGUAGESSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_NaturalLanguagesSupported(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_NATURALLANGUAGESSUPPORTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_NATURALLANGUAGESSUPPORTED + " could not be found");
    		
		} else if (!CIM_PrinterHelper.isValid_NaturalLanguagesSupported(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Printer.CIM_PROPERTY_NATURALLANGUAGESSUPPORTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_NATURALLANGUAGESSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PaperSizesSupported
	
	public UnsignedInt16[] get_PaperSizesSupported() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_PAPERSIZESSUPPORTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_PAPERSIZESSUPPORTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_PAPERSIZESSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_PaperSizesSupported(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_PAPERSIZESSUPPORTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_PAPERSIZESSUPPORTED + " could not be found");
    		
		} else if (!CIM_PrinterHelper.isValid_PaperSizesSupported(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Printer.CIM_PROPERTY_PAPERSIZESSUPPORTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_PAPERSIZESSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PaperTypesAvailable
	
	public String[] get_PaperTypesAvailable() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_PAPERTYPESAVAILABLE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_PAPERTYPESAVAILABLE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_PAPERTYPESAVAILABLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_PaperTypesAvailable(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_PAPERTYPESAVAILABLE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_PAPERTYPESAVAILABLE + " could not be found");
    		
		} else if (!CIM_PrinterHelper.isValid_PaperTypesAvailable(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Printer.CIM_PROPERTY_PAPERTYPESAVAILABLE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_PAPERTYPESAVAILABLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PrinterStatus
	
	public UnsignedInt16 get_PrinterStatus() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_PRINTERSTATUS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_PRINTERSTATUS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_PRINTERSTATUS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PrinterStatus(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_PRINTERSTATUS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_PRINTERSTATUS + " could not be found");
    		
		} else if (!CIM_PrinterHelper.isValid_PrinterStatus(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Printer.CIM_PROPERTY_PRINTERSTATUS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_PRINTERSTATUS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TimeOfLastReset
	
	public Calendar get_TimeOfLastReset() {

		CIMProperty property = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_TIMEOFLASTRESET);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_TIMEOFLASTRESET + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_TIMEOFLASTRESET + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_TimeOfLastReset(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_TIMEOFLASTRESET);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_TIMEOFLASTRESET + " could not be found");
    		
		} else if (!CIM_PrinterHelper.isValid_TimeOfLastReset(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Printer.CIM_PROPERTY_TIMEOFLASTRESET);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_TIMEOFLASTRESET + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	// Attribute VerticalResolution
	
	public UnsignedInt32 get_VerticalResolution() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_VERTICALRESOLUTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_VERTICALRESOLUTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_VERTICALRESOLUTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_VerticalResolution(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Printer.CIM_PROPERTY_VERTICALRESOLUTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Printer.CIM_PROPERTY_VERTICALRESOLUTION + " could not be found");
    		
		} else if (!CIM_PrinterHelper.isValid_VerticalResolution(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Printer.CIM_PROPERTY_VERTICALRESOLUTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Printer.CIM_PROPERTY_VERTICALRESOLUTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
