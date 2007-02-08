/** 
 * CIM_BufferPool.java
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
 * Description: This class represents the use of buffers by a Queuing Service. The existence and management of individual buffers will be modeled in a future release. At the current level of abstraction, modeling the existence of the BufferPool is necessary. Long term, it is not sufficient. 

In implementations where there are multiple buffer sizes, an instance of BufferPool should be defined for each set of buffers with identical or similar sizes. These instances of buffer pools can then be grouped together using the CollectedBuffersPool association. 

Note that this class is derived from CollectionOfMSEs, and not from Forwarding or ConditioningService. BufferPool is only a collection of storage, and is NOT a Service.
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



public class CIM_BufferPool extends CIM_CollectionOfMSEs  {
	
	public final static String CIM_CLASS_NAME = "CIM_BufferPool";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_COLLECTEDBUFFERPOOL = "CIM_CollectedBufferPool";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_QUEUEALLOCATION = "CIM_QueueAllocation";
	
	
	/**
	*	This property is a 32-bit unsigned integer, and defines the number of buffers in the Pool that are currently not allocated to any instance of a QueuingService. Buffers allocated to a QueuingService could either be in use (containing packet data), or allocated to a Queue pending the arrival of new packet data.
	*/
	public final static String CIM_PROPERTY_AVAILABLEBUFFERS = "AvailableBuffers"; //$NON-NLS-1$
	/**
	*	This property is a 16-bit unsigned integer, and defines the number of bytes in each buffer. It is deprecated in lieu of a similar uint32 property.
	*/
	public final static String CIM_PROPERTY_BUFFERSIZE = "BufferSize"; //$NON-NLS-1$
	/**
	*	This property is defined in the CollectionOfMSEs class, but is overridden here to serve as part of the (composite) key that identifies the BufferPool instance.
	*/
	public final static String CIM_PROPERTY_COLLECTIONID = "CollectionID"; //$NON-NLS-1$
	/**
	*	CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
	*/
	public final static String CIM_PROPERTY_CREATIONCLASSNAME = "CreationClassName"; //$NON-NLS-1$
	/**
	*	The Name property defines the label by which the object is known.
	*/
	public final static String CIM_PROPERTY_NAME = "Name"; //$NON-NLS-1$
	/**
	*	This property is a 32-bit unsigned integer, and defines the number of buffers in the Pool that have been simultaneously allocated to multiple instances of QueuingService.
	*/
	public final static String CIM_PROPERTY_SHAREDBUFFERS = "SharedBuffers"; //$NON-NLS-1$
	/**
	*	This property is a 32-bit unsigned integer, and defines the number of bytes in each buffer.
	*/
	public final static String CIM_PROPERTY_SIZEOFBUFFERS = "SizeOfBuffers"; //$NON-NLS-1$
	/**
	*	This property is a 32-bit unsigned integer, and defines the total number of buffers in the Pool.
	*/
	public final static String CIM_PROPERTY_TOTALBUFFERS = "TotalBuffers"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_AVAILABLEBUFFERS);
		CIM_PropertyNameList.add(CIM_PROPERTY_BUFFERSIZE);
		CIM_PropertyNameList.add(CIM_PROPERTY_COLLECTIONID);
		CIM_PropertyNameList.add(CIM_PROPERTY_CREATIONCLASSNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_NAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_SHAREDBUFFERS);
		CIM_PropertyNameList.add(CIM_PROPERTY_SIZEOFBUFFERS);
		CIM_PropertyNameList.add(CIM_PROPERTY_TOTALBUFFERS);
				
		for (int i = 0; i < CIM_CollectionOfMSEs.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_CollectionOfMSEs.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_AVAILABLEBUFFERS)||
				((String)CIM_CollectionOfMSEs.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_BUFFERSIZE)||
				((String)CIM_CollectionOfMSEs.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_COLLECTIONID)||
				((String)CIM_CollectionOfMSEs.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CREATIONCLASSNAME)||
				((String)CIM_CollectionOfMSEs.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NAME)||
				((String)CIM_CollectionOfMSEs.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SHAREDBUFFERS)||
				((String)CIM_CollectionOfMSEs.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SIZEOFBUFFERS)||
				((String)CIM_CollectionOfMSEs.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TOTALBUFFERS)){
				continue;
			}
			
			CIM_BufferPool.CIM_PropertyNameList.add(CIM_CollectionOfMSEs.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_AVAILABLEBUFFERS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_BUFFERSIZE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_COLLECTIONID, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CREATIONCLASSNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SHAREDBUFFERS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SIZEOFBUFFERS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TOTALBUFFERS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
				
		for (int i = 0; i < CIM_CollectionOfMSEs.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_CollectionOfMSEs.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_AVAILABLEBUFFERS)||
				((CIMProperty)CIM_CollectionOfMSEs.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_BUFFERSIZE)||
				((CIMProperty)CIM_CollectionOfMSEs.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_COLLECTIONID)||
				((CIMProperty)CIM_CollectionOfMSEs.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CREATIONCLASSNAME)||
				((CIMProperty)CIM_CollectionOfMSEs.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NAME)||
				((CIMProperty)CIM_CollectionOfMSEs.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SHAREDBUFFERS)||
				((CIMProperty)CIM_CollectionOfMSEs.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SIZEOFBUFFERS)||
				((CIMProperty)CIM_CollectionOfMSEs.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TOTALBUFFERS)){
				continue;
			}
			
			CIM_BufferPool.CIM_PropertyList.add(CIM_CollectionOfMSEs.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_CollectionOfMSEs.Java_Package_List.size(); i++) {
			if (((String)CIM_CollectionOfMSEs.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_CollectionOfMSEs.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_BufferPool() {

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
	public CIM_BufferPool(Vector keyProperties){ 
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
	public CIM_BufferPool(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_CollectionID = this.cimInstance.getProperty(CIM_PROPERTY_COLLECTIONID);
		
		if (CIMProperty_CollectionID == null || CIMProperty_CollectionID.getValue().isEmpty() || CIMProperty_CollectionID.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_COLLECTIONID, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_CreationClassName = this.cimInstance.getProperty(CIM_PROPERTY_CREATIONCLASSNAME);
		
		if (CIMProperty_CreationClassName == null || CIMProperty_CreationClassName.getValue().isEmpty() || CIMProperty_CreationClassName.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_CREATIONCLASSNAME, "Key"});
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
	    
	    if (!(object instanceof CIM_BufferPool)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_BufferPool)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_BufferPool)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_BufferPool)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_BufferPool)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_BufferPool)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_BufferPool)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_BufferPool)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_BufferPool)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_BufferPool)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_BufferPool_CIM_CollectedBufferPools(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_COLLECTEDBUFFERPOOL, 
					CIM_BufferPool.CIM_CLASS_NAME, 
					"Collection",
					"Member",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_BufferPool.Java_Package_List.size(); i++) {
						if (!((String)(CIM_BufferPool.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_BufferPool.Java_Package_List.get(i))).endsWith(".")) {
							CIM_BufferPool.Java_Package_List.setElementAt((String)(CIM_BufferPool.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_BufferPool.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_BufferPool(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_BufferPool(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_BufferPool(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_BufferPool_CIM_CollectedBufferPool_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_COLLECTEDBUFFERPOOL, 
					CIM_BufferPool.CIM_CLASS_NAME, 
					"Collection",
					"Member");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_BufferPool.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_QueuingService_CIM_QueueAllocations(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_QUEUEALLOCATION, 
					CIM_QueuingService.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_BufferPool.Java_Package_List.size(); i++) {
						if (!((String)(CIM_BufferPool.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_BufferPool.Java_Package_List.get(i))).endsWith(".")) {
							CIM_BufferPool.Java_Package_List.setElementAt((String)(CIM_BufferPool.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_BufferPool.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_QueuingService(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_QueuingService(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_QueuingService(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_QueuingService_CIM_QueueAllocation_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_QUEUEALLOCATION, 
					CIM_QueuingService.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_QueuingService.CIM_CLASS_NAME)) {
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
	
	// Attribute AvailableBuffers
	
	public UnsignedInt32 get_AvailableBuffers() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BufferPool.CIM_PROPERTY_AVAILABLEBUFFERS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BufferPool.CIM_PROPERTY_AVAILABLEBUFFERS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BufferPool.CIM_PROPERTY_AVAILABLEBUFFERS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AvailableBuffers(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BufferPool.CIM_PROPERTY_AVAILABLEBUFFERS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BufferPool.CIM_PROPERTY_AVAILABLEBUFFERS + " could not be found");
    		
		} else if (!CIM_BufferPoolHelper.isValid_AvailableBuffers(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BufferPool.CIM_PROPERTY_AVAILABLEBUFFERS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BufferPool.CIM_PROPERTY_AVAILABLEBUFFERS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute BufferSize
	
	public UnsignedInt16 get_BufferSize() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BufferPool.CIM_PROPERTY_BUFFERSIZE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BufferPool.CIM_PROPERTY_BUFFERSIZE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BufferPool.CIM_PROPERTY_BUFFERSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_BufferSize(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BufferPool.CIM_PROPERTY_BUFFERSIZE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BufferPool.CIM_PROPERTY_BUFFERSIZE + " could not be found");
    		
		} else if (!CIM_BufferPoolHelper.isValid_BufferSize(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BufferPool.CIM_PROPERTY_BUFFERSIZE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BufferPool.CIM_PROPERTY_BUFFERSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CollectionID
	
	public String get_CollectionID() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BufferPool.CIM_PROPERTY_COLLECTIONID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BufferPool.CIM_PROPERTY_COLLECTIONID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BufferPool.CIM_PROPERTY_COLLECTIONID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CollectionID(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BufferPool.CIM_PROPERTY_COLLECTIONID);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_BufferPool.CIM_PROPERTY_COLLECTIONID + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BufferPool.CIM_PROPERTY_COLLECTIONID + " could not be found");
    		
		} else if (!CIM_BufferPoolHelper.isValid_CollectionID(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BufferPool.CIM_PROPERTY_COLLECTIONID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BufferPool.CIM_PROPERTY_COLLECTIONID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CreationClassName
	
	public String get_CreationClassName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BufferPool.CIM_PROPERTY_CREATIONCLASSNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BufferPool.CIM_PROPERTY_CREATIONCLASSNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BufferPool.CIM_PROPERTY_CREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CreationClassName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BufferPool.CIM_PROPERTY_CREATIONCLASSNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_BufferPool.CIM_PROPERTY_CREATIONCLASSNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BufferPool.CIM_PROPERTY_CREATIONCLASSNAME + " could not be found");
    		
		} else if (!CIM_BufferPoolHelper.isValid_CreationClassName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BufferPool.CIM_PROPERTY_CREATIONCLASSNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BufferPool.CIM_PROPERTY_CREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Name
	
	public String get_Name() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BufferPool.CIM_PROPERTY_NAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BufferPool.CIM_PROPERTY_NAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BufferPool.CIM_PROPERTY_NAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Name(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BufferPool.CIM_PROPERTY_NAME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BufferPool.CIM_PROPERTY_NAME + " could not be found");
    		
		} else if (!CIM_BufferPoolHelper.isValid_Name(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BufferPool.CIM_PROPERTY_NAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BufferPool.CIM_PROPERTY_NAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SharedBuffers
	
	public UnsignedInt32 get_SharedBuffers() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BufferPool.CIM_PROPERTY_SHAREDBUFFERS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BufferPool.CIM_PROPERTY_SHAREDBUFFERS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BufferPool.CIM_PROPERTY_SHAREDBUFFERS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SharedBuffers(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BufferPool.CIM_PROPERTY_SHAREDBUFFERS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BufferPool.CIM_PROPERTY_SHAREDBUFFERS + " could not be found");
    		
		} else if (!CIM_BufferPoolHelper.isValid_SharedBuffers(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BufferPool.CIM_PROPERTY_SHAREDBUFFERS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BufferPool.CIM_PROPERTY_SHAREDBUFFERS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SizeOfBuffers
	
	public UnsignedInt32 get_SizeOfBuffers() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BufferPool.CIM_PROPERTY_SIZEOFBUFFERS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BufferPool.CIM_PROPERTY_SIZEOFBUFFERS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BufferPool.CIM_PROPERTY_SIZEOFBUFFERS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SizeOfBuffers(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BufferPool.CIM_PROPERTY_SIZEOFBUFFERS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BufferPool.CIM_PROPERTY_SIZEOFBUFFERS + " could not be found");
    		
		} else if (!CIM_BufferPoolHelper.isValid_SizeOfBuffers(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BufferPool.CIM_PROPERTY_SIZEOFBUFFERS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BufferPool.CIM_PROPERTY_SIZEOFBUFFERS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TotalBuffers
	
	public UnsignedInt32 get_TotalBuffers() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BufferPool.CIM_PROPERTY_TOTALBUFFERS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BufferPool.CIM_PROPERTY_TOTALBUFFERS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BufferPool.CIM_PROPERTY_TOTALBUFFERS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TotalBuffers(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BufferPool.CIM_PROPERTY_TOTALBUFFERS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BufferPool.CIM_PROPERTY_TOTALBUFFERS + " could not be found");
    		
		} else if (!CIM_BufferPoolHelper.isValid_TotalBuffers(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BufferPool.CIM_PROPERTY_TOTALBUFFERS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BufferPool.CIM_PROPERTY_TOTALBUFFERS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
