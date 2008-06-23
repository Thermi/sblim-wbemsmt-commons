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
  * Description: Removes the DataContainers from the refreshList if they are too old<br>
  * This is needed for the case that a client is having containers that are perdiodically updated and the client gets killed without logging off
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

/**
 * Removes the DataContainers from the refreshList if they are too old<br>
 * This is needed for the case that a client is having containers that are perdiodically updated and the client gets killed without logging off
 */
public class RemoveDataContainerThread extends Thread {

	
	private Logger logger = Logger.getLogger(RemoveDataContainerThread.class.getName());	
	
	private AbstractBaseCimAdapter adapter;
	private boolean stop;

	/**
	 * create a new thread
	 * @param adapter the adapter holding the list of dataContainers
	 */
	public RemoveDataContainerThread(AbstractBaseCimAdapter adapter) {
		this.adapter = adapter;
	}

	/**
	 * stops the thread
	 */
	public void cleanup() {
		stop = true;
	}
	
	/**
	 * executes the thread<br>
	 * evaluates the lastAccessTime of a DataContainer and the RefreshTimeout. If the sum of that two values is smaller than current time
	 * the datacontainer is removed
	 */
	public void run()
	{

		while(!stop)
		{
		    Object o = adapter.getRefreshMedium();
			synchronized (o) {
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
				Thread.sleep(5000L);
			} catch (InterruptedException e) {
				logger.log(Level.SEVERE,"Thread interupted",e);
			}
		}

		this.adapter = null;
	}

}
