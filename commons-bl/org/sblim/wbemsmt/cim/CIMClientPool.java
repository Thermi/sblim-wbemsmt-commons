 /** 
  * CIMClientPool.java
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
  * Description: Pool for CIMClients
  *              For every host a pool is created in every session
  * 
  */
package org.sblim.wbemsmt.cim;

import java.util.HashMap;
import java.util.Map;

import org.sblim.wbem.cim.CIMException;
import org.sblim.wbem.cim.CIMNameSpace;
import org.sblim.wbem.cim.CIMObjectPath;
import org.sblim.wbem.client.CIMClient;
import org.sblim.wbem.client.PasswordCredential;
import org.sblim.wbem.client.UserPrincipal;
import org.sblim.wbemsmt.exception.LoginException;

public class CIMClientPool {
	String username;
	char[] password;
	String hostname;
	String port;

	Map clientsByNamespace = new HashMap(); 
	
	public CIMClientPool(String hostname, String port, String username, char[] password) {
		super();
		this.hostname = hostname;
		this.port = port;
		this.username = username;
		this.password = password;
	}
	
	
	/**
	 * get the cimclient for the given namespace
	 * 
	 * if for the namespace no cimClient exists a new one is created
	 * 
	 * @param namespace
	 * @return
	 */
	public CIMClient getCIMClient(String namespace)  throws LoginException {
	
		CIMClient client = (CIMClient) clientsByNamespace.get(namespace);
		if (client == null)
		{
			String url = "HTTP://" + hostname + ":" + port.trim();
			client = new CIMClient(new CIMNameSpace(url,namespace), new UserPrincipal(username.trim()), new PasswordCredential(password));
			//check if the client can access the server
			try {
				client.enumerateClasses();
			} catch (CIMException e) {
				throw new LoginException(e,client);
			}
			clientsByNamespace.put(namespace, client);
		}
		
		return client;
		
	}

	/**
	 * return a new cimClient if the namespace of the cimclient and the namespace if the objectPath are not the same
	 * @param cimClient
	 * @param cimObjectPath
	 * @return a cimclient for the namespace of the cimObjectPath
	 */

	public CIMClient getCIMClient(CIMClient cimClient, CIMObjectPath cimObjectPath) throws LoginException {
		
		String ns1 = cimClient.getNameSpace().getNameSpace();
		String ns2 = cimObjectPath.getNameSpace();
		
		if (ns1.equals(ns2))
		{
			return cimClient;
		}
		else
		{
			return getCIMClient(ns2);
		}
	}
}
