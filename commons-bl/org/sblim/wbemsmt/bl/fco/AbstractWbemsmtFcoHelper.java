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

public abstract class AbstractWbemsmtFcoHelper {

    static Logger logger = Logger.getLogger(AbstractWbemsmtFcoHelper.class.getName());
    private static Map classes = new HashMap();    
    
    //**********************************************************************
    // deleteInstance     
    //**********************************************************************

    /**
     *    The method deletes a class instance in a given CIM client
     */
    protected final static void deleteInstance(WBEMClient client, AbstractWbemsmtFco dataInstance)
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
     * @param WBEMClient 
     * @param cimInstance 
     * @return The class for the FCO or null if a class was NOT found to create a FCO from 
     * @see #Java_Package_List 
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

    public static void checkException(CloseableIterator it) throws WbemsmtException  {
        if (it != null && it.getWBEMException() != null) {
            throw new WbemsmtException(WbemsmtException.ERR_CIM_ITERATION,it.getWBEMException());
        }
    }

    /**
     * Try to create a class with the given classname and one of the packages
     * if the first creation is possible the class is returned
     * @param className
     * @param packageList
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
    
    public static String harmonizeNamespace(String namespace)
    {
        if (namespace.startsWith("/"))
        {
            namespace = namespace.substring(1);
        }
        return namespace;

    }

    public static CIMClass getClass(WBEMClient client, String cimClassName, String namespace) throws WbemsmtException {
        String key = (client instanceof WBEMClientWrapper ? ((WBEMClientWrapper)client).getHostInfo(): client.toString()) + namespace + cimClassName;
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
    
    protected static void checkDifferencesAfterCreate(AbstractWbemsmtFco oldInstance, AbstractWbemsmtFco newInstance) throws WbemsmtException
    {
        List result = checkDifferences(oldInstance, newInstance);
        if (result.size() > 0)
        {
            throw new DifferenceAfterCreateException("Differences found after creating new object",new DifferenceAfterCreateUserObject(oldInstance.getCimInstance(),result));
        }
    }

    protected static void checkDifferencesAfterModify(AbstractWbemsmtFco oldInstance, AbstractWbemsmtFco newInstance) throws WbemsmtException
    {
        List result = checkDifferences(oldInstance, newInstance);
        if (result.size() > 0)
        {
            throw new DifferenceAfterModifyException("Differences found after modifying object",new DifferenceAfterModifyUserObject(newInstance.getCimInstance(),result));
        }
    }

    
    protected static List checkDifferences(AbstractWbemsmtFco oldInstance, AbstractWbemsmtFco newInstance) throws WbemsmtException
    {
        return new ArrayList();
    }
	
}
