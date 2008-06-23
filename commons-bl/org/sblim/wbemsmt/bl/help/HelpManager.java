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
  * Description: Class to manage the help function
  * 
  */
package org.sblim.wbemsmt.bl.help;

import java.util.logging.Logger;

/**
 * Class to manage the help function
 */
public class HelpManager 
{
    /**
     * the logger
     */
	protected static Logger logger = Logger.getLogger(HelpManager.class.getName());
	
	/**
	 * bundle for the wbemsmt help
	 */
	public static final String WBEMSMT_BUNDLE = "org.sblim.wbemsmt.help";
	
    /**
     * en is the default language
     */
	public static final String DEFAULT_LANGUAGE = "en";
    /**
     * index is the default topic
     */
	public static final String DEFAULT_TOPIC = "index";
    /**
     * .commons is the default application
     */
	public static final String DEFAULT_APPLICATION = ".commons";
	
	/**
	 * the current topic.
	 * @see #DEFAULT_TOPIC
	 */
	private String currentTopic = DEFAULT_TOPIC;
	/**
	 * bundle for the application itself
	 */
	private String application = ".common";
    /**
     * the default language.
     * @see #DEFAULT_LANGUAGE
     */
	private String defaultLanguage = DEFAULT_LANGUAGE;

	/**
	 * the current mode
	 * @see #MODE_EDIT
	 * @see #MODE_CREATE
	 */
	private int mode = -1;

	/**
	 * mode during the user edits objects
	 */
	public static final int MODE_EDIT = 0;
    /**
     * mode during the user executes a wizard
     */
	public static final int MODE_CREATE = 1;

	/**
	 * get the current topic
	 * @return the current topic
	 */
	public String getCurrentTopic() {
		return currentTopic;
	}

	/**
	 * Return the application as suffix to be appended to the help bundle.
	 * @return the application suffix
	 */
	public String getApplication()
	{
		return application;
	}
	
	/**
	 * set the current topic<br>
	 * set by the EventListeners inside the processEvent methods:<br>
	 * <xmp>
	 * helpManager.setCurrentTopic("DEMO", "DummyWizardActionListener");
	 * </xmp>
	 * @param application the application
	 * @param currentTopic the topic
	 */
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

	/**
	 * set back to use the default app and default topic<br>
	 * Called before the tree is loaded/reloaded. 
	 * @see #DEFAULT_APPLICATION
	 * @see #DEFAULT_TOPIC
	 */
	public void resetTopic()
	{
		setCurrentTopic(DEFAULT_APPLICATION, DEFAULT_TOPIC);
	}
	
	/**
	 * get the current mode
	 * @return the mode
	 * @see #mode
	 */
	public int getMode() {
		return mode;
	}

	/**
	 * set the current mode
	 * @param mode the mode
     * @see #mode
	 */
	public void setMode(int mode) {
		this.mode = mode;
	}

	/**
	 * get the default language
	 * @return the default language
	 * @see #defaultLanguage
	 */
	public String getDefaultLanguage() {
		return defaultLanguage;
	}
	
	/**
	 * set the default language
	 * @param defaultLanguage the defult language
	 * @see #defaultLanguage
	 */
	public void setDefaultLanguage(String defaultLanguage) {
		this.defaultLanguage = defaultLanguage;
	}
	
	
}
 