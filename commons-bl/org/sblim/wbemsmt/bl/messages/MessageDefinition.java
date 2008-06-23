 /** 
  * MessageDefinition.java
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
  * Description: Class to define the static content of a Message
  * 
  */
package org.sblim.wbemsmt.bl.messages;


/**
 * Class to define the static content of a Message<br>
 * This is the {@link MessageNumber}, the severity type ({@link Message#SUCCESS},{@link Message#INFO},{@link Message#WARNING},{@link Message#ERROR})  and the key for the translation 
 * @see Message#SUCCESS
 * @see Message#INFO
 * @see Message#WARNING
 * @see Message#ERROR
 */
public class MessageDefinition {

	private MessageNumber number;
	private String type;
	private String key;
    private int requiredInput = Message.INPUT_NONE;
	
    /**
     * create a new Message definition
     * @param number the number
     * @param type the severity type
     * @param key the key for the translation
     */
	public MessageDefinition(MessageNumber number, String type, String key) {
		super();
		this.number = number;
		this.type = type;
		this.key = key;
	}
	
    /**
     * create a new Message definition
     * @param number the number
     * @param type the severity type
     * @param key the key for the translation
     * @param requiredInput set to {@link Message#INPUT_OK_CANCEL} or {@link Message#INPUT_YES_NO}
     * 
     */
    public MessageDefinition(MessageNumber number, String type, String key, int requiredInput) {
        super();
        this.number = number;
        this.type = type;
        this.key = key;
        this.requiredInput = requiredInput;
    }

    /**
     * @return the key for the translation
     */
    public String getKey() {
		return key;
    }
    
    /**
     * set the key 
     * @param key the key
     */
	public void setKey(String key) {
		this.key = key;
	}
    /**
     * @return the message number
     */
	public MessageNumber getNumber() {
		return number;
	}
    /**
     * @param number the message number
     */
	public void setNumber(MessageNumber number) {
		this.number = number;
	}
	
	/**
	 * @return the type ({@link Message#SUCCESS},{@link Message#INFO},{@link Message#WARNING},{@link Message#ERROR})
	 */
	public String getType() {
		return type;
	}
	
	/**
	 * set the tyoe
	 * @param type ({@link Message#SUCCESS},{@link Message#INFO},{@link Message#WARNING},{@link Message#ERROR})
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * get option if an user's input is required
	 * @return {@link Message#INPUT_NONE}, {@link Message#INPUT_OK_CANCEL} or {@link Message#INPUT_YES_NO}
	 */
    public int getRequiredInput() {
        return requiredInput;
    }

    /**
     * set the option to require an user's input
     * @param requiredInput {@link Message#INPUT_NONE}, {@link Message#INPUT_OK_CANCEL} or {@link Message#INPUT_YES_NO}
     */
    public void setRequiredInput(int requiredInput) {
        this.requiredInput = requiredInput;
    }

    /**
     * return the key to be resolved by a resource bundle
     * @return the {@link MessageNumber#getResourceBundleKey()} + '.' + {@link #getKey()}
     */
    public String getResourceBundleKey()
    {
        return number.getResourceBundleKey() + "." + key;
    }
	
	
	
	
}
