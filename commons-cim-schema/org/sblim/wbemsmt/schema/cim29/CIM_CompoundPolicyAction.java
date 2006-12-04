/** 
 * CIM_CompoundPolicyAction.java
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
 * Description: CompoundPolicyAction is used to represent an expression consisting of an ordered sequence of action terms. Each action term is represented as a subclass of the PolicyAction class. Compound actions are constructed by associating dependent action terms together using the PolicyActionInPolicyAction aggregation.
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



public class CIM_CompoundPolicyAction extends CIM_PolicyAction  {
	
	public final static String CIM_CLASS_NAME = "CIM_CompoundPolicyAction";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_POLICYACTIONINPOLICYACTION = "CIM_PolicyActionInPolicyAction";
	
	
	/**
	*	ExecutionStrategy defines the strategy to be used in executing the sequenced actions aggregated by this CompoundPolicyAction. There are three execution strategies: 

Do Until Success - execute actions according to predefined order, until successful execution of a single action. 
Do All - execute ALL actions which are part of the modeled set, according to their predefined order. Continue doing this, even if one or more of the actions fails. 
Do Until Failure - execute actions according to predefined order, until the first failure in execution of an action instance. 
The default value is 2 ("Do All").
	*/
	public final static String CIM_PROPERTY_EXECUTIONSTRATEGY = "ExecutionStrategy"; //$NON-NLS-1$
	/**
	*	This property gives a policy administrator a way of specifying how the ordering of the PolicyActions associated with this PolicyRule is to be interpreted. Three values are supported: 
o mandatory(1): Do the actions in the indicated order, or don't do them at all. 
o recommended(2): Do the actions in the indicated order if you can, but if you can't do them in this order, do them in another order if you can. 
o dontCare(3): Do them -- I don't care about the order. 
The default value is 3 ("DontCare").
	*/
	public final static String CIM_PROPERTY_SEQUENCEDACTIONS = "SequencedActions"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_EXECUTIONSTRATEGY);
		CIM_PropertyNameList.add(CIM_PROPERTY_SEQUENCEDACTIONS);
				
		for (int i = 0; i < CIM_PolicyAction.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_PolicyAction.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_EXECUTIONSTRATEGY)||
				((String)CIM_PolicyAction.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SEQUENCEDACTIONS)){
				continue;
			}
			
			CIM_CompoundPolicyAction.CIM_PropertyNameList.add(CIM_PolicyAction.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_EXECUTIONSTRATEGY, new CIMValue(new UnsignedInt16("2"), new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SEQUENCEDACTIONS, new CIMValue(new UnsignedInt16("3"), new CIMDataType(CIMDataType.UINT16))));
				
		for (int i = 0; i < CIM_PolicyAction.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_PolicyAction.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_EXECUTIONSTRATEGY)||
				((CIMProperty)CIM_PolicyAction.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SEQUENCEDACTIONS)){
				continue;
			}
			
			CIM_CompoundPolicyAction.CIM_PropertyList.add(CIM_PolicyAction.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_PolicyAction.Java_Package_List.size(); i++) {
			if (((String)CIM_PolicyAction.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_PolicyAction.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_EXECUTIONSTRATEGY = {"Do Until Success","Do All","Do Until Failure"};
	public final static String[] CIM_VALUEMAP_SEQUENCEDACTIONS = {"Mandatory","Recommended","Dont Care"};
	
	
	public final static int EXECUTIONSTRATEGY_DOUNTILSUCCESS = 1;
	public final static int EXECUTIONSTRATEGY_DOALL = 2;
	public final static int EXECUTIONSTRATEGY_DOUNTILFAILURE = 3;
	
	public final static int SEQUENCEDACTIONS_MANDATORY = 1;
	public final static int SEQUENCEDACTIONS_RECOMMENDED = 2;
	public final static int SEQUENCEDACTIONS_DONTCARE = 3;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_CompoundPolicyAction() {

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
	public CIM_CompoundPolicyAction(Vector keyProperties){ 
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
	public CIM_CompoundPolicyAction(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_CompoundPolicyAction)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_CompoundPolicyAction)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_CompoundPolicyAction)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_CompoundPolicyAction)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_CompoundPolicyAction)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_CompoundPolicyAction)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_CompoundPolicyAction)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_CompoundPolicyAction)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_CompoundPolicyAction)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_CompoundPolicyAction)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_PolicyAction_CIM_PolicyActionInPolicyActions(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_POLICYACTIONINPOLICYACTION, 
					CIM_PolicyAction.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_CompoundPolicyAction.Java_Package_List.size(); i++) {
						if (!((String)(CIM_CompoundPolicyAction.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_CompoundPolicyAction.Java_Package_List.get(i))).endsWith(".")) {
							CIM_CompoundPolicyAction.Java_Package_List.setElementAt((String)(CIM_CompoundPolicyAction.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_CompoundPolicyAction.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_PolicyAction(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_PolicyAction(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_PolicyAction(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_PolicyAction_CIM_PolicyActionInPolicyAction_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_POLICYACTIONINPOLICYACTION, 
					CIM_PolicyAction.CIM_CLASS_NAME, 
					"GroupComponent",
					"PartComponent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_PolicyAction.CIM_CLASS_NAME)) {
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
	
	// Attribute ExecutionStrategy
	
	public UnsignedInt16 get_ExecutionStrategy() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CompoundPolicyAction.CIM_PROPERTY_EXECUTIONSTRATEGY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CompoundPolicyAction.CIM_PROPERTY_EXECUTIONSTRATEGY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CompoundPolicyAction.CIM_PROPERTY_EXECUTIONSTRATEGY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ExecutionStrategy(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CompoundPolicyAction.CIM_PROPERTY_EXECUTIONSTRATEGY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CompoundPolicyAction.CIM_PROPERTY_EXECUTIONSTRATEGY + " could not be found");
    		
		} else if (!CIM_CompoundPolicyActionHelper.isValid_ExecutionStrategy(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CompoundPolicyAction.CIM_PROPERTY_EXECUTIONSTRATEGY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CompoundPolicyAction.CIM_PROPERTY_EXECUTIONSTRATEGY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SequencedActions
	
	public UnsignedInt16 get_SequencedActions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CompoundPolicyAction.CIM_PROPERTY_SEQUENCEDACTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CompoundPolicyAction.CIM_PROPERTY_SEQUENCEDACTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CompoundPolicyAction.CIM_PROPERTY_SEQUENCEDACTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SequencedActions(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CompoundPolicyAction.CIM_PROPERTY_SEQUENCEDACTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CompoundPolicyAction.CIM_PROPERTY_SEQUENCEDACTIONS + " could not be found");
    		
		} else if (!CIM_CompoundPolicyActionHelper.isValid_SequencedActions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CompoundPolicyAction.CIM_PROPERTY_SEQUENCEDACTIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CompoundPolicyAction.CIM_PROPERTY_SEQUENCEDACTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
