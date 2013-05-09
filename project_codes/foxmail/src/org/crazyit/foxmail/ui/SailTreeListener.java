package org.crazyit.foxmail.ui;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * ������������
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class SailTreeListener extends MouseAdapter {
	private MainFrame mainFrame;
	public SailTreeListener(MainFrame mainFrame) {
		this.mainFrame = mainFrame;
	}
	public void mousePressed(MouseEvent e) {
		mainFrame.select();
	}
}
