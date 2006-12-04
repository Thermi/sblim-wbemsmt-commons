/**
 *  TaskLauncherTreeNodeEventListenerImpl.java
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
 * Author:     Marius Kreis
 *
 * Contributors:
 *
 */

package org.sblim.wbemsmt.bl.tree;

import java.util.Properties;
import java.util.logging.Logger;

import org.sblim.wbemsmt.exception.WbemSmtException;


public abstract class TaskLauncherTreeNodeEventListenerImpl implements TaskLauncherTreeNodeEventListener
{
    protected Properties parameters;

    protected Logger logger = Logger.getLogger(TaskLauncherTreeNodeEventListenerImpl.class.getName());
    
    public TaskLauncherTreeNodeEventListenerImpl()
    {
        this.parameters = new Properties();
    }

    public String processEvent(TaskLauncherTreeNodeEvent event) throws WbemSmtException
    {
    	return "";
    }

    public void setParameters(Properties parameters)
    {
        this.parameters = parameters;
    }
    
    public Properties getParameters()
    {
        return this.parameters;
    }
    
    public boolean processesEvent(int eventType)
    {
    	return true;
    }
    
    public void checkParameter(String parameterName)
    {
    	if (!parameters.containsKey(parameterName))
    	{
    		throw new RuntimeException("Parameter " + parameterName + " was not defined for class " + getClass().getName());
    	}
    }
}
