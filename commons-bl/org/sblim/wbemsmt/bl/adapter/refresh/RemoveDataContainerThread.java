 /** 
  * RemoveDataContainerThread.java
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
  * Description: Removes the DataContainers from the refreshList if they are too old
  * 
  */
package org.sblim.wbemsmt.bl.adapter.refresh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.DataContainer;

public class RemoveDataContainerThread extends Thread {

	
	private Logger logger = Logger.getLogger(RemoveDataContainerThread.class.getName());	
	
	private AbstractBaseCimAdapter adapter;
	private boolean stop;

	public RemoveDataContainerThread(AbstractBaseCimAdapter adapter) {
		this.adapter = adapter;
	}

	public void cleanup() {
		stop = true;
	}
	
	public void run()
	{

		while(!stop)
		{
			synchronized (adapter.refreshMedium) {
				List toRemove = new ArrayList();
				long timeout = adapter.getDefaultRefreshTimeout();
				
				Iterator iterator = adapter.getAccessTimes().entrySet().iterator();
				while (iterator.hasNext())
				{
					Map.Entry entry = (Entry) iterator.next();
					long lastAccessed = ((Long) entry.getValue()).longValue();
					
					if (lastAccessed + timeout  < System.currentTimeMillis())
					{
						toRemove.add(entry.getKey());
					}
				}
				
				//Remove the Containers
				for (Iterator iter = toRemove.iterator(); iter.hasNext();) {
					DataContainer next = (DataContainer) iter.next();
					logger.info("Remove Container " + next + " from refresh List");
					adapter.getAccessTimes().remove(next);
					adapter.getRefreshItems().remove(next);
				}
			}
			
			try {
				Thread.sleep(5000l);
			} catch (InterruptedException e) {
				logger.log(Level.SEVERE,"Thread interupted",e);
			}
		}

		this.adapter = null;
	}

}
