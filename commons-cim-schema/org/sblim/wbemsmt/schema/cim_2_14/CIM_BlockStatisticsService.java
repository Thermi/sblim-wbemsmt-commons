/** 
 * CIM_BlockStatisticsService.java
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
 * Description:  A subclass of StatisticsService that provides services for filtering and
 * retrieving statistics from a StatisticsManifestCollection that contains
 * instances of BlockStatisticalData.
 * 
 */

package org.sblim.wbemsmt.schema.cim_2_14;

import java.security.InvalidParameterException;
import java.util.Iterator;
import java.util.Vector;

import org.sblim.wbem.cim.CIMArgument;
import org.sblim.wbem.cim.CIMDataType;
import org.sblim.wbem.cim.CIMException;
import org.sblim.wbem.cim.CIMInstance;
import org.sblim.wbem.cim.CIMObjectPath;
import org.sblim.wbem.cim.CIMProperty;
import org.sblim.wbem.cim.CIMValue;
import org.sblim.wbem.cim.UnsignedInt16;
import org.sblim.wbem.cim.UnsignedInt32;
import org.sblim.wbem.client.CIMClient;



/**
 *  A subclass of StatisticsService that provides services for filtering and
 * retrieving statistics from a StatisticsManifestCollection that contains
 * instances of BlockStatisticalData.
 */
public class CIM_BlockStatisticsService extends CIM_StatisticsService  {
	
	public final static String CIM_CLASS_NAME = "CIM_BlockStatisticsService"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.10.0";
	
	
	
	
	/**
	*	Method that creates or modifies a BlockStatisticsManifest for this statistics service. A client supplies a BlockStatisticsManifestCollection in which the new BlockStatisticsManifest will be placed or an existing BlockStatisticsManifest will be modified, the element type of the statistics that the BlockStatisticsManifest will filter, and a list of metrics, which serves as a filter for statistical data of that element type.
	*/
	public final static String CIM_METHOD_ADDORMODIFYMANIFEST = "AddOrModifyManifest";
	/**
	*	Creates a new BlockStatisticsManifestCollection instance, whose members can serve as a filter for metrics retrieved through the GetStatisticsCollection method.
	*/
	public final static String CIM_METHOD_CREATEMANIFESTCOLLECTION = "CreateManifestCollection";
	/**
	*	Retrieves statistics in a well-defined bulk format. The collection of statistics returned is determined by the list of element types passed in to the method and the manifests for those types contained in the supplied BlockStatisticsManifestCollection. If both the Elements and BlockStatisticsManifestCollection parameters are supplied, then the types of elements returned is an intersection of the element types listed in the Elements parameter and the types for which BlockStatisticsManifest instances exist in the supplied BlockStatisticsManifestCollection. The statistics are returned through a well-defined array of strings, whose format is specified by the StatisticsFormat parameter, that can be parsed to retrieve the desired statistics as well as limited information about the elements that those metrics describe.
	*/
	public final static String CIM_METHOD_GETSTATISTICSCOLLECTION = "GetStatisticsCollection";
	/**
	*	Extrinsic method that removes manifests from a BlockStatisticsManifestCollection.
	*/
	public final static String CIM_METHOD_REMOVEMANIFESTS = "RemoveManifests";
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
				
