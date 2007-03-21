package org.sblim.wbemsmt.bl.fielddata;

public class MemoData  implements FieldData {

	private String text;

	public MemoData(String text) {
		super();
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
