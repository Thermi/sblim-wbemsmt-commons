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

import org.sblim.wbem.client.CIMClient;
import org.sblim.wbemsmt.cim.CIMClientPool;
import org.sblim.wbemsmt.tools.beans.BeanNameConstants;
import org.sblim.wbemsmt.tools.runtime.RuntimeUtil;

/**
 * @author Bauschert
 *
 */
public class WbemsmtSession {
	
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
	
	public void clear()
	{
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
	 * @throws UnknownHostException if the hostname cannot be resolved
	 */
	
	public CIMClientPool createCIMClientPool(String hostname, String port, String username, String password) throws UnknownHostException {
		
		 String key = InetAddress.getByName(hostname).getHostName() + "-clientPool";
		 CIMClientPool pool = new CIMClientPool(hostname,port,username,password.toCharArray());
		 setAttribute(key, pool);
		 return pool;
	}
	
	/**
	 * Get the client pool for the given target hostname
	 * 
	 * if there is no client pool the method returns null. In that case the method
	 * createCIMClientPool should be used to create a new one 
	 * 
	 * @param hostname
	 * @return
	 * 
	 * @see #createCIMClientPool(String, String, String, String)
	 */
	public CIMClientPool getCIMClientPool(String hostname) {
		
		 try {
			String key = InetAddress.getByName(hostname).getHostName() + "-clientPool";
			 CIMClientPool pool = (CIMClientPool) getAttribute(key);
			 return pool;
		} catch (UnknownHostException e) {
			//should not occur, because the method createCIMClientPool uses the same hostname
			logger.log(Level.SEVERE, "Cannot get CimClientPool for hostname " + hostname, e);
		}
		return null;
	}

	/**
	 * return a cimClient pool for the host contained in the cimClient
	 * @param cimClient
	 * @return
	 */
	public CIMClientPool getCIMClientPool(CIMClient cimClient) {
		return getCIMClientPool(cimClient.getNameSpace().getHost());
	}

}
