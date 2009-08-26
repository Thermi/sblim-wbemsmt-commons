 /** 
  * LoginOptionValues.java
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
  * Description: ValueObject for LoginOptions
  * 
  */
package org.sblim.wbemsmt.tools.cli;

/**
 * @author Bauschert
 *
 */
public class LoginOptionValues {
	
	OptionDefinition host,user,password;

	
	
	public LoginOptionValues(OptionDefinition host, OptionDefinition user, OptionDefinition password) {
		super();
		this.host = host;
		this.user = user;
		this.password = password;
	}

	public OptionDefinition getHost() {
		return host;
	}

	public void setHost(OptionDefinition host) {
		this.host = host;
	}

	public OptionDefinition getPassword() {
		return password;
	}

	public void setPassword(OptionDefinition password) {
		this.password = password;
	}

	public OptionDefinition getUser() {
		return user;
	}

	public void setUser(OptionDefinition user) {
		this.user = user;
	}
	
	
	
}
