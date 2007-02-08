/** 
 * PRS_Attachment.java
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
 * Description: PRS_Attachment describes file attachments. A PRS_Attachment may be associated to any object derived from PRS_ExchangeElement. PRS_Attachment is used to attach objects of any type including binary files, ASCII documents, or URLs. Only one object may be attached per PRS_Attachment. 

The actual attachment carried by the Attachment object is included by one of two methods: by reference or by value as embedded data. A 'by reference' approach links indirectly to the attachment through the use of a string identifier, e.g. a file name. An 'embedded data' approach means the actual binary data is included in PRS_Attachment.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.lang.reflect.Constructor;
import org.sblim.wbem.client.*;



public class PRS_Attachment extends PRS_ExchangeElement  {
	
	public final static String CIM_CLASS_NAME = "PRS_Attachment";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_PRS_ATTACHED = "PRS_Attached";
	
	
	/**
	*	The displayable attachment identifier. Used to define what will appear as the name of the attachment, as opposed to the specific attachment file name or URL.
	*/
	public final static String CIM_PROPERTY_ATTACHMENTNAME = "AttachmentName"; //$NON-NLS-1$
	/**
	*	The attachment itself, if embedded.
	*/
	public final static String CIM_PROPERTY_ATTACHMENTOBJECT = "AttachmentObject"; //$NON-NLS-1$
	/**
	*	If the attachment is not embedded, where the attachment is located.
	*/
	public final static String CIM_PROPERTY_ATTACHMENTREFERENCE = "AttachmentReference"; //$NON-NLS-1$
	/**
	*	The size of the attachment in bytes.
	*/
	public final static String CIM_PROPERTY_ATTACHMENTSIZE = "AttachmentSize"; //$NON-NLS-1$
	/**
	*	The purpose of the attachment, as related to the diagnosis. 'Instructions' are compilable code. 'Background' is descriptive information. 'Log' is information captured in a log file.
	*/
	public final static String CIM_PROPERTY_ATTACHMENTTYPE = "AttachmentType"; //$NON-NLS-1$
	/**
	*	The file format of the attachment.
	*/
	public final static String CIM_PROPERTY_FORMAT = "Format"; //$NON-NLS-1$
	/**
	*	Protocol required to read the attachment (e.g., http).
	*/
	public final static String CIM_PROPERTY_PROTOCOL = "Protocol"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ATTACHMENTNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_ATTACHMENTOBJECT);
		CIM_PropertyNameList.add(CIM_PROPERTY_ATTACHMENTREFERENCE);
		CIM_PropertyNameList.add(CIM_PROPERTY_ATTACHMENTSIZE);
		CIM_PropertyNameList.add(CIM_PROPERTY_ATTACHMENTTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_FORMAT);
		CIM_PropertyNameList.add(CIM_PROPERTY_PROTOCOL);
				
		for (int i = 0; i < PRS_ExchangeElement.CIM_PropertyNameList.size(); i++) {
			if (((String)PRS_ExchangeElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ATTACHMENTNAME)||
				((String)PRS_ExchangeElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ATTACHMENTOBJECT)||
				((String)PRS_ExchangeElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ATTACHMENTREFERENCE)||
				((String)PRS_ExchangeElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ATTACHMENTSIZE)||
				((String)PRS_ExchangeElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ATTACHMENTTYPE)||
				((String)PRS_ExchangeElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FORMAT)||
				((String)PRS_ExchangeElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PROTOCOL)){
				continue;
			}
			
			PRS_Attachment.CIM_PropertyNameList.add(PRS_ExchangeElement.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ATTACHMENTNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ATTACHMENTOBJECT, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ATTACHMENTREFERENCE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ATTACHMENTSIZE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ATTACHMENTTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FORMAT, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PROTOCOL, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < PRS_ExchangeElement.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)PRS_ExchangeElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ATTACHMENTNAME)||
				((CIMProperty)PRS_ExchangeElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ATTACHMENTOBJECT)||
				((CIMProperty)PRS_ExchangeElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ATTACHMENTREFERENCE)||
				((CIMProperty)PRS_ExchangeElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ATTACHMENTSIZE)||
				((CIMProperty)PRS_ExchangeElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ATTACHMENTTYPE)||
				((CIMProperty)PRS_ExchangeElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FORMAT)||
				((CIMProperty)PRS_ExchangeElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PROTOCOL)){
				continue;
			}
			
			PRS_Attachment.CIM_PropertyList.add(PRS_ExchangeElement.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < PRS_ExchangeElement.Java_Package_List.size(); i++) {
			if (((String)PRS_ExchangeElement.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(PRS_ExchangeElement.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_ATTACHMENTTYPE = {"Instructions","Background","Log","Unknown","Undefined"};
	
	
	public final static int ATTACHMENTTYPE_INSTRUCTIONS = 0;
	public final static int ATTACHMENTTYPE_BACKGROUND = 1;
	public final static int ATTACHMENTTYPE_LOG = 2;
	public final static int ATTACHMENTTYPE_UNKNOWN = 254;
	public final static int ATTACHMENTTYPE_UNDEFINED = 255;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public PRS_Attachment() {

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
	public PRS_Attachment(Vector keyProperties){ 
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
	public PRS_Attachment(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof PRS_Attachment)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((PRS_Attachment)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((PRS_Attachment)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((PRS_Attachment)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((PRS_Attachment)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((PRS_Attachment)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((PRS_Attachment)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((PRS_Attachment)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((PRS_Attachment)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((PRS_Attachment)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_PRS_ExchangeElement_PRS_Attacheds(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_PRS_ATTACHED, 
					PRS_ExchangeElement.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < PRS_Attachment.Java_Package_List.size(); i++) {
						if (!((String)(PRS_Attachment.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(PRS_Attachment.Java_Package_List.get(i))).endsWith(".")) {
							PRS_Attachment.Java_Package_List.setElementAt((String)(PRS_Attachment.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (PRS_Attachment.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new PRS_ExchangeElement(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
					
					Class[] constParams = new Class[2];
					constParams[0] = CIMObjectPath.class;
					constParams[1] = CIMInstance.class;
					Constructor cons = null;
					try {
						cons = clazz.getConstructor(constParams);
						
					} catch(NoSuchMethodException e) {
						System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of the base class.");
						resultArrayList.add(new PRS_ExchangeElement(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new PRS_ExchangeElement(cimInstance.getObjectPath(), cimInstance));
						continue;
					}

				}
			}
		} finally {
			try {
				if (enumeration != null) {
					((CIMEnumeration)enumeration).close();
				}
			} catch(Exception e) {
				throw new CIMException(CIMException.CIM_ERR_FAILED, "The socket of the result could not be closed properly.");
			}
		}
			
		return resultArrayList;
	}

	public ArrayList getAssociated_PRS_ExchangeElement_PRS_Attached_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_PRS_ATTACHED, 
					PRS_ExchangeElement.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(PRS_ExchangeElement.CIM_CLASS_NAME)) {
						resultArrayList.add(obj);
					}
				}
			}
		} finally {
			try {
				if (enumeration != null) {
					((CIMEnumeration)enumeration).close();
				}
			} catch(Exception e) {
				throw new CIMException(CIMException.CIM_ERR_FAILED, "The socket of the result could not be closed properly.");
			}
		}
			
		return resultArrayList;
	}

	
	
	//*****************************************************
	// Attribute methods
	//*****************************************************
	
	// Attribute AttachmentName
	
	public String get_AttachmentName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_Attachment.CIM_PROPERTY_ATTACHMENTNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_Attachment.CIM_PROPERTY_ATTACHMENTNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_Attachment.CIM_PROPERTY_ATTACHMENTNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AttachmentName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_Attachment.CIM_PROPERTY_ATTACHMENTNAME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_Attachment.CIM_PROPERTY_ATTACHMENTNAME + " could not be found");
    		
		} else if (!PRS_AttachmentHelper.isValid_AttachmentName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + PRS_Attachment.CIM_PROPERTY_ATTACHMENTNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_Attachment.CIM_PROPERTY_ATTACHMENTNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute AttachmentObject
	
	public String get_AttachmentObject() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_Attachment.CIM_PROPERTY_ATTACHMENTOBJECT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_Attachment.CIM_PROPERTY_ATTACHMENTOBJECT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_Attachment.CIM_PROPERTY_ATTACHMENTOBJECT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AttachmentObject(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_Attachment.CIM_PROPERTY_ATTACHMENTOBJECT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_Attachment.CIM_PROPERTY_ATTACHMENTOBJECT + " could not be found");
    		
		} else if (!PRS_AttachmentHelper.isValid_AttachmentObject(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + PRS_Attachment.CIM_PROPERTY_ATTACHMENTOBJECT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_Attachment.CIM_PROPERTY_ATTACHMENTOBJECT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute AttachmentReference
	
	public String get_AttachmentReference() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_Attachment.CIM_PROPERTY_ATTACHMENTREFERENCE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_Attachment.CIM_PROPERTY_ATTACHMENTREFERENCE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_Attachment.CIM_PROPERTY_ATTACHMENTREFERENCE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AttachmentReference(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_Attachment.CIM_PROPERTY_ATTACHMENTREFERENCE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_Attachment.CIM_PROPERTY_ATTACHMENTREFERENCE + " could not be found");
    		
		} else if (!PRS_AttachmentHelper.isValid_AttachmentReference(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + PRS_Attachment.CIM_PROPERTY_ATTACHMENTREFERENCE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_Attachment.CIM_PROPERTY_ATTACHMENTREFERENCE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute AttachmentSize
	
	public String get_AttachmentSize() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_Attachment.CIM_PROPERTY_ATTACHMENTSIZE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_Attachment.CIM_PROPERTY_ATTACHMENTSIZE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_Attachment.CIM_PROPERTY_ATTACHMENTSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AttachmentSize(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_Attachment.CIM_PROPERTY_ATTACHMENTSIZE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_Attachment.CIM_PROPERTY_ATTACHMENTSIZE + " could not be found");
    		
		} else if (!PRS_AttachmentHelper.isValid_AttachmentSize(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + PRS_Attachment.CIM_PROPERTY_ATTACHMENTSIZE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_Attachment.CIM_PROPERTY_ATTACHMENTSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute AttachmentType
	
	public UnsignedInt8 get_AttachmentType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_Attachment.CIM_PROPERTY_ATTACHMENTTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_Attachment.CIM_PROPERTY_ATTACHMENTTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_Attachment.CIM_PROPERTY_ATTACHMENTTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AttachmentType(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_Attachment.CIM_PROPERTY_ATTACHMENTTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_Attachment.CIM_PROPERTY_ATTACHMENTTYPE + " could not be found");
    		
		} else if (!PRS_AttachmentHelper.isValid_AttachmentType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + PRS_Attachment.CIM_PROPERTY_ATTACHMENTTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_Attachment.CIM_PROPERTY_ATTACHMENTTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Format
	
	public String get_Format() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_Attachment.CIM_PROPERTY_FORMAT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_Attachment.CIM_PROPERTY_FORMAT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_Attachment.CIM_PROPERTY_FORMAT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Format(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_Attachment.CIM_PROPERTY_FORMAT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_Attachment.CIM_PROPERTY_FORMAT + " could not be found");
    		
		} else if (!PRS_AttachmentHelper.isValid_Format(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + PRS_Attachment.CIM_PROPERTY_FORMAT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_Attachment.CIM_PROPERTY_FORMAT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Protocol
	
	public String get_Protocol() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_Attachment.CIM_PROPERTY_PROTOCOL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_Attachment.CIM_PROPERTY_PROTOCOL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_Attachment.CIM_PROPERTY_PROTOCOL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Protocol(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_Attachment.CIM_PROPERTY_PROTOCOL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_Attachment.CIM_PROPERTY_PROTOCOL + " could not be found");
    		
		} else if (!PRS_AttachmentHelper.isValid_Protocol(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + PRS_Attachment.CIM_PROPERTY_PROTOCOL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_Attachment.CIM_PROPERTY_PROTOCOL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
