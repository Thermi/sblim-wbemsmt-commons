 /** 
  * HttpServerConnectionManager.java
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
  * Description: Manager for the CIM HttpServerConnections
  * 
  */
package org.sblim.wbemsmt.cim.indication;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.sblim.wbem.client.indications.CIMEventDispatcher;
import org.sblim.wbem.client.indications.CIMIndicationHandler;
import org.sblim.wbem.client.indications.CIMIndicationListenertList;
import org.sblim.wbem.client.indications.CIMListener;
import org.sblim.wbem.http.HttpConnectionHandler;
import org.sblim.wbem.http.HttpServerConnection;

public class HttpServerConnectionManager
{
	private static HttpServerConnectionManager instance = null;
	private static Logger logger = Logger.getLogger(HttpServerConnectionManager.class.getName());	
	
	private Map connectionsByPort = new HashMap();
	private Map listenerListsByPort = new HashMap();
	private Map dispatchersByPort = new HashMap();
	
	private HttpServerConnectionManager()
	{
		
	}
	
	public static HttpServerConnectionManager getInstance()
	{
		if (instance == null)
		{
			instance = new HttpServerConnectionManager();
		}
		return instance;
	}
	
	/**
	 * Add a listener for the port - if there is no connection for that port a new one is created
	 * @param listener
	 * @param port
	 * @throws IOException if the Connection cannot be created
	 */
	public void addListener(CIMListener listener, int port) throws IOException
	{
		CIMIndicationListenertList list = null;
		String key = ""+port;
		if (connectionsByPort.containsKey(key))
		{
			list = (CIMIndicationListenertList) listenerListsByPort.get(key);
			list.addListener(listener);
		}
		else
		{
			list = new CIMIndicationListenertList();
			list.addListener(listener);
			CIMEventDispatcher dispatcher = new CIMEventDispatcher(list);
			CIMIndicationHandler indicationHdlr = new CIMIndicationHandler(dispatcher);
			HttpServerConnection httpServerConnection = new HttpServerConnection(new HttpConnectionHandler(indicationHdlr), port);
			httpServerConnection.setName("CIMListener - Http Server");
			httpServerConnection.start();
			logger.info("Server started on port " + port + " for Listener " + listener);
			
			connectionsByPort.put(key, httpServerConnection);
			dispatchersByPort.put(key, dispatcher);
			listenerListsByPort.put(key, list);
		}
	}
	
	public void removeListener(CIMListener listener, int port)
	{
		String key = ""+port;
		if (connectionsByPort.containsKey(key))
		{
			CIMIndicationListenertList list = (CIMIndicationListenertList) listenerListsByPort.get(key);
			list.removeListener(listener);
			
			logger.info("Listener " + listener + " removed from port " + port);
			
			if (list.getListeners().size() == 0)
			{
				CIMEventDispatcher dispatcher = (CIMEventDispatcher) dispatchersByPort.get(key);
				HttpServerConnection connection = (HttpServerConnection)connectionsByPort.get(key);
				connection.close();
				dispatcher.kill();
				
				connectionsByPort.remove(key);
				dispatchersByPort.remove(key);
				listenerListsByPort.remove(key);
				
				logger.info("Closed port " + port);
				
			}
			
		}
	}
}
