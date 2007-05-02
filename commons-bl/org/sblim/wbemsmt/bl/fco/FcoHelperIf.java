package org.sblim.wbemsmt.bl.fco;

import java.util.Collection;
import java.util.List;
import java.util.Vector;

import org.sblim.wbem.cim.CIMObjectPath;
import org.sblim.wbem.client.CIMClient;
import org.sblim.wbemsmt.exception.ModelLoadException;
import org.sblim.wbemsmt.exception.ObjectCreationException;
import org.sblim.wbemsmt.exception.ObjectDeletionException;
import org.sblim.wbemsmt.exception.ObjectNotFoundException;
import org.sblim.wbemsmt.exception.ObjectSaveException;

public interface FcoHelperIf {

	public abstract void delete(Collection c, CIMClient cimClient)
			throws ObjectDeletionException;

	/**
	 * deletes the object
	 * @param fco the firstClassObject or a Collection with first class objects
	 * @param cimClient
	 * @throws ObjectDeletionException
	 */
	public abstract void delete(Object fco, CIMClient cimClient)
			throws ObjectDeletionException;

	/**
	 * deletes the object
	 * @param fco the firstClassObject or a Collection with first class objects
	 * @param cimClient
	 * @throws ObjectDeletionException
	 */
	public abstract void delete(Object fco, CIMClient cimClient,
			boolean testIfObjectRemovedAfterDeletion)
			throws ObjectDeletionException;

	/**
	 * Creates a new FCO with the given keyProperties and deletes it
	 * @param fcoClass
	 * @param keyProperties
	 * @param cimClient
	 */
	public abstract void delete(Class fcoClass, Vector keyProperties,
			CIMClient cimClient) throws ObjectDeletionException;

	/**
	 * Creates a new FCO with the given keyProperties and deletes it
	 * @param fcoClass
	 * @param keyProperties
	 * @param cimClient
	 */
	public abstract void delete(Class fcoClass, Vector keyProperties,
			CIMClient cimClient, boolean testIfObjectRemovedAfterDeletion)
			throws ObjectDeletionException;

	/**
	 * creates objects
	 * @param o the firstClassObject or a Collection with first class objects
	 * @param cimClient
	 * @return 
	 * @throws ObjectDeletionException
	 */

	public abstract Collection create(Collection c, CIMClient cimClient)
			throws ObjectCreationException;

	/**
	 * creates objects
	 * @param fco the firstClassObject or a Collection with first class objects
	 * @param cimClient
	 * @return 
	 * @throws ObjectCreationException
	 */

	public abstract Object create(Object fco, CIMClient cimClient)
			throws ObjectCreationException;

	/**
	 * creates objects
	 * @param fco the firstClassObject or a Collection with first class objects
	 * @param cimClient
	 * @return the created object or input-fco if no object was created
	 * @throws ObjectCreationException
	 */

	public abstract Object create(Object fco, CIMClient cimClient,
			boolean testIfObjectExists) throws ObjectCreationException;

	public abstract Object create(Class fcoClass, CIMClient cimClient,
			Vector keyProperties) throws ObjectCreationException;

	public abstract Object create(Class fcoClass, CIMClient cimClient,
			Vector keyProperties, boolean b) throws ObjectCreationException;

	/**
	 * saves objects
	 * @param o the firstClassObject or a Collection with first class objects
	 * @param cimClient
	 * @throws ObjectDeletionException
	 */

	public abstract void save(Collection c, CIMClient cimClient)
			throws ObjectSaveException;

	/**
	 * saves objects, if it was modified
	 * @param o the firstClassObject or a Collection with first class objects
	 * @param cimClient
	 * @throws ObjectSaveException
	 * @return the modified instance - or the not modified instance if an event listener stopped the processing
	 */

	public abstract Object save(Object o, CIMClient cimClient)
			throws ObjectSaveException;

	/**
	 * Reloads a fco from the servr
	 * @param fcoToReload
	 * @param cc
	 * @return
	 * @throws ModelLoadException 
	 */
	public abstract Object reload(Object fcoToReload,
			CIMClient cimClient) throws ModelLoadException;

	/**
	 * Reloads a fco from the servr
	 * @param fcoToReload
	 * @param cc
	 * @return
	 * @throws ModelLoadException 
	 */
	public abstract Object reload(Class helperClass, CIMObjectPath path,
			CIMClient cimClient) throws ModelLoadException;

	/**
	 * gets an instance
	 * @param fcoToReload
	 * @param cc
	 * @return
	 * @throws ModelLoadException 
	 */
	public abstract Object getInstance(Class helperClass, Vector keys,
			CIMClient cimClient) throws ModelLoadException;

	public abstract CIMObjectPath getPath(Class fcoClass, String keyFieldName,
			Object keyFieldValue, CIMClient cimClient)
			throws ObjectNotFoundException;

	public abstract CIMObjectPath getPath(Class fcoClass,
			String[] keyFieldNames, Object[] keyFieldValues, CIMClient cimClient)
			throws ObjectNotFoundException;

	public abstract CIMObjectPath getPath(List objectPathList,
			String keyFieldName, String keyFieldValue)
			throws ObjectNotFoundException;

	public abstract CIMObjectPath getPath(List objectPathList,
			String[] keyFieldNames, Object[] keyFieldValues)
			throws ObjectNotFoundException;

	public abstract void addFcoHelperListener(Class fcoClass,
			FcoHelperListener listener);

	public abstract void removeFcoHelperListener(Class fcoClass,
			FcoHelperListener listener);
	
	public abstract CIM_ObjectCreatorIf getCIM_ObjectCreator();

}