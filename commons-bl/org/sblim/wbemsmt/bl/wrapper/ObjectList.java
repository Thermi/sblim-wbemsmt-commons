 /** 
  * SambaObjectList.java
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
  * Description: Base class for objects representing a list of business objects
  * 
  */
package org.sblim.wbemsmt.bl.wrapper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.sblim.wbemsmt.util.StringComparator;

public abstract class ObjectList {

	/**
	 * stores the users by CimObjectKey
	 */
	protected Map objectsByCimObjectKey = new HashMap();
	/**
	 * stores the users by SambaUsername
	 */
	private Map objectsByName = new HashMap();
	/**
	 * lazy loaded Array with all user names
	 */
	protected String[] nameArray;
	/**
	 * lazy loaded list with user objects
	 */
	private List list = new ArrayList();
	/**
	 * lazy loaded list with user fcos
	 */
	private List fcos = new ArrayList();
	/**
	 * The loaded Flag prevents that after every add of an object the
	 * lists are update. At the the first time the lists are accessed they are loaded
	 */
	protected boolean loaded = false;
	
	/**
	 * Set to true if reload from server is wanted (Flag can be queried by comsuming classes)
	 */
	protected boolean reloadFromServer = false;

	/**
	 * create the new ObjectList
	 */
	public ObjectList() {
		super();
	}

	/**
	 * Return the size of the list
	 * @return
	 */
	public int size() {
		return getList().size();
	}

	public boolean getHasItems() {
		return size() > 0;
	}

	/**
	 * clear the list
	 *
	 */
	public void clear() {
		objectsByCimObjectKey.clear();
	}

	/**
	 * returns a interator of the list
	 * @return
	 */
	public Iterator iterator() {
		return objectsByCimObjectKey.values().iterator();
	}

	/**
	 * Return a list with names to display for each item
	 * @return
	 */
	public String[] getNameArray() {
		if (!loaded) reloadListValues();
		return nameArray;
	}

	/**
	 * return the List of the FCOs of the items in the list 
	 * @return
	 */
	public List getFCOs() {
		if (!loaded) reloadListValues();
		return fcos;
	}

	/**
	 * Get List with objects
	 * @return
	 */
	public List getList() {
		if (!loaded) reloadListValues();
		return list;
	}

	/**
	 * Get the Objects byName
	 * @return
	 */
	protected Map getObjectsByName() {
		if (!loaded) reloadListValues();
		return objectsByName;
	}

	/**
	 * reload the list values
	 *
	 */
	public void reloadListValues() {
		
		List names = new ArrayList();
		objectsByName.clear();
		for (Iterator iter = objectsByCimObjectKey.values().iterator(); iter.hasNext();) {
			Object o = iter.next();
			String key = getKey(o);
			names.add(key);
			objectsByName.put(key,o);
		}
		Collections.sort(names,new StringComparator());
		nameArray = (String[]) names.toArray(new String[names.size()]);
		
		list.clear();
		fcos.clear();
		
		for (int i = 0; i < nameArray.length; i++) {
			String name = nameArray[i];
			Object o = objectsByName.get(name);
			list.add(o);
			fcos.add(getFco(o));
		}
		
		loaded = true;
		
	}
	
	/**
	 * Must return the value which used for adding the object to the internal HashMaps
	 * This key is also element of the nameArray
	 * 
	 * for example the sambaUsername of a SambaUser
	 * 
	 * @param value
	 * @return
	 */
	protected abstract String getKey(Object value);
	
	/**
	 * Must return the fco belonging to this object
	 * 
	 * for example org.sblim.wbemsmt.samba.bl.wrapper.User.getUser()
	 * 
	 * @param value
	 * @return
	 */
	protected abstract Object getFco(Object value);

	/**
	 * returns true if reload from server was requested
	 * @return
	 */
	public boolean isReloadFromServer() {
		return reloadFromServer;
	}

	/**
	 * Set to true if reload from server is wanted (Flag can be queried by comsuming classes)
	 * @param reloadFromServer
	 */
	public void setReloadFromServer(boolean reloadFromServer) {
		this.reloadFromServer = reloadFromServer;
	}
	
	
}
