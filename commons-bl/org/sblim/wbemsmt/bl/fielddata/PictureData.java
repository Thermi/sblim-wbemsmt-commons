package org.sblim.wbemsmt.bl.fielddata;

public class PictureData implements FieldData {

    private String path;
    private MemoData tooltip;
    private Icon icon;

    public static final PictureData.Icon ICON_INFO = new PictureData.Icon();
    public static final PictureData.Icon ICON_WARNING = new PictureData.Icon();
    public static final PictureData.Icon ICON_ERROR = new PictureData.Icon();
    public static final PictureData.Icon ICON_FATAL = new PictureData.Icon();
    public static final PictureData.Icon ICON_SUPPORTED = new PictureData.Icon();
    public static final PictureData.Icon ICON_EMPTY = new PictureData.Icon();
    public static final PictureData.Icon ICON_NOT_SUPPORTED = new PictureData.Icon();
    
	public PictureData(String path) {
		this(null,path,null);
	}
	
	public PictureData(String path, MemoData tooltip) {
        this(null,path,tooltip);
    }

    public PictureData(Icon icon) {
        this(icon,null,null);
    }
    
    public PictureData(Icon icon, MemoData tooltip) {
        this(icon,null,tooltip);
    }

    
    protected PictureData(Icon icon, String path, MemoData tooltip) {
        super();
        this.icon = icon;
        this.path = path;
        this.tooltip = tooltip;
    }

    public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}

    public MemoData getTooltip() {
        return tooltip;
    }

    public void setTooltip(MemoData tooltip) {
        this.tooltip = tooltip;
    }

    
    
    /**
     * Class that represents a standard icon
     */
    public static class Icon {

        private Icon(){}
        
    }



    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }
	
	
}
