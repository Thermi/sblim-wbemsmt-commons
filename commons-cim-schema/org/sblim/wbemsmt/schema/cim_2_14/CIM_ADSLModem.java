/** 
 * CIM_ADSLModem.java
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
 * Description:  The ADSLModem class represents Modems of the DSL type = ADSL, Asymmetric
 * Digital Subscriber Line.
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
import org.sblim.wbem.cim.UnsignedInt32;


/**
 *  The ADSLModem class represents Modems of the DSL type = ADSL, Asymmetric
 * Digital Subscriber Line.
 */
public class CIM_ADSLModem extends CIM_DSLModem  {
	
	public final static String CIM_CLASS_NAME = "CIM_ADSLModem"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.10.0";
	
	
	/**
	*	Measured difference in the total power transmitted by the peer Modem and the total power received by this Modem. This value is measured in tenths of dB.
	*/
	public final static String CIM_PROPERTY_LINEATTENUATION = "LineAttenuation"; //$NON-NLS-1$
	/**
	*	Status indicates the current state of the connection (line). The property holds a bit map that describes the possible conditions. For example, 
1) No Defect - There are no defects on the line; 
2) Loss Of Framing - ATUR failure due to the inability to receive a valid frame; 
4) Loss Of Signal - ATUR failure due to the inability to receive a signal; 
8) Loss Of Power - ATUR failure due to loss of power; 
32) Loss Of Signal Quality - Loss of Signal Quality is declared when the NoiseMargin falls below the minimum NoiseMargin, or the bit-error-rate exceeds 10^-7.
	*/
	public final static String CIM_PROPERTY_LINESTATE = "LineState"; //$NON-NLS-1$
	/**
	*	Indicates the maximum currently attainable data rate for the Modem. This value will be equal to or greater than the current line rate.
	*/
	public final static String CIM_PROPERTY_MAXDATARATE = "MaxDataRate"; //$NON-NLS-1$
	/**
	*	Noise Margin of this Modem with respect to its received signal, in tenths of dB.
	*/
	public final static String CIM_PROPERTY_NOISEMARGIN = "NoiseMargin"; //$NON-NLS-1$
	/**
	*	Measured total output power (in tenths of dB) transmitted by this Modem.
	*/
	public final static String CIM_PROPERTY_TOTALOUTPUTPOWER = "TotalOutputPower"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_LINEATTENUATION);
		CIM_PropertyNameList.add(CIM_PROPERTY_LINESTATE);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXDATARATE);
		CIM_PropertyNameList.add(CIM_PROPERTY_NOISEMARGIN);
		CIM_PropertyNameList.add(CIM_PROPERTY_TOTALOUTPUTPOWER);
				
		for (int i = 0; i < CIM_DSLModem.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_DSLModem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LINEATTENUATION)||
				((String)CIM_DSLModem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LINESTATE)||
				((String)CIM_DSLModem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXDATARATE)||
				((String)CIM_DSLModem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NOISEMARGIN)||
				((String)CIM_DSLModem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TOTALOUTPUTPOWER)){
				continue;
			}
			
			CIM_ADSLModem.CIM_PropertyNameList.add(CIM_DSLModem.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LINEATTENUATION, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LINESTATE, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXDATARATE, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NOISEMARGIN, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TOTALOUTPUTPOWER, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
				
		for (int i = 0; i < CIM_DSLModem.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_DSLModem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LINEATTENUATION)||
				((CIMProperty)CIM_DSLModem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LINESTATE)||
				((CIMProperty)CIM_DSLModem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXDATARATE)||
				((CIMProperty)CIM_DSLModem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NOISEMARGIN)||
				((CIMProperty)CIM_DSLModem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TOTALOUTPUTPOWER)){
				continue;
			}
			
			CIM_ADSLModem.CIM_PropertyList.add(CIM_DSLModem.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_DSLModem.Java_Package_List.size(); i++) {
			if (((String)CIM_DSLModem.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_DSLModem.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_LINESTATE = {"No Defect","Loss Of Framing","Loss Of Signal","Loss Of Power","Loss Of Signal Quality"};
	
	
	public final static int LINESTATE_NODEFECT = 1;
	public final static int LINESTATE_LOSSOFFRAMING = 2;
	public final static int LINESTATE_LOSSOFSIGNAL = 4;
	public final static int LINESTATE_LOSSOFPOWER = 8;
	public final static int LINESTATE_LOSSOFSIGNALQUALITY = 32;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_ADSLModem() {

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
	public CIM_ADSLModem(Vector keyProperties){ 
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
	public CIM_ADSLModem(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_ADSLModem)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_ADSLModem)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_ADSLModem)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_ADSLModem)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_ADSLModem)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_ADSLModem)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_ADSLModem)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_ADSLModem)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_ADSLModem)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_ADSLModem)object).cimObjectPath)) {
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
	
	// Attribute LineAttenuation
	
	public UnsignedInt32 get_LineAttenuation() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ADSLModem.CIM_PROPERTY_LINEATTENUATION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ADSLModem.CIM_PROPERTY_LINEATTENUATION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ADSLModem.CIM_PROPERTY_LINEATTENUATION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LineAttenuation(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ADSLModem.CIM_PROPERTY_LINEATTENUATION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ADSLModem.CIM_PROPERTY_LINEATTENUATION + " could not be found");
    		
		} else if (!CIM_ADSLModemHelper.isValid_LineAttenuation(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ADSLModem.CIM_PROPERTY_LINEATTENUATION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ADSLModem.CIM_PROPERTY_LINEATTENUATION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LineState
	
	public UnsignedInt32 get_LineState() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ADSLModem.CIM_PROPERTY_LINESTATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ADSLModem.CIM_PROPERTY_LINESTATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ADSLModem.CIM_PROPERTY_LINESTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LineState(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ADSLModem.CIM_PROPERTY_LINESTATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ADSLModem.CIM_PROPERTY_LINESTATE + " could not be found");
    		
		} else if (!CIM_ADSLModemHelper.isValid_LineState(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ADSLModem.CIM_PROPERTY_LINESTATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ADSLModem.CIM_PROPERTY_LINESTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxDataRate
	
	public UnsignedInt32 get_MaxDataRate() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ADSLModem.CIM_PROPERTY_MAXDATARATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ADSLModem.CIM_PROPERTY_MAXDATARATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ADSLModem.CIM_PROPERTY_MAXDATARATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxDataRate(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ADSLModem.CIM_PROPERTY_MAXDATARATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ADSLModem.CIM_PROPERTY_MAXDATARATE + " could not be found");
    		
		} else if (!CIM_ADSLModemHelper.isValid_MaxDataRate(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ADSLModem.CIM_PROPERTY_MAXDATARATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ADSLModem.CIM_PROPERTY_MAXDATARATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute NoiseMargin
	
	public UnsignedInt32 get_NoiseMargin() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ADSLModem.CIM_PROPERTY_NOISEMARGIN);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ADSLModem.CIM_PROPERTY_NOISEMARGIN + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ADSLModem.CIM_PROPERTY_NOISEMARGIN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_NoiseMargin(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ADSLModem.CIM_PROPERTY_NOISEMARGIN);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ADSLModem.CIM_PROPERTY_NOISEMARGIN + " could not be found");
    		
		} else if (!CIM_ADSLModemHelper.isValid_NoiseMargin(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ADSLModem.CIM_PROPERTY_NOISEMARGIN);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ADSLModem.CIM_PROPERTY_NOISEMARGIN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TotalOutputPower
	
	public UnsignedInt32 get_TotalOutputPower() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ADSLModem.CIM_PROPERTY_TOTALOUTPUTPOWER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ADSLModem.CIM_PROPERTY_TOTALOUTPUTPOWER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ADSLModem.CIM_PROPERTY_TOTALOUTPUTPOWER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TotalOutputPower(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ADSLModem.CIM_PROPERTY_TOTALOUTPUTPOWER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ADSLModem.CIM_PROPERTY_TOTALOUTPUTPOWER + " could not be found");
    		
		} else if (!CIM_ADSLModemHelper.isValid_TotalOutputPower(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ADSLModem.CIM_PROPERTY_TOTALOUTPUTPOWER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ADSLModem.CIM_PROPERTY_TOTALOUTPUTPOWER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
