/** 
 * CIM_IPCOMPTransform.java
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
 * Description: The IPCOMPTransform specifies the IP compression algorithm to use for payload of the Security Association.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_IPCOMPTransform extends CIM_SATransform  {
	
	public final static String CIM_CLASS_NAME = "CIM_IPCOMPTransform";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	
	
	/**
	*	The Algorithm is an enumeration that designates the IPCOMP compression algorithm to use. Its values are generated from RFC2407, Section 4.4.5. Note that the values are modified from the RFC, since 'Other' must be taken into account.
	*/
	public final static String CIM_PROPERTY_ALGORITHM = "Algorithm"; //$NON-NLS-1$
	/**
	*	DictionarySize is an optional field that specifies the log2 maximum size of the dictionary for the compression algorithm. For dictionaries that have a fixed size, this value is ignored.
	*/
	public final static String CIM_PROPERTY_DICTIONARYSIZE = "DictionarySize"; //$NON-NLS-1$
	/**
	*	Description of the compression algorithm when the value 1 ("Other") is specified for the property, Algorithm.
	*/
	public final static String CIM_PROPERTY_OTHERALGORITHM = "OtherAlgorithm"; //$NON-NLS-1$
	/**
	*	A private compression algorithm, used when the Algorithm property is set to 2, "Vendor Algorithm/OUI".
	*/
	public final static String CIM_PROPERTY_PRIVATEALGORITHM = "PrivateAlgorithm"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ALGORITHM);
		CIM_PropertyNameList.add(CIM_PROPERTY_DICTIONARYSIZE);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERALGORITHM);
		CIM_PropertyNameList.add(CIM_PROPERTY_PRIVATEALGORITHM);
				
		for (int i = 0; i < CIM_SATransform.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_SATransform.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ALGORITHM)||
				((String)CIM_SATransform.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DICTIONARYSIZE)||
				((String)CIM_SATransform.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERALGORITHM)||
				((String)CIM_SATransform.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PRIVATEALGORITHM)){
				continue;
			}
			
			CIM_IPCOMPTransform.CIM_PropertyNameList.add(CIM_SATransform.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ALGORITHM, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DICTIONARYSIZE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERALGORITHM, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PRIVATEALGORITHM, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
				
		for (int i = 0; i < CIM_SATransform.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_SATransform.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ALGORITHM)||
				((CIMProperty)CIM_SATransform.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DICTIONARYSIZE)||
				((CIMProperty)CIM_SATransform.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERALGORITHM)||
				((CIMProperty)CIM_SATransform.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PRIVATEALGORITHM)){
				continue;
			}
			
			CIM_IPCOMPTransform.CIM_PropertyList.add(CIM_SATransform.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_SATransform.Java_Package_List.size(); i++) {
			if (((String)CIM_SATransform.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_SATransform.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_ALGORITHM = {"Other","Vendor Algorithm/OUI","DEFLATE","LZS"};
	
	
	public final static int ALGORITHM_OTHER = 1;
	public final static int ALGORITHM_VENDORALGORITHM_OUI = 2;
	public final static int ALGORITHM_DEFLATE = 3;
	public final static int ALGORITHM_LZS = 4;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_IPCOMPTransform() {

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
	public CIM_IPCOMPTransform(Vector keyProperties){ 
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
	public CIM_IPCOMPTransform(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_IPCOMPTransform)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_IPCOMPTransform)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_IPCOMPTransform)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_IPCOMPTransform)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_IPCOMPTransform)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_IPCOMPTransform)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_IPCOMPTransform)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_IPCOMPTransform)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_IPCOMPTransform)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_IPCOMPTransform)object).cimObjectPath)) {
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
	
	// Attribute Algorithm
	
	public UnsignedInt16 get_Algorithm() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPCOMPTransform.CIM_PROPERTY_ALGORITHM);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPCOMPTransform.CIM_PROPERTY_ALGORITHM + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPCOMPTransform.CIM_PROPERTY_ALGORITHM + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Algorithm(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPCOMPTransform.CIM_PROPERTY_ALGORITHM);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPCOMPTransform.CIM_PROPERTY_ALGORITHM + " could not be found");
    		
		} else if (!CIM_IPCOMPTransformHelper.isValid_Algorithm(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPCOMPTransform.CIM_PROPERTY_ALGORITHM);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPCOMPTransform.CIM_PROPERTY_ALGORITHM + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DictionarySize
	
	public UnsignedInt16 get_DictionarySize() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPCOMPTransform.CIM_PROPERTY_DICTIONARYSIZE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPCOMPTransform.CIM_PROPERTY_DICTIONARYSIZE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPCOMPTransform.CIM_PROPERTY_DICTIONARYSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DictionarySize(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPCOMPTransform.CIM_PROPERTY_DICTIONARYSIZE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPCOMPTransform.CIM_PROPERTY_DICTIONARYSIZE + " could not be found");
    		
		} else if (!CIM_IPCOMPTransformHelper.isValid_DictionarySize(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPCOMPTransform.CIM_PROPERTY_DICTIONARYSIZE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPCOMPTransform.CIM_PROPERTY_DICTIONARYSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherAlgorithm
	
	public String get_OtherAlgorithm() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPCOMPTransform.CIM_PROPERTY_OTHERALGORITHM);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPCOMPTransform.CIM_PROPERTY_OTHERALGORITHM + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPCOMPTransform.CIM_PROPERTY_OTHERALGORITHM + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherAlgorithm(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPCOMPTransform.CIM_PROPERTY_OTHERALGORITHM);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPCOMPTransform.CIM_PROPERTY_OTHERALGORITHM + " could not be found");
    		
		} else if (!CIM_IPCOMPTransformHelper.isValid_OtherAlgorithm(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPCOMPTransform.CIM_PROPERTY_OTHERALGORITHM);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPCOMPTransform.CIM_PROPERTY_OTHERALGORITHM + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PrivateAlgorithm
	
	public UnsignedInt32 get_PrivateAlgorithm() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPCOMPTransform.CIM_PROPERTY_PRIVATEALGORITHM);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPCOMPTransform.CIM_PROPERTY_PRIVATEALGORITHM + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPCOMPTransform.CIM_PROPERTY_PRIVATEALGORITHM + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PrivateAlgorithm(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPCOMPTransform.CIM_PROPERTY_PRIVATEALGORITHM);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPCOMPTransform.CIM_PROPERTY_PRIVATEALGORITHM + " could not be found");
    		
		} else if (!CIM_IPCOMPTransformHelper.isValid_PrivateAlgorithm(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPCOMPTransform.CIM_PROPERTY_PRIVATEALGORITHM);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPCOMPTransform.CIM_PROPERTY_PRIVATEALGORITHM + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
