 /** 
  * SwingWizardAdapterBase.java
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
  * @author:	Bert Lange <LangeB@de.ibm.com>
  *
  * Contributors:
  *
  *
  * Description: Abstract class implementation for common 'Swing' related 
  * 				parts for derived 'SwingWizardAdapter' classes (for all Swing configuration tasks).
  * 
  */
package org.sblim.wbemsmt.tools.wizard.adapter;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.sblim.wbemsmt.tools.wizard.container.IWizardContainer;

public abstract class SwingWizardAdapterBase extends JDialog implements ActionListener {

	private IPageWizardAdapter adapter = null;	
	private javax.swing.JPanel jContentPane = null;
	protected IWizardContainer container = null;
	protected JPanel contentPanel = null;
	protected JPanel navigationPanel = null;
	public JButton cancelButton = null;
	public JButton nextButton = null;
	public JButton backButton = null;
	public JButton finishButton = null;
		
	public SwingWizardAdapterBase(JFrame owner) {
		super(owner);
	}
	
	protected void initialize(Dimension dimension, String title) {
		this.setName("JPanelWizard");
		if (dimension != null) this.setSize(dimension);
		else this.setSize(500,300);
		this.setContentPane(getJContentPane());
		this.setTitle(title);
		rootPane.setDefaultButton(getNextButton());
	}

	public void initWizard(IWizardContainer container, IPageWizardAdapter adapter) throws Exception {
		this.container = container;
		this.adapter = adapter;
		container.setWizardRunType("JSWING");
		container.initWizardContainer();
		String nextPanelName = container.getNextWizardPageName();
		if (container.getPages().get(nextPanelName) == null || nextPanelName.equals("")) {
			//System.out.println("found no panel to display");
			this.backButton.setEnabled(false);
			this.nextButton.setEnabled(false);
			this.finishButton.setEnabled(false);
			throw new Exception("found no panel to display");
		}

		JPanel nextPanel = (JPanel)container.getPages().get(nextPanelName); 

		this.contentPanel.add(nextPanel, nextPanel.getClass().getName());
		//System.out.println("added first panel to contentPanel");
		container.updateButtonStates(container.isLast(nextPanelName), container.isFirst(nextPanelName));
		
		switchButtons();
	 	container.getUsedPages().push(nextPanelName);
	 	container.setCurrentPageName(nextPanelName);
	 	this.setPanelVisible(nextPanel.getClass().getName());
	}

	public void actionPerformed(ActionEvent event) {
		String actualPanelName = null;
		JPanel nextPanel = null;
		JPanel oldPanel = null;
		String oldPanelName = null;
		boolean isLast = false;
		boolean isFirst = false;
		
		if(event.getSource() == this.nextButton)
        {
            actualPanelName = (String) container.getUsedPages().peek();
            if (!adapter.savePageValues(actualPanelName)) return;
            		
    		String nextPanelName = container.getNextWizardPageName();
            if (nextPanelName == null) {
            	System.out.println("Missing following panel name.");
            	return;
            }
            
            if (container.isLast(nextPanelName)) isLast = true;
            if (isLast) {
            	adapter.setSummaryText(nextPanelName);
            }

            nextPanel = (JPanel)container.getPages().get(nextPanelName); 
            contentPanel.add(nextPanel, nextPanel.getClass().getName());
            //System.out.println("setting new panel name: "+nextPanel.getClass().getName());
            container.getUsedPages().push(nextPanelName);
            container.setCurrentPageName(nextPanelName);
            this.setPanelVisible(nextPanel.getClass().getName());
        }
        else if(event.getSource() == this.backButton )
        {
        	// remove now invalid values for further branch decisions (from actual panel)
    		// cleanUP could be necessary for data object and/or for swing page object
          	adapter.cleanUPPage(container.getCurrentPageName());
          	actualPanelName = (String) container.getUsedPages().pop();
          	contentPanel.remove((JPanel)container.getPages().get(actualPanelName)); // remove the current panel 
        										//from stack and from 'contentPanel'
        	oldPanelName = (String) container.getUsedPages().peek();
          	oldPanel = (JPanel) container.getPages().get(oldPanelName); // use the previous one
        	//System.out.println("setting old panel name: "+oldPanel.getClass().getName());
        	// remove now invalid values for further branch decisions (also from previous data object value)
        	container.cleanUP(oldPanelName);

        	if (container.isFirst(oldPanelName)) isFirst = true;
        	container.setCurrentPageName(oldPanelName);
        	this.setPanelVisible(oldPanel.getClass().getName());
        }
		else if(event.getSource() == this.finishButton) 
		{
			actualPanelName = (String) container.getUsedPages().peek();
			if (!adapter.savePageValues(actualPanelName)) return;

			adapter.wizardComplete();
			return;			
		}
        else if(event.getSource() == this.cancelButton)
        {
            this.setVisible(false);
            this.dispose();
        }

        this.container.updateButtonStates(isLast, isFirst);
        switchButtons();
	}
	
	
	public void switchButtons() {
		if (container.isBackButtonFlag()) this.backButton.setEnabled(true);
		else this.backButton.setEnabled(false);
		if (container.isNextButtonFlag()) this.nextButton.setEnabled(true);
		else this.nextButton.setEnabled(false);
		if (container.isFinishButtonFlag()) this.finishButton.setEnabled(true);
		else this.finishButton.setEnabled(false);
		if (container.isCancelButtonFlag()) this.cancelButton.setEnabled((true));
		else this.cancelButton.setEnabled(false);
	}
	
	
	public void startWizard(Point point, boolean modal) { 		
		if (point != null) this.setLocation(point);
		this.setModal(modal);
		//System.out.println("starting wizard");
 		this.setVisible(true); 	
	}

