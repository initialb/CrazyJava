package org.crazyit.foxmail.box;

import javax.swing.ImageIcon;

/**
 * �������Ľڵ������
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public abstract class AbstractBox implements MailBox {
	//��box����Ӧ��ͼƬ(��ʾ�����ϵ�ͼƬ)
	private ImageIcon icon;
	//ʵ�ֽӿڵķ���
	public ImageIcon getImageIcon(String imagePath) {
		if (this.icon == null) {
			this.icon = new ImageIcon(imagePath);
		}
		return this.icon;
	}
	//��дtoString����, ���ýӿڵ�getText����, getText����������ȥʵ��
	public String toString() {
		return getText();
	}
}
