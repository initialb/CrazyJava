package org.crazyit.book.ui;

import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableModel;

/**
 * �б�Ļ���
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class CommonJTable extends JTable {
	public CommonJTable(TableModel dm) {
		super(dm);
		//���ñ��ֻ��ѡ��һ��
		getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION); 
	}
	//��д����ķ���, ʹ���еĵ�Ԫ�񲻿ɱ༭
	public boolean isCellEditable(int row, int column) {
		return false;
	}
}
