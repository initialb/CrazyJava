package org.crazyit.foxmail.box;

import javax.swing.ImageIcon;

/**
 * �Ѿ��ɹ����͵��ʼ�
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class SentBox extends AbstractBox {

	@Override
	public String getText() {
		return "�ѷ���";
	}
	
	public ImageIcon getImageIcon() {
		return super.getImageIcon("images/sent-tree.gif");
	}
}
