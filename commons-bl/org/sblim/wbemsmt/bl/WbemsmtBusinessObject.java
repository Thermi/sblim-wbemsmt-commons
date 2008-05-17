 /** 
  * WbemsmtBusinessObject.java
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
  * Description: Base class for wbemsmt Business Objects
  * 
  */
package org.sblim.wbemsmt.bl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.logging.Logger;

import javax.cim.CIMObjectPath;
import javax.wbem.client.WBEMClient;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.bl.wrapper.preload.PreloadThread;
import org.sblim.wbemsmt.exception.WbemsmtException;

/**
 * @author Bauschert
 *
 */
public abstract class WbemsmtBusinessObject {

	protected static Logger logger = Logger.getLogger(WbemsmtBusinessObject.class.getName());
	protected boolean reloadChilds = false;
	protected final AbstractBaseCimAdapter baseCimAdapter;

    protected boolean preloading = false;
    protected boolean stopPreloading = false;
    private WBEMClient cimClient;

    protected WbemsmtBusinessObject(AbstractBaseCimAdapter adapter)
	{
		this.baseCimAdapter = adapter;
	}
	
	protected Object getFirstChild(Class mustReturnThis, List list, boolean silent) throws WbemsmtException {
		return getFirstChild(mustReturnThis, list, silent, false, baseCimAdapter.getCimClient(), baseCimAdapter.getNamespace());
	}

	protected Object getFirstChild(Class mustReturnThis, List list, boolean silent,boolean createIfNotExists) throws WbemsmtException {
		return getFirstChild(mustReturnThis, list, silent, createIfNotExists, baseCimAdapter.getCimClient(), baseCimAdapter.getNamespace());
	}

	protected static Object getFirstChild(Class mustReturnThis, List list, boolean silent, boolean createIfNotExists, WBEMClient client, String namespace) throws WbemsmtException {
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
					Class clsHelper = Class.forName(helper);
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

	public AbstractBaseCimAdapter getBaseCimAdapter() {
		return baseCimAdapter;
	}

	public void setReloadChilds() {
		this.reloadChilds = true;
	}
	
	public abstract CimObjectKey getCimObjectKey() throws WbemsmtException;
	
	/**
	 * stops the preload if this method is called by a different thread than a PreloadThread and preload is currently in proress
	 * @return true if the preload was stopped
	 * @throws WbemsmtException
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

    public boolean isPreloading() {
        return preloading;
    }
    
    
    /**
     * set the local CimClient
     */
    
    public void setCimClient(WBEMClient cimClient) {
        this.cimClient = cimClient;
    }
    
    /**
     * get the cimClient - if there is a local one use this - if not the cimclient from baseCimAdapter.getCimClient() will be used
     * @return
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
