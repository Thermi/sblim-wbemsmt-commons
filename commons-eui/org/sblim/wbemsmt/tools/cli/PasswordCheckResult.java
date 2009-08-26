 /** 
  * PasswordCheckresult.java
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
  * Description: Result of the PasswordCheck
  * 
  */
package org.sblim.wbemsmt.tools.cli;

/**
 * @author Bauschert
 *
 */
public class PasswordCheckResult {
	
	private boolean passwordEntered;
	/**
	 * The modified arguments
	 */
	private String[] args;
	
	
	public String[] getArgs() {
		return args;
	}
	public void setArgs(String[] args) {
		this.args = args;
	}
	public boolean isPasswordEntered() {
		return passwordEntered;
	}
	public void setPasswordEntered(boolean passwordEntered) {
		this.passwordEntered = passwordEntered;
	}
	
	

}
