/** 
 * CIM_PCVideoController.java
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
 * Description: Capabilities and management of a PCVideoController, a subtype of VideoController.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_PCVideoController extends CIM_VideoController  {
	
	public final static String CIM_CLASS_NAME = "CIM_PCVideoController";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	
	
	/**
	*	Current number of color planes. If this value is not applicable for the current video configuration, enter 0.
	*/
	public final static String CIM_PROPERTY_NUMBEROFCOLORPLANES = "NumberOfColorPlanes"; //$NON-NLS-1$
	/**
	*	The video architecture. For example, VGA (value=5) or PC-98 (160) may be specified.
	*/
	public final static String CIM_PROPERTY_VIDEOARCHITECTURE = "VideoArchitecture"; //$NON-NLS-1$
	/**
	*	Current video mode.
	*/
	public final static String CIM_PROPERTY_VIDEOMODE = "VideoMode"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_NUMBEROFCOLORPLANES);
		CIM_PropertyNameList.add(CIM_PROPERTY_VIDEOARCHITECTURE);
		CIM_PropertyNameList.add(CIM_PROPERTY_VIDEOMODE);
				
		for (int i = 0; i < CIM_VideoController.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_VideoController.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NUMBEROFCOLORPLANES)||
				((String)CIM_VideoController.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_VIDEOARCHITECTURE)||
				((String)CIM_VideoController.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_VIDEOMODE)){
				continue;
			}
			
			CIM_PCVideoController.CIM_PropertyNameList.add(CIM_VideoController.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NUMBEROFCOLORPLANES, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_VIDEOARCHITECTURE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_VIDEOMODE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
				
		for (int i = 0; i < CIM_VideoController.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_VideoController.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NUMBEROFCOLORPLANES)||
				((CIMProperty)CIM_VideoController.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_VIDEOARCHITECTURE)||
				((CIMProperty)CIM_VideoController.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_VIDEOMODE)){
				continue;
			}
			
			CIM_PCVideoController.CIM_PropertyList.add(CIM_VideoController.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_VideoController.Java_Package_List.size(); i++) {
			if (((String)CIM_VideoController.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_VideoController.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_VIDEOARCHITECTURE = {"Other","Unknown","CGA","EGA","VGA","SVGA","MDA","HGC","MCGA","8514A","XGA","Linear Frame Buffer","PC-98"};
	
	
	public final static int VIDEOARCHITECTURE_OTHER = 1;
	public final static int VIDEOARCHITECTURE_UNKNOWN = 2;
	public final static int VIDEOARCHITECTURE_CGA = 3;
	public final static int VIDEOARCHITECTURE_EGA = 4;
	public final static int VIDEOARCHITECTURE_VGA = 5;
	public final static int VIDEOARCHITECTURE_SVGA = 6;
	public final static int VIDEOARCHITECTURE_MDA = 7;
	public final static int VIDEOARCHITECTURE_HGC = 8;
	public final static int VIDEOARCHITECTURE_MCGA = 9;
	public final static int VIDEOARCHITECTURE_8514A = 10;
	public final static int VIDEOARCHITECTURE_XGA = 11;
	public final static int VIDEOARCHITECTURE_LINEARFRAMEBUFFER = 12;
	public final static int VIDEOARCHITECTURE_PC_98 = 160;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_PCVideoController() {

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
	public CIM_PCVideoController(Vector keyProperties){ 
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
	public CIM_PCVideoController(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_PCVideoController)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_PCVideoController)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_PCVideoController)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_PCVideoController)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_PCVideoController)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_PCVideoController)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_PCVideoController)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_PCVideoController)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_PCVideoController)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_PCVideoController)object).cimObjectPath)) {
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
	
	// Attribute NumberOfColorPlanes
	
	public UnsignedInt16 get_NumberOfColorPlanes() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCVideoController.CIM_PROPERTY_NUMBEROFCOLORPLANES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCVideoController.CIM_PROPERTY_NUMBEROFCOLORPLANES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCVideoController.CIM_PROPERTY_NUMBEROFCOLORPLANES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_NumberOfColorPlanes(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCVideoController.CIM_PROPERTY_NUMBEROFCOLORPLANES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCVideoController.CIM_PROPERTY_NUMBEROFCOLORPLANES + " could not be found");
    		
		} else if (!CIM_PCVideoControllerHelper.isValid_NumberOfColorPlanes(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PCVideoController.CIM_PROPERTY_NUMBEROFCOLORPLANES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCVideoController.CIM_PROPERTY_NUMBEROFCOLORPLANES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute VideoArchitecture
	
	public UnsignedInt16 get_VideoArchitecture() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCVideoController.CIM_PROPERTY_VIDEOARCHITECTURE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCVideoController.CIM_PROPERTY_VIDEOARCHITECTURE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCVideoController.CIM_PROPERTY_VIDEOARCHITECTURE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_VideoArchitecture(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCVideoController.CIM_PROPERTY_VIDEOARCHITECTURE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCVideoController.CIM_PROPERTY_VIDEOARCHITECTURE + " could not be found");
    		
		} else if (!CIM_PCVideoControllerHelper.isValid_VideoArchitecture(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PCVideoController.CIM_PROPERTY_VIDEOARCHITECTURE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCVideoController.CIM_PROPERTY_VIDEOARCHITECTURE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute VideoMode
	
	public UnsignedInt16 get_VideoMode() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCVideoController.CIM_PROPERTY_VIDEOMODE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCVideoController.CIM_PROPERTY_VIDEOMODE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCVideoController.CIM_PROPERTY_VIDEOMODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_VideoMode(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCVideoController.CIM_PROPERTY_VIDEOMODE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCVideoController.CIM_PROPERTY_VIDEOMODE + " could not be found");
    		
		} else if (!CIM_PCVideoControllerHelper.isValid_VideoMode(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PCVideoController.CIM_PROPERTY_VIDEOMODE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCVideoController.CIM_PROPERTY_VIDEOMODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
