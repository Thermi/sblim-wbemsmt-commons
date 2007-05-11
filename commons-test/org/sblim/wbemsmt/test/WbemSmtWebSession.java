 /** 
  * Selenium.java
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
  * @author: Michael Bauschert <Michael.Bauschert@de.ibm.com>
  *
  * Contributors: 
  * 
  * Description: Wbemsmt Version of Selenium Interface
  * 
  */
package org.sblim.wbemsmt.test;

import org.sblim.wbemsmt.test.jsf.FieldLocator;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

import com.thoughtworks.selenium.Selenium;

public class WbemSmtWebSession implements Selenium {

	private Selenium selenium;
	private String defaultWaitInterval = "90000";
	private long demoWaitInterval = 0;
	
	public WbemSmtWebSession(Selenium selenium) {
		super();
		this.selenium = selenium;
	}

	public void addSelection(String arg0, String arg1) {
		selenium.addSelection(arg0, arg1);
	}

	public void answerOnNextPrompt(String arg0) {
		selenium.answerOnNextPrompt(arg0);
	}

	public void check(String arg0) {
		selenium.check(arg0);
	}

	public void chooseCancelOnNextConfirmation() {
		selenium.chooseCancelOnNextConfirmation();
	}

	public void click(String arg0) {
		slowDown();
		selenium.click(arg0);
		selenium.waitForPageToLoad(defaultWaitInterval);
	}

	public void click(String arg0, String wait) {
		slowDown();
		selenium.click(arg0);
		if (wait != null)
		{
			selenium.waitForPageToLoad(wait);
		}
	}

	public void clickText(String linkText, String waitInterval) {
		slowDown();
		selenium.click("link=" + linkText);
		selenium.waitForPageToLoad(waitInterval);
	}

	public void clickText(String linkText) {
		clickText(linkText,defaultWaitInterval);
	}

	public void close() {
		selenium.close();
	}

	public boolean equals(Object obj) {
		return selenium.equals(obj);
	}

	public void fireEvent(String arg0, String arg1) {
		slowDown();
		selenium.fireEvent(arg0, arg1);
	}

	public String getAlert() {
		return selenium.getAlert();
	}

	public String[] getAllButtons() {
		return selenium.getAllButtons();
	}

	public String[] getAllFields() {
		return selenium.getAllFields();
	}

	public String[] getAllLinks() {
		return selenium.getAllLinks();
	}

	public String getAttribute(String arg0) {
		return selenium.getAttribute(arg0);
	}

	public String getBodyText() {
		return selenium.getBodyText();
	}

	public String getConfirmation() {
		return selenium.getConfirmation();
	}

	public Number getCursorPosition(String arg0) {
		return selenium.getCursorPosition(arg0);
	}

	public String getEval(String arg0) {
		return selenium.getEval(arg0);
	}

	public String getExpression(String arg0) {
		return selenium.getExpression(arg0);
	}

	public String getHtmlSource() {
		return selenium.getHtmlSource();
	}

	public String getLocation() {
		return selenium.getLocation();
	}

	public String getPrompt() {
		return selenium.getPrompt();
	}

	public String getSelectedId(String arg0) {
		return selenium.getSelectedId(arg0);
	}

	public String[] getSelectedIds(String arg0) {
		return selenium.getSelectedIds(arg0);
	}

	public String getSelectedIndex(String arg0) {
		return selenium.getSelectedIndex(arg0);
	}

	public String[] getSelectedIndexes(String arg0) {
		return selenium.getSelectedIndexes(arg0);
	}

	public String getSelectedLabel(String arg0) {
		return selenium.getSelectedLabel(arg0);
	}

	public String[] getSelectedLabels(String arg0) {
		return selenium.getSelectedLabels(arg0);
	}

	public String getSelectedValue(String arg0) {
		return selenium.getSelectedValue(arg0);
	}

	public String[] getSelectedValues(String arg0) {
		return selenium.getSelectedValues(arg0);
	}

	public String[] getSelectOptions(String arg0) {
		return selenium.getSelectOptions(arg0);
	}

	public String getTable(String arg0) {
		return selenium.getTable(arg0);
	}

	public String getText(String arg0) {
		return selenium.getText(arg0);
	}

	public String getTitle() {
		return selenium.getTitle();
	}

	public String getValue(String arg0) {
		return selenium.getValue(arg0);
	}

	public void goBack() {
		slowDown();
		selenium.goBack();
	}

	public int hashCode() {
		return selenium.hashCode();
	}

	public boolean isAlertPresent() {
		return selenium.isAlertPresent();
	}

	public boolean isChecked(String arg0) {
		return selenium.isChecked(arg0);
	}

	public boolean isConfirmationPresent() {
		return selenium.isConfirmationPresent();
	}

	public boolean isEditable(String arg0) {
		return selenium.isEditable(arg0);
	}

	public boolean isElementPresent(String arg0) {
		return selenium.isElementPresent(arg0);
	}

	public boolean isPromptPresent() {
		return selenium.isPromptPresent();
	}

	public boolean isSomethingSelected(String arg0) {
		return selenium.isSomethingSelected(arg0);
	}

	public boolean isTextPresent(String arg0) {
		return selenium.isTextPresent(arg0);
	}

	public boolean isVisible(String arg0) {
		return selenium.isVisible(arg0);
	}

