 /** 
  * WbemsmtBusinessObject.java
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
  * Description: Base class for wbemsmt Business Objects
  * 
  */
package org.sblim.wbemsmt.bl.wrapper;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.logging.Logger;

import javax.cim.CIMObjectPath;
import javax.wbem.client.WBEMClient;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.bl.wrapper.preload.PreloadThread;
import org.sblim.wbemsmt.cim.CIMClientPool;
import org.sblim.wbemsmt.exception.WbemsmtException;

/**
 * Base class for wbemsmt Business Objects
 */
public abstract class WbemsmtBusinessObject {

    /**
     * the logger
     */
	protected static Logger logger = Logger.getLogger(WbemsmtBusinessObject.class.getName());
	
	/**
	 * flag to indicate if the children should be reloaded during the next access
	 */
	protected boolean reloadChilds = false;
	
	/**
	 * the link to the adapter
	 * @see #getBaseCimAdapter()
	 */
	protected final AbstractBaseCimAdapter baseCimAdapter;

	/**
	 * used to indicate that the business object is currently in progress of reloading
	 * @see #isPreloading()
	 */
    protected boolean preloading = false;
    
    /**
     * used to indicate that the preload should be stopped
     * @see #stopPreload() 
     */
    protected boolean stopPreloading = false;
    
    /**
     * the client handle
     * @see #getCimClient()
     */
    private WBEMClient cimClient;

    /**
     * @param adapter the link to the adapter
     */
    protected WbemsmtBusinessObject(AbstractBaseCimAdapter adapter)
	{
		this.baseCimAdapter = adapter;
	}
	
    /**
     * get the first children in the list
     * @param mustReturnThis the expected class
     * @param list the list with the children
     * @param silent don't throw exceptions (set to true if it's okay that there is no child)
     * @return the first children
     * @throws WbemsmtException if there was no child or is not of the type defined by  mustReturnThis
     */
    
	protected Object getFirstChild(Class<?> mustReturnThis, List<? extends Object> list, boolean silent) throws WbemsmtException {
		return getFirstChild(mustReturnThis, list, silent, false, baseCimAdapter.getCimClient(), baseCimAdapter.getNamespace());
	}

    /**
     * get the first children in the list
     * @param mustReturnThis the expected class
     * @param list the list with the children
     * @param silent don't throw exceptions (set to true if it's okay that there is no child)
     * @param createIfNotExists create a child if none exists
     * @return the first children
     * @throws WbemsmtException if there was no child or is not of the type defined by  mustReturnThis
     */

	protected Object getFirstChild(Class<?> mustReturnThis, List<? extends Object> list, boolean silent,boolean createIfNotExists) throws WbemsmtException {
		return getFirstChild(mustReturnThis, list, silent, createIfNotExists, baseCimAdapter.getCimClient(), baseCimAdapter.getNamespace());
	}

    /**
     * get the first children in the list
     * @param mustReturnThis the expected class
     * @param list the list with the children
     * @param silent don't throw exceptions (set to true if it's okay that there is no child)
     * @param createIfNotExists create a child if none exists
     * @param client the cim client defining where to create the new instance if createIfNotExists is true
     * @param namespace the namespace defining where to create the new instance if createIfNotExists is true
     * @return the first children
     * @throws WbemsmtException if there was no child or is not of the type defined by  mustReturnThis
     */

