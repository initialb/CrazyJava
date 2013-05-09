package org.crazyit.foxmail.box;

import javax.swing.ImageIcon;

/**
 * ������
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class DeletedBox extends AbstractBox {

	private ImageIcon icon;
	
	public String getText() {
		return "������";
	}

	public ImageIcon getImageIcon() {
		return super.getImageIcon("images/deleted-tree.gif");
	}
	
}
