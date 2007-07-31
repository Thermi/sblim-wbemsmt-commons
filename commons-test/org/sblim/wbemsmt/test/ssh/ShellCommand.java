/**
 *  Command.java
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
 * @author: Michael Bauschert <michael.bauschert@de.ibm.com>
 *
 * Contributors: Used for storing Commands and the Results
 *
 */

package org.sblim.wbemsmt.test.ssh;

/**
 * @author Bauschert
 *
 */
public class 
ShellCommand implements Cloneable {
	
	private String command;
	private String result;
	private String exitStatus;
	
	public ShellCommand(String command) {
		super();
		this.command = command;
	}

	public ShellCommand(String command, String result) {
		super();
		this.command = command;
		this.result = result;
	}

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public void setExitStatus(String exitStatus) {
		this.exitStatus = exitStatus;
	}

	public String getExitStatus() {
		return exitStatus;
	}

	public void trace() {
		System.out.println(command);
		System.out.println(result);
		System.out.println("RC " + exitStatus);
		
	}
	
	
	
	
	
	

}
