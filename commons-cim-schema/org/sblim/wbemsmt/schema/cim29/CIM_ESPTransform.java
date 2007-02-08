/** 
 * CIM_ESPTransform.java
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
 * Description: ESPTransform defines the parameters used for a phase 2 ESP (Encapsulating Security Protocol) Security Association.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_ESPTransform extends CIM_SATransform  {
	
	public final static String CIM_CLASS_NAME = "CIM_ESPTransform";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	
	
	/**
	*	CipherKeyLength specifies, in bits, the key length for the encryption algorithm. For algorithms with fixed key lengths, this value is ignored.
	*/
	public final static String CIM_PROPERTY_CIPHERKEYLENGTH = "CipherKeyLength"; //$NON-NLS-1$
	/**
	*	CipherKeyRounds specifies the key rounds for the encryption algorithm. For algorithms with a fixed number of key rounds, this value is ignored. Currently, key rounds are NOT defined for any ESP encryption algorithms.
	*/
	public final static String CIM_PROPERTY_CIPHERKEYROUNDS = "CipherKeyRounds"; //$NON-NLS-1$
	/**
	*	CipherTransformId is an enumeration that specifies the ESP encrypion algorithm to be used. The list of values is defined in RFC2407, Section 4.4.4, where the RFC's NULL value maps to 2-"None". Note that the enumeration is different than the RFC list, since 'Other' is added to the enumeration.
	*/
	public final static String CIM_PROPERTY_CIPHERTRANSFORMID = "CipherTransformId"; //$NON-NLS-1$
	/**
	*	IntegrityTransformId is an enumeration that specifies the ESP integrity algorithm to be used. The list of values is generated from the enumeration defined in RFC2407, Section 4.5. Note that the enumeration is different than the RFC list, since the values of Other and None are taken into account. Also, note that 2 ("None") is used when ESP is negotiated without authentication.
	*/
	public final static String CIM_PROPERTY_INTEGRITYTRANSFORMID = "IntegrityTransformId"; //$NON-NLS-1$
	/**
	*	Description of the encryption algorithm when the value 1 ("Other") is specified for the property, CipherTransformId.
	*/
	public final static String CIM_PROPERTY_OTHERCIPHERTRANSFORMID = "OtherCipherTransformId"; //$NON-NLS-1$
	/**
	*	Description of the integrity algorithm when the value 1 ("Other") is specified for the property, IntegrityTransformId.
	*/
	public final static String CIM_PROPERTY_OTHERINTEGRITYTRANSFORMID = "OtherIntegrityTransformId"; //$NON-NLS-1$
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
		CIM_PropertyNameList.add(CIM_PROPERTY_CIPHERKEYLENGTH);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIPHERKEYROUNDS);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIPHERTRANSFORMID);
		CIM_PropertyNameList.add(CIM_PROPERTY_INTEGRITYTRANSFORMID);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERCIPHERTRANSFORMID);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERINTEGRITYTRANSFORMID);
		CIM_PropertyNameList.add(CIM_PROPERTY_REPLAYPREVENTIONWINDOWSIZE);
		CIM_PropertyNameList.add(CIM_PROPERTY_USEREPLAYPREVENTION);
				
		for (int i = 0; i < CIM_SATransform.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_SATransform.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CIPHERKEYLENGTH)||
				((String)CIM_SATransform.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CIPHERKEYROUNDS)||
				((String)CIM_SATransform.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CIPHERTRANSFORMID)||
				((String)CIM_SATransform.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INTEGRITYTRANSFORMID)||
				((String)CIM_SATransform.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERCIPHERTRANSFORMID)||
				((String)CIM_SATransform.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERINTEGRITYTRANSFORMID)||
				((String)CIM_SATransform.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REPLAYPREVENTIONWINDOWSIZE)||
				((String)CIM_SATransform.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_USEREPLAYPREVENTION)){
				continue;
			}
			
			CIM_ESPTransform.CIM_PropertyNameList.add(CIM_SATransform.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIPHERKEYLENGTH, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIPHERKEYROUNDS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIPHERTRANSFORMID, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INTEGRITYTRANSFORMID, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERCIPHERTRANSFORMID, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERINTEGRITYTRANSFORMID, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REPLAYPREVENTIONWINDOWSIZE, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_USEREPLAYPREVENTION, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
				
		for (int i = 0; i < CIM_SATransform.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_SATransform.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CIPHERKEYLENGTH)||
				((CIMProperty)CIM_SATransform.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CIPHERKEYROUNDS)||
				((CIMProperty)CIM_SATransform.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CIPHERTRANSFORMID)||
				((CIMProperty)CIM_SATransform.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INTEGRITYTRANSFORMID)||
				((CIMProperty)CIM_SATransform.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERCIPHERTRANSFORMID)||
				((CIMProperty)CIM_SATransform.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERINTEGRITYTRANSFORMID)||
				((CIMProperty)CIM_SATransform.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REPLAYPREVENTIONWINDOWSIZE)||
				((CIMProperty)CIM_SATransform.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_USEREPLAYPREVENTION)){
				continue;
			}
			
			CIM_ESPTransform.CIM_PropertyList.add(CIM_SATransform.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_SATransform.Java_Package_List.size(); i++) {
			if (((String)CIM_SATransform.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_SATransform.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_CIPHERTRANSFORMID = {"Other","None","DES_IV64","DES","3DES","RC5","IDEA","CAST","Blowfish","3-IDEA","DES_IV32","RC4"};
	public final static String[] CIM_VALUEMAP_INTEGRITYTRANSFORMID = {"Other","None","MD5","SHA-1","DES","KPDK","DMTF/IANA Reserved","Vendor Reserved"};
	
	
	public final static int CIPHERTRANSFORMID_OTHER = 1;
	public final static int CIPHERTRANSFORMID_NONE = 2;
	public final static int CIPHERTRANSFORMID_DES_IV64 = 3;
	public final static int CIPHERTRANSFORMID_DES = 4;
	public final static int CIPHERTRANSFORMID_3DES = 5;
	public final static int CIPHERTRANSFORMID_RC5 = 6;
	public final static int CIPHERTRANSFORMID_IDEA = 7;
	public final static int CIPHERTRANSFORMID_CAST = 8;
	public final static int CIPHERTRANSFORMID_BLOWFISH = 9;
	public final static int CIPHERTRANSFORMID_3_IDEA = 10;
	public final static int CIPHERTRANSFORMID_DES_IV32 = 11;
	public final static int CIPHERTRANSFORMID_RC4 = 12;
	
	public final static String INTEGRITYTRANSFORMID_OTHER = "1";
	public final static String INTEGRITYTRANSFORMID_NONE = "2";
	public final static String INTEGRITYTRANSFORMID_MD5 = "3";
	public final static String INTEGRITYTRANSFORMID_SHA_1 = "4";
	public final static String INTEGRITYTRANSFORMID_DES = "5";
	public final static String INTEGRITYTRANSFORMID_KPDK = "6";
	public final static String INTEGRITYTRANSFORMID_DMTF_IANARESERVED = "7..61439";
	public final static String INTEGRITYTRANSFORMID_VENDORRESERVED = "61440..65535";
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_ESPTransform() {

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
	public CIM_ESPTransform(Vector keyProperties){ 
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
	public CIM_ESPTransform(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_ESPTransform)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_ESPTransform)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_ESPTransform)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_ESPTransform)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_ESPTransform)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_ESPTransform)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_ESPTransform)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_ESPTransform)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_ESPTransform)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_ESPTransform)object).cimObjectPath)) {
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
	
	// Attribute CipherKeyLength
	
	public UnsignedInt16 get_CipherKeyLength() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ESPTransform.CIM_PROPERTY_CIPHERKEYLENGTH);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ESPTransform.CIM_PROPERTY_CIPHERKEYLENGTH + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ESPTransform.CIM_PROPERTY_CIPHERKEYLENGTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CipherKeyLength(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ESPTransform.CIM_PROPERTY_CIPHERKEYLENGTH);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ESPTransform.CIM_PROPERTY_CIPHERKEYLENGTH + " could not be found");
    		
		} else if (!CIM_ESPTransformHelper.isValid_CipherKeyLength(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ESPTransform.CIM_PROPERTY_CIPHERKEYLENGTH);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ESPTransform.CIM_PROPERTY_CIPHERKEYLENGTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CipherKeyRounds
	
	public UnsignedInt16 get_CipherKeyRounds() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ESPTransform.CIM_PROPERTY_CIPHERKEYROUNDS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ESPTransform.CIM_PROPERTY_CIPHERKEYROUNDS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ESPTransform.CIM_PROPERTY_CIPHERKEYROUNDS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CipherKeyRounds(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ESPTransform.CIM_PROPERTY_CIPHERKEYROUNDS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ESPTransform.CIM_PROPERTY_CIPHERKEYROUNDS + " could not be found");
    		
		} else if (!CIM_ESPTransformHelper.isValid_CipherKeyRounds(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ESPTransform.CIM_PROPERTY_CIPHERKEYROUNDS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ESPTransform.CIM_PROPERTY_CIPHERKEYROUNDS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CipherTransformId
	
	public UnsignedInt16 get_CipherTransformId() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ESPTransform.CIM_PROPERTY_CIPHERTRANSFORMID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ESPTransform.CIM_PROPERTY_CIPHERTRANSFORMID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ESPTransform.CIM_PROPERTY_CIPHERTRANSFORMID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CipherTransformId(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ESPTransform.CIM_PROPERTY_CIPHERTRANSFORMID);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ESPTransform.CIM_PROPERTY_CIPHERTRANSFORMID + " could not be found");
    		
		} else if (!CIM_ESPTransformHelper.isValid_CipherTransformId(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ESPTransform.CIM_PROPERTY_CIPHERTRANSFORMID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ESPTransform.CIM_PROPERTY_CIPHERTRANSFORMID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute IntegrityTransformId
	
	public UnsignedInt16 get_IntegrityTransformId() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ESPTransform.CIM_PROPERTY_INTEGRITYTRANSFORMID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ESPTransform.CIM_PROPERTY_INTEGRITYTRANSFORMID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ESPTransform.CIM_PROPERTY_INTEGRITYTRANSFORMID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IntegrityTransformId(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ESPTransform.CIM_PROPERTY_INTEGRITYTRANSFORMID);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ESPTransform.CIM_PROPERTY_INTEGRITYTRANSFORMID + " could not be found");
    		
		} else if (!CIM_ESPTransformHelper.isValid_IntegrityTransformId(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ESPTransform.CIM_PROPERTY_INTEGRITYTRANSFORMID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ESPTransform.CIM_PROPERTY_INTEGRITYTRANSFORMID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherCipherTransformId
	
	public String get_OtherCipherTransformId() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ESPTransform.CIM_PROPERTY_OTHERCIPHERTRANSFORMID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ESPTransform.CIM_PROPERTY_OTHERCIPHERTRANSFORMID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ESPTransform.CIM_PROPERTY_OTHERCIPHERTRANSFORMID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherCipherTransformId(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ESPTransform.CIM_PROPERTY_OTHERCIPHERTRANSFORMID);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ESPTransform.CIM_PROPERTY_OTHERCIPHERTRANSFORMID + " could not be found");
    		
		} else if (!CIM_ESPTransformHelper.isValid_OtherCipherTransformId(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ESPTransform.CIM_PROPERTY_OTHERCIPHERTRANSFORMID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ESPTransform.CIM_PROPERTY_OTHERCIPHERTRANSFORMID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherIntegrityTransformId
	
	public String get_OtherIntegrityTransformId() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ESPTransform.CIM_PROPERTY_OTHERINTEGRITYTRANSFORMID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ESPTransform.CIM_PROPERTY_OTHERINTEGRITYTRANSFORMID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ESPTransform.CIM_PROPERTY_OTHERINTEGRITYTRANSFORMID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherIntegrityTransformId(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ESPTransform.CIM_PROPERTY_OTHERINTEGRITYTRANSFORMID);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ESPTransform.CIM_PROPERTY_OTHERINTEGRITYTRANSFORMID + " could not be found");
    		
		} else if (!CIM_ESPTransformHelper.isValid_OtherIntegrityTransformId(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ESPTransform.CIM_PROPERTY_OTHERINTEGRITYTRANSFORMID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ESPTransform.CIM_PROPERTY_OTHERINTEGRITYTRANSFORMID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ReplayPreventionWindowSize
	
	public UnsignedInt32 get_ReplayPreventionWindowSize() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ESPTransform.CIM_PROPERTY_REPLAYPREVENTIONWINDOWSIZE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ESPTransform.CIM_PROPERTY_REPLAYPREVENTIONWINDOWSIZE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ESPTransform.CIM_PROPERTY_REPLAYPREVENTIONWINDOWSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ReplayPreventionWindowSize(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ESPTransform.CIM_PROPERTY_REPLAYPREVENTIONWINDOWSIZE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ESPTransform.CIM_PROPERTY_REPLAYPREVENTIONWINDOWSIZE + " could not be found");
    		
		} else if (!CIM_ESPTransformHelper.isValid_ReplayPreventionWindowSize(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ESPTransform.CIM_PROPERTY_REPLAYPREVENTIONWINDOWSIZE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ESPTransform.CIM_PROPERTY_REPLAYPREVENTIONWINDOWSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute UseReplayPrevention
	
	public Boolean get_UseReplayPrevention() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ESPTransform.CIM_PROPERTY_USEREPLAYPREVENTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ESPTransform.CIM_PROPERTY_USEREPLAYPREVENTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ESPTransform.CIM_PROPERTY_USEREPLAYPREVENTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_UseReplayPrevention(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ESPTransform.CIM_PROPERTY_USEREPLAYPREVENTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ESPTransform.CIM_PROPERTY_USEREPLAYPREVENTION + " could not be found");
    		
		} else if (!CIM_ESPTransformHelper.isValid_UseReplayPrevention(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ESPTransform.CIM_PROPERTY_USEREPLAYPREVENTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ESPTransform.CIM_PROPERTY_USEREPLAYPREVENTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
