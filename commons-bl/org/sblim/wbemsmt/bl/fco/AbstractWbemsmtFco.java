 /** 
  * AbstractWbemsmtFCO.java
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
  * @author: Michael Bauschert <Michael.Bauschert@de.ibm.com>
  *
  * Contributors: 
  * 
  * Description: the base class of all FCOs
  * 
  */
package org.sblim.wbemsmt.bl.fco;

import java.util.*;
import java.util.logging.Logger;

import javax.cim.CIMClass;
import javax.cim.CIMInstance;
import javax.cim.CIMObjectPath;
import javax.cim.CIMProperty;
import javax.wbem.client.WBEMClient;

import org.sblim.wbemsmt.exception.WbemsmtException;

public abstract class AbstractWbemsmtFco {

    protected CIMInstance instance = null;
    protected CIMInstance original_cimInstance = null;

    protected static java.util.Set Java_Package_List = new java.util.HashSet();
    protected static Logger logger = Logger.getLogger(AbstractWbemsmtFco.class.getName());    

    protected Map propertiesToCheck = new HashMap();
	protected Map wrongTypedProperties = new HashMap();
	protected Set missingProperties = new HashSet();
    
	/**
	 * indicates if the object was loaded from the server or created on the client
	 * 
	 * can be used to determine in a generic way if a create or a save actions must be used
	 * 
	 */
	protected boolean fromServer = false; 
	
    protected AbstractWbemsmtFco()
    {
    	
    }
    
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException
    {
        setCimInstance(cimInstance);
        this.original_cimInstance = copy(cimInstance);
        
        wrongTypedProperties.clear();
        missingProperties.clear();
        
        Iterator iterator = propertiesToCheck.values().iterator();
        while (iterator.hasNext())
        {
        	CIMProperty property = (CIMProperty) iterator.next();
        	CIMProperty property2 = getProperty(property.getName());
			if (property2 != null)
			{
				if (property.getDataType().equals(property2.getDataType()))
				{
					wrongTypedProperties.put(property,property2);
				}
			}
			else
			{
				missingProperties.add(property);
			}
        }
    }

    
    //**********************************************************************
	// utility methods     
	//**********************************************************************                         
	    


	   /**
	    *   The method returns this CIM instance
	    */
	    public CIMInstance getCimInstance() {
	        
	        return this.instance;
	    }
	    
	    
	   /**
	    *   The method sets this CIM instance
	    */
	    public void setCimInstance(CIMInstance cimInstance) {
	        
	        this.instance = cimInstance;
	    }
	    
	        
	   /**
	    *   The method returns this CIM object path
	    */
	    public CIMObjectPath getCimObjectPath() {
	        return this.instance.getObjectPath();
	    }    
	    
	   /**
	    *    The method checks if the cimInstance has been modified
	    */
	    public boolean isModified() {
	        
	        if (!this.original_cimInstance.equals(this.instance)) 
	            return true;
	        
	        return false;
	    }
	    
	    /**
	    *   The method resets the values of the cimInstance
	    */  
	    public void resetValues() {
	        this.instance = (CIMInstance)copy(this.original_cimInstance);
	    }

	    public CIMProperty[] getProperties()
	    {
	       return instance.getProperties();
	    }
	    
	    public CIMProperty getProperty(String propertyName)
	    {
	       return instance.getProperty(propertyName);
	    }

	    public void setProperty(CIMProperty property)
	    {
	        this.instance = this.instance.deriveInstance(new CIMProperty[]{property});
	    }
	    
