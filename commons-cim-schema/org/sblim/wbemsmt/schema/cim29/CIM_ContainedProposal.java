/** 
 * CIM_ContainedProposal.java
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
 * Description: ContainedProposal holds an ordered list of SAProposals that make up an SANegotiationAction. If the referenced NegotiationAction is an IKEAction, then the SAProposal objects MUST be IKEProposals. If the referenced NegotiationAction object is an IPsecTransport/TunnelAction, then the referenced SAProposal objects MUST be IPsecProposals.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_ContainedProposal extends CIM_Component  {
	
	public final static String CIM_CLASS_NAME = "CIM_ContainedProposal";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	public final static String CIM_PROPERTY_CIM_SANEGOTIATIONACTION = "GroupComponent"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_SAPROPOSAL = "PartComponent"; //$NON-NLS-1$
	
	
	/**
	*	SequenceNumber indicates the ordering to be used when chosing from among the proposals. Lower-valued proposals are preferred over proposals with higher values. For ContainedProposals that reference the same SANegotiationAction, SequenceNumber values MUST be unique.
	*/
	public final static String CIM_PROPERTY_SEQUENCENUMBER = "SequenceNumber"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_SEQUENCENUMBER);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_SANEGOTIATIONACTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_SAPROPOSAL);
				
		for (int i = 0; i < CIM_Component.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Component.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SEQUENCENUMBER)){
				continue;
			}
			
			CIM_ContainedProposal.CIM_PropertyNameList.add(CIM_Component.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SEQUENCENUMBER, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_SANEGOTIATIONACTION, new CIMValue(null, new CIMDataType(CIM_SANegotiationAction.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_SAPROPOSAL, new CIMValue(null, new CIMDataType(CIM_SAProposal.CIM_CLASS_NAME))));
				
		for (int i = 0; i < CIM_Component.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Component.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SEQUENCENUMBER)){
				continue;
			}
			
			CIM_ContainedProposal.CIM_PropertyList.add(CIM_Component.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_Component.Java_Package_List.size(); i++) {
			if (((String)CIM_Component.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_Component.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_ContainedProposal() {

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
	public CIM_ContainedProposal(Vector keyProperties){ 
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
	public CIM_ContainedProposal(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_ContainedProposal)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_ContainedProposal)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_ContainedProposal)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_ContainedProposal)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_ContainedProposal)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_ContainedProposal)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_ContainedProposal)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_ContainedProposal)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_ContainedProposal)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_ContainedProposal)object).cimObjectPath)) {
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
	
	// Attribute SequenceNumber
	
	public UnsignedInt16 get_SequenceNumber() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ContainedProposal.CIM_PROPERTY_SEQUENCENUMBER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ContainedProposal.CIM_PROPERTY_SEQUENCENUMBER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ContainedProposal.CIM_PROPERTY_SEQUENCENUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SequenceNumber(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ContainedProposal.CIM_PROPERTY_SEQUENCENUMBER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ContainedProposal.CIM_PROPERTY_SEQUENCENUMBER + " could not be found");
    		
		} else if (!CIM_ContainedProposalHelper.isValid_SequenceNumber(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ContainedProposal.CIM_PROPERTY_SEQUENCENUMBER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ContainedProposal.CIM_PROPERTY_SEQUENCENUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_SANegotiationAction
	
	public CIMObjectPath get_CIM_SANegotiationAction() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ContainedProposal.CIM_PROPERTY_CIM_SANEGOTIATIONACTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ContainedProposal.CIM_PROPERTY_CIM_SANEGOTIATIONACTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_SANegotiationAction.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ContainedProposal.CIM_PROPERTY_CIM_SANEGOTIATIONACTION + " is not of expected type CIM_SANegotiationAction.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_SANegotiationAction(CIM_SANegotiationAction newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ContainedProposal.CIM_PROPERTY_CIM_SANEGOTIATIONACTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ContainedProposal.CIM_PROPERTY_CIM_SANEGOTIATIONACTION + " could not be found");
    		
		} else if (!CIM_ContainedProposalHelper.isValid_CIM_SANegotiationAction(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ContainedProposal.CIM_PROPERTY_CIM_SANEGOTIATIONACTION);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_SANegotiationAction.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ContainedProposal.CIM_PROPERTY_CIM_SANEGOTIATIONACTION + " is not of expected type CIM_SANegotiationAction.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_SANegotiationAction.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_SAProposal
	
	public CIMObjectPath get_CIM_SAProposal() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ContainedProposal.CIM_PROPERTY_CIM_SAPROPOSAL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ContainedProposal.CIM_PROPERTY_CIM_SAPROPOSAL + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_SAProposal.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ContainedProposal.CIM_PROPERTY_CIM_SAPROPOSAL + " is not of expected type CIM_SAProposal.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_SAProposal(CIM_SAProposal newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ContainedProposal.CIM_PROPERTY_CIM_SAPROPOSAL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ContainedProposal.CIM_PROPERTY_CIM_SAPROPOSAL + " could not be found");
    		
		} else if (!CIM_ContainedProposalHelper.isValid_CIM_SAProposal(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ContainedProposal.CIM_PROPERTY_CIM_SAPROPOSAL);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_SAProposal.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ContainedProposal.CIM_PROPERTY_CIM_SAPROPOSAL + " is not of expected type CIM_SAProposal.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_SAProposal.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
