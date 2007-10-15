 /** 
  * IndicationDestination.java
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
  * Description: Contains the calculated Url of Destination for a Indication and the Presets to later free the port 
  * 
  */
package org.sblim.wbemsmt.cim.indication;

import java.net.MalformedURLException;
import java.net.URL;

public class IndicationDestination {

	boolean calculatedPort;
	int port;
	URL calculatedUrl;
	String calculatedUrlString;
	private IndicationDestinationPresets presets;
	
	public boolean isCalculatedPort() {
		return calculatedPort;
	}
	public void setCalculatedPort(boolean calculatedPort) {
		this.calculatedPort = calculatedPort;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public String getCalculatedUrlString() {
		return calculatedUrlString;
	}
	public URL getCalculatedUrl() {
		return calculatedUrl;
	}
	public void setCalculatedUrl(String url) throws MalformedURLException {
		this.calculatedUrlString = url;
		this.calculatedUrl = new URL(url);
	}
	public IndicationDestinationPresets getPresets() {
		return presets;
	}
	public void setPresets(IndicationDestinationPresets presets) {
		this.presets = presets;
	}
	
	
	
	
	
}
