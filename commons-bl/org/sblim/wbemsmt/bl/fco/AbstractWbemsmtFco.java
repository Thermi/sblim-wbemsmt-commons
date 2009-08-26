 /** 
  * AbstractWbemsmtFCO.java
  *
  * © Copyright IBM Corp.  2009,2005
  *
  * THIS FILE IS PROVIDED UNDER THE TERMS OF THE ECLIPSE PUBLIC LICENSE
  * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
  * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
  *
  * You can obtain a current copy of the Eclipse Public License from
  * http://www.opensource.org/licenses/eclipse-1.0.php
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

/**
 * the base class of all FCOs
 */
public abstract class AbstractWbemsmtFco {

    /**
     * the instance where changes are made in
     */
    protected CIMInstance instance = null;
    
    /**
     * the instance received from the server
     */
    protected CIMInstance original_cimInstance = null;

    /**
     * list with java packages to search for the FCOs
     */
    protected static java.util.Set<String> Java_Package_List = new java.util.HashSet<String>();
    /**
     * logger instance
     */
    protected static Logger logger = Logger.getLogger(AbstractWbemsmtFco.class.getName());    

    /**
     * contains the List of {@link CIMProperty} objects to be checked during initialization
     * filled by the subclasses before init is called 
     */
    protected Map<String, CIMProperty> propertiesToCheck = new HashMap<String, CIMProperty>();
    /**
     * contains a list of properties with a wrong type<br>
     * - key is the property as defined in the FCO<br>
     * - value is the property as received from the server<br>
     * filled by the init method
     * @see #getWrongTypedProperties()
     */
	protected Map<CIMProperty, CIMProperty> wrongTypedProperties = new HashMap<CIMProperty, CIMProperty>();
	
	
    /**
     * contains a list of properties not contained in the instance received from the server<br>
     * - value is the property as defined in the FCO<br>
     * filled by the init method
     * @see #getMissingProperties()
     */
	protected Set<CIMProperty> missingProperties = new HashSet<CIMProperty>();
    
	/**
	 * indicates if the object was loaded from the server or created on the client
	 * 
	 * can be used to determine in a generic way if a create or a save actions must be used
	 * 
	 */
	protected boolean fromServer = false; 
	
	/**
	 * default constructor to create a new FCO
	 */
    protected AbstractWbemsmtFco()
    {
    	
    }
    
    /**
     * Initializes the FCO
     * @param cimInstance the CIM instance from the server
     * @param overwrite currently not used - planned use: set to true if a current cimInstance should be overwritten
     * @throws WbemsmtException if the initialization failed
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException
    {
        setCimInstance(cimInstance);
        this.original_cimInstance = copy(cimInstance);
        
        wrongTypedProperties.clear();
        missingProperties.clear();
        
        Iterator<CIMProperty> iterator = propertiesToCheck.values().iterator();
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
	    *   @return the instance
	    */
	    public CIMInstance getCimInstance() {
	        
	        return this.instance;
	    }
	    
	    
	   /**
	    *   The method sets this CIM instance
	    *   @param cimInstance the instance
	    */
	    public void setCimInstance(CIMInstance cimInstance) {
	        
	        this.instance = cimInstance;
	    }
	    
	        
	   /**
	    *   The method returns this CIM object path
	    *   @return the object path
	    *   @see CIMInstance#getObjectPath()
	    */
	    public CIMObjectPath getCimObjectPath() {
	        return this.instance.getObjectPath();
	    }    
	    
	   /**
	    *    The method checks if the cimInstance has been modified
	    *    @return true if the instance is modified
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

	    /**
	     * get all properties of this FCO
	     * @return all properties
	     * @see CIMInstance#getProperties()
	     */
	    public CIMProperty[] getProperties()
	    {
	       return instance.getProperties();
	    }
	    
	    /**
	     * get the property
	     * @param propertyName the name of the property
	     * @return the property or null if the property doesn't exist
	     * @see CIMInstance#getProperty(String)
	     */
	    public CIMProperty getProperty(String propertyName)
	    {
	       return instance.getProperty(propertyName);
	    }

