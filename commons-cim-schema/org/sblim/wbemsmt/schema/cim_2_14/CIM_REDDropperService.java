/** 
 * CIM_REDDropperService.java
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
 * Description:  REDDropperService represents the ability to drop network traffic using a Random
 * Early Detection (RED) algorithm. The purpose of a RED algorithm is to avoid
 * congestion (as opposed to managing congestion). Instead of waiting for the
 * queues to fill up, and then dropping large numbers of packets, RED works by
 * monitoring average queue depth. When the queue depth exceeds a minimum
 * threshold, packets are randomly discarded. These discards cause TCP to slow
 * its transmission rate for those connections that experienced the packet
 * discards. Other connections are not affected by these discards. A RED dropper
 * always drops packets from a single queue, which is related to the dropper as
 * the following Service in the NextService association. The queue(s) examined
 * by the drop algorithm are found by following the CalculationServiceForDropper
 * association(s) to determine the dropper's DropThresholdCalculationService(s),
 * and then following the CalculationBasedOnQueue association to find the queue
 * being watched by each CalculationService.
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
import org.sblim.wbem.cim.UnsignedInt32;
import org.sblim.wbem.client.CIMClient;
import org.sblim.wbem.client.CIMEnumeration;



/**
 *  REDDropperService represents the ability to drop network traffic using a Random
 * Early Detection (RED) algorithm. The purpose of a RED algorithm is to avoid
 * congestion (as opposed to managing congestion). Instead of waiting for the
 * queues to fill up, and then dropping large numbers of packets, RED works by
 * monitoring average queue depth. When the queue depth exceeds a minimum
 * threshold, packets are randomly discarded. These discards cause TCP to slow
 * its transmission rate for those connections that experienced the packet
 * discards. Other connections are not affected by these discards. A RED dropper
 * always drops packets from a single queue, which is related to the dropper as
 * the following Service in the NextService association. The queue(s) examined
 * by the drop algorithm are found by following the CalculationServiceForDropper
 * association(s) to determine the dropper's DropThresholdCalculationService(s),
 * and then following the CalculationBasedOnQueue association to find the queue
 * being watched by each CalculationService.
 */
public class CIM_REDDropperService extends CIM_DropperService  {
	
