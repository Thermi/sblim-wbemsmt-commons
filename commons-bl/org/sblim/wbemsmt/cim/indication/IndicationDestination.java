 /** 
  * IndicationDestination.java
  *
  * © Copyright IBM Corp.  2009,2005
  *
  * THIS FILE IS PROVIDED UNDER THE TERMS OF THE ECLIPSE PUBLIC LICENSE
  * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
  * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
  *
  * You can obtain a current copy of the Eclipse Public License from
  * http://www.opensource.org/licenses/eclipse-1.0.php
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

	Integer port;
	private IndicationDestinationPresets presets;
    private String calculatedUrlString;
    private URL calculatedUrl;
    private boolean usingNoIp;
	
	public Integer getPort() {
		return port;
	}
	public void setPort(Integer port) {
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
    public boolean isUsingNoIp() {
        return usingNoIp;
    }
    public void setUsingNoIp(boolean usingNoIp) {
        this.usingNoIp = usingNoIp;
    }
	
	
	
	
	
	
}
