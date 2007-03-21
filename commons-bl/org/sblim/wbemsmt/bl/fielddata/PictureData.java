package org.sblim.wbemsmt.bl.fielddata;

public class PictureData implements FieldData {

	private String path;

	public PictureData(String path) {
		super();
		this.path = path;
	}
	
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
}
