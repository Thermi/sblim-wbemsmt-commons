 /** 
  * AbstractWbemsmtFcoHelper.java
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
  * Description: the base class for all helper classes
  * 
  */
package org.sblim.wbemsmt.bl.fco;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import javax.cim.CIMClass;
import javax.cim.CIMInstance;
import javax.cim.CIMObjectPath;
import javax.cim.CIMProperty;
import javax.wbem.CloseableIterator;
import javax.wbem.WBEMException;
import javax.wbem.client.WBEMClient;

import org.sblim.wbemsmt.cim.CIMClientPool;
import org.sblim.wbemsmt.cim.WBEMClientWrapper;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.exception.impl.DeleteInstanceException;
import org.sblim.wbemsmt.exception.impl.DifferenceAfterCreateException;
import org.sblim.wbemsmt.exception.impl.DifferenceAfterModifyException;
import org.sblim.wbemsmt.exception.impl.GetClassException;
import org.sblim.wbemsmt.exception.impl.userobject.DeleteInstanceUserObject;
import org.sblim.wbemsmt.exception.impl.userobject.DifferenceAfterCreateUserObject;
import org.sblim.wbemsmt.exception.impl.userobject.DifferenceAfterModifyUserObject;
import org.sblim.wbemsmt.exception.impl.userobject.GetClassUserObject;

/**
 *  the base class for all helper classes
 */
public abstract class AbstractWbemsmtFcoHelper {

    /**
     * Utility class - only a private constructor
     */
    protected AbstractWbemsmtFcoHelper()
    {
        
    }
    
    /**
     * logger innstances
     */
    static Logger logger = Logger.getLogger(AbstractWbemsmtFcoHelper.class.getName());
    
    /**
     * loaded cim classes<br>
     * key: result of {@link #getKey(WBEMClient, String, String)}
     * value: {@link CIMClass}
     */
    private static Map classes = new HashMap();    
    
    //**********************************************************************
    // deleteInstance     
    //**********************************************************************

    /**
     * The method deletes a class instance in a given CIM client
     * @param client the client for the connection to the server
     * @param dataInstance the instance to delete
     * @throws WbemsmtException . Is a {@link DeleteInstanceException} with a {@link WBEMException} as exception cause
     */
    protected static final void deleteInstance(WBEMClient client, AbstractWbemsmtFco dataInstance)
            throws WbemsmtException {

        if (client == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The WBEMClient parameter does not contain a valid reference.");

        }
        else if (dataInstance == null || dataInstance.getCimObjectPath() == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The dataInstance parameter does not contain a valid reference to the destination object.");
        }
        
        cleanHostname(client, dataInstance);
        try {
            client.deleteInstance(dataInstance.getCimObjectPath());
        }
        catch (WBEMException e) {
            throw new DeleteInstanceException(e, new DeleteInstanceUserObject(dataInstance.getCimObjectPath()));
        }
    }

    /**
     * remove the hostname from the object path - to avoid confusion during the deleteInstance call
     * @param client cim Client 
     * @param dataInstance the instance carrying the objectPath
     */

    private static void cleanHostname(WBEMClient client, AbstractWbemsmtFco dataInstance) {
        CIMClientPool clientPool = CIMClientPool.getCIMClientPool(client);
        
        if (clientPool == null)
        {
            return;
        }
          
        String hostname = clientPool.getHostnameFromCimom() != CIMClientPool.NOT_FOUND ? clientPool.getHostnameFromCimom() : clientPool.getHostname();

        CIMObjectPath cimObjectPath = dataInstance.getCimObjectPath();
        cleanHostname(hostname, cimObjectPath);
        
        CIMProperty[] properties = dataInstance.getCimInstance().getProperties();
        for (int i = 0; i < properties.length; i++) {
            CIMProperty property = properties[i];
            if (property.getValue() instanceof CIMObjectPath)
            {
                cleanHostname(hostname, (CIMObjectPath)property.getValue());
            }
        }
    }

    /**
     * remove the hostname from the object path - to avoid confusion during the deleteInstance call
     * @param hostname nme of the target host 
     * @param cimObjectPath the objectPath to remove the hostname
     */
    private static void cleanHostname(String hostname, CIMObjectPath cimObjectPath) {
        
        if (hostname.equals(cimObjectPath.getHost()))
        {
            try {
                Field field = cimObjectPath.getClass().getDeclaredField("iHost");
                field.setAccessible(true);
                field.set(cimObjectPath, null);
            }
            catch (Exception e) {
                logger.severe("Cannot reset hostname on Object " + cimObjectPath.getClass().getName() + " - " + e.getMessage());
            }
        }
    }

    //**********************************************************************
    // utility methods     
    //**********************************************************************

    /** 
     * find a FCO class which can represent the given cimInstance 
     * Begins at the lowest classes in the cim class hierarchy and try to create a FCO with
     * all the defined packages. If the Class cannot be created go one step up in the hierarchy 
     * and try again and again and again... 
     * @param client the jsr48 cim client
     * @param cimInstance the instance to a find a fco for
     * @param packageList list with java packages to search for the right fco
     * @return The class for the FCO or null if a class was NOT found to create a FCO from 
     * @see #Java_Package_List 
     * @throws WbemsmtException if getting the CIMClass object to find the base class failed
     */

