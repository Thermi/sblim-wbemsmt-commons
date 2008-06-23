package org.sblim.wbemsmt.bl.fielddata;

import org.sblim.wbemsmt.util.StringUtil;

public class MemoData  implements FieldData {

	private String text;
    private int limit;
    private String linebreak;

    /**
     * create a new object without wrapping the lines
     * @param text the text
     */
	public MemoData(String text) {
		this(text,null,-1);
	}

	/**
	 * create a new object
     * @param text the text
     * @param limit length of the string before the default line break is inserted
	 */
    public MemoData(String text, int limit) {
        this(text,null,limit);
    }

    /**
     * creates a new object
     * @param text the text
     * @param linebreak the linebreak
     * @param limit length of the string before a line break is inserted
     * @see StringUtil#insertLineBreak(String, String, int, int, String)
     */
    public MemoData(String text, String linebreak, int limit) {
        super();
        this.linebreak = linebreak;
        this.limit = limit;
        this.text = limit >-1 ? StringUtil.insertLineBreak(text,linebreak, limit,0,null) : text;
    }

    /**
     * get the translated text
     * @return the text
     */
    public String getText() {
		return text;
	}

    /**
     * set the translated text
     * @param text the text
     */

    public void setText(String text) {
		this.text = text;
	}

    /**
     * get the max length of a line
     * @return the max length
     */
    public int getLimit() {
        return limit;
    }

    
    /**
     * get the symbol for the linebreak
     * @return the symbol
     */
    public String getLinebreak() {
        return linebreak;
    }
	
	
}
