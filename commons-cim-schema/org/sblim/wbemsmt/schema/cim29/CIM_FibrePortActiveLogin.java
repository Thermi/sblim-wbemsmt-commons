/** 
 * CIM_FibrePortActiveLogin.java
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
 * Description: The use of FibrePortActiveLogin is deprecated since FibrePort is deprecated. Its information is found by examining the individual FCPorts, and an ActiveConnection between the FCProtocolEndpoints associated with the ports. FibrePortActiveLogin indicates that two FibrePorts are connected via a login and have negotiated their Class Of Service, frame size and other link characteristics, as specified by an instance of this class.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_FibrePortActiveLogin  {
	
	protected CIMInstance cimInstance			= new CIMInstance();
	protected CIMInstance original_cimInstance	= null;
	protected CIMObjectPath cimObjectPath		= null; 
	
	public final static String CIM_CLASS_NAME = "CIM_FibrePortActiveLogin";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	public final static String CIM_PROPERTY_CIM_FIBREPORT_1 = "LoginOriginator"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_FIBREPORT_2 = "LoginResponder"; //$NON-NLS-1$
	
	
	/**
	*	Acknowledgement model negotiated during Port login. For example, ACK-1 indicates that each frame should be acknowledged.
	*/
	public final static String CIM_PROPERTY_ACKMODEL = "ACKModel"; //$NON-NLS-1$
	/**
	*	The buffer-to-buffer model negotiated during Port login. Either the model defined by the FC-PH standard is used (value=1, "Regular"), or an "Alternate" model is negotiated.
	*/
	public final static String CIM_PROPERTY_BUFFERTOBUFFERMODEL = "BufferToBufferModel"; //$NON-NLS-1$
	/**
	*	The Fibre Channel Class of Service that is currently running between the Ports. Since two Ports can be simultaneously connected at different Classes of Service, this property had to be part of the object's key and therefore, an instance's identity.
	*/
	public final static String CIM_PROPERTY_NEGOTIATEDCOS = "NegotiatedCOS"; //$NON-NLS-1$
	/**
	*	The Fibre Channel frame size, in bytes, that is currently negotiated between the two Ports.
	*/
	public final static String CIM_PROPERTY_NEGOTIATEDFRAMESIZE = "NegotiatedFrameSize"; //$NON-NLS-1$
	/**
	*	The speed for communications that is currently negotiated between the two Ports. Speed is specified in bits per second. If this information is not available, the property should be set to 0.
	*/
	public final static String CIM_PROPERTY_NEGOTIATEDSPEED = "NegotiatedSpeed"; //$NON-NLS-1$
	/**
	*	OriginatorBufferCredit reflects the buffer credit of the Port defined as the LoginOriginator. It is the number of frame buffers made available BY the originating Port, TO the responder Port. Buffer credits are used in point to point connections, when an NL-Local Port is logged into another NL-Local Port, and when Nx Ports are logged into Fx Ports. In other scenarios, this value is undefined.
	*/
	public final static String CIM_PROPERTY_ORIGINATORBUFFERCREDIT = "OriginatorBufferCredit"; //$NON-NLS-1$
	/**
	*	OriginatorEndCredit reflects the end credit of the Port defined as the LoginOriginator. It is the number of frame buffers made available BY the originating Port, TO the responder Port. End credits are used in point to point connections, when an NL-Local Port is logged into another NL-Local Port, and when Nx Ports are logged into remote Nx Ports. In other scenarios, this value is undefined.
	*/
	public final static String CIM_PROPERTY_ORIGINATORENDCREDIT = "OriginatorEndCredit"; //$NON-NLS-1$
	/**
	*	ResponderBufferCredit reflects the buffer credit of the Port defined as the LoginResponder. It is the number of frame buffers made available BY the responder Port, TO the originating Port. Buffer credits are used in point to point connections, when an NL-Local Port is logged into another NL-Local Port, and when Nx Ports are logged into Fx Ports. In other scenarios, this value is undefined.
	*/
	public final static String CIM_PROPERTY_RESPONDERBUFFERCREDIT = "ResponderBufferCredit"; //$NON-NLS-1$
	/**
	*	ResponderEndCredit reflects the end credit of the Port defined as the LoginResponder. It is the number of frame buffers made available BY the responder Port, TO the originating Port. End credits are used in point to point connections, when an NL-Local Port is logged into another NL-Local Port, and when Nx Ports are logged into remote Nx Ports. In other scenarios, this value is undefined.
	*/
	public final static String CIM_PROPERTY_RESPONDERENDCREDIT = "ResponderEndCredit"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ACKMODEL);
		CIM_PropertyNameList.add(CIM_PROPERTY_BUFFERTOBUFFERMODEL);
		CIM_PropertyNameList.add(CIM_PROPERTY_NEGOTIATEDCOS);
		CIM_PropertyNameList.add(CIM_PROPERTY_NEGOTIATEDFRAMESIZE);
		CIM_PropertyNameList.add(CIM_PROPERTY_NEGOTIATEDSPEED);
		CIM_PropertyNameList.add(CIM_PROPERTY_ORIGINATORBUFFERCREDIT);
		CIM_PropertyNameList.add(CIM_PROPERTY_ORIGINATORENDCREDIT);
		CIM_PropertyNameList.add(CIM_PROPERTY_RESPONDERBUFFERCREDIT);
		CIM_PropertyNameList.add(CIM_PROPERTY_RESPONDERENDCREDIT);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_FIBREPORT_1);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_FIBREPORT_2);
		
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ACKMODEL, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_BUFFERTOBUFFERMODEL, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NEGOTIATEDCOS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NEGOTIATEDFRAMESIZE, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NEGOTIATEDSPEED, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ORIGINATORBUFFERCREDIT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ORIGINATORENDCREDIT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RESPONDERBUFFERCREDIT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RESPONDERENDCREDIT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_FIBREPORT_1, new CIMValue(null, new CIMDataType(CIM_FibrePort.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_FIBREPORT_2, new CIMValue(null, new CIMDataType(CIM_FibrePort.CIM_CLASS_NAME))));
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
		};
			
	public final static String[] CIM_VALUEMAP_ACKMODEL = {"Unknown","ACK-0","ACK-1","ACK-N"};
	public final static String[] CIM_VALUEMAP_BUFFERTOBUFFERMODEL = {"Unknown","Regular","Alternate"};
	public final static String[] CIM_VALUEMAP_NEGOTIATEDCOS = {"Unknown","1","2","3","4","6","F"};
	
	
	public final static int ACKMODEL_UNKNOWN = 0;
	public final static int ACKMODEL_ACK_0 = 1;
	public final static int ACKMODEL_ACK_1 = 2;
	public final static int ACKMODEL_ACK_N = 3;
	
	public final static int BUFFERTOBUFFERMODEL_UNKNOWN = 0;
	public final static int BUFFERTOBUFFERMODEL_REGULAR = 1;
	public final static int BUFFERTOBUFFERMODEL_ALTERNATE = 2;
	
	public final static int NEGOTIATEDCOS_UNKNOWN = 0;
	public final static int NEGOTIATEDCOS_1 = 1;
	public final static int NEGOTIATEDCOS_2 = 2;
	public final static int NEGOTIATEDCOS_3 = 3;
	public final static int NEGOTIATEDCOS_4 = 4;
	public final static int NEGOTIATEDCOS_6 = 5;
	public final static int NEGOTIATEDCOS_F = 6;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_FibrePortActiveLogin() {

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
	public CIM_FibrePortActiveLogin(Vector keyProperties){ 
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
	public CIM_FibrePortActiveLogin(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_NegotiatedCOS = this.cimInstance.getProperty(CIM_PROPERTY_NEGOTIATEDCOS);
		
		if (CIMProperty_NegotiatedCOS == null || CIMProperty_NegotiatedCOS.getValue().isEmpty() || CIMProperty_NegotiatedCOS.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_NEGOTIATEDCOS, "Key"});
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
	    
	    if (!(object instanceof CIM_FibrePortActiveLogin)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_FibrePortActiveLogin)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_FibrePortActiveLogin)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_FibrePortActiveLogin)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_FibrePortActiveLogin)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_FibrePortActiveLogin)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_FibrePortActiveLogin)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_FibrePortActiveLogin)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_FibrePortActiveLogin)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_FibrePortActiveLogin)object).cimObjectPath)) {
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
	
	// Attribute ACKModel
	
	public UnsignedInt16 get_ACKModel() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePortActiveLogin.CIM_PROPERTY_ACKMODEL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePortActiveLogin.CIM_PROPERTY_ACKMODEL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePortActiveLogin.CIM_PROPERTY_ACKMODEL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ACKModel(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePortActiveLogin.CIM_PROPERTY_ACKMODEL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePortActiveLogin.CIM_PROPERTY_ACKMODEL + " could not be found");
    		
		} else if (!CIM_FibrePortActiveLoginHelper.isValid_ACKModel(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibrePortActiveLogin.CIM_PROPERTY_ACKMODEL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePortActiveLogin.CIM_PROPERTY_ACKMODEL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute BufferToBufferModel
	
	public UnsignedInt16 get_BufferToBufferModel() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePortActiveLogin.CIM_PROPERTY_BUFFERTOBUFFERMODEL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePortActiveLogin.CIM_PROPERTY_BUFFERTOBUFFERMODEL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePortActiveLogin.CIM_PROPERTY_BUFFERTOBUFFERMODEL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_BufferToBufferModel(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePortActiveLogin.CIM_PROPERTY_BUFFERTOBUFFERMODEL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePortActiveLogin.CIM_PROPERTY_BUFFERTOBUFFERMODEL + " could not be found");
    		
		} else if (!CIM_FibrePortActiveLoginHelper.isValid_BufferToBufferModel(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibrePortActiveLogin.CIM_PROPERTY_BUFFERTOBUFFERMODEL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePortActiveLogin.CIM_PROPERTY_BUFFERTOBUFFERMODEL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute NegotiatedCOS
	
	public UnsignedInt16 get_NegotiatedCOS() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePortActiveLogin.CIM_PROPERTY_NEGOTIATEDCOS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePortActiveLogin.CIM_PROPERTY_NEGOTIATEDCOS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePortActiveLogin.CIM_PROPERTY_NEGOTIATEDCOS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_NegotiatedCOS(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePortActiveLogin.CIM_PROPERTY_NEGOTIATEDCOS);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_FibrePortActiveLogin.CIM_PROPERTY_NEGOTIATEDCOS + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePortActiveLogin.CIM_PROPERTY_NEGOTIATEDCOS + " could not be found");
    		
		} else if (!CIM_FibrePortActiveLoginHelper.isValid_NegotiatedCOS(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibrePortActiveLogin.CIM_PROPERTY_NEGOTIATEDCOS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePortActiveLogin.CIM_PROPERTY_NEGOTIATEDCOS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute NegotiatedFrameSize
	
	public UnsignedInt64 get_NegotiatedFrameSize() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePortActiveLogin.CIM_PROPERTY_NEGOTIATEDFRAMESIZE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePortActiveLogin.CIM_PROPERTY_NEGOTIATEDFRAMESIZE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePortActiveLogin.CIM_PROPERTY_NEGOTIATEDFRAMESIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_NegotiatedFrameSize(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePortActiveLogin.CIM_PROPERTY_NEGOTIATEDFRAMESIZE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePortActiveLogin.CIM_PROPERTY_NEGOTIATEDFRAMESIZE + " could not be found");
    		
		} else if (!CIM_FibrePortActiveLoginHelper.isValid_NegotiatedFrameSize(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibrePortActiveLogin.CIM_PROPERTY_NEGOTIATEDFRAMESIZE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePortActiveLogin.CIM_PROPERTY_NEGOTIATEDFRAMESIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute NegotiatedSpeed
	
	public UnsignedInt64 get_NegotiatedSpeed() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePortActiveLogin.CIM_PROPERTY_NEGOTIATEDSPEED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePortActiveLogin.CIM_PROPERTY_NEGOTIATEDSPEED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePortActiveLogin.CIM_PROPERTY_NEGOTIATEDSPEED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_NegotiatedSpeed(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePortActiveLogin.CIM_PROPERTY_NEGOTIATEDSPEED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePortActiveLogin.CIM_PROPERTY_NEGOTIATEDSPEED + " could not be found");
    		
		} else if (!CIM_FibrePortActiveLoginHelper.isValid_NegotiatedSpeed(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibrePortActiveLogin.CIM_PROPERTY_NEGOTIATEDSPEED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePortActiveLogin.CIM_PROPERTY_NEGOTIATEDSPEED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OriginatorBufferCredit
	
	public UnsignedInt64 get_OriginatorBufferCredit() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePortActiveLogin.CIM_PROPERTY_ORIGINATORBUFFERCREDIT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePortActiveLogin.CIM_PROPERTY_ORIGINATORBUFFERCREDIT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePortActiveLogin.CIM_PROPERTY_ORIGINATORBUFFERCREDIT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OriginatorBufferCredit(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePortActiveLogin.CIM_PROPERTY_ORIGINATORBUFFERCREDIT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePortActiveLogin.CIM_PROPERTY_ORIGINATORBUFFERCREDIT + " could not be found");
    		
		} else if (!CIM_FibrePortActiveLoginHelper.isValid_OriginatorBufferCredit(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibrePortActiveLogin.CIM_PROPERTY_ORIGINATORBUFFERCREDIT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePortActiveLogin.CIM_PROPERTY_ORIGINATORBUFFERCREDIT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OriginatorEndCredit
	
	public UnsignedInt64 get_OriginatorEndCredit() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePortActiveLogin.CIM_PROPERTY_ORIGINATORENDCREDIT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePortActiveLogin.CIM_PROPERTY_ORIGINATORENDCREDIT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePortActiveLogin.CIM_PROPERTY_ORIGINATORENDCREDIT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OriginatorEndCredit(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePortActiveLogin.CIM_PROPERTY_ORIGINATORENDCREDIT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePortActiveLogin.CIM_PROPERTY_ORIGINATORENDCREDIT + " could not be found");
    		
		} else if (!CIM_FibrePortActiveLoginHelper.isValid_OriginatorEndCredit(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibrePortActiveLogin.CIM_PROPERTY_ORIGINATORENDCREDIT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePortActiveLogin.CIM_PROPERTY_ORIGINATORENDCREDIT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ResponderBufferCredit
	
	public UnsignedInt64 get_ResponderBufferCredit() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePortActiveLogin.CIM_PROPERTY_RESPONDERBUFFERCREDIT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePortActiveLogin.CIM_PROPERTY_RESPONDERBUFFERCREDIT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePortActiveLogin.CIM_PROPERTY_RESPONDERBUFFERCREDIT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ResponderBufferCredit(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePortActiveLogin.CIM_PROPERTY_RESPONDERBUFFERCREDIT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePortActiveLogin.CIM_PROPERTY_RESPONDERBUFFERCREDIT + " could not be found");
    		
		} else if (!CIM_FibrePortActiveLoginHelper.isValid_ResponderBufferCredit(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibrePortActiveLogin.CIM_PROPERTY_RESPONDERBUFFERCREDIT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePortActiveLogin.CIM_PROPERTY_RESPONDERBUFFERCREDIT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ResponderEndCredit
	
	public UnsignedInt64 get_ResponderEndCredit() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePortActiveLogin.CIM_PROPERTY_RESPONDERENDCREDIT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePortActiveLogin.CIM_PROPERTY_RESPONDERENDCREDIT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePortActiveLogin.CIM_PROPERTY_RESPONDERENDCREDIT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ResponderEndCredit(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePortActiveLogin.CIM_PROPERTY_RESPONDERENDCREDIT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePortActiveLogin.CIM_PROPERTY_RESPONDERENDCREDIT + " could not be found");
    		
		} else if (!CIM_FibrePortActiveLoginHelper.isValid_ResponderEndCredit(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibrePortActiveLogin.CIM_PROPERTY_RESPONDERENDCREDIT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePortActiveLogin.CIM_PROPERTY_RESPONDERENDCREDIT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_FibrePort_1
	
	public CIMObjectPath get_CIM_FibrePort_1() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePortActiveLogin.CIM_PROPERTY_CIM_FIBREPORT_1);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePortActiveLogin.CIM_PROPERTY_CIM_FIBREPORT_1 + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_FibrePort.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePortActiveLogin.CIM_PROPERTY_CIM_FIBREPORT_1 + " is not of expected type CIM_FibrePort.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_FibrePort_1(CIM_FibrePort newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePortActiveLogin.CIM_PROPERTY_CIM_FIBREPORT_1);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePortActiveLogin.CIM_PROPERTY_CIM_FIBREPORT_1 + " could not be found");
    		
		} else if (!CIM_FibrePortActiveLoginHelper.isValid_CIM_FibrePort_1(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibrePortActiveLogin.CIM_PROPERTY_CIM_FIBREPORT_1);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_FibrePort.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePortActiveLogin.CIM_PROPERTY_CIM_FIBREPORT_1 + " is not of expected type CIM_FibrePort.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_FibrePort.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_FibrePort_2
	
	public CIMObjectPath get_CIM_FibrePort_2() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePortActiveLogin.CIM_PROPERTY_CIM_FIBREPORT_2);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePortActiveLogin.CIM_PROPERTY_CIM_FIBREPORT_2 + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_FibrePort.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePortActiveLogin.CIM_PROPERTY_CIM_FIBREPORT_2 + " is not of expected type CIM_FibrePort.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_FibrePort_2(CIM_FibrePort newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FibrePortActiveLogin.CIM_PROPERTY_CIM_FIBREPORT_2);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FibrePortActiveLogin.CIM_PROPERTY_CIM_FIBREPORT_2 + " could not be found");
    		
		} else if (!CIM_FibrePortActiveLoginHelper.isValid_CIM_FibrePort_2(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FibrePortActiveLogin.CIM_PROPERTY_CIM_FIBREPORT_2);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_FibrePort.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FibrePortActiveLogin.CIM_PROPERTY_CIM_FIBREPORT_2 + " is not of expected type CIM_FibrePort.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_FibrePort.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
