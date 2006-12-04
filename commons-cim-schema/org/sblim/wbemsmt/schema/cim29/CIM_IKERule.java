/** 
 * CIM_IKERule.java
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
 * Description: IKERule contains the Conditions and Actions for IKE phase 1 negotiations or to specify static actions such as Discard.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_IKERule extends CIM_SARule  {
	
	public final static String CIM_CLASS_NAME = "CIM_IKERule";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	
	
	/**
	*	An IP endpoint may have multiple identities for use in different situations. The IdentityContext property specifies the specific context/identities which pertain to this Rule. The property's function is similar to that of PolicyRoles. A context may be a VPN name or other identifier that selects the appropriate identity. 

IdentityContext is an array of strings. The multiple values in the array are logically ORed together in matching an IPNetworkIdentity's IdentityContext. Each value in the array may be a composition of multiple context names. When an array value is a composition, the individual values are logically ANDed together for evaluation purposes. The syntax is: 
<ContextName>[&&<ContextName>]* 
where the individual context names appear in alphabetical order (according to the collating sequence for UCS-2). So, for example, the values 'CompanyXVPN', 'CompanyYVPN&&TopSecret', 'CompanyZVPN&&Confidential' are possible contexts for a Rule. They are matched against an IPNetworkIdentity's IdentityContext. Any of the values may indicate a match and select an Identity, since the values in the array are logically ORed.
	*/
	public final static String CIM_PROPERTY_IDENTITYCONTEXTS = "IdentityContexts"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_IDENTITYCONTEXTS);
				
		for (int i = 0; i < CIM_SARule.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_SARule.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_IDENTITYCONTEXTS)){
				continue;
			}
			
			CIM_IKERule.CIM_PropertyNameList.add(CIM_SARule.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_IDENTITYCONTEXTS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
				
		for (int i = 0; i < CIM_SARule.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_SARule.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_IDENTITYCONTEXTS)){
				continue;
			}
			
			CIM_IKERule.CIM_PropertyList.add(CIM_SARule.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_SARule.Java_Package_List.size(); i++) {
			if (((String)CIM_SARule.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_SARule.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_IKERule() {

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
	public CIM_IKERule(Vector keyProperties){ 
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
	public CIM_IKERule(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_IKERule)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_IKERule)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_IKERule)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_IKERule)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_IKERule)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_IKERule)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_IKERule)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_IKERule)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_IKERule)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_IKERule)object).cimObjectPath)) {
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
	
	// Attribute IdentityContexts
	
	public String[] get_IdentityContexts() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IKERule.CIM_PROPERTY_IDENTITYCONTEXTS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IKERule.CIM_PROPERTY_IDENTITYCONTEXTS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IKERule.CIM_PROPERTY_IDENTITYCONTEXTS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_IdentityContexts(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IKERule.CIM_PROPERTY_IDENTITYCONTEXTS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IKERule.CIM_PROPERTY_IDENTITYCONTEXTS + " could not be found");
    		
		} else if (!CIM_IKERuleHelper.isValid_IdentityContexts(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IKERule.CIM_PROPERTY_IDENTITYCONTEXTS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IKERule.CIM_PROPERTY_IDENTITYCONTEXTS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
