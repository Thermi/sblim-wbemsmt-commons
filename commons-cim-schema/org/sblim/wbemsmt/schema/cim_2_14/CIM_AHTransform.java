/** 
 * CIM_AHTransform.java
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
 * Description:  AHTransform defines the parameters used for a phase 2 AH (Authentication
 * Header) Security Association.
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
import org.sblim.wbem.cim.UnsignedInt16;
import org.sblim.wbem.cim.UnsignedInt32;


/**
 *  AHTransform defines the parameters used for a phase 2 AH (Authentication
 * Header) Security Association.
 */
public class CIM_AHTransform extends CIM_SATransform  {
	
	public final static String CIM_CLASS_NAME = "CIM_AHTransform"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	
	
	/**
	*	AHTransformId is an enumeration that specifies the hash algorithm to be used. The list of values was generated from RFC2407, Section 4.4.3.
	*/
	public final static String CIM_PROPERTY_AHTRANSFORMID = "AHTransformId"; //$NON-NLS-1$
	/**
	*	Description of the hash algorithm when the value 1 ("Other") is specified for the property, AHTransformId.
	*/
	public final static String CIM_PROPERTY_OTHERAHTRANSFORMID = "OtherAHTransformId"; //$NON-NLS-1$
	/**
	*	ReplayPreventionWindowsSize specifies, in bits, the length of the sliding window used by the replay prevention mechanism. The value of this property is meaningless if UseReplayPrevention is false. The window size MUST be a power of 2.
	*/
	public final static String CIM_PROPERTY_REPLAYPREVENTIONWINDOWSIZE = "ReplayPreventionWindowSize"; //$NON-NLS-1$
	/**
	*	UseReplayPrevention causes the local peer to enable replay prevention detection. This can be accomplished by using a sequence number when sending a packet or checking the sequence number upon receipt of a packet.
	*/
	public final static String CIM_PROPERTY_USEREPLAYPREVENTION = "UseReplayPrevention"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_AHTRANSFORMID);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERAHTRANSFORMID);
		CIM_PropertyNameList.add(CIM_PROPERTY_REPLAYPREVENTIONWINDOWSIZE);
		CIM_PropertyNameList.add(CIM_PROPERTY_USEREPLAYPREVENTION);
				
		for (int i = 0; i < CIM_SATransform.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_SATransform.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_AHTRANSFORMID)||
				((String)CIM_SATransform.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERAHTRANSFORMID)||
				((String)CIM_SATransform.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REPLAYPREVENTIONWINDOWSIZE)||
				((String)CIM_SATransform.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_USEREPLAYPREVENTION)){
				continue;
			}
			
			CIM_AHTransform.CIM_PropertyNameList.add(CIM_SATransform.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_AHTRANSFORMID, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERAHTRANSFORMID, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REPLAYPREVENTIONWINDOWSIZE, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_USEREPLAYPREVENTION, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
				
		for (int i = 0; i < CIM_SATransform.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_SATransform.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_AHTRANSFORMID)||
				((CIMProperty)CIM_SATransform.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERAHTRANSFORMID)||
				((CIMProperty)CIM_SATransform.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REPLAYPREVENTIONWINDOWSIZE)||
				((CIMProperty)CIM_SATransform.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_USEREPLAYPREVENTION)){
				continue;
			}
			
			CIM_AHTransform.CIM_PropertyList.add(CIM_SATransform.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_SATransform.Java_Package_List.size(); i++) {
			if (((String)CIM_SATransform.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_SATransform.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_AHTRANSFORMID = {"Other","MD5","SHA-1","DES"};
	
	
	public final static int AHTRANSFORMID_OTHER = 1;
	public final static int AHTRANSFORMID_MD5 = 2;
	public final static int AHTRANSFORMID_SHA_1 = 3;
	public final static int AHTRANSFORMID_DES = 4;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_AHTransform() {

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
	public CIM_AHTransform(Vector keyProperties){ 
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
	public CIM_AHTransform(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_AHTransform)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_AHTransform)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_AHTransform)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_AHTransform)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_AHTransform)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_AHTransform)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_AHTransform)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_AHTransform)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_AHTransform)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_AHTransform)object).cimObjectPath)) {
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
	
	// Attribute AHTransformId
	
	public UnsignedInt16 get_AHTransformId() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AHTransform.CIM_PROPERTY_AHTRANSFORMID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AHTransform.CIM_PROPERTY_AHTRANSFORMID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AHTransform.CIM_PROPERTY_AHTRANSFORMID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AHTransformId(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AHTransform.CIM_PROPERTY_AHTRANSFORMID);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AHTransform.CIM_PROPERTY_AHTRANSFORMID + " could not be found");
    		
		} else if (!CIM_AHTransformHelper.isValid_AHTransformId(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AHTransform.CIM_PROPERTY_AHTRANSFORMID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AHTransform.CIM_PROPERTY_AHTRANSFORMID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherAHTransformId
	
	public String get_OtherAHTransformId() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AHTransform.CIM_PROPERTY_OTHERAHTRANSFORMID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AHTransform.CIM_PROPERTY_OTHERAHTRANSFORMID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AHTransform.CIM_PROPERTY_OTHERAHTRANSFORMID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherAHTransformId(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AHTransform.CIM_PROPERTY_OTHERAHTRANSFORMID);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AHTransform.CIM_PROPERTY_OTHERAHTRANSFORMID + " could not be found");
    		
		} else if (!CIM_AHTransformHelper.isValid_OtherAHTransformId(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AHTransform.CIM_PROPERTY_OTHERAHTRANSFORMID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AHTransform.CIM_PROPERTY_OTHERAHTRANSFORMID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ReplayPreventionWindowSize
	
	public UnsignedInt32 get_ReplayPreventionWindowSize() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AHTransform.CIM_PROPERTY_REPLAYPREVENTIONWINDOWSIZE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AHTransform.CIM_PROPERTY_REPLAYPREVENTIONWINDOWSIZE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AHTransform.CIM_PROPERTY_REPLAYPREVENTIONWINDOWSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ReplayPreventionWindowSize(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AHTransform.CIM_PROPERTY_REPLAYPREVENTIONWINDOWSIZE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AHTransform.CIM_PROPERTY_REPLAYPREVENTIONWINDOWSIZE + " could not be found");
    		
		} else if (!CIM_AHTransformHelper.isValid_ReplayPreventionWindowSize(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AHTransform.CIM_PROPERTY_REPLAYPREVENTIONWINDOWSIZE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AHTransform.CIM_PROPERTY_REPLAYPREVENTIONWINDOWSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute UseReplayPrevention
	
	public Boolean get_UseReplayPrevention() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AHTransform.CIM_PROPERTY_USEREPLAYPREVENTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AHTransform.CIM_PROPERTY_USEREPLAYPREVENTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AHTransform.CIM_PROPERTY_USEREPLAYPREVENTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_UseReplayPrevention(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AHTransform.CIM_PROPERTY_USEREPLAYPREVENTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AHTransform.CIM_PROPERTY_USEREPLAYPREVENTION + " could not be found");
    		
		} else if (!CIM_AHTransformHelper.isValid_UseReplayPrevention(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AHTransform.CIM_PROPERTY_USEREPLAYPREVENTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AHTransform.CIM_PROPERTY_USEREPLAYPREVENTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}