	    /**
	     * set a new property
	     * @param property property to set
	     */
	    public void setProperty(CIMProperty property)
	    {
	        this.instance = this.instance.deriveInstance(new CIMProperty[]{property});
	    }
	    
	    
	    /**
	     * get the hashCode of this object
	     * @return the hashcode
	     * @see java.lang.Object#hashCode()
	     */
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + (fromServer ? 1231 : 1237);
            result = prime * result + ((instance == null) ? 0 : instance.hashCode());
            result = prime * result
                    + ((missingProperties == null) ? 0 : missingProperties.hashCode());
            result = prime * result
                    + ((original_cimInstance == null) ? 0 : original_cimInstance.hashCode());
            result = prime * result
                    + ((propertiesToCheck == null) ? 0 : propertiesToCheck.hashCode());
            result = prime * result
                    + ((wrongTypedProperties == null) ? 0 : wrongTypedProperties.hashCode());
            return result;
        }

        /**
         * check if two objects are equals
         * @param object the object to compare
         * @return true if the objects are equals
         */
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

             java.util.Map<String, CIMProperty> propMap1 = new java.util.HashMap<String, CIMProperty>();
             java.util.Map<String, CIMProperty> propMap2 = new java.util.HashMap<String, CIMProperty>();

          for (int i=0; i < props1.length; i++)
          {
             propMap1.put(props1[i].getName(),props1[i]);
             propMap2.put(props2[i].getName(),props2[i]);
          }              
                  
          java.util.Iterator<String> itKeys = propMap1.keySet().iterator();
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

        /**
         * add a package name
         * @param packagename the name oif the package
         * @see #Java_Package_List
         */
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
    
        /**
         * the Fco as as tring
         * @return the fco as string
         */
    public String toString()
    {
       return instance.toString();
    }
    
    /**
     * get all the java package that are used for creating a new FCO
     * @return the java packages
     */
    public static String[] getPackages() {
        return (String[]) Java_Package_List.toArray(new String[Java_Package_List.size()]);
    }
      

    /**
     * Copies a cim instance
     * @param toCopy the source
     * @return the copy
     */
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
     * @return the wrong typed properties
     * @see #wrongTypedProperties
     */
	public Map<CIMProperty, CIMProperty> getWrongTypedProperties() {
		return wrongTypedProperties;
	}

	/**
	 * returns a set of all properties which are define by the client but missing on the server
	 * @return the missing properties
	 * @see #missingProperties
	 */
	public Set<CIMProperty> getMissingProperties() {
		return missingProperties;
	}

	/**
	 * @return true if there is no wrongTyped Property and no missingProperty
	 */
	public boolean isCompatible()
	{
		return wrongTypedProperties.size() == 0 && missingProperties.size() == 0;
	}
	
	/**
	 * @return the name of the object
	 */
    public abstract String getObjectName();
    
    /**
     * retrieve the cim class
     * @param client the client to receive the class
     * @param namespace the namespace where the class exists
     * @return the cimClass
     * @throws WbemsmtException if class was not found
     */
    protected CIMClass getClass(WBEMClient client, String namespace) throws WbemsmtException
    {
        return AbstractWbemsmtFcoHelper.getClass(client, getObjectName(), namespace);
    }

    /**
    * @return if the fco is from the server
     */
    public boolean isFromServer() {
        return fromServer;
    }

    /**
     * define if the fco is new or was loaded from the server
     * @param fromServer true was loaded from the server | false if new
     */
    public void setFromServer(boolean fromServer) {
        this.fromServer = fromServer;
    }
    
    /**
     * get the CIMInstances of all FCOs
     * @param fcoArray the Fcos
     * @return the cimInstances
     * @see #getCimInstance()
     */
    protected CIMInstance[] getCIMInstances(AbstractWbemsmtFco[] fcoArray)
    {
        CIMInstance[] result = new CIMInstance[fcoArray.length];
        for (int i = 0; i < fcoArray.length; i++) {
            result[i] = fcoArray[i].getCimInstance();
        }
        return result;
    }
    
    /**
     * get the COMObjectPathes of all FCOs
     * @param fcoArray the FCOs
     * @return the CIMObject pathes
     * @see #getCimObjectPath()
     */
    protected CIMObjectPath[] getCIMObjectPathes(AbstractWbemsmtFco[] fcoArray)
    {
        CIMObjectPath[] result = new CIMObjectPath[fcoArray.length];
        for (int i = 0; i < fcoArray.length; i++) {
            result[i] = fcoArray[i].getCimObjectPath();
        }
        return result;
    }
    
}
