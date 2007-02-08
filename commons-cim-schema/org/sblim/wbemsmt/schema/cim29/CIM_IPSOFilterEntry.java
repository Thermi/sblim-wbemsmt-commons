/** 
 * CIM_IPSOFilterEntry.java
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
 * Description: An IPSOFilterEntry is used to match traffic based on the IP Security Options header values (ClassificationLevel and ProtectionAuthority) as defined in RFC1108. This type of FilterEntry is used to adjust the IPsec encryption level according to the IPSO classification of the traffic (e.g., secret, confidential, restricted, etc.).
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_IPSOFilterEntry extends CIM_FilterEntryBase  {
	
	public final static String CIM_CLASS_NAME = "CIM_IPSOFilterEntry";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	
	
	/**
	*	This is the value to be matched when MatchConditionType is 1 or 3 - meaning that "Classification Level" should be filtered. In RFC1108, the following semantics are specified: TopSecret, Secret, Confidential, and Unclassified. Note that this enumeration's values are different than the RFC list and the IETF's IPSP Policy Model since those lists are simply bit maps, and do not include specific values for "Other" or "No Filtering".
	*/
	public final static String CIM_PROPERTY_CLASSIFICATIONLEVEL = "ClassificationLevel"; //$NON-NLS-1$
	/**
	*	MatchConditionType specifies whether to match based on traffic classification level, protection authority or both. Note that this enumeration is modified from its definition in the IETF's IPSP Policy Model to allow for both classification level and protection authority checking, and to allow the enumerated value, "Other", to be added in the future.
	*/
	public final static String CIM_PROPERTY_MATCHCONDITIONTYPE = "MatchConditionType"; //$NON-NLS-1$
	/**
	*	Description of the level when the value 1 ("Other") is specified for the property, ClassificationLevel.
	*/
	public final static String CIM_PROPERTY_OTHERCLASSIFICATIONLEVEL = "OtherClassificationLevel"; //$NON-NLS-1$
	/**
	*	Description of the authority when the value 1 ("Other") is specified for the property, ProtectionAuthorities.
	*/
	public final static String CIM_PROPERTY_OTHERPROTECTIONAUTHORITIES = "OtherProtectionAuthorities"; //$NON-NLS-1$
	/**
	*	These are the values to be matched when MatchConditionType is 2 or 3 - meaning that "Protection Authority" should be filtered. In RFC1108, the following authorities are specified: GENSER, SIOP-ESI, SCI, NSA and DOE. Note that multiple authorities may be specified. 

This enumeration is modified from its definition in the RFC and IETF's IPSP Policy Model. Those lists are simply bit maps, and do not include specific values for "Other" or "No Filtering".
	*/
	public final static String CIM_PROPERTY_PROTECTIONAUTHORITIES = "ProtectionAuthorities"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CLASSIFICATIONLEVEL);
		CIM_PropertyNameList.add(CIM_PROPERTY_MATCHCONDITIONTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERCLASSIFICATIONLEVEL);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERPROTECTIONAUTHORITIES);
		CIM_PropertyNameList.add(CIM_PROPERTY_PROTECTIONAUTHORITIES);
				
		for (int i = 0; i < CIM_FilterEntryBase.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_FilterEntryBase.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CLASSIFICATIONLEVEL)||
				((String)CIM_FilterEntryBase.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MATCHCONDITIONTYPE)||
				((String)CIM_FilterEntryBase.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERCLASSIFICATIONLEVEL)||
				((String)CIM_FilterEntryBase.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERPROTECTIONAUTHORITIES)||
				((String)CIM_FilterEntryBase.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PROTECTIONAUTHORITIES)){
				continue;
			}
			
			CIM_IPSOFilterEntry.CIM_PropertyNameList.add(CIM_FilterEntryBase.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CLASSIFICATIONLEVEL, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MATCHCONDITIONTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERCLASSIFICATIONLEVEL, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERPROTECTIONAUTHORITIES, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PROTECTIONAUTHORITIES, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
				
		for (int i = 0; i < CIM_FilterEntryBase.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_FilterEntryBase.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CLASSIFICATIONLEVEL)||
				((CIMProperty)CIM_FilterEntryBase.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MATCHCONDITIONTYPE)||
				((CIMProperty)CIM_FilterEntryBase.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERCLASSIFICATIONLEVEL)||
				((CIMProperty)CIM_FilterEntryBase.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERPROTECTIONAUTHORITIES)||
				((CIMProperty)CIM_FilterEntryBase.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PROTECTIONAUTHORITIES)){
				continue;
			}
			
			CIM_IPSOFilterEntry.CIM_PropertyList.add(CIM_FilterEntryBase.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_FilterEntryBase.Java_Package_List.size(); i++) {
			if (((String)CIM_FilterEntryBase.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_FilterEntryBase.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_CLASSIFICATIONLEVEL = {"Other","No Filtering on Classification Level","Top Secret","Secret","Confidential","Unclassified","DMTF Reserved","Vendor Reserved"};
	public final static String[] CIM_VALUEMAP_MATCHCONDITIONTYPE = {"Classification Level","Protection Authority","Both Classification Level and Protection Authority"};
	public final static String[] CIM_VALUEMAP_PROTECTIONAUTHORITIES = {"Other","No Filtering on Protection Authority","GENSER","SIOP-ESI","SCI","NSA","DOE","DMTF Reserved","Vendor Reserved"};
	
	
	public final static String CLASSIFICATIONLEVEL_OTHER = "1";
	public final static String CLASSIFICATIONLEVEL_NOFILTERINGONCLASSIFICATIONLEVEL = "2";
	public final static String CLASSIFICATIONLEVEL_TOPSECRET = "3";
	public final static String CLASSIFICATIONLEVEL_SECRET = "4";
	public final static String CLASSIFICATIONLEVEL_CONFIDENTIAL = "5";
	public final static String CLASSIFICATIONLEVEL_UNCLASSIFIED = "6";
	public final static String CLASSIFICATIONLEVEL_DMTFRESERVED = "..";
	public final static String CLASSIFICATIONLEVEL_VENDORRESERVED = "0x8000..";
	
	public final static int MATCHCONDITIONTYPE_CLASSIFICATIONLEVEL = 2;
	public final static int MATCHCONDITIONTYPE_PROTECTIONAUTHORITY = 3;
	public final static int MATCHCONDITIONTYPE_BOTHCLASSIFICATIONLEVELANDPROTECTIONAUTHORITY = 4;
	
	public final static String PROTECTIONAUTHORITIES_OTHER = "1";
	public final static String PROTECTIONAUTHORITIES_NOFILTERINGONPROTECTIONAUTHORITY = "2";
	public final static String PROTECTIONAUTHORITIES_GENSER = "3";
	public final static String PROTECTIONAUTHORITIES_SIOP_ESI = "4";
	public final static String PROTECTIONAUTHORITIES_SCI = "5";
	public final static String PROTECTIONAUTHORITIES_NSA = "6";
	public final static String PROTECTIONAUTHORITIES_DOE = "7";
	public final static String PROTECTIONAUTHORITIES_DMTFRESERVED = "..";
	public final static String PROTECTIONAUTHORITIES_VENDORRESERVED = "0x8000..";
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_IPSOFilterEntry() {

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
	public CIM_IPSOFilterEntry(Vector keyProperties){ 
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
	public CIM_IPSOFilterEntry(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_ClassificationLevel = this.cimInstance.getProperty(CIM_PROPERTY_CLASSIFICATIONLEVEL);
		
		if (CIMProperty_ClassificationLevel == null || CIMProperty_ClassificationLevel.getValue().isEmpty() || CIMProperty_ClassificationLevel.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_CLASSIFICATIONLEVEL, "Required"});
			result = false;
		}
		
		CIMProperty CIMProperty_MatchConditionType = this.cimInstance.getProperty(CIM_PROPERTY_MATCHCONDITIONTYPE);
		
		if (CIMProperty_MatchConditionType == null || CIMProperty_MatchConditionType.getValue().isEmpty() || CIMProperty_MatchConditionType.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_MATCHCONDITIONTYPE, "Required"});
			result = false;
		}
		
		CIMProperty CIMProperty_ProtectionAuthorities = this.cimInstance.getProperty(CIM_PROPERTY_PROTECTIONAUTHORITIES);
		
		if (CIMProperty_ProtectionAuthorities == null || CIMProperty_ProtectionAuthorities.getValue().isEmpty() || CIMProperty_ProtectionAuthorities.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_PROTECTIONAUTHORITIES, "Required"});
			result = false;
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
	    
	    if (!(object instanceof CIM_IPSOFilterEntry)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_IPSOFilterEntry)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_IPSOFilterEntry)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_IPSOFilterEntry)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_IPSOFilterEntry)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_IPSOFilterEntry)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_IPSOFilterEntry)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_IPSOFilterEntry)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_IPSOFilterEntry)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_IPSOFilterEntry)object).cimObjectPath)) {
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
	
	// Attribute ClassificationLevel
	
	public UnsignedInt16 get_ClassificationLevel() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPSOFilterEntry.CIM_PROPERTY_CLASSIFICATIONLEVEL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPSOFilterEntry.CIM_PROPERTY_CLASSIFICATIONLEVEL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPSOFilterEntry.CIM_PROPERTY_CLASSIFICATIONLEVEL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ClassificationLevel(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPSOFilterEntry.CIM_PROPERTY_CLASSIFICATIONLEVEL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPSOFilterEntry.CIM_PROPERTY_CLASSIFICATIONLEVEL + " could not be found");
    		
		} else if (!CIM_IPSOFilterEntryHelper.isValid_ClassificationLevel(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPSOFilterEntry.CIM_PROPERTY_CLASSIFICATIONLEVEL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPSOFilterEntry.CIM_PROPERTY_CLASSIFICATIONLEVEL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MatchConditionType
	
	public UnsignedInt16 get_MatchConditionType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPSOFilterEntry.CIM_PROPERTY_MATCHCONDITIONTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPSOFilterEntry.CIM_PROPERTY_MATCHCONDITIONTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPSOFilterEntry.CIM_PROPERTY_MATCHCONDITIONTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MatchConditionType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPSOFilterEntry.CIM_PROPERTY_MATCHCONDITIONTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPSOFilterEntry.CIM_PROPERTY_MATCHCONDITIONTYPE + " could not be found");
    		
		} else if (!CIM_IPSOFilterEntryHelper.isValid_MatchConditionType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPSOFilterEntry.CIM_PROPERTY_MATCHCONDITIONTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPSOFilterEntry.CIM_PROPERTY_MATCHCONDITIONTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherClassificationLevel
	
	public String get_OtherClassificationLevel() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPSOFilterEntry.CIM_PROPERTY_OTHERCLASSIFICATIONLEVEL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPSOFilterEntry.CIM_PROPERTY_OTHERCLASSIFICATIONLEVEL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPSOFilterEntry.CIM_PROPERTY_OTHERCLASSIFICATIONLEVEL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherClassificationLevel(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPSOFilterEntry.CIM_PROPERTY_OTHERCLASSIFICATIONLEVEL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPSOFilterEntry.CIM_PROPERTY_OTHERCLASSIFICATIONLEVEL + " could not be found");
    		
		} else if (!CIM_IPSOFilterEntryHelper.isValid_OtherClassificationLevel(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPSOFilterEntry.CIM_PROPERTY_OTHERCLASSIFICATIONLEVEL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPSOFilterEntry.CIM_PROPERTY_OTHERCLASSIFICATIONLEVEL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherProtectionAuthorities
	
	public String[] get_OtherProtectionAuthorities() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPSOFilterEntry.CIM_PROPERTY_OTHERPROTECTIONAUTHORITIES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPSOFilterEntry.CIM_PROPERTY_OTHERPROTECTIONAUTHORITIES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPSOFilterEntry.CIM_PROPERTY_OTHERPROTECTIONAUTHORITIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_OtherProtectionAuthorities(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPSOFilterEntry.CIM_PROPERTY_OTHERPROTECTIONAUTHORITIES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPSOFilterEntry.CIM_PROPERTY_OTHERPROTECTIONAUTHORITIES + " could not be found");
    		
		} else if (!CIM_IPSOFilterEntryHelper.isValid_OtherProtectionAuthorities(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPSOFilterEntry.CIM_PROPERTY_OTHERPROTECTIONAUTHORITIES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPSOFilterEntry.CIM_PROPERTY_OTHERPROTECTIONAUTHORITIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ProtectionAuthorities
	
	public UnsignedInt16[] get_ProtectionAuthorities() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPSOFilterEntry.CIM_PROPERTY_PROTECTIONAUTHORITIES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPSOFilterEntry.CIM_PROPERTY_PROTECTIONAUTHORITIES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPSOFilterEntry.CIM_PROPERTY_PROTECTIONAUTHORITIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		UnsignedInt16[] resultArray = new UnsignedInt16[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (UnsignedInt16)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_ProtectionAuthorities(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPSOFilterEntry.CIM_PROPERTY_PROTECTIONAUTHORITIES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPSOFilterEntry.CIM_PROPERTY_PROTECTIONAUTHORITIES + " could not be found");
    		
		} else if (!CIM_IPSOFilterEntryHelper.isValid_ProtectionAuthorities(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPSOFilterEntry.CIM_PROPERTY_PROTECTIONAUTHORITIES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPSOFilterEntry.CIM_PROPERTY_PROTECTIONAUTHORITIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
