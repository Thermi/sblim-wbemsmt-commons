/** 
 * CIM_MediaAccessStatData.java
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
 * Description: Statistics related to reading and writing at a specific MediaAccessDevice, or for a specific StorageExtent. The same class is used to represent this data - whether for the MediaAccessDevice (independent of the StorageExtent), OR for the Extent (independent of its AccessDevice). The element whose statistics are described is associated using the relationship, ElementStatisticalData. Note that this class models the same properties as MediaAccessStatInfo. This class, however, uses the simplified key mechanisms of its superclass, StatisticalData.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_MediaAccessStatData extends CIM_StatisticalData  {
	
	public final static String CIM_CLASS_NAME = "CIM_MediaAccessStatData";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	
	
	/**
	*	The number of attempted read operations.
	*/
	public final static String CIM_PROPERTY_READOPERATIONS = "ReadOperations"; //$NON-NLS-1$
	/**
	*	The number of recovered read operations.
	*/
	public final static String CIM_PROPERTY_RECOVEREDREADOPERATIONS = "RecoveredReadOperations"; //$NON-NLS-1$
	/**
	*	The number of recovered seek operations.
	*/
	public final static String CIM_PROPERTY_RECOVEREDSEEKOPERATIONS = "RecoveredSeekOperations"; //$NON-NLS-1$
	/**
	*	The number of recovered write operations.
	*/
	public final static String CIM_PROPERTY_RECOVEREDWRITEOPERATIONS = "RecoveredWriteOperations"; //$NON-NLS-1$
	/**
	*	The number of unrecoverable read operations.
	*/
	public final static String CIM_PROPERTY_UNRECOVERABLEREADOPERATIONS = "UnrecoverableReadOperations"; //$NON-NLS-1$
	/**
	*	The number of unrecoverable seek operations.
	*/
	public final static String CIM_PROPERTY_UNRECOVERABLESEEKOPERATIONS = "UnrecoverableSeekOperations"; //$NON-NLS-1$
	/**
	*	The number of unrecoverable write operations.
	*/
	public final static String CIM_PROPERTY_UNRECOVERABLEWRITEOPERATIONS = "UnrecoverableWriteOperations"; //$NON-NLS-1$
	/**
	*	The number of attempted write operations.
	*/
	public final static String CIM_PROPERTY_WRITEOPERATIONS = "WriteOperations"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_READOPERATIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_RECOVEREDREADOPERATIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_RECOVEREDSEEKOPERATIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_RECOVEREDWRITEOPERATIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_UNRECOVERABLEREADOPERATIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_UNRECOVERABLESEEKOPERATIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_UNRECOVERABLEWRITEOPERATIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_WRITEOPERATIONS);
				
		for (int i = 0; i < CIM_StatisticalData.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_READOPERATIONS)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RECOVEREDREADOPERATIONS)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RECOVEREDSEEKOPERATIONS)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RECOVEREDWRITEOPERATIONS)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_UNRECOVERABLEREADOPERATIONS)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_UNRECOVERABLESEEKOPERATIONS)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_UNRECOVERABLEWRITEOPERATIONS)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_WRITEOPERATIONS)){
				continue;
			}
			
			CIM_MediaAccessStatData.CIM_PropertyNameList.add(CIM_StatisticalData.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_READOPERATIONS, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RECOVEREDREADOPERATIONS, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RECOVEREDSEEKOPERATIONS, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RECOVEREDWRITEOPERATIONS, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_UNRECOVERABLEREADOPERATIONS, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_UNRECOVERABLESEEKOPERATIONS, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_UNRECOVERABLEWRITEOPERATIONS, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_WRITEOPERATIONS, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
				
		for (int i = 0; i < CIM_StatisticalData.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_READOPERATIONS)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RECOVEREDREADOPERATIONS)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RECOVEREDSEEKOPERATIONS)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RECOVEREDWRITEOPERATIONS)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_UNRECOVERABLEREADOPERATIONS)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_UNRECOVERABLESEEKOPERATIONS)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_UNRECOVERABLEWRITEOPERATIONS)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_WRITEOPERATIONS)){
				continue;
			}
			
			CIM_MediaAccessStatData.CIM_PropertyList.add(CIM_StatisticalData.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_StatisticalData.Java_Package_List.size(); i++) {
			if (((String)CIM_StatisticalData.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_StatisticalData.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_MediaAccessStatData() {

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
	public CIM_MediaAccessStatData(Vector keyProperties){ 
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
	public CIM_MediaAccessStatData(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_MediaAccessStatData)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_MediaAccessStatData)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_MediaAccessStatData)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_MediaAccessStatData)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_MediaAccessStatData)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_MediaAccessStatData)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_MediaAccessStatData)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_MediaAccessStatData)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_MediaAccessStatData)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_MediaAccessStatData)object).cimObjectPath)) {
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
	
	// Attribute ReadOperations
	
	public UnsignedInt64 get_ReadOperations() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaAccessStatData.CIM_PROPERTY_READOPERATIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessStatData.CIM_PROPERTY_READOPERATIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessStatData.CIM_PROPERTY_READOPERATIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ReadOperations(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaAccessStatData.CIM_PROPERTY_READOPERATIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessStatData.CIM_PROPERTY_READOPERATIONS + " could not be found");
    		
		} else if (!CIM_MediaAccessStatDataHelper.isValid_ReadOperations(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MediaAccessStatData.CIM_PROPERTY_READOPERATIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessStatData.CIM_PROPERTY_READOPERATIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RecoveredReadOperations
	
	public UnsignedInt64 get_RecoveredReadOperations() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaAccessStatData.CIM_PROPERTY_RECOVEREDREADOPERATIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessStatData.CIM_PROPERTY_RECOVEREDREADOPERATIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessStatData.CIM_PROPERTY_RECOVEREDREADOPERATIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RecoveredReadOperations(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaAccessStatData.CIM_PROPERTY_RECOVEREDREADOPERATIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessStatData.CIM_PROPERTY_RECOVEREDREADOPERATIONS + " could not be found");
    		
		} else if (!CIM_MediaAccessStatDataHelper.isValid_RecoveredReadOperations(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MediaAccessStatData.CIM_PROPERTY_RECOVEREDREADOPERATIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessStatData.CIM_PROPERTY_RECOVEREDREADOPERATIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RecoveredSeekOperations
	
	public UnsignedInt64 get_RecoveredSeekOperations() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaAccessStatData.CIM_PROPERTY_RECOVEREDSEEKOPERATIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessStatData.CIM_PROPERTY_RECOVEREDSEEKOPERATIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessStatData.CIM_PROPERTY_RECOVEREDSEEKOPERATIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RecoveredSeekOperations(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaAccessStatData.CIM_PROPERTY_RECOVEREDSEEKOPERATIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessStatData.CIM_PROPERTY_RECOVEREDSEEKOPERATIONS + " could not be found");
    		
		} else if (!CIM_MediaAccessStatDataHelper.isValid_RecoveredSeekOperations(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MediaAccessStatData.CIM_PROPERTY_RECOVEREDSEEKOPERATIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessStatData.CIM_PROPERTY_RECOVEREDSEEKOPERATIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RecoveredWriteOperations
	
	public UnsignedInt64 get_RecoveredWriteOperations() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaAccessStatData.CIM_PROPERTY_RECOVEREDWRITEOPERATIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessStatData.CIM_PROPERTY_RECOVEREDWRITEOPERATIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessStatData.CIM_PROPERTY_RECOVEREDWRITEOPERATIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RecoveredWriteOperations(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaAccessStatData.CIM_PROPERTY_RECOVEREDWRITEOPERATIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessStatData.CIM_PROPERTY_RECOVEREDWRITEOPERATIONS + " could not be found");
    		
		} else if (!CIM_MediaAccessStatDataHelper.isValid_RecoveredWriteOperations(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MediaAccessStatData.CIM_PROPERTY_RECOVEREDWRITEOPERATIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessStatData.CIM_PROPERTY_RECOVEREDWRITEOPERATIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute UnrecoverableReadOperations
	
	public UnsignedInt64 get_UnrecoverableReadOperations() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaAccessStatData.CIM_PROPERTY_UNRECOVERABLEREADOPERATIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessStatData.CIM_PROPERTY_UNRECOVERABLEREADOPERATIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessStatData.CIM_PROPERTY_UNRECOVERABLEREADOPERATIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_UnrecoverableReadOperations(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaAccessStatData.CIM_PROPERTY_UNRECOVERABLEREADOPERATIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessStatData.CIM_PROPERTY_UNRECOVERABLEREADOPERATIONS + " could not be found");
    		
		} else if (!CIM_MediaAccessStatDataHelper.isValid_UnrecoverableReadOperations(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MediaAccessStatData.CIM_PROPERTY_UNRECOVERABLEREADOPERATIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessStatData.CIM_PROPERTY_UNRECOVERABLEREADOPERATIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute UnrecoverableSeekOperations
	
	public UnsignedInt64 get_UnrecoverableSeekOperations() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaAccessStatData.CIM_PROPERTY_UNRECOVERABLESEEKOPERATIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessStatData.CIM_PROPERTY_UNRECOVERABLESEEKOPERATIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessStatData.CIM_PROPERTY_UNRECOVERABLESEEKOPERATIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_UnrecoverableSeekOperations(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaAccessStatData.CIM_PROPERTY_UNRECOVERABLESEEKOPERATIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessStatData.CIM_PROPERTY_UNRECOVERABLESEEKOPERATIONS + " could not be found");
    		
		} else if (!CIM_MediaAccessStatDataHelper.isValid_UnrecoverableSeekOperations(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MediaAccessStatData.CIM_PROPERTY_UNRECOVERABLESEEKOPERATIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessStatData.CIM_PROPERTY_UNRECOVERABLESEEKOPERATIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute UnrecoverableWriteOperations
	
	public UnsignedInt64 get_UnrecoverableWriteOperations() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaAccessStatData.CIM_PROPERTY_UNRECOVERABLEWRITEOPERATIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessStatData.CIM_PROPERTY_UNRECOVERABLEWRITEOPERATIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessStatData.CIM_PROPERTY_UNRECOVERABLEWRITEOPERATIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_UnrecoverableWriteOperations(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaAccessStatData.CIM_PROPERTY_UNRECOVERABLEWRITEOPERATIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessStatData.CIM_PROPERTY_UNRECOVERABLEWRITEOPERATIONS + " could not be found");
    		
		} else if (!CIM_MediaAccessStatDataHelper.isValid_UnrecoverableWriteOperations(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MediaAccessStatData.CIM_PROPERTY_UNRECOVERABLEWRITEOPERATIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessStatData.CIM_PROPERTY_UNRECOVERABLEWRITEOPERATIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute WriteOperations
	
	public UnsignedInt64 get_WriteOperations() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaAccessStatData.CIM_PROPERTY_WRITEOPERATIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessStatData.CIM_PROPERTY_WRITEOPERATIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessStatData.CIM_PROPERTY_WRITEOPERATIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_WriteOperations(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaAccessStatData.CIM_PROPERTY_WRITEOPERATIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaAccessStatData.CIM_PROPERTY_WRITEOPERATIONS + " could not be found");
    		
		} else if (!CIM_MediaAccessStatDataHelper.isValid_WriteOperations(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MediaAccessStatData.CIM_PROPERTY_WRITEOPERATIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaAccessStatData.CIM_PROPERTY_WRITEOPERATIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
