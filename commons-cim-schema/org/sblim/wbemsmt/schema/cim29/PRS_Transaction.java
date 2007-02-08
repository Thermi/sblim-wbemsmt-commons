/** 
 * PRS_Transaction.java
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
 * Description: PRS_Transaction represents a single transaction of the Service Incident workflow. A PRS_Transaction instance is created by the PRS_SISService StartSISTransaction method.
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



public class PRS_Transaction extends PRS_ExchangeElement  {
	
	public final static String CIM_CLASS_NAME = "PRS_Transaction";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_PRS_ACTIVITYTRANSACTION = "PRS_ActivityTransaction";
	
	
	/**
	*	The status of the transaction after it has reached the 'Closed' state. A CompletionStatus of zero (0) means the tranasaction completed successfully. A non-zero CompletionStatus indicates the transaction did not complete successfully. Non-zero values are implementation-specific. While the transaction is 'Open' or 'Working' the CompletionStatus property shall be zero (0). See the description for PRS_SISService for the definition of the contents of this property.
	*/
	public final static String CIM_PROPERTY_COMPLETIONSTATUS = "CompletionStatus"; //$NON-NLS-1$
	/**
	*	The current state of this transaction. This value is manipulated by the PRS_SISService:StartSISTransaction and SetSISCompletionStatus method implementations. This property is not intended to be written by management applications.
	*/
	public final static String CIM_PROPERTY_TRANSACTIONSTATE = "TransactionState"; //$NON-NLS-1$
	/**
	*	The specific SIS transaction represented by this PRS_Transaction instance.
	*/
	public final static String CIM_PROPERTY_TRANSACTIONTYPE = "TransactionType"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_COMPLETIONSTATUS);
		CIM_PropertyNameList.add(CIM_PROPERTY_TRANSACTIONSTATE);
		CIM_PropertyNameList.add(CIM_PROPERTY_TRANSACTIONTYPE);
				
		for (int i = 0; i < PRS_ExchangeElement.CIM_PropertyNameList.size(); i++) {
			if (((String)PRS_ExchangeElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_COMPLETIONSTATUS)||
				((String)PRS_ExchangeElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TRANSACTIONSTATE)||
				((String)PRS_ExchangeElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TRANSACTIONTYPE)){
				continue;
			}
			
			PRS_Transaction.CIM_PropertyNameList.add(PRS_ExchangeElement.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_COMPLETIONSTATUS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TRANSACTIONSTATE, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TRANSACTIONTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
				
		for (int i = 0; i < PRS_ExchangeElement.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)PRS_ExchangeElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_COMPLETIONSTATUS)||
				((CIMProperty)PRS_ExchangeElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TRANSACTIONSTATE)||
				((CIMProperty)PRS_ExchangeElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TRANSACTIONTYPE)){
				continue;
			}
			
			PRS_Transaction.CIM_PropertyList.add(PRS_ExchangeElement.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < PRS_ExchangeElement.Java_Package_List.size(); i++) {
			if (((String)PRS_ExchangeElement.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(PRS_ExchangeElement.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_TRANSACTIONSTATE = {"Open","Working","Closed","Notification_Pending"};
	public final static String[] CIM_VALUEMAP_TRANSACTIONTYPE = {"Service_Request","Entitlement","Problem_Submittal","Accept_Problem","Problem_Resolution","Request_Problem_Information","Provide_Problem_Information","Provide_Admin_Information","Query_Incident","Confirm_Close","Reject_Resolution","Request_Closure","Other","Unknown"};
	
	
	public final static int TRANSACTIONSTATE_OPEN = 0;
	public final static int TRANSACTIONSTATE_WORKING = 1;
	public final static int TRANSACTIONSTATE_CLOSED = 2;
	public final static int TRANSACTIONSTATE_NOTIFICATION_PENDING = 3;
	
	public final static int TRANSACTIONTYPE_SERVICE_REQUEST = 0;
	public final static int TRANSACTIONTYPE_ENTITLEMENT = 1;
	public final static int TRANSACTIONTYPE_PROBLEM_SUBMITTAL = 2;
	public final static int TRANSACTIONTYPE_ACCEPT_PROBLEM = 3;
	public final static int TRANSACTIONTYPE_PROBLEM_RESOLUTION = 4;
	public final static int TRANSACTIONTYPE_REQUEST_PROBLEM_INFORMATION = 5;
	public final static int TRANSACTIONTYPE_PROVIDE_PROBLEM_INFORMATION = 6;
	public final static int TRANSACTIONTYPE_PROVIDE_ADMIN_INFORMATION = 7;
	public final static int TRANSACTIONTYPE_QUERY_INCIDENT = 8;
	public final static int TRANSACTIONTYPE_CONFIRM_CLOSE = 9;
	public final static int TRANSACTIONTYPE_REJECT_RESOLUTION = 10;
	public final static int TRANSACTIONTYPE_REQUEST_CLOSURE = 11;
	public final static int TRANSACTIONTYPE_OTHER = 254;
	public final static int TRANSACTIONTYPE_UNKNOWN = 255;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public PRS_Transaction() {

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
	public PRS_Transaction(Vector keyProperties){ 
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
	public PRS_Transaction(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof PRS_Transaction)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((PRS_Transaction)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((PRS_Transaction)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((PRS_Transaction)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((PRS_Transaction)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((PRS_Transaction)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((PRS_Transaction)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((PRS_Transaction)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((PRS_Transaction)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((PRS_Transaction)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_PRS_Activity_PRS_ActivityTransactions(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_PRS_ACTIVITYTRANSACTION, 
					PRS_Activity.CIM_CLASS_NAME, 
					"Dependent",
					"Antecedent",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < PRS_Transaction.Java_Package_List.size(); i++) {
						if (!((String)(PRS_Transaction.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(PRS_Transaction.Java_Package_List.get(i))).endsWith(".")) {
							PRS_Transaction.Java_Package_List.setElementAt((String)(PRS_Transaction.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (PRS_Transaction.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new PRS_Activity(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new PRS_Activity(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new PRS_Activity(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_PRS_Activity_PRS_ActivityTransaction_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_PRS_ACTIVITYTRANSACTION, 
					PRS_Activity.CIM_CLASS_NAME, 
					"Dependent",
					"Antecedent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(PRS_Activity.CIM_CLASS_NAME)) {
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
	
	// Attribute CompletionStatus
	
	public UnsignedInt32 get_CompletionStatus() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_Transaction.CIM_PROPERTY_COMPLETIONSTATUS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_Transaction.CIM_PROPERTY_COMPLETIONSTATUS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_Transaction.CIM_PROPERTY_COMPLETIONSTATUS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CompletionStatus(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_Transaction.CIM_PROPERTY_COMPLETIONSTATUS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_Transaction.CIM_PROPERTY_COMPLETIONSTATUS + " could not be found");
    		
		} else if (!PRS_TransactionHelper.isValid_CompletionStatus(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + PRS_Transaction.CIM_PROPERTY_COMPLETIONSTATUS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_Transaction.CIM_PROPERTY_COMPLETIONSTATUS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TransactionState
	
	public UnsignedInt8 get_TransactionState() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_Transaction.CIM_PROPERTY_TRANSACTIONSTATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_Transaction.CIM_PROPERTY_TRANSACTIONSTATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_Transaction.CIM_PROPERTY_TRANSACTIONSTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TransactionState(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_Transaction.CIM_PROPERTY_TRANSACTIONSTATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_Transaction.CIM_PROPERTY_TRANSACTIONSTATE + " could not be found");
    		
		} else if (!PRS_TransactionHelper.isValid_TransactionState(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + PRS_Transaction.CIM_PROPERTY_TRANSACTIONSTATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_Transaction.CIM_PROPERTY_TRANSACTIONSTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TransactionType
	
	public UnsignedInt8 get_TransactionType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_Transaction.CIM_PROPERTY_TRANSACTIONTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_Transaction.CIM_PROPERTY_TRANSACTIONTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_Transaction.CIM_PROPERTY_TRANSACTIONTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TransactionType(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_Transaction.CIM_PROPERTY_TRANSACTIONTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_Transaction.CIM_PROPERTY_TRANSACTIONTYPE + " could not be found");
    		
		} else if (!PRS_TransactionHelper.isValid_TransactionType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + PRS_Transaction.CIM_PROPERTY_TRANSACTIONTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_Transaction.CIM_PROPERTY_TRANSACTIONTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
