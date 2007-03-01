 /** 
  * WbemSmtTestSuite.java
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
  * Description: TestSuiteBaseclass for wbemsmt tests
  * 
  */

package org.sblim.wbemsmt.test;

import java.util.logging.Logger;

import junit.framework.Test;
import junit.framework.TestResult;
import junit.framework.TestSuite;

/**
 * @author Bauschert
 *
 */
public class WbemSmtTestSuite extends TestSuite {

	private static Logger logger = Logger.getLogger("org.sblim.wbemsmt.test");

	boolean stopAtSessionFailed = false;
	boolean stopAtTestFailed = false;
	
	/**
	 * 
	 */
	public WbemSmtTestSuite() {
		super();
		initSuite();
	}

	private void initSuite() {
		WbemSmtTestSession.getInstance().setLastTestOK();
		WbemSmtTestSession.getInstance().setLastTestSessionOK();
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public WbemSmtTestSuite(Class arg0, String arg1) {
		super(arg0, arg1);
		initSuite();
	}

	/**
	 * @param arg0
	 */
	public WbemSmtTestSuite(Class arg0) {
		super(arg0);
		initSuite();
	}

	/**
	 * @param arg0
	 */
	public WbemSmtTestSuite(String arg0) {
		super(arg0);
		initSuite();
	}

	/**
	 * @param arg0
	 */
	public WbemSmtTestSuite(String arg0,boolean stopAtError) {
		super(arg0);
		this.stopAtSessionFailed = stopAtError;
		initSuite();
		
	}
	public void run(TestResult arg0) {
		super.run(arg0);
	}

	public void runTest(Test arg0, TestResult arg1) {
		
		boolean executeTest = true;
		
		if (stopAtSessionFailed && !WbemSmtTestSession.getInstance().lastTestSessionOK())
		{
			executeTest = false;
		}
		if (stopAtTestFailed && !WbemSmtTestSession.getInstance().lastTestOK())
		{
			executeTest = false;
		}
		
		if (executeTest)
		{
			WbemSmtTestSession.getInstance().setLastTestOK();
			super.runTest(arg0, arg1);
		}
		else
		{
			logger.warning("Not executing test " + arg0.getClass().getName() + " because previous test failed.");
		}
		
		if (testAt(testCount()-1) == arg0)
		{
			initSuite();
		}
		
	}

	
	public boolean isStopAtSessionFailed() {
		return stopAtSessionFailed;
	}

	public void setStopAtSessionFailed(boolean stopAtError) {
		this.stopAtSessionFailed = stopAtError;
	}

	public boolean isStopAtTestFailed() {
		return stopAtTestFailed;
	}

	public void setStopAtTestFailed(boolean stopAtTestFailed) {
		this.stopAtTestFailed = stopAtTestFailed;
	}

	
	
	
	
	

}
