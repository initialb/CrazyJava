package org.crazyit.cal;

import javax.swing.JFrame;

/**
 * �����������
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @author Kelvin Mak kelvin.mak125@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class Main {
	public static void main(String[] args) {
		CalFrame f = new CalFrame();
		f.pack();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}