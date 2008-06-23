 /** 
  * PictureData.java
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
  * Description: DataObject used for a Picture UI Component
  * 
  */

package org.sblim.wbemsmt.bl.fielddata;

/**
 * DataObject used for a Picture UI Component
 */
public final class PictureData implements FieldData {

    private String path;
    private MemoData tooltip;
    private Icon icon;

    /**
     * Info Icon
     */
    public static final PictureData.Icon ICON_INFO = new PictureData.Icon();
    /**
     * Warning Icon
     */
    public static final PictureData.Icon ICON_WARNING = new PictureData.Icon();
    
    /**
     * Error Icon
     */
    public static final PictureData.Icon ICON_ERROR = new PictureData.Icon();
    
    /**
     * Fatal error icon
     */
    public static final PictureData.Icon ICON_FATAL = new PictureData.Icon();
    
    /**
     * Supported icon
     */
    public static final PictureData.Icon ICON_SUPPORTED = new PictureData.Icon();
    
    /**
     * empty icon
     */
    public static final PictureData.Icon ICON_EMPTY = new PictureData.Icon();
    
    /**
     * not suported icon
     */
    public static final PictureData.Icon ICON_NOT_SUPPORTED = new PictureData.Icon();
    
    
    /**
     * creates a new PictureData object
     * @param path the path of the picture inside the java package. Example; '/org/sblim/wbemsmt/demo/images/demo.gif'
     */
    
	public PictureData(String path) {
		this(null,path,null);
	}
	
    /**
     * creates a new PictureData object
     * @param path the path of the picture inside the java package. Example; '/org/sblim/wbemsmt/demo/images/demo.gif'
     * @param tooltip the text object for the tooltip
     */
	public PictureData(String path, MemoData tooltip) {
        this(null,path,tooltip);
    }

    /**
     * creates a new PictureData object
     * @param icon see the ICON constants in this class  
     */
    public PictureData(Icon icon) {
        this(icon,null,null);
    }
    
    /**
     * creates a new PictureData object
     * @param icon see the ICON constants in this class  
     * @param tooltip the text object for the tooltip
     */
    public PictureData(Icon icon, MemoData tooltip) {
        this(icon,null,tooltip);
    }

    
    /**
     * creates a new PictureData object
     * @param icon see the ICON constants in this class  
     * @param path the path of the picture inside the java package. Example; '/org/sblim/wbemsmt/demo/images/demo.gif'
     * @param tooltip the text object for the tooltip
     */
    protected PictureData(Icon icon, String path, MemoData tooltip) {
        super();
        this.icon = icon;
        this.path = path;
        this.tooltip = tooltip;
    }

    /**
     * @return the path of the icon
     */
    public String getPath() {
		return path;
	}
    
    /**
     * set the path
     * @param path the path
     */
	public void setPath(String path) {
		this.path = path;
	}

	/**
	 * @return the tooltip
	 */
    public MemoData getTooltip() {
        return tooltip;
    }

    /**
     * set the tooltip
     * @param tooltip the tooltip
     */ 
    public void setTooltip(MemoData tooltip) {
        this.tooltip = tooltip;
    }

    
    
    /**
     * Class that represents a standard icon
     */
    public static final class Icon {

        /**
         * default constr.
         */
        private Icon(){}
        
    }

    /**
     * @return the Icon
     */

    public Icon getIcon() {
        return icon;
    }

    /**
     * set the Icon
     * @param icon the icon
     */
    public void setIcon(Icon icon) {
        this.icon = icon;
    }
	
	
}
