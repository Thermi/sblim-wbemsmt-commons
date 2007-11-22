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

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import javax.security.auth.Subject;

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
	Map jsr48ClientsByNamespace = new HashMap(); 
	
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
			client = getNewCIMClient(namespace);
		}
		
		return client;
		
	}

	/**
	 * Creates a new CIMClient. Not uses the cached version
	 * @param namespace
	 * @return
	 * @throws LoginException
	 */

	public CIMClient getNewCIMClient(String namespace) throws LoginException {
		CIMClient client;
		String url = "HTTP://" + hostname + ":" + port.trim();
		client = new CIMClient(new CIMNameSpace(url,namespace), new UserPrincipal(username.trim()), new PasswordCredential(password));
		//check if the client can access the server
		try {
			client.enumerateClasses();
		} catch (CIMException e) {
			throw new LoginException(e,client);
		}
		clientsByNamespace.put(namespace, client);
		return client;
	}
	
	/**
	 * get the jsr48 cimclient for the given namespace
	 * 
	 * if for the namespace no cimClient exists a new one is created
	 * 
	 * @param namespace
	 * @return the javax.wbem.client.WBEMClient (as object because we wanted no dependency to the jsr48 interfaces)   
	 */
	public Object getJsr48CIMClient(String namespace)  throws LoginException {
	
		
		Object result = jsr48ClientsByNamespace.get(namespace);
		if (result == null)
		{
			try {
				result = getNewJsr48CIMClient(namespace);
				jsr48ClientsByNamespace.put(namespace, result);
			} catch (Exception e) {
				throw new LoginException("Cannot create JSR48 client",e,null);
			}
		}
		
		return result;
	}


	/**
	 * Creates a new JSR48CIMClient. Not uses the cached version 
	 * @param namespace
	 * @return
	 * @throws Exception
	 */
	public Object getNewJsr48CIMClient(String namespace) throws Exception {
		Object result;
		URL pWbemUrl = new URL("HTTP://" + hostname + ":" + port.trim());
		//result = new CIMClient(new CIMNameSpace(url,namespace), new UserPrincipal(username.trim()), new PasswordCredential(password));

		Class factory = Class.forName("javax.wbem.client.WBEMClientFactory");
		Class path = Class.forName("javax.cim.CIMObjectPath");
		
		
		Class property = Class.forName("javax.cim.CIMProperty");
		property = Array.newInstance(property, 0).getClass();
		Class userprincipal = Class.forName("javax.wbem.client.UserPrincipal");
		Class passwordCredential = Class.forName("javax.wbem.client.PasswordCredential");
		Class clsClient = Class.forName("javax.wbem.client.WBEMClient");
		
		Object userPrincipalObject = userprincipal.getConstructor(new Class[]{String.class}).newInstance(new Object[]{username});
		Object passwordCredentialObject = passwordCredential.getConstructor(new Class[]{String.class}).newInstance(new Object[]{String.valueOf(password)});
		
		Method m = factory.getMethod("getClient", new Class[]{String.class});
		
		result = m.invoke(factory, new Object[]{"CIM-XML"});
		
		Object pathObject = path.getConstructor(new Class[]{String.class, String.class, String.class, String.class,String.class, property})
			.newInstance(new Object[]{pWbemUrl.getProtocol(),pWbemUrl.getHost(), String.valueOf(pWbemUrl.getPort()), null, null, null});
		
		final Subject subject = new Subject();
		
		Set principals = subject.getPrincipals();
		principals.add(userPrincipalObject);
		
		Set privateCredentials = subject.getPrivateCredentials();
		privateCredentials.add(passwordCredentialObject);
		
		clsClient.getMethod("initialize", new Class[]{path,subject.getClass(),Locale[].class}).invoke(result, new Object[]{pathObject, subject, new Locale[] { Locale.US }});

		pathObject = path.getConstructor(new Class[]{String.class, String.class}).newInstance(new Object[]{"CIM_ManagedElement",namespace});
		
		result.getClass().getMethod("enumerateClassNames", new Class[]{path,boolean.class}).invoke(result, new Object[]{pathObject,Boolean.TRUE});
		return result;
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
	
	/**
	 * return a jsr48 cimClient for the namespace within the objectPath
	 * @param cimObjectPath carrying the namespace
	 * @return the javax.wbem.client.WBEMClient (as object because we wanted no dependency to the jsr48 interfaces)
	 */

	public Object getJsr48CIMClient(CIMObjectPath cimObjectPath) throws LoginException {
		String ns = cimObjectPath.getNameSpace();
		return getJsr48CIMClient(ns);
	}	
}
