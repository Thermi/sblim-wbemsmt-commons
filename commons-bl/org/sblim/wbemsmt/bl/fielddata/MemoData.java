package org.sblim.wbemsmt.bl.fielddata;

import org.sblim.wbemsmt.util.StringUtil;

public class MemoData  implements FieldData {

	private String text;
    private int limit;
    private String linebreak;

	public MemoData(String text) {
		this(text,null,-1);
	}

    public MemoData(String text, int limit) {
        this(text,null,limit);
    }

    public MemoData(String text, String linebreak, int limit) {
        super();
        this.linebreak = linebreak;
        this.limit = limit;
        this.text = limit >-1 ? StringUtil.insertLineBreak(text,linebreak, limit,0,null) : text;
    }

    public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

    public int getLimit() {
        return limit;
    }

    public String getLinebreak() {
        return linebreak;
    }
	
	
}
