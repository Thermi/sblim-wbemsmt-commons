 /** 
  * CimAdpaterDelegator.java
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
  * Description: Interface for accessing the delegators
  * 
  */
package org.sblim.wbemsmt.bl.adapter;

public interface CimAdapterDelegator
{
	/**
	 * @return the delegatee for create actions
	 */
	public CreateDelegatee getCreateDelegatee();
	/**
	 * @return the delegatee for save actions
	 */
	public SaveDelegatee getSaveDelegatee();
	/**
	 * @return the delegatee for revert actions
	 */
	public RevertDelegatee getRevertDelegatee();
	/**
	 * @return the delegatee for delete actions
	 */
	public DeleteDelegatee getDeleteDelegatee();
	/**
	 * @return the delegatee for update controls actions
	 */
	public UpdateControlsDelegatee getUpdateControlsDelegatee();
	/**
	 * @return the delegatee for initializing the containers
	 */
	public InitContainerDelegatee getInitContainerDelegatee();
	/**
	 * @return the delegatee for initWizard actions
	 */
	public InitWizardDelegatee getInitWizardDelegatee();
	/**
	 * @return the delegatee for update model actions
	 */
	public UpdateModelDelegatee getUpdateModelDelegatee();
	/**
	 * @return the delegatee for count actions
	 */
	public CountDelegatee getCountDelegatee();
	/**
	 * @return the delegatee for installing validators
	 */
	public InstallValidatorsDelegatee getInstallValidatorsDelegatee();
}
