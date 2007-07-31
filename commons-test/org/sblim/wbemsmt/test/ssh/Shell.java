/**
 *  Shell.java
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
 * Contributors: Used as SSH-Shell
 *
 */


package org.sblim.wbemsmt.test.ssh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import org.sblim.wbemsmt.exception.WbemSmtException;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.UserInfo;

public class Shell{

private String user;
private String password;
private String host;
private int port = 22;

private List commands = new ArrayList();
private boolean opened;
private Session session;
private Channel channel;
private PipedOutputStream toServer;
private PipedInputStream fromServer;

	public Shell(String user, String password, String host, String port) {
		super();
		this.user = user;
		this.password = password;
		this.host = host;
		if (port != null)
		{
			this.port = Integer.parseInt(port);
		}		
	}
	
	public Shell(String user, String password, String host, int port) {
		super();
		this.user = user;
		this.password = password;
		this.host = host;
		this.port = port;
	}
	
	public String getHost() {
		return host;
	}
	
	public void setHost(String host) {
		this.host = host;
	}
	
	public int getPort() {
		return port;
	}
	
	public void setPort(int port) {
		this.port = port;
	}
	
	
	public String getUser() {
		return user;
	}
	
	public void setUser(String user) {
		this.user = user;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public void open() throws WbemSmtException
	{
	
		try {
			System.out.println("Open Shell on " + user + "@" + host + ":" + port);

			JSch jsch=new JSch();
			session=jsch.getSession(user, host, port);

			// username and passphrase will be given via UserInfo interface.
			UserInfo ui=new MyUserInfo(user,password,host);
			session.setUserInfo(ui);
			session.connect(30000);
			
			toServer = new PipedOutputStream();
			fromServer = new PipedInputStream();
			
			channel = session.openChannel("shell");
			channel.setInputStream(new PipedInputStream(toServer));
			channel.setOutputStream(new PipedOutputStream(fromServer));
			
			channel.connect(3*1000);
			
			
			opened = true;
			
		} catch (Exception e) {
			throw new RuntimeException("Cannot Open Shell on " + user + "@" + host + ":" + port,e);
		}
	}

	public boolean isOpened() {
		return opened;
	}

	public void execute(ShellCommand command) throws WbemSmtException
	{
		if (!isOpened())
		{
			open();
		}
		
		try {
			
			String readyToken = "; RETVALUE=$?; echo '---READY---'; echo $RETVALUE";
			toServer.write(("echo '---START---'; " + command.getCommand() + readyToken).getBytes());
			toServer.write("\n".getBytes());
			
			BufferedReader in = new BufferedReader(new InputStreamReader(fromServer));
			String line;
			StringBuffer sb = new StringBuffer();
			boolean started = false;
			try {
				while ((line = in.readLine()) != null)
				{
					if (line.equals("---START---"))
					{
						started = true;
					}
					else if (started)
					{
						if (line.equals("---READY---"))
						{
							line = in.readLine();
							command.setExitStatus(line);
							break;
						}
						else
						{
							sb.append(line).append("\n");
						}
					}
					
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			command.setResult(sb.toString());
			command.trace();
			commands.add(command.clone());
			
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("Cannot send command ",e);
		} catch (CloneNotSupportedException e) {
			//should not occur
			e.printStackTrace();
		}
		
	}
	
	public void clearComamnds()
	{
		commands.clear();
	}
	
	public ShellCommand getLastCommand()
	{
		if (commands.size() > 0)
		{
			return (ShellCommand) commands.get(commands.size()-1);
		}
		else
		{
			return null;
		}
	}

	public ShellCommand getCommand(int index)
	{
		return (ShellCommand) commands.get(index);
	}

	
}