		for (int i = 0; i < CIM_StatisticsService.CIM_PropertyNameList.size(); i++) {
			
			CIM_BlockStatisticsService.CIM_PropertyNameList.add(CIM_StatisticsService.CIM_PropertyNameList.elementAt(i));
		}
		
				
		for (int i = 0; i < CIM_StatisticsService.CIM_PropertyList.size(); i++) {
			
			CIM_BlockStatisticsService.CIM_PropertyList.add(CIM_StatisticsService.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_StatisticsService.Java_Package_List.size(); i++) {
			if (((String)CIM_StatisticsService.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_StatisticsService.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_BlockStatisticsService() {

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
	public CIM_BlockStatisticsService(Vector keyProperties){ 
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
	public CIM_BlockStatisticsService(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_BlockStatisticsService)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_BlockStatisticsService)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_BlockStatisticsService)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_BlockStatisticsService)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_BlockStatisticsService)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_BlockStatisticsService)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_BlockStatisticsService)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_BlockStatisticsService)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_BlockStatisticsService)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_BlockStatisticsService)object).cimObjectPath)) {
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
	
	
	
	//*****************************************************
	// Attribute methods
	//*****************************************************
	
	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	
	public UnsignedInt32 invoke_addOrModifyManifest(CIMClient cimClient, CIM_BlockStatisticsManifestCollection ManifestCollection, UnsignedInt16 ElementType, String ElementName, String StatisticsList, CIM_BlockStatisticsManifest Manifest) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_BlockStatisticsService.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_ManifestCollection = new CIMValue(ManifestCollection.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_ElementType = new CIMValue(ElementType, new CIMDataType(CIMDataType.UINT16));
		CIMValue cimValue_ElementName = new CIMValue(ElementName, new CIMDataType(CIMDataType.STRING));
		CIMValue cimValue_StatisticsList = new CIMValue(StatisticsList, new CIMDataType(CIMDataType.STRING_ARRAY));
		CIMValue cimValue_Manifest = new CIMValue(Manifest.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		
	  	inParameter.add(new CIMArgument("ManifestCollection", cimValue_ManifestCollection));
		inParameter.add(new CIMArgument("ElementType", cimValue_ElementType));
		inParameter.add(new CIMArgument("ElementName", cimValue_ElementName));
		inParameter.add(new CIMArgument("StatisticsList", cimValue_StatisticsList));
		
	  	outParameter.add(new CIMArgument("Manifest", cimValue_Manifest));
		
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_ADDORMODIFYMANIFEST,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_BlockStatisticsService.CIM_METHOD_ADDORMODIFYMANIFEST + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_BlockStatisticsService.CIM_METHOD_ADDORMODIFYMANIFEST + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_BlockStatisticsService.CIM_METHOD_ADDORMODIFYMANIFEST + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	
	public UnsignedInt32 invoke_createManifestCollection(CIMClient cimClient, CIM_StatisticsCollection Statistics, String ElementName, CIM_BlockStatisticsManifestCollection ManifestCollection) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_BlockStatisticsService.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_Statistics = new CIMValue(Statistics.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_ElementName = new CIMValue(ElementName, new CIMDataType(CIMDataType.STRING));
		CIMValue cimValue_ManifestCollection = new CIMValue(ManifestCollection.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		
	  	inParameter.add(new CIMArgument("Statistics", cimValue_Statistics));
		inParameter.add(new CIMArgument("ElementName", cimValue_ElementName));
		
	  	outParameter.add(new CIMArgument("ManifestCollection", cimValue_ManifestCollection));
		
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_CREATEMANIFESTCOLLECTION,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_BlockStatisticsService.CIM_METHOD_CREATEMANIFESTCOLLECTION + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_BlockStatisticsService.CIM_METHOD_CREATEMANIFESTCOLLECTION + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_BlockStatisticsService.CIM_METHOD_CREATEMANIFESTCOLLECTION + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	
	public UnsignedInt32 invoke_getStatisticsCollection(CIMClient cimClient, CIM_ConcreteJob Job, UnsignedInt16 ElementTypes, CIM_BlockStatisticsManifestCollection ManifestCollection, UnsignedInt16 StatisticsFormat, String Statistics) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_BlockStatisticsService.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_Job = new CIMValue(Job.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_ElementTypes = new CIMValue(ElementTypes, new CIMDataType(CIMDataType.UINT16_ARRAY));
		CIMValue cimValue_ManifestCollection = new CIMValue(ManifestCollection.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_StatisticsFormat = new CIMValue(StatisticsFormat, new CIMDataType(CIMDataType.UINT16));
		CIMValue cimValue_Statistics = new CIMValue(Statistics, new CIMDataType(CIMDataType.STRING_ARRAY));
		
	  	inParameter.add(new CIMArgument("Job", cimValue_Job));
		inParameter.add(new CIMArgument("ElementTypes", cimValue_ElementTypes));
		inParameter.add(new CIMArgument("ManifestCollection", cimValue_ManifestCollection));
		inParameter.add(new CIMArgument("StatisticsFormat", cimValue_StatisticsFormat));
		
	  	outParameter.add(new CIMArgument("Job", cimValue_Job));
		outParameter.add(new CIMArgument("Statistics", cimValue_Statistics));
		
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_GETSTATISTICSCOLLECTION,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_BlockStatisticsService.CIM_METHOD_GETSTATISTICSCOLLECTION + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_BlockStatisticsService.CIM_METHOD_GETSTATISTICSCOLLECTION + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_BlockStatisticsService.CIM_METHOD_GETSTATISTICSCOLLECTION + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	
	public UnsignedInt32 invoke_removeManifests(CIMClient cimClient, CIM_BlockStatisticsManifestCollection ManifestCollection, CIM_BlockStatisticsManifest Manifests) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_BlockStatisticsService.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_ManifestCollection = new CIMValue(ManifestCollection.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_Manifests = new CIMValue(Manifests.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE_ARRAY));
		
	  	inParameter.add(new CIMArgument("ManifestCollection", cimValue_ManifestCollection));
		inParameter.add(new CIMArgument("Manifests", cimValue_Manifests));
		
	  	
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_REMOVEMANIFESTS,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_BlockStatisticsService.CIM_METHOD_REMOVEMANIFESTS + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_BlockStatisticsService.CIM_METHOD_REMOVEMANIFESTS + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_BlockStatisticsService.CIM_METHOD_REMOVEMANIFESTS + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	

}
