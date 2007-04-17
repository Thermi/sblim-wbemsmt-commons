/** 
 * CIM_MeterService.java
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
 * Description:  This class represents the metering of network traffic. Metering is the function
 * of monitoring the arrival times of packets of a traffic stream and
 * determining the level of conformance of each packet with respect to a pre-
 * established traffic profile. A meter has the ability to invoke different
 * ConditioningServices for conforming and non-conforming traffic. Traffic
 * leaving a meter may be further conditioned (e.g., dropped or queued) by
 * routing the packet to another conditioning element. This class is modeled as
 * a ConditioningService so that it can be aggregated into a QoSService (using
 * the QoSConditioningSubService association), to indicate that its
 * functionality underlies that QoS service. MeterService also participates in a
 * subclass of the NextService association, to identify the subsequent
 * ConditioningServices for conforming and non-conforming traffic.
 * 
 */

package org.sblim.wbemsmt.schema.cim_2_14;

import java.lang.reflect.Constructor;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

import org.sblim.wbem.cim.CIMDataType;
import org.sblim.wbem.cim.CIMException;
import org.sblim.wbem.cim.CIMInstance;
import org.sblim.wbem.cim.CIMObjectPath;
import org.sblim.wbem.cim.CIMProperty;
import org.sblim.wbem.cim.CIMValue;
import org.sblim.wbem.cim.UnsignedInt16;
import org.sblim.wbem.client.CIMClient;
import org.sblim.wbem.client.CIMEnumeration;



/**
 *  This class represents the metering of network traffic. Metering is the function
 * of monitoring the arrival times of packets of a traffic stream and
 * determining the level of conformance of each packet with respect to a pre-
 * established traffic profile. A meter has the ability to invoke different
 * ConditioningServices for conforming and non-conforming traffic. Traffic
 * leaving a meter may be further conditioned (e.g., dropped or queued) by
 * routing the packet to another conditioning element. This class is modeled as
 * a ConditioningService so that it can be aggregated into a QoSService (using
 * the QoSConditioningSubService association), to indicate that its
 * functionality underlies that QoS service. MeterService also participates in a
 * subclass of the NextService association, to identify the subsequent
 * ConditioningServices for conforming and non-conforming traffic.
 */
public class CIM_MeterService extends CIM_ConditioningService  {
	
