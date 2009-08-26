 /** 
  * WBEMClientPool.java
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
  * Description: Pool for WBEMClients
  *              For every host a pool is created in every session
  * 
  */
package org.sblim.wbemsmt.cim;

import java.lang.reflect.Field;
import java.util.*;
import java.util.logging.Logger;

import javax.cim.CIMObjectPath;
import javax.security.auth.Subject;
import javax.wbem.CloseableIterator;
import javax.wbem.WBEMException;
import javax.wbem.client.WBEMClient;
import javax.wbem.client.WBEMClientFactory;

import org.apache.commons.lang.StringUtils;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.exception.impl.LoginException;
import org.sblim.wbemsmt.exception.impl.userobject.LoginUserObject;

public class CIMClientPool {
	public static final String NOT_FOUND = "NOT_FOUND";
    String username;
	char[] password;
	String hostname;
	String port;
	String protocol;

	Map<String, WBEMClient> clientsByNamespace = new HashMap<String, WBEMClient>(); 
	Map<WBEMClient, String> namespaceByClient = new HashMap<WBEMClient, String>();
    private String hostnameFromCimom;
	
	private static Set<CIMClientPool> POOLS =new HashSet<CIMClientPool>();
	
	static Logger logger = Logger.getLogger(CIMClientPool.class.getName());
	
	public CIMClientPool(String protocol,String hostname, String port, String username, char[] password) {
		super();
		this.protocol = protocol;
		this.hostname = hostname;
		this.port = port.trim();
		this.username = username;
		this.password = password;
		
		POOLS.add(this);
	}
	
	
	/**
	 * get the cimclient for the given namespace
	 * 
	 * if for the namespace no cimClient exists a new one is created
	 * 
	 * @param namespace
	 * @return
	 */
	public WBEMClient getCIMClient(String namespace)  throws WbemsmtException {
	
		namespace = cleanupNamespace(namespace);
		WBEMClient client = (WBEMClient) clientsByNamespace.get(namespace);
		if (client == null)
		{
			client = getNewCIMClient(namespace);
		}
		
		return client;
		
	}

	/**
	 * Creates a new WBEMClient. Not uses the cached version
	 * @param namespace
	 * @return
	 * @throws WbemsmtException
	 */

	public WBEMClient getNewCIMClient(String namespace) throws WbemsmtException {
		namespace = cleanupNamespace(namespace);
		
        String loginUrl = username + "@" + protocol + "://" + hostname + ":" + port + "/" + namespace;
		try {
			final WBEMClientWrapper client = new WBEMClientWrapper(WBEMClientFactory.getClient("CIM-XML"));
			final javax.cim.CIMObjectPath path = new javax.cim.CIMObjectPath(protocol,hostname, port, null, null, null);
			final Subject subject = new Subject();
			subject.getPrincipals().add(new javax.wbem.client.UserPrincipal(username));
			subject.getPrivateCredentials().add(new javax.wbem.client.PasswordCredential(new String(password)));
			client.initialize(path, subject, new Locale[] { Locale.US });
			
			try {
                Class<?> cls = Class.forName("org.sblim.cimclient.WBEMConfigurationProperties");
                Field f = cls.getDeclaredField("HTTP_USE_CHUNKING");
                Object value = f.get(null);
                client.setProperty(""+value, "false");
                logger.info("Chunking set to false");
            }
            catch (Exception e) {
                logger.warning("Cannot set chunking to false " + e.getMessage());
            }

			client.getClass(new CIMObjectPath("CIM_ManagedElement",namespace), false, true, false, null);
			
			if (hostnameFromCimom == null)
			{
			    getHostnameFromCimom(client);
			}
			
			clientsByNamespace.put(namespace,client);
			namespaceByClient.put(client,namespace);

			logger.info("created client for " + loginUrl) ;
			
			client.setHostname(hostnameFromCimom == null || hostnameFromCimom == NOT_FOUND ? hostname : hostnameFromCimom);
			client.setPort(port);
			client.setProtocol(protocol);
			client.setUser(username);
			
			return client;
		} catch (Exception e) {
            LoginException e1 = new LoginException("Cannot login",e, new LoginUserObject(loginUrl));
			throw e1;
		}
		
		
	}

	/**
	 * If the hostname was found within a CIM repsonse getHostnameFromCimom == NOT_FOUND 
	 * @param client
	 * @see NOT_FOUND
	 */
	
    private void getHostnameFromCimom(final WBEMClient client) {
        try {
            CloseableIterator instances = client.enumerateInstanceNames(new CIMObjectPath("CIM_RegisteredProfile","root/pg_interop"));
            while (instances.hasNext())
            {
                CIMObjectPath path = (CIMObjectPath) instances.next();
                if (StringUtils.isNotEmpty(path.getHost()))
                {
                    hostnameFromCimom = path.getHost();
                    logger.info("Found cimserver's hostname: " + hostnameFromCimom);
                    return;
                }
                CloseableIterator associators = client.associatorNames(path, null, null, null, null);
                while (associators.hasNext())
                {
                    CIMObjectPath path2 = (CIMObjectPath)associators.next();
                    if (StringUtils.isNotEmpty(path2.getHost()))
                    {
                        hostnameFromCimom = path2.getHost();
                        logger.info("Found cimserver's hostname: " + hostnameFromCimom);
                        return;
                    }
                }
            }
        }
        catch (WBEMException e) {
            logger.warning("Cannot get hostname from cimom " + e.getMessage());
            hostnameFromCimom = NOT_FOUND;
        }
    }


	public String getNamespace(WBEMClient client)
	{
		return (String) namespaceByClient.get(client);
	}
	
	public static String cleanupNamespace(String namespace) {
		if (namespace.startsWith("/"))
		{
			namespace = namespace.substring(1);
		}
		return namespace;
	}


	public boolean containsCIMClient(WBEMClient client) {
		return namespaceByClient.containsKey(client);
	}
	
	public void cleanUp()
	{
		namespaceByClient.clear();
		clientsByNamespace.clear();
		
		POOLS.remove(this);
	}


	public String getUsername() {
		return username;
	}


	public char[] getPassword() {
		return password;
	}


	public String getHostname() {
		return hostname;
	}
	
    public String getHostnameFromCimom() {
        return hostnameFromCimom;
    }

    /**
	 * Searches all initialized client pools to find the pool which is responsible for this client
	 * @param client
	 * @return null if for the CIMClient no pool was found
	 */
	public static CIMClientPool getCIMClientPool(WBEMClient client)
	{
	    for (Iterator<CIMClientPool> iterator = POOLS.iterator(); iterator.hasNext();) {
            CIMClientPool pool = (CIMClientPool) iterator.next();
            if (pool.containsCIMClient(client))
            {
                return pool;
            }
        }
	    
	    return null;
	}


	public String getPort() {
		return port;
	}


	public String getProtocol() {
		return protocol;
	}
	
	
	
}