	public void keyDown(String arg0, String arg1) {
		selenium.keyDown(arg0, arg1);
	}

	public void keyPress(String arg0, String arg1) {
		selenium.keyPress(arg0, arg1);
	}

	public void keyUp(String arg0, String arg1) {
		selenium.keyUp(arg0, arg1);
	}

	public void mouseDown(String arg0) {
		selenium.mouseDown(arg0);
	}

	public void mouseOver(String arg0) {
		selenium.mouseOver(arg0);
	}

	public void open(String arg0) {
		selenium.open(arg0);
	}

	public void refresh() {
		selenium.refresh();
	}

	public void removeSelection(String arg0, String arg1) {
		selenium.removeSelection(arg0, arg1);
	}

	public void select(String arg0, String arg1) {
		selenium.select(arg0, arg1);
	}

	public void selectWindow(String arg0) {
		selenium.selectWindow(arg0);
	}

	public void setContext(String arg0, String arg1) {
		selenium.setContext(arg0, arg1);
	}

	public void setCursorPosition(String arg0, String arg1) {
		selenium.setCursorPosition(arg0, arg1);
	}

	public void setTimeout(String arg0) {
		selenium.setTimeout(arg0);
	}

	public void start() {
		selenium.start();
	}

	public void stop() {
		selenium.stop();
	}

	public void submit(String arg0) {
		slowDown();
		selenium.submit(arg0);
	}

	public String toString() {
		return selenium.toString();
	}

	public void type(String arg0, String arg1) {
		selenium.type(arg0, arg1);
	}

	public void uncheck(String arg0) {
		selenium.uncheck(arg0);
	}

	public void waitForCondition(String arg0, String arg1) {
		selenium.waitForCondition(arg0, arg1);
	}

	public void waitForPageToLoad(long arg0) {
		selenium.waitForPageToLoad(""+arg0);
	}

	public void waitForPageToLoad() {
		selenium.waitForPageToLoad(defaultWaitInterval);
	}

	public void waitForPopUp(String arg0, String arg1) {
		selenium.waitForPopUp(arg0, arg1);
	}

	public long getDefaultWaitInterval() {
		return Long.parseLong(defaultWaitInterval);
	}

	public void setDefaultWaitInterval(long defaultWaitInterval) {
		this.defaultWaitInterval = ""+defaultWaitInterval;
	}

	public void type(FieldLocator locator, String value) {
		selenium.type(locator.getInfo(), value);
	}

	public void select(FieldLocator locator, String value) {
		selenium.select(locator.getInfo(), value);
	}

	public void addSelection(FieldLocator locator, String value) {
		selenium.addSelection(locator.getInfo(), value);
	}

	public void click(FieldLocator locator) {
		click(locator.getInfo());
	}

	public void click(FieldLocator locator, String wait) {
		click(locator.getInfo(),wait);
	}

	public void clickRadio(FieldLocator locator, String wait) {
		click(locator.getInfo(),wait);
	}

	public void clickTab(int idx) {
		click("mainForm:tabbedPane." + idx);
		
	}

	public void assertSaveSuccess(WbemSmtResourceBundle bundle) {
		WbemSmtAssert.assertTextNotFound(this, bundle.getString("error.while.execution"));
		WbemSmtAssert.assertTextFound(this, bundle.getString("DIR.BLO.0002.save.success"));
	}

	public void assertCreateSuccess(WbemSmtResourceBundle bundle) {
		assertCreateSuccess(bundle,"create.success");
	}

	public void assertCreateSuccess(WbemSmtResourceBundle bundle, String successKey) {
		WbemSmtAssert.assertTextNotFound(this, bundle.getString("error.while.execution"));
		WbemSmtAssert.assertTextFound(this, bundle.getString(successKey));
	}

	public void assertDeleteSuccess(WbemSmtResourceBundle bundle, String valueNotBeFound) {
		WbemSmtAssert.assertTextNotFound(this, valueNotBeFound);
		WbemSmtAssert.assertTextNotFound(this, bundle.getString("error.while.execution"));
	}

	public void check(FieldLocator locator, long waitInterval) {
		check(locator.getInfo());
		if (waitInterval > 0)
		{
			waitForPageToLoad(waitInterval);
		}
	}

	public void check(FieldLocator locator) {
		check(locator.getInfo());
	}

	public String getValue(FieldLocator locator) {
		return getValue(locator.getInfo());
		
	}

	public void waitForPageToLoad(String arg0) {
		selenium.waitForPageToLoad(arg0);
		
	}

	public boolean isElementPresent(FieldLocator locator) {
		return selenium.isElementPresent(locator.getInfo());
	}

	public String getText(FieldLocator locator) {
		return selenium.getText(locator.getInfo());
	}

	public void uncheck(FieldLocator locator) {
		selenium.uncheck(locator.getInfo());
	}

	public boolean isChecked(FieldLocator locator) {
		return selenium.isChecked(locator.getInfo());
	}

	
	public long getDemoWaitInterval() {
		return demoWaitInterval;
	}

	public void setDemoWaitInterval(long demoWaitInterval) {
		this.demoWaitInterval = demoWaitInterval;
	}

	private void slowDown() {
		
		try {
			Thread.sleep(demoWaitInterval);
		} catch (InterruptedException e) {
			// do nothing
		}
		
	}


	
	
	

}
