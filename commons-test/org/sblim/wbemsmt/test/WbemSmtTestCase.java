/** 
  * WbemSmtTestCase.java
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
  * Description: TestCase Baseclass for wbemsmt tests
  * 
  */
  
package org.sblim.wbemsmt.test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Enumeration;
import java.util.logging.Logger;

import junit.framework.TestCase;

import org.sblim.wbem.cim.CIMNameSpace;
import org.sblim.wbem.cim.CIMObjectPath;
import org.sblim.wbem.client.CIMClient;
import org.sblim.wbem.client.PasswordCredential;
import org.sblim.wbem.client.UserPrincipal;
import org.sblim.wbemsmt.test.commandline.ArgumentList;
import org.sblim.wbemsmt.tools.cli.Cli;

/**
 * Base class for all WbemSmt-tests
 * @author Bauschert
 *
 */
public class WbemSmtTestCase extends TestCase {
	
	private static CIMClient cc = null;
	protected static WbemSmtTestSession testSession = WbemSmtTestSession.getInstance();
	
	protected static Logger logger = Logger.getLogger("org.sblim.wbemsmt.test");
	protected static WbemSmtTestConfig config = WbemSmtTestConfig.getInstance();
	private static CIMClient ccSlp;
	
	
	
	public WbemSmtTestCase() {
		super();
	}

	public WbemSmtTestCase(String arg0) {
		super(arg0);
	}



	/**
	 * Get the CIMClient with the application namespace
	 * @return
	 */
	public CIMClient getCIMClient()
	{
		return getCIMClient(false);
	}
	/**
	 * Get the CIMClient
	 * @return
	 */
	public CIMClient getCIMClient(boolean useSlpNamespace)
	{
		if (!useSlpNamespace && cc == null || useSlpNamespace && ccSlp == null)
		{
			 try {
				UserPrincipal userPrincipal      = new UserPrincipal(config.getUser());
				PasswordCredential passwordCredential = new PasswordCredential(config.getPassword().toCharArray());		
				
				String ns = useSlpNamespace ? config.getSlpNameSpace() : config.getNameSpace();
				if (!ns.startsWith("/"))
				{
					ns = "/" + ns;
				}
				
				CIMNameSpace cimNameSpace       = new CIMNameSpace(config.getUrl(),ns);
				
				CIMClient client = null;
				if (!useSlpNamespace)
				{
					client = cc = new CIMClient(cimNameSpace, userPrincipal, passwordCredential);
				}
				else
				{
					client = ccSlp = new CIMClient(cimNameSpace, userPrincipal, passwordCredential);
				}
				System.err.println("created client for " + client.getNameSpace().toString()) ;

				Enumeration e = client.enumerateClasses(new CIMObjectPath("CIM_ManagedElement"),false,false,false,false);
				if (e.hasMoreElements()) {
					e.nextElement();
					//System.err.println(cls.toString());
				}
				
				System.err.println("connected to " + client.getNameSpace().toString()) ;
				
			 } catch (Exception e) {
				 WbemSmtAssert.fail("Received error when trying ot retreieve client handle",e);
			 }			
		}
		
		if (!useSlpNamespace)
		{
			return cc;
		}
		else
		{
			return ccSlp;
		}
		
	}

	protected void checkLastTestOK() {
		assertTrue("Stopping Test - Last Test failed",testSession.lastTestOK());
		// is set back to OK if testMethod creates no error
		setTestFailed();
	}

	protected void setTestFailed() {
		testSession.setLastTestFailed();
	}

	protected void setTestOK() {
		testSession.setLastTestOK();
	}

	protected void setTestSessionFailed() {
		testSession.setLastTestSessionFailed();
	}

	protected void setTestSessionOK() {
		testSession.setLastTestSessionOK();
	}

	public String run(ArgumentList args, boolean expectCommandExecution, boolean expectValidationErrors) throws Exception {
		PrintStream out = System.out;
		PrintStream err = System.err;
		
		ByteArrayOutputStream newOut = new ByteArrayOutputStream();
		PrintStream newStreamOut = new PrintStream(newOut,true);

		ByteArrayOutputStream newErr = new ByteArrayOutputStream();
		PrintStream newStreamErr = new PrintStream(newErr,true);
		
		System.setOut(newStreamOut);
		System.setErr(newStreamErr);
		
		Cli.testMode = true;
		Cli.commandExecuted = true;
		
		try {
			Cli.main(args.getStringArray());
		} catch (Exception e) {
			e.printStackTrace();
			Cli.commandExecuted = false;
		}
		
		newStreamOut.flush();
		newStreamOut.close();
		newStreamErr.flush();
		newStreamErr.close();
		
		StringBuffer sb = new StringBuffer();
		sb.append("SYSOUT\n\n");
		sb.append(newOut.toString());
		sb.append("\n\nSYSERR\n\n");
		sb.append(newErr.toString());

//		String line;
//		while ((line = inOut.readLine()) != null)
//		{
//			sb.append(line).append("\n");
//		}
//
//		sb.append("\n\n\nSYSERR\n\n");
//		while ((line = inErr.readLine()) != null)
//		{
//			sb.append(line).append("\n");
//		}
//		
		String result = sb.toString();
		boolean havingValidationErrors = result.indexOf("validation error") > -1;
		
		System.setOut(out);
		System.setErr(err);

		System.out.println(result);

		assertEquals("Validation Error-Check failed. tesult was: " + result,expectValidationErrors,havingValidationErrors);
		assertEquals("Command not executed. tesult was: " + result,expectCommandExecution, Cli.commandExecuted);
		
		return result;
		
			
	}
	

	
}