    public static Class findClass(WBEMClient client, CIMInstance cimInstance, String[] packageList) throws WbemsmtException {

        String className = cimInstance.getClassName();
        Class clazz = findClassInPackages(className, packageList);

        if (clazz == null) {
            //try going up the class hierarchy and try to construct the next possible class
            CIMClass cimClass = null;
            try {
                cimClass = getClass(client,cimInstance.getClassName(),cimInstance.getObjectPath().getNamespace());
            }
            catch (WbemsmtException e) {
                logger.warning("Cannot get Class for path " + cimInstance.getObjectPath());
            }
            while (clazz == null && cimClass != null && cimClass.getSuperClassName() != null) {
                clazz = findClassInPackages(cimClass.getSuperClassName(), packageList);
                try {
                    cimClass = getClass(client,cimClass.getSuperClassName(),cimInstance.getObjectPath().getNamespace());
                }
                catch (WbemsmtException e) {
                    e.printStackTrace();
                    logger.warning("Cannot get Class " + cimClass.getSuperClassName());
                    break;
                }
            }
        }

        return clazz;
    }

    /**
     * check if the Iterator contains an exception
     * @param it the iterator
     * @throws WbemsmtException with 
     */
    public static void checkException(CloseableIterator it) throws WbemsmtException  {
        if (it != null && it.getWBEMException() != null) {
            throw new WbemsmtException(WbemsmtException.ERR_CIM_ITERATION,it.getWBEMException());
        }
    }

    /**
     * Try to create a class with the given classname and one of the packages
     * if the first creation is possible the class is returned
     * @param className the name of the class
     * @param packageList list with all fco packages
     * @return the Class or null if no combination between className and one of the Packages was possible
     */
    private static Class findClassInPackages(String className, String[] packageList) {
        Class clazz = null;
        for (int i = 0; clazz == null && i < packageList.length; i++) {
            String cimClassName = (packageList[i]) + className;
            try {
                clazz = Class.forName(cimClassName);
            }
            catch (ClassNotFoundException e) {
            }
        }
        return clazz;
    }
    
    /**
     * ensures that the returned namespace doesn't start with a '/'
     * @param namespace the namespace
     * @return the namespace without a leading '/'
     */
    public static String harmonizeNamespace(String namespace)
    {
        if (namespace.startsWith("/"))
        {
            namespace = namespace.substring(1);
        }
        return namespace;

    }

    /**
     * Get a cim class<br>
     * First checks the cache<br>If the class doesn't exist in the cache the CIMClass object is retrieved from the server
     * @param client jsr48 cim client
     * @param cimClassName the name of the CIMClass
     * @param namespace namespace of the target server
     * @return the CIMClass
     * @throws WbemsmtException if retrieving the cim class from the server failed 
     */
    public static CIMClass getClass(WBEMClient client, String cimClassName, String namespace) throws WbemsmtException {
        String key = getKey(client, cimClassName, namespace);
        logger.fine("Searching for key " + key);
        CIMClass cimClass = (CIMClass) classes.get(key);
        if (cimClass == null)
        {
            logger.info("Loading cim class " + cimClassName + " for key " + key);
            CIMObjectPath objectPath = new CIMObjectPath(cimClassName,harmonizeNamespace(namespace));
            try {
                cimClass = client.getClass(objectPath, false, true, true, null);
            }
            catch (WBEMException e) {
                throw new GetClassException(e, new GetClassUserObject(objectPath, false, true, false, null));
            }
            logger.fine("Saving with key " + key);
            classes.put(key,cimClass);
        }
        return cimClass;
    }

    /**
     * if the client is a {@link WBEMClientWrapper} {@link WBEMClientWrapper#getHostInfo()} is used<br>
     * in all other cases: client.toString()) + namespace + cimClassName
     * @param client the cim client
     * @param cimClassName name of the cim class
     * @param namespace the target namespace
     * @return the key for caching classes
     */
    private static String getKey(WBEMClient client, String cimClassName, String namespace) {
        return (client instanceof WBEMClientWrapper ? ((WBEMClientWrapper)client).getHostInfo(): client.toString()) + namespace + cimClassName;
    }
    
    
    /**
     * check the differences after a create instance request was executed
     * <br>currently no check is implemented<br>
     * @param oldInstance instance before create
     * @param newInstance instance after create
     * @throws WbemsmtException - is a {@link DifferenceAfterCreateException}
     * @see #checkDifferences(AbstractWbemsmtFco, AbstractWbemsmtFco)
     */
    protected static void checkDifferencesAfterCreate(AbstractWbemsmtFco oldInstance, AbstractWbemsmtFco newInstance) throws WbemsmtException
    {
        List result = checkDifferences(oldInstance, newInstance);
        if (result.size() > 0)
        {
            throw new DifferenceAfterCreateException("Differences found after creating new object",new DifferenceAfterCreateUserObject(oldInstance.getCimInstance(),result));
        }
    }

    /**
     * check the differences after a modify Instance was executed
     * <br>currently no check is implemented<br>
     * @param oldInstance instance before modify instance
     * @param newInstance instance after modify instance
     * @throws WbemsmtException - is a {@link DifferenceAfterModifyException}
     * @see #checkDifferences(AbstractWbemsmtFco, AbstractWbemsmtFco)
     */
    protected static void checkDifferencesAfterModify(AbstractWbemsmtFco oldInstance, AbstractWbemsmtFco newInstance) throws WbemsmtException
    {
        List result = checkDifferences(oldInstance, newInstance);
        if (result.size() > 0)
        {
            throw new DifferenceAfterModifyException("Differences found after modifying object",new DifferenceAfterModifyUserObject(newInstance.getCimInstance(),result));
        }
    }

    
    /**
     * check the differences between two instances<br>
     * <br>currently no check is implemented<br>
     * @param oldInstance one part of the comparison
     * @param newInstance other part of the comparison
     * @return List with differences - a {@link List#size()} > 0 indicates differences (since this implementation is incomplete the list is always empty at the moment)
     * @throws WbemsmtException if the check failed
     */
    protected static List checkDifferences(AbstractWbemsmtFco oldInstance, AbstractWbemsmtFco newInstance) throws WbemsmtException
    {
        return new ArrayList();
    }
	
}
