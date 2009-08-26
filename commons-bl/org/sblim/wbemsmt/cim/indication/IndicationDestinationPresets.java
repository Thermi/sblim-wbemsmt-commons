 /** 
  * Destination.java
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
  * Description: The destination presets for a Indication Destination
  * 
  */
package org.sblim.wbemsmt.cim.indication;

import java.net.InetAddress;
import java.util.HashSet;
import java.util.Set;

import org.sblim.wbemsmt.exception.WbemsmtException;

public class IndicationDestinationPresets {

	private static final String HOSTNAME = "<hostname>";
	private static final String PORT = "<port>";

	/**
	 * if url contains &lt;port&gt; a port within the given range is inserted 
	 * if url contains &lt;hostname&gt; InetAddress.getLocalHost().getHostName() as Hostname 
	 */
	private String url;	private int portStart;
	private int portEnd;

	private Set<String> portsInUse = new HashSet<String>();
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String name) {
		this.url = name;
	}
	public int getPortStart() {
		return portStart;
	}
	public void setPortStart(int portStart) {
		this.portStart = portStart;
	}
	public int getPortEnd() {
		return portEnd;
	}
	public void setPortEnd(int portEnd) {
		this.portEnd = portEnd;
	}
	public IndicationDestination getIndicationDestination() throws WbemsmtException {
		String url;
        IndicationDestination result = new IndicationDestination();
        result.setPresets(this);
		try {
			url = this.url;
			int i = url.indexOf(HOSTNAME);
			if (i > -1)
			{
				url = url.substring(0,i) + InetAddress.getLocalHost().getHostName() + url.substring(i+HOSTNAME.length());
				result.setUsingNoIp(true);
			}

			i = url.indexOf(PORT);
			if (i > -1)
			{
				int freePort = getFreePort();
				result.setPort(new Integer(freePort));
				url = url.substring(0,i) + freePort + url.substring(i+PORT.length());
			}
			
			result.setCalculatedUrl(url);
			
			
		} catch (Exception e) {
			throw new WbemsmtException(WbemsmtException.ERR_FAILED, "Cannot calculate Url for url template " + this.url,e);
		}
		return result;
	}
	
	/**
	 * @return
	 * @throws WbemsmtException
	 */
	private int getFreePort() throws WbemsmtException {
		
		for (int i=portStart; i <= portEnd; i++ )
		{
			String port = ""+i;
			if (!(portsInUse.contains(port)))
			{
				portsInUse.add(port);
				return i;
			}
		}
		
		throw new WbemsmtException(WbemsmtException.ERR_INDICATION_PREPARATION,"No free ports for start port " + portStart + " and end port " + portEnd);
	}
	
	public void freePort(int port)
	{
		portsInUse.remove(""+port);
	}
}
