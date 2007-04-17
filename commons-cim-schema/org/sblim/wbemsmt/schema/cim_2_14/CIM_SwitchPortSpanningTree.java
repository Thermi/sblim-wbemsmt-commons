/** 
 * CIM_SwitchPortSpanningTree.java
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
 * Description:  A switch participating in the spanning tree maintains spanning-tree specific
 * information about each port whose forwarding is determined by the spanning
 * tree. This association represents that information.
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
import org.sblim.wbem.cim.UnsignedInt8;


/**
 *  A switch participating in the spanning tree maintains spanning-tree specific
 * information about each port whose forwarding is determined by the spanning
 * tree. This association represents that information.
 */
public class CIM_SwitchPortSpanningTree extends CIM_ServiceSAPDependency  {
	
	public final static String CIM_CLASS_NAME = "CIM_SwitchPortSpanningTree"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	public final static String CIM_PROPERTY_CIM_SWITCHPORT = "Antecedent"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_SPANNINGTREESERVICE = "Dependent"; //$NON-NLS-1$
	
	
	/**
	*	The bridge identifier of the designated bridge for the segment to which the port is attached.
	*/
	public final static String CIM_PROPERTY_DESIGNATEDBRIDGE = "DesignatedBridge"; //$NON-NLS-1$
	/**
	*	The cost of the path to the root offered by the designated bridge for the segment.
	*/
	public final static String CIM_PROPERTY_DESIGNATEDCOST = "DesignatedCost"; //$NON-NLS-1$
	/**
	*	The port identifier of the port on the designated bridge serving the segment to which the port is attached.
	*/
	public final static String CIM_PROPERTY_DESIGNATEDPORT = "DesignatedPort"; //$NON-NLS-1$
	/**
	*	The bridge identifier of the root bridge for the segment to which the port is attached, as transmitted by the designated bridge for the segment.
	*/
	public final static String CIM_PROPERTY_DESIGNATEDROOT = "DesignatedRoot"; //$NON-NLS-1$
	/**
	*	The enabled/disabled status of the port. This property is deprecated since the status of the port is available by inheritance from EnabledLogicalElement.
	*/
	public final static String CIM_PROPERTY_ENABLE = "Enable"; //$NON-NLS-1$
	/**
	*	The contribution of this port to the path cost of paths towards the spanning tree root which include this port.
	*/
	public final static String CIM_PROPERTY_PATHCOST = "PathCost"; //$NON-NLS-1$
	/**
	*	The priority assigned to the port. Contained in the first octet of the two-octet port ID; the other octet is the port number.
	*/
	public final static String CIM_PROPERTY_PRIORITY = "Priority"; //$NON-NLS-1$
	/**
	*	The current state of the port as determined by the spanning tree protocol.
	*/
	public final static String CIM_PROPERTY_STATE = "State"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_DESIGNATEDBRIDGE);
		CIM_PropertyNameList.add(CIM_PROPERTY_DESIGNATEDCOST);
		CIM_PropertyNameList.add(CIM_PROPERTY_DESIGNATEDPORT);
		CIM_PropertyNameList.add(CIM_PROPERTY_DESIGNATEDROOT);
		CIM_PropertyNameList.add(CIM_PROPERTY_ENABLE);
		CIM_PropertyNameList.add(CIM_PROPERTY_PATHCOST);
		CIM_PropertyNameList.add(CIM_PROPERTY_PRIORITY);
		CIM_PropertyNameList.add(CIM_PROPERTY_STATE);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_SWITCHPORT);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_SPANNINGTREESERVICE);
				
		for (int i = 0; i < CIM_ServiceSAPDependency.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_ServiceSAPDependency.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DESIGNATEDBRIDGE)||
				((String)CIM_ServiceSAPDependency.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DESIGNATEDCOST)||
				((String)CIM_ServiceSAPDependency.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DESIGNATEDPORT)||
				((String)CIM_ServiceSAPDependency.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DESIGNATEDROOT)||
				((String)CIM_ServiceSAPDependency.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ENABLE)||
				((String)CIM_ServiceSAPDependency.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PATHCOST)||
				((String)CIM_ServiceSAPDependency.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PRIORITY)||
				((String)CIM_ServiceSAPDependency.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_STATE)){
				continue;
			}
			
			CIM_SwitchPortSpanningTree.CIM_PropertyNameList.add(CIM_ServiceSAPDependency.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DESIGNATEDBRIDGE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DESIGNATEDCOST, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DESIGNATEDPORT, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DESIGNATEDROOT, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ENABLE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PATHCOST, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PRIORITY, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_STATE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_SWITCHPORT, new CIMValue(null, new CIMDataType(CIM_SwitchPort.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_SPANNINGTREESERVICE, new CIMValue(null, new CIMDataType(CIM_SpanningTreeService.CIM_CLASS_NAME))));
				
		for (int i = 0; i < CIM_ServiceSAPDependency.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_ServiceSAPDependency.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DESIGNATEDBRIDGE)||
				((CIMProperty)CIM_ServiceSAPDependency.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DESIGNATEDCOST)||
				((CIMProperty)CIM_ServiceSAPDependency.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DESIGNATEDPORT)||
				((CIMProperty)CIM_ServiceSAPDependency.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DESIGNATEDROOT)||
				((CIMProperty)CIM_ServiceSAPDependency.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ENABLE)||
				((CIMProperty)CIM_ServiceSAPDependency.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PATHCOST)||
				((CIMProperty)CIM_ServiceSAPDependency.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PRIORITY)||
				((CIMProperty)CIM_ServiceSAPDependency.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_STATE)){
				continue;
			}
			
			CIM_SwitchPortSpanningTree.CIM_PropertyList.add(CIM_ServiceSAPDependency.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_ServiceSAPDependency.Java_Package_List.size(); i++) {
			if (((String)CIM_ServiceSAPDependency.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_ServiceSAPDependency.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_ENABLE = {"Enabled","Disabled"};
	public final static String[] CIM_VALUEMAP_STATE = {"Disabled","Blocking","Listening","Learning","Forwarding","Broken"};
	
	
	public final static int ENABLE_ENABLED = 1;
	public final static int ENABLE_DISABLED = 2;
	
	public final static int STATE_DISABLED = 1;
	public final static int STATE_BLOCKING = 2;
	public final static int STATE_LISTENING = 3;
	public final static int STATE_LEARNING = 4;
	public final static int STATE_FORWARDING = 5;
	public final static int STATE_BROKEN = 6;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_SwitchPortSpanningTree() {

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
	public CIM_SwitchPortSpanningTree(Vector keyProperties){ 
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
	public CIM_SwitchPortSpanningTree(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_SwitchPortSpanningTree)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_SwitchPortSpanningTree)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_SwitchPortSpanningTree)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_SwitchPortSpanningTree)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_SwitchPortSpanningTree)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_SwitchPortSpanningTree)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_SwitchPortSpanningTree)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_SwitchPortSpanningTree)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_SwitchPortSpanningTree)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_SwitchPortSpanningTree)object).cimObjectPath)) {
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
	
	// Attribute DesignatedBridge
	
	public String get_DesignatedBridge() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortSpanningTree.CIM_PROPERTY_DESIGNATEDBRIDGE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortSpanningTree.CIM_PROPERTY_DESIGNATEDBRIDGE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortSpanningTree.CIM_PROPERTY_DESIGNATEDBRIDGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DesignatedBridge(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortSpanningTree.CIM_PROPERTY_DESIGNATEDBRIDGE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortSpanningTree.CIM_PROPERTY_DESIGNATEDBRIDGE + " could not be found");
    		
		} else if (!CIM_SwitchPortSpanningTreeHelper.isValid_DesignatedBridge(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SwitchPortSpanningTree.CIM_PROPERTY_DESIGNATEDBRIDGE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortSpanningTree.CIM_PROPERTY_DESIGNATEDBRIDGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DesignatedCost
	
	public UnsignedInt16 get_DesignatedCost() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortSpanningTree.CIM_PROPERTY_DESIGNATEDCOST);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortSpanningTree.CIM_PROPERTY_DESIGNATEDCOST + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortSpanningTree.CIM_PROPERTY_DESIGNATEDCOST + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DesignatedCost(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortSpanningTree.CIM_PROPERTY_DESIGNATEDCOST);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortSpanningTree.CIM_PROPERTY_DESIGNATEDCOST + " could not be found");
    		
		} else if (!CIM_SwitchPortSpanningTreeHelper.isValid_DesignatedCost(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SwitchPortSpanningTree.CIM_PROPERTY_DESIGNATEDCOST);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortSpanningTree.CIM_PROPERTY_DESIGNATEDCOST + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DesignatedPort
	
	public UnsignedInt16 get_DesignatedPort() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortSpanningTree.CIM_PROPERTY_DESIGNATEDPORT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortSpanningTree.CIM_PROPERTY_DESIGNATEDPORT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortSpanningTree.CIM_PROPERTY_DESIGNATEDPORT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DesignatedPort(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortSpanningTree.CIM_PROPERTY_DESIGNATEDPORT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortSpanningTree.CIM_PROPERTY_DESIGNATEDPORT + " could not be found");
    		
		} else if (!CIM_SwitchPortSpanningTreeHelper.isValid_DesignatedPort(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SwitchPortSpanningTree.CIM_PROPERTY_DESIGNATEDPORT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortSpanningTree.CIM_PROPERTY_DESIGNATEDPORT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DesignatedRoot
	
	public String get_DesignatedRoot() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortSpanningTree.CIM_PROPERTY_DESIGNATEDROOT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortSpanningTree.CIM_PROPERTY_DESIGNATEDROOT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortSpanningTree.CIM_PROPERTY_DESIGNATEDROOT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DesignatedRoot(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortSpanningTree.CIM_PROPERTY_DESIGNATEDROOT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortSpanningTree.CIM_PROPERTY_DESIGNATEDROOT + " could not be found");
    		
		} else if (!CIM_SwitchPortSpanningTreeHelper.isValid_DesignatedRoot(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SwitchPortSpanningTree.CIM_PROPERTY_DESIGNATEDROOT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortSpanningTree.CIM_PROPERTY_DESIGNATEDROOT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Enable
	
	public UnsignedInt16 get_Enable() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortSpanningTree.CIM_PROPERTY_ENABLE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortSpanningTree.CIM_PROPERTY_ENABLE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortSpanningTree.CIM_PROPERTY_ENABLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Enable(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortSpanningTree.CIM_PROPERTY_ENABLE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortSpanningTree.CIM_PROPERTY_ENABLE + " could not be found");
    		
		} else if (!CIM_SwitchPortSpanningTreeHelper.isValid_Enable(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SwitchPortSpanningTree.CIM_PROPERTY_ENABLE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortSpanningTree.CIM_PROPERTY_ENABLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PathCost
	
	public UnsignedInt16 get_PathCost() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortSpanningTree.CIM_PROPERTY_PATHCOST);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortSpanningTree.CIM_PROPERTY_PATHCOST + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortSpanningTree.CIM_PROPERTY_PATHCOST + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PathCost(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortSpanningTree.CIM_PROPERTY_PATHCOST);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortSpanningTree.CIM_PROPERTY_PATHCOST + " could not be found");
    		
		} else if (!CIM_SwitchPortSpanningTreeHelper.isValid_PathCost(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SwitchPortSpanningTree.CIM_PROPERTY_PATHCOST);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortSpanningTree.CIM_PROPERTY_PATHCOST + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Priority
	
	public UnsignedInt8 get_Priority() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortSpanningTree.CIM_PROPERTY_PRIORITY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortSpanningTree.CIM_PROPERTY_PRIORITY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortSpanningTree.CIM_PROPERTY_PRIORITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Priority(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortSpanningTree.CIM_PROPERTY_PRIORITY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortSpanningTree.CIM_PROPERTY_PRIORITY + " could not be found");
    		
		} else if (!CIM_SwitchPortSpanningTreeHelper.isValid_Priority(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SwitchPortSpanningTree.CIM_PROPERTY_PRIORITY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortSpanningTree.CIM_PROPERTY_PRIORITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute State
	
	public UnsignedInt16 get_State() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortSpanningTree.CIM_PROPERTY_STATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortSpanningTree.CIM_PROPERTY_STATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortSpanningTree.CIM_PROPERTY_STATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_State(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortSpanningTree.CIM_PROPERTY_STATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortSpanningTree.CIM_PROPERTY_STATE + " could not be found");
    		
		} else if (!CIM_SwitchPortSpanningTreeHelper.isValid_State(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SwitchPortSpanningTree.CIM_PROPERTY_STATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortSpanningTree.CIM_PROPERTY_STATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_SwitchPort
	
	public CIMObjectPath get_CIM_SwitchPort() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortSpanningTree.CIM_PROPERTY_CIM_SWITCHPORT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortSpanningTree.CIM_PROPERTY_CIM_SWITCHPORT + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_SwitchPort.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortSpanningTree.CIM_PROPERTY_CIM_SWITCHPORT + " is not of expected type CIM_SwitchPort.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_SwitchPort(CIM_SwitchPort newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortSpanningTree.CIM_PROPERTY_CIM_SWITCHPORT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortSpanningTree.CIM_PROPERTY_CIM_SWITCHPORT + " could not be found");
    		
		} else if (!CIM_SwitchPortSpanningTreeHelper.isValid_CIM_SwitchPort(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SwitchPortSpanningTree.CIM_PROPERTY_CIM_SWITCHPORT);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_SwitchPort.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortSpanningTree.CIM_PROPERTY_CIM_SWITCHPORT + " is not of expected type CIM_SwitchPort.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_SwitchPort.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_SpanningTreeService
	
	public CIMObjectPath get_CIM_SpanningTreeService() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortSpanningTree.CIM_PROPERTY_CIM_SPANNINGTREESERVICE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortSpanningTree.CIM_PROPERTY_CIM_SPANNINGTREESERVICE + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_SpanningTreeService.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortSpanningTree.CIM_PROPERTY_CIM_SPANNINGTREESERVICE + " is not of expected type CIM_SpanningTreeService.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_SpanningTreeService(CIM_SpanningTreeService newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SwitchPortSpanningTree.CIM_PROPERTY_CIM_SPANNINGTREESERVICE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SwitchPortSpanningTree.CIM_PROPERTY_CIM_SPANNINGTREESERVICE + " could not be found");
    		
		} else if (!CIM_SwitchPortSpanningTreeHelper.isValid_CIM_SpanningTreeService(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SwitchPortSpanningTree.CIM_PROPERTY_CIM_SPANNINGTREESERVICE);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_SpanningTreeService.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SwitchPortSpanningTree.CIM_PROPERTY_CIM_SPANNINGTREESERVICE + " is not of expected type CIM_SpanningTreeService.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_SpanningTreeService.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
