/** 
 * CIM_FormattedIndicationSubscription.java
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
 * Description:  A subclass of IndicationSubscription that defines the text formatting of
 * Indication information. The TextFormatOwningEntity, TextFormatID, TextFormat,
 * and TextFormatParameters properties are used to describe a human-readable
 * representation of the Indication as defined by the referenced
 * CIM_IndicationFilter. This representation MAY be used by the
 * CIM_ListenerDestination when the intended consumer of the Indication is
 * human. For example, this format could be used when writing the Indication to
 * a system log or sending an e-mail notification to a system administrator.
 * 
 */

package org.sblim.wbemsmt.schema.cim_2_14;

import java.security.InvalidParameterException;
import java.util.Iterator;
import java.util.Vector;

import org.sblim.wbem.cim.CIMDataType;
import org.sblim.wbem.cim.CIMException;
import org.sblim.wbem.cim.CIMInstance;
import org.sblim.wbem.cim.CIMObjectPath;
import org.sblim.wbem.cim.CIMProperty;
import org.sblim.wbem.cim.CIMValue;


/**
 *  A subclass of IndicationSubscription that defines the text formatting of
 * Indication information. The TextFormatOwningEntity, TextFormatID, TextFormat,
 * and TextFormatParameters properties are used to describe a human-readable
 * representation of the Indication as defined by the referenced
 * CIM_IndicationFilter. This representation MAY be used by the
 * CIM_ListenerDestination when the intended consumer of the Indication is
 * human. For example, this format could be used when writing the Indication to
 * a system log or sending an e-mail notification to a system administrator.
 */
public class CIM_FormattedIndicationSubscription extends CIM_IndicationSubscription  {
	
