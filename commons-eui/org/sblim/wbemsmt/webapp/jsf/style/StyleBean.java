 /** 
  * Style.java
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
  * Description: Infoclass for a Style
  * 
  */

package org.sblim.wbemsmt.webapp.jsf.style;

import javax.faces.context.FacesContext;

public class StyleBean {

	/**
	 * the resourcedirectory
	 * @return
	 */
	private String resourceDir;
	private String resourceBundle;
	
	private boolean embedded;
	
	/**
	 * return the resource dir without the RequestContextPath as configured via Managed Bean Config
	 * @return
	 */
	public String getResourceDir() {
		return resourceDir;
	}

	/**
	 * return the resource dir as configured via Managed Bean Config together with the RequestContextPath
	 * @return
	 */
	public String getResourceDirAbsolute() {
		return FacesContext.getCurrentInstance().getExternalContext().getRequestContextPath() + (resourceDir.startsWith("/") ? "" : "/") + resourceDir ;
	}

	public void setResourceDir(String resourceDir) {
		this.resourceDir = resourceDir;
	}

	public boolean isEmbedded() {
		return embedded;
	}

	public void setEmbedded(boolean header) {
		this.embedded = header;
	}

	public String getResourceBundle() {
		return resourceBundle;
	}

	public void setResourceBundle(String resourceBundle) {
		this.resourceBundle = resourceBundle;
	}


	
	
	
	
	

}
