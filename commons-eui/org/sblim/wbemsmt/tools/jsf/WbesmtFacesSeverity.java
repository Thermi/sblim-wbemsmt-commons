 /** 
  * WbesmtFacesSeverity.java
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
  * Description: Wrapper for a JSF Messages Severity Object
  * 
  */
package org.sblim.wbemsmt.tools.jsf;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;

import org.sblim.wbemsmt.bl.messages.Message;

/**
 * @author Bauschert
 *
 */
public class WbesmtFacesSeverity implements Comparable<WbesmtFacesSeverity> {
	
	
	
	private String severity = Message.INFO;

	public WbesmtFacesSeverity(Severity severity)
	{
		getByFacesSeverity(severity);
	}

	private void getByFacesSeverity(Severity severity) {
		if (severity.equals(FacesMessage.SEVERITY_INFO))
		{
			this.severity = Message.INFO;
		}
		else if (severity.equals(FacesMessage.SEVERITY_WARN))
		{
			this.severity = Message.WARNING;
		}
		else if ( severity.equals(FacesMessage.SEVERITY_ERROR)
				|| severity.equals(FacesMessage.SEVERITY_FATAL)
				)
		{
			this.severity = Message.ERROR;
		}
	}
	
	/**
	 * Use severity in Message-Object to set
	 * @param severity
	 * @see Message#SUCCESS
	 * @see Message#INFO
	 * @see Message#WARNING
	 * @see Message#ERROR
	 */
	public WbesmtFacesSeverity(String severity)
	{
		this.severity = severity;
	}

	public WbesmtFacesSeverity(FacesMessage msg1) {
		if (msg1 instanceof WbemsmtFacesMessage) {
			WbemsmtFacesMessage msg = (WbemsmtFacesMessage) msg1;
			this.severity = msg.getMessage().getType();
		}
		else
		{
			getByFacesSeverity(msg1.getSeverity());
		}
		
	}

	public String getSeverity() {
		return severity;
	}

	public int compareTo(WbesmtFacesSeverity o) {
		if (o instanceof WbesmtFacesSeverity) {
			WbesmtFacesSeverity sev = (WbesmtFacesSeverity) o;
			
			Integer sev1 = new Integer(Message.getOrdinalFromType(severity));
			Integer sev2 = new Integer(Message.getOrdinalFromType(sev.getSeverity()));
			
			return sev1.compareTo(sev2);
		}
		return -1;
	}

	
}