	protected static Object getFirstChild(Class<?> mustReturnThis, List<? extends Object> list, boolean silent, boolean createIfNotExists, WBEMClient client, String namespace) throws WbemsmtException {
		if (!silent && list.size() != 1)
		{
			logger.severe("Cannot get Element of Type " + mustReturnThis.getName() + " beause not exact one element was found in List. Found: " + list.size());
			throw new WbemsmtException(WbemsmtException.ERR_LOADING_MODEL,"Cannot load data model");
		}
		
		if (!silent && list.get(0) == null)
		{
			logger.severe("Cannot get Element of Type " + mustReturnThis.getName() + " beause first element was null");
			throw new WbemsmtException(WbemsmtException.ERR_LOADING_MODEL,"Cannot load data model");
		}
	
		if (!silent && !list.get(0).getClass().equals(mustReturnThis) && !(list.get(0) instanceof CIMObjectPath) )
		{
			logger.severe("Cannot get Element of Type " + mustReturnThis.getName() + " beause first element is not from type " + mustReturnThis.getName() + " is of type " + list.get(0).getClass());
			throw new WbemsmtException(WbemsmtException.ERR_LOADING_MODEL,"Cannot load data model");
		}
		
		if (list.size() == 0 && createIfNotExists)
		{
			try {
				return mustReturnThis.getConstructor(new Class[]{WBEMClient.class,String.class}).newInstance(new Object[]{client,namespace});
			} catch (Exception e)
			{
			    if (e instanceof InvocationTargetException) {
                    InvocationTargetException ite = (InvocationTargetException) e;
                    if (ite.getCause() instanceof WbemsmtException) {
                        WbemsmtException we = (WbemsmtException) ite.getCause();
                        throw we;
                    }
                }
			    throw new WbemsmtException(WbemsmtException.ERR_LOADING_MODEL,e);
			}
		}
		
		if (silent && list.size() == 0)
		{
			return null;
		}
		else
		{
			Object o = list.get(0);
			if (o instanceof CIMObjectPath)
			{
				CIMObjectPath path = (CIMObjectPath) o;
				String helper = mustReturnThis.getName() + "Helper";
				Object fco = null;
				try {
					Class<?> clsHelper = Class.forName(helper);
					Method method = clsHelper.getMethod("getInstance",new Class[]{WBEMClient.class,CIMObjectPath.class});
					fco = method.invoke(null,new Object[]{client,path});
					return fco;
				} catch (Exception e) {
					throw new WbemsmtException(WbemsmtException.ERR_LOADING_MODEL,"Cannot load element with path " + path, e);
				}
			}
			else
			{
				return o;
			}
		}
	}

	/**
	 * @return the adapter which manages this business object
	 */
	public AbstractBaseCimAdapter getBaseCimAdapter() {
		return baseCimAdapter;
	}

	/**
	 * mark the children to be reloaded
	 */
	public void setReloadChilds() {
		this.reloadChilds = true;
	}
	
	/**
	 * 
	 * @return the Object key for this element<br>the business object can decide if the key should be hierarchical or not
	 * @throws WbemsmtException if the cim object cannot be created
	 */
	public abstract CimObjectKey getCimObjectKey() throws WbemsmtException;
	
	/**
	 * stops the preload if this method is called by a different thread than a PreloadThread and preload is currently in proress
	 * @return true if the preload was stopped
	 * @throws WbemsmtException if stopping the preload failed
	 */
    public boolean stopPreload() throws WbemsmtException {
        
        if (preloading)
        {
            if (Thread.currentThread() instanceof PreloadThread)
            {
                return true;
            }
            logger.info("Stopping preload of " + getCimObjectKey().toString());
            stopPreloading = true;
        }
        
        while (preloading)
        {
            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e) {
                //Should not occur
            }
        }
        return true;
    }
    
    /**
     * 
     * @return true if the business object is in state of preloading
     */

    public boolean isPreloading() {
        return preloading;
    }
    
    
    /**
     * @param cimClient the local CimClient
     */
    
    public void setCimClient(WBEMClient cimClient) {
        this.cimClient = cimClient;
    }
    
    /**
     * get the cimClient - if there is no locale one: the cimclient from baseCimAdapter.getCimClient() will be used
     * <br>
     * Preloading threads should use this method to bbe sure to get the new cim client
     * @return the cimClient - local or adapter's one
     * @see #setCimClient(WBEMClient)
     * @see CIMClientPool#getNewCIMClient(String)
     */

    public WBEMClient getCimClient()
    {
        if (cimClient == null)
        {
            return baseCimAdapter.getCimClient();
        }
        else
        {
            return cimClient;
        }
    }
    
    
	
}
