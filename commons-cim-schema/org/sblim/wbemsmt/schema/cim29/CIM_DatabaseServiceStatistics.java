/** 
 * CIM_DatabaseServiceStatistics.java
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
 * Description: The CIM_DatabaseServiceStatistics class contains the current statistics for a database service. These are counters that are relative to the start of the service or from the time when a reset was issued.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;
import java.util.Calendar;


public class CIM_DatabaseServiceStatistics extends CIM_StatisticalData  {
	
	public final static String CIM_CLASS_NAME = "CIM_DatabaseServiceStatistics";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	
	
	/**
	*	The number of active inbound connections that are currently using the service.
	*/
	public final static String CIM_PROPERTY_ACTIVECONNECTIONS = "ActiveConnections"; //$NON-NLS-1$
	/**
	*	The total number of transactions that have been completed by a commit or abort. Some database operations, such as read-only queries, may not create a transaction.
	*/
	public final static String CIM_PROPERTY_COMPLETEDTRANSACTIONS = "CompletedTransactions"; //$NON-NLS-1$
	/**
	*	The total number of inbound connections to the service since it was started.
	*/
	public final static String CIM_PROPERTY_CUMULATIVECONNECTIONS = "CumulativeConnections"; //$NON-NLS-1$
	/**
	*	The total number of database file reads that were issued by the service since it was started.
	*/
	public final static String CIM_PROPERTY_DISKREADS = "DiskReads"; //$NON-NLS-1$
	/**
	*	The total number of times the database requested disk space and it was not available since the service was started.
	*/
	public final static String CIM_PROPERTY_DISKSPACEUNAVAILABLE = "DiskSpaceUnavailable"; //$NON-NLS-1$
	/**
	*	The total number of database file writes that were issued by the service since it was started.
	*/
	public final static String CIM_PROPERTY_DISKWRITES = "DiskWrites"; //$NON-NLS-1$
	/**
	*	The maximum number of active inbound connections that have been concurrently using the service since it was started.
	*/
	public final static String CIM_PROPERTY_HIGHWATERCONNECTIONS = "HighwaterConnections"; //$NON-NLS-1$
	/**
	*	The date and time when the most recent inbound activity was observed for the database service. A value of all zeros indicates that no inbound activity has taken place since the service was started.
	*/
	public final static String CIM_PROPERTY_LASTACTIVITY = "LastActivity"; //$NON-NLS-1$
	/**
	*	The total number of logical database file reads that were issued by the service since it was started.
	*/
	public final static String CIM_PROPERTY_LOGICALREADS = "LogicalReads"; //$NON-NLS-1$
	/**
	*	The total number of logical database file writes that were issued by the service since it was started. A logical write is a count of the number of times that parts of database files have been marked dirty to indicate that they need to be written to disk.
	*/
	public final static String CIM_PROPERTY_LOGICALWRITES = "LogicalWrites"; //$NON-NLS-1$
	/**
	*	The total number of database pages that have been read by the service since it was started.
	*/
	public final static String CIM_PROPERTY_PAGEREADS = "PageReads"; //$NON-NLS-1$
	/**
	*	The total number of database pages that have been written by the service since it was started.
	*/
	public final static String CIM_PROPERTY_PAGEWRITES = "PageWrites"; //$NON-NLS-1$
	/**
	*	The total number of inbound connections that were rejected by the service since it was started.
	*/
	public final static String CIM_PROPERTY_REJECTEDCONNECTIONS = "RejectedConnections"; //$NON-NLS-1$
	/**
	*	The total number of requests that have been received by the service since it was started.
	*/
	public final static String CIM_PROPERTY_REQUESTSHANDLED = "RequestsHandled"; //$NON-NLS-1$
	/**
	*	The total number of receive operations made by the service during request processing since it was started.
	*/
	public final static String CIM_PROPERTY_REQUESTSRECEIVED = "RequestsReceived"; //$NON-NLS-1$
	/**
	*	The total number of send operations made by the service during request processing since it was started.
	*/
	public final static String CIM_PROPERTY_REQUESTSSENT = "RequestsSent"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ACTIVECONNECTIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_COMPLETEDTRANSACTIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_CUMULATIVECONNECTIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_DISKREADS);
		CIM_PropertyNameList.add(CIM_PROPERTY_DISKSPACEUNAVAILABLE);
		CIM_PropertyNameList.add(CIM_PROPERTY_DISKWRITES);
		CIM_PropertyNameList.add(CIM_PROPERTY_HIGHWATERCONNECTIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_LASTACTIVITY);
		CIM_PropertyNameList.add(CIM_PROPERTY_LOGICALREADS);
		CIM_PropertyNameList.add(CIM_PROPERTY_LOGICALWRITES);
		CIM_PropertyNameList.add(CIM_PROPERTY_PAGEREADS);
		CIM_PropertyNameList.add(CIM_PROPERTY_PAGEWRITES);
		CIM_PropertyNameList.add(CIM_PROPERTY_REJECTEDCONNECTIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_REQUESTSHANDLED);
		CIM_PropertyNameList.add(CIM_PROPERTY_REQUESTSRECEIVED);
		CIM_PropertyNameList.add(CIM_PROPERTY_REQUESTSSENT);
				
		for (int i = 0; i < CIM_StatisticalData.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ACTIVECONNECTIONS)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_COMPLETEDTRANSACTIONS)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CUMULATIVECONNECTIONS)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DISKREADS)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DISKSPACEUNAVAILABLE)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DISKWRITES)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_HIGHWATERCONNECTIONS)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LASTACTIVITY)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LOGICALREADS)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LOGICALWRITES)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PAGEREADS)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PAGEWRITES)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REJECTEDCONNECTIONS)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REQUESTSHANDLED)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REQUESTSRECEIVED)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REQUESTSSENT)){
				continue;
			}
			
			CIM_DatabaseServiceStatistics.CIM_PropertyNameList.add(CIM_StatisticalData.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ACTIVECONNECTIONS, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_COMPLETEDTRANSACTIONS, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CUMULATIVECONNECTIONS, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DISKREADS, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DISKSPACEUNAVAILABLE, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DISKWRITES, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HIGHWATERCONNECTIONS, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LASTACTIVITY, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LOGICALREADS, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LOGICALWRITES, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PAGEREADS, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PAGEWRITES, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REJECTEDCONNECTIONS, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REQUESTSHANDLED, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REQUESTSRECEIVED, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REQUESTSSENT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
				
		for (int i = 0; i < CIM_StatisticalData.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ACTIVECONNECTIONS)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_COMPLETEDTRANSACTIONS)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CUMULATIVECONNECTIONS)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DISKREADS)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DISKSPACEUNAVAILABLE)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DISKWRITES)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_HIGHWATERCONNECTIONS)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LASTACTIVITY)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LOGICALREADS)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LOGICALWRITES)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PAGEREADS)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PAGEWRITES)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REJECTEDCONNECTIONS)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REQUESTSHANDLED)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REQUESTSRECEIVED)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REQUESTSSENT)){
				continue;
			}
			
			CIM_DatabaseServiceStatistics.CIM_PropertyList.add(CIM_StatisticalData.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_StatisticalData.Java_Package_List.size(); i++) {
			if (((String)CIM_StatisticalData.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_StatisticalData.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_DatabaseServiceStatistics() {

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
	public CIM_DatabaseServiceStatistics(Vector keyProperties){ 
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
	public CIM_DatabaseServiceStatistics(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_DatabaseServiceStatistics)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_DatabaseServiceStatistics)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_DatabaseServiceStatistics)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_DatabaseServiceStatistics)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_DatabaseServiceStatistics)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_DatabaseServiceStatistics)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_DatabaseServiceStatistics)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_DatabaseServiceStatistics)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_DatabaseServiceStatistics)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_DatabaseServiceStatistics)object).cimObjectPath)) {
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
	
	// Attribute ActiveConnections
	
	public UnsignedInt64 get_ActiveConnections() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DatabaseServiceStatistics.CIM_PROPERTY_ACTIVECONNECTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_ACTIVECONNECTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_ACTIVECONNECTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ActiveConnections(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DatabaseServiceStatistics.CIM_PROPERTY_ACTIVECONNECTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_ACTIVECONNECTIONS + " could not be found");
    		
		} else if (!CIM_DatabaseServiceStatisticsHelper.isValid_ActiveConnections(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_ACTIVECONNECTIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_ACTIVECONNECTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CompletedTransactions
	
	public UnsignedInt64 get_CompletedTransactions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DatabaseServiceStatistics.CIM_PROPERTY_COMPLETEDTRANSACTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_COMPLETEDTRANSACTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_COMPLETEDTRANSACTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CompletedTransactions(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DatabaseServiceStatistics.CIM_PROPERTY_COMPLETEDTRANSACTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_COMPLETEDTRANSACTIONS + " could not be found");
    		
		} else if (!CIM_DatabaseServiceStatisticsHelper.isValid_CompletedTransactions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_COMPLETEDTRANSACTIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_COMPLETEDTRANSACTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CumulativeConnections
	
	public UnsignedInt64 get_CumulativeConnections() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DatabaseServiceStatistics.CIM_PROPERTY_CUMULATIVECONNECTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_CUMULATIVECONNECTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_CUMULATIVECONNECTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CumulativeConnections(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DatabaseServiceStatistics.CIM_PROPERTY_CUMULATIVECONNECTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_CUMULATIVECONNECTIONS + " could not be found");
    		
		} else if (!CIM_DatabaseServiceStatisticsHelper.isValid_CumulativeConnections(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_CUMULATIVECONNECTIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_CUMULATIVECONNECTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DiskReads
	
	public UnsignedInt64 get_DiskReads() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DatabaseServiceStatistics.CIM_PROPERTY_DISKREADS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_DISKREADS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_DISKREADS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DiskReads(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DatabaseServiceStatistics.CIM_PROPERTY_DISKREADS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_DISKREADS + " could not be found");
    		
		} else if (!CIM_DatabaseServiceStatisticsHelper.isValid_DiskReads(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_DISKREADS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_DISKREADS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DiskSpaceUnavailable
	
	public UnsignedInt64 get_DiskSpaceUnavailable() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DatabaseServiceStatistics.CIM_PROPERTY_DISKSPACEUNAVAILABLE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_DISKSPACEUNAVAILABLE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_DISKSPACEUNAVAILABLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DiskSpaceUnavailable(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DatabaseServiceStatistics.CIM_PROPERTY_DISKSPACEUNAVAILABLE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_DISKSPACEUNAVAILABLE + " could not be found");
    		
		} else if (!CIM_DatabaseServiceStatisticsHelper.isValid_DiskSpaceUnavailable(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_DISKSPACEUNAVAILABLE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_DISKSPACEUNAVAILABLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DiskWrites
	
	public UnsignedInt64 get_DiskWrites() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DatabaseServiceStatistics.CIM_PROPERTY_DISKWRITES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_DISKWRITES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_DISKWRITES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DiskWrites(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DatabaseServiceStatistics.CIM_PROPERTY_DISKWRITES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_DISKWRITES + " could not be found");
    		
		} else if (!CIM_DatabaseServiceStatisticsHelper.isValid_DiskWrites(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_DISKWRITES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_DISKWRITES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute HighwaterConnections
	
	public UnsignedInt64 get_HighwaterConnections() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DatabaseServiceStatistics.CIM_PROPERTY_HIGHWATERCONNECTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_HIGHWATERCONNECTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_HIGHWATERCONNECTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_HighwaterConnections(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DatabaseServiceStatistics.CIM_PROPERTY_HIGHWATERCONNECTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_HIGHWATERCONNECTIONS + " could not be found");
    		
		} else if (!CIM_DatabaseServiceStatisticsHelper.isValid_HighwaterConnections(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_HIGHWATERCONNECTIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_HIGHWATERCONNECTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LastActivity
	
	public Calendar get_LastActivity() {

		CIMProperty property = this.cimInstance.getProperty(CIM_DatabaseServiceStatistics.CIM_PROPERTY_LASTACTIVITY);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_LASTACTIVITY + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_LASTACTIVITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_LastActivity(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DatabaseServiceStatistics.CIM_PROPERTY_LASTACTIVITY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_LASTACTIVITY + " could not be found");
    		
		} else if (!CIM_DatabaseServiceStatisticsHelper.isValid_LastActivity(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_LASTACTIVITY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_LASTACTIVITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	// Attribute LogicalReads
	
	public UnsignedInt64 get_LogicalReads() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DatabaseServiceStatistics.CIM_PROPERTY_LOGICALREADS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_LOGICALREADS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_LOGICALREADS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LogicalReads(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DatabaseServiceStatistics.CIM_PROPERTY_LOGICALREADS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_LOGICALREADS + " could not be found");
    		
		} else if (!CIM_DatabaseServiceStatisticsHelper.isValid_LogicalReads(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_LOGICALREADS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_LOGICALREADS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LogicalWrites
	
	public UnsignedInt64 get_LogicalWrites() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DatabaseServiceStatistics.CIM_PROPERTY_LOGICALWRITES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_LOGICALWRITES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_LOGICALWRITES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LogicalWrites(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DatabaseServiceStatistics.CIM_PROPERTY_LOGICALWRITES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_LOGICALWRITES + " could not be found");
    		
		} else if (!CIM_DatabaseServiceStatisticsHelper.isValid_LogicalWrites(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_LOGICALWRITES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_LOGICALWRITES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PageReads
	
	public UnsignedInt64 get_PageReads() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DatabaseServiceStatistics.CIM_PROPERTY_PAGEREADS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_PAGEREADS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_PAGEREADS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PageReads(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DatabaseServiceStatistics.CIM_PROPERTY_PAGEREADS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_PAGEREADS + " could not be found");
    		
		} else if (!CIM_DatabaseServiceStatisticsHelper.isValid_PageReads(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_PAGEREADS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_PAGEREADS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PageWrites
	
	public UnsignedInt64 get_PageWrites() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DatabaseServiceStatistics.CIM_PROPERTY_PAGEWRITES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_PAGEWRITES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_PAGEWRITES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PageWrites(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DatabaseServiceStatistics.CIM_PROPERTY_PAGEWRITES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_PAGEWRITES + " could not be found");
    		
		} else if (!CIM_DatabaseServiceStatisticsHelper.isValid_PageWrites(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_PAGEWRITES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_PAGEWRITES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RejectedConnections
	
	public UnsignedInt64 get_RejectedConnections() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DatabaseServiceStatistics.CIM_PROPERTY_REJECTEDCONNECTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_REJECTEDCONNECTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_REJECTEDCONNECTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RejectedConnections(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DatabaseServiceStatistics.CIM_PROPERTY_REJECTEDCONNECTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_REJECTEDCONNECTIONS + " could not be found");
    		
		} else if (!CIM_DatabaseServiceStatisticsHelper.isValid_RejectedConnections(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_REJECTEDCONNECTIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_REJECTEDCONNECTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RequestsHandled
	
	public UnsignedInt64 get_RequestsHandled() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DatabaseServiceStatistics.CIM_PROPERTY_REQUESTSHANDLED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_REQUESTSHANDLED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_REQUESTSHANDLED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RequestsHandled(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DatabaseServiceStatistics.CIM_PROPERTY_REQUESTSHANDLED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_REQUESTSHANDLED + " could not be found");
    		
		} else if (!CIM_DatabaseServiceStatisticsHelper.isValid_RequestsHandled(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_REQUESTSHANDLED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_REQUESTSHANDLED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RequestsReceived
	
	public UnsignedInt64 get_RequestsReceived() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DatabaseServiceStatistics.CIM_PROPERTY_REQUESTSRECEIVED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_REQUESTSRECEIVED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_REQUESTSRECEIVED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RequestsReceived(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DatabaseServiceStatistics.CIM_PROPERTY_REQUESTSRECEIVED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_REQUESTSRECEIVED + " could not be found");
    		
		} else if (!CIM_DatabaseServiceStatisticsHelper.isValid_RequestsReceived(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_REQUESTSRECEIVED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_REQUESTSRECEIVED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RequestsSent
	
	public UnsignedInt64 get_RequestsSent() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DatabaseServiceStatistics.CIM_PROPERTY_REQUESTSSENT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_REQUESTSSENT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_REQUESTSSENT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RequestsSent(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DatabaseServiceStatistics.CIM_PROPERTY_REQUESTSSENT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_REQUESTSSENT + " could not be found");
    		
		} else if (!CIM_DatabaseServiceStatisticsHelper.isValid_RequestsSent(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_REQUESTSSENT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DatabaseServiceStatistics.CIM_PROPERTY_REQUESTSSENT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
