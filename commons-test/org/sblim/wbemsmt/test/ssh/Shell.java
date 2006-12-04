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

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.sblim.wbemsmt.exception.WbemSmtException;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
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
			UserInfo ui=new MyUserInfo(user,password);
			session.setUserInfo(ui);
			session.connect();
			
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
			
			System.out.println("Executing " + command.getCommand());			
			
			Channel channel=session.openChannel("exec");
			
			ChannelExec execChannel = (ChannelExec) channel;
			execChannel.setCommand(command.getCommand());
			execChannel.setInputStream(null);
			execChannel.setErrStream(System.err);
			
			StringBuffer sb = new StringBuffer();
		      InputStream in=channel.getInputStream();
		      
		      channel.connect();
		
		      byte[] tmp=new byte[1024];
		      while(true){
		        while(in.available()>0){
		          int i=in.read(tmp, 0, 1024);
		          if(i<0)break;
		          String string = new String(tmp, 0, i);
		          sb.append(string);
		        }
		        if(channel.isClosed()){
		          command.setExitStatus(channel.getExitStatus());
		          break;
		        }
		        try{Thread.sleep(1000);}catch(Exception ee){}
		      }
		      channel.disconnect();
			
			command.setResult(sb.toString());
			commands.add(command.clone());
			
			
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("Cannot send command ",e);
		} catch (CloneNotSupportedException e) {
			//should not occur
			e.printStackTrace();
		} catch (JSchException e) {
			e.printStackTrace();
			throw new RuntimeException("Cannot send command ",e);
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