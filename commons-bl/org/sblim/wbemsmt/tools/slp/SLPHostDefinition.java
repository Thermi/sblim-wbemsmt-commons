 /** 
  * SLPHostDefinition.java
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
  * Description: A Host loaded via SLP
  * 
  */
package org.sblim.wbemsmt.tools.slp;

/**
 * A Host loaded via SLP
 */
public class SLPHostDefinition {

	private final String hostname;
	private final int port;
	private final String protocol;
	private final String namespace;

	public SLPHostDefinition(String hostname, int port, String protocol, String namespace) {
		this.hostname = hostname;
		this.port = port;
		this.protocol = protocol;
		this.namespace = namespace;
	}

	public String getHostname() {
		return hostname;
	}

	public String getNamespace() {
		return namespace;
	}

	public int getPort() {
		return port;
	}

	public String getProtocol() {
		return protocol;
	}

	
	public String toString() {
		return protocol + "://" + hostname + ":" + port + "/" + namespace;
	}

}
