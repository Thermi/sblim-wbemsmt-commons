 /** 
  * WbemsmtSession.java
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
  * Description: Wbemsmt Session object
  * 
  */
package org.sblim.wbemsmt.session;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.context.FacesContext;
import javax.wbem.client.WBEMClient;

import org.sblim.wbemsmt.cim.CIMClientPool;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tools.beans.BeanNameConstants;
import org.sblim.wbemsmt.tools.resources.ResourceBundleManager;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;
import org.sblim.wbemsmt.tools.runtime.RuntimeUtil;

/**
 * @author Bauschert
 *
 */
public class WbemsmtSession {
	
	private static final String KEYSUFFIX_CLIENT_POOL = "-clientPool";
	private static WbemsmtSession session;
	private Map sessionData = new HashMap();
	
	static Logger logger = Logger.getLogger(WbemsmtSession.class.getName());
	
	public void removeAttribute(String key)
	{
		sessionData.remove(key);
	}

	public void setAttribute(String key, Object value)
	{
		sessionData.put(key,value);
	}

	public Object getAttribute(String key)
	{
		return sessionData.get(key);
	}
	
	/**
	 * @return
	 * @see java.util.Map#entrySet()
	 */
	public Set entrySet()
	{
		return sessionData.entrySet();
	}

	public void clear()
	{
		Set entries = entrySet();
		for (Iterator iterator = entries.iterator(); iterator.hasNext();) {
			Map.Entry entry = (Map.Entry) iterator.next();
			if (((String)entry.getKey()).endsWith(KEYSUFFIX_CLIENT_POOL))
			{
				CIMClientPool pool = (CIMClientPool) entry.getValue();
				pool.cleanUp();
			}
		}
		sessionData.clear();
		
	}
	
	public void initClientPool()
	{
		
	}
	
	/**
	 * Returns a iterator of Map.Entry Objects
	 * @return
	 */
	public Iterator getEntries()
	{
		return sessionData.entrySet().iterator();
	}
	
	/**
	 * Gets the Session
	 * if the application is run in jsf mode the managed bean WbemsmtSessionBean is return.
	 * Otherwise the static instance of WbemsmtSession is returned (can bee seen as a Singleton) 
	 * @return
	 */
	public static WbemsmtSession getSession()
	{
		if (RuntimeUtil.getInstance().isJSF())
		{
			return (WbemsmtSession) BeanNameConstants.SESSION.getBoundValue(FacesContext.getCurrentInstance());
		}
		else if (RuntimeUtil.getInstance().isCommandline() || RuntimeUtil.getInstance().isSwing())
		{
			if (session == null)
			{
				session = new WbemsmtSession();
			}
			return session;
		}
		else
		{
			throw new IllegalStateException("Runtime mode " + RuntimeUtil.getInstance().getRuntime() + " is not supported");
		}
	}

	/**
	 * remove all the attribute with the key starting with the given prefix
	 * @param prefix
	 */
	public void removeAttributesWithPrefix(String prefix) {
		List toBeRemoved = new ArrayList();
		
		for (Iterator iter = sessionData.keySet().iterator(); iter.hasNext();) {
			String key = (String) iter.next();
			if (key.startsWith(prefix))
			{
				toBeRemoved.add(key);
			}
		}

		for (Iterator iter = toBeRemoved.iterator(); iter.hasNext();) {
			String key = (String) iter.next();
			removeAttribute(key);
		}
	}

	/**
	 * Create a new CIMCLient pool
	 * @param hostname the name of the target host
	 * @param port the port of the target host
	 * @param username  the user's name for the connection
	 * @param password the user's password for the connection
	 * @return
	 * @throws WbemsmtException if the hostname cannot be resolved
	 */
	
	public CIMClientPool createCIMClientPool(String protocol,String hostname, String port, String username, String password) throws WbemsmtException {
		
	    try {
            String key = InetAddress.getByName(hostname).getHostName() + KEYSUFFIX_CLIENT_POOL;
             CIMClientPool pool = new CIMClientPool(protocol,hostname,port,username,password.toCharArray());
             setAttribute(key, pool);
             return pool;
        }
        catch (UnknownHostException e) {
            WbemSmtResourceBundle bundle = ResourceBundleManager.getResourceBundle(new String[]{"messages"});
            throw new WbemsmtException(WbemsmtException.ERR_NOT_CONNECTED, bundle.getString("unknown.host",new Object[]{hostname}),e);
        }
	}
	
	/**
	 * Get the client pool for the given target hostname
	 * 
	 * if there is no client pool the method returns null. In that case the method
	 * createWBEMClientPool should be used to create a new one 
	 * 
	 * @param hostname
	 * @return
	 * 
	 * @see #createWBEMClientPool(String, String, String, String)
	 */
	public CIMClientPool getCIMClientPool(String hostname) {
		
		 try {
			String key = InetAddress.getByName(hostname).getHostName() + KEYSUFFIX_CLIENT_POOL;
			CIMClientPool pool = (CIMClientPool) getAttribute(key);
			 return pool;
		} catch (UnknownHostException e) {
			//should not occur, because the method createWBEMClientPool uses the same hostname
			logger.log(Level.SEVERE, "Cannot get CimClientPool for hostname " + hostname, e);
		}
		return null;
	}

	/**
	 * get the pool of the CIMClient
	 * @param client
	 * @return
	 */
	public CIMClientPool getCIMClientPool(WBEMClient client) {
		Set entries = entrySet();
		for (Iterator iterator = entries.iterator(); iterator.hasNext();) {
			Map.Entry entry = (Map.Entry) iterator.next();
			if (((String)entry.getKey()).endsWith(KEYSUFFIX_CLIENT_POOL))
			{
				CIMClientPool pool = (CIMClientPool) entry.getValue();
				if (pool.containsCIMClient(client))
				{
					return pool;
				}
			}
		}
		return null;
	}

}
