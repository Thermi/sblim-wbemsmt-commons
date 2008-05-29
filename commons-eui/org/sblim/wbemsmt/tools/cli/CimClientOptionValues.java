 /** 
  * CimClientOptionValues.java
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
  * Description: Options needed to create a WBEMClient
  * 
  */
package org.sblim.wbemsmt.tools.cli;


/**
 * @author Bauschert
 *
 */
public class CimClientOptionValues {

	private  OptionDefinition host;
	private  OptionDefinition port;
	private  OptionDefinition namespace;
	private  OptionDefinition user;
	private  OptionDefinition password;
	private  OptionDefinition publicKeyFile;
	private  OptionDefinition privateKeyFile;
	private  OptionDefinition protocol;

	/*
	 * @Deprecated
	 */
	public CimClientOptionValues(OptionDefinition host, OptionDefinition port, OptionDefinition namespace, OptionDefinition user, OptionDefinition password, OptionDefinition publicKeyFile, OptionDefinition privateKeyFile) {
		this.host = host;
		this.port = port;
		this.namespace = namespace;
		this.user = user;
		this.password = password;
		this.publicKeyFile = publicKeyFile;
		this.privateKeyFile = privateKeyFile;
	}

	public CimClientOptionValues(OptionDefinition protocol, OptionDefinition host, OptionDefinition port, OptionDefinition namespace, OptionDefinition user, OptionDefinition password, OptionDefinition publicKeyFile, OptionDefinition privateKeyFile) {
		this.protocol = protocol;
		this.host = host;
		this.port = port;
		this.namespace = namespace;
		this.user = user;
		this.password = password;
		this.publicKeyFile = publicKeyFile;
		this.privateKeyFile = privateKeyFile;
	}

	public OptionDefinition getHost() {
		return host;
	}

	public void setHost(OptionDefinition host) {
		this.host = host;
	}

	public OptionDefinition getNamespace() {
		return namespace;
	}

	public void setNamespace(OptionDefinition namespace) {
		this.namespace = namespace;
	}

	public OptionDefinition getPassword() {
		return password;
	}

	public void setPassword(OptionDefinition password) {
		this.password = password;
	}

	public OptionDefinition getPort() {
		return port;
	}

	public void setPort(OptionDefinition port) {
		this.port = port;
	}

	public OptionDefinition getPrivateKeyFile() {
		return privateKeyFile;
	}

	public void setPrivateKeyFile(OptionDefinition privateKeyFile) {
		this.privateKeyFile = privateKeyFile;
	}

	public OptionDefinition getPublicKeyFile() {
		return publicKeyFile;
	}

	public void setPublicKeyFile(OptionDefinition publicKeyFile) {
		this.publicKeyFile = publicKeyFile;
	}

	public OptionDefinition getUser() {
		return user;
	}

	public void setUser(OptionDefinition user) {
		this.user = user;
	}

	public OptionDefinition getProtocol() {
		return protocol;
	}

	public void setProtocol(OptionDefinition protocol) {
		this.protocol = protocol;
	}
	

}
