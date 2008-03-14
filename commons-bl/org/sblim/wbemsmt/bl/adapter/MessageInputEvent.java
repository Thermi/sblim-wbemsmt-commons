 /** 
  * MessageInputEvent.java
  *
  * © Copyright IBM Corp. 2008
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
  * Description: Event for input within a message
  * 
  */
package org.sblim.wbemsmt.bl.adapter;

public class MessageInputEvent {

    /**
     * value indicating that the user presssed yes
     */
    public static int YES = 1;
    /**
     * value indicating that the user presssed no
     */
    public static int NO = 2;
    /**
     * value indicating that the user presssed ok
     */
    public static int OK = 1;
    /**
     * value indicating that the user presssed cancel
     */
    public static int CANCEL = 2;
    
    /**
     * the action which was triggered
     */
    private final int action;
    
    /**
     * reload the tree as a result of the action
     */
    private boolean reloadTree;
    
    public MessageInputEvent(int action) {
        this.action = action;
    }

    public int getAction() {
        return action;
    }

    /**
     * return true if tree will be reloaded
     * @return
     */
    public boolean isReloadTree() {
        return reloadTree;
    }

    /**
     * mark the tree to be reloaded
     * @param reloadTree
     */
    public void setReloadTree(boolean reloadTree) {
        this.reloadTree = reloadTree;
    }
    
    
    
    

}
