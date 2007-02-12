 /** 
  * HelpManager.java
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
  * Description: Class to manage the hel function
  * 
  */
package org.sblim.wbemsmt.bl.help;

import java.util.logging.Logger;

/**
 * @author Bauschert
 *
 */
public class HelpManager 
{
	protected static Logger logger = Logger.getLogger(HelpManager.class.getName());
	
	/**
	 * index is the default topic
	 */

	public static String WBEMSMT_BUNDLE = "org.sblim.wbemsmt.help";
	
	public static final String DEFAULT_LANGUAGE = "en";
	public static final String DEFAULT_TOPIC = "index";
	public static final String DEFAULT_APPLICATION = ".commons";
	
	private String currentTopic = DEFAULT_TOPIC;
	private String application = ".common";
	private String defaultLanguage = DEFAULT_LANGUAGE;

	private int mode = -1;

	public static final int MODE_EDIT = 0;
	public static final int MODE_CREATE = 1;

	public String getCurrentTopic() {
		return currentTopic;
	}

	/**
	 * Return the application as suffix to be appended to the help bundle.
	 * 
	 * @return
	 */
	public String getApplication()
	{
		return application;
	}
	
	public void setCurrentTopic(String application, String currentTopic) {
		if (currentTopic.endsWith("Listener"))
		{
			currentTopic = currentTopic.substring(0, currentTopic.length() - "Listener".length());
		}
		if (!application.startsWith("."))
		{
			application = "." + application;
		}
		
		
		this.currentTopic = currentTopic;
		this.application = application.toLowerCase();

		logger.info("Current Help Topic: " + this.application + "/" + this.currentTopic);
	}

	public void resetTopic()
	{
		setCurrentTopic(DEFAULT_APPLICATION, DEFAULT_TOPIC);
	}
	
	public int getMode() {
		return mode;
	}

	public void setMode(int mode) {
		this.mode = mode;
	}

	public String getDefaultLanguage() {
		return defaultLanguage;
	}

	public void setDefaultLanguage(String defaultLanguage) {
		this.defaultLanguage = defaultLanguage;
	}
	
	
}