	public final static String CIM_CLASS_NAME = "CIM_MeterService"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_NEXTSERVICEAFTERMETER = "CIM_NextServiceAfterMeter"; //$NON-NLS-1$
	
	
	/**
	*	An unsigned integer indicating the number of conformance levels supported by the Meter. For example, when only 'in-profile' or 'out of profile' metering is supported. ConformanceLevels is set to 2.
	*/
	public final static String CIM_PROPERTY_CONFORMANCELEVELS = "ConformanceLevels"; //$NON-NLS-1$
	/**
	*	This property is an enumerated 16-bit unsigned integer that is used to specify the particular type of meter. Defined values of the enumeration are: 

1: Other 
2: Average Rate Meter 
3: Exponentially Weighted Moving Average Meter 
4: Token Bucket Meter 

Note: The MeterType property and the MeterService subclasses provide similar information. This property is defined for query purposes and for future expansion. It is assumed that not all MeterServices will require a subclass to define them. Therefore, MeterService will be instantiated directly and the Type property is needed.
	*/
	public final static String CIM_PROPERTY_METERTYPE = "MeterType"; //$NON-NLS-1$
	/**
	*	This property is a string used in conjunction with the MeterType property. When the value of MeterType is 1 (i.e., "Other"), then the name of the conformance level for this meter is defined in this property.
	*/
	public final static String CIM_PROPERTY_OTHERMETERTYPE = "OtherMeterType"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CONFORMANCELEVELS);
		CIM_PropertyNameList.add(CIM_PROPERTY_METERTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERMETERTYPE);
				
		for (int i = 0; i < CIM_ConditioningService.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_ConditioningService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CONFORMANCELEVELS)||
				((String)CIM_ConditioningService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_METERTYPE)||
				((String)CIM_ConditioningService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERMETERTYPE)){
				continue;
			}
			
			CIM_MeterService.CIM_PropertyNameList.add(CIM_ConditioningService.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CONFORMANCELEVELS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_METERTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERMETERTYPE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_ConditioningService.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_ConditioningService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CONFORMANCELEVELS)||
				((CIMProperty)CIM_ConditioningService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_METERTYPE)||
				((CIMProperty)CIM_ConditioningService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERMETERTYPE)){
				continue;
			}
			
			CIM_MeterService.CIM_PropertyList.add(CIM_ConditioningService.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_ConditioningService.Java_Package_List.size(); i++) {
			if (((String)CIM_ConditioningService.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_ConditioningService.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_METERTYPE = {"Other","Average Rate Meter","Exponentially Weighted Moving Average Meter","Token Bucket Meter"};
	
	
	public final static int METERTYPE_OTHER = 1;
	public final static int METERTYPE_AVERAGERATEMETER = 2;
	public final static int METERTYPE_EXPONENTIALLYWEIGHTEDMOVINGAVERAGEMETER = 3;
	public final static int METERTYPE_TOKENBUCKETMETER = 4;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_MeterService() {

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
	public CIM_MeterService(Vector keyProperties){ 
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
	public CIM_MeterService(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_MeterService)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_MeterService)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_MeterService)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_MeterService)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_MeterService)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_MeterService)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_MeterService)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_MeterService)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_MeterService)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_MeterService)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_ConditioningService_CIM_NextServiceAfterMeters(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_NEXTSERVICEAFTERMETER, 
					CIM_ConditioningService.CIM_CLASS_NAME, 
					"PrecedingService", //$NON-NLS-1$
					"FollowingService", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_MeterService.Java_Package_List.size(); i++) {
						if (!((String)(CIM_MeterService.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_MeterService.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_MeterService.Java_Package_List.setElementAt((String)(CIM_MeterService.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_MeterService.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_ConditioningService(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_ConditioningService(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_ConditioningService(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_ConditioningService_CIM_NextServiceAfterMeter_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_NEXTSERVICEAFTERMETER, 
					CIM_ConditioningService.CIM_CLASS_NAME, 
					"PrecedingService", //$NON-NLS-1$
					"FollowingService"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_ConditioningService.CIM_CLASS_NAME)) {
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
	
	// Attribute ConformanceLevels
	
	public UnsignedInt16 get_ConformanceLevels() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MeterService.CIM_PROPERTY_CONFORMANCELEVELS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MeterService.CIM_PROPERTY_CONFORMANCELEVELS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MeterService.CIM_PROPERTY_CONFORMANCELEVELS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ConformanceLevels(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MeterService.CIM_PROPERTY_CONFORMANCELEVELS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MeterService.CIM_PROPERTY_CONFORMANCELEVELS + " could not be found");
    		
		} else if (!CIM_MeterServiceHelper.isValid_ConformanceLevels(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MeterService.CIM_PROPERTY_CONFORMANCELEVELS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MeterService.CIM_PROPERTY_CONFORMANCELEVELS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MeterType
	
	public UnsignedInt16 get_MeterType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MeterService.CIM_PROPERTY_METERTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MeterService.CIM_PROPERTY_METERTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MeterService.CIM_PROPERTY_METERTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MeterType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MeterService.CIM_PROPERTY_METERTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MeterService.CIM_PROPERTY_METERTYPE + " could not be found");
    		
		} else if (!CIM_MeterServiceHelper.isValid_MeterType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MeterService.CIM_PROPERTY_METERTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MeterService.CIM_PROPERTY_METERTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherMeterType
	
	public String get_OtherMeterType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MeterService.CIM_PROPERTY_OTHERMETERTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MeterService.CIM_PROPERTY_OTHERMETERTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MeterService.CIM_PROPERTY_OTHERMETERTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherMeterType(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MeterService.CIM_PROPERTY_OTHERMETERTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MeterService.CIM_PROPERTY_OTHERMETERTYPE + " could not be found");
    		
		} else if (!CIM_MeterServiceHelper.isValid_OtherMeterType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MeterService.CIM_PROPERTY_OTHERMETERTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MeterService.CIM_PROPERTY_OTHERMETERTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