	public final static String CIM_CLASS_NAME = "CIM_FormattedIndicationSubscription"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.10.0";
	
	
	/**
	*	A string describing the human-readable format for representing the Indications described by this Subscription. The actual text is constructed by applying the dynamic content, defined in the Indication, to the string specified in this property. /n /n The dynamic content is specified by embedding the following syntax in the appropriate places in the format string: 
"{" <index>["["[<index>]"]"],<type>"}" 
- the first occurrence of <index> defines the element of TextFormatParameters that contains the name of the Indication property to be used to populate the text message. 
- if the Indication property defined by the first <index> is an array property, then the first index MUST be followed by either empty brackets (i.e., []) or an index value enclosed in brackets (e.g., [1]). If empty brackets are specified (e.g., {4[], string}), then the dynamic content of the text message is populated with a list of the array elements. If an index is specified (e.g., {4[1], string}, then only the specified array element is used to populate the message. If the value of the dynamic content is not defined in the Indication, then the string "UNKNOWN" is used to populate the text message. 
- <type> defines the type of the dynamic content. Valid values for <type> are: 'boolean', 'string', 'char16', 'uint8', 'sint8', 'uint16', 'sint16', 'uint32', 'sint32', 'uint64', 'sint64', 'datetime', 'real32', 'real64' or 'ref'. 

The string encoding for the dynamic content MUST conform to the MOF Syntax Grammar described in the CIM Infrastructure Specification. The string encoding for a list of array elements MUST conform to the definition of the arrayInitializer element. 
As an example, a format string for a UPS AlertIndication could be defined as follows: "A {4,string} UPS Alert of type {5,uint16} was detected on the device {6,string} on the system {2,string} at {1,datetime}. The following actions have been recommended to resolve the alert: {3[],string}".
	*/
	public final static String CIM_PROPERTY_TEXTFORMAT = "TextFormat"; //$NON-NLS-1$
	/**
	*	An opaque string that uniquely identifies, within the scope of the TextFormatOwningEntity, a human-readable format for representing the Indications described by this Subscription.
	*/
	public final static String CIM_PROPERTY_TEXTFORMATID = "TextFormatID"; //$NON-NLS-1$
	/**
	*	The TextFormatOwningEntity is a string that uniquely identifies the entity that owns the definition of the human-readable format described in this instance. OwningEntity MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity or standards body defining the format.
	*/
	public final static String CIM_PROPERTY_TEXTFORMATOWNINGENTITY = "TextFormatOwningEntity"; //$NON-NLS-1$
	/**
	*	An indexed array containing the names of properties defined in the select clause of the associated CIM_IndicationFilter Query. The values of these Indication properties are used to populate the dynamic content of the text message.
	*/
	public final static String CIM_PROPERTY_TEXTFORMATPARAMETERS = "TextFormatParameters"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_TEXTFORMAT);
		CIM_PropertyNameList.add(CIM_PROPERTY_TEXTFORMATID);
		CIM_PropertyNameList.add(CIM_PROPERTY_TEXTFORMATOWNINGENTITY);
		CIM_PropertyNameList.add(CIM_PROPERTY_TEXTFORMATPARAMETERS);
				
		for (int i = 0; i < CIM_IndicationSubscription.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_IndicationSubscription.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TEXTFORMAT)||
				((String)CIM_IndicationSubscription.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TEXTFORMATID)||
				((String)CIM_IndicationSubscription.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TEXTFORMATOWNINGENTITY)||
				((String)CIM_IndicationSubscription.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TEXTFORMATPARAMETERS)){
				continue;
			}
			
			CIM_FormattedIndicationSubscription.CIM_PropertyNameList.add(CIM_IndicationSubscription.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TEXTFORMAT, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TEXTFORMATID, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TEXTFORMATOWNINGENTITY, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TEXTFORMATPARAMETERS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		
				
		for (int i = 0; i < CIM_IndicationSubscription.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_IndicationSubscription.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TEXTFORMAT)||
				((CIMProperty)CIM_IndicationSubscription.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TEXTFORMATID)||
				((CIMProperty)CIM_IndicationSubscription.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TEXTFORMATOWNINGENTITY)||
				((CIMProperty)CIM_IndicationSubscription.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TEXTFORMATPARAMETERS)){
				continue;
			}
			
			CIM_FormattedIndicationSubscription.CIM_PropertyList.add(CIM_IndicationSubscription.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_IndicationSubscription.Java_Package_List.size(); i++) {
			if (((String)CIM_IndicationSubscription.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_IndicationSubscription.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_FormattedIndicationSubscription() {

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
	public CIM_FormattedIndicationSubscription(Vector keyProperties){ 
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
	public CIM_FormattedIndicationSubscription(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_FormattedIndicationSubscription)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_FormattedIndicationSubscription)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_FormattedIndicationSubscription)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_FormattedIndicationSubscription)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_FormattedIndicationSubscription)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_FormattedIndicationSubscription)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_FormattedIndicationSubscription)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_FormattedIndicationSubscription)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_FormattedIndicationSubscription)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_FormattedIndicationSubscription)object).cimObjectPath)) {
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
	
	// Attribute TextFormat
	
	public String get_TextFormat() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FormattedIndicationSubscription.CIM_PROPERTY_TEXTFORMAT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FormattedIndicationSubscription.CIM_PROPERTY_TEXTFORMAT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FormattedIndicationSubscription.CIM_PROPERTY_TEXTFORMAT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TextFormat(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FormattedIndicationSubscription.CIM_PROPERTY_TEXTFORMAT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FormattedIndicationSubscription.CIM_PROPERTY_TEXTFORMAT + " could not be found");
    		
		} else if (!CIM_FormattedIndicationSubscriptionHelper.isValid_TextFormat(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FormattedIndicationSubscription.CIM_PROPERTY_TEXTFORMAT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FormattedIndicationSubscription.CIM_PROPERTY_TEXTFORMAT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TextFormatID
	
	public String get_TextFormatID() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FormattedIndicationSubscription.CIM_PROPERTY_TEXTFORMATID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FormattedIndicationSubscription.CIM_PROPERTY_TEXTFORMATID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FormattedIndicationSubscription.CIM_PROPERTY_TEXTFORMATID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TextFormatID(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FormattedIndicationSubscription.CIM_PROPERTY_TEXTFORMATID);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FormattedIndicationSubscription.CIM_PROPERTY_TEXTFORMATID + " could not be found");
    		
		} else if (!CIM_FormattedIndicationSubscriptionHelper.isValid_TextFormatID(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FormattedIndicationSubscription.CIM_PROPERTY_TEXTFORMATID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FormattedIndicationSubscription.CIM_PROPERTY_TEXTFORMATID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TextFormatOwningEntity
	
	public String get_TextFormatOwningEntity() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FormattedIndicationSubscription.CIM_PROPERTY_TEXTFORMATOWNINGENTITY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FormattedIndicationSubscription.CIM_PROPERTY_TEXTFORMATOWNINGENTITY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FormattedIndicationSubscription.CIM_PROPERTY_TEXTFORMATOWNINGENTITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TextFormatOwningEntity(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FormattedIndicationSubscription.CIM_PROPERTY_TEXTFORMATOWNINGENTITY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FormattedIndicationSubscription.CIM_PROPERTY_TEXTFORMATOWNINGENTITY + " could not be found");
    		
		} else if (!CIM_FormattedIndicationSubscriptionHelper.isValid_TextFormatOwningEntity(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FormattedIndicationSubscription.CIM_PROPERTY_TEXTFORMATOWNINGENTITY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FormattedIndicationSubscription.CIM_PROPERTY_TEXTFORMATOWNINGENTITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TextFormatParameters
	
	public String[] get_TextFormatParameters() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FormattedIndicationSubscription.CIM_PROPERTY_TEXTFORMATPARAMETERS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FormattedIndicationSubscription.CIM_PROPERTY_TEXTFORMATPARAMETERS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FormattedIndicationSubscription.CIM_PROPERTY_TEXTFORMATPARAMETERS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_TextFormatParameters(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FormattedIndicationSubscription.CIM_PROPERTY_TEXTFORMATPARAMETERS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FormattedIndicationSubscription.CIM_PROPERTY_TEXTFORMATPARAMETERS + " could not be found");
    		
		} else if (!CIM_FormattedIndicationSubscriptionHelper.isValid_TextFormatParameters(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FormattedIndicationSubscription.CIM_PROPERTY_TEXTFORMATPARAMETERS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FormattedIndicationSubscription.CIM_PROPERTY_TEXTFORMATPARAMETERS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
