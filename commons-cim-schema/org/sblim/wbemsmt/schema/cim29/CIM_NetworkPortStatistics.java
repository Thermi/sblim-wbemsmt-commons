/** 
 * CIM_NetworkPortStatistics.java
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
 * Description:  The NetworkPortStatistics class describes the statistics for the NetworkPort.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


/**
 *  The NetworkPortStatistics class describes the statistics for the NetworkPort.
 */
public class CIM_NetworkPortStatistics extends CIM_StatisticalData  {
	
	public final static String CIM_CLASS_NAME = "CIM_NetworkPortStatistics"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	
	
	/**
	*	The total number of bytes received, including framing characters.
	*/
	public final static String CIM_PROPERTY_BYTESRECEIVED = "BytesReceived"; //$NON-NLS-1$
	/**
	*	The total number of bytes transmitted, including framing characters.
	*/
	public final static String CIM_PROPERTY_BYTESTRANSMITTED = "BytesTransmitted"; //$NON-NLS-1$
	/**
	*	The total number of packets received.
	*/
	public final static String CIM_PROPERTY_PACKETSRECEIVED = "PacketsReceived"; //$NON-NLS-1$
	/**
	*	The total number of packets transmitted.
	*/
	public final static String CIM_PROPERTY_PACKETSTRANSMITTED = "PacketsTransmitted"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	private static Set Java_Package_List 		= new HashSet();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_BYTESRECEIVED);
		CIM_PropertyNameList.add(CIM_PROPERTY_BYTESTRANSMITTED);
		CIM_PropertyNameList.add(CIM_PROPERTY_PACKETSRECEIVED);
		CIM_PropertyNameList.add(CIM_PROPERTY_PACKETSTRANSMITTED);
				
		for (int i = 0; i < CIM_StatisticalData.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_BYTESRECEIVED)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_BYTESTRANSMITTED)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PACKETSRECEIVED)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PACKETSTRANSMITTED)){
				continue;
			}
			
			CIM_NetworkPortStatistics.CIM_PropertyNameList.add(CIM_StatisticalData.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_BYTESRECEIVED, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_BYTESTRANSMITTED, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PACKETSRECEIVED, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PACKETSTRANSMITTED, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
				
		for (int i = 0; i < CIM_StatisticalData.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_BYTESRECEIVED)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_BYTESTRANSMITTED)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PACKETSRECEIVED)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PACKETSTRANSMITTED)){
				continue;
			}
			
			CIM_NetworkPortStatistics.CIM_PropertyList.add(CIM_StatisticalData.CIM_PropertyList.elementAt(i));
		}
		
		addPackage("org.sblim.wbemsmt.schema.cim29");
				
		String[] parentClassPackageList = CIM_StatisticalData.getPackages();
		
		for (int i = 0; i < parentClassPackageList.length; i++) {
			Java_Package_List.add(parentClassPackageList[i]);
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_NetworkPortStatistics() {

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
	public CIM_NetworkPortStatistics(Vector keyProperties){ 
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
	public CIM_NetworkPortStatistics(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
		if (cimInstance == null) {
			throw new InvalidParameterException("The cimInstance parameter does not contain a valid reference.");
		
		} else if (cimObjectPath == null){
			throw new InvalidParameterException("The cimObjectPath parameter does not contain a valid reference.");		
		
		} else if (!cimObjectPath.getObjectName().equals(cimInstance.getClassName())) {
			throw new InvalidParameterException("The class name of the instance and the ObjectPath are not the same.");
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
	
	public static void addPackage(String packagename) {
        if (packagename != null) {
            if (!packagename.endsWith(".")) {
                packagename = packagename + ".";
            }
            CIM_NetworkPortStatistics.Java_Package_List.add(packagename);
            
        } else {
            throw new NullPointerException();
        }
    }

    public static String[] getPackages() {
        return (String[]) CIM_NetworkPortStatistics.Java_Package_List.toArray(new String[CIM_NetworkPortStatistics.Java_Package_List.size()]);
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
	    
	    if (!(object instanceof CIM_NetworkPortStatistics)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_NetworkPortStatistics)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_NetworkPortStatistics)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_NetworkPortStatistics)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_NetworkPortStatistics)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_NetworkPortStatistics)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_NetworkPortStatistics)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_NetworkPortStatistics)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_NetworkPortStatistics)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_NetworkPortStatistics)object).cimObjectPath)) {
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
	
	// Attribute BytesReceived
	
	public UnsignedInt64 get_BytesReceived() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NetworkPortStatistics.CIM_PROPERTY_BYTESRECEIVED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NetworkPortStatistics.CIM_PROPERTY_BYTESRECEIVED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NetworkPortStatistics.CIM_PROPERTY_BYTESRECEIVED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_BytesReceived(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NetworkPortStatistics.CIM_PROPERTY_BYTESRECEIVED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NetworkPortStatistics.CIM_PROPERTY_BYTESRECEIVED + " could not be found");
    		
		} else if (!CIM_NetworkPortStatisticsHelper.isValid_BytesReceived(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NetworkPortStatistics.CIM_PROPERTY_BYTESRECEIVED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NetworkPortStatistics.CIM_PROPERTY_BYTESRECEIVED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute BytesTransmitted
	
	public UnsignedInt64 get_BytesTransmitted() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NetworkPortStatistics.CIM_PROPERTY_BYTESTRANSMITTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NetworkPortStatistics.CIM_PROPERTY_BYTESTRANSMITTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NetworkPortStatistics.CIM_PROPERTY_BYTESTRANSMITTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_BytesTransmitted(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NetworkPortStatistics.CIM_PROPERTY_BYTESTRANSMITTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NetworkPortStatistics.CIM_PROPERTY_BYTESTRANSMITTED + " could not be found");
    		
		} else if (!CIM_NetworkPortStatisticsHelper.isValid_BytesTransmitted(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NetworkPortStatistics.CIM_PROPERTY_BYTESTRANSMITTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NetworkPortStatistics.CIM_PROPERTY_BYTESTRANSMITTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PacketsReceived
	
	public UnsignedInt64 get_PacketsReceived() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NetworkPortStatistics.CIM_PROPERTY_PACKETSRECEIVED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NetworkPortStatistics.CIM_PROPERTY_PACKETSRECEIVED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NetworkPortStatistics.CIM_PROPERTY_PACKETSRECEIVED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PacketsReceived(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NetworkPortStatistics.CIM_PROPERTY_PACKETSRECEIVED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NetworkPortStatistics.CIM_PROPERTY_PACKETSRECEIVED + " could not be found");
    		
		} else if (!CIM_NetworkPortStatisticsHelper.isValid_PacketsReceived(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NetworkPortStatistics.CIM_PROPERTY_PACKETSRECEIVED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NetworkPortStatistics.CIM_PROPERTY_PACKETSRECEIVED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PacketsTransmitted
	
	public UnsignedInt64 get_PacketsTransmitted() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NetworkPortStatistics.CIM_PROPERTY_PACKETSTRANSMITTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NetworkPortStatistics.CIM_PROPERTY_PACKETSTRANSMITTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NetworkPortStatistics.CIM_PROPERTY_PACKETSTRANSMITTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PacketsTransmitted(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NetworkPortStatistics.CIM_PROPERTY_PACKETSTRANSMITTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NetworkPortStatistics.CIM_PROPERTY_PACKETSTRANSMITTED + " could not be found");
    		
		} else if (!CIM_NetworkPortStatisticsHelper.isValid_PacketsTransmitted(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NetworkPortStatistics.CIM_PROPERTY_PACKETSTRANSMITTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NetworkPortStatistics.CIM_PROPERTY_PACKETSTRANSMITTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
