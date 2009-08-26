package org.sblim.wbemsmt.session;

import javax.servlet.http.HttpSession;

public class HttpSessionWrapper implements WebSession {

	private final HttpSession session;

	public HttpSessionWrapper(HttpSession session)
	{
		this.session = session;
	}
	
	public Object getAttribute(String arg0) {
		return session.getAttribute(arg0);
	}

	public String getId() {
		return session.getId();
	}

	public void setAttribute(String arg0, Object arg1) {
		session.setAttribute(arg0, arg1);
	}

	public Object getWrappedSession() {
		return session;
	}

}
