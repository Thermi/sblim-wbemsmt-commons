/** 
 * CIM_AssociatedCacheMemory.java
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
 * Description: Indicates that the Memory provides Cache to the Dependent Logical Element.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_AssociatedCacheMemory extends CIM_AssociatedMemory  {
	
	public final static String CIM_CLASS_NAME = "CIM_AssociatedCacheMemory";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	
	
	/**
	*	An integer enumeration defining the system cache associativity. For example, 5 indicates a fully associative cache.
	*/
	public final static String CIM_PROPERTY_ASSOCIATIVITY = "Associativity"; //$NON-NLS-1$
	/**
	*	Defines whether this is for instruction caching (value=2), data caching (value=3) or both (value=4, "Unified"). Also, "Other" (1) and "Unknown" (0) can be defined.
	*/
	public final static String CIM_PROPERTY_CACHETYPE = "CacheType"; //$NON-NLS-1$
	/**
	*	Maximum amount of time, in seconds, dirty lines or buckets may remain in the Cache before they are flushed. A value of zero indicated that a cache flush is not controlled by a flushing timer.
	*/
	public final static String CIM_PROPERTY_FLUSHTIMER = "FlushTimer"; //$NON-NLS-1$
	/**
	*	Defines whether this is the Primary (value=3), Secondary (value=4) or Tertiary (value=5) Cache. Also, "Other" (1), "Unknown" (0) and "Not Applicable" (2) can be defined.
	*/
	public final static String CIM_PROPERTY_LEVEL = "Level"; //$NON-NLS-1$
	/**
	*	Size, in bytes, of a single cache bucket or line.
	*/
	public final static String CIM_PROPERTY_LINESIZE = "LineSize"; //$NON-NLS-1$
	/**
	*	A string describing the cache associativity when the Associativity value is 1, "Other".
	*/
	public final static String CIM_PROPERTY_OTHERASSOCIATIVITYDESCRIPTION = "OtherAssociativityDescription"; //$NON-NLS-1$
	/**
	*	A string describing the Cache Type when the CacheType value is 1, "Other".
	*/
	public final static String CIM_PROPERTY_OTHERCACHETYPEDESCRIPTION = "OtherCacheTypeDescription"; //$NON-NLS-1$
	/**
	*	A string describing the cache level when the Level value is 1, "Other".
	*/
	public final static String CIM_PROPERTY_OTHERLEVELDESCRIPTION = "OtherLevelDescription"; //$NON-NLS-1$
	/**
	*	A string describing the read policy when the ReadPolicy value is 1, "Other".
	*/
	public final static String CIM_PROPERTY_OTHERREADPOLICYDESCRIPTION = "OtherReadPolicyDescription"; //$NON-NLS-1$
	/**
	*	A string describing the Cache replacement policy when the ReplacementPolicy value is 1, "Other".
	*/
	public final static String CIM_PROPERTY_OTHERREPLACEMENTPOLICYDESCRIPTION = "OtherReplacementPolicyDescription"; //$NON-NLS-1$
	/**
	*	A string describing the Write Policy when the WritePolicy value is 1, "Other".
	*/
	public final static String CIM_PROPERTY_OTHERWRITEPOLICYDESCRIPTION = "OtherWritePolicyDescription"; //$NON-NLS-1$
	/**
	*	Policy that shall be employed by the Cache for handling read requests. For example, "Read", "Read-Ahead" or both can be specified using the values, 2, 3 or 4, respectively. If the read policy is determined individually (ie, for each request), then the value 5 ("Determination per I/O") should be specified. "Other" (1) and "Unknown" (0) are also valid values.
	*/
	public final static String CIM_PROPERTY_READPOLICY = "ReadPolicy"; //$NON-NLS-1$
	/**
	*	An integer enumeration describing the algorithm to determine which cache lines or buckets should be re-used.
	*/
	public final static String CIM_PROPERTY_REPLACEMENTPOLICY = "ReplacementPolicy"; //$NON-NLS-1$
	/**
	*	Defines whether this is write-back (value=2) or write-through (value=3) Cache, or whether this information "Varies with Address" (4) or is defined individually for each I/O (5). Also, "Other" (1) and "Unknown" (0) can be specified.
	*/
	public final static String CIM_PROPERTY_WRITEPOLICY = "WritePolicy"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ASSOCIATIVITY);
		CIM_PropertyNameList.add(CIM_PROPERTY_CACHETYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_FLUSHTIMER);
		CIM_PropertyNameList.add(CIM_PROPERTY_LEVEL);
		CIM_PropertyNameList.add(CIM_PROPERTY_LINESIZE);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERASSOCIATIVITYDESCRIPTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERCACHETYPEDESCRIPTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERLEVELDESCRIPTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERREADPOLICYDESCRIPTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERREPLACEMENTPOLICYDESCRIPTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERWRITEPOLICYDESCRIPTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_READPOLICY);
		CIM_PropertyNameList.add(CIM_PROPERTY_REPLACEMENTPOLICY);
		CIM_PropertyNameList.add(CIM_PROPERTY_WRITEPOLICY);
				
		for (int i = 0; i < CIM_AssociatedMemory.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_AssociatedMemory.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ASSOCIATIVITY)||
				((String)CIM_AssociatedMemory.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CACHETYPE)||
				((String)CIM_AssociatedMemory.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FLUSHTIMER)||
				((String)CIM_AssociatedMemory.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LEVEL)||
				((String)CIM_AssociatedMemory.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LINESIZE)||
				((String)CIM_AssociatedMemory.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERASSOCIATIVITYDESCRIPTION)||
				((String)CIM_AssociatedMemory.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERCACHETYPEDESCRIPTION)||
				((String)CIM_AssociatedMemory.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERLEVELDESCRIPTION)||
				((String)CIM_AssociatedMemory.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERREADPOLICYDESCRIPTION)||
				((String)CIM_AssociatedMemory.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERREPLACEMENTPOLICYDESCRIPTION)||
				((String)CIM_AssociatedMemory.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERWRITEPOLICYDESCRIPTION)||
				((String)CIM_AssociatedMemory.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_READPOLICY)||
				((String)CIM_AssociatedMemory.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REPLACEMENTPOLICY)||
				((String)CIM_AssociatedMemory.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_WRITEPOLICY)){
				continue;
			}
			
			CIM_AssociatedCacheMemory.CIM_PropertyNameList.add(CIM_AssociatedMemory.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ASSOCIATIVITY, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CACHETYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FLUSHTIMER, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LEVEL, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LINESIZE, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERASSOCIATIVITYDESCRIPTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERCACHETYPEDESCRIPTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERLEVELDESCRIPTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERREADPOLICYDESCRIPTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERREPLACEMENTPOLICYDESCRIPTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERWRITEPOLICYDESCRIPTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_READPOLICY, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REPLACEMENTPOLICY, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_WRITEPOLICY, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		
				
		for (int i = 0; i < CIM_AssociatedMemory.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_AssociatedMemory.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ASSOCIATIVITY)||
				((CIMProperty)CIM_AssociatedMemory.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CACHETYPE)||
				((CIMProperty)CIM_AssociatedMemory.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FLUSHTIMER)||
				((CIMProperty)CIM_AssociatedMemory.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LEVEL)||
				((CIMProperty)CIM_AssociatedMemory.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LINESIZE)||
				((CIMProperty)CIM_AssociatedMemory.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERASSOCIATIVITYDESCRIPTION)||
				((CIMProperty)CIM_AssociatedMemory.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERCACHETYPEDESCRIPTION)||
				((CIMProperty)CIM_AssociatedMemory.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERLEVELDESCRIPTION)||
				((CIMProperty)CIM_AssociatedMemory.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERREADPOLICYDESCRIPTION)||
				((CIMProperty)CIM_AssociatedMemory.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERREPLACEMENTPOLICYDESCRIPTION)||
				((CIMProperty)CIM_AssociatedMemory.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERWRITEPOLICYDESCRIPTION)||
				((CIMProperty)CIM_AssociatedMemory.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_READPOLICY)||
				((CIMProperty)CIM_AssociatedMemory.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REPLACEMENTPOLICY)||
				((CIMProperty)CIM_AssociatedMemory.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_WRITEPOLICY)){
				continue;
			}
			
			CIM_AssociatedCacheMemory.CIM_PropertyList.add(CIM_AssociatedMemory.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_AssociatedMemory.Java_Package_List.size(); i++) {
			if (((String)CIM_AssociatedMemory.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_AssociatedMemory.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_ASSOCIATIVITY = {"Unknown","Other","Direct Mapped","2-way Set-Associative","4-way Set-Associative","Fully Associative","8-way Set-Associative","16-way Set-Associative"};
	public final static String[] CIM_VALUEMAP_CACHETYPE = {"Unknown","Other","Instruction","Data","Unified"};
	public final static String[] CIM_VALUEMAP_LEVEL = {"Unknown","Other","Not Applicable","Primary","Secondary","Tertiary"};
	public final static String[] CIM_VALUEMAP_READPOLICY = {"Unknown","Other","Read","Read-Ahead","Read and Read-Ahead","Determination Per I/O"};
	public final static String[] CIM_VALUEMAP_REPLACEMENTPOLICY = {"Unknown","Other","Unknown","Least Recently Used (LRU)","First In First Out (FIFO)","Last In First Out (LIFO)","Least Frequently Used (LFU)","Most Frequently Used (MFU)","Data Dependent Multiple Algorithms"};
	public final static String[] CIM_VALUEMAP_WRITEPOLICY = {"Unknown","Other","Write Back","Write Through","Varies with Address","Determination Per I/O"};
	
	
	public final static int ASSOCIATIVITY_UNKNOWN = 0;
	public final static int ASSOCIATIVITY_OTHER = 1;
	public final static int ASSOCIATIVITY_DIRECTMAPPED = 2;
	public final static int ASSOCIATIVITY_2_WAYSET_ASSOCIATIVE = 3;
	public final static int ASSOCIATIVITY_4_WAYSET_ASSOCIATIVE = 4;
	public final static int ASSOCIATIVITY_FULLYASSOCIATIVE = 5;
	public final static int ASSOCIATIVITY_8_WAYSET_ASSOCIATIVE = 6;
	public final static int ASSOCIATIVITY_16_WAYSET_ASSOCIATIVE = 7;
	
	public final static int CACHETYPE_UNKNOWN = 0;
	public final static int CACHETYPE_OTHER = 1;
	public final static int CACHETYPE_INSTRUCTION = 2;
	public final static int CACHETYPE_DATA = 3;
	public final static int CACHETYPE_UNIFIED = 4;
	
	public final static int LEVEL_UNKNOWN = 0;
	public final static int LEVEL_OTHER = 1;
	public final static int LEVEL_NOTAPPLICABLE = 2;
	public final static int LEVEL_PRIMARY = 3;
	public final static int LEVEL_SECONDARY = 4;
	public final static int LEVEL_TERTIARY = 5;
	
	public final static int READPOLICY_UNKNOWN = 0;
	public final static int READPOLICY_OTHER = 1;
	public final static int READPOLICY_READ = 2;
	public final static int READPOLICY_READ_AHEAD = 3;
	public final static int READPOLICY_READANDREAD_AHEAD = 4;
	public final static int READPOLICY_DETERMINATIONPERI_O = 5;
	
	public final static int REPLACEMENTPOLICY_UNKNOWN = 0;
	public final static int REPLACEMENTPOLICY_OTHER = 1;
	public final static int REPLACEMENTPOLICY_UNKNOWN1 = 2;
	public final static int REPLACEMENTPOLICY_LEASTRECENTLYUSEDLRU = 3;
	public final static int REPLACEMENTPOLICY_FIRSTINFIRSTOUTFIFO = 4;
	public final static int REPLACEMENTPOLICY_LASTINFIRSTOUTLIFO = 5;
	public final static int REPLACEMENTPOLICY_LEASTFREQUENTLYUSEDLFU = 6;
	public final static int REPLACEMENTPOLICY_MOSTFREQUENTLYUSEDMFU = 7;
	public final static int REPLACEMENTPOLICY_DATADEPENDENTMULTIPLEALGORITHMS = 8;
	
	public final static int WRITEPOLICY_UNKNOWN = 0;
	public final static int WRITEPOLICY_OTHER = 1;
	public final static int WRITEPOLICY_WRITEBACK = 2;
	public final static int WRITEPOLICY_WRITETHROUGH = 3;
	public final static int WRITEPOLICY_VARIESWITHADDRESS = 4;
	public final static int WRITEPOLICY_DETERMINATIONPERI_O = 5;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_AssociatedCacheMemory() {

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
	public CIM_AssociatedCacheMemory(Vector keyProperties){ 
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
	public CIM_AssociatedCacheMemory(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_AssociatedCacheMemory)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_AssociatedCacheMemory)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_AssociatedCacheMemory)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_AssociatedCacheMemory)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_AssociatedCacheMemory)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_AssociatedCacheMemory)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_AssociatedCacheMemory)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_AssociatedCacheMemory)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_AssociatedCacheMemory)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_AssociatedCacheMemory)object).cimObjectPath)) {
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
	
	// Attribute Associativity
	
	public UnsignedInt16 get_Associativity() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AssociatedCacheMemory.CIM_PROPERTY_ASSOCIATIVITY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_ASSOCIATIVITY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_ASSOCIATIVITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Associativity(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AssociatedCacheMemory.CIM_PROPERTY_ASSOCIATIVITY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_ASSOCIATIVITY + " could not be found");
    		
		} else if (!CIM_AssociatedCacheMemoryHelper.isValid_Associativity(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_ASSOCIATIVITY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_ASSOCIATIVITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CacheType
	
	public UnsignedInt16 get_CacheType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AssociatedCacheMemory.CIM_PROPERTY_CACHETYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_CACHETYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_CACHETYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CacheType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AssociatedCacheMemory.CIM_PROPERTY_CACHETYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_CACHETYPE + " could not be found");
    		
		} else if (!CIM_AssociatedCacheMemoryHelper.isValid_CacheType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_CACHETYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_CACHETYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute FlushTimer
	
	public UnsignedInt32 get_FlushTimer() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AssociatedCacheMemory.CIM_PROPERTY_FLUSHTIMER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_FLUSHTIMER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_FLUSHTIMER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_FlushTimer(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AssociatedCacheMemory.CIM_PROPERTY_FLUSHTIMER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_FLUSHTIMER + " could not be found");
    		
		} else if (!CIM_AssociatedCacheMemoryHelper.isValid_FlushTimer(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_FLUSHTIMER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_FLUSHTIMER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Level
	
	public UnsignedInt16 get_Level() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AssociatedCacheMemory.CIM_PROPERTY_LEVEL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_LEVEL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_LEVEL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Level(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AssociatedCacheMemory.CIM_PROPERTY_LEVEL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_LEVEL + " could not be found");
    		
		} else if (!CIM_AssociatedCacheMemoryHelper.isValid_Level(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_LEVEL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_LEVEL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LineSize
	
	public UnsignedInt32 get_LineSize() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AssociatedCacheMemory.CIM_PROPERTY_LINESIZE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_LINESIZE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_LINESIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LineSize(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AssociatedCacheMemory.CIM_PROPERTY_LINESIZE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_LINESIZE + " could not be found");
    		
		} else if (!CIM_AssociatedCacheMemoryHelper.isValid_LineSize(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_LINESIZE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_LINESIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherAssociativityDescription
	
	public String get_OtherAssociativityDescription() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AssociatedCacheMemory.CIM_PROPERTY_OTHERASSOCIATIVITYDESCRIPTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_OTHERASSOCIATIVITYDESCRIPTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_OTHERASSOCIATIVITYDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherAssociativityDescription(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AssociatedCacheMemory.CIM_PROPERTY_OTHERASSOCIATIVITYDESCRIPTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_OTHERASSOCIATIVITYDESCRIPTION + " could not be found");
    		
		} else if (!CIM_AssociatedCacheMemoryHelper.isValid_OtherAssociativityDescription(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_OTHERASSOCIATIVITYDESCRIPTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_OTHERASSOCIATIVITYDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherCacheTypeDescription
	
	public String get_OtherCacheTypeDescription() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AssociatedCacheMemory.CIM_PROPERTY_OTHERCACHETYPEDESCRIPTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_OTHERCACHETYPEDESCRIPTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_OTHERCACHETYPEDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherCacheTypeDescription(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AssociatedCacheMemory.CIM_PROPERTY_OTHERCACHETYPEDESCRIPTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_OTHERCACHETYPEDESCRIPTION + " could not be found");
    		
		} else if (!CIM_AssociatedCacheMemoryHelper.isValid_OtherCacheTypeDescription(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_OTHERCACHETYPEDESCRIPTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_OTHERCACHETYPEDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherLevelDescription
	
	public String get_OtherLevelDescription() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AssociatedCacheMemory.CIM_PROPERTY_OTHERLEVELDESCRIPTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_OTHERLEVELDESCRIPTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_OTHERLEVELDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherLevelDescription(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AssociatedCacheMemory.CIM_PROPERTY_OTHERLEVELDESCRIPTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_OTHERLEVELDESCRIPTION + " could not be found");
    		
		} else if (!CIM_AssociatedCacheMemoryHelper.isValid_OtherLevelDescription(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_OTHERLEVELDESCRIPTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_OTHERLEVELDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherReadPolicyDescription
	
	public String get_OtherReadPolicyDescription() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AssociatedCacheMemory.CIM_PROPERTY_OTHERREADPOLICYDESCRIPTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_OTHERREADPOLICYDESCRIPTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_OTHERREADPOLICYDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherReadPolicyDescription(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AssociatedCacheMemory.CIM_PROPERTY_OTHERREADPOLICYDESCRIPTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_OTHERREADPOLICYDESCRIPTION + " could not be found");
    		
		} else if (!CIM_AssociatedCacheMemoryHelper.isValid_OtherReadPolicyDescription(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_OTHERREADPOLICYDESCRIPTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_OTHERREADPOLICYDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherReplacementPolicyDescription
	
	public String get_OtherReplacementPolicyDescription() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AssociatedCacheMemory.CIM_PROPERTY_OTHERREPLACEMENTPOLICYDESCRIPTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_OTHERREPLACEMENTPOLICYDESCRIPTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_OTHERREPLACEMENTPOLICYDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherReplacementPolicyDescription(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AssociatedCacheMemory.CIM_PROPERTY_OTHERREPLACEMENTPOLICYDESCRIPTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_OTHERREPLACEMENTPOLICYDESCRIPTION + " could not be found");
    		
		} else if (!CIM_AssociatedCacheMemoryHelper.isValid_OtherReplacementPolicyDescription(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_OTHERREPLACEMENTPOLICYDESCRIPTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_OTHERREPLACEMENTPOLICYDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherWritePolicyDescription
	
	public String get_OtherWritePolicyDescription() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AssociatedCacheMemory.CIM_PROPERTY_OTHERWRITEPOLICYDESCRIPTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_OTHERWRITEPOLICYDESCRIPTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_OTHERWRITEPOLICYDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherWritePolicyDescription(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AssociatedCacheMemory.CIM_PROPERTY_OTHERWRITEPOLICYDESCRIPTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_OTHERWRITEPOLICYDESCRIPTION + " could not be found");
    		
		} else if (!CIM_AssociatedCacheMemoryHelper.isValid_OtherWritePolicyDescription(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_OTHERWRITEPOLICYDESCRIPTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_OTHERWRITEPOLICYDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ReadPolicy
	
	public UnsignedInt16 get_ReadPolicy() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AssociatedCacheMemory.CIM_PROPERTY_READPOLICY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_READPOLICY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_READPOLICY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ReadPolicy(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AssociatedCacheMemory.CIM_PROPERTY_READPOLICY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_READPOLICY + " could not be found");
    		
		} else if (!CIM_AssociatedCacheMemoryHelper.isValid_ReadPolicy(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_READPOLICY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_READPOLICY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ReplacementPolicy
	
	public UnsignedInt16 get_ReplacementPolicy() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AssociatedCacheMemory.CIM_PROPERTY_REPLACEMENTPOLICY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_REPLACEMENTPOLICY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_REPLACEMENTPOLICY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ReplacementPolicy(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AssociatedCacheMemory.CIM_PROPERTY_REPLACEMENTPOLICY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_REPLACEMENTPOLICY + " could not be found");
    		
		} else if (!CIM_AssociatedCacheMemoryHelper.isValid_ReplacementPolicy(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_REPLACEMENTPOLICY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_REPLACEMENTPOLICY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute WritePolicy
	
	public UnsignedInt16 get_WritePolicy() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AssociatedCacheMemory.CIM_PROPERTY_WRITEPOLICY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_WRITEPOLICY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_WRITEPOLICY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_WritePolicy(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AssociatedCacheMemory.CIM_PROPERTY_WRITEPOLICY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_WRITEPOLICY + " could not be found");
    		
		} else if (!CIM_AssociatedCacheMemoryHelper.isValid_WritePolicy(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_WRITEPOLICY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AssociatedCacheMemory.CIM_PROPERTY_WRITEPOLICY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
