package org.crazyit.foxmail.box;

import javax.swing.ImageIcon;


/**
 * �ռ���
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class InBox extends AbstractBox {
	public String getText() {
		return "�ռ���";
	}
	public ImageIcon getImageIcon() {
		return super.getImageIcon("images/in-tree.gif");
	}
}
