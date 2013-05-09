package org.crazyit.foxmail.ui;

import java.awt.Component;

import javax.swing.Icon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 * �ʼ��б�ĵ�Ԫ����Ⱦ����
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class MailTableCellRenderer extends DefaultTableCellRenderer {
	public Component getTableCellRendererComponent(JTable arg0, Object value,
			boolean arg2, boolean arg3, int arg4, int arg5) {
		//�жϸõ�Ԫ���ֵ�Ƿ�ͼƬ
		if (value instanceof Icon) {
			this.setIcon((Icon)value);
		} else {
			this.setText(value.toString());
		}
		return this;
	}
}
