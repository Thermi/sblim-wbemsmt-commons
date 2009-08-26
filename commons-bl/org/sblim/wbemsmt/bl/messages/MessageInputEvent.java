 /** 
  * MessageInputEvent.java
  *
  * © Copyright IBM Corp.  2009,2008
  *
  * THIS FILE IS PROVIDED UNDER THE TERMS OF THE ECLIPSE PUBLIC LICENSE
  * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
  * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
  *
  * You can obtain a current copy of the Eclipse Public License from
  * http://www.opensource.org/licenses/eclipse-1.0.php
  *
  * @author: Michael Bauschert <Michael.Bauschert@de.ibm.com>
  *
  * Contributors: 
  * 
  * Description: Event for input within a message
  * 
  */
package org.sblim.wbemsmt.bl.messages;

/**
 *  Event for user input within a message
 */
public class MessageInputEvent {

    /**
     * value indicating that the user presssed yes
     */
    public static final int YES = 1;
    /**
     * value indicating that the user presssed no
     */
    public static final int NO = 2;
    /**
     * value indicating that the user presssed ok
     */
    public static final int OK = 1;
    /**
     * value indicating that the user presssed cancel
     */
    public static final int CANCEL = 2;
    
    /**
     * the action which was triggered
     */
    private final int action;
    
    /**
     * reload the tree as a result of the action
     */
    private boolean reloadTree;
    
    /**
     * creates a new event for user input within a message
     * @param action {@link #YES},{@link #NO},{@link #OK},{@link #CANCEL}
     */
    public MessageInputEvent(int action) {
        this.action = action;
    }

    /**
     * get the action of choosen by the user
     * @return {@link #YES},{@link #NO},{@link #OK} or{@link #CANCEL}. CANCEL,NO  and YES,OK having the same value so it's enough for the eventhandler to check for YES and NO for example.
     */
    public int getAction() {
        return action;
    }

    /**
     * return true if tree should be reloaded
     * @return true if the tree should be reloaded as response of the users action
     */
    public boolean isReloadTree() {
        return reloadTree;
    }

    /**
     * mark the tree to be reloaded
     * @param reloadTree set to true if the tree should be reloaded as response of the users action
     */
    public void setReloadTree(boolean reloadTree) {
        this.reloadTree = reloadTree;
    }
    
    
    
    

}
