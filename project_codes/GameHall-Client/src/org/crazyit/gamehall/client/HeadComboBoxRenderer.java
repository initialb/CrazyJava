package org.crazyit.gamehall.client;

import java.awt.Component;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 * ͷ��������Ⱦ��
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class HeadComboBoxRenderer extends JLabel implements ListCellRenderer {

	private Map<String, ImageIcon> heads;
	
	public HeadComboBoxRenderer(Map<String, ImageIcon> heads) {
		this.heads = heads;
		setOpaque(true);
        setHorizontalAlignment(CENTER);
        setVerticalAlignment(CENTER);
	}
	
    public Component getListCellRendererComponent(JList list, Object value, 
    		int index, boolean isSelected, boolean cellHasFocus) {
        String selectValue = (String)value;
        //���ñ�����ɫ
        if (isSelected) {
            setBackground(list.getSelectionBackground());
            setForeground(list.getSelectionForeground());
        } else {
            setBackground(list.getBackground());
            setForeground(list.getForeground());
        }
        //��ͷ���Map�еõ���ǰѡ���ͷ��ͼƬ
        Icon icon = this.heads.get(selectValue);
        setIcon(icon);
        if (icon != null) setFont(list.getFont());
        return this;
    }


}
