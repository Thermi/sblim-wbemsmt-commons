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
  * Description: Class to define a Message
  * 
  */
package org.sblim.wbemsmt.bl.adapter;

import org.sblim.wbemsmt.bl.MessageNumber;

/**
 * @author Bauschert
 *
 */
public class MessageDefinition {

	private MessageNumber number;
	private String type;
	private String key;
    private int requiredInput = Message.INPUT_NONE;
	
	public MessageDefinition(MessageNumber number, String type, String key) {
		super();
		this.number = number;
		this.type = type;
		this.key = key;
	}
	
    public MessageDefinition(MessageNumber number, String type, String key, int requiredInput) {
        super();
        this.number = number;
        this.type = type;
        this.key = key;
        this.requiredInput = requiredInput;
    }

    public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public MessageNumber getNumber() {
		return number;
	}
	public void setNumber(MessageNumber number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

    public int getRequiredInput() {
        return requiredInput;
    }

    public void setRequiredInput(int requiredInput) {
        this.requiredInput = requiredInput;
    }
	
	
	
	
	
}
