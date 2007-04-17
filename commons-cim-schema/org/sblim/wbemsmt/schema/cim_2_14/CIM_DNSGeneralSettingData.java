/** 
 * CIM_DNSGeneralSettingData.java
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
 * Description:  The DNSGeneralSettingData class represents the system wide configuration
 * options for the DNS client. Therefore, these configuration parameters are
 * scoped to a computer system and are applicable to all of the network
 * interfaces of the scoping system.
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


/**
 *  The DNSGeneralSettingData class represents the system wide configuration
 * options for the DNS client. Therefore, these configuration parameters are
 * scoped to a computer system and are applicable to all of the network
 * interfaces of the scoping system.
 */
public class CIM_DNSGeneralSettingData extends CIM_IPAssignmentSettingData  {
	
	public final static String CIM_CLASS_NAME = "CIM_DNSGeneralSettingData"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.14.0";
	
	
	/**
	*	AddressOrigin identifies the method by which the IP Address, Subnet Mask, and Gateway were assigned to the IPProtocolEndpoint. This is independent of the DNS configuration, thus this property has the value of 2 ("Not Applicable")
	*/
	public final static String CIM_PROPERTY_ADDRESSORIGIN = "AddressOrigin"; //$NON-NLS-1$
	/**
	*	Whether or not the client should automatically append the parent domain suffix to target names prior to attempting to resolve.
	*/
	public final static String CIM_PROPERTY_APPENDPARENTSUFFIXES = "AppendParentSuffixes"; //$NON-NLS-1$
	/**
	*	Whether or not the client should automatically append the primary domain suffix to target names prior to attempting to resolve.
	*/
	public final static String CIM_PROPERTY_APPENDPRIMARYSUFFIXES = "AppendPrimarySuffixes"; //$NON-NLS-1$
	/**
	*	DNS suffixes to append when attempting to resolve a hostname.
	*/
	public final static String CIM_PROPERTY_DNSSUFFIXESTOAPPEND = "DNSSuffixesToAppend"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ADDRESSORIGIN);
		CIM_PropertyNameList.add(CIM_PROPERTY_APPENDPARENTSUFFIXES);
		CIM_PropertyNameList.add(CIM_PROPERTY_APPENDPRIMARYSUFFIXES);
		CIM_PropertyNameList.add(CIM_PROPERTY_DNSSUFFIXESTOAPPEND);
				
		for (int i = 0; i < CIM_IPAssignmentSettingData.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_IPAssignmentSettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ADDRESSORIGIN)||
				((String)CIM_IPAssignmentSettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_APPENDPARENTSUFFIXES)||
				((String)CIM_IPAssignmentSettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_APPENDPRIMARYSUFFIXES)||
				((String)CIM_IPAssignmentSettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DNSSUFFIXESTOAPPEND)){
				continue;
			}
			
			CIM_DNSGeneralSettingData.CIM_PropertyNameList.add(CIM_IPAssignmentSettingData.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ADDRESSORIGIN, new CIMValue(new UnsignedInt16("2"), new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_APPENDPARENTSUFFIXES, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_APPENDPRIMARYSUFFIXES, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DNSSUFFIXESTOAPPEND, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
				
		for (int i = 0; i < CIM_IPAssignmentSettingData.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_IPAssignmentSettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ADDRESSORIGIN)||
				((CIMProperty)CIM_IPAssignmentSettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_APPENDPARENTSUFFIXES)||
				((CIMProperty)CIM_IPAssignmentSettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_APPENDPRIMARYSUFFIXES)||
				((CIMProperty)CIM_IPAssignmentSettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DNSSUFFIXESTOAPPEND)){
				continue;
			}
			
			CIM_DNSGeneralSettingData.CIM_PropertyList.add(CIM_IPAssignmentSettingData.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_IPAssignmentSettingData.Java_Package_List.size(); i++) {
			if (((String)CIM_IPAssignmentSettingData.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_IPAssignmentSettingData.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_ADDRESSORIGIN = {"DMTF Reserved","Not Applicable","DMTF Reserved","Vendor Reserved"};
	
	
	public final static String ADDRESSORIGIN_DMTFRESERVED = "0..1";
	public final static String ADDRESSORIGIN_NOTAPPLICABLE = "2";
	public final static String ADDRESSORIGIN_DMTFRESERVED1 = "3..32767";
	public final static String ADDRESSORIGIN_VENDORRESERVED = "32768..";
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_DNSGeneralSettingData() {

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
	public CIM_DNSGeneralSettingData(Vector keyProperties){ 
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
	public CIM_DNSGeneralSettingData(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_DNSGeneralSettingData)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_DNSGeneralSettingData)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_DNSGeneralSettingData)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_DNSGeneralSettingData)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_DNSGeneralSettingData)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_DNSGeneralSettingData)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_DNSGeneralSettingData)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_DNSGeneralSettingData)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_DNSGeneralSettingData)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_DNSGeneralSettingData)object).cimObjectPath)) {
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
	
	// Attribute AddressOrigin
	
	public UnsignedInt16 get_AddressOrigin() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DNSGeneralSettingData.CIM_PROPERTY_ADDRESSORIGIN);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DNSGeneralSettingData.CIM_PROPERTY_ADDRESSORIGIN + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DNSGeneralSettingData.CIM_PROPERTY_ADDRESSORIGIN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AddressOrigin(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DNSGeneralSettingData.CIM_PROPERTY_ADDRESSORIGIN);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DNSGeneralSettingData.CIM_PROPERTY_ADDRESSORIGIN + " could not be found");
    		
		} else if (!CIM_DNSGeneralSettingDataHelper.isValid_AddressOrigin(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DNSGeneralSettingData.CIM_PROPERTY_ADDRESSORIGIN);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DNSGeneralSettingData.CIM_PROPERTY_ADDRESSORIGIN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute AppendParentSuffixes
	
	public Boolean get_AppendParentSuffixes() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DNSGeneralSettingData.CIM_PROPERTY_APPENDPARENTSUFFIXES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DNSGeneralSettingData.CIM_PROPERTY_APPENDPARENTSUFFIXES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DNSGeneralSettingData.CIM_PROPERTY_APPENDPARENTSUFFIXES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AppendParentSuffixes(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DNSGeneralSettingData.CIM_PROPERTY_APPENDPARENTSUFFIXES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DNSGeneralSettingData.CIM_PROPERTY_APPENDPARENTSUFFIXES + " could not be found");
    		
		} else if (!CIM_DNSGeneralSettingDataHelper.isValid_AppendParentSuffixes(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DNSGeneralSettingData.CIM_PROPERTY_APPENDPARENTSUFFIXES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DNSGeneralSettingData.CIM_PROPERTY_APPENDPARENTSUFFIXES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute AppendPrimarySuffixes
	
	public Boolean get_AppendPrimarySuffixes() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DNSGeneralSettingData.CIM_PROPERTY_APPENDPRIMARYSUFFIXES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DNSGeneralSettingData.CIM_PROPERTY_APPENDPRIMARYSUFFIXES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DNSGeneralSettingData.CIM_PROPERTY_APPENDPRIMARYSUFFIXES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AppendPrimarySuffixes(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DNSGeneralSettingData.CIM_PROPERTY_APPENDPRIMARYSUFFIXES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DNSGeneralSettingData.CIM_PROPERTY_APPENDPRIMARYSUFFIXES + " could not be found");
    		
		} else if (!CIM_DNSGeneralSettingDataHelper.isValid_AppendPrimarySuffixes(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DNSGeneralSettingData.CIM_PROPERTY_APPENDPRIMARYSUFFIXES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DNSGeneralSettingData.CIM_PROPERTY_APPENDPRIMARYSUFFIXES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DNSSuffixesToAppend
	
	public String[] get_DNSSuffixesToAppend() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DNSGeneralSettingData.CIM_PROPERTY_DNSSUFFIXESTOAPPEND);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DNSGeneralSettingData.CIM_PROPERTY_DNSSUFFIXESTOAPPEND + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DNSGeneralSettingData.CIM_PROPERTY_DNSSUFFIXESTOAPPEND + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_DNSSuffixesToAppend(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DNSGeneralSettingData.CIM_PROPERTY_DNSSUFFIXESTOAPPEND);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DNSGeneralSettingData.CIM_PROPERTY_DNSSUFFIXESTOAPPEND + " could not be found");
    		
		} else if (!CIM_DNSGeneralSettingDataHelper.isValid_DNSSuffixesToAppend(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DNSGeneralSettingData.CIM_PROPERTY_DNSSUFFIXESTOAPPEND);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DNSGeneralSettingData.CIM_PROPERTY_DNSSUFFIXESTOAPPEND + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
