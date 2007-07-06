/** 
 * CIM_UnixProcessStatisticalInformation.java
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
 * Description:  The statistics associated with a Unix process.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import org.sblim.wbem.cim.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.lang.reflect.Constructor;
import org.sblim.wbem.client.*;



/**
 *  The statistics associated with a Unix process.
 */
public class CIM_UnixProcessStatisticalInformation extends CIM_StatisticalInformation  {
	
	public final static String CIM_CLASS_NAME = "CIM_UnixProcessStatisticalInformation"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_UNIXPROCESSSTATISTICS = "CIM_UnixProcessStatistics"; //$NON-NLS-1$
	
	
	/**
	*	A string used to identify the related statistics of a Process. This key allows multiple instances of statistics to correspond to a single process. The multiple instances could be used in applications such as time-sliced statistics.
	*/
	public final static String CIM_PROPERTY_CPUTIME = "CPUTime"; //$NON-NLS-1$
	/**
	*	The scoping Process's ComputerSystem CreationClassName.
	*/
	public final static String CIM_PROPERTY_CSCREATIONCLASSNAME = "CSCreationClassName"; //$NON-NLS-1$
	/**
	*	The scoping Process's ComputerSystem Name.
	*/
	public final static String CIM_PROPERTY_CSNAME = "CSName"; //$NON-NLS-1$
	/**
	*	CPU time of terminated child processes in clock ticks.
	*/
	public final static String CIM_PROPERTY_CPUTIMEDEADCHILDREN = "CpuTimeDeadChildren"; //$NON-NLS-1$
	/**
	*	The scoping Process's Handle.
	*/
	public final static String CIM_PROPERTY_HANDLE = "Handle"; //$NON-NLS-1$
	/**
	*	A string used to identify the related statistics of a Process.
	*/
	public final static String CIM_PROPERTY_NAME = "Name"; //$NON-NLS-1$
	/**
	*	The scoping Process's OperatingSystem CreationClassName.
	*/
	public final static String CIM_PROPERTY_OSCREATIONCLASSNAME = "OSCreationClassName"; //$NON-NLS-1$
	/**
	*	The scoping Process's OperatingSystem Name.
	*/
	public final static String CIM_PROPERTY_OSNAME = "OSName"; //$NON-NLS-1$
	/**
	*	The scoping Process's CreationClassName.
	*/
	public final static String CIM_PROPERTY_PROCESSCREATIONCLASSNAME = "ProcessCreationClassName"; //$NON-NLS-1$
	/**
	*	The number of KiloBytes of real data space used by the process.
	*/
	public final static String CIM_PROPERTY_REALDATA = "RealData"; //$NON-NLS-1$
	/**
	*	The number of KiloBytes of real stack space used by the process.
	*/
	public final static String CIM_PROPERTY_REALSTACK = "RealStack"; //$NON-NLS-1$
	/**
	*	The number of KiloBytes of real text space used by the process.
	*/
	public final static String CIM_PROPERTY_REALTEXT = "RealText"; //$NON-NLS-1$
	/**
	*	System time of terminated child processes in clock ticks.
	*/
	public final static String CIM_PROPERTY_SYSTEMTIMEDEADCHILDREN = "SystemTimeDeadChildren"; //$NON-NLS-1$
	/**
	*	The number of KiloBytes of virtual data space used by the process.
	*/
	public final static String CIM_PROPERTY_VIRTUALDATA = "VirtualData"; //$NON-NLS-1$
	/**
	*	The number of KiloBytes of virtual space used for memory mapped files by the process.
	*/
	public final static String CIM_PROPERTY_VIRTUALMEMORYMAPPEDFILESIZE = "VirtualMemoryMappedFileSize"; //$NON-NLS-1$
	/**
	*	The number of KiloBytes of shared memory used by the process.
	*/
	public final static String CIM_PROPERTY_VIRTUALSHAREDMEMORY = "VirtualSharedMemory"; //$NON-NLS-1$
	/**
	*	The number of KiloBytes of virtual stack space used by the process.
	*/
	public final static String CIM_PROPERTY_VIRTUALSTACK = "VirtualStack"; //$NON-NLS-1$
	/**
	*	The number of KiloBytes of virtual text space used by the process.
	*/
	public final static String CIM_PROPERTY_VIRTUALTEXT = "VirtualText"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	private static Set Java_Package_List 		= new HashSet();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CPUTIME);
		CIM_PropertyNameList.add(CIM_PROPERTY_CSCREATIONCLASSNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_CSNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_CPUTIMEDEADCHILDREN);
		CIM_PropertyNameList.add(CIM_PROPERTY_HANDLE);
		CIM_PropertyNameList.add(CIM_PROPERTY_NAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_OSCREATIONCLASSNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_OSNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_PROCESSCREATIONCLASSNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_REALDATA);
		CIM_PropertyNameList.add(CIM_PROPERTY_REALSTACK);
		CIM_PropertyNameList.add(CIM_PROPERTY_REALTEXT);
		CIM_PropertyNameList.add(CIM_PROPERTY_SYSTEMTIMEDEADCHILDREN);
		CIM_PropertyNameList.add(CIM_PROPERTY_VIRTUALDATA);
		CIM_PropertyNameList.add(CIM_PROPERTY_VIRTUALMEMORYMAPPEDFILESIZE);
		CIM_PropertyNameList.add(CIM_PROPERTY_VIRTUALSHAREDMEMORY);
		CIM_PropertyNameList.add(CIM_PROPERTY_VIRTUALSTACK);
		CIM_PropertyNameList.add(CIM_PROPERTY_VIRTUALTEXT);
				
		for (int i = 0; i < CIM_StatisticalInformation.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_StatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CPUTIME)||
				((String)CIM_StatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CSCREATIONCLASSNAME)||
				((String)CIM_StatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CSNAME)||
				((String)CIM_StatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CPUTIMEDEADCHILDREN)||
				((String)CIM_StatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_HANDLE)||
				((String)CIM_StatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NAME)||
				((String)CIM_StatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OSCREATIONCLASSNAME)||
				((String)CIM_StatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OSNAME)||
				((String)CIM_StatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PROCESSCREATIONCLASSNAME)||
				((String)CIM_StatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REALDATA)||
				((String)CIM_StatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REALSTACK)||
				((String)CIM_StatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REALTEXT)||
				((String)CIM_StatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SYSTEMTIMEDEADCHILDREN)||
				((String)CIM_StatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_VIRTUALDATA)||
				((String)CIM_StatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_VIRTUALMEMORYMAPPEDFILESIZE)||
				((String)CIM_StatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_VIRTUALSHAREDMEMORY)||
				((String)CIM_StatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_VIRTUALSTACK)||
				((String)CIM_StatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_VIRTUALTEXT)){
				continue;
			}
			
			CIM_UnixProcessStatisticalInformation.CIM_PropertyNameList.add(CIM_StatisticalInformation.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CPUTIME, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CSCREATIONCLASSNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CSNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CPUTIMEDEADCHILDREN, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HANDLE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OSCREATIONCLASSNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OSNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PROCESSCREATIONCLASSNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REALDATA, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REALSTACK, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REALTEXT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SYSTEMTIMEDEADCHILDREN, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_VIRTUALDATA, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_VIRTUALMEMORYMAPPEDFILESIZE, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_VIRTUALSHAREDMEMORY, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_VIRTUALSTACK, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_VIRTUALTEXT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
				
		for (int i = 0; i < CIM_StatisticalInformation.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_StatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CPUTIME)||
				((CIMProperty)CIM_StatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CSCREATIONCLASSNAME)||
				((CIMProperty)CIM_StatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CSNAME)||
				((CIMProperty)CIM_StatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CPUTIMEDEADCHILDREN)||
				((CIMProperty)CIM_StatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_HANDLE)||
				((CIMProperty)CIM_StatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NAME)||
				((CIMProperty)CIM_StatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OSCREATIONCLASSNAME)||
				((CIMProperty)CIM_StatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OSNAME)||
				((CIMProperty)CIM_StatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PROCESSCREATIONCLASSNAME)||
				((CIMProperty)CIM_StatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REALDATA)||
				((CIMProperty)CIM_StatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REALSTACK)||
				((CIMProperty)CIM_StatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REALTEXT)||
				((CIMProperty)CIM_StatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SYSTEMTIMEDEADCHILDREN)||
				((CIMProperty)CIM_StatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_VIRTUALDATA)||
				((CIMProperty)CIM_StatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_VIRTUALMEMORYMAPPEDFILESIZE)||
				((CIMProperty)CIM_StatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_VIRTUALSHAREDMEMORY)||
				((CIMProperty)CIM_StatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_VIRTUALSTACK)||
				((CIMProperty)CIM_StatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_VIRTUALTEXT)){
				continue;
			}
			
			CIM_UnixProcessStatisticalInformation.CIM_PropertyList.add(CIM_StatisticalInformation.CIM_PropertyList.elementAt(i));
		}
		
		addPackage("org.sblim.wbemsmt.schema.cim29");
				
		String[] parentClassPackageList = CIM_StatisticalInformation.getPackages();
		
		for (int i = 0; i < parentClassPackageList.length; i++) {
			Java_Package_List.add(parentClassPackageList[i]);
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_UnixProcessStatisticalInformation() {

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
	public CIM_UnixProcessStatisticalInformation(Vector keyProperties){ 
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
	public CIM_UnixProcessStatisticalInformation(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
		if (cimInstance == null) {
			throw new InvalidParameterException("The cimInstance parameter does not contain a valid reference.");
		
		} else if (cimObjectPath == null){
			throw new InvalidParameterException("The cimObjectPath parameter does not contain a valid reference.");		
		
		} else if (!cimObjectPath.getObjectName().equals(cimInstance.getClassName())) {
			throw new InvalidParameterException("The class name of the instance and the ObjectPath are not the same.");
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
	
	public static void addPackage(String packagename) {
        if (packagename != null) {
            if (!packagename.endsWith(".")) {
                packagename = packagename + ".";
            }
            CIM_UnixProcessStatisticalInformation.Java_Package_List.add(packagename);
            
        } else {
            throw new NullPointerException();
        }
    }

    public static String[] getPackages() {
        return (String[]) CIM_UnixProcessStatisticalInformation.Java_Package_List.toArray(new String[CIM_UnixProcessStatisticalInformation.Java_Package_List.size()]);
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
		
		CIMProperty CIMProperty_Handle = this.cimInstance.getProperty(CIM_PROPERTY_HANDLE);
		
		if (CIMProperty_Handle == null || CIMProperty_Handle.getValue().isEmpty() || CIMProperty_Handle.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_HANDLE, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_Name = this.cimInstance.getProperty(CIM_PROPERTY_NAME);
		
		if (CIMProperty_Name == null || CIMProperty_Name.getValue().isEmpty() || CIMProperty_Name.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_NAME, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_OSCreationClassName = this.cimInstance.getProperty(CIM_PROPERTY_OSCREATIONCLASSNAME);
		
		if (CIMProperty_OSCreationClassName == null || CIMProperty_OSCreationClassName.getValue().isEmpty() || CIMProperty_OSCreationClassName.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_OSCREATIONCLASSNAME, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_OSName = this.cimInstance.getProperty(CIM_PROPERTY_OSNAME);
		
		if (CIMProperty_OSName == null || CIMProperty_OSName.getValue().isEmpty() || CIMProperty_OSName.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_OSNAME, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_ProcessCreationClassName = this.cimInstance.getProperty(CIM_PROPERTY_PROCESSCREATIONCLASSNAME);
		
		if (CIMProperty_ProcessCreationClassName == null || CIMProperty_ProcessCreationClassName.getValue().isEmpty() || CIMProperty_ProcessCreationClassName.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_PROCESSCREATIONCLASSNAME, "Key"});
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
	    
	    if (!(object instanceof CIM_UnixProcessStatisticalInformation)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_UnixProcessStatisticalInformation)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_UnixProcessStatisticalInformation)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_UnixProcessStatisticalInformation)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_UnixProcessStatisticalInformation)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_UnixProcessStatisticalInformation)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_UnixProcessStatisticalInformation)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_UnixProcessStatisticalInformation)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_UnixProcessStatisticalInformation)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_UnixProcessStatisticalInformation)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_UnixProcess_CIM_UnixProcessStatisticss(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_UNIXPROCESSSTATISTICS, 
					CIM_UnixProcess.CIM_CLASS_NAME, 
					"Stats", //$NON-NLS-1$
					"Element", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
                    Class clazz = CIM_UnixProcessStatisticalInformationHelper.findClass(cimClient, cimInstance);
                    
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_UnixProcess(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_UnixProcess(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_UnixProcess(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_UnixProcess_CIM_UnixProcessStatistics_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_UNIXPROCESSSTATISTICS, 
					CIM_UnixProcess.CIM_CLASS_NAME, 
					"Stats", //$NON-NLS-1$
					"Element"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_UnixProcess.CIM_CLASS_NAME)) {
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
	
	// Attribute CPUTime
	
	public UnsignedInt32 get_CPUTime() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_CPUTIME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_CPUTIME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_CPUTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CPUTime(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_CPUTIME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_CPUTIME + " could not be found");
    		
		} else if (!CIM_UnixProcessStatisticalInformationHelper.isValid_CPUTime(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_CPUTIME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_CPUTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CSCreationClassName
	
	public String get_CSCreationClassName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_CSCREATIONCLASSNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_CSCREATIONCLASSNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_CSCREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CSCreationClassName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_CSCREATIONCLASSNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_CSCREATIONCLASSNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_CSCREATIONCLASSNAME + " could not be found");
    		
		} else if (!CIM_UnixProcessStatisticalInformationHelper.isValid_CSCreationClassName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_CSCREATIONCLASSNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_CSCREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CSName
	
	public String get_CSName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_CSNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_CSNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_CSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CSName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_CSNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_CSNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_CSNAME + " could not be found");
    		
		} else if (!CIM_UnixProcessStatisticalInformationHelper.isValid_CSName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_CSNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_CSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CpuTimeDeadChildren
	
	public UnsignedInt64 get_CpuTimeDeadChildren() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_CPUTIMEDEADCHILDREN);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_CPUTIMEDEADCHILDREN + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_CPUTIMEDEADCHILDREN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CpuTimeDeadChildren(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_CPUTIMEDEADCHILDREN);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_CPUTIMEDEADCHILDREN + " could not be found");
    		
		} else if (!CIM_UnixProcessStatisticalInformationHelper.isValid_CpuTimeDeadChildren(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_CPUTIMEDEADCHILDREN);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_CPUTIMEDEADCHILDREN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Handle
	
	public String get_Handle() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_HANDLE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_HANDLE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_HANDLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Handle(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_HANDLE);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_HANDLE + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_HANDLE + " could not be found");
    		
		} else if (!CIM_UnixProcessStatisticalInformationHelper.isValid_Handle(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_HANDLE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_HANDLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Name
	
	public String get_Name() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_NAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_NAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_NAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Name(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_NAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_NAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_NAME + " could not be found");
    		
		} else if (!CIM_UnixProcessStatisticalInformationHelper.isValid_Name(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_NAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_NAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OSCreationClassName
	
	public String get_OSCreationClassName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_OSCREATIONCLASSNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_OSCREATIONCLASSNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_OSCREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OSCreationClassName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_OSCREATIONCLASSNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_OSCREATIONCLASSNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_OSCREATIONCLASSNAME + " could not be found");
    		
		} else if (!CIM_UnixProcessStatisticalInformationHelper.isValid_OSCreationClassName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_OSCREATIONCLASSNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_OSCREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OSName
	
	public String get_OSName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_OSNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_OSNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_OSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OSName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_OSNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_OSNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_OSNAME + " could not be found");
    		
		} else if (!CIM_UnixProcessStatisticalInformationHelper.isValid_OSName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_OSNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_OSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ProcessCreationClassName
	
	public String get_ProcessCreationClassName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_PROCESSCREATIONCLASSNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_PROCESSCREATIONCLASSNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_PROCESSCREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ProcessCreationClassName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_PROCESSCREATIONCLASSNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_PROCESSCREATIONCLASSNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_PROCESSCREATIONCLASSNAME + " could not be found");
    		
		} else if (!CIM_UnixProcessStatisticalInformationHelper.isValid_ProcessCreationClassName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_PROCESSCREATIONCLASSNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_PROCESSCREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RealData
	
	public UnsignedInt64 get_RealData() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_REALDATA);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_REALDATA + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_REALDATA + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RealData(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_REALDATA);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_REALDATA + " could not be found");
    		
		} else if (!CIM_UnixProcessStatisticalInformationHelper.isValid_RealData(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_REALDATA);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_REALDATA + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RealStack
	
	public UnsignedInt64 get_RealStack() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_REALSTACK);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_REALSTACK + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_REALSTACK + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RealStack(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_REALSTACK);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_REALSTACK + " could not be found");
    		
		} else if (!CIM_UnixProcessStatisticalInformationHelper.isValid_RealStack(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_REALSTACK);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_REALSTACK + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RealText
	
	public UnsignedInt64 get_RealText() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_REALTEXT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_REALTEXT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_REALTEXT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RealText(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_REALTEXT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_REALTEXT + " could not be found");
    		
		} else if (!CIM_UnixProcessStatisticalInformationHelper.isValid_RealText(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_REALTEXT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_REALTEXT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SystemTimeDeadChildren
	
	public UnsignedInt64 get_SystemTimeDeadChildren() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_SYSTEMTIMEDEADCHILDREN);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_SYSTEMTIMEDEADCHILDREN + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_SYSTEMTIMEDEADCHILDREN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SystemTimeDeadChildren(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_SYSTEMTIMEDEADCHILDREN);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_SYSTEMTIMEDEADCHILDREN + " could not be found");
    		
		} else if (!CIM_UnixProcessStatisticalInformationHelper.isValid_SystemTimeDeadChildren(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_SYSTEMTIMEDEADCHILDREN);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_SYSTEMTIMEDEADCHILDREN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute VirtualData
	
	public UnsignedInt64 get_VirtualData() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_VIRTUALDATA);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_VIRTUALDATA + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_VIRTUALDATA + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_VirtualData(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_VIRTUALDATA);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_VIRTUALDATA + " could not be found");
    		
		} else if (!CIM_UnixProcessStatisticalInformationHelper.isValid_VirtualData(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_VIRTUALDATA);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_VIRTUALDATA + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute VirtualMemoryMappedFileSize
	
	public UnsignedInt64 get_VirtualMemoryMappedFileSize() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_VIRTUALMEMORYMAPPEDFILESIZE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_VIRTUALMEMORYMAPPEDFILESIZE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_VIRTUALMEMORYMAPPEDFILESIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_VirtualMemoryMappedFileSize(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_VIRTUALMEMORYMAPPEDFILESIZE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_VIRTUALMEMORYMAPPEDFILESIZE + " could not be found");
    		
		} else if (!CIM_UnixProcessStatisticalInformationHelper.isValid_VirtualMemoryMappedFileSize(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_VIRTUALMEMORYMAPPEDFILESIZE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_VIRTUALMEMORYMAPPEDFILESIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute VirtualSharedMemory
	
	public UnsignedInt64 get_VirtualSharedMemory() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_VIRTUALSHAREDMEMORY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_VIRTUALSHAREDMEMORY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_VIRTUALSHAREDMEMORY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_VirtualSharedMemory(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_VIRTUALSHAREDMEMORY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_VIRTUALSHAREDMEMORY + " could not be found");
    		
		} else if (!CIM_UnixProcessStatisticalInformationHelper.isValid_VirtualSharedMemory(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_VIRTUALSHAREDMEMORY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_VIRTUALSHAREDMEMORY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute VirtualStack
	
	public UnsignedInt64 get_VirtualStack() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_VIRTUALSTACK);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_VIRTUALSTACK + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_VIRTUALSTACK + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_VirtualStack(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_VIRTUALSTACK);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_VIRTUALSTACK + " could not be found");
    		
		} else if (!CIM_UnixProcessStatisticalInformationHelper.isValid_VirtualStack(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_VIRTUALSTACK);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_VIRTUALSTACK + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute VirtualText
	
	public UnsignedInt64 get_VirtualText() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_VIRTUALTEXT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_VIRTUALTEXT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_VIRTUALTEXT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_VirtualText(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_VIRTUALTEXT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_VIRTUALTEXT + " could not be found");
    		
		} else if (!CIM_UnixProcessStatisticalInformationHelper.isValid_VirtualText(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_VIRTUALTEXT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixProcessStatisticalInformation.CIM_PROPERTY_VIRTUALTEXT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
