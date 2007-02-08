/**
 *  TaskLauncherTreeNodeEventListener.java
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
 * Author:     Marius Kreis
 *
 * Contributors:
 *
 */

package org.sblim.wbemsmt.bl.tree;

import java.util.EventListener;
import java.util.Properties;

import org.sblim.wbemsmt.exception.WbemSmtException;

public interface TaskLauncherTreeNodeEventListener extends EventListener
{
    public String processEvent(TaskLauncherTreeNodeEvent event) throws WbemSmtException;
    
    public void setParameters(Properties parameters);
    
    public Properties getParameters();
    
    public boolean isCustomListener();
}
