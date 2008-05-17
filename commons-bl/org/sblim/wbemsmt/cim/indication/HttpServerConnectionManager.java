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
import java.net.InetAddress;
import java.util.logging.Logger;

import javax.wbem.listener.IndicationListener;
import javax.wbem.listener.WBEMListener;
import javax.wbem.listener.WBEMListenerFactory;

public class HttpServerConnectionManager
{
	private static HttpServerConnectionManager instance = null;
	protected static Logger logger = Logger.getLogger(HttpServerConnectionManager.class.getName());	
	private final static String protocol = "CIM-XML";
	
	private WBEMListener wbemListener;
	
	private HttpServerConnectionManager()
	{
		 wbemListener = WBEMListenerFactory.getListener(protocol);
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
	 * @param transport http or https
	 * @throws IOException if the Connection cannot be created
	 */
	public void addListener(IndicationListener listener, IndicationDestination destination) throws IOException
	{
	    int port = destination.getCalculatedUrl().getPort();
	    String transport = destination.getCalculatedUrl().getProtocol();
	    boolean usingNoIp = destination.isUsingNoIp();
	    
	    if (usingNoIp)
	    {
	        wbemListener.addListener(listener, port, transport);
	    }
	    else
	    {
	        wbemListener.addListener(listener, port, transport, InetAddress.getByName(destination.getCalculatedUrl().getHost()).getHostAddress());
	    }
	    
		logger.info("Added listener " + listener + " to port with transport " + transport);
	}
	
	public void removeListener(int port)
	{
		wbemListener.removeListener(port);
	}
}