	    public boolean equals(Object object)
	    {

	      if (!(object instanceof AbstractWbemsmtFco))
	      {
	        return false;
	      }
	      
	      AbstractWbemsmtFco compareThis = (AbstractWbemsmtFco) object;
	    	
	      if (compareThis == this)
	         return true;

	      if (compareThis == null)
	         return false;
	      
	      if (instance == null && compareThis.getCimInstance() != null)
	      {
	         return false;
	      }
	      
	      if (instance == null && compareThis.getCimInstance() == null)
	      {
	         return true;
	      }
	      
	      if (!instance.getClassName().equals(compareThis.getCimInstance().getClassName()))
	         return false;
	      
	      if (!getCimObjectPath().equals(compareThis.getCimObjectPath()))
	         return false;
	              
	      CIMProperty[] props1 = getProperties();
	      CIMProperty[] props2 = compareThis.getProperties();
	              
	      if (props1.length != props2.length)
	         return false;

	         java.util.Map propMap1 = new java.util.HashMap();
	         java.util.Map propMap2 = new java.util.HashMap();

	      for (int i=0; i < props1.length; i++)
	      {
	         propMap1.put(props1[i].getName(),props1[i]);
	         propMap2.put(props2[i].getName(),props2[i]);
	      }              
	              
	      java.util.Iterator itKeys = propMap1.keySet().iterator();
	      while (itKeys.hasNext())
	      {
	         if (!propMap2.containsKey(itKeys.next()))
	            return false; 
	      }
	            
	      itKeys = propMap2.keySet().iterator();
	      while (itKeys.hasNext())
	      {
	         if (!propMap1.containsKey(itKeys.next()))
	            return false; 
	      }
	            
	      itKeys = propMap1.keySet().iterator();
	      while (itKeys.hasNext())
	      {
	         String key = (String)itKeys.next();
	         CIMProperty p1 = (CIMProperty)propMap1.get(key);
	         CIMProperty p2 = (CIMProperty)propMap2.get(key);
	         if (   p1.getName() != null && !p1.getName().equals(p2.getName())
	             || p1.getDataType() != null && !p1.getDataType().equals(p2.getDataType())	 
	             || p1.getValue() != null && !p1.getValue().getClass().isAssignableFrom(CIMInstance.class) && !p1.getValue().getClass().isAssignableFrom(CIMInstance[].class) && !p1.getValue().equals(p2.getValue())	 
	             )
	            return false;
	      }
	       
	      return true;
	    }
	    

	    public static void addPackage(String packagename) {
        if (packagename != null) {
            if (!packagename.endsWith(".")) {
                packagename = packagename + ".";
            }
            Java_Package_List.add(packagename);
            
        } else {
            throw new NullPointerException();
        }
    }
    
    public String toString()
    {
       return instance.toString();
    }
    
    public static String[] getPackages() {
        return (String[]) Java_Package_List.toArray(new String[Java_Package_List.size()]);
    }
      



    protected CIMInstance copy(CIMInstance toCopy)
    {
       CIMObjectPath path = toCopy.getObjectPath();
       CIMProperty[] properties = path.getKeys();
       CIMProperty[] properties1 = new CIMProperty[properties.length];
       for (int i = 0; i < properties.length; i++) {
           CIMProperty property = properties[i];
           properties1[i] = new CIMProperty(property.getName(),property.getDataType(), property.getValue(),property.isKey(),property.isPropagated(),property.getOriginClass());
       }
        
       CIMObjectPath path1 = new CIMObjectPath(path.getScheme(), path.getHost(),path.getPort(), path.getNamespace(),path.getObjectName(),properties1);
       
       properties = toCopy.getProperties();
       properties1 = new CIMProperty[properties.length];
       
       for (int i = 0; i < properties.length; i++) {
          CIMProperty property = properties[i];
          properties1[i] = new CIMProperty(property.getName(),property.getDataType(), property.getValue(),property.isKey(),property.isPropagated(),property.getOriginClass());
       }
       
       return new CIMInstance(path1,properties1);
    }

    /**
     * contains all the properties with wrong types
     * the key is property as defined by the client and the value is the property received from the server
     * @return
     */
	public Map getWrongTypedProperties() {
		return wrongTypedProperties;
	}

	/**
	 * returns a set of all properties which are define by the client but missing on the server
	 * @return
	 */
	public Set getMissingProperties() {
		return missingProperties;
	}

	/**
	 * returns true if there is no wrongTyped Property and no missingProperty
	 * @return
	 */
	public boolean isCompatible()
	{
		return wrongTypedProperties.size() == 0 && missingProperties.size() == 0;
	}
	
    public abstract String getObjectName();
    
    protected CIMClass getClass(WBEMClient client, String namespace) throws WbemsmtException
    {
        return AbstractWbemsmtFcoHelper.getClass(client, getObjectName(), namespace);
    }

    public boolean isFromServer() {
        return fromServer;
    }

    public void setFromServer(boolean fromServer) {
        this.fromServer = fromServer;
    }
    
    protected CIMInstance[] getCIMInstances(AbstractWbemsmtFco[] fcoArray)
    {
        CIMInstance[] result = new CIMInstance[fcoArray.length];
        for (int i = 0; i < fcoArray.length; i++) {
            result[i] = fcoArray[i].getCimInstance();
        }
        return result;
    }
    
    protected CIMObjectPath[] getCIMObjectPathes(AbstractWbemsmtFco[] fcoArray)
    {
        CIMObjectPath[] result = new CIMObjectPath[fcoArray.length];
        for (int i = 0; i < fcoArray.length; i++) {
            result[i] = fcoArray[i].getCimObjectPath();
        }
        return result;
    }
    
}