	protected void setPanelVisible(String panelName) {
		
		CardLayout cLayout = (CardLayout)this.contentPanel.getLayout();
		cLayout.show(this.contentPanel, panelName);
        this.contentPanel.repaint();
	}
	
	
	private javax.swing.JPanel getJContentPane() {
		if(jContentPane == null) {
			jContentPane = new javax.swing.JPanel();
			jContentPane.setLayout(new java.awt.BorderLayout());
			jContentPane.add(getContentPanel(), java.awt.BorderLayout.NORTH);
			jContentPane.add(getNavigationPanel(), java.awt.BorderLayout.SOUTH);
		}
		return jContentPane;
	}

	/**
	 * @param contentPane The jContentPane to set.
	 */
	public void setJContentPane(javax.swing.JPanel contentPane) {
		jContentPane = contentPane;
	}
	
	/**
	 * This method initializes jPanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */    
	private JPanel getContentPanel() {
		if (contentPanel == null) {
			contentPanel = new JPanel();
			contentPanel.setLayout(new CardLayout());
			contentPanel.setName("contentPanel");	
		}
		return contentPanel;
	}

	/**
	 * @param contentPanel The contentPanel to set.
	 */
	public void setContentPanel(JPanel contentPanel) {
		this.contentPanel = contentPanel;
	}
	
	/**
	 * This method initializes jPanel1	
	 * 	
	 * @return javax.swing.JPanel	
	 */    
	private JPanel getNavigationPanel() {
		if (navigationPanel == null) {
			FlowLayout flowLayout1 = new FlowLayout();
			navigationPanel = new JPanel();
			navigationPanel.setLayout(flowLayout1);
			flowLayout1.setAlignment(java.awt.FlowLayout.RIGHT);
			flowLayout1.setHgap(5);
			navigationPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.LOWERED));
			navigationPanel.setName("navigationPanel");
			navigationPanel.add(getBackButton(), null);
			navigationPanel.add(getNextButton(), null);
			navigationPanel.add(getFinishButton(), null);
			navigationPanel.add(getCancelButton(), null);
		}
		return navigationPanel;
	}
	
	/**
	 * This method initializes cancelButton	
	 * 	
	 * @return javax.swing.JButton	
	 */    
	private JButton getCancelButton() {
		if (cancelButton == null) {
			cancelButton = new JButton();
			cancelButton.setText("Cancel");
			cancelButton.setName("cancelButton");
			cancelButton.addActionListener(this);
		}
		return cancelButton;
	}
	
	/**
	 * This method initializes nextButton	
	 * 	
	 * @return javax.swing.JButton	
	 */    
	public JButton getNextButton() {
		if (nextButton == null) {
			nextButton = new JButton();
			nextButton.setText("Next >");
			nextButton.setName("nextButton");
			nextButton.addActionListener(this);
		}
		return nextButton;
	}
	
	/**
	 * This method initializes backButton	
	 * 	
	 * @return javax.swing.JButton	
	 */    
	private JButton getBackButton() {
		if (backButton == null) {
			backButton = new JButton();
			backButton.setName("backButton");
			backButton.setText("< Back");
			backButton.addActionListener(this);
		}
		return backButton;
	}
	
	/**
	 * This method initializes backButton	
	 * 	
	 * @return javax.swing.JButton	
	 */    
	private JButton getFinishButton() {
		if (finishButton == null) {
			finishButton = new JButton();
			finishButton.setName("finishButton");
			finishButton.setText(">> Finish");
			finishButton.addActionListener(this);
		}
		return finishButton;
	}
	
}
