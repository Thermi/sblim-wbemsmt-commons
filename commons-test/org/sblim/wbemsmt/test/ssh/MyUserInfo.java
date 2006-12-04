/** 
  * MyUserInfo.java
  *
  * (C) Copyright IBM Corp. 2005
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
  * Description: Userdata for SSH-Connect
  * 
  */

package org.sblim.wbemsmt.test.ssh;

import com.jcraft.jsch.UIKeyboardInteractive;
import com.jcraft.jsch.UserInfo;

public class MyUserInfo implements UserInfo, UIKeyboardInteractive {
    private String user;
	private String password;

	public MyUserInfo(String user, String password) {
		this.user = user;
		this.password = password;
	}
	public String getPassword(){ return password; }
    public boolean promptYesNo(String str){
    	return true;
    }
  
    public String getPassphrase(){ return null; }
    public boolean promptPassphrase(String message){ return true; }
    public boolean promptPassword(String message){return true;}
    public void showMessage(String message){System.err.println(message);}
	public String[] promptKeyboardInteractive(String destination, String name, String instruction, String[] prompt, boolean[] echo) {
//		System.out.println("promptKeyboardInteractive");
//		System.out.println("destination: "+destination);
//		System.out.println("name: "+name);
//		System.out.println("instruction: "+instruction);
//		System.out.println("prompt.length: "+prompt.length);
//		System.out.println("prompt: "+prompt[0]);
		return new String[]{password};
	}
	public String getUser() {
		return user;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setUser(String user) {
		this.user = user;
	}
	
	
	
  }
