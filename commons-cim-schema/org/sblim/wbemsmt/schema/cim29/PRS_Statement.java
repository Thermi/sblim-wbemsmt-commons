/** 
 * PRS_Statement.java
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
 * Description: PRS_Statement contains the text describing a problem, any relevant background information, and its resolution. Statements are units of text ranging from brief sentences or phrases to paragraphs or pages. There is no limit to the number of PRS_Statements within a Solution, as long as they support the intent and focus of their root class. Root classes include: PRS_Reference, PRS_Problem or PRS_Resolution. 

PRS_Statements may be grouped together to build compound 'sentences'. For example, 
StatementA = Printer output is blotchy. 
StatementB = Print jobs per day are less than 50. 
ExpressionA = StatementA AND StatementB.
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



public class PRS_Statement extends PRS_ExpressionElement  {
	
	public final static String CIM_CLASS_NAME = "PRS_Statement";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_PRS_STATEMENTFEATURE = "PRS_StatementFeature";
	
	
	/**
	*	When the PRS_Adminstrative object indicates Level 2 compliance, FeatureValue is the specific value selected from the associated PRS_Feature. This property is ignored if there is no PRS_Feature associated with this PRS_Statement.
	*/
	public final static String CIM_PROPERTY_FEATUREVALUE = "FeatureValue"; //$NON-NLS-1$
	/**
	*	Order is used to sequence PRS_Statements associated with a single PRS_Expression to allow a Consumer to process the information in the order desired by the Producer.
	*/
	public final static String CIM_PROPERTY_ORDER = "Order"; //$NON-NLS-1$
	/**
	*	Importance of this Statement. The value of this property shall be an integer value in the range of 0 to 100, inclusive.
	*/
	public final static String CIM_PROPERTY_RELEVANCE = "Relevance"; //$NON-NLS-1$
	/**
	*	When the PRS_Adminstrative object indicates Level 2 compliance, StatementOperator describes the relationship between an associated PRS_Feature and the FeatureValue property. This property is ignored if there is no PRS_Feature associated with this PRS_Statement.
	*/
	public final static String CIM_PROPERTY_STATEMENTOPERATOR = "StatementOperator"; //$NON-NLS-1$
	/**
	*	StatementRole describes how the PRS_Statement relates to the larger context. For example, is the PRS_Statement describing a Fix or a Symptom? 'Description' is generic text without a specific diagnostic application. 'Symptom' describes initial observable incident or behavior that the user reports. 'Error_Message' is a specific type of symptom that the user reports, describing the specific error condition. 'Objective' is what the user wants to accomplish, often expressed as a positive condition. FOr example, how to print on a network. 'Evidence' is information that is collected to diagnose the problem after the symptom is reported. 'Cause' is a description of the underlying facts or factors that engender or relate this behavior. 'Work_around' is information that lets the user work, but does not correct the problem completely. 'Fix' is information that fixes the problem completely. 'Answer' is the information given to the user such as steps to perform, wording to support their environment and understanding. 'Keyword' is a specific classification using defined words or phrases. 'Changes' describe recent changes in the environment which could affect the problem or resolution. 'Title' is the title applying to associated PRS_Statements (usually associated via an 'and' expression.
	*/
	public final static String CIM_PROPERTY_STATEMENTROLE = "StatementRole"; //$NON-NLS-1$
	/**
	*	The descriptive text used for the PRS_Statement.
	*/
	public final static String CIM_PROPERTY_TEXT = "Text"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_FEATUREVALUE);
		CIM_PropertyNameList.add(CIM_PROPERTY_ORDER);
		CIM_PropertyNameList.add(CIM_PROPERTY_RELEVANCE);
		CIM_PropertyNameList.add(CIM_PROPERTY_STATEMENTOPERATOR);
		CIM_PropertyNameList.add(CIM_PROPERTY_STATEMENTROLE);
		CIM_PropertyNameList.add(CIM_PROPERTY_TEXT);
				
		for (int i = 0; i < PRS_ExpressionElement.CIM_PropertyNameList.size(); i++) {
			if (((String)PRS_ExpressionElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FEATUREVALUE)||
				((String)PRS_ExpressionElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ORDER)||
				((String)PRS_ExpressionElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RELEVANCE)||
				((String)PRS_ExpressionElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_STATEMENTOPERATOR)||
				((String)PRS_ExpressionElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_STATEMENTROLE)||
				((String)PRS_ExpressionElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TEXT)){
				continue;
			}
			
			PRS_Statement.CIM_PropertyNameList.add(PRS_ExpressionElement.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FEATUREVALUE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ORDER, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RELEVANCE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_STATEMENTOPERATOR, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_STATEMENTROLE, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TEXT, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < PRS_ExpressionElement.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)PRS_ExpressionElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FEATUREVALUE)||
				((CIMProperty)PRS_ExpressionElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ORDER)||
				((CIMProperty)PRS_ExpressionElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RELEVANCE)||
				((CIMProperty)PRS_ExpressionElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_STATEMENTOPERATOR)||
				((CIMProperty)PRS_ExpressionElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_STATEMENTROLE)||
				((CIMProperty)PRS_ExpressionElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TEXT)){
				continue;
			}
			
			PRS_Statement.CIM_PropertyList.add(PRS_ExpressionElement.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < PRS_ExpressionElement.Java_Package_List.size(); i++) {
			if (((String)PRS_ExpressionElement.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(PRS_ExpressionElement.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_STATEMENTROLE = {"Description","Symptom","Error_Message","Objective","Evidence","Cause","Work_Around","Fix","Answer","Keyword","Changes","Title","Other","Unknown"};
	
	
	public final static int STATEMENTROLE_DESCRIPTION = 0;
	public final static int STATEMENTROLE_SYMPTOM = 1;
	public final static int STATEMENTROLE_ERROR_MESSAGE = 2;
	public final static int STATEMENTROLE_OBJECTIVE = 3;
	public final static int STATEMENTROLE_EVIDENCE = 4;
	public final static int STATEMENTROLE_CAUSE = 5;
	public final static int STATEMENTROLE_WORK_AROUND = 6;
	public final static int STATEMENTROLE_FIX = 7;
	public final static int STATEMENTROLE_ANSWER = 8;
	public final static int STATEMENTROLE_KEYWORD = 9;
	public final static int STATEMENTROLE_CHANGES = 10;
	public final static int STATEMENTROLE_TITLE = 11;
	public final static int STATEMENTROLE_OTHER = 254;
	public final static int STATEMENTROLE_UNKNOWN = 255;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public PRS_Statement() {

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
	public PRS_Statement(Vector keyProperties){ 
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
	public PRS_Statement(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof PRS_Statement)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((PRS_Statement)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((PRS_Statement)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((PRS_Statement)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((PRS_Statement)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((PRS_Statement)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((PRS_Statement)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((PRS_Statement)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((PRS_Statement)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((PRS_Statement)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_PRS_Feature_PRS_StatementFeatures(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_PRS_STATEMENTFEATURE, 
					PRS_Feature.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < PRS_Statement.Java_Package_List.size(); i++) {
						if (!((String)(PRS_Statement.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(PRS_Statement.Java_Package_List.get(i))).endsWith(".")) {
							PRS_Statement.Java_Package_List.setElementAt((String)(PRS_Statement.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (PRS_Statement.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new PRS_Feature(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new PRS_Feature(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new PRS_Feature(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_PRS_Feature_PRS_StatementFeature_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_PRS_STATEMENTFEATURE, 
					PRS_Feature.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(PRS_Feature.CIM_CLASS_NAME)) {
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
	
	// Attribute FeatureValue
	
	public String get_FeatureValue() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_Statement.CIM_PROPERTY_FEATUREVALUE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_Statement.CIM_PROPERTY_FEATUREVALUE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_Statement.CIM_PROPERTY_FEATUREVALUE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_FeatureValue(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_Statement.CIM_PROPERTY_FEATUREVALUE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_Statement.CIM_PROPERTY_FEATUREVALUE + " could not be found");
    		
		} else if (!PRS_StatementHelper.isValid_FeatureValue(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + PRS_Statement.CIM_PROPERTY_FEATUREVALUE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_Statement.CIM_PROPERTY_FEATUREVALUE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Order
	
	public String get_Order() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_Statement.CIM_PROPERTY_ORDER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_Statement.CIM_PROPERTY_ORDER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_Statement.CIM_PROPERTY_ORDER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Order(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_Statement.CIM_PROPERTY_ORDER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_Statement.CIM_PROPERTY_ORDER + " could not be found");
    		
		} else if (!PRS_StatementHelper.isValid_Order(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + PRS_Statement.CIM_PROPERTY_ORDER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_Statement.CIM_PROPERTY_ORDER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Relevance
	
	public UnsignedInt16 get_Relevance() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_Statement.CIM_PROPERTY_RELEVANCE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_Statement.CIM_PROPERTY_RELEVANCE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_Statement.CIM_PROPERTY_RELEVANCE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Relevance(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_Statement.CIM_PROPERTY_RELEVANCE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_Statement.CIM_PROPERTY_RELEVANCE + " could not be found");
    		
		} else if (!PRS_StatementHelper.isValid_Relevance(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + PRS_Statement.CIM_PROPERTY_RELEVANCE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_Statement.CIM_PROPERTY_RELEVANCE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute StatementOperator
	
	public String get_StatementOperator() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_Statement.CIM_PROPERTY_STATEMENTOPERATOR);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_Statement.CIM_PROPERTY_STATEMENTOPERATOR + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_Statement.CIM_PROPERTY_STATEMENTOPERATOR + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_StatementOperator(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_Statement.CIM_PROPERTY_STATEMENTOPERATOR);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_Statement.CIM_PROPERTY_STATEMENTOPERATOR + " could not be found");
    		
		} else if (!PRS_StatementHelper.isValid_StatementOperator(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + PRS_Statement.CIM_PROPERTY_STATEMENTOPERATOR);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_Statement.CIM_PROPERTY_STATEMENTOPERATOR + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute StatementRole
	
	public UnsignedInt8 get_StatementRole() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_Statement.CIM_PROPERTY_STATEMENTROLE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_Statement.CIM_PROPERTY_STATEMENTROLE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_Statement.CIM_PROPERTY_STATEMENTROLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_StatementRole(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_Statement.CIM_PROPERTY_STATEMENTROLE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_Statement.CIM_PROPERTY_STATEMENTROLE + " could not be found");
    		
		} else if (!PRS_StatementHelper.isValid_StatementRole(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + PRS_Statement.CIM_PROPERTY_STATEMENTROLE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_Statement.CIM_PROPERTY_STATEMENTROLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Text
	
	public String get_Text() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_Statement.CIM_PROPERTY_TEXT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_Statement.CIM_PROPERTY_TEXT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_Statement.CIM_PROPERTY_TEXT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Text(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_Statement.CIM_PROPERTY_TEXT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_Statement.CIM_PROPERTY_TEXT + " could not be found");
    		
		} else if (!PRS_StatementHelper.isValid_Text(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + PRS_Statement.CIM_PROPERTY_TEXT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_Statement.CIM_PROPERTY_TEXT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