	public final static String CIM_CLASS_NAME = "CIM_REDDropperService"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_CALCULATIONSERVICEFORDROPPER = "CIM_CalculationServiceForDropper"; //$NON-NLS-1$
	
	
	/**
	*	This is an unsigned 32-bit integer that defines the maximum average queue length at which packets are subject to always being dropped, regardless of the dropping algorithm and probabilities being used. (See the ThresholdUnits property to determine the units of the threshold.)
	*/
	public final static String CIM_PROPERTY_MAXQUEUETHRESHOLD = "MaxQueueThreshold"; //$NON-NLS-1$
	/**
	*	This is an unsigned 32-bit integer that defines the minimum average queue depth at which packets are subject to being dropped. (See the ThresholdUnits property to determine the units of the threshold.) The slope of the drop probability function is described by the Start/StopProbability properties.
	*/
	public final static String CIM_PROPERTY_MINQUEUETHRESHOLD = "MinQueueThreshold"; //$NON-NLS-1$
	/**
	*	This is an unsigned 32-bit integer, used in conjunction with the StopDropProbability property. The start and stop probabilities define the slope of the drop probability function. This function governs the rate at which packets are subject to being dropped, as a function of the queue length. 

This property expresses a drop probability in drops per thousand packets. For example, the value 100 indicates a drop probability of 100 per 1000 packets, that is, 10%. Min and max values are 0 to 1000.
	*/
	public final static String CIM_PROPERTY_STARTPROBABILITY = "StartProbability"; //$NON-NLS-1$
	/**
	*	This is an unsigned 32-bit integer, used in conjunction with the StartDropProbability property. The start and stop probabilities define the slope of the drop probability function. This function governs the rate at which packets are subject to being dropped, as a function of the queue length. 

This property expresses a drop probability in drops per thousand packets. For example, the value 100 indicates a drop probability of 100 per 1000 packets, that is, 10%. Min and max values are 0 to 1000.
	*/
	public final static String CIM_PROPERTY_STOPPROBABILITY = "StopProbability"; //$NON-NLS-1$
	/**
	*	ThresholdUnits is an enumerated integer that identifies the units for the Min and MaxQueueThreshold properties. The values are either bytes (1) or packets (2).
	*/
	public final static String CIM_PROPERTY_THRESHOLDUNITS = "ThresholdUnits"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXQUEUETHRESHOLD);
		CIM_PropertyNameList.add(CIM_PROPERTY_MINQUEUETHRESHOLD);
		CIM_PropertyNameList.add(CIM_PROPERTY_STARTPROBABILITY);
		CIM_PropertyNameList.add(CIM_PROPERTY_STOPPROBABILITY);
		CIM_PropertyNameList.add(CIM_PROPERTY_THRESHOLDUNITS);
				
		for (int i = 0; i < CIM_DropperService.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_DropperService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXQUEUETHRESHOLD)||
				((String)CIM_DropperService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MINQUEUETHRESHOLD)||
				((String)CIM_DropperService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_STARTPROBABILITY)||
				((String)CIM_DropperService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_STOPPROBABILITY)||
				((String)CIM_DropperService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_THRESHOLDUNITS)){
				continue;
			}
			
			CIM_REDDropperService.CIM_PropertyNameList.add(CIM_DropperService.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXQUEUETHRESHOLD, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MINQUEUETHRESHOLD, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_STARTPROBABILITY, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_STOPPROBABILITY, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_THRESHOLDUNITS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
				
		for (int i = 0; i < CIM_DropperService.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_DropperService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXQUEUETHRESHOLD)||
				((CIMProperty)CIM_DropperService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MINQUEUETHRESHOLD)||
				((CIMProperty)CIM_DropperService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_STARTPROBABILITY)||
				((CIMProperty)CIM_DropperService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_STOPPROBABILITY)||
				((CIMProperty)CIM_DropperService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_THRESHOLDUNITS)){
				continue;
			}
			
			CIM_REDDropperService.CIM_PropertyList.add(CIM_DropperService.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_DropperService.Java_Package_List.size(); i++) {
			if (((String)CIM_DropperService.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_DropperService.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_THRESHOLDUNITS = {"Bytes","Packets"};
	
	
	public final static int THRESHOLDUNITS_BYTES = 1;
	public final static int THRESHOLDUNITS_PACKETS = 2;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_REDDropperService() {

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
	public CIM_REDDropperService(Vector keyProperties){ 
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
	public CIM_REDDropperService(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_REDDropperService)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_REDDropperService)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_REDDropperService)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_REDDropperService)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_REDDropperService)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_REDDropperService)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_REDDropperService)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_REDDropperService)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_REDDropperService)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_REDDropperService)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_DropThresholdCalculationService_CIM_CalculationServiceForDroppers(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_CALCULATIONSERVICEFORDROPPER, 
					CIM_DropThresholdCalculationService.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_REDDropperService.Java_Package_List.size(); i++) {
						if (!((String)(CIM_REDDropperService.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_REDDropperService.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_REDDropperService.Java_Package_List.setElementAt((String)(CIM_REDDropperService.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_REDDropperService.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_DropThresholdCalculationService(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_DropThresholdCalculationService(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_DropThresholdCalculationService(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_DropThresholdCalculationService_CIM_CalculationServiceForDropper_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_CALCULATIONSERVICEFORDROPPER, 
					CIM_DropThresholdCalculationService.CIM_CLASS_NAME, 
					"Dependent", //$NON-NLS-1$
					"Antecedent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_DropThresholdCalculationService.CIM_CLASS_NAME)) {
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
	
	// Attribute MaxQueueThreshold
	
	public UnsignedInt32 get_MaxQueueThreshold() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_REDDropperService.CIM_PROPERTY_MAXQUEUETHRESHOLD);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_REDDropperService.CIM_PROPERTY_MAXQUEUETHRESHOLD + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_REDDropperService.CIM_PROPERTY_MAXQUEUETHRESHOLD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxQueueThreshold(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_REDDropperService.CIM_PROPERTY_MAXQUEUETHRESHOLD);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_REDDropperService.CIM_PROPERTY_MAXQUEUETHRESHOLD + " could not be found");
    		
		} else if (!CIM_REDDropperServiceHelper.isValid_MaxQueueThreshold(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_REDDropperService.CIM_PROPERTY_MAXQUEUETHRESHOLD);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_REDDropperService.CIM_PROPERTY_MAXQUEUETHRESHOLD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MinQueueThreshold
	
	public UnsignedInt32 get_MinQueueThreshold() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_REDDropperService.CIM_PROPERTY_MINQUEUETHRESHOLD);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_REDDropperService.CIM_PROPERTY_MINQUEUETHRESHOLD + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_REDDropperService.CIM_PROPERTY_MINQUEUETHRESHOLD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MinQueueThreshold(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_REDDropperService.CIM_PROPERTY_MINQUEUETHRESHOLD);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_REDDropperService.CIM_PROPERTY_MINQUEUETHRESHOLD + " could not be found");
    		
		} else if (!CIM_REDDropperServiceHelper.isValid_MinQueueThreshold(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_REDDropperService.CIM_PROPERTY_MINQUEUETHRESHOLD);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_REDDropperService.CIM_PROPERTY_MINQUEUETHRESHOLD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute StartProbability
	
	public UnsignedInt32 get_StartProbability() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_REDDropperService.CIM_PROPERTY_STARTPROBABILITY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_REDDropperService.CIM_PROPERTY_STARTPROBABILITY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_REDDropperService.CIM_PROPERTY_STARTPROBABILITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_StartProbability(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_REDDropperService.CIM_PROPERTY_STARTPROBABILITY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_REDDropperService.CIM_PROPERTY_STARTPROBABILITY + " could not be found");
    		
		} else if (!CIM_REDDropperServiceHelper.isValid_StartProbability(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_REDDropperService.CIM_PROPERTY_STARTPROBABILITY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_REDDropperService.CIM_PROPERTY_STARTPROBABILITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute StopProbability
	
	public UnsignedInt32 get_StopProbability() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_REDDropperService.CIM_PROPERTY_STOPPROBABILITY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_REDDropperService.CIM_PROPERTY_STOPPROBABILITY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_REDDropperService.CIM_PROPERTY_STOPPROBABILITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_StopProbability(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_REDDropperService.CIM_PROPERTY_STOPPROBABILITY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_REDDropperService.CIM_PROPERTY_STOPPROBABILITY + " could not be found");
    		
		} else if (!CIM_REDDropperServiceHelper.isValid_StopProbability(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_REDDropperService.CIM_PROPERTY_STOPPROBABILITY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_REDDropperService.CIM_PROPERTY_STOPPROBABILITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ThresholdUnits
	
	public UnsignedInt16 get_ThresholdUnits() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_REDDropperService.CIM_PROPERTY_THRESHOLDUNITS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_REDDropperService.CIM_PROPERTY_THRESHOLDUNITS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_REDDropperService.CIM_PROPERTY_THRESHOLDUNITS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ThresholdUnits(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_REDDropperService.CIM_PROPERTY_THRESHOLDUNITS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_REDDropperService.CIM_PROPERTY_THRESHOLDUNITS + " could not be found");
    		
		} else if (!CIM_REDDropperServiceHelper.isValid_ThresholdUnits(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_REDDropperService.CIM_PROPERTY_THRESHOLDUNITS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_REDDropperService.CIM_PROPERTY_THRESHOLDUNITS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
