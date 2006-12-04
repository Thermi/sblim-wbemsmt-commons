/**
 *  ScpTo.java
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
 * Contributors: Used for sending files via SCP
 *
 */

package org.sblim.wbemsmt.test.ssh;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Logger;

import org.sblim.wbemsmt.exception.WbemSmtException;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.UserInfo;

public class Scp {

	private static Logger logger = Logger.getLogger("org.sblim.wbemsmt.test.ssh");

	
	private String user;

	private String password;

	private String host;

	private int port = 22;

	private String remoteFile;

	private String localeFile;

	/**
	 * 
	 * @param localFile
	 * @param user
	 * @param password
	 * @param host
	 * @param port set to null if default port is used
	 * @param remoteFile
	 */
	public Scp(String localFile, String user, String password, String host,
			String port, String remoteFile) {
		super();
		this.localeFile = localFile;
		this.user = user;
		this.password = password;
		this.host = host;
		this.remoteFile = remoteFile;
		if (port != null) {
			this.port = Integer.parseInt(port);
		}
	}

	public Scp(String localFile, String user, String password, String host,
			int port, String remoteFile) {
		super();
		this.localeFile = localFile;
		this.user = user;
		this.password = password;
		this.host = host;
		this.remoteFile = remoteFile;
		this.port = port;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getLocaleFile() {
		return localeFile;
	}

	public void setLocaleFile(String lfile) {
		this.localeFile = lfile;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getRemoteFile() {
		return remoteFile;
	}

	public void setRemoteFile(String rfile) {
		this.remoteFile = rfile;
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

	public void send() throws WbemSmtException {

		logger.info("Transfer " + localeFile + " to  " + user + "@" + host
				+ ":" + port + remoteFile);

		FileInputStream fis = null;
		try {

			JSch jsch = new JSch();
			Session session = jsch.getSession(user, host, port);

			// username and password will be given via UserInfo interface.
			UserInfo ui = new MyUserInfo(user, password);
			session.setUserInfo(ui);
			session.connect();

			// exec 'scp -t rfile' remotely
			String command = "scp -p -t " + remoteFile;
			Channel channel = session.openChannel("exec");
			((ChannelExec) channel).setCommand(command);

			// get I/O streams for remote scp
			OutputStream out = channel.getOutputStream();
			InputStream in = channel.getInputStream();

			channel.connect();

			if (checkAck(in) != 0) {
				throw new RuntimeException("No Ack");
			}

			// send "C0644 filesize filename", where filename should not include
			// '/'
			long filesize = (new File(localeFile)).length();
			command = "C0644 " + filesize + " ";
			if (localeFile.lastIndexOf('/') > 0) {
				command += localeFile.substring(localeFile.lastIndexOf('/') + 1);
			} else {
				command += localeFile;
			}
			command += "\n";
			out.write(command.getBytes());
			out.flush();

			if (checkAck(in) != 0) {
				throw new RuntimeException("No Ack");
			}

			// send a content of lfile
			fis = new FileInputStream(localeFile);
			byte[] buf = new byte[1024];
			while (true) {
				int len = fis.read(buf, 0, buf.length);
				if (len <= 0)
					break;
				out.write(buf, 0, len);
				out.flush();
			}
			fis.close();
			fis = null;

			// send '\0'
			buf[0] = 0;
			out.write(buf, 0, 1);
			out.flush();

			if (checkAck(in) != 0) {
				throw new RuntimeException("No Ack");
			}

			session.disconnect();
		} catch (Exception e) {
			e.printStackTrace();
			try {
				if (fis != null)
					fis.close();
			} catch (Exception ee) {
			}
			throw new RuntimeException("Cannot send " + new File(localeFile).getAbsolutePath() + " to  " + user
					+ "@" + host + ":" + port + remoteFile, e);
		}
	}

	public void receive() throws WbemSmtException {

		logger.info(" receive from " + localeFile + " from  " + user + "@" + host + ":" + port + remoteFile);
				
		FileOutputStream fos = null;

		try {
			JSch jsch = new JSch();
			Session session = jsch.getSession(user, host, port);

			// username and password will be given via UserInfo interface.
			UserInfo ui = new MyUserInfo(user, password);
			session.setUserInfo(ui);
			session.connect();

			// exec 'scp -f rfile' remotely
			String command = "scp -f " + remoteFile;
			Channel channel = session.openChannel("exec");
			((ChannelExec) channel).setCommand(command);

			// get I/O streams for remote scp
			OutputStream out = channel.getOutputStream();
			InputStream in = channel.getInputStream();

			channel.connect();

			byte[] buf = new byte[1024];

			// send '\0'
			buf[0] = 0;
			out.write(buf, 0, 1);
			out.flush();

			while (true) {
				int c = checkAck(in);
				if (c != 'C') {
					break;
				}

				// read '0644 '
				in.read(buf, 0, 5);

				long filesize = 0L;
				while (true) {
					if (in.read(buf, 0, 1) < 0) {
						// error
						break;
					}
					if (buf[0] == ' ')
						break;
					filesize = filesize * 10L + (long) (buf[0] - '0');
				}

				for (int i = 0;; i++) {
					in.read(buf, i, 1);
					if (buf[i] == (byte) 0x0a) {
						break;
					}
				}

				// System.out.println("filesize="+filesize+", file="+file);

				// send '\0'
				buf[0] = 0;
				out.write(buf, 0, 1);
				out.flush();

				// read a content of lfile
				fos = new FileOutputStream(localeFile);
				int foo;
				while (true) {
					if (buf.length < filesize)
						foo = buf.length;
					else
						foo = (int) filesize;
					foo = in.read(buf, 0, foo);
					if (foo < 0) {
						// error
						break;
					}
					fos.write(buf, 0, foo);
					filesize -= foo;
					if (filesize == 0L)
						break;
				}
				fos.close();
				fos = null;

				if (checkAck(in) != 0) {
					throw new RuntimeException("No Ack");
				}

				// send '\0'
				buf[0] = 0;
				out.write(buf, 0, 1);
				out.flush();
			}

			session.disconnect();
		} catch (Exception e) {
			System.out.println(e);
			try {
				if (fos != null)
					fos.close();
			} catch (Exception ee) {
			}
			throw new RuntimeException("Cannot receive from " + localeFile + " from  " + user
					+ "@" + host + ":" + port + remoteFile, e);
		}
	}

	static int checkAck(InputStream in) throws IOException {
		int b = in.read();
		// b may be 0 for success,
		// 1 for error,
		// 2 for fatal error,
		// -1
		if (b == 0)
			return b;
		if (b == -1)
			return b;

		if (b == 1 || b == 2) {
			StringBuffer sb = new StringBuffer();
			int c;
			do {
				c = in.read();
				sb.append((char) c);
			} while (c != '\n');
			if (b == 1) { // error
				System.out.print(sb.toString());
			}
			if (b == 2) { // fatal error
				System.out.print(sb.toString());
			}
		}
		return b;
	}
}
