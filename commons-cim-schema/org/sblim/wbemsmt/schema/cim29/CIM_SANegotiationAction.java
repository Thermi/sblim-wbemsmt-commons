/** 
 * CIM_SANegotiationAction.java
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
 * Description: SANegotiationAction is the base class for negotiated SAs. It is abstract, specifying the common parameters that control the IPsec phase 1 and phase 2 negotiations.
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



public class CIM_SANegotiationAction extends CIM_SAAction  {
	
	public final static String CIM_CLASS_NAME = "CIM_SANegotiationAction";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_CONTAINEDPROPOSAL = "CIM_ContainedProposal";
	
	
	/**
	*	IdleDurationSeconds is the time an SA can remain idle (i.e., no traffic protected using the security association) before it is automatically deleted. The default (zero) value indicates that there is no idle duration timer and that the SA is deleted based upon the SA seconds and kilobyte lifetimes. Any non-zero value indicates the number of seconds that the SA may remain unused.
	*/
	public final static String CIM_PROPERTY_IDLEDURATIONSECONDS = "IdleDurationSeconds"; //$NON-NLS-1$
	/**
	*	MinLifetimeKilobytes prevents certain denial of service attacks where the peer requests an arbitrarily low lifetime value, causing renegotiations with expensive Diffie-Hellman operations. The property specifies the minimum lifetime, in kilobytes, that will be accepted from the peer. A value of zero (the default) indicates that there is no minimum value. A non-zero value specifies the minimum kilobytes lifetime. Note that there has been considerable debate regarding the usefulness of applying kilobyte lifetimes to phase 1 security associations, so it is likely that this property will only apply to the subclass, IPsecAction.
	*/
	public final static String CIM_PROPERTY_MINLIFETIMEKILOBYTES = "MinLifetimeKilobytes"; //$NON-NLS-1$
	/**
	*	MinLifetimeSeconds prevents certain denial of service attacks where the peer requests an arbitrarily low lifetime value, causing renegotiations with expensive Diffie-Hellman operations. The property specifies the minimum lifetime, in seconds, that will be accepted from the peer. A value of zero (the default) indicates that there is no minimum value. A non-zero value specifies the minimum seconds lifetime.
	*/
	public final static String CIM_PROPERTY_MINLIFETIMESECONDS = "MinLifetimeSeconds"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_IDLEDURATIONSECONDS);
		CIM_PropertyNameList.add(CIM_PROPERTY_MINLIFETIMEKILOBYTES);
		CIM_PropertyNameList.add(CIM_PROPERTY_MINLIFETIMESECONDS);
				
		for (int i = 0; i < CIM_SAAction.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_SAAction.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_IDLEDURATIONSECONDS)||
				((String)CIM_SAAction.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MINLIFETIMEKILOBYTES)||
				((String)CIM_SAAction.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MINLIFETIMESECONDS)){
				continue;
			}
			
			CIM_SANegotiationAction.CIM_PropertyNameList.add(CIM_SAAction.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_IDLEDURATIONSECONDS, new CIMValue(new UnsignedInt64("0"), new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MINLIFETIMEKILOBYTES, new CIMValue(new UnsignedInt64("0"), new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MINLIFETIMESECONDS, new CIMValue(new UnsignedInt64("0"), new CIMDataType(CIMDataType.UINT64))));
				
		for (int i = 0; i < CIM_SAAction.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_SAAction.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_IDLEDURATIONSECONDS)||
				((CIMProperty)CIM_SAAction.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MINLIFETIMEKILOBYTES)||
				((CIMProperty)CIM_SAAction.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MINLIFETIMESECONDS)){
				continue;
			}
			
			CIM_SANegotiationAction.CIM_PropertyList.add(CIM_SAAction.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_SAAction.Java_Package_List.size(); i++) {
			if (((String)CIM_SAAction.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_SAAction.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_SANegotiationAction() {

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
	public CIM_SANegotiationAction(Vector keyProperties){ 
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
	public CIM_SANegotiationAction(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_SANegotiationAction)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_SANegotiationAction)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_SANegotiationAction)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_SANegotiationAction)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_SANegotiationAction)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_SANegotiationAction)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_SANegotiationAction)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_SANegotiationAction)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_SANegotiationAction)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_SANegotiationAction)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_SAProposal_CIM_ContainedProposals(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_CONTAINEDPROPOSAL, 
					CIM_SAProposal.CIM_CLASS_NAME, 
					"GroupComponent",
					"PartComponent",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_SANegotiationAction.Java_Package_List.size(); i++) {
						if (!((String)(CIM_SANegotiationAction.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_SANegotiationAction.Java_Package_List.get(i))).endsWith(".")) {
							CIM_SANegotiationAction.Java_Package_List.setElementAt((String)(CIM_SANegotiationAction.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_SANegotiationAction.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_SAProposal(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_SAProposal(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_SAProposal(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_SAProposal_CIM_ContainedProposal_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_CONTAINEDPROPOSAL, 
					CIM_SAProposal.CIM_CLASS_NAME, 
					"GroupComponent",
					"PartComponent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_SAProposal.CIM_CLASS_NAME)) {
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
	
	// Attribute IdleDurationSeconds
	
	public UnsignedInt64 get_IdleDurationSeconds() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SANegotiationAction.CIM_PROPERTY_IDLEDURATIONSECONDS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SANegotiationAction.CIM_PROPERTY_IDLEDURATIONSECONDS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SANegotiationAction.CIM_PROPERTY_IDLEDURATIONSECONDS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IdleDurationSeconds(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SANegotiationAction.CIM_PROPERTY_IDLEDURATIONSECONDS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SANegotiationAction.CIM_PROPERTY_IDLEDURATIONSECONDS + " could not be found");
    		
		} else if (!CIM_SANegotiationActionHelper.isValid_IdleDurationSeconds(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SANegotiationAction.CIM_PROPERTY_IDLEDURATIONSECONDS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SANegotiationAction.CIM_PROPERTY_IDLEDURATIONSECONDS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MinLifetimeKilobytes
	
	public UnsignedInt64 get_MinLifetimeKilobytes() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SANegotiationAction.CIM_PROPERTY_MINLIFETIMEKILOBYTES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SANegotiationAction.CIM_PROPERTY_MINLIFETIMEKILOBYTES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SANegotiationAction.CIM_PROPERTY_MINLIFETIMEKILOBYTES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MinLifetimeKilobytes(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SANegotiationAction.CIM_PROPERTY_MINLIFETIMEKILOBYTES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SANegotiationAction.CIM_PROPERTY_MINLIFETIMEKILOBYTES + " could not be found");
    		
		} else if (!CIM_SANegotiationActionHelper.isValid_MinLifetimeKilobytes(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SANegotiationAction.CIM_PROPERTY_MINLIFETIMEKILOBYTES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SANegotiationAction.CIM_PROPERTY_MINLIFETIMEKILOBYTES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MinLifetimeSeconds
	
	public UnsignedInt64 get_MinLifetimeSeconds() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SANegotiationAction.CIM_PROPERTY_MINLIFETIMESECONDS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SANegotiationAction.CIM_PROPERTY_MINLIFETIMESECONDS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SANegotiationAction.CIM_PROPERTY_MINLIFETIMESECONDS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MinLifetimeSeconds(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SANegotiationAction.CIM_PROPERTY_MINLIFETIMESECONDS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SANegotiationAction.CIM_PROPERTY_MINLIFETIMESECONDS + " could not be found");
    		
		} else if (!CIM_SANegotiationActionHelper.isValid_MinLifetimeSeconds(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SANegotiationAction.CIM_PROPERTY_MINLIFETIMESECONDS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SANegotiationAction.CIM_PROPERTY_MINLIFETIMESECONDS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
