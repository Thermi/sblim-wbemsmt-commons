/** 
 * CIM_BGPStatistics.java
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
 * Description: This class contains statistical information for a Service's sessions. It is deprecated since the statistics are defined in the BGP4 MIB at the level of individual peers/ endpoints.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.lang.reflect.Constructor;
import org.sblim.wbem.client.*;



public class CIM_BGPStatistics extends CIM_ServiceStatisticalInformation  {
	
	public final static String CIM_CLASS_NAME = "CIM_BGPStatistics";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_BGPSERVICESTATISTICS = "CIM_BGPServiceStatistics";
	
	
	/**
	*	This indicates how long, in seconds, this peer has been in the established state, or how long since this peer was last in the established state. It is set to zero when a new peer is configured or when the router is booted. This has the semantics of a 32-bit gauge.
	*/
	public final static String CIM_PROPERTY_FSMESTABLISHEDTIME = "FsmEstablishedTime"; //$NON-NLS-1$
	/**
	*	This contains the total number of times that the BGP Finite State Machine has transitioned into the established state for this router's BGP connection. This is a 32-bit counter.
	*/
	public final static String CIM_PROPERTY_FSMESTABLISHEDTRANSITIONS = "FsmEstablishedTransitions"; //$NON-NLS-1$
	/**
	*	This is the total number of BGP messages received on this router's BGP connection. This is a 32-bit counter.
	*/
	public final static String CIM_PROPERTY_INTOTALMESSAGES = "InTotalMessages"; //$NON-NLS-1$
	/**
	*	This defines the time in seconds since the last BGP UPDATE message was received from the peer. This has the semantics of a 32-bit gauge.
	*/
	public final static String CIM_PROPERTY_INUPDATEELAPSEDTIME = "InUpdateElapsedTime"; //$NON-NLS-1$
	/**
	*	This is the number of BGP UPDATE messages received on this router's BGP connection. This is a 32-bit counter.
	*/
	public final static String CIM_PROPERTY_INUPDATES = "InUpdates"; //$NON-NLS-1$
	/**
	*	This contains the last error code and error subcode for this router's BGP connection. If no error has occurred, then each integer in the array is zero.
	*/
	public final static String CIM_PROPERTY_LASTERROR = "LastError"; //$NON-NLS-1$
	/**
	*	This is the total number of BGP messages transmitted on this router's BGP connection. This is a 32-bit counter.
	*/
	public final static String CIM_PROPERTY_OUTTOTALMESSAGES = "OutTotalMessages"; //$NON-NLS-1$
	/**
	*	This is the number of BGP UPDATE messages transmitted on this router's BGP connection. This is a 32-bit counter.
	*/
	public final static String CIM_PROPERTY_OUTUPDATES = "OutUpdates"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_FSMESTABLISHEDTIME);
		CIM_PropertyNameList.add(CIM_PROPERTY_FSMESTABLISHEDTRANSITIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_INTOTALMESSAGES);
		CIM_PropertyNameList.add(CIM_PROPERTY_INUPDATEELAPSEDTIME);
		CIM_PropertyNameList.add(CIM_PROPERTY_INUPDATES);
		CIM_PropertyNameList.add(CIM_PROPERTY_LASTERROR);
		CIM_PropertyNameList.add(CIM_PROPERTY_OUTTOTALMESSAGES);
		CIM_PropertyNameList.add(CIM_PROPERTY_OUTUPDATES);
				
		for (int i = 0; i < CIM_ServiceStatisticalInformation.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_ServiceStatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FSMESTABLISHEDTIME)||
				((String)CIM_ServiceStatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FSMESTABLISHEDTRANSITIONS)||
				((String)CIM_ServiceStatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INTOTALMESSAGES)||
				((String)CIM_ServiceStatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INUPDATEELAPSEDTIME)||
				((String)CIM_ServiceStatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INUPDATES)||
				((String)CIM_ServiceStatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LASTERROR)||
				((String)CIM_ServiceStatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OUTTOTALMESSAGES)||
				((String)CIM_ServiceStatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OUTUPDATES)){
				continue;
			}
			
			CIM_BGPStatistics.CIM_PropertyNameList.add(CIM_ServiceStatisticalInformation.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FSMESTABLISHEDTIME, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FSMESTABLISHEDTRANSITIONS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INTOTALMESSAGES, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INUPDATEELAPSEDTIME, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INUPDATES, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LASTERROR, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OUTTOTALMESSAGES, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OUTUPDATES, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
				
		for (int i = 0; i < CIM_ServiceStatisticalInformation.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_ServiceStatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FSMESTABLISHEDTIME)||
				((CIMProperty)CIM_ServiceStatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FSMESTABLISHEDTRANSITIONS)||
				((CIMProperty)CIM_ServiceStatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INTOTALMESSAGES)||
				((CIMProperty)CIM_ServiceStatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INUPDATEELAPSEDTIME)||
				((CIMProperty)CIM_ServiceStatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INUPDATES)||
				((CIMProperty)CIM_ServiceStatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LASTERROR)||
				((CIMProperty)CIM_ServiceStatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OUTTOTALMESSAGES)||
				((CIMProperty)CIM_ServiceStatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OUTUPDATES)){
				continue;
			}
			
			CIM_BGPStatistics.CIM_PropertyList.add(CIM_ServiceStatisticalInformation.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_ServiceStatisticalInformation.Java_Package_List.size(); i++) {
			if (((String)CIM_ServiceStatisticalInformation.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_ServiceStatisticalInformation.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_BGPStatistics() {

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
	public CIM_BGPStatistics(Vector keyProperties){ 
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
	public CIM_BGPStatistics(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_BGPStatistics)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_BGPStatistics)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_BGPStatistics)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_BGPStatistics)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_BGPStatistics)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_BGPStatistics)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_BGPStatistics)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_BGPStatistics)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_BGPStatistics)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_BGPStatistics)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_BGPService_CIM_BGPServiceStatisticss(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_BGPSERVICESTATISTICS, 
					CIM_BGPService.CIM_CLASS_NAME, 
					"Stats",
					"Element",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_BGPStatistics.Java_Package_List.size(); i++) {
						if (!((String)(CIM_BGPStatistics.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_BGPStatistics.Java_Package_List.get(i))).endsWith(".")) {
							CIM_BGPStatistics.Java_Package_List.setElementAt((String)(CIM_BGPStatistics.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_BGPStatistics.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_BGPService(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_BGPService(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_BGPService(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_BGPService_CIM_BGPServiceStatistics_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_BGPSERVICESTATISTICS, 
					CIM_BGPService.CIM_CLASS_NAME, 
					"Stats",
					"Element");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_BGPService.CIM_CLASS_NAME)) {
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
	
	// Attribute FsmEstablishedTime
	
	public UnsignedInt32 get_FsmEstablishedTime() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPStatistics.CIM_PROPERTY_FSMESTABLISHEDTIME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPStatistics.CIM_PROPERTY_FSMESTABLISHEDTIME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPStatistics.CIM_PROPERTY_FSMESTABLISHEDTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_FsmEstablishedTime(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPStatistics.CIM_PROPERTY_FSMESTABLISHEDTIME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPStatistics.CIM_PROPERTY_FSMESTABLISHEDTIME + " could not be found");
    		
		} else if (!CIM_BGPStatisticsHelper.isValid_FsmEstablishedTime(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BGPStatistics.CIM_PROPERTY_FSMESTABLISHEDTIME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPStatistics.CIM_PROPERTY_FSMESTABLISHEDTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute FsmEstablishedTransitions
	
	public UnsignedInt32 get_FsmEstablishedTransitions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPStatistics.CIM_PROPERTY_FSMESTABLISHEDTRANSITIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPStatistics.CIM_PROPERTY_FSMESTABLISHEDTRANSITIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPStatistics.CIM_PROPERTY_FSMESTABLISHEDTRANSITIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_FsmEstablishedTransitions(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPStatistics.CIM_PROPERTY_FSMESTABLISHEDTRANSITIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPStatistics.CIM_PROPERTY_FSMESTABLISHEDTRANSITIONS + " could not be found");
    		
		} else if (!CIM_BGPStatisticsHelper.isValid_FsmEstablishedTransitions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BGPStatistics.CIM_PROPERTY_FSMESTABLISHEDTRANSITIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPStatistics.CIM_PROPERTY_FSMESTABLISHEDTRANSITIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute InTotalMessages
	
	public UnsignedInt32 get_InTotalMessages() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPStatistics.CIM_PROPERTY_INTOTALMESSAGES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPStatistics.CIM_PROPERTY_INTOTALMESSAGES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPStatistics.CIM_PROPERTY_INTOTALMESSAGES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_InTotalMessages(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPStatistics.CIM_PROPERTY_INTOTALMESSAGES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPStatistics.CIM_PROPERTY_INTOTALMESSAGES + " could not be found");
    		
		} else if (!CIM_BGPStatisticsHelper.isValid_InTotalMessages(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BGPStatistics.CIM_PROPERTY_INTOTALMESSAGES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPStatistics.CIM_PROPERTY_INTOTALMESSAGES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute InUpdateElapsedTime
	
	public UnsignedInt32 get_InUpdateElapsedTime() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPStatistics.CIM_PROPERTY_INUPDATEELAPSEDTIME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPStatistics.CIM_PROPERTY_INUPDATEELAPSEDTIME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPStatistics.CIM_PROPERTY_INUPDATEELAPSEDTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_InUpdateElapsedTime(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPStatistics.CIM_PROPERTY_INUPDATEELAPSEDTIME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPStatistics.CIM_PROPERTY_INUPDATEELAPSEDTIME + " could not be found");
    		
		} else if (!CIM_BGPStatisticsHelper.isValid_InUpdateElapsedTime(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BGPStatistics.CIM_PROPERTY_INUPDATEELAPSEDTIME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPStatistics.CIM_PROPERTY_INUPDATEELAPSEDTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute InUpdates
	
	public UnsignedInt32 get_InUpdates() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPStatistics.CIM_PROPERTY_INUPDATES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPStatistics.CIM_PROPERTY_INUPDATES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPStatistics.CIM_PROPERTY_INUPDATES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_InUpdates(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPStatistics.CIM_PROPERTY_INUPDATES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPStatistics.CIM_PROPERTY_INUPDATES + " could not be found");
    		
		} else if (!CIM_BGPStatisticsHelper.isValid_InUpdates(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BGPStatistics.CIM_PROPERTY_INUPDATES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPStatistics.CIM_PROPERTY_INUPDATES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LastError
	
	public UnsignedInt8 get_LastError() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPStatistics.CIM_PROPERTY_LASTERROR);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPStatistics.CIM_PROPERTY_LASTERROR + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPStatistics.CIM_PROPERTY_LASTERROR + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LastError(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPStatistics.CIM_PROPERTY_LASTERROR);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPStatistics.CIM_PROPERTY_LASTERROR + " could not be found");
    		
		} else if (!CIM_BGPStatisticsHelper.isValid_LastError(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BGPStatistics.CIM_PROPERTY_LASTERROR);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPStatistics.CIM_PROPERTY_LASTERROR + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OutTotalMessages
	
	public UnsignedInt32 get_OutTotalMessages() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPStatistics.CIM_PROPERTY_OUTTOTALMESSAGES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPStatistics.CIM_PROPERTY_OUTTOTALMESSAGES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPStatistics.CIM_PROPERTY_OUTTOTALMESSAGES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OutTotalMessages(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPStatistics.CIM_PROPERTY_OUTTOTALMESSAGES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPStatistics.CIM_PROPERTY_OUTTOTALMESSAGES + " could not be found");
    		
		} else if (!CIM_BGPStatisticsHelper.isValid_OutTotalMessages(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BGPStatistics.CIM_PROPERTY_OUTTOTALMESSAGES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPStatistics.CIM_PROPERTY_OUTTOTALMESSAGES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OutUpdates
	
	public UnsignedInt32 get_OutUpdates() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPStatistics.CIM_PROPERTY_OUTUPDATES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPStatistics.CIM_PROPERTY_OUTUPDATES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPStatistics.CIM_PROPERTY_OUTUPDATES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OutUpdates(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPStatistics.CIM_PROPERTY_OUTUPDATES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPStatistics.CIM_PROPERTY_OUTUPDATES + " could not be found");
    		
		} else if (!CIM_BGPStatisticsHelper.isValid_OutUpdates(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BGPStatistics.CIM_PROPERTY_OUTUPDATES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPStatistics.CIM_PROPERTY_OUTUPDATES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
