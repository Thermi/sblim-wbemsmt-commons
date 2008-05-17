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

import org.sblim.wbemsmt.exception.WbemsmtException;

public interface TaskLauncherTreeNodeEventListener extends EventListener
{
	public static final Priority PRIO_LOWEST = new Priority("LOWEST",0);
	public static final Priority PRIO_LOW = new Priority("LOW",25);
	public static final Priority PRIO_MEDIUM = new Priority("MEDIUM",50);
	public static final Priority PRIO_HIGH = new Priority("HIGH",75);
	public static final Priority PRIO_HIGHEST = new Priority("HIGHEST",100);
	
    public String processEvent(TaskLauncherTreeNodeEvent event) throws WbemsmtException;
    
    public void setParameters(Properties parameters);
    
    public Properties getParameters();
    
    public boolean isCustomListener();
    
    public Priority getPriority();
    
    public static class Priority
    {
    	public final int value;
		public final String description;
		private String asString;

		public Priority(String description, int value) {
			this.description = description;
			this.value = value;
		}
		
		public String toString()
		{
			if (asString == null)
			{
				StringBuffer sb = new StringBuffer(description);
				sb.append(" (").append(value).append(")");
				
				asString = sb.toString();
			}
			return asString;
		}
    }
